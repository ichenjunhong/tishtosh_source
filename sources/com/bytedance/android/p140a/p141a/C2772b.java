package com.bytedance.android.p140a.p141a;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.p140a.p141a.p144c.C2779a;
import com.bytedance.android.p140a.p141a.p144c.C2780b;
import com.bytedance.android.p140a.p141a.p146e.C2787a;

/* renamed from: com.bytedance.android.a.a.b */
public final class C2772b {
    C2772b() {
    }

    /* renamed from: a */
    public final void mo7364a(View view, C2787a aVar) {
        if (C2786e.m7920d().mo7389e()) {
            final long uptimeMillis = SystemClock.uptimeMillis();
            final View view2 = view;
            final C2787a aVar2 = aVar;
            C27731 r1 = new C2780b() {
                /* renamed from: a */
                public final void mo7365a() {
                    C2778c.m7898a().mo7374a(SystemClock.uptimeMillis() - uptimeMillis);
                    C2786e.m7920d().f8357d.mo7362a(view2, aVar2);
                }
            };
            C2779a.m7905a(r1);
        }
    }
}
