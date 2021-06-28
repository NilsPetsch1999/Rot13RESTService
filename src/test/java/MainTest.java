import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void test_Given_WeWantToSeeAWelcomeMassage_When_WeGetTheMassage_Then_theMassageShouldBeExactlyHelloRot13(){
        //Arrange


        //Act
        String actual = Main.GetMassage();

        //Assert
        Assertions.assertEquals("hello Rot13",actual);



    }
}
