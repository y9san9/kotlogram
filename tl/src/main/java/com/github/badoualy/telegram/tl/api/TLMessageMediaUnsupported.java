package com.github.badoualy.telegram.tl.api;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLMessageMediaUnsupported extends TLAbsMessageMedia {

    public static final int CONSTRUCTOR_ID = 0x9f84f49e;

    private final String _constructor = "messageMediaUnsupported#9f84f49e";

    public TLMessageMediaUnsupported() {
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
