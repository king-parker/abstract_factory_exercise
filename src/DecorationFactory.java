public abstract class DecorationFactory {
    static private DecorationFactory instance;

    public static void setInstance(DecorationFactory value) {
        instance = value;
    }

    public static DecorationFactory getInstance() {
        return instance;
    }

    abstract public TableclothPatternProvider CreateTableclothPatternProvider();
    abstract public WallHangingProvider CreateWallHangingProvider();
    abstract public YardOrnamentProvider CreateYardOrnamentProvider();
}
