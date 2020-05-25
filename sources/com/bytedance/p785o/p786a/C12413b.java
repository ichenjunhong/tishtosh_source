package com.bytedance.p785o.p786a;

import android.app.Activity;
import android.app.Application;
import com.bytedance.p785o.p786a.p787a.C12407b;
import com.bytedance.p785o.p786a.p787a.C12408c;
import com.bytedance.p785o.p786a.p787a.C12409d;
import com.bytedance.p785o.p786a.p787a.C12409d.C12411a;
import com.bytedance.p785o.p786a.p787a.C12412e;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.bytedance.o.a.b */
public enum C12413b {
    INSTANCE;
    

    /* renamed from: a */
    private static HashMap<Integer, WeakReference<Activity>> f32664a;

    /* renamed from: b */
    private C12407b f32666b;

    /* renamed from: c */
    private String f32667c;

    static {
        f32664a = new HashMap<>();
    }

    public final void destroy() {
        if (this.f32666b != null) {
            C12407b bVar = this.f32666b;
            synchronized (bVar.f32659c) {
                bVar.f32659c.clear();
            }
        }
    }

    public final void removeUncaughtExceptionConsumer(C12412e eVar) {
        String str = this.f32667c;
        StringBuilder sb = new StringBuilder("remove consumer:");
        sb.append(eVar);
        C12409d.m24992b(str, sb.toString());
        this.f32666b.mo23466b(eVar);
    }

    public final void addUncaughtExceptionConsumer(C12412e eVar) {
        if (this.f32666b == null) {
            this.f32666b = new C12407b();
            C12407b bVar = this.f32666b;
            if (!bVar.f32657a) {
                bVar.f32658b = Thread.getDefaultUncaughtExceptionHandler();
                if (bVar.f32658b != bVar) {
                    Thread.setDefaultUncaughtExceptionHandler(bVar);
                } else {
                    bVar.f32658b = null;
                }
                bVar.f32657a = true;
            }
        }
        String str = this.f32667c;
        StringBuilder sb = new StringBuilder("init mConsumeExceptionHandler:");
        sb.append(this.f32666b);
        C12409d.m24992b(str, sb.toString());
        String str2 = this.f32667c;
        StringBuilder sb2 = new StringBuilder("add consumer:");
        sb2.append(eVar);
        C12409d.m24992b(str2, sb2.toString());
        this.f32666b.mo23465a(eVar);
    }

    public final void init(Application application, C12408c cVar, C12411a aVar) {
        if (cVar != null) {
            C12409d.f32662c = cVar;
        }
        if (aVar != null) {
            C12409d.f32660a = aVar;
            if (aVar == C12411a.DEBUG) {
                C12409d.f32661b = true;
            }
        }
    }
}
