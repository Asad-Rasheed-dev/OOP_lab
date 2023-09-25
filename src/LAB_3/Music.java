package LAB_3;

public class Music {
    String title;
    String duration;
    String genre;
    Date releaseDate;
    Singer singer;

    public Music(String title, String duration, String genre, Date releaseDate, Singer singer) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {

        return String.format("Title: %s\n Duration: %s\n Genre: %s\n Release Date: %s\n \nSinger Information\n %s\n",title, duration, genre, releaseDate, singer);

    }

    public boolean equals(Music m) {
        return this.title.equals(m.title)? true:false;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Music music = (Music) o;
//        return Objects.equals(title, music.title);
//    }
}
