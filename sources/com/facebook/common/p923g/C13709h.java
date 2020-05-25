package com.facebook.common.p923g;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.common.g.h */
public interface C13709h extends Closeable {

    /* renamed from: com.facebook.common.g.h$a */
    public static class C13710a extends RuntimeException {
        public C13710a() {
            super("Invalid bytebuf. Already closed");
        }
    }

    /* renamed from: a */
    byte mo25607a(int i);

    /* renamed from: a */
    int mo25608a();

    /* renamed from: a */
    int mo25609a(int i, byte[] bArr, int i2, int i3);

    /* renamed from: b */
    long mo25610b();

    /* renamed from: c */
    ByteBuffer mo25611c();

    /* renamed from: d */
    boolean mo25612d();
}
