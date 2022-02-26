import java.util.Comparator;

public class BlueComp implements Comparator<WebColor> {
    public int compare(WebColor c1, WebColor c2) {
        return c1.getBlue() - c2.getBlue();
    }
}

