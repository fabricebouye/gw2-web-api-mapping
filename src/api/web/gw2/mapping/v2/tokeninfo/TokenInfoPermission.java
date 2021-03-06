/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.tokeninfo;

import api.web.gw2.mapping.core.ImplementationSpecific;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines permissions on a token info.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/tokeninfo", requiresAuthentication = true, scope = "account")
public enum TokenInfoPermission {

    /**
     * Defines the account permission.
     */
    ACCOUNT("account"), // NOI18N.
    /**
     * Defines the characters permission.
     */
    CHARACTERS("characters"), // NOI18N.
    /**
     * Defines the inventories permission.
     */
    INVENTORIES("inventories"), // NOI18N.
    /**
     * Defines the tradingpost permission.
     */
    TRADINGPOST("tradingpost"), // NOI18N.
    /**
     * Defines the wallet permission.
     */
    WALLET("wallet"), // NOI18N.
    /**
     * Defines the unlocks permission.
     */
    UNLOCKS("unlocks"), // NOI18N.
    /**
     * Defines the pvp permission.
     */
    PVP("pvp"), // NOI18N.
    /**
     * Defines the builds permission.
     */
    BUILDS("builds"), // NOI18N.
    /**
     * Defines the progression permission.
     */
    PROGRESSION("progression"), // NOI18N.
    /**
     * Defines the guilds permission.
     */
    GUILDS("guilds"), // NOI18N.
    /**
     * Fail safe value.
     */
    @ImplementationSpecific
    UNKNOWN(null);

    final String value;

    private TokenInfoPermission(String value) {
        this.value = value;
    }
}
