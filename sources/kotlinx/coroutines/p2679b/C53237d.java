package kotlinx.coroutines.p2679b;

import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.C53204aj;
import kotlinx.coroutines.C53255bd;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.b.d */
public class C53237d extends C53255bd {

    /* renamed from: b */
    private C53231a f131844b;

    /* renamed from: c */
    private final int f131845c;

    /* renamed from: d */
    private final int f131846d;

    /* renamed from: e */
    private final long f131847e;

    /* renamed from: f */
    private final String f131848f;

    public void close() {
        this.f131844b.close();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[scheduler = ");
        sb.append(this.f131844b);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo19708a(C52628e eVar, Runnable runnable) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(runnable, "block");
        try {
            this.f131844b.mo110804a(runnable, (C53243j) C53241h.f131855a, false);
        } catch (RejectedExecutionException unused) {
            C53204aj.f131779b.mo19708a(eVar, runnable);
        }
    }

    private C53237d(int i, int i2, String str) {
        C52711k.m112240b(str, "schedulerName");
        this(i, i2, C53246m.f131866f, str);
    }

    /* renamed from: a */
    public final void mo110820a(Runnable runnable, C53243j jVar, boolean z) {
        C52711k.m112240b(runnable, "block");
        C52711k.m112240b(jVar, "context");
        try {
            this.f131844b.mo110804a(runnable, jVar, z);
        } catch (RejectedExecutionException unused) {
            C53204aj.f131779b.mo110846a((Runnable) C53231a.m113080a(runnable, jVar));
        }
    }

    private C53237d(int i, int i2, long j, String str) {
        C52711k.m112240b(str, "schedulerName");
        this.f131845c = i;
        this.f131846d = i2;
        this.f131847e = j;
        this.f131848f = str;
        C53231a aVar = new C53231a(this.f131845c, this.f131846d, this.f131847e, this.f131848f);
        this.f131844b = aVar;
    }

    public /* synthetic */ C53237d(int i, int i2, String str, int i3, C52707g gVar) {
        this(C53246m.f131864d, C53246m.f131865e, "DefaultDispatcher");
    }
}
