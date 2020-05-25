package com.p683ss.android.ugc.aweme.shortvideo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bu */
public final class C42476bu {
    /* renamed from: a */
    public final C42475bt mo86607a(long j, long j2) {
        return m93323a(j, j2, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C42475bt m93323a(long j, long j2, long j3) {
        boolean z;
        boolean z2 = false;
        if (j2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (j3 != 0) {
            z2 = true;
        }
        if (!z && !z2) {
            return C42475bt.NONE;
        }
        if (z && z2 && j2 != j3) {
            long min = Math.min(j, Math.min(j2, j3));
            if (min == j2 && min < j) {
                return C42475bt.MUSIC;
            }
            if (min == j3 && min < j) {
                return C42475bt.VIDEO;
            }
        }
        if (z) {
            long min2 = Math.min(j, j2);
            if (min2 == j2 && min2 < j) {
                return C42475bt.MUSIC;
            }
        }
        if (z2) {
            long min3 = Math.min(j, j3);
            if (min3 == j3 && min3 < j) {
                return C42475bt.VIDEO;
            }
        }
        return C42475bt.NONE;
    }
}
