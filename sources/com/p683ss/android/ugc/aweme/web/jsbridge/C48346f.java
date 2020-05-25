package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.sdk.webview.p1210b.C19746f;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.f */
public final class C48346f extends C19746f {

    /* renamed from: a */
    private C10757a f121634a;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0032 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036 A[Catch:{ Exception -> 0x003d }] */
    @org.greenrobot.eventbus.C53771m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindMobileFinishEvent(com.p683ss.android.ugc.aweme.account.p1273f.C20968a r5) {
        /*
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x003d }
            r0.<init>()     // Catch:{ Exception -> 0x003d }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x003d }
            r1.<init>()     // Catch:{ Exception -> 0x003d }
            java.lang.String r2 = "type"
            java.lang.String r3 = "bindPhone"
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r2 = "code"
            java.lang.String r3 = r5.f57074a     // Catch:{ JSONException -> 0x0032 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0032 }
            r3 = r3 ^ 1
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r2 = r5.f57075b     // Catch:{ JSONException -> 0x0032 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x0032 }
            if (r2 != 0) goto L_0x002d
            java.lang.String r2 = "_raw"
            java.lang.String r5 = r5.f57075b     // Catch:{ JSONException -> 0x0032 }
            r1.put(r2, r5)     // Catch:{ JSONException -> 0x0032 }
        L_0x002d:
            java.lang.String r5 = "args"
            r0.put(r5, r1)     // Catch:{ JSONException -> 0x0032 }
        L_0x0032:
            com.bytedance.ies.g.a.a r5 = r4.f121634a     // Catch:{ Exception -> 0x003d }
            if (r5 == 0) goto L_0x003d
            com.bytedance.ies.g.a.a r5 = r4.f121634a     // Catch:{ Exception -> 0x003d }
            java.lang.String r1 = "H5_nativeEvent"
            r5.mo19458b(r1, r0)     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103291d(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.jsbridge.C48346f.onBindMobileFinishEvent(com.ss.android.ugc.aweme.account.f.a):void");
    }

    public C48346f(C10757a aVar, WeakReference<Context> weakReference) {
        super(weakReference);
        this.f121634a = aVar;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        String string = hVar.f28947d.getString("type");
        hVar.f28946c = "open";
        hVar.f28947d.put("type", string);
        hVar.f28951h = false;
        C47718bf.m103290c(this);
        open(hVar.f28947d);
    }
}
