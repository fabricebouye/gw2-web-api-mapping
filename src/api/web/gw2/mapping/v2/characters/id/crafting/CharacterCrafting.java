/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.id.crafting;

import api.web.gw2.mapping.core.CraftingLevelValue;
import api.web.gw2.mapping.v2.APIv2;
import api.web.gw2.mapping.v2.recipes.RecipeCraftingDiscipline;

/**
 * Defines the description of a character's crafting discipline.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/characters/:id/crafting", requiresAuthentication = true, scope = "characters") // NOI18N.
public interface CharacterCrafting {

    /**
     * Gets the crafting discipline for this record.
     * @return A {@code RecipeCraftingDiscipline} instance, never {@code null}.
     */
    RecipeCraftingDiscipline getDiscipline();

    /**
     * Gets the character's rating (level in this discipline).
     * @return An {@code int}.
     */
    @CraftingLevelValue
    int getRating();

    /**
     * Indicates whether this discipline is active.
     * @return {@code True} if the test is verified, {@code false} otherwise.
     */
    boolean isActive();
}
