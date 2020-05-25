package com.bytedance.android.p140a.p151b.p152a;

import android.text.TextUtils;
import com.bytedance.android.p140a.p141a.C2786e;
import com.bytedance.android.p140a.p141a.C2789f;
import com.bytedance.android.p140a.p141a.p150i.C2804f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: com.bytedance.android.a.b.a.a */
public abstract class C2809a {
    /* renamed from: a */
    private static String m7982a() {
        return "";
    }

    /* renamed from: b */
    private static String m7984b() {
        return "";
    }

    /* renamed from: c */
    private static String m7985c() {
        return "";
    }

    /* renamed from: d */
    private static String m7986d() {
        return "";
    }

    /* renamed from: e */
    private static String m7987e() {
        return "";
    }

    /* renamed from: f */
    private static String m7988f() {
        return "";
    }

    /* renamed from: g */
    private static String m7989g() {
        return "0";
    }

    /* renamed from: h */
    private static String m7990h() {
        return "";
    }

    /* renamed from: j */
    private static String m7992j() {
        return "";
    }

    /* renamed from: k */
    private static String m7993k() {
        return "";
    }

    /* renamed from: l */
    private static String m7994l() {
        return "Android";
    }

    /* renamed from: i */
    private static String m7991i() {
        C2789f fVar = C2786e.m7920d().f8361h;
        if (fVar != null) {
            return fVar.mo7392a();
        }
        return "";
    }

    /* renamed from: a */
    public final Map<String, String> mo7405a(List<String> list) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        HashMap hashMap = new HashMap();
        if (list.isEmpty()) {
            m7983a(hashMap, valueOf);
            return hashMap;
        }
        for (String str : list) {
            try {
                if (!TextUtils.equals("__TS__", str)) {
                    if (!TextUtils.equals("{TS}", str)) {
                        if ((TextUtils.equals("__MAC__", str) || TextUtils.equals("{MAC}", str)) && !TextUtils.isEmpty(m7982a())) {
                            String a = C2804f.m7971a(m7982a().replace(":", "").toUpperCase());
                            if (!TextUtils.isEmpty(a)) {
                                hashMap.put(str, a);
                            }
                        } else if ((TextUtils.equals("__MAC1__", str) || TextUtils.equals("{MAC1}", str)) && !TextUtils.isEmpty(m7982a())) {
                            String a2 = C2804f.m7971a(m7982a().toUpperCase());
                            if (!TextUtils.isEmpty(a2)) {
                                hashMap.put(str, a2);
                            }
                        } else if ((TextUtils.equals("__ANDROIDID__", str) || TextUtils.equals("{ANDROIDID}", str)) && !TextUtils.isEmpty(m7984b())) {
                            String a3 = C2804f.m7971a(m7984b());
                            if (!TextUtils.isEmpty(a3)) {
                                hashMap.put(str, a3);
                            }
                        } else if ((TextUtils.equals("__ANDROIDID1__", str) || TextUtils.equals("{ANDROIDID1}", str)) && !TextUtils.isEmpty(m7984b())) {
                            hashMap.put(str, m7984b());
                        } else if ((TextUtils.equals("__IMEI__", str) || TextUtils.equals("{IMEI}", str)) && !TextUtils.isEmpty(m7985c())) {
                            String a4 = C2804f.m7971a(m7985c());
                            if (!TextUtils.isEmpty(a4)) {
                                hashMap.put(str, a4);
                            }
                        } else {
                            if (!TextUtils.equals("__OAID__", str)) {
                                if (!TextUtils.equals("{OAID}", str) || TextUtils.isEmpty(m7986d())) {
                                    if (!TextUtils.equals("__OAID_MD5__", str)) {
                                        if (!TextUtils.equals("{OAID_MD5}", str) || TextUtils.isEmpty(m7986d())) {
                                            if ((TextUtils.equals("__AAID__", str) || TextUtils.equals("{AAID}", str)) && !TextUtils.isEmpty(m7987e())) {
                                                hashMap.put(str, m7987e());
                                            } else if ((TextUtils.equals("__OPENUDID__", str) || TextUtils.equals("{OPENUDID}", str)) && !TextUtils.isEmpty(m7988f())) {
                                                hashMap.put(str, m7988f());
                                            } else if ((TextUtils.equals("__OS__", str) || TextUtils.equals("{OS}", str)) && !TextUtils.isEmpty(m7989g())) {
                                                hashMap.put(str, m7989g());
                                            } else if ((TextUtils.equals("__IP__", str) || TextUtils.equals("{IP}", str)) && !TextUtils.isEmpty(m7990h())) {
                                                hashMap.put(str, m7990h());
                                            } else if (!TextUtils.equals("__LBS__", str)) {
                                                if (!TextUtils.equals("{LBS}", str)) {
                                                    if (!TextUtils.equals("__GEO__", str)) {
                                                        if (!TextUtils.equals("{GEO}", str)) {
                                                            if ((TextUtils.equals("__UA__", str) || TextUtils.equals("{UA}", str)) && !TextUtils.isEmpty(m7991i())) {
                                                                String b = C2804f.m7972b(C2804f.m7973c(m7991i()));
                                                                if (!TextUtils.isEmpty(b)) {
                                                                    hashMap.put(str, b);
                                                                }
                                                            } else if ((TextUtils.equals("__UOO__", str) || TextUtils.equals("{UOO}", str)) && !TextUtils.isEmpty(m7992j())) {
                                                                hashMap.put(str, m7992j());
                                                            } else if ((TextUtils.equals("__DEVICE_ID__", str) || TextUtils.equals("{DEVICE_ID}", str)) && !TextUtils.isEmpty(m7993k())) {
                                                                hashMap.put(str, m7993k());
                                                            } else if ((TextUtils.equals("__OS_STR__", str) || TextUtils.equals("{OS_STR}", str)) && !TextUtils.isEmpty(m7994l())) {
                                                                hashMap.put(str, m7994l());
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    String a5 = C2804f.m7971a(m7986d());
                                    if (!TextUtils.isEmpty(a5)) {
                                        hashMap.put(str, a5);
                                    }
                                }
                            }
                            hashMap.put(str, m7986d());
                        }
                    }
                }
                hashMap.put(str, valueOf);
            } catch (Throwable unused) {
            }
        }
        m7983a(hashMap, valueOf);
        return hashMap;
    }

    /* renamed from: a */
    private static void m7983a(Map<String, String> map, String str) {
        map.put("[ss_random]", String.valueOf(new Random().nextLong()));
        map.put("[ss_timestamp]", str);
    }
}
