package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.bm */
public final class C53266bm extends CancellationException {
    public final C53263bl job;

    public final Throwable fillInStackTrace() {
        if (!C53203ai.f131777a) {
            return this;
        }
        Throwable fillInStackTrace = super.fillInStackTrace();
        C52711k.m112236a((Object) fillInStackTrace, "super.fillInStackTrace()");
        return fillInStackTrace;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.job);
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        String message = getMessage();
        if (message == null) {
            C52711k.m112234a();
        }
        int hashCode = ((message.hashCode() * 31) + this.job.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r3.getCause(), (java.lang.Object) getCause()) != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = r2
            kotlinx.coroutines.bm r0 = (kotlinx.coroutines.C53266bm) r0
            if (r3 == r0) goto L_0x0034
            boolean r0 = r3 instanceof kotlinx.coroutines.C53266bm
            if (r0 == 0) goto L_0x0032
            kotlinx.coroutines.bm r3 = (kotlinx.coroutines.C53266bm) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0032
            kotlinx.coroutines.bl r0 = r3.job
            kotlinx.coroutines.bl r1 = r2.job
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0032
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r0 = r2.getCause()
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r3, r0)
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r3 = 0
            return r3
        L_0x0034:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C53266bm.equals(java.lang.Object):boolean");
    }

    public C53266bm(String str, Throwable th, C53263bl blVar) {
        C52711k.m112240b(str, "message");
        C52711k.m112240b(blVar, "job");
        super(str);
        this.job = blVar;
        if (th != null) {
            initCause(th);
        }
    }
}
