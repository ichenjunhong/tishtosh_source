package com.p683ss.android.ugc.aweme.recommend;

import android.content.Context;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.p683ss.android.ugc.aweme.friends.p1790d.C32579a;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask */
public final class RecommendUserDialogTask implements LegoTask {
    public static final C41078a Companion = new C41078a(null);
    public static volatile RecommendUserDialogList data;
    public static volatile AtomicBoolean isDone = new AtomicBoolean(false);
    private C1690c disposable;
    private int mRetryCount;

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask$a */
    public static final class C41078a {
        private C41078a() {
        }

        /* renamed from: a */
        public static RecommendUserDialogList m90749a() {
            return RecommendUserDialogTask.data;
        }

        /* renamed from: b */
        public static boolean m90750b() {
            return RecommendUserDialogTask.isDone.get();
        }

        public /* synthetic */ C41078a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask$b */
    static final class C41079b<T> implements C1710e<RecommendUserDialogList> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserDialogTask f104423a;

        C41079b(RecommendUserDialogTask recommendUserDialogTask) {
            this.f104423a = recommendUserDialogTask;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f104423a.handleRecommendData((RecommendUserDialogList) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask$c */
    static final class C41080c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserDialogTask f104424a;

        C41080c(RecommendUserDialogTask recommendUserDialogTask) {
            this.f104424a = recommendUserDialogTask;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f104424a.handleThrowable((Throwable) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask$d */
    static final class C41081d implements C1706a {

        /* renamed from: a */
        final /* synthetic */ RecommendUserDialogTask f104425a;

        C41081d(RecommendUserDialogTask recommendUserDialogTask) {
            this.f104425a = recommendUserDialogTask;
        }

        /* renamed from: a */
        public final void mo6199a() {
            this.f104425a.handleComplete();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.RecommendUserDialogTask$e */
    static final class C41082e<T> implements C1710e<C1690c> {

        /* renamed from: a */
        public static final C41082e f104426a = new C41082e();

        C41082e() {
        }

        public final /* synthetic */ void accept(Object obj) {
            C1690c cVar = (C1690c) obj;
            RecommendUserDialogTask.isDone.set(false);
        }
    }

    public static final boolean isDone() {
        return C41078a.m90750b();
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.BOOT_FINISH;
    }

    public final void handleComplete() {
        isDone.set(true);
        C41126n nVar = C41125m.f104507a;
        if (nVar != null) {
            C41125m.m90813a(nVar);
        }
        C41125m.f104507a = null;
    }

    private final void doRequest() {
        C32579a createRecommendListRepository = C32616c.f84865a.createRecommendListRepository();
        Integer valueOf = Integer.valueOf(30);
        Integer valueOf2 = Integer.valueOf(0);
        C37940g a = C37940g.m84832a();
        C52711k.m112236a((Object) a, "RecUserImpressionReporter.getInstance()");
        this.disposable = createRecommendListRepository.mo65909a(valueOf, valueOf2, a.mo77416b()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6507a((C1710e<? super T>) new C41079b<Object>(this), (C1710e<? super Throwable>) new C41080c<Object>(this), (C1706a) new C41081d(this), (C1710e<? super C1690c>) C41082e.f104426a);
    }

    public final void handleRecommendData(RecommendUserDialogList recommendUserDialogList) {
        boolean z;
        if (recommendUserDialogList != null) {
            Collection recommendUsers = recommendUserDialogList.getRecommendUsers();
            if (recommendUsers == null || recommendUsers.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                data = recommendUserDialogList;
            }
        }
    }

    public final void handleThrowable(Throwable th) {
        if (this.mRetryCount < 3) {
            this.mRetryCount++;
            doRequest();
            return;
        }
        isDone.set(true);
    }

    public final void run(Context context) {
        if (!C47915gg.m103651b()) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin() && RecommendUserDialogShowStrategy.m90741a() && !C41078a.m90750b() && C41127o.m90814a()) {
                doRequest();
            }
        }
    }
}
