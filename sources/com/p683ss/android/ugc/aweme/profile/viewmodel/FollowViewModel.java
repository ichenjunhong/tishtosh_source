package com.p683ss.android.ugc.aweme.profile.viewmodel;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40211ae;
import com.p683ss.android.ugc.aweme.userservice.C47588a;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel */
public final class FollowViewModel implements C0183j {

    /* renamed from: a */
    public final C0184k f103526a;

    /* renamed from: b */
    private C1690c f103527b;

    /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel$a */
    static final class C40578a<T> implements C1710e<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ C1710e f103528a;

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel$a$a */
        static final /* synthetic */ class C40580a extends C52710j implements C52670a<Integer> {
            C40580a(User user) {
                super(0, user);
            }

            public final String getName() {
                return "getFansCount";
            }

            public final C52761d getOwner() {
                return C52728w.m112245a(User.class);
            }

            public final String getSignature() {
                return "getFansCount()I";
            }

            public final /* synthetic */ Object invoke() {
                return Integer.valueOf(((User) this.receiver).getFansCount());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel$a$b */
        static final /* synthetic */ class C40581b extends C52710j implements C52671b<Integer, C52860x> {
            C40581b(User user) {
                super(1, user);
            }

            public final String getName() {
                return "setFansCount";
            }

            public final C52761d getOwner() {
                return C52728w.m112245a(User.class);
            }

            public final String getSignature() {
                return "setFansCount(I)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((User) this.receiver).setFansCount(((Number) obj).intValue());
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel$a$c */
        static final /* synthetic */ class C40582c extends C52710j implements C52670a<Integer> {
            C40582c(User user) {
                super(0, user);
            }

            public final String getName() {
                return "getFollowerCount";
            }

            public final C52761d getOwner() {
                return C52728w.m112245a(User.class);
            }

            public final String getSignature() {
                return "getFollowerCount()I";
            }

            public final /* synthetic */ Object invoke() {
                return Integer.valueOf(((User) this.receiver).getFollowerCount());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.FollowViewModel$a$d */
        static final /* synthetic */ class C40583d extends C52710j implements C52671b<Integer, C52860x> {
            C40583d(User user) {
                super(1, user);
            }

            public final String getName() {
                return "setFollowerCount";
            }

            public final C52761d getOwner() {
                return C52728w.m112245a(User.class);
            }

            public final String getSignature() {
                return "setFollowerCount(I)V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((User) this.receiver).setFollowerCount(((Number) obj).intValue());
                return C52860x.f131107a;
            }
        }

        C40578a(C1710e eVar) {
            this.f103528a = eVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            User curUser = g.getCurUser();
            C52682m mVar = C405791.f103529a;
            if (C40211ae.m89448a(curUser)) {
                mVar.invoke(new C40580a(curUser), new C40581b(curUser));
            } else {
                mVar.invoke(new C40582c(curUser), new C40583d(curUser));
            }
            this.f103528a.accept(baseResponse);
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C1690c cVar = this.f103527b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public FollowViewModel(C0184k kVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        this.f103526a = kVar;
        this.f103526a.getLifecycle().mo324a(this);
    }

    /* renamed from: a */
    public final void mo82847a(String str, String str2, C1710e<BaseResponse> eVar, C1710e<Throwable> eVar2) {
        C52711k.m112240b(eVar, "onNext");
        C52711k.m112240b(eVar2, "onError");
        C1690c cVar = this.f103527b;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f103527b = C47588a.m103036c().mo94907a(str, str2).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C40578a<Object>(eVar), eVar2);
    }
}
