/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.recipes;

/**
 * Default implementation of a recipe ingredient.
 * @author Fabrice Bouyé
 */
final class DefaultRecipeIngredient implements RecipeIngredient {

    int itemId = -1;
    int count = -1;

    /**
     * Creates a new empty instance.
     */
    DefaultRecipeIngredient() {
    }

    @Override
    public int getItemId() {
        return itemId;
    }

    @Override
    public int getCount() {
        return count;
    }
}