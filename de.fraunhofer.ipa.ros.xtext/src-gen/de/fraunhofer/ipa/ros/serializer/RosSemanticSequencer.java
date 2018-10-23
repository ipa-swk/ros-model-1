/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.ros.services.RosGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import ros.ActionClient;
import ros.ActionServer;
import ros.ActionSpec;
import ros.Artifact;
import ros.CatkinPackage;
import ros.ExternalDependency;
import ros.GlobalNamespace;
import ros.MessageDefinition;
import ros.Node;
import ros.PackageDependency;
import ros.PackageSet;
import ros.ParameterAny;
import ros.ParameterAnyType;
import ros.ParameterArrayType;
import ros.ParameterBase64;
import ros.ParameterBase64Type;
import ros.ParameterBoolean;
import ros.ParameterBooleanType;
import ros.ParameterDate;
import ros.ParameterDateType;
import ros.ParameterDouble;
import ros.ParameterDoubleType;
import ros.ParameterInteger;
import ros.ParameterIntegerType;
import ros.ParameterListType;
import ros.ParameterSequence;
import ros.ParameterString;
import ros.ParameterStringType;
import ros.ParameterStruct;
import ros.ParameterStructMember;
import ros.ParameterStructType;
import ros.ParameterStructTypeMember;
import ros.PrivateNamespace;
import ros.Publisher;
import ros.RelativeNamespace;
import ros.RosPackage;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.ServiceSpec;
import ros.Subscriber;
import ros.TopicSpec;

@SuppressWarnings("all")
public class RosSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RosGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RosPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RosPackage.ACTION_CLIENT:
				sequence_ActionClient(context, (ActionClient) semanticObject); 
				return; 
			case RosPackage.ACTION_SERVER:
				sequence_ActionServer(context, (ActionServer) semanticObject); 
				return; 
			case RosPackage.ACTION_SPEC:
				sequence_ActionSpec(context, (ActionSpec) semanticObject); 
				return; 
			case RosPackage.ARTIFACT:
				sequence_Artifact(context, (Artifact) semanticObject); 
				return; 
			case RosPackage.CATKIN_PACKAGE:
				sequence_CatkinPackage(context, (CatkinPackage) semanticObject); 
				return; 
			case RosPackage.EXTERNAL_DEPENDENCY:
				sequence_ExternalDependency(context, (ExternalDependency) semanticObject); 
				return; 
			case RosPackage.GLOBAL_NAMESPACE:
				sequence_GlobalNamespace(context, (GlobalNamespace) semanticObject); 
				return; 
			case RosPackage.MESSAGE_DEFINITION:
				sequence_MessageDefinition(context, (MessageDefinition) semanticObject); 
				return; 
			case RosPackage.NODE:
				sequence_Node(context, (Node) semanticObject); 
				return; 
			case RosPackage.PACKAGE:
				sequence_Package_Impl(context, (ros.Package) semanticObject); 
				return; 
			case RosPackage.PACKAGE_DEPENDENCY:
				sequence_PackageDependency(context, (PackageDependency) semanticObject); 
				return; 
			case RosPackage.PACKAGE_SET:
				sequence_PackageSet(context, (PackageSet) semanticObject); 
				return; 
			case RosPackage.PARAMETER:
				sequence_Parameter(context, (ros.Parameter) semanticObject); 
				return; 
			case RosPackage.PARAMETER_ANY:
				sequence_ParameterAny(context, (ParameterAny) semanticObject); 
				return; 
			case RosPackage.PARAMETER_ANY_TYPE:
				sequence_ParameterAnyType(context, (ParameterAnyType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_ARRAY_TYPE:
				sequence_ParameterArrayType(context, (ParameterArrayType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_BASE64:
				sequence_ParameterBase64(context, (ParameterBase64) semanticObject); 
				return; 
			case RosPackage.PARAMETER_BASE64_TYPE:
				sequence_ParameterBase64Type(context, (ParameterBase64Type) semanticObject); 
				return; 
			case RosPackage.PARAMETER_BOOLEAN:
				sequence_ParameterBoolean(context, (ParameterBoolean) semanticObject); 
				return; 
			case RosPackage.PARAMETER_BOOLEAN_TYPE:
				sequence_ParameterBooleanType(context, (ParameterBooleanType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_DATE:
				sequence_ParameterDate(context, (ParameterDate) semanticObject); 
				return; 
			case RosPackage.PARAMETER_DATE_TYPE:
				sequence_ParameterDateType(context, (ParameterDateType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_DOUBLE:
				sequence_ParameterDouble(context, (ParameterDouble) semanticObject); 
				return; 
			case RosPackage.PARAMETER_DOUBLE_TYPE:
				sequence_ParameterDoubleType(context, (ParameterDoubleType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_INTEGER:
				sequence_ParameterInteger(context, (ParameterInteger) semanticObject); 
				return; 
			case RosPackage.PARAMETER_INTEGER_TYPE:
				sequence_ParameterIntegerType(context, (ParameterIntegerType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_LIST_TYPE:
				sequence_ParameterListType(context, (ParameterListType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_SEQUENCE:
				sequence_ParameterSequence(context, (ParameterSequence) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRING:
				sequence_ParameterString(context, (ParameterString) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRING_TYPE:
				sequence_ParameterStringType(context, (ParameterStringType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRUCT:
				sequence_ParameterStruct(context, (ParameterStruct) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRUCT_MEMBER:
				sequence_ParameterStructMember(context, (ParameterStructMember) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRUCT_TYPE:
				sequence_ParameterStructType(context, (ParameterStructType) semanticObject); 
				return; 
			case RosPackage.PARAMETER_STRUCT_TYPE_MEMBER:
				sequence_ParameterStructTypeMember(context, (ParameterStructTypeMember) semanticObject); 
				return; 
			case RosPackage.PRIVATE_NAMESPACE:
				sequence_PrivateNamespace(context, (PrivateNamespace) semanticObject); 
				return; 
			case RosPackage.PUBLISHER:
				sequence_Publisher(context, (Publisher) semanticObject); 
				return; 
			case RosPackage.RELATIVE_NAMESPACE:
				sequence_RelativeNamespace_Impl(context, (RelativeNamespace) semanticObject); 
				return; 
			case RosPackage.SERVICE_CLIENT:
				sequence_ServiceClient(context, (ServiceClient) semanticObject); 
				return; 
			case RosPackage.SERVICE_SERVER:
				sequence_ServiceServer(context, (ServiceServer) semanticObject); 
				return; 
			case RosPackage.SERVICE_SPEC:
				sequence_ServiceSpec(context, (ServiceSpec) semanticObject); 
				return; 
			case RosPackage.SUBSCRIBER:
				sequence_Subscriber(context, (Subscriber) semanticObject); 
				return; 
			case RosPackage.TOPIC_SPEC:
				sequence_TopicSpec(context, (TopicSpec) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActionClient returns ActionClient
	 *
	 * Constraint:
	 *     (name=EString action=[ActionSpec|EString] namespace=Namespace?)
	 */
	protected void sequence_ActionClient(ISerializationContext context, ActionClient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ActionServer returns ActionServer
	 *
	 * Constraint:
	 *     (name=EString action=[ActionSpec|EString] namespace=Namespace?)
	 */
	protected void sequence_ActionServer(ISerializationContext context, ActionServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecBase returns ActionSpec
	 *     ActionSpec returns ActionSpec
	 *
	 * Constraint:
	 *     (name=EString goal=MessageDefinition? result=MessageDefinition? feedback=MessageDefinition?)
	 */
	protected void sequence_ActionSpec(ISerializationContext context, ActionSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Artifact returns Artifact
	 *
	 * Constraint:
	 *     (name=EString node=Node?)
	 */
	protected void sequence_Artifact(ISerializationContext context, Artifact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Package returns CatkinPackage
	 *     CatkinPackage returns CatkinPackage
	 *
	 * Constraint:
	 *     (name=EString (spec+=SpecBase spec+=SpecBase*)? (artifact+=Artifact artifact+=Artifact*)? (dependency+=Dependency dependency+=Dependency*)?)
	 */
	protected void sequence_CatkinPackage(ISerializationContext context, CatkinPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dependency returns ExternalDependency
	 *     ExternalDependency returns ExternalDependency
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_ExternalDependency(ISerializationContext context, ExternalDependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.EXTERNAL_DEPENDENCY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.EXTERNAL_DEPENDENCY__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExternalDependencyAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns GlobalNamespace
	 *     GlobalNamespace returns GlobalNamespace
	 *
	 * Constraint:
	 *     (parts+=GraphName parts+=GraphName*)?
	 */
	protected void sequence_GlobalNamespace(ISerializationContext context, GlobalNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MessageDefinition returns MessageDefinition
	 *
	 * Constraint:
	 *     {MessageDefinition}
	 */
	protected void sequence_MessageDefinition(ISerializationContext context, MessageDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Node returns Node
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (serviceserver+=ServiceServer serviceserver+=ServiceServer*)? 
	 *         (publisher+=Publisher publisher+=Publisher*)? 
	 *         (subscriber+=Subscriber subscriber+=Subscriber*)? 
	 *         (serviceclient+=ServiceClient serviceclient+=ServiceClient*)? 
	 *         (actionserver+=ActionServer actionserver+=ActionServer*)? 
	 *         (actionclient+=ActionClient actionclient+=ActionClient*)? 
	 *         (parameter+=Parameter parameter+=Parameter*)?
	 *     )
	 */
	protected void sequence_Node(ISerializationContext context, Node semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dependency returns PackageDependency
	 *     PackageDependency returns PackageDependency
	 *
	 * Constraint:
	 *     package=[Package|EString]
	 */
	protected void sequence_PackageDependency(ISerializationContext context, PackageDependency semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PACKAGE_DEPENDENCY__PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PACKAGE_DEPENDENCY__PACKAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPackageDependencyAccess().getPackagePackageEStringParserRuleCall_3_0_1(), semanticObject.eGet(RosPackage.Literals.PACKAGE_DEPENDENCY__PACKAGE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PackageSet returns PackageSet
	 *
	 * Constraint:
	 *     (package+=Package package+=Package*)?
	 */
	protected void sequence_PackageSet(ISerializationContext context, PackageSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Package returns Package
	 *     Package_Impl returns Package
	 *
	 * Constraint:
	 *     (name=EString (spec+=SpecBase spec+=SpecBase*)? (artifact+=Artifact artifact+=Artifact*)?)
	 */
	protected void sequence_Package_Impl(ISerializationContext context, ros.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterAnyType
	 *     ParameterAnyType returns ParameterAnyType
	 *
	 * Constraint:
	 *     default=ParameterAny?
	 */
	protected void sequence_ParameterAnyType(ISerializationContext context, ParameterAnyType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterAny
	 *     ParameterAny returns ParameterAny
	 *
	 * Constraint:
	 *     value=EString?
	 */
	protected void sequence_ParameterAny(ISerializationContext context, ParameterAny semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterArrayType
	 *     ParameterArrayType returns ParameterArrayType
	 *
	 * Constraint:
	 *     (type=ParameterType default=ParameterSequence?)
	 */
	protected void sequence_ParameterArrayType(ISerializationContext context, ParameterArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterBase64Type
	 *     ParameterBase64Type returns ParameterBase64Type
	 *
	 * Constraint:
	 *     default=ParameterBase64?
	 */
	protected void sequence_ParameterBase64Type(ISerializationContext context, ParameterBase64Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterBase64
	 *     ParameterBase64 returns ParameterBase64
	 *
	 * Constraint:
	 *     value=Base64Binary
	 */
	protected void sequence_ParameterBase64(ISerializationContext context, ParameterBase64 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_BASE64__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_BASE64__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterBooleanType
	 *     ParameterBooleanType returns ParameterBooleanType
	 *
	 * Constraint:
	 *     default=ParameterBoolean?
	 */
	protected void sequence_ParameterBooleanType(ISerializationContext context, ParameterBooleanType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterBoolean
	 *     ParameterBoolean returns ParameterBoolean
	 *
	 * Constraint:
	 *     value=Boolean
	 */
	protected void sequence_ParameterBoolean(ISerializationContext context, ParameterBoolean semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_BOOLEAN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_BOOLEAN__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterBooleanAccess().getValueBooleanParserRuleCall_3_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterDateType
	 *     ParameterDateType returns ParameterDateType
	 *
	 * Constraint:
	 *     default=ParameterDate?
	 */
	protected void sequence_ParameterDateType(ISerializationContext context, ParameterDateType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterDate
	 *     ParameterDate returns ParameterDate
	 *
	 * Constraint:
	 *     value=DateTime
	 */
	protected void sequence_ParameterDate(ISerializationContext context, ParameterDate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_DATE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_DATE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterDateAccess().getValueDateTimeParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterDoubleType
	 *     ParameterDoubleType returns ParameterDoubleType
	 *
	 * Constraint:
	 *     default=ParameterDouble?
	 */
	protected void sequence_ParameterDoubleType(ISerializationContext context, ParameterDoubleType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterDouble
	 *     ParameterDouble returns ParameterDouble
	 *
	 * Constraint:
	 *     value=Double
	 */
	protected void sequence_ParameterDouble(ISerializationContext context, ParameterDouble semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_DOUBLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_DOUBLE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterDoubleAccess().getValueDoubleParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterIntegerType
	 *     ParameterIntegerType returns ParameterIntegerType
	 *
	 * Constraint:
	 *     default=ParameterInteger?
	 */
	protected void sequence_ParameterIntegerType(ISerializationContext context, ParameterIntegerType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterInteger
	 *     ParameterInteger returns ParameterInteger
	 *
	 * Constraint:
	 *     value=Int0
	 */
	protected void sequence_ParameterInteger(ISerializationContext context, ParameterInteger semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_INTEGER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_INTEGER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterIntegerAccess().getValueInt0ParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterListType
	 *     ParameterListType returns ParameterListType
	 *
	 * Constraint:
	 *     ((sequence+=ParameterType sequence+=ParameterType*)? default=ParameterSequence?)
	 */
	protected void sequence_ParameterListType(ISerializationContext context, ParameterListType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterSequence
	 *     ParameterSequence returns ParameterSequence
	 *
	 * Constraint:
	 *     (value+=ParameterValue value+=ParameterValue*)?
	 */
	protected void sequence_ParameterSequence(ISerializationContext context, ParameterSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterStringType
	 *     ParameterStringType returns ParameterStringType
	 *
	 * Constraint:
	 *     default=ParameterString?
	 */
	protected void sequence_ParameterStringType(ISerializationContext context, ParameterStringType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterString
	 *     ParameterString returns ParameterString
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_ParameterString(ISerializationContext context, ParameterString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_STRING__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterStructMember returns ParameterStructMember
	 *
	 * Constraint:
	 *     (name=EString value=ParameterValue)
	 */
	protected void sequence_ParameterStructMember(ISerializationContext context, ParameterStructMember semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_MEMBER__NAME));
			if (transientValues.isValueTransient(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ParameterStructTypeMember returns ParameterStructTypeMember
	 *
	 * Constraint:
	 *     (name=EString type=ParameterType default=ParameterStruct?)
	 */
	protected void sequence_ParameterStructTypeMember(ISerializationContext context, ParameterStructTypeMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterType returns ParameterStructType
	 *     ParameterStructType returns ParameterStructType
	 *
	 * Constraint:
	 *     (parameterstructypetmember+=ParameterStructTypeMember parameterstructypetmember+=ParameterStructTypeMember*)?
	 */
	protected void sequence_ParameterStructType(ISerializationContext context, ParameterStructType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ParameterValue returns ParameterStruct
	 *     ParameterStruct returns ParameterStruct
	 *
	 * Constraint:
	 *     (value+=ParameterStructMember value+=ParameterStructMember*)?
	 */
	protected void sequence_ParameterStruct(ISerializationContext context, ParameterStruct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=EString namespace=Namespace? type=ParameterType)
	 */
	protected void sequence_Parameter(ISerializationContext context, ros.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns PrivateNamespace
	 *     PrivateNamespace returns PrivateNamespace
	 *
	 * Constraint:
	 *     (parts+=GraphName parts+=GraphName*)?
	 */
	protected void sequence_PrivateNamespace(ISerializationContext context, PrivateNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Publisher returns Publisher
	 *
	 * Constraint:
	 *     (name=EString message=[TopicSpec|EString] namespace=Namespace?)
	 */
	protected void sequence_Publisher(ISerializationContext context, Publisher semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns RelativeNamespace
	 *     RelativeNamespace_Impl returns RelativeNamespace
	 *
	 * Constraint:
	 *     (parts+=GraphName parts+=GraphName*)?
	 */
	protected void sequence_RelativeNamespace_Impl(ISerializationContext context, RelativeNamespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ServiceClient returns ServiceClient
	 *
	 * Constraint:
	 *     (name=EString service=[ServiceSpec|EString] namespace=Namespace?)
	 */
	protected void sequence_ServiceClient(ISerializationContext context, ServiceClient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ServiceServer returns ServiceServer
	 *
	 * Constraint:
	 *     (name=EString service=[ServiceSpec|EString] namespace=Namespace?)
	 */
	protected void sequence_ServiceServer(ISerializationContext context, ServiceServer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecBase returns ServiceSpec
	 *     ServiceSpec returns ServiceSpec
	 *
	 * Constraint:
	 *     (name=EString request=MessageDefinition? response=MessageDefinition?)
	 */
	protected void sequence_ServiceSpec(ISerializationContext context, ServiceSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Subscriber returns Subscriber
	 *
	 * Constraint:
	 *     (name=EString message=[TopicSpec|EString] namespace=Namespace?)
	 */
	protected void sequence_Subscriber(ISerializationContext context, Subscriber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SpecBase returns TopicSpec
	 *     TopicSpec returns TopicSpec
	 *
	 * Constraint:
	 *     (name=EString message=MessageDefinition?)
	 */
	protected void sequence_TopicSpec(ISerializationContext context, TopicSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
