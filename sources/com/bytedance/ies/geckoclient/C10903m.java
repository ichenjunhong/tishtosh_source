package com.bytedance.ies.geckoclient;

import com.bytedance.ies.geckoclient.model.C10966k;
import com.bytedance.ies.geckoclient.model.CommonParamsModel;
import com.bytedance.ies.geckoclient.p686e.C10939d;
import java.util.Locale;

/* renamed from: com.bytedance.ies.geckoclient.m */
final class C10903m {

    /* renamed from: a */
    public C10966k f29263a;

    C10903m(C10885e eVar) {
        String str = eVar.f29207a.f29399c;
        String country = Locale.getDefault().getCountry();
        String str2 = eVar.f29207a.f29398b;
        StringBuilder sb = new StringBuilder();
        sb.append(C10939d.m22200c(C10885e.m22079c()));
        CommonParamsModel commonParamsModel = new CommonParamsModel(str, 0, country, str2, sb.toString(), C10939d.m22197a());
        this.f29263a = new C10966k(commonParamsModel);
    }
}
