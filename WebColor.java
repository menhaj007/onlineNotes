import java.util.*;

public class WebColor {

  int r, g, b;

  public WebColor(int r, int g, int b) {
    // Just store the arguments for now, don't worry about invalid values
    this.r = r;
    this.g = g;
    this.b = b;
  }

  public int getRed() {
    return r;
  }

  public int getGreen() {
    return g;
  }

  public int getBlue() {
    return b;
  }

  public int getColor() {
    // Parens are important here, as + has a higher precedence than <<
    return (r << 16) + (g << 8) + b;
  }

  public String toString() {
    return String.format("#%06x", getColor());
  }

  public static void main(String args[]) {
    // For our first iteration, just create and display a couple WebColor objects
    WebColor white = new WebColor(255, 255, 255);
    WebColor sky = new WebColor(106, 207, 247);
    System.out.println("White is: " + white);
    System.out.println("Sky blue is: " + sky);

    // For subsequent iterations, we need several colors to sort..
    // Feel free to replace the entire main() method with the snippets from
    // the text, or uncomment this block if you prefer:

    // ArrayList<WebColor> colors = new ArrayList<>();
    // colors.add(new WebColor(255, 255, 255));
    // colors.add(new WebColor(106, 207, 247));
    // colors.add(new WebColor(240, 134, 222));
    // colors.add(new WebColor(35, 110, 67));
    // colors.add(new WebColor(224, 140, 13));
    // colors.add(new WebColor(52, 4, 184));
    // System.out.println("As added:");
    // for (int i = 0; i < colors.size(); i++) {
    //   System.out.println(" " + i + ": " + colors.get(i));
    // }

    // For the second iteration, use a ColorComp comparator to sort the array.
    // Create our comparator.

    // ColorComp comp = new ColorComp();
    // Collections.sort(colors, comp);
    // System.out.println("After sorting:");
    // for (int i = 0; i < colors.size(); i++) {
    //   System.out.println(" " + i + ": " + colors.get(i));
    // }

    // For the homework assignment, compare on the blue channel using
    // the BlueComp comparator.

    // BlueComp comp = new BlueComp();
    // Collections.sort(colors, comp);
    // System.out.println("After sorting on blue:");
    // for (int i = 0; i < colors.size(); i++) {
    //   System.out.println(" " + i + ": " + colors.get(i));
    // }

    // For Step 2, use a lambda!
    // Collections.sort(colors, (c1, c2) -> c1.getColor() - c2.getColor());
    // System.out.println("After sorting with a lambda:");
    // for (int i = 0; i < colors.size(); i++) {
    //   System.out.println(" " + i + ": " + colors.get(i));
    // }
  }
}
