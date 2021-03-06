/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.materials;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.QuantityValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an account material in the bank's material storage.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/account/materials", requiresAuthentication = true, scope = "inventories") // NOI18N.
public interface AccountMaterial {

    /**
     * Gets the id of this account material.
     * @return An {@code int}.
     * @see api.web.gw2.mapping.v2.items.Item#getId() 
     */
    @IdValue
    int getId();

    /**
     * Gets the id of the material storage of this account material.
     * @return An {@code int}.
     * @see api.web.gw2.mapping.v2.materials.MaterialStorage#getId() 
     */
    @IdValue
    int getCategory();

    /**
     * Gets the quantity of this account material.
     * @return An {@code int} &ge;0 .
     */
    @QuantityValue
    int getCount();
}
