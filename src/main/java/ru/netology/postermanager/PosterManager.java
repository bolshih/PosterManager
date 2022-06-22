package ru.netology.postermanager;

public class PosterManager {
    private PostersData[] posters = new PostersData[0];
    private int lastCount = 10;

    public void addPoster(PostersData poster){
        PostersData[] tmp = new PostersData[posters.length + 1];
        for (int i = 0; i < posters.length; i++){
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public void findAll(){
        for (PostersData poster : posters){
            System.out.println(poster.getFilmNumber() + " " + poster.getFilmTitle() + " " + poster.getFilmTipe());
        }
    }

    public PostersData[] findLast(){
        PostersData [] all = getPosters();
        PostersData [] lasts = new PostersData[lastCount];
            for (int i = 0; i < lasts.length; i++){
                lasts[i] = all[all.length - 1 - i];
            }
                        for (PostersData last : lasts){
                System.out.println(last.getFilmNumber() + " " + last.getFilmTitle() + " " + last.getFilmTipe());
            }
        return lasts;
    }

    public PostersData[] findLast(int lastCount){
        this.lastCount=lastCount;
        PostersData [] all = getPosters();
        PostersData [] lasts = new PostersData[lastCount];
        for (int i = 0; i < lasts.length; i++){
            lasts[i] = all[all.length - 1 - i];
        }
        for (PostersData last : lasts){
            System.out.println(last.getFilmNumber() + " " + last.getFilmTitle() + " " + last.getFilmTipe());
        }
        return lasts;
    }
    public PostersData[] getPosters(){
            return posters;
    }

}
