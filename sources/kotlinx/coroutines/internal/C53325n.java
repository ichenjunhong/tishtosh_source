package kotlinx.coroutines.internal;

import kotlinx.coroutines.C53217ao;
import kotlinx.coroutines.C53226aw;
import kotlinx.coroutines.C53280bw;
import kotlinx.coroutines.C53342j;
import p2628d.p2631c.C52628e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.internal.n */
final class C53325n extends C53280bw implements C53217ao {

    /* renamed from: b */
    private final Throwable f131955b;

    /* renamed from: c */
    private final String f131956c;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void m113341a() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f131955b
            if (r0 == 0) goto L_0x0032
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.<init>(r1)
            java.lang.String r1 = r4.f131956c
            if (r1 == 0) goto L_0x001f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ". "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0021
        L_0x001f:
            java.lang.String r1 = ""
        L_0x0021:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f131955b
            r1.<init>(r0, r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android'"
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C53325n.m113341a():java.lang.Void");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Main[missing");
        if (this.f131955b != null) {
            StringBuilder sb2 = new StringBuilder(", cause=");
            sb2.append(this.f131955b);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo19709a(C52628e eVar) {
        C52711k.m112240b(eVar, "context");
        m113341a();
        throw null;
    }

    public C53325n(Throwable th, String str) {
        this.f131955b = th;
        this.f131956c = str;
    }

    /* renamed from: a */
    public final C53226aw mo110773a(long j, Runnable runnable) {
        C52711k.m112240b(runnable, "block");
        m113341a();
        throw null;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo110784a(long j, C53342j jVar) {
        C52711k.m112240b(jVar, "continuation");
        m113341a();
        throw null;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo19708a(C52628e eVar, Runnable runnable) {
        C52711k.m112240b(eVar, "context");
        C52711k.m112240b(runnable, "block");
        m113341a();
        throw null;
    }

    public /* synthetic */ C53325n(Throwable th, String str, int i, C52707g gVar) {
        this(th, null);
    }
}
