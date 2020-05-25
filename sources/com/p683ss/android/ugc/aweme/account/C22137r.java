package com.p683ss.android.ugc.aweme.account;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.login.bean.C21122a;
import com.p683ss.android.ugc.aweme.account.util.C22288y;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.r */
public final class C22137r {

    /* renamed from: a */
    public static final C22137r f59698a = new C22137r();

    /* renamed from: com.ss.android.ugc.aweme.account.r$a */
    static final class C22138a<TTaskResult, TContinuationResult> implements C0011g<TResult, C0013i<TContinuationResult>> {

        /* renamed from: a */
        final /* synthetic */ Bundle f59699a;

        C22138a(Bundle bundle) {
            this.f59699a = bundle;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            return C22288y.m55174b(this.f59699a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.r$b */
    static final class C22139b<TTaskResult, TContinuationResult> implements C0011g<TResult, C0013i<TContinuationResult>> {

        /* renamed from: a */
        public static final C22139b f59700a = new C22139b();

        C22139b() {
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            return C22288y.m55168a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.r$c */
    static final class C22140c<TTaskResult, TContinuationResult> implements C0011g<C21122a, C0013i<Bundle>> {

        /* renamed from: a */
        final /* synthetic */ Bundle f59701a;

        C22140c(Bundle bundle) {
            this.f59701a = bundle;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            return C23826bi.m58464e().mo44377a(this.f59701a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.r$d */
    public static final class C22141d<TTaskResult, TContinuationResult> implements C0011g<TResult, C0013i<TContinuationResult>> {

        /* renamed from: a */
        final /* synthetic */ Bundle f59702a;

        public C22141d(Bundle bundle) {
            this.f59702a = bundle;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            return C22288y.m55174b(this.f59702a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.r$e */
    public static final class C22142e<TTaskResult, TContinuationResult> implements C0011g<TResult, C0013i<TContinuationResult>> {

        /* renamed from: a */
        public static final C22142e f59703a = new C22142e();

        C22142e() {
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            return C22288y.m55168a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.r$f */
    public static final class C22143f<TTaskResult, TContinuationResult> implements C0011g<TResult, C0013i<TContinuationResult>> {

        /* renamed from: a */
        final /* synthetic */ IAccountUserService f59704a;

        /* renamed from: b */
        final /* synthetic */ Bundle f59705b;

        public C22143f(IAccountUserService iAccountUserService, Bundle bundle) {
            this.f59704a = iAccountUserService;
            this.f59705b = bundle;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            IAccountUserService iAccountUserService = this.f59704a;
            C52711k.m112236a((Object) iAccountUserService, "userService");
            C23826bi.m58459a(true, iAccountUserService.getCurUser());
            return C23826bi.m58464e().mo44378b(this.f59705b);
        }
    }

    private C22137r() {
    }

    /* renamed from: a */
    public static final C0013i<Bundle> m54940a(Bundle bundle) {
        if (bundle == null) {
            C0013i<Bundle> a = C0013i.m13a(new Exception("Bundle is empty"));
            C52711k.m112236a((Object) a, "Task.forError(Exception(\"Bundle is empty\"))");
            return a;
        }
        C0013i<Bundle> b = C22288y.m55169a(bundle).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) new C22138a<TResult,C0013i<TContinuationResult>>(bundle)).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) C22139b.f59700a).mo24b(new C22140c(bundle), C0013i.f25b);
        C52711k.m112236a((Object) b, "UserUtils.uploadUserMode… Task.UI_THREAD_EXECUTOR)");
        return b;
    }
}
