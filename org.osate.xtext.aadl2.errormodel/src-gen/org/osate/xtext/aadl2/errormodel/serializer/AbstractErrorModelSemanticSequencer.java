/*
 * generated by Xtext
 */
package org.osate.xtext.aadl2.errormodel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.ArrayRange;
import org.osate.aadl2.BasicPropertyAssociation;
import org.osate.aadl2.BooleanLiteral;
import org.osate.aadl2.ClassifierValue;
import org.osate.aadl2.ComputedValue;
import org.osate.aadl2.ContainedNamedElement;
import org.osate.aadl2.ContainmentPathElement;
import org.osate.aadl2.IntegerLiteral;
import org.osate.aadl2.ListValue;
import org.osate.aadl2.ModalPropertyValue;
import org.osate.aadl2.NamedValue;
import org.osate.aadl2.Operation;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.RangeValue;
import org.osate.aadl2.RealLiteral;
import org.osate.aadl2.RecordValue;
import org.osate.aadl2.ReferenceValue;
import org.osate.aadl2.StringLiteral;
import org.osate.xtext.aadl2.errormodel.errorModel.AndExpression;
import org.osate.xtext.aadl2.errormodel.errorModel.BranchValue;
import org.osate.xtext.aadl2.errormodel.errorModel.CompositeState;
import org.osate.xtext.aadl2.errormodel.errorModel.ConditionElement;
import org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorCodeValue;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorEvent;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelPackage;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorSink;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorStateToModeMapping;
import org.osate.xtext.aadl2.errormodel.errorModel.ErrorType;
import org.osate.xtext.aadl2.errormodel.errorModel.FeatureorPPReference;
import org.osate.xtext.aadl2.errormodel.errorModel.OrExpression;
import org.osate.xtext.aadl2.errormodel.errorModel.OrlessExpression;
import org.osate.xtext.aadl2.errormodel.errorModel.OrmoreExpression;
import org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition;
import org.osate.xtext.aadl2.errormodel.errorModel.PropagationPath;
import org.osate.xtext.aadl2.errormodel.errorModel.PropagationPoint;
import org.osate.xtext.aadl2.errormodel.errorModel.QualifiedErrorBehaviorState;
import org.osate.xtext.aadl2.errormodel.errorModel.QualifiedPropagationPoint;
import org.osate.xtext.aadl2.errormodel.errorModel.RecoverEvent;
import org.osate.xtext.aadl2.errormodel.errorModel.RepairEvent;
import org.osate.xtext.aadl2.errormodel.errorModel.SAndExpression;
import org.osate.xtext.aadl2.errormodel.errorModel.SOrExpression;
import org.osate.xtext.aadl2.errormodel.errorModel.SubcomponentElement;
import org.osate.xtext.aadl2.errormodel.errorModel.TransitionBranch;
import org.osate.xtext.aadl2.errormodel.errorModel.TypeMapping;
import org.osate.xtext.aadl2.errormodel.errorModel.TypeMappingSet;
import org.osate.xtext.aadl2.errormodel.errorModel.TypeSet;
import org.osate.xtext.aadl2.errormodel.errorModel.TypeToken;
import org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformation;
import org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformationSet;
import org.osate.xtext.aadl2.errormodel.services.ErrorModelGrammarAccess;
import org.osate.xtext.aadl2.properties.serializer.PropertiesSemanticSequencer;

@SuppressWarnings("all")
public abstract class AbstractErrorModelSemanticSequencer extends PropertiesSemanticSequencer {

	@Inject
	private ErrorModelGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == Aadl2Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case Aadl2Package.ARRAY_RANGE:
				sequence_ArrayRange(context, (ArrayRange) semanticObject); 
				return; 
			case Aadl2Package.BASIC_PROPERTY_ASSOCIATION:
				sequence_FieldPropertyAssociation(context, (BasicPropertyAssociation) semanticObject); 
				return; 
			case Aadl2Package.BOOLEAN_LITERAL:
				sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
				return; 
			case Aadl2Package.CLASSIFIER_VALUE:
				sequence_ComponentClassifierTerm(context, (ClassifierValue) semanticObject); 
				return; 
			case Aadl2Package.COMPUTED_VALUE:
				sequence_ComputedTerm(context, (ComputedValue) semanticObject); 
				return; 
			case Aadl2Package.CONTAINED_NAMED_ELEMENT:
				sequence_ContainmentPath(context, (ContainedNamedElement) semanticObject); 
				return; 
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT:
				sequence_ContainmentPathElement(context, (ContainmentPathElement) semanticObject); 
				return; 
			case Aadl2Package.INTEGER_LITERAL:
				sequence_IntegerTerm(context, (IntegerLiteral) semanticObject); 
				return; 
			case Aadl2Package.LIST_VALUE:
				sequence_ListTerm(context, (ListValue) semanticObject); 
				return; 
			case Aadl2Package.MODAL_PROPERTY_VALUE:
				if(context == grammarAccess.getModalPropertyValueRule()) {
					sequence_ModalPropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOptionalModalPropertyValueRule()) {
					sequence_OptionalModalPropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPropertyValueRule()) {
					sequence_PropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.NAMED_VALUE:
				if(context == grammarAccess.getConstantValueRule() ||
				   context == grammarAccess.getNumAltRule()) {
					sequence_ConstantValue(context, (NamedValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLiteralorReferenceTermRule() ||
				   context == grammarAccess.getPropertyExpressionRule()) {
					sequence_LiteralorReferenceTerm(context, (NamedValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.OPERATION:
				sequence_SignedConstant(context, (Operation) semanticObject); 
				return; 
			case Aadl2Package.PROPERTY_ASSOCIATION:
				if(context == grammarAccess.getBasicPropertyAssociationRule()) {
					sequence_BasicPropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getContainedPropertyAssociationRule() ||
				   context == grammarAccess.getPModelRule()) {
					sequence_ContainedPropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPropertyAssociationRule()) {
					sequence_PropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.RANGE_VALUE:
				sequence_NumericRangeTerm(context, (RangeValue) semanticObject); 
				return; 
			case Aadl2Package.REAL_LITERAL:
				sequence_RealTerm(context, (RealLiteral) semanticObject); 
				return; 
			case Aadl2Package.RECORD_VALUE:
				if(context == grammarAccess.getOldRecordTermRule()) {
					sequence_OldRecordTerm(context, (RecordValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPropertyExpressionRule() ||
				   context == grammarAccess.getRecordTermRule()) {
					sequence_RecordTerm(context, (RecordValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.REFERENCE_VALUE:
				sequence_ReferenceTerm(context, (ReferenceValue) semanticObject); 
				return; 
			case Aadl2Package.STRING_LITERAL:
				sequence_StringTerm(context, (StringLiteral) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == ErrorModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ErrorModelPackage.AND_EXPRESSION:
				sequence_AndExpression(context, (AndExpression) semanticObject); 
				return; 
			case ErrorModelPackage.BRANCH_VALUE:
				sequence_BranchValue(context, (BranchValue) semanticObject); 
				return; 
			case ErrorModelPackage.COMPOSITE_STATE:
				sequence_CompositeState(context, (CompositeState) semanticObject); 
				return; 
			case ErrorModelPackage.CONDITION_ELEMENT:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionOperandsAction_1_0() ||
				   context == grammarAccess.getConditionElementRule() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getOrExpressionOperandsAction_1_0() ||
				   context == grammarAccess.getConditionTermRule() ||
				   context == grammarAccess.getElementRule()) {
					sequence_ConditionElement(context, (ConditionElement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSAndExpressionRule() ||
				   context == grammarAccess.getSAndExpressionAccess().getSAndExpressionOperandsAction_1_0() ||
				   context == grammarAccess.getSConditionElementRule() ||
				   context == grammarAccess.getSConditionExpressionRule() ||
				   context == grammarAccess.getSConditionExpressionAccess().getSOrExpressionOperandsAction_1_0() ||
				   context == grammarAccess.getSConditionTermRule()) {
					sequence_SConditionElement(context, (ConditionElement) semanticObject); 
					return; 
				}
				else break;
			case ErrorModelPackage.CONNECTION_ERROR_SOURCE:
				sequence_ConnectionErrorSource(context, (ConnectionErrorSource) semanticObject); 
				return; 
			case ErrorModelPackage.ERROR_BEHAVIOR_STATE:
				sequence_ErrorBehaviorState(context, (ErrorBehaviorState) semanticObject); 
				return; 
			case ErrorModelPackage.ERROR_BEHAVIOR_STATE_MACHINE:
				sequence_ErrorBehaviorStateMachine(context, (ErrorBehaviorStateMachine) semanticObject); 
				return; 
			case ErrorModelPackage.ERROR_BEHAVIOR_TRANSITION:
				sequence_ErrorBehaviorTransition(context, (ErrorBehaviorTransition) semanticObject); 
				return; 
			case ErrorModelPackage.ERROR_CODE_VALUE:
				sequence_ErrorCodeValue(context, (ErrorCodeValue) semanticObject); 
				return; 
			case ErrorModelPackage.ERROR_DETECTION:
				sequence_ErrorDetection(context, (ErrorDetection) semanticObject); 
				return; 
			case ErrorModelPackage.ERROR_EVENT:
				sequence_ErrorEvent(context, (ErrorEvent) semanticObject); 
				return; 
			case ErrorModelPackage.ERROR_MODEL_LIBRARY:
				if(context == grammarAccess.getEMV2LibraryRule()) {
					sequence_EMV2Library(context, (ErrorModelLibrary) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAnnexLibraryRule() ||
				   context == grammarAccess.getErrorModelLibraryRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_ErrorModelLibrary(context, (ErrorModelLibrary) semanticObject); 
					return; 
				}
				else break;
			case ErrorModelPackage.ERROR_MODEL_SUBCLAUSE:
				sequence_ErrorModelSubclause(context, (ErrorModelSubclause) semanticObject); 
				return; 
			case ErrorModelPackage.ERROR_PATH:
				sequence_ErrorPath(context, (ErrorPath) semanticObject); 
				return; 
			case ErrorModelPackage.ERROR_PROPAGATION:
				sequence_ErrorPropagation(context, (ErrorPropagation) semanticObject); 
				return; 
			case ErrorModelPackage.ERROR_SINK:
				sequence_ErrorSink(context, (ErrorSink) semanticObject); 
				return; 
			case ErrorModelPackage.ERROR_SOURCE:
				sequence_ErrorSource(context, (ErrorSource) semanticObject); 
				return; 
			case ErrorModelPackage.ERROR_STATE_TO_MODE_MAPPING:
				sequence_ErrorStateToModeMapping(context, (ErrorStateToModeMapping) semanticObject); 
				return; 
			case ErrorModelPackage.ERROR_TYPE:
				sequence_TypeDefinition(context, (ErrorType) semanticObject); 
				return; 
			case ErrorModelPackage.FEATUREOR_PP_REFERENCE:
				sequence_FeatureorPPReference(context, (FeatureorPPReference) semanticObject); 
				return; 
			case ErrorModelPackage.OR_EXPRESSION:
				sequence_ConditionExpression(context, (OrExpression) semanticObject); 
				return; 
			case ErrorModelPackage.ORLESS_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionOperandsAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getOrExpressionOperandsAction_1_0() ||
				   context == grammarAccess.getConditionTermRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getOrlessExpressionRule()) {
					sequence_OrlessExpression(context, (OrlessExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSAndExpressionRule() ||
				   context == grammarAccess.getSAndExpressionAccess().getSAndExpressionOperandsAction_1_0() ||
				   context == grammarAccess.getSConditionExpressionRule() ||
				   context == grammarAccess.getSConditionExpressionAccess().getSOrExpressionOperandsAction_1_0() ||
				   context == grammarAccess.getSConditionTermRule() ||
				   context == grammarAccess.getSOrlessExpressionRule()) {
					sequence_SOrlessExpression(context, (OrlessExpression) semanticObject); 
					return; 
				}
				else break;
			case ErrorModelPackage.ORMORE_EXPRESSION:
				if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getAndExpressionOperandsAction_1_0() ||
				   context == grammarAccess.getConditionExpressionRule() ||
				   context == grammarAccess.getConditionExpressionAccess().getOrExpressionOperandsAction_1_0() ||
				   context == grammarAccess.getConditionTermRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getOrmoreExpressionRule()) {
					sequence_OrmoreExpression(context, (OrmoreExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSAndExpressionRule() ||
				   context == grammarAccess.getSAndExpressionAccess().getSAndExpressionOperandsAction_1_0() ||
				   context == grammarAccess.getSConditionExpressionRule() ||
				   context == grammarAccess.getSConditionExpressionAccess().getSOrExpressionOperandsAction_1_0() ||
				   context == grammarAccess.getSConditionTermRule() ||
				   context == grammarAccess.getSOrmoreExpressionRule()) {
					sequence_SOrmoreExpression(context, (OrmoreExpression) semanticObject); 
					return; 
				}
				else break;
			case ErrorModelPackage.OUTGOING_PROPAGATION_CONDITION:
				sequence_OutgoingPropagationCondition(context, (OutgoingPropagationCondition) semanticObject); 
				return; 
			case ErrorModelPackage.PROPAGATION_PATH:
				sequence_PropagationPath(context, (PropagationPath) semanticObject); 
				return; 
			case ErrorModelPackage.PROPAGATION_POINT:
				sequence_PropagationPoint(context, (PropagationPoint) semanticObject); 
				return; 
			case ErrorModelPackage.QUALIFIED_ERROR_BEHAVIOR_STATE:
				sequence_QualifiedErrorBehaviorState(context, (QualifiedErrorBehaviorState) semanticObject); 
				return; 
			case ErrorModelPackage.QUALIFIED_PROPAGATION_POINT:
				sequence_QualifiedPropagationPoint(context, (QualifiedPropagationPoint) semanticObject); 
				return; 
			case ErrorModelPackage.RECOVER_EVENT:
				sequence_RecoverEvent(context, (RecoverEvent) semanticObject); 
				return; 
			case ErrorModelPackage.REPAIR_EVENT:
				sequence_RepairEvent(context, (RepairEvent) semanticObject); 
				return; 
			case ErrorModelPackage.SAND_EXPRESSION:
				sequence_SAndExpression(context, (SAndExpression) semanticObject); 
				return; 
			case ErrorModelPackage.SOR_EXPRESSION:
				sequence_SConditionExpression(context, (SOrExpression) semanticObject); 
				return; 
			case ErrorModelPackage.SUBCOMPONENT_ELEMENT:
				sequence_SubcomponentElement(context, (SubcomponentElement) semanticObject); 
				return; 
			case ErrorModelPackage.TRANSITION_BRANCH:
				sequence_TransitionBranch(context, (TransitionBranch) semanticObject); 
				return; 
			case ErrorModelPackage.TYPE_MAPPING:
				sequence_TypeMapping(context, (TypeMapping) semanticObject); 
				return; 
			case ErrorModelPackage.TYPE_MAPPING_SET:
				sequence_TypeMappingSet(context, (TypeMappingSet) semanticObject); 
				return; 
			case ErrorModelPackage.TYPE_SET:
				if(context == grammarAccess.getNoErrorTypeSetRule()) {
					sequence_NoErrorTypeSet(context, (TypeSet) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeTokenConstraintNoErrorRule()) {
					sequence_NoErrorTypeSet_TypeSetConstructor_TypeTokenConstraintNoError(context, (TypeSet) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeSetConstructorRule() ||
				   context == grammarAccess.getTypeSetReferenceRule() ||
				   context == grammarAccess.getTypeTokenConstraintRule()) {
					sequence_TypeSetConstructor(context, (TypeSet) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getErrorBehaviorStateOrTypeSetRule() ||
				   context == grammarAccess.getErrorTypesRule() ||
				   context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getTypeSetDefinitionRule()) {
					sequence_TypeSetDefinition(context, (TypeSet) semanticObject); 
					return; 
				}
				else break;
			case ErrorModelPackage.TYPE_TOKEN:
				if(context == grammarAccess.getElementRule()) {
					sequence_Element_TypeSetElement_TypeToken(context, (TypeToken) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNoErrorTypeTokenRule()) {
					sequence_NoErrorTypeToken(context, (TypeToken) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeTokenOrNoErrorRule()) {
					sequence_NoErrorTypeToken_TypeToken_TypeTokenOrNoError(context, (TypeToken) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeSetElementRule()) {
					sequence_TypeSetElement(context, (TypeToken) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeTokenRule()) {
					sequence_TypeToken(context, (TypeToken) semanticObject); 
					return; 
				}
				else break;
			case ErrorModelPackage.TYPE_TRANSFORMATION:
				sequence_TypeTransformation(context, (TypeTransformation) semanticObject); 
				return; 
			case ErrorModelPackage.TYPE_TRANSFORMATION_SET:
				sequence_TypeTransformationSet(context, (TypeTransformationSet) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (operands+=AndExpression_AndExpression_1_0 operands+=ConditionTerm)
	 */
	protected void sequence_AndExpression(EObject context, AndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (realvalue=REAL_LIT | symboliclabel=[Property|QEMREF] | others?='others')
	 */
	protected void sequence_BranchValue(EObject context, BranchValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? (condition=SConditionExpression | others?='others') state=[ErrorBehaviorState|ID] typedToken=TypeToken?)
	 */
	protected void sequence_CompositeState(EObject context, CompositeState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (incoming=[EventOrPropagation|ErrorPropagationPoint] constraint=TypeTokenConstraintNoError?)
	 */
	protected void sequence_ConditionElement(EObject context, ConditionElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operands+=ConditionExpression_OrExpression_1_0 operands+=AndExpression)
	 */
	protected void sequence_ConditionExpression(EObject context, OrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (connection=[Connection|ID] | all?='all') 
	 *         typeTokenConstraint=TypeTokenConstraint? 
	 *         (failureModeType=TypeSetConstructor | failureModeDescription=STRING)? 
	 *         condition=CONDITION?
	 *     )
	 */
	protected void sequence_ConnectionErrorSource(EObject context, ConnectionErrorSource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QEMREF 
	 *         (
	 *             (useTypes+=[ErrorModelLibrary|QEMREF] useTypes+=[ErrorModelLibrary|QEMREF]*)? 
	 *             (extends+=[ErrorModelLibrary|QEMREF] extends+=[ErrorModelLibrary|QEMREF]*)? 
	 *             (types+=TypeDefinition | typesets+=TypeSetDefinition)* 
	 *             properties+=ContainedPropertyAssociation*
	 *         )? 
	 *         behaviors+=ErrorBehaviorStateMachine* 
	 *         mappings+=TypeMappingSet* 
	 *         transformations+=TypeTransformationSet*
	 *     )
	 */
	protected void sequence_EMV2Library(EObject context, ErrorModelLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type+=[ErrorTypes|QEMREF] type+=[ErrorTypes|QEMREF]*) | (type+=[ErrorTypes|QEMREF] type+=[ErrorTypes|QEMREF]*))
	 */
	protected void sequence_Element_TypeSetElement_TypeToken(EObject context, TypeToken semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (useTypes+=[ErrorModelLibrary|QEMREF] useTypes+=[ErrorModelLibrary|QEMREF]*)? 
	 *         useTransformation+=[TypeTransformationSet|QEMREF]? 
	 *         events+=ErrorBehaviorEvent* 
	 *         states+=ErrorBehaviorState* 
	 *         transitions+=ErrorBehaviorTransition* 
	 *         properties+=ContainedPropertyAssociation*
	 *     )
	 */
	protected void sequence_ErrorBehaviorStateMachine(EObject context, ErrorBehaviorStateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID intial?='initial'? typeSet=TypeSetReference?)
	 */
	protected void sequence_ErrorBehaviorState(EObject context, ErrorBehaviorState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         ((source=[ErrorBehaviorState|ID] typeTokenConstraint=TypeTokenConstraint?) | allStates?='all') 
	 *         condition=ConditionExpression 
	 *         (
	 *             (target=[ErrorBehaviorState|ID] targetToken=TypeToken?) | 
	 *             steadyState?='same' | 
	 *             (destinationBranches+=TransitionBranch destinationBranches+=TransitionBranch+)
	 *         )
	 *     )
	 */
	protected void sequence_ErrorBehaviorTransition(EObject context, ErrorBehaviorTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (intValue=INTEGER_LIT | constant=[PropertyConstant|QPREF] | enumLiteral=STRING)
	 */
	protected void sequence_ErrorCodeValue(EObject context, ErrorCodeValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         ((state=[ErrorBehaviorState|ID] typeTokenConstraint=TypeTokenConstraint?) | allStates?='all') 
	 *         condition=ConditionExpression? 
	 *         detectionReportingPort=[TriggerPort|ID] 
	 *         errorCode=ErrorCodeValue?
	 *     )
	 */
	protected void sequence_ErrorDetection(EObject context, ErrorDetection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID typeSet=TypeSetReference? condition=CONDITION?)
	 */
	protected void sequence_ErrorEvent(EObject context, ErrorEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (useTypes+=[ErrorModelLibrary|QEMREF] useTypes+=[ErrorModelLibrary|QEMREF]*)? 
	 *             (extends+=[ErrorModelLibrary|QEMREF] extends+=[ErrorModelLibrary|QEMREF]*)? 
	 *             (types+=TypeDefinition | typesets+=TypeSetDefinition)* 
	 *             properties+=ContainedPropertyAssociation*
	 *         )? 
	 *         behaviors+=ErrorBehaviorStateMachine* 
	 *         mappings+=TypeMappingSet* 
	 *         transformations+=TypeTransformationSet*
	 *     )
	 */
	protected void sequence_ErrorModelLibrary(EObject context, ErrorModelLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (useTypes+=[ErrorModelLibrary|QEMREF] useTypes+=[ErrorModelLibrary|QEMREF]*)? 
	 *         typeEquivalence=[TypeMappingSet|QEMREF]? 
	 *         typeMappingSet=[TypeMappingSet|QEMREF]? 
	 *         useBehavior=[ErrorBehaviorStateMachine|QEMREF]? 
	 *         (propagations+=ErrorPropagation* flows+=ErrorFlow*)? 
	 *         (
	 *             useTransformation=[TypeTransformationSet|QEMREF]? 
	 *             events+=ErrorBehaviorEvent* 
	 *             transitions+=ErrorBehaviorTransition* 
	 *             outgoingPropagationConditions+=OutgoingPropagationCondition* 
	 *             errorDetections+=ErrorDetection* 
	 *             errorStateToModeMappings+=ErrorStateToModeMapping*
	 *         )? 
	 *         states+=CompositeState* 
	 *         (typeTransformationSet=[TypeTransformationSet|QEMREF]? connectionErrorSources+=ConnectionErrorSource*)? 
	 *         (points+=PropagationPoint* paths+=PropagationPath*)? 
	 *         properties+=ContainedPropertyAssociation*
	 *     )
	 */
	protected void sequence_ErrorModelSubclause(EObject context, ErrorModelSubclause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (incoming=[ErrorPropagation|ErrorPropagationPoint] | allIncoming?='all') 
	 *         typeTokenConstraint=TypeTokenConstraint? 
	 *         (outgoing=[ErrorPropagation|ErrorPropagationPoint] | allOutgoing?='all') 
	 *         (targetToken=TypeToken | typeMappingSet=[TypeMappingSet|QEMREF])?
	 *     )
	 */
	protected void sequence_ErrorPath(EObject context, ErrorPath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((kind=PropagationKind | featureorPPRef=FeatureorPPReference) not?='not'? direction=PropagationDirection typeSet=TypeSetReference)
	 */
	protected void sequence_ErrorPropagation(EObject context, ErrorPropagation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (incoming=[ErrorPropagation|ErrorPropagationPoint] | allIncoming?='all') typeTokenConstraint=TypeTokenConstraint?)
	 */
	protected void sequence_ErrorSink(EObject context, ErrorSink semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (outgoing=[ErrorPropagation|ErrorPropagationPoint] | allOutgoing?='all') 
	 *         typeTokenConstraint=TypeTokenConstraint? 
	 *         (
	 *             (failureModeReference=[ErrorBehaviorStateOrTypeSet|ID] failureModeType=TypeSetReference?) | 
	 *             failureModeType=TypeSetConstructor | 
	 *             failureModeDescription=STRING
	 *         )? 
	 *         condition=CONDITION?
	 *     )
	 */
	protected void sequence_ErrorSource(EObject context, ErrorSource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (errorState=[ErrorBehaviorState|ID] typeToken=TypeToken? mappedModes+=[Mode|ID] mappedModes+=[Mode|ID]*)
	 */
	protected void sequence_ErrorStateToModeMapping(EObject context, ErrorStateToModeMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (featureorPP=[NamedElement|ID] next=FeatureorPPReference?)
	 */
	protected void sequence_FeatureorPPReference(EObject context, FeatureorPPReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     typeTokens+=NoErrorTypeToken
	 */
	protected void sequence_NoErrorTypeSet(EObject context, TypeSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((typeTokens+=TypeSetElement typeTokens+=TypeSetElement*) | typeTokens+=NoErrorTypeToken)
	 */
	protected void sequence_NoErrorTypeSet_TypeSetConstructor_TypeTokenConstraintNoError(EObject context, TypeSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     noError?='noerror'
	 */
	protected void sequence_NoErrorTypeToken(EObject context, TypeToken semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type+=[ErrorTypes|QEMREF] type+=[ErrorTypes|QEMREF]*) | noError?='noerror')
	 */
	protected void sequence_NoErrorTypeToken_TypeToken_TypeTokenOrNoError(EObject context, TypeToken semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (count=INTVALUE operands+=ConditionElement operands+=ConditionElement*)
	 */
	protected void sequence_OrlessExpression(EObject context, OrlessExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (count=INTVALUE operands+=ConditionElement operands+=ConditionElement*)
	 */
	protected void sequence_OrmoreExpression(EObject context, OrmoreExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         ((state=[ErrorBehaviorState|ID] typeTokenConstraint=TypeTokenConstraint?) | allStates?='all') 
	 *         condition=ConditionExpression? 
	 *         (outgoing=[ErrorPropagation|ErrorPropagationPoint] | allPropagations?='all') 
	 *         typeToken=TypeTokenOrNoError?
	 *     )
	 */
	protected void sequence_OutgoingPropagationCondition(EObject context, OutgoingPropagationCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? source=QualifiedPropagationPoint target=QualifiedPropagationPoint)
	 */
	protected void sequence_PropagationPath(EObject context, PropagationPath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_PropagationPoint(EObject context, PropagationPoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (subcomponent=SubcomponentElement (next=QualifiedErrorBehaviorState | state=[ErrorBehaviorState|ID]))
	 */
	protected void sequence_QualifiedErrorBehaviorState(EObject context, QualifiedErrorBehaviorState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (subcomponent=SubcomponentElement (next=QualifiedPropagationPoint | propagationPoint=[PropagationPoint|ID]))
	 */
	protected void sequence_QualifiedPropagationPoint(EObject context, QualifiedPropagationPoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (eventInitiator+=[NamedElement|ID] eventInitiator+=[NamedElement|ID]*)? condition=CONDITION?)
	 */
	protected void sequence_RecoverEvent(EObject context, RecoverEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (eventInitiator+=[NamedElement|ID] eventInitiator+=[NamedElement|ID]*)?)
	 */
	protected void sequence_RepairEvent(EObject context, RepairEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operands+=SAndExpression_SAndExpression_1_0 operands+=SConditionTerm)
	 */
	protected void sequence_SAndExpression(EObject context, SAndExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (qualifiedState=QualifiedErrorBehaviorState constraint=TypeTokenConstraint?) | 
	 *         (incoming=[ErrorPropagation|ErrorPropagationPoint] constraint=TypeTokenConstraintNoError?)
	 *     )
	 */
	protected void sequence_SConditionElement(EObject context, ConditionElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operands+=SConditionExpression_SOrExpression_1_0 operands+=SAndExpression)
	 */
	protected void sequence_SConditionExpression(EObject context, SOrExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (count=INTVALUE operands+=SConditionElement operands+=SConditionElement*)
	 */
	protected void sequence_SOrlessExpression(EObject context, OrlessExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (count=INTVALUE operands+=SConditionElement operands+=SConditionElement*)
	 */
	protected void sequence_SOrmoreExpression(EObject context, OrmoreExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     subcomponent=[Subcomponent|ID]
	 */
	protected void sequence_SubcomponentElement(EObject context, SubcomponentElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((target=[ErrorBehaviorState|ID] targetToken=TypeToken?) | steadyState?='same') value=BranchValue)
	 */
	protected void sequence_TransitionBranch(EObject context, TransitionBranch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (superType=[ErrorType|QEMREF] | aliasedType=[ErrorType|QEMREF])?)
	 */
	protected void sequence_TypeDefinition(EObject context, ErrorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (useTypes+=[ErrorModelLibrary|QEMREF] useTypes+=[ErrorModelLibrary|QEMREF]*)? mapping+=TypeMapping+)
	 */
	protected void sequence_TypeMappingSet(EObject context, TypeMappingSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source=TypeTokenConstraint target=TypeToken)
	 */
	protected void sequence_TypeMapping(EObject context, TypeMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeTokens+=TypeSetElement typeTokens+=TypeSetElement*)
	 */
	protected void sequence_TypeSetConstructor(EObject context, TypeSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID ((typeTokens+=TypeSetElement typeTokens+=TypeSetElement*) | aliasedType=[TypeSet|QEMREF]))
	 */
	protected void sequence_TypeSetDefinition(EObject context, TypeSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type+=[ErrorTypes|QEMREF] type+=[ErrorTypes|QEMREF]*)
	 */
	protected void sequence_TypeSetElement(EObject context, TypeToken semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type+=[ErrorTypes|QEMREF] type+=[ErrorTypes|QEMREF]*)
	 */
	protected void sequence_TypeToken(EObject context, TypeToken semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (useTypes+=[ErrorModelLibrary|QEMREF] useTypes+=[ErrorModelLibrary|QEMREF]*)? transformation+=TypeTransformation+)
	 */
	protected void sequence_TypeTransformationSet(EObject context, TypeTransformationSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((source=TypeTokenConstraintNoError | allSources?='all') contributor=TypeTokenConstraintNoError? target=TypeToken)
	 */
	protected void sequence_TypeTransformation(EObject context, TypeTransformation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
