package com.bytedance.crash.p546f;

import android.text.TextUtils;
import com.bytedance.crash.C9577e;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.nativecrash.C9721c;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p551k.p552a.C9619b;
import com.bytedance.crash.p551k.p552a.C9619b.C9621a;
import com.bytedance.crash.p555n.C9698j;
import com.bytedance.crash.p555n.C9713t;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.f.a */
public class C9584a {

    /* renamed from: a */
    public JSONObject f26141a;

    /* renamed from: b */
    protected C9586c f26142b;

    /* renamed from: c */
    public String f26143c;

    /* renamed from: a */
    public final boolean mo17396a() {
        Object opt = this.f26141a.opt("data");
        return opt instanceof JSONArray ? !C9698j.m19374a(((JSONArray) opt).optJSONObject(0), "logcat") : !C9698j.m19374a(this.f26141a, "logcat");
    }

    /* renamed from: a */
    public final C9584a mo17387a(C9586c cVar) {
        mo17395a("header", (Object) cVar.f26149a);
        this.f26142b = cVar;
        return this;
    }

    /* renamed from: a */
    public final C9584a mo17389a(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo17395a("session_id", (Object) str);
        }
        return this;
    }

    /* renamed from: a */
    public final C9584a mo17388a(C9619b bVar) {
        mo17395a("activity_trace", (Object) bVar.mo17455b());
        String str = "activity_track";
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(bVar.f26249e).iterator();
        while (it.hasNext()) {
            jSONArray.put(((C9621a) it.next()).toString());
        }
        mo17392a(str, jSONArray);
        return this;
    }

    /* renamed from: a */
    public final C9584a mo17394a(Map<String, Integer> map) {
        JSONArray jSONArray = new JSONArray();
        if (map == null) {
            try {
                this.f26141a.put("plugin_info", jSONArray);
                return this;
            } catch (Exception unused) {
            }
        } else {
            for (String str : map.keySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("package_name", str);
                jSONObject.put("version_code", map.get(str));
                jSONArray.put(jSONObject);
            }
            this.f26141a.put("plugin_info", jSONArray);
            return this;
        }
    }

    /* renamed from: a */
    public final C9584a mo17393a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            mo17395a("patch_info", (Object) jSONArray);
            return this;
        }
        for (String put : list) {
            jSONArray.put(put);
        }
        mo17395a("patch_info", (Object) jSONArray);
        return this;
    }

    /* renamed from: a */
    public final C9584a mo17391a(String str, List<String> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (String put : list) {
                jSONArray.put(put);
            }
        } catch (Throwable unused) {
        }
        mo17392a(str, jSONArray);
        return this;
    }

    /* renamed from: a */
    public final C9584a mo17392a(String str, JSONArray jSONArray) {
        JSONObject optJSONObject = this.f26141a.optJSONObject("custom_long");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            mo17395a("custom_long", (Object) optJSONObject);
        }
        try {
            optJSONObject.put(str, jSONArray);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: a */
    public final C9584a mo17390a(String str, String str2) {
        Object opt = this.f26141a.opt("data");
        if (opt instanceof JSONArray) {
            m19013a(((JSONArray) opt).optJSONObject(0), "filters", str, str2);
        } else {
            m19013a(this.f26141a, "filters", str, str2);
        }
        return this;
    }

    public C9584a() {
        this.f26141a = new JSONObject();
    }

    /* renamed from: b */
    public final void mo17400b() {
        mo17390a("has_logcat", String.valueOf(mo17396a()));
    }

    /* renamed from: d */
    public final boolean mo17405d() {
        return m19019b(this.f26141a);
    }

    /* renamed from: e */
    public final C9586c mo17406e() {
        if (this.f26142b == null) {
            this.f26142b = new C9586c(C9616k.m19154f());
            mo17387a(this.f26142b);
        }
        return this.f26142b;
    }

    /* renamed from: c */
    public final void mo17403c() {
        mo17390a("is_64_devices", String.valueOf(C9586c.m19051a()));
        mo17390a("is_64_runtime", String.valueOf(NativeImpl.m19472b()));
        mo17390a("is_x86_devices", String.valueOf(C9586c.m19053b()));
    }

    public C9584a(JSONObject jSONObject) {
        this.f26141a = jSONObject;
    }

    /* renamed from: c */
    public final C9584a mo17402c(JSONObject jSONObject) {
        mo17395a("header", (Object) jSONObject);
        return this;
    }

    /* renamed from: d */
    public final C9584a mo17404d(JSONObject jSONObject) {
        m19016a(this.f26141a, jSONObject);
        return this;
    }

    /* renamed from: e */
    public final void mo17407e(JSONObject jSONObject) {
        m19018b(this.f26141a, jSONObject);
    }

    /* renamed from: f */
    private static JSONObject m19020f(JSONObject jSONObject) {
        Object opt = jSONObject.opt("data");
        if (opt instanceof JSONArray) {
            return ((JSONArray) opt).optJSONObject(0).optJSONObject("custom_long");
        }
        return jSONObject.optJSONObject("custom_long");
    }

    /* renamed from: b */
    public final C9584a mo17398b(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        mo17395a("logcat", (Object) jSONArray);
        return this;
    }

    /* renamed from: b */
    public static boolean m19019b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        Object opt = jSONObject.opt("data");
        if (opt instanceof JSONArray) {
            jSONObject2 = ((JSONArray) opt).optJSONObject(0).optJSONObject("custom_long");
        } else {
            jSONObject2 = jSONObject.optJSONObject("custom_long");
        }
        if (jSONObject2 != null && ((long) m19012a(jSONObject2.optJSONArray("memory_info"), "VmSize:", "\\s+").intValue()) > C9721c.m19481h()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C9584a mo17401c(Map<? extends String, ? extends String> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (map != null) {
            String str = "filters";
            Object opt = this.f26141a.opt("data");
            if (opt instanceof JSONArray) {
                jSONObject = ((JSONArray) opt).optJSONObject(0);
            } else {
                jSONObject = this.f26141a;
            }
            if (jSONObject == null) {
                jSONObject2 = new JSONObject();
            } else {
                JSONObject optJSONObject = jSONObject.optJSONObject(str);
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                    mo17395a(str, (Object) optJSONObject);
                }
                jSONObject2 = optJSONObject;
            }
            for (Entry entry : map.entrySet()) {
                try {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
            mo17395a("filters", (Object) jSONObject2);
        }
        return this;
    }

    /* renamed from: b */
    public final C9584a mo17399b(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer num : map.keySet()) {
                try {
                    jSONObject.put(String.valueOf(num), map.get(num));
                } catch (JSONException unused) {
                }
            }
            try {
                this.f26141a.put("sdk_info", jSONObject);
            } catch (JSONException unused2) {
            }
        }
        return this;
    }

    /* renamed from: a */
    public static boolean m19017a(JSONObject jSONObject) {
        JSONObject f = m19020f(jSONObject);
        if (f == null || C9698j.m19374a(f, "memory_info")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C9584a mo17386a(long j) {
        try {
            mo17395a("app_start_time", (Object) Long.valueOf(j));
            mo17395a("app_start_time_readable", (Object) new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
        } catch (Exception unused) {
        }
        return this;
    }

    /* renamed from: a */
    public final void mo17395a(String str, Object obj) {
        try {
            this.f26141a.put(str, obj);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final C9584a mo17385a(int i, String str) {
        try {
            this.f26141a.put("miniapp_id", i);
            this.f26141a.put("miniapp_version", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: a */
    public static void m19015a(JSONObject jSONObject, Map<? extends String, ? extends String> map) {
        if (map != null) {
            try {
                for (Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    private static void m19018b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    Object opt = jSONObject.opt(str);
                    if (jSONObject.opt(str) instanceof JSONObject) {
                        m19018b(jSONObject.getJSONObject(str), jSONObject2.getJSONObject(str));
                    } else if (opt instanceof JSONArray) {
                        JSONArray jSONArray = jSONObject2.getJSONArray(str);
                        JSONArray jSONArray2 = (JSONArray) opt;
                        if (jSONArray2.length() != 1 || !(jSONArray2.opt(0) instanceof JSONObject) || !(jSONArray.opt(0) instanceof JSONObject)) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                jSONArray2.put(jSONArray.get(i));
                            }
                        } else {
                            m19018b(jSONArray2.getJSONObject(0), jSONArray.getJSONObject(0));
                        }
                    } else {
                        jSONObject.put(str, jSONObject2.get(str));
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m19014a(JSONObject jSONObject, Throwable th) {
        String str = "npth_err_info";
        if (jSONObject.opt(str) == null) {
            try {
                jSONObject.put(str, C9713t.m19435a(th));
            } catch (Throwable unused) {
            }
            return;
        }
        int i = 0;
        while (i < 5) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i);
            if (jSONObject.opt(sb.toString()) == null) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(i);
                    jSONObject.put(sb2.toString(), C9713t.m19435a(th));
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: b */
    public final C9584a mo17397b(String str, String str2) {
        Object opt = this.f26141a.opt("data");
        if (opt instanceof JSONArray) {
            m19013a(((JSONArray) opt).optJSONObject(0), "custom", str, str2);
        } else {
            m19013a(this.f26141a, "custom", str, str2);
        }
        return this;
    }

    /* renamed from: a */
    public static void m19016a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        try {
            jSONObject3.put("storage", jSONObject4);
        } catch (Throwable unused) {
        }
        long optLong = jSONObject4.optLong("inner_free");
        long optLong2 = jSONObject4.optLong("sdcard_free");
        long optLong3 = jSONObject4.optLong("inner_free_real");
        if (optLong <= 1024) {
            str = "0 - 1K";
        } else if (optLong <= 65536) {
            str = "1K - 64K";
        } else if (optLong <= 524288) {
            str = "64K - 512K";
        } else if (optLong <= 1048576) {
            str = "512K - 1M";
        } else if (optLong <= 67108864) {
            str = "1M - 64M";
        } else {
            str = "64M - ";
        }
        if (optLong3 <= 1024) {
            str2 = "0 - 1K";
        } else if (optLong3 <= 65536) {
            str2 = "1K - 64K";
        } else if (optLong3 <= 524288) {
            str2 = "64K - 512K";
        } else if (optLong3 <= 1048576) {
            str2 = "512K - 1M";
        } else if (optLong3 <= 67108864) {
            str2 = "1M - 64M";
        } else {
            str2 = "64M - ";
        }
        if (optLong2 <= 1024) {
            str3 = "0 - 1K";
        } else if (optLong2 <= 65536) {
            str3 = "1K - 64K";
        } else if (optLong2 <= 524288) {
            str3 = "64K - 512K";
        } else if (optLong2 <= 1048576) {
            str3 = "512K - 1M";
        } else if (optLong2 <= 67108864) {
            str3 = "1M - 64M";
        } else {
            str3 = "64M - ";
        }
        m19013a(jSONObject3, "filters", "inner_free", str);
        m19013a(jSONObject3, "filters", "inner_free_real", str2);
        m19013a(jSONObject3, "filters", "sdcard_free", str3);
    }

    /* renamed from: a */
    private static Integer m19012a(JSONArray jSONArray, String str, String str2) {
        String str3 = null;
        if (jSONArray != null) {
            int i = 0;
            String str4 = null;
            while (i < jSONArray.length()) {
                try {
                    String optString = jSONArray.optString(i, null);
                    if (optString != null && optString.startsWith(str)) {
                        str4 = optString.split(str2)[1].trim();
                    }
                    i++;
                } catch (Throwable th) {
                    C9577e.m18999a().mo17384a("NPTH_CATCH", th);
                    return Integer.valueOf(-1);
                }
            }
            str3 = str4;
        }
        if (str3 == null) {
            return Integer.valueOf(-1);
        }
        return Integer.valueOf(Integer.parseInt(str3));
    }

    /* renamed from: a */
    public static void m19013a(JSONObject jSONObject, String str, String str2, String str3) {
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                try {
                    optJSONObject = new JSONObject();
                    jSONObject.put(str, optJSONObject);
                } catch (Throwable unused) {
                    return;
                }
            }
            optJSONObject.put(str2, str3);
        }
    }
}
