package p001a;

import com.C2240a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: a.f */
public final class C0010f implements Closeable {

    /* renamed from: a */
    public final Object f18a = new Object();

    /* renamed from: b */
    final List<C0009e> f19b = new ArrayList();

    /* renamed from: c */
    public ScheduledFuture<?> f20c;

    /* renamed from: d */
    private final ScheduledExecutorService f21d = C0005c.m1b();

    /* renamed from: e */
    private boolean f22e;

    /* renamed from: f */
    private boolean f23f;

    /* renamed from: e */
    private void m6e() {
        if (this.f20c != null) {
            this.f20c.cancel(true);
            this.f20c = null;
        }
    }

    /* renamed from: a */
    public final boolean mo12a() {
        boolean z;
        synchronized (this.f18a) {
            mo16d();
            z = this.f22e;
        }
        return z;
    }

    /* renamed from: b */
    public final C0008d mo13b() {
        C0008d dVar;
        synchronized (this.f18a) {
            mo16d();
            dVar = new C0008d(this);
        }
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo16d() {
        if (this.f23f) {
            throw new IllegalStateException("Object already closed");
        }
    }

    /* renamed from: c */
    public final void mo14c() {
        synchronized (this.f18a) {
            mo16d();
            if (!this.f22e) {
                m6e();
                this.f22e = true;
                ArrayList arrayList = new ArrayList(this.f19b);
                m5a(arrayList);
            }
        }
    }

    public final void close() {
        synchronized (this.f18a) {
            if (!this.f23f) {
                m6e();
                for (C0009e close : this.f19b) {
                    close.close();
                }
                this.f19b.clear();
                this.f23f = true;
            }
        }
    }

    public final String toString() {
        return C2240a.m6773a(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(mo12a())});
    }

    /* renamed from: a */
    private static void m5a(List<C0009e> list) {
        for (C0009e a : list) {
            a.mo10a();
        }
    }
}
