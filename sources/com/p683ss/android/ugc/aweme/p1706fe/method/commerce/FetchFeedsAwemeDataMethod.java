package com.p683ss.android.ugc.aweme.p1706fe.method.commerce;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.FetchFeedsAwemeDataMethod */
public final class FetchFeedsAwemeDataMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29867a f77968a = new C29867a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.FetchFeedsAwemeDataMethod$a */
    public static final class C29867a {
        private C29867a() {
        }

        public /* synthetic */ C29867a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        String str;
        if (jSONObject != null) {
            try {
                str = jSONObject.optString("item_id");
            } catch (Exception unused) {
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            aVar.mo60039a((Object) new JSONObject().put("aweme", C47760cd.m103385a(C25539a.m62079a().getAwemeById(str))));
        }
    }
}
