package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.C29896b;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.C29896b.C29897a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.api.C29895a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.p1710b.C29898a;
import com.ss.android.ugc.trill.R;
import java.lang.reflect.Type;
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

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod */
public final class LoadFeedsFlowMethod extends BaseBridgeMethod implements C29895a {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f64169b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LoadFeedsFlowMethod.class), "bridgeModel", "getBridgeModel()Lcom/ss/android/ugc/aweme/fe/method/feeds/FeedsFEBridgeOptimizedModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LoadFeedsFlowMethod.class), "parser", "getParser()Lcom/google/gson/Gson;"))};

    /* renamed from: d */
    public static final C24186a f64170d = new C24186a(null);

    /* renamed from: c */
    public String f64171c = "";

    /* renamed from: e */
    private final String f64172e = "loadFeedsFlow";

    /* renamed from: f */
    private final C52668f f64173f = C52732g.m112285a(new C24187b(this));

    /* renamed from: g */
    private final C52668f f64174g;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod$a */
    public static final class C24186a {
        private C24186a() {
        }

        public /* synthetic */ C24186a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod$b */
    static final class C24187b extends C52712l implements C52670a<C29896b> {

        /* renamed from: a */
        final /* synthetic */ LoadFeedsFlowMethod f64175a;

        C24187b(LoadFeedsFlowMethod loadFeedsFlowMethod) {
            this.f64175a = loadFeedsFlowMethod;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C29897a.m70056a(new C29898a(), this.f64175a.f64171c, this.f64175a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod$c */
    static final class C24188c extends C52712l implements C52670a<C17971f> {

        /* renamed from: a */
        public static final C24188c f64176a = new C24188c();

        C24188c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C17978g().mo34896a((Type) Boolean.TYPE, (Object) new LoadFeedsFlowMethod$parser$2$1()).mo34900d();
        }
    }

    /* renamed from: j */
    private final C29896b m59170j() {
        return (C29896b) this.f64173f.getValue();
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64172e;
    }

    /* renamed from: a */
    public final void mo18295a() {
        super.mo18295a();
        Context e = mo18743e();
        if (!(e instanceof Activity)) {
            e = null;
        }
        Activity activity = (Activity) e;
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.ms, null);
        }
    }

    public LoadFeedsFlowMethod(C10326b bVar) {
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
        this.f64174g = C52732g.m112285a(C24188c.f64176a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0086, code lost:
        if (r4 == null) goto L_0x0088;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49906a(org.json.JSONObject r9, com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a r10) {
        /*
            r8 = this;
            java.lang.String r0 = "params"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.String r0 = "iReturn"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            java.lang.String r0 = "react_id"
            boolean r0 = r9.has(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "has_more"
            boolean r0 = r9.has(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "aweme_list"
            boolean r0 = r9.has(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "page"
            boolean r0 = r9.has(r0)
            if (r0 == 0) goto L_0x002e
            r0 = 1
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r3 = 0
            if (r0 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r9 = r3
        L_0x0034:
            if (r9 == 0) goto L_0x00a2
            java.lang.String r0 = r8.f64171c
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = r8.f64171c
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r4 = "react_id"
            java.lang.String r4 = r9.optString(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x0059
            com.ss.android.ugc.aweme.fe.method.feeds.b r0 = r8.m59170j()
            r0.mo60104a()
        L_0x0059:
            java.lang.String r0 = "react_id"
            java.lang.String r0 = r9.optString(r0)
            java.lang.String r4 = "optString(FIELD_REACT_ID)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            r8.f64171c = r0
            com.ss.android.ugc.aweme.fe.method.feeds.b r0 = r8.m59170j()
            d.f r4 = r8.f64174g
            java.lang.Object r4 = r4.getValue()
            com.google.gson.f r4 = (com.google.gson.C17971f) r4
            java.lang.String r5 = "aweme_list"
            java.lang.String r5 = r9.optString(r5)
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme[]> r6 = com.p683ss.android.ugc.aweme.feed.model.Aweme[].class
            java.lang.Object r4 = r4.mo34884a(r5, r6)
            com.ss.android.ugc.aweme.feed.model.Aweme[] r4 = (com.p683ss.android.ugc.aweme.feed.model.Aweme[]) r4
            if (r4 == 0) goto L_0x0088
            java.util.List r4 = p2628d.p2629a.C52568f.m112084e(r4)
            if (r4 != 0) goto L_0x008c
        L_0x0088:
            java.util.List r4 = p2628d.p2629a.C52575l.m112097a()
        L_0x008c:
            java.lang.String r5 = "page"
            int r5 = r9.optInt(r5, r2)
            java.lang.String r6 = "has_more"
            boolean r6 = r9.optBoolean(r6, r2)
            java.lang.String r7 = "insert_before"
            boolean r9 = r9.optBoolean(r7, r2)
            r0.mo60105a(r4, r5, r6, r9)
            r2 = 1
        L_0x00a2:
            android.content.Context r9 = r8.mo18743e()
            boolean r0 = r9 instanceof android.app.Activity
            if (r0 != 0) goto L_0x00ab
            r9 = r3
        L_0x00ab:
            android.app.Activity r9 = (android.app.Activity) r9
            if (r9 == 0) goto L_0x00c0
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r9 = r9.findViewById(r0)
            r0 = 2132017755(0x7f14025b, float:1.9673797E38)
            com.ss.android.ugc.aweme.fe.method.feeds.b r3 = r8.m59170j()
            r9.setTag(r0, r3)
        L_0x00c0:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r0 = "code"
            if (r2 == 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r1 = -1
        L_0x00cb:
            r9.put(r0, r1)
            r10.mo49913a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod.mo49906a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }

    /* renamed from: a */
    public final void mo49935a(String str, JSONObject jSONObject, int i) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(jSONObject, "params");
        mo49905a(str, jSONObject);
    }
}
