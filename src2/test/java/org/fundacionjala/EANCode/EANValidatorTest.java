package org.fundacionjala.EANCode;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by SergioLanda on 8/29/2016.
 */
public class EANValidatorTest {

    @Test
    public void test_calculateCheckSum_whenCheckSumMod10equals0() {
        assertTrue(EANValidator.validate("9783815820865"));
    }

    @Test
    public void test_validate_whenNumberIs9783815820864() {
        assertFalse(EANValidator.validate("9783815820864"));
    }

    @Test
    public void test_validate_whenNumberIs9783827317100() {
        assertTrue(EANValidator.validate("9783827317100"));
    }
}
