package kotlinx.coroutines.p2679b;

import kotlinx.coroutines.C53360z;
import kotlinx.coroutines.internal.C53333v;
import p2628d.p2647j.C52753d;

/* renamed from: kotlinx.coroutines.b.c */
public final class C53236c extends C53237d {

    /* renamed from: b */
    public static final C53360z f131842b;

    /* renamed from: c */
    public static final C53236c f131843c;

    public final String toString() {
        return "DefaultDispatcher";
    }

    private C53236c() {
        super(0, 0, null, 7, null);
    }

    public final void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    static {
        boolean z;
        C53236c cVar = new C53236c();
        f131843c = cVar;
        int a = C53333v.m113364a("kotlinx.coroutines.io.parallelism", C52753d.m112321c(64, C53333v.m113363a()), 0, 0, 12, (Object) null);
        if (a > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f131842b = new C53239f(cVar, a, C53245l.PROBABLY_BLOCKING);
            return;
        }
        StringBuilder sb = new StringBuilder("Expected positive parallelism level, but have ");
        sb.append(a);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
