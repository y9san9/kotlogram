package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.StreamUtils.*
import com.github.badoualy.telegram.tl.core.TLBytes
import java.io.OutputStream

class TLInputPhotoFileLocation(
        private val id: Long,
        private val accessHash: Long,
        private val fileReference: TLBytes,
        private val thumbSize: TLPhotoSize
) : TLAbsInputFileLocation() {

    override fun serializeBody(stream: OutputStream) {
        writeLong(id, stream)
        writeLong(accessHash, stream)
        writeTLBytes(fileReference, stream)
        writeString(String(thumbSize.serialize()), stream)
    }

    override fun getConstructorId() = 0x40181ffe
    override fun toString() = "inputPhotoFileLocation#40181ffe"
}