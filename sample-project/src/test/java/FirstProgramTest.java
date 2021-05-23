import org.junit.Test;

import static org.junit.Assert.*;

public class FirstProgramTest {
    FirstProgram first;

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("------Framework started------");
        first= new FirstProgram();
        System.out.println("------Object created------");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("----Clean up---");
    }

    @org.junit.Test
    public void verificationOfSum() {
        System.out.println("--Inside verification sum");
        assertEquals(11,first.sum(5,6));
        assertEquals(20,first.sum(15,5));
        assertFalse(21==first.sum(15,5));
    }

    @org.junit.Test
    public void verifySub() {
        System.out.println("--Inside verification sub");
        assertEquals(-1,first.sub(5,6));
        assertEquals(10,first.sub(15,5));
        assertFalse(21==first.sub(15,5));
        assertTrue(10==first.sub(15,5));



    }

    @Test
    public void myPractice(){
        FirstProgram test=null;
        assertNotSame("Ramu","Hari");
       // assertArrayEquals((9,1,2],[1,2]);
        assertNotEquals(6,5);
        assertSame("Hari","Hari");
        assertNull(test);
        assertNotNull("Jan");
        //assertThat("abcde","abc");
    }

    @Test
    public void testGreeting(){
        first.greeting();
        //verify(first,times(1)).greeting();
    }

    @Test
    public void testVoid(){

        first.noNeed(10);
        assertEquals(20,first.getValue());
    }

//
//    @org.junit.Test
//    public void mul() {
//    }
//
//    @org.junit.Test
//    public void div() {
//    }
//
//    @org.junit.Test
//    public void modDiv() {
//    }
}