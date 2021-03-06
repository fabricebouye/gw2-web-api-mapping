/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skills;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.OptionalInt;

/**
 * Defines a skill traited fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/skills") // NOI18N.
public interface SkillTraitedFact {

    /**
     * Gets the i18n description of this skill traited fact.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getText();

    /**
     * Gets the URL to the icon this skill traited fact.
     * @return A {@code URLReference} instance, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the type of this skill traited fact.
     * @return A {@code SkillFactType} instance, never {@code null}.
     */
    SkillFactType getType();

    /**
     * Indicates which trait has to be selected for this skill traited fact to take effect.
     * @return An {@code int}.
     */
    @IdValue
    int getRequiredTrait();

    /**
     * Indicates the index within the fact that is overridden when this skill traited fact takes effect.
     * @return A {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    @QuantityValue
    OptionalInt getOverrides();
}
