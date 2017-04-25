/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.raids;

import api.web.gw2.mapping.v2.pvp.*;
import api.web.gw2.mapping.core.EnumValueFactory;
import java.util.stream.IntStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test.
 * @author Fabrice Bouyé
 */
public class RaidUtilsTest {

    public RaidUtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of PvPLadder.
     */
    @Test
    public void testFindRaidWingEventType() {
        System.out.println("findRaidWingEventType");
        final String[] values = {
            "Boss", // NOI18N.
            "Checkpoint", // NOI18N.
            null,
            "" // NOI18N.
        };
        final RaidWingEventType[] expResults = {
            RaidWingEventType.BOSS,
            RaidWingEventType.CHECKPOINT,
            RaidWingEventType.UNKNOWN,
            RaidWingEventType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final RaidWingEventType expResult = expResults[index];
                    final RaidWingEventType result = EnumValueFactory.INSTANCE.mapEnumValue(RaidWingEventType.class, value);
                    assertEquals(expResult, result);
                    assertEquals(expResult, result);
                });
    }
}