package com.bytedance.apm.p476c;

import android.os.Looper;
import android.util.Printer;
import com.bytedance.apm.p476c.p477a.C8978a;
import com.bytedance.common.utility.C9420j;
import com.bytedance.common.utility.C9420j.C9422b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.apm.c.d */
public final class C8981d {

    /* renamed from: a */
    private static volatile boolean f24452a;

    /* renamed from: b */
    private static C8982e f24453b;

    /* renamed from: c */
    private static final CopyOnWriteArraySet<C8978a> f24454c = new CopyOnWriteArraySet<>();

    /* renamed from: a */
    public static void m17777a() {
        if (!f24452a) {
            f24452a = true;
            f24453b = new C8982e();
            if (!C9420j.f25662d) {
                C9420j.f25662d = true;
                C9420j.f25660b = new C9422b();
                Printer a = C9420j.m18636a();
                C9420j.f25663e = a;
                if (a != null) {
                    C9420j.f25660b.f25664a.add(C9420j.f25663e);
                }
                Looper.getMainLooper().setMessageLogging(C9420j.f25660b);
            }
            C8982e eVar = f24453b;
            if (eVar != null && !C9420j.f25660b.f25666c.contains(eVar)) {
                C9420j.f25660b.f25666c.add(eVar);
                C9420j.f25660b.f25668e = true;
            }
        }
    }

    /* renamed from: a */
    public static void m17778a(C8978a aVar) {
        synchronized (f24454c) {
            f24454c.add(aVar);
        }
    }

    /* renamed from: b */
    public static void m17780b(C8978a aVar) {
        if (aVar != null) {
            synchronized (f24454c) {
                f24454c.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    static void m17779a(boolean z) {
        Iterator it = f24454c.iterator();
        while (it.hasNext()) {
            C8978a aVar = (C8978a) it.next();
            if (aVar.mo16265c()) {
                if (z) {
                    if (!aVar.f24439a) {
                        aVar.mo16266d();
                    }
                } else if (aVar.f24439a) {
                    aVar.mo16267f();
                }
            } else if (!z && aVar.f24439a) {
                aVar.mo16267f();
            }
        }
    }
}
