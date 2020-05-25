package com.p683ss.android.ugc.aweme.userservice.jedi.p2385a;

import com.bytedance.jedi.p725a.p726a.C11536c;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p733f.C11587b;
import com.bytedance.jedi.p725a.p739i.C11682a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11686b;
import com.bytedance.jedi.p725a.p740j.C11698b;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.userservice.api.C47589a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2182c;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.h */
public final class C47604h extends C11698b {

    /* renamed from: a */
    public final C47592a f120069a = new C47592a();

    /* renamed from: b */
    public final C47601e f120070b = new C47601e();

    /* renamed from: c */
    public final C2182c<C52847n<C47589a, FollowStatus>> f120071c;

    /* renamed from: d */
    public final C47603g f120072d;

    /* renamed from: e */
    private final C47599c f120073e = new C47599c();

    /* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.h$a */
    public static final class C47608a<T> implements C1710e<FollowStatus> {

        /* renamed from: a */
        final /* synthetic */ C47604h f120077a;

        /* renamed from: b */
        final /* synthetic */ C47589a f120078b;

        public C47608a(C47604h hVar, C47589a aVar) {
            this.f120077a = hVar;
            this.f120078b = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.f120077a.f120071c.onNext(new C52847n(this.f120078b, (FollowStatus) obj));
        }
    }

    public C47604h(C47603g gVar) {
        C52711k.m112240b(gVar, "userCache");
        this.f120072d = gVar;
        C2182c<C52847n<C47589a, FollowStatus>> l = C2182c.m6538l();
        C52711k.m112236a((Object) l, "ReplaySubject.create<Pai…stParam, FollowStatus>>()");
        this.f120071c = l;
        mo22478a(C11571b.m23675a((C11587b<K, V, REQ, RESP>) this.f120069a), C11571b.m23673a((C11536c<K, V>) this.f120072d), C11686b.m24026a(C11682a.f31134a, (C52682m) null, (C52686q) C476051.f120074a, 1, (Object) null));
        mo22478a(C11571b.m23675a((C11587b<K, V, REQ, RESP>) this.f120070b), C11571b.m23673a((C11536c<K, V>) this.f120072d), C11686b.m24026a(C11682a.f31134a, (C52682m) null, (C52686q) C476062.f120075a, 1, (Object) null));
        mo22478a(C11571b.m23675a((C11587b<K, V, REQ, RESP>) this.f120073e), C11571b.m23673a((C11536c<K, V>) this.f120072d), C11686b.m24026a(C11682a.f31134a, (C52682m) null, (C52686q) C476073.f120076a, 1, (Object) null));
    }
}
