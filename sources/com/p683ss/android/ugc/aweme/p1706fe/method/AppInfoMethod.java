package com.p683ss.android.ugc.aweme.p1706fe.method;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.crossplatform.C27198d;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29972c;
import java.util.Map.Entry;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.AppInfoMethod */
public final class AppInfoMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29790a f77799a = new C29790a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.AppInfoMethod$a */
    public static final class C29790a {
        private C29790a() {
        }

        public /* synthetic */ C29790a(C52707g gVar) {
            this();
        }
    }

    public AppInfoMethod() {
        this(null, 1, null);
    }

    public AppInfoMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        JSONObject jSONObject2 = new JSONObject();
        for (Entry entry : C29972c.m70117a(this.f77795g).entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject2.put("code", 1);
        jSONObject2.put("app_skin", C27198d.m65619b());
        aVar.mo60041a(jSONObject2);
    }

    private /* synthetic */ AppInfoMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
