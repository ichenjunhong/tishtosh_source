package com.bytedance.apm.p480f.p481a;

import com.bytedance.apm.C8976c;
import com.bytedance.apm.p480f.C9012a;
import com.bytedance.apm.p480f.C9028d;
import com.bytedance.apm.p488k.C9074a;
import com.bytedance.apm.p488k.C9079d;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.a.a */
public class C9014a extends C9012a<C9028d> {

    /* renamed from: b */
    private static volatile C9014a f24583b;

    private C9014a() {
    }

    /* renamed from: a */
    public static C9014a m17825a() {
        if (f24583b == null) {
            synchronized (C9014a.class) {
                if (f24583b == null) {
                    f24583b = new C9014a();
                }
            }
        }
        return f24583b;
    }

    /* renamed from: d */
    public final void mo16345d(C9028d dVar) {
        JSONObject a = dVar.mo16347a();
        boolean a2 = dVar.mo16348a(this);
        if (C8976c.m17751g()) {
            String str = C9074a.f24800h;
            StringBuilder sb = new StringBuilder("logType: ");
            sb.append(dVar.mo16349b());
            sb.append(", subType: ");
            sb.append(dVar.mo16350c());
            sb.append("data: ");
            sb.append(a);
            StringBuilder sb2 = new StringBuilder(" ,sample: ");
            sb2.append(a2);
            C9079d.m17981a(str, sb.toString(), sb2.toString());
        }
        if (a2 || dVar.mo16351d()) {
            mo16338a(dVar.mo16349b(), dVar.mo16350c(), a, a2, dVar.mo16352e(), dVar.mo16353f());
        }
    }
}
