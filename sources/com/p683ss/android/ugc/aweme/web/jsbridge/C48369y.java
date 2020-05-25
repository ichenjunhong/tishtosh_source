package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.y */
public final class C48369y implements C10762d {

    /* renamed from: a */
    private final WeakReference<Context> f121664a;

    public C48369y(WeakReference<Context> weakReference) {
        C52711k.m112240b(weakReference, "mContextRef");
        this.f121664a = weakReference;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        C52711k.m112240b(hVar, "msg");
        C52711k.m112240b(jSONObject, "res");
        if (this.f121664a.get() != null) {
            C41302w a = C41302w.m91042a();
            Object obj = this.f121664a.get();
            if (obj != null) {
                a.mo83858a((Activity) obj, C41311y.m91065a("aweme://profile_edit").mo83868a("jump_school_edit", 1).mo83871a());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
        }
    }
}
