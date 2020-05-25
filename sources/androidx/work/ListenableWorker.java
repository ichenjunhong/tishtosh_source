package androidx.work;

import android.content.Context;
import com.google.p1057b.p1065h.p1066a.C17832m;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {

    /* renamed from: a */
    public Context f5484a;

    /* renamed from: b */
    public WorkerParameters f5485b;

    /* renamed from: c */
    public volatile boolean f5486c;

    /* renamed from: d */
    public boolean f5487d;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static final class C1527a {

        /* renamed from: a */
        public C1528b f5488a;

        /* renamed from: b */
        public C1538e f5489b;

        public C1527a(C1528b bVar) {
            this(bVar, C1538e.f5534a);
        }

        public C1527a(C1528b bVar, C1538e eVar) {
            this.f5488a = bVar;
            this.f5489b = eVar;
        }
    }

    /* renamed from: androidx.work.ListenableWorker$b */
    public enum C1528b {
        SUCCESS,
        FAILURE,
        RETRY
    }

    /* renamed from: c */
    public abstract C17832m<C1527a> mo5904c();

    /* renamed from: e */
    public void mo5906e() {
    }

    /* renamed from: a */
    public final UUID mo5902a() {
        return this.f5485b.f5494a;
    }

    /* renamed from: b */
    public final C1538e mo5903b() {
        return this.f5485b.f5495b;
    }

    /* renamed from: d */
    public final void mo5905d() {
        this.f5486c = true;
        mo5906e();
    }

    /* renamed from: f */
    public final Executor mo5907f() {
        return this.f5485b.f5498e;
    }

    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f5484a = context;
            this.f5485b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }
}
