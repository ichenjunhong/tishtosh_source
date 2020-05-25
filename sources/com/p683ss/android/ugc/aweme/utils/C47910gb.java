package com.p683ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.utils.gb */
public final class C47910gb {
    /* renamed from: a */
    private static long m103633a(Context context) throws Exception {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: a */
    public static void m103634a(int i) {
        m103635b(i);
        C12203q.m24648b(i);
        if (5 == i) {
            C32458a.m75144a("trimMemory : Activity.TRIM_MEMORY_RUNNING_MODERATE");
            System.gc();
        } else if (10 == i) {
            C32458a.m75144a("trimMemory : Activity.TRIM_MEMORY_RUNNING_LOW");
            System.gc();
        } else if (40 == i) {
            C32458a.m75144a("trimMemory : Activity.TRIM_MEMORY_BACKGROUND");
        } else {
            StringBuilder sb = new StringBuilder("trimMemory level:");
            sb.append(i);
            C32458a.m75144a(sb.toString());
        }
    }

    /* renamed from: b */
    private static void m103635b(int i) {
        try {
            int a = (int) ((m103633a(C11010c.m22280a()) / 1024) / 1024);
            StringBuilder sb = new StringBuilder();
            sb.append(C11016e.m22312g().getClass().getName());
            sb.append("   freeMem :");
            sb.append(a);
            C32458a.m75144a(sb.toString());
            C23569o.m57779a("TYPE_TRIM_MEMORY", C23088c.m56631a().mo47822a("memoryLevel", Integer.valueOf(i)).mo47824a("page", C11016e.m22312g().getClass().getName()).mo47822a("freeMemory", Integer.valueOf(a)).mo47825b());
        } catch (Exception unused) {
        }
    }
}
