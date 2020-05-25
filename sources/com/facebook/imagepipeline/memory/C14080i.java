package com.facebook.imagepipeline.memory;

import com.facebook.common.p920d.C13689i;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.memory.i */
public final class C14080i implements C14091r, Closeable {

    /* renamed from: a */
    private ByteBuffer f36801a;

    /* renamed from: b */
    private final int f36802b;

    /* renamed from: c */
    private final long f36803c = ((long) System.identityHashCode(this));

    public final int getSize() {
        return this.f36802b;
    }

    public final long getUniqueId() {
        return this.f36803c;
    }

    public final synchronized ByteBuffer getByteBuffer() {
        return this.f36801a;
    }

    public final long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    public final synchronized void close() {
        this.f36801a = null;
    }

    public final synchronized boolean isClosed() {
        boolean z;
        if (this.f36801a == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public C14080i(int i) {
        this.f36801a = ByteBuffer.allocateDirect(i);
        this.f36802b = i;
    }

    public final synchronized byte read(int i) {
        boolean z;
        C13689i.m27657b(!isClosed());
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (i < this.f36802b) {
            z2 = true;
        }
        C13689i.m27655a(z2);
        return this.f36801a.get(i);
    }

    public final void copy(int i, C14091r rVar, int i2, int i3) {
        C13689i.m27652a(rVar);
        if (rVar.getUniqueId() == getUniqueId()) {
            C13689i.m27655a(false);
        }
        if (rVar.getUniqueId() < getUniqueId()) {
            synchronized (rVar) {
                synchronized (this) {
                    m28810a(i, rVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (rVar) {
                m28810a(i, rVar, i2, i3);
            }
        }
    }

    public final synchronized int write(int i, byte[] bArr, int i2, int i3) {
        int a;
        C13689i.m27652a(bArr);
        C13689i.m27657b(!isClosed());
        a = C14093t.m28844a(i, i3, this.f36802b);
        C14093t.m28845a(i, bArr.length, i2, a, this.f36802b);
        this.f36801a.position(i);
        this.f36801a.put(bArr, i2, a);
        return a;
    }

    /* renamed from: a */
    private void m28810a(int i, C14091r rVar, int i2, int i3) {
        if (rVar instanceof C14080i) {
            C13689i.m27657b(!isClosed());
            C13689i.m27657b(!rVar.isClosed());
            C14093t.m28845a(i, rVar.getSize(), i2, i3, this.f36802b);
            this.f36801a.position(i);
            rVar.getByteBuffer().position(i2);
            byte[] bArr = new byte[i3];
            this.f36801a.get(bArr, 0, i3);
            rVar.getByteBuffer().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public final synchronized int read(int i, byte[] bArr, int i2, int i3) {
        int a;
        C13689i.m27652a(bArr);
        C13689i.m27657b(!isClosed());
        a = C14093t.m28844a(i, i3, this.f36802b);
        C14093t.m28845a(i, bArr.length, i2, a, this.f36802b);
        this.f36801a.position(i);
        this.f36801a.get(bArr, i2, a);
        return a;
    }
}
