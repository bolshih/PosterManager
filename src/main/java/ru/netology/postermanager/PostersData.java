package ru.netology.postermanager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PostersData {

    private int filmNumber; // просто чтоб был наглгляднее вывод последних добавленных фильмов
    private String filmTitle;
    private String filmTipe;
}
