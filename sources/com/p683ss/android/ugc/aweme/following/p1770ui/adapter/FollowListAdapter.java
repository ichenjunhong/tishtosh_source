package com.p683ss.android.ugc.aweme.following.p1770ui.adapter;

import android.app.Dialog;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.jedi.arch.C11787a;
import com.bytedance.jedi.arch.C11790ac;
import com.bytedance.jedi.arch.C11795c;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.arch.C11926m;
import com.bytedance.jedi.arch.C11936w;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11896i;
import com.bytedance.jedi.ext.adapter.C11944b;
import com.bytedance.jedi.ext.adapter.C11972h;
import com.bytedance.jedi.ext.adapter.C11972h.C11973a;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p747b.C11959h;
import com.bytedance.jedi.ext.adapter.p747b.C11959h.C11960a;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.arch.C23463c;
import com.p683ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24501b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.experiment.ShowRemarkIconStyleExperiemnt;
import com.p683ss.android.ugc.aweme.familiar.service.C29650b;
import com.p683ss.android.ugc.aweme.following.p1768a.C32001h;
import com.p683ss.android.ugc.aweme.following.p1768a.C32002i;
import com.p683ss.android.ugc.aweme.following.p1768a.C32003j;
import com.p683ss.android.ugc.aweme.following.p1768a.C32004k;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.I18nFollowUserBtn;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewholder.RecommendContactViewHolder;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewholder.RecommendRelationTitleViewHolder;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewholder.RecommendRelationUserViewHolder;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewholder.RelationStatusViewHolder;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationTabViewModel;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationViewModel;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationViewModel.C32328m;
import com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationViewModel;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendSuggestedItemView;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendUserItemView;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.main.service.IUnReadVideoService.C36678a;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40211ae;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.util.C40519aa.C40520a;
import com.p683ss.android.ugc.aweme.recommend.RecommendFriendItemViewHolder;
import com.p683ss.android.ugc.aweme.recommend.RecommendSuggestTitleViewHolder;
import com.p683ss.android.ugc.aweme.unread.UnReadCircleView;
import com.p683ss.android.ugc.aweme.user.repository.UserState;
import com.p683ss.android.ugc.aweme.user.repository.UserViewModel;
import com.p683ss.android.ugc.aweme.user.repository.UserViewModel.C47581c;
import com.p683ss.android.ugc.aweme.userservice.C47588a;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter */
public final class FollowListAdapter extends C23463c<Object> {

    /* renamed from: c */
    public final Map<String, Boolean> f83692c = new LinkedHashMap();

    /* renamed from: d */
    public final boolean f83693d;

    /* renamed from: e */
    public final C0184k f83694e;

    /* renamed from: f */
    public final String f83695f;

    /* renamed from: g */
    public final boolean f83696g;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder */
    public final class FollowItemViewHolder extends JediBaseViewHolder<FollowItemViewHolder, C32004k> {

        /* renamed from: g */
        static final /* synthetic */ C52767h[] f83697g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(FollowItemViewHolder.class), "followRelationTabViewModel", "getFollowRelationTabViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(FollowItemViewHolder.class), "followerRelationViewModel", "getFollowerRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(FollowItemViewHolder.class), "followingRelationViewModel", "getFollowingRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(FollowItemViewHolder.class), "unreadAvatarListController", "getUnreadAvatarListController()Lcom/ss/android/ugc/aweme/main/service/IUnReadVideoService$IUnReadVideoAvatarListController;"))};

        /* renamed from: j */
        public final ImageView f83698j;

        /* renamed from: k */
        public final UnReadCircleView f83699k = ((UnReadCircleView) this.itemView.findViewById(R.id.f7l));

        /* renamed from: l */
        final C52668f f83700l;

        /* renamed from: m */
        final /* synthetic */ FollowListAdapter f83701m;

        /* renamed from: n */
        private final AvatarImageWithVerify f83702n;

        /* renamed from: o */
        private final TextView f83703o;

        /* renamed from: p */
        private final TextView f83704p;

        /* renamed from: q */
        private final I18nFollowUserBtn f83705q;

        /* renamed from: r */
        private final ImageView f83706r;

        /* renamed from: s */
        private final C52668f f83707s;

        /* renamed from: t */
        private final C52668f f83708t;

        /* renamed from: u */
        private final C52668f f83709u;

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$a */
        public static final class C32072a extends C52712l implements C52670a<FollowRelationTabViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f83710a;

            /* renamed from: b */
            final /* synthetic */ C52760c f83711b;

            /* renamed from: c */
            final /* synthetic */ C52760c f83712c;

            public C32072a(JediViewHolder jediViewHolder, C52760c cVar, C52760c cVar2) {
                this.f83710a = jediViewHolder;
                this.f83711b = cVar;
                this.f83712c = cVar2;
                super(0);
            }

            /* JADX WARNING: type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v5, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel]
              assigns: [com.bytedance.jedi.arch.JediViewModel]
              uses: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel]
              mth insns count: 15
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
            public final com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowRelationTabViewModel invoke() {
                /*
                    r3 = this;
                    com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r3.f83710a
                    android.arch.lifecycle.k r0 = r0.mo22678n()
                    android.support.v4.app.FragmentActivity r0 = com.bytedance.jedi.ext.adapter.C11941a.m24315b(r0)
                    android.arch.lifecycle.y$b r1 = com.bytedance.jedi.arch.C11793b.m24134a()
                    android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r1)
                    d.k.c r1 = r3.f83712c
                    java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                    java.lang.String r1 = r1.getName()
                    java.lang.String r2 = "viewModelClass.java.name"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                    d.k.c r2 = r3.f83711b
                    java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                    android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                    com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.adapter.FollowListAdapter.FollowItemViewHolder.C32072a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$b */
        public static final class C32073b extends C52712l implements C52670a<FollowerRelationViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f83713a;

            /* renamed from: b */
            final /* synthetic */ C52760c f83714b;

            /* renamed from: c */
            final /* synthetic */ C52760c f83715c;

            public C32073b(JediViewHolder jediViewHolder, C52760c cVar, C52760c cVar2) {
                this.f83713a = jediViewHolder;
                this.f83714b = cVar;
                this.f83715c = cVar2;
                super(0);
            }

            /* JADX WARNING: type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
            /* JADX WARNING: type inference failed for: r3v0 */
            /* JADX WARNING: type inference failed for: r3v1 */
            /* JADX WARNING: type inference failed for: r3v2, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
            /* JADX WARNING: type inference failed for: r3v4, types: [com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: type inference failed for: r3v8, types: [com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: type inference failed for: r3v9 */
            /* JADX WARNING: type inference failed for: r3v10 */
            /* JADX WARNING: type inference failed for: r3v11 */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel]
              assigns: [com.bytedance.jedi.arch.JediViewModel]
              uses: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel]
              mth insns count: 49
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
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 4 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowerRelationViewModel invoke() {
                /*
                    r5 = this;
                    com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r5.f83713a
                    android.arch.lifecycle.k r0 = r0.mo22678n()
                    java.lang.Object r0 = com.bytedance.jedi.ext.adapter.C11941a.m24314a(r0)
                    d.k.c r1 = r5.f83715c
                    java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                    java.lang.String r1 = r1.getName()
                    java.lang.String r2 = "viewModelClass.java.name"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                    boolean r2 = r0 instanceof android.support.p030v4.app.Fragment
                    if (r2 == 0) goto L_0x0059
                    android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0
                    r2 = r0
                L_0x0020:
                    if (r2 == 0) goto L_0x003c
                    android.arch.lifecycle.y$b r3 = com.bytedance.jedi.arch.C11793b.m24134a()     // Catch:{ ae -> 0x0037 }
                    android.arch.lifecycle.y r3 = android.arch.lifecycle.C0214z.m439a(r2, r3)     // Catch:{ ae -> 0x0037 }
                    d.k.c r4 = r5.f83714b     // Catch:{ ae -> 0x0037 }
                    java.lang.Class r4 = p2628d.p2639f.C52669a.m112219a(r4)     // Catch:{ ae -> 0x0037 }
                    android.arch.lifecycle.x r3 = r3.mo360a(r1, r4)     // Catch:{ ae -> 0x0037 }
                    com.bytedance.jedi.arch.JediViewModel r3 = (com.bytedance.jedi.arch.JediViewModel) r3     // Catch:{ ae -> 0x0037 }
                    goto L_0x003d
                L_0x0037:
                    android.support.v4.app.Fragment r2 = r2.getParentFragment()
                    goto L_0x0020
                L_0x003c:
                    r3 = 0
                L_0x003d:
                    if (r3 != 0) goto L_0x0058
                    android.support.v4.app.FragmentActivity r0 = r0.requireActivity()
                    android.arch.lifecycle.y$b r2 = com.bytedance.jedi.arch.C11793b.m24134a()
                    android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r2)
                    d.k.c r2 = r5.f83714b
                    java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                    android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                    r3 = r0
                    com.bytedance.jedi.arch.JediViewModel r3 = (com.bytedance.jedi.arch.JediViewModel) r3
                L_0x0058:
                    return r3
                L_0x0059:
                    boolean r2 = r0 instanceof android.support.p030v4.app.FragmentActivity
                    if (r2 == 0) goto L_0x0079
                    android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                    android.arch.lifecycle.y$b r2 = com.bytedance.jedi.arch.C11793b.m24134a()
                    android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r2)
                    d.k.c r2 = r5.f83714b
                    java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                    android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                    java.lang.String r1 = "ViewModelProviders\n     …key, viewModelClass.java)"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                    com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                    return r0
                L_0x0079:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r0.<init>()
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.adapter.FollowListAdapter.FollowItemViewHolder.C32073b.invoke():com.bytedance.jedi.arch.JediViewModel");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$c */
        public static final class C32074c extends C52712l implements C52670a<FollowingRelationViewModel> {

            /* renamed from: a */
            final /* synthetic */ JediViewHolder f83716a;

            /* renamed from: b */
            final /* synthetic */ C52760c f83717b;

            /* renamed from: c */
            final /* synthetic */ C52760c f83718c;

            public C32074c(JediViewHolder jediViewHolder, C52760c cVar, C52760c cVar2) {
                this.f83716a = jediViewHolder;
                this.f83717b = cVar;
                this.f83718c = cVar2;
                super(0);
            }

            /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: type inference failed for: r3v0 */
            /* JADX WARNING: type inference failed for: r3v1 */
            /* JADX WARNING: type inference failed for: r3v2, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel] */
            /* JADX WARNING: type inference failed for: r3v4, types: [com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: type inference failed for: r3v8, types: [com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: type inference failed for: r3v9 */
            /* JADX WARNING: type inference failed for: r3v10 */
            /* JADX WARNING: type inference failed for: r3v11 */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v8, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel, com.bytedance.jedi.arch.JediViewModel]
              assigns: [com.bytedance.jedi.arch.JediViewModel]
              uses: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel]
              mth insns count: 49
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
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 4 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p683ss.android.ugc.aweme.following.p1770ui.viewmodel.FollowingRelationViewModel invoke() {
                /*
                    r5 = this;
                    com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r5.f83716a
                    android.arch.lifecycle.k r0 = r0.mo22678n()
                    java.lang.Object r0 = com.bytedance.jedi.ext.adapter.C11941a.m24314a(r0)
                    d.k.c r1 = r5.f83718c
                    java.lang.Class r1 = p2628d.p2639f.C52669a.m112219a(r1)
                    java.lang.String r1 = r1.getName()
                    java.lang.String r2 = "viewModelClass.java.name"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                    boolean r2 = r0 instanceof android.support.p030v4.app.Fragment
                    if (r2 == 0) goto L_0x0059
                    android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0
                    r2 = r0
                L_0x0020:
                    if (r2 == 0) goto L_0x003c
                    android.arch.lifecycle.y$b r3 = com.bytedance.jedi.arch.C11793b.m24134a()     // Catch:{ ae -> 0x0037 }
                    android.arch.lifecycle.y r3 = android.arch.lifecycle.C0214z.m439a(r2, r3)     // Catch:{ ae -> 0x0037 }
                    d.k.c r4 = r5.f83717b     // Catch:{ ae -> 0x0037 }
                    java.lang.Class r4 = p2628d.p2639f.C52669a.m112219a(r4)     // Catch:{ ae -> 0x0037 }
                    android.arch.lifecycle.x r3 = r3.mo360a(r1, r4)     // Catch:{ ae -> 0x0037 }
                    com.bytedance.jedi.arch.JediViewModel r3 = (com.bytedance.jedi.arch.JediViewModel) r3     // Catch:{ ae -> 0x0037 }
                    goto L_0x003d
                L_0x0037:
                    android.support.v4.app.Fragment r2 = r2.getParentFragment()
                    goto L_0x0020
                L_0x003c:
                    r3 = 0
                L_0x003d:
                    if (r3 != 0) goto L_0x0058
                    android.support.v4.app.FragmentActivity r0 = r0.requireActivity()
                    android.arch.lifecycle.y$b r2 = com.bytedance.jedi.arch.C11793b.m24134a()
                    android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r2)
                    d.k.c r2 = r5.f83717b
                    java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                    android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                    r3 = r0
                    com.bytedance.jedi.arch.JediViewModel r3 = (com.bytedance.jedi.arch.JediViewModel) r3
                L_0x0058:
                    return r3
                L_0x0059:
                    boolean r2 = r0 instanceof android.support.p030v4.app.FragmentActivity
                    if (r2 == 0) goto L_0x0079
                    android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                    android.arch.lifecycle.y$b r2 = com.bytedance.jedi.arch.C11793b.m24134a()
                    android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r2)
                    d.k.c r2 = r5.f83717b
                    java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                    android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                    java.lang.String r1 = "ViewModelProviders\n     …key, viewModelClass.java)"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                    com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                    return r0
                L_0x0079:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r0.<init>()
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.following.p1770ui.adapter.FollowListAdapter.FollowItemViewHolder.C32074c.invoke():com.bytedance.jedi.arch.JediViewModel");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$d */
        public static final class C32075d implements C40520a {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f83719a;

            /* renamed from: b */
            final /* synthetic */ User f83720b;

            /* renamed from: a */
            public final void mo65278a() {
                this.f83719a.mo65275a(this.f83720b, this.f83720b.getFollowStatus());
            }

            C32075d(FollowItemViewHolder followItemViewHolder, User user) {
                this.f83719a = followItemViewHolder;
                this.f83720b = user;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$e */
        static final class C32076e implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f83721a;

            /* renamed from: b */
            final /* synthetic */ User f83722b;

            C32076e(FollowItemViewHolder followItemViewHolder, User user) {
                this.f83721a = followItemViewHolder;
                this.f83722b = user;
            }

            public final void onClick(View view) {
                String str;
                ClickInstrumentation.onClick(view);
                if (this.f83721a.f83701m.f83693d) {
                    C52711k.m112236a((Object) view, "it");
                    UserProfileActivity.m89400a(view.getContext(), C47661ab.m103163a().mo94972a("uid", this.f83722b.getUid()).mo94972a("sec_user_id", this.f83722b.getSecUid()).mo94972a("enter_from", this.f83721a.f83701m.mo65272f()).mo94969a("need_track_compare_recommend_reason", 1).mo94972a("previous_recommend_reason", this.f83722b.getRecommendReason()).mo94972a("recommend_from_type", "list").f120139a);
                } else {
                    C52711k.m112236a((Object) view, "it");
                    UserProfileActivity.m89402a(view.getContext(), this.f83722b, this.f83721a.f83701m.mo65272f());
                }
                FollowListAdapter followListAdapter = this.f83721a.f83701m;
                C23249s c = new C23249s().mo48144s(this.f83722b.getUid()).mo48137c(followListAdapter.mo65272f());
                if (followListAdapter.f83696g) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                c.mo48143h(str).mo48142g("1044").mo48076e();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$f */
        static final class C32077f implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f83723a;

            /* renamed from: b */
            final /* synthetic */ User f83724b;

            C32077f(FollowItemViewHolder followItemViewHolder, User user) {
                this.f83723a = followItemViewHolder;
                this.f83724b = user;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                ClickInstrumentation.onClick(view);
                FollowListAdapter followListAdapter = this.f83723a.f83701m;
                User user = this.f83724b;
                String str4 = "single";
                int i = 1;
                if (user.getFollowerStatus() == 1) {
                    str4 = "mutual";
                }
                if (user.getFollowStatus() == 0) {
                    str = "follow";
                } else {
                    str = "follow_cancel";
                }
                C23253w wVar = new C23253w(str);
                if (followListAdapter.f83696g) {
                    str2 = "personal_homepage";
                } else {
                    str2 = "others_homepage";
                }
                C23253w c = wVar.mo48164d(str2).mo48161b(followListAdapter.mo65272f()).mo48163c("follow_button");
                if (user.getFollowStatus() == 0) {
                    str3 = "1007";
                } else {
                    str3 = "1036";
                }
                c.mo48160a(str3).mo48166f(user.getUid()).mo48167g(str4).mo48076e();
                if (this.f83724b.getFollowStatus() != 0) {
                    i = 0;
                }
                this.f83723a.mo65277q().mo94901a(new C39970a().mo81871a(this.f83724b.getUid()).mo81874b(this.f83724b.getSecUid()).mo81869a(i).mo81876c(this.f83723a.f83701m.mo65272f()).mo81873b(this.f83723a.f83701m.mo65273g()).mo81877d(this.f83724b.getFollowerStatus()).mo81872a());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$g */
        static final class C32078g implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f83725a;

            /* renamed from: b */
            final /* synthetic */ User f83726b;

            C32078g(FollowItemViewHolder followItemViewHolder, User user) {
                this.f83725a = followItemViewHolder;
                this.f83726b = user;
            }

            public final void onClick(final View view) {
                ClickInstrumentation.onClick(view);
                final Resources resources = this.f83725a.f83698j.getResources();
                String string = resources.getString(R.string.d6q);
                C52711k.m112236a((Object) string, "res.getString(R.string.r…ove_follower_alert_title)");
                String string2 = resources.getString(R.string.wf);
                C52711k.m112236a((Object) string2, "res.getString(R.string.cancel)");
                CharSequence[] charSequenceArr = {string, string2};
                C52711k.m112236a((Object) view, "v");
                C26891a aVar = new C26891a(view.getContext());
                aVar.mo54844a(charSequenceArr, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C32078g f83727a;

                    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$g$1$a */
                    static final class C32080a implements DialogInterface.OnClickListener {

                        /* renamed from: a */
                        final /* synthetic */ C320791 f83730a;

                        C32080a(C320791 r1) {
                            this.f83730a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C26890h.m65011a("remove_fans", C23089d.m56640a().mo47829a("enter_from", "fans").f61491a);
                            UserViewModel q = this.f83730a.f83727a.f83725a.mo65277q();
                            String uid = this.f83730a.f83727a.f83726b.getUid();
                            C52711k.m112236a((Object) uid, "item.uid");
                            String secUid = this.f83730a.f83727a.f83726b.getSecUid();
                            C52711k.m112236a((Object) secUid, "item.secUid");
                            C52711k.m112240b(uid, "uid");
                            C52711k.m112240b(secUid, "secUid");
                            C2201v a = C47588a.m103036c().mo94907a(uid, secUid).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
                            C52711k.m112236a((Object) a, "ServiceManager.get().get…dSchedulers.mainThread())");
                            q.mo22523a(a, (C52682m<? super S, ? super C11787a<? extends T>, ? extends S>) C47581c.INSTANCE);
                        }
                    }

                    {
                        this.f83727a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (i == 0) {
                            C26890h.m65011a("click_remove_fans", C23089d.m56640a().mo47829a("enter_from", "fans").f61491a);
                            View view = view;
                            C52711k.m112236a((Object) view, "v");
                            C10643a a = new C10643a(view.getContext()).mo18885a((int) R.string.d6q);
                            View view2 = view;
                            C52711k.m112236a((Object) view2, "v");
                            String string = view2.getResources().getString(R.string.d6p);
                            C52711k.m112236a((Object) string, "v.resources.getString(R.…emove_follower_alert_msg)");
                            String a2 = C2240a.m6772a(string, Arrays.copyOf(new Object[]{C47915gg.m103656e(this.f83727a.f83726b)}, 1));
                            C52711k.m112236a((Object) a2, "java.lang.String.format(format, *args)");
                            Dialog c = a.mo18902b(a2).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo18886a((int) R.string.d6o, (DialogInterface.OnClickListener) new C32080a(this)).mo18897a().mo18883c();
                            if (c.findViewById(R.id.dez) instanceof TextView) {
                                View findViewById = c.findViewById(R.id.dez);
                                if (findViewById != null) {
                                    ((TextView) findViewById).setTextColor(resources.getColor(R.color.j7));
                                    return;
                                }
                                throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
                            }
                        }
                    }
                });
                aVar.mo54845b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$h */
        static final class C32081h extends C52712l implements C52682m<FollowItemViewHolder, UserState, C52860x> {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f83731a;

            C32081h(FollowItemViewHolder followItemViewHolder) {
                this.f83731a = followItemViewHolder;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i;
                final FollowItemViewHolder followItemViewHolder = (FollowItemViewHolder) obj;
                final UserState userState = (UserState) obj2;
                C52711k.m112240b(followItemViewHolder, "$receiver");
                C52711k.m112240b(userState, "it");
                C11787a followStatus = userState.getFollowStatus();
                if (followStatus instanceof C11936w) {
                    Map<String, Boolean> map = this.f83731a.f83701m.f83692c;
                    String uid = userState.getUser().getUid();
                    C52711k.m112236a((Object) uid, "it.user.uid");
                    FollowStatus followStatus2 = (FollowStatus) userState.getFollowStatus().mo22538a();
                    boolean z = false;
                    if (followStatus2 != null) {
                        i = followStatus2.followStatus;
                    } else {
                        i = 0;
                    }
                    if (i == 1 || i == 2) {
                        z = true;
                    }
                    map.put(uid, Boolean.valueOf(z));
                    followItemViewHolder.mo65274a(userState.getUser());
                    C33200k.m76279d().updateIMUser(IMUser.fromUser(userState.getUser()));
                } else if (followStatus instanceof C11795c) {
                    C11787a followStatus3 = userState.getFollowStatus();
                    if (followStatus3 != null) {
                        Throwable th = ((C11795c) followStatus3).f31301a;
                        if (!(th instanceof C23459a) || !(this.f83731a.f83701m.f83694e instanceof C23526a) || !C24501b.m59896a((Exception) th)) {
                            View view = followItemViewHolder.itemView;
                            C52711k.m112236a((Object) view, "itemView");
                            Context context = view.getContext();
                            C11787a followStatus4 = userState.getFollowStatus();
                            if (followStatus4 != null) {
                                C22971a.m56494a(context, ((C11795c) followStatus4).f31301a, R.string.b47);
                            } else {
                                throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.arch.Fail<com.ss.android.ugc.aweme.profile.model.FollowStatus>");
                            }
                        } else {
                            C0184k kVar = this.f83731a.f83701m.f83694e;
                            if (kVar != null) {
                                C24501b.m59895a(((C23526a) kVar).getChildFragmentManager(), (C23459a) th, new C24493b(this) {

                                    /* renamed from: a */
                                    final /* synthetic */ C32081h f83732a;

                                    /* renamed from: b */
                                    public final void mo45354b() {
                                        View view = followItemViewHolder.itemView;
                                        C52711k.m112236a((Object) view, "itemView");
                                        Context context = view.getContext();
                                        C11787a followStatus = userState.getFollowStatus();
                                        if (followStatus != null) {
                                            C22971a.m56494a(context, ((C11795c) followStatus).f31301a, R.string.b47);
                                            return;
                                        }
                                        throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.arch.Fail<com.ss.android.ugc.aweme.profile.model.FollowStatus>");
                                    }

                                    /* renamed from: a */
                                    public final void mo45353a() {
                                        int i;
                                        if (userState.getUser().getFollowStatus() == 0) {
                                            i = 1;
                                        } else {
                                            i = 0;
                                        }
                                        followItemViewHolder.mo65277q().mo94901a(new C39970a().mo81871a(userState.getUser().getUid()).mo81874b(userState.getUser().getSecUid()).mo81869a(i).mo81876c(this.f83732a.f83731a.f83701m.mo65272f()).mo81873b(this.f83732a.f83731a.f83701m.mo65273g()).mo81872a());
                                    }

                                    {
                                        this.f83732a = r1;
                                    }
                                });
                            } else {
                                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment");
                            }
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.bytedance.jedi.arch.Fail<com.ss.android.ugc.aweme.profile.model.FollowStatus>");
                    }
                } else if (followStatus instanceof C11790ac) {
                    followItemViewHolder.mo65274a(userState.getUser());
                }
                if (userState.getFollowerIsRemoved()) {
                    FollowerRelationViewModel followerRelationViewModel = (FollowerRelationViewModel) followItemViewHolder.f83700l.getValue();
                    String uid2 = userState.getUser().getUid();
                    C52711k.m112236a((Object) uid2, "it.user.uid");
                    C52711k.m112240b(uid2, "uid");
                    followerRelationViewModel.mo22527b(new C32328m(followerRelationViewModel, uid2));
                    IAccountUserService a = C20902b.m53242a();
                    C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
                    if (C40211ae.m89448a(a.getCurUser())) {
                        FollowRelationTabViewModel p = followItemViewHolder.mo65276p();
                        IAccountUserService a2 = C20902b.m53242a();
                        C52711k.m112236a((Object) a2, "AccountUserProxyService.get()");
                        User curUser = a2.getCurUser();
                        C52711k.m112236a((Object) curUser, "AccountUserProxyService.get().curUser");
                        p.mo65425a(curUser.getFansCount());
                    } else {
                        FollowRelationTabViewModel p2 = followItemViewHolder.mo65276p();
                        IAccountUserService a3 = C20902b.m53242a();
                        C52711k.m112236a((Object) a3, "AccountUserProxyService.get()");
                        User curUser2 = a3.getCurUser();
                        C52711k.m112236a((Object) curUser2, "AccountUserProxyService.get().curUser");
                        p2.mo65425a(curUser2.getFollowerCount());
                    }
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$i */
        static final class C32083i extends C52712l implements C52670a<C36678a> {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f83735a;

            C32083i(FollowItemViewHolder followItemViewHolder) {
                this.f83735a = followItemViewHolder;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return C29650b.f77509a.getUnReadVideoAvatarListController(this.f83735a.f83699k, this.f83735a.f83701m.mo65272f());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$FollowItemViewHolder$j */
        static final class C32084j extends C52712l implements C52671b<UserState, UserState> {

            /* renamed from: a */
            final /* synthetic */ FollowItemViewHolder f83736a;

            C32084j(FollowItemViewHolder followItemViewHolder) {
                this.f83736a = followItemViewHolder;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                UserState userState = (UserState) obj;
                C52711k.m112240b(userState, "$receiver");
                return UserState.copy$default(userState, ((C32004k) this.f83736a.mo22689o()).f83564b, false, null, null, 14, null);
            }
        }

        /* renamed from: p */
        public final FollowRelationTabViewModel mo65276p() {
            return (FollowRelationTabViewModel) this.f83707s.getValue();
        }

        /* renamed from: r */
        private static int m74472r() {
            return C10181b.m20511a().mo18168a(ShowRemarkIconStyleExperiemnt.class, true, "show_remark_icon_style", 31744, 0);
        }

        /* renamed from: j */
        public final void mo22674j() {
            super.mo22674j();
            mo22546a(mo65277q(), C11896i.m24255a(), new C32081h(this));
            TextUtils.equals(this.f83701m.f83695f, "following_relation");
            TextUtils.equals(this.f83701m.f83695f, "follower_relation");
        }

        /* renamed from: q */
        public final UserViewModel mo65277q() {
            C52671b jVar = new C32084j(this);
            Class<UserViewModel> cls = UserViewModel.class;
            C11944b b = mo22666b();
            if (b != null) {
                C11972h a = C11973a.m24361a(mo22542a(), b.mo22685b());
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getName());
                sb.append('_');
                sb.append(cls.getName());
                JediViewModel jediViewModel = (JediViewModel) a.mo22706a(sb.toString(), cls);
                C11926m a2 = jediViewModel.f31279c.mo22643a(UserViewModel.class);
                if (a2 != null) {
                    a2.binding(jediViewModel);
                }
                jediViewModel.mo22526a(jVar);
                return (UserViewModel) jediViewModel;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        /* renamed from: a */
        public final void mo65274a(User user) {
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f83702n.setUserData(userVerify);
            this.f83702n.mo48964b();
            this.itemView.setOnClickListener(new C32076e(this, user));
            CharSequence uid = user.getUid();
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            if (TextUtils.equals(uid, a.getCurUserId())) {
                this.f83705q.setVisibility(8);
            } else {
                this.f83705q.setVisibility(0);
                I18nFollowUserBtn i18nFollowUserBtn = this.f83705q;
                int followStatus = user.getFollowStatus();
                int i = 1;
                if (user.getFollowerStatus() != 1) {
                    i = 0;
                }
                i18nFollowUserBtn.mo65360a(followStatus, i);
            }
            this.f83705q.setOnClickListener(new C32077f(this, user));
            SharePrefCache inst = SharePrefCache.inst();
            C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
            C23051bf removeFollowerSwitch = inst.getRemoveFollowerSwitch();
            C52711k.m112236a((Object) removeFollowerSwitch, "SharePrefCache.inst().removeFollowerSwitch");
            Object d = removeFollowerSwitch.mo47782d();
            C52711k.m112236a(d, "SharePrefCache.inst().removeFollowerSwitch.cache");
            if (!((Boolean) d).booleanValue() || !this.f83701m.f83696g || !C52711k.m112239a((Object) this.f83701m.f83695f, (Object) "follower_relation")) {
                this.f83698j.getLayoutParams().width = 0;
            } else {
                this.f83698j.setOnClickListener(new C32078g(this, user));
                this.f83698j.getLayoutParams().width = -2;
            }
            mo65275a(user, user.getFollowStatus());
            user.getFollowStatus();
            if (m74472r() == 2 || m74472r() == 3) {
                if (this.f83701m.f83692c.get(user.getUid()) != null) {
                    Object obj = this.f83701m.f83692c.get(user.getUid());
                    if (obj == null) {
                        C52711k.m112234a();
                    }
                    ((Boolean) obj).booleanValue();
                    new C32075d(this, user);
                    Map<String, Boolean> map = this.f83701m.f83692c;
                    String uid2 = user.getUid();
                    C52711k.m112236a((Object) uid2, "user.uid");
                    map.put(uid2, Boolean.valueOf(false));
                    return;
                }
                this.f83706r.setVisibility(8);
            }
        }

        /* renamed from: a */
        public final void mo65275a(User user, int i) {
            this.f83704p.setVisibility(0);
            this.f83703o.setText(C47915gg.m103656e(user));
            this.f83704p.setText(user.getNickname());
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            C47916gh.m103675a(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f83703o);
        }

        public FollowItemViewHolder(FollowListAdapter followListAdapter, ViewGroup viewGroup) {
            C52711k.m112240b(viewGroup, "parent");
            this.f83701m = followListAdapter;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bos, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…wing_item, parent, false)");
            super(inflate);
            View findViewById = this.itemView.findViewById(R.id.ay2);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_avatar)");
            this.f83702n = (AvatarImageWithVerify) findViewById;
            View findViewById2 = this.itemView.findViewById(R.id.dl2);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.txt_user_name)");
            this.f83703o = (TextView) findViewById2;
            View findViewById3 = this.itemView.findViewById(R.id.dkb);
            C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.txt_desc)");
            this.f83704p = (TextView) findViewById3;
            View findViewById4 = this.itemView.findViewById(R.id.dkd);
            C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.txt_follow)");
            this.f83705q = (I18nFollowUserBtn) findViewById4;
            View findViewById5 = this.itemView.findViewById(R.id.b0_);
            C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.iv_edit_remark)");
            this.f83706r = (ImageView) findViewById5;
            View findViewById6 = this.itemView.findViewById(R.id.bmy);
            C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.more)");
            this.f83698j = (ImageView) findViewById6;
            C52760c a = C52728w.m112245a(FollowRelationTabViewModel.class);
            this.f83707s = C52732g.m112285a(new C32072a(this, a, a));
            C52760c a2 = C52728w.m112245a(FollowerRelationViewModel.class);
            this.f83700l = C52732g.m112285a(new C32073b(this, a2, a2));
            C52760c a3 = C52728w.m112245a(FollowingRelationViewModel.class);
            this.f83708t = C52732g.m112285a(new C32074c(this, a3, a3));
            this.f83709u = C52732g.m112285a(new C32083i(this));
            UnReadCircleView unReadCircleView = this.f83699k;
            C52711k.m112236a((Object) unReadCircleView, "unreadCircleView");
            ViewParent parent = unReadCircleView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f83699k);
                this.f83702n.addView(this.f83699k, 1);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$a */
    static final class C32085a extends C52712l implements C52671b<ViewGroup, FollowItemViewHolder> {

        /* renamed from: a */
        final /* synthetic */ FollowListAdapter f83737a;

        C32085a(FollowListAdapter followListAdapter) {
            this.f83737a = followListAdapter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            return new FollowItemViewHolder(this.f83737a, viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$b */
    static final class C32086b extends C52712l implements C52671b<ViewGroup, RecommendContactViewHolder> {

        /* renamed from: a */
        public static final C32086b f83738a = new C32086b();

        C32086b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            C32616c cVar = C32616c.f84865a;
            Context context = viewGroup.getContext();
            C52711k.m112236a((Object) context, "parent.context");
            return new RecommendContactViewHolder(cVar.createRecommendContactItemView(context));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$c */
    static final class C32087c extends C52712l implements C52671b<ViewGroup, RecommendRelationUserViewHolder> {

        /* renamed from: a */
        public static final C32087c f83739a = new C32087c();

        C32087c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            Context context = viewGroup.getContext();
            C52711k.m112236a((Object) context, "parent.context");
            RecommendUserItemView recommendUserItemView = new RecommendUserItemView(context, null, 0, 6, null);
            return new RecommendRelationUserViewHolder(recommendUserItemView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$d */
    static final class C32088d extends C52712l implements C52671b<ViewGroup, RecommendFriendItemViewHolder> {

        /* renamed from: a */
        public static final C32088d f83740a = new C32088d();

        C32088d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            Context context = viewGroup.getContext();
            C52711k.m112236a((Object) context, "parent.context");
            RecommendSuggestedItemView recommendSuggestedItemView = new RecommendSuggestedItemView(context, null, 0, 6, null);
            return new RecommendFriendItemViewHolder(recommendSuggestedItemView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$e */
    static final class C32089e extends C52712l implements C52671b<ViewGroup, RecommendSuggestTitleViewHolder> {

        /* renamed from: a */
        public static final C32089e f83741a = new C32089e();

        C32089e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b4b, viewGroup, false);
            C52711k.m112236a((Object) inflate, "recommendTitleMT");
            Context context = viewGroup.getContext();
            C52711k.m112236a((Object) context, "parent.context");
            return new RecommendSuggestTitleViewHolder(inflate, context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$f */
    static final class C32090f extends C52712l implements C52671b<ViewGroup, FollowItemViewHolder> {

        /* renamed from: a */
        final /* synthetic */ FollowListAdapter f83742a;

        C32090f(FollowListAdapter followListAdapter) {
            this.f83742a = followListAdapter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            return new FollowItemViewHolder(this.f83742a, viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$g */
    static final class C32091g extends C52712l implements C52671b<ViewGroup, RelationStatusViewHolder> {

        /* renamed from: a */
        public static final C32091g f83743a = new C32091g();

        C32091g() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            return new RelationStatusViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$h */
    static final class C32092h extends C52712l implements C52671b<ViewGroup, RelationStatusViewHolder> {

        /* renamed from: a */
        public static final C32092h f83744a = new C32092h();

        C32092h() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            return new RelationStatusViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$i */
    static final class C32093i extends C52712l implements C52671b<ViewGroup, RelationStatusViewHolder> {

        /* renamed from: a */
        public static final C32093i f83745a = new C32093i();

        C32093i() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            return new RelationStatusViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$j */
    static final class C32094j extends C52712l implements C52671b<ViewGroup, RelationStatusViewHolder> {

        /* renamed from: a */
        public static final C32094j f83746a = new C32094j();

        C32094j() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            return new RelationStatusViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$k */
    static final class C32095k extends C52712l implements C52671b<ViewGroup, RelationStatusViewHolder> {

        /* renamed from: a */
        public static final C32095k f83747a = new C32095k();

        C32095k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            return new RelationStatusViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$l */
    static final class C32096l extends C52712l implements C52671b<ViewGroup, RelationStatusViewHolder> {

        /* renamed from: a */
        public static final C32096l f83748a = new C32096l();

        C32096l() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            return new RelationStatusViewHolder(viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$m */
    static final class C32097m extends C52712l implements C52671b<ViewGroup, RecommendRelationTitleViewHolder> {

        /* renamed from: a */
        public static final C32097m f83749a = new C32097m();

        C32097m() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bpc, viewGroup, false);
            C52711k.m112236a((Object) inflate, "view");
            return new RecommendRelationTitleViewHolder(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter$n */
    static final class C32098n extends C52712l implements C52671b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ FollowListAdapter f83750a;

        /* renamed from: b */
        final /* synthetic */ int f83751b;

        C32098n(FollowListAdapter followListAdapter, int i) {
            this.f83750a = followListAdapter;
            this.f83751b = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int i;
            int intValue = ((Number) obj).intValue();
            int i2 = this.f83751b;
            boolean z = false;
            Object a = this.f83750a.mo22589a(intValue, false);
            if (a instanceof C32003j) {
                i = ((C32003j) a).f83561a;
            } else if (a instanceof C32004k) {
                i = ((C32004k) a).f83563a;
            } else if (a instanceof C32002i) {
                i = ((C32002i) a).f83558a;
            } else if (a instanceof RecommendContact) {
                i = 3;
            } else {
                i = 0;
            }
            if (i2 == i) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: f */
    public final String mo65272f() {
        if (TextUtils.equals(this.f83695f, "following_relation")) {
            if (this.f83696g) {
                return "following";
            }
            return "other_following";
        } else if (!TextUtils.equals(this.f83695f, "follower_relation")) {
            return "";
        } else {
            if (this.f83696g) {
                return "fans";
            }
            return "other_fans";
        }
    }

    /* renamed from: g */
    public final int mo65273g() {
        if (!this.f83696g && TextUtils.equals(this.f83695f, "follower_relation")) {
            return 11;
        }
        if (!this.f83696g && TextUtils.equals(this.f83695f, "following_relation")) {
            return 10;
        }
        if (!this.f83696g || !TextUtils.equals(this.f83695f, "follower_relation")) {
            return 0;
        }
        return 9;
    }

    /* renamed from: b */
    private final C52671b<Integer, Boolean> m74467b(int i) {
        return new C32098n<>(this, i);
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        int a = super.mo48641a(i);
        if (a != 0) {
            return a;
        }
        return this.f62535a.mo22701b(i - mo48643e());
    }

    /* renamed from: a */
    public final void mo48639a(C11959h<JediViewHolder<? extends C11796d, ?>> hVar) {
        C52711k.m112240b(hVar, "registry");
        C11959h<JediViewHolder<? extends C11796d, ?>> hVar2 = hVar;
        C11960a.m24344a((C11959h) hVar2, m74467b(0), (C52682m) null, (C52671b) new C32085a(this), 2, (Object) null);
        C11960a.m24344a((C11959h) hVar2, m74467b(1), (C52682m) null, (C52671b) new C32090f(this), 2, (Object) null);
        C11960a.m24344a((C11959h) hVar2, m74467b(7), (C52682m) null, (C52671b) C32091g.f83743a, 2, (Object) null);
        C11960a.m24344a((C11959h) hVar2, m74467b(8), (C52682m) null, (C52671b) C32092h.f83744a, 2, (Object) null);
        C11960a.m24344a((C11959h) hVar2, m74467b(9), (C52682m) null, (C52671b) C32093i.f83745a, 2, (Object) null);
        C11960a.m24344a((C11959h) hVar2, m74467b(10), (C52682m) null, (C52671b) C32094j.f83746a, 2, (Object) null);
        C11960a.m24344a((C11959h) hVar2, m74467b(11), (C52682m) null, (C52671b) C32095k.f83747a, 2, (Object) null);
        C11960a.m24344a((C11959h) hVar2, m74467b(12), (C52682m) null, (C52671b) C32096l.f83748a, 2, (Object) null);
        C11960a.m24344a((C11959h) hVar2, m74467b(4), (C52682m) null, (C52671b) C32097m.f83749a, 2, (Object) null);
        C11960a.m24344a((C11959h) hVar2, m74467b(3), (C52682m) null, (C52671b) C32086b.f83738a, 2, (Object) null);
        C11960a.m24344a((C11959h) hVar2, m74467b(2), (C52682m) null, (C52671b) C32087c.f83739a, 2, (Object) null);
        C11960a.m24344a((C11959h) hVar2, m74467b(13), (C52682m) null, (C52671b) C32088d.f83740a, 2, (Object) null);
        C11960a.m24344a((C11959h) hVar2, m74467b(14), (C52682m) null, (C52671b) C32089e.f83741a, 2, (Object) null);
    }

    public FollowListAdapter(C0184k kVar, String str, boolean z) {
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(str, "relationType");
        super(kVar, new C32001h(), null, 4, null);
        this.f83694e = kVar;
        this.f83695f = str;
        this.f83696g = z;
    }
}
