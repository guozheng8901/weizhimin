package test;

import junit.framework.Assert;
import main.Park;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: software
 * Date: 12-11-11
 * Time: 下午2:46
 * To change this template use File | Settings | File Templates.
 */
public class ParkTest {
    @Test
    public void should_empty_park(){
        Park p=new Park();
        Assert.assertEquals(100,p.should_return_error());
    }
    @Test
    public void should_push(){
        Park p=new Park();
        Assert.assertEquals(0,p.push(99));

    }
    @Test
    public void should_error(){
        Park p=new Park();
        Assert.assertEquals("error",p.push(101));
    }
    @Test
    public void should_pop(){
        Park p=new Park();
        Assert.assertEquals("100",p.pop(1));
    }
    @Test
    public void should_pop_error(){
        Park p=new Park();
        Assert.assertEquals("error",p.pop(0));
    }
}
