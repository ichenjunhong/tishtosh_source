package p2699pl.droidsonroids.p2700a.p2701a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53850a;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53851b;

/* renamed from: pl.droidsonroids.a.a.b */
public final class C53848b extends C53850a {
    public C53848b(C53856f fVar, C53851b bVar, long j, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f133452a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = j + ((long) (i * 16));
        this.f133450a = fVar.mo113853a(allocate, j2);
        this.f133451b = fVar.mo113853a(allocate, j2 + 8);
    }
}
