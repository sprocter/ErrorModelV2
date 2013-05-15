package org.osate2.aadl2.errormodel.analysis.prism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.modelsupport.WriteToFile;
import org.osate.aadl2.util.OsateDebug;
import org.osate.xtext.aadl2.errormodel.util.AnalysisModel;
import org.osate.xtext.aadl2.errormodel.util.EMV2Util;

/**
 * Class that implement a full PRISM model containing
 * several modules.
 * 
 * @author jdelange
 *
 */
public class Model 
{
	private List<Module> 	modules;
	private List<Formula> 	formulas;
	private WriteToFile     prismFile;
	private ModelType		type;
	
	/**
	 * The errorTypes HashMap contains all error types
	 * used in the PRISM model.
	 */
	private HashMap<String,Integer> errorTypes;
	
	private static int errorTypeIdentifier;
	
	
	private ComponentInstance rootInstance;
	/**
	 * The propagationsMap variable contains for each outport identifier
	 * the potential error type propagated and their mapping into integer.
	 * We map only OUT ports. So, we will have something like:
	 * OUTPORTNAME1 => PROPAGATION1 => 1,
	 *                 PROPAGATION2 => 2
	 * OUTPORTNAME2 => PROPAGATION1 => 1,
	 *                 PROPAGATION2 => 2                 
	 */
	private Map<String,Map<String,Integer>>		propagationsMap;

	

	private static Model 	currentInstance;
	private AnalysisModel 	analysisModel;
	
	public Model (ComponentInstance rootSystem)
	{
		this.prismFile 			= new WriteToFile("PRISM", rootSystem);
		this.modules 			= new ArrayList<Module> ();
		this.formulas 			= new ArrayList<Formula> ();
		this.rootInstance 		= rootSystem;
		this.propagationsMap	= new HashMap<String,Map<String,Integer>>();
		this.errorTypes			= new HashMap<String,Integer>();
		this.type 				= Options.getModelType();
		this.analysisModel      = new AnalysisModel (rootSystem);
		this.prismFile.setFileExtension("pm");
		currentInstance = this;
		errorTypeIdentifier = 0;
	}
	
	
	public void addErrorType (String errorTypeName)
	{
		if(this.errorTypes.containsKey(errorTypeName))
		{
			return;
		}
		this.errorTypes.put(errorTypeName, errorTypeIdentifier++);
	}
	
	public static Model getCurrentInstance ()
	{
		return currentInstance;
	}
	
	/**
	 * Process the complete AADL model, create
	 * the PRISM modules and fill the model.
	 * This method shall be called before trying to produce
	 * PRISM code.
	 */
	public void process ()
	{
		List<ComponentInstance> instances;
		instances = EMV2Util.getComponentInstancesWithEMV2Subclause(rootInstance);
//		instances = EMV2Util.getComponentInstancesWithComponentErrorBehavior(rootInstance);
//		instances.addAll (EMV2Util.getComponentInstancesWithCompositeErrorBehavior(rootInstance));

		for (ComponentInstance instance : instances)
		{
			OsateDebug.osateDebug("[PRISM][Model.java] Handle component " + instance);
			addModule ( (new Module(instance, this)).process());
		}
		
	}


	/**
	 * Save the PRISM model. Please note that you should
	 * call the perform() method before so that the model
	 * is processed and contains module to write.
	 */
	public void saveFile ()
	{
		if (this.type == ModelType.DTMC)
		{
			this.prismFile.addOutput("dtmc\n\n");
		}
		if (this.type == ModelType.CTMC)
		{
			this.prismFile.addOutput("ctmc\n\n");
		}
		for (Module m : this.modules)
		{
			this.prismFile.addOutput(m.getPrismCode());
			this.prismFile.addOutputNewline("\n");
		}
		
		
		if (this.type == ModelType.DTMC)
		{
			/**
			 * Reward automatically added to DTMC in order
			 * to know how many steps did we performed.
			 */
			this.prismFile.addOutput("\nrewards \"steps\"\n   true : 1;\nendrewards\n");
		}
		
		for (String t : this.errorTypes.keySet())
		{
			this.prismFile.addOutputNewline("formula " + t + " = " + this.errorTypes.get(t) + ";");
		}
		
		this.prismFile.saveToFile();
	}
	
	public void addModule (Module m)
	{
		this.modules.add (m);
	}
	
	public void addFormula (Formula f)
	{
		this.formulas.add (f);
	}
	
	public ModelType getType ()
	{
		return this.type;
	}
	
	public void setType (ModelType t)
	{
		this.type = t;
	}
	
	public Map<String,Map<String,Integer>> getPropagationMap ()
	{
		return this.propagationsMap;
	}
	
	public AnalysisModel getAnalysisModel ()
	{
		return this.analysisModel;
	}
}
