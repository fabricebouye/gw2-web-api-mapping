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
 * Defines all track costs types.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/professions") // NOI18N.
public enum ProfessionTrackCostType {
    /**
     * Defines a skill track cost.
     */
    SKILL("Skill"), // NOI18N.
    /**
     * Defines a trait track cost.
     */
    TRAIT("Trait"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    private final String value;

    private ProfessionTrackCostType(final String value) {
        this.value = value;
    }
}
