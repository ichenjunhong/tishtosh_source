package com.squareup.wire;

import com.google.gson.C18095w;
import com.google.gson.p1078c.C17958a;
import com.google.gson.p1078c.C17960b;
import com.google.gson.p1078c.C17961c;
import java.io.IOException;
import okio.ByteString;

class ByteStringTypeAdapter extends C18095w<ByteString> {
    ByteStringTypeAdapter() {
    }

    public ByteString read(C17958a aVar) throws IOException {
        if (aVar.mo34843f() != C17960b.NULL) {
            return ByteString.decodeBase64(aVar.mo34845i());
        }
        aVar.mo34847k();
        return null;
    }

    public void write(C17961c cVar, ByteString byteString) throws IOException {
        if (byteString == null) {
            cVar.mo34870f();
        } else {
            cVar.mo34864b(byteString.base64());
        }
    }
}
