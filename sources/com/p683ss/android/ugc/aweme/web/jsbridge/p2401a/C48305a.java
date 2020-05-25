package com.p683ss.android.ugc.aweme.web.jsbridge.p2401a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a */
public final class C48305a {

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a$a */
    public interface C48306a {
        /* renamed from: a */
        void mo49920a(JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a$b */
    public static class C48307b {

        /* renamed from: a */
        public String f121540a;

        /* renamed from: b */
        public String f121541b;

        /* renamed from: c */
        public JSONObject f121542c;

        public C48307b(String str, String str2, JSONObject jSONObject) {
            this.f121540a = str;
            this.f121541b = str2;
            this.f121542c = jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a$c */
    public interface C48308c {
        /* renamed from: a */
        void mo49921a(C48307b bVar, C48309d dVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a$d */
    public static class C48309d {

        /* renamed from: a */
        public JSONObject f121543a;

        /* renamed from: b */
        public Exception f121544b;

        public C48309d(JSONObject jSONObject, Exception exc) {
            this.f121543a = jSONObject;
            this.f121544b = exc;
        }
    }

    /* renamed from: a */
    public static String m104636a(C10766h hVar) {
        JSONObject jSONObject;
        boolean z;
        boolean z2;
        if (hVar != null) {
            jSONObject = hVar.f28947d;
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            String optString = hVar.f28947d.optString("url", "");
            CharSequence charSequence = optString;
            boolean z3 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String optString2 = hVar.f28947d.optString("method", "get");
                CharSequence charSequence2 = optString2;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    Locale locale = Locale.getDefault();
                    C52711k.m112236a((Object) locale, "Locale.getDefault()");
                    if (optString2 != null) {
                        String lowerCase = optString2.toLowerCase(locale);
                        C52711k.m112236a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        if (TextUtils.equals(lowerCase, "get")) {
                            JSONObject optJSONObject = hVar.f28947d.optJSONObject("params");
                            try {
                                Uri parse = Uri.parse(optString);
                                C52711k.m112236a((Object) parse, "uri");
                                Set<String> queryParameterNames = parse.getQueryParameterNames();
                                Collection collection = queryParameterNames;
                                if (collection == null || collection.isEmpty()) {
                                    z3 = true;
                                }
                                if (!z3) {
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    for (String str : queryParameterNames) {
                                        if (str != null) {
                                            String queryParameter = parse.getQueryParameter(str);
                                            if (queryParameter != null) {
                                                optJSONObject.put(str, queryParameter);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (optJSONObject != null && optJSONObject.length() > 0) {
                                C47865ew.m103536a().mo95080a(optString, optJSONObject);
                            }
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type java.lang.String");
                    }
                }
            }
        }
        if (TextUtils.isEmpty(hVar.f28945b)) {
            return "v2";
        }
        try {
            return hVar.f28947d.getString("proto");
        } catch (Exception unused2) {
            return "";
        }
    }

    /* renamed from: a */
    public static C48310b m104635a(C10766h hVar, JSONObject jSONObject, C10757a aVar, C48306a aVar2, C48308c cVar) {
        char c;
        String a = m104636a(hVar);
        if (a.hashCode() == 3708 && a.equals("v2")) {
            c = 0;
        } else {
            c = 65535;
        }
        if (c != 0) {
            C48311c cVar2 = new C48311c(hVar, jSONObject, aVar, aVar2, cVar);
            return cVar2;
        }
        C48318e eVar = new C48318e(hVar, jSONObject, aVar, aVar2, cVar);
        return eVar;
    }
}
