package com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1839c.C34234d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34799b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34854a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.g */
public final class C34205g extends C34799b<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88369a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34205g.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupListViewModel;"))};

    /* renamed from: b */
    public final Context f88370b;

    /* renamed from: c */
    private final C52668f f88371c;

    /* renamed from: e */
    private C52686q<? super Integer, ? super Integer, ? super View, C52860x> f88372e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.g$a */
    public static final class C34206a extends C52712l implements C52670a<GroupListViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52760c f88373a;

        /* renamed from: b */
        final /* synthetic */ C0184k f88374b;

        /* renamed from: c */
        final /* synthetic */ C52760c f88375c;

        public C34206a(C52760c cVar, C0184k kVar, C52760c cVar2) {
            this.f88373a = cVar;
            this.f88374b = kVar;
            this.f88375c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel, android.arch.lifecycle.x] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel, android.arch.lifecycle.x]
          assigns: [android.arch.lifecycle.x]
          uses: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel]
          mth insns count: 26
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupListViewModel invoke() {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.im.sdk.group.a.g$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.group.a.g$a$1
                r0.<init>(r4)
                android.arch.lifecycle.k r1 = r4.f88374b
                boolean r2 = r1 instanceof android.support.p030v4.app.Fragment
                r3 = 0
                if (r2 == 0) goto L_0x0017
                android.arch.lifecycle.k r1 = r4.f88374b
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r1, r0)
                goto L_0x0027
            L_0x0017:
                boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0026
                android.arch.lifecycle.k r1 = r4.f88374b
                android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r1, r0)
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                if (r0 == 0) goto L_0x0043
                d.k.c r1 = r4.f88375c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r4.f88373a
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                return r0
            L_0x0043:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34205g.C34206a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.g$b */
    static final class C34208b extends C52712l implements C52686q<Integer, Integer, View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34205g f88377a;

        /* renamed from: b */
        final /* synthetic */ C0184k f88378b;

        C34208b(C34205g gVar, C0184k kVar) {
            this.f88377a = gVar;
            this.f88378b = kVar;
            super(3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
            if (r9 == null) goto L_0x0098;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            /*
                r8 = this;
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                android.view.View r11 = (android.view.View) r11
                java.lang.String r0 = "view"
                p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
                switch(r9) {
                    case 0: goto L_0x0018;
                    case 1: goto L_0x0018;
                    case 2: goto L_0x0018;
                    default: goto L_0x0016;
                }
            L_0x0016:
                goto L_0x00f7
            L_0x0018:
                com.ss.android.ugc.aweme.im.sdk.group.a.g r9 = r8.f88377a
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r9 = r9.mo72208m()
                if (r9 == 0) goto L_0x00f7
                int r9 = r9.f90193j
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                com.ss.android.ugc.aweme.im.sdk.group.a.g r11 = r8.f88377a
                com.ss.android.ugc.aweme.im.service.model.IMContact r11 = r11.mo70602b(r10)
                boolean r0 = r11 instanceof com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation
                if (r0 != 0) goto L_0x0037
                r11 = 0
            L_0x0037:
                com.ss.android.ugc.aweme.im.service.model.IMConversation r11 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation) r11
                if (r11 != 0) goto L_0x003d
                goto L_0x00f7
            L_0x003d:
                r0 = 2
                if (r9 != r0) goto L_0x0079
                android.os.Bundle r9 = new android.os.Bundle
                r9.<init>()
                java.lang.String r10 = "key_enter_from"
                r0 = 7
                r9.putInt(r10, r0)
                android.arch.lifecycle.k r10 = r8.f88378b
                if (r10 == 0) goto L_0x0071
                android.content.Context r10 = (android.content.Context) r10
                java.lang.String r0 = r11.getConversationId()
                r1 = 3
                com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity.m76454a(r10, r0, r1, r9)
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
                java.lang.String r2 = r11.getConversationId()
                java.lang.String r3 = ""
                java.lang.String r4 = "group"
                java.lang.String r5 = "click_contact"
                java.lang.String r6 = "contact_list"
                java.lang.String r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity.m76444a()
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79468a(r2, r3, r4, r5, r6, r7)
                goto L_0x00f7
            L_0x0071:
                d.u r9 = new d.u
                java.lang.String r10 = "null cannot be cast to non-null type android.content.Context"
                r9.<init>(r10)
                throw r9
            L_0x0079:
                com.ss.android.ugc.aweme.im.sdk.group.a.g r9 = r8.f88377a
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r9 = r9.mo72208m()
                r0 = 0
                if (r9 == 0) goto L_0x0087
                boolean r9 = r9.mo73181m()
                goto L_0x0088
            L_0x0087:
                r9 = 0
            L_0x0088:
                if (r9 == 0) goto L_0x00ea
                com.ss.android.ugc.aweme.im.sdk.group.a.g r9 = r8.f88377a
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r9 = r9.mo72208m()
                if (r9 == 0) goto L_0x0098
                java.util.List r9 = r9.mo73183o()
                if (r9 != 0) goto L_0x009c
            L_0x0098:
                java.util.List r9 = p2628d.p2629a.C52575l.m112097a()
            L_0x009c:
                boolean r1 = r9.contains(r11)
                if (r1 != 0) goto L_0x00d7
                int r9 = r9.size()
                com.ss.android.ugc.aweme.im.sdk.group.a.g r1 = r8.f88377a
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r1 = r1.mo72208m()
                r2 = 10
                if (r1 == 0) goto L_0x00b3
                int r1 = r1.f88686h
                goto L_0x00b5
            L_0x00b3:
                r1 = 10
            L_0x00b5:
                if (r9 < r1) goto L_0x00d7
                com.ss.android.ugc.aweme.im.sdk.group.a.g r9 = r8.f88377a
                android.content.Context r9 = r9.f88370b
                com.ss.android.ugc.aweme.im.sdk.group.a.g r10 = r8.f88377a
                android.content.Context r10 = r10.f88370b
                r11 = 2132545598(0x7f1c103e, float:2.074439E38)
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1[r0] = r2
                java.lang.String r10 = r10.getString(r11, r1)
                com.bytedance.ies.dmt.ui.d.a r9 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r9, r10)
                r9.mo19066a()
                goto L_0x00f7
            L_0x00d7:
                com.ss.android.ugc.aweme.im.sdk.group.a.g r9 = r8.f88377a
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r9 = r9.mo72208m()
                if (r9 == 0) goto L_0x00e4
                com.ss.android.ugc.aweme.im.service.model.IMContact r11 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r11
                r9.mo73179a(r11)
            L_0x00e4:
                com.ss.android.ugc.aweme.im.sdk.group.a.g r9 = r8.f88377a
                r9.notifyItemChanged(r10)
                goto L_0x00f7
            L_0x00ea:
                com.ss.android.ugc.aweme.im.sdk.group.a.g r9 = r8.f88377a
                com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupListViewModel r9 = r9.mo72208m()
                if (r9 == 0) goto L_0x00f7
                com.ss.android.ugc.aweme.im.service.model.IMContact r11 = (com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact) r11
                r9.mo73179a(r11)
            L_0x00f7:
                d.x r9 = p2628d.C52860x.f131107a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34205g.C34208b.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: l */
    public final C52686q<Integer, Integer, View, C52860x> mo72199l() {
        return this.f88372e;
    }

    /* renamed from: m */
    public final GroupListViewModel mo72208m() {
        return (GroupListViewModel) this.f88371c.getValue();
    }

    /* renamed from: c */
    public final int mo48636c() {
        int i;
        List list = this.f70670n;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        return i + mo70605j();
    }

    public final int getItemCount() {
        if (this.f70699x) {
            return mo48636c() + 1;
        }
        return mo48636c();
    }

    /* renamed from: c */
    public final IMContact mo70602b(int i) {
        if (i < mo70605j() || i >= getItemCount()) {
            return null;
        }
        List list = this.f70670n;
        if (list != null) {
            return (IMContact) list.get(i - mo70605j());
        }
        return null;
    }

    public C34205g(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        super(kVar);
        this.f70699x = true;
        C52760c a = C52728w.m112245a(GroupListViewModel.class);
        this.f88371c = C52732g.m112285a(new C34206a(a, kVar, a));
        this.f88370b = (Context) kVar;
        this.f88372e = new C34208b(this, kVar);
    }

    /* renamed from: b */
    public final C34854a<IMContact> mo72198b(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        return new C34234d<>(viewGroup);
    }
}
