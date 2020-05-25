package org.greenrobot.eventbus;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.p2694a.C53752d;

/* renamed from: org.greenrobot.eventbus.d */
public final class C53759d {

    /* renamed from: m */
    private static final ExecutorService f133336m = Executors.newCachedThreadPool();

    /* renamed from: a */
    boolean f133337a = true;

    /* renamed from: b */
    boolean f133338b = true;

    /* renamed from: c */
    boolean f133339c = true;

    /* renamed from: d */
    boolean f133340d = true;

    /* renamed from: e */
    boolean f133341e;

    /* renamed from: f */
    boolean f133342f = true;

    /* renamed from: g */
    boolean f133343g;

    /* renamed from: h */
    boolean f133344h;

    /* renamed from: i */
    public ExecutorService f133345i = f133336m;

    /* renamed from: j */
    public List<C53752d> f133346j;

    /* renamed from: k */
    C53762g f133347k;

    /* renamed from: l */
    C53765h f133348l;

    /* renamed from: a */
    static Object m114340a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final C53755c mo112966b() {
        C53755c cVar;
        synchronized (C53755c.class) {
            if (C53755c.f133307b == null) {
                cVar = new C53755c(this);
                C53755c.f133307b = cVar;
            } else {
                throw new C53760e("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
            }
        }
        return cVar;
    }
}
