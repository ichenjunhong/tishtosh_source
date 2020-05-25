package com.bytedance.p763l;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.p763l.p765b.C12150a;
import com.bytedance.p763l.p765b.C12151b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.l.d */
public class C12153d {

    /* renamed from: c */
    private static volatile C12153d f32082c;

    /* renamed from: a */
    public final List<C12151b> f32083a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final Map<String, C12150a> f32084b = new HashMap();

    /* renamed from: d */
    private Handler f32085d = new Handler(Looper.getMainLooper());

    private C12153d() {
    }

    /* renamed from: a */
    public static C12153d m24598a() {
        if (f32082c == null) {
            synchronized (C12153d.class) {
                if (f32082c == null) {
                    f32082c = new C12153d();
                }
            }
        }
        return f32082c;
    }

    /* renamed from: a */
    public final void mo23065a(C12150a aVar) {
        if (aVar != null && aVar.f32069a != null) {
            synchronized (this.f32084b) {
                final C12150a aVar2 = (C12150a) this.f32084b.get(aVar.f32069a);
                if (aVar2 != null) {
                    aVar2.f32071c = aVar.f32071c;
                    aVar2.f32070b = aVar.f32070b;
                    aVar2.f32075g = aVar.f32075g;
                    aVar2.f32077i = aVar.f32077i;
                    aVar2.f32076h = aVar.f32076h;
                    aVar2.f32073e = aVar.f32073e;
                    aVar2.f32072d = aVar.f32072d;
                    this.f32085d.post(new Runnable() {
                        public final void run() {
                            for (C12151b a : C12153d.this.f32083a) {
                                a.mo23064a(aVar2);
                            }
                        }
                    });
                }
            }
        }
    }
}
