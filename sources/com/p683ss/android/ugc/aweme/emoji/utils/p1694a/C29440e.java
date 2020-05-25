package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.e */
final class C29440e implements C29456s {

    /* renamed from: a */
    private final String f77084a;

    C29440e() {
    }

    /* renamed from: a */
    public final boolean mo59515a(String str) {
        return true;
    }

    C29440e(String str) {
        this.f77084a = str;
    }

    /* renamed from: a */
    public final String mo59514a(byte[] bArr) throws IOException {
        if (this.f77084a == null) {
            return new String(bArr);
        }
        return new String(bArr, this.f77084a);
    }

    /* renamed from: b */
    public final ByteBuffer mo59516b(String str) throws IOException {
        if (this.f77084a == null) {
            return ByteBuffer.wrap(str.getBytes());
        }
        return ByteBuffer.wrap(str.getBytes(this.f77084a));
    }
}
