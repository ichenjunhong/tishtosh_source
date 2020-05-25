package com.p683ss.android.ugc.aweme.awemeservice;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.awemeservice.a */
public final class C23301a {

    /* renamed from: a */
    public static C23301a f62296a;

    /* renamed from: b */
    Map<String, Aweme> f62297b = new ConcurrentHashMap();

    /* renamed from: a */
    public static C23301a m57317a() {
        if (f62296a == null) {
            f62296a = new C23301a();
        }
        return f62296a;
    }

    /* renamed from: b */
    public final AwemeStatistics mo48349b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Aweme a = mo48348a(str);
        if (a == null) {
            return null;
        }
        AwemeStatistics statistics = a.getStatistics();
        if (statistics == null) {
            statistics = new AwemeStatistics();
            a.setStatistics(statistics);
        }
        return statistics;
    }

    /* renamed from: a */
    public final Aweme mo48347a(Aweme aweme) {
        if (aweme == null || TextUtils.isEmpty(aweme.getAid())) {
            return aweme;
        }
        Aweme aweme2 = (Aweme) this.f62297b.get(aweme.getAid());
        if (aweme2 != null) {
            aweme2.update(aweme);
            return aweme2;
        }
        this.f62297b.put(aweme.getAid(), aweme);
        return aweme;
    }

    /* renamed from: a */
    public final Aweme mo48348a(String str) {
        Aweme aweme = null;
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            aweme = (Aweme) this.f62297b.get(str);
        }
        return aweme;
    }
}
