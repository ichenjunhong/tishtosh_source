package p2699pl.droidsonroids.p2700a.p2701a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53850a;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53851b;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53852c;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53853d;

/* renamed from: pl.droidsonroids.a.a.e */
public final class C53855e extends C53851b {

    /* renamed from: j */
    private final C53856f f133467j;

    /* renamed from: a */
    public final C53852c mo113851a(long j) throws IOException {
        return new C53858h(this.f133467j, this, j);
    }

    /* renamed from: a */
    public final C53853d mo113852a(int i) throws IOException {
        return new C53860j(this.f133467j, this, 0);
    }

    /* renamed from: a */
    public final C53850a mo113850a(long j, int i) throws IOException {
        C53848b bVar = new C53848b(this.f133467j, this, j, i);
        return bVar;
    }

    public C53855e(boolean z, C53856f fVar) throws IOException {
        ByteOrder byteOrder;
        this.f133452a = z;
        this.f133467j = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f133453b = fVar.mo113856c(allocate, 16);
        this.f133454c = fVar.mo113853a(allocate, 32);
        this.f133455d = fVar.mo113853a(allocate, 40);
        this.f133456e = fVar.mo113856c(allocate, 54);
        this.f133457f = fVar.mo113856c(allocate, 56);
        this.f133458g = fVar.mo113856c(allocate, 58);
        this.f133459h = fVar.mo113856c(allocate, 60);
        this.f133460i = fVar.mo113856c(allocate, 62);
    }
}
