/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all item infusion slot flags.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public enum ItemInfusionSlotFlag {

    /**
     * Defines the defense flag.
     */
    DEFENSE("Defense"),
    /**
     * Defines the offense flag.
     */
    OFFENSE("Offense"),
    /**
     * Defines the utility flag.
     */
    UTILITY("Utility"),
    /**
     * Defines the agony resistance flag.
     */
    @ImplementationSpecific
    AGONY(""),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    ItemInfusionSlotFlag(final String value) {
        this.value = value;
    }
}