/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.core;

import api.web.gw2.mapping.v2.characters.CharacterGender;
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
public class EnumValueFactoryTest {

    public EnumValueFactoryTest() {
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
     * Test of findEnumValue method, of class EnumValueFactory.
     */
    @Test
    public void testMapEnumValue_CharacterGender() throws Exception {
        System.out.println("mapEnumValue_CharacterGender");
        EnumValueFactory instance = EnumValueFactory.INSTANCE;
        final String[] values = {
            "Female", // NOI18N.
            "Male", // NOI18N.
            "", // NOI18N.
            null
        };
        final CharacterGender[] expResults = {
            CharacterGender.FEMALE,
            CharacterGender.MALE,
            CharacterGender.UNKNOWN,
            CharacterGender.UNKNOWN

        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).forEach(index -> {
            final String value = values[index];
            final CharacterGender expResult = expResults[index];
            final CharacterGender result = instance.mapEnumValue(CharacterGender.class, value);
            assertEquals(expResult, result);
        });
    }

}
