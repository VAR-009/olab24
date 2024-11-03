package Tests;

import org.junit.Assert;
import oldshelf.*;
import org.junit.Test;

public class oldTestCases{
    @Test
    public void test1(){
        TextBook tb = new TextBook("OOPS");
        Assert.assertEquals(OldSelection.getAgeOrTitle(tb),"OOPS");
    }
    @Test
    public void test2(){
        Fiction f = new Fiction("The Batman",FictionType.GoK);
        Assert.assertEquals(OldSelection.getAgeOrTitle(f),"Ironman");
    }
}