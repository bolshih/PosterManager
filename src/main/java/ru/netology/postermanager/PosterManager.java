package ru.netology.postermanager;

public class PosterManager {

    private PosterRepository repo;

    private int lastCount = 10;

    public PosterManager (PosterRepository repo){
        this.repo = repo;
    }

    public void save(PostersData poster){
        repo.save(poster);
    }
    public void findAll(){
        PostersData[] posters = repo.findAll();
        for (PostersData poster : posters){
            System.out.println(poster.getFilmId() + " " + poster.getFilmTitle() + " " + poster.getFilmTipe());
        }
    }
    public PostersData[] getPosters(){
       return repo.getPosters();
    }
   public PostersData[] findLast(){
        PostersData [] all = repo.getPosters();
        PostersData [] lasts = new PostersData[lastCount];
            for (int i = 0; i < lasts.length; i++){
                lasts[i] = all[all.length - 1 - i];
            }
                        for (PostersData last : lasts){
                System.out.println(last.getFilmId() + " " + last.getFilmTitle() + " " + last.getFilmTipe());
            }
        return lasts;
    }

    public PostersData[] findLast(int lastCount){
        this.lastCount=lastCount;
        PostersData [] all = repo.getPosters();
        PostersData [] lasts = new PostersData[lastCount];
        for (int i = 0; i < lasts.length; i++){
            lasts[i] = all[all.length - 1 - i];

        }
        for (PostersData last : lasts){
            System.out.println(last.getFilmId() + " " + last.getFilmTitle() + " " + last.getFilmTipe());
        }
        return lasts;
    }


}
