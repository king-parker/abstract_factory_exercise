public class Main {

    public static void main(String[] args) {

        DecorationFactory.setInstance(new HalloweenDecorationFactory());

        DecorationPlacer decorationPlacer = new DecorationPlacer();

        System.out.println(decorationPlacer.placeDecorations());

    }
}
