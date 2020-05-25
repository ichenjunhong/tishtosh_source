package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.p195b.C3046e.C3047a;
import com.bytedance.android.live.broadcast.effect.C3253g;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3414a;
import com.bytedance.android.live.broadcast.p213h.p214a.p215a.C3417d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.widget.i */
final /* synthetic */ class C3774i implements C1710e {

    /* renamed from: a */
    private final C36501 f10662a;

    C3774i(C36501 r1) {
        this.f10662a = r1;
    }

    public final void accept(Object obj) {
        Integer num = (Integer) obj;
        LinkVideo2View linkVideo2View = LinkVideo2View.this;
        if (!linkVideo2View.f10407e) {
            linkVideo2View.f10407e = true;
            C3395f.m9156f().mo8740a().mo8264a(new C3047a().mo8288a(linkVideo2View.f10409g).mo8290a());
            if (linkVideo2View.f10405c == null) {
                linkVideo2View.f10405c = new C3417d();
                linkVideo2View.f10406d.mo8758a((C3414a) linkVideo2View.f10405c);
            }
            if (linkVideo2View.f10404b == null) {
                linkVideo2View.f10404b = new C3253g();
                linkVideo2View.f10404b.mo8539a(linkVideo2View.f10403a == null ? linkVideo2View.f10404b.f9270f : linkVideo2View.f10403a.f8928a);
            }
            if (linkVideo2View.f10403a != null && linkVideo2View.f10403a.f8929b != null) {
                C3395f.m9156f().mo8740a().mo8268a(C3037b.f8915c, linkVideo2View.f10403a.f8929b);
            }
        }
    }
}
