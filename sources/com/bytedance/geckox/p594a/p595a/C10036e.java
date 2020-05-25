package com.bytedance.geckox.p594a.p595a;

import com.bytedance.geckox.p594a.C10039c;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.bytedance.geckox.a.a.e */
final class C10036e extends C10033b {
    C10036e() {
    }

    /* renamed from: a */
    public final void mo18009a() {
        List list;
        for (String file : this.f27276f) {
            File file2 = new File(this.f27275e, file);
            if (!file2.exists() || !file2.isDirectory()) {
                list = null;
            } else {
                list = Arrays.asList(file2.listFiles());
                Collections.sort(list, new Comparator<File>() {
                    public final /* synthetic */ int compare(Object obj, Object obj2) {
                        return (((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
                    }
                });
            }
            if (list != null && list.size() > this.f27274d.f27268a) {
                for (File file3 : list.subList(0, list.size() - this.f27274d.f27268a)) {
                    C10039c.m20202c(file3.getAbsolutePath());
                    if (this.f27274d.f27270c != null) {
                        file3.getName();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo18010a(C10032a aVar, File file, List<String> list) {
        super.mo18010a(aVar, file, list);
    }
}
