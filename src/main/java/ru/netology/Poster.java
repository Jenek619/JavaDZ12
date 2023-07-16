package ru.netology;

public class Poster {
    private String[] posters = new String[0];
    public int limit;
    public Poster() {
        this.limit = 5;
    }
    public Poster(int limit) {
        this.limit = limit;
    }

    public void addPoster(String poster) {
        String[] tmp = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;

    }

    public String[] findAllPosters() {
        return posters;
    }

    public String[] findLastPoster() {
        int resultLength;
        if (posters.length < limit) {
            resultLength = posters.length;
        } else {
            resultLength = limit;
        }

        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }
        return tmp;

    }
}
