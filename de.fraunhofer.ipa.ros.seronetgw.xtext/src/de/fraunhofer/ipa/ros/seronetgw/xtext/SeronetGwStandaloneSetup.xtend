/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.seronetgw.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SeronetGwStandaloneSetup extends SeronetGwStandaloneSetupGenerated {

	def static void doSetup() {
		new SeronetGwStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
