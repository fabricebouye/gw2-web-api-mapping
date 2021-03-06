/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v1.APIv1;

/**
 * Define all WvW match details objective owners.
 * @author Fabrice Bouyé
 */
@APIv1(endpoint = "v1/wvw/match_details.json") // NOI18N.
public enum MatchDetailsObjectiveOwner {

    /**
     * Defines the red faction owner.
     */
    RED("Red"), // NOI18N.
    /**
     * Defines the blue faction owner.
     */
    BLUE("Blue"), // NOI18N.
    /**
     * Defines the green faction owner.
     */
    GREEN("Green"), // NOI18N.
    /**
     * Defines the neutral faction owner.
     */
    NEUTRAL("Neutral"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private MatchDetailsObjectiveOwner(String value) {
        this.value = value;
    }
}
