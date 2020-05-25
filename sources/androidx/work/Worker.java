package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker.C1527a;
import androidx.work.ListenableWorker.C1528b;
import androidx.work.impl.utils.p058a.C1646c;
import com.google.p1057b.p1065h.p1066a.C17832m;

public abstract class Worker extends ListenableWorker {

    /* renamed from: e */
    C1646c<C1527a> f5491e;

    /* renamed from: f */
    public volatile C1538e f5492f = C1538e.f5534a;

    /* renamed from: g */
    public abstract C1528b mo5908g();

    /* renamed from: c */
    public final C17832m<C1527a> mo5904c() {
        this.f5491e = C1646c.m5751a();
        mo5907f().execute(new Runnable() {
            public final void run() {
                Worker.this.f5491e.mo6041a(new C1527a(Worker.this.mo5908g(), Worker.this.f5492f));
            }
        });
        return this.f5491e;
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
