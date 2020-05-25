package com.facebook.imagepipeline.memory;

import com.facebook.common.p920d.C13689i;
import com.facebook.imagepipeline.nativecode.C14222a;
import java.io.Closeable;
import java.nio.ByteBuffer;

public class NativeMemoryChunk implements C14091r, Closeable {
    private boolean mIsClosed;
    private final long mNativePtr;
    private final int mSize;

    static {
        C14222a.m29163a();
    }

    private static native long nativeAllocate(int i);

    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    private static native void nativeFree(long j);

    private static native void nativeMemcpy(long j, long j2, int i);

    private static native byte nativeReadByte(long j);

    public ByteBuffer getByteBuffer() {
        return null;
    }

    public long getNativePtr() {
        return this.mNativePtr;
    }

    public int getSize() {
        return this.mSize;
    }

    public long getUniqueId() {
        return this.mNativePtr;
    }

    public NativeMemoryChunk() {
        this.mIsClosed = true;
    }

    public synchronized boolean isClosed() {
        return this.mIsClosed;
    }

    public synchronized void close() {
        if (!this.mIsClosed) {
            this.mIsClosed = true;
            nativeFree(this.mNativePtr);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (!isClosed()) {
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public NativeMemoryChunk(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        this.mSize = i;
        this.mNativePtr = nativeAllocate(this.mSize);
        this.mIsClosed = false;
    }

    public synchronized byte read(int i) {
        boolean z;
        C13689i.m27657b(!isClosed());
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (i < this.mSize) {
            z2 = true;
        }
        C13689i.m27655a(z2);
        return nativeReadByte(this.mNativePtr + ((long) i));
    }

    private void doCopy(int i, C14091r rVar, int i2, int i3) {
        if (rVar instanceof NativeMemoryChunk) {
            C13689i.m27657b(!isClosed());
            C13689i.m27657b(!rVar.isClosed());
            C14093t.m28845a(i, rVar.getSize(), i2, i3, this.mSize);
            nativeMemcpy(rVar.getNativePtr() + ((long) i2), this.mNativePtr + ((long) i), i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public void copy(int i, C14091r rVar, int i2, int i3) {
        C13689i.m27652a(rVar);
        if (rVar.getUniqueId() == getUniqueId()) {
            C13689i.m27655a(false);
        }
        if (rVar.getUniqueId() < getUniqueId()) {
            synchronized (rVar) {
                synchronized (this) {
                    doCopy(i, rVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (rVar) {
                doCopy(i, rVar, i2, i3);
            }
        }
    }

    public synchronized int write(int i, byte[] bArr, int i2, int i3) {
        int a;
        C13689i.m27652a(bArr);
        C13689i.m27657b(!isClosed());
        a = C14093t.m28844a(i, i3, this.mSize);
        C14093t.m28845a(i, bArr.length, i2, a, this.mSize);
        nativeCopyFromByteArray(this.mNativePtr + ((long) i), bArr, i2, a);
        return a;
    }

    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        int a;
        C13689i.m27652a(bArr);
        C13689i.m27657b(!isClosed());
        a = C14093t.m28844a(i, i3, this.mSize);
        C14093t.m28845a(i, bArr.length, i2, a, this.mSize);
        nativeCopyToByteArray(this.mNativePtr + ((long) i), bArr, i2, a);
        return a;
    }
}
