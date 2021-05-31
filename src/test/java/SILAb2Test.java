import org.junit.Before;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class SILAb2Test {

    List<Time> timesList;

    @Before
    void init()
    {
        timesList= new ArrayList<>();
    }

    @Test
    public void test1(){
        timesList.add(new Time(-1,60,60));
        assertThrows(new RuntimeException("The hours are smaller than the minimum"),SILab2::function(timesList));
    }

    @Test
    public void test2(){
        timesList.add(new Time(3,60,60));
        assertThrows(new RuntimeException("The hours are smaller than the minimum"),SILab2::function(timesList));
    }
    @Test
    public void test3(){
        timesList.add(new Time(25,60,60));
        assertThrows(new RuntimeException("The hours are smaller than the minimum"),SILab2::function(timesList));
    }
    @Test
    public void test4(){
        timesList.add(new Time(3,25,25));
        assertThrows(new RuntimeException("The hours are smaller than the minimum"),SILab2::function(timesList));
    }
    @Test
    public void test5(){
        timesList.add(new Time(3,25,60));
        assertThrows(new RuntimeException("The hours are smaller than the minimum"),SILab2::function(timesList));
    }
    @Test
    public void test6(){
        timesList.add(new Time(24,0,0));
        assertThrows(new RuntimeException("The hours are smaller than the minimum"),SILab2::function(timesList));
    }

    @Test
    public void test5(){
        timesList.add(new Time(24,60,60));
        assertThrows(new RuntimeException("The hours are smaller than the minimum"),SILab2::function(timesList));
    }

    @Test
    public void test6(){
        assertThrows(new RuntimeException("The hours are smaller than the minimum"),SILab2::function(timesList));
    }

}
