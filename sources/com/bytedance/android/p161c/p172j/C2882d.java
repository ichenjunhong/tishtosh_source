package com.bytedance.android.p161c.p172j;

import java.io.File;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.c.j.d */
public final class C2882d {
    /* renamed from: a */
    public static File[] m8183a(File[] fileArr, File file) {
        if (fileArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArr) {
            if (file2 == null) {
                arrayList.add(null);
            } else if (!file2.getAbsolutePath().equals(file.getAbsolutePath())) {
                arrayList.add(file2);
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }
}
