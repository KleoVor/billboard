package ru.netology.qa55;

public class BillboardManager {

    private int limit; // переменная через которую можно задать лимит вывода фильмов из афиши

    public BillboardManager() {
        limit = 10;
    }

    public BillboardManager(int limit) {
        this.limit = limit;
    }


    private String[] movies = new String[0];

    // метод добавления фильма в афишу
    public void addedMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    // метод вывода всех фильмов, добавленных в афишу в порядке добавления
    public String[] findAll() {
        return movies;
    }

    //Вывод максимального лимита последних добавленных фильмов в обратном от добавления порядке
    // по умолчанию выводится 10

    public String[] findLast() {
        int reversLength;
        if (movies.length < limit) {
            reversLength = movies.length;
        } else reversLength = limit;

        String[] revers = new String[reversLength];
        for (int i = 0; i < revers.length; i++) {
            revers[i] = movies[movies.length - 1 - i];

        }
        return revers;
    }
}
