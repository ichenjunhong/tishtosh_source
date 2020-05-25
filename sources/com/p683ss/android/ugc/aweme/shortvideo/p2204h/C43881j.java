package com.p683ss.android.ugc.aweme.shortvideo.p2204h;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.h.j */
public final class C43881j {
    /* renamed from: a */
    private static long m96390a() {
        if (C39629l.m88232a().mo58574e().mo83117a(C40796a.DurationMode)) {
            return C39629l.m88232a().mo58574e().mo83119c(C40796a.LongVideoThreshold);
        }
        return 15000;
    }

    /* renamed from: a */
    public final long mo89432a(String str) {
        long j;
        long a = m96390a();
        if (!TextUtils.isEmpty(str)) {
            j = (long) C39630m.m88234a().mo58604b().mo80578b(str);
        } else {
            j = -1;
        }
        if (j == -1) {
            return a;
        }
        return Math.min(a, j);
    }
}
