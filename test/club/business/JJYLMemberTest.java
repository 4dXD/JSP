/*
 * JJYLMemberTest.java
 * Assignment4
 * Revision History:
 *      Jeonghwan Ju, 2020.04.16: Created
 */
package club.business;

import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jujeo
 */
public class JJYLMemberTest {
    
    public JJYLMemberTest() {
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
     * Test of getFullName method, of class Member.
     */
    @Test
    public void testGetFullName() {
        System.out.println("getFullName");
        Member instance = new Member();        
        instance.setFullName("Jeonghwan Ju");
        String expResult = "Jeonghwan Ju";                
        String result = instance.getFullName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.        
    }

    /**
     * Test of setFullName method, of class Member.
     */
    @Test
    public void testSetFullName() {
        System.out.println("setFullName");        
        String fullName = "Yoonho Lee";
        Member instance = new Member();
        instance.setFullName(fullName);
        assertEquals(fullName, instance.getFullName());        
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEmailAddress method, of class Member.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        Member instance = new Member();
        instance.setEmailAddress("jju7969@conestogac.on.ca");
        String expResult = "jju7969@conestogac.on.ca";        
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEmailAddress method, of class Member.
     */
    @Test
    public void testSetEmailAddress() {
        System.out.println("setEmailAddress");
        String emailAddress = "ylee8785@conestogac.on.ca";
        Member instance = new Member();
        instance.setEmailAddress(emailAddress);
        assertEquals(emailAddress, instance.getEmailAddress());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPhoneNumber method, of class Member.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Member instance = new Member();
        instance.setPhoneNumber("111-222-3333");
        String expResult = "111-222-3333";
        String result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPhoneNumber method, of class Member.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "333-222-1111";
        Member instance = new Member();
        instance.setPhoneNumber(phoneNumber);
        assertEquals(phoneNumber, instance.getPhoneNumber());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getProgramName method, of class Member.
     */
    @Test
    public void testGetProgramName() {
        System.out.println("getProgramName");
        Member instance = new Member();
        instance.setProgramName("Computer Programming");
        String expResult = "Computer Programming";
        String result = instance.getProgramName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setProgramName method, of class Member.
     */
    @Test
    public void testSetProgramName() {
        System.out.println("setProgramName");
        String programName = "Computer Programming";
        Member instance = new Member();
        instance.setProgramName(programName);
        assertEquals(programName, instance.getProgramName());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getYearLevel method, of class Member.
     */
    @Test
    public void testGetYearLevel() {
        System.out.println("getYearLevel");
        Member instance = new Member();
        instance.setYearLevel(2);        
        int expResult = 2;
        int result = instance.getYearLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setYearLevel method, of class Member.
     */
    @Test
    public void testSetYearLevel() {
        System.out.println("setYearLevel");
        int yearLevel = 2;
        Member instance = new Member();
        instance.setYearLevel(yearLevel);
        assertEquals(yearLevel, instance.getYearLevel());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of isValid method, of class Member.
     */
    @Test
    public void testValidPositive() {
        System.out.println("isValidPositive");
        Member instance = new Member();
        
        instance.setFullName("Jeonghwan Ju");
        instance.setEmailAddress("jju7969@conestogac.on.ca");
        
        boolean expResult = true;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of isValid method, of class Member.
     */
    @Test
    public void testValidNegative() {
        System.out.println("isValidNegative");
        Member instance = new Member();
        
        instance.setFullName("Yoonho Lee");
        instance.setEmailAddress("");
        
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of isValid method, of class Member.
     */
    /*
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        Member instance = new Member();
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
