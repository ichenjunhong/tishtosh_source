package com.bytedance.p723j.p724a;

import com.bytedance.p723j.p724a.C11514c.C11515a;
import com.bytedance.p723j.p724a.C11514c.C11516b;
import com.bytedance.p723j.p724a.C11514c.C11517c;
import com.bytedance.p723j.p724a.C11514c.C11518d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.j.a.e */
public final class C11520e extends C11516b {

    /* renamed from: j */
    private final C11521f f30886j;

    /* renamed from: a */
    public final C11517c mo22267a(long j) throws IOException {
        return new C11523h(this.f30886j, this, j);
    }

    /* renamed from: a */
    public final C11518d mo22268a(int i) throws IOException {
        return new C11525j(this.f30886j, this, 0);
    }

    /* renamed from: a */
    public final C11515a mo22266a(long j, int i) throws IOException {
        C11513b bVar = new C11513b(this.f30886j, this, j, i);
        return bVar;
    }

    public C11520e(boolean z, C11521f fVar) throws IOException {
        ByteOrder byteOrder;
        this.f30871a = z;
        this.f30886j = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f30872b = fVar.mo22272c(allocate, 16);
        this.f30873c = fVar.mo22269a(allocate, 32);
        this.f30874d = fVar.mo22269a(allocate, 40);
        this.f30875e = fVar.mo22272c(allocate, 54);
        this.f30876f = fVar.mo22272c(allocate, 56);
        this.f30877g = fVar.mo22272c(allocate, 58);
        this.f30878h = fVar.mo22272c(allocate, 60);
        this.f30879i = fVar.mo22272c(allocate, 62);
    }
}
