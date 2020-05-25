package com.bytedance.android.live.core.rxutils.autodispose;

import android.arch.lifecycle.C0176h.C0177a;
import com.bytedance.android.live.core.rxutils.autodispose.p243b.C4007a;
import com.bytedance.android.live.core.rxutils.autodispose.p243b.C4008b;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.b */
final /* synthetic */ class C4006b implements C4007a {

    /* renamed from: a */
    static final C4007a f11142a = new C4006b();

    private C4006b() {
    }

    public final Object apply(Object obj) {
        C0177a aVar = (C0177a) obj;
        switch (aVar) {
            case ON_CREATE:
                return C0177a.ON_DESTROY;
            case ON_START:
                return C0177a.ON_STOP;
            case ON_RESUME:
                return C0177a.ON_PAUSE;
            case ON_PAUSE:
                return C0177a.ON_STOP;
            default:
                StringBuilder sb = new StringBuilder("Lifecycle has ended! Last event was ");
                sb.append(aVar);
                throw new C4008b(sb.toString());
        }
    }
}
