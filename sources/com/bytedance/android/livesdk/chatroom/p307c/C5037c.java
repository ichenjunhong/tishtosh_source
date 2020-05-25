package com.bytedance.android.livesdk.chatroom.p307c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.c.c */
public final class C5037c {

    /* renamed from: b */
    public static boolean f13469b = true;

    /* renamed from: l */
    public static Map<String, Long> f13470l = new HashMap();

    /* renamed from: q */
    public static Map<String, Long> f13471q = new HashMap();

    /* renamed from: r */
    public static Map<String, String> f13472r = new HashMap();

    /* renamed from: t */
    private static final String[] f13473t = {"n_time_slide_selected", "n_time_start_room", "n_time_fragment_start_pulling", "n_time_start_pulling", "n_time_player_start_pulling", "n_time_player_first_frame", "n_time_fragment_first_frame", "n_time_api_start", "n_time_api_finish"};

    /* renamed from: a */
    public Map<String, Long> f13474a = new HashMap();

    /* renamed from: c */
    public Map<String, Long> f13475c = new HashMap(6);

    /* renamed from: d */
    public int f13476d;

    /* renamed from: e */
    public String f13477e;

    /* renamed from: f */
    public String f13478f;

    /* renamed from: g */
    public String f13479g;

    /* renamed from: h */
    public String f13480h;

    /* renamed from: i */
    public int f13481i;

    /* renamed from: j */
    public long f13482j;

    /* renamed from: k */
    public boolean f13483k = false;

    /* renamed from: m */
    public long f13484m = 0;

    /* renamed from: n */
    public long f13485n = 0;

    /* renamed from: o */
    public long f13486o = 0;

    /* renamed from: p */
    public boolean f13487p;

    /* renamed from: s */
    public String f13488s;

    /* renamed from: u */
    private final String f13489u = "2.0";

    /* renamed from: b */
    public final void mo10896b(String str) {
        m11523a(str, true);
    }

    /* renamed from: c */
    public final void mo10897c(String str) {
        m11523a(str, false);
    }

    /* renamed from: a */
    public static String m11522a(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    /* renamed from: f */
    public static String m11528f(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_start");
        return sb.toString();
    }

    /* renamed from: g */
    public static String m11529g(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_end");
        return sb.toString();
    }

    /* renamed from: d */
    public long mo10898d(String str) {
        Long l = (Long) this.f13474a.get(str);
        if (l == null || l.longValue() <= 0) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: e */
    public long mo10899e(String str) {
        long a = m11521a(this.f13475c, m11529g(str)) - m11521a(this.f13475c, m11528f(str));
        if (a <= 0) {
            return 0;
        }
        return a;
    }

    /* renamed from: a */
    public final void mo10893a(String str) {
        mo10894a(str, System.currentTimeMillis());
    }

    /* renamed from: a */
    public void mo10895a(JSONObject jSONObject) {
        String[] strArr;
        StringBuilder sb = new StringBuilder("monitor test ");
        long d = mo10898d("n_time_begin");
        if (d > 0) {
            for (String str : f13473t) {
                long d2 = mo10898d(str);
                if (d2 > 0) {
                    long j = d2 - d;
                    m11525a(jSONObject, str, Long.valueOf(j));
                    sb.append(str);
                    sb.append("=");
                    sb.append(j);
                    sb.append("; ");
                }
            }
        }
    }

    /* renamed from: a */
    public static long m11521a(Map<String, Long> map, String str) {
        Long l = (Long) map.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    /* renamed from: b */
    public static void m11527b(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            f13470l.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    private void m11523a(String str, boolean z) {
        String str2;
        if (this.f13476d != 1 || !TextUtils.equals(str, "apiDuration")) {
            if (z) {
                str2 = m11528f(str);
            } else {
                str2 = m11529g(str);
            }
            this.f13475c.put(str2, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    public final void mo10894a(String str, long j) {
        this.f13474a.put(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static void m11524a(JSONObject jSONObject, String str, Integer num) {
        try {
            jSONObject.put(str, num);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m11525a(JSONObject jSONObject, String str, Long l) {
        try {
            jSONObject.put(str, l);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m11526a(JSONObject jSONObject, String str, String str2) {
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }
}
