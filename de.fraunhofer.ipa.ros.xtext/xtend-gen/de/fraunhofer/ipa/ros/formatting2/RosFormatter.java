/**
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.formatting2;

import com.google.inject.Inject;
import de.fraunhofer.ipa.ros.services.RosGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import ros.Artifact;
import ros.PackageSet;
import ros.SpecBase;

@SuppressWarnings("all")
public class RosFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private RosGrammarAccess _rosGrammarAccess;
  
  protected void _format(final PackageSet packageSet, @Extension final IFormattableDocument document) {
    EList<ros.Package> _package = packageSet.getPackage();
    for (final ros.Package _package_1 : _package) {
      document.<ros.Package>format(_package_1);
    }
  }
  
  protected void _format(final ros.Package _package, @Extension final IFormattableDocument document) {
    EList<SpecBase> _spec = _package.getSpec();
    for (final SpecBase specBase : _spec) {
      document.<SpecBase>format(specBase);
    }
    EList<Artifact> _artifact = _package.getArtifact();
    for (final Artifact artifact : _artifact) {
      document.<Artifact>format(artifact);
    }
  }
  
  public void format(final Object _package, final IFormattableDocument document) {
    if (_package instanceof XtextResource) {
      _format((XtextResource)_package, document);
      return;
    } else if (_package instanceof ros.Package) {
      _format((ros.Package)_package, document);
      return;
    } else if (_package instanceof PackageSet) {
      _format((PackageSet)_package, document);
      return;
    } else if (_package instanceof EObject) {
      _format((EObject)_package, document);
      return;
    } else if (_package == null) {
      _format((Void)null, document);
      return;
    } else if (_package != null) {
      _format(_package, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(_package, document).toString());
    }
  }
}
