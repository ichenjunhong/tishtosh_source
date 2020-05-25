package com.p683ss.android.ugc.aweme.p1706fe.method;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22530t;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ReportCustomEventMethod */
public final class ReportCustomEventMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29828a f77879a = new C29828a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ReportCustomEventMethod$a */
    public static final class C29828a {
        private C29828a() {
        }

        public /* synthetic */ C29828a(C52707g gVar) {
            this();
        }
    }

    public ReportCustomEventMethod() {
        this(null, 1, null);
    }

    public ReportCustomEventMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        boolean z;
        boolean z2;
        String str;
        String str2 = "state invalid";
        C22521l b = mo60036b();
        if (b != null) {
            C22530t a = b.mo46870a(C22530t.class);
            if (a != null) {
                str2 = "params empty";
                if (jSONObject != null) {
                    String optString = jSONObject.optString("service");
                    CharSequence charSequence = optString;
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        str = "service empty";
                    } else {
                        String optString2 = jSONObject.optString("trigger");
                        CharSequence charSequence2 = optString2;
                        if (charSequence2 == null || charSequence2.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            str = "trigger empty";
                        } else {
                            JSONObject optJSONObject = jSONObject.optJSONObject("category");
                            JSONObject optJSONObject2 = jSONObject.optJSONObject("metrics");
                            JSONObject optJSONObject3 = jSONObject.optJSONObject("extra");
                            if (optString == null) {
                                C52711k.m112234a();
                            }
                            if (optString2 == null) {
                                C52711k.m112234a();
                            }
                            a.mo46858a(optString, optString2, optJSONObject, optJSONObject2, optJSONObject3);
                            aVar.mo60040a(new JSONObject(), 1, "report success");
                            return;
                        }
                    }
                    str2 = str;
                }
            }
        }
        StringBuilder sb = new StringBuilder("report error, reason: ");
        sb.append(str2);
        aVar.mo60038a(0, sb.toString());
    }

    private /* synthetic */ ReportCustomEventMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
