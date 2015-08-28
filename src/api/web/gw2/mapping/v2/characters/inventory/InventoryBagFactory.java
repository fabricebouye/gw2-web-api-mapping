/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.characters.inventory;

import java.io.IOException;

/**
 * Defines a factory that produces a bag object.
 * @author Fabrice Bouyé
 */
@FunctionalInterface
public interface InventoryBagFactory {

    /**
     * Creates a new bag instance.
     * @param basecode The source URL.
     * @return An {@code InventoryBag} instance, never {@code null}.
     * @throws NullPointerException If {@code basecode} is {@code null}.
     * @throws IOException In case of IO error.
     */
    InventoryBag create(final String basecode) throws NullPointerException, IOException;
}