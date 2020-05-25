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
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.C29896b;
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

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod */
public final class OpenAwemeDetailMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24192a f64185b = new C24192a(null);

    /* renamed from: c */
    private final String f64186c = "openAwemeDetail";

    /* renamed from: d */
    private String f64187d = "";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod$a */
    public static final class C24192a {
        private C24192a() {
        }

        public /* synthetic */ C24192a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod$b */
    static final class C24193b<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41311y f64188a;

        /* renamed from: b */
        final /* synthetic */ OpenAwemeDetailMethod f64189b;

        /* renamed from: c */
        final /* synthetic */ C52723a f64190c;

        C24193b(C41311y yVar, OpenAwemeDetailMethod openAwemeDetailMethod, C52723a aVar) {
            this.f64188a = yVar;
            this.f64189b = openAwemeDetailMethod;
            this.f64190c = aVar;
        }

        public final /* synthetic */ Object call() {
            C26875a aVar;
            Context e = this.f64189b.mo18743e();
            if (!(e instanceof Activity)) {
                e = null;
            }
            Activity activity = (Activity) e;
            if (activity != null) {
                aVar = (C29896b) activity.findViewById(16908290).getTag(R.id.ms);
            } else {
                aVar = null;
            }
            C31213v.m72896a(aVar);
            Context e2 = this.f64189b.mo18743e();
            if (!(e2 instanceof Activity)) {
                e2 = null;
            }
            Activity activity2 = (Activity) e2;
            if (activity2 != null) {
                return Boolean.valueOf(C41302w.m91042a().mo83858a(activity2, this.f64188a.mo83871a()));
            }
            return null;
        }
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64186c;
    }

    /* renamed from: a */
    public final void mo18295a() {
        super.mo18295a();
        C47718bf.m103291d(this);
    }

    public OpenAwemeDetailMethod(C10326b bVar) {
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
        OpenAwemeDetailMethod openAwemeDetailMethod;
        C52711k.m112240b(qVar, "event");
        if (TextUtils.equals(qVar.f78089a, this.f64187d)) {
            openAwemeDetailMethod = this;
        } else {
            openAwemeDetailMethod = null;
        }
        OpenAwemeDetailMethod openAwemeDetailMethod2 = openAwemeDetailMethod;
        if (openAwemeDetailMethod2 != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", qVar.f78090b);
            jSONObject2.put("current_time", Float.valueOf(((float) C52753d.m112317a(qVar.f78091c, 0)) / 1000.0f));
            jSONObject2.put("current_item_id", qVar.f78092d);
            jSONObject2.put("react_id", openAwemeDetailMethod2.f64187d);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            openAwemeDetailMethod2.mo49905a("notification", jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        JSONObject jSONObject2;
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
            this.f64187d = optString;
            String optString2 = jSONObject.optString("aweme_id");
            String optString3 = jSONObject.optString("enter_from");
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(optString2);
            C41311y a = C41311y.m91065a(sb.toString()).mo83870a("react_session_id", this.f64187d).mo83870a("page_type", optString3).mo83870a("refer", optString3).mo83870a("video_from", "from_feeds_operate_optimized").mo83870a("entrance_info", jSONObject.optString("entrance_info"));
            if (jSONObject.has("log_extra")) {
                jSONObject2 = jSONObject;
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                JSONObject jSONObject3 = new JSONObject(jSONObject2.optString("log_extra"));
                a.mo83870a("carrier_type", jSONObject3.optString("carrier_type")).mo83870a("from_group_id", jSONObject3.optString("from_group_id")).mo83870a("refer_commodity_id", jSONObject3.optString("refer_commodity_id")).mo83870a("data_type", jSONObject3.optString("data_type")).mo83870a("previous_page", jSONObject3.optString("previous_page")).mo83870a("enter_from", jSONObject3.optString("enter_from")).mo83870a("tab_name", jSONObject3.optString("tab_name"));
            }
            if (!jSONObject.has("current_time")) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                a.mo83868a("video_current_position", (int) (jSONObject.optDouble("current_time") * 1000.0d));
            }
            C0013i.m18a((Callable<TResult>) new C24193b<TResult>(a, this, aVar2), C0013i.f25b);
            aVar2.element = true;
        }
        JSONObject jSONObject4 = new JSONObject();
        String str = "code";
        if (!aVar2.element) {
            i = -1;
        }
        jSONObject4.put(str, i);
        aVar.mo49913a(jSONObject4);
    }
}
