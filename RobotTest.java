import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RobotTest.
 *
 * @author  IS Italo Calvino
 * @version 27.12.2016
 */
public class RobotTest
{
    /**
     * Default constructor for test class RobotTest
     */
    public RobotTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /** Va avanti di 1
     */
    @Test
    public void Test01() {
        Robot robot1 = new Robot("C3BO");
        robot1.forward();
        assertEquals(1, robot1.getX());
        assertEquals(0, robot1.getY());
        assertEquals(0, robot1.getDirection());
    }
    
    /** va indietro di 1
     */
    @Test
    public void Test02() {
        Robot robot1 = new Robot("C3BO");
        robot1.backward();
        assertEquals(-1, robot1.getX());
        assertEquals(0, robot1.getY());
        assertEquals(0, robot1.getDirection());
    }

    /** gira a destra
     */
    @Test
    public void Test03() {
        Robot robot1 = new Robot("C3BO");
        robot1.right();
        assertEquals(0, robot1.getX());
        assertEquals(0, robot1.getY());
        assertEquals(3, robot1.getDirection());
    }

    /** gira a sinistra
     */
    @Test
    public void Test04() {
        Robot robot1 = new Robot("C3BO");
        robot1.left();
        assertEquals(0, robot1.getX());
        assertEquals(0, robot1.getY());
        assertEquals(1, robot1.getDirection());
    }
    
    /** esplode
     */
    @Test
    public void Test05()  {
        Robot robot1 = new Robot("C3BO");
        robot1.explode();
        assertEquals(0, robot1.getX());
        assertEquals(0, robot1.getY());
        assertEquals(0, robot1.getDirection());
        assertEquals(true, robot1.isExploded());
    }
    
    /** Va avanti di 5
     */
    @Test
    public void Test06()  {
        Robot robot1 = new Robot("C3BO");
        robot1.forward(5);
        assertEquals(5, robot1.getX());
        assertEquals(0, robot1.getY());
        assertEquals(0, robot1.getDirection());
    }
    
    /** Va indietro di 3
     */
    @Test
    public void Test07()  {
        Robot robot1 = new Robot("C3BO");
        robot1.backward(3);
        assertEquals(-3, robot1.getX());
        assertEquals(0, robot1.getY());
        assertEquals(0, robot1.getDirection());
    }
    
    /** Va in diagonale per 3 volte
     */
    @Test
    public void Test08()  {
        Robot robot = new Robot("C3BO");
        for(int i=0; i<3; i++){
            robot.forward(3);
            robot.left();
            robot.forward();
            robot.right();
        }
        assertEquals(3, robot.getX());
        assertEquals(3, robot.getY());
        assertEquals(0, robot.getDirection());
    }
    
    /** esplode e non si sposta
     */
    @Test
    public void Test09() {
        Robot robot1 = new Robot("C3BO");
        robot1.explode();
        robot1.left();
        robot1.forward();
        assertEquals(0, robot1.getX());
        assertEquals(0, robot1.getY());
        assertEquals(0, robot1.getDirection());
        assertEquals(true, robot1.isExploded());
    }
    
    /** esegue un quadrato di lato 1 e si ritrova nella posizione di partenza
     * 
     */
    @Test
    public void Test11() {
        Robot robot1 = new Robot("C3BO");
        robot1.forward();
        robot1.right();
        robot1.forward();
        robot1.right();
        robot1.forward();
        robot1.right();
        robot1.forward();
        robot1.right();
        assertEquals(0, robot1.getX());
        assertEquals(0, robot1.getY());
        assertEquals(0, robot1.getDirection());
    }
}

