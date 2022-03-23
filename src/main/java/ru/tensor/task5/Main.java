package ru.tensor.task5;

public class Main {
    public static void main(String[] args) {
        File text = new File("text", "txt");
        File video1 = new File("video1", "mp4");
        File video2 = new File("video1", "mp4");
        Folder subfolder1 = new Folder("Subfolder1", text);
        Folder subfolder2 = new Folder("Subfolder2", video1, video2);
        Folder subfolder3 = new Folder("Test");
        Folder root = new Folder("Main folder", subfolder1, subfolder2, subfolder3);
        System.out.println(text.getPath());
        System.out.println(video1.getPath());
        System.out.println(subfolder3.getPath());
        System.out.println(video2.getExtension());
    }
}
;