package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.facebook.common.p920d.C13696m;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i */
public final class C43048i {

    /* renamed from: a */
    public static final C43048i f108669a = new C43048i();

    private C43048i() {
    }

    /* renamed from: a */
    public static void m94340a(boolean z, Exception exc) {
        String str;
        String str2 = "stickpoint_musiclist";
        boolean z2 = !z;
        C42437ay a = C42437ay.m93202a();
        String str3 = "exception";
        if (exc == null) {
            str = "";
        } else {
            str = C13696m.m27668c(exc);
        }
        C23569o.m57776a(str2, z2 ? 1 : 0, a.mo86521a(str3, str).mo86522b());
    }

    /* renamed from: a */
    public static void m94339a(boolean z, C42482c cVar, Exception exc) {
        String str;
        String str2;
        String str3;
        String str4 = "stickpoint_download_music";
        boolean z2 = !z;
        C42437ay a = C42437ay.m93202a();
        String str5 = "url";
        if (cVar == null) {
            str = "";
        } else {
            str = cVar.getPath();
        }
        C42437ay a2 = a.mo86521a(str5, str);
        String str6 = "music_id";
        if (cVar == null) {
            str2 = "";
        } else {
            str2 = cVar.getMusicId();
        }
        C42437ay a3 = a2.mo86521a(str6, str2);
        String str7 = "exception";
        if (exc == null) {
            str3 = "";
        } else {
            str3 = C13696m.m27668c(exc);
        }
        C23569o.m57776a(str4, z2 ? 1 : 0, a3.mo86521a(str7, str3).mo86522b());
    }

    /* renamed from: a */
    public static void m94341a(boolean z, String str, String str2, Exception exc) {
        String str3;
        String str4 = "stickpoint_download_alg";
        boolean z2 = !z;
        C42437ay a = C42437ay.m93202a().mo86521a("url", str).mo86521a("alg_type", str2);
        String str5 = "exception";
        if (exc == null) {
            str3 = "";
        } else {
            str3 = C13696m.m27668c(exc);
        }
        C23569o.m57776a(str4, z2 ? 1 : 0, a.mo86521a(str5, str3).mo86522b());
    }
}
