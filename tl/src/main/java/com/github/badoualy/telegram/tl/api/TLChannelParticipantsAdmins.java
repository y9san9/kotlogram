package com.github.badoualy.telegram.tl.api;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLChannelParticipantsAdmins extends TLAbsChannelParticipantsFilter {

    public static final int CONSTRUCTOR_ID = 0xb4608969;

    private final String _constructor = "channelParticipantsAdmins#b4608969";

    public TLChannelParticipantsAdmins() {
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
