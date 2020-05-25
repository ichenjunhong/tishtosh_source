package com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.p1807im.sdk.arch.p1810a.C33254b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupFollowMemberViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34030j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p1807im.service.p1902d.C35434a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.d */
public final class C34191d extends C33254b<C35434a, IMUser> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88340a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34191d.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/group/viewmodel/GroupFollowMemberViewModel;"))};

    /* renamed from: b */
    public final C0184k f88341b;

    /* renamed from: c */
    private final C52668f f88342c;

    /* renamed from: d */
    private final C52682m<String, User, C52860x> f88343d = new C34194b(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.d$a */
    public static final class C34192a extends C52712l implements C52670a<GroupFollowMemberViewModel> {

        /* renamed from: a */
        final /* synthetic */ C52760c f88344a;

        /* renamed from: b */
        final /* synthetic */ C0184k f88345b;

        /* renamed from: c */
        final /* synthetic */ C52760c f88346c;

        public C34192a(C52760c cVar, C0184k kVar, C52760c cVar2) {
            this.f88344a = cVar;
            this.f88345b = kVar;
            this.f88346c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupFollowMemberViewModel, android.arch.lifecycle.x] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v2, types: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupFollowMemberViewModel, android.arch.lifecycle.x]
          assigns: [android.arch.lifecycle.x]
          uses: [com.ss.android.ugc.aweme.im.sdk.group.viewmodel.GroupFollowMemberViewModel]
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
        public final com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupFollowMemberViewModel invoke() {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.im.sdk.group.a.d$a$1 r0 = new com.ss.android.ugc.aweme.im.sdk.group.a.d$a$1
                r0.<init>(r4)
                android.arch.lifecycle.k r1 = r4.f88345b
                boolean r2 = r1 instanceof android.support.p030v4.app.Fragment
                r3 = 0
                if (r2 == 0) goto L_0x0017
                android.arch.lifecycle.k r1 = r4.f88345b
                android.support.v4.app.Fragment r1 = (android.support.p030v4.app.Fragment) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r1, r0)
                goto L_0x0027
            L_0x0017:
                boolean r1 = r1 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0026
                android.arch.lifecycle.k r1 = r4.f88345b
                android.support.v4.app.FragmentActivity r1 = (android.support.p030v4.app.FragmentActivity) r1
                android.arch.lifecycle.y$b r0 = (android.arch.lifecycle.C0210y.C0212b) r0
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r1, r0)
                goto L_0x0027
            L_0x0026:
                r0 = r3
            L_0x0027:
                if (r0 == 0) goto L_0x0043
                d.k.c r1 = r4.f88346c
                java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                java.lang.String r1 = r1.getName()
                java.lang.String r2 = "viewModelClass.java.name"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                d.k.c r2 = r4.f88344a
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                return r0
            L_0x0043:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34191d.C34192a.invoke():android.arch.lifecycle.x");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.d$b */
    static final class C34194b extends C52712l implements C52682m<String, User, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34191d f88348a;

        C34194b(C34191d dVar) {
            this.f88348a = dVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str;
            String str2;
            String str3;
            String str4 = (String) obj;
            User user = (User) obj2;
            C52711k.m112240b(str4, "actionType");
            int hashCode = str4.hashCode();
            if (hashCode != -220619501) {
                if (hashCode != 1163096538) {
                    if (hashCode == 1583712102 && str4.equals("action_show") && user != null) {
                        GroupFollowMemberViewModel l = this.f88348a.mo72203l();
                        if (l != null && !l.mo72359e().contains(user.getUid())) {
                            C35190af.m79467a(this.f88348a.mo72204m(), "chat", "impression", "card", user.getUid());
                        }
                        GroupFollowMemberViewModel l2 = this.f88348a.mo72203l();
                        if (l2 != null) {
                            String uid = user.getUid();
                            if (uid != null) {
                                l2.f88678b.add(uid);
                            }
                        }
                    }
                } else if (str4.equals("action_follow") && user != null && user.getFollowStatus() == 0) {
                    C35190af.m79467a(this.f88348a.mo72204m(), "chat", "follow", "card", user.getUid());
                    C35190af.m79505e(this.f88348a.mo72204m(), "chat", user.getUid(), "group_follow_layer");
                }
            } else if (str4.equals("action_click_item")) {
                String m = this.f88348a.mo72204m();
                String str5 = "chat";
                String str6 = "enter_profile";
                String str7 = "card";
                String str8 = null;
                if (user != null) {
                    str = user.getUid();
                } else {
                    str = null;
                }
                C35190af.m79467a(m, str5, str6, str7, str);
                C35190af.m79442a();
                if (user != null) {
                    str2 = user.getUid();
                } else {
                    str2 = null;
                }
                C35190af.m79485b(str2, "chat_follow_card", "");
                if (user != null) {
                    str3 = user.getUid();
                } else {
                    str3 = null;
                }
                if (user != null) {
                    str8 = user.getSecUid();
                }
                String str9 = "chat_follow_card";
                C52711k.m112240b(str9, "previousPage");
                C41302w a = C41302w.m91042a();
                StringBuilder sb = new StringBuilder("aweme://user/profile/");
                sb.append(str3);
                C41311y a2 = C41311y.m91065a(sb.toString());
                String str10 = "sec_user_id";
                if (str8 == null) {
                    str8 = C34030j.f87981c.mo71976a(str3);
                }
                a.mo83861a(a2.mo83870a(str10, str8).mo83870a("previous_page_position", "other_places").mo83870a("previous_page", str9).mo83870a("enter_from", str9).mo83868a("from_recommend_card", 0).mo83871a());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.d$c */
    public static final class C34195c extends C1352v {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f88349a;

        C34195c(View view, ViewGroup viewGroup) {
            this.f88349a = viewGroup;
            super(view);
        }
    }

    /* renamed from: l */
    public final GroupFollowMemberViewModel mo72203l() {
        return (GroupFollowMemberViewModel) this.f88342c.getValue();
    }

    /* renamed from: m */
    public final String mo72204m() {
        GroupFollowMemberViewModel l = mo72203l();
        if (l != null) {
            String str = l.f88677a;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public C34191d(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        super(null, 1, null);
        this.f88341b = kVar;
        C0184k kVar2 = this.f88341b;
        C52760c a = C52728w.m112245a(GroupFollowMemberViewModel.class);
        this.f88342c = C52732g.m112285a(new C34192a(a, kVar2, a));
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (vVar instanceof C35434a) {
            IMUser iMUser = (IMUser) mo70602b(i);
            if (iMUser != null) {
                IMUser.toUser(iMUser);
            }
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        C35434a createGroupFollowMemberViewHolder = a.mo71949f().createGroupFollowMemberViewHolder(viewGroup);
        if (createGroupFollowMemberViewHolder == null || createGroupFollowMemberViewHolder == null) {
            return new C34195c(viewGroup, viewGroup);
        }
        return createGroupFollowMemberViewHolder;
    }
}
