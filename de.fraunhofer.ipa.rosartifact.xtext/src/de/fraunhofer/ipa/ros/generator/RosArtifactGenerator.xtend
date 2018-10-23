/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.generator


import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ros.Node
import ros.Publisher
import ros.ServiceClient
import ros.ServiceServer
import ros.Subscriber
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import java.util.Set

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
 
class CustomOutputProvider implements IOutputConfigurationProvider {
	public final static String ROS_CONFIGURATION = "ROS_CONFIGURATION"

	override Set<OutputConfiguration> getOutputConfigurations() {
		var OutputConfiguration ros_config = new OutputConfiguration(ROS_CONFIGURATION)
		ros_config.setDescription("ros_config");
		ros_config.setOutputDirectory("./src-gen");
		ros_config.setOverrideExistingResources(true);
		ros_config.setCreateOutputDirectory(true);
		ros_config.setCleanUpDerivedResources(true);
		ros_config.setSetDerivedProperty(true);
		return newHashSet(ros_config)
	}
}

class RosArtifactGenerator extends AbstractGenerator {

	String resourcepath
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		resourcepath = resource.URI.toString();
		if (! resourcepath.contains("/ros-input") || ! resourcepath.contains("/rosnodes")) {
			for (node : resource.allContents.toIterable.filter(Node)){
				fsa.generateFile(node.getName()+".cpp",CustomOutputProvider::ROS_CONFIGURATION,node.compile)
				}
			}
		}

def compile(Node node) '''
#include <ros/ros.h>
            «FOR pub : node.publisher»
#include <«pub.message.package.name»/«pub.message.name».h>
            «ENDFOR»
            «FOR sub : node.subscriber»
#include <«sub.message.package.name»/«sub.message.name».h>
            «ENDFOR»
            «FOR srvserver : node.serviceserver»
#include <«srvserver.service.package.name»/«srvserver.service.name».h>
            «ENDFOR»
            «FOR srvclient : node.serviceclient»
#include <«srvclient.service.package.name»/«srvclient.service.name».h>
            «ENDFOR»

            «FOR srvserver : node.serviceserver»
bool  «checkname(srvserver.name)»_cb («srvserver.service.package.name»::«srvserver.service.name»::Request &req, «srvserver.service.package.name»::«srvserver.service.name»::Response &res){
  return true;
}
            «ENDFOR»
            «FOR sub : node.subscriber»
void  «checkname(sub.name)»_cb (const «sub.message.package.name»::«sub.message.name» msg){}
            «ENDFOR»


int main(int argc, char **argv)
{
  ros::init(argc, argv, "«checkname(node.name)»");
  ros::NodeHandle n;
  
            «FOR pub : node.publisher»
  «pub.compile»
            «ENDFOR»
            «FOR sub : node.subscriber»
  «sub.compile»
            «ENDFOR»
            «FOR srvserver : node.serviceserver»
  «srvserver.compile»
            «ENDFOR»
            «FOR srvclient : node.serviceclient»
  «srvclient.compile»
            «ENDFOR»

  ros::spin();

  return 0;
}
            '''
            
def compile(Publisher pub)       
'''  ros::Publisher «checkname(pub.name)»_pub = n.advertise<«pub.message.package.name»::«pub.message.name»>("«pub.name»", 10);'''
def compile(Subscriber sub)       
'''  ros::Subscriber «checkname(sub.name)» = n.subscribe("«sub.name»", 10, «sub.name»_cb);'''
def compile(ServiceServer srvserver)       
'''  ros::ServiceServer «checkname(srvserver.name)» = n.advertiseService("«srvserver.name»", «srvserver.name»_cb);'''
def compile(ServiceClient srvclient)       
'''  ros::ServiceClient «checkname(srvclient.name)» = n.serviceClient<«srvclient.service.package.name»::«srvclient.service.name»>("«srvclient.name»");'''

	def String checkname(String name){
		if (name.contains("/"))
			return name.replace("/","_")
		else
			return name
	}

	}
