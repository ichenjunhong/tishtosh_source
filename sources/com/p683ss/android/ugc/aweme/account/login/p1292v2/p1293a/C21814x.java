package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21829b;
import com.p683ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.p683ss.android.ugc.aweme.user.C47549c;
import java.util.HashMap;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.p2692b.C53694b;
import org.p2692b.C53695c;
import p064c.p065a.C2177l;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p095m.C2191a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x */
public final class C21814x {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f59077a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21814x.class), "checkMap", "getCheckMap()Ljava/util/HashMap;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C21814x.class), "commitMap", "getCommitMap()Ljava/util/HashMap;"))};

    /* renamed from: b */
    public C1690c f59078b;

    /* renamed from: c */
    private C2191a<C21655b> f59079c;

    /* renamed from: d */
    private final C52668f f59080d = C52732g.m112285a(C21815a.f59083a);

    /* renamed from: e */
    private final C52668f f59081e = C52732g.m112285a(C21816b.f59084a);

    /* renamed from: f */
    private final C1711f<String, C53694b<C21655b>> f59082f = C21820f.f59089a;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$a */
    static final class C21815a extends C52712l implements C52670a<HashMap<String, String>> {

        /* renamed from: a */
        public static final C21815a f59083a = new C21815a();

        C21815a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$b */
    static final class C21816b extends C52712l implements C52670a<HashMap<String, String>> {

        /* renamed from: a */
        public static final C21816b f59084a = new C21816b();

        C21816b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$c */
    public static final class C21817c<T> implements C1710e<C21657d> {

        /* renamed from: a */
        final /* synthetic */ String f59085a;

        /* renamed from: b */
        final /* synthetic */ C21829b f59086b;

        public C21817c(String str, C21829b bVar) {
            this.f59085a = str;
            this.f59086b = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            String str;
            C21657d dVar = (C21657d) obj;
            String str2 = this.f59085a;
            C21656c cVar = dVar.f58688b;
            if (cVar != null) {
                str = cVar.f58686c;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C21656c cVar2 = dVar.f58688b;
                if (cVar2 == null) {
                    C52711k.m112234a();
                }
                str2 = cVar2.f58686c;
                if (str2 == null) {
                    C52711k.m112234a();
                }
            }
            C47549c.m102974a().mo94855a(str2);
            C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
            C47549c.m102975b().setNicknameUpdateReminder(false);
            FragmentActivity activity = this.f59086b.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$d */
    public static final class C21818d<T> implements C1710e<C21657d> {

        /* renamed from: a */
        public static final C21818d f59087a = new C21818d();

        C21818d() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$e */
    public static final class C21819e<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C21819e f59088a = new C21819e();

        C21819e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.x$f */
    static final class C21820f<T, R> implements C1711f<String, C53694b<C21655b>> {

        /* renamed from: a */
        public static final C21820f f59089a = new C21820f();

        C21820f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C52711k.m112240b(str, "response");
            return new C53694b<C21655b>() {
                /* renamed from: a */
                public final void mo336a(C53695c<? super C21655b> cVar) {
                    C21655b bVar = (C21655b) NetworkProxyAccount.f59579c.mo46183a().mo34884a(str, C21655b.class);
                    if (bVar == null) {
                        bVar = new C21655b(null, null);
                    }
                    cVar.onNext(bVar);
                }
            };
        }
    }

    /* renamed from: c */
    private final HashMap<String, String> m54462c() {
        return (HashMap) this.f59080d.getValue();
    }

    /* renamed from: a */
    public final HashMap<String, String> mo45947a() {
        return (HashMap) this.f59081e.getValue();
    }

    /* renamed from: b */
    public final void mo45949b() {
        if (this.f59079c != null) {
            C2191a<C21655b> aVar = this.f59079c;
            if (aVar == null) {
                C52711k.m112234a();
            }
            if (!aVar.isDisposed()) {
                C2191a<C21655b> aVar2 = this.f59079c;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                aVar2.dispose();
            }
        }
        if (this.f59078b != null) {
            C1690c cVar = this.f59078b;
            if (cVar == null) {
                C52711k.m112234a();
            }
            if (!cVar.isDisposed()) {
                C1690c cVar2 = this.f59078b;
                if (cVar2 == null) {
                    C52711k.m112234a();
                }
                cVar2.dispose();
            }
        }
    }

    /* renamed from: a */
    public final void mo45948a(String str, C2191a<C21655b> aVar) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(aVar, "observer");
        mo45949b();
        this.f59079c = aVar;
        m54462c().put("unique_id", str);
        NetworkProxyAccount.f59579c.mo46182a("/aweme/v1/unique/id/check/", (Map<String, String>) m54462c()).mo6446a(this.f59082f).mo6443a(C1667a.m5940a()).mo6449a((C2177l<? super T>) aVar);
    }
}
