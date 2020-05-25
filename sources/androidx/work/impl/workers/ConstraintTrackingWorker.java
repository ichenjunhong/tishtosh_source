package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.C1538e;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.C1527a;
import androidx.work.ListenableWorker.C1528b;
import androidx.work.WorkerParameters;
import androidx.work.impl.C1626f;
import androidx.work.impl.p053a.C1570c;
import androidx.work.impl.p053a.C1571d;
import androidx.work.impl.p056b.C1583g;
import androidx.work.impl.utils.p058a.C1646c;
import com.C2240a;
import com.google.p1057b.p1065h.p1066a.C17832m;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements C1570c {

    /* renamed from: e */
    WorkerParameters f5792e;

    /* renamed from: f */
    final Object f5793f = new Object();

    /* renamed from: g */
    volatile boolean f5794g = false;

    /* renamed from: h */
    C1646c<C1527a> f5795h = C1646c.m5751a();

    /* renamed from: i */
    public ListenableWorker f5796i;

    /* renamed from: a */
    public final void mo5963a(List<String> list) {
    }

    /* renamed from: c */
    public final C17832m<C1527a> mo5904c() {
        mo5907f().execute(new Runnable() {
            public final void run() {
                String str;
                ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
                Object obj = constraintTrackingWorker.mo5903b().f5535b.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    constraintTrackingWorker.mo6070g();
                    return;
                }
                constraintTrackingWorker.f5796i = constraintTrackingWorker.f5485b.f5500g.mo6074a(constraintTrackingWorker.f5484a, str, constraintTrackingWorker.f5792e);
                if (constraintTrackingWorker.f5796i == null) {
                    constraintTrackingWorker.mo6070g();
                    return;
                }
                C1583g a = C1626f.m5693a().f5704c.mo5929g().mo5990a(constraintTrackingWorker.mo5902a().toString());
                if (a == null) {
                    constraintTrackingWorker.mo6070g();
                    return;
                }
                C1571d dVar = new C1571d(constraintTrackingWorker.f5484a, constraintTrackingWorker);
                dVar.mo5966a(Collections.singletonList(a));
                if (dVar.mo5967a(constraintTrackingWorker.mo5902a().toString())) {
                    C2240a.m6772a("Constraints met for delegate %s", new Object[]{str});
                    try {
                        C17832m c = constraintTrackingWorker.f5796i.mo5904c();
                        c.mo6039a(new Runnable(c) {

                            /* renamed from: a */
                            final /* synthetic */ C17832m f5798a;

                            public final void run() {
                                synchronized (ConstraintTrackingWorker.this.f5793f) {
                                    if (ConstraintTrackingWorker.this.f5794g) {
                                        ConstraintTrackingWorker.this.mo6071h();
                                    } else {
                                        ConstraintTrackingWorker.this.f5795h.mo6040a(this.f5798a);
                                    }
                                }
                            }

                            {
                                this.f5798a = r2;
                            }
                        }, constraintTrackingWorker.mo5907f());
                    } catch (Throwable th) {
                        C2240a.m6772a("Delegated worker %s threw exception in startWork.", new Object[]{str});
                        new Throwable[1][0] = th;
                        synchronized (constraintTrackingWorker.f5793f) {
                            if (constraintTrackingWorker.f5794g) {
                                constraintTrackingWorker.mo6071h();
                            } else {
                                constraintTrackingWorker.mo6070g();
                            }
                        }
                    }
                } else {
                    C2240a.m6772a("Constraints not met for delegate %s. Requesting retry.", new Object[]{str});
                    constraintTrackingWorker.mo6071h();
                }
            }
        });
        return this.f5795h;
    }

    /* renamed from: e */
    public final void mo5906e() {
        super.mo5906e();
        if (this.f5796i != null) {
            this.f5796i.mo5905d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo6070g() {
        this.f5795h.mo6041a(new C1527a(C1528b.FAILURE, C1538e.f5534a));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo6071h() {
        this.f5795h.mo6041a(new C1527a(C1528b.RETRY, C1538e.f5534a));
    }

    /* renamed from: b */
    public final void mo5964b(List<String> list) {
        C2240a.m6772a("Constraints changed for %s", new Object[]{list});
        synchronized (this.f5793f) {
            this.f5794g = true;
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5792e = workerParameters;
    }
}
