package model;

public class Message {
    private int img;
    private String name,title,gio;

    public Message() {
    }

    public Message(int img, String name, String title, String gio) {
        this.img = img;
        this.name = name;
        this.title = title;
        this.gio = gio;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGio() {
        return gio;
    }

    public void setGio(String gio) {
        this.gio = gio;
    }
}
