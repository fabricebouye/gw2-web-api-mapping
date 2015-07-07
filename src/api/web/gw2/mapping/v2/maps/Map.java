/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.maps;

import api.web.gw2.mapping.core.ContinentDimension;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.MapDimension;
import java.util.Set;

/**
 * Defines a map.
 * @author Fabrice Bouyé
 */
public interface Map {

    /**
     * Gets the id of this map.
     * @return An {@code int}.
     */
    int getId();

    /**
     * Gets the localized name of this map.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the minimum level suggested for this map.
     * @return An {@code int}.
     */
    int getMinLevel();

    /**
     * Gets the maximum level suggested for this map.
     * @return An {@code int}.
     */
    int getMaxLevel();

    /**
     * Gets the id of the default floor for this map.
     * @return An {@code int}.
     */
    int getDefaultFloor();

    /**
     * Gets a set of all floors for this map.
     * @return A {@code Set<Integer>}, never {@code null}.
     */
    Set<Integer> getFloors();

    /**
     * Gets the id of the continent which contains this map.
     * @return An {@code int}.
     */
    int getContinentId();

    /**
     * Gets the localized name of the continent which contains this map.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getContinentName();

    /**
     * Gets the id of the region which contains this map.
     * @return An {@code int}.
     */
    int getRegionId();

    /**
     * Gets the localized name of the region which contains this map.
     * @return A {@code String} instance, never {@code null}.
     */
    String getRegionName();

    /**
     * Gets the dimension and position of this map in map coordinates.
     * @return A {@code MapDimension<Integer>} instance, never {@code null}.
     */
    MapDimension<Integer> getMapRect();

    /**
     * Gets the dimension and position of this map in continent coordinates.
     * @return A {@code ContinentDimension<Integer>} instance, never {@code null}.
     */
    ContinentDimension<Integer> getContinentRect();
}
