package ru.netology.postermanager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PosterManageTest {

    PostersData poster1 = new PostersData(1, "Бладшот", "боевик");
    PostersData poster2 = new PostersData(2, "Вперёд", "мультфильм");
    PostersData poster3 = new PostersData(3, "Джентельмены", "боевик");
    PostersData poster4 = new PostersData(4, "Доспехи бога", "боевик");
    PostersData poster5 = new PostersData(5, "Эйс Вентура: Розыск домашних животных", "комедия");
    PostersData poster6 = new PostersData(6, "Неудержимые", "боевик");
    PostersData poster7 = new PostersData(7, "Малифисента", "фентези");
    PostersData poster8 = new PostersData(8, "Интерстеллар", "Фантастика");
    PostersData poster9 = new PostersData(9, "Джентельмены", "боевик");
    PostersData poster10 = new PostersData(10, "Куб", "ужасы");
    PostersData poster11 = new PostersData(11, "Смурфики", "мультфильм");

    @Test

    public void shoulAddPoster() {
        PosterManager poster = new PosterManager();

        poster.addPoster(poster1);
        poster.addPoster(poster2);
        poster.addPoster(poster3);
        poster.addPoster(poster4);
        poster.addPoster(poster5);
        poster.addPoster(poster6);
        poster.addPoster(poster7);
        poster.addPoster(poster8);
        poster.addPoster(poster9);
        poster.addPoster(poster10);
        poster.addPoster(poster11);

        PostersData[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11};
        PostersData[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast() {
        PosterManager poster = new PosterManager();

        poster.addPoster(poster1);
        poster.addPoster(poster2);
        poster.addPoster(poster3);
        poster.addPoster(poster4);
        poster.addPoster(poster5);
        poster.addPoster(poster6);
        poster.addPoster(poster7);
        poster.addPoster(poster8);
        poster.addPoster(poster9);
        poster.addPoster(poster10);
        poster.addPoster(poster11);

        PostersData[] expected = {poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2};
        PostersData[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast5() {
        PosterManager poster = new PosterManager(5);

        poster.addPoster(poster1);
        poster.addPoster(poster2);
        poster.addPoster(poster3);
        poster.addPoster(poster4);
        poster.addPoster(poster5);
        poster.addPoster(poster6);
        poster.addPoster(poster7);
        poster.addPoster(poster8);
        poster.addPoster(poster9);
        poster.addPoster(poster10);
        poster.addPoster(poster11);

        PostersData[] expected = {poster11, poster10, poster9, poster8, poster7};
        PostersData[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast11() {
        PosterManager poster = new PosterManager(11);

        poster.addPoster(poster1);
        poster.addPoster(poster2);
        poster.addPoster(poster3);
        poster.addPoster(poster4);
        poster.addPoster(poster5);
        poster.addPoster(poster6);
        poster.addPoster(poster7);
        poster.addPoster(poster8);
        poster.addPoster(poster9);
        poster.addPoster(poster10);
        poster.addPoster(poster11);

        PostersData[] expected = {poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        PostersData[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast12() {
        PosterManager poster = new PosterManager(12);

        poster.addPoster(poster1);
        poster.addPoster(poster2);
        poster.addPoster(poster3);
        poster.addPoster(poster4);
        poster.addPoster(poster5);
        poster.addPoster(poster6);
        poster.addPoster(poster7);
        poster.addPoster(poster8);
        poster.addPoster(poster9);
        poster.addPoster(poster10);
        poster.addPoster(poster11);

        PostersData[] expected = {poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        PostersData[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}