package com.p683ss.android.ugc.aweme.movie.view;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24637c;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24622b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.detail.C27311a;
import com.p683ss.android.ugc.aweme.detail.C27365i;
import com.p683ss.android.ugc.aweme.detail.base.C27323c;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.location.p1930a.C36254a;
import com.p683ss.android.ugc.aweme.movie.presenter.C37184a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40320dc;
import com.p683ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.movie.view.f */
public final class C37199f extends C24637c implements C37192a {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f94963d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37199f.class), "mRecordView", "getMRecordView()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37199f.class), "titleTextView", "getTitleTextView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37199f.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37199f.class), "mHeadLayout", "getMHeadLayout()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37199f.class), "buttonDelegate", "getButtonDelegate()Lcom/ss/android/ugc/aweme/detail/base/DetailRecordButtonDelegate;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37199f.class), "widgetDelegate", "getWidgetDelegate()Lcom/ss/android/ugc/aweme/movie/view/MovieDetailWidgetDelegate;"))};

    /* renamed from: m */
    public static final C37200a f94964m = new C37200a(null);

    /* renamed from: J */
    private C37184a f94965J;

    /* renamed from: K */
    private float f94966K;

    /* renamed from: L */
    private float f94967L;

    /* renamed from: M */
    private String f94968M;

    /* renamed from: O */
    private String f94969O;

    /* renamed from: P */
    private String f94970P;

    /* renamed from: Q */
    private MvModel f94971Q;

    /* renamed from: R */
    private C36254a f94972R;

    /* renamed from: S */
    private String f94973S;

    /* renamed from: T */
    private String f94974T;

    /* renamed from: U */
    private final C52668f f94975U = C52732g.m112285a(new C37201b(this));

    /* renamed from: V */
    private final C52668f f94976V = C52732g.m112285a(new C37209j(this));

    /* renamed from: W */
    private HashMap f94977W;

    /* renamed from: e */
    public String f94978e;

    /* renamed from: j */
    public Integer f94979j;

    /* renamed from: k */
    public String f94980k;

    /* renamed from: l */
    public final LogPbBean f94981l = new LogPbBean();

    /* renamed from: n */
    private C37195c f94982n;

    /* renamed from: o */
    private final C52668f f94983o = C52732g.m112285a(new C37204e(this));

    /* renamed from: p */
    private final C52668f f94984p = C52732g.m112285a(new C37208i(this));

    /* renamed from: q */
    private final C52668f f94985q = C52732g.m112285a(new C37205f(this));

    /* renamed from: r */
    private final C52668f f94986r = C52732g.m112285a(new C37203d(this));

    /* renamed from: com.ss.android.ugc.aweme.movie.view.f$a */
    public static final class C37200a {
        private C37200a() {
        }

        public /* synthetic */ C37200a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.f$b */
    static final class C37201b extends C52712l implements C52670a<C27323c> {

        /* renamed from: a */
        final /* synthetic */ C37199f f94987a;

        C37201b(C37199f fVar) {
            this.f94987a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f94987a.mo76529a().mo76523a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.f$c */
    static final class C37202c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37199f f94988a;

        C37202c(C37199f fVar) {
            this.f94988a = fVar;
        }

        public final void onClick(View view) {
            int i;
            String str;
            String str2;
            String str3;
            String str4;
            ClickInstrumentation.onClick(view);
            C37212h hVar = new C37212h();
            Fragment fragment = this.f94988a;
            String str5 = this.f94988a.f94978e;
            Integer num = this.f94988a.f94979j;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            hVar.startRecordMovie(fragment, str5, i);
            String str6 = "shoot";
            C23089d a = C23089d.m56640a();
            String str7 = "shoot_way";
            Integer num2 = this.f94988a.f94979j;
            if (num2 != null && num2.intValue() == 1) {
                str = "jianying_mv_page";
            } else {
                str = "mv_page";
            }
            C23089d a2 = a.mo47829a(str7, str);
            String str8 = "enter_from";
            Integer num3 = this.f94988a.f94979j;
            if (num3 != null && num3.intValue() == 1) {
                str2 = "jianying_mv_page";
            } else {
                str2 = "mv_page";
            }
            C23089d a3 = a2.mo47829a(str8, str2);
            String str9 = "enter_method";
            Integer num4 = this.f94988a.f94979j;
            if (num4 != null && num4.intValue() == 1) {
                str3 = "click_jianying_mv_publish";
            } else {
                str3 = "click_mv_publish";
            }
            C23089d a4 = a3.mo47829a(str9, str3).mo47829a("mv_id", this.f94988a.f94978e).mo47829a("log_pb", C29981aa.m70153a().mo60160a(this.f94988a.f94981l)).mo47829a("group_id", this.f94988a.f94980k);
            String str10 = "content_type";
            Integer num5 = this.f94988a.f94979j;
            if (num5 != null && num5.intValue() == 1) {
                str4 = "jianying_mv";
            } else {
                str4 = "mv";
            }
            C26890h.m65011a(str6, a4.mo47829a(str10, str4).mo47829a("content_source", "upload").f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.f$d */
    static final class C37203d extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C37199f f94989a;

        C37203d(C37199f fVar) {
            this.f94989a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f94989a.requireActivity().findViewById(R.id.ans);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.f$e */
    static final class C37204e extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C37199f f94990a;

        C37204e(C37199f fVar) {
            this.f94990a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f94990a.requireActivity().findViewById(R.id.csb);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.f$f */
    static final class C37205f extends C52712l implements C52670a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ C37199f f94991a;

        C37205f(C37199f fVar) {
            this.f94991a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtStatusView) this.f94991a.mo76530b(R.id.csv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.f$g */
    static final class C37206g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37199f f94992a;

        C37206g(C37199f fVar) {
            this.f94992a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f94992a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.f$h */
    static final class C37207h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37199f f94993a;

        C37207h(C37199f fVar) {
            this.f94993a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f94993a.mo76531f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.f$i */
    static final class C37208i extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ C37199f f94994a;

        C37208i(C37199f fVar) {
            this.f94994a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f94994a.requireActivity().findViewById(R.id.bnd);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.view.f$j */
    static final class C37209j extends C52712l implements C52670a<C37210g> {

        /* renamed from: a */
        final /* synthetic */ C37199f f94995a;

        C37209j(C37199f fVar) {
            this.f94995a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            Context requireContext = this.f94995a.requireContext();
            C52711k.m112236a((Object) requireContext, "requireContext()");
            String str = this.f94995a.f94978e;
            if (str == null) {
                str = "";
            }
            Integer num = this.f94995a.f94979j;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            C52711k.m112240b(requireContext, "context");
            C52711k.m112240b(str, "mvId");
            return new C37193b(requireContext, str, i);
        }
    }

    /* renamed from: h */
    private final View m83433h() {
        return (View) this.f94983o.getValue();
    }

    /* renamed from: i */
    private final DmtTextView m83434i() {
        return (DmtTextView) this.f94984p.getValue();
    }

    /* renamed from: j */
    private final DmtStatusView m83435j() {
        return (DmtStatusView) this.f94985q.getValue();
    }

    /* renamed from: k */
    private final View m83436k() {
        return (View) this.f94986r.getValue();
    }

    /* renamed from: l */
    private final C27323c m83437l() {
        return (C27323c) this.f94975U.getValue();
    }

    /* renamed from: a */
    public final C37210g mo76529a() {
        return (C37210g) this.f94976V.getValue();
    }

    /* renamed from: a */
    public final String mo50606a(int i) {
        return "movie";
    }

    /* renamed from: b */
    public final View mo76530b(int i) {
        if (this.f94977W == null) {
            this.f94977W = new HashMap();
        }
        View view = (View) this.f94977W.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f94977W.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: n */
    public final int mo50618n() {
        return R.layout.oh;
    }

    @C53771m
    public final void onVideoEvent(C30332aw awVar) {
        C52711k.m112240b(awVar, "event");
    }

    /* renamed from: o */
    public final String mo50619o() {
        String str = this.f94978e;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f94977W != null) {
            this.f94977W.clear();
        }
    }

    /* renamed from: f */
    public final void mo76531f() {
        if (m83435j().mo19210d(true)) {
            C37184a aVar = this.f94965J;
            if (aVar != null) {
                Object[] objArr = new Object[6];
                objArr[0] = "";
                objArr[1] = this.f94978e;
                objArr[2] = this.f94979j;
                objArr[3] = this.f94972R;
                objArr[4] = this.f94973S;
                String str = this.f94974T;
                if (str == null) {
                    C52711k.m112237a("cutsameSdkVersion");
                }
                objArr[5] = str;
                aVar.mo44934a_(objArr);
            }
        }
    }

    /* renamed from: r */
    public final C0677p mo50625r() {
        this.f72039E = new ArrayList();
        this.f72040F = new ArrayList();
        this.f65201a = new ArrayList();
        C0654k childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(C27311a.f72034s);
        boolean z = false;
        sb.append(0);
        Fragment a = childFragmentManager.mo2224a(sb.toString());
        if (!(a instanceof C37195c)) {
            String str = "movie";
            String str2 = this.f94978e;
            String str3 = "";
            String str4 = "from_detail_activity";
            C24622b dVar = new C37197d();
            C52711k.m112240b(str, "eventLabel");
            C52711k.m112240b(str3, "hashTagName");
            C52711k.m112240b(str4, "from");
            C52711k.m112240b(dVar, "provider");
            C37195c cVar = new C37195c();
            Bundle bundle = new Bundle();
            bundle.putInt(C37195c.f94956x, 20);
            bundle.putString(C37195c.f94957y, str);
            bundle.putString(C37195c.f94958z, str2);
            bundle.putBoolean("extra_challenge_is_hashtag", false);
            bundle.putString("extra_challenge_hashtag_name", str3);
            bundle.putString(C37195c.f94954A, str4);
            cVar.setArguments(bundle);
            cVar.f65156u = dVar;
            a = cVar;
            DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) a;
            if (this.f72037C == 0) {
                z = true;
            }
            detailAwemeListFragment.f65150o = z;
            detailAwemeListFragment.f65151p = true;
        }
        if (a != null) {
            this.f94982n = (C37195c) a;
            List list = this.f72039E;
            C37195c cVar2 = this.f94982n;
            if (cVar2 == null) {
                C52711k.m112237a("mHotFragment");
            }
            list.add(cVar2);
            List list2 = this.f72040F;
            C37195c cVar3 = this.f94982n;
            if (cVar3 == null) {
                C52711k.m112237a("mHotFragment");
            }
            list2.add(cVar3);
            this.f65201a.add(Integer.valueOf(20));
            return new C40320dc(getChildFragmentManager(), this.f72040F, this.f65201a);
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.movie.view.MovieDetailAwemeListFragment");
    }

    /* renamed from: a */
    public final C27365i mo55746a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "viewGroup");
        return m83437l().mo55767a(viewGroup);
    }

    /* renamed from: a */
    public final void mo76522a(Exception exc) {
        C52711k.m112240b(exc, "e");
        if (isViewValid()) {
            m83435j().mo19204a(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r1 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r1 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        if (r0 == null) goto L_0x000a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r1 == null) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50609a(android.os.Bundle r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000a
            java.lang.String r0 = "mv_id"
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r0 = ""
        L_0x000c:
            r2.f94978e = r0
            r0 = 0
            r2.f72038D = r0
            if (r3 == 0) goto L_0x001b
            java.lang.String r1 = "enter_method"
            java.lang.String r1 = r3.getString(r1)
            if (r1 != 0) goto L_0x001d
        L_0x001b:
            java.lang.String r1 = ""
        L_0x001d:
            r2.f94968M = r1
            if (r3 == 0) goto L_0x0029
            java.lang.String r1 = "enter_from"
            java.lang.String r1 = r3.getString(r1)
            if (r1 != 0) goto L_0x002b
        L_0x0029:
            java.lang.String r1 = ""
        L_0x002b:
            r2.f94969O = r1
            if (r3 == 0) goto L_0x0037
            java.lang.String r1 = "group_id"
            java.lang.String r1 = r3.getString(r1)
            if (r1 != 0) goto L_0x0039
        L_0x0037:
            java.lang.String r1 = ""
        L_0x0039:
            r2.f94980k = r1
            if (r3 == 0) goto L_0x0048
            java.lang.String r1 = "type"
            int r3 = r3.getInt(r1, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0049
        L_0x0048:
            r3 = 0
        L_0x0049:
            r2.f94979j = r3
            com.ss.android.ugc.aweme.shortvideo.y.b r3 = new com.ss.android.ugc.aweme.shortvideo.y.b
            r3.<init>()
            android.content.Context r3 = r2.getContext()
            com.ss.android.ugc.aweme.location.l r3 = com.p683ss.android.ugc.aweme.location.C36272l.m81897a(r3)
            com.ss.android.ugc.aweme.poi.d r3 = r3.mo75072a()
            com.ss.android.ugc.aweme.location.a.a r3 = com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45626b.m99360a(r3)
            r2.f94972R = r3
            java.lang.String r3 = com.p683ss.android.ugc.aweme.feed.C30228f.m70982f()
            r2.f94973S = r3
            com.ss.android.ugc.aweme.services.IExternalService r3 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r3 = (com.p683ss.android.ugc.aweme.services.IExternalService) r3
            com.ss.android.ugc.aweme.services.external.IConfigService r3 = r3.configService()
            com.ss.android.ugc.aweme.services.IShortVideoConfig r3 = r3.shortVideoConfig()
            java.lang.String r3 = r3.cutsameSdkVersion()
            java.lang.String r0 = "ServiceManager.get().get…fig().cutsameSdkVersion()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
            r2.f94974T = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.movie.view.C37199f.mo50609a(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        if (r7 == null) goto L_0x00dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c A[Catch:{ Exception -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054 A[Catch:{ Exception -> 0x0073 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76521a(com.p683ss.android.ugc.aweme.movie.p1968b.C37179c r7) {
        /*
            r6 = this;
            java.lang.String r0 = "mvDetailModel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            boolean r0 = r6.isViewValid()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            com.ss.android.ugc.aweme.shortvideo.model.MvModel r0 = r7.f94907c
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0025
            com.ss.android.ugc.aweme.movie.a.a r0 = r7.f94908d
            if (r0 != 0) goto L_0x0025
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r7 = r6.m83435j()
            r7.mo19208c(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r7 = r6.m83435j()
            r7.mo19204a(r2)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.shortvideo.model.MvModel r0 = r7.f94907c
            r6.f94971Q = r0
            boolean r0 = com.p683ss.android.ugc.aweme.music.p1978ui.C37609f.m84055a()
            r3 = 0
            if (r0 == 0) goto L_0x0074
            com.ss.android.ugc.aweme.shortvideo.model.MvModel r0 = r6.f94971Q     // Catch:{ Exception -> 0x0073 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r0.getExtra()     // Catch:{ Exception -> 0x0073 }
            goto L_0x003a
        L_0x0039:
            r0 = r3
        L_0x003a:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0073 }
            if (r0 == 0) goto L_0x0047
            int r0 = r0.length()     // Catch:{ Exception -> 0x0073 }
            if (r0 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r0 = 0
            goto L_0x0048
        L_0x0047:
            r0 = 1
        L_0x0048:
            r4 = 8
            if (r0 == 0) goto L_0x0054
            android.view.View r0 = r6.m83433h()     // Catch:{ Exception -> 0x0073 }
            r0.setVisibility(r4)     // Catch:{ Exception -> 0x0073 }
            goto L_0x0074
        L_0x0054:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0073 }
            com.ss.android.ugc.aweme.shortvideo.model.MvModel r5 = r6.f94971Q     // Catch:{ Exception -> 0x0073 }
            if (r5 == 0) goto L_0x005f
            java.lang.String r5 = r5.getExtra()     // Catch:{ Exception -> 0x0073 }
            goto L_0x0060
        L_0x005f:
            r5 = r3
        L_0x0060:
            r0.<init>(r5)     // Catch:{ Exception -> 0x0073 }
            java.lang.String r5 = "is_commerce_music"
            boolean r0 = r0.optBoolean(r5, r1)     // Catch:{ Exception -> 0x0073 }
            if (r0 != 0) goto L_0x0074
            android.view.View r0 = r6.m83433h()     // Catch:{ Exception -> 0x0073 }
            r0.setVisibility(r4)     // Catch:{ Exception -> 0x0073 }
            goto L_0x0074
        L_0x0073:
        L_0x0074:
            com.ss.android.ugc.aweme.movie.view.c r0 = r6.f94982n
            if (r0 != 0) goto L_0x007d
            java.lang.String r1 = "mHotFragment"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x007d:
            com.ss.android.ugc.aweme.shortvideo.model.MvModel r1 = r7.f94907c
            r0.f94960v = r1
            com.ss.android.ugc.aweme.movie.view.c r0 = r6.f94982n
            if (r0 != 0) goto L_0x008a
            java.lang.String r1 = "mHotFragment"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x008a:
            java.lang.String r1 = r6.f94980k
            r0.f94961w = r1
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r6.m83435j()
            r0.mo19208c(r2)
            java.lang.Integer r0 = r6.f94979j
            int r1 = com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi.C37175a.m83417a()
            if (r0 != 0) goto L_0x009e
            goto L_0x00b7
        L_0x009e:
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x00b7
            android.widget.TextView r0 = r6.f72047v
            java.lang.String r1 = "mTitle"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.movie.a.a r1 = r7.f94908d
            if (r1 == 0) goto L_0x00b1
            java.lang.String r3 = r1.f94881e
        L_0x00b1:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
            goto L_0x00cb
        L_0x00b7:
            android.widget.TextView r0 = r6.f72047v
            java.lang.String r1 = "mTitle"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.model.MvModel r1 = r7.f94907c
            if (r1 == 0) goto L_0x00c6
            java.lang.String r3 = r1.getName()
        L_0x00c6:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x00cb:
            com.ss.android.ugc.aweme.movie.view.g r0 = r6.mo76529a()
            r0.mo76525a(r7)
            com.ss.android.ugc.aweme.feed.model.LogPbBean r7 = r7.f94909e
            if (r7 == 0) goto L_0x00dc
            java.lang.String r7 = r7.getImprId()
            if (r7 != 0) goto L_0x00de
        L_0x00dc:
            java.lang.String r7 = ""
        L_0x00de:
            r6.f94970P = r7
            com.ss.android.ugc.aweme.feed.model.LogPbBean r7 = r6.f94981l
            java.lang.String r0 = r6.f94970P
            r7.setImprId(r0)
            java.lang.String r7 = "enter_mv_detail"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "enter_from"
            java.lang.String r3 = r6.f94969O
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r3)
            java.lang.String r1 = "log_pb"
            com.ss.android.ugc.aweme.feed.aa r3 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r4 = r6.f94981l
            java.lang.String r3 = r3.mo60160a(r4)
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r3)
            java.lang.String r1 = "group_id"
            java.lang.String r3 = r6.f94980k
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r3)
            java.lang.String r1 = "mv_id"
            java.lang.String r3 = r6.f94978e
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r3)
            java.lang.String r1 = "enter_method"
            java.lang.String r3 = r6.f94968M
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r3)
            java.lang.String r1 = "mv_type"
            java.lang.Integer r3 = r6.f94979j
            if (r3 != 0) goto L_0x0124
            goto L_0x012d
        L_0x0124:
            int r3 = r3.intValue()
            if (r3 != r2) goto L_0x012d
            java.lang.String r2 = "jianying_mv"
            goto L_0x012f
        L_0x012d:
            java.lang.String r2 = "mv"
        L_0x012f:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.movie.view.C37199f.mo76521a(com.ss.android.ugc.aweme.movie.b.c):void");
    }

    /* renamed from: b */
    public final void mo50613b(int i, int i2) {
        super.mo50613b(i, i2);
        if (this.f94967L == 0.0f && m83434i().getVisibility() == 0) {
            int bottom = m83434i().getBottom();
            View view = this.f72048w;
            C52711k.m112236a((Object) view, "mTitleColorCtrl");
            this.f94967L = (float) (bottom - view.getBottom());
        }
        if (this.f94966K == 0.0f) {
            int bottom2 = m83436k().getBottom();
            View view2 = this.f72048w;
            C52711k.m112236a((Object) view2, "mTitleColorCtrl");
            this.f94966K = (float) (bottom2 - view2.getBottom());
        }
        float f = (float) i;
        float f2 = (f - this.f94967L) / (this.f94966K - this.f94967L);
        if (((double) f2) <= 0.2d) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        View view3 = this.f72048w;
        C52711k.m112236a((Object) view3, "mTitleColorCtrl");
        view3.setAlpha(f2);
        TextView textView = this.f72047v;
        C52711k.m112236a((Object) textView, "mTitle");
        View k = m83436k();
        float f3 = this.f94966K;
        C52711k.m112240b(textView, "title");
        C52711k.m112240b(k, "headLayout");
        textView.setAlpha(f2);
        k.setAlpha(1.0f - (f / f3));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        mo76529a().mo76524a(view);
        C27323c l = m83437l();
        View findViewById = view.findViewById(R.id.eww);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.start_record_container)");
        l.mo55768a((RelativeLayout) findViewById);
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(this.f94978e)) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        this.f94965J = new C37184a();
        C37184a aVar = this.f94965J;
        if (aVar != null) {
            aVar.mo54800a(this);
        }
        ((AutoRTLImageView) mo76530b(R.id.ik)).setOnClickListener(new C37206g(this));
        if (m83433h().getVisibility() == 0) {
            m83433h().setOnClickListener(new C37202c(this));
        }
        Context context = getContext();
        if (context == null) {
            C52711k.m112234a();
        }
        m83435j().setBuilder(C10719a.m21676a(getContext()).mo19232b(new C10723a(context).mo19277a((int) R.drawable.b0q).mo19280b((int) R.string.f5o).mo19282c(R.string.f5k).mo19278a(C10720a.BORDER, R.string.f5u, new C37207h(this)).f28711a));
        mo76531f();
    }
}
