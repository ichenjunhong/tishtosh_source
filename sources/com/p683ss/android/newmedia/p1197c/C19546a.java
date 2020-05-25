package com.p683ss.android.newmedia.p1197c;

import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.common.util.NetworkUtils.C18905b;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.newmedia.c.a */
public final class C19546a implements C18905b {

    /* renamed from: a */
    private boolean f53926a;

    /* renamed from: b */
    private final Object f53927b = new Object();

    /* renamed from: a */
    public final void mo38762a() {
        if (!"ActionReaper".equals(Thread.currentThread().getName())) {
            synchronized (this.f53927b) {
                if (!this.f53926a) {
                    try {
                        Thread.sleep(1500);
                    } catch (Exception unused) {
                    }
                    this.f53926a = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo38761a(String str, boolean z) {
        return AppLog.addCommonParams(str, z);
    }

    /* renamed from: a */
    public final void mo38763a(List<C19180e> list, boolean z) {
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, z);
        for (Entry entry : hashMap.entrySet()) {
            list.add(new C19180e((String) entry.getKey(), (String) entry.getValue()));
        }
    }
}
