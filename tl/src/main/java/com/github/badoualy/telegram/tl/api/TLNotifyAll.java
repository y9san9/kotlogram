package com.github.badoualy.telegram.tl.api;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLNotifyAll extends TLAbsNotifyPeer {

    public static final int CONSTRUCTOR_ID = 0x74d07c60;

    private final String _constructor = "notifyAll#74d07c60";

    public TLNotifyAll() {
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
