/* 
 * Copyright (C) 2015 Fabrice Bouyé
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD license.  See the LICENSE file for details.
 */
package api.web.gw2.mapping.v2.skins;

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
public class SkinsUtilsTest {

    public SkinsUtilsTest() {
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
     * Test of findSkinType method, of class SkinsUtils.
     */
    @Test
    public void testFindSkinType() {
        System.out.println("findSkinType");
        final String[] values = {
            "Armor", // NOI18N.
            "Back", // NOI18N.
            "Weapon", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkinType[] expResults = {
            SkinType.ARMOR,
            SkinType.BACK,
            SkinType.WEAPON,
            SkinType.UNKNOWN,
            SkinType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkinType expResult = expResults[index];
                    final SkinType result = SkinsUtils.findSkinType(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findSkinFlag method, of class SkinsUtils.
     */
    @Test
    public void testFindSkinFlag() {
        System.out.println("findSkinFlag");
        final String[] values = {
            "HideIfLocked", // NOI18N.
            "NoCost", // NOI18N.
            "ShowInWardrobe", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkinFlag[] expResults = {
            SkinFlag.HIDE_IF_LOCKED,
            SkinFlag.NO_COST,
            SkinFlag.SHOW_IN_WARDROBE,
            SkinFlag.UNKNOWN,
            SkinFlag.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkinFlag expResult = expResults[index];
                    final SkinFlag result = SkinsUtils.findSkinFlag(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findSkinArmorType method, of class SkinsUtils.
     */
    @Test
    public void testFindSkinArmorType() {
        System.out.println("findSkinArmorType");
        final String[] values = {
            "Backpack", // NOI18N.
            "Boots", // NOI18N.
            "Coat", // NOI18N.
            "Helm", // NOI18N.
            "HelmAquatic", // NOI18N.
            "Leggings", // NOI18N.
            "Shoulders", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkinArmorType[] expResults = {
            SkinArmorType.BACKPACK,
            SkinArmorType.BOOTS,
            SkinArmorType.COAT,
            SkinArmorType.HELM,
            SkinArmorType.HELM_AQUATIC,
            SkinArmorType.LEGGINGS,
            SkinArmorType.SHOULDERS,
            SkinArmorType.UNKNOWN,
            SkinArmorType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkinArmorType expResult = expResults[index];
                    final SkinArmorType result = SkinsUtils.findSkinArmorType(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findSkinWeaponType method, of class SkinsUtils.
     */
    @Test
    public void testFindSkinWeaponType() {
        System.out.println("findSkinWeaponType");
        final String[] values = {
            "Axe", // NOI18N.
            "Dagger", // NOI18N.
            "Focus", // NOI18N.
            "Greatsword", // NOI18N.
            "Hammer", // NOI18N.
            "Harpoon", // NOI18N.
            "LongBow", // NOI18N.
            "Mace", // NOI18N.
            "Pistol", // NOI18N.
            "Rifle", // NOI18N.
            "Scepter", // NOI18N.
            "Shield", // NOI18N.
            "ShortBow", // NOI18N.
            "Speargun", // NOI18N.
            "Staff", // NOI18N.
            "Sword", // NOI18N.
            "Torch", // NOI18N.
            "Trident", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkinWeaponType[] expResults = {
            SkinWeaponType.AXE,
            SkinWeaponType.DAGGER,
            SkinWeaponType.FOCUS,
            SkinWeaponType.GREATSWORD,
            SkinWeaponType.HAMMER,
            SkinWeaponType.HARPOON,
            SkinWeaponType.LONG_BOW,
            SkinWeaponType.MACE,
            SkinWeaponType.PISTOL,
            SkinWeaponType.RIFLE,
            SkinWeaponType.SCEPTER,
            SkinWeaponType.SHIELD,
            SkinWeaponType.SHORT_BOW,
            SkinWeaponType.SPEARGUN,
            SkinWeaponType.STAFF,
            SkinWeaponType.SWORD,
            SkinWeaponType.TORCH,
            SkinWeaponType.TRIDENT,
            SkinWeaponType.UNKNOWN,
            SkinWeaponType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkinWeaponType expResult = expResults[index];
                    final SkinWeaponType result = SkinsUtils.findSkinWeaponType(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findSkinArmorWeightClass method, of class SkinsUtils.
     */
    @Test
    public void testFindSkinArmorWeightClass() {
        System.out.println("findSkinArmorWeightClass");
        final String[] values = {
            "Heavy", // NOI18N.
            "Light", // NOI18N.
            "Medium", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkinArmorWeightClass[] expResults = {
            SkinArmorWeightClass.HEAVY,
            SkinArmorWeightClass.LIGHT,
            SkinArmorWeightClass.MEDIUM,
            SkinArmorWeightClass.UNKNOWN,
            SkinArmorWeightClass.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkinArmorWeightClass expResult = expResults[index];
                    final SkinArmorWeightClass result = SkinsUtils.findSkinArmorWeightClass(value);
                    assertEquals(expResult, result);
                });
    }

    /**
     * Test of findSkinWeaponDamageType method, of class SkinsUtils.
     */
    @Test
    public void testFindSkinWeaponDamageType() {
        System.out.println("findSkinWeaponDamageType");
        final String[] values = {
            "Fire", // NOI18N.
            "Ice", // NOI18N.
            "Lightning", // NOI18N.
            "Physical", // NOI18N.
            null,
            "" // NOI18N.
        };
        final SkinWeaponDamageType[] expResults = {
            SkinWeaponDamageType.FIRE,
            SkinWeaponDamageType.ICE,
            SkinWeaponDamageType.LIGHTNING,
            SkinWeaponDamageType.PHYSICAL,
            SkinWeaponDamageType.UNKNOWN,
            SkinWeaponDamageType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final SkinWeaponDamageType expResult = expResults[index];
                    final SkinWeaponDamageType result = SkinsUtils.findSkinWeaponDamageType(value);
                    assertEquals(expResult, result);
                });
    }
}