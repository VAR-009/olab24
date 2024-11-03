package Tests;
import org.junit.Assert;
import oldshelf.*;
import newshelf.*;
import org.junit.Test;
public class newTestCases{
    @Test
    public void test1(){
        TextBook t = new TextBook("OOPS");
        Assert.assertEquals("OOPS",NewSelection.getAgeOrTitle(t));
    }
    @Test
    public void test2(){
        Fiction f = new Fiction("The Batman",FictionType.GoK);
        Assert.assertEquals("Ironman",NewSelection.getAgeOrTitle(f));
    }
}