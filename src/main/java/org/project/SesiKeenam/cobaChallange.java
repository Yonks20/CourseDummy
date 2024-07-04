package org.project.SesiKeenam;

public class cobaChallange {
    public static void main(String[] args) {
        Challange quiz = new Challange();

        quiz.setTitle("Kuis keluarga");
        quiz.setContent("Kuis ini seru");
        quiz.setPoint(100);

        System.out.println("Judul challange : " + quiz.getTitle());
        System.out.println("Judul challange : " + quiz.getContent());
        System.out.println("Judul challange : " + quiz.getPoint());

        Challange quiz2 = new Challange("Family 100", "Kuis Rame Banget",200);
        System.out.println("Judul challange : " + quiz2.getTitle());
        System.out.println("Desc : " + quiz2.getContent());
        System.out.println("Total Point : " + quiz2.getPoint());

    }
}
