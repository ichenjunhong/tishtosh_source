package com.p683ss.android.ugc.asve.p1241e;

import android.content.Context;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.p2638e.C52647c;
import p2628d.p2638e.C52666o;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2649l.C52786h;
import p2628d.p2650m.C52808d;

/* renamed from: com.ss.android.ugc.asve.e.e */
public final class C20394e {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r2 == null) goto L_0x003b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m50600b(android.content.Context r2, int r3) {
        /*
            java.lang.String r0 = "$this$getProcessNameFromSystemService"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            java.lang.String r0 = "activity"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch:{ Throwable -> 0x004a }
            if (r2 == 0) goto L_0x0042
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch:{ Throwable -> 0x004a }
            java.util.List r2 = r2.getRunningAppProcesses()     // Catch:{ Throwable -> 0x004a }
            if (r2 == 0) goto L_0x003b
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ Throwable -> 0x004a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x004a }
        L_0x001b:
            boolean r0 = r2.hasNext()     // Catch:{ Throwable -> 0x004a }
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r2.next()     // Catch:{ Throwable -> 0x004a }
            r1 = r0
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1     // Catch:{ Throwable -> 0x004a }
            int r1 = r1.pid     // Catch:{ Throwable -> 0x004a }
            if (r1 != r3) goto L_0x002e
            r1 = 1
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            if (r1 == 0) goto L_0x001b
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0     // Catch:{ Throwable -> 0x004a }
            if (r0 == 0) goto L_0x003b
            java.lang.String r2 = r0.processName     // Catch:{ Throwable -> 0x004a }
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            java.lang.String r2 = ""
        L_0x003d:
            java.lang.Object r2 = p2628d.C52848o.m114620constructorimpl(r2)     // Catch:{ Throwable -> 0x004a }
            goto L_0x0053
        L_0x0042:
            d.u r2 = new d.u     // Catch:{ Throwable -> 0x004a }
            java.lang.String r3 = "null cannot be cast to non-null type android.app.ActivityManager"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x004a }
            throw r2     // Catch:{ Throwable -> 0x004a }
        L_0x004a:
            r2 = move-exception
            java.lang.Object r2 = p2628d.C52851p.m112464a(r2)
            java.lang.Object r2 = p2628d.C52848o.m114620constructorimpl(r2)
        L_0x0053:
            java.lang.String r3 = ""
            boolean r0 = p2628d.C52848o.m114625isFailureimpl(r2)
            if (r0 == 0) goto L_0x005c
            r2 = r3
        L_0x005c:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.asve.p1241e.C20394e.m50600b(android.content.Context, int):java.lang.String");
    }

    /* renamed from: a */
    public static final String m50599a(Context context, int i) {
        Object obj;
        Closeable bufferedReader;
        int i2;
        boolean z;
        C52711k.m112240b(context, "$this$getProcessNameFromSystemFile");
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            File file = new File(sb.toString());
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), C52808d.f131048f), VideoCacheReadBuffersizeExperiment.DEFAULT);
            CharSequence charSequence = (String) C52786h.m112347c(C52666o.m112215a((BufferedReader) bufferedReader));
            int length = charSequence.length() - 1;
            int i3 = 0;
            boolean z2 = false;
            while (i3 <= length) {
                if (!z2) {
                    i2 = i3;
                } else {
                    i2 = length;
                }
                if (charSequence.charAt(i2) <= ' ') {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    if (!z) {
                        break;
                    }
                    length--;
                } else if (!z) {
                    z2 = true;
                } else {
                    i3++;
                }
            }
            String obj2 = charSequence.subSequence(i3, length + 1).toString();
            C52647c.m112189a(bufferedReader, null);
            obj = C52848o.m114620constructorimpl(obj2);
        } catch (Throwable th) {
            obj = C52848o.m114620constructorimpl(C52851p.m112464a(th));
        }
        String str = "";
        if (C52848o.m114625isFailureimpl(obj)) {
            obj = str;
        }
        return (String) obj;
    }
}
