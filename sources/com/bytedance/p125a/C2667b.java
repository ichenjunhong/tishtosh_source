package com.bytedance.p125a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.a.b */
public final class C2667b {

    /* renamed from: a */
    public static volatile boolean f8109a = false;

    /* renamed from: b */
    public static Map<String, C2668c> f8110b = new HashMap();

    /* renamed from: c */
    private static volatile long f8111c = 5000;

    /* renamed from: d */
    private static Map<String, Integer> f8112d = new HashMap();

    /* renamed from: e */
    private static Map<String, Integer> f8113e = new HashMap();

    /* renamed from: f */
    private static C2666a f8114f;

    /* renamed from: a */
    public static void m7662a(C2668c cVar) {
        if (f8114f != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", cVar.f8115a);
                jSONObject.put("sub_scene", cVar.f8116b);
                jSONObject.put("duration", cVar.f8121g);
                jSONObject.put("status", cVar.f8120f);
                jSONObject.put("is_first", cVar.f8117c);
                if (cVar.f8118d >= 0) {
                    jSONObject.put("pull_type", cVar.f8118d);
                }
                if (cVar.f8122h >= 0) {
                    jSONObject.put("reason", cVar.f8122h);
                }
                if (cVar.f8123i >= 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", cVar.f8123i);
                    jSONObject.put("net_info", jSONObject2);
                }
                if (cVar.f8124j != null) {
                    jSONObject.put("scene_info", cVar.f8124j);
                }
                f8114f.mo7220a("net_quality", jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private static void m7666b(C2668c cVar) {
        String str;
        String str2;
        if (f8109a) {
            m7662a(cVar);
            if (TextUtils.isEmpty(cVar.f8116b)) {
                str = cVar.f8115a;
            } else {
                str = cVar.f8116b;
            }
            f8110b.remove(str);
            if (f8110b.size() > 0) {
                for (C2668c cVar2 : f8110b.values()) {
                    if (System.currentTimeMillis() - cVar2.f8119e > f8111c) {
                        cVar2.f8120f = 3;
                        cVar2.f8121g = System.currentTimeMillis() - cVar2.f8119e;
                        m7662a(cVar);
                        if (TextUtils.isEmpty(cVar2.f8116b)) {
                            str2 = cVar2.f8115a;
                        } else {
                            str2 = cVar2.f8116b;
                        }
                        f8110b.remove(str2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m7665a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String sb2 = sb.toString();
        Integer num = (Integer) f8113e.get(sb2);
        if (num == null || num.intValue() <= 0) {
            return true;
        }
        Integer num2 = (Integer) f8112d.get(sb2);
        if (num2 == null) {
            num2 = Integer.valueOf(0);
        }
        Map<String, Integer> map = f8112d;
        Integer valueOf = Integer.valueOf(num2.intValue() + 1);
        map.put(sb2, valueOf);
        if (valueOf.intValue() <= num.intValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m7663a(String str, String str2, int i) {
        String str3;
        if (f8109a && m7665a(str, str2)) {
            if (TextUtils.isEmpty(str2)) {
                str3 = str;
            } else {
                str3 = str2;
            }
            if (f8110b.get(str3) == null) {
                C2668c cVar = new C2668c();
                cVar.f8115a = str;
                cVar.f8116b = str2;
                cVar.f8119e = System.currentTimeMillis();
                f8110b.put(str3, cVar);
            }
        }
    }

    /* renamed from: b */
    public static void m7667b(String str, String str2, int i) {
        if (f8109a) {
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            C2668c cVar = (C2668c) f8110b.get(str);
            if (cVar != null) {
                cVar.f8120f = 0;
                cVar.f8121g = System.currentTimeMillis() - cVar.f8119e;
                cVar.f8124j = null;
                m7666b(cVar);
            }
        }
    }

    /* renamed from: c */
    public static void m7668c(String str, String str2, int i) {
        if (f8109a) {
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            C2668c cVar = (C2668c) f8110b.get(str);
            if (cVar != null) {
                cVar.f8120f = 2;
                cVar.f8121g = System.currentTimeMillis() - cVar.f8119e;
                cVar.f8122h = 1;
                cVar.f8124j = null;
                m7666b(cVar);
            }
        }
    }

    /* renamed from: a */
    public static void m7661a(int i, Map<String, Integer> map, int i2, C2666a aVar) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        f8109a = z;
        f8113e = map;
        f8111c = (long) i2;
        f8114f = aVar;
    }

    /* renamed from: a */
    public static void m7664a(String str, String str2, int i, int i2) {
        if (f8109a) {
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            C2668c cVar = (C2668c) f8110b.get(str);
            if (cVar != null) {
                cVar.f8121g = System.currentTimeMillis() - cVar.f8119e;
                cVar.f8120f = 1;
                cVar.f8122h = 1;
                cVar.f8123i = i2;
                cVar.f8124j = null;
                m7666b(cVar);
            }
        }
    }
}
