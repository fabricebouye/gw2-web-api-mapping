/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.professions;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all elementalist attunement.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/professions") // NOI18N.
public enum ProfessionElementalistAttunement {
    /**
     * Defines the air attunement.
     */
    AIR("Air"), // NOI18N.
    /**
     * Defines the earth attunement.
     */
    EARTH("Earth"), // NOI18N.
    /**
     * Defines the fire attunement.
     */
    FIRE("Fire"), // NOI18N.
    /**
     * Defines the water attunement.
     */
    WATER("Water"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    private final String value;

    private ProfessionElementalistAttunement(final String value) {
        this.value = value;
    }
}
