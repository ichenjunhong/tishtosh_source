package com.p683ss.android.common.p1143b;

import com.bytedance.common.utility.p522b.C9379e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ss.android.common.b.a */
public final class C18881a {

    /* renamed from: a */
    private static Set<String> f52088a = new HashSet();

    /* renamed from: b */
    private static C9379e<C18882a> f52089b = new C9379e<>();

    /* renamed from: com.ss.android.common.b.a$a */
    public interface C18882a {
        /* renamed from: a */
        String mo38690a();

        /* renamed from: b */
        boolean mo38691b();
    }

    /* renamed from: a */
    public static String m45972a() {
        if (f52088a == null || f52088a.isEmpty()) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (String str : f52088a) {
                if (i < f52088a.size() - 1) {
                    sb.append(str);
                    sb.append("|");
                } else {
                    sb.append(str);
                }
                i++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m45973b() {
        if (f52089b == null || f52089b.mo17007b()) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            Iterator it = f52089b.iterator();
            while (it.hasNext()) {
                C18882a aVar = (C18882a) it.next();
                if (aVar != null && !f52088a.contains(aVar.mo38690a()) && aVar.mo38691b()) {
                    if (i < f52089b.mo17008c() - 1) {
                        sb.append(aVar.mo38690a());
                        sb.append("|");
                    } else {
                        sb.append(aVar.mo38690a());
                    }
                }
                i++;
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
