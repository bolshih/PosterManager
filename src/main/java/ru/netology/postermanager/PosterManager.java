package ru.netology.postermanager;

public class PosterManager {
    private PostersData[] posters = new PostersData[0];
    private int lastCount = 10;
    public PosterManager (){

    }
    public PosterManager(int lastCount){
        this.lastCount = lastCount;
    }
    public void addPoster(PostersData poster){
        PostersData[] tmp = new PostersData[posters.length + 1];
        for (int i = 0; i < posters.length; i++){
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public PostersData[] findAll(){
        return posters;
        }


    public PostersData[] findLast(){
        PostersData [] all = findAll();
        int lastLength = 0;

        if (all.length >= lastCount){
            lastLength = lastCount;
        }
        else{
            lastLength = all.length;
        }

        PostersData [] lasts = new PostersData[lastLength];

            for (int i = 0; i < lasts.length; i++) {
                lasts[i] = all[all.length - 1 - i];
            }
        return lasts;
    }
}
