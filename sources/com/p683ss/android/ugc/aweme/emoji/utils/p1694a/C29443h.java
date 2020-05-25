package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.h */
final class C29443h implements C29456s {

    /* renamed from: a */
    private final Charset f77093a;

    C29443h(Charset charset) {
        this.f77093a = charset;
    }

    /* renamed from: a */
    public final String mo59514a(byte[] bArr) throws IOException {
        return this.f77093a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString();
    }

    /* renamed from: a */
    public final boolean mo59515a(String str) {
        CharsetEncoder newEncoder = this.f77093a.newEncoder();
        newEncoder.onMalformedInput(CodingErrorAction.REPORT);
        newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        return newEncoder.canEncode(str);
    }

    /* renamed from: b */
    public final ByteBuffer mo59516b(String str) {
        CharsetEncoder newEncoder = this.f77093a.newEncoder();
        newEncoder.onMalformedInput(CodingErrorAction.REPORT);
        newEncoder.onUnmappableCharacter(CodingErrorAction.REPORT);
        CharBuffer wrap = CharBuffer.wrap(str);
        ByteBuffer allocate = ByteBuffer.allocate(str.length() + ((str.length() + 1) / 2));
        while (true) {
            if (wrap.remaining() <= 0) {
                break;
            }
            CoderResult encode = newEncoder.encode(wrap, allocate, true);
            if (encode.isUnmappable() || encode.isMalformed()) {
                if (encode.length() * 6 > allocate.remaining()) {
                    allocate = C29457t.m69485a(allocate, allocate.position() + (encode.length() * 6));
                }
                for (int i = 0; i < encode.length(); i++) {
                    C29457t.m69486a(allocate, wrap.get());
                }
            } else if (encode.isOverflow()) {
                allocate = C29457t.m69485a(allocate, 0);
            } else if (encode.isUnderflow()) {
                newEncoder.flush(allocate);
                break;
            }
        }
        allocate.limit(allocate.position());
        allocate.rewind();
        return allocate;
    }
}
