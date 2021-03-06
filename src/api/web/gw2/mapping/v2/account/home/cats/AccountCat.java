/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.account.home.cats;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a cat unlocked by the account.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/account/home/cats", requiresAuthentication = true, scope = "progression") // NOI18N.
public interface AccountCat {

    /**
     * Gets the id of this cat.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the hint on how to unlock the cat.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getHint();
}
