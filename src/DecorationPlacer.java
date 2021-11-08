public class DecorationPlacer {

    private TableclothPatternProvider tableclothPattern;
    private WallHangingProvider wallHanging;
    private YardOrnamentProvider yardOrnament;

    public DecorationPlacer() {
        tableclothPattern = DecorationFactory.getInstance().CreateTableclothPatternProvider();
        wallHanging = DecorationFactory.getInstance().CreateWallHangingProvider();
        yardOrnament = DecorationFactory.getInstance().CreateYardOrnamentProvider();
    }

    public String placeDecorations() {
        return "Everything was ready for the party. The " + yardOrnament.getOrnament()
                + " was in front of the house, the " + wallHanging.getHanging()
                + " was hanging on the wall, and the tablecloth with " + tableclothPattern.getTablecloth()
                + " was spread over the table.";
    }
}
