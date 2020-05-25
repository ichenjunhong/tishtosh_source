package com.p683ss.android.ugc.aweme.profile.p2085c;

import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.profile.experiment.ProfileGuideTestMode;
import com.p683ss.android.ugc.aweme.profile.experiment.ProfileGuideTimeInterval;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.c.e */
public final class C39828e {

    /* renamed from: a */
    public static String f101635a;

    /* renamed from: b */
    public static C39828e f101636b;

    /* renamed from: c */
    public static final C39829a f101637c = new C39829a(null);

    /* renamed from: d */
    private final Keva f101638d;

    /* renamed from: com.ss.android.ugc.aweme.profile.c.e$a */
    public static final class C39829a {
        private C39829a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
            if ((!p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r0, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x001b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p683ss.android.ugc.aweme.profile.p2085c.C39828e m88577a() {
            /*
                com.ss.android.ugc.aweme.profile.c.e r0 = com.p683ss.android.ugc.aweme.profile.p2085c.C39828e.f101636b
                if (r0 == 0) goto L_0x001b
                java.lang.String r0 = com.p683ss.android.ugc.aweme.profile.p2085c.C39828e.f101635a
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
                java.lang.String r2 = "AccountProxyService.userService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.String r1 = r1.getCurUserId()
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0035
            L_0x001b:
                java.lang.Class<com.ss.android.ugc.aweme.profile.c.e> r0 = com.p683ss.android.ugc.aweme.profile.p2085c.C39828e.class
                monitor-enter(r0)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()     // Catch:{ all -> 0x003d }
                java.lang.String r2 = "AccountProxyService.userService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ all -> 0x003d }
                java.lang.String r1 = r1.getCurUserId()     // Catch:{ all -> 0x003d }
                com.p683ss.android.ugc.aweme.profile.p2085c.C39828e.f101635a = r1     // Catch:{ all -> 0x003d }
                com.ss.android.ugc.aweme.profile.c.e r1 = new com.ss.android.ugc.aweme.profile.c.e     // Catch:{ all -> 0x003d }
                r1.<init>()     // Catch:{ all -> 0x003d }
                com.p683ss.android.ugc.aweme.profile.p2085c.C39828e.f101636b = r1     // Catch:{ all -> 0x003d }
                monitor-exit(r0)
            L_0x0035:
                com.ss.android.ugc.aweme.profile.c.e r0 = com.p683ss.android.ugc.aweme.profile.p2085c.C39828e.f101636b
                if (r0 != 0) goto L_0x003c
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x003c:
                return r0
            L_0x003d:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2085c.C39828e.C39829a.m88577a():com.ss.android.ugc.aweme.profile.c.e");
        }

        public /* synthetic */ C39829a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo80913a() {
        if (this.f101638d.getInt("profile_guide_times", 0) >= 5) {
            return true;
        }
        return false;
    }

    static {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        f101635a = g.getCurUserId();
    }

    public C39828e() {
        StringBuilder sb = new StringBuilder("profile_guide");
        sb.append(f101635a);
        Keva repo = Keva.getRepo(sb.toString());
        C52711k.m112236a((Object) repo, "Keva.getRepo(PREFIX_REPO_NAME + uid)");
        this.f101638d = repo;
    }

    /* renamed from: b */
    public final boolean mo80914b() {
        long j;
        if (ProfileGuideTestMode.m88626a()) {
            j = 0;
        } else {
            j = TimeUnit.DAYS.toMillis((long) ProfileGuideTimeInterval.m88628b());
        }
        long j2 = this.f101638d.getLong("profile_guide_last_shown_timestamp", 0) + j;
        Calendar instance = Calendar.getInstance();
        C52711k.m112236a((Object) instance, "it");
        instance.setTimeInMillis(System.currentTimeMillis());
        if (!ProfileGuideTestMode.m88626a()) {
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
        }
        if (instance.getTimeInMillis() < j2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo80915c() {
        this.f101638d.storeInt("profile_guide_times", this.f101638d.getInt("profile_guide_times", 0) + 1);
        Keva keva = this.f101638d;
        String str = "profile_guide_last_shown_timestamp";
        Calendar instance = Calendar.getInstance();
        C52711k.m112236a((Object) instance, "it");
        instance.setTimeInMillis(System.currentTimeMillis());
        if (!ProfileGuideTestMode.m88626a()) {
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
        }
        keva.storeLong(str, instance.getTimeInMillis());
    }
}
