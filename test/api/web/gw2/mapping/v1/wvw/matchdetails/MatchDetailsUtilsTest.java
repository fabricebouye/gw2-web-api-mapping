/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.v1.wvw.matchdetails;

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
public class MatchDetailsUtilsTest {

    public MatchDetailsUtilsTest() {
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
     * Test of MatchDetailsMapType.
     */
    @Test
    public void testFindMatchDetailsMapType() {
        System.out.println("findMatchDetailsMapType");
        final String[] values = {
                "BlueHome", // NOI18N.
                "Center", // NOI18N.
                "GreenHome", // NOI18N.
                "RedHome", // NOI18N.
                null,
                "" // NOI18N.
        };
        final MatchDetailsMapType[] expResults = {
                MatchDetailsMapType.BLUE_HOME,
                MatchDetailsMapType.CENTER,
                MatchDetailsMapType.GREEN_HOME,
                MatchDetailsMapType.RED_HOME,
                MatchDetailsMapType.UNKNOWN,
                MatchDetailsMapType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MatchDetailsMapType expResult = expResults[index];
                    final MatchDetailsMapType result = EnumValueFactory.INSTANCE.mapEnumValue(MatchDetailsMapType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of MatchDetailsBonusOwner.
     */
    @Test
    public void testFindMatchDetailsBonusOwner() {
        System.out.println("findMatchDetailsBonusOwner");
        final String[] values = {
                "Blue", // NOI18N.
                "Green", // NOI18N.
                "Red", // NOI18N.
                null,
                "" // NOI18N.
        };
        final MatchDetailsBonusOwner[] expResults = {
                MatchDetailsBonusOwner.BLUE,
                MatchDetailsBonusOwner.GREEN,
                MatchDetailsBonusOwner.RED,
                MatchDetailsBonusOwner.UNKNOWN,
                MatchDetailsBonusOwner.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MatchDetailsBonusOwner expResult = expResults[index];
                    final MatchDetailsBonusOwner result = EnumValueFactory.INSTANCE.mapEnumValue(MatchDetailsBonusOwner.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of MatchDetailsObjectiveOwner.
     */
    @Test
    public void testFindMatchDetailsObjectiveOwner() {
        System.out.println("findMatchDetailsObjectiveOwner");
        final String[] values = {
                "Blue", // NOI18N.
                "Green", // NOI18N.
                "Neutral", // NOI18N.
                "Red", // NOI18N.
                null,
                "" // NOI18N.
        };
        final MatchDetailsObjectiveOwner[] expResults = {
                MatchDetailsObjectiveOwner.BLUE,
                MatchDetailsObjectiveOwner.GREEN,
                MatchDetailsObjectiveOwner.NEUTRAL,
                MatchDetailsObjectiveOwner.RED,
                MatchDetailsObjectiveOwner.UNKNOWN,
                MatchDetailsObjectiveOwner.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final MatchDetailsObjectiveOwner expResult = expResults[index];
                    final MatchDetailsObjectiveOwner result = EnumValueFactory.INSTANCE.mapEnumValue(MatchDetailsObjectiveOwner.class, value);
                    assertEquals(expResult, result);
                });

    }

}
