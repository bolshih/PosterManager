package ru.netology.postermanager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class PosterRepositoryTest {

    PosterRepository repo = new PosterRepository();
    PosterManager manager = new PosterManager(repo);

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

    @BeforeEach
    public void setup() {
        manager.save(poster1);
        manager.save(poster2);
        manager.save(poster3);
        manager.save(poster4);
        manager.save(poster5);
        manager.save(poster6);
        manager.save(poster7);
        manager.save(poster8);
        manager.save(poster9);
        manager.save(poster10);
        manager.save(poster11);
    }

        @Test

        public void shouldFindAll () {
            PostersData[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11};
            PostersData[] actual = repo.findAll();

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test

        public void shoulSaver () {
            PostersData[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11};
            PostersData[] actual = repo.getPosters();

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldfindById () {

            PostersData[] expected = {poster5};
            PostersData[] actual = repo.findById(poster5.getFilmId());

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldRemoveById () {
            PostersData[] expected = {poster1, poster2, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11};
            PostersData[] actual = repo.removeById(poster3.getFilmId());

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test
        public void shoulRemoveAll () {
            repo.removeAll();
            PostersData[] expected = {};
            PostersData[] actual = repo.getPosters();

            Assertions.assertArrayEquals(expected, actual);
        }
}





