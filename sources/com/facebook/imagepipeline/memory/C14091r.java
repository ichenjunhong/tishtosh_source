package com.facebook.imagepipeline.memory;

import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.memory.r */
public interface C14091r {
    void close();

    void copy(int i, C14091r rVar, int i2, int i3);

    ByteBuffer getByteBuffer();

    long getNativePtr() throws UnsupportedOperationException;

    int getSize();

    long getUniqueId();

    boolean isClosed();

    byte read(int i);

    int read(int i, byte[] bArr, int i2, int i3);

    int write(int i, byte[] bArr, int i2, int i3);
}