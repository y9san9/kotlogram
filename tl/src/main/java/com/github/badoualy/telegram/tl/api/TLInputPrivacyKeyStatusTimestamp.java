package com.github.badoualy.telegram.tl.api;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLInputPrivacyKeyStatusTimestamp extends TLAbsInputPrivacyKey {

    public static final int CONSTRUCTOR_ID = 0x4f96cb18;

    private final String _constructor = "inputPrivacyKeyStatusTimestamp#4f96cb18";

    public TLInputPrivacyKeyStatusTimestamp() {
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
