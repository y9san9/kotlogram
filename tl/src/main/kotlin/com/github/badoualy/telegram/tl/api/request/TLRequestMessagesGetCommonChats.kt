package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_INT32
import com.github.badoualy.telegram.tl.api.TLAbsInputUser
import com.github.badoualy.telegram.tl.api.TLInputUserEmpty
import com.github.badoualy.telegram.tl.api.messages.TLAbsChats
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestMessagesGetCommonChats() : TLMethod<TLAbsChats>() {
    var userId: TLAbsInputUser = TLInputUserEmpty()

    var maxId: Int = 0

    var limit: Int = 0

    private val _constructor: String = "messages.getCommonChats#d0a48c4"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(
            userId: TLAbsInputUser,
            maxId: Int,
            limit: Int
    ) : this() {
        this.userId = userId
        this.maxId = maxId
        this.limit = limit
    }

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeTLObject(userId)
        writeInt(maxId)
        writeInt(limit)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        userId = readTLObject<TLAbsInputUser>()
        maxId = readInt()
        limit = readInt()
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += userId.computeSerializedSize()
        size += SIZE_INT32
        size += SIZE_INT32
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestMessagesGetCommonChats) return false
        if (other === this) return true

        return userId == other.userId
                && maxId == other.maxId
                && limit == other.limit
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xd0a48c4.toInt()
    }
}
