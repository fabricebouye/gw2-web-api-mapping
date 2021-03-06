/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.heroes;

import api.web.gw2.mapping.v2.pvp.amulets.*;
import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all stat types of a PvP hero.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/pvp/heroes")
public enum PvpHeroStat {

    /**
     * Defines the defense stat.
     */
    DEFENSE("defense"), // NOI18N.
    /**
     * Defines the offense stat.
     */
    OFFENSE("offense"), // NOI18N.
    /**
     * Defines the speed stat.
     */
    SPEED("speed"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private PvpHeroStat(String value) {
        this.value = value;
    }
}
