package com.p683ss.android.ugc.aweme.shortvideo.publish;

import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45386aj.C45387a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.k */
public final class C44387k {

    /* renamed from: a */
    static boolean f112321a;

    /* renamed from: b */
    public static final C44387k f112322b = new C44387k();

    private C44387k() {
    }

    /* renamed from: a */
    public static boolean m97190a() {
        return C45387a.m98948a();
    }

    /* renamed from: b */
    public final boolean mo90252b() {
        if (!m97190a() || C39618d.f101152P.mo83104b(C40790a.EnablePublishPrivacySetting) != 2) {
            return false;
        }
        return true;
    }
}
