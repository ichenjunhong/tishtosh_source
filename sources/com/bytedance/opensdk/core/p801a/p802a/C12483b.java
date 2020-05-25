package com.bytedance.opensdk.core.p801a.p802a;

import com.bytedance.opensdk.core.base.config.C12504a.C12505a;
import com.bytedance.opensdk.core.base.p807b.C12500a;
import com.bytedance.opensdk.core.base.p807b.C12501b;
import com.bytedance.opensdk.core.p801a.p803b.C12489b;
import com.bytedance.opensdk.p800b.C12460b;
import com.bytedance.opensdk.p800b.C12473k;
import com.bytedance.opensdk.p800b.C12478o;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18087q;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.opensdk.core.a.a.b */
public final class C12483b extends C12482a<C12489b> {

    /* renamed from: com.bytedance.opensdk.core.a.a.b$a */
    public final class C12484a extends C12500a {
        public C12484a(String str, Integer num) {
            super(str, num);
        }
    }

    /* renamed from: com.bytedance.opensdk.core.a.a.b$b */
    public final class C12485b extends C12501b<C12484a> {

        /* renamed from: a */
        final /* synthetic */ C12483b f32803a;

        public C12485b(C12483b bVar, String str, C12484a aVar) {
            C52711k.m112240b(str, "message");
            C52711k.m112240b(aVar, "data");
            this.f32803a = bVar;
            super(str, aVar);
        }
    }

    public C12483b(C12489b bVar) {
        C52711k.m112240b(bVar, "authConfig");
        super(bVar);
    }

    /* renamed from: a */
    public final C12485b mo23515a(int i, String str) {
        C18085o oVar;
        int i2;
        C12505a.m25100a();
        C12478o oVar2 = new C12478o("https://i.sgsnssdk.com/api/100/community/sdk_auth");
        C18085o oVar3 = new C18085o();
        oVar3.mo35020a("client_key", str);
        oVar3.mo35019a("app_id", (Number) Integer.valueOf(i));
        try {
            C18087q qVar = new C18087q();
            C12473k kVar = C12473k.f32778a;
            String a = oVar2.mo23510a();
            String oVar4 = oVar3.toString();
            C52711k.m112236a((Object) oVar4, "body.toString()");
            Map linkedHashMap = new LinkedHashMap();
            Map linkedHashMap2 = new LinkedHashMap();
            C52711k.m112240b(a, "url");
            C52711k.m112240b(oVar4, "body");
            C52711k.m112240b(linkedHashMap, "requestHeaderMap");
            C52711k.m112240b(linkedHashMap2, "respHeaderMap");
            C18082l a2 = qVar.mo35029a(C12473k.m25068a().mo23526a(a, oVar4, linkedHashMap, linkedHashMap2));
            C52711k.m112236a((Object) a2, "JsonParser().parse(SdkUt… body = body.toString()))");
            oVar = a2.mo35009m();
        } catch (Exception e) {
            oVar = C12460b.m25050a(e, 300);
        }
        C52711k.m112236a((Object) oVar, "jsonResp");
        String a3 = C12460b.m25054a(oVar, "message", (String) null);
        if (a3 == null) {
            a3 = "";
        }
        String a4 = C12460b.m25054a(oVar, "error_message", (String) null);
        if (a4 == null) {
            a4 = C12460b.m25054a(oVar, "description", (String) null);
        }
        String a5 = C12460b.m25054a(oVar, "error_code", (String) null);
        if (a5 != null) {
            Integer c = C52830p.m112395c(a5);
            if (c != null) {
                i2 = c.intValue();
                return new C12485b(this, a3, new C12484a(a4, Integer.valueOf(i2)));
            }
        }
        i2 = C12460b.m25048a(oVar, "error_code", -1);
        return new C12485b(this, a3, new C12484a(a4, Integer.valueOf(i2)));
    }
}
