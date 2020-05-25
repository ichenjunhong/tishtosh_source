package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ea */
public final class C43307ea extends C43308eb {

    /* renamed from: a */
    public static final String f109488a = new File(C39629l.m88233b().getFilesDir(), "sticker_1_0/3d/resources").getPath();

    /* renamed from: b */
    public static final String f109489b;

    /* renamed from: c */
    public static final String f109490c;

    /* renamed from: a */
    public static long m94995a() {
        long c = C39629l.m88232a().mo58574e().mo83119c(C40796a.VideoDurationLimitMillisecond);
        if (c < 1000 || c >= 15000) {
            return 1000;
        }
        return c;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f109491d);
        sb.append("music-effect/");
        f109489b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f109491d);
        sb2.append("face_track.model");
        f109490c = sb2.toString();
    }

    /* renamed from: a */
    public static String m94996a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f109508u);
        sb.append(m94999c(str));
        return sb.toString();
    }
}
