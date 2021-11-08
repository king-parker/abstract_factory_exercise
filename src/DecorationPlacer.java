public class DecorationPlacer {

    private TableclothPatternProvider tableclothPattern = new HalloweenTableclothPatternProvider();
    private WallHangingProvider wallHanging = new HalloweenWallHangingProvider();
    private YardOrnamentProvider yardOrnament = new HalloweenYardOrnamentProvider();

    public DecorationPlacer() {

    }

    public String placeDecorations() {
        return "Everything was ready for the party. The " + yardOrnament.getOrnament()
                + " was in front of the house, the " + wallHanging.getHanging()
                + " was hanging on the wall, and the tablecloth with " + tableclothPattern.getTablecloth()
                + " was spread over the table.";
    }
}
