/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.ListValue;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.core.SetValue;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;

/**
 * Defines an item armor details.
 * @author Fabrice Bouyé
 */
public interface ItemArmorDetails extends ItemDetails {

    /**
     * Gets the type of this armor.
     * @return An {@code ItemArmorType} instance, never {@code null}.
     */
    ItemArmorType getType();

    /**
     * Gets the weight class of this armor.
     * @return An {@code ItemArmorWeightClass} instance, never {@code null}.
     */
    ItemArmorWeightClass getWeightClass();

    /**
     * Gets the defense value of this armor.
     * @return An {@code int}.
     */
    @QuantityValue
    int getDefense();

    /**
     * Gets the list of infusion slots on this armor.
     * @return A non-modifiable {@code List<ItemInfusionSlot>}, never {@code null}.
     */
    @ListValue
    List<ItemInfusionSlot> getInfusionSlots();

    /**
     * Gets the infix upgrade on this armor.
     * @return An {@code Optional<ItemInfixUpgrade>} instance, never {@code null}.
     */
    @OptionalValue
    Optional<ItemInfixUpgrade> getInfixUpgrade();

    /**
     * Gets the id of the suffix item (ie: rune) on this armor.
     * @return An {@code OptionalInt}, never {@code null}.
     */
    @OptionalValue
    @IdValue
    OptionalInt getSuffixItemId();

    /**
     * Gets the id of the secondary suffix item on this armor.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue
    String getSecondarySuffixItemId();

    /**
     * Gets the available stats choices for this armor.
     * @return A non-modifiable {@code Set<Integer>} instance, never {@code null}. 
     * <br>May be empty if no stat choice is available.
     * @see api.web.gw2.mapping.v2.itemstats.Itemstats#getId() 
     */
    @SetValue
    @IdValue
    Set<Integer> getStatChoices();
}
