public class Main {

    public static void main(String[] args) {

        if (args.length > 0) {
            if (args[0].equals("Halloween")) {
                DecorationFactory.setInstance(new HalloweenDecorationFactory());
            }
            else if (args[0].equals("Napping")) {
                DecorationFactory.setInstance(new NappingDayDecorationFactory());
            }
            else {
                System.out.println("Incorrect holiday to decorate for.");
                return;
            }
        }
        else {
            System.out.println("Missing holiday input.");
            return;
        }

        DecorationPlacer decorationPlacer = new DecorationPlacer();

        System.out.println(decorationPlacer.placeDecorations());

    }
}
