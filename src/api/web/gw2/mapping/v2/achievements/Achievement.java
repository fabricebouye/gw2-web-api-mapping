/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.core.URLReference;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Defines an achievements.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/achievements") // NOI18N.
public interface Achievement {

    /**
     * Gets the id of this achievement.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the optional URL of the icon for this achievement.
     * @return A {@code URLReference}, never {@code null}.
     */
    @URLValue
    URLReference getIcon();

    /**
     * Gets the i18n name of this achievement.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the i18n description of this achievement.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getDescription();

    /**
     * Gets the i18n requirement of this achievement.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getRequirement();

    /**
     * Gets the type of this achievement.
     * @return An {@code AchievementType} instance, never {@code null}.
     */
    AchievementType getType();

    /**
     * Gets the flags of this achievement.
     * @return A non-modifiable {@code Set<AchievementFlag>} instance, never {@code null}.
     */
    @SetValue
    Set<AchievementFlag> getFlags();

    /**
     * Gets the tiers for this achievement.
     * @return A non-modifiable {@code Set<AchievementTier>} instance, never {@code null}.
     */
    @SetValue
    Set<AchievementTier> getTiers();

    /**
     * Gets the optional rewards for this achievement.
     * @return A non-modifiable {@code Set<AchievementReward>} instance, never {@code null}; may be empty.
     */
    @SetValue
    Set<AchievementReward> getRewards();

    /**
     * Gets the optional bits for this achievement.
     * @return A non-modifiable {@code Set<AchievementBit>} instance, never {@code null}; may be empty.
     */
    @SetValue
    Set<AchievementBit> getBits();

    /**
     * Gets the optional text when this achievement is still locked.
     * @return  An {@code Optional<String>} instance, never {@code null}.
     */
    @OptionalValue
    @LocalizedResource
    Optional<String> getLockedText();

    /**
     * Gets the optional prerequisites for this achievement.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}; may be empty.
     */
    @IdValue
    @SetValue
    Set<Integer> getPrerequisites();

    /**
     * Gets the maximum number of repetitions after which this achievement will cease to give points.
     * @return  An {@code OptionalInt} instance, never {@code null}.
     */
    @OptionalValue
    @QuantityValue
    OptionalInt getPointCap();
}
