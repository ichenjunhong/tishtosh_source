package p2628d.p2638e;

import java.io.File;
import java.util.Iterator;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: d.e.m */
public class C52663m extends C52662l {
    /* renamed from: c */
    public static final boolean m112211c(File file) {
        C52711k.m112240b(file, "$this$deleteRecursively");
        Iterator a = C52659i.m112204b(file).mo110157a();
        while (true) {
            boolean z = true;
            while (true) {
                if (!a.hasNext()) {
                    return z;
                }
                File file2 = (File) a.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: a */
    public static final boolean m112206a(File file, String str) {
        C52711k.m112240b(file, "$this$startsWith");
        C52711k.m112240b(str, "other");
        return C52659i.m112205a(file, new File(str));
    }

    /* renamed from: b */
    public static final boolean m112208b(File file, String str) {
        C52711k.m112240b(file, "$this$endsWith");
        C52711k.m112240b(str, "other");
        return C52659i.m112207b(file, new File(str));
    }

    /* renamed from: c */
    public static final File m112210c(File file, String str) {
        C52711k.m112240b(file, "$this$resolve");
        C52711k.m112240b(str, "relative");
        return C52659i.m112209c(file, new File(str));
    }

    /* renamed from: a */
    public static final boolean m112205a(File file, File file2) {
        C52711k.m112240b(file, "$this$startsWith");
        C52711k.m112240b(file2, "other");
        C52648d a = C52659i.m112199a(file);
        C52648d a2 = C52659i.m112199a(file2);
        if (!(!C52711k.m112239a((Object) a.f130930a, (Object) a2.f130930a)) && a.mo110268a() >= a2.mo110268a()) {
            return a.f130931b.subList(0, a2.mo110268a()).equals(a2.f130931b);
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m112207b(File file, File file2) {
        boolean z;
        C52711k.m112240b(file, "$this$endsWith");
        C52711k.m112240b(file2, "other");
        C52648d a = C52659i.m112199a(file);
        C52648d a2 = C52659i.m112199a(file2);
        String path = a2.f130930a.getPath();
        C52711k.m112236a((Object) path, "root.path");
        if (path.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C52711k.m112239a((Object) file, (Object) file2);
        }
        int a3 = a.mo110268a() - a2.mo110268a();
        if (a3 < 0) {
            return false;
        }
        return a.f130931b.subList(a3, a.mo110268a()).equals(a2.f130931b);
    }

    /* renamed from: c */
    public static final File m112209c(File file, File file2) {
        boolean z;
        C52711k.m112240b(file, "$this$resolve");
        C52711k.m112240b(file2, "relative");
        C52711k.m112240b(file2, "$this$isRooted");
        String path = file2.getPath();
        C52711k.m112236a((Object) path, LeakCanaryFileProvider.f132050j);
        boolean z2 = true;
        if (C52660j.m112198a(path) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return file2;
        }
        String file3 = file.toString();
        C52711k.m112236a((Object) file3, "this.toString()");
        CharSequence charSequence = file3;
        if (charSequence.length() != 0) {
            z2 = false;
        }
        if (z2 || C52830p.m112439a(charSequence, File.separatorChar, false, 2, (Object) null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(file3);
            sb.append(file2);
            return new File(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file3);
        sb2.append(File.separatorChar);
        sb2.append(file2);
        return new File(sb2.toString());
    }
}
