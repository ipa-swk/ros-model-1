/**
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros;

import com.google.inject.Binder;
import de.fraunhofer.ipa.ros.AbstractRosArtifactRuntimeModule;
import de.fraunhofer.ipa.ros.generator.CustomOutputProvider;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class RosArtifactRuntimeModule extends AbstractRosArtifactRuntimeModule {
  @Override
  public void configure(final Binder binder) {
    super.configure(binder);
    binder.<IOutputConfigurationProvider>bind(IOutputConfigurationProvider.class).to(CustomOutputProvider.class).asEagerSingleton();
  }
}
