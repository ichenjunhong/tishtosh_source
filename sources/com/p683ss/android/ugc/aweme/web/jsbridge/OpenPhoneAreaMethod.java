package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.C23857bl;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenPhoneAreaMethod */
public final class OpenPhoneAreaMethod extends BaseCommonJavaMethod {

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.OpenPhoneAreaMethod$a */
    public static final class C48295a implements C23857bl {

        /* renamed from: a */
        final /* synthetic */ C29789a f121521a;

        C48295a(C29789a aVar) {
            this.f121521a = aVar;
        }

        public final void onChanged(String str, String str2) {
            C52711k.m112240b(str, "phoneCode");
            C52711k.m112240b(str2, "shortCountryName");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("phoneCode", str);
            jSONObject.put("shortCountryName", str2);
            jSONObject.put("code", 1);
            C29789a aVar = this.f121521a;
            if (aVar != null) {
                aVar.mo60041a(jSONObject);
            }
        }
    }

    public OpenPhoneAreaMethod() {
        this(null, 1, null);
    }

    public OpenPhoneAreaMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        C23857bl aVar2 = new C48295a(aVar);
        if (this.f77793e.get() != null) {
            C20854a.m53162b().openCountryListActivity((Activity) this.f77793e.get(), aVar2);
        }
    }

    private /* synthetic */ OpenPhoneAreaMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
