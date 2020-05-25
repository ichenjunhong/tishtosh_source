package com.bef.effectsdk.game;

import java.util.Arrays;
import java.util.List;

public class NativeInterface {

    /* renamed from: a */
    private static final List<String> f8000a = Arrays.asList(new String[]{"effect"});

    interface NativeMessageListener {
    }

    private static native int nativeAddMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native void nativeCreateHandle(long[] jArr);

    private static native int nativeDestroy(long j);

    private static native int nativeInit(long j, int i, int i2);

    private static native int nativePause(long j);

    private static native int nativePostMessage(long j, long j2, long j3, long j4, String str);

    private static native int nativeProcess(long j, int i, int i2, double d);

    private static native int nativeRemoveMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native int nativeResume(long j);

    private static native int nativeSetSize(long j, int i, int i2);

    private static native int nativeSetStickerPath(long j, String str);

    private static native int nativeTouchesBegin(long j, int[] iArr, float[] fArr, float[] fArr2);

    private static native int nativeTouchesEnd(long j, int[] iArr, float[] fArr, float[] fArr2);

    private static native int nativeTouchesMove(long j, int[] iArr, float[] fArr, float[] fArr2);

    /* JADX WARNING: Can't wrap try/catch for region: R(9:5|6|7|(2:9|(3:11|20|18)(1:12))|13|14|21|18|3) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0073 */
    static {
        /*
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "effect"
            r2 = 0
            r0[r2] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            f8000a = r0
            java.util.List<java.lang.String> r0 = f8000a     // Catch:{ Throwable -> 0x007b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x007b }
        L_0x0014:
            boolean r1 = r0.hasNext()     // Catch:{ Throwable -> 0x007b }
            if (r1 == 0) goto L_0x007a
            java.lang.Object r1 = r0.next()     // Catch:{ Throwable -> 0x007b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x007b }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x007b }
            boolean r4 = com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46144a(r1)     // Catch:{ Throwable -> 0x0073 }
            if (r4 == 0) goto L_0x0073
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()     // Catch:{ Throwable -> 0x0073 }
            long r5 = com.bytedance.ies.ugc.p694a.C11010c.m22286g()     // Catch:{ Throwable -> 0x0073 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x0073 }
            com.bytedance.android.p161c.C2835a.m8098a(r4, r5)     // Catch:{ Throwable -> 0x0073 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0073 }
            r4.<init>()     // Catch:{ Throwable -> 0x0073 }
            com.p683ss.android.ugc.aweme.p2391v.C47964c.m103778e()     // Catch:{ Throwable -> 0x0073 }
            java.lang.String r5 = com.p683ss.android.ugc.aweme.p2391v.C47964c.m103775a()     // Catch:{ Throwable -> 0x0073 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0073 }
            java.lang.String r5 = "/lib"
            r4.append(r5)     // Catch:{ Throwable -> 0x0073 }
            r4.append(r1)     // Catch:{ Throwable -> 0x0073 }
            java.lang.String r5 = ".so"
            r4.append(r5)     // Catch:{ Throwable -> 0x0073 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0073 }
            java.io.File r5 = new java.io.File     // Catch:{ Throwable -> 0x0073 }
            r5.<init>(r4)     // Catch:{ Throwable -> 0x0073 }
            boolean r5 = r5.exists()     // Catch:{ Throwable -> 0x0073 }
            if (r5 == 0) goto L_0x006f
            r5 = 2
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r1, r5)     // Catch:{ Throwable -> 0x0073 }
            java.lang.System.load(r4)     // Catch:{ Throwable -> 0x0073 }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r2, r1)     // Catch:{ Throwable -> 0x0073 }
            goto L_0x0014
        L_0x006f:
            r4 = 3
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46142a(r1, r4)     // Catch:{ Throwable -> 0x0073 }
        L_0x0073:
            com.bytedance.p723j.C11511a.m23578a(r1)     // Catch:{ Throwable -> 0x007b }
            com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a.m46141a(r2, r1)     // Catch:{ Throwable -> 0x007b }
            goto L_0x0014
        L_0x007a:
            return
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.game.NativeInterface.<clinit>():void");
    }
}
