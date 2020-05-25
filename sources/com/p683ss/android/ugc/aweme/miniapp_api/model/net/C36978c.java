package com.p683ss.android.ugc.aweme.miniapp_api.model.net;

import com.p2615tt.miniapphost.AppBrandLogger;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.net.c */
public class C36978c {

    /* renamed from: c */
    public String f94420c;

    /* renamed from: d */
    public byte[] f94421d;

    /* renamed from: e */
    public String f94422e;

    /* renamed from: f */
    public String f94423f;

    /* renamed from: g */
    public String f94424g;

    /* renamed from: h */
    public Map<String, String> f94425h = new HashMap();

    /* renamed from: i */
    public Map<String, Object> f94426i = new HashMap();

    /* renamed from: j */
    public Map<String, C36980b> f94427j = new HashMap();

    /* renamed from: k */
    public long f94428k = 10000;

    /* renamed from: l */
    public long f94429l = 10000;

    /* renamed from: m */
    public long f94430m = 10000;

    /* renamed from: n */
    public boolean f94431n = false;

    /* renamed from: o */
    public boolean f94432o = false;

    /* renamed from: p */
    public C36979a f94433p;

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.net.c$a */
    public interface C36979a {
        /* renamed from: a */
        void mo76071a();
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.net.c$b */
    public static class C36980b {

        /* renamed from: a */
        public File f94434a;

        /* renamed from: b */
        public String f94435b;

        public C36980b(File file, String str) {
            this.f94434a = file;
            this.f94435b = str;
        }
    }

    /* renamed from: a */
    public final String mo76273a() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Entry entry : this.f94426i.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            AppBrandLogger.stacktrace(5, "MicroAppRequest", e.getStackTrace());
        }
        return jSONObject.toString();
    }
}
