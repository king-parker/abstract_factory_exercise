public class Main {

    public static void main(String[] args) {

        DecorationPlacer decorationPlacer = new DecorationPlacer(new HalloweenDecorationFactory());

        System.out.println(decorationPlacer.placeDecorations());

    }
}
