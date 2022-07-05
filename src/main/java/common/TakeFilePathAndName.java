package common;

import java.io.File;

/**
 * @author vert on 2021/10/5
 */
public class TakeFilePathAndName {
    public static void main(String[] args) {
        // This is the path where the file's name you want to take.
        String path = "E://Game//rpg";
        getFile(path);
    }

    private static void getFile(String path) {
        // get file list where the path has
        File file = new File(path);
        // get the folder list
        File[] array = file.listFiles();

        for (int i = 0; i < array.length; i++) {
            System.out.println("|"+ array[i].getName() + "| |");
        }
    }
}
