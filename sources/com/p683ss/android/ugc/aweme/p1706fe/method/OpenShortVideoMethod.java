package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.lang.ref.WeakReference;
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

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenShortVideoMethod */
public final class OpenShortVideoMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29825a f77874a = new C29825a(null);

    /* renamed from: b */
    private String f77875b;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenShortVideoMethod$a */
    public static final class C29825a {
        private C29825a() {
        }

        public /* synthetic */ C29825a(C52707g gVar) {
            this();
        }
    }

    public OpenShortVideoMethod() {
        this(null, 1, null);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C47718bf.m103291d(this);
    }

    public OpenShortVideoMethod(C10757a aVar) {
        super(aVar);
        this.f77875b = "";
        C47718bf.m103290c(this);
    }

    /* renamed from: a */
    public final BaseCommonJavaMethod mo60035a(WeakReference<Context> weakReference) {
        C52711k.m112240b(weakReference, "contextRef");
        Context context = (Context) weakReference.get();
        if (context instanceof C0184k) {
            ((C0184k) context).getLifecycle().mo324a(this);
        }
        BaseCommonJavaMethod a = super.mo60035a(weakReference);
        C52711k.m112236a((Object) a, "super.attach(contextRef)");
        return a;
    }

    @C53771m
    public final void onEvent(C29924q qVar) {
        OpenShortVideoMethod openShortVideoMethod;
        C52711k.m112240b(qVar, "event");
        if (TextUtils.equals(qVar.f78089a, this.f77875b)) {
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
            jSONObject2.put("react_id", openShortVideoMethod2.f77875b);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            openShortVideoMethod2.mo60037b("notification", jSONObject, 3);
        }
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        boolean z;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = jSONObject;
        if (jSONObject3 != null) {
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
                this.f77875b = jSONObject3.optString("react_id");
                String optString = jSONObject3.optString("current_item_id");
                JSONArray optJSONArray = jSONObject3.optJSONArray("item_ids");
                String optString2 = jSONObject3.optString("enter_from");
                StringBuilder sb = new StringBuilder("aweme://aweme/detaillist/");
                sb.append(optString);
                C18922i iVar = new C18922i(sb.toString());
                iVar.mo38778a("react_session_id", this.f77875b);
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
                C41302w.m91042a().mo83861a(iVar.toString());
            }
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("code", 1);
        aVar.mo60041a(jSONObject5);
    }

    private /* synthetic */ OpenShortVideoMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
