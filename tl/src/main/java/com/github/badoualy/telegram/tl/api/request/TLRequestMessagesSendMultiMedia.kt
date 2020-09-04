package com.github.badoualy.telegram.tl.api.request

import com.github.badoualy.telegram.tl.StreamUtils
import com.github.badoualy.telegram.tl.TLContext
import com.github.badoualy.telegram.tl.api.TLAbsUpdates
import com.github.badoualy.telegram.tl.core.TLMethod
import java.io.InputStream
import java.io.OutputStream

class TLRequestMessagesSendMultiMedia(val silent: Boolean) : TLMethod<TLAbsUpdates>() {
    override fun getConstructorId() = 0xcc0110cb

    override fun serializeBody(stream: OutputStream?) {

    }

    override fun deserializeResponse(stream: InputStream?, context: TLContext?): TLAbsUpdates {
        return StreamUtils.readTLObject(stream, context) as TLAbsUpdates
    }
}