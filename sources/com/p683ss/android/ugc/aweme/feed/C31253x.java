package com.p683ss.android.ugc.aweme.feed;

import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.feed.x */
public final class C31253x {

    /* renamed from: a */
    public List<Object> f81864a;

    /* renamed from: com.ss.android.ugc.aweme.feed.x$a */
    static class C31255a {

        /* renamed from: a */
        public static C31253x f81865a = new C31253x();
    }

    /* renamed from: a */
    public static C31253x m72966a() {
        return C31255a.f81865a;
    }

    private C31253x() {
        this.f81864a = new ArrayList();
    }

    /* renamed from: a */
    public static void m72967a(C23259b bVar) {
        HashMap<String, Long> hashMap = bVar.f62192D;
        HashMap<String, Long> hashMap2 = bVar.f62193E;
        for (Entry entry : hashMap.entrySet()) {
            C22574a f = C22574a.m55738f();
            StringBuilder sb = new StringBuilder();
            sb.append((String) entry.getKey());
            sb.append("_duration_pre");
            f.mo46924c(sb.toString(), ((Long) entry.getValue()).longValue(), false);
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            C22574a f2 = C22574a.m55738f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) entry2.getKey());
            sb2.append("_duration_post");
            f2.mo46924c(sb2.toString(), ((Long) entry2.getValue()).longValue(), false);
        }
    }
}
