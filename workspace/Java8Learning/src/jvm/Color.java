import java.util.HashMap;
import java.util.Map;

class Color {
    private static final Map < Integer, Color > CACHE =
        new HashMap < > ();
    private final int hex;
    static Color makeFromPalette(int red, int green, int blue) {
        final int hex = red << 16 + green << 8 + blue;
        return Color.CACHE.computeIfAbsent(
            hex, h - > new Color(h)
        );
    }
    private Color(int h) {
        return new Color(h);
    }
}