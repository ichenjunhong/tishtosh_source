package com.p683ss.android.ugc.aweme.user.repository;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11795c;
import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.C11936w;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1373d.C23064c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40211ae;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h;
import com.p683ss.android.ugc.aweme.userservice.C47588a;
import com.p683ss.android.ugc.aweme.userservice.api.C47590b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel */
public final class UserViewModel extends JediViewModel<UserState> {

    /* renamed from: d */
    public final String f120028d = "follow_user";

    /* renamed from: e */
    public final String f120029e = "unfollow_user";

    /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$a */
    static final class C47577a extends C52712l implements C52682m<UserState, C11787a<? extends FollowStatus>, UserState> {

        /* renamed from: a */
        final /* synthetic */ UserViewModel f120030a;

        /* renamed from: b */
        final /* synthetic */ C39969h f120031b;

        C47577a(UserViewModel userViewModel, C39969h hVar) {
            this.f120030a = userViewModel;
            this.f120031b = hVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            UserState userState = (UserState) obj;
            C11787a aVar = (C11787a) obj2;
            C52711k.m112240b(userState, "$receiver");
            C52711k.m112240b(aVar, "follow");
            StringBuilder sb = new StringBuilder("follow executed, uid is ");
            sb.append(this.f120031b.f101898a);
            sb.append(", action is ");
            sb.append(this.f120031b.f101900c);
            C32458a.m75141a(3, "UserViewModel", sb.toString());
            if (aVar instanceof C11936w) {
                User clone = userState.getUser().clone();
                C52711k.m112236a((Object) clone, "it");
                clone.setFollowStatus(((FollowStatus) ((C11936w) aVar).mo22538a()).followStatus);
                C52711k.m112236a((Object) clone, "user.clone().also { it.f…w.invoke().followStatus }");
                return UserState.copy$default(userState, clone, false, aVar, null, 10, null);
            }
            if (aVar instanceof C11795c) {
                Throwable th = ((C11795c) aVar).f31301a;
                if (th instanceof C23459a) {
                    if (this.f120031b.f101900c == 0) {
                        C31300c.m73020d().mo64183a(this.f120030a.f120029e, String.valueOf(((C23459a) th).getErrorCode()));
                    } else if (this.f120031b.f101900c == 0) {
                        C31300c.m73020d().mo64183a(this.f120030a.f120028d, String.valueOf(((C23459a) th).getErrorCode()));
                    }
                }
            }
            return UserState.copy$default(userState, null, false, aVar, null, 11, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$b */
    static final class C47578b extends C52712l implements C52671b<UserState, C52860x> {

        /* renamed from: a */
        final /* synthetic */ UserViewModel f120032a;

        C47578b(UserViewModel userViewModel) {
            this.f120032a = userViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            UserState userState = (UserState) obj;
            C52711k.m112240b(userState, "it");
            UserViewModel userViewModel = this.f120032a;
            C47590b c = C47588a.m103036c();
            String uid = userState.getUser().getUid();
            C52711k.m112236a((Object) uid, "it.user.uid");
            C1690c f = c.mo94906a(uid).mo6545f((C1710e<? super T>) new C1710e<C11575f<? extends User>>(this) {

                /* renamed from: a */
                final /* synthetic */ C47578b f120033a;

                /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$b$1$a */
                static final class C47580a extends C52712l implements C52671b<UserState, UserState> {

                    /* renamed from: a */
                    final /* synthetic */ User f120034a;

                    C47580a(User user) {
                        this.f120034a = user;
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        UserState userState = (UserState) obj;
                        C52711k.m112240b(userState, "$receiver");
                        return UserState.copy$default(userState, this.f120034a, false, null, null, 14, null);
                    }
                }

                {
                    this.f120033a = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    User user = (User) ((C11575f) obj).mo22313a();
                    if (user != null) {
                        this.f120033a.f120032a.mo22530c(new C47580a(user));
                    }
                }
            });
            C52711k.m112236a((Object) f, "ServiceManager.get().get…  }\n                    }");
            userViewModel.mo22521a(f);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c */
    public static final class C47581c extends C52712l implements C52682m<UserState, C11787a<? extends BaseResponse>, UserState> {
        public static final C47581c INSTANCE = new C47581c();

        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c$a */
        static final /* synthetic */ class C47583a extends C52710j implements C52670a<Integer> {
            C47583a(User user) {
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

        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c$b */
        static final /* synthetic */ class C47584b extends C52710j implements C52671b<Integer, C52860x> {
            C47584b(User user) {
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

        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c$c */
        static final /* synthetic */ class C47585c extends C52710j implements C52670a<Integer> {
            C47585c(User user) {
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

        /* renamed from: com.ss.android.ugc.aweme.user.repository.UserViewModel$c$d */
        static final /* synthetic */ class C47586d extends C52710j implements C52671b<Integer, C52860x> {
            C47586d(User user) {
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

        C47581c() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            UserState userState = (UserState) obj;
            C11787a aVar = (C11787a) obj2;
            C52711k.m112240b(userState, "$receiver");
            C52711k.m112240b(aVar, "res");
            if (aVar instanceof C11936w) {
                Object a = aVar.mo22538a();
                if (a == null) {
                    C52711k.m112234a();
                }
                if (((BaseResponse) a).status_code == 0) {
                    IAccountUserService g = C20854a.m53167g();
                    C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                    User curUser = g.getCurUser();
                    C52682m mVar = C475821.f120035a;
                    if (C40211ae.m89448a(curUser)) {
                        mVar.invoke(new C47583a(curUser), new C47584b(curUser));
                    } else {
                        mVar.invoke(new C47585c(curUser), new C47586d(curUser));
                    }
                    return UserState.copy$default(userState, null, true, null, null, 13, null);
                }
            }
            if (!(aVar instanceof C11795c)) {
                return userState;
            }
            C11795c cVar = (C11795c) aVar;
            if (cVar.f31301a instanceof C23459a) {
                Context a2 = C11010c.m22280a();
                Throwable th = cVar.f31301a;
                if (th != null) {
                    C22971a.m56491a(a2, (C23459a) th);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                }
            } else {
                C32458a.m75148a(cVar.f31301a);
            }
            return userState;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        UserState userState = new UserState(null, false, null, null, 15, null);
        return userState;
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        mo22527b(new C47578b(this));
    }

    /* renamed from: a */
    public final void mo94901a(C39969h hVar) {
        C52711k.m112240b(hVar, "param");
        mo22520a(C47588a.m103036c().mo94905a(hVar.f101898a, hVar.f101899b, hVar.f101900c, C23064c.m56602a(hVar.f101903f), hVar.f101901d, hVar.f101904g, hVar.f101902e), (C52682m<? super S, ? super C11787a<? extends T>, ? extends S>) new C47577a<Object,Object,Object>(this, hVar));
    }
}
