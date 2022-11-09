package guru.springframework.spring5jokesappv2.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JokeServiceImplTest {

    private JokeService jokeService;

    @BeforeEach
    void setUp() {
        jokeService = new JokeServiceImpl();
    }

    @Test
    void getJoke() {
        System.out.println("Joke 1 is: " + jokeService.getJoke());
        System.out.println("Joke 2 is: " + jokeService.getJoke());
    }
}