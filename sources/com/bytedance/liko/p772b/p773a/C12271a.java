package com.bytedance.liko.p772b.p773a;

import android.os.Build.VERSION;
import android.system.Os;
import com.bytedance.liko.p772b.C12272b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.liko.b.a.a */
public final class C12271a {

    /* renamed from: a */
    public static final C12271a f32382a = new C12271a();

    private C12271a() {
    }

    /* renamed from: a */
    public static List<String> m24755a(File file) {
        C52711k.m112240b(file, "fdDir");
        if (!file.exists() || !file.isDirectory()) {
            return C52575l.m112097a();
        }
        Set linkedHashSet = new LinkedHashSet();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            Collection arrayList = new ArrayList();
            for (File file2 : listFiles) {
                if (file2.exists()) {
                    arrayList.add(file2);
                }
            }
            for (File file3 : (List) arrayList) {
                if (file3.exists()) {
                    if (VERSION.SDK_INT >= 21) {
                        try {
                            C52711k.m112236a((Object) file3, "fdFile");
                            String readlink = Os.readlink(file3.getPath());
                            C52711k.m112236a((Object) readlink, "link");
                            linkedHashSet.add(readlink);
                        } catch (Throwable unused) {
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("readlink ");
                        C52711k.m112236a((Object) file3, "fdFile");
                        sb.append(file3.getPath());
                        linkedHashSet.add((String) C12272b.m24756a(sb.toString()).get(0));
                    }
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return C52575l.m112097a();
        }
        return C52575l.m112138e((Iterable<? extends T>) linkedHashSet);
    }
}
