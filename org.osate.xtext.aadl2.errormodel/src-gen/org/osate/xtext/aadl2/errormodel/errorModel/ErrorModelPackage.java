/**
 */
package org.osate.xtext.aadl2.errormodel.errorModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.aadl2.Aadl2Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelFactory
 * @model kind="package"
 * @generated
 */
public interface ErrorModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "errorModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.aadl.info/EMV2";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "errorModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ErrorModelPackage eINSTANCE = org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelLibraryImpl <em>Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelLibraryImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorModelLibrary()
   * @generated
   */
  int ERROR_MODEL_LIBRARY = 0;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY__OWNED_ELEMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY__OWNED_COMMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY__NAME = Aadl2Package.ANNEX_LIBRARY__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY__QUALIFIED_NAME = Aadl2Package.ANNEX_LIBRARY__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_LIBRARY__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Use Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY__USE_TYPES = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY__EXTENDS = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY__TYPES = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Typesets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY__TYPESETS = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY__PROPERTIES = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY__BEHAVIORS = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY__MAPPINGS = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Transformations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY__TRANSFORMATIONS = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_LIBRARY_FEATURE_COUNT = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelSubclauseImpl <em>Subclause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelSubclauseImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorModelSubclause()
   * @generated
   */
  int ERROR_MODEL_SUBCLAUSE = 1;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__OWNED_ELEMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__OWNED_COMMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__NAME = Aadl2Package.ANNEX_SUBCLAUSE__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__QUALIFIED_NAME = Aadl2Package.ANNEX_SUBCLAUSE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>In Mode</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__IN_MODE = Aadl2Package.ANNEX_SUBCLAUSE__IN_MODE;

  /**
   * The feature id for the '<em><b>Use Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__USE_TYPES = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Equivalence</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__TYPE_EQUIVALENCE = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type Mapping Set</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__TYPE_MAPPING_SET = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Use Behavior</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__USE_BEHAVIOR = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Propagations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__PROPAGATIONS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__FLOWS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Use Transformation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__USE_TRANSFORMATION = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__EVENTS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__TRANSITIONS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Outgoing Propagation Conditions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__OUTGOING_PROPAGATION_CONDITIONS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Error Detections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__ERROR_DETECTIONS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Error State To Mode Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__ERROR_STATE_TO_MODE_MAPPINGS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__STATES = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Type Transformation Set</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__TYPE_TRANSFORMATION_SET = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Connection Error Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__CONNECTION_ERROR_SOURCES = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Points</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__POINTS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Paths</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__PATHS = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE__PROPERTIES = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 17;

  /**
   * The number of structural features of the '<em>Subclause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MODEL_SUBCLAUSE_FEATURE_COUNT = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 18;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorTypesImpl <em>Error Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorTypesImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorTypes()
   * @generated
   */
  int ERROR_TYPES = 2;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPES__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPES__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPES__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPES__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPES__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The number of structural features of the '<em>Error Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPES_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorTypeImpl <em>Error Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorTypeImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorType()
   * @generated
   */
  int ERROR_TYPE = 3;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE__OWNED_ELEMENT = ERROR_TYPES__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE__OWNED_COMMENT = ERROR_TYPES__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE__NAME = ERROR_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE__QUALIFIED_NAME = ERROR_TYPES__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE__OWNED_PROPERTY_ASSOCIATION = ERROR_TYPES__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE__SUPER_TYPE = ERROR_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aliased Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE__ALIASED_TYPE = ERROR_TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Error Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_TYPE_FEATURE_COUNT = ERROR_TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeSetImpl <em>Type Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeSetImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTypeSet()
   * @generated
   */
  int TYPE_SET = 4;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SET__OWNED_ELEMENT = ERROR_TYPES__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SET__OWNED_COMMENT = ERROR_TYPES__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SET__NAME = ERROR_TYPES__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SET__QUALIFIED_NAME = ERROR_TYPES__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SET__OWNED_PROPERTY_ASSOCIATION = ERROR_TYPES__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Type Tokens</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SET__TYPE_TOKENS = ERROR_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aliased Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SET__ALIASED_TYPE = ERROR_TYPES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SET_FEATURE_COUNT = ERROR_TYPES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeTokenImpl <em>Type Token</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeTokenImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTypeToken()
   * @generated
   */
  int TYPE_TOKEN = 5;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TOKEN__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TOKEN__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TOKEN__TYPE = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>No Error</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TOKEN__NO_ERROR = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Token</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TOKEN_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeTransformationSetImpl <em>Type Transformation Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeTransformationSetImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTypeTransformationSet()
   * @generated
   */
  int TYPE_TRANSFORMATION_SET = 6;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION_SET__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION_SET__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION_SET__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION_SET__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION_SET__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Use Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION_SET__USE_TYPES = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transformation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION_SET__TRANSFORMATION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Transformation Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION_SET_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeTransformationImpl <em>Type Transformation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeTransformationImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTypeTransformation()
   * @generated
   */
  int TYPE_TRANSFORMATION = 7;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION__SOURCE = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>All Sources</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION__ALL_SOURCES = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Contributor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION__CONTRIBUTOR = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION__TARGET = Aadl2Package.ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Type Transformation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TRANSFORMATION_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeMappingSetImpl <em>Type Mapping Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeMappingSetImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTypeMappingSet()
   * @generated
   */
  int TYPE_MAPPING_SET = 8;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING_SET__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING_SET__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING_SET__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING_SET__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING_SET__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Use Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING_SET__USE_TYPES = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING_SET__MAPPING = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Mapping Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING_SET_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeMappingImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTypeMapping()
   * @generated
   */
  int TYPE_MAPPING = 9;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING__SOURCE = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING__TARGET = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_MAPPING_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorPropagationImpl <em>Error Propagation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorPropagationImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorPropagation()
   * @generated
   */
  int ERROR_PROPAGATION = 10;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION__KIND = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Featureor PP Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION__FEATUREOR_PP_REF = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Not</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION__NOT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION__DIRECTION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Type Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION__TYPE_SET = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Error Propagation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PROPAGATION_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.FeatureorPPReferenceImpl <em>Featureor PP Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.FeatureorPPReferenceImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getFeatureorPPReference()
   * @generated
   */
  int FEATUREOR_PP_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATUREOR_PP_REFERENCE__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATUREOR_PP_REFERENCE__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Featureor PP</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATUREOR_PP_REFERENCE__FEATUREOR_PP = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATUREOR_PP_REFERENCE__NEXT = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Featureor PP Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATUREOR_PP_REFERENCE_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorFlowImpl <em>Error Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorFlowImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorFlow()
   * @generated
   */
  int ERROR_FLOW = 12;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_FLOW__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_FLOW__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_FLOW__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_FLOW__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_FLOW__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_FLOW__TYPE_TOKEN_CONSTRAINT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Error Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_FLOW_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorSourceImpl <em>Error Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorSourceImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorSource()
   * @generated
   */
  int ERROR_SOURCE = 13;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SOURCE__OWNED_ELEMENT = ERROR_FLOW__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SOURCE__OWNED_COMMENT = ERROR_FLOW__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SOURCE__NAME = ERROR_FLOW__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SOURCE__QUALIFIED_NAME = ERROR_FLOW__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SOURCE__OWNED_PROPERTY_ASSOCIATION = ERROR_FLOW__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SOURCE__TYPE_TOKEN_CONSTRAINT = ERROR_FLOW__TYPE_TOKEN_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SOURCE__OUTGOING = ERROR_FLOW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>All Outgoing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SOURCE__ALL_OUTGOING = ERROR_FLOW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Failure Mode Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SOURCE__FAILURE_MODE_REFERENCE = ERROR_FLOW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Failure Mode Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SOURCE__FAILURE_MODE_TYPE = ERROR_FLOW_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Failure Mode Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SOURCE__FAILURE_MODE_DESCRIPTION = ERROR_FLOW_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SOURCE__CONDITION = ERROR_FLOW_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Error Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SOURCE_FEATURE_COUNT = ERROR_FLOW_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorStateOrTypeSetImpl <em>Error Behavior State Or Type Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorStateOrTypeSetImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorBehaviorStateOrTypeSet()
   * @generated
   */
  int ERROR_BEHAVIOR_STATE_OR_TYPE_SET = 14;

  /**
   * The number of structural features of the '<em>Error Behavior State Or Type Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_OR_TYPE_SET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorSinkImpl <em>Error Sink</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorSinkImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorSink()
   * @generated
   */
  int ERROR_SINK = 15;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SINK__OWNED_ELEMENT = ERROR_FLOW__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SINK__OWNED_COMMENT = ERROR_FLOW__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SINK__NAME = ERROR_FLOW__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SINK__QUALIFIED_NAME = ERROR_FLOW__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SINK__OWNED_PROPERTY_ASSOCIATION = ERROR_FLOW__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SINK__TYPE_TOKEN_CONSTRAINT = ERROR_FLOW__TYPE_TOKEN_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SINK__INCOMING = ERROR_FLOW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>All Incoming</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SINK__ALL_INCOMING = ERROR_FLOW_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Error Sink</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_SINK_FEATURE_COUNT = ERROR_FLOW_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorPathImpl <em>Error Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorPathImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorPath()
   * @generated
   */
  int ERROR_PATH = 16;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PATH__OWNED_ELEMENT = ERROR_FLOW__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PATH__OWNED_COMMENT = ERROR_FLOW__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PATH__NAME = ERROR_FLOW__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PATH__QUALIFIED_NAME = ERROR_FLOW__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PATH__OWNED_PROPERTY_ASSOCIATION = ERROR_FLOW__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PATH__TYPE_TOKEN_CONSTRAINT = ERROR_FLOW__TYPE_TOKEN_CONSTRAINT;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PATH__INCOMING = ERROR_FLOW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>All Incoming</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PATH__ALL_INCOMING = ERROR_FLOW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PATH__OUTGOING = ERROR_FLOW_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>All Outgoing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PATH__ALL_OUTGOING = ERROR_FLOW_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Target Token</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PATH__TARGET_TOKEN = ERROR_FLOW_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Type Mapping Set</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PATH__TYPE_MAPPING_SET = ERROR_FLOW_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Error Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_PATH_FEATURE_COUNT = ERROR_FLOW_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.PropagationPointImpl <em>Propagation Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.PropagationPointImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getPropagationPoint()
   * @generated
   */
  int PROPAGATION_POINT = 17;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_POINT__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_POINT__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_POINT__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_POINT__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_POINT__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The number of structural features of the '<em>Propagation Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_POINT_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.PropagationPathImpl <em>Propagation Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.PropagationPathImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getPropagationPath()
   * @generated
   */
  int PROPAGATION_PATH = 18;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_PATH__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_PATH__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_PATH__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_PATH__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_PATH__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_PATH__SOURCE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_PATH__TARGET = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Propagation Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPAGATION_PATH_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.QualifiedPropagationPointImpl <em>Qualified Propagation Point</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.QualifiedPropagationPointImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getQualifiedPropagationPoint()
   * @generated
   */
  int QUALIFIED_PROPAGATION_POINT = 19;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_PROPAGATION_POINT__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_PROPAGATION_POINT__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Subcomponent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_PROPAGATION_POINT__SUBCOMPONENT = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_PROPAGATION_POINT__NEXT = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Propagation Point</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_PROPAGATION_POINT__PROPAGATION_POINT = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Qualified Propagation Point</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_PROPAGATION_POINT_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorStateMachineImpl <em>Error Behavior State Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorStateMachineImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorBehaviorStateMachine()
   * @generated
   */
  int ERROR_BEHAVIOR_STATE_MACHINE = 20;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_MACHINE__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_MACHINE__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_MACHINE__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_MACHINE__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_MACHINE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Use Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_MACHINE__USE_TYPES = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Use Transformation</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_MACHINE__USE_TRANSFORMATION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_MACHINE__EVENTS = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_MACHINE__STATES = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_MACHINE__TRANSITIONS = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_MACHINE__PROPERTIES = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Error Behavior State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_MACHINE_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorEventImpl <em>Error Behavior Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorEventImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorBehaviorEvent()
   * @generated
   */
  int ERROR_BEHAVIOR_EVENT = 21;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_EVENT__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_EVENT__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_EVENT__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_EVENT__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_EVENT__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The number of structural features of the '<em>Error Behavior Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_EVENT_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorEventImpl <em>Error Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorEventImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorEvent()
   * @generated
   */
  int ERROR_EVENT = 22;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_EVENT__OWNED_ELEMENT = ERROR_BEHAVIOR_EVENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_EVENT__OWNED_COMMENT = ERROR_BEHAVIOR_EVENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_EVENT__NAME = ERROR_BEHAVIOR_EVENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_EVENT__QUALIFIED_NAME = ERROR_BEHAVIOR_EVENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_EVENT__OWNED_PROPERTY_ASSOCIATION = ERROR_BEHAVIOR_EVENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Type Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_EVENT__TYPE_SET = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_EVENT__CONDITION = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Error Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_EVENT_FEATURE_COUNT = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.RepairEventImpl <em>Repair Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.RepairEventImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getRepairEvent()
   * @generated
   */
  int REPAIR_EVENT = 23;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPAIR_EVENT__OWNED_ELEMENT = ERROR_BEHAVIOR_EVENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPAIR_EVENT__OWNED_COMMENT = ERROR_BEHAVIOR_EVENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPAIR_EVENT__NAME = ERROR_BEHAVIOR_EVENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPAIR_EVENT__QUALIFIED_NAME = ERROR_BEHAVIOR_EVENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPAIR_EVENT__OWNED_PROPERTY_ASSOCIATION = ERROR_BEHAVIOR_EVENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Event Initiator</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPAIR_EVENT__EVENT_INITIATOR = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Repair Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPAIR_EVENT_FEATURE_COUNT = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.RecoverEventImpl <em>Recover Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.RecoverEventImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getRecoverEvent()
   * @generated
   */
  int RECOVER_EVENT = 24;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOVER_EVENT__OWNED_ELEMENT = ERROR_BEHAVIOR_EVENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOVER_EVENT__OWNED_COMMENT = ERROR_BEHAVIOR_EVENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOVER_EVENT__NAME = ERROR_BEHAVIOR_EVENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOVER_EVENT__QUALIFIED_NAME = ERROR_BEHAVIOR_EVENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOVER_EVENT__OWNED_PROPERTY_ASSOCIATION = ERROR_BEHAVIOR_EVENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Event Initiator</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOVER_EVENT__EVENT_INITIATOR = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOVER_EVENT__CONDITION = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Recover Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECOVER_EVENT_FEATURE_COUNT = ERROR_BEHAVIOR_EVENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorStateImpl <em>Error Behavior State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorStateImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorBehaviorState()
   * @generated
   */
  int ERROR_BEHAVIOR_STATE = 25;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Intial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE__INTIAL = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE__TYPE_SET = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Error Behavior State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_STATE_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorTransitionImpl <em>Error Behavior Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorTransitionImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorBehaviorTransition()
   * @generated
   */
  int ERROR_BEHAVIOR_TRANSITION = 26;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION__SOURCE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION__TYPE_TOKEN_CONSTRAINT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>All States</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION__ALL_STATES = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION__CONDITION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION__TARGET = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Target Token</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION__TARGET_TOKEN = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Steady State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION__STEADY_STATE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Destination Branches</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION__DESTINATION_BRANCHES = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Error Behavior Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_BEHAVIOR_TRANSITION_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TransitionBranchImpl <em>Transition Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TransitionBranchImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTransitionBranch()
   * @generated
   */
  int TRANSITION_BRANCH = 27;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BRANCH__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BRANCH__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BRANCH__TARGET = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target Token</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BRANCH__TARGET_TOKEN = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Steady State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BRANCH__STEADY_STATE = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BRANCH__VALUE = Aadl2Package.ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Transition Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BRANCH_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.BranchValueImpl <em>Branch Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.BranchValueImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getBranchValue()
   * @generated
   */
  int BRANCH_VALUE = 28;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_VALUE__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_VALUE__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Realvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_VALUE__REALVALUE = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Symboliclabel</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_VALUE__SYMBOLICLABEL = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Others</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_VALUE__OTHERS = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Branch Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_VALUE_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ConnectionErrorSourceImpl <em>Connection Error Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ConnectionErrorSourceImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getConnectionErrorSource()
   * @generated
   */
  int CONNECTION_ERROR_SOURCE = 29;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ERROR_SOURCE__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ERROR_SOURCE__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ERROR_SOURCE__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ERROR_SOURCE__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ERROR_SOURCE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Connection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ERROR_SOURCE__CONNECTION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>All</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ERROR_SOURCE__ALL = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ERROR_SOURCE__TYPE_TOKEN_CONSTRAINT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Failure Mode Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ERROR_SOURCE__FAILURE_MODE_TYPE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Failure Mode Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ERROR_SOURCE__FAILURE_MODE_DESCRIPTION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ERROR_SOURCE__CONDITION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Connection Error Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTION_ERROR_SOURCE_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ConditionExpressionImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getConditionExpression()
   * @generated
   */
  int CONDITION_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPRESSION__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPRESSION__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The number of structural features of the '<em>Condition Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_EXPRESSION_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.OrmoreExpressionImpl <em>Ormore Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.OrmoreExpressionImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getOrmoreExpression()
   * @generated
   */
  int ORMORE_EXPRESSION = 31;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORMORE_EXPRESSION__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORMORE_EXPRESSION__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORMORE_EXPRESSION__COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORMORE_EXPRESSION__OPERANDS = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Ormore Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORMORE_EXPRESSION_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.OrlessExpressionImpl <em>Orless Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.OrlessExpressionImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getOrlessExpression()
   * @generated
   */
  int ORLESS_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORLESS_EXPRESSION__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORLESS_EXPRESSION__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORLESS_EXPRESSION__COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORLESS_EXPRESSION__OPERANDS = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Orless Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORLESS_EXPRESSION_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ConditionElementImpl <em>Condition Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ConditionElementImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getConditionElement()
   * @generated
   */
  int CONDITION_ELEMENT = 33;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ELEMENT__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ELEMENT__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Incoming</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ELEMENT__INCOMING = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ELEMENT__CONSTRAINT = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Qualified State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ELEMENT__QUALIFIED_STATE = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Condition Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_ELEMENT_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.EventOrPropagationImpl <em>Event Or Propagation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.EventOrPropagationImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getEventOrPropagation()
   * @generated
   */
  int EVENT_OR_PROPAGATION = 34;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_OR_PROPAGATION__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_OR_PROPAGATION__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_OR_PROPAGATION__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_OR_PROPAGATION__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_OR_PROPAGATION__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The number of structural features of the '<em>Event Or Propagation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_OR_PROPAGATION_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.OutgoingPropagationConditionImpl <em>Outgoing Propagation Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.OutgoingPropagationConditionImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getOutgoingPropagationCondition()
   * @generated
   */
  int OUTGOING_PROPAGATION_CONDITION = 35;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_PROPAGATION_CONDITION__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_PROPAGATION_CONDITION__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_PROPAGATION_CONDITION__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_PROPAGATION_CONDITION__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_PROPAGATION_CONDITION__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_PROPAGATION_CONDITION__STATE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN_CONSTRAINT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>All States</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_PROPAGATION_CONDITION__ALL_STATES = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_PROPAGATION_CONDITION__CONDITION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_PROPAGATION_CONDITION__OUTGOING = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>All Propagations</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_PROPAGATION_CONDITION__ALL_PROPAGATIONS = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Type Token</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Outgoing Propagation Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTGOING_PROPAGATION_CONDITION_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorDetectionImpl <em>Error Detection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorDetectionImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorDetection()
   * @generated
   */
  int ERROR_DETECTION = 36;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_DETECTION__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_DETECTION__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_DETECTION__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_DETECTION__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_DETECTION__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_DETECTION__STATE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Token Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_DETECTION__TYPE_TOKEN_CONSTRAINT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>All States</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_DETECTION__ALL_STATES = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_DETECTION__CONDITION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Detection Reporting Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_DETECTION__DETECTION_REPORTING_PORT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Error Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_DETECTION__ERROR_CODE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Error Detection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_DETECTION_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorCodeValueImpl <em>Error Code Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorCodeValueImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorCodeValue()
   * @generated
   */
  int ERROR_CODE_VALUE = 37;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_CODE_VALUE__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_CODE_VALUE__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_CODE_VALUE__INT_VALUE = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_CODE_VALUE__CONSTANT = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Enum Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_CODE_VALUE__ENUM_LITERAL = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Error Code Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_CODE_VALUE_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorStateToModeMappingImpl <em>Error State To Mode Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorStateToModeMappingImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorStateToModeMapping()
   * @generated
   */
  int ERROR_STATE_TO_MODE_MAPPING = 38;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_STATE_TO_MODE_MAPPING__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_STATE_TO_MODE_MAPPING__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Error State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_STATE_TO_MODE_MAPPING__ERROR_STATE = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Token</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_STATE_TO_MODE_MAPPING__TYPE_TOKEN = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Mapped Modes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_STATE_TO_MODE_MAPPING__MAPPED_MODES = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Error State To Mode Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_STATE_TO_MODE_MAPPING_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.CompositeStateImpl <em>Composite State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.CompositeStateImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getCompositeState()
   * @generated
   */
  int COMPOSITE_STATE = 39;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__CONDITION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Others</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__OTHERS = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__STATE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Typed Token</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__TYPED_TOKEN = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Composite State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.QualifiedErrorBehaviorStateImpl <em>Qualified Error Behavior State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.QualifiedErrorBehaviorStateImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getQualifiedErrorBehaviorState()
   * @generated
   */
  int QUALIFIED_ERROR_BEHAVIOR_STATE = 40;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_ERROR_BEHAVIOR_STATE__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_ERROR_BEHAVIOR_STATE__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Subcomponent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_ERROR_BEHAVIOR_STATE__SUBCOMPONENT = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_ERROR_BEHAVIOR_STATE__NEXT = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_ERROR_BEHAVIOR_STATE__STATE = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Qualified Error Behavior State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_ERROR_BEHAVIOR_STATE_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.SubcomponentElementImpl <em>Subcomponent Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.SubcomponentElementImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getSubcomponentElement()
   * @generated
   */
  int SUBCOMPONENT_ELEMENT = 41;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCOMPONENT_ELEMENT__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCOMPONENT_ELEMENT__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Subcomponent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCOMPONENT_ELEMENT__SUBCOMPONENT = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Subcomponent Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBCOMPONENT_ELEMENT_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.OrExpressionImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__OWNED_ELEMENT = CONDITION_EXPRESSION__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__OWNED_COMMENT = CONDITION_EXPRESSION__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__OPERANDS = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.AndExpressionImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__OWNED_ELEMENT = CONDITION_EXPRESSION__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__OWNED_COMMENT = CONDITION_EXPRESSION__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__OPERANDS = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.SOrExpressionImpl <em>SOr Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.SOrExpressionImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getSOrExpression()
   * @generated
   */
  int SOR_EXPRESSION = 44;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOR_EXPRESSION__OWNED_ELEMENT = CONDITION_EXPRESSION__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOR_EXPRESSION__OWNED_COMMENT = CONDITION_EXPRESSION__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOR_EXPRESSION__OPERANDS = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SOr Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOR_EXPRESSION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.SAndExpressionImpl <em>SAnd Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.SAndExpressionImpl
   * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getSAndExpression()
   * @generated
   */
  int SAND_EXPRESSION = 45;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAND_EXPRESSION__OWNED_ELEMENT = CONDITION_EXPRESSION__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAND_EXPRESSION__OWNED_COMMENT = CONDITION_EXPRESSION__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAND_EXPRESSION__OPERANDS = CONDITION_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SAnd Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAND_EXPRESSION_FEATURE_COUNT = CONDITION_EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Library</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary
   * @generated
   */
  EClass getErrorModelLibrary();

  /**
   * Returns the meta object for the reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getUseTypes <em>Use Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Use Types</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getUseTypes()
   * @see #getErrorModelLibrary()
   * @generated
   */
  EReference getErrorModelLibrary_UseTypes();

  /**
   * Returns the meta object for the reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Extends</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getExtends()
   * @see #getErrorModelLibrary()
   * @generated
   */
  EReference getErrorModelLibrary_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getTypes()
   * @see #getErrorModelLibrary()
   * @generated
   */
  EReference getErrorModelLibrary_Types();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getTypesets <em>Typesets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typesets</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getTypesets()
   * @see #getErrorModelLibrary()
   * @generated
   */
  EReference getErrorModelLibrary_Typesets();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getProperties()
   * @see #getErrorModelLibrary()
   * @generated
   */
  EReference getErrorModelLibrary_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getBehaviors <em>Behaviors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Behaviors</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getBehaviors()
   * @see #getErrorModelLibrary()
   * @generated
   */
  EReference getErrorModelLibrary_Behaviors();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getMappings()
   * @see #getErrorModelLibrary()
   * @generated
   */
  EReference getErrorModelLibrary_Mappings();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getTransformations <em>Transformations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transformations</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelLibrary#getTransformations()
   * @see #getErrorModelLibrary()
   * @generated
   */
  EReference getErrorModelLibrary_Transformations();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause <em>Subclause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subclause</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause
   * @generated
   */
  EClass getErrorModelSubclause();

  /**
   * Returns the meta object for the reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getUseTypes <em>Use Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Use Types</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getUseTypes()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_UseTypes();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getTypeEquivalence <em>Type Equivalence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Equivalence</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getTypeEquivalence()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_TypeEquivalence();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getTypeMappingSet <em>Type Mapping Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Mapping Set</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getTypeMappingSet()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_TypeMappingSet();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getUseBehavior <em>Use Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Use Behavior</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getUseBehavior()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_UseBehavior();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getPropagations <em>Propagations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Propagations</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getPropagations()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_Propagations();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getFlows <em>Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Flows</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getFlows()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_Flows();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getUseTransformation <em>Use Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Use Transformation</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getUseTransformation()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_UseTransformation();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getEvents()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_Events();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getTransitions()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_Transitions();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getOutgoingPropagationConditions <em>Outgoing Propagation Conditions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outgoing Propagation Conditions</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getOutgoingPropagationConditions()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_OutgoingPropagationConditions();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getErrorDetections <em>Error Detections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Error Detections</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getErrorDetections()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_ErrorDetections();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getErrorStateToModeMappings <em>Error State To Mode Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Error State To Mode Mappings</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getErrorStateToModeMappings()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_ErrorStateToModeMappings();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getStates()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_States();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getTypeTransformationSet <em>Type Transformation Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Transformation Set</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getTypeTransformationSet()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_TypeTransformationSet();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getConnectionErrorSources <em>Connection Error Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connection Error Sources</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getConnectionErrorSources()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_ConnectionErrorSources();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Points</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getPoints()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_Points();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getPaths <em>Paths</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Paths</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getPaths()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_Paths();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorModelSubclause#getProperties()
   * @see #getErrorModelSubclause()
   * @generated
   */
  EReference getErrorModelSubclause_Properties();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorTypes <em>Error Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Types</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorTypes
   * @generated
   */
  EClass getErrorTypes();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorType <em>Error Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Type</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorType
   * @generated
   */
  EClass getErrorType();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorType#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorType#getSuperType()
   * @see #getErrorType()
   * @generated
   */
  EReference getErrorType_SuperType();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorType#getAliasedType <em>Aliased Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Aliased Type</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorType#getAliasedType()
   * @see #getErrorType()
   * @generated
   */
  EReference getErrorType_AliasedType();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeSet <em>Type Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Set</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeSet
   * @generated
   */
  EClass getTypeSet();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeSet#getTypeTokens <em>Type Tokens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Tokens</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeSet#getTypeTokens()
   * @see #getTypeSet()
   * @generated
   */
  EReference getTypeSet_TypeTokens();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeSet#getAliasedType <em>Aliased Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Aliased Type</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeSet#getAliasedType()
   * @see #getTypeSet()
   * @generated
   */
  EReference getTypeSet_AliasedType();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeToken <em>Type Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Token</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeToken
   * @generated
   */
  EClass getTypeToken();

  /**
   * Returns the meta object for the reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeToken#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Type</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeToken#getType()
   * @see #getTypeToken()
   * @generated
   */
  EReference getTypeToken_Type();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeToken#isNoError <em>No Error</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>No Error</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeToken#isNoError()
   * @see #getTypeToken()
   * @generated
   */
  EAttribute getTypeToken_NoError();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformationSet <em>Type Transformation Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Transformation Set</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformationSet
   * @generated
   */
  EClass getTypeTransformationSet();

  /**
   * Returns the meta object for the reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformationSet#getUseTypes <em>Use Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Use Types</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformationSet#getUseTypes()
   * @see #getTypeTransformationSet()
   * @generated
   */
  EReference getTypeTransformationSet_UseTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformationSet#getTransformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transformation</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformationSet#getTransformation()
   * @see #getTypeTransformationSet()
   * @generated
   */
  EReference getTypeTransformationSet_Transformation();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformation <em>Type Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Transformation</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformation
   * @generated
   */
  EClass getTypeTransformation();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformation#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformation#getSource()
   * @see #getTypeTransformation()
   * @generated
   */
  EReference getTypeTransformation_Source();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformation#isAllSources <em>All Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Sources</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformation#isAllSources()
   * @see #getTypeTransformation()
   * @generated
   */
  EAttribute getTypeTransformation_AllSources();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformation#getContributor <em>Contributor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contributor</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformation#getContributor()
   * @see #getTypeTransformation()
   * @generated
   */
  EReference getTypeTransformation_Contributor();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformation#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeTransformation#getTarget()
   * @see #getTypeTransformation()
   * @generated
   */
  EReference getTypeTransformation_Target();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeMappingSet <em>Type Mapping Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Mapping Set</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeMappingSet
   * @generated
   */
  EClass getTypeMappingSet();

  /**
   * Returns the meta object for the reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeMappingSet#getUseTypes <em>Use Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Use Types</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeMappingSet#getUseTypes()
   * @see #getTypeMappingSet()
   * @generated
   */
  EReference getTypeMappingSet_UseTypes();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeMappingSet#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapping</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeMappingSet#getMapping()
   * @see #getTypeMappingSet()
   * @generated
   */
  EReference getTypeMappingSet_Mapping();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeMapping <em>Type Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Mapping</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeMapping
   * @generated
   */
  EClass getTypeMapping();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeMapping#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeMapping#getSource()
   * @see #getTypeMapping()
   * @generated
   */
  EReference getTypeMapping_Source();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.TypeMapping#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TypeMapping#getTarget()
   * @see #getTypeMapping()
   * @generated
   */
  EReference getTypeMapping_Target();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation <em>Error Propagation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Propagation</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation
   * @generated
   */
  EClass getErrorPropagation();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation#getKind()
   * @see #getErrorPropagation()
   * @generated
   */
  EAttribute getErrorPropagation_Kind();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation#getFeatureorPPRef <em>Featureor PP Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Featureor PP Ref</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation#getFeatureorPPRef()
   * @see #getErrorPropagation()
   * @generated
   */
  EReference getErrorPropagation_FeatureorPPRef();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation#isNot <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Not</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation#isNot()
   * @see #getErrorPropagation()
   * @generated
   */
  EAttribute getErrorPropagation_Not();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation#getDirection()
   * @see #getErrorPropagation()
   * @generated
   */
  EAttribute getErrorPropagation_Direction();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation#getTypeSet <em>Type Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Set</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPropagation#getTypeSet()
   * @see #getErrorPropagation()
   * @generated
   */
  EReference getErrorPropagation_TypeSet();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.FeatureorPPReference <em>Featureor PP Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Featureor PP Reference</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.FeatureorPPReference
   * @generated
   */
  EClass getFeatureorPPReference();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.FeatureorPPReference#getFeatureorPP <em>Featureor PP</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Featureor PP</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.FeatureorPPReference#getFeatureorPP()
   * @see #getFeatureorPPReference()
   * @generated
   */
  EReference getFeatureorPPReference_FeatureorPP();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.FeatureorPPReference#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.FeatureorPPReference#getNext()
   * @see #getFeatureorPPReference()
   * @generated
   */
  EReference getFeatureorPPReference_Next();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorFlow <em>Error Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Flow</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorFlow
   * @generated
   */
  EClass getErrorFlow();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorFlow#getTypeTokenConstraint <em>Type Token Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Token Constraint</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorFlow#getTypeTokenConstraint()
   * @see #getErrorFlow()
   * @generated
   */
  EReference getErrorFlow_TypeTokenConstraint();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource <em>Error Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Source</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource
   * @generated
   */
  EClass getErrorSource();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Outgoing</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource#getOutgoing()
   * @see #getErrorSource()
   * @generated
   */
  EReference getErrorSource_Outgoing();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource#isAllOutgoing <em>All Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Outgoing</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource#isAllOutgoing()
   * @see #getErrorSource()
   * @generated
   */
  EAttribute getErrorSource_AllOutgoing();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource#getFailureModeReference <em>Failure Mode Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Failure Mode Reference</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource#getFailureModeReference()
   * @see #getErrorSource()
   * @generated
   */
  EReference getErrorSource_FailureModeReference();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource#getFailureModeType <em>Failure Mode Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Failure Mode Type</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource#getFailureModeType()
   * @see #getErrorSource()
   * @generated
   */
  EReference getErrorSource_FailureModeType();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource#getFailureModeDescription <em>Failure Mode Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Failure Mode Description</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource#getFailureModeDescription()
   * @see #getErrorSource()
   * @generated
   */
  EAttribute getErrorSource_FailureModeDescription();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorSource#getCondition()
   * @see #getErrorSource()
   * @generated
   */
  EAttribute getErrorSource_Condition();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateOrTypeSet <em>Error Behavior State Or Type Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Behavior State Or Type Set</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateOrTypeSet
   * @generated
   */
  EClass getErrorBehaviorStateOrTypeSet();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorSink <em>Error Sink</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Sink</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorSink
   * @generated
   */
  EClass getErrorSink();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorSink#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Incoming</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorSink#getIncoming()
   * @see #getErrorSink()
   * @generated
   */
  EReference getErrorSink_Incoming();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorSink#isAllIncoming <em>All Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Incoming</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorSink#isAllIncoming()
   * @see #getErrorSink()
   * @generated
   */
  EAttribute getErrorSink_AllIncoming();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath <em>Error Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Path</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath
   * @generated
   */
  EClass getErrorPath();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Incoming</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath#getIncoming()
   * @see #getErrorPath()
   * @generated
   */
  EReference getErrorPath_Incoming();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath#isAllIncoming <em>All Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Incoming</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath#isAllIncoming()
   * @see #getErrorPath()
   * @generated
   */
  EAttribute getErrorPath_AllIncoming();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Outgoing</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath#getOutgoing()
   * @see #getErrorPath()
   * @generated
   */
  EReference getErrorPath_Outgoing();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath#isAllOutgoing <em>All Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Outgoing</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath#isAllOutgoing()
   * @see #getErrorPath()
   * @generated
   */
  EAttribute getErrorPath_AllOutgoing();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath#getTargetToken <em>Target Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Token</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath#getTargetToken()
   * @see #getErrorPath()
   * @generated
   */
  EReference getErrorPath_TargetToken();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath#getTypeMappingSet <em>Type Mapping Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Mapping Set</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorPath#getTypeMappingSet()
   * @see #getErrorPath()
   * @generated
   */
  EReference getErrorPath_TypeMappingSet();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.PropagationPoint <em>Propagation Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Propagation Point</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.PropagationPoint
   * @generated
   */
  EClass getPropagationPoint();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.PropagationPath <em>Propagation Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Propagation Path</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.PropagationPath
   * @generated
   */
  EClass getPropagationPath();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.PropagationPath#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.PropagationPath#getSource()
   * @see #getPropagationPath()
   * @generated
   */
  EReference getPropagationPath_Source();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.PropagationPath#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.PropagationPath#getTarget()
   * @see #getPropagationPath()
   * @generated
   */
  EReference getPropagationPath_Target();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.QualifiedPropagationPoint <em>Qualified Propagation Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Propagation Point</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.QualifiedPropagationPoint
   * @generated
   */
  EClass getQualifiedPropagationPoint();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.QualifiedPropagationPoint#getSubcomponent <em>Subcomponent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subcomponent</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.QualifiedPropagationPoint#getSubcomponent()
   * @see #getQualifiedPropagationPoint()
   * @generated
   */
  EReference getQualifiedPropagationPoint_Subcomponent();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.QualifiedPropagationPoint#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.QualifiedPropagationPoint#getNext()
   * @see #getQualifiedPropagationPoint()
   * @generated
   */
  EReference getQualifiedPropagationPoint_Next();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.QualifiedPropagationPoint#getPropagationPoint <em>Propagation Point</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Propagation Point</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.QualifiedPropagationPoint#getPropagationPoint()
   * @see #getQualifiedPropagationPoint()
   * @generated
   */
  EReference getQualifiedPropagationPoint_PropagationPoint();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine <em>Error Behavior State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Behavior State Machine</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine
   * @generated
   */
  EClass getErrorBehaviorStateMachine();

  /**
   * Returns the meta object for the reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine#getUseTypes <em>Use Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Use Types</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine#getUseTypes()
   * @see #getErrorBehaviorStateMachine()
   * @generated
   */
  EReference getErrorBehaviorStateMachine_UseTypes();

  /**
   * Returns the meta object for the reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine#getUseTransformation <em>Use Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Use Transformation</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine#getUseTransformation()
   * @see #getErrorBehaviorStateMachine()
   * @generated
   */
  EReference getErrorBehaviorStateMachine_UseTransformation();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine#getEvents()
   * @see #getErrorBehaviorStateMachine()
   * @generated
   */
  EReference getErrorBehaviorStateMachine_Events();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine#getStates()
   * @see #getErrorBehaviorStateMachine()
   * @generated
   */
  EReference getErrorBehaviorStateMachine_States();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine#getTransitions()
   * @see #getErrorBehaviorStateMachine()
   * @generated
   */
  EReference getErrorBehaviorStateMachine_Transitions();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorStateMachine#getProperties()
   * @see #getErrorBehaviorStateMachine()
   * @generated
   */
  EReference getErrorBehaviorStateMachine_Properties();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorEvent <em>Error Behavior Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Behavior Event</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorEvent
   * @generated
   */
  EClass getErrorBehaviorEvent();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorEvent <em>Error Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Event</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorEvent
   * @generated
   */
  EClass getErrorEvent();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorEvent#getTypeSet <em>Type Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Set</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorEvent#getTypeSet()
   * @see #getErrorEvent()
   * @generated
   */
  EReference getErrorEvent_TypeSet();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorEvent#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorEvent#getCondition()
   * @see #getErrorEvent()
   * @generated
   */
  EAttribute getErrorEvent_Condition();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.RepairEvent <em>Repair Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Repair Event</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.RepairEvent
   * @generated
   */
  EClass getRepairEvent();

  /**
   * Returns the meta object for the reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.RepairEvent#getEventInitiator <em>Event Initiator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Event Initiator</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.RepairEvent#getEventInitiator()
   * @see #getRepairEvent()
   * @generated
   */
  EReference getRepairEvent_EventInitiator();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.RecoverEvent <em>Recover Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Recover Event</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.RecoverEvent
   * @generated
   */
  EClass getRecoverEvent();

  /**
   * Returns the meta object for the reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.RecoverEvent#getEventInitiator <em>Event Initiator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Event Initiator</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.RecoverEvent#getEventInitiator()
   * @see #getRecoverEvent()
   * @generated
   */
  EReference getRecoverEvent_EventInitiator();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.RecoverEvent#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.RecoverEvent#getCondition()
   * @see #getRecoverEvent()
   * @generated
   */
  EAttribute getRecoverEvent_Condition();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState <em>Error Behavior State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Behavior State</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState
   * @generated
   */
  EClass getErrorBehaviorState();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState#isIntial <em>Intial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Intial</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState#isIntial()
   * @see #getErrorBehaviorState()
   * @generated
   */
  EAttribute getErrorBehaviorState_Intial();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState#getTypeSet <em>Type Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Set</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorState#getTypeSet()
   * @see #getErrorBehaviorState()
   * @generated
   */
  EReference getErrorBehaviorState_TypeSet();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition <em>Error Behavior Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Behavior Transition</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition
   * @generated
   */
  EClass getErrorBehaviorTransition();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#getSource()
   * @see #getErrorBehaviorTransition()
   * @generated
   */
  EReference getErrorBehaviorTransition_Source();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#getTypeTokenConstraint <em>Type Token Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Token Constraint</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#getTypeTokenConstraint()
   * @see #getErrorBehaviorTransition()
   * @generated
   */
  EReference getErrorBehaviorTransition_TypeTokenConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#isAllStates <em>All States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All States</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#isAllStates()
   * @see #getErrorBehaviorTransition()
   * @generated
   */
  EAttribute getErrorBehaviorTransition_AllStates();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#getCondition()
   * @see #getErrorBehaviorTransition()
   * @generated
   */
  EReference getErrorBehaviorTransition_Condition();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#getTarget()
   * @see #getErrorBehaviorTransition()
   * @generated
   */
  EReference getErrorBehaviorTransition_Target();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#getTargetToken <em>Target Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Token</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#getTargetToken()
   * @see #getErrorBehaviorTransition()
   * @generated
   */
  EReference getErrorBehaviorTransition_TargetToken();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#isSteadyState <em>Steady State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Steady State</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#isSteadyState()
   * @see #getErrorBehaviorTransition()
   * @generated
   */
  EAttribute getErrorBehaviorTransition_SteadyState();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#getDestinationBranches <em>Destination Branches</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Destination Branches</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorBehaviorTransition#getDestinationBranches()
   * @see #getErrorBehaviorTransition()
   * @generated
   */
  EReference getErrorBehaviorTransition_DestinationBranches();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.TransitionBranch <em>Transition Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Branch</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TransitionBranch
   * @generated
   */
  EClass getTransitionBranch();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.TransitionBranch#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TransitionBranch#getTarget()
   * @see #getTransitionBranch()
   * @generated
   */
  EReference getTransitionBranch_Target();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.TransitionBranch#getTargetToken <em>Target Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Token</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TransitionBranch#getTargetToken()
   * @see #getTransitionBranch()
   * @generated
   */
  EReference getTransitionBranch_TargetToken();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.TransitionBranch#isSteadyState <em>Steady State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Steady State</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TransitionBranch#isSteadyState()
   * @see #getTransitionBranch()
   * @generated
   */
  EAttribute getTransitionBranch_SteadyState();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.TransitionBranch#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.TransitionBranch#getValue()
   * @see #getTransitionBranch()
   * @generated
   */
  EReference getTransitionBranch_Value();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.BranchValue <em>Branch Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Branch Value</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.BranchValue
   * @generated
   */
  EClass getBranchValue();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.BranchValue#getRealvalue <em>Realvalue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Realvalue</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.BranchValue#getRealvalue()
   * @see #getBranchValue()
   * @generated
   */
  EAttribute getBranchValue_Realvalue();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.BranchValue#getSymboliclabel <em>Symboliclabel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symboliclabel</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.BranchValue#getSymboliclabel()
   * @see #getBranchValue()
   * @generated
   */
  EReference getBranchValue_Symboliclabel();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.BranchValue#isOthers <em>Others</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Others</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.BranchValue#isOthers()
   * @see #getBranchValue()
   * @generated
   */
  EAttribute getBranchValue_Others();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource <em>Connection Error Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connection Error Source</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource
   * @generated
   */
  EClass getConnectionErrorSource();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource#getConnection <em>Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Connection</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource#getConnection()
   * @see #getConnectionErrorSource()
   * @generated
   */
  EReference getConnectionErrorSource_Connection();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource#isAll <em>All</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource#isAll()
   * @see #getConnectionErrorSource()
   * @generated
   */
  EAttribute getConnectionErrorSource_All();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource#getTypeTokenConstraint <em>Type Token Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Token Constraint</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource#getTypeTokenConstraint()
   * @see #getConnectionErrorSource()
   * @generated
   */
  EReference getConnectionErrorSource_TypeTokenConstraint();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource#getFailureModeType <em>Failure Mode Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Failure Mode Type</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource#getFailureModeType()
   * @see #getConnectionErrorSource()
   * @generated
   */
  EReference getConnectionErrorSource_FailureModeType();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource#getFailureModeDescription <em>Failure Mode Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Failure Mode Description</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource#getFailureModeDescription()
   * @see #getConnectionErrorSource()
   * @generated
   */
  EAttribute getConnectionErrorSource_FailureModeDescription();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConnectionErrorSource#getCondition()
   * @see #getConnectionErrorSource()
   * @generated
   */
  EAttribute getConnectionErrorSource_Condition();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConditionExpression <em>Condition Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Expression</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConditionExpression
   * @generated
   */
  EClass getConditionExpression();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.OrmoreExpression <em>Ormore Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ormore Expression</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OrmoreExpression
   * @generated
   */
  EClass getOrmoreExpression();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.OrmoreExpression#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OrmoreExpression#getCount()
   * @see #getOrmoreExpression()
   * @generated
   */
  EAttribute getOrmoreExpression_Count();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.OrmoreExpression#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OrmoreExpression#getOperands()
   * @see #getOrmoreExpression()
   * @generated
   */
  EReference getOrmoreExpression_Operands();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.OrlessExpression <em>Orless Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Orless Expression</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OrlessExpression
   * @generated
   */
  EClass getOrlessExpression();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.OrlessExpression#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Count</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OrlessExpression#getCount()
   * @see #getOrlessExpression()
   * @generated
   */
  EAttribute getOrlessExpression_Count();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.OrlessExpression#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OrlessExpression#getOperands()
   * @see #getOrlessExpression()
   * @generated
   */
  EReference getOrlessExpression_Operands();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConditionElement <em>Condition Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Element</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConditionElement
   * @generated
   */
  EClass getConditionElement();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConditionElement#getIncoming <em>Incoming</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Incoming</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConditionElement#getIncoming()
   * @see #getConditionElement()
   * @generated
   */
  EReference getConditionElement_Incoming();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConditionElement#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConditionElement#getConstraint()
   * @see #getConditionElement()
   * @generated
   */
  EReference getConditionElement_Constraint();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ConditionElement#getQualifiedState <em>Qualified State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qualified State</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ConditionElement#getQualifiedState()
   * @see #getConditionElement()
   * @generated
   */
  EReference getConditionElement_QualifiedState();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.EventOrPropagation <em>Event Or Propagation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Or Propagation</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.EventOrPropagation
   * @generated
   */
  EClass getEventOrPropagation();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition <em>Outgoing Propagation Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Outgoing Propagation Condition</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition
   * @generated
   */
  EClass getOutgoingPropagationCondition();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#getState()
   * @see #getOutgoingPropagationCondition()
   * @generated
   */
  EReference getOutgoingPropagationCondition_State();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#getTypeTokenConstraint <em>Type Token Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Token Constraint</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#getTypeTokenConstraint()
   * @see #getOutgoingPropagationCondition()
   * @generated
   */
  EReference getOutgoingPropagationCondition_TypeTokenConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#isAllStates <em>All States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All States</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#isAllStates()
   * @see #getOutgoingPropagationCondition()
   * @generated
   */
  EAttribute getOutgoingPropagationCondition_AllStates();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#getCondition()
   * @see #getOutgoingPropagationCondition()
   * @generated
   */
  EReference getOutgoingPropagationCondition_Condition();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Outgoing</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#getOutgoing()
   * @see #getOutgoingPropagationCondition()
   * @generated
   */
  EReference getOutgoingPropagationCondition_Outgoing();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#isAllPropagations <em>All Propagations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Propagations</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#isAllPropagations()
   * @see #getOutgoingPropagationCondition()
   * @generated
   */
  EAttribute getOutgoingPropagationCondition_AllPropagations();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#getTypeToken <em>Type Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Token</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OutgoingPropagationCondition#getTypeToken()
   * @see #getOutgoingPropagationCondition()
   * @generated
   */
  EReference getOutgoingPropagationCondition_TypeToken();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection <em>Error Detection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Detection</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection
   * @generated
   */
  EClass getErrorDetection();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection#getState()
   * @see #getErrorDetection()
   * @generated
   */
  EReference getErrorDetection_State();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection#getTypeTokenConstraint <em>Type Token Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Token Constraint</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection#getTypeTokenConstraint()
   * @see #getErrorDetection()
   * @generated
   */
  EReference getErrorDetection_TypeTokenConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection#isAllStates <em>All States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All States</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection#isAllStates()
   * @see #getErrorDetection()
   * @generated
   */
  EAttribute getErrorDetection_AllStates();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection#getCondition()
   * @see #getErrorDetection()
   * @generated
   */
  EReference getErrorDetection_Condition();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection#getDetectionReportingPort <em>Detection Reporting Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Detection Reporting Port</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection#getDetectionReportingPort()
   * @see #getErrorDetection()
   * @generated
   */
  EReference getErrorDetection_DetectionReportingPort();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection#getErrorCode <em>Error Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Error Code</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorDetection#getErrorCode()
   * @see #getErrorDetection()
   * @generated
   */
  EReference getErrorDetection_ErrorCode();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorCodeValue <em>Error Code Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Code Value</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorCodeValue
   * @generated
   */
  EClass getErrorCodeValue();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorCodeValue#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorCodeValue#getIntValue()
   * @see #getErrorCodeValue()
   * @generated
   */
  EAttribute getErrorCodeValue_IntValue();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorCodeValue#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Constant</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorCodeValue#getConstant()
   * @see #getErrorCodeValue()
   * @generated
   */
  EReference getErrorCodeValue_Constant();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorCodeValue#getEnumLiteral <em>Enum Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Enum Literal</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorCodeValue#getEnumLiteral()
   * @see #getErrorCodeValue()
   * @generated
   */
  EAttribute getErrorCodeValue_EnumLiteral();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorStateToModeMapping <em>Error State To Mode Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error State To Mode Mapping</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorStateToModeMapping
   * @generated
   */
  EClass getErrorStateToModeMapping();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorStateToModeMapping#getErrorState <em>Error State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Error State</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorStateToModeMapping#getErrorState()
   * @see #getErrorStateToModeMapping()
   * @generated
   */
  EReference getErrorStateToModeMapping_ErrorState();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorStateToModeMapping#getTypeToken <em>Type Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Token</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorStateToModeMapping#getTypeToken()
   * @see #getErrorStateToModeMapping()
   * @generated
   */
  EReference getErrorStateToModeMapping_TypeToken();

  /**
   * Returns the meta object for the reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.ErrorStateToModeMapping#getMappedModes <em>Mapped Modes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Mapped Modes</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.ErrorStateToModeMapping#getMappedModes()
   * @see #getErrorStateToModeMapping()
   * @generated
   */
  EReference getErrorStateToModeMapping_MappedModes();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.CompositeState <em>Composite State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite State</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.CompositeState
   * @generated
   */
  EClass getCompositeState();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.CompositeState#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.CompositeState#getCondition()
   * @see #getCompositeState()
   * @generated
   */
  EReference getCompositeState_Condition();

  /**
   * Returns the meta object for the attribute '{@link org.osate.xtext.aadl2.errormodel.errorModel.CompositeState#isOthers <em>Others</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Others</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.CompositeState#isOthers()
   * @see #getCompositeState()
   * @generated
   */
  EAttribute getCompositeState_Others();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.CompositeState#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.CompositeState#getState()
   * @see #getCompositeState()
   * @generated
   */
  EReference getCompositeState_State();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.CompositeState#getTypedToken <em>Typed Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Typed Token</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.CompositeState#getTypedToken()
   * @see #getCompositeState()
   * @generated
   */
  EReference getCompositeState_TypedToken();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.QualifiedErrorBehaviorState <em>Qualified Error Behavior State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Error Behavior State</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.QualifiedErrorBehaviorState
   * @generated
   */
  EClass getQualifiedErrorBehaviorState();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.QualifiedErrorBehaviorState#getSubcomponent <em>Subcomponent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subcomponent</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.QualifiedErrorBehaviorState#getSubcomponent()
   * @see #getQualifiedErrorBehaviorState()
   * @generated
   */
  EReference getQualifiedErrorBehaviorState_Subcomponent();

  /**
   * Returns the meta object for the containment reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.QualifiedErrorBehaviorState#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Next</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.QualifiedErrorBehaviorState#getNext()
   * @see #getQualifiedErrorBehaviorState()
   * @generated
   */
  EReference getQualifiedErrorBehaviorState_Next();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.QualifiedErrorBehaviorState#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.QualifiedErrorBehaviorState#getState()
   * @see #getQualifiedErrorBehaviorState()
   * @generated
   */
  EReference getQualifiedErrorBehaviorState_State();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.SubcomponentElement <em>Subcomponent Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subcomponent Element</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.SubcomponentElement
   * @generated
   */
  EClass getSubcomponentElement();

  /**
   * Returns the meta object for the reference '{@link org.osate.xtext.aadl2.errormodel.errorModel.SubcomponentElement#getSubcomponent <em>Subcomponent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Subcomponent</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.SubcomponentElement#getSubcomponent()
   * @see #getSubcomponentElement()
   * @generated
   */
  EReference getSubcomponentElement_Subcomponent();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.OrExpression#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.OrExpression#getOperands()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Operands();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.AndExpression#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.AndExpression#getOperands()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Operands();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.SOrExpression <em>SOr Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SOr Expression</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.SOrExpression
   * @generated
   */
  EClass getSOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.SOrExpression#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.SOrExpression#getOperands()
   * @see #getSOrExpression()
   * @generated
   */
  EReference getSOrExpression_Operands();

  /**
   * Returns the meta object for class '{@link org.osate.xtext.aadl2.errormodel.errorModel.SAndExpression <em>SAnd Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SAnd Expression</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.SAndExpression
   * @generated
   */
  EClass getSAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.osate.xtext.aadl2.errormodel.errorModel.SAndExpression#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see org.osate.xtext.aadl2.errormodel.errorModel.SAndExpression#getOperands()
   * @see #getSAndExpression()
   * @generated
   */
  EReference getSAndExpression_Operands();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ErrorModelFactory getErrorModelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelLibraryImpl <em>Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelLibraryImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorModelLibrary()
     * @generated
     */
    EClass ERROR_MODEL_LIBRARY = eINSTANCE.getErrorModelLibrary();

    /**
     * The meta object literal for the '<em><b>Use Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_LIBRARY__USE_TYPES = eINSTANCE.getErrorModelLibrary_UseTypes();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_LIBRARY__EXTENDS = eINSTANCE.getErrorModelLibrary_Extends();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_LIBRARY__TYPES = eINSTANCE.getErrorModelLibrary_Types();

    /**
     * The meta object literal for the '<em><b>Typesets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_LIBRARY__TYPESETS = eINSTANCE.getErrorModelLibrary_Typesets();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_LIBRARY__PROPERTIES = eINSTANCE.getErrorModelLibrary_Properties();

    /**
     * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_LIBRARY__BEHAVIORS = eINSTANCE.getErrorModelLibrary_Behaviors();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_LIBRARY__MAPPINGS = eINSTANCE.getErrorModelLibrary_Mappings();

    /**
     * The meta object literal for the '<em><b>Transformations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_LIBRARY__TRANSFORMATIONS = eINSTANCE.getErrorModelLibrary_Transformations();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelSubclauseImpl <em>Subclause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelSubclauseImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorModelSubclause()
     * @generated
     */
    EClass ERROR_MODEL_SUBCLAUSE = eINSTANCE.getErrorModelSubclause();

    /**
     * The meta object literal for the '<em><b>Use Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__USE_TYPES = eINSTANCE.getErrorModelSubclause_UseTypes();

    /**
     * The meta object literal for the '<em><b>Type Equivalence</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__TYPE_EQUIVALENCE = eINSTANCE.getErrorModelSubclause_TypeEquivalence();

    /**
     * The meta object literal for the '<em><b>Type Mapping Set</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__TYPE_MAPPING_SET = eINSTANCE.getErrorModelSubclause_TypeMappingSet();

    /**
     * The meta object literal for the '<em><b>Use Behavior</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__USE_BEHAVIOR = eINSTANCE.getErrorModelSubclause_UseBehavior();

    /**
     * The meta object literal for the '<em><b>Propagations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__PROPAGATIONS = eINSTANCE.getErrorModelSubclause_Propagations();

    /**
     * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__FLOWS = eINSTANCE.getErrorModelSubclause_Flows();

    /**
     * The meta object literal for the '<em><b>Use Transformation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__USE_TRANSFORMATION = eINSTANCE.getErrorModelSubclause_UseTransformation();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__EVENTS = eINSTANCE.getErrorModelSubclause_Events();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__TRANSITIONS = eINSTANCE.getErrorModelSubclause_Transitions();

    /**
     * The meta object literal for the '<em><b>Outgoing Propagation Conditions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__OUTGOING_PROPAGATION_CONDITIONS = eINSTANCE.getErrorModelSubclause_OutgoingPropagationConditions();

    /**
     * The meta object literal for the '<em><b>Error Detections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__ERROR_DETECTIONS = eINSTANCE.getErrorModelSubclause_ErrorDetections();

    /**
     * The meta object literal for the '<em><b>Error State To Mode Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__ERROR_STATE_TO_MODE_MAPPINGS = eINSTANCE.getErrorModelSubclause_ErrorStateToModeMappings();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__STATES = eINSTANCE.getErrorModelSubclause_States();

    /**
     * The meta object literal for the '<em><b>Type Transformation Set</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__TYPE_TRANSFORMATION_SET = eINSTANCE.getErrorModelSubclause_TypeTransformationSet();

    /**
     * The meta object literal for the '<em><b>Connection Error Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__CONNECTION_ERROR_SOURCES = eINSTANCE.getErrorModelSubclause_ConnectionErrorSources();

    /**
     * The meta object literal for the '<em><b>Points</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__POINTS = eINSTANCE.getErrorModelSubclause_Points();

    /**
     * The meta object literal for the '<em><b>Paths</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__PATHS = eINSTANCE.getErrorModelSubclause_Paths();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_MODEL_SUBCLAUSE__PROPERTIES = eINSTANCE.getErrorModelSubclause_Properties();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorTypesImpl <em>Error Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorTypesImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorTypes()
     * @generated
     */
    EClass ERROR_TYPES = eINSTANCE.getErrorTypes();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorTypeImpl <em>Error Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorTypeImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorType()
     * @generated
     */
    EClass ERROR_TYPE = eINSTANCE.getErrorType();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_TYPE__SUPER_TYPE = eINSTANCE.getErrorType_SuperType();

    /**
     * The meta object literal for the '<em><b>Aliased Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_TYPE__ALIASED_TYPE = eINSTANCE.getErrorType_AliasedType();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeSetImpl <em>Type Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeSetImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTypeSet()
     * @generated
     */
    EClass TYPE_SET = eINSTANCE.getTypeSet();

    /**
     * The meta object literal for the '<em><b>Type Tokens</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_SET__TYPE_TOKENS = eINSTANCE.getTypeSet_TypeTokens();

    /**
     * The meta object literal for the '<em><b>Aliased Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_SET__ALIASED_TYPE = eINSTANCE.getTypeSet_AliasedType();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeTokenImpl <em>Type Token</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeTokenImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTypeToken()
     * @generated
     */
    EClass TYPE_TOKEN = eINSTANCE.getTypeToken();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_TOKEN__TYPE = eINSTANCE.getTypeToken_Type();

    /**
     * The meta object literal for the '<em><b>No Error</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TOKEN__NO_ERROR = eINSTANCE.getTypeToken_NoError();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeTransformationSetImpl <em>Type Transformation Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeTransformationSetImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTypeTransformationSet()
     * @generated
     */
    EClass TYPE_TRANSFORMATION_SET = eINSTANCE.getTypeTransformationSet();

    /**
     * The meta object literal for the '<em><b>Use Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_TRANSFORMATION_SET__USE_TYPES = eINSTANCE.getTypeTransformationSet_UseTypes();

    /**
     * The meta object literal for the '<em><b>Transformation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_TRANSFORMATION_SET__TRANSFORMATION = eINSTANCE.getTypeTransformationSet_Transformation();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeTransformationImpl <em>Type Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeTransformationImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTypeTransformation()
     * @generated
     */
    EClass TYPE_TRANSFORMATION = eINSTANCE.getTypeTransformation();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_TRANSFORMATION__SOURCE = eINSTANCE.getTypeTransformation_Source();

    /**
     * The meta object literal for the '<em><b>All Sources</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TRANSFORMATION__ALL_SOURCES = eINSTANCE.getTypeTransformation_AllSources();

    /**
     * The meta object literal for the '<em><b>Contributor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_TRANSFORMATION__CONTRIBUTOR = eINSTANCE.getTypeTransformation_Contributor();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_TRANSFORMATION__TARGET = eINSTANCE.getTypeTransformation_Target();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeMappingSetImpl <em>Type Mapping Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeMappingSetImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTypeMappingSet()
     * @generated
     */
    EClass TYPE_MAPPING_SET = eINSTANCE.getTypeMappingSet();

    /**
     * The meta object literal for the '<em><b>Use Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_MAPPING_SET__USE_TYPES = eINSTANCE.getTypeMappingSet_UseTypes();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_MAPPING_SET__MAPPING = eINSTANCE.getTypeMappingSet_Mapping();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeMappingImpl <em>Type Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TypeMappingImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTypeMapping()
     * @generated
     */
    EClass TYPE_MAPPING = eINSTANCE.getTypeMapping();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_MAPPING__SOURCE = eINSTANCE.getTypeMapping_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_MAPPING__TARGET = eINSTANCE.getTypeMapping_Target();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorPropagationImpl <em>Error Propagation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorPropagationImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorPropagation()
     * @generated
     */
    EClass ERROR_PROPAGATION = eINSTANCE.getErrorPropagation();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_PROPAGATION__KIND = eINSTANCE.getErrorPropagation_Kind();

    /**
     * The meta object literal for the '<em><b>Featureor PP Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_PROPAGATION__FEATUREOR_PP_REF = eINSTANCE.getErrorPropagation_FeatureorPPRef();

    /**
     * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_PROPAGATION__NOT = eINSTANCE.getErrorPropagation_Not();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_PROPAGATION__DIRECTION = eINSTANCE.getErrorPropagation_Direction();

    /**
     * The meta object literal for the '<em><b>Type Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_PROPAGATION__TYPE_SET = eINSTANCE.getErrorPropagation_TypeSet();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.FeatureorPPReferenceImpl <em>Featureor PP Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.FeatureorPPReferenceImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getFeatureorPPReference()
     * @generated
     */
    EClass FEATUREOR_PP_REFERENCE = eINSTANCE.getFeatureorPPReference();

    /**
     * The meta object literal for the '<em><b>Featureor PP</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATUREOR_PP_REFERENCE__FEATUREOR_PP = eINSTANCE.getFeatureorPPReference_FeatureorPP();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATUREOR_PP_REFERENCE__NEXT = eINSTANCE.getFeatureorPPReference_Next();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorFlowImpl <em>Error Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorFlowImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorFlow()
     * @generated
     */
    EClass ERROR_FLOW = eINSTANCE.getErrorFlow();

    /**
     * The meta object literal for the '<em><b>Type Token Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_FLOW__TYPE_TOKEN_CONSTRAINT = eINSTANCE.getErrorFlow_TypeTokenConstraint();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorSourceImpl <em>Error Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorSourceImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorSource()
     * @generated
     */
    EClass ERROR_SOURCE = eINSTANCE.getErrorSource();

    /**
     * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_SOURCE__OUTGOING = eINSTANCE.getErrorSource_Outgoing();

    /**
     * The meta object literal for the '<em><b>All Outgoing</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_SOURCE__ALL_OUTGOING = eINSTANCE.getErrorSource_AllOutgoing();

    /**
     * The meta object literal for the '<em><b>Failure Mode Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_SOURCE__FAILURE_MODE_REFERENCE = eINSTANCE.getErrorSource_FailureModeReference();

    /**
     * The meta object literal for the '<em><b>Failure Mode Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_SOURCE__FAILURE_MODE_TYPE = eINSTANCE.getErrorSource_FailureModeType();

    /**
     * The meta object literal for the '<em><b>Failure Mode Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_SOURCE__FAILURE_MODE_DESCRIPTION = eINSTANCE.getErrorSource_FailureModeDescription();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_SOURCE__CONDITION = eINSTANCE.getErrorSource_Condition();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorStateOrTypeSetImpl <em>Error Behavior State Or Type Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorStateOrTypeSetImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorBehaviorStateOrTypeSet()
     * @generated
     */
    EClass ERROR_BEHAVIOR_STATE_OR_TYPE_SET = eINSTANCE.getErrorBehaviorStateOrTypeSet();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorSinkImpl <em>Error Sink</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorSinkImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorSink()
     * @generated
     */
    EClass ERROR_SINK = eINSTANCE.getErrorSink();

    /**
     * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_SINK__INCOMING = eINSTANCE.getErrorSink_Incoming();

    /**
     * The meta object literal for the '<em><b>All Incoming</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_SINK__ALL_INCOMING = eINSTANCE.getErrorSink_AllIncoming();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorPathImpl <em>Error Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorPathImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorPath()
     * @generated
     */
    EClass ERROR_PATH = eINSTANCE.getErrorPath();

    /**
     * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_PATH__INCOMING = eINSTANCE.getErrorPath_Incoming();

    /**
     * The meta object literal for the '<em><b>All Incoming</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_PATH__ALL_INCOMING = eINSTANCE.getErrorPath_AllIncoming();

    /**
     * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_PATH__OUTGOING = eINSTANCE.getErrorPath_Outgoing();

    /**
     * The meta object literal for the '<em><b>All Outgoing</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_PATH__ALL_OUTGOING = eINSTANCE.getErrorPath_AllOutgoing();

    /**
     * The meta object literal for the '<em><b>Target Token</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_PATH__TARGET_TOKEN = eINSTANCE.getErrorPath_TargetToken();

    /**
     * The meta object literal for the '<em><b>Type Mapping Set</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_PATH__TYPE_MAPPING_SET = eINSTANCE.getErrorPath_TypeMappingSet();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.PropagationPointImpl <em>Propagation Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.PropagationPointImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getPropagationPoint()
     * @generated
     */
    EClass PROPAGATION_POINT = eINSTANCE.getPropagationPoint();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.PropagationPathImpl <em>Propagation Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.PropagationPathImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getPropagationPath()
     * @generated
     */
    EClass PROPAGATION_PATH = eINSTANCE.getPropagationPath();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPAGATION_PATH__SOURCE = eINSTANCE.getPropagationPath_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPAGATION_PATH__TARGET = eINSTANCE.getPropagationPath_Target();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.QualifiedPropagationPointImpl <em>Qualified Propagation Point</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.QualifiedPropagationPointImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getQualifiedPropagationPoint()
     * @generated
     */
    EClass QUALIFIED_PROPAGATION_POINT = eINSTANCE.getQualifiedPropagationPoint();

    /**
     * The meta object literal for the '<em><b>Subcomponent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_PROPAGATION_POINT__SUBCOMPONENT = eINSTANCE.getQualifiedPropagationPoint_Subcomponent();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_PROPAGATION_POINT__NEXT = eINSTANCE.getQualifiedPropagationPoint_Next();

    /**
     * The meta object literal for the '<em><b>Propagation Point</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_PROPAGATION_POINT__PROPAGATION_POINT = eINSTANCE.getQualifiedPropagationPoint_PropagationPoint();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorStateMachineImpl <em>Error Behavior State Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorStateMachineImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorBehaviorStateMachine()
     * @generated
     */
    EClass ERROR_BEHAVIOR_STATE_MACHINE = eINSTANCE.getErrorBehaviorStateMachine();

    /**
     * The meta object literal for the '<em><b>Use Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_BEHAVIOR_STATE_MACHINE__USE_TYPES = eINSTANCE.getErrorBehaviorStateMachine_UseTypes();

    /**
     * The meta object literal for the '<em><b>Use Transformation</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_BEHAVIOR_STATE_MACHINE__USE_TRANSFORMATION = eINSTANCE.getErrorBehaviorStateMachine_UseTransformation();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_BEHAVIOR_STATE_MACHINE__EVENTS = eINSTANCE.getErrorBehaviorStateMachine_Events();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_BEHAVIOR_STATE_MACHINE__STATES = eINSTANCE.getErrorBehaviorStateMachine_States();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_BEHAVIOR_STATE_MACHINE__TRANSITIONS = eINSTANCE.getErrorBehaviorStateMachine_Transitions();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_BEHAVIOR_STATE_MACHINE__PROPERTIES = eINSTANCE.getErrorBehaviorStateMachine_Properties();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorEventImpl <em>Error Behavior Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorEventImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorBehaviorEvent()
     * @generated
     */
    EClass ERROR_BEHAVIOR_EVENT = eINSTANCE.getErrorBehaviorEvent();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorEventImpl <em>Error Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorEventImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorEvent()
     * @generated
     */
    EClass ERROR_EVENT = eINSTANCE.getErrorEvent();

    /**
     * The meta object literal for the '<em><b>Type Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_EVENT__TYPE_SET = eINSTANCE.getErrorEvent_TypeSet();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_EVENT__CONDITION = eINSTANCE.getErrorEvent_Condition();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.RepairEventImpl <em>Repair Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.RepairEventImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getRepairEvent()
     * @generated
     */
    EClass REPAIR_EVENT = eINSTANCE.getRepairEvent();

    /**
     * The meta object literal for the '<em><b>Event Initiator</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPAIR_EVENT__EVENT_INITIATOR = eINSTANCE.getRepairEvent_EventInitiator();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.RecoverEventImpl <em>Recover Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.RecoverEventImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getRecoverEvent()
     * @generated
     */
    EClass RECOVER_EVENT = eINSTANCE.getRecoverEvent();

    /**
     * The meta object literal for the '<em><b>Event Initiator</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECOVER_EVENT__EVENT_INITIATOR = eINSTANCE.getRecoverEvent_EventInitiator();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECOVER_EVENT__CONDITION = eINSTANCE.getRecoverEvent_Condition();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorStateImpl <em>Error Behavior State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorStateImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorBehaviorState()
     * @generated
     */
    EClass ERROR_BEHAVIOR_STATE = eINSTANCE.getErrorBehaviorState();

    /**
     * The meta object literal for the '<em><b>Intial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_BEHAVIOR_STATE__INTIAL = eINSTANCE.getErrorBehaviorState_Intial();

    /**
     * The meta object literal for the '<em><b>Type Set</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_BEHAVIOR_STATE__TYPE_SET = eINSTANCE.getErrorBehaviorState_TypeSet();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorTransitionImpl <em>Error Behavior Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorBehaviorTransitionImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorBehaviorTransition()
     * @generated
     */
    EClass ERROR_BEHAVIOR_TRANSITION = eINSTANCE.getErrorBehaviorTransition();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_BEHAVIOR_TRANSITION__SOURCE = eINSTANCE.getErrorBehaviorTransition_Source();

    /**
     * The meta object literal for the '<em><b>Type Token Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_BEHAVIOR_TRANSITION__TYPE_TOKEN_CONSTRAINT = eINSTANCE.getErrorBehaviorTransition_TypeTokenConstraint();

    /**
     * The meta object literal for the '<em><b>All States</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_BEHAVIOR_TRANSITION__ALL_STATES = eINSTANCE.getErrorBehaviorTransition_AllStates();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_BEHAVIOR_TRANSITION__CONDITION = eINSTANCE.getErrorBehaviorTransition_Condition();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_BEHAVIOR_TRANSITION__TARGET = eINSTANCE.getErrorBehaviorTransition_Target();

    /**
     * The meta object literal for the '<em><b>Target Token</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_BEHAVIOR_TRANSITION__TARGET_TOKEN = eINSTANCE.getErrorBehaviorTransition_TargetToken();

    /**
     * The meta object literal for the '<em><b>Steady State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_BEHAVIOR_TRANSITION__STEADY_STATE = eINSTANCE.getErrorBehaviorTransition_SteadyState();

    /**
     * The meta object literal for the '<em><b>Destination Branches</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_BEHAVIOR_TRANSITION__DESTINATION_BRANCHES = eINSTANCE.getErrorBehaviorTransition_DestinationBranches();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.TransitionBranchImpl <em>Transition Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.TransitionBranchImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getTransitionBranch()
     * @generated
     */
    EClass TRANSITION_BRANCH = eINSTANCE.getTransitionBranch();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_BRANCH__TARGET = eINSTANCE.getTransitionBranch_Target();

    /**
     * The meta object literal for the '<em><b>Target Token</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_BRANCH__TARGET_TOKEN = eINSTANCE.getTransitionBranch_TargetToken();

    /**
     * The meta object literal for the '<em><b>Steady State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_BRANCH__STEADY_STATE = eINSTANCE.getTransitionBranch_SteadyState();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_BRANCH__VALUE = eINSTANCE.getTransitionBranch_Value();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.BranchValueImpl <em>Branch Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.BranchValueImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getBranchValue()
     * @generated
     */
    EClass BRANCH_VALUE = eINSTANCE.getBranchValue();

    /**
     * The meta object literal for the '<em><b>Realvalue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRANCH_VALUE__REALVALUE = eINSTANCE.getBranchValue_Realvalue();

    /**
     * The meta object literal for the '<em><b>Symboliclabel</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH_VALUE__SYMBOLICLABEL = eINSTANCE.getBranchValue_Symboliclabel();

    /**
     * The meta object literal for the '<em><b>Others</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRANCH_VALUE__OTHERS = eINSTANCE.getBranchValue_Others();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ConnectionErrorSourceImpl <em>Connection Error Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ConnectionErrorSourceImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getConnectionErrorSource()
     * @generated
     */
    EClass CONNECTION_ERROR_SOURCE = eINSTANCE.getConnectionErrorSource();

    /**
     * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_ERROR_SOURCE__CONNECTION = eINSTANCE.getConnectionErrorSource_Connection();

    /**
     * The meta object literal for the '<em><b>All</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTION_ERROR_SOURCE__ALL = eINSTANCE.getConnectionErrorSource_All();

    /**
     * The meta object literal for the '<em><b>Type Token Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_ERROR_SOURCE__TYPE_TOKEN_CONSTRAINT = eINSTANCE.getConnectionErrorSource_TypeTokenConstraint();

    /**
     * The meta object literal for the '<em><b>Failure Mode Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTION_ERROR_SOURCE__FAILURE_MODE_TYPE = eINSTANCE.getConnectionErrorSource_FailureModeType();

    /**
     * The meta object literal for the '<em><b>Failure Mode Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTION_ERROR_SOURCE__FAILURE_MODE_DESCRIPTION = eINSTANCE.getConnectionErrorSource_FailureModeDescription();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONNECTION_ERROR_SOURCE__CONDITION = eINSTANCE.getConnectionErrorSource_Condition();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ConditionExpressionImpl <em>Condition Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ConditionExpressionImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getConditionExpression()
     * @generated
     */
    EClass CONDITION_EXPRESSION = eINSTANCE.getConditionExpression();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.OrmoreExpressionImpl <em>Ormore Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.OrmoreExpressionImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getOrmoreExpression()
     * @generated
     */
    EClass ORMORE_EXPRESSION = eINSTANCE.getOrmoreExpression();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORMORE_EXPRESSION__COUNT = eINSTANCE.getOrmoreExpression_Count();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORMORE_EXPRESSION__OPERANDS = eINSTANCE.getOrmoreExpression_Operands();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.OrlessExpressionImpl <em>Orless Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.OrlessExpressionImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getOrlessExpression()
     * @generated
     */
    EClass ORLESS_EXPRESSION = eINSTANCE.getOrlessExpression();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORLESS_EXPRESSION__COUNT = eINSTANCE.getOrlessExpression_Count();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORLESS_EXPRESSION__OPERANDS = eINSTANCE.getOrlessExpression_Operands();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ConditionElementImpl <em>Condition Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ConditionElementImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getConditionElement()
     * @generated
     */
    EClass CONDITION_ELEMENT = eINSTANCE.getConditionElement();

    /**
     * The meta object literal for the '<em><b>Incoming</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_ELEMENT__INCOMING = eINSTANCE.getConditionElement_Incoming();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_ELEMENT__CONSTRAINT = eINSTANCE.getConditionElement_Constraint();

    /**
     * The meta object literal for the '<em><b>Qualified State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_ELEMENT__QUALIFIED_STATE = eINSTANCE.getConditionElement_QualifiedState();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.EventOrPropagationImpl <em>Event Or Propagation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.EventOrPropagationImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getEventOrPropagation()
     * @generated
     */
    EClass EVENT_OR_PROPAGATION = eINSTANCE.getEventOrPropagation();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.OutgoingPropagationConditionImpl <em>Outgoing Propagation Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.OutgoingPropagationConditionImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getOutgoingPropagationCondition()
     * @generated
     */
    EClass OUTGOING_PROPAGATION_CONDITION = eINSTANCE.getOutgoingPropagationCondition();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTGOING_PROPAGATION_CONDITION__STATE = eINSTANCE.getOutgoingPropagationCondition_State();

    /**
     * The meta object literal for the '<em><b>Type Token Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN_CONSTRAINT = eINSTANCE.getOutgoingPropagationCondition_TypeTokenConstraint();

    /**
     * The meta object literal for the '<em><b>All States</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTGOING_PROPAGATION_CONDITION__ALL_STATES = eINSTANCE.getOutgoingPropagationCondition_AllStates();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTGOING_PROPAGATION_CONDITION__CONDITION = eINSTANCE.getOutgoingPropagationCondition_Condition();

    /**
     * The meta object literal for the '<em><b>Outgoing</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTGOING_PROPAGATION_CONDITION__OUTGOING = eINSTANCE.getOutgoingPropagationCondition_Outgoing();

    /**
     * The meta object literal for the '<em><b>All Propagations</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTGOING_PROPAGATION_CONDITION__ALL_PROPAGATIONS = eINSTANCE.getOutgoingPropagationCondition_AllPropagations();

    /**
     * The meta object literal for the '<em><b>Type Token</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTGOING_PROPAGATION_CONDITION__TYPE_TOKEN = eINSTANCE.getOutgoingPropagationCondition_TypeToken();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorDetectionImpl <em>Error Detection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorDetectionImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorDetection()
     * @generated
     */
    EClass ERROR_DETECTION = eINSTANCE.getErrorDetection();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_DETECTION__STATE = eINSTANCE.getErrorDetection_State();

    /**
     * The meta object literal for the '<em><b>Type Token Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_DETECTION__TYPE_TOKEN_CONSTRAINT = eINSTANCE.getErrorDetection_TypeTokenConstraint();

    /**
     * The meta object literal for the '<em><b>All States</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_DETECTION__ALL_STATES = eINSTANCE.getErrorDetection_AllStates();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_DETECTION__CONDITION = eINSTANCE.getErrorDetection_Condition();

    /**
     * The meta object literal for the '<em><b>Detection Reporting Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_DETECTION__DETECTION_REPORTING_PORT = eINSTANCE.getErrorDetection_DetectionReportingPort();

    /**
     * The meta object literal for the '<em><b>Error Code</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_DETECTION__ERROR_CODE = eINSTANCE.getErrorDetection_ErrorCode();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorCodeValueImpl <em>Error Code Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorCodeValueImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorCodeValue()
     * @generated
     */
    EClass ERROR_CODE_VALUE = eINSTANCE.getErrorCodeValue();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_CODE_VALUE__INT_VALUE = eINSTANCE.getErrorCodeValue_IntValue();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_CODE_VALUE__CONSTANT = eINSTANCE.getErrorCodeValue_Constant();

    /**
     * The meta object literal for the '<em><b>Enum Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_CODE_VALUE__ENUM_LITERAL = eINSTANCE.getErrorCodeValue_EnumLiteral();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorStateToModeMappingImpl <em>Error State To Mode Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorStateToModeMappingImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getErrorStateToModeMapping()
     * @generated
     */
    EClass ERROR_STATE_TO_MODE_MAPPING = eINSTANCE.getErrorStateToModeMapping();

    /**
     * The meta object literal for the '<em><b>Error State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_STATE_TO_MODE_MAPPING__ERROR_STATE = eINSTANCE.getErrorStateToModeMapping_ErrorState();

    /**
     * The meta object literal for the '<em><b>Type Token</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_STATE_TO_MODE_MAPPING__TYPE_TOKEN = eINSTANCE.getErrorStateToModeMapping_TypeToken();

    /**
     * The meta object literal for the '<em><b>Mapped Modes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_STATE_TO_MODE_MAPPING__MAPPED_MODES = eINSTANCE.getErrorStateToModeMapping_MappedModes();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.CompositeStateImpl <em>Composite State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.CompositeStateImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getCompositeState()
     * @generated
     */
    EClass COMPOSITE_STATE = eINSTANCE.getCompositeState();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_STATE__CONDITION = eINSTANCE.getCompositeState_Condition();

    /**
     * The meta object literal for the '<em><b>Others</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOSITE_STATE__OTHERS = eINSTANCE.getCompositeState_Others();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_STATE__STATE = eINSTANCE.getCompositeState_State();

    /**
     * The meta object literal for the '<em><b>Typed Token</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_STATE__TYPED_TOKEN = eINSTANCE.getCompositeState_TypedToken();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.QualifiedErrorBehaviorStateImpl <em>Qualified Error Behavior State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.QualifiedErrorBehaviorStateImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getQualifiedErrorBehaviorState()
     * @generated
     */
    EClass QUALIFIED_ERROR_BEHAVIOR_STATE = eINSTANCE.getQualifiedErrorBehaviorState();

    /**
     * The meta object literal for the '<em><b>Subcomponent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_ERROR_BEHAVIOR_STATE__SUBCOMPONENT = eINSTANCE.getQualifiedErrorBehaviorState_Subcomponent();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_ERROR_BEHAVIOR_STATE__NEXT = eINSTANCE.getQualifiedErrorBehaviorState_Next();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUALIFIED_ERROR_BEHAVIOR_STATE__STATE = eINSTANCE.getQualifiedErrorBehaviorState_State();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.SubcomponentElementImpl <em>Subcomponent Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.SubcomponentElementImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getSubcomponentElement()
     * @generated
     */
    EClass SUBCOMPONENT_ELEMENT = eINSTANCE.getSubcomponentElement();

    /**
     * The meta object literal for the '<em><b>Subcomponent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBCOMPONENT_ELEMENT__SUBCOMPONENT = eINSTANCE.getSubcomponentElement_Subcomponent();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.OrExpressionImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__OPERANDS = eINSTANCE.getOrExpression_Operands();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.AndExpressionImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__OPERANDS = eINSTANCE.getAndExpression_Operands();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.SOrExpressionImpl <em>SOr Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.SOrExpressionImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getSOrExpression()
     * @generated
     */
    EClass SOR_EXPRESSION = eINSTANCE.getSOrExpression();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SOR_EXPRESSION__OPERANDS = eINSTANCE.getSOrExpression_Operands();

    /**
     * The meta object literal for the '{@link org.osate.xtext.aadl2.errormodel.errorModel.impl.SAndExpressionImpl <em>SAnd Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.SAndExpressionImpl
     * @see org.osate.xtext.aadl2.errormodel.errorModel.impl.ErrorModelPackageImpl#getSAndExpression()
     * @generated
     */
    EClass SAND_EXPRESSION = eINSTANCE.getSAndExpression();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SAND_EXPRESSION__OPERANDS = eINSTANCE.getSAndExpression_Operands();

  }

} //ErrorModelPackage
