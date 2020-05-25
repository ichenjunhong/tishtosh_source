package com.p683ss.android.ugc.playerkit;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.playerkit.a */
public final class C50100a {

    /* renamed from: a */
    private static final String[] f125501a = {"player_prepare_duration", "videochache_prepare_duration", "videoheader_chache_duration", "firstframe_render_duration", "firstframe_total_duration"};

    /* renamed from: c */
    private static final C50100a f125502c = new C50100a();

    /* renamed from: b */
    private Map<String, Long> f125503b = new LinkedHashMap();

    /* renamed from: a */
    public static C50100a m108056a() {
        return f125502c;
    }

    private C50100a() {
    }

    /* renamed from: a */
    public final void mo97880a(String str, String str2) {
        mo97881a(str, str2, SystemClock.elapsedRealtime());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo97881a(java.lang.String r1, java.lang.String r2, long r3) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            java.lang.String r1 = "player_try_play"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0017
            java.util.Map<java.lang.String, java.lang.Long> r1 = r0.f125503b     // Catch:{ all -> 0x0030 }
            r1.clear()     // Catch:{ all -> 0x0030 }
            goto L_0x0021
        L_0x0017:
            java.util.Map<java.lang.String, java.lang.Long> r1 = r0.f125503b     // Catch:{ all -> 0x0030 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0021
            monitor-exit(r0)
            return
        L_0x0021:
            java.util.Map<java.lang.String, java.lang.Long> r1 = r0.f125503b     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            java.util.Map<java.lang.String, java.lang.Long> r1 = r0.f125503b     // Catch:{ all -> 0x0030 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0030 }
            r1.put(r2, r3)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.playerkit.C50100a.mo97881a(java.lang.String, java.lang.String, long):void");
    }
}
