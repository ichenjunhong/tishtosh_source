package com.p683ss.android.ugc.aweme.setting.boe;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.p833c.C12727a;
import com.p683ss.android.ugc.aweme.setting.C41623i;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.setting.boe.a */
public class C41588a {

    /* renamed from: b */
    private static C41588a f105317b;

    /* renamed from: a */
    public C12727a f105318a;

    private C41588a() {
    }

    /* renamed from: a */
    public final void mo85367a(String str, boolean z) {
    }

    /* renamed from: b */
    public static Context m91429b() {
        return C11010c.m22280a();
    }

    /* renamed from: a */
    public static C41588a m91426a() {
        if (f105317b == null) {
            synchronized (C41588a.class) {
                if (f105317b == null) {
                    f105317b = new C41588a();
                }
            }
        }
        return f105317b;
    }

    /* renamed from: a */
    public static void m91427a(File file) {
        try {
            m91428a(file.getPath());
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static boolean m91430b(File file) {
        return C41623i.m91493a(file);
    }

    /* renamed from: a */
    private static void m91428a(String str) throws Exception {
        File file = new File(str);
        if (!m91430b(file) && file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    m91428a(listFiles[i].getAbsolutePath());
                } else if (!m91430b(listFiles[i])) {
                    listFiles[i].delete();
                } else {
                    return;
                }
            }
            file.delete();
        }
    }
}
