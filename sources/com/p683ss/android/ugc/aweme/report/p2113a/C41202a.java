package com.p683ss.android.ugc.aweme.report.p2113a;

import android.os.Looper;
import com.p683ss.android.ugc.bytex.coverage_lib.CoveragePlugin;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.report.a.a */
public final class C41202a implements CoveragePlugin {

    /* renamed from: a */
    ConcurrentHashMap<Integer, Integer> f104641a;

    /* renamed from: b */
    int f104642b;

    /* renamed from: c */
    long f104643c;

    /* renamed from: com.ss.android.ugc.aweme.report.a.a$a */
    public static class C41204a {

        /* renamed from: a */
        public static final C41202a f104644a = new C41202a();
    }

    private C41202a() {
        this.f104642b = 120000;
        this.f104641a = new ConcurrentHashMap<>(10000);
        this.f104643c = System.currentTimeMillis() + ((long) this.f104642b);
        Looper.myQueue().addIdleHandler(new C41205b(this));
    }

    public final void addData(int i) {
        Integer num = (Integer) this.f104641a.get(Integer.valueOf(i));
        if (num == null) {
            this.f104641a.put(Integer.valueOf(i), Integer.valueOf(1));
        } else {
            this.f104641a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
        }
    }
}
