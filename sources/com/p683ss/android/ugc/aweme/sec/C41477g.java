package com.p683ss.android.ugc.aweme.sec;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.sec.C41467c.C41468a;
import java.io.IOException;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53668q;
import okhttp3.C53668q.C53669a;
import okhttp3.C53673t;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sec.g */
public final class C41477g implements C53676u {

    /* renamed from: com.ss.android.ugc.aweme.sec.g$a */
    static final class C41479a extends C41475f<C53504ad> {

        /* renamed from: g */
        public C53677a f105148g;

        /* renamed from: h */
        public C53504ad f105149h;

        /* renamed from: d */
        public final C41467c<C53504ad> mo84212d() {
            return new C41468a<C53504ad>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Object mo74485a() {
                    return C41479a.this.f105149h;
                }

                /* renamed from: b */
                public final /* synthetic */ Object mo74486b() throws Exception {
                    C53673t tVar = C41479a.this.f105148g.mo111416a().f132378a;
                    C53677a aVar = C41479a.this.f105148g;
                    C53498ab a = aVar.mo111416a();
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    C53499a a2 = a.mo111256a().mo111268a(a.f132378a);
                    C53668q qVar = (C53668q) a.f132381d;
                    if (qVar != null && qVar.mo111582a() > 0) {
                        C53669a aVar2 = new C53669a();
                        for (int i = 0; i < qVar.mo111582a(); i++) {
                            if (TextUtils.equals(qVar.mo111583a(i), "_rticket")) {
                                aVar2.mo111588b(qVar.mo111583a(i), valueOf);
                            } else {
                                aVar2.mo111588b(qVar.mo111583a(i), qVar.mo111584b(i));
                            }
                        }
                        a2.mo111264a(a.f132379b, (C53500ac) aVar2.mo111587a());
                    }
                    return aVar.mo111417a(a2.mo111272c());
                }
            };
        }

        private C41479a(C53677a aVar, C53504ad adVar) {
            this.f105148g = aVar;
            this.f105149h = adVar;
        }
    }

    public final C53504ad intercept(C53677a aVar) throws IOException {
        boolean z;
        int i;
        C53504ad a = aVar.mo111417a(aVar.mo111416a());
        String b = a.mo111276b("Content-Type");
        C53498ab abVar = a.f132398a;
        String str = "";
        if (!(abVar == null || abVar.f132378a == null)) {
            str = abVar.f132378a.toString();
        }
        if (TextUtils.isEmpty(b)) {
            return a;
        }
        if ((!TextUtils.isEmpty(b) && !b.contains("json")) || (!TextUtils.isEmpty(str) && (str.contains("/effect/api") || str.contains("/model/api")))) {
            return a;
        }
        String a2 = C41474e.m91291a(a);
        if (!TextUtils.isEmpty(a2)) {
            try {
                JSONObject jSONObject = new JSONObject(a2);
                C41479a aVar2 = new C41479a(aVar, a);
                String tVar = aVar.mo111416a().f132378a.toString();
                aVar2.f105146f = jSONObject;
                boolean z2 = false;
                if ((!jSONObject.has("status_code") || jSONObject.optInt("status_code") != 0) && (!jSONObject.has("message") || !TextUtils.equals("success", jSONObject.optString("message")))) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (jSONObject.has("error_code")) {
                        i = jSONObject.optInt("error_code");
                    } else if (jSONObject.has("status_code")) {
                        i = jSONObject.optInt("status_code");
                    } else if (SecApiImpl.createISecApibyMonsterPlugin().isCaptchaUrl(tVar)) {
                        new C41473d();
                        if (SecApiImpl.createISecApibyMonsterPlugin().isCaptchaUrl(tVar)) {
                            String str2 = "";
                            if (jSONObject.has("message")) {
                                str2 = jSONObject.optString("message");
                            }
                            if (TextUtils.equals(str2, "error")) {
                                i = new JSONObject(jSONObject.optString("data")).optInt("error_code");
                            }
                        }
                        i = 0;
                    }
                    z2 = aVar2.mo84222a(i);
                }
                if (z2) {
                    return (C53504ad) aVar2.mo84211c();
                }
            } catch (Exception | InterruptedException | JSONException unused) {
            }
        }
        return a;
    }
}
