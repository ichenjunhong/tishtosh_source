package com.p683ss.android.ugc.aweme.wire;

import android.util.Log;
import com.p683ss.android.ugc.aweme.base.C23569o;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.wire.WireUseageMonitor */
public class WireUseageMonitor {
    private static final Set<C48409a> DEDUPLICATE_SET = new HashSet();
    private static final String SERVICE_NAME = "wire_usage_monitor";

    /* renamed from: com.ss.android.ugc.aweme.wire.WireUseageMonitor$a */
    static class C48409a {

        /* renamed from: a */
        private String f121768a;

        /* renamed from: b */
        private String f121769b;

        public final int hashCode() {
            int i;
            int i2 = 0;
            if (this.f121768a == null) {
                i = 0;
            } else {
                i = this.f121768a.hashCode();
            }
            if (this.f121769b != null) {
                i2 = this.f121769b.hashCode();
            }
            return i + i2;
        }

        public final boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            C48409a aVar = (C48409a) obj;
            if (this.f121768a != null ? this.f121768a.equals(aVar.f121768a) : aVar.f121768a == null) {
                if (this.f121769b != null ? this.f121769b.equals(aVar.f121769b) : aVar.f121769b == null) {
                    return true;
                }
            }
            return false;
        }

        private C48409a(String str, String str2) {
            this.f121768a = str;
            this.f121769b = str2;
        }
    }

    private static String getStackTrace() {
        return Log.getStackTraceString(new Throwable());
    }

    public static void upload(String str, String str2) {
        C48409a aVar = new C48409a(str, str2);
        if (!DEDUPLICATE_SET.contains(aVar)) {
            DEDUPLICATE_SET.add(aVar);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("class_name", str);
                jSONObject.put("method_name", str2);
            } catch (JSONException unused) {
            }
            C23569o.m57776a(SERVICE_NAME, 1, jSONObject);
        }
    }
}
