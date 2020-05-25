package com.p683ss.android.ugc.aweme.p1807im.sdk.group;

import com.bytedance.p702im.core.p703a.C11169d.C11170a;
import com.bytedance.p702im.core.p703a.p704a.C11161a;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p703a.p704a.C11163c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11181c;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11197f;
import com.bytedance.p702im.core.p706c.C11200i;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11206o;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11207p.C11209a;
import com.bytedance.p702im.core.proto.GroupRole;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupInviteContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.GroupNoticeContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34277b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34280e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.model.C34554k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34043n;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.d */
public final class C34237d {

    /* renamed from: b */
    public static final C52668f f88430b = C52732g.m112285a(C34239b.f88436a);

    /* renamed from: c */
    public static final C34238a f88431c = new C34238a(null);

    /* renamed from: a */
    public final ConcurrentHashMap<String, List<C33367a>> f88432a;

    /* renamed from: d */
    private final ConcurrentHashMap<String, C11180b> f88433d;

    /* renamed from: e */
    private final ConcurrentHashMap<String, C11190e> f88434e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.d$a */
    public static final class C34238a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f88435a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34238a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/im/sdk/group/GroupManager;"))};

        private C34238a() {
        }

        /* renamed from: a */
        public static C34237d m78110a() {
            return (C34237d) C34237d.f88430b.getValue();
        }

        public /* synthetic */ C34238a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.d$b */
    static final class C34239b extends C52712l implements C52670a<C34237d> {

        /* renamed from: a */
        public static final C34239b f88436a = new C34239b();

        C34239b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C34237d(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.d$c */
    public static final class C34240c implements C11163c<List<? extends C11206o>> {

        /* renamed from: a */
        final /* synthetic */ C34237d f88437a;

        /* renamed from: b */
        final /* synthetic */ String f88438b;

        /* renamed from: c */
        final /* synthetic */ C11163c f88439c;

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            C11163c cVar = this.f88439c;
            if (cVar != null) {
                cVar.mo20508a(kVar);
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo20506a(Object obj) {
            List list = (List) obj;
            this.f88437a.mo72226a(this.f88438b, list);
            C11163c cVar = this.f88439c;
            if (cVar != null) {
                cVar.mo20506a(list);
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo20509a(Object obj, C11202k kVar) {
            List list = (List) obj;
            this.f88437a.mo72226a(this.f88438b, list);
            C11163c cVar = this.f88439c;
            if (cVar != null) {
                cVar.mo20509a(list, kVar);
            }
        }

        C34240c(C34237d dVar, String str, C11163c cVar) {
            this.f88437a = dVar;
            this.f88438b = str;
            this.f88439c = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.d$d */
    public static final class C34241d implements C11163c<List<? extends C11206o>> {

        /* renamed from: a */
        final /* synthetic */ C34237d f88440a;

        /* renamed from: b */
        final /* synthetic */ String f88441b;

        /* renamed from: c */
        final /* synthetic */ C11163c f88442c;

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            C11163c cVar = this.f88442c;
            if (cVar != null) {
                cVar.mo20508a(kVar);
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo20506a(Object obj) {
            List list = (List) obj;
            this.f88440a.mo72226a(this.f88441b, list);
            C11163c cVar = this.f88442c;
            if (cVar != null) {
                cVar.mo20506a(list);
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo20509a(Object obj, C11202k kVar) {
            List list = (List) obj;
            this.f88440a.mo72226a(this.f88441b, list);
            C11163c cVar = this.f88442c;
            if (cVar != null) {
                cVar.mo20509a(list, kVar);
            }
        }

        C34241d(C34237d dVar, String str, C11163c cVar) {
            this.f88440a = dVar;
            this.f88441b = str;
            this.f88442c = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.d$e */
    public static final class C34242e implements C11163c<C11180b> {

        /* renamed from: a */
        public volatile boolean f88443a;

        /* renamed from: b */
        final /* synthetic */ C34237d f88444b;

        /* renamed from: c */
        final /* synthetic */ boolean f88445c;

        /* renamed from: d */
        final /* synthetic */ C52682m f88446d;

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            C52682m mVar = this.f88446d;
            if (mVar != null) {
                mVar.invoke(null, kVar);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20506a(Object obj) {
            C11180b bVar = (C11180b) obj;
            C52682m mVar = this.f88446d;
            if (mVar != null) {
                mVar.invoke(bVar, null);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20509a(Object obj, C11202k kVar) {
            String str;
            C11180b bVar = (C11180b) obj;
            String str2 = "GroupManager";
            StringBuilder sb = new StringBuilder("createGroupConversation->onSuccessWithInfo:");
            if (bVar != null) {
                str = bVar.getConversationId();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(",alreadyCallback:");
            sb.append(this.f88443a);
            C32458a.m75141a(4, str2, sb.toString());
            if (!this.f88443a) {
                this.f88443a = true;
                if (this.f88445c) {
                    C34237d.m78086a(bVar);
                    C52682m mVar = this.f88446d;
                    if (mVar != null) {
                        mVar.invoke(bVar, kVar);
                    }
                } else {
                    C52682m mVar2 = this.f88446d;
                    if (mVar2 != null) {
                        mVar2.invoke(bVar, kVar);
                    }
                    C34237d.m78086a(bVar);
                }
            }
        }

        C34242e(C34237d dVar, boolean z, C52682m mVar) {
            this.f88444b = dVar;
            this.f88445c = z;
            this.f88446d = mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.d$f */
    public static final class C34243f implements C11162b<C11206o> {

        /* renamed from: a */
        final /* synthetic */ C52671b f88447a;

        C34243f(C52671b bVar) {
            this.f88447a = bVar;
        }

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            this.f88447a.invoke(Integer.valueOf(GroupRole.ORDINARY.getValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20506a(Object obj) {
            C11206o oVar = (C11206o) obj;
            if (oVar != null) {
                this.f88447a.invoke(Integer.valueOf(oVar.getRole()));
                if (oVar != null) {
                    return;
                }
            }
            this.f88447a.invoke(Integer.valueOf(GroupRole.ORDINARY.getValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.d$g */
    public static final class C34244g extends C11161a<List<C11180b>> {

        /* renamed from: a */
        final /* synthetic */ C52687r f88448a;

        C34244g(C52687r rVar) {
            this.f88448a = rVar;
        }

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            this.f88448a.mo18305a(null, Long.valueOf(-1), Boolean.valueOf(true), kVar);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20507a(Object obj, long j, boolean z) {
            this.f88448a.mo18305a((List) obj, Long.valueOf(j), Boolean.valueOf(z), null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.d$h */
    public static final class C34245h implements C11200i {

        /* renamed from: a */
        final /* synthetic */ C34237d f88449a;

        /* renamed from: b */
        final /* synthetic */ C52727e f88450b;

        /* renamed from: c */
        final /* synthetic */ String f88451c;

        /* renamed from: d */
        final /* synthetic */ C52671b f88452d;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.d$h$a */
        public static final class C34246a implements C11162b<List<? extends C11206o>> {

            /* renamed from: a */
            final /* synthetic */ C34245h f88453a;

            /* renamed from: a */
            public final void mo20508a(C11202k kVar) {
            }

            C34246a(C34245h hVar) {
                this.f88453a = hVar;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo20506a(Object obj) {
                this.f88453a.f88449a.f88432a.put(this.f88453a.f88451c, C34237d.m78084a((List) obj));
            }
        }

        /* renamed from: a */
        public final void mo20662a(C11180b bVar) {
            C52711k.m112240b(bVar, "conversation");
        }

        /* renamed from: c */
        public final void mo20673c(C11180b bVar) {
            C52711k.m112240b(bVar, "conversation");
        }

        /* renamed from: d */
        public final void mo20676d(C11180b bVar) {
            C52711k.m112240b(bVar, "conversation");
        }

        /* renamed from: a */
        public final void mo20665a(List<? extends C11206o> list) {
            C52711k.m112240b(list, "memberList");
            this.f88449a.mo72226a(this.f88451c, list);
        }

        /* renamed from: b */
        public final void mo20670b(List<? extends C11206o> list) {
            C52711k.m112240b(list, "memberList");
            this.f88449a.mo72232b(this.f88451c, list);
        }

        /* renamed from: e */
        public final void mo20679e(C11180b bVar) {
            C52711k.m112240b(bVar, "conversation");
            this.f88449a.f88432a.remove(this.f88451c);
        }

        /* renamed from: b */
        public final void mo20668b(C11180b bVar) {
            C52711k.m112240b(bVar, "conversation");
            ((C11190e) this.f88450b.element).mo20687a((C11162b<List<C11206o>>) new C34246a<List<C11206o>>(this));
        }

        /* renamed from: a */
        public final void mo20664a(String str, List<? extends C11206o> list) {
            C52711k.m112240b(str, "conversationId");
            List a = C34237d.m78084a(list);
            this.f88449a.f88432a.put(str, a);
            C52671b bVar = this.f88452d;
            if (bVar != null) {
                bVar.invoke(a);
            }
            this.f88449a.mo72233b(a);
        }

        C34245h(C34237d dVar, C52727e eVar, String str, C52671b bVar) {
            this.f88449a = dVar;
            this.f88450b = eVar;
            this.f88451c = str;
            this.f88452d = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.d$i */
    public static final class C34247i implements C11162b<C11180b> {
        C34247i() {
        }

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo20506a(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.d$j */
    public static final class C34248j implements C11162b<List<? extends C11206o>> {

        /* renamed from: a */
        final /* synthetic */ C34237d f88454a;

        /* renamed from: b */
        final /* synthetic */ String f88455b;

        /* renamed from: c */
        final /* synthetic */ C11162b f88456c;

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            this.f88456c.mo20508a(kVar);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20506a(Object obj) {
            boolean z;
            List list = (List) obj;
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f88454a.mo72232b(this.f88455b, list);
                this.f88456c.mo20506a(list);
            }
        }

        C34248j(C34237d dVar, String str, C11162b bVar) {
            this.f88454a = dVar;
            this.f88455b = str;
            this.f88456c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.d$k */
    public static final class C34249k extends C34043n {

        /* renamed from: a */
        final /* synthetic */ C34237d f88457a;

        /* renamed from: b */
        final /* synthetic */ List f88458b;

        /* renamed from: a */
        public final void mo71998a(C34554k kVar) {
            boolean z;
            C52711k.m112240b(kVar, "userInfo");
            Collection collection = this.f88458b;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f88457a.mo72229a(this.f88458b, kVar.f89082b);
            }
        }

        C34249k(C34237d dVar, List list) {
            this.f88457a = dVar;
            this.f88458b = list;
        }
    }

    /* renamed from: a */
    public final void mo72230a(List<? extends IMUser> list, Map<String, String> map, boolean z, C52682m<? super C11180b, ? super C11202k, C52860x> mVar) {
        C52711k.m112240b(list, "userList");
        C52711k.m112240b(map, "map");
        C11182d a = C11182d.m22641a();
        Iterable<IMUser> iterable = list;
        Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
        for (IMUser uid : iterable) {
            String uid2 = uid.getUid();
            C52711k.m112236a((Object) uid2, "it.uid");
            arrayList.add(Long.valueOf(Long.parseLong(uid2)));
        }
        a.mo20660a(0, (List) arrayList, map, (C11162b<C11180b>) new C34242e<C11180b>(this, z, mVar));
    }

    /* renamed from: a */
    public final List<C33367a> mo72224a(String str, C52671b<? super List<C33367a>, C52860x> bVar) {
        C52711k.m112240b(str, "conversationId");
        List<C33367a> list = (List) this.f88432a.get(str);
        if (list == null) {
            C52727e eVar = new C52727e();
            eVar.element = (C11190e) this.f88434e.get(str);
            if (((C11190e) eVar.element) == null) {
                eVar.element = new C11190e(str);
                this.f88434e.put(str, (C11190e) eVar.element);
                ((C11190e) eVar.element).mo20688a((C11200i) new C34245h(this, eVar, str, bVar));
                ((C11190e) eVar.element).mo20700c();
            }
        } else {
            mo72233b(list);
            if (bVar != null) {
                bVar.invoke(list);
            }
        }
        return list;
    }

    /* renamed from: a */
    public final void mo72229a(List<C33367a> list, int i) {
        C34010e.m77748a().mo71963a((Map<String, String>) m78091c(m78089b(list, i)), (C34043n) new C34249k(this, list));
    }

    /* renamed from: a */
    public final void mo72228a(String str, List<? extends IMUser> list, Map<String, String> map, C11163c<List<C11206o>> cVar) {
        C52711k.m112240b(list, "addMemberList");
        C52711k.m112240b(map, "map");
        if (str != null) {
            new C11190e(str).mo20691a((List<Long>) m78093d(list), map, (C11162b<List<C11206o>>) new C34240c<List<C11206o>>(this, str, cVar));
        }
    }

    /* renamed from: a */
    public final void mo72225a(String str, String str2, List<? extends IMUser> list, Map<String, String> map, C11163c<List<C11206o>> cVar) {
        C52711k.m112240b(list, "addMemberList");
        C52711k.m112240b(map, "map");
        CharSequence charSequence = str;
        boolean z = false;
        if (!(charSequence == null || charSequence.length() == 0)) {
            CharSequence charSequence2 = str2;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            }
            if (!z) {
                new C11190e(str).mo20686a(Long.parseLong(str2), m78093d(list), map, new C34241d(this, str, cVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo72226a(String str, List<? extends C11206o> list) {
        CharSequence charSequence = str;
        boolean z = true;
        if (!(charSequence == null || charSequence.length() == 0)) {
            Collection collection = list;
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (!z) {
                List arrayList = new ArrayList();
                List b = mo72231b(str);
                if (b != null) {
                    Iterable iterable = b;
                    Collection arrayList2 = new ArrayList();
                    for (Object next : iterable) {
                        if (C52575l.m112125a((Iterable<? extends T>) list, ((C33367a) next).getMember())) {
                            arrayList2.add(next);
                        }
                    }
                    for (C33367a member : (List) arrayList2) {
                        arrayList.add(member.getMember());
                    }
                }
                List b2 = mo72231b(str);
                if (!(b2 instanceof ArrayList)) {
                    b2 = null;
                }
                ArrayList arrayList3 = (ArrayList) b2;
                if (arrayList3 != null) {
                    for (C11206o oVar : list) {
                        if (!arrayList.contains(oVar)) {
                            C33367a aVar = new C33367a();
                            aVar.setUser(C34010e.m77748a().mo71956a(String.valueOf(oVar.getUid()), false));
                            aVar.setMember(oVar);
                            arrayList3.add(aVar);
                        }
                    }
                    this.f88432a.put(str, arrayList3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo72227a(String str, List<? extends IMUser> list, C11162b<List<C11206o>> bVar) {
        C52711k.m112240b(list, "removeMemberList");
        C52711k.m112240b(bVar, "removeCallback");
        if (str != null) {
            new C11190e(str).mo20698b(m78093d(list), null, new C34248j(this, str, bVar));
        }
    }

    private C34237d() {
        this.f88432a = new ConcurrentHashMap<>();
        this.f88433d = new ConcurrentHashMap<>();
        this.f88434e = new ConcurrentHashMap<>();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x001f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.bytedance.p702im.core.p706c.C11180b> m78083a() {
        /*
            com.bytedance.im.core.c.d r0 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
            java.lang.String r1 = "ConversationListModel.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.util.List r0 = r0.mo20672c()
            java.lang.String r1 = "ConversationListModel.inst().groupConversationSync"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005b
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.bytedance.im.core.c.b r3 = (com.bytedance.p702im.core.p706c.C11180b) r3
            java.lang.String r4 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            boolean r4 = r3.isMember()
            if (r4 == 0) goto L_0x0054
            com.bytedance.im.core.c.o r4 = r3.getMember()
            if (r4 == 0) goto L_0x0054
            com.bytedance.im.core.c.o r3 = r3.getMember()
            java.lang.String r4 = "it.member"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            int r3 = r3.getRole()
            com.bytedance.im.core.proto.GroupRole r4 = com.bytedance.p702im.core.proto.GroupRole.OWNER
            int r4 = r4.getValue()
            if (r3 != r4) goto L_0x0054
            r3 = 1
            goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            if (r3 == 0) goto L_0x001f
            r1.add(r2)
            goto L_0x001f
        L_0x005b:
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.m78083a():java.util.List");
    }

    public /* synthetic */ C34237d(C52707g gVar) {
        this();
    }

    /* renamed from: b */
    public final List<C33367a> mo72231b(String str) {
        C52711k.m112240b(str, "conversationId");
        return mo72224a(str, null);
    }

    /* renamed from: b */
    public static void m78090b(C11180b bVar) {
        C52711k.m112240b(bVar, "conversation");
        GroupNoticeContent groupNoticeContent = new GroupNoticeContent();
        groupNoticeContent.setType(100121);
        C11207p a = new C11209a().mo20825a(bVar).mo20826a(C35277o.m79761a(groupNoticeContent)).mo20824a(1001).mo20827a();
        C52711k.m112236a((Object) a, "it");
        a.setMsgStatus(5);
        C35197am.m79561b(a);
    }

    /* renamed from: c */
    private static HashMap<String, String> m78091c(List<C33367a> list) {
        Object obj;
        HashMap<String, String> hashMap = new HashMap<>();
        if (list != null) {
            for (C33367a aVar : list) {
                C11206o member = aVar.getMember();
                String str = null;
                if (member != null) {
                    obj = Long.valueOf(member.getUid());
                } else {
                    obj = null;
                }
                String valueOf = String.valueOf(obj);
                C11206o member2 = aVar.getMember();
                if (member2 != null) {
                    str = member2.getSecUid();
                }
                String valueOf2 = String.valueOf(str);
                if (!(valueOf == null || valueOf2 == null)) {
                    hashMap.put(valueOf, valueOf2);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    private static ArrayList<Long> m78093d(List<? extends IMUser> list) {
        boolean z;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new ArrayList<>();
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        for (IMUser uid : list) {
            String uid2 = uid.getUid();
            C52711k.m112236a((Object) uid2, "user.uid");
            arrayList.add(Long.valueOf(Long.parseLong(uid2)));
        }
        return arrayList;
    }

    /* renamed from: e */
    private static C34277b m78095e(C11180b bVar) {
        boolean z;
        C52711k.m112240b(bVar, "conversation");
        C11181c coreInfo = bVar.getCoreInfo();
        if (coreInfo != null) {
            CharSequence notice = coreInfo.getNotice();
            if (notice == null || notice.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                coreInfo = null;
            }
            if (coreInfo != null) {
                String str = (String) coreInfo.getExt().get("a:s_notice");
                if (str != null) {
                    try {
                        return (C34277b) C35277o.m79760a(str, C34277b.class);
                    } catch (Throwable th) {
                        C32458a.m75148a(th);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<C33367a> m78084a(List<? extends C11206o> list) {
        List<C33367a> arrayList = new ArrayList<>();
        if (list != null) {
            for (C11206o oVar : list) {
                C33367a aVar = new C33367a();
                aVar.setUser(C34010e.m77748a().mo71956a(String.valueOf(oVar.getUid()), false));
                aVar.setMember(oVar);
                if (oVar.getRole() == GroupRole.OWNER.getValue()) {
                    arrayList.add(0, aVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m78094d(com.bytedance.p702im.core.p706c.C11180b r4) {
        /*
            java.lang.String r0 = "conversation"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a()
            com.ss.android.ugc.aweme.im.sdk.group.model.b r0 = m78095e(r4)
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            com.bytedance.im.core.c.f r1 = r4.getSettingInfo()
            if (r1 == 0) goto L_0x0020
            java.util.Map r1 = r1.getExt()
            if (r1 == 0) goto L_0x0020
            java.util.Map r1 = p2628d.p2629a.C52550ab.m112058c(r1)
            goto L_0x0027
        L_0x0020:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
        L_0x0027:
            long r2 = r0.getUpdateTime()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = r0
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "a:s_last_read_group_notice_time"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x007a
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            java.lang.String r0 = "a:s_last_read_group_notice_time"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.put(r0, r2)
            com.bytedance.im.core.c.f r0 = r4.getSettingInfo()
            if (r0 == 0) goto L_0x0066
            r0.setExt(r1)
        L_0x0066:
            com.bytedance.im.core.c.e r0 = new com.bytedance.im.core.c.e
            java.lang.String r4 = r4.getConversationId()
            r0.<init>(r4)
            com.ss.android.ugc.aweme.im.sdk.group.d$i r4 = new com.ss.android.ugc.aweme.im.sdk.group.d$i
            r4.<init>()
            com.bytedance.im.core.a.a.b r4 = (com.bytedance.p702im.core.p703a.p704a.C11162b) r4
            r0.mo20692a(r1, r4)
            return
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.m78094d(com.bytedance.im.core.c.b):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m78086a(com.bytedance.p702im.core.p706c.C11180b r6) {
        /*
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r6.isMember()
            r1 = 1
            if (r0 == 0) goto L_0x001e
            com.bytedance.im.core.c.o r0 = r6.getMember()
            if (r0 == 0) goto L_0x001e
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r2 = com.bytedance.p702im.core.proto.GroupRole.OWNER
            int r2 = r2.getValue()
            if (r0 != r2) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            r2 = 4
            if (r0 == 0) goto L_0x006b
            java.lang.String r0 = r6.getConversationId()
            java.lang.String r3 = "GroupChatPanel"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "addGroupInvitePasswordForOwner:"
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r2, r3, r4)
            com.bytedance.im.core.c.p$a r2 = new com.bytedance.im.core.c.p$a
            r2.<init>()
            com.bytedance.im.core.c.p$a r6 = r2.mo20825a(r6)
            r2 = 1008(0x3f0, float:1.413E-42)
            com.bytedance.im.core.c.p$a r6 = r6.mo20824a(r2)
            com.ss.android.ugc.aweme.im.sdk.chat.model.SetUpGroupInvitePasswordContent r2 = new com.ss.android.ugc.aweme.im.sdk.chat.model.SetUpGroupInvitePasswordContent
            java.lang.String r3 = "conversationId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            r2.<init>(r0, r1)
            java.lang.String r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79761a(r2)
            com.bytedance.im.core.c.p$a r6 = r6.mo20826a(r0)
            com.bytedance.im.core.c.p r6 = r6.mo20827a()
            java.lang.String r0 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            r0 = 2
            r6.setMsgStatus(r0)
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am.m79561b(r6)
            return
        L_0x006b:
            java.lang.String r6 = "GroupChatPanel"
            java.lang.String r0 = "addGroupInvitePasswordForOwner not work,cause not owner!"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r2, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.m78086a(com.bytedance.im.core.c.b):void");
    }

    /* renamed from: b */
    public final void mo72233b(List<C33367a> list) {
        Long l;
        List arrayList = new ArrayList();
        if (list != null) {
            for (C33367a aVar : list) {
                C11206o member = aVar.getMember();
                if (member != null) {
                    l = Long.valueOf(member.getUid());
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                aVar.setUser(C34010e.m77748a().mo71956a(valueOf, false));
                if (aVar.getUser() == null && valueOf != null) {
                    arrayList.add(aVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            mo72229a(arrayList, 50);
        }
    }

    /* renamed from: c */
    public final String mo72234c(C11180b bVar) {
        String str;
        boolean z;
        C52711k.m112240b(bVar, "conversation");
        C11181c coreInfo = bVar.getCoreInfo();
        if (coreInfo != null) {
            str = coreInfo.getNotice();
        } else {
            str = null;
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        C34277b e = m78095e(bVar);
        if (e == null) {
            return null;
        }
        long j = -1;
        C11197f settingInfo = bVar.getSettingInfo();
        if (settingInfo != null) {
            Map ext = settingInfo.getExt();
            if (ext != null) {
                String str2 = (String) ext.get("a:s_last_read_group_notice_time");
                if (str2 != null) {
                    try {
                        j = Long.parseLong(str2);
                    } catch (Exception e2) {
                        C32458a.m75148a((Throwable) e2);
                    }
                }
            }
        }
        if (j < e.getUpdateTime()) {
            return str;
        }
        return null;
    }

    /* renamed from: a */
    public final C11180b mo72222a(String str) {
        C52711k.m112240b(str, "conversationId");
        C11180b bVar = (C11180b) this.f88433d.get(str);
        if (bVar != null) {
            return bVar;
        }
        C34237d dVar = this;
        C11180b a = C11182d.m22641a().mo20658a(str);
        if (a == null) {
            return null;
        }
        dVar.f88433d.put(str, a);
        return a;
    }

    /* renamed from: c */
    public final boolean mo72235c(String str) {
        boolean z;
        boolean z2 = false;
        if (str == null) {
            return false;
        }
        List b = mo72231b(str);
        Collection collection = b;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        Iterator it = b.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = true;
                break;
            }
            C33367a aVar = (C33367a) it.next();
            IMUser user = aVar.getUser();
            if ((user == null || !user.equals(IMUser.fromUser(C35265e.m79732c()))) && aVar.getMember() != null) {
                C11206o member = aVar.getMember();
                if (member == null) {
                    C52711k.m112234a();
                }
                if (member.getRole() != GroupRole.OWNER.getValue()) {
                    break;
                }
            }
        }
        return z2;
    }

    /* renamed from: a */
    public static void m78085a(long j, C52687r<? super List<C11180b>, ? super Long, ? super Boolean, ? super C11202k, C52860x> rVar) {
        C52711k.m112240b(rVar, "callback");
        C11182d.m22641a().mo20659a(C11170a.f30116b, 0, j, (C11161a<List<C11180b>>) new C34244g<List<C11180b>>(rVar));
    }

    /* renamed from: b */
    private static List<C33367a> m78089b(List<C33367a> list, int i) {
        List<C33367a> arrayList = new ArrayList<>();
        if (list.size() > i) {
            arrayList.addAll(list.subList(0, i));
        } else {
            arrayList.addAll(list);
        }
        list.removeAll(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static void m78092c(String str, List<String> list) {
        boolean z;
        C52711k.m112240b(str, "conversationId");
        C52711k.m112240b(list, "uidList");
        C11180b a = C11182d.m22641a().mo20658a(str);
        if (a != null) {
            C34280e eVar = new C34280e();
            eVar.setFromUserId(String.valueOf(C35265e.m79733d()));
            eVar.setFromUserSecId(C34030j.m77789b(eVar.getFromUserId()));
            eVar.setConversationId(a.getConversationId());
            eVar.setConversationShortId(String.valueOf(a.getConversationShortId()));
            eVar.setMemberCount(a.getMemberCount());
            C11181c coreInfo = a.getCoreInfo();
            if (coreInfo != null) {
                CharSequence icon = coreInfo.getIcon();
                if (icon == null || icon.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    UrlModel urlModel = new UrlModel();
                    urlModel.setUrlList(C52575l.m112099b((Object[]) new String[]{coreInfo.getIcon(), coreInfo.getIcon(), coreInfo.getIcon()}));
                    eVar.setGroupIcon(urlModel);
                }
                eVar.setGroupName(coreInfo.getName());
            }
            C35237bj.m79649a().mo73342a(list, C52575l.m112092a(GroupInviteContent.Companion.obtain(eVar)));
        }
    }

    /* renamed from: b */
    public final void mo72232b(String str, List<? extends C11206o> list) {
        boolean z;
        CharSequence charSequence = str;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                List b = mo72231b(str);
                if (b != null) {
                    Iterable iterable = b;
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        if (!C52575l.m112125a((Iterable<? extends T>) list, ((C33367a) next).getMember())) {
                            arrayList.add(next);
                        }
                    }
                    this.f88432a.put(str, (List) arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    public final Integer mo72223a(String str, String str2) {
        Object obj;
        C52711k.m112240b(str, "conversationId");
        C52711k.m112240b(str2, "uid");
        List b = mo72231b(str);
        if (b != null) {
            Iterable iterable = b;
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                C11206o member = ((C33367a) next).getMember();
                if (member != null) {
                    obj = String.valueOf(member.getUid());
                } else {
                    obj = null;
                }
                if (C52711k.m112239a((Object) str2, obj)) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            boolean z = true;
            if (list.size() != 1) {
                z = false;
            }
            if (!z) {
                list = null;
            }
            if (list != null) {
                C33367a aVar = (C33367a) list.get(0);
                if (aVar != null) {
                    C11206o member2 = aVar.getMember();
                    if (member2 != null) {
                        return Integer.valueOf(member2.getRole());
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m78088a(String str, String str2, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(str, "conversationId");
        C52711k.m112240b(str2, "uid");
        C52711k.m112240b(bVar, "callback");
        new C11190e(str).mo20690a(str, str2, (C11162b<C11206o>) new C34243f<C11206o>(bVar));
    }
}
