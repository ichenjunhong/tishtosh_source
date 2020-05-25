package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.C29896b;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.C29896b.C29897a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.api.C29895a;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.p1710b.C29898a;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
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

/* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod */
public final class LoadFeedsFlowMethod extends BaseCommonJavaMethod implements C29895a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f77832a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LoadFeedsFlowMethod.class), "bridgeModel", "getBridgeModel()Lcom/ss/android/ugc/aweme/fe/method/feeds/FeedsFEBridgeOptimizedModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LoadFeedsFlowMethod.class), "parser", "getParser()Lcom/google/gson/Gson;"))};

    /* renamed from: c */
    public static final C29805a f77833c = new C29805a(null);

    /* renamed from: b */
    public String f77834b;

    /* renamed from: d */
    private final C52668f f77835d;

    /* renamed from: h */
    private final C52668f f77836h;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod$a */
    public static final class C29805a {
        private C29805a() {
        }

        public /* synthetic */ C29805a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod$b */
    static final class C29806b extends C52712l implements C52670a<C29896b> {

        /* renamed from: a */
        final /* synthetic */ LoadFeedsFlowMethod f77837a;

        C29806b(LoadFeedsFlowMethod loadFeedsFlowMethod) {
            this.f77837a = loadFeedsFlowMethod;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C29897a.m70056a(new C29898a(), this.f77837a.f77834b, this.f77837a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.LoadFeedsFlowMethod$c */
    static final class C29807c extends C52712l implements C52670a<C17971f> {

        /* renamed from: a */
        public static final C29807c f77838a = new C29807c();

        C29807c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C17978g().mo34896a((Type) Boolean.TYPE, (Object) new LoadFeedsFlowMethod$parser$2$1()).mo34900d();
        }
    }

    public LoadFeedsFlowMethod() {
        this(null, 1, null);
    }

    /* renamed from: c */
    private final C29896b m69922c() {
        return (C29896b) this.f77835d.getValue();
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        Context context;
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

    public LoadFeedsFlowMethod(C10757a aVar) {
        super(aVar);
        this.f77835d = C52732g.m112285a(new C29806b(this));
        this.f77836h = C52732g.m112285a(C29807c.f77838a);
        this.f77834b = "";
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

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r4 == null) goto L_0x0080;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49914a(org.json.JSONObject r9, com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L_0x009a
            java.lang.String r3 = "react_id"
            boolean r3 = r9.has(r3)
            if (r3 == 0) goto L_0x0027
            java.lang.String r3 = "has_more"
            boolean r3 = r9.has(r3)
            if (r3 == 0) goto L_0x0027
            java.lang.String r3 = "aweme_list"
            boolean r3 = r9.has(r3)
            if (r3 == 0) goto L_0x0027
            java.lang.String r3 = "page"
            boolean r3 = r9.has(r3)
            if (r3 == 0) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            if (r3 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r9 = r0
        L_0x002c:
            if (r9 == 0) goto L_0x009a
            java.lang.String r3 = r8.f77834b
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0051
            java.lang.String r3 = r8.f77834b
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = "react_id"
            java.lang.String r4 = r9.optString(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0051
            com.ss.android.ugc.aweme.fe.method.feeds.b r3 = r8.m69922c()
            r3.mo60104a()
        L_0x0051:
            java.lang.String r3 = "react_id"
            java.lang.String r3 = r9.optString(r3)
            java.lang.String r4 = "optString(FIELD_REACT_ID)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r8.f77834b = r3
            com.ss.android.ugc.aweme.fe.method.feeds.b r3 = r8.m69922c()
            d.f r4 = r8.f77836h
            java.lang.Object r4 = r4.getValue()
            com.google.gson.f r4 = (com.google.gson.C17971f) r4
            java.lang.String r5 = "aweme_list"
            java.lang.String r5 = r9.optString(r5)
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme[]> r6 = com.p683ss.android.ugc.aweme.feed.model.Aweme[].class
            java.lang.Object r4 = r4.mo34884a(r5, r6)
            com.ss.android.ugc.aweme.feed.model.Aweme[] r4 = (com.p683ss.android.ugc.aweme.feed.model.Aweme[]) r4
            if (r4 == 0) goto L_0x0080
            java.util.List r4 = p2628d.p2629a.C52568f.m112084e(r4)
            if (r4 != 0) goto L_0x0084
        L_0x0080:
            java.util.List r4 = p2628d.p2629a.C52575l.m112097a()
        L_0x0084:
            java.lang.String r5 = "page"
            int r5 = r9.optInt(r5, r2)
            java.lang.String r6 = "has_more"
            boolean r6 = r9.optBoolean(r6, r2)
            java.lang.String r7 = "insert_before"
            boolean r9 = r9.optBoolean(r7, r2)
            r3.mo60105a(r4, r5, r6, r9)
            r2 = 1
        L_0x009a:
            java.lang.ref.WeakReference r9 = r8.f77793e
            if (r9 == 0) goto L_0x00a5
            java.lang.Object r9 = r9.get()
            r0 = r9
            android.content.Context r0 = (android.content.Context) r0
        L_0x00a5:
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x00ba
            r9 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r9 = r0.findViewById(r9)
            r0 = 2132017755(0x7f14025b, float:1.9673797E38)
            com.ss.android.ugc.aweme.fe.method.feeds.b r3 = r8.m69922c()
            r9.setTag(r0, r3)
        L_0x00ba:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r0 = "code"
            if (r2 == 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r1 = -1
        L_0x00c5:
            r9.put(r0, r1)
            r10.mo60041a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1706fe.method.LoadFeedsFlowMethod.mo49914a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    private /* synthetic */ LoadFeedsFlowMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }

    /* renamed from: a */
    public final void mo49935a(String str, JSONObject jSONObject, int i) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(jSONObject, "params");
        mo60037b(str, jSONObject, 3);
    }
}
