package com.bytedance.p785o.p786a.p788b.p789a.p792b;

import android.app.Instrumentation;
import android.os.Looper;
import com.bytedance.p785o.p786a.p787a.C12409d;
import com.bytedance.p785o.p786a.p788b.p789a.p790a.p791a.C12415a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.o.a.b.a.b.a */
public final class C12416a extends Instrumentation {

    /* renamed from: a */
    public static boolean f32668a;

    /* renamed from: b */
    private static List<C12415a> f32669b = new ArrayList();

    /* renamed from: a */
    public static void m24999a(C12415a aVar) {
        if (C12409d.m24991a() && Looper.myLooper() != Looper.getMainLooper()) {
            throw new RuntimeException("register only in UI thread.");
        } else if (!f32669b.contains(aVar)) {
            f32669b.add(aVar);
        }
    }

    public final boolean onException(Object obj, Throwable th) {
        for (C12415a a : f32669b) {
            if (a.mo23476a(obj, th)) {
                return true;
            }
        }
        return super.onException(obj, th);
    }
}
