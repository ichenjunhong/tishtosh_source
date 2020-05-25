package com.p683ss.android.ugc.aweme.port.p2082in;

import android.content.Intent;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.common.C26865e;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C43870h;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;

/* renamed from: com.ss.android.ugc.aweme.port.in.al */
public interface C39554al extends C39547ag {

    /* renamed from: a */
    public static final String f101107a;

    /* renamed from: com.ss.android.ugc.aweme.port.in.al$a */
    public interface C39555a {
        /* renamed from: a */
        boolean mo74290a(Object... objArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.al$b */
    public interface C39556b {
        /* renamed from: a */
        boolean mo74289a(Object... objArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.al$c */
    public interface C39557c {
        /* renamed from: a */
        C43870h mo74187a();

        /* renamed from: a */
        void mo74188a(C39559e eVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.al$d */
    public interface C39558d extends C26865e {
        /* renamed from: a */
        void mo80653a(AVSearchChallengeList aVSearchChallengeList);

        /* renamed from: b */
        void mo80654b();

        /* renamed from: d */
        void mo80655d(Exception exc);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.al$e */
    public static class C39559e {

        /* renamed from: a */
        public String f101108a;

        /* renamed from: b */
        public String f101109b;

        /* renamed from: c */
        public String f101110c;

        /* renamed from: d */
        public String f101111d;

        /* renamed from: e */
        public String f101112e;

        /* renamed from: f */
        public String f101113f;
    }

    /* renamed from: a */
    C39555a mo74180a(C26877c<AVChallenge> cVar);

    /* renamed from: a */
    C39556b mo74181a(C39558d dVar);

    /* renamed from: a */
    C39557c mo74182a(Fragment fragment);

    /* renamed from: a */
    AVChallenge mo74183a(int i, int i2, Intent intent, int i3);

    /* renamed from: a */
    AVChallenge mo74184a(Intent intent);

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C39547ag.class.getCanonicalName());
        sb.append(":on_recommend_hash_get");
        f101107a = sb.toString();
    }
}
