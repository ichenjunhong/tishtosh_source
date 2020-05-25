package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import androidx.work.impl.C1547a;
import androidx.work.impl.C1572b;
import androidx.work.impl.C1626f;
import androidx.work.impl.utils.C1655f;
import com.C2240a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.e */
public final class C1607e implements C1547a {

    /* renamed from: a */
    final Context f5667a;

    /* renamed from: b */
    public final C1614h f5668b;

    /* renamed from: c */
    public final C1572b f5669c;

    /* renamed from: d */
    public final C1626f f5670d;

    /* renamed from: e */
    final C1604b f5671e;

    /* renamed from: f */
    final List<Intent> f5672f;

    /* renamed from: g */
    Intent f5673g;

    /* renamed from: h */
    C1610b f5674h;

    /* renamed from: i */
    private final Handler f5675i;

    /* renamed from: androidx.work.impl.background.systemalarm.e$a */
    static class C1609a implements Runnable {

        /* renamed from: a */
        private final C1607e f5677a;

        /* renamed from: b */
        private final Intent f5678b;

        /* renamed from: c */
        private final int f5679c;

        public final void run() {
            this.f5677a.mo6014a(this.f5678b, this.f5679c);
        }

        C1609a(C1607e eVar, Intent intent, int i) {
            this.f5677a = eVar;
            this.f5678b = intent;
            this.f5679c = i;
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$b */
    interface C1610b {
        /* renamed from: a */
        void mo6007a();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$c */
    static class C1611c implements Runnable {

        /* renamed from: a */
        private final C1607e f5680a;

        public final void run() {
            C1607e eVar = this.f5680a;
            eVar.mo6015b();
            synchronized (eVar.f5672f) {
                if (eVar.f5673g != null) {
                    C2240a.m6772a("Removing command %s", new Object[]{eVar.f5673g});
                    if (((Intent) eVar.f5672f.remove(0)).equals(eVar.f5673g)) {
                        eVar.f5673g = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                if (eVar.f5671e.mo6009a() || !eVar.f5672f.isEmpty()) {
                    if (!eVar.f5672f.isEmpty()) {
                        eVar.mo6012a();
                    }
                } else if (eVar.f5674h != null) {
                    eVar.f5674h.mo6007a();
                }
            }
        }

        C1611c(C1607e eVar) {
            this.f5680a = eVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6015b() {
        if (this.f5675i.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6012a() {
        mo6015b();
        WakeLock a = C1655f.m5766a(this.f5667a, "ProcessCommand");
        try {
            a.acquire();
            this.f5670d.f5705d.mo6061a(new Runnable() {
                public final void run() {
                    C1607e eVar;
                    C1611c cVar;
                    synchronized (C1607e.this.f5672f) {
                        C1607e.this.f5673g = (Intent) C1607e.this.f5672f.get(0);
                    }
                    if (C1607e.this.f5673g != null) {
                        String action = C1607e.this.f5673g.getAction();
                        int intExtra = C1607e.this.f5673g.getIntExtra("KEY_START_ID", 0);
                        C2240a.m6772a("Processing command %s, %s", new Object[]{C1607e.this.f5673g, Integer.valueOf(intExtra)});
                        WakeLock a = C1655f.m5766a(C1607e.this.f5667a, C2240a.m6772a("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                        try {
                            C2240a.m6772a("Acquiring operation wake lock (%s) %s", new Object[]{action, a});
                            a.acquire();
                            C1607e.this.f5671e.mo6008a(C1607e.this.f5673g, intExtra, C1607e.this);
                            C2240a.m6772a("Releasing operation wake lock (%s) %s", new Object[]{action, a});
                            a.release();
                            eVar = C1607e.this;
                            cVar = new C1611c(C1607e.this);
                        } catch (Throwable th) {
                            C2240a.m6772a("Releasing operation wake lock (%s) %s", new Object[]{action, a});
                            a.release();
                            C1607e.this.mo6013a((Runnable) new C1611c(C1607e.this));
                            throw th;
                        }
                        eVar.mo6013a((Runnable) cVar);
                    }
                }
            });
        } finally {
            a.release();
        }
    }

    C1607e(Context context) {
        this(context, null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6013a(Runnable runnable) {
        this.f5675i.post(runnable);
    }

    /* renamed from: a */
    private boolean m5669a(String str) {
        mo6015b();
        synchronized (this.f5672f) {
            for (Intent action : this.f5672f) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo5939a(String str, boolean z) {
        mo6013a((Runnable) new C1609a(this, C1604b.m5656a(this.f5667a, str, z), 0));
    }

    /* renamed from: a */
    public final boolean mo6014a(Intent intent, int i) {
        C2240a.m6772a("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)});
        mo6015b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m5669a("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f5672f) {
            boolean z = !this.f5672f.isEmpty();
            this.f5672f.add(intent);
            if (!z) {
                mo6012a();
            }
        }
        return true;
    }

    private C1607e(Context context, C1572b bVar, C1626f fVar) {
        this.f5667a = context.getApplicationContext();
        this.f5671e = new C1604b(this.f5667a);
        this.f5668b = new C1614h();
        this.f5670d = C1626f.m5693a();
        this.f5669c = this.f5670d.f5707f;
        this.f5669c.mo5968a((C1547a) this);
        this.f5672f = new ArrayList();
        this.f5673g = null;
        this.f5675i = new Handler(Looper.getMainLooper());
    }
}
