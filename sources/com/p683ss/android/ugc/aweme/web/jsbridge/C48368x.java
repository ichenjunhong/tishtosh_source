package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.x */
public final class C48368x implements C10762d {

    /* renamed from: a */
    protected WeakReference<Context> f121663a;

    public C48368x(WeakReference<Context> weakReference) {
        this.f121663a = weakReference;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        if (this.f121663a != null && this.f121663a.get() != null) {
            C26890h.m65011a("qr_code_scan_enter", C23089d.m56640a().mo47829a("enter_from", "h5").f61491a);
            JSONObject jSONObject2 = null;
            if (hVar.f28947d.has("args")) {
                jSONObject2 = hVar.f28947d.getJSONObject("args");
            }
            int i = -1;
            if (jSONObject2 != null && jSONObject2.has("feature") && TextUtils.equals("company_coupon", jSONObject2.optString("feature"))) {
                i = 3;
            }
            QRCodePermissionActivity.m90502a((Context) this.f121663a.get(), false, i);
            if (jSONObject2 != null && jSONObject2.has("should_close_self") && jSONObject2.getBoolean("should_close_self")) {
                Context context = (Context) this.f121663a.get();
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
        }
    }
}
