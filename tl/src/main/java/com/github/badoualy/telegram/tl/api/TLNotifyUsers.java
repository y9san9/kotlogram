package com.github.badoualy.telegram.tl.api;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLNotifyUsers extends TLAbsNotifyPeer {

    public static final int CONSTRUCTOR_ID = 0xb4c83b4c;

    private final String _constructor = "notifyUsers#b4c83b4c";

    public TLNotifyUsers() {
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
