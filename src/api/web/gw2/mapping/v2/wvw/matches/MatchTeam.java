/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.matches;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all WvW match teams.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw/matches") // NOI18N.
public enum MatchTeam {

    /**
     * Defines the blue team.
     */
    BLUE("Blue"),
    /**
     * Defines the green team.
     */
    GREEN("Green"),
    /**
     * Defines the neutral team.
     */
    NEUTRAL("Neutral"),
    /**
     * Defines the red team.
     */
    RED("Red"),
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private MatchTeam(String value) {
        this.value = value;
    }
}