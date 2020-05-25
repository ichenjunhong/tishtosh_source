package com.p683ss.android.ugc.aweme.dfbase;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.p763l.C12152c;
import com.bytedance.p763l.p764a.C12138a;
import com.bytedance.p763l.p765b.C12150a;
import com.google.android.play.core.p1053e.C17338d;
import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27540a;
import com.p683ss.android.ugc.aweme.p2402x.C48410a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.dfbase.m */
public final class C27558m {
    static {
        C27560o.m66233c();
    }

    /* renamed from: b */
    public static C17338d m66226b() {
        return C12138a.m24565a();
    }

    /* renamed from: a */
    public static List<String> m66223a() {
        ArrayList arrayList = new ArrayList();
        Map c = C12152c.m24597c();
        if (c != null) {
            for (C12150a aVar : c.values()) {
                if (aVar.f32071c == 5) {
                    arrayList.add(m66227b(aVar.f32069a));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static void m66229c() {
        if (VERSION.SDK_INT >= 21) {
            Keva repo = Keva.getRepo("dynamic_task_triggered", 0);
            if (repo != null) {
                for (Entry entry : repo.getAll().entrySet()) {
                    String str = (String) entry.getValue();
                    if (str != null) {
                        C27540a b = new C27540a().mo55990a(false).mo55991b(true);
                        b.f72421h = true;
                        C27540a a = b.mo55988a(0);
                        if (m66230d(str)) {
                            Locale locale = new Locale((String) entry.getKey());
                            if (!C48410a.m104739a(locale)) {
                                new C48410a(locale, a).mo55968a();
                            }
                        } else {
                            String str2 = (String) entry.getKey();
                            if (!m66225a(str2)) {
                                new C27532a(a.mo55989a(str2)).mo55968a();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static String m66228c(String str) {
        return C12138a.m24566a(str);
    }

    /* renamed from: d */
    public static boolean m66230d(String str) {
        return TextUtils.equals(str, "com.ss.android.ugc.aweme.dflanguage");
    }

    /* renamed from: b */
    public static String m66227b(String str) {
        return C12138a.m24567b(str);
    }

    /* renamed from: a */
    public static boolean m66225a(String str) {
        C12150a a = C12152c.m24593a(m66228c(str));
        if (a == null || a.f32071c != 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m66224a(String str, String str2) {
        C12152c.m24595a(m66228c(str), str2);
    }
}
