package com.bytedance.p723j.p724a;

import com.bytedance.p723j.p724a.C11514c.C11515a;
import com.bytedance.p723j.p724a.C11514c.C11516b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.j.a.b */
public final class C11513b extends C11515a {
    public C11513b(C11521f fVar, C11516b bVar, long j, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f30871a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = j + ((long) (i * 16));
        this.f30869a = fVar.mo22269a(allocate, j2);
        this.f30870b = fVar.mo22269a(allocate, j2 + 8);
    }
}
