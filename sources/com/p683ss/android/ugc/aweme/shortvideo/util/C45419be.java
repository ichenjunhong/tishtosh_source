package com.p683ss.android.ugc.aweme.shortvideo.util;

import com.C2240a;
import com.p683ss.android.ugc.aweme.shortvideo.C43846fo;
import com.p683ss.android.ugc.aweme.shortvideo.C43852fu;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import java.util.Arrays;
import java.util.Locale;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.be */
public final class C45419be {
    /* renamed from: b */
    public static final C43852fu m98989b(VideoCreation videoCreation) {
        if (!(videoCreation instanceof C43846fo)) {
            return null;
        }
        return ((C43846fo) videoCreation).f111026a;
    }

    /* renamed from: a */
    public static final String m98988a(VideoCreation videoCreation) {
        C43852fu b = m98989b(videoCreation);
        if (b == null) {
            return "";
        }
        Locale locale = Locale.US;
        C52711k.m112236a((Object) locale, "Locale.US");
        String a = C2240a.m6773a(locale, "https:%d ttnet:%d", Arrays.copyOf(new Object[]{Integer.valueOf(b.f111074j), Integer.valueOf(b.f111084t)}, 2));
        C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
        return a;
    }
}
