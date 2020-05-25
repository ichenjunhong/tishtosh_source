package androidx.work.impl.p053a.p055b;

import android.content.Context;
import androidx.work.impl.p053a.C1548a;
import com.C2240a;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: androidx.work.impl.a.b.d */
public abstract class C1563d<T> {

    /* renamed from: a */
    protected final Context f5560a;

    /* renamed from: b */
    private final Object f5561b = new Object();

    /* renamed from: c */
    private final Set<C1548a<T>> f5562c = new LinkedHashSet();

    /* renamed from: d */
    private T f5563d;

    /* renamed from: b */
    public abstract T mo5952b();

    /* renamed from: c */
    public abstract void mo5953c();

    /* renamed from: d */
    public abstract void mo5954d();

    C1563d(Context context) {
        this.f5560a = context.getApplicationContext();
    }

    /* renamed from: b */
    public final void mo5958b(C1548a<T> aVar) {
        synchronized (this.f5561b) {
            if (this.f5562c.remove(aVar) && this.f5562c.isEmpty()) {
                mo5954d();
            }
        }
    }

    /* renamed from: a */
    public final void mo5956a(C1548a<T> aVar) {
        synchronized (this.f5561b) {
            if (this.f5562c.add(aVar)) {
                if (this.f5562c.size() == 1) {
                    this.f5563d = mo5952b();
                    C2240a.m6772a("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f5563d});
                    mo5953c();
                }
                aVar.mo5940a(this.f5563d);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5957a(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f5561b
            monitor-enter(r0)
            T r1 = r3.f5563d     // Catch:{ all -> 0x0037 }
            if (r1 == r4) goto L_0x0035
            T r1 = r3.f5563d     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0014
            T r1 = r3.f5563d     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0014
            goto L_0x0035
        L_0x0014:
            r3.f5563d = r4     // Catch:{ all -> 0x0037 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0037 }
            java.util.Set<androidx.work.impl.a.a<T>> r1 = r3.f5562c     // Catch:{ all -> 0x0037 }
            r4.<init>(r1)     // Catch:{ all -> 0x0037 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0021:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0037 }
            androidx.work.impl.a.a r1 = (androidx.work.impl.p053a.C1548a) r1     // Catch:{ all -> 0x0037 }
            T r2 = r3.f5563d     // Catch:{ all -> 0x0037 }
            r1.mo5940a(r2)     // Catch:{ all -> 0x0037 }
            goto L_0x0021
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p053a.p055b.C1563d.mo5957a(java.lang.Object):void");
    }
}
