package hudson.plugins.violations.types.gendarme;

import hudson.plugins.violations.TypeDescriptor;
import hudson.plugins.violations.ViolationsParser;

/**
 * The descriptor class for Gendarme (Mono Source Analysis) violations type.
 * http://www.mono-project.com/Gendarme
 *
 * @author mathias.kluba@gmail.com
 */
public class GendarmeDescriptor extends TypeDescriptor {

    public GendarmeDescriptor() {
        super(GendarmeParser.TYPE_NAME);
    }

    @Override
    public ViolationsParser createParser() {
        return new GendarmeParser();
    }
}
