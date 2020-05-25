package com.p683ss.android.ugc.aweme.bullet;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p633e.C10254a;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10276j;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25560e;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.BulletEventObserver */
public final class BulletEventObserver implements C0183j {

    /* renamed from: a */
    public final C10326b f63960a;

    /* renamed from: b */
    public final Activity f63961b;

    /* renamed from: c */
    private boolean f63962c;

    /* renamed from: d */
    private long f63963d;

    /* renamed from: e */
    private C10290i f63964e;

    /* renamed from: com.ss.android.ugc.aweme.bullet.BulletEventObserver$a */
    public static final class C24096a {

        /* renamed from: a */
        public final String f63965a;

        /* renamed from: b */
        public final JSONObject f63966b;

        public C24096a(String str, JSONObject jSONObject) {
            C52711k.m112240b(str, "event");
            this.f63965a = str;
            this.f63966b = jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.BulletEventObserver$b */
    public static final class C24097b implements C10276j {

        /* renamed from: a */
        public final JSONObject f63967a;

        /* renamed from: b */
        final /* synthetic */ String f63968b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f63969c;

        /* renamed from: d */
        private final String f63970d;

        /* renamed from: a */
        public final String mo18285a() {
            return this.f63970d;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo18286b() {
            return this.f63967a;
        }

        C24097b(String str, JSONObject jSONObject) {
            this.f63968b = str;
            this.f63969c = jSONObject;
            this.f63970d = str;
            this.f63967a = jSONObject;
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C53755c.m114319a().mo112959c((Object) this);
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public final void onCreate() {
        C10290i iVar;
        C53755c.m114319a().mo112955a((Object) this);
        this.f63963d = System.currentTimeMillis();
        C10326b bVar = this.f63960a;
        if (bVar != null) {
            iVar = (C10290i) bVar.mo18401c(C10290i.class);
        } else {
            iVar = null;
        }
        this.f63964e = iVar;
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        C10254a aVar;
        this.f63962c = false;
        C10290i iVar = this.f63964e;
        if (iVar != null) {
            aVar = iVar.mo18345c();
        } else {
            aVar = null;
        }
        if (aVar == C10254a.WEB) {
            m58969a("viewDisappeared", null);
            m58969a("invisible", null);
        }
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        C10254a aVar;
        this.f63962c = true;
        C10290i iVar = this.f63964e;
        if (iVar != null) {
            aVar = iVar.mo18345c();
        } else {
            aVar = null;
        }
        if (aVar == C10254a.WEB) {
            m58969a("viewAppeared", null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r3 == null) goto L_0x0026;
     */
    @org.greenrobot.eventbus.C53771m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(com.p683ss.android.sdk.webview.C19748c r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x004a
            java.lang.String r0 = r5.f54412a
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0013
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            if (r0 != 0) goto L_0x002f
            java.lang.String r0 = r5.f54412a
            com.bytedance.ies.bullet.b.e.i r3 = r4.f63964e
            if (r3 == 0) goto L_0x0026
            com.bytedance.ies.bullet.b.e.aa r3 = r3.mo18352k_()
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r3.f27674a
            if (r3 != 0) goto L_0x0028
        L_0x0026:
            java.lang.String r3 = ""
        L_0x0028:
            boolean r0 = p2628d.p2650m.C52830p.m112406a(r0, r3, r2)
            if (r0 == 0) goto L_0x002f
            r1 = 1
        L_0x002f:
            r0 = 0
            if (r1 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r5 = r0
        L_0x0034:
            if (r5 == 0) goto L_0x004a
            android.app.Activity r5 = r4.f63961b
            if (r5 == 0) goto L_0x0049
            boolean r1 = r5.isFinishing()
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r5 = r0
        L_0x0043:
            if (r5 == 0) goto L_0x0049
            r5.finish()
            goto L_0x004a
        L_0x0049:
            return
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.BulletEventObserver.onEvent(com.ss.android.sdk.webview.c):void");
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(C24096a aVar) {
        String str;
        C52711k.m112240b(aVar, "event");
        StringBuilder sb = new StringBuilder("BulletEventObserver onJsBroadcastEvent event:");
        JSONObject jSONObject = aVar.f63966b;
        String str2 = null;
        if (jSONObject != null) {
            str = jSONObject.optString("eventName");
        } else {
            str = null;
        }
        sb.append(str);
        if (this.f63962c) {
            CharSequence charSequence = "goods_rn_page_monitor";
            JSONObject jSONObject2 = aVar.f63966b;
            if (jSONObject2 != null) {
                str2 = jSONObject2.optString("eventName");
            }
            if (TextUtils.equals(charSequence, str2)) {
                try {
                    JSONObject jSONObject3 = aVar.f63966b;
                    if (jSONObject3 != null) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("data");
                        if (jSONObject4 != null) {
                            C25560e eVar = new C25560e();
                            eVar.f67583p = Long.valueOf(Long.valueOf(jSONObject4.optString("interact_render_ts")).longValue() - this.f63963d);
                            eVar.f67585r = jSONObject4.optString("page_id");
                            eVar.f67582o = Long.valueOf(Long.valueOf(jSONObject4.optString("ender_render_ts")).longValue() - this.f63963d);
                            eVar.f67584q = jSONObject4.optString("session_id");
                            C25539a.m62079a().logCommerceEvents("commerce_page_render_time", eVar);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        m58969a("notification", aVar.f63966b);
    }

    public BulletEventObserver(C10326b bVar, Activity activity) {
        this.f63960a = bVar;
        this.f63961b = activity;
    }

    /* renamed from: a */
    private final void m58969a(String str, JSONObject jSONObject) {
        C10290i iVar = this.f63964e;
        if (iVar != null) {
            iVar.onEvent(new C24097b(str, jSONObject));
        }
    }
}
