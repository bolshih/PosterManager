package ru.netology.postermanager;

public class PosterRepository {

    private PostersData[] posters = new PostersData[0];


    public void save(PostersData poster) {
        PostersData[] tmp = new PostersData[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public PostersData[] findAll(){
        return posters;
    }
    public PostersData[] getPosters(){
        return posters;
    }
    public PostersData[] findById(int filmId){
        int indexCount = 0;
        PostersData[] tmp = new PostersData[1];
       for (PostersData poster : posters){
           if (poster.getFilmId() != filmId){
                indexCount++;
           }
            else {
                tmp[0] = posters[indexCount];
               return tmp;
           }
        }
return null;
    }

    public PostersData[] removeById(int filmId){
        PostersData[] tmp = new PostersData[posters.length - 1];
        int copyToIndex = 0;
        for (PostersData poster : posters){
            if (poster.getFilmId() != filmId){
                tmp[copyToIndex] = poster;
                copyToIndex++;
            }
        }
        posters = tmp;
        return tmp;
    }

    public void removeAll(){
        PostersData[] clianer = {};
        posters = clianer;
    }
}


