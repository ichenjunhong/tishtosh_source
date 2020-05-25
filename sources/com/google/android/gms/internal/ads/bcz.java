package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

public interface bcz extends Closeable {
    /* renamed from: a */
    int mo29077a(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: a */
    long mo29078a() throws IOException;

    /* renamed from: a */
    ByteBuffer mo29079a(long j, long j2) throws IOException;

    /* renamed from: a */
    void mo29080a(long j) throws IOException;

    /* renamed from: b */
    long mo29081b() throws IOException;

    void close() throws IOException;
}
