package com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28667c;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.favorites.viewholder.C29767c;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.DisableInterceptMethod */
public final class DisableInterceptMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    private WeakReference<Context> f75269a;

    public DisableInterceptMethod(WeakReference<Context> weakReference, C10757a aVar) {
        C52711k.m112240b(weakReference, "contextRef");
        C52711k.m112240b(aVar, "jsBridge");
        super(aVar);
        this.f75269a = weakReference;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        boolean z;
        if (jSONObject != null) {
            try {
                boolean z2 = jSONObject.getBoolean("isInterceptTouchEvent");
                C28667c.f75237a = z2;
                C29767c.f77759a = z2;
                JSONObject jSONObject2 = new JSONObject();
                String str = "result";
                if (C28667c.m67925b() == z2) {
                    z = true;
                } else {
                    z = false;
                }
                jSONObject2.put(str, z);
                aVar.mo60039a((Object) jSONObject2);
            } catch (Exception e) {
                C28668d.m67931a(e, "DisableInterceptMethod");
                aVar.mo60038a(0, e.getMessage());
            }
        }
    }
}
