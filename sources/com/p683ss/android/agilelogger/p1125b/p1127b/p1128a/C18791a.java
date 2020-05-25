package com.p683ss.android.agilelogger.p1125b.p1127b.p1128a;

import com.p683ss.android.agilelogger.p1125b.C18786a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.agilelogger.b.b.a.a */
public final class C18791a implements C18792b {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo38395a(Object obj) {
        return m45863a((String) obj);
    }

    /* renamed from: a */
    private static String m45863a(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new C18786a("JSON empty.");
        }
        try {
            if (str.startsWith("{")) {
                return new JSONObject(str).toString(4);
            }
            if (str.startsWith("[")) {
                return new JSONArray(str).toString(4);
            }
            StringBuilder sb = new StringBuilder("JSON should start with { or [, but found ");
            sb.append(str);
            throw new C18786a(sb.toString());
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Parse JSON error. JSON string:");
            sb2.append(str);
            throw new C18786a(sb2.toString(), e);
        }
    }
}
