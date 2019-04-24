/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.wvw.objectives;

import api.web.gw2.mapping.core.EnumValueFactory;

import java.util.stream.IntStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test.
 *
 * @author Fabrice Bouyé
 */
public class WvwObjectivesUtilsTest {

    public WvwObjectivesUtilsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of ObjectiveType.
     */
    @Test
    public void testFindWvwObjectiveType() {
        System.out.println("findWvwObjectiveType");
        final String[] values = {
                "Camp", // NOI18N.
                "Generic", // NOI18N.
                "Keep", // NOI18N.
                "Resource", // NOI18N.
                "Ruins", // NOI18N.
                "Tower", // NOI18N.
                "Castle", // NOI18N.
                "Mercenary", // NOI18N.
                "Spawn", // NOI18N.
                null,
                "" // NOI18N.
        };
        final WvwObjectiveType[] expResults = {
                WvwObjectiveType.CAMP,
                WvwObjectiveType.GENERIC,
                WvwObjectiveType.KEEP,
                WvwObjectiveType.RESOURCE,
                WvwObjectiveType.RUINS,
                WvwObjectiveType.TOWER,
                WvwObjectiveType.CASTLE,
                WvwObjectiveType.MERCENARY,
                WvwObjectiveType.SPAWN,
                WvwObjectiveType.UNKNOWN,
                WvwObjectiveType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final WvwObjectiveType expResult = expResults[index];
                    final WvwObjectiveType result = EnumValueFactory.INSTANCE.mapEnumValue(WvwObjectiveType.class, value);
                    assertEquals(expResult, result);
                });
    }

}
