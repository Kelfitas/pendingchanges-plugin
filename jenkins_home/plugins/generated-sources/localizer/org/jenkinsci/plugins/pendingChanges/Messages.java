// CHECKSTYLE:OFF

package org.jenkinsci.plugins.pendingChanges;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;

@SuppressWarnings({
    "",
    "PMD"
})
public class Messages {

    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Pending Changes
     * 
     */
    public static String displayName() {
        return holder.format("displayName");
    }

    /**
     * Pending Changes
     * 
     */
    public static Localizable _displayName() {
        return new Localizable(holder, "displayName");
    }

}
