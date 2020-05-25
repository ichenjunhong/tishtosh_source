package p2628d.p2638e;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: d.e.j */
class C52660j {
    /* renamed from: a */
    static final int m112198a(String str) {
        CharSequence charSequence = str;
        int a = C52830p.m112415a(charSequence, File.separatorChar, 0, false, 4, (Object) null);
        if (a == 0) {
            if (str.length() > 1 && str.charAt(1) == File.separatorChar) {
                int a2 = C52830p.m112415a(charSequence, File.separatorChar, 2, false, 4, (Object) null);
                if (a2 >= 0) {
                    int i = a2 + 1;
                    int a3 = C52830p.m112415a(charSequence, File.separatorChar, i, false, 4, (Object) null);
                    if (a3 >= 0) {
                        return a3 + 1;
                    }
                    return str.length();
                }
            }
            return 1;
        } else if (a > 0 && str.charAt(a - 1) == ':') {
            return a + 1;
        } else {
            if (a != -1 || !C52830p.m112439a(charSequence, ':', false, 2, (Object) null)) {
                return 0;
            }
            return str.length();
        }
    }

    /* renamed from: a */
    public static final C52648d m112199a(File file) {
        boolean z;
        List list;
        C52711k.m112240b(file, "$this$toComponents");
        String path = file.getPath();
        C52711k.m112236a((Object) path, LeakCanaryFileProvider.f132050j);
        int a = m112198a(path);
        String substring = path.substring(0, a);
        C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String substring2 = path.substring(a);
        C52711k.m112236a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
        CharSequence charSequence = substring2;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            list = C52575l.m112097a();
        } else {
            Iterable<String> a2 = C52830p.m112437a(charSequence, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            Collection arrayList = new ArrayList(C52575l.m112104a(a2, 10));
            for (String file2 : a2) {
                arrayList.add(new File(file2));
            }
            list = (List) arrayList;
        }
        return new C52648d(new File(substring), list);
    }
}
