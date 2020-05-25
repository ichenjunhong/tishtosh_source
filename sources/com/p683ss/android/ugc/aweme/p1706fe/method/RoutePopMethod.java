package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.content.Intent;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22507e;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePopMethod */
public final class RoutePopMethod extends BaseCommonJavaMethod {

    /* renamed from: b */
    public static final C29832a f77888b = new C29832a(null);

    /* renamed from: a */
    public final C10757a f77889a;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePopMethod$a */
    public static final class C29832a {
        private C29832a() {
        }

        public /* synthetic */ C29832a(C52707g gVar) {
            this();
        }
    }

    public RoutePopMethod() {
        this(null, 1, null);
    }

    public RoutePopMethod(C10757a aVar) {
        super(aVar);
        this.f77889a = aVar;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        AbsActivityContainer a = mo60033a();
        if (a != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                C22507e.m55596a(jSONObject2, jSONObject);
            }
            Intent intent = new Intent();
            intent.putExtra("serialized_data", jSONObject2.toString());
            a.mo55365a(50000, intent);
            a.mo55376l();
            aVar.mo60040a(new JSONObject(), 1, "pop succeed");
            return;
        }
        aVar.mo60038a(-1, "params not valid");
    }

    private /* synthetic */ RoutePopMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
