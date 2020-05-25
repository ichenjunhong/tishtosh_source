package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29924q;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2629a.C52549aa;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod */
public final class OpenShortVideoMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24203a f64220b = new C24203a(null);

    /* renamed from: c */
    private final String f64221c = "open_short_video";

    /* renamed from: d */
    private C10269a f64222d = C10269a.PRIVATE;

    /* renamed from: e */
    private String f64223e = "";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod$a */
    public static final class C24203a {
        private C24203a() {
        }

        public /* synthetic */ C24203a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod$b */
    public static final class C24204b {

        /* renamed from: a */
        public final String f64224a;

        public C24204b(String str) {
            C52711k.m112240b(str, "reactId");
            this.f64224a = str;
        }
    }

    /* renamed from: a */
    public final void mo18295a() {
        C47718bf.m103291d(this);
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64222d;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64221c;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64222d = aVar;
    }

    public OpenShortVideoMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
        C47718bf.m103290c(this);
    }

    @C53771m
    public final void onEvent(C29924q qVar) {
        OpenShortVideoMethod openShortVideoMethod;
        C52711k.m112240b(qVar, "event");
        if (TextUtils.equals(qVar.f78089a, this.f64223e)) {
            openShortVideoMethod = this;
        } else {
            openShortVideoMethod = null;
        }
        OpenShortVideoMethod openShortVideoMethod2 = openShortVideoMethod;
        if (openShortVideoMethod2 != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", qVar.f78090b);
            jSONObject2.put("current_time", Float.valueOf(((float) C52753d.m112317a(qVar.f78091c, 0)) / 1000.0f));
            jSONObject2.put("current_item_id", qVar.f78092d);
            jSONObject2.put("react_id", openShortVideoMethod2.f64223e);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            openShortVideoMethod2.mo49905a("notification", jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        boolean z;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = jSONObject;
        C24112a aVar2 = aVar;
        C52711k.m112240b(jSONObject3, "params");
        C52711k.m112240b(aVar2, "iReturn");
        if (!jSONObject3.has("current_item_id") || !jSONObject3.has("item_ids") || !jSONObject3.has("react_id")) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject4 = null;
        if (!z) {
            jSONObject3 = null;
        }
        if (jSONObject3 != null) {
            this.f64223e = jSONObject3.optString("react_id");
            String optString = jSONObject3.optString("current_item_id");
            JSONArray optJSONArray = jSONObject3.optJSONArray("item_ids");
            String optString2 = jSONObject3.optString("enter_from");
            JSONObject optJSONObject = jSONObject3.optJSONObject("log");
            StringBuilder sb = new StringBuilder("aweme://aweme/detaillist/");
            sb.append(optString);
            C18922i iVar = new C18922i(sb.toString());
            iVar.mo38778a("react_session_id", this.f64223e);
            int length = optJSONArray.length();
            if (length > 0) {
                String str = "ids";
                Iterable b = C52753d.m112320b(0, length);
                Collection arrayList = new ArrayList(C52575l.m112104a(b, 10));
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    arrayList.add(optJSONArray.get(((C52549aa) it).mo110114a()));
                }
                iVar.mo38778a(str, C52575l.m112120a((List) arrayList, ",", null, null, 0, null, null, 62, null));
            }
            if (jSONObject3.has("current_time")) {
                jSONObject2 = jSONObject3;
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                iVar.mo38776a("video_current_position", (int) (jSONObject2.optDouble("current_time") * 1000.0d));
            }
            if (optString2 != null) {
                iVar.mo38778a("enter_from", optString2);
            }
            if (jSONObject3.has("tracker_data")) {
                jSONObject4 = jSONObject3;
            }
            if (jSONObject4 != null) {
                iVar.mo38778a("tracker_data", jSONObject4.optString("tracker_data"));
            }
            iVar.mo38778a("video_from", "commerce_general");
            iVar.mo38778a("from_group_id", jSONObject3.optString("from_group_id"));
            iVar.mo38778a("carrier_type", jSONObject3.optString("carrier_type"));
            iVar.mo38778a("refer_commodity_id", jSONObject3.optString("refer_commodity_id"));
            iVar.mo38778a("data_type", jSONObject3.optString("data_type"));
            iVar.mo38778a("previous_page", jSONObject3.optString("previous_page"));
            iVar.mo38778a("enter_method", jSONObject3.optString("enter_method"));
            if (optJSONObject != null) {
                iVar.mo38778a("extra_search_result_id", optJSONObject.optString("search_result_id"));
                iVar.mo38778a("impr_id", optJSONObject.optString("impr_id"));
            }
            String str2 = this.f64223e;
            if (str2 != null) {
                C47718bf.m103288a(new C24204b(str2));
            }
            C41302w.m91042a().mo83861a(iVar.toString());
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("code", 1);
        aVar2.mo49913a(jSONObject5);
    }
}
