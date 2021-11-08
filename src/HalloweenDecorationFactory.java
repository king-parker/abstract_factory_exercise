public class HalloweenDecorationFactory implements DecorationFactory {
    @Override
    public TableclothPatternProvider CreateTableclothPatternProvider() {
        return new HalloweenTableclothPatternProvider();
    }

    @Override
    public WallHangingProvider CreateWallHangingProvider() {
        return new HalloweenWallHangingProvider();
    }

    @Override
    public YardOrnamentProvider CreateYardOrnamentProvider() {
        return new HalloweenYardOrnamentProvider();
    }
}
