/* 
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.matches;

import api.web.gw2.mapping.core.DateValue;
import api.web.gw2.mapping.core.IdValue;
import api.web.gw2.mapping.core.MapValue;
import api.web.gw2.mapping.core.SetValue;
import api.web.gw2.mapping.v2.APIv2;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Set;

/**
 * Defines a WvW match.
 * @author Fabrice Bouyé
 */
@APIv2(endpoint = "v2/wvw/matches") // NOI18N.
public interface WvwMatch {

    /**
     * Gets the id of this WvW match.
     * @return A {@code String} instance, never {@code null}.
     */
    @IdValue(flavor = IdValue.Flavor.STRING)
    String getId();

    /**
     * Gets the start time of this WvW match.
     * @return A {@code ZonedDateTime} instance, never {@code null}.
     */
    @DateValue
    ZonedDateTime getStartTime();

    /**
     * Gets the end time of this WvW match.
     * @return A {@code ZonedDateTime} instance, never {@code null}.
     */
    @DateValue
    ZonedDateTime getEndTime();

    /**
     * Gets the scores for this WvW match.
     * @return A {@code Map<WvwMatchTeam, Integer>}, never {@code null}, may be empty.
     */
    @MapValue
    Map<WvwMatchTeam, Integer> getScores();

    /**
     * Gets the worlds for this WvW match.
     * @return A {@code Map<WvwMatchTeam, Integer>}, never {@code null}, may be empty.
     */
    @IdValue
    @MapValue
    Map<WvwMatchTeam, Integer> getWorlds();

    /**
     * Gets all worlds that are teamed up for this WvW match.
     * @return A {@code Map<WvwMatchTeam, Set<Integer>>}, never {@code null}, may be empty.
     */
    @IdValue
    @MapValue
    @SetValue        
    Map<WvwMatchTeam, Set<Integer>> getAllWorlds();
    
    /**
     * Gets the deaths for this WvW match.
     * @return A {@code Map<WvwMatchTeam, Integer>}, never {@code null}, may be empty.
     */
    @MapValue
    Map<WvwMatchTeam, Integer> getDeaths();

    /**
     * Gets the kills for this WvW match.
     * @return A {@code Map<WvwMatchTeam, Integer>}, never {@code null}, may be empty.
     */
    @MapValue
    Map<WvwMatchTeam, Integer> getKills();

    /**
     * Gets detailed information about each map during this match.
     * @return A non-modifiable {@code Set<MatchMap>}, never {@code null}.
     */
    @SetValue
    Set<WvwMatchMap> getMaps();
}
