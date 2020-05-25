package com.bytedance.p723j.p724a;

import com.bytedance.p723j.p724a.C11514c.C11515a;
import com.bytedance.p723j.p724a.C11514c.C11516b;
import com.bytedance.p723j.p724a.C11514c.C11517c;
import com.bytedance.p723j.p724a.C11514c.C11518d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.j.a.d */
public final class C11519d extends C11516b {

    /* renamed from: j */
    private final C11521f f30885j;

    /* renamed from: a */
    public final C11517c mo22267a(long j) throws IOException {
        return new C11522g(this.f30885j, this, j);
    }

    /* renamed from: a */
    public final C11518d mo22268a(int i) throws IOException {
        return new C11524i(this.f30885j, this, 0);
    }

    /* renamed from: a */
    public final C11515a mo22266a(long j, int i) throws IOException {
        C11512a aVar = new C11512a(this.f30885j, this, j, i);
        return aVar;
    }

    public C11519d(boolean z, C11521f fVar) throws IOException {
        ByteOrder byteOrder;
        this.f30871a = z;
        this.f30885j = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f30872b = fVar.mo22272c(allocate, 16);
        this.f30873c = fVar.mo22271b(allocate, 28);
        this.f30874d = fVar.mo22271b(allocate, 32);
        this.f30875e = fVar.mo22272c(allocate, 42);
        this.f30876f = fVar.mo22272c(allocate, 44);
        this.f30877g = fVar.mo22272c(allocate, 46);
        this.f30878h = fVar.mo22272c(allocate, 48);
        this.f30879i = fVar.mo22272c(allocate, 50);
    }
}
