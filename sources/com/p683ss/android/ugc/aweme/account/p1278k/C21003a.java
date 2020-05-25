package com.p683ss.android.ugc.aweme.account.p1278k;

import android.os.Bundle;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p846b.C13003d;
import com.bytedance.sdk.account.p844a.p848d.C13017f;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p877l.C13207b;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C22137r.C22141d;
import com.p683ss.android.ugc.aweme.account.C22137r.C22142e;
import com.p683ss.android.ugc.aweme.account.C22137r.C22143f;
import com.p683ss.android.ugc.aweme.account.p1277j.C20997b;
import com.p683ss.android.ugc.aweme.account.p1302o.C22095e;
import com.p683ss.android.ugc.aweme.account.p1302o.C22095e.C22096a;
import com.p683ss.android.ugc.aweme.account.util.C22288y;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.k.a */
public final class C21003a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f57112a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21003a.class), "userService", "getUserService()Lcom/ss/android/ugc/aweme/IAccountUserService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21003a.class), "passportApi", "getPassportApi()Lcom/bytedance/sdk/account/api/IBDAccountAPI;"))};

    /* renamed from: b */
    static final boolean f57113b = false;
    /* access modifiers changed from: 0000 */

    /* renamed from: c */
    public static int f57114c = -1;
    /* access modifiers changed from: 0000 */

    /* renamed from: d */
    public static List<String> f57115d;

    /* renamed from: e */
    public static String f57116e = "";

    /* renamed from: f */
    public static final C21003a f57117f = new C21003a();

    /* renamed from: g */
    private static final C52668f f57118g = C52732g.m112285a(C21007d.f57126a);

    /* renamed from: h */
    private static final C52668f f57119h = C52732g.m112285a(C21004a.f57120a);

    /* renamed from: com.ss.android.ugc.aweme.account.k.a$a */
    static final class C21004a extends C52712l implements C52670a<C13011d> {

        /* renamed from: a */
        public static final C21004a f57120a = new C21004a();

        C21004a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C13081d.m26312a(C23826bi.m58460b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.k.a$b */
    public static final class C21005b extends C13003d {

        /* renamed from: a */
        final /* synthetic */ Bundle f57121a;

        /* renamed from: b */
        final /* synthetic */ C13003d f57122b;

        /* renamed from: c */
        final /* synthetic */ String f57123c;

        /* renamed from: d */
        final /* synthetic */ boolean f57124d;

        /* renamed from: e */
        final /* synthetic */ Bundle f57125e;

        public final /* synthetic */ void onSuccess(C12990b bVar) {
            C13207b bVar2;
            C13017f fVar = (C13017f) bVar;
            if (fVar != null) {
                bVar2 = fVar.f34009h;
            } else {
                bVar2 = null;
            }
            C23826bi.m58455a(bVar2);
            Bundle bundle = this.f57121a;
            if (bundle == null) {
                C52711k.m112236a((Object) C0013i.m13a(new Exception("Bundle is empty")), "Task.forError(Exception(\"Bundle is empty\"))");
            } else {
                C52711k.m112236a((Object) C22288y.m55169a(bundle).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) new C22141d<TResult,C0013i<TContinuationResult>>(bundle)).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) C22142e.f59703a).mo23b((C0011g<TResult, C0013i<TContinuationResult>>) new C22143f<TResult,C0013i<TContinuationResult>>(C23826bi.m58449a(), bundle)), "UserUtils.uploadUserMode…bundle)\n                }");
            }
            C20997b.m53372b();
            C22095e.f59611d.mo46199a(0, Integer.valueOf(0), "");
            C13003d dVar = this.f57122b;
            if (dVar != null) {
                dVar.onSuccess(fVar);
            }
        }

        public final /* synthetic */ void onError(C12990b bVar, int i) {
            Integer num;
            String str;
            Integer num2;
            String str2;
            String str3;
            C13017f fVar = (C13017f) bVar;
            if (i == 1 || i == 4) {
                C21003a.f57117f.mo44983a().delete(this.f57123c, "switch error:1|4");
            }
            if (fVar != null) {
                num = Integer.valueOf(fVar.f34000c);
            } else {
                num = null;
            }
            if (fVar != null) {
                str = fVar.f34001d;
            } else {
                str = null;
            }
            C20997b.m53370a(num, str);
            C22096a aVar = C22095e.f59611d;
            if (fVar != null) {
                num2 = Integer.valueOf(fVar.f34000c);
            } else {
                num2 = null;
            }
            StringBuilder sb = new StringBuilder();
            if (fVar != null) {
                str2 = fVar.f34001d;
            } else {
                str2 = null;
            }
            sb.append(str2);
            sb.append('|');
            if (fVar != null) {
                str3 = fVar.f34002e;
            } else {
                str3 = null;
            }
            sb.append(str3);
            aVar.mo46199a(1, num2, sb.toString());
            if (C21003a.f57115d != null && this.f57124d) {
                C21003a aVar2 = C21003a.f57117f;
                C21003a.f57114c = C21003a.f57114c - 1;
                if (C21003a.f57114c >= 0) {
                    List a = C21003a.f57115d;
                    if (a == null) {
                        C52711k.m112234a();
                    }
                    C21003a.m53388a((String) a.get(C21003a.f57114c), this.f57125e, true, this.f57122b);
                    return;
                }
            }
            C23826bi.m58459a(false, (User) null);
            C13003d dVar = this.f57122b;
            if (dVar != null) {
                dVar.onError(fVar, i);
            }
        }

        C21005b(Bundle bundle, C13003d dVar, String str, boolean z, Bundle bundle2) {
            this.f57121a = bundle;
            this.f57122b = dVar;
            this.f57123c = str;
            this.f57124d = z;
            this.f57125e = bundle2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.k.a$c */
    public static final class C21006c extends C13003d {
        C21006c() {
        }

        public final /* synthetic */ void onSuccess(C12990b bVar) {
            C13017f fVar = (C13017f) bVar;
            C21003a.m53390b();
        }

        public final /* synthetic */ void onError(C12990b bVar, int i) {
            C13017f fVar = (C13017f) bVar;
            C21003a.m53390b();
            Bundle bundle = new Bundle();
            C23826bi.m58467h();
            C23826bi.m58464e().mo44379c(bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.k.a$d */
    static final class C21007d extends C52712l implements C52670a<IAccountUserService> {

        /* renamed from: a */
        public static final C21007d f57126a = new C21007d();

        C21007d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C23826bi.m58449a();
        }
    }

    private C21003a() {
    }

    /* renamed from: c */
    private final C13011d m53391c() {
        return (C13011d) f57119h.getValue();
    }

    /* renamed from: a */
    public final IAccountUserService mo44983a() {
        return (IAccountUserService) f57118g.getValue();
    }

    /* renamed from: b */
    public static void m53390b() {
        f57115d = null;
        f57114c = -1;
        f57116e = "";
    }

    /* renamed from: a */
    public static final void m53388a(String str, Bundle bundle, boolean z, C13003d dVar) {
        boolean z2;
        Bundle bundle2;
        String str2;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            IAccountUserService a = f57117f.mo44983a();
            C52711k.m112236a((Object) a, "userService");
            if (!C52830p.m112406a(str, a.getCurUserId(), true)) {
                if (bundle == null) {
                    bundle2 = new Bundle();
                } else {
                    bundle2 = bundle;
                }
                String str3 = "previous_uid";
                IAccountUserService a2 = f57117f.mo44983a();
                C52711k.m112236a((Object) a2, "userService");
                if (a2.isLogin()) {
                    IAccountUserService a3 = f57117f.mo44983a();
                    C52711k.m112236a((Object) a3, "userService");
                    str2 = a3.getCurUserId();
                } else {
                    str2 = f57116e;
                }
                bundle2.putString(str3, str2);
                C13011d c = f57117f.m53391c();
                C21005b bVar = new C21005b(bundle2, dVar, str, z, bundle);
                c.mo24610a(str, (C13003d) bVar);
            }
        }
    }
}
