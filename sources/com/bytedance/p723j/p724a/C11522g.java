package com.bytedance.p723j.p724a;

import com.bytedance.p723j.p724a.C11514c.C11516b;
import com.bytedance.p723j.p724a.C11514c.C11517c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.j.a.g */
public final class C11522g extends C11517c {
    public C11522g(C11521f fVar, C11516b bVar, long j) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f30871a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = bVar.f30873c + (j * ((long) bVar.f30875e));
        this.f30880a = fVar.mo22271b(allocate, j2);
        this.f30881b = fVar.mo22271b(allocate, 4 + j2);
        this.f30882c = fVar.mo22271b(allocate, 8 + j2);
        this.f30883d = fVar.mo22271b(allocate, j2 + 20);
    }
}
