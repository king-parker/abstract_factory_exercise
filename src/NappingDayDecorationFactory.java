public class NappingDayDecorationFactory extends DecorationFactory {
    @Override
    public TableclothPatternProvider CreateTableclothPatternProvider() {
        return new NappingTableclothPatternProvider();
    }

    @Override
    public WallHangingProvider CreateWallHangingProvider() {
        return new NappingWallHangingProvider();
    }

    @Override
    public YardOrnamentProvider CreateYardOrnamentProvider() {
        return new NappingYardOrnamentProvider();
    }
}
