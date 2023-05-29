package DiaryPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MikeDiaryTest {
    MikeDiary mikeDiary;
    @BeforeEach
    public void startWih(){
        mikeDiary = new MikeDiary("username", "password");
    }
    @Test
    public  void testThat_DiaryExist(){
        MikeDiary mikeDiary = new MikeDiary("username", "password");
        assertNotNull(mikeDiary);
    }
    @Test
    public void testThat_DiaryIsLocked(){
        assertTrue(mikeDiary.diaryIsLocked());
    }
    @Test
    public void checkPasswordCorrect(){
        boolean password =mikeDiary.checkPassword("password");
        assertTrue(password);
    }
    @Test
    public void checkPassword_Is_InCorrect(){
        boolean password =mikeDiary.checkPassword("passwod");
        assertFalse(password);
    }
    @Test
    public  void userCanCreateEntry(){

        assertNotNull(mikeDiary.getEntry());
    }
    @Test
    public void  testThatEntryCanIncrease(){
        mikeDiary.createEntry("10", "c");
        mikeDiary.createEntry("10", "c");
        mikeDiary.createEntry("10", "c");
        mikeDiary.createEntry("10", "c");
        mikeDiary.createEntry("10", "c");
        assertEquals(5, mikeDiary.countEntry() );
    }



}