package com.p683ss.android.ugc.aweme.shortvideo.stitch;

import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.c */
public final class C44730c {

    /* renamed from: a */
    public static SharedPreferences f113238a = C35807d.m80935a(C39629l.m88233b(), "av_settings.xml", 0);

    /* renamed from: b */
    public static final C44730c f113239b = new C44730c();

    private C44730c() {
    }

    /* renamed from: a */
    public static boolean m97858a() {
        return f113238a.getBoolean("stitch_introduce_shown", false);
    }
}
