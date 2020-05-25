package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40351dt;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.af */
public final class C48333af implements C10762d {

    /* renamed from: a */
    C10757a f121610a;

    /* renamed from: b */
    WeakReference<Context> f121611b;

    public C48333af(C10757a aVar, WeakReference<Context> weakReference) {
        this.f121610a = aVar;
        this.f121611b = weakReference;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        hVar.f28951h = false;
        C40351dt dtVar = new C40351dt(C11016e.m22312g());
        dtVar.mo82599a();
        dtVar.f103011f = new C48334ag(this, hVar);
    }
}
