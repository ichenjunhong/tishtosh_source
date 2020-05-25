package com.p683ss.android.ugc.aweme.policy.notice.p2080b;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.policy.notice.api.C39506a;
import com.p683ss.android.ugc.aweme.policy.notice.api.C39508c;
import com.p683ss.android.ugc.aweme.policy.notice.api.PolicyNoticeApi;
import com.p683ss.android.ugc.aweme.policy.notice.api.PolicyNoticeApi.API;
import com.p683ss.android.ugc.aweme.policy.notice.p2079a.C39503a;
import com.p683ss.android.ugc.aweme.policy.notice.p2079a.C39504b;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.b.a */
public final class C39509a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f101073a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C39509a.class), "mApi", "getMApi()Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNoticeApi$API;"))};

    /* renamed from: b */
    private final C52668f f101074b = C52732g.m112285a(C39512c.f101077a);

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.b.a$a */
    public static final class C39510a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C39509a f101075a;

        public C39510a(C39509a aVar) {
            this.f101075a = aVar;
        }

        public final /* synthetic */ Object call() {
            this.f101075a.mo80540a();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.b.a$b */
    static final class C39511b<TTaskResult, TContinuationResult> implements C0011g<C39508c, Object> {

        /* renamed from: a */
        public static final C39511b f101076a = new C39511b();

        C39511b() {
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "it");
            if (!iVar.mo33d() && !iVar.mo31c() && iVar.mo26b()) {
                List<C39506a> list = ((C39508c) iVar.mo34e()).f101072a;
                if (!C9376b.m18558a((Collection<T>) list)) {
                    Iterable iterable = list;
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        if (C52711k.m112239a((Object) ((C39506a) next).f101060c, (Object) "pop")) {
                            arrayList.add(next);
                        }
                    }
                    List list2 = (List) arrayList;
                    Collection arrayList2 = new ArrayList();
                    for (Object next2 : iterable) {
                        if (C52711k.m112239a((Object) ((C39506a) next2).f101060c, (Object) "float")) {
                            arrayList2.add(next2);
                        }
                    }
                    List list3 = (List) arrayList2;
                    if (!list3.isEmpty()) {
                        C40869c.m90375a(true);
                        if (list2.isEmpty()) {
                            C47718bf.m103288a(new C39504b((C39506a) list3.get(0), null, 2, null));
                            return null;
                        }
                        C47718bf.m103288a(new C39504b((C39506a) list3.get(0), (C39506a) list2.get(0)));
                        return null;
                    } else if (!list2.isEmpty()) {
                        C40869c.m90375a(true);
                        C47718bf.m103288a(new C39503a((C39506a) list2.get(0)));
                        return null;
                    } else {
                        C40869c.f104035d.mo83206g();
                        return null;
                    }
                }
            }
            C40869c.f104035d.mo83206g();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.b.a$c */
    static final class C39512c extends C52712l implements C52670a<API> {

        /* renamed from: a */
        public static final C39512c f101077a = new C39512c();

        C39512c() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return PolicyNoticeApi.f101056a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.b.a$d */
    static final class C39513d<TTaskResult, TContinuationResult> implements C0011g<BaseResponse, Object> {

        /* renamed from: a */
        public static final C39513d f101078a = new C39513d();

        C39513d() {
        }

        public final /* bridge */ /* synthetic */ Object then(C0013i iVar) {
            return null;
        }
    }

    /* renamed from: b */
    private final API m87840b() {
        return (API) this.f101074b.getValue();
    }

    /* renamed from: a */
    public final void mo80540a() {
        m87840b().getPolicyNotice().mo19a((C0011g<TResult, TContinuationResult>) C39511b.f101076a);
    }

    /* renamed from: a */
    public final void mo80541a(String str, String str2, String str3, String str4, Integer num) {
        m87840b().policyNoticeApprove(str, str2, str3, str4, num).mo20a((C0011g<TResult, TContinuationResult>) C39513d.f101078a, C0013i.f25b);
    }
}
