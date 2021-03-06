/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.dungeons;

import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.v2.APIv2;

/**
 * Defines a dungeons path.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/dungeon") // NOI18N.
public interface DungeonPath {

    /**
     * Gets the id of this path.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the type of this path.
     * @return A {@code DungeonPathType} instance, never {@code null}.
     */
    DungeonPathType getType();
}
