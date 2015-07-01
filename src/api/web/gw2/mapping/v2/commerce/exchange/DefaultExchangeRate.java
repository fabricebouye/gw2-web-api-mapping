/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.commerce.exchange;

/**
 * Default implementation of an exchange rate.
 * @author Fabrice Bouyé
 */
final class DefaultExchangeRate implements ExchangeRate {

    int coinsPerGem = -1;
    int quantity = -1;

    /**
     * Creates a new empty instance.
     */
    DefaultExchangeRate() {
    }

    @Override
    public int getCoinsPerGem() {
        return coinsPerGem;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}