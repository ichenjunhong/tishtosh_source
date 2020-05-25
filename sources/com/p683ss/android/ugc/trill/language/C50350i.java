package com.p683ss.android.ugc.trill.language;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26224g;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30750af;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai;
import com.p683ss.android.ugc.aweme.feed.panel.C30648q;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.journey.C35781s;
import com.p683ss.android.ugc.aweme.main.C36634ec;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.main.MainFragment;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41687b;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.p683ss.android.ugc.aweme.user.C47557d;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.Collection;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.trill.language.i */
public final class C50350i {

    /* renamed from: e */
    public static final C52668f f126262e = C52732g.m112286a(C52757k.SYNCHRONIZED, C50352b.f126269a);

    /* renamed from: f */
    public static final C50351a f126263f = new C50351a(null);

    /* renamed from: a */
    public final C36634ec f126264a;

    /* renamed from: b */
    public boolean f126265b;

    /* renamed from: c */
    public String f126266c;

    /* renamed from: d */
    public C50346h f126267d;

    /* renamed from: com.ss.android.ugc.trill.language.i$a */
    public static final class C50351a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f126268a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C50351a.class), "inst", "getInst()Lcom/ss/android/ugc/trill/language/ContentLanguageGuideManager;"))};

        private C50351a() {
        }

        /* renamed from: a */
        public static C50350i m108630a() {
            return (C50350i) C50350i.f126262e.getValue();
        }

        public /* synthetic */ C50351a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.i$b */
    static final class C50352b extends C52712l implements C52670a<C50350i> {

        /* renamed from: a */
        public static final C50352b f126269a = new C50352b();

        C50352b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C50350i(null);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.i$c */
    static final class C50353c<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C50350i f126270a;

        /* renamed from: b */
        final /* synthetic */ Context f126271b;

        C50353c(C50350i iVar, Context context) {
            this.f126270a = iVar;
            this.f126271b = context;
        }

        public final /* synthetic */ Object call() {
            this.f126270a.f126267d = new C50346h(this.f126271b, this.f126270a.f126266c);
            C50346h hVar = this.f126270a.f126267d;
            if (hVar != null) {
                hVar.setOnDismissListener(new OnDismissListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C50353c f126272a;

                    {
                        this.f126272a = r1;
                    }

                    public final void onDismiss(DialogInterface dialogInterface) {
                    }
                });
            }
            C50346h hVar2 = this.f126270a.f126267d;
            if (hVar2 != null && !hVar2.isShowing()) {
                C50346h hVar3 = this.f126270a.f126267d;
                if (hVar3 != null) {
                    hVar3.show();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.i$d */
    public static final class C50355d implements C1674ab<BaseResponse> {
        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            C41687b.f105513b.mo85532a(null, false);
        }

        public final /* synthetic */ void onNext(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            C52711k.m112240b(baseResponse, "t");
            if (baseResponse.status_code == 0) {
                IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
                C52711k.m112236a((Object) baseUserService_Monster, "ServiceManager.get().get…IUserService::class.java)");
                User currentUser = baseUserService_Monster.getCurrentUser();
                C52711k.m112236a((Object) currentUser, "ServiceManager.get().get…             .currentUser");
                currentUser.setContentLanguageDialogShown(true);
                C47557d.m102995i();
            }
            C41687b.f105513b.mo85532a(null, false);
        }
    }

    private C50350i() {
        this.f126264a = new C36634ec();
        this.f126266c = "";
    }

    /* renamed from: a */
    public final void mo98253a() {
        if (!this.f126264a.mo75729d()) {
            this.f126264a.mo75725b(true);
        }
    }

    public /* synthetic */ C50350i(C52707g gVar) {
        this();
    }

    /* renamed from: c */
    private final void m108625c(Context context) {
        C0013i.m18a((Callable<TResult>) new C50353c<TResult>(this, context), C0013i.f25b);
    }

    /* renamed from: b */
    public final void mo98255b(Context context) {
        C52711k.m112240b(context, "context");
        if (this.f126265b) {
            mo98254a(context);
        }
    }

    /* renamed from: a */
    public static boolean m108624a(Aweme aweme) {
        AwemeAppData a = AwemeAppData.m47851a();
        C52711k.m112236a((Object) a, "AwemeAppData.inst()");
        if (a.f61128f || C26224g.m63536a() || C26512f.m64061d(aweme) || C26512f.m64070m(aweme) || C26235d.m63570a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final boolean m108626d(Context context) {
        Aweme aweme;
        if ((context instanceof Activity) && (context instanceof MainActivity)) {
            Fragment curFragment = ((MainActivity) context).getCurFragment();
            if (curFragment instanceof MainFragment) {
                C30750af k = ((MainFragment) curFragment).mo75499c();
                if (k instanceof C30753ai) {
                    C30753ai aiVar = (C30753ai) k;
                    if (aiVar.isResumed() && aiVar.getUserVisibleHint()) {
                        Boolean a = C30578o.m71565a();
                        C52711k.m112236a((Object) a, "Feed0VVManagerUtils.isFirstInstallAndFirstLaunch()");
                        if (a.booleanValue()) {
                            C30648q qVar = aiVar.f80590m;
                            C52711k.m112236a((Object) qVar, "feedFragment.listPanel");
                            if (qVar.mo60520al() == 0) {
                                return false;
                            }
                        }
                        C30648q qVar2 = aiVar.f80590m;
                        if (qVar2 != null) {
                            aweme = qVar2.mo60519ak();
                        } else {
                            aweme = null;
                        }
                        if (m108624a(aweme)) {
                            String v = aiVar.mo63441v();
                            C52711k.m112236a((Object) v, "feedFragment.eventType");
                            this.f126266c = v;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo98254a(Context context) {
        C52711k.m112240b(context, "context");
        mo98253a();
        IESSettingsProxy b = C32816h.m75716b();
        C52711k.m112236a((Object) b, "SettingsReader.get()");
        if (!C9376b.m18558a((Collection<T>) b.getContentLanguageGuideCodes())) {
            C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
            if (C47549c.m102978c()) {
                if (C47915gg.m103654c()) {
                    return;
                }
            } else if (!TextUtils.isEmpty(this.f126264a.mo75727c()) || this.f126264a.mo75726b()) {
                return;
            }
            if (!m108626d(context)) {
                this.f126265b = true;
                return;
            }
            if (C35781s.f91909n.mo74446j() <= 5 || C35781s.f91909n.mo74446j() > 9) {
                m108625c(context);
            }
            this.f126265b = false;
        }
    }
}
