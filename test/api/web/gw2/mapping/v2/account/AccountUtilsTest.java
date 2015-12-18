/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.web.gw2.mapping.v2.account;

import java.util.stream.IntStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fabrice
 */
public class AccountUtilsTest {

    public AccountUtilsTest() {
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
     * Test of findAccountAccessType method, of class AccountUtils.
     */
    @Test
    public void testFindAccountAccessType() {
        System.out.println("findAccountAccessType");
        final String[] values = {
            "None", // NOI18N.
            "PlayForFree", // NOI18N.
            "GuildWars2", // NOI18N.
            "HeartOfThorns", // NOI18N.
            null,
            "" // NOI18N.
        };
        final AccountAccessType[] expResults = {
            AccountAccessType.NONE,
            AccountAccessType.PLAY_FOR_FREE,
            AccountAccessType.GUILD_WARS_2,
            AccountAccessType.HEART_OF_THORNS,
            AccountAccessType.UNKNOWN,
            AccountAccessType.UNKNOWN
        };
        assertEquals(values.length, expResults.length);
        IntStream.range(0, values.length).
                forEach(index -> {
                    final String value = values[index];
                    final AccountAccessType expResult = expResults[index];
                    final AccountAccessType result = AccountUtils.findAccountAccessType(value);
                    assertEquals(expResult, result);
                });

    }

}