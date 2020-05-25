package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.C29885a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.C29885a.C29886a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.api.C29895a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.p1710b.C29898a;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsMethod */
public final class LoadFeedsMethod extends BaseCommonJavaMethod implements C29895a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f77840a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LoadFeedsMethod.class), "bridgeModel", "getBridgeModel()Lcom/ss/android/ugc/aweme/fe/method/feeds/FeedsFEBridgeModel;"))};

    /* renamed from: c */
    public static final C29808a f77841c = new C29808a(null);

    /* renamed from: b */
    public String f77842b;

    /* renamed from: d */
    private final C52668f f77843d;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsMethod$a */
    public static final class C29808a {
        private C29808a() {
        }

        public /* synthetic */ C29808a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsMethod$b */
    static final class C29809b extends C52712l implements C52670a<C29885a> {

        /* renamed from: a */
        final /* synthetic */ LoadFeedsMethod f77844a;

        C29809b(LoadFeedsMethod loadFeedsMethod) {
            this.f77844a = loadFeedsMethod;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C29886a.m70049a(new C29898a(), this.f77844a.f77842b, this.f77844a);
        }
    }

    public LoadFeedsMethod() {
        this(null, 1, null);
    }

    /* renamed from: c */
    private final C29885a m69929c() {
        return (C29885a) this.f77843d.getValue();
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        Context context;
        m69929c().mo60100a();
        WeakReference weakReference = this.f77793e;
        if (weakReference != null) {
            context = (Context) weakReference.get();
        } else {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.ms, null);
        }
    }

    public LoadFeedsMethod(C10757a aVar) {
        super(aVar);
        this.f77843d = C52732g.m112285a(new C29809b(this));
        this.f77842b = "";
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

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        boolean z;
        Context context = null;
        int i = 1;
        boolean z2 = false;
        if (jSONObject != null) {
            if (!jSONObject.has("base_url") || !jSONObject.has("react_id") || !jSONObject.has("page") || !jSONObject.has("size") || jSONObject.optBoolean("clear", false)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                String optString = jSONObject.optString("react_id");
                C52711k.m112236a((Object) optString, "optString(FIELD_REACT_ID)");
                this.f77842b = optString;
                String optString2 = jSONObject.optString("base_url");
                int optInt = jSONObject.optInt("page");
                int optInt2 = jSONObject.optInt("size");
                C29885a c = m69929c();
                C52711k.m112236a((Object) optString2, "baseUrl");
                c.mo60102a(optString2, optInt, optInt2);
                z2 = true;
            }
        }
        WeakReference weakReference = this.f77793e;
        if (weakReference != null) {
            context = (Context) weakReference.get();
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.ms, m69929c());
        }
        JSONObject jSONObject2 = new JSONObject();
        String str = "code";
        if (!z2) {
            i = -1;
        }
        jSONObject2.put(str, i);
        aVar.mo60041a(jSONObject2);
    }

    private /* synthetic */ LoadFeedsMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }

    /* renamed from: a */
    public final void mo49935a(String str, JSONObject jSONObject, int i) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(jSONObject, "params");
        mo60037b(str, jSONObject, 3);
    }
}
