package p2699pl.droidsonroids.p2700a.p2701a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53850a;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53851b;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53852c;
import p2699pl.droidsonroids.p2700a.p2701a.C53849c.C53853d;

/* renamed from: pl.droidsonroids.a.a.d */
public final class C53854d extends C53851b {

    /* renamed from: j */
    private final C53856f f133466j;

    /* renamed from: a */
    public final C53852c mo113851a(long j) throws IOException {
        return new C53857g(this.f133466j, this, j);
    }

    /* renamed from: a */
    public final C53853d mo113852a(int i) throws IOException {
        return new C53859i(this.f133466j, this, 0);
    }

    /* renamed from: a */
    public final C53850a mo113850a(long j, int i) throws IOException {
        C53847a aVar = new C53847a(this.f133466j, this, j, i);
        return aVar;
    }

    public C53854d(boolean z, C53856f fVar) throws IOException {
        ByteOrder byteOrder;
        this.f133452a = z;
        this.f133466j = fVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        this.f133453b = fVar.mo113856c(allocate, 16);
        this.f133454c = fVar.mo113855b(allocate, 28);
        this.f133455d = fVar.mo113855b(allocate, 32);
        this.f133456e = fVar.mo113856c(allocate, 42);
        this.f133457f = fVar.mo113856c(allocate, 44);
        this.f133458g = fVar.mo113856c(allocate, 46);
        this.f133459h = fVar.mo113856c(allocate, 48);
        this.f133460i = fVar.mo113856c(allocate, 50);
    }
}
