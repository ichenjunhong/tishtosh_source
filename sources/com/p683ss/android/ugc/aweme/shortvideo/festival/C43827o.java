package com.p683ss.android.ugc.aweme.shortvideo.festival;

import com.p683ss.android.ugc.tools.utils.C50200d;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.o */
public final class C43827o {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.o$a */
    public static final class C43828a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C52594a.m112153a(Integer.valueOf(((C43825m) t).f110985a), Integer.valueOf(((C43825m) t2).f110985a));
        }
    }

    /* renamed from: a */
    public static final List<C43825m> m96260a(String str) {
        File[] listFiles;
        int i;
        if (!C50200d.m108346a(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : new File(str).listFiles()) {
            C52711k.m112236a((Object) file, "waterFile");
            if (!file.isHidden()) {
                String name = file.getName();
                C52711k.m112236a((Object) name, "waterFile.name");
                if (C52830p.m112411b(name, "dynamic_watermark_", false, 2, null)) {
                    String path = file.getPath();
                    C52711k.m112236a((Object) path, "waterFile.path");
                    if (C52830p.m112413c(path, ".png", false, 2, null)) {
                        String name2 = file.getName();
                        C52711k.m112236a((Object) name2, "waterFile.name");
                        String a = C52830p.m112434a(C52830p.m112450b(name2, "dynamic_watermark_", (String) null, 2, (Object) null), ".png", (String) null, 2, (Object) null);
                        if (C52830p.m112395c(a) == null) {
                            i = 0;
                        } else {
                            i = Integer.parseInt(a);
                        }
                        String path2 = file.getPath();
                        C52711k.m112236a((Object) path2, "waterFile.path");
                        arrayList.add(new C43825m(i, path2));
                    }
                }
            }
        }
        List<C43825m> list = arrayList;
        if (list.size() > 1) {
            C52575l.m112105a(list, new C43828a());
        }
        return list;
    }
}
