package learn.selenium;
import org.junit.Test;
import org.junit.Assert;
/**
 * Created by VaibhavC on 11/25/2016.
 */

public class FirstProgram {

    public static void main (String args[])
    {
        int answer = 2+2;
        Assert.assertEquals("2+2=4", 4, answer);
        System.out.println("Hello World");
    }
}
