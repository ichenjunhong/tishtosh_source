package androidx.work.impl;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1532b;
import androidx.work.C1538e;
import androidx.work.C1540f;
import androidx.work.C1543i.C1544a;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.C1527a;
import androidx.work.ListenableWorker.C1528b;
import androidx.work.WorkerParameters;
import androidx.work.WorkerParameters.C1530a;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.p056b.C1575b;
import androidx.work.impl.p056b.C1583g;
import androidx.work.impl.p056b.C1585h;
import androidx.work.impl.p056b.C1597k;
import androidx.work.impl.utils.C1647b;
import androidx.work.impl.utils.p058a.C1646c;
import androidx.work.impl.utils.p059b.C1648a;
import com.C2240a;
import com.google.p1057b.p1065h.p1066a.C17832m;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: androidx.work.impl.h */
public final class C1628h implements Runnable {

    /* renamed from: a */
    ListenableWorker f5711a;

    /* renamed from: b */
    C1527a f5712b = new C1527a(C1528b.FAILURE);

    /* renamed from: c */
    public C1646c<Boolean> f5713c = C1646c.m5751a();

    /* renamed from: d */
    C17832m<C1527a> f5714d = null;

    /* renamed from: e */
    volatile boolean f5715e;

    /* renamed from: f */
    private Context f5716f;

    /* renamed from: g */
    private String f5717g;

    /* renamed from: h */
    private List<C1620c> f5718h;

    /* renamed from: i */
    private C1530a f5719i;

    /* renamed from: j */
    private C1583g f5720j;

    /* renamed from: k */
    private C1532b f5721k;

    /* renamed from: l */
    private C1648a f5722l;

    /* renamed from: m */
    private WorkDatabase f5723m;

    /* renamed from: n */
    private C1585h f5724n;

    /* renamed from: o */
    private C1575b f5725o;

    /* renamed from: p */
    private C1597k f5726p;

    /* renamed from: q */
    private List<String> f5727q;

    /* renamed from: r */
    private String f5728r;

    /* renamed from: androidx.work.impl.h$a */
    public static class C1632a {

        /* renamed from: a */
        Context f5735a;

        /* renamed from: b */
        ListenableWorker f5736b;

        /* renamed from: c */
        C1648a f5737c;

        /* renamed from: d */
        C1532b f5738d;

        /* renamed from: e */
        WorkDatabase f5739e;

        /* renamed from: f */
        String f5740f;

        /* renamed from: g */
        List<C1620c> f5741g;

        /* renamed from: h */
        C1530a f5742h = new C1530a();

        public C1632a(Context context, C1532b bVar, C1648a aVar, WorkDatabase workDatabase, String str) {
            this.f5735a = context.getApplicationContext();
            this.f5737c = aVar;
            this.f5738d = bVar;
            this.f5739e = workDatabase;
            this.f5740f = str;
        }
    }

    /* renamed from: c */
    private void m5702c() {
        C1544a d = this.f5724n.mo5999d(this.f5717g);
        if (d == C1544a.RUNNING) {
            C2240a.m6772a("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f5717g});
            m5701a(true);
            return;
        }
        C2240a.m6772a("Status for %s is %s; not doing any work", new Object[]{this.f5717g, d});
        m5701a(false);
    }

    /* renamed from: d */
    private boolean m5703d() {
        this.f5723m.mo246c();
        try {
            boolean z = true;
            if (this.f5724n.mo5999d(this.f5717g) == C1544a.ENQUEUED) {
                this.f5724n.mo5989a(C1544a.RUNNING, this.f5717g);
                this.f5724n.mo5996b(this.f5717g);
            } else {
                z = false;
            }
            this.f5723m.mo248e();
            return z;
        } finally {
            this.f5723m.mo247d();
        }
    }

    /* renamed from: e */
    private void m5704e() {
        this.f5723m.mo246c();
        try {
            m5700a(this.f5717g);
            if (this.f5712b != null) {
                this.f5724n.mo5994a(this.f5717g, this.f5712b.f5489b);
            }
            this.f5723m.mo248e();
        } finally {
            this.f5723m.mo247d();
            m5701a(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo6031b() {
        boolean z = false;
        if (!this.f5715e) {
            return false;
        }
        C2240a.m6772a("Work interrupted for %s", new Object[]{this.f5728r});
        C1544a d = this.f5724n.mo5999d(this.f5717g);
        if (d != null && !d.isFinished()) {
            z = true;
        }
        m5701a(z);
        return true;
    }

    /* renamed from: f */
    private void m5705f() {
        this.f5723m.mo246c();
        try {
            this.f5724n.mo5989a(C1544a.ENQUEUED, this.f5717g);
            this.f5724n.mo5993a(this.f5717g, System.currentTimeMillis());
            if (VERSION.SDK_INT < 23) {
                this.f5724n.mo5997b(this.f5717g, -1);
            }
            this.f5723m.mo248e();
        } finally {
            this.f5723m.mo247d();
            m5701a(true);
        }
    }

    /* renamed from: g */
    private void m5706g() {
        this.f5723m.mo246c();
        try {
            this.f5724n.mo5993a(this.f5717g, Math.max(System.currentTimeMillis(), this.f5720j.f5615n + this.f5720j.f5609h));
            this.f5724n.mo5989a(C1544a.ENQUEUED, this.f5717g);
            this.f5724n.mo5998c(this.f5717g);
            if (VERSION.SDK_INT < 23) {
                this.f5724n.mo5997b(this.f5717g, -1);
            }
            this.f5723m.mo248e();
        } finally {
            this.f5723m.mo247d();
            m5701a(false);
        }
    }

    /* renamed from: h */
    private void m5707h() {
        this.f5723m.mo246c();
        try {
            this.f5724n.mo5989a(C1544a.SUCCEEDED, this.f5717g);
            this.f5724n.mo5994a(this.f5717g, this.f5712b.f5489b);
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.f5725o.mo5976b(this.f5717g)) {
                if (this.f5725o.mo5975a(str)) {
                    C2240a.m6772a("Setting status to enqueued for %s", new Object[]{str});
                    this.f5724n.mo5989a(C1544a.ENQUEUED, str);
                    this.f5724n.mo5993a(str, currentTimeMillis);
                }
            }
            this.f5723m.mo248e();
        } finally {
            this.f5723m.mo247d();
            m5701a(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6030a() {
        if (this.f5722l.mo6062b() == Thread.currentThread()) {
            boolean z = false;
            if (!mo6031b()) {
                try {
                    this.f5723m.mo246c();
                    C1544a d = this.f5724n.mo5999d(this.f5717g);
                    if (d == null) {
                        m5701a(false);
                        z = true;
                    } else if (d == C1544a.RUNNING) {
                        switch (this.f5712b.f5488a) {
                            case SUCCESS:
                                C2240a.m6772a("Worker result SUCCESS for %s", new Object[]{this.f5728r});
                                if (!this.f5720j.mo5982a()) {
                                    m5707h();
                                    break;
                                } else {
                                    m5706g();
                                    break;
                                }
                            case RETRY:
                                C2240a.m6772a("Worker result RETRY for %s", new Object[]{this.f5728r});
                                m5705f();
                                break;
                            default:
                                C2240a.m6772a("Worker result FAILURE for %s", new Object[]{this.f5728r});
                                if (!this.f5720j.mo5982a()) {
                                    m5704e();
                                    break;
                                } else {
                                    m5706g();
                                    break;
                                }
                        }
                        z = this.f5724n.mo5999d(this.f5717g).isFinished();
                    } else if (!d.isFinished()) {
                        m5705f();
                    }
                    this.f5723m.mo248e();
                } finally {
                    this.f5723m.mo247d();
                }
            }
            if (this.f5718h != null) {
                if (z) {
                    for (C1620c a : this.f5718h) {
                        a.mo6002a(this.f5717g);
                    }
                }
                C1621d.m5689a(this.f5721k, this.f5723m, this.f5718h);
                return;
            }
            return;
        }
        throw new IllegalStateException("Needs to be executed on the Background executor thread.");
    }

    public final void run() {
        C1538e a;
        this.f5727q = this.f5726p.mo6001a(this.f5717g);
        List<String> list = this.f5727q;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f5717g);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        this.f5728r = sb.toString();
        if (!mo6031b()) {
            this.f5723m.mo246c();
            try {
                this.f5720j = this.f5724n.mo5990a(this.f5717g);
                if (this.f5720j == null) {
                    C2240a.m6772a("Didn't find WorkSpec for id %s", new Object[]{this.f5717g});
                    m5701a(false);
                } else if (this.f5720j.f5603b != C1544a.ENQUEUED) {
                    m5702c();
                    this.f5723m.mo248e();
                    this.f5723m.mo247d();
                } else {
                    this.f5723m.mo248e();
                    this.f5723m.mo247d();
                    if (this.f5720j.mo5982a()) {
                        a = this.f5720j.f5606e;
                    } else {
                        C1540f a2 = C1540f.m5498a(this.f5720j.f5605d);
                        if (a2 == null) {
                            C2240a.m6772a("Could not create Input Merger %s", new Object[]{this.f5720j.f5605d});
                            m5704e();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f5720j.f5606e);
                        arrayList.addAll(this.f5724n.mo6000e(this.f5717g));
                        a = a2.mo5901a((List<C1538e>) arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f5717g), a, this.f5727q, this.f5719i, this.f5720j.f5612k, this.f5721k.f5506a, this.f5722l, this.f5721k.f5507b);
                    if (this.f5711a == null) {
                        this.f5711a = this.f5721k.f5507b.mo6074a(this.f5716f, this.f5720j.f5604c, workerParameters);
                    }
                    if (this.f5711a == null) {
                        C2240a.m6772a("Could not create Worker %s", new Object[]{this.f5720j.f5604c});
                        m5704e();
                    } else if (this.f5711a.f5487d) {
                        C2240a.m6772a("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f5720j.f5604c});
                        m5704e();
                    } else {
                        this.f5711a.f5487d = true;
                        if (!m5703d()) {
                            m5702c();
                        } else if (!mo6031b()) {
                            final C1646c a3 = C1646c.m5751a();
                            this.f5722l.mo6060a().execute(new Runnable() {
                                public final void run() {
                                    try {
                                        C1628h.this.f5714d = C1628h.this.f5711a.mo5904c();
                                        a3.mo6040a(C1628h.this.f5714d);
                                    } catch (Throwable th) {
                                        a3.mo6042a(th);
                                    }
                                }
                            });
                            final String str2 = this.f5728r;
                            a3.mo6039a((Runnable) new Runnable() {
                                public final void run() {
                                    try {
                                        C1628h.this.f5712b = (C1527a) a3.get();
                                    } catch (CancellationException e) {
                                        C2240a.m6772a("%s was cancelled", new Object[]{str2});
                                        new Throwable[1][0] = e;
                                    } catch (InterruptedException | ExecutionException e2) {
                                        C2240a.m6772a("%s failed because it threw an exception/error", new Object[]{str2});
                                        new Throwable[1][0] = e2;
                                    } catch (Throwable th) {
                                        C1628h.this.mo6030a();
                                        throw th;
                                    }
                                    C1628h.this.mo6030a();
                                }
                            }, this.f5722l.mo6063c());
                        }
                    }
                }
            } finally {
                this.f5723m.mo247d();
            }
        }
    }

    /* renamed from: a */
    private void m5700a(String str) {
        for (String a : this.f5725o.mo5976b(str)) {
            m5700a(a);
        }
        if (this.f5724n.mo5999d(str) != C1544a.CANCELLED) {
            this.f5724n.mo5989a(C1544a.FAILED, str);
        }
    }

    C1628h(C1632a aVar) {
        this.f5716f = aVar.f5735a;
        this.f5722l = aVar.f5737c;
        this.f5717g = aVar.f5740f;
        this.f5718h = aVar.f5741g;
        this.f5719i = aVar.f5742h;
        this.f5711a = aVar.f5736b;
        this.f5721k = aVar.f5738d;
        this.f5723m = aVar.f5739e;
        this.f5724n = this.f5723m.mo5929g();
        this.f5725o = this.f5723m.mo5930h();
        this.f5726p = this.f5723m.mo5931i();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m5701a(boolean z) {
        try {
            this.f5723m.mo246c();
            if (this.f5723m.mo5929g().mo5991a().isEmpty()) {
                C1647b.m5755a(this.f5716f, RescheduleReceiver.class, false);
            }
            this.f5723m.mo248e();
            this.f5723m.mo247d();
            this.f5713c.mo6041a(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f5723m.mo247d();
            throw th;
        }
    }
}
