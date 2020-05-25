package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.common.C26883g;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.SendLogMethod */
public final class SendLogMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29835a f77899a = new C29835a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.SendLogMethod$a */
    public static final class C29835a {
        private C29835a() {
        }

        public /* synthetic */ C29835a(C52707g gVar) {
            this();
        }
    }

    public SendLogMethod() {
        this(null, 1, null);
    }

    public SendLogMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        long j;
        if (jSONObject != null) {
            String optString = jSONObject.optString("eventName");
            String optString2 = jSONObject.optString("labelName");
            String optString3 = jSONObject.optString("value");
            String optString4 = jSONObject.optString("extValue");
            JSONObject optJSONObject = jSONObject.optJSONObject("extJson");
            long j2 = 0;
            if (!TextUtils.isEmpty(optString3)) {
                j = Long.parseLong(optString3);
            } else {
                j = 0;
            }
            if (!TextUtils.isEmpty(optString4)) {
                j2 = Long.parseLong(optString4);
            }
            long j3 = j2;
            if (this.f77793e != null) {
                if (TextUtils.equals("click", optString2)) {
                    C26088l.m63304a(optString, optString3, j3, optJSONObject);
                    optJSONObject.put("has_v3", 1);
                }
                C26883g.m64993a((Context) this.f77793e.get(), optString, optString2, j, j3, optJSONObject);
                if (aVar != null) {
                    aVar.mo60039a((Object) new C18085o());
                }
            } else if (aVar != null) {
                aVar.mo60038a(0, "");
            }
        } else if (aVar != null) {
            aVar.mo60038a(0, "");
        }
    }

    private /* synthetic */ SendLogMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
