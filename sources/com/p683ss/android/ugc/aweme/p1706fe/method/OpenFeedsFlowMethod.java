package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.C29885a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52723a;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenFeedsFlowMethod */
public final class OpenFeedsFlowMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29821a f77866a = new C29821a(null);

    /* renamed from: b */
    private String f77867b;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenFeedsFlowMethod$a */
    public static final class C29821a {
        private C29821a() {
        }

        public /* synthetic */ C29821a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenFeedsFlowMethod$b */
    static final class C29822b<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41311y f77868a;

        /* renamed from: b */
        final /* synthetic */ OpenFeedsFlowMethod f77869b;

        /* renamed from: c */
        final /* synthetic */ C52723a f77870c;

        C29822b(C41311y yVar, OpenFeedsFlowMethod openFeedsFlowMethod, C52723a aVar) {
            this.f77868a = yVar;
            this.f77869b = openFeedsFlowMethod;
            this.f77870c = aVar;
        }

        public final /* synthetic */ Object call() {
            Context context;
            WeakReference weakReference = this.f77869b.f77793e;
            C29885a aVar = null;
            if (weakReference != null) {
                context = (Context) weakReference.get();
            } else {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                aVar = (C29885a) activity.findViewById(16908290).getTag(R.id.ms);
            }
            C31213v.m72896a((C26875a) aVar);
            C41302w a = C41302w.m91042a();
            Object obj = this.f77869b.f77793e.get();
            if (obj != null) {
                return Boolean.valueOf(a.mo83858a((Activity) obj, this.f77868a.mo83871a()));
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
        }
    }

    public OpenFeedsFlowMethod() {
        this(null, 1, null);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C47718bf.m103291d(this);
    }

    public OpenFeedsFlowMethod(C10757a aVar) {
        super(aVar);
        this.f77867b = "";
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
        OpenFeedsFlowMethod openFeedsFlowMethod;
        C52711k.m112240b(qVar, "event");
        if (TextUtils.equals(qVar.f78089a, this.f77867b)) {
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
            jSONObject2.put("react_id", openFeedsFlowMethod2.f77867b);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            openFeedsFlowMethod2.mo60037b("notification", jSONObject, 3);
        }
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        C52723a aVar2 = new C52723a();
        boolean z = false;
        aVar2.element = false;
        int i = 1;
        if (jSONObject != null) {
            if (jSONObject.has("react_id") && jSONObject.has("aweme_id") && jSONObject.has("enter_from")) {
                z = true;
            }
            if (!z) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                String optString = jSONObject.optString("react_id");
                C52711k.m112236a((Object) optString, "optString(FIELD_REACT_ID)");
                this.f77867b = optString;
                String optString2 = jSONObject.optString("aweme_id");
                String optString3 = jSONObject.optString("enter_from");
                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                sb.append(optString2);
                C41311y a = C41311y.m91065a(sb.toString()).mo83870a("react_session_id", this.f77867b).mo83870a("page_type", optString3).mo83870a("refer", optString3).mo83870a("video_from", "from_feeds_operate").mo83870a("from_group_id", jSONObject.optString("from_group_id")).mo83870a("carrier_type", jSONObject.optString("carrier_type")).mo83870a("refer_commodity_id", jSONObject.optString("refer_commodity_id")).mo83870a("data_type", jSONObject.optString("data_type")).mo83870a("previous_page", jSONObject.optString("previous_page")).mo83870a("enter_method", jSONObject.optString("enter_method"));
                if (!jSONObject.has("current_time")) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    a.mo83868a("video_current_position", (int) (jSONObject.optDouble("current_time") * 1000.0d));
                }
                C0013i.m18a((Callable<TResult>) new C29822b<TResult>(a, this, aVar2), C0013i.f25b);
                aVar2.element = true;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = "code";
        if (!aVar2.element) {
            i = -1;
        }
        jSONObject2.put(str, i);
        aVar.mo60041a(jSONObject2);
    }

    private /* synthetic */ OpenFeedsFlowMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
