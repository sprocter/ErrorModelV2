/**
 */
package org.osate.xtext.aadl2.errormodel.errorModel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModalElement;
import org.osate.aadl2.NamedElement;

import org.osate.xtext.aadl2.errormodel.errorModel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelPackage
 * @generated
 */
public class ErrorModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ErrorModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ErrorModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ErrorModelSwitch<Adapter> modelSwitch =
    new ErrorModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseErrorModelLibrary(ErrorModelLibrary object)
      {
        return createErrorModelLibraryAdapter();
      }
      @Override
      public Adapter caseErrorModelSubclause(ErrorModelSubclause object)
      {
        return createErrorModelSubclauseAdapter();
      }
      @Override
      public Adapter caseErrorTypes(ErrorTypes object)
      {
        return createErrorTypesAdapter();
      }
      @Override
      public Adapter caseErrorType(ErrorType object)
      {
        return createErrorTypeAdapter();
      }
      @Override
      public Adapter caseTypeSet(TypeSet object)
      {
        return createTypeSetAdapter();
      }
      @Override
      public Adapter caseTypeToken(TypeToken object)
      {
        return createTypeTokenAdapter();
      }
      @Override
      public Adapter caseTypeTransformationSet(TypeTransformationSet object)
      {
        return createTypeTransformationSetAdapter();
      }
      @Override
      public Adapter caseTypeTransformation(TypeTransformation object)
      {
        return createTypeTransformationAdapter();
      }
      @Override
      public Adapter caseTypeMappingSet(TypeMappingSet object)
      {
        return createTypeMappingSetAdapter();
      }
      @Override
      public Adapter caseTypeMapping(TypeMapping object)
      {
        return createTypeMappingAdapter();
      }
      @Override
      public Adapter caseErrorPropagation(ErrorPropagation object)
      {
        return createErrorPropagationAdapter();
      }
      @Override
      public Adapter caseFeatureorPPReference(FeatureorPPReference object)
      {
        return createFeatureorPPReferenceAdapter();
      }
      @Override
      public Adapter caseErrorFlow(ErrorFlow object)
      {
        return createErrorFlowAdapter();
      }
      @Override
      public Adapter caseErrorSource(ErrorSource object)
      {
        return createErrorSourceAdapter();
      }
      @Override
      public Adapter caseErrorBehaviorStateOrTypeSet(ErrorBehaviorStateOrTypeSet object)
      {
        return createErrorBehaviorStateOrTypeSetAdapter();
      }
      @Override
      public Adapter caseErrorSink(ErrorSink object)
      {
        return createErrorSinkAdapter();
      }
      @Override
      public Adapter caseErrorPath(ErrorPath object)
      {
        return createErrorPathAdapter();
      }
      @Override
      public Adapter casePropagationPoint(PropagationPoint object)
      {
        return createPropagationPointAdapter();
      }
      @Override
      public Adapter casePropagationPath(PropagationPath object)
      {
        return createPropagationPathAdapter();
      }
      @Override
      public Adapter caseQualifiedPropagationPoint(QualifiedPropagationPoint object)
      {
        return createQualifiedPropagationPointAdapter();
      }
      @Override
      public Adapter caseErrorBehaviorStateMachine(ErrorBehaviorStateMachine object)
      {
        return createErrorBehaviorStateMachineAdapter();
      }
      @Override
      public Adapter caseErrorBehaviorEvent(ErrorBehaviorEvent object)
      {
        return createErrorBehaviorEventAdapter();
      }
      @Override
      public Adapter caseErrorEvent(ErrorEvent object)
      {
        return createErrorEventAdapter();
      }
      @Override
      public Adapter caseRepairEvent(RepairEvent object)
      {
        return createRepairEventAdapter();
      }
      @Override
      public Adapter caseRecoverEvent(RecoverEvent object)
      {
        return createRecoverEventAdapter();
      }
      @Override
      public Adapter caseErrorBehaviorState(ErrorBehaviorState object)
      {
        return createErrorBehaviorStateAdapter();
      }
      @Override
      public Adapter caseErrorBehaviorTransition(ErrorBehaviorTransition object)
      {
        return createErrorBehaviorTransitionAdapter();
      }
      @Override
      public Adapter caseTransitionBranch(TransitionBranch object)
      {
        return createTransitionBranchAdapter();
      }
      @Override
      public Adapter caseBranchValue(BranchValue object)
      {
        return createBranchValueAdapter();
      }
      @Override
      public Adapter caseConnectionErrorSource(ConnectionErrorSource object)
      {
        return createConnectionErrorSourceAdapter();
      }
      @Override
      public Adapter caseConditionExpression(ConditionExpression object)
      {
        return createConditionExpressionAdapter();
      }
      @Override
      public Adapter caseOrmoreExpression(OrmoreExpression object)
      {
        return createOrmoreExpressionAdapter();
      }
      @Override
      public Adapter caseOrlessExpression(OrlessExpression object)
      {
        return createOrlessExpressionAdapter();
      }
      @Override
      public Adapter caseConditionElement(ConditionElement object)
      {
        return createConditionElementAdapter();
      }
      @Override
      public Adapter caseEventOrPropagation(EventOrPropagation object)
      {
        return createEventOrPropagationAdapter();
      }
      @Override
      public Adapter caseOutgoingPropagationCondition(OutgoingPropagationCondition object)
      {
        return createOutgoingPropagationConditionAdapter();
      }
      @Override
      public Adapter caseErrorDetection(ErrorDetection object)
      {
        return createErrorDetectionAdapter();
      }
      @Override
      public Adapter caseErrorCodeValue(ErrorCodeValue object)
      {
        return createErrorCodeValueAdapter();
      }
      @Override
      public Adapter caseErrorStateToModeMapping(ErrorStateToModeMapping object)
      {
        return createErrorStateToModeMappingAdapter();
      }
      @Override
      public Adapter caseCompositeState(CompositeState object)
      {
        return createCompositeStateAdapter();
      }
      @Override
      public Adapter caseQualifiedErrorBehaviorState(QualifiedErrorBehaviorState object)
      {
        return createQualifiedErrorBehaviorStateAdapter();
      }
      @Override
      public Adapter caseSubcomponentElement(SubcomponentElement object)
      {
        return createSubcomponentElementAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseSOrExpression(SOrExpression object)
      {
        return createSOrExpressionAdapter();
      }
      @Override
      public Adapter caseSAndExpression(SAndExpression object)
      {
        return createSAndExpressionAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseAnnexLibrary(AnnexLibrary object)
      {
        return createAnnexLibraryAdapter();
      }
      @Override
      public Adapter caseModalElement(ModalElement object)
      {
        return createModalElementAdapter();
      }
      @Override
      public Adapter caseAnnexSubclause(AnnexSubclause object)
      {
        return createAnnexSubclauseAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary
   * @generated
   */
  public Adapter createErrorModelLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause <em>Subclause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause
   * @generated
   */
  public Adapter createErrorModelSubclauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorTypes <em>Error Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorTypes
   * @generated
   */
  public Adapter createErrorTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorType <em>Error Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorType
   * @generated
   */
  public Adapter createErrorTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeSet <em>Type Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeSet
   * @generated
   */
  public Adapter createTypeSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeToken <em>Type Token</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeToken
   * @generated
   */
  public Adapter createTypeTokenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformationSet <em>Type Transformation Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformationSet
   * @generated
   */
  public Adapter createTypeTransformationSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformation <em>Type Transformation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformation
   * @generated
   */
  public Adapter createTypeTransformationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeMappingSet <em>Type Mapping Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeMappingSet
   * @generated
   */
  public Adapter createTypeMappingSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeMapping <em>Type Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeMapping
   * @generated
   */
  public Adapter createTypeMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation <em>Error Propagation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation
   * @generated
   */
  public Adapter createErrorPropagationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.FeatureorPPReference <em>Featureor PP Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.FeatureorPPReference
   * @generated
   */
  public Adapter createFeatureorPPReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorFlow <em>Error Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorFlow
   * @generated
   */
  public Adapter createErrorFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource <em>Error Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource
   * @generated
   */
  public Adapter createErrorSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateOrTypeSet <em>Error Behavior State Or Type Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateOrTypeSet
   * @generated
   */
  public Adapter createErrorBehaviorStateOrTypeSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorSink <em>Error Sink</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorSink
   * @generated
   */
  public Adapter createErrorSinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath <em>Error Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath
   * @generated
   */
  public Adapter createErrorPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.PropagationPoint <em>Propagation Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.PropagationPoint
   * @generated
   */
  public Adapter createPropagationPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.PropagationPath <em>Propagation Path</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.PropagationPath
   * @generated
   */
  public Adapter createPropagationPathAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.QualifiedPropagationPoint <em>Qualified Propagation Point</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.QualifiedPropagationPoint
   * @generated
   */
  public Adapter createQualifiedPropagationPointAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine <em>Error Behavior State Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine
   * @generated
   */
  public Adapter createErrorBehaviorStateMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorEvent <em>Error Behavior Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorEvent
   * @generated
   */
  public Adapter createErrorBehaviorEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorEvent <em>Error Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorEvent
   * @generated
   */
  public Adapter createErrorEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.RepairEvent <em>Repair Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.RepairEvent
   * @generated
   */
  public Adapter createRepairEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.RecoverEvent <em>Recover Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.RecoverEvent
   * @generated
   */
  public Adapter createRecoverEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState <em>Error Behavior State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState
   * @generated
   */
  public Adapter createErrorBehaviorStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition <em>Error Behavior Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition
   * @generated
   */
  public Adapter createErrorBehaviorTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TransitionBranch <em>Transition Branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TransitionBranch
   * @generated
   */
  public Adapter createTransitionBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.BranchValue <em>Branch Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.BranchValue
   * @generated
   */
  public Adapter createBranchValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource <em>Connection Error Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource
   * @generated
   */
  public Adapter createConnectionErrorSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConditionExpression <em>Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConditionExpression
   * @generated
   */
  public Adapter createConditionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.OrmoreExpression <em>Ormore Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OrmoreExpression
   * @generated
   */
  public Adapter createOrmoreExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.OrlessExpression <em>Orless Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OrlessExpression
   * @generated
   */
  public Adapter createOrlessExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConditionElement <em>Condition Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConditionElement
   * @generated
   */
  public Adapter createConditionElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.EventOrPropagation <em>Event Or Propagation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.EventOrPropagation
   * @generated
   */
  public Adapter createEventOrPropagationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition <em>Outgoing Propagation Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition
   * @generated
   */
  public Adapter createOutgoingPropagationConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection <em>Error Detection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection
   * @generated
   */
  public Adapter createErrorDetectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorCodeValue <em>Error Code Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorCodeValue
   * @generated
   */
  public Adapter createErrorCodeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorStateToModeMapping <em>Error State To Mode Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorStateToModeMapping
   * @generated
   */
  public Adapter createErrorStateToModeMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.CompositeState <em>Composite State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.CompositeState
   * @generated
   */
  public Adapter createCompositeStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.QualifiedErrorBehaviorState <em>Qualified Error Behavior State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.QualifiedErrorBehaviorState
   * @generated
   */
  public Adapter createQualifiedErrorBehaviorStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.SubcomponentElement <em>Subcomponent Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.SubcomponentElement
   * @generated
   */
  public Adapter createSubcomponentElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.SOrExpression <em>SOr Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.SOrExpression
   * @generated
   */
  public Adapter createSOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.xtext.aadl2.errormodel.errorModel.SAndExpression <em>SAnd Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.SAndExpression
   * @generated
   */
  public Adapter createSAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.AnnexLibrary <em>Annex Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.AnnexLibrary
   * @generated
   */
  public Adapter createAnnexLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.ModalElement <em>Modal Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.ModalElement
   * @generated
   */
  public Adapter createModalElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.osate.aadl2.AnnexSubclause <em>Annex Subclause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.osate.aadl2.AnnexSubclause
   * @generated
   */
  public Adapter createAnnexSubclauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ErrorModelAdapterFactory
