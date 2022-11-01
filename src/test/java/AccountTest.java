import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void correctNameTest(){
        Account account = new Account("Влад Жученко");
        boolean actualResult = account.checkNameToEmboss();
        boolean expectedResult = true;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void nameStartsWithSpace(){
        Account account = new Account(" Влад Жученко");
        boolean actualResult = account.checkNameToEmboss();
        boolean expectedResult = false;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void nameEndsWithSpace(){
        Account account = new Account("Влад Жученко ");
        boolean actualResult = account.checkNameToEmboss();
        boolean expectedResult = false;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void nameIsEmpty(){
        Account account = new Account("");
        boolean actualResult = account.checkNameToEmboss();
        boolean expectedResult = false;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void nameIsLessThan3Characters(){
        Account account = new Account("Вл");
        boolean actualResult = account.checkNameToEmboss();
        boolean expectedResult = false;
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void nameIsMoreThan19Characters(){
        Account account = new Account("Влад Жученковскихский-Сан");
        boolean actualResult = account.checkNameToEmboss();
        boolean expectedResult = false;
        assertEquals(actualResult, expectedResult);
    }


}
