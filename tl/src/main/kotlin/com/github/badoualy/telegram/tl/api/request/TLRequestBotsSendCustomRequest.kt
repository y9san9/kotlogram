package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.TLObjectUtils.SIZE_CONSTRUCTOR_ID
import com.github.badoualy.telegram.tl.TLObjectUtils.computeTLStringSerializedSize
import com.github.badoualy.telegram.tl.api.TLDataJSON
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.serialization.TLDeserializer
import com.github.badoualy.telegram.tl.serialization.TLSerializer
import java.io.IOException

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
class TLRequestBotsSendCustomRequest() : TLMethod<TLDataJSON>() {
    var customMethod: String = ""

    var params: TLDataJSON = TLDataJSON()

    private val _constructor: String = "bots.sendCustomRequest#aa2769ed"

    override val constructorId: Int = CONSTRUCTOR_ID

    constructor(customMethod: String, params: TLDataJSON) : this() {
        this.customMethod = customMethod
        this.params = params
    }

    @Throws(IOException::class)
    override fun deserializeResponse_(tlDeserializer: TLDeserializer): TLDataJSON = tlDeserializer.readTLObject(TLDataJSON::class, TLDataJSON.CONSTRUCTOR_ID)

    @Throws(IOException::class)
    override fun serializeBody(tlSerializer: TLSerializer) = with (tlSerializer)  {
        writeString(customMethod)
        writeTLObject(params)
    }

    @Throws(IOException::class)
    override fun deserializeBody(tlDeserializer: TLDeserializer) = with (tlDeserializer)  {
        customMethod = readString()
        params = readTLObject<TLDataJSON>(TLDataJSON::class, TLDataJSON.CONSTRUCTOR_ID)
    }

    override fun computeSerializedSize(): Int {
        var size = SIZE_CONSTRUCTOR_ID
        size += computeTLStringSerializedSize(customMethod)
        size += params.computeSerializedSize()
        return size
    }

    override fun toString() = _constructor

    override fun equals(other: Any?): Boolean {
        if (other !is TLRequestBotsSendCustomRequest) return false
        if (other === this) return true

        return customMethod == other.customMethod
                && params == other.params
    }
    companion object  {
        const val CONSTRUCTOR_ID: Int = 0xaa2769ed.toInt()
    }
}
