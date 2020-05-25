package com.bytedance.p723j.p724a;

import com.bytedance.p723j.p724a.C11514c.C11516b;
import com.bytedance.p723j.p724a.C11514c.C11518d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.bytedance.j.a.i */
public final class C11524i extends C11518d {
    public C11524i(C11521f fVar, C11516b bVar, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f30871a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f30884a = fVar.mo22271b(allocate, bVar.f30874d + ((long) (i * bVar.f30877g)) + 28);
    }
}
