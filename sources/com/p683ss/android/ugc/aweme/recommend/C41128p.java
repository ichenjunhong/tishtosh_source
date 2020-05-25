package com.p683ss.android.ugc.aweme.recommend;

import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.p */
public final class C41128p {

    /* renamed from: b */
    public static String f104515b;

    /* renamed from: c */
    public static C41128p f104516c;

    /* renamed from: d */
    public static final C41129a f104517d = new C41129a(null);

    /* renamed from: a */
    public final Keva f104518a;

    /* renamed from: com.ss.android.ugc.aweme.recommend.p$a */
    public static final class C41129a {
        private C41129a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
            if ((!p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r0, (java.lang.Object) r1.getCurUserId())) != false) goto L_0x001b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p683ss.android.ugc.aweme.recommend.C41128p m90819a() {
            /*
                com.ss.android.ugc.aweme.recommend.p r0 = com.p683ss.android.ugc.aweme.recommend.C41128p.f104516c
                if (r0 == 0) goto L_0x001b
                java.lang.String r0 = com.p683ss.android.ugc.aweme.recommend.C41128p.f104515b
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
                java.lang.String r2 = "AccountProxyService.userService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.String r1 = r1.getCurUserId()
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0035
            L_0x001b:
                java.lang.Class<com.ss.android.ugc.aweme.recommend.p> r0 = com.p683ss.android.ugc.aweme.recommend.C41128p.class
                monitor-enter(r0)
                com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()     // Catch:{ all -> 0x003d }
                java.lang.String r2 = "AccountProxyService.userService()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ all -> 0x003d }
                java.lang.String r1 = r1.getCurUserId()     // Catch:{ all -> 0x003d }
                com.p683ss.android.ugc.aweme.recommend.C41128p.f104515b = r1     // Catch:{ all -> 0x003d }
                com.ss.android.ugc.aweme.recommend.p r1 = new com.ss.android.ugc.aweme.recommend.p     // Catch:{ all -> 0x003d }
                r1.<init>()     // Catch:{ all -> 0x003d }
                com.p683ss.android.ugc.aweme.recommend.C41128p.f104516c = r1     // Catch:{ all -> 0x003d }
                monitor-exit(r0)
            L_0x0035:
                com.ss.android.ugc.aweme.recommend.p r0 = com.p683ss.android.ugc.aweme.recommend.C41128p.f104516c
                if (r0 != 0) goto L_0x003c
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x003c:
                return r0
            L_0x003d:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.recommend.C41128p.C41129a.m90819a():com.ss.android.ugc.aweme.recommend.p");
        }

        public /* synthetic */ C41129a(C52707g gVar) {
            this();
        }
    }

    static {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        f104515b = g.getCurUserId();
    }

    public C41128p() {
        StringBuilder sb = new StringBuilder("i18n_recommmend_user_");
        sb.append(f104515b);
        Keva repo = Keva.getRepo(sb.toString());
        C52711k.m112236a((Object) repo, "Keva.getRepo(PREFIX_REPO_NAME + uid)");
        this.f104518a = repo;
    }

    /* renamed from: a */
    public final boolean mo83635a() {
        if (this.f104518a.getInt("dialog_close_without_action_in_times", 0) < 2) {
            return false;
        }
        long j = this.f104518a.getLong("dialog_close_without_action_in_times_maximum_timestamp", 0);
        Calendar instance = Calendar.getInstance();
        C52711k.m112236a((Object) instance, "it");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        if (instance.getTimeInMillis() < j) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo83636b() {
        long j = this.f104518a.getLong("dialog_last_shown_timestamp", 0) + TimeUnit.DAYS.toMillis((long) RecommendUserDialogTimeInterval.m90752a());
        Calendar instance = Calendar.getInstance();
        C52711k.m112236a((Object) instance, "it");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        if (instance.getTimeInMillis() < j) {
            return true;
        }
        return false;
    }
}
