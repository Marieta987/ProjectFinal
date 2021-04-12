import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ProjectTest{



    @Test
    public void evens(){
        //Arrange
        int arr[] = new int[]{ 1,4,3,4,8,10};
        //Act
        int result =  Project.evens(arr);
        //Assert
        assertEquals(4,result);
    }


    @Test
    public void isTriangle(){
        int a = 90;
        int b = 60;
        int c = 30;
        String result = Project.isTriangle(a,b,c);
        assertEquals("notTriangle",result);
    }



    @Test
    public void isCardNumber(){
        String num = "167219879087";
        String result = Project.isCardNumber(num);
        assertEquals("invalid",result);
    }

 @Test
    public void nameNull(){
        String Shakira = "Shakira";
        assertNotNull(Shakira,Project.nameNull("Shakira"));

    }

    @Test
    public void discount(){
        int dis = 30;
        int result = Project.discount(4400);
        int dis1 = 10;
        int result1 = Project.discount(800);
        int dis2 = 50;
        int result2 = Project.discount(7800);
        assertEquals(dis,result);
        assertEquals(dis1,result1);
        assertEquals(dis2,result2);

    }


}








