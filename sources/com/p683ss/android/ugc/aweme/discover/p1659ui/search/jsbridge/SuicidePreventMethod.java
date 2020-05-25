package com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.SuicidePreventMethod */
public final class SuicidePreventMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    private WeakReference<Context> f75279a;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.SuicidePreventMethod$a */
    public static final class C28681a extends C17956a<SearchPreventSuicide> {
        C28681a() {
        }
    }

    public SuicidePreventMethod(WeakReference<Context> weakReference, C10757a aVar) {
        C52711k.m112240b(weakReference, "contextRef");
        C52711k.m112240b(aVar, "jsBridge");
        super(aVar);
        this.f75279a = weakReference;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("suicide_prevent_info");
                C52711k.m112236a((Object) string, "params.getString(\"suicide_prevent_info\")");
                C52711k.m112240b(string, "result");
                SearchPreventSuicide searchPreventSuicide = (SearchPreventSuicide) C47759cc.m103382a().getGson().mo34885a(string, new C28681a().f49843c);
                C52711k.m112236a((Object) searchPreventSuicide, "list");
                C47718bf.m103288a(searchPreventSuicide);
            } catch (Exception e) {
                C28668d.m67931a(e, "SuicidePreventMethod");
                aVar.mo60038a(0, e.getMessage());
                return;
            }
        }
        aVar.mo60039a((Object) new JSONObject());
    }
}
