package com.bytedance.ies.dmt.p664ui.widget.util;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.bytedance.ies.dmt.ui.widget.util.b */
public class C10749b {

    /* renamed from: a */
    private static volatile C10749b f28892a;

    /* renamed from: b */
    private boolean f28893b;

    private C10749b() {
    }

    /* renamed from: a */
    public static C10749b m21787a() {
        if (f28892a == null) {
            synchronized (C10749b.class) {
                if (f28892a == null) {
                    f28892a = new C10749b();
                }
            }
        }
        return f28892a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Typeface mo19435a(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f28893b     // Catch:{ all -> 0x0026 }
            r1 = 0
            if (r0 != 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            com.bytedance.ies.dmt.ui.widget.util.a r0 = com.bytedance.ies.dmt.p664ui.widget.util.C10748a.m21784a()     // Catch:{ all -> 0x0026 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.f28890d     // Catch:{ all -> 0x0026 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ all -> 0x0026 }
            if (r2 == 0) goto L_0x0024
            java.util.Map<java.lang.String, java.lang.Integer> r1 = com.bytedance.ies.dmt.p664ui.widget.util.C10748a.f28887b     // Catch:{ all -> 0x0026 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0026 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0026 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x0026 }
            android.graphics.Typeface r1 = r0.mo19434a(r4)     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r3)
            return r1
        L_0x0026:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p664ui.widget.util.C10749b.mo19435a(java.lang.String):android.graphics.Typeface");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0017, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo19438a(android.widget.TextView r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x0016
            boolean r0 = r1.f28893b     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x0008
            goto L_0x0016
        L_0x0008:
            android.graphics.Typeface r3 = r1.mo19435a(r3)     // Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x0011
            r2.setTypeface(r3)     // Catch:{ all -> 0x0013 }
        L_0x0011:
            monitor-exit(r1)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0016:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p664ui.widget.util.C10749b.mo19438a(android.widget.TextView, java.lang.String):void");
    }

    /* renamed from: a */
    public final synchronized void mo19436a(Context context, Map<String, String> map) {
        this.f28893b = false;
        if (!(context == null || map == null || map.size() <= 0)) {
            if (C10748a.f28886a != null) {
                C10748a.f28886a.f28891e = null;
                if (C10748a.f28886a.f28890d != null) {
                    C10748a.f28886a.f28890d.clear();
                    C10748a.f28886a.f28890d = null;
                }
                if (C10748a.f28886a.f28889c != null) {
                    C10748a.f28886a.f28889c.clear();
                    C10748a.f28886a.f28889c = null;
                }
                C10748a.f28886a = null;
            }
            C10748a a = C10748a.m21784a();
            if (context != null && map != null) {
                a.f28891e = context.getApplicationContext();
                a.f28890d = map;
                if (a.f28890d != null && a.f28890d.size() >= 0) {
                    for (String str : a.f28890d.keySet()) {
                        if (TextUtils.isEmpty(str)) {
                            break;
                        }
                        a.mo19434a(((Integer) C10748a.f28887b.get(str)).intValue());
                    }
                }
            }
            this.f28893b = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo19437a(android.widget.TextView r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 3
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0050
            if (r7 != 0) goto L_0x0009
            goto L_0x0050
        L_0x0009:
            boolean r3 = r5.f28893b     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x002e
            if (r6 != 0) goto L_0x0011
        L_0x000f:
            r4 = 0
            goto L_0x0028
        L_0x0011:
            if (r7 == 0) goto L_0x000f
            android.content.Context r3 = r6.getContext()     // Catch:{ all -> 0x004e }
            int[] r4 = new int[r0]     // Catch:{ all -> 0x004e }
            r4 = {2131362281, 2131362285, 2131362286} // fill-array     // Catch:{ all -> 0x004e }
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r7, r4)     // Catch:{ all -> 0x004e }
            r4 = 2
            boolean r4 = r3.getBoolean(r4, r2)     // Catch:{ all -> 0x004e }
            r3.recycle()     // Catch:{ all -> 0x004e }
        L_0x0028:
            if (r4 == 0) goto L_0x0050
            r6.setIncludeFontPadding(r1)     // Catch:{ all -> 0x004e }
            goto L_0x0050
        L_0x002e:
            if (r6 != 0) goto L_0x0032
        L_0x0030:
            r4 = 0
            goto L_0x0048
        L_0x0032:
            if (r7 == 0) goto L_0x0030
            android.content.Context r3 = r6.getContext()     // Catch:{ all -> 0x004e }
            int[] r4 = new int[r0]     // Catch:{ all -> 0x004e }
            r4 = {2131362281, 2131362285, 2131362286} // fill-array     // Catch:{ all -> 0x004e }
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r7, r4)     // Catch:{ all -> 0x004e }
            boolean r4 = r3.getBoolean(r1, r2)     // Catch:{ all -> 0x004e }
            r3.recycle()     // Catch:{ all -> 0x004e }
        L_0x0048:
            if (r4 != 0) goto L_0x0050
            r6.setIncludeFontPadding(r1)     // Catch:{ all -> 0x004e }
            goto L_0x0050
        L_0x004e:
            r6 = move-exception
            goto L_0x007b
        L_0x0050:
            boolean r3 = r5.f28893b     // Catch:{ all -> 0x004e }
            if (r3 != 0) goto L_0x0056
            monitor-exit(r5)
            return
        L_0x0056:
            if (r7 == 0) goto L_0x006c
            android.content.Context r3 = r6.getContext()     // Catch:{ all -> 0x004e }
            int[] r0 = new int[r0]     // Catch:{ all -> 0x004e }
            r0 = {2131362281, 2131362285, 2131362286} // fill-array     // Catch:{ all -> 0x004e }
            android.content.res.TypedArray r7 = r3.obtainStyledAttributes(r7, r0)     // Catch:{ all -> 0x004e }
            int r1 = r7.getInt(r2, r1)     // Catch:{ all -> 0x004e }
            r7.recycle()     // Catch:{ all -> 0x004e }
        L_0x006c:
            com.bytedance.ies.dmt.ui.widget.util.a r7 = com.bytedance.ies.dmt.p664ui.widget.util.C10748a.m21784a()     // Catch:{ all -> 0x004e }
            android.graphics.Typeface r7 = r7.mo19434a(r1)     // Catch:{ all -> 0x004e }
            if (r7 == 0) goto L_0x0079
            r6.setTypeface(r7)     // Catch:{ all -> 0x004e }
        L_0x0079:
            monitor-exit(r5)
            return
        L_0x007b:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p664ui.widget.util.C10749b.mo19437a(android.widget.TextView, android.util.AttributeSet):void");
    }
}
