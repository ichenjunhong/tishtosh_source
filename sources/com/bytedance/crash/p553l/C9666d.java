package com.bytedance.crash.p553l;

import android.content.Context;
import android.os.Handler;
import com.bytedance.crash.p555n.C9685a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.crash.l.d */
public final class C9666d {

    /* renamed from: a */
    private List<C9663a> f26375a = new ArrayList(3);

    /* renamed from: a */
    public final void mo17516a() {
        new StringBuilder("[ScheduleTaskManager] execute, task size=").append(this.f26375a.size());
        for (C9663a aVar : this.f26375a) {
            try {
                if (aVar.f26372b > 0) {
                    aVar.f26371a.postDelayed(aVar, aVar.f26372b);
                } else {
                    aVar.f26371a.post(aVar);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static C9666d m19269a(Handler handler, Context context) {
        return new C9666d(handler, context);
    }

    private C9666d(Handler handler, Context context) {
        if (C9685a.m19317b(context)) {
            List<C9663a> list = this.f26375a;
            C9665c cVar = new C9665c(handler, 0, 15000);
            list.add(cVar);
        }
        List<C9663a> list2 = this.f26375a;
        C9664b bVar = new C9664b(handler, 0, 15000, context);
        list2.add(bVar);
    }
}
