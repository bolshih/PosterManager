package ru.netology.postermanager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class PostersData {

    private int filmId;
    private String filmTitle;
    private String filmTipe;

    public int getFilmId() {
        return filmId;
    }
}
