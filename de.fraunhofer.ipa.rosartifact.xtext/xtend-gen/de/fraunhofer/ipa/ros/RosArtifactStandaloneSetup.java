/**
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros;

import de.fraunhofer.ipa.ros.RosArtifactStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class RosArtifactStandaloneSetup extends RosArtifactStandaloneSetupGenerated {
  public static void doSetup() {
    new RosArtifactStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
