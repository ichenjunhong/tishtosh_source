package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

public final class bqc {

    /* renamed from: a */
    public final String f43532a;

    /* renamed from: b */
    public final boolean f43533b;

    /* renamed from: c */
    public final boolean f43534c;

    /* renamed from: d */
    public final boolean f43535d;

    /* renamed from: e */
    final String f43536e;

    /* renamed from: f */
    final CodecCapabilities f43537f;

    /* renamed from: a */
    public static bqc m36434a(String str, String str2, CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        bqc bqc = new bqc(str, str2, codecCapabilities, z, z2);
        return bqc;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005a, code lost:
        if ((com.google.android.gms.internal.ads.btw.f43878a >= 21 && r4.isFeatureSupported("secure-playback")) != false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    bqc(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = com.google.android.gms.internal.ads.bti.m36697a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f43532a = r2
            r1.f43536e = r3
            r1.f43537f = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L_0x002a
            if (r4 == 0) goto L_0x002a
            int r5 = com.google.android.gms.internal.ads.btw.f43878a
            r0 = 19
            if (r5 < r0) goto L_0x0025
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x0025
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            if (r5 == 0) goto L_0x002a
            r5 = 1
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            r1.f43533b = r5
            r5 = 21
            if (r4 == 0) goto L_0x0044
            int r0 = com.google.android.gms.internal.ads.btw.f43878a
            if (r0 < r5) goto L_0x003f
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            r1.f43534c = r0
            if (r6 != 0) goto L_0x005e
            if (r4 == 0) goto L_0x005d
            int r6 = com.google.android.gms.internal.ads.btw.f43878a
            if (r6 < r5) goto L_0x0059
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L_0x0059
            r4 = 1
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            if (r4 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            r1.f43535d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bqc.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    /* renamed from: a */
    public final CodecProfileLevel[] mo30549a() {
        if (this.f43537f == null || this.f43537f.profileLevels == null) {
            return new CodecProfileLevel[0];
        }
        return this.f43537f.profileLevels;
    }

    /* renamed from: a */
    public final boolean mo30548a(int i, int i2, double d) {
        if (this.f43537f == null) {
            return false;
        }
        VideoCapabilities videoCapabilities = this.f43537f.getVideoCapabilities();
        if (videoCapabilities == null) {
            return false;
        }
        if (!m36435a(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !m36435a(videoCapabilities, i2, i, d)) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                return false;
            }
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            sb2.append("x");
            sb2.append(d);
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m36435a(VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }
}
