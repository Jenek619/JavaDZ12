package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PosterTest {
    Poster service = new Poster(5);

    @Test
    public void shouldFindPosters() {
        Poster service = new Poster();

        String[] expected = {};
        String[] actual = service.findAllPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindMorePosters() {
        Poster service = new Poster();

        service.addPoster("Бладшот");
        service.addPoster("Вперёд");
        service.addPoster("Терминатор");
        service.addPoster("Робокоп");

        String[] expected = {"Бладшот", "Вперёд", "Терминатор","Робокоп"};
        String[] actual = service.findAllPosters();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastPosters() {
        Poster service = new Poster();

        service.addPoster("Бладшот");
        service.addPoster("Вперёд");
        service.addPoster("Терминатор");
        service.addPoster("Робокоп");

        String[] expected = {"Робокоп", "Терминатор", "Вперёд","Бладшот"};
        String[] actual = service.findLastPoster();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastPostersMoreLimit() {
        Poster service = new Poster();

        service.addPoster("Бладшот");
        service.addPoster("Вперёд");
        service.addPoster("Терминатор");
        service.addPoster("Робокоп");
        service.addPoster("Чужой");
        service.addPoster("Хищник");
        service.addPoster("Джеймс Бонд");

        String[] expected = {"Джеймс Бонд","Хищник", "Чужой", "Робокоп","Терминатор"};
        String[] actual = service.findLastPoster();

        Assertions.assertArrayEquals(expected, actual);

    }
}