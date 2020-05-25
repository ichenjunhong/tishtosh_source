package p2699pl.droidsonroids.p2700a.p2701a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53851b;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53853d;

/* renamed from: pl.droidsonroids.a.a.j */
public final class C53860j extends C53853d {
    public C53860j(C53856f fVar, C53851b bVar, int i) throws IOException {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f133452a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f133465a = fVar.mo113855b(allocate, bVar.f133455d + ((long) (i * bVar.f133458g)) + 44);
    }
}
