/*
 * generated by Xtext 2.12.0
 */
package de.fraunhofer.ipa.ros.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RosArtifactAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/fraunhofer/ipa/ros/parser/antlr/internal/InternalRosArtifact.tokens");
	}
}
