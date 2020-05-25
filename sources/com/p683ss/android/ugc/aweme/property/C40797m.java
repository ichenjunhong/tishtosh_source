package com.p683ss.android.ugc.aweme.property;

import android.os.Build.VERSION;
import android.support.p030v4.p033b.C0703a;
import android.text.TextUtils;
import com.bytedance.common.utility.C9414h;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import java.lang.reflect.Type;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.property.m */
public final class C40797m {

    /* renamed from: a */
    private static volatile boolean f103928a;

    /* renamed from: b */
    private static volatile boolean f103929b;

    /* renamed from: a */
    public static int m90240a(int i, int i2, int i3, int i4) {
        return (i <= 0 || i > 51) ? i4 : i;
    }

    /* renamed from: c */
    public static boolean m90248c() {
        return f103928a;
    }

    /* renamed from: p */
    private static boolean m90261p() {
        if (VERSION.SDK_INT >= 18) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m90243a() {
        if (!m90261p() || !C39629l.m88232a().mo58574e().mo83117a(C40796a.HardCode) || f103929b) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m90247b() {
        if (!m90261p() || !C39629l.m88232a().mo58574e().mo83117a(C40796a.SyntheticHardCode)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static float m90250e() {
        float d = C39629l.m88232a().mo58583n().mo83106d(C40790a.SyntheticVideoBitrate);
        if (d != -1.0f) {
            return d;
        }
        return C39629l.m88232a().mo58574e().mo83120d(C40796a.SyntheticVideoBitrate);
    }

    /* renamed from: g */
    public static String m90252g() {
        String str = "";
        int[] i = m90254i();
        if (i == null || i.length < 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i[0]);
        sb.append("*");
        sb.append(i[1]);
        return sb.toString();
    }

    /* renamed from: h */
    public static String m90253h() {
        String str = "";
        int[] j = m90255j();
        if (j == null || j.length < 2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j[0]);
        sb.append("*");
        sb.append(j[1]);
        return sb.toString();
    }

    /* renamed from: k */
    public static int m90256k() {
        int b = C39629l.m88232a().mo58583n().mo83104b(C40790a.SyntheticVideoQuality);
        if (b != -1) {
            return b;
        }
        return C39629l.m88232a().mo58574e().mo83118b(C40796a.SyntheticVideoQuality);
    }

    /* renamed from: l */
    public static long m90257l() {
        long c = C39629l.m88232a().mo58583n().mo83105c(C40790a.SyntheticVideoMaxRate);
        if (c != -1) {
            return c;
        }
        return C39629l.m88232a().mo58574e().mo83119c(C40796a.SyntheticVideoMaxRate);
    }

    /* renamed from: m */
    public static int m90258m() {
        int b = C39629l.m88232a().mo58583n().mo83104b(C40790a.SyntheticVideoPreset);
        if (b != -1) {
            return b;
        }
        return C39629l.m88232a().mo58574e().mo83118b(C40796a.SyntheticVideoPreset);
    }

    /* renamed from: n */
    public static int m90259n() {
        int b = C39629l.m88232a().mo58583n().mo83104b(C40790a.SyntheticVideoGop);
        if (b != -1) {
            return b;
        }
        return C39629l.m88232a().mo58574e().mo83118b(C40796a.SyntheticVideoGop);
    }

    /* renamed from: o */
    public static boolean m90260o() {
        boolean z;
        if (!m90261p() || !C39629l.m88232a().mo58574e().mo83117a(C40796a.WatermarkHardcode)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableSaveUploadVideo)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static float m90249d() {
        float f;
        float d = C39629l.m88232a().mo58583n().mo83106d(C40790a.VideoBitrate);
        if (d != -1.0f) {
            return d;
        }
        float d2 = C39629l.m88232a().mo58574e().mo83120d(C40796a.VideoBitrate);
        int b = C39629l.m88232a().mo58583n().mo83104b(C40790a.RecordBitrateCategoryIndex);
        List list = (List) m90241a(C39629l.m88232a().mo58574e().mo83121e(C40796a.RecordBitrateCategory), new C17956a<List<Float>>() {
        }.f49843c);
        if (!C9414h.m18631b(list) || b >= list.size()) {
            f = 0.0f;
        } else {
            f = ((Float) list.get(b)).floatValue();
        }
        if (f != 0.0f) {
            d2 = f;
        }
        return d2;
    }

    /* renamed from: f */
    public static int m90251f() {
        int i;
        int b = C39629l.m88232a().mo58574e().mo83118b(C40796a.RecordVideoQuality);
        int b2 = C39629l.m88232a().mo58583n().mo83104b(C40790a.RecordQualityCategoryIndex);
        List list = (List) m90241a(C39629l.m88232a().mo58574e().mo83121e(C40796a.RecordQualityCategory), new C17956a<List<Integer>>() {
        }.f49843c);
        if (!C9414h.m18631b(list) || b2 >= list.size()) {
            i = 0;
        } else {
            i = ((Integer) list.get(b2)).intValue();
        }
        if (i != 0) {
            return i;
        }
        return b;
    }

    /* renamed from: i */
    public static int[] m90254i() {
        int[] iArr;
        int[] a = m90244a(C39629l.m88232a().mo58574e().mo83121e(C40796a.VideoSize));
        int b = C39629l.m88232a().mo58583n().mo83104b(C40790a.VideoSizeIndex);
        List list = (List) m90241a(C39629l.m88232a().mo58574e().mo83121e(C40796a.VideoSizeCategory), new C17956a<List<String>>() {
        }.f49843c);
        if (!C9414h.m18631b(list) || b >= list.size()) {
            iArr = null;
        } else {
            iArr = m90244a((String) list.get(b));
        }
        if (iArr != null) {
            return iArr;
        }
        return a;
    }

    /* renamed from: j */
    public static int[] m90255j() {
        int[] iArr;
        int[] a = m90244a(C39629l.m88232a().mo58574e().mo83121e(C40796a.VideoSize));
        int b = C39629l.m88232a().mo58583n().mo83104b(C40790a.ImportVideoSizeIndex);
        List list = (List) m90241a(C39629l.m88232a().mo58574e().mo83121e(C40796a.ImportVideoSizeCategory), new C17956a<List<String>>() {
        }.f49843c);
        if (!C9414h.m18631b(list) || b >= list.size()) {
            iArr = null;
        } else {
            iArr = m90244a((String) list.get(b));
        }
        if (iArr != null) {
            return iArr;
        }
        return a;
    }

    /* renamed from: a */
    public static void m90242a(boolean z) {
        f103929b = z;
    }

    /* renamed from: b */
    public static void m90246b(boolean z) {
        f103928a = true;
    }

    /* renamed from: a */
    public static float m90239a(int i) {
        return (C39629l.m88232a().mo58583n().mo83106d(C40790a.SmoothMax) / 5.0f) * ((float) C0703a.m2034a(i, 0, 5));
    }

    /* renamed from: b */
    public static float m90245b(int i) {
        return (C39629l.m88232a().mo58583n().mo83106d(C40790a.ReshapeMax) / 5.0f) * ((float) C0703a.m2034a(i, 0, 5));
    }

    /* renamed from: a */
    public static int[] m90244a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int[] iArr = new int[0];
        try {
            String[] split = str.split("x");
            int[] iArr2 = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                iArr2[i] = Integer.parseInt(split[i]);
            }
            iArr = iArr2;
        } catch (Exception unused) {
        }
        if (iArr.length != 2) {
            return null;
        }
        return iArr;
    }

    /* renamed from: a */
    public static <T> T m90241a(String str, Type type) {
        try {
            return C39629l.m88232a().mo58566D().mo34885a(str, type);
        } catch (Exception unused) {
            return null;
        }
    }
}
