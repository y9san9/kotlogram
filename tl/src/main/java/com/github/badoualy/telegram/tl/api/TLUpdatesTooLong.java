package com.github.badoualy.telegram.tl.api;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLUpdatesTooLong extends TLAbsUpdates {

    public static final int CONSTRUCTOR_ID = 0xe317af7e;

    private final String _constructor = "updatesTooLong#e317af7e";

    public TLUpdatesTooLong() {
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
