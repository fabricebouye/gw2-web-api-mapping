/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.games;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all results a PvP match.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/games", requiresAuthentication = true, scope = "pvp") // NOI18N.
public enum PvpGameResult {

    /**
     * Defines the defeat result.
     */
    DEFEAT("Defeat"), // NOI18N.
    /**
     * Defines the victory result.
     */
    VICTORY("Victory"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private PvpGameResult(final String value) {
        this.value = value;
    }
}
