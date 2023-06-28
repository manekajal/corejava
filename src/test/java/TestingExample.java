import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestingExample {

    @Test
    public void addition(){

        assertEquals(19,JunitTesting.add(13,9));

    }


    @Test // this metod is test method
    public void testMaxfind(){
        System.out.println("   Test the array size");
        assertEquals(10,JunitTesting.maxArray(new int[]{1,2,4,5,6,7,8,9,10}));

    }
//    @Test(timeout =1000)
//    public void add(){
//        int result=2+3;
//        assertEquals(5,result);
//        System.out.println(+result);
//    }
//
//    @BeforeClass//
//    public static void message(){
//        System.out.println("hello");
//    }
//
//    @Before
//    public  void welcome(){
//
//        System.out.println(" Welcome");
//    }
//    @AfterClass
//    public static void last(){
//        System.out.println("end the program");
//    }
//
//    @After
//    public void lastMethod(){
//        System.out.println("end the method");
//    }
//
//    @Test(expected = ArithmeticException.class)
//    public void testDivisionByZero(){
//        int div =10/0;
//    }



}
