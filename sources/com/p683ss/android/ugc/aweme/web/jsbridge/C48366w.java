package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.w */
public final class C48366w implements C10762d, C48342d {
    public static final C48367a Companion = new C48367a(null);

    /* renamed from: a */
    private String f121660a;

    /* renamed from: b */
    private final WeakReference<Context> f121661b;

    /* renamed from: c */
    private final C10757a f121662c;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.w$a */
    public static final class C48367a {
        private C48367a() {
        }

        public /* synthetic */ C48367a(C52707g gVar) {
            this();
        }
    }

    public final void onClick(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ticket", str);
        jSONObject.put("code", 1);
        jSONObject.put("response", jSONObject2);
        this.f121662c.mo19455a(this.f121660a, jSONObject);
    }

    public C48366w(WeakReference<Context> weakReference, C10757a aVar) {
        C52711k.m112240b(weakReference, "contextRef");
        C52711k.m112240b(aVar, "jsBridge");
        this.f121661b = weakReference;
        this.f121662c = aVar;
    }

    public final void onError(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 0);
        jSONObject.put("errorCode", str);
        jSONObject.put("errorMsg", str2);
        this.f121662c.mo19455a(this.f121660a, jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.p675g.p676a.C10766h r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            r8 = 0
            if (r7 == 0) goto L_0x0006
            java.lang.String r0 = r7.f28945b
            goto L_0x0007
        L_0x0006:
            r0 = r8
        L_0x0007:
            r6.f121660a = r0
            java.lang.String r0 = "1"
            if (r7 == 0) goto L_0x0018
            org.json.JSONObject r1 = r7.f28947d
            if (r1 == 0) goto L_0x0018
            java.lang.String r2 = "client_key"
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0019
        L_0x0018:
            r1 = r8
        L_0x0019:
            if (r7 == 0) goto L_0x0024
            org.json.JSONObject r2 = r7.f28947d
            if (r2 == 0) goto L_0x0024
            java.lang.String r3 = "response_type"
            r2.getString(r3)
        L_0x0024:
            if (r7 == 0) goto L_0x0031
            org.json.JSONObject r2 = r7.f28947d
            if (r2 == 0) goto L_0x0031
            java.lang.String r3 = "scope"
            java.lang.String r2 = r2.getString(r3)
            goto L_0x0032
        L_0x0031:
            r2 = r8
        L_0x0032:
            if (r7 == 0) goto L_0x003f
            org.json.JSONObject r3 = r7.f28947d
            if (r3 == 0) goto L_0x003f
            java.lang.String r4 = "state"
            java.lang.String r3 = r3.getString(r4)
            goto L_0x0040
        L_0x003f:
            r3 = r8
        L_0x0040:
            if (r7 == 0) goto L_0x004d
            org.json.JSONObject r4 = r7.f28947d
            if (r4 == 0) goto L_0x004d
            java.lang.String r5 = "redirect_uri"
            java.lang.String r4 = r4.getString(r5)
            goto L_0x004e
        L_0x004d:
            r4 = r8
        L_0x004e:
            com.bytedance.sdk.account.b.c.c$a r5 = new com.bytedance.sdk.account.b.c.c$a
            r5.<init>()
            r5.f34049f = r2
            r5.f34044a = r3
            java.lang.String r2 = "wap_to_native"
            r5.f34047d = r2
            r5.f34045b = r4
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r5.toBundle(r2)
            java.lang.String r3 = "_bytedance_params_client_key"
            r2.putString(r3, r1)
            java.lang.String r1 = "__bytedance_base_caller_version"
            r2.putString(r1, r0)
            java.lang.String r0 = "_bytedance_params_type_caller_package"
            java.lang.ref.WeakReference<android.content.Context> r1 = r6.f121661b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L_0x007f
            java.lang.String r8 = r1.getPackageName()
        L_0x007f:
            r2.putString(r0, r8)
            java.lang.String r8 = "_aweme_params_enter_from_flag"
            java.lang.String r0 = "ENTER_FROM_INNER_WEB"
            r2.putString(r8, r0)
            if (r7 == 0) goto L_0x008e
            r8 = 0
            r7.f28951h = r8
        L_0x008e:
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r7 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r7 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r7
            java.lang.ref.WeakReference<android.content.Context> r8 = r6.f121661b
            java.lang.Object r8 = r8.get()
            android.content.Context r8 = (android.content.Context) r8
            r0 = r6
            com.ss.android.ugc.aweme.web.jsbridge.d r0 = (com.p683ss.android.ugc.aweme.web.jsbridge.C48342d) r0
            r7.startAuthNativeActivity(r8, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.jsbridge.C48366w.call(com.bytedance.ies.g.a.h, org.json.JSONObject):void");
    }
}
