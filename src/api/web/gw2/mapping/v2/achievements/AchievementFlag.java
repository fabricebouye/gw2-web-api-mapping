/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines all achievement flags.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements") // NOI18N.
public enum AchievementFlag {

    /**
     * Defines an achievement category.
     */
    CATEGORY_DISPLAY("CategoryDisplay"), // NOI18N.
    /**
     * Efects in-game UI collation.
     */
    IGNORE_NEARLY_COMPLETE("IgnoreNearlyComplete"), // NOI18N.
    /**
     * Defines a default achievement.
     */
    MOVE_TO_TOP("MoveToTop"), // NOI18N.
    /**
     * Defines a achievement that can only get progress in PvP or WvW.
     */
    PVP("Pvp"), // NOI18N.
    /**
     * ?
     */
    REPAIR_ON_LOGIN("RepairOnLogin"), // NOI18N.
    /**
     * Achievement is hidden until unlocked.
     */
    HIDDEN("Hidden"), // NOI18N.
    /**
     * Achievement can be repeated.    
     */
    REPEATABLE("Repeatable"), // NOI18N.
    /**
     * Achievement requires unlock.
     */
    REQUIRES_UNLOCK("RequiresUnlock"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private AchievementFlag(final String value) {
        this.value = value;
    }
}
