/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.objectives;

import api.web.gw2.mapping.v2.wvw.MapType;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.LocalizedResource;
import api.web.gw2.mapping.core.OptionalValue;
import api.web.gw2.mapping.core.Point2D;
import api.web.gw2.mapping.core.URLValue;
import api.web.gw2.mapping.v2.APIv2;
import java.net.URL;
import java.util.Optional;

/**
 * Defines a WvW objective.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw/objectives") // NOI18N.
public interface Objective {

    /**
     * Gets the id of this objective.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue
    String getId();

    /**
     * Gets the localized abstract name of this objective.
     * <br>Note: this may not be the same as the name in game.
     * @return A {@code String} instance, never {@code null}.
     */
    @LocalizedResource
    String getName();

    /**
     * Gets the id of the sector containing this objective.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue
    String getSectorId();

    /**
     * Gets the type of this objective.
     * @return An {@code ObjectiveType} instance, never {@code null}.
     */
    ObjectiveType getType();

    /**
     * Gets the map type of this objective.
     * @return An {@code MapType} instance, never {@code null}.
     */
    MapType getMapType();

    /**
     * Gets the if of the map of this objective.
     * @return An {@code int}.
     */
    @IdValue
    int getMapId();

    /**
     * Gets the coordinates of this objective.
     * @return An {@code Point2D<Double>} instance, never {@code null}.
     */
    Point2D<Double> getCoord();

    /**
     * Gets the URL to the marker icon for this objective.
     * @return An {@code Optional<URL>} instance, never {@code null}.
     */
    @OptionalValue
    @URLValue
    Optional<URL> getMarker();
}