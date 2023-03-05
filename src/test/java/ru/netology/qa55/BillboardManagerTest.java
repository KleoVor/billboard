package ru.netology.qa55;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BillboardManagerTest {

    @Test
    public void shouldAddedMovies1() {
        BillboardManager manager = new BillboardManager();
        manager.addedMovie("Film1");

        String[] expected = {"Film1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddedMovies2() {
        BillboardManager manager = new BillboardManager();
        manager.addedMovie("Film1");
        manager.addedMovie("Film2");

        String[] expected = {"Film1", "Film2"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test // добавим 11 фильмов
    public void shouldAddedMovies11() {
        BillboardManager manager = new BillboardManager();
        manager.addedMovie("Film1");
        manager.addedMovie("Film2");
        manager.addedMovie("Film3");
        manager.addedMovie("Film4");
        manager.addedMovie("Film5");
        manager.addedMovie("Film6");
        manager.addedMovie("Film7");
        manager.addedMovie("Film8");
        manager.addedMovie("Film9");
        manager.addedMovie("Film10");
        manager.addedMovie("Film11");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5", "Film6", "Film7", "Film8", "Film9", "Film10", "Film11"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastByDef10() {
        BillboardManager manager = new BillboardManager();
        manager.addedMovie("Film1");
        manager.addedMovie("Film2");
        manager.addedMovie("Film3");
        manager.addedMovie("Film4");
        manager.addedMovie("Film5");
        manager.addedMovie("Film6");
        manager.addedMovie("Film7");
        manager.addedMovie("Film8");
        manager.addedMovie("Film9");
        manager.addedMovie("Film10");

        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast10() {
        BillboardManager manager = new BillboardManager(5);

        manager.addedMovie("Film1");
        manager.addedMovie("Film2");
        manager.addedMovie("Film3");
        manager.addedMovie("Film4");
        manager.addedMovie("Film5");
        manager.addedMovie("Film6");
        manager.addedMovie("Film7");
        manager.addedMovie("Film8");
        manager.addedMovie("Film9");
        manager.addedMovie("Film10");

        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLast5() {
        BillboardManager manager = new BillboardManager(5);

        manager.addedMovie("Film1");
        manager.addedMovie("Film2");
        manager.addedMovie("Film3");
        manager.addedMovie("Film4");
        manager.addedMovie("Film5");


        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast4() {
        BillboardManager manager = new BillboardManager(5);

        manager.addedMovie("Film1");
        manager.addedMovie("Film2");
        manager.addedMovie("Film3");
        manager.addedMovie("Film4");


        String[] expected = {"Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
