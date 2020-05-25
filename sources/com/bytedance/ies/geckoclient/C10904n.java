package com.bytedance.ies.geckoclient;

import android.text.TextUtils;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.geckoclient.model.C10966k;
import com.bytedance.ies.geckoclient.p680b.C10877b;
import com.bytedance.ies.geckoclient.p682d.C10881a;
import com.bytedance.ies.geckoclient.p682d.C10883c;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.geckoclient.n */
final class C10904n extends C10864a {

    /* renamed from: b */
    public C10903m f29264b;

    public final void run() {
        String str;
        int i = 0;
        while (i < 3) {
            try {
                C10966k kVar = this.f29264b.f29263a;
                if (!C9414h.m18630a(kVar.f29451b)) {
                    C10881a aVar = this.f29167a;
                    if (TextUtils.isEmpty(aVar.f29198a)) {
                        str = "";
                    } else {
                        StringBuilder sb = new StringBuilder("https://");
                        sb.append(aVar.f29198a);
                        sb.append("gecko/server/packages/stats");
                        str = C10883c.m22066a().f29201b.mo19647a(sb.toString(), C10877b.m22046a().f29196a.mo34889b(kVar));
                    }
                    if (new JSONObject(str).getInt("status") != 0) {
                        throw new RuntimeException("上传失败");
                    }
                }
                return;
            } catch (Exception unused) {
                i++;
            }
        }
    }

    C10904n(C10881a aVar) {
        super(aVar);
    }
}
