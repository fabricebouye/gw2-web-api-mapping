/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.items;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a gathering tool details.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/items") // NOI18N.
public interface ItemGatheringDetails extends ItemDetails {

    /**
     * Gets the type of this gathering too.
     * @return An {@code ItemGatheringType} instance, never {@code null}.
     */
    ItemGatheringType getType();

}
