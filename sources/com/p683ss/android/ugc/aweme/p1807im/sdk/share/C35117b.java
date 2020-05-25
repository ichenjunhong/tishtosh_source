package com.p683ss.android.ugc.aweme.p1807im.sdk.share;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11202k;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33242d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34278c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34008d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.model.C35129b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.p1887a.C35106c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b */
public final class C35117b {

    /* renamed from: b */
    public static final C35118a f90314b = new C35118a(null);

    /* renamed from: a */
    public boolean f90315a;

    /* renamed from: c */
    private int f90316c;

    /* renamed from: d */
    private final C35129b f90317d;

    /* renamed from: e */
    private final C35099a f90318e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b$a */
    public static final class C35118a {
        private C35118a() {
        }

        public /* synthetic */ C35118a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b$b */
    public static final class C35119b extends C52712l implements C52671b<C11180b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35117b f90319a;

        /* renamed from: b */
        final /* synthetic */ String f90320b;

        /* renamed from: c */
        final /* synthetic */ SharePackage f90321c;

        /* renamed from: d */
        final /* synthetic */ BaseContent f90322d;

        /* renamed from: e */
        final /* synthetic */ C52671b f90323e;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b$b$a */
        static final class C35120a implements C33242d {

            /* renamed from: a */
            final /* synthetic */ C11180b f90324a;

            /* renamed from: b */
            final /* synthetic */ C35119b f90325b;

            C35120a(C11180b bVar, C35119b bVar2) {
                this.f90324a = bVar;
                this.f90325b = bVar2;
            }

            public final void sendMsg() {
                String uuid = UUID.randomUUID().toString();
                C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
                C35106c.m79332a(C52575l.m112092a(C34008d.m77742a(this.f90324a)), this.f90325b.f90320b, this.f90325b.f90321c, this.f90325b.f90322d, uuid);
                this.f90325b.f90323e.invoke(Boolean.valueOf(true));
            }
        }

        public C35119b(C35117b bVar, String str, SharePackage sharePackage, BaseContent baseContent, C52671b bVar2) {
            this.f90319a = bVar;
            this.f90320b = str;
            this.f90321c = sharePackage;
            this.f90322d = baseContent;
            this.f90323e = bVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11180b bVar = (C11180b) obj;
            if (bVar != null) {
                new C33220b(C11010c.m22280a(), new C35120a(bVar, this)).sendMsg();
            } else {
                this.f90323e.invoke(Boolean.valueOf(false));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.b$c */
    static final class C35121c extends C52712l implements C52682m<C11180b, C11202k, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35117b f90326a;

        /* renamed from: b */
        final /* synthetic */ C52671b f90327b;

        C35121c(C35117b bVar, C52671b bVar2) {
            this.f90326a = bVar;
            this.f90327b = bVar2;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
            if (r6 == null) goto L_0x004f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if (r5 == null) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                com.bytedance.im.core.c.b r5 = (com.bytedance.p702im.core.p706c.C11180b) r5
                com.bytedance.im.core.c.k r6 = (com.bytedance.p702im.core.p706c.C11202k) r6
                if (r5 == 0) goto L_0x0020
                java.lang.String r0 = r5.getConversationId()
                java.lang.String r1 = "success"
                java.lang.String r2 = "share"
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79510f(r0, r1, r2)
                com.ss.android.ugc.aweme.im.sdk.utils.t r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t.m79782a()
                java.lang.String r1 = "IMSPUtils.get()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                r1 = 2
                r0.mo73428i(r1)
                if (r5 != 0) goto L_0x0069
            L_0x0020:
                r0 = 0
                if (r6 == 0) goto L_0x0026
                java.lang.String r6 = r6.f30207e
                goto L_0x0027
            L_0x0026:
                r6 = r0
            L_0x0027:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.model.d> r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d.class
                java.lang.Object r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79760a(r6, r1)
                com.ss.android.ugc.aweme.im.sdk.group.model.d r6 = (com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d) r6
                r1 = 2132545332(0x7f1c0f34, float:2.074385E38)
                if (r6 == 0) goto L_0x004f
                android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                java.lang.String r3 = r6.getStatusMsg()
                if (r3 != 0) goto L_0x0046
                android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                java.lang.String r3 = r3.getString(r1)
            L_0x0046:
                com.bytedance.ies.dmt.ui.d.a r2 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21537a(r2, r3)
                r2.mo19066a()
                if (r6 != 0) goto L_0x0062
            L_0x004f:
                android.content.Context r6 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
                java.lang.String r1 = r2.getString(r1)
                com.bytedance.ies.dmt.ui.d.a r6 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21537a(r6, r1)
                r6.mo19066a()
            L_0x0062:
                java.lang.String r6 = "failure"
                java.lang.String r1 = "share"
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79510f(r0, r6, r1)
            L_0x0069:
                d.f.a.b r6 = r4.f90327b
                r6.invoke(r5)
                d.x r5 = p2628d.C52860x.f131107a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35117b.C35121c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    private static boolean m79350a(IMContact iMContact) {
        int i = C11170a.f30116b;
        if (!(iMContact instanceof IMConversation)) {
            iMContact = null;
        }
        IMConversation iMConversation = (IMConversation) iMContact;
        if (iMConversation == null || i != iMConversation.getConversationType()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m79352b(IMContact iMContact) {
        if (!(iMContact instanceof IMUser)) {
            iMContact = null;
        }
        IMUser iMUser = (IMUser) iMContact;
        if (iMUser == null || iMUser.getFollowStatus() != 2) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo73233a(java.util.Set<com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact> r10) {
        /*
            r9 = this;
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r3 = 0
            r4 = 2
            if (r0 != 0) goto L_0x00b5
            int r0 = r10.size()
            if (r0 <= r1) goto L_0x00b5
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L_0x002b
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0043
        L_0x002b:
            java.util.Iterator r5 = r0.iterator()
        L_0x002f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0043
            java.lang.Object r6 = r5.next()
            com.ss.android.ugc.aweme.im.service.model.IMContact r6 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r6
            boolean r6 = m79350a(r6)
            if (r6 == 0) goto L_0x002f
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = 0
        L_0x0044:
            if (r5 == 0) goto L_0x0047
            goto L_0x00b5
        L_0x0047:
            int r10 = r10.size()
            r5 = 10
            if (r10 <= r5) goto L_0x0058
            boolean r10 = r9.f90315a
            if (r10 == 0) goto L_0x0054
            return r2
        L_0x0054:
            r9.m79351a(r2, false)
            return r1
        L_0x0058:
            com.ss.android.ugc.aweme.im.sdk.share.model.b r10 = r9.f90317d
            android.view.ViewGroup r10 = r10.f90342a
            r10.setVisibility(r2)
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.util.Set r10 = (java.util.Set) r10
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.Set r5 = (java.util.Set) r5
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.Set r6 = (java.util.Set) r6
            java.util.Iterator r0 = r0.iterator()
        L_0x0078:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x009c
            java.lang.Object r7 = r0.next()
            com.ss.android.ugc.aweme.im.service.model.IMContact r7 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r7
            boolean r8 = m79350a(r7)
            if (r8 == 0) goto L_0x008e
            r10.add(r7)
            goto L_0x0078
        L_0x008e:
            boolean r8 = m79352b(r7)
            if (r8 == 0) goto L_0x0098
            r5.add(r7)
            goto L_0x0078
        L_0x0098:
            r6.add(r7)
            goto L_0x0078
        L_0x009c:
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r1
            if (r10 != 0) goto L_0x00ae
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r10 = r6.isEmpty()
            r10 = r10 ^ r1
            if (r10 == 0) goto L_0x00b2
        L_0x00ae:
            r9.m79351a(r2, false)
            r2 = 2
        L_0x00b2:
            r9.f90316c = r2
            return r1
        L_0x00b5:
            com.ss.android.ugc.aweme.im.sdk.share.model.b r10 = r9.f90317d
            android.view.ViewGroup r10 = r10.f90342a
            r0 = 4
            r10.setVisibility(r0)
            r9.m79351a(r2, false)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35117b.mo73233a(java.util.Set):boolean");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r7 == false) goto L_0x003c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m79351a(boolean r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            if (r7 != 0) goto L_0x003c
            boolean r7 = r5.f90315a
            r1 = 0
            if (r7 == r6) goto L_0x003b
            if (r6 == 0) goto L_0x003c
            android.content.Context r7 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            int r2 = r5.f90316c
            switch(r2) {
                case 1: goto L_0x0020;
                case 2: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            r7 = 0
            goto L_0x0039
        L_0x0015:
            r2 = 2132542807(0x7f1c0557, float:2.073873E38)
            com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r7, r2)
            r7.mo19066a()
            goto L_0x0038
        L_0x0020:
            r2 = 2132545597(0x7f1c103d, float:2.0744388E38)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r4 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            java.lang.String r2 = r7.getString(r2, r3)
            com.bytedance.ies.dmt.ui.d.a r7 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r7, r2)
            r7.mo19066a()
        L_0x0038:
            r7 = 1
        L_0x0039:
            if (r7 == 0) goto L_0x003c
        L_0x003b:
            return r1
        L_0x003c:
            r5.f90315a = r6
            com.ss.android.ugc.aweme.im.sdk.share.model.b r7 = r5.f90317d
            android.widget.ImageView r7 = r7.f90343b
            if (r6 == 0) goto L_0x0048
            r1 = 2131954190(0x7f130a0e, float:1.9544872E38)
            goto L_0x0055
        L_0x0048:
            com.ss.android.ugc.aweme.im.sdk.share.model.b r1 = r5.f90317d
            boolean r1 = r1.f90344c
            if (r1 == 0) goto L_0x0052
            r1 = 2131954192(0x7f130a10, float:1.9544876E38)
            goto L_0x0055
        L_0x0052:
            r1 = 2131954191(0x7f130a0f, float:1.9544874E38)
        L_0x0055:
            r7.setImageResource(r1)
            com.ss.android.ugc.aweme.im.sdk.share.a r7 = r5.f90318e
            r7.mo72952a(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.share.C35117b.m79351a(boolean, boolean):boolean");
    }

    /* renamed from: a */
    public final void mo73232a(List<IMContact> list, C52671b<? super C11180b, C52860x> bVar) {
        C52711k.m112240b(list, "list");
        C52711k.m112240b(bVar, "callback");
        Iterable<IMContact> iterable = list;
        Collection arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((IMContact) next) instanceof IMUser)) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        List list2 = (List) arrayList;
        if (!(!list2.isEmpty())) {
            list2 = null;
        }
        if (list2 != null) {
            C32458a.m75144a("ShareCreateGroupDelegate list contain group");
            bVar.invoke(null);
            return;
        }
        C35190af.m79530l("share");
        C34237d a = C34238a.m78110a();
        Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
        for (IMContact iMContact : iterable) {
            if (iMContact != null) {
                arrayList2.add((IMUser) iMContact);
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
            }
        }
        a.mo72230a((List) arrayList2, (Map<String, String>) C34278c.m78179a(6, 0), true, (C52682m<? super C11180b, ? super C11202k, C52860x>) new C35121c<Object,Object,C52860x>(this, bVar));
    }
}
