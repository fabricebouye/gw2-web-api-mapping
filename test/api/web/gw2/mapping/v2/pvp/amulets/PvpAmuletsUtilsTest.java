/* 
 * Copyright (C) 2015-2017 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.pvp.amulets;

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
public class PvpAmuletsUtilsTest {

    public PvpAmuletsUtilsTest() {
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
     * Test of PvpAmuletAttribute.
     */
    @Test
    public void testFindPvpAmuletAttribute() {
        System.out.println("findPvpAmuletAttribute");
        final String[] values = {
            "ConditionDamage", // NOI18N.
            "ConditionDuration", // NOI18N.
            "CritDamage", // NOI18N.
            "Healing", // NOI18N.
            "Power", // NOI18N.
            "Precision", // NOI18N.
            "Toughness", // NOI18N.
            "Vitality", // NOI18N.
            null,
            "" // NOI18N.
        };
        final PvpAmuletAttribute[] expResults = {
            PvpAmuletAttribute.CONDITION_DAMAGE,
            PvpAmuletAttribute.CONDITION_DURATION,
            PvpAmuletAttribute.FEROCITY,
            PvpAmuletAttribute.HEALING,
            PvpAmuletAttribute.POWER,
            PvpAmuletAttribute.PRECISION,
            PvpAmuletAttribute.TOUGHNESS,
            PvpAmuletAttribute.VITALITY,
            PvpAmuletAttribute.UNKNOWN,
            PvpAmuletAttribute.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final PvpAmuletAttribute expResult = expResults[index];
                    final PvpAmuletAttribute result = EnumValueFactory.INSTANCE.mapEnumValue(PvpAmuletAttribute.class, value);
                    assertEquals(expResult, result);
                });
    }
}