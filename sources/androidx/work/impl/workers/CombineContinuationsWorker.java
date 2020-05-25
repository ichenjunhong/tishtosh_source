package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker.C1528b;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class CombineContinuationsWorker extends Worker {
    /* renamed from: g */
    public final C1528b mo5908g() {
        this.f5492f = mo5903b();
        return C1528b.SUCCESS;
    }

    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
