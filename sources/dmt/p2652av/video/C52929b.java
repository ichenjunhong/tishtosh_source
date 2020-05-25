package dmt.p2652av.video;

import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PRESET;

/* renamed from: dmt.av.video.b */
public final class C52929b {
    /* renamed from: a */
    public static int m112617a(float f) {
        return (int) (f * 4.0f * 1000.0f * 1000.0f);
    }

    /* renamed from: a */
    public static int m112618a(int i) {
        return i;
    }

    /* renamed from: a */
    public static long m112619a(long j) {
        return j;
    }

    /* renamed from: b */
    public static int m112620b(int i) {
        return i;
    }

    /* renamed from: c */
    public static ENCODE_PRESET m112621c(int i) {
        ENCODE_PRESET[] values = ENCODE_PRESET.values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }
}
