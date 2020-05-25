package com.p683ss.android.ugc.aweme.shortvideo.record;

import com.p683ss.android.ugc.asve.p1238b.C20337p;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.e */
public final class C44455e {
    /* renamed from: a */
    private static boolean m97281a(int i) {
        return i == 1 || i == 2 || i == 8;
    }

    /* renamed from: d */
    public static boolean m97284d() {
        return C39618d.f101152P.mo83103a(C40790a.EnableSATCamera);
    }

    /* renamed from: b */
    public static ENCODE_PROFILE m97282b() {
        int a = m97280a();
        if (a == 8) {
            return ENCODE_PROFILE.ENCODE_PROFILE_HIGH;
        }
        switch (a) {
            case 1:
                return ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
            case 2:
                return ENCODE_PROFILE.ENCODE_PROFILE_MAIN;
            default:
                return ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
        }
    }

    /* renamed from: c */
    public static C20337p m97283c() {
        int a = m97280a();
        if (a == 8) {
            return C20337p.AS_ENCODE_PROFILE_HIGH;
        }
        switch (a) {
            case 1:
                return C20337p.AS_ENCODE_PROFILE_BASELINE;
            case 2:
                return C20337p.AS_ENCODE_PROFILE_MAIN;
            default:
                return C20337p.AS_ENCODE_PROFILE_UNKNOWN;
        }
    }

    /* renamed from: a */
    public static int m97280a() {
        int i;
        if (C39618d.f101151O.mo83118b(C40796a.RecordHardwareProfile) != 1) {
            i = C39618d.f101151O.mo83118b(C40796a.RecordHardwareProfile);
        } else if (C39618d.f101152P.mo83104b(C40790a.RecordHardwareProfile) != 1) {
            i = C39618d.f101152P.mo83104b(C40790a.RecordHardwareProfile);
        } else {
            i = 1;
        }
        if (!m97281a(i)) {
            return 1;
        }
        return i;
    }
}
