package com.p683ss.android.ugc.aweme.userservice;

import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p728c.C11574e;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.livedata.C23552a;
import com.p683ss.android.ugc.aweme.p1632di.C27656cp;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.userservice.api.C47589a;
import com.p683ss.android.ugc.aweme.userservice.api.C47590b;
import com.p683ss.android.ugc.aweme.userservice.jedi.C47591a;
import com.p683ss.android.ugc.aweme.userservice.jedi.p2385a.C47602f;
import com.p683ss.android.ugc.aweme.userservice.jedi.p2385a.C47604h;
import com.p683ss.android.ugc.aweme.userservice.jedi.p2385a.C47604h.C47608a;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2182c;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.userservice.a */
public final class C47588a implements C47590b {

    /* renamed from: a */
    public C47604h f120040a = C47591a.m103052b();

    /* renamed from: b */
    public Map<String, C2182c<C52847n<C47589a, FollowStatus>>> f120041b = new HashMap();

    /* renamed from: c */
    public static C47590b m103036c() {
        if (C27991b.f73433Q == null) {
            synchronized (C47590b.class) {
                if (C27991b.f73433Q == null) {
                    C27991b.f73433Q = C27656cp.m66326a();
                }
            }
        }
        return (C47590b) C27991b.f73433Q;
    }

    /* renamed from: a */
    public final C11536c<String, User> mo94908a() {
        return C47591a.m103051a();
    }

    /* renamed from: b */
    public final C23275b<FollowStatus> mo94911b() {
        return C23552a.m57751a().mo48724a("#FollowStatus", FollowStatus.class);
    }

    /* renamed from: a */
    public final C2201v<C11575f<User>> mo94906a(String str) {
        C47604h hVar = this.f120040a;
        C52711k.m112240b(str, "userId");
        return C11571b.m23673a((C11536c<K, V>) hVar.f120072d).mo22300a(str, (C11574e<?, ?>[]) new C11574e[0]);
    }

    /* renamed from: a */
    public final C2201v<BaseResponse> mo94907a(String str, String str2) {
        C47604h hVar = this.f120040a;
        C52711k.m112240b(str, "uid");
        C52711k.m112240b(str2, "secUserId");
        return hVar.f120070b.mo22318c(new C47602f(str, str2));
    }

    /* renamed from: a */
    public final FollowStatus mo94909a(String str, int i, int i2, int i3, String str2, String str3) throws Exception {
        FollowStatus a = CommonFollowApi.m103035a(str, str3, i, -1, -1, str2, -1, "");
        C2182c<C52847n<C47589a, FollowStatus>> cVar = this.f120040a.f120071c;
        C47589a aVar = new C47589a(str, str3, i, -1, -1, str2, -1);
        cVar.onNext(new C52847n(aVar, a));
        return a;
    }

    /* renamed from: a */
    public final C1680ad<FollowStatus> mo94905a(String str, String str2, int i, int i2, int i3, String str3, int i4) {
        C47604h hVar = this.f120040a;
        String str4 = str;
        C52711k.m112240b(str, "userId");
        String str5 = str2;
        C52711k.m112240b(str2, "secUserId");
        C47589a aVar = new C47589a(str4, str5, i, i2, i3, str3, i4);
        C1680ad<FollowStatus> a = C1680ad.m5960a((C2206z<? extends T>) hVar.f120069a.mo22318c(aVar).mo6518a((C1710e<? super T>) new C47608a<Object>(hVar, aVar)));
        C52711k.m112236a((Object) a, "Single.fromObservable(fo…r(params, it))\n        })");
        return a;
    }

    /* renamed from: a */
    public final FollowStatus mo94910a(String str, String str2, int i, int i2, int i3, String str3, int i4, String str4) throws Exception {
        FollowStatus a = CommonFollowApi.m103035a(str, str2, i, i2, i3, str3, i4, str4);
        C2182c<C52847n<C47589a, FollowStatus>> cVar = this.f120040a.f120071c;
        C47589a aVar = new C47589a(str, str2, i, i3, i2, str3, i4);
        cVar.onNext(new C52847n(aVar, a));
        return a;
    }
}
