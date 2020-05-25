package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.base.C23474b.C23475a;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30132ai;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.adapter.C30019aj;
import com.p683ss.android.ugc.aweme.feed.adapter.C30020ak;
import com.p683ss.android.ugc.aweme.feed.adapter.C30106p;
import com.p683ss.android.ugc.aweme.feed.api.C30148f;
import com.p683ss.android.ugc.aweme.feed.api.C30151i;
import com.p683ss.android.ugc.aweme.feed.experiment.C30225e;
import com.p683ss.android.ugc.aweme.feed.experiment.FollowLiveSkylightExperiment;
import com.p683ss.android.ugc.aweme.feed.guide.C30282f;
import com.p683ss.android.ugc.aweme.feed.guide.C30283g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30539a;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30550b;
import com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30569g;
import com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.C30574a;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30319aj;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30327ar;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30354v;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30445b;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30449f;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30464q;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30480d;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30487j;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30494p;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30495q;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30499s;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30504w;
import com.p683ss.android.ugc.aweme.feed.panel.C30645o;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.p683ss.android.ugc.aweme.follow.experiment.SmartFeedExperiment;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31864a;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31865b;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31867d;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31869f;
import com.p683ss.android.ugc.aweme.follow.presenter.C31877a;
import com.p683ss.android.ugc.aweme.follow.presenter.C31882e;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.friends.experiment.SuggestionFriendsEntranceTypeExperiment;
import com.p683ss.android.ugc.aweme.homepage.api.data.C32968a;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CFragmentFeed;
import com.p683ss.android.ugc.aweme.live.model.C36141b;
import com.p683ss.android.ugc.aweme.login.p1637a.C27955b;
import com.p683ss.android.ugc.aweme.main.C36512b;
import com.p683ss.android.ugc.aweme.main.C36553cd;
import com.p683ss.android.ugc.aweme.main.C36603dv;
import com.p683ss.android.ugc.aweme.main.C36617e;
import com.p683ss.android.ugc.aweme.main.C36663h;
import com.p683ss.android.ugc.aweme.main.C36664i;
import com.p683ss.android.ugc.aweme.newfollow.util.C37934d;
import com.p683ss.android.ugc.aweme.p1254a.C20843a;
import com.p683ss.android.ugc.aweme.p1382aq.C23247q;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39797a;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46605c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47835dx;
import com.p683ss.android.ugc.common.component.p2417a.C48521c;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53771m;
import p001a.C0013i;
import p064c.p065a.p069b.C1689b;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.x */
public final class C31143x extends C30986f implements C30020ak, C30283g, C30449f, C30464q, C30779aw, C36617e {

    /* renamed from: A */
    private DmtTextView f81520A;

    /* renamed from: B */
    private C30771at f81521B;

    /* renamed from: C */
    private boolean f81522C = false;

    /* renamed from: D */
    private boolean f81523D = false;

    /* renamed from: E */
    private C31148c f81524E;

    /* renamed from: F */
    private boolean f81525F = false;

    /* renamed from: l */
    C30282f f81526l;

    /* renamed from: m */
    FrameLayout f81527m;

    /* renamed from: n */
    public C30645o f81528n = new C30645o("homepage_follow", 1);

    /* renamed from: o */
    C30574a f81529o = null;

    /* renamed from: v */
    private C1689b f81530v = new C1689b();

    /* renamed from: w */
    private int f81531w = -1;

    /* renamed from: x */
    private boolean f81532x = true;

    /* renamed from: y */
    private LiveSkyLightTouchEventFrameLayout f81533y;

    /* renamed from: z */
    private FrameLayout f81534z;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.x$a */
    class C31146a extends C31148c<C30487j> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo63978a() {
            ((C30487j) this.f81539b).mo54799a(new C30494p(6));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final boolean mo63986d() {
            return ((C30487j) this.f81539b).mo60913e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo63985c() {
            C30487j jVar = (C30487j) this.f81539b;
            if (jVar.f70700f == null || !((C30480d) jVar.f70700f).isDataEmpty()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo63984b() {
            return ((C30487j) this.f81539b).mo44934a_(Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(2));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo63979a(int i) {
            ((C30487j) this.f81539b).f79687d = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo63980a(C30504w wVar) {
            ((C30487j) this.f81539b).f79685a = wVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo63983b(boolean z) {
            ((C30487j) this.f81539b).mo60911a(z);
            ((C30487j) this.f81539b).mo44934a_(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(1));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo63982a(boolean z) {
            ((C30487j) this.f81539b).f79686b = true;
        }

        C31146a(C30487j jVar) {
            super(jVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo63981a(String str, String str2, String str3) {
            ((C30487j) this.f81539b).mo44934a_(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0), str, str2, str3);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.x$b */
    class C31147b extends C31148c<C30499s> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo63979a(int i) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo63978a() {
            ((C30499s) this.f81539b).mo54799a(new C31877a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo63985c() {
            C30499s sVar = (C30499s) this.f81539b;
            if (sVar.f70700f == null || !((C31877a) sVar.f70700f).isDataEmpty()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final boolean mo63986d() {
            C30499s sVar = (C30499s) this.f81539b;
            if (sVar.f70700f == null || !((C31877a) sVar.f70700f).f83276j) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo63984b() {
            C37934d a = C37934d.m84797a(C22858c.f61207c);
            C30499s sVar = (C30499s) this.f81539b;
            ArrayList arrayList = null;
            if (sVar.f70700f != null) {
                List<FollowFeed> list = ((C31877a) sVar.f70700f).f83275i;
                if (!(list == null || list.size() == 0)) {
                    arrayList = new ArrayList();
                    for (FollowFeed followFeed : list) {
                        if (followFeed.getFeedType() == 65280) {
                            arrayList.add(followFeed.getAweme().getAid());
                        }
                    }
                }
            }
            a.mo77395a((List<String>) arrayList);
            return ((C30499s) this.f81539b).mo44934a_(Integer.valueOf(4), C31882e.m74310a(4, 2, 1, C37934d.m84797a(C22858c.f61207c).mo77398c()).mo65086a(C37934d.m84797a(C22858c.f61207c).mo77394a()).mo65085a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo63980a(C30504w wVar) {
            ((C30499s) this.f81539b).f79714b = wVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo63982a(boolean z) {
            ((C30499s) this.f81539b).f79715d = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo63983b(boolean z) {
            boolean z2;
            C30499s sVar = (C30499s) this.f81539b;
            C31143x xVar = C31143x.this;
            if (!(xVar.getActivity() instanceof C36663h) || !ScrollSwitchStateManager.m75876a(xVar.getActivity()).mo69868b("page_feed") || !((C36663h) xVar.getActivity()).isUnderMainTab()) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z3 = !z2;
            ((C31877a) sVar.f70700f).f83270d = z;
            sVar.f79713a = z;
            sVar.f79716e = z3;
            ((C30499s) this.f81539b).mo44934a_(Integer.valueOf(1), C31882e.m74310a(1, 0, 1, C37934d.m84797a(C22858c.f61207c).mo77398c()).mo65085a());
        }

        C31147b(C30499s sVar) {
            super(sVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo63981a(String str, String str2, String str3) {
            ((C30499s) this.f81539b).mo44934a_(Integer.valueOf(1), C31882e.m74310a(1, 0, 1, C37934d.m84797a(C22858c.f61207c).mo77398c()).mo65088b(str).mo65089c(str2).mo65090d(str3).mo65085a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.x$c */
    abstract class C31148c<T extends C26876b> {

        /* renamed from: b */
        public T f81539b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo63978a();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo63979a(int i);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo63980a(C30504w wVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo63981a(String str, String str2, String str3);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo63982a(boolean z);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract void mo63983b(boolean z);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract boolean mo63984b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract boolean mo63985c();

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract boolean mo63986d();

        C31148c(T t) {
            this.f81539b = t;
        }
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: d */
    public final Fragment mo60685d() {
        return this;
    }

    /* renamed from: p */
    public final ViewGroup mo63490p() {
        return this.f81534z;
    }

    /* renamed from: s */
    public final String mo63459s() {
        return "FeedFollowFragment";
    }

    /* renamed from: z */
    private boolean m72730z() {
        return this.f81524E.mo63984b();
    }

    /* renamed from: e */
    public final void mo60686e() {
        LoadMoreFrameLayout loadMoreFrameLayout = this.f81146e_;
        if (loadMoreFrameLayout != null) {
            loadMoreFrameLayout.mo64054f();
        }
    }

    /* renamed from: f */
    public final void mo60687f() {
        LoadMoreFrameLayout loadMoreFrameLayout = this.f81146e_;
        if (loadMoreFrameLayout != null) {
            loadMoreFrameLayout.mo64053e();
        }
    }

    /* renamed from: g */
    public final boolean mo55941g() {
        m72726A();
        return super.mo55941g();
    }

    /* renamed from: h */
    public final boolean mo60876h() {
        return this.f81524E.mo63986d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C26876b mo63452j() {
        return this.f81524E.f81539b;
    }

    /* renamed from: n */
    public final void mo63455n() {
        this.f81528n.mo62874bn();
    }

    /* renamed from: o */
    public final C30016ag mo63456o() {
        return this.f81528n.mo60518aj();
    }

    /* renamed from: A */
    private void m72726A() {
        if (this.f81147j != null) {
            this.f81524E.mo63979a(m72727C());
        }
    }

    /* renamed from: C */
    private int m72727C() {
        if (this.f81528n != null) {
            return this.f81528n.mo62867bg();
        }
        return 0;
    }

    /* renamed from: B */
    public final SparseArray<C48521c> mo48685B() {
        SparseArray<C48521c> B = super.mo48685B();
        B.append(C23475a.f62544c, this.f81528n);
        return B;
    }

    public final void aG_() {
        m72726A();
        m72730z();
        if (C30550b.m71531b()) {
            C30539a.m71515b();
        }
    }

    public final void bD_() {
        this.f81148k.setRefreshing(true);
        mo59855d_(false);
    }

    /* renamed from: i */
    public final boolean mo55943i() {
        if (this.f81528n == null || !this.f81528n.mo62845aT()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo63453l() {
        this.f81524E.mo63982a(true);
        return m72730z();
    }

    public final void onDestroy() {
        super.onDestroy();
        C47718bf.m103291d(this);
        this.f81530v.dispose();
    }

    /* renamed from: D */
    private void m72728D() {
        if (this.f81521B != null && isViewValid()) {
            mo63965a(false, false, false);
            mo63966d(false);
        }
    }

    /* renamed from: y */
    private static boolean m72729y() {
        if (C30225e.m70969a() || C10181b.m20511a().mo18168a(FollowLiveSkylightExperiment.class, true, "i18n_following_live_skylight_type", 31744, 0) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo60684c() {
        int a = C10181b.m20511a().mo18168a(SuggestionFriendsEntranceTypeExperiment.class, true, "suggestion_friends_entrance_type", 31744, 0);
        if (a == SuggestionFriendsEntranceTypeExperiment.TYPE_B || a == SuggestionFriendsEntranceTypeExperiment.TYPE_C) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final void mo63491q() {
        if (this.f81521B != null) {
            this.f81521B.mo63481a((List<C30151i>) new ArrayList<C30151i>());
            m72728D();
        }
    }

    /* renamed from: r */
    public final void mo63492r() {
        if (this.f81521B != null) {
            this.f81521B.mo63481a((List<C30151i>) new ArrayList<C30151i>());
            m72728D();
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f81528n.mo55813m();
        if (this.f81521B != null) {
            C30495q qVar = this.f81521B.f80645a;
            if (qVar == null) {
                C52711k.m112237a("mPresenter");
            }
            qVar.f79707a.dispose();
        }
        if (this.f81529o != null) {
            this.f81529o.mo62760a();
        }
    }

    /* renamed from: k */
    public final void mo56557k() {
        boolean z;
        if (C36553cd.m82451g() && m72729y() && this.f81521B != null) {
            if (this.f81521B.f80647c.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m72728D();
            } else if (!this.f81522C && this.f81521B != null && isViewValid() && m72729y()) {
                mo63965a(true, false, false);
                mo63966d(false);
            }
        }
    }

    public final void onResume() {
        String str;
        super.onResume();
        if (this.f81531w == -1) {
            this.f81531w = C20854a.m53167g().getCurUser().getFollowingCount();
        }
        if (getUserVisibleHint() && isResumed() && this.f80582s != null && !this.f80582s.isHidden() && C47835dx.m103473a()) {
            C30578o.m71566a(C29988ad.FOLLOW);
            if (!this.f81532x) {
                Fragment fragment = this.f80582s;
                if (fragment instanceof C36664i) {
                    str = ((C36664i) fragment).mo75508h();
                } else {
                    str = null;
                }
                C0013i.m18a((Callable<TResult>) new C30749ae<TResult>(this, str), (Executor) C26890h.m65003a());
            }
            this.f81532x = false;
        }
        getActivity().getWindow().setBackgroundDrawableResource(R.color.ip);
        if (this.f81525F) {
            this.f81525F = false;
        }
    }

    @C53771m
    public final void receiveJumpToRecord(C46605c cVar) {
        this.f81525F = true;
    }

    /* renamed from: c */
    public final void mo63448c(boolean z) {
        super.mo63448c(z);
        this.f81528n.f79966Z = z;
    }

    @C53771m
    public final void onRefreshFollowEvent(C31867d dVar) {
        mo59855d_(false);
    }

    @C53771m
    public final void onLoginEvent(C27955b bVar) {
        if (this.f81526l != null) {
            this.f81526l.mo60640d();
        }
    }

    @C53771m
    public final void onProfileFollow(C24530d dVar) {
        if (this.f81526l != null) {
            this.f81526l.mo60633a(dVar);
        }
    }

    /* renamed from: d */
    public final void mo63966d(boolean z) {
        if (this.f81521B != null && isViewValid()) {
            C47718bf.m103288a(new C31869f(z));
        }
    }

    /* renamed from: f */
    public final void mo63329f(boolean z) {
        super.mo63329f(z);
        if (this.f81526l != null) {
            this.f81526l.onPause();
        }
        this.f81528n.mo62894n(z);
        C30569g.m71560b(Boolean.valueOf(false));
    }

    @C53771m
    public final void onAntiCrawlerEvent(C23481a aVar) {
        String str = aVar.f62554a;
        if (str != null && str.contains("/aweme/v2/follow/feed/?")) {
            C47718bf.m103293f(aVar);
            mo59855d_(false);
        }
    }

    @C53771m
    public final void onBlockUserEvent(C39797a aVar) {
        User user = aVar.f101571a;
        if (this.f81521B != null && user != null && this.f81521B.mo63482b(user.getUid()) == 0) {
            m72728D();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final DmtStatusView mo63446a(Context context) {
        C30790be beVar = new C30790be(context);
        beVar.mo63502a(C30746ab.f80574a, new C30747ac(this), new C30748ad(this));
        beVar.mo19029a(1);
        beVar.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(R.dimen.a04));
        return beVar;
    }

    @C53771m
    public final void onLeaveFollowFeedPage(C31864a aVar) {
        if (this.f81522C) {
            C30771at atVar = this.f81521B;
            String str = aVar.f83245a;
            C52711k.m112240b(str, "uid");
            for (C30151i iVar : atVar.f80647c) {
                if (C52830p.m112406a(str, iVar.getUser().getUid(), true)) {
                    iVar.setShowBluePoint(false);
                }
            }
            atVar.mo63477a();
        }
    }

    @C53771m
    public final void onMaskLayerCancelFollowEvent(C31865b bVar) {
        Aweme aweme = bVar.f83246a;
        if (!(aweme == null || aweme.getAuthor() == null || TextUtils.isEmpty(aweme.getAuthor().getUid()) || this.f81521B == null || this.f81521B.mo63482b(aweme.getAuthor().getUid()) != 0)) {
            m72728D();
        }
    }

    @C53771m
    public final void onProfileFollowEvent(C24530d dVar) {
        if (this.f81521B != null && dVar.f64951a == 0 && dVar.f64952b != null && (dVar.f64952b instanceof User)) {
            if (this.f81521B.mo63482b(((User) dVar.f64952b).getUid()) == 0) {
                m72728D();
            }
        }
    }

    /* renamed from: a */
    public final void mo63765a(C10719a aVar) {
        this.f81526l = BusinessComponentServiceUtils.getBusinessBridgeService().mo49722a(this, mo63441v(), this);
        this.f81528n.f80080a = this.f81526l;
        this.f81143c.mo48779a(false, (int) C9432q.m18687b((Context) getActivity(), 49.0f), (int) C9432q.m18687b((Context) getActivity(), 113.0f));
        this.f81148k = new C36603dv(this.f81143c);
        this.f81528n.mo62816a((C0997e) new C0997e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                if (C30550b.m71531b()) {
                    boolean z = true;
                    if (i != 0) {
                        if (i > 0) {
                            try {
                                if (i == C31143x.this.f81528n.mo60500V().getCount() - 1) {
                                }
                            } catch (Exception unused) {
                            }
                        }
                        z = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    if (C30550b.m71531b()) {
                        C30569g.f79853c.set(valueOf.booleanValue());
                    }
                }
            }
        });
    }

    /* renamed from: d_ */
    public final boolean mo59855d_(boolean z) {
        if (this.f81526l != null) {
            this.f81526l.mo60639c();
        }
        if (this.f81521B != null && !this.f81522C && this.f81523D) {
            this.f81521B.mo63480a("homepage_folllow_refresh");
        }
        C47718bf.m103288a(new C30354v(false));
        if (!C20854a.m53167g().isLogin()) {
            this.f81528n.aJ_();
            C47718bf.m103288a(new C30319aj("HOME"));
            return false;
        } else if (!super.mo59855d_(z)) {
            return false;
        } else {
            m72726A();
            this.f81524E.mo63983b(z);
            this.f81531w = C20854a.m53167g().getCurUser().getFollowingCount();
            if (C30550b.m71531b()) {
                C30539a.m71515b();
            }
            return true;
        }
    }

    @C53771m
    public final void onLiveRoomScrollEvent(C36141b bVar) {
        C30771at atVar = this.f81521B;
        C52711k.m112240b(bVar, "liveRoomScrollEvent");
        C30776au auVar = atVar.f80646b;
        if (auVar == null) {
            C52711k.m112237a("mListView");
        }
        long j = bVar.f92549a;
        if (j >= 0) {
            C30106p pVar = auVar.f80657b;
            if (pVar == null) {
                C52711k.m112237a("mAdapter");
            }
            List a = pVar.mo50673a();
            C52711k.m112236a((Object) a, "mAdapter.data");
            int i = 0;
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    C52575l.m112100b();
                }
                C30151i iVar = (C30151i) next;
                if (!(iVar instanceof C30151i) || iVar.getUser().roomId != j) {
                    i = i2;
                } else if (i > 0) {
                    auVar.mo63487a(i - 1);
                } else {
                    auVar.mo63487a(i);
                    return;
                }
            }
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f81528n.mo55808f(z);
        if (getUserVisibleHint() && isResumed() && this.f80582s != null && !this.f80582s.isHidden()) {
            C30578o.m71566a(C29988ad.FOLLOW);
            new C23247q().mo48131a("homepage_follow").mo48076e();
        }
        if (!z || !this.f81522C) {
            if (!z) {
                C47718bf.m103288a(new C20843a(false));
            }
            return;
        }
        C47718bf.m103288a(new C20843a(true));
    }

    /* renamed from: a */
    public final void mo63489a(List<C30151i> list) {
        if (this.f81521B != null && isViewValid()) {
            this.f81523D = true;
            this.f81521B.mo63481a(list);
            this.f81520A.setText(C11010c.m22280a().getResources().getQuantityString(R.plurals.al, list.size(), new Object[]{Integer.valueOf(list.size())}));
            mo63965a(true, false, true);
            mo63966d(false);
            mo63964a((View) this.f81527m, false, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (r5.mo19211e() == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r4.f81524E.mo63985c() == false) goto L_0x007b;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63328e(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.getUserVisibleHint()
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r4.isViewValid()
            if (r0 != 0) goto L_0x000e
            goto L_0x00b1
        L_0x000e:
            r0 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30569g.m71560b(r1)
            com.ss.android.ugc.aweme.feed.guide.f r1 = r4.f81526l
            if (r1 == 0) goto L_0x001f
            com.ss.android.ugc.aweme.feed.guide.f r1 = r4.f81526l
            r1.onResume()
        L_0x001f:
            super.mo63328e(r5)
            r1 = 0
            if (r5 == 0) goto L_0x002b
            com.ss.android.ugc.aweme.feed.panel.o r5 = r4.f81528n
            r5.mo55833u()
            goto L_0x0080
        L_0x002b:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r5 = r4.mo63766b(r1)
            int r2 = r4.f81531w
            if (r2 != 0) goto L_0x004b
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.getCurUser()
            int r2 = r2.getFollowingCount()
            if (r2 <= 0) goto L_0x004b
            com.ss.android.ugc.aweme.feed.ui.x$c r2 = r4.f81524E
            boolean r2 = r2.mo63985c()
            if (r2 == 0) goto L_0x004b
            r2 = 1
            goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            r3 = 5
            if (r2 != 0) goto L_0x0069
            int[] r2 = new int[r0]
            r2[r1] = r3
            boolean r2 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85102b(r2)
            if (r2 != 0) goto L_0x0069
            if (r5 == 0) goto L_0x0061
            boolean r5 = r5.mo19211e()
            if (r5 == 0) goto L_0x007b
        L_0x0061:
            com.ss.android.ugc.aweme.feed.ui.x$c r5 = r4.f81524E
            boolean r5 = r5.mo63985c()
            if (r5 == 0) goto L_0x007b
        L_0x0069:
            r4.mo59855d_(r1)
            int[] r5 = new int[r0]
            r5[r1] = r3
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85103c(r5)
            com.ss.android.ugc.aweme.notice.api.bean.h r5 = new com.ss.android.ugc.aweme.notice.api.bean.h
            r5.<init>(r3)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r5)
        L_0x007b:
            com.ss.android.ugc.aweme.feed.panel.o r5 = r4.f81528n
            r5.mo62851aZ()
        L_0x0080:
            boolean r5 = r4.f81522C
            if (r5 == 0) goto L_0x009f
            java.lang.String r5 = "enter_following_window_feed"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "homepage_hot"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
            java.lang.String r2 = "is_live"
            java.lang.String r3 = "1"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r0)
        L_0x009f:
            r4.mo63438g(r1)
            android.support.v4.app.FragmentActivity r5 = r4.getActivity()
            android.view.Window r5 = r5.getWindow()
            r0 = 2131821013(0x7f1101d5, float:1.9274757E38)
            r5.setBackgroundDrawableResource(r0)
            return
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C31143x.mo63328e(boolean):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        if (this.f81524E == null) {
            if (SmartFeedExperiment.m74297a()) {
                this.f81524E = new C31147b(new C30499s());
            } else {
                this.f81524E = new C31146a(new C30487j(this));
            }
        }
        this.f81524E = this.f81524E;
        super.onViewCreated(view, bundle);
        mo63438g(false);
        this.f81533y = (LiveSkyLightTouchEventFrameLayout) view.findViewById(R.id.agx);
        this.f81534z = (FrameLayout) view.findViewById(R.id.e9g);
        this.f81527m = (FrameLayout) view.findViewById(R.id.e9f);
        this.f81520A = (DmtTextView) view.findViewById(R.id.f4f);
        this.f81527m.setOnClickListener(new C31149y(this));
        this.f81528n.mo62810a(new C30669b().setEventType("homepage_follow").setPageType(1).setPreviousPagePosition("follow_button"));
        this.f81528n.mo55784a(view, bundle);
        this.f81528n.mo62966a((C30019aj) this);
        this.f81528n.f80081b = this;
        this.f81528n.mo55788a((C30445b) this);
        this.f81528n.f79958R = this;
        this.f81528n.f80082c = this;
        this.f81147j.mo54800a(this.f81528n);
        this.f81524E.mo63980a((C30504w) this.f81528n);
        this.f81147j.mo54838a((C26878d) this.f81528n);
        this.f81524E.mo63978a();
        m72726A();
        Fragment fragment = this.f80582s;
        String str3 = null;
        if (fragment instanceof C36664i) {
            C36664i iVar = (C36664i) fragment;
            C32968a f = iVar.mo75506f();
            if (f != null) {
                str3 = f.mo69850a();
                str = f.mo69851b();
                str2 = f.mo69852c();
            } else {
                String g = iVar.mo75507g();
                C47718bf.m103288a(new C30327ar(""));
                str2 = null;
                str3 = g;
                str = null;
            }
        } else {
            str = null;
            str2 = null;
        }
        if (C20854a.m53167g().isLogin()) {
            this.f81524E.mo63981a(str3, str, str2);
        } else {
            this.f81528n.aJ_();
        }
        C36512b.m82421a().mo75642b(false);
        if (m72729y()) {
            Context context = view.getContext();
            this.f81521B = new C30771at();
            C30771at atVar = this.f81521B;
            C52711k.m112240b(context, "context");
            C52711k.m112240b(this, "followLiveSkyLightFragment");
            C52711k.m112240b(this, "fragment");
            atVar.f80645a = new C30495q(this);
            atVar.f80646b = new C30776au(context);
            mo63490p().removeAllViews();
            C30776au auVar = atVar.f80646b;
            if (auVar == null) {
                C52711k.m112237a("mListView");
            }
            LayoutParams layoutParams = auVar.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin += C23724k.m58225c();
                ViewGroup p = mo63490p();
                C30776au auVar2 = atVar.f80646b;
                if (auVar2 == null) {
                    C52711k.m112237a("mListView");
                }
                p.addView(auVar2, marginLayoutParams);
                atVar.f80648d = new WeakReference<>(getActivity());
                FrameLayout frameLayout = this.f81534z;
                FrameLayout frameLayout2 = this.f81527m;
                C52711k.m112240b(frameLayout, "topContainer");
                C52711k.m112240b(frameLayout2, "bottomContainer");
                LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.height = C23728o.m58241a(173.0d) + C23724k.m58225c();
                    frameLayout.setLayoutParams(marginLayoutParams2);
                    LayoutParams layoutParams3 = frameLayout2.getLayoutParams();
                    if (layoutParams3 != null) {
                        MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.topMargin += C23728o.m58241a(58.0d) + C23724k.m58225c();
                        frameLayout2.setLayoutParams(marginLayoutParams3);
                        this.f81533y.setScrollPredicate(new C31150z(this));
                        this.f81533y.setCallBack(new C30745aa(this));
                        if (this.f81521B != null) {
                            this.f81521B.mo63480a("homepage_hot");
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (this.f81529o == null && C30550b.m71531b()) {
            this.f81529o = C30148f.m70756a().newTopNoticeFeedManager(getActivity(), this.f81142b);
        }
        C30569g.m71560b(Boolean.valueOf(true));
        C47718bf.m103290c(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            this.f81526l.mo60641e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo63964a(View view, boolean z, boolean z2) {
        if (this.f81521B != null && isViewValid() && view != null) {
            if (z) {
                this.f81521B.mo63479a(view, true);
            } else {
                this.f81521B.mo63483b(view, true);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return ((X2CFragmentFeed) C35857a.m81002b(X2CFragmentFeed.class)).getView(getContext(), R.layout.bab);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo63965a(boolean z, boolean z2, boolean z3) {
        if (this.f81521B != null && isViewValid()) {
            int b = C30771at.m72148b();
            if (z) {
                this.f81521B.mo63478a(this.f81533y, 0.0f, (float) b, z2);
                this.f81533y.setNeedIntercept(true);
                C47718bf.m103288a(new C20843a(true));
            } else {
                this.f81521B.mo63478a(this.f81533y, (float) b, 0.0f, z2);
                this.f81533y.setNeedIntercept(false);
                C47718bf.m103288a(new C20843a(false));
            }
            C36512b.m82421a().mo75642b(z);
            this.f81522C = z;
            C30132ai.f78650a = z;
        }
    }
}
