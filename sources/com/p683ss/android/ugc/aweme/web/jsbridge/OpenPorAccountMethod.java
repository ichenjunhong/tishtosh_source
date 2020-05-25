package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.proaccount.ProWelcomeActivity;
import com.p683ss.android.ugc.aweme.web.C48374m;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenPorAccountMethod */
public final class OpenPorAccountMethod extends BaseCommonJavaMethod {

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenPorAccountMethod$a */
    public static final class C48296a implements C48374m {

        /* renamed from: a */
        final /* synthetic */ C29789a f121522a;

        C48296a(C29789a aVar) {
            this.f121522a = aVar;
        }

        public final void status(int i, boolean z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            jSONObject.put("isProAccount", z);
            C29789a aVar = this.f121522a;
            if (aVar != null) {
                aVar.mo60041a(jSONObject);
            }
        }
    }

    public OpenPorAccountMethod() {
        this(null, 1, null);
    }

    public OpenPorAccountMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        C48374m aVar2 = new C48296a(aVar);
        if (this.f77793e.get() != null) {
            Object obj = this.f77793e.get();
            if (obj != null) {
                Activity activity = (Activity) obj;
                Intent intent = new Intent(activity, ProWelcomeActivity.class);
                ProWelcomeActivity.f101249d.mo80758a(aVar2);
                activity.startActivity(intent);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.Activity");
        }
    }

    private /* synthetic */ OpenPorAccountMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
