package com.github.badoualy.telegram.tl.api;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLUpdateReadFeaturedStickers extends TLAbsUpdate {

    public static final int CONSTRUCTOR_ID = 0x571d2742;

    private final String _constructor = "updateReadFeaturedStickers#571d2742";

    public TLUpdateReadFeaturedStickers() {
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public long getConstructorId() {
        return CONSTRUCTOR_ID;
    }
}
