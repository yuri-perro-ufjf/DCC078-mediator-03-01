import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void shouldBeSendDoubtToDevelopers(){
        Player player = new Player();
        assertEquals("We appreciate your Doubt. \n" +
                "Developers answer: We are still working to solve this: My money is gone", player.sendDoubtDevelopers("My money is gone"));
    }

    @Test
    void shouldBeSendComplimentToDevelopers(){
        Player player = new Player();
        assertEquals("We appreciate your Compliment. \n" +
                "Developers answer: Thanks for your support: This is awesome game!", player.sendComplimentDevelopers("This is awesome game!"));
    }
}