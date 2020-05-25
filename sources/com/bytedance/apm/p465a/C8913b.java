package com.bytedance.apm.p465a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.p465a.p468c.C8917b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.apm.a.b */
public final class C8913b implements C8920e {
    /* renamed from: a */
    public final List<String> mo15951a(Context context, String str, long j, long j2) {
        File[] listFiles;
        String str2;
        boolean z = !C8917b.m17641a(context).contains(":");
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            File file = new File(str);
            if (file.exists() && file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    String name = file2.getName();
                    if (name.endsWith(".hot") && ((!z || !file2.getName().contains("-")) && (z || file2.getName().contains("-")))) {
                        if (z) {
                            str2 = C8917b.m17641a(context);
                        } else {
                            str2 = C8917b.m17641a(context).replace(":", "-");
                        }
                        if (name.contains(str2)) {
                            String[] split = name.split("_");
                            if (split != null && split.length >= 4) {
                                long parseLong = Long.parseLong(split[3]) / 1000;
                                if (parseLong >= j && parseLong <= j2) {
                                    arrayList.add(file2.getAbsolutePath());
                                }
                            } else if (split != null && split.length > 1) {
                                long parseLong2 = Long.parseLong(split[0]) / 1000;
                                if (parseLong2 >= j && parseLong2 <= j2) {
                                    arrayList.add(file2.getAbsolutePath());
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
