/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.traits;

import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines an unblockable fact.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/traits") // NOI18N.
public interface TraitUnblockableFact extends TraitFact {

    /**
     * {@inheritDoc}
     * @return Always {@code TraitFactType.TIME}.
     */
    @Override
    default TraitFactType getType() {
        return TraitFactType.TIME;
    }

    /**
     * The value of this fact.
     * @return Always {@code true}.
     */
    default boolean getValue() {
        return true;
    }
}
