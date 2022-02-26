import java.util.*;
import java.io.*;

public class FileSetDemo {
  public static void main(String args[]) {
    TreeSet<File> recentFiles = new TreeSet<>((f1, f2) -> f1.getName().compareTo(f2.getName()));
    recentFiles.add(new File("/tmp/check.txt"));
    recentFiles.add(new File("/Documents/contents.doc"));
    recentFiles.add(new File("/home/marc/startup.sh"));
    recentFiles.add(new File("/library/info.txt"));
    recentFiles.add(new File("/Downloads/episodes.json"));

    System.out.println("Full paths:");
    Iterator<File> i = recentFiles.iterator();
    while(i.hasNext()) {
      File f = i.next();
      System.out.println("  " + f.getAbsolutePath());
    }

    System.out.println("Just names:");
    i = recentFiles.iterator();
    while(i.hasNext()) {
      File f = i.next();
      System.out.println("  " + f.getName());
    }
  }
}
