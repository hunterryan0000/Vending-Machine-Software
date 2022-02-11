package com.techelevator.App;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class VendingMachineCLITest extends TestCase {
    @Test
    public void testTestRun() {
        VendingMachineCLI vendingMachineCLITest = new VendingMachineCLI();

        Assert.assertTrue(vendingMachineCLITest.continueRunning);
        //assertFalse should fail
        Assert.assertFalse(vendingMachineCLITest.continueRunning);

    }

}