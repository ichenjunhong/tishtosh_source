package com.p683ss.android.ugc.aweme.commercialize.profile;

import android.app.Activity;
import android.arch.lifecycle.C0199s;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.widget.NestedScrollView;
import android.support.p030v4.widget.NestedScrollView.C1078b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.lighten.p766a.p767a.C12156a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23689d;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartRoundImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26514h;
import com.p683ss.android.ugc.aweme.commercialize.utils.ViewWrapper;
import com.p683ss.android.ugc.aweme.commercialize.widget.C26818c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2091a.C40203a;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
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
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e */
public final class C26184e extends C23689d implements C0199s<C23274a>, C40203a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f69150a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26184e.class), "mRootView", "getMRootView()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26184e.class), "mTitleBar", "getMTitleBar()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26184e.class), "mBack", "getMBack()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26184e.class), "mTitle", "getMTitle()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26184e.class), "mScrollView", "getMScrollView()Landroid/support/v4/widget/NestedScrollView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26184e.class), "mUserAvatar", "getMUserAvatar()Lcom/ss/android/ugc/aweme/base/ui/SmartRoundImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26184e.class), "mUserName", "getMUserName()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26184e.class), "mUserDesc", "getMUserDesc()Landroid/widget/TextView;"))};

    /* renamed from: e */
    public static final String f69151e = C26184e.class.getSimpleName();

    /* renamed from: j */
    public static final C26185a f69152j = new C26185a(null);

    /* renamed from: b */
    final C52668f f69153b = C52732g.m112285a(new C26192h(this));

    /* renamed from: c */
    public Aweme f69154c;

    /* renamed from: d */
    public String f69155d;

    /* renamed from: k */
    private final C52668f f69156k = C52732g.m112285a(new C26189e(this));

    /* renamed from: l */
    private final C52668f f69157l = C52732g.m112285a(new C26188d(this));

    /* renamed from: m */
    private final C52668f f69158m = C52732g.m112285a(new C26191g(this));

    /* renamed from: n */
    private final C52668f f69159n = C52732g.m112285a(new C26190f(this));

    /* renamed from: o */
    private final C52668f f69160o = C52732g.m112285a(new C26193i(this));

    /* renamed from: p */
    private final C52668f f69161p = C52732g.m112285a(new C26195k(this));

    /* renamed from: q */
    private final C52668f f69162q = C52732g.m112285a(new C26194j(this));

    /* renamed from: r */
    private String f69163r;

    /* renamed from: s */
    private DataCenter f69164s;

    /* renamed from: t */
    private C23279d f69165t;

    /* renamed from: u */
    private HashMap f69166u;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$a */
    public static final class C26185a {
        private C26185a() {
        }

        public /* synthetic */ C26185a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C12156a m63494a(User user) {
            UrlModel urlModel;
            if (user == null) {
                return null;
            }
            if (user.getAvatarMedium() != null) {
                urlModel = user.getAvatarMedium();
            } else if (user.getAvatarThumb() != null) {
                urlModel = user.getAvatarThumb();
            } else if (user.getAvatarLarger() != null) {
                urlModel = user.getAvatarLarger();
            } else {
                urlModel = null;
            }
            if (urlModel == null) {
                return null;
            }
            return new C12156a(urlModel.getUrlList());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$b */
    static final class C26186b extends C52712l implements C52671b<C26818c, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C26184e f69167a;

        C26186b(C26184e eVar) {
            this.f69167a = eVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C26818c cVar = (C26818c) obj;
            C52711k.m112240b(cVar, "$receiver");
            cVar.f70649a = this.f69167a.f69154c;
            cVar.f70650b = this.f69167a;
            cVar.f70651c = this.f69167a.f69155d;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$c */
    static final class C26187c implements C1078b {

        /* renamed from: a */
        final /* synthetic */ C26184e f69168a;

        C26187c(C26184e eVar) {
            this.f69168a = eVar;
        }

        /* renamed from: a */
        public final void mo3394a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            Rect c = C23729p.m58268c((View) this.f69168a.f69153b.getValue());
            Rect c2 = C23729p.m58268c((View) this.f69168a.mo53818f());
            if (c.bottom <= c2.bottom || this.f69168a.mo53817e().getAlpha() != 0.0f) {
                if (c.bottom < c2.bottom && this.f69168a.mo53817e().getAlpha() == 1.0f) {
                    this.f69168a.mo53817e().animate().alpha(0.0f).setDuration(350).start();
                }
                return;
            }
            this.f69168a.mo53817e().animate().alpha(1.0f).setDuration(350).start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$d */
    static final class C26188d extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C26184e f69169a;

        C26188d(C26184e eVar) {
            this.f69169a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f69169a.mo53813a((int) R.id.ij);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$e */
    static final class C26189e extends C52712l implements C52670a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ C26184e f69170a;

        C26189e(C26184e eVar) {
            this.f69170a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ConstraintLayout) this.f69170a.mo53813a((int) R.id.cfl);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$f */
    static final class C26190f extends C52712l implements C52670a<NestedScrollView> {

        /* renamed from: a */
        final /* synthetic */ C26184e f69171a;

        C26190f(C26184e eVar) {
            this.f69171a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (NestedScrollView) this.f69171a.mo53813a((int) R.id.chy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$g */
    static final class C26191g extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C26184e f69172a;

        C26191g(C26184e eVar) {
            this.f69172a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f69172a.mo53813a((int) R.id.title);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$h */
    static final class C26192h extends C52712l implements C52670a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ C26184e f69173a;

        C26192h(C26184e eVar) {
            this.f69173a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ConstraintLayout) this.f69173a.mo53813a((int) R.id.d10);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$i */
    static final class C26193i extends C52712l implements C52670a<SmartRoundImageView> {

        /* renamed from: a */
        final /* synthetic */ C26184e f69174a;

        C26193i(C26184e eVar) {
            this.f69174a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SmartRoundImageView) this.f69174a.mo53813a((int) R.id.dm3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$j */
    static final class C26194j extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C26184e f69175a;

        C26194j(C26184e eVar) {
            this.f69175a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f69175a.mo53813a((int) R.id.f5x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$k */
    static final class C26195k extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C26184e f69176a;

        C26195k(C26184e eVar) {
            this.f69176a = eVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f69176a.mo53813a((int) R.id.dn1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.e$l */
    static final class C26196l implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C52670a f69177a;

        C26196l(C52670a aVar) {
            this.f69177a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f69177a.invoke();
        }
    }

    /* renamed from: h */
    private final View m63486h() {
        return (View) this.f69156k.getValue();
    }

    /* renamed from: a */
    public final View mo53813a(int i) {
        if (this.f69166u == null) {
            this.f69166u = new HashMap();
        }
        View view = (View) this.f69166u.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f69166u.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    public final TextView mo53817e() {
        return (TextView) this.f69158m.getValue();
    }

    /* renamed from: f */
    public final TextView mo53818f() {
        return (TextView) this.f69161p.getValue();
    }

    /* renamed from: g */
    public final Fragment mo53819g() {
        return this;
    }

    public final void onDestroy() {
        super.onDestroy();
        DataCenter dataCenter = this.f69164s;
        if (dataCenter != null) {
            dataCenter.mo48225a((C0199s<C23274a>) this);
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f69166u != null) {
            this.f69166u.clear();
        }
    }

    /* renamed from: a */
    public final void mo53815a(String str) {
        this.f69163r = str;
    }

    /* renamed from: a */
    public final void mo53816a(boolean z) {
        new StringBuilder("visible=").append(z);
        setUserVisibleHint(z);
    }

    /* renamed from: a */
    public final void mo53814a(C52670a<C52860x> aVar) {
        C52711k.m112240b(aVar, "back");
        ((ImageView) this.f69157l.getValue()).setOnClickListener(new C26196l(aVar));
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        DataCenter dataCenter = this.f69164s;
        if (dataCenter != null) {
            dataCenter.mo48228a("AD_PROFILE_VISIBILITY_CHANGED", (Object) Boolean.valueOf(z));
        }
        C23729p.m58263b((Activity) getActivity());
        if (z) {
            Activity activity = getActivity();
            if (activity != null && VERSION.SDK_INT >= 23) {
                Window window = activity.getWindow();
                C52711k.m112236a((Object) window, "activity.window");
                View decorView = window.getDecorView();
                C52711k.m112236a((Object) decorView, "activity.window.decorView");
                int systemUiVisibility = decorView.getSystemUiVisibility();
                Window window2 = activity.getWindow();
                C52711k.m112236a((Object) window2, "activity.window");
                View decorView2 = window2.getDecorView();
                C52711k.m112236a((Object) decorView2, "activity.window.decorView");
                decorView2.setSystemUiVisibility(systemUiVisibility | VideoCacheReadBuffersizeExperiment.DEFAULT);
            }
        } else {
            Activity activity2 = getActivity();
            if (activity2 != null && VERSION.SDK_INT >= 23) {
                Window window3 = activity2.getWindow();
                C52711k.m112236a((Object) window3, "activity.window");
                View decorView3 = window3.getDecorView();
                C52711k.m112236a((Object) decorView3, "activity.window.decorView");
                decorView3.setSystemUiVisibility(PreloadTask.BYTE_UNIT_NUMBER);
            }
        }
        C26514h.f69839c = z;
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null && str.hashCode() == 860337036 && str.equals("ON_VIDEO_CONTAINER_SIZE_CHANGE")) {
            Rect c = C23729p.m58268c(m63486h().findViewById(R.id.f6m));
            View findViewById = m63486h().findViewById(R.id.doz);
            Rect c2 = C23729p.m58268c(findViewById);
            View findViewById2 = m63486h().findViewById(R.id.dwh);
            Rect c3 = C23729p.m58268c(m63486h().findViewById(R.id.dwh));
            float a = (float) C23728o.m58241a(-16.0d);
            C52711k.m112236a((Object) findViewById2, "bottomBarLayout");
            float translationY = (((float) c3.top) + (a - findViewById2.getTranslationY())) - ((float) c.top);
            if (translationY - ((float) c2.height()) > 0.0f) {
                C52711k.m112236a((Object) findViewById, "videoContainer");
                findViewById.setTranslationY((translationY - ((float) c2.height())) / 2.0f);
            }
            Rect c4 = C23729p.m58268c(m63486h());
            View findViewById3 = m63486h().findViewById(R.id.dp2);
            int i = c4.bottom - C23729p.m58268c(findViewById3).top;
            if (i > 0) {
                C52711k.m112236a((Object) findViewById3, "videoCover");
                ViewWrapper viewWrapper = new ViewWrapper(findViewById3);
                viewWrapper.setWidth(c4.width());
                viewWrapper.setHeight(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            super.onViewCreated(r4, r5)
            r4 = r3
            android.support.v4.app.Fragment r4 = (android.support.p030v4.app.Fragment) r4
            android.arch.lifecycle.y r5 = android.arch.lifecycle.C0214z.m438a(r4)
            r0 = r3
            android.arch.lifecycle.k r0 = (android.arch.lifecycle.C0184k) r0
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r5 = com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter.m57235a(r5, r0)
            r3.f69164s = r5
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r5 = r3.f69164s
            if (r5 == 0) goto L_0x0024
            java.lang.String r0 = "ON_VIDEO_CONTAINER_SIZE_CHANGE"
            r1 = r3
            android.arch.lifecycle.s r1 = (android.arch.lifecycle.C0199s) r1
            r5.mo48226a(r0, r1)
        L_0x0024:
            android.view.View r5 = r3.m63486h()
            com.ss.android.ugc.aweme.arch.widgets.base.d r4 = com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d.m57256a(r4, r5)
            r3.f69165t = r4
            com.ss.android.ugc.aweme.arch.widgets.base.d r4 = r3.f69165t
            if (r4 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r5 = r3.f69164s
            r4.mo48252a(r5)
        L_0x0037:
            com.ss.android.ugc.aweme.arch.widgets.base.d r4 = r3.f69165t
            if (r4 == 0) goto L_0x0062
            r5 = 2132017234(0x7f140052, float:1.967274E38)
            com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget r0 = new com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget
            r0.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r0 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r0
            r4.mo48255b(r5, r0)
            r5 = 2132024477(0x7f141c9d, float:1.9687431E38)
            com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget r0 = new com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoPlayWidget
            r0.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r0 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r0
            r4.mo48255b(r5, r0)
            r5 = 2132024486(0x7f141ca6, float:1.968745E38)
            com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget r0 = new com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoDescWidget
            r0.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r0 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r0
            r4.mo48255b(r5, r0)
        L_0x0062:
            android.os.Bundle r4 = r3.getArguments()
            r5 = 0
            if (r4 == 0) goto L_0x0070
            java.lang.String r0 = "aweme_id"
            java.lang.String r4 = r4.getString(r0)
            goto L_0x0071
        L_0x0070:
            r4 = r5
        L_0x0071:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64142c(r4)
            r3.f69154c = r4
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x0084
            java.lang.String r0 = "enter_from"
            java.lang.String r4 = r4.getString(r0)
            goto L_0x0085
        L_0x0084:
            r4 = r5
        L_0x0085:
            r3.f69155d = r4
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r4 = r3.f69164s
            if (r4 == 0) goto L_0x00a2
            java.lang.String r0 = "AD_PROFILE_PARAMS"
            com.ss.android.ugc.aweme.commercialize.widget.c$a r1 = new com.ss.android.ugc.aweme.commercialize.widget.c$a
            r1.<init>()
            com.ss.android.ugc.aweme.commercialize.profile.e$b r2 = new com.ss.android.ugc.aweme.commercialize.profile.e$b
            r2.<init>(r3)
            d.f.a.b r2 = (p2628d.p2639f.p2640a.C52671b) r2
            com.ss.android.ugc.aweme.commercialize.utils.bl r1 = r1.mo54142a(r2)
            T r1 = r1.f69675a
            r4.mo48228a(r0, r1)
        L_0x00a2:
            android.view.View r4 = r3.m63486h()
            android.content.Context r0 = r3.getContext()
            int r0 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55512d(r0)
            r1 = 0
            r4.setPadding(r1, r0, r1, r1)
            android.widget.TextView r4 = r3.mo53817e()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f69154c
            if (r0 == 0) goto L_0x00c5
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = r0.getNickname()
            goto L_0x00c6
        L_0x00c5:
            r0 = r5
        L_0x00c6:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setText(r0)
            d.f r4 = r3.f69159n
            java.lang.Object r4 = r4.getValue()
            android.support.v4.widget.NestedScrollView r4 = (android.support.p030v4.widget.NestedScrollView) r4
            com.ss.android.ugc.aweme.commercialize.profile.e$c r0 = new com.ss.android.ugc.aweme.commercialize.profile.e$c
            r0.<init>(r3)
            android.support.v4.widget.NestedScrollView$b r0 = (android.support.p030v4.widget.NestedScrollView.C1078b) r0
            r4.setOnScrollChangeListener(r0)
            android.widget.TextView r4 = r3.mo53818f()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f69154c
            if (r0 == 0) goto L_0x00f0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = r0.getNickname()
            goto L_0x00f1
        L_0x00f0:
            r0 = r5
        L_0x00f1:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setText(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r3.f69154c
            if (r4 == 0) goto L_0x00ff
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getAuthor()
            goto L_0x0100
        L_0x00ff:
            r4 = r5
        L_0x0100:
            com.bytedance.lighten.a.a.a r4 = com.p683ss.android.ugc.aweme.commercialize.profile.C26184e.C26185a.m63494a(r4)
            if (r4 == 0) goto L_0x011b
            com.bytedance.lighten.a.t r4 = com.bytedance.lighten.p766a.C12203q.m24643a(r4)
            d.f r0 = r3.f69160o
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.base.ui.SmartRoundImageView r0 = (com.p683ss.android.ugc.aweme.base.p1420ui.SmartRoundImageView) r0
            com.bytedance.lighten.a.k r0 = (com.bytedance.lighten.p766a.C12197k) r0
            com.bytedance.lighten.a.t r4 = r4.mo23116a(r0)
            r4.mo23121a()
        L_0x011b:
            d.f r4 = r3.f69162q
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f69154c
            if (r0 == 0) goto L_0x0137
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0137
            com.ss.android.ugc.aweme.commercialize.model.r r0 = r0.getFakeAuthor()
            if (r0 == 0) goto L_0x0137
            java.lang.String r5 = r0.getDescription()
        L_0x0137:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.profile.C26184e.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.ban, viewGroup, false);
    }
}
