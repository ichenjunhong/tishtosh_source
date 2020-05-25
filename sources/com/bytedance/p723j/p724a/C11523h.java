package com.bytedance.p723j.p724a;

import com.bytedance.p723j.p724a.C11514c.C11516b;
import com.bytedance.p723j.p724a.C11514c.C11517c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.j.a.h */
public final class C11523h extends C11517c {
    public C11523h(C11521f fVar, C11516b bVar, long j) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f30871a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = bVar.f30873c + (j * ((long) bVar.f30875e));
        this.f30880a = fVar.mo22271b(allocate, j2);
        this.f30881b = fVar.mo22269a(allocate, 8 + j2);
        this.f30882c = fVar.mo22269a(allocate, 16 + j2);
        this.f30883d = fVar.mo22269a(allocate, j2 + 40);
    }
}
