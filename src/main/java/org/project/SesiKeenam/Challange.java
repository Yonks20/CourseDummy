package org.project.SesiKeenam;

public class Challange {
    //class dengan beberapa field
    // inisilasisi field dengan getter/setter dan constructor

    private String title;

    private String content;

    private int point;

    //default constructor
    public Challange() {
    //karena nge set secara manual
    }


    //paramaterized constructor
    public Challange(String title, String content, int point) {
        this.title = title;
        this.content = content;
        this.point = point;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return this.point;
    }
}
