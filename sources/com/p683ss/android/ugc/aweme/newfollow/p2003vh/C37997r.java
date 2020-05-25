package com.p683ss.android.ugc.aweme.newfollow.p2003vh;

import android.arch.lifecycle.C0176h.C0178b;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24527a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView.C28448a;
import com.p683ss.android.ugc.aweme.flowfeed.p1752a.C31749e;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31761a;
import com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31782a;
import com.p683ss.android.ugc.aweme.flowfeed.p1760i.C31817a;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31846h;
import com.p683ss.android.ugc.aweme.follow.LiveTagViewModel;
import com.p683ss.android.ugc.aweme.follow.presenter.C31882e;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.VcdBottomFloatHintView;
import com.p683ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p683ss.android.ugc.aweme.forward.p1779vh.BaseForwardViewHolder;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32506c;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32720aj;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32728al;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.main.story.C36713f;
import com.p683ss.android.ugc.aweme.newfollow.C37836a;
import com.p683ss.android.ugc.aweme.newfollow.experiment.FollowFeedDisplayStyleExperiment;
import com.p683ss.android.ugc.aweme.newfollow.p1994a.C37837a;
import com.p683ss.android.ugc.aweme.newfollow.p1997d.C37856a;
import com.p683ss.android.ugc.aweme.newfollow.p1999f.C37865b;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37878a;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37915b;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37918d;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37924g;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.FriendTabViewModel;
import com.p683ss.android.ugc.aweme.newfollow.util.C37934d;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38041h;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p683ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.p683ss.android.ugc.vcd.C50513l;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.r */
public final class C37997r extends C31817a<C37837a, FollowFeed> implements C23452y<User>, C32506c, C36713f, C37918d {

    /* renamed from: J */
    private static final int f96721J = ((int) C9432q.m18687b(C11010c.m22280a(), 52.0f));

    /* renamed from: v */
    public static final int f96722v = ((int) C9432q.m18687b(C11010c.m22280a(), 16.0f));

    /* renamed from: w */
    public static final int f96723w = ((int) C9432q.m18687b(C11010c.m22280a(), 16.0f));

    /* renamed from: x */
    public static final int f96724x = ((int) C9432q.m18687b(C11010c.m22280a(), 0.5f));

    /* renamed from: y */
    public static final int f96725y = ((int) C9432q.m18687b(C11010c.m22280a(), -10.0f));

    /* renamed from: A */
    public Integer f96726A = Integer.valueOf(3);

    /* renamed from: B */
    private boolean f96727B;

    /* renamed from: C */
    private C37836a f96728C;

    /* renamed from: D */
    private User f96729D;

    /* renamed from: E */
    private C32720aj f96730E;

    /* renamed from: F */
    private int f96731F = -1;

    /* renamed from: G */
    private boolean f96732G;

    /* renamed from: H */
    private boolean f96733H;

    /* renamed from: I */
    private Map<String, Integer> f96734I = new HashMap();

    /* renamed from: K */
    private VcdBottomFloatHintView f96735K;

    /* renamed from: L */
    private List<String> f96736L;

    /* renamed from: M */
    private Integer f96737M = Integer.valueOf(4);

    /* renamed from: k */
    public DraftListener f96738k;

    /* renamed from: l */
    public C37865b f96739l;

    /* renamed from: m */
    public C37915b f96740m;

    /* renamed from: n */
    public String f96741n;

    /* renamed from: o */
    public String f96742o;

    /* renamed from: p */
    C37856a f96743p;

    /* renamed from: q */
    public boolean f96744q;

    /* renamed from: r */
    public String f96745r;

    /* renamed from: s */
    public String f96746s;

    /* renamed from: t */
    public boolean f96747t;

    /* renamed from: u */
    public LiveTagViewModel f96748u;

    /* renamed from: z */
    public boolean f96749z = false;

    /* renamed from: a */
    public final void mo77459a(boolean z, int i, int i2, boolean z2, boolean z3) {
        C37924g gVar = new C37924g(z, i, i2, z2, z3);
        FriendTabViewModel.m84727a(this.f96740m.getActivity()).f96514a.setValue(gVar);
    }

    /* renamed from: a */
    public final void mo77458a(C37915b bVar, View view, C37865b bVar2, C31754a aVar) {
        this.f96739l = bVar2;
        this.f96740m = bVar;
        mo64863a(bVar, view, bVar2, aVar, bVar.mo63441v(), bVar.mo63442w(), "");
        FragmentActivity activity = this.f96740m.getActivity();
        C52711k.m112240b(activity, "activity");
        C0209x a = C0214z.m440a(activity).mo359a(LiveTagViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…TagViewModel::class.java)");
        this.f96748u = (LiveTagViewModel) a;
        this.f83134a.mo48779a(false, this.f83134a.getProgressViewStartOffset() + f96721J, this.f83134a.getProgressViewEndOffset());
        this.f83135b.mo4798a((C1331h) new C1331h() {

            /* renamed from: b */
            private Drawable f96754b = C0726c.m2091a(C37997r.this.getContext(), (int) R.color.a0s);

            public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int f = RecyclerView.m4275f(childAt);
                    if (f > 0 && f < recyclerView.getAdapter().getItemCount() && (f >= recyclerView.getAdapter().getItemCount() - 1 || recyclerView.getAdapter().getItemViewType(f + 1) != 37)) {
                        int itemViewType = recyclerView.getAdapter().getItemViewType(f);
                        if (!(itemViewType == 37 || itemViewType == 51 || itemViewType == 50 || itemViewType == 48 || itemViewType == 52)) {
                            int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
                            this.f96754b.setBounds(childAt.getLeft() + C37997r.f96722v, bottom, childAt.getRight() - C37997r.f96723w, C37997r.f96724x + bottom);
                            this.f96754b.draw(canvas);
                        }
                    }
                }
            }

            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
                rect.bottom = C37997r.f96724x;
            }
        });
        ((C37837a) this.f83139f).f96336H = this.f96745r;
        ((C37837a) this.f83139f).f96337I = this.f96747t;
        ((C37837a) this.f83139f).f96344Q = bVar2;
        ((C37837a) this.f83139f).f96346S = new C38003t(this);
        ((C37837a) this.f83139f).f96347T = this;
        ((C37837a) this.f83139f).f96348U = this;
        this.f96727B = TextUtils.equals(this.f96740m.mo63441v(), "rec_follow");
        if (this.f96727B) {
            ((C37837a) this.f83139f).f96333E = false;
        }
        ((C37837a) this.f83139f).f96335G = this.f96741n;
        ((C37837a) this.f83139f).f96338K = this.f96749z;
        this.f96728C = I18nBridgeService.getBridgeService_Monster().createRecommendListPresenter();
        this.f96735K = (VcdBottomFloatHintView) view.findViewById(R.id.eiu);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f96735K.getLayoutParams();
        layoutParams.bottomMargin = C22453b.m55505a().mo46745b();
        this.f96735K.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo64876a(List<FollowFeed> list, boolean z) {
        if (TextUtils.equals(this.f96742o, "homepage_follow") && this.f96740m.getActivity() != null) {
            FollowPageFirstFrameViewModel.m103062a(this.f96740m.getActivity());
        }
        super.mo64876a(list, z);
        C37878a.m84563a(C37878a.m84561a(this.f96726A), true, false);
        this.f96726A = Integer.valueOf(3);
        this.f96733H = false;
        C37940g.m84832a().mo77417c();
        m84954p();
        int i = TextUtils.equals(this.f96741n, "extra_follow_type_friend") ? 51 : TextUtils.equals(this.f96741n, "extra_follow_type_follow") ? 50 : -1;
        if (i >= 0) {
            if (C38046d.m85098a(i) > 0) {
                if (C10181b.m20511a().mo18168a(FollowFeedDisplayStyleExperiment.class, true, "remove_friend_tab", 31744, 0) == 2) {
                    C38046d.m85103c(51);
                }
                C38046d.m85103c(i);
                C47718bf.m103288a(new C38041h(i, -1));
            }
        }
        if (this.f96735K.getVisibility() != 0 && C50513l.m108855a()) {
            mo77463j();
        }
    }

    /* renamed from: a */
    public final void mo64873a(String str, ForwardDetail forwardDetail) {
        if (forwardDetail != null) {
            ((C37837a) this.f83139f).mo64630a(str, forwardDetail.getAweme(), ((C37837a) this.f83139f).f96333E ? 1 : 0);
            ((C37837a) this.f83139f).mo64629a(str, forwardDetail.getComment());
        }
    }

    /* renamed from: a */
    public final void mo65818a(String str, int i) {
        C41302w a = C41302w.m91042a();
        StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
        sb.append(str);
        a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("refer", "find_friends").mo83871a());
    }

    /* renamed from: d */
    public final C31755b mo64888d() {
        return new C31755b() {
            /* renamed from: d */
            public final String mo64657d() {
                return "key_container_follow";
            }

            /* renamed from: a */
            public final boolean mo64654a() {
                if (C37997r.this.f96740m == null || !C37997r.this.f96740m.isViewValid()) {
                    return false;
                }
                return true;
            }

            /* renamed from: c */
            public final Context mo64656c() {
                if (C37997r.this.f96740m != null) {
                    return C37997r.this.f96740m.getActivity();
                }
                return C37997r.this.f83135b.getContext();
            }

            /* renamed from: b */
            public final boolean mo64655b() {
                if (C37997r.this.f96740m == null || !C37997r.this.f96740m.getLifecycle().mo323a().equals(C0178b.RESUMED) || !C37997r.this.f96740m.getUserVisibleHint()) {
                    return false;
                }
                return true;
            }
        };
    }

    /* renamed from: e */
    public final void mo64889e() {
        m84953f(false);
    }

    /* renamed from: l */
    public final void mo77465l() {
        m84950a(0, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ void mo77468o() {
        if (this.f96739l != null) {
            mo64889e();
        }
    }

    /* renamed from: p */
    private static void m84954p() {
        C37934d.m84797a(C22858c.f61207c).mo77399d();
    }

    /* renamed from: c */
    public final /* synthetic */ C31749e mo64886c() {
        return new C37837a(this.f83135b, new C31846h() {

            /* renamed from: b */
            private int f96752b;

            /* renamed from: a */
            public final int mo64955a() {
                return 0;
            }

            /* renamed from: b */
            public final void mo64957b(RecyclerView recyclerView, int i) {
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                if (i == 0) {
                    C37997r.this.mo77459a(false, this.f96752b, computeVerticalScrollOffset, false, false);
                }
            }

            /* renamed from: a */
            public final void mo64956a(RecyclerView recyclerView, int i) {
                boolean z;
                this.f96752b = i;
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                if (i >= 0 || i <= C37997r.f96725y || recyclerView.getScrollState() == 1) {
                    C37997r rVar = C37997r.this;
                    if (recyclerView.getScrollState() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    rVar.mo77459a(true, i, computeVerticalScrollOffset, true, z);
                }
            }
        }, this, this.f96740m);
    }

    /* renamed from: g */
    public final void mo64891g() {
        super.mo64891g();
        C37934d.m84797a(C22858c.f61207c).mo77400e();
    }

    /* renamed from: k */
    public boolean mo77464k() {
        return TextUtils.equals(this.f96741n, "extra_follow_type_follow");
    }

    /* renamed from: q */
    private String m84955q() {
        if (TextUtils.equals(this.f96741n, "extra_follow_type_friend")) {
            return "homepage_friends";
        }
        if (TextUtils.equals(this.f96741n, "extra_follow_type_follow")) {
            return "homepage_follow";
        }
        return "";
    }

    /* renamed from: j */
    public final void mo77463j() {
        if (this.f96740m.isViewValid() && this.f96735K != null) {
            this.f96735K.setVisibility(8);
        }
    }

    /* renamed from: m */
    public final void mo77466m() {
        if (this.f96728C != null) {
            this.f83135b.post(new C38005v(this));
            this.f96732G = false;
        }
    }

    /* renamed from: b */
    public final void mo64880b() {
        this.f83136c.setBuilder(C10719a.m21676a(getContext()).mo19232b(C48190g.m104428a(getContext(), new C38002s(this))));
        this.f83136c.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(R.dimen.mh));
    }

    /* renamed from: a */
    public final void mo47048a() {
        int i;
        if (isViewValid()) {
            if (!C38006w.m84994a(this.f96740m.getContext())) {
                mo64877a(false);
                if (this.f96739l != null) {
                    this.f96739l.mo77307s();
                }
                C10691a.m21542b(this.f96740m.getContext(), (int) R.string.cg1).mo19066a();
                return;
            }
            if (this.f96726A == null) {
                i = 3;
            } else {
                i = this.f96726A.intValue();
            }
            this.f96726A = Integer.valueOf(i);
            if (this.f96739l != null) {
                C37878a.m84562a(C37878a.m84561a(this.f96726A));
                mo64889e();
                mo64877a(true);
            }
        }
    }

    public final void ar_() {
        if (isViewValid()) {
            if (3 != this.f96731F || this.f96732G) {
                if (!this.f96739l.mo54803n().isDataEmpty() && this.f96739l != null) {
                    C37878a.m84562a(C37878a.m84564b(this.f96737M));
                    C37934d.m84797a(C22858c.f61207c).mo77395a(m84951c(this.f96740m.mo77373e()));
                    this.f96739l.mo44934a_(Integer.valueOf(4), C31882e.m74310a(4, 2, 1, C37934d.m84797a(C22858c.f61207c).mo77398c()).mo65086a(C37934d.m84797a(C22858c.f61207c).mo77394a()).mo65085a());
                }
            } else if (this.f96728C != null) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo77467n() {
        C37837a aVar = (C37837a) this.f83139f;
        FollowFeed p = aVar.mo77282p();
        ArrayList arrayList = new ArrayList();
        if (aVar.f96333E) {
            arrayList.add(p);
        }
        if (aVar.f96340M == null) {
            aVar.f96340M = new FollowFeed();
            aVar.f96340M.setFeedType(65532);
        }
        arrayList.add(aVar.f96340M);
        if (aVar.f96341N == null) {
            aVar.f96341N = new FollowFeed();
            aVar.f96341N.setFeedType(65531);
        }
        arrayList.add(aVar.f96341N);
        aVar.mo54798c(false);
        aVar.mo77279f((List<FollowFeed>) arrayList);
        aVar.f70670n = arrayList;
        aVar.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo64871a(Integer num) {
        this.f96737M = num;
        ar_();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo77460b(View view) {
        if (this.f96739l != null) {
            mo64889e();
        }
    }

    /* renamed from: c */
    private static boolean m84952c(String str) {
        if (TextUtils.equals("homepage_friends", str) || TextUtils.equals("homepage_follow", str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo64881b(String str) {
        int d = ((C37837a) this.f83139f).mo64641d(str);
        if (d >= 0) {
            ((C37837a) this.f83139f).mo64638c(d);
            ((C37837a) this.f83139f).mo77283q();
        }
    }

    /* renamed from: c */
    private static List<String> m84951c(List<FollowFeed> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : list) {
            if (followFeed.getFeedType() == 65280) {
                arrayList.add(followFeed.getAweme().getAid());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo64861a(int i) {
        if (isViewValid()) {
            this.f96731F = i;
            super.mo64861a(i);
            this.f96740m.getActivity();
        }
    }

    /* renamed from: e */
    public final void mo77462e(boolean z) {
        if (this.f83139f != null && mo77464k()) {
            ((C37837a) this.f83139f).mo77278a(z);
            ((C37837a) this.f83139f).mo77283q();
            mo77465l();
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(C38004u.f96759a);
        }
        if (this.f96738k != null) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().draftService().unregisterListener(this.f96738k);
            this.f96738k = null;
        }
    }

    /* renamed from: f_ */
    public final void mo65164f_(boolean z) {
        if (this.f83139f != null) {
            int o = ((C37837a) this.f83139f).mo77280o();
            if (o >= 0) {
                C1352v f = this.f83135b.mo4847f(o);
                if (f != null && C36713f.class.isAssignableFrom(f.getClass())) {
                    ((C36713f) f).mo65164f_(z);
                }
            }
        }
    }

    /* renamed from: f */
    private void m84953f(boolean z) {
        if (this.f96739l != null) {
            if (this.f83139f != null) {
                ((C37837a) this.f83139f).f96333E = false;
            }
            if (!C37934d.m84797a(C22858c.f61207c).mo77397b()) {
                C37934d.m84797a(C22858c.f61207c).f96590b = new HashSet<>(C37934d.m84797a(C22858c.f61207c).f96589a);
            }
            if (this.f96739l != null) {
                this.f96739l.mo44934a_(Integer.valueOf(1), C31882e.m74310a(1, 0, 1, C37934d.m84797a(C22858c.f61207c).mo77398c()).mo65088b(this.f96746s).mo65087a(false).mo65085a());
                this.f96748u.f83231a = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo50455a(C1352v vVar) {
        String str;
        super.mo50455a(vVar);
        if (vVar instanceof C31782a) {
            C31782a aVar = (C31782a) vVar;
            if (aVar.f83048c != null && m84952c(aVar.mo64771c())) {
                C37934d.m84797a(C22858c.f61207c).mo77396b(aVar.f83048c.getAid());
            }
        }
        if (vVar instanceof BaseForwardViewHolder) {
            BaseForwardViewHolder baseForwardViewHolder = (BaseForwardViewHolder) vVar;
            if (baseForwardViewHolder.f84362F != null && m84952c(baseForwardViewHolder.mo65673r())) {
                C37934d.m84797a(C22858c.f61207c).mo77396b(baseForwardViewHolder.f84362F.getAid());
            }
        }
        if (vVar instanceof C32728al) {
            User a = ((C32728al) vVar).mo66319a();
            int adapterPosition = vVar.getAdapterPosition() - 2;
            if (this.f96736L == null) {
                this.f96736L = new ArrayList();
            }
            if (a != null && !this.f96736L.contains(a.getUid())) {
                if (a.isNewRecommend()) {
                    str = "new";
                } else {
                    str = "past";
                }
                C37940g.m84832a().mo77415a(3, a.getUid());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("rec_uid", a.getUid());
                    jSONObject.put("enter_from", "homepage_friends");
                    jSONObject.put("event_type", "impression");
                    jSONObject.put("impr_order", adapterPosition);
                    jSONObject.put("req_id", a.getRequestId());
                    jSONObject.put("page_status", "empty");
                    jSONObject.put("rec_reason", a.getRecommendReason());
                    jSONObject.put("card_type", str);
                } catch (JSONException unused) {
                }
                C26890h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("homepage_follow").setJsonObject(jSONObject));
                C26890h.m65012a("follow_card", jSONObject);
                this.f96736L.add(a.getUid());
            }
        }
    }

    /* renamed from: b */
    public final boolean mo64885b(int i) {
        if (!isViewValid()) {
            return true;
        }
        switch (i) {
            case 1:
                C37878a.m84563a(C37878a.m84564b(this.f96737M), false, true);
                C37837a aVar = (C37837a) this.f83139f;
                if (aVar.f70670n != null && aVar.f70670n.contains(aVar.f96341N)) {
                    aVar.mo64638c(aVar.f70670n.indexOf(aVar.f96341N));
                    aVar.mo54798c(true);
                }
                this.f96732G = false;
                if (this.f83139f != null) {
                    ((C37837a) this.f83139f).mo54793i();
                }
                return true;
            case 2:
                if (this.f83139f != null) {
                    ((C37837a) this.f83139f).am_();
                }
                return true;
            case 3:
                if (this.f83139f != null) {
                    ((C37837a) this.f83139f).an_();
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    public final void mo77461d(boolean z) {
        boolean z2;
        if (this.f96743p == null) {
            this.f96743p = new C37856a(this.f83137d);
            this.f96743p.f96371c = this.f96739l;
        }
        C37856a aVar = this.f96743p;
        if (!z && aVar.f96369a != null) {
            aVar.f96369a.setVisibility(8);
        } else if (aVar.f96370b != null && aVar.f96369a != null) {
            long j = 2592000000L;
            if (((Long) SharePrefCache.inst().getFollowNoticeCloseTime().mo47782d()).longValue() > 0) {
                j = ((Long) SharePrefCache.inst().getFollowNoticeCloseTime().mo47782d()).longValue();
            }
            if (System.currentTimeMillis() - C35807d.m80935a(aVar.f96370b, "follow_tab_info", 0).getLong("last_guide_close_time", 0) > j) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                aVar.f96369a.setVisibility(0);
                C37879b.m84593c("contact_alert_show");
            } else {
                aVar.f96369a.setVisibility(8);
            }
            aVar.f96369a.setOnInternalClickListener(new C28448a() {
                /* renamed from: b */
                public final void mo51946b() {
                    C37856a.this.mo77299a();
                    C37856a.this.f96369a.setVisibility(8);
                    C37879b.m84593c("contact_alert_close");
                }

                /* renamed from: a */
                public final void mo51945a() {
                    if (C37856a.this.f96371c != null) {
                        C37856a.this.f96371c.mo77298a();
                        C37856a.this.mo77299a();
                        C37856a.this.f96369a.setVisibility(8);
                        C37879b.m84593c("contact_alert_click");
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo64868a(C31761a aVar) {
        if (this.f83139f != null) {
            if (aVar.f82954a == 2) {
                C37837a aVar2 = (C37837a) this.f83139f;
                aVar2.f96333E = false;
                if (aVar2.f70670n == null || !aVar2.f70670n.contains(aVar2.f96339L)) {
                    aVar2.notifyDataSetChanged();
                } else {
                    aVar2.mo64638c(aVar2.f70670n.indexOf(aVar2.f96339L));
                }
            } else if (aVar.f82954a == 1) {
                ((C37837a) this.f83139f).mo64638c(aVar.f82955b);
            }
            ((C37837a) this.f83139f).mo77283q();
        }
    }

    /* renamed from: a */
    private void m84950a(int i, int i2) {
        if (this.f83135b != null) {
            ((LinearLayoutManager) this.f83135b.getLayoutManager()).mo4721a(0, 0);
        }
    }

    /* renamed from: b */
    public final void mo64883b(List<FollowFeed> list, boolean z) {
        super.mo64883b(list, z);
        C37878a.m84563a(C37878a.m84564b(this.f96737M), true, !z);
        this.f96737M = Integer.valueOf(4);
        m84954p();
    }

    /* renamed from: a */
    public final void mo77457a(FollowFeed followFeed, boolean z) {
        if (this.f83139f != null && mo77464k()) {
            ((C37837a) this.f83139f).mo77277a(followFeed, z);
            if (z) {
                ((C37837a) this.f83139f).mo77284r();
            } else {
                ((C37837a) this.f83139f).mo77283q();
            }
            mo77465l();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo48614a(int i, Object obj, int i2, View view, String str) {
        int i3;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        User user = (User) obj;
        int i4 = 0;
        if (TextUtils.isEmpty(user.getUid()) || this.f96734I.get(user.getUid()) == null) {
            i3 = 0;
        } else {
            i3 = ((Integer) this.f96734I.get(user.getUid())).intValue();
        }
        if (i == 101) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("group_id", "");
                jSONObject.put("request_id", this.f96728C.mo77274a().getRid());
                jSONObject.put("enter_from", "invite_friend");
                jSONObject.put("enter_method", "click_head");
                jSONObject.put("enter_type", "normal_way");
            } catch (Exception unused) {
            }
            C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject));
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("rec_uid", user.getUid());
                jSONObject2.put("enter_from", m84955q());
                jSONObject2.put("event_type", "enter_profile");
                jSONObject2.put("impr_order", i3);
                jSONObject2.put("req_id", this.f96728C.mo77274a().getRid());
                jSONObject2.put("trigger_reason", "friend_rec_message");
                jSONObject2.put("rec_reason", user.getRecommendReason());
                String str11 = "card_type";
                if (user.isNewRecommend()) {
                    str9 = "new";
                } else {
                    str9 = "past";
                }
                jSONObject2.put(str11, str9);
                String str12 = "page_status";
                if (((C37837a) this.f83139f).f96338K) {
                    str10 = "empty";
                } else {
                    str10 = "nonempty";
                }
                jSONObject2.put(str12, str10);
            } catch (Exception unused2) {
            }
            C26890h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject2));
            C26890h.m65012a("follow_card", jSONObject2);
            String str13 = "enter_personal_detail_backup";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", m84955q()).mo47829a("to_user_id", user.getUid()).mo47829a("group_id", "").mo47829a("request_id", this.f96728C.mo77274a().getRid()).mo47829a("enter_method", "click_card");
            String str14 = "page_status";
            if (((C37837a) this.f83139f).f96338K) {
                str7 = "empty";
            } else {
                str7 = "nonempty";
            }
            C26890h.m65011a(str13, a.mo47829a(str14, str7).f61491a);
            ((C23249s) new C23249s().mo48144s(user.getUid()).mo48137c(m84955q()).mo47941a(str)).mo48145t(this.f96728C.mo77274a().getRid()).mo48076e();
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("to_user_id", user.getUid());
                jSONObject3.put("request_id", this.f96728C.mo77274a().getRid());
            } catch (Exception unused3) {
            }
            if ("click_name".equals(str)) {
                str8 = LeakCanaryFileProvider.f132049i;
            } else {
                str8 = "head";
            }
            C26890h.onEvent(MobClick.obtain().setEventName(str8).setLabelName("find_friends").setValue(user.getUid()).setJsonObject(jSONObject3));
            UserProfileActivity.m89400a(getContext(), C47661ab.m103163a().mo94972a("uid", user.getUid()).mo94972a("sec_user_id", user.getSecUid()).mo94972a("enter_from_request_id", this.f96728C.mo77274a().getRid()).mo94972a("enter_from", m84955q()).mo94969a("is_cold_launch", 1).mo94969a("from_recommend_card", 1).mo94969a("need_track_compare_recommend_reason", 1).mo94972a("previous_recommend_reason", user.getRecommendReason()).mo94972a("recommend_from_type", "list").f120139a);
            return;
        }
        if (i == 100) {
            if (isViewValid()) {
                if (!C38006w.m84994a(this.f96740m.getActivity())) {
                    C10691a.m21542b((Context) this.f96740m.getActivity(), (int) R.string.cg1).mo19066a();
                    return;
                }
                this.f96729D = user;
                this.f96730E = (C32720aj) view;
                if (user.getFollowStatus() != 0) {
                    i4 = 1;
                }
                int i5 = i4 ^ 1;
                C47718bf.m103288a(new C24527a(i5, user));
                if (i5 == 0) {
                    C26890h.onEvent(MobClick.obtain().setEventName("invite_friends").setLabelName("follow_cancel").setValue(String.valueOf(user.getUid())));
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("request_id", this.f96728C.mo77274a().getRid());
                    } catch (Exception unused4) {
                    }
                    C26890h.onEvent(MobClick.obtain().setEventName("invite_friends").setLabelName("follow").setValue(String.valueOf(user.getUid())).setJsonObject(jSONObject4));
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("rec_uid", user.getUid());
                        jSONObject5.put("enter_from", m84955q());
                        jSONObject5.put("event_type", "follow");
                        jSONObject5.put("impr_order", i3);
                        jSONObject5.put("req_id", this.f96728C.mo77274a().getRid());
                        jSONObject5.put("trigger_reason", "friend_rec_message");
                        jSONObject5.put("rec_reason", user.getRecommendReason());
                        String str15 = "card_type";
                        if (user.isNewRecommend()) {
                            str5 = "new";
                        } else {
                            str5 = "past";
                        }
                        jSONObject5.put(str15, str5);
                        String str16 = "page_status";
                        if (((C37837a) this.f83139f).f96338K) {
                            str6 = "empty";
                        } else {
                            str6 = "nonempty";
                        }
                        jSONObject5.put(str16, str6);
                    } catch (Exception unused5) {
                    }
                    C26890h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject5));
                    C26890h.m65012a("follow_card", jSONObject5);
                    C26890h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("find_friends").setValue(String.valueOf(user.getUid())));
                }
                if (i5 == 0) {
                    str3 = "follow_cancel";
                } else {
                    str3 = "follow";
                }
                C23253w b = new C23253w(str3).mo48165e("other_places").mo48161b(m84955q());
                if (((C37837a) this.f83139f).f96338K) {
                    str4 = "empty";
                } else {
                    str4 = "nonempty";
                }
                b.f62146d = str4;
                b.mo48163c("follow_button").mo48169s(user.getRequestId()).mo48166f(user.getUid()).mo48076e();
            }
        } else if (i == 102 && isViewValid()) {
            if (!C38006w.m84994a(this.f96740m.getActivity())) {
                C10691a.m21542b((Context) this.f96740m.getActivity(), (int) R.string.cg1).mo19066a();
                return;
            }
            int a2 = ((C37837a) this.f83139f).mo64621a(user);
            if (a2 >= 0 && a2 < ((C37837a) this.f83139f).getItemCount()) {
                ((C37837a) this.f83139f).mo64638c(a2);
                if (!(user instanceof RecommendContact)) {
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("rec_uid", user.getUid());
                        jSONObject6.put("enter_from", m84955q());
                        jSONObject6.put("event_type", "delete");
                        jSONObject6.put("impr_order", i3);
                        jSONObject6.put("req_id", this.f96728C.mo77274a().getRid());
                        jSONObject6.put("trigger_reason", "friend_rec_message");
                        jSONObject6.put("rec_reason", user.getRecommendReason());
                        String str17 = "card_type";
                        if (user.isNewRecommend()) {
                            str2 = "new";
                        } else {
                            str2 = "past";
                        }
                        jSONObject6.put(str17, str2);
                    } catch (Exception unused6) {
                    }
                    C26890h.onEvent(MobClick.obtain().setEventName("follow_card").setLabelName("find_friends").setJsonObject(jSONObject6));
                    C26890h.m65014b("follow_card", jSONObject6);
                    C32616c.f84865a.dislikeRecommendUser(user.getUid(), user.getSecUid());
                    if (!(this.f96740m == null || this.f96740m.getActivity() == null)) {
                        C10691a.m21548c((Context) this.f96740m.getActivity(), (int) R.string.ti).mo19066a();
                    }
                }
            }
        }
    }
}
