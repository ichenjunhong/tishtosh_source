package org.msgpack.p2696b;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: org.msgpack.b.h */
public interface C53797h extends Closeable, Flushable {
    /* renamed from: a */
    void mo113070a(byte b) throws IOException;

    /* renamed from: a */
    void mo113071a(byte b, byte b2) throws IOException;

    /* renamed from: a */
    void mo113072a(byte b, double d) throws IOException;

    /* renamed from: a */
    void mo113073a(byte b, float f) throws IOException;

    /* renamed from: a */
    void mo113074a(byte b, int i) throws IOException;

    /* renamed from: a */
    void mo113075a(byte b, long j) throws IOException;

    /* renamed from: a */
    void mo113076a(byte b, short s) throws IOException;

    /* renamed from: a */
    void mo113077a(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: a */
    void mo113078a(byte[] bArr, int i, int i2) throws IOException;
}
