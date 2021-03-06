/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.maps;

import api.web.gw2.mapping.core.ContinentBounds;
import api.web.gw2.mapping.core.ContinentRect;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LevelValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.MapBounds;
import api.web.gw2.mapping.core.MapRect;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.util.Set;

/**
 * Defines a map.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/maps") // NOI18N.
public interface Map {

    /**
     * Gets the id of this map.
     * @return An {@code int}.
     */
    @IdValue
    int getId();

    /**
     * Gets the i18n name of this map.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the minimum level suggested for this map.
     * @return An {@code int}.
     */
    @LevelValue
    int getMinLevel();

    /**
     * Gets the maximum level suggested for this map.
     * @return An {@code int}.
     */
    @LevelValue
    int getMaxLevel();

    /**
     * Gets the id of the default floor for this map.
     * @return An {@code int}.
     */
    @IdValue
    int getDefaultFloor();

    /**
     * Gets a set of all floors for this map.
     * @return A {@code Set<Integer>}, never {@code null}.
     */
    @IdValue
    @SetValue
    Set<Integer> getFloors();

    /**
     * Gets the id of the continent which contains this map.
     * @return An {@code int}.
     */
    @IdValue
    int getContinentId();

    /**
     * Gets the i18n name of the continent which contains this map.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getContinentName();

    /**
     * Gets the id of the region which contains this map.
     * @return An {@code int}.
     */
    @IdValue
    int getRegionId();

    /**
     * Gets the i18n name of the region which contains this map.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getRegionName();

    /**
     * Gets the dimension and position of this map in map coordinates.
     * @return A {@code MapBounds} instance, never {@code null}.
     */
    @MapRect
    MapBounds getMapRect();

    /**
     * Gets the dimension and position of this map in continent coordinates.
     * @return A {@code ContinentBounds} instance, never {@code null}.
     */
    @ContinentRect
    ContinentBounds getContinentRect();
}
