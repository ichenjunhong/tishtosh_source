package com.bytedance.android.p161c.p169h;

import android.content.Context;
import android.os.Build.VERSION;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.c.h.c */
public abstract class C2865c {

    /* renamed from: f */
    protected static List<File> f8526f;

    /* renamed from: a */
    public abstract InputStream mo7475a();

    public C2865c(Context context) {
        m8165a(context);
    }

    /* renamed from: a */
    private static void m8165a(Context context) {
        if (f8526f == null) {
            ArrayList arrayList = new ArrayList();
            f8526f = arrayList;
            arrayList.add(new File(context.getPackageResourcePath()));
            if (VERSION.SDK_INT >= 21) {
                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                if (strArr != null && strArr.length != 0) {
                    for (String file : strArr) {
                        f8526f.add(new File(file));
                    }
                }
            }
        }
    }
}
