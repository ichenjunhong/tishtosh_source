package com.p683ss.android.ugc.aweme.feed.p1730m;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.api.C30151i;
import com.p683ss.android.ugc.aweme.feed.api.C30152j;
import com.p683ss.android.ugc.aweme.feed.api.FollowFeedApi.C30141a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30779aw;
import java.util.Collection;
import java.util.List;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.m.q */
public final class C30495q {

    /* renamed from: a */
    public final C1689b f79707a = new C1689b();

    /* renamed from: b */
    public final C30779aw f79708b;

    /* renamed from: com.ss.android.ugc.aweme.feed.m.q$a */
    static final class C30496a<T> implements C1710e<C30152j> {

        /* renamed from: a */
        final /* synthetic */ C30495q f79709a;

        /* renamed from: b */
        final /* synthetic */ String f79710b;

        C30496a(C30495q qVar, String str) {
            this.f79709a = qVar;
            this.f79710b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            C30152j jVar = (C30152j) obj;
            if (C9376b.m18558a((Collection<T>) jVar.getFollowingInterestUsers())) {
                this.f79709a.f79708b.mo63492r();
                return;
            }
            List<C30151i> followingInterestUsers = jVar.getFollowingInterestUsers();
            if (followingInterestUsers != null) {
                for (C30151i logPbBean : followingInterestUsers) {
                    logPbBean.setLogPbBean(jVar.getLogPbBean());
                }
            }
            C30779aw awVar = this.f79709a.f79708b;
            List followingInterestUsers2 = jVar.getFollowingInterestUsers();
            if (followingInterestUsers2 == null) {
                C52711k.m112234a();
            }
            awVar.mo63489a(followingInterestUsers2);
            C26890h.m65011a("enter_following_window_feed", C23089d.m56640a().mo47829a("enter_from", this.f79710b).mo47829a("is_live", "1").f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.m.q$b */
    static final class C30497b<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C30495q f79711a;

        C30497b(C30495q qVar) {
            this.f79711a = qVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f79711a.f79708b.mo63491q();
        }
    }

    public C30495q(C30779aw awVar) {
        C52711k.m112240b(awVar, "view");
        this.f79708b = awVar;
    }

    /* renamed from: a */
    public final void mo60918a(String str) {
        C52711k.m112240b(str, "enterFrom");
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isLogin()) {
            this.f79707a.mo6181a(C30141a.m70743a().getInterestUsers(2, 0, 2).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C30496a<Object>(this, str), (C1710e<? super Throwable>) new C30497b<Object>(this)));
        }
    }
}
