package com.p2620vk.sdk;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.p2620vk.sdk.p2621a.C52324b;
import com.p2620vk.sdk.p2621a.C52325c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.vk.sdk.a */
public class C52322a {

    /* renamed from: i */
    private static volatile C52322a f130297i;

    /* renamed from: a */
    public String f130298a;

    /* renamed from: b */
    public int f130299b;

    /* renamed from: c */
    public String f130300c;

    /* renamed from: d */
    public String f130301d;

    /* renamed from: e */
    public boolean f130302e;

    /* renamed from: f */
    public long f130303f;

    /* renamed from: g */
    public String f130304g;

    /* renamed from: h */
    public Map<String, Boolean> f130305h;

    private C52322a() {
    }

    /* renamed from: c */
    public final void mo109137c() {
        m111780a(C52421d.m111976a(), "VK_SDK_ACCESS_TOKEN_PLEASE_DONT_TOUCH");
    }

    /* renamed from: b */
    public static C52322a m111781b() {
        if (f130297i == null) {
            synchronized (C52322a.class) {
                if (f130297i == null) {
                    C52322a aVar = null;
                    String string = PreferenceManager.getDefaultSharedPreferences(C52421d.m111976a()).getString("VK_SDK_ACCESS_TOKEN_PLEASE_DONT_TOUCH", null);
                    if (string != null) {
                        aVar = m111779a(C52325c.m111793a(string));
                    }
                    f130297i = aVar;
                }
            }
        }
        return f130297i;
    }

    /* renamed from: d */
    private Map<String, String> m111782d() {
        HashMap hashMap = new HashMap();
        hashMap.put("access_token", this.f130298a);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f130299b);
        hashMap.put("expires_in", sb.toString());
        hashMap.put("user_id", this.f130300c);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f130303f);
        hashMap.put("created", sb2.toString());
        if (this.f130305h != null) {
            hashMap.put("scope", TextUtils.join(",", this.f130305h.keySet()));
        }
        if (this.f130301d != null) {
            hashMap.put("secret", this.f130301d);
        }
        if (this.f130302e) {
            hashMap.put("https_required", "1");
        }
        if (this.f130304g != null) {
            hashMap.put("email", this.f130304g);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final boolean mo109136a() {
        if (this.f130299b <= 0 || ((long) (this.f130299b * 1000)) + this.f130303f >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C52322a mo109135a(C52322a aVar) {
        Map d = m111782d();
        d.putAll(aVar.m111782d());
        return m111779a(d);
    }

    /* renamed from: a */
    public static C52322a m111779a(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        C52322a aVar = new C52322a();
        try {
            aVar.f130298a = (String) map.get("access_token");
            aVar.f130300c = (String) map.get("user_id");
            aVar.f130301d = (String) map.get("secret");
            aVar.f130304g = (String) map.get("email");
            aVar.f130302e = false;
            if (map.get("expires_in") != null) {
                aVar.f130299b = Integer.parseInt((String) map.get("expires_in"));
            }
            String str = (String) map.get("scope");
            if (str != null) {
                HashMap hashMap = new HashMap();
                for (String put : str.split(",")) {
                    hashMap.put(put, Boolean.valueOf(true));
                }
                aVar.f130305h = hashMap;
            }
            if (map.containsKey("https_required")) {
                aVar.f130302e = ((String) map.get("https_required")).equals("1");
            } else if (aVar.f130301d == null) {
                aVar.f130302e = true;
            }
            if (map.containsKey("created")) {
                aVar.f130303f = Long.parseLong((String) map.get("created"));
            } else {
                aVar.f130303f = System.currentTimeMillis();
            }
            if (aVar.f130298a != null) {
                return aVar;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    static C52322a m111778a(Context context, C52322a aVar) {
        C52322a aVar2 = f130297i;
        f130297i = aVar;
        if (aVar != null) {
            f130297i.mo109137c();
        } else {
            String str = "VK_SDK_ACCESS_TOKEN_PLEASE_DONT_TOUCH";
            if (context != null) {
                Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                edit.remove(str);
                edit.apply();
            }
        }
        return aVar2;
    }

    /* renamed from: a */
    private void m111780a(Context context, String str) {
        if (context != null) {
            Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            edit.putString(str, C52324b.m111790a(m111782d()));
            edit.apply();
        }
    }
}
