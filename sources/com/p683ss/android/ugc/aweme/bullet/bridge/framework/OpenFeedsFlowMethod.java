package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29924q;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.C29885a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52723a;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenFeedsFlowMethod */
public final class OpenFeedsFlowMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24196a f64195b = new C24196a(null);

    /* renamed from: c */
    private final String f64196c = "openFeedsFlow";

    /* renamed from: d */
    private String f64197d = "";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenFeedsFlowMethod$a */
    public static final class C24196a {
        private C24196a() {
        }

        public /* synthetic */ C24196a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenFeedsFlowMethod$b */
    static final class C24197b<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41311y f64198a;

        /* renamed from: b */
        final /* synthetic */ OpenFeedsFlowMethod f64199b;

        /* renamed from: c */
        final /* synthetic */ C52723a f64200c;

        C24197b(C41311y yVar, OpenFeedsFlowMethod openFeedsFlowMethod, C52723a aVar) {
            this.f64198a = yVar;
            this.f64199b = openFeedsFlowMethod;
            this.f64200c = aVar;
        }

        public final /* synthetic */ Object call() {
            C26875a aVar;
            Context e = this.f64199b.mo18743e();
            if (!(e instanceof Activity)) {
                e = null;
            }
            Activity activity = (Activity) e;
            if (activity != null) {
                aVar = (C29885a) activity.findViewById(16908290).getTag(R.id.ms);
            } else {
                aVar = null;
            }
            C31213v.m72896a(aVar);
            Context e2 = this.f64199b.mo18743e();
            if (!(e2 instanceof Activity)) {
                e2 = null;
            }
            Activity activity2 = (Activity) e2;
            if (activity2 != null) {
                return Boolean.valueOf(C41302w.m91042a().mo83858a(activity2, this.f64198a.mo83871a()));
            }
            return null;
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64196c;
    }

    /* renamed from: a */
    public final void mo18295a() {
        super.mo18295a();
        C47718bf.m103291d(this);
    }

    public OpenFeedsFlowMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
        Context e = mo18743e();
        if (!(e instanceof C0184k)) {
            e = null;
        }
        C0184k kVar = (C0184k) e;
        if (kVar != null) {
            C0176h lifecycle = kVar.getLifecycle();
            if (lifecycle != null) {
                lifecycle.mo324a(this);
            }
        }
        C47718bf.m103290c(this);
    }

    @C53771m
    public final void onEvent(C29924q qVar) {
        OpenFeedsFlowMethod openFeedsFlowMethod;
        C52711k.m112240b(qVar, "event");
        if (TextUtils.equals(qVar.f78089a, this.f64197d)) {
            openFeedsFlowMethod = this;
        } else {
            openFeedsFlowMethod = null;
        }
        OpenFeedsFlowMethod openFeedsFlowMethod2 = openFeedsFlowMethod;
        if (openFeedsFlowMethod2 != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", qVar.f78090b);
            jSONObject2.put("current_time", Float.valueOf(((float) C52753d.m112317a(qVar.f78091c, 0)) / 1000.0f));
            jSONObject2.put("current_item_id", qVar.f78092d);
            jSONObject2.put("react_id", openFeedsFlowMethod2.f64197d);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            openFeedsFlowMethod2.mo49905a("notification", jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        C52723a aVar2 = new C52723a();
        boolean z = false;
        aVar2.element = false;
        int i = 1;
        if (jSONObject.has("react_id") && jSONObject.has("aweme_id") && jSONObject.has("enter_from")) {
            z = true;
        }
        if (!z) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            String optString = jSONObject.optString("react_id");
            C52711k.m112236a((Object) optString, "optString(FIELD_REACT_ID)");
            this.f64197d = optString;
            String optString2 = jSONObject.optString("aweme_id");
            String optString3 = jSONObject.optString("enter_from");
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(optString2);
            C41311y a = C41311y.m91065a(sb.toString()).mo83870a("react_session_id", this.f64197d).mo83870a("page_type", optString3).mo83870a("refer", optString3).mo83870a("video_from", "from_feeds_operate").mo83870a("from_group_id", jSONObject.optString("from_group_id")).mo83870a("carrier_type", jSONObject.optString("carrier_type")).mo83870a("refer_commodity_id", jSONObject.optString("refer_commodity_id")).mo83870a("data_type", jSONObject.optString("data_type")).mo83870a("previous_page", jSONObject.optString("previous_page"));
            if (!jSONObject.has("current_time")) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                a.mo83868a("video_current_position", (int) (jSONObject.optDouble("current_time") * 1000.0d));
            }
            C0013i.m18a((Callable<TResult>) new C24197b<TResult>(a, this, aVar2), C0013i.f25b);
            aVar2.element = true;
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = "code";
        if (!aVar2.element) {
            i = -1;
        }
        jSONObject2.put(str, i);
        aVar.mo49913a(jSONObject2);
    }
}
