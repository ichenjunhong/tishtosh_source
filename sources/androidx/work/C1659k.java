package androidx.work;

import android.content.Context;

/* renamed from: androidx.work.k */
public abstract class C1659k {
    /* renamed from: a */
    public final ListenableWorker mo6074a(Context context, String str, WorkerParameters workerParameters) {
        try {
            try {
                return (ListenableWorker) Class.forName(str).asSubclass(ListenableWorker.class).getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Exception e) {
                new StringBuilder("Could not instantiate ").append(str);
                new Throwable[1][0] = e;
                return null;
            }
        } catch (ClassNotFoundException unused) {
            new StringBuilder("Class not found: ").append(str);
            return null;
        }
    }
}
