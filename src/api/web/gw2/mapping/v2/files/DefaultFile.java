/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.files;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.URLValue;
import java.net.URL;
import java.util.Optional;

/**
 * Default implementation of a file.
 * @author Fabrice Bouyé
 */
final class DefaultFile implements File {

    String id = "";
    @OptionalValue
    @URLValue
    Optional<URL> icon = Optional.empty();

    /**
     * Creates a new empty instance.
     */
    DefaultFile() {
    }

    @IdValue(flavor = IdValue.Flavor.STRING)
    public String getId() {
        return id;
    }

    @Override
    public Optional<URL> getIcon() {
        return icon;
    }
}
