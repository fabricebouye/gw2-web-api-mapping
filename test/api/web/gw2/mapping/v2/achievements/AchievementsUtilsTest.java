/*
 * Copyright (C) 2015-2019 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.achievements;

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
public class AchievementsUtilsTest {

    public AchievementsUtilsTest() {
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
     * Test of AchievementType.
     */
    @Test
    public void testFindAchievementType() {
        System.out.println("findAchievementType"); // NOI18N.
        final String[] values = {
                "Default", // NOI18N.
                "ItemSet", // NOI18N.
                null,
                "" // NOI18N.
        };
        final AchievementType[] expResults = {
                AchievementType.DEFAULT,
                AchievementType.ITEM_SET,
                AchievementType.UNKNOWN,
                AchievementType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final AchievementType expResult = expResults[index];
                    final AchievementType result = EnumValueFactory.INSTANCE.mapEnumValue(AchievementType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of AchievementFlag.
     */
    @Test
    public void testFindAchievementFlag() {
        System.out.println("findAchievementFlag"); // NOI18N.
        final String[] values = {
                "CategoryDisplay", // NOI18N.
                "IgnoreNearlyComplete", // NOI18N.
                "MoveToTop", // NOI18N.
                "Pvp", // NOI18N.
                "RepairOnLogin", // NOI18N.
                "Hidden", // NOI18N.
                "Repeatable", // NOI18N.
                "RequiresUnlock", // NOI18N.
                null,
                "" // NOI18N.
        };
        final AchievementFlag[] expResults = {
                AchievementFlag.CATEGORY_DISPLAY,
                AchievementFlag.IGNORE_NEARLY_COMPLETE,
                AchievementFlag.MOVE_TO_TOP,
                AchievementFlag.PVP,
                AchievementFlag.REPAIR_ON_LOGIN,
                AchievementFlag.HIDDEN,
                AchievementFlag.REPEATABLE,
                AchievementFlag.REQUIRES_UNLOCK,
                AchievementFlag.UNKNOWN,
                AchievementFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final AchievementFlag expResult = expResults[index];
                    final AchievementFlag result = EnumValueFactory.INSTANCE.mapEnumValue(AchievementFlag.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of AchievementRewardType.
     */
    @Test
    public void testFindAchievementRewardType() {
        System.out.println("findAchievementRewardType"); // NOI18N.
        final String[] values = {
                "Item", // NOI18N.
                "Mastery", // NOI18N.
                null,
                "" // NOI18N.
        };
        final AchievementRewardType[] expResults = {
                AchievementRewardType.ITEM,
                AchievementRewardType.MASTERY,
                AchievementRewardType.UNKNOWN,
                AchievementRewardType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final AchievementRewardType expResult = expResults[index];
                    final AchievementRewardType result = EnumValueFactory.INSTANCE.mapEnumValue(AchievementRewardType.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of AchievementRewardRegion.
     */
    @Test
    public void testFindAchievementRewardRegion() {
        System.out.println("findAchievementRewardRegion"); // NOI18N.
        final String[] values = {
                "Maguuma", // NOI18N.
                "Tyria", // NOI18N.
                null,
                "" // NOI18N.
        };
        final AchievementRewardRegion[] expResults = {
                AchievementRewardRegion.MAGUUMA,
                AchievementRewardRegion.TYRIA,
                AchievementRewardRegion.UNKNOWN,
                AchievementRewardRegion.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final AchievementRewardRegion expResult = expResults[index];
                    final AchievementRewardRegion result = EnumValueFactory.INSTANCE.mapEnumValue(AchievementRewardRegion.class, value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of AchievementBitType.
     */
    @Test
    public void testFindAchievementBitType() {
        System.out.println("findAchievementBitType"); // NOI18N.
        final String[] values = {
                "Item", // NOI18N.
                "Minipet", // NOI18N.
                "Skin", // NOI18N.
                "Text", // NOI18N.
                null,
                "" // NOI18N.
        };
        final AchievementBitType[] expResults = {
                AchievementBitType.ITEM,
                AchievementBitType.MINIPET,
                AchievementBitType.SKIN,
                AchievementBitType.TEXT,
                AchievementBitType.UNKNOWN,
                AchievementBitType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final AchievementBitType expResult = expResults[index];
                    final AchievementBitType result = EnumValueFactory.INSTANCE.mapEnumValue(AchievementBitType.class, value);
                    assertEquals(expResult, result);
                });
    }
}
