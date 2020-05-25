package com.bytedance.p126ad.symphony.p138h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.p126ad.symphony.C2680b;
import com.bytedance.p126ad.symphony.p134e.p135a.C2726d;
import com.bytedance.p126ad.symphony.p139i.C2742a;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.h.b */
public final class C2740b {

    /* renamed from: a */
    Map<String, C2739a> f8286a = new ConcurrentHashMap();

    /* renamed from: b */
    public boolean f8287b;

    /* renamed from: c */
    public C2726d f8288c;

    /* renamed from: d */
    private Context f8289d;

    /* renamed from: e */
    private long f8290e;

    /* renamed from: f */
    private String f8291f;

    /* renamed from: g */
    private String f8292g;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public SharedPreferences mo7298a() {
        return C35807d.m80935a(this.f8289d, this.f8291f, 0);
    }

    /* renamed from: b */
    private C2739a m7822b() {
        C2739a aVar = (C2739a) this.f8286a.get("debug_strategy");
        if (aVar == null) {
            aVar = m7823b("debug_strategy");
        }
        if (aVar == null) {
            return C2739a.f8277a;
        }
        return aVar;
    }

    /* renamed from: c */
    private static String m7824c(String str) {
        if (C9431p.m18664a(str) || str.length() < 2) {
            return "";
        }
        return str.substring(0, str.length() - 2);
    }

    /* renamed from: a */
    public final C2739a mo7299a(String str) {
        if (C9431p.m18664a(str)) {
            return C2739a.f8277a;
        }
        if (this.f8287b && C2680b.m7713b()) {
            return m7822b();
        }
        C2739a aVar = (C2739a) this.f8286a.get(str);
        if (aVar == null) {
            aVar = m7823b(str);
        }
        if (aVar == null) {
            return C2739a.f8277a;
        }
        return aVar;
    }

    /* renamed from: b */
    private C2739a m7823b(String str) {
        String str2;
        boolean z = true;
        if (mo7298a().getInt("key_version", 0) != 1) {
            z = false;
        }
        JSONObject jSONObject = null;
        if (z) {
            str2 = mo7298a().getString(str, null);
        } else {
            str2 = null;
        }
        if (C9431p.m18664a(str2)) {
            if (this.f8288c == null || this.f8288c.mo7279a(m7824c(str)) == null) {
                str2 = this.f8292g;
            } else {
                str2 = this.f8288c.mo7279a(m7824c(str));
            }
        }
        StringBuilder sb = new StringBuilder("placement-->");
        sb.append(str);
        sb.append(", strategy-->");
        sb.append(str2);
        try {
            jSONObject = new JSONObject(str2);
        } catch (Exception unused) {
        }
        C2739a a = C2739a.m7816a(jSONObject);
        if (a != null) {
            this.f8286a.put(str, a);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo7300a(String str, C2739a aVar) {
        if (!C9431p.m18664a(str)) {
            this.f8286a.put(str, aVar);
            if (System.currentTimeMillis() - this.f8290e > 120000) {
                C2742a.m7829a((Runnable) new Runnable() {
                    public final void run() {
                        C2740b bVar = C2740b.this;
                        Editor edit = bVar.mo7298a().edit();
                        for (String str : bVar.f8286a.keySet()) {
                            C2739a aVar = (C2739a) bVar.f8286a.get(str);
                            if (aVar != null) {
                                String a = aVar.mo7293a();
                                if (a != null) {
                                    edit.putString(str, a);
                                }
                            }
                        }
                        edit.putInt("key_version", 1);
                        C9402b.m18594a(edit);
                    }
                });
                this.f8290e = System.currentTimeMillis();
            }
        }
    }

    public C2740b(Context context, String str, String str2) {
        this.f8289d = context.getApplicationContext();
        this.f8291f = str;
        this.f8292g = str2;
    }
}
