package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core;

import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33453a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34213a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34920d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34922e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34936h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34936h.C34938b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1882c.C34951e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1884e.C34958a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1885f.C34966b.C34967a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a */
public abstract class C34871a implements C34920d<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f89828a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34871a.class), "data", "getData()Ljava/util/List;"))};

    /* renamed from: b */
    public final C34958a f89829b;

    /* renamed from: c */
    private C34920d<IMContact> f89830c;

    /* renamed from: d */
    private final C52668f f89831d = C52732g.m112285a(C34872a.f89833a);

    /* renamed from: e */
    private final C34936h f89832e = ((C34936h) C34938b.m79076a().mo73043a((C52671b<? super T, Boolean>) new C34873b<Object,Boolean>(this)).mo73044b(new C34874c(this)).mo73045c(new C34875d(this)).mo73023b());

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a$a */
    static final class C34872a extends C52712l implements C52670a<List<IMContact>> {

        /* renamed from: a */
        public static final C34872a f89833a = new C34872a();

        C34872a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a$b */
    static final class C34873b extends C52712l implements C52671b<C11180b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C34871a f89834a;

        C34873b(C34871a aVar) {
            this.f89834a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11180b bVar = (C11180b) obj;
            C52711k.m112240b(bVar, "it");
            C34958a aVar = this.f89834a.f89829b;
            C52711k.m112240b(aVar, "parameters");
            C34951e eVar = new C34951e(aVar);
            C52711k.m112240b(bVar, "obj");
            C11207p lastMessage = bVar.getLastMessage();
            boolean z = false;
            if (lastMessage != null && ((C33229c.f86227e.mo70569b() == 0 || !eVar.f89953a.mo73059b() || lastMessage.getMsgType() != 15) && ((!bVar.isGroupChat() || !C34213a.m78051a(bVar)) && !C33453a.m76677a(bVar)))) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a$c */
    static final class C34874c extends C52712l implements C52671b<List<? extends C11180b>, List<? extends C11180b>> {

        /* renamed from: a */
        final /* synthetic */ C34871a f89835a;

        C34874c(C34871a aVar) {
            this.f89835a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            C52711k.m112240b(list, "it");
            return C34967a.m79100a(this.f89835a.f89829b).mo73062a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a$d */
    static final class C34875d extends C52712l implements C52671b<IMContact, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C34871a f89836a;

        C34875d(C34871a aVar) {
            this.f89836a = aVar;
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
            if (r0 != 2) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0075, code lost:
            if (r7.isBlock() != false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
            if (r7.getShareStatus() == 2) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
            if (r7 == false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x005f, code lost:
            if (r0 != 2) goto L_0x009f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r7) {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.im.service.model.IMContact r7 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r7
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                com.ss.android.ugc.aweme.im.sdk.relations.core.a r0 = r6.f89836a
                com.ss.android.ugc.aweme.im.sdk.relations.core.e.a r0 = r0.f89829b
                java.lang.String r1 = "parameters"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r1)
                com.ss.android.ugc.aweme.im.sdk.relations.core.c.d r1 = new com.ss.android.ugc.aweme.im.sdk.relations.core.c.d
                r1.<init>(r0)
                java.lang.String r0 = "obj"
                p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
                boolean r0 = r7 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser
                if (r0 == 0) goto L_0x0042
                java.lang.String r2 = "RecentContactFilter"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r4 = r7
                com.ss.android.ugc.aweme.im.service.model.IMUser r4 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser) r4
                java.lang.String r5 = r4.getUid()
                r3.append(r5)
                java.lang.String r5 = " shareStatus:"
                r3.append(r5)
                int r4 = r4.getShareStatus()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75150b(r2, r3)
            L_0x0042:
                com.ss.android.ugc.aweme.im.sdk.relations.core.c.b r2 = r1.f89958b
                boolean r2 = r2.mo73053a(r7)
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x009f
                if (r0 == 0) goto L_0x0085
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser) r7
                int r0 = r7.getFollowStatus()
                com.ss.android.ugc.aweme.im.sdk.abtest.c r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c.f86227e
                int r2 = r2.mo70569b()
                r5 = 2
                if (r2 == 0) goto L_0x0062
                if (r0 == r3) goto L_0x0062
                if (r0 == r5) goto L_0x0062
                goto L_0x009f
            L_0x0062:
                com.ss.android.ugc.aweme.im.sdk.relations.core.e.a r2 = r1.f89953a
                boolean r2 = r2.f89970f
                if (r2 == 0) goto L_0x006b
                if (r0 == r5) goto L_0x006b
                goto L_0x009f
            L_0x006b:
                com.ss.android.ugc.aweme.im.sdk.relations.core.e.a r0 = r1.f89953a
                boolean r0 = r0.f89966b
                if (r0 == 0) goto L_0x0078
                boolean r0 = r7.isBlock()
                if (r0 == 0) goto L_0x0078
                goto L_0x009f
            L_0x0078:
                com.ss.android.ugc.aweme.im.sdk.relations.core.e.a r0 = r1.f89953a
                boolean r0 = r0.f89967c
                if (r0 == 0) goto L_0x009e
                int r7 = r7.getShareStatus()
                if (r7 != r5) goto L_0x009e
                goto L_0x009f
            L_0x0085:
                boolean r0 = r7 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation
                if (r0 == 0) goto L_0x009f
                com.ss.android.ugc.aweme.im.service.model.IMConversation r7 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation) r7
                com.ss.android.ugc.aweme.im.sdk.relations.core.e.a r7 = r1.f89953a
                boolean r7 = r7.f89970f
                if (r7 == 0) goto L_0x009e
                com.ss.android.ugc.aweme.im.sdk.relations.core.e.a r7 = r1.f89953a
                int r7 = r7.f89969e
                r0 = 3
                if (r7 != r0) goto L_0x009a
                r7 = 1
                goto L_0x009b
            L_0x009a:
                r7 = 0
            L_0x009b:
                if (r7 != 0) goto L_0x009e
                goto L_0x009f
            L_0x009e:
                r4 = 1
            L_0x009f:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34871a.C34875d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a$e */
    static final class C34876e extends C52712l implements C52682m<List<IMContact>, Boolean, C52860x> {

        /* renamed from: a */
        public static final C34876e f89837a = new C34876e();

        C34876e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            ((Boolean) obj2).booleanValue();
            C52711k.m112240b(list, "<anonymous parameter 0>");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a$f */
    static final class C34877f extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        public static final C34877f f89838a = new C34877f();

        C34877f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((Throwable) obj, "<anonymous parameter 0>");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.core.a$g */
    public static final class C34878g implements C34920d<IMContact> {

        /* renamed from: a */
        final /* synthetic */ C52682m f89839a;

        /* renamed from: b */
        final /* synthetic */ C52671b f89840b;

        /* renamed from: c */
        final /* synthetic */ C52682m f89841c;

        /* renamed from: d */
        final /* synthetic */ C52671b f89842d;

        /* renamed from: a */
        public final void mo72983a(Throwable th) {
            C52711k.m112240b(th, "t");
            this.f89840b.invoke(th);
        }

        /* renamed from: b */
        public final void mo72986b(Throwable th) {
            C52711k.m112240b(th, "t");
            this.f89842d.invoke(th);
        }

        /* renamed from: a */
        public final void mo72984a(List<IMContact> list, boolean z) {
            C52711k.m112240b(list, "list");
            this.f89839a.invoke(list, Boolean.valueOf(z));
        }

        /* renamed from: b */
        public final void mo72987b(List<IMContact> list, boolean z) {
            C52711k.m112240b(list, "list");
            this.f89841c.invoke(list, Boolean.valueOf(z));
        }

        C34878g(C52682m mVar, C52671b bVar, C52682m mVar2, C52671b bVar2) {
            this.f89839a = mVar;
            this.f89840b = bVar;
            this.f89841c = mVar2;
            this.f89842d = bVar2;
        }
    }

    /* renamed from: h */
    private final List<IMContact> mo73110h() {
        return (List) this.f89831d.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C34936h mo72982a() {
        return this.f89832e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C34922e<IMContact> mo72985b();

    /* renamed from: c */
    public final C34871a mo72988c() {
        C34871a aVar = this;
        aVar.f89830c = null;
        return aVar;
    }

    /* renamed from: i */
    private boolean mo73111i() {
        return mo72985b().mo73027d();
    }

    /* renamed from: d */
    public final List<IMContact> mo72989d() {
        return C52575l.m112139e((Collection<? extends T>) mo73110h());
    }

    /* renamed from: e */
    public final boolean mo72990e() {
        return mo72985b().mo73028e();
    }

    /* renamed from: f */
    public C52860x mo72991f() {
        C34871a aVar;
        if (!mo73111i()) {
            aVar = this;
        } else {
            aVar = null;
        }
        C34871a aVar2 = aVar;
        if (aVar2 != null) {
            C34922e b = aVar2.mo72985b();
            if (b != null) {
                b.bp_();
                return C52860x.f131107a;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C52860x mo72992g() {
        boolean z;
        C34871a aVar;
        if (mo73111i() || !mo72990e()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            aVar = this;
        } else {
            aVar = null;
        }
        C34871a aVar2 = aVar;
        if (aVar2 != null) {
            C34922e b = aVar2.mo72985b();
            if (b != null) {
                b.bq_();
                return C52860x.f131107a;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo72986b(Throwable th) {
        C52711k.m112240b(th, "t");
        C32458a.m75148a(th);
        C34920d<IMContact> dVar = this.f89830c;
        if (dVar != null) {
            dVar.mo72986b(th);
        }
    }

    /* renamed from: a */
    protected static List<String> m78959a(List<? extends IMContact> list) {
        C52711k.m112240b(list, "$this$toUidList");
        List<String> arrayList = new ArrayList<>();
        for (IMContact a : list) {
            IMUser a2 = C34010e.m77749a(a);
            if (a2 != null) {
                String uid = a2.getUid();
                C52711k.m112236a((Object) uid, "it.uid");
                arrayList.add(uid);
            }
        }
        return arrayList;
    }

    public C34871a(C34958a aVar) {
        C52711k.m112240b(aVar, "parameters");
        this.f89829b = aVar;
    }

    /* renamed from: a */
    public final C34871a mo72981a(C34920d<IMContact> dVar) {
        C52711k.m112240b(dVar, "subscriber");
        C34871a aVar = this;
        aVar.f89830c = dVar;
        return aVar;
    }

    /* renamed from: a */
    public final void mo72983a(Throwable th) {
        C52711k.m112240b(th, "t");
        C32458a.m75148a(th);
        C34920d<IMContact> dVar = this.f89830c;
        if (dVar != null) {
            dVar.mo72983a(th);
        }
    }

    /* renamed from: b */
    public final void mo72987b(List<IMContact> list, boolean z) {
        C52711k.m112240b(list, "list");
        mo73110h().addAll(list);
        C34920d<IMContact> dVar = this.f89830c;
        if (dVar != null) {
            dVar.mo72987b(list, z);
        }
    }

    /* renamed from: a */
    public void mo72984a(List<IMContact> list, boolean z) {
        C52711k.m112240b(list, "list");
        mo73110h().clear();
        mo73110h().addAll(list);
        C34920d<IMContact> dVar = this.f89830c;
        if (dVar != null) {
            dVar.mo72984a(list, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C34871a m78958a(C52682m<? super List<IMContact>, ? super Boolean, C52860x> mVar, C52671b<? super Throwable, C52860x> bVar, C52682m<? super List<IMContact>, ? super Boolean, C52860x> mVar2, C52671b<? super Throwable, C52860x> bVar2) {
        C52711k.m112240b(mVar, "onLoadSuccess");
        C52711k.m112240b(bVar, "onLoadError");
        C52711k.m112240b(mVar2, "onLoadMoreSuccess");
        C52711k.m112240b(bVar2, "onLoadMoreError");
        return mo72981a((C34920d<IMContact>) new C34878g<IMContact>(mVar, bVar, mVar2, bVar2));
    }
}
