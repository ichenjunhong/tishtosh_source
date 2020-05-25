package com.p683ss.android.ugc.aweme.feed.guide;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1407a.C23457c;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.C23600b;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.common.p1593e.C26873e;
import com.p683ss.android.ugc.aweme.experiment.RecommendSuperAccountExperiment;
import com.p683ss.android.ugc.aweme.feed.adapter.C30035aw;
import com.p683ss.android.ugc.aweme.feed.adapter.C30039az;
import com.p683ss.android.ugc.aweme.feed.guide.GalleryLayoutManager.C30272c;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30476ae;
import com.p683ss.android.ugc.aweme.feed.panel.C30601ai;
import com.p683ss.android.ugc.aweme.friends.experiment.SuggestionFriendsEntranceTypeExperiment;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IAddFriendsActivity;
import com.p683ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment;
import com.p683ss.android.ugc.aweme.mvp.p1985a.C37717b;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40438j.C40443b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40448l;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.RecommendCommonUserView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.RecommendCommonUserView.C40418a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39981o;
import com.p683ss.android.ugc.aweme.profile.presenter.C39993z;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2 */
public class EmptyGuideV2 implements C0183j, C26872d<C40448l>, C26873e<C30039az>, C30282f, C30601ai, C39981o {

    /* renamed from: a */
    public static final String f79060a = "EmptyGuideV2";

    /* renamed from: b */
    public DmtStatusView f79061b;

    /* renamed from: c */
    public RecommendCommonUserView f79062c;

    /* renamed from: d */
    public RecommendSuperUserView f79063d;

    /* renamed from: e */
    public Activity f79064e;

    /* renamed from: f */
    public String f79065f;

    /* renamed from: g */
    public C37717b f79066g;

    /* renamed from: h */
    public C30283g f79067h = C30283g.f79119a;

    /* renamed from: i */
    private final View f79068i;

    /* renamed from: j */
    private SimpleDMTDefaultView f79069j;

    /* renamed from: k */
    private List<String> f79070k;

    /* renamed from: l */
    private C23600b f79071l;

    /* renamed from: a */
    public final View mo60631a() {
        return this.f79068i;
    }

    /* renamed from: e */
    public final void mo60641e() {
        m71102b(true);
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
        this.f79063d.mo60653a();
    }

    /* renamed from: d */
    public final void mo60640d() {
        mo60636a(C20854a.m53167g().isLogin());
        m71103c(true);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        if (this.f79061b != null) {
            this.f79061b.setVisibility(8);
        }
    }

    /* renamed from: k */
    private boolean m71109k() {
        if ((this.f79062c == null || this.f79062c.getVisibility() != 0) && (this.f79063d == null || this.f79063d.getVisibility() != 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m71106h() {
        if (!I18nBridgeService.getBridgeService_Monster().isNeedContactsFriends(true) || ((Boolean) SharePrefCache.inst().getIsContactsUploaded().mo47782d()).booleanValue()) {
            m71108j();
        } else {
            m71107i();
        }
    }

    /* renamed from: i */
    private void m71107i() {
        m71108j();
        if (((Boolean) SharePrefCache.inst().getIsEuropeCountry().mo47782d()).booleanValue() || RecommendSuperAccountExperiment.m69625b()) {
            this.f79069j.mo60669a();
        } else {
            this.f79069j.mo60672a(C10720a.SOLID, R.drawable.a4d, R.string.ahu).mo60671a((OnClickListener) new C30279c(this));
        }
    }

    /* renamed from: c */
    public final void mo60639c() {
        if (this.f79071l != null) {
            this.f79071l.setRefreshing(false);
        }
        if (this.f79067h.mo60684c()) {
            if (RecommendSuperAccountExperiment.m69624a()) {
                this.f79063d.setVisibility(8);
                this.f79063d.mo60653a();
            } else {
                this.f79062c.setVisibility(8);
            }
            mo60636a(C20854a.m53167g().isLogin());
            this.f79067h.mo60687f();
        }
    }

    /* renamed from: f */
    private void m71104f() {
        SimpleDMTDefaultView f = this.f79069j.mo60678f((int) C9432q.m18687b((Context) this.f79064e, 7.0f));
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) f.f79109a.getLayoutParams();
        marginLayoutParams.topMargin = (int) C9432q.m18687b((Context) this.f79064e, 16.0f);
        f.f79109a.setLayoutParams(marginLayoutParams);
        f.mo60677e(C9432q.m18688b(this.f79064e) / 5).mo60674b((int) C9432q.m18687b((Context) this.f79064e, 247.0f)).f79110b.setVisibility(8);
    }

    /* renamed from: g */
    private void m71105g() {
        if (MainTabStripSwipeSwitchExperiment.m82550a()) {
            this.f79069j.mo60673a("").mo60677e((C9432q.m18688b(this.f79064e) - ((int) C9432q.m18687b((Context) this.f79064e, 172.0f))) / 2).mo60674b((int) C9432q.m18687b((Context) this.f79064e, 180.0f)).mo60676d(R.string.czw).mo60670a((int) R.drawable.arb).mo60672a(C10720a.SOLID, -1, R.string.czv).mo60671a((OnClickListener) new C30275a(this));
        } else {
            this.f79069j.mo60675c(R.string.cib).mo60676d(R.string.b4h).mo60672a(C10720a.SOLID, -1, R.string.c1u).mo60671a((OnClickListener) new C30278b(this));
        }
    }

    /* renamed from: j */
    private void m71108j() {
        int i;
        if (RecommendSuperAccountExperiment.m69625b()) {
            this.f79069j.mo60675c(R.string.b46).mo60676d(R.string.b44).mo60679g(20).mo60677e(((int) C9432q.m18687b((Context) this.f79064e, 58.0f)) + (C9432q.m18688b(this.f79064e) / 13)).mo60678f((int) C9432q.m18687b((Context) this.f79064e, 12.0f)).mo60669a();
            return;
        }
        if (C20854a.m53167g().isLogin()) {
            i = C20854a.m53167g().getCurUser().getFollowingCount();
        } else {
            i = 0;
        }
        if (i == 0) {
            this.f79069j.mo60675c(R.string.b4r);
        } else {
            this.f79069j.mo60673a("");
        }
        this.f79069j.mo60676d(R.string.b4h).mo60669a();
    }

    /* renamed from: b */
    public void mo60637b() {
        if (this.f79071l != null) {
            this.f79071l.setRefreshing(false);
        }
        if (this.f79067h.mo60684c()) {
            mo60636a(C20854a.m53167g().isLogin());
            if (RecommendSuperAccountExperiment.m69624a()) {
                this.f79063d.setVisibility(0);
                this.f79063d.setOnViewFirstShowListener(this);
            } else {
                this.f79062c.setVisibility(0);
                this.f79062c.setReminderText(R.string.czm);
                this.f79062c.setBackgroundResource(R.color.arz);
                this.f79062c.setOnViewAttachedToWindowListener(this);
            }
            this.f79067h.mo60686e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    @android.arch.lifecycle.C0200t(mo345a = android.arch.lifecycle.C0176h.C0177a.ON_RESUME)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r3 = this;
            android.app.Activity r0 = r3.f79064e
            if (r0 == 0) goto L_0x002c
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.main.MainActivity
            if (r1 == 0) goto L_0x002c
            com.ss.android.ugc.aweme.main.MainActivity r0 = (com.p683ss.android.ugc.aweme.main.MainActivity) r0
            boolean r1 = r0.isUnderMainTab()
            if (r1 == 0) goto L_0x002c
            android.support.v4.app.Fragment r1 = r0.getCurFragment()
            boolean r1 = r1 instanceof com.p683ss.android.ugc.aweme.main.MainFragment
            if (r1 == 0) goto L_0x002c
            android.support.v4.app.Fragment r0 = r0.getCurFragment()
            com.ss.android.ugc.aweme.main.MainFragment r0 = (com.p683ss.android.ugc.aweme.main.MainFragment) r0
            boolean r1 = r0.getUserVisibleHint()
            if (r1 == 0) goto L_0x002c
            boolean r0 = r0.mo75505e()
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView r0 = r3.f79063d
            if (r0 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView r0 = r3.f79063d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0067
            com.ss.android.ugc.aweme.feed.guide.RecommendSuperUserView r0 = r3.f79063d
            android.support.v7.widget.RecyclerView r1 = r0.f79104a
            if (r1 != 0) goto L_0x0046
            java.lang.String r2 = "list"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0046:
            com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager r0 = r0.f79106c
            if (r0 != 0) goto L_0x004f
            java.lang.String r2 = "layoutManager"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x004f:
            int r0 = r0.f79080b
            android.support.v7.widget.RecyclerView$v r0 = r1.mo4847f(r0)
            if (r0 == 0) goto L_0x0067
            if (r0 == 0) goto L_0x005f
            com.ss.android.ugc.aweme.feed.adapter.az r0 = (com.p683ss.android.ugc.aweme.feed.adapter.C30039az) r0
            r0.mo60316e()
            return
        L_0x005f:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder"
            r0.<init>(r1)
            throw r0
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.guide.EmptyGuideV2.onResume():void");
    }

    /* renamed from: b */
    public final void mo60638b(RecommendList recommendList) {
        mo60634a(recommendList);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo50455a(C1352v vVar) {
        C40448l lVar = (C40448l) vVar;
        if (lVar != null) {
            User user = lVar.f103264d;
            if (user != null) {
                m71101b(user);
            }
        }
    }

    /* renamed from: c */
    private void m71103c(boolean z) {
        boolean z2;
        RecommendCommonUserView recommendCommonUserView = this.f79062c;
        if (!C20854a.m53167g().isLogin() || !SuggestionFriendsEntranceTypeExperiment.m75374a() || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        recommendCommonUserView.setShowLookMore(z2);
    }

    /* renamed from: a */
    public final void mo60632a(C23600b bVar) {
        this.f79071l = bVar;
        mo60636a(C20854a.m53167g().isLogin());
        m71102b(false);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo54831b(C1352v vVar) {
        C30039az azVar = (C30039az) vVar;
        if (azVar != null) {
            UserWithAweme userWithAweme = azVar.f78419j;
            if (userWithAweme != null) {
                User user = userWithAweme.getUser();
                if (user != null) {
                    m71101b(user);
                }
            }
        }
    }

    /* renamed from: b */
    private void m71101b(User user) {
        if (this.f79070k == null) {
            this.f79070k = new ArrayList();
        }
        if (!this.f79070k.contains(user.getUid())) {
            C37879b.m84577a(user, "impression", mo60630a(user), this.f79065f, "cold_launch");
            this.f79070k.add(user.getUid());
        }
    }

    /* renamed from: a */
    public final int mo60630a(User user) {
        int i;
        if (this.f79066g instanceof C39993z) {
            i = ((C39993z) this.f79066g).mo81913a(user.getUid());
        } else if (this.f79066g instanceof C30476ae) {
            i = ((C30476ae) this.f79066g).mo60892a(user.getUid());
        } else {
            i = 0;
        }
        if (user != null) {
            return i;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo60634a(RecommendList recommendList) {
        if (this.f79061b != null) {
            this.f79061b.mo19209d();
        }
        if (recommendList == null || recommendList.getUserList() == null || recommendList.getUserList().size() <= 0) {
            mo60639c();
            return;
        }
        this.f79065f = recommendList.getRid();
        this.f79062c.mo82704a(recommendList.getUserList(), recommendList.getRid());
        m71103c(recommendList.hasMore());
        if (RecommendSuperAccountExperiment.m69625b()) {
            RecommendCommonUserView recommendCommonUserView = this.f79062c;
            if (recommendCommonUserView.f103174e != null) {
                recommendCommonUserView.f103174e.mo4814b(0);
            }
        }
        this.f79062c.setOnItemOperationListener(new C40443b() {
            /* renamed from: d */
            public final void mo60648d(User user, int i) {
                C37879b.m84577a(user, "enter_profile", EmptyGuideV2.this.mo60630a(user), EmptyGuideV2.this.f79065f, "cold_launch");
                C37879b.m84579a(EmptyGuideV2.this.f79065f, user);
            }

            /* renamed from: a */
            public final void mo60645a(User user, int i) {
                C37879b.m84577a(user, "delete", EmptyGuideV2.this.mo60630a(user), EmptyGuideV2.this.f79065f, "cold_launch");
                if (EmptyGuideV2.this.f79066g != null) {
                    ((C39993z) EmptyGuideV2.this.f79066g).mo81921a(user);
                }
            }

            /* renamed from: b */
            public final void mo60646b(User user, int i) {
                if (C20854a.m53167g().isLogin()) {
                    ((C39993z) EmptyGuideV2.this.f79066g).mo81923b(30, C20854a.m53167g().getCurUserId(), 2, 0, C47945d.m103731a(), C47945d.m103733b());
                } else {
                    EmptyGuideV2.this.f79062c.post(new C30280d(this));
                }
            }

            /* renamed from: c */
            public final void mo60647c(User user, int i) {
                if (user.getFollowStatus() == 0) {
                    C37879b.m84577a(user, "follow", EmptyGuideV2.this.mo60630a(user), EmptyGuideV2.this.f79065f, "cold_launch");
                    C37879b.m84575a(user);
                    return;
                }
                C37879b.m84577a(user, "follow_cancel", EmptyGuideV2.this.mo60630a(user), EmptyGuideV2.this.f79065f, "cold_launch");
                C37879b.m84586b(user);
            }
        });
        this.f79062c.setOnLookMoreUserListener(new C40418a() {
            /* renamed from: a */
            public final void mo60649a(String str, boolean z) {
                EmptyGuideV2.this.f79064e.startActivity(IAddFriendsActivity.m75443a(EmptyGuideV2.this.f79064e, -1, 2, str));
                C26890h.m65011a("click_add_friends", C23089d.m56640a().mo47829a("enter_from", "homepage_follow").mo47829a("enter_method", "click_card").mo47829a("trigger_reason", "cold_launch_non_login").f61491a);
            }
        });
        mo60637b();
    }

    /* renamed from: b */
    private void m71102b(boolean z) {
        String str;
        if (this.f79067h.mo60684c()) {
            mo60639c();
            if (this.f79071l != null && m71109k()) {
                this.f79071l.setRefreshing(true);
            }
            if (RecommendSuperAccountExperiment.m69624a()) {
                if (this.f79066g == null) {
                    this.f79066g = new C30476ae(new C30035aw(), this);
                }
                ((C30476ae) this.f79066g).mo60893a();
            } else if (z || this.f79066g == null || RecommendSuperAccountExperiment.m69625b()) {
                if (this.f79066g == null) {
                    this.f79066g = new C39993z(new RecommendCommonUserModel(), this);
                }
                C39993z zVar = (C39993z) this.f79066g;
                if (C20854a.m53167g().isLogin()) {
                    str = C20854a.m53167g().getCurUserId();
                } else {
                    str = "0";
                }
                zVar.mo81916a(30, str, 2, C47945d.m103731a(), C47945d.m103733b(), C10181b.m20511a().mo18168a(RecommendSuperAccountExperiment.class, true, "show_super_accounts_to_unlogged_users", 31744, 0));
            } else {
                return;
            }
            if (this.f79061b != null) {
                this.f79061b.mo19212f();
            }
        }
    }

    /* renamed from: a */
    public final void mo60633a(C24530d dVar) {
        if (dVar.f64952b instanceof User) {
            int i = 0;
            if (this.f79062c != null && !C9376b.m18558a((Collection<T>) this.f79062c.getData())) {
                List data = this.f79062c.getData();
                User user = (User) dVar.f64952b;
                int size = data.size();
                while (i < size) {
                    User user2 = (User) data.get(i);
                    if (TextUtils.equals(user2.getUid(), user.getUid())) {
                        user2.setFollowStatus(dVar.f64951a);
                        if (this.f79066g instanceof C39993z) {
                            ((C39993z) this.f79066g).mo81922a(data);
                            this.f79062c.mo82704a(data, user2.getRequestId());
                        }
                        return;
                    }
                    i++;
                }
            } else if (this.f79063d != null && !C9376b.m18558a((Collection<T>) this.f79063d.getMCardItems())) {
                List mCardItems = this.f79063d.getMCardItems();
                User user3 = (User) dVar.f64952b;
                int size2 = mCardItems.size();
                while (i < size2) {
                    User user4 = ((UserWithAweme) mCardItems.get(i)).getUser();
                    if (TextUtils.equals(user4.getUid(), user3.getUid())) {
                        user4.setFollowStatus(dVar.f64951a);
                        if (this.f79066g instanceof C30476ae) {
                            RecommendSuperUserView recommendSuperUserView = this.f79063d;
                            GalleryLayoutManager galleryLayoutManager = recommendSuperUserView.f79106c;
                            if (galleryLayoutManager == null) {
                                C52711k.m112237a("layoutManager");
                            }
                            if (galleryLayoutManager != null) {
                                GalleryLayoutManager galleryLayoutManager2 = recommendSuperUserView.f79106c;
                                if (galleryLayoutManager2 == null) {
                                    C52711k.m112237a("layoutManager");
                                }
                                Iterator it = galleryLayoutManager2.f79088j.iterator();
                                while (it.hasNext()) {
                                    ((C30272c) it.next()).mo60319h();
                                }
                            }
                        }
                        return;
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60635a(Exception exc) {
        if (this.f79061b != null) {
            this.f79061b.setVisibility(8);
        }
        if (this.f79071l != null) {
            this.f79071l.setRefreshing(false);
        }
        if (exc instanceof C23457c) {
            mo60639c();
        } else {
            C22971a.m56493a((Context) this.f79064e, (Throwable) exc);
        }
    }

    /* renamed from: a */
    public final void mo60636a(boolean z) {
        m71104f();
        if (z || RecommendSuperAccountExperiment.m69625b()) {
            m71106h();
        } else {
            m71105g();
        }
    }

    public EmptyGuideV2(Fragment fragment, C30283g gVar) {
        this.f79064e = fragment.getActivity();
        this.f79068i = LayoutInflater.from(this.f79064e).inflate(R.layout.lq, null);
        this.f79069j = (SimpleDMTDefaultView) this.f79068i.findViewById(R.id.a3z);
        this.f79062c = (RecommendCommonUserView) this.f79068i.findViewById(R.id.drl);
        this.f79063d = (RecommendSuperUserView) this.f79068i.findViewById(R.id.cv5);
        this.f79063d.setContainer(new WeakReference(this.f79064e));
        this.f79061b = (DmtStatusView) this.f79068i.findViewById(R.id.csv);
        this.f79061b.setBuilder(C10719a.m21676a((Context) this.f79064e));
        mo60636a(C20854a.m53167g().isLogin());
        this.f79067h = gVar;
        fragment.getLifecycle().mo324a(this);
    }
}
