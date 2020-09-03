package com.github.badoualy.telegram.tl.api;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLUpdateSavedGifs extends TLAbsUpdate {

    public static final int CONSTRUCTOR_ID = 0x9375341e;

    private final String _constructor = "updateSavedGifs#9375341e";

    public TLUpdateSavedGifs() {
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
