package com.bytedance.android.live.core.p230g.p231a;

import android.content.Context;
import com.bytedance.android.live.base.C2950a;
import com.bytedance.android.live.base.p185b.C2956c;
import com.bytedance.android.live.core.p225d.C3835c;
import com.bytedance.android.live.core.p225d.C3836d;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p230g.C3922z;
import com.facebook.imagepipeline.p975o.C14229b;
import com.p683ss.android.common.util.NetworkUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.g.a.d */
final /* synthetic */ class C3854d implements Runnable {

    /* renamed from: a */
    private final Throwable f10878a;

    /* renamed from: b */
    private final C14229b f10879b;

    C3854d(Throwable th, C14229b bVar) {
        this.f10878a = th;
        this.f10879b = bVar;
    }

    public final void run() {
        Throwable th = this.f10878a;
        C14229b bVar = this.f10879b;
        Context e = C3922z.m9915e();
        if (C3857g.m9784a(e)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorDesc", th.toString());
                jSONObject.put("url", bVar.mSourceUri);
                jSONObject.put("userId", ((C2956c) C2950a.m8371a(C2956c.class)).mo7597a());
                jSONObject.put("networkType", NetworkUtils.getNetworkAccessType(e));
                C3837e.m9747a("hotsoon_image_load_log", "image_error", jSONObject);
            } catch (Exception unused) {
            }
            C3837e.m9750c("hotsoon_image_load_error_rate", 1, jSONObject);
            String uri = bVar.mSourceUri.toString();
            String th2 = th.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("url", uri);
            hashMap.put("error_msg", th2);
            C3837e.m9741a(C3835c.m9733a("ttlive_image_load_status"), 1, 0, (Map<String, Object>) hashMap);
            C3837e.m9741a(C3836d.m9735b("ttlive_image_load_status"), 1, 0, (Map<String, Object>) hashMap);
        }
    }
}
