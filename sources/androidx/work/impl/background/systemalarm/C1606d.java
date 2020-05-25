package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import androidx.work.WorkerParameters.C1530a;
import androidx.work.impl.C1547a;
import androidx.work.impl.p053a.C1570c;
import androidx.work.impl.p053a.C1571d;
import com.C2240a;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.work.impl.background.systemalarm.d */
public final class C1606d implements C1547a, C1570c, C1615a {

    /* renamed from: a */
    final Context f5658a;

    /* renamed from: b */
    final int f5659b;

    /* renamed from: c */
    final String f5660c;

    /* renamed from: d */
    final C1607e f5661d;

    /* renamed from: e */
    final C1571d f5662e = new C1571d(this.f5658a, this);

    /* renamed from: f */
    WakeLock f5663f;

    /* renamed from: g */
    boolean f5664g = false;

    /* renamed from: h */
    private final Object f5665h = new Object();

    /* renamed from: i */
    private boolean f5666i = false;

    /* renamed from: b */
    private void m5663b() {
        synchronized (this.f5665h) {
            this.f5661d.f5668b.mo6019a(this.f5660c);
            if (this.f5663f != null && this.f5663f.isHeld()) {
                C2240a.m6772a("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f5663f, this.f5660c});
                this.f5663f.release();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6010a() {
        synchronized (this.f5665h) {
            if (!this.f5666i) {
                C2240a.m6772a("Stopping work for workspec %s", new Object[]{this.f5660c});
                this.f5661d.mo6013a((Runnable) new C1609a(this.f5661d, C1604b.m5659c(this.f5658a, this.f5660c), this.f5659b));
                if (this.f5661d.f5669c.mo5973c(this.f5660c)) {
                    C2240a.m6772a("WorkSpec %s needs to be rescheduled", new Object[]{this.f5660c});
                    this.f5661d.mo6013a((Runnable) new C1609a(this.f5661d, C1604b.m5655a(this.f5658a, this.f5660c), this.f5659b));
                } else {
                    C2240a.m6772a("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f5660c});
                }
                this.f5666i = true;
            } else {
                C2240a.m6772a("Already stopped work for %s", new Object[]{this.f5660c});
            }
        }
    }

    /* renamed from: b */
    public final void mo5964b(List<String> list) {
        mo6010a();
    }

    /* renamed from: a */
    public final void mo6011a(String str) {
        C2240a.m6772a("Exceeded time limits on execution for %s", new Object[]{str});
        mo6010a();
    }

    /* renamed from: a */
    public final void mo5963a(List<String> list) {
        C2240a.m6772a("onAllConstraintsMet for %s", new Object[]{this.f5660c});
        if (this.f5661d.f5669c.mo5970a(this.f5660c, (C1530a) null)) {
            C1614h hVar = this.f5661d.f5668b;
            String str = this.f5660c;
            synchronized (hVar.f5685d) {
                C2240a.m6772a("Starting timer for %s", new Object[]{str});
                hVar.mo6019a(str);
                C1616b bVar = new C1616b(hVar, str);
                hVar.f5683b.put(str, bVar);
                hVar.f5684c.put(str, this);
                hVar.f5682a.schedule(bVar, 600000, TimeUnit.MILLISECONDS);
            }
            return;
        }
        m5663b();
    }

    /* renamed from: a */
    public final void mo5939a(String str, boolean z) {
        C2240a.m6772a("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)});
        m5663b();
        if (this.f5664g) {
            this.f5661d.mo6013a((Runnable) new C1609a(this.f5661d, C1604b.m5654a(this.f5658a), this.f5659b));
        }
    }

    C1606d(Context context, int i, String str, C1607e eVar) {
        this.f5658a = context;
        this.f5659b = i;
        this.f5661d = eVar;
        this.f5660c = str;
    }
}
