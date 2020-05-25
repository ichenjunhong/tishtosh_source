package com.p683ss.android.medialib.p1183d;

import android.text.TextUtils;
import com.p683ss.android.medialib.log.C19348a;
import com.p683ss.android.medialib.log.IMonitor;
import java.util.HashMap;

/* renamed from: com.ss.android.medialib.d.b */
public final class C19312b extends C19348a {
    public C19312b(IMonitor iMonitor) {
        C19348a.f53483a = iMonitor;
    }

    /* renamed from: a */
    public static void m47170a(String str, C19311a aVar) {
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            aVar.mo39810a(hashMap);
            C19348a.m47248a(C19348a.f53483a, str, "record_monitor", hashMap);
        }
    }
}
