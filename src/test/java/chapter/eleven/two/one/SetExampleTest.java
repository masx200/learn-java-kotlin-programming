package chapter.eleven.two.one;

import org.junit.jupiter.api.Test;

import static chapter.eleven.two.one.SetExample.main;

class SetExampleTest {

    @Test
    void mainTest() {

        main(new String[]{"hello", "world"});
        main(new String[]{"she", "said", "she", "is", "signorina"});
    }
}