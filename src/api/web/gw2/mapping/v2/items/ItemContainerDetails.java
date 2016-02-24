/* 
 * Copyright (C) 2015-2016 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines container details.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public interface ItemContainerDetails extends ItemDetails {

    /**
     * Gets the type of this container.
     * @return An {@code ItemContainerType} instance, never {@code null}.
     */
    ItemContainerType getType();
}
