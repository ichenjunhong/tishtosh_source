package com.p683ss.android.ugc.aweme.favorites.viewholder;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel;
import com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel.C29780f;
import com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixState;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.MixStatisStruct;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.search.C41432l;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MediaMixViewHolder */
public final class MediaMixViewHolder extends JediSimpleViewHolder<MixStruct> {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f77704f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MediaMixViewHolder.class), "mMediaMixListViewModel", "getMMediaMixListViewModel()Lcom/ss/android/ugc/aweme/favorites/viewmodel/MediaMixListViewModel;"))};

    /* renamed from: j */
    public static final C29751b f77705j = new C29751b(null);

    /* renamed from: g */
    public int f77706g;

    /* renamed from: k */
    private final C52668f f77707k;

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MediaMixViewHolder$a */
    public static final class C29750a extends C52712l implements C52670a<MediaMixListViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f77708a;

        /* renamed from: b */
        final /* synthetic */ C52760c f77709b;

        /* renamed from: c */
        final /* synthetic */ C52760c f77710c;

        public C29750a(JediViewHolder jediViewHolder, C52760c cVar, C52760c cVar2) {
            this.f77708a = jediViewHolder;
            this.f77709b = cVar;
            this.f77710c = cVar2;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1 */
        /* JADX WARNING: type inference failed for: r3v2, types: [com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel] */
        /* JADX WARNING: type inference failed for: r3v4, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v8, types: [com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: type inference failed for: r3v9 */
        /* JADX WARNING: type inference failed for: r3v10 */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v8, types: [com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel]
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
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel invoke() {
            /*
                r5 = this;
                com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r5.f77708a
                android.arch.lifecycle.k r0 = r0.mo22678n()
                java.lang.Object r0 = com.bytedance.jedi.ext.adapter.C11941a.m24314a(r0)
                d.k.c r1 = r5.f77710c
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
                d.k.c r4 = r5.f77709b     // Catch:{ ae -> 0x0037 }
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
                d.k.c r2 = r5.f77709b
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
                d.k.c r2 = r5.f77709b
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
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.favorites.viewholder.MediaMixViewHolder.C29750a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MediaMixViewHolder$b */
    public static final class C29751b {
        private C29751b() {
        }

        public /* synthetic */ C29751b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.MediaMixViewHolder$c */
    static final class C29752c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediaMixViewHolder f77711a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f77712b;

        /* renamed from: c */
        final /* synthetic */ TextView f77713c;

        C29752c(MediaMixViewHolder mediaMixViewHolder, MixStruct mixStruct, TextView textView) {
            this.f77711a = mediaMixViewHolder;
            this.f77712b = mixStruct;
            this.f77713c = textView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            MixStatisStruct mixStatisStruct = this.f77712b.statis;
            if (mixStatisStruct != null) {
                mixStatisStruct.hasUpdatedEpisode = 0;
            }
            TextView textView = this.f77713c;
            C52711k.m112236a((Object) textView, "statTv");
            View view2 = textView;
            TextView textView2 = this.f77713c;
            C52711k.m112236a((Object) textView2, "statTv");
            MediaMixViewHolder.m69852a(view2, (int) C9432q.m18687b(textView2.getContext(), 0.0f));
            TextView textView3 = this.f77713c;
            C52711k.m112236a((Object) textView3, "statTv");
            textView3.setVisibility(4);
            TextView textView4 = this.f77713c;
            C52711k.m112236a((Object) textView4, "statTv");
            textView4.setText("");
            this.f77711a.mo22552a(this.f77711a.mo60005p(), (C52671b<? super S1, ? extends R>) new C52671b<MediaMixState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C29752c f77714a;

                {
                    this.f77714a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    boolean z;
                    String str;
                    String str2;
                    CharSequence charSequence;
                    MediaMixState mediaMixState = (MediaMixState) obj;
                    C52711k.m112240b(mediaMixState, "it");
                    if (!C52711k.m112239a((Object) "general_search", (Object) mediaMixState.getEnterFrom()) || !C52711k.m112239a((Object) "general_search_aladdin_more", (Object) mediaMixState.getEnterMethod())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (C52711k.m112239a((Object) "general_search", (Object) mediaMixState.getEnterFrom())) {
                        str = "general_search_aladdin_more";
                    } else {
                        str = "favourite";
                    }
                    if (z) {
                        str2 = mediaMixState.getEnterFrom();
                    } else {
                        str2 = "favourite";
                    }
                    Long l = null;
                    if (this.f77714a.f77711a.f77706g == 2) {
                        str = "homepage_compilation_list";
                        IAccountUserService g = C20854a.m53167g();
                        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                        User curUser = g.getCurUser();
                        C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
                        CharSequence uid = curUser.getUid();
                        if (!TextUtils.isEmpty(uid)) {
                            User user = this.f77714a.f77712b.author;
                            if (user != null) {
                                charSequence = user.getUid();
                            } else {
                                charSequence = null;
                            }
                            if (TextUtils.equals(uid, charSequence)) {
                                str2 = "personal_homepage";
                            }
                        }
                        str2 = "others_homepage";
                    }
                    View view = this.f77714a.f77711a.itemView;
                    C52711k.m112236a((Object) view, "itemView");
                    User user2 = this.f77714a.f77712b.author;
                    C52711k.m112236a((Object) user2, "item.author");
                    SmartRoute withParam = SmartRouter.buildRoute(view.getContext(), "aweme://mix/detail").withParam("mix_id", this.f77714a.f77712b.mixId).withParam("uid", user2.getUid());
                    String str3 = C22835a.f61196a;
                    User user3 = this.f77714a.f77712b.author;
                    C52711k.m112236a((Object) user3, "item.author");
                    SmartRoute withParam2 = withParam.withParam(str3, user3.getSecUid()).withParam("event_type", str2).withParam("enter_method", str);
                    String str4 = "mix_enter_episode_num";
                    MixStatisStruct mixStatisStruct = this.f77714a.f77712b.statis;
                    if (mixStatisStruct != null) {
                        l = Long.valueOf(mixStatisStruct.currentEpisode);
                    }
                    withParam2.withParam(str4, (Serializable) l).open();
                    if (z) {
                        String a = C41432l.m91251a().provideSearchContext().mo56813a(3);
                        C26890h.m65011a("search_result_click", new C23089d().mo47829a("enter_from", "search_compilation_page").mo47829a("token_type", "video_compilation").mo47829a("search_id", a).mo47829a("search_keyword", mediaMixState.getSearchKeyword()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(a)).mo47829a("is_aladdin", "1").f61491a);
                    }
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: p */
    public final MediaMixListViewModel mo60005p() {
        return (MediaMixListViewModel) this.f77707k.getValue();
    }

    public MediaMixViewHolder(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.buc, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…media_mix, parent, false)");
        super(inflate);
        C52760c a = C52728w.m112245a(MediaMixListViewModel.class);
        this.f77707k = C52732g.m112285a(new C29750a(this, a, a));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        long j;
        String str;
        boolean z;
        String str2;
        MixStruct mixStruct = (MixStruct) obj;
        C52711k.m112240b(mixStruct, "item");
        C23515d.m57669a((RemoteImageView) this.itemView.findViewById(R.id.a22), mixStruct.cover);
        TextView textView = (TextView) this.itemView.findViewById(R.id.dlo);
        if (mixStruct.status.getStatus() == 4) {
            View view = this.itemView;
            C52711k.m112236a((Object) view, "itemView");
            Resources resources = view.getResources();
            Object[] objArr = new Object[1];
            User user = mixStruct.author;
            C52711k.m112236a((Object) user, "item.author");
            CharSequence remarkName = user.getRemarkName();
            if (remarkName == null || remarkName.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                User user2 = mixStruct.author;
                C52711k.m112236a((Object) user2, "item.author");
                str2 = user2.getRemarkName();
            } else {
                User user3 = mixStruct.author;
                C52711k.m112236a((Object) user3, "item.author");
                str2 = user3.getNickname();
            }
            objArr[0] = str2;
            resources.getString(R.string.agk, objArr);
        }
        View findViewById = this.itemView.findViewById(R.id.bpp);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById<TextView>(R.id.name)");
        ((TextView) findViewById).setText(mixStruct.mixName);
        MixStatisStruct mixStatisStruct = mixStruct.statis;
        if (mixStatisStruct != null) {
            j = mixStatisStruct.hasUpdatedEpisode;
        } else {
            j = 0;
        }
        if (j > 0) {
            C52711k.m112236a((Object) textView, "statTv");
            m69852a(textView, (int) C9432q.m18687b(textView.getContext(), 16.0f));
            textView.setVisibility(0);
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            textView.setText(view2.getResources().getString(R.string.c5n, new Object[]{Long.valueOf(mixStruct.statis.hasUpdatedEpisode)}));
        } else {
            C52711k.m112236a((Object) textView, "statTv");
            m69852a(textView, (int) C9432q.m18687b(textView.getContext(), 0.0f));
            textView.setVisibility(4);
            textView.setText("");
        }
        View findViewById2 = this.itemView.findViewById(R.id.csi);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById<TextView>(R.id.stat)");
        TextView textView2 = (TextView) findViewById2;
        MixStatisStruct mixStatisStruct2 = mixStruct.statis;
        if (mixStatisStruct2 == null) {
            str = "";
        } else {
            View view3 = this.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            str = view3.getResources().getString(R.string.c5m, new Object[]{C33095b.m76068a(mixStatisStruct2.playVV), C33095b.m76068a(mixStatisStruct2.updatedToEpisode)});
            C52711k.m112236a((Object) str, "itemView.resources.getSt…statis.updatedToEpisode))");
        }
        textView2.setText(str);
        this.itemView.setOnClickListener(new C29752c(this, mixStruct, textView));
        MediaMixListViewModel p = mo60005p();
        C52711k.m112240b(mixStruct, "mix");
        p.mo22527b(new C29780f(p, mixStruct));
    }

    /* renamed from: a */
    public static void m69852a(View view, int i) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            layoutParams = null;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        if (VERSION.SDK_INT >= 17) {
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(i);
            }
        } else if (marginLayoutParams != null) {
            marginLayoutParams.rightMargin = i;
        }
    }
}
