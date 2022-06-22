package ru.netology.postermanager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
public class PosterManageTest {

    PosterRepository repo = Mockito.mock(PosterRepository.class);
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


    @Test

    public void shoulAddPoster(){
        PostersData[] posters ={poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11};
        doReturn(posters).when(repo).getPosters();

        PostersData[] expected = {poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11};
        PostersData[] actual = manager.getPosters();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast(){
        PostersData[] posters ={poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11};
        doReturn(posters).when(repo).getPosters();

        PostersData[] expected = {poster11, poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2};
        PostersData[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast5(){
        PostersData[] posters ={poster1, poster2, poster3, poster4, poster5, poster6, poster7, poster8, poster9, poster10, poster11};
        doReturn(posters).when(repo).getPosters();

        PostersData[] expected = {poster11, poster10, poster9, poster8, poster7};
        PostersData[] actual = manager.findLast(5);
        Assertions.assertArrayEquals(expected, actual);
    }

}
