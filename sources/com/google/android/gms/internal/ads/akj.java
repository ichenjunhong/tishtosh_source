package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

@C16299uq
final class akj implements bcz {

    /* renamed from: a */
    private final ByteBuffer f40772a;

    akj(ByteBuffer byteBuffer) {
        this.f40772a = byteBuffer.duplicate();
    }

    public final void close() throws IOException {
    }

    /* renamed from: a */
    public final int mo29077a(ByteBuffer byteBuffer) throws IOException {
        if (this.f40772a.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f40772a.remaining());
        byte[] bArr = new byte[min];
        this.f40772a.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    /* renamed from: a */
    public final long mo29078a() throws IOException {
        return (long) this.f40772a.limit();
    }

    /* renamed from: b */
    public final long mo29081b() throws IOException {
        return (long) this.f40772a.position();
    }

    /* renamed from: a */
    public final void mo29080a(long j) throws IOException {
        this.f40772a.position((int) j);
    }

    /* renamed from: a */
    public final ByteBuffer mo29079a(long j, long j2) throws IOException {
        int position = this.f40772a.position();
        this.f40772a.position((int) j);
        ByteBuffer slice = this.f40772a.slice();
        slice.limit((int) j2);
        this.f40772a.position(position);
        return slice;
    }
}
