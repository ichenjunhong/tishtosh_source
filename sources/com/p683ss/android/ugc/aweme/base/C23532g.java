package com.p683ss.android.ugc.aweme.base;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.imagepipeline.p975o.C14229b;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.services.ImageUserServiceImpl;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.g */
final /* synthetic */ class C23532g implements Runnable {

    /* renamed from: a */
    private final C14229b f62641a;

    /* renamed from: b */
    private final Throwable f62642b;

    C23532g(C14229b bVar, Throwable th) {
        this.f62641a = bVar;
        this.f62642b = th;
    }

    public final void run() {
        String str;
        int i;
        C14229b bVar = this.f62641a;
        Throwable th = this.f62642b;
        Uri uri = bVar.mSourceUri;
        Context a = C11010c.m22280a();
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        String str2 = "";
        if (C23525e.m57695a(a)) {
            JSONObject jSONObject = new JSONObject();
            try {
                String th2 = th.toString();
                jSONObject.put("errorDesc", th2);
                jSONObject.put("url", str);
                jSONObject.put("userId", ImageUserServiceImpl.createImageUserServicebyMonsterPlugin().getCurrentUserId());
                jSONObject.put("networkType", NetworkUtils.getNetworkAccessType(a));
                jSONObject.put("url_convert", false);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("caller_id", str2);
                }
                C23569o.m57783b("aweme_image_load_log", "image_error", jSONObject);
                String str3 = "aweme_image_load_error_rate";
                if (!TextUtils.isEmpty(th2)) {
                    if (!th2.contains("canceled")) {
                        if (!th2.contains("Canceled")) {
                            if (th2.contains("network not available")) {
                                i = 3;
                                C23569o.m57776a(str3, i, jSONObject);
                            }
                        }
                    }
                    i = 2;
                    C23569o.m57776a(str3, i, jSONObject);
                }
                i = 1;
                C23569o.m57776a(str3, i, jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
