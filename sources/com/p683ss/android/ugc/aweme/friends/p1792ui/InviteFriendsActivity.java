package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.common.C10675b;
import com.bytedance.ies.dmt.p664ui.p667c.C10672b;
import com.bytedance.ies.dmt.p664ui.p667c.C10673c;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.friends.adapter.C32527c;
import com.p683ss.android.ugc.aweme.friends.adapter.C32528d;
import com.p683ss.android.ugc.aweme.friends.adapter.C32530f;
import com.p683ss.android.ugc.aweme.friends.adapter.C32532h;
import com.p683ss.android.ugc.aweme.friends.adapter.C32534i;
import com.p683ss.android.ugc.aweme.friends.model.ContactModel;
import com.p683ss.android.ugc.aweme.friends.model.Friend;
import com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InviteFriendsCallback;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32505b;
import com.p683ss.android.ugc.aweme.friends.p1788b.C32564a;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32570c;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32570c.C32571a;
import com.p683ss.android.ugc.aweme.mobile.C37139b;
import com.p683ss.android.ugc.aweme.mobile.C37139b.C37140a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.push.C40884a;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.share.InviteFriendSharePackage;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42134b;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d.C42350b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.C42345e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.ShareChannelBar;
import com.p683ss.android.ugc.aweme.utils.C47673an;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47888fj;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.p683ss.android.ugc.aweme.utils.permission.C47940b;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity */
public class InviteFriendsActivity extends AmeSSActivity implements C26846a, C26877c<Friend>, C32571a {

    /* renamed from: q */
    private static String f84978q = "invite_friends";

    /* renamed from: a */
    public View f84979a;

    /* renamed from: b */
    View f84980b;

    /* renamed from: c */
    View f84981c;

    /* renamed from: d */
    ShareChannelBar f84982d;

    /* renamed from: e */
    public C32570c f84983e;

    /* renamed from: f */
    public C32532h<Friend> f84984f;

    /* renamed from: g */
    public C26876b<InviteContactFriendsModel> f84985g;

    /* renamed from: h */
    C32528d f84986h;

    /* renamed from: i */
    public View f84987i;

    /* renamed from: j */
    public boolean f84988j;

    /* renamed from: k */
    public int f84989k;

    /* renamed from: l */
    public float f84990l;

    /* renamed from: m */
    public int f84991m = 0;
    TextView mBtnFloatInviteAll;
    View mBtnFloatInviteAllContainer;
    RecyclerView mListView;
    SwipeRefreshLayout mRefreshLayout;
    DmtStatusView mStatusView;
    TextTitleBar mTitleBar;

    /* renamed from: n */
    public boolean f84992n = false;

    /* renamed from: o */
    public boolean f84993o = false;

    /* renamed from: p */
    public List<Friend> f84994p = new ArrayList();

    /* renamed from: r */
    private InviteContactFriendsModel f84995r = new InviteContactFriendsModel("contact");

    /* renamed from: s */
    private C32530f f84996s;

    /* renamed from: t */
    private ValueAnimator f84997t;

    /* renamed from: u */
    private AnimatorListener f84998u = new AnimatorListener() {
        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            InviteFriendsActivity.this.mListView.setPadding(0, 0, 0, 0);
        }
    };

    /* renamed from: v */
    private AnimatorListener f84999v = new AnimatorListener() {
        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            InviteFriendsActivity.this.mListView.setPadding(0, 0, 0, (int) InviteFriendsActivity.this.f84990l);
        }
    };

    /* renamed from: w */
    private C32505b f85000w = new C32505b() {
        /* renamed from: a */
        public final boolean mo65817a(String str, String str2, int i, int i2) {
            return false;
        }

        /* renamed from: a */
        public final boolean mo65816a(final Friend friend) {
            if (InviteFriendsActivity.this.f84994p.contains(friend)) {
                return false;
            }
            InviteFriendsActivity.this.f84994p.add(friend);
            final ContactModel contactModel = new ContactModel(friend.getSocialName(), friend.getNickname());
            if (C32564a.m75339a().mo65884b() > 0) {
                User curUser = C20854a.m53167g().getCurUser();
                InviteFriendsActivity.this.f84983e.mo65894a(curUser, Arrays.asList(new ContactModel[]{contactModel}), "invite_friends", new InviteFriendsCallback() {
                    public final void onSuccess() {
                        if (InviteFriendsActivity.this.isViewValid()) {
                            friend.setInvited(true);
                            InviteFriendsActivity.this.f84994p.remove(friend);
                            int a = InviteFriendsActivity.this.f84984f.mo65831a(contactModel) + 1;
                            if (a != -1) {
                                C32534i iVar = (C32534i) InviteFriendsActivity.this.mListView.mo4847f(a);
                                if (iVar != null) {
                                    iVar.mo65839b();
                                }
                            }
                            ((InviteContactFriendsModel) InviteFriendsActivity.this.f84985g.mo54803n()).addInvitedContact(friend.getSocialName());
                        }
                    }

                    public final void onFailed(String str) {
                        InviteFriendsActivity.this.f84994p.remove(friend);
                        C10691a.m21542b((Context) InviteFriendsActivity.this, (int) R.string.dob).mo19066a();
                    }
                });
            } else {
                InviteFriendsActivity inviteFriendsActivity = InviteFriendsActivity.this;
                User curUser2 = C20854a.m53167g().getCurUser();
                inviteFriendsActivity.f84983e.mo65895a(C32570c.m75348a(inviteFriendsActivity.f84983e.mo65896b(), "", "invitesinglesms", "invite_friends", true), new C32779z(inviteFriendsActivity, curUser2, contactModel));
                friend.setInvited(true);
                InviteFriendsActivity.this.f84994p.remove(friend);
                int a = InviteFriendsActivity.this.f84984f.mo65831a(contactModel) + 1;
                if (a != -1) {
                    C32534i iVar = (C32534i) InviteFriendsActivity.this.mListView.mo4847f(a);
                    if (iVar != null) {
                        iVar.mo65839b();
                    }
                }
                ((InviteContactFriendsModel) InviteFriendsActivity.this.f84985g.mo54803n()).addInvitedContact(friend.getSocialName());
            }
            C26890h.m65011a("invite_friend_click", C23089d.m56640a().mo47829a("enter_from", "invite_friends").f61491a);
            return true;
        }
    };

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    public final void ar_() {
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<Friend> list, boolean z) {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (isViewValid()) {
        }
    }

    public void finish() {
        super.finish();
        C40884a.m90455a(this);
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            this.f84984f.am_();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f84997t != null && this.f84997t.isRunning()) {
            this.f84997t.cancel();
        }
    }

    /* renamed from: b */
    public final void mo65899b() {
        int i;
        View view = this.f84987i;
        int i2 = 0;
        if (m75472b(false)) {
            i = 0;
        } else {
            i = 8;
        }
        C9432q.m18691b(view, i);
        View view2 = this.mBtnFloatInviteAllContainer;
        if (!m75472b(true)) {
            i2 = 8;
        }
        C9432q.m18691b(view2, i2);
    }

    /* renamed from: c */
    public final void mo66197c() {
        if (C47673an.m103185b(this)) {
            mo66199h();
            mo66198d();
            return;
        }
        C26890h.m65011a("contact_notify_show", C23089d.m56640a().mo47829a("pop_logic", "bond_phone").mo47829a("enter_from", "invite_friends").f61491a);
        C47673an.m103184a(this, new C32753b() {
            /* renamed from: a */
            public final void mo60072a() {
                C26890h.m65011a("contact_notify_confirm", C23089d.m56640a().mo47829a("enter_from", "invite_friends").f61491a);
                InviteFriendsActivity.this.mo66199h();
                InviteFriendsActivity.this.mo66198d();
            }

            /* renamed from: b */
            public final void mo60073b() {
                C47940b.m103729a(R.string.ch5, R.string.ch4, InviteFriendsActivity.this, new C32711aa(this));
            }
        });
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onResume", true);
        super.onResume();
        if (this.f84988j) {
            this.f84988j = false;
            if (C47673an.m103185b(this)) {
                mo66199h();
                mo66198d();
            } else {
                finish();
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onResume", false);
    }

    public final void aJ_() {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            this.f84984f.mo50303a(null);
            this.f84984f.ao_();
            this.mStatusView.setVisibility(0);
            this.mStatusView.mo19213g();
            if (this.f84982d.getVisibility() != 8) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mStatusView.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) C9432q.m18687b((Context) this, 134.0f), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.mStatusView.setLayoutParams(marginLayoutParams);
            }
            C9432q.m18691b(this.f84987i, 8);
            C9432q.m18691b((View) this.mRefreshLayout, 0);
        }
    }

    /* renamed from: d */
    public final void mo66198d() {
        C9432q.m18691b(this.f84981c, 0);
        C9432q.m18691b(this.f84980b, 0);
        C9432q.m18691b((View) this.f84982d, 0);
        InviteFriendSharePackage b = InviteFriendSharePackage.m91859b(this.f84983e);
        C42350b bVar = new C42350b();
        C41979aq.m91946a().injectUniversalConfig(bVar, this, true);
        bVar.mo86259a((SharePackage) b).mo86258a((C42307b) new C42134b());
        C42348d a = bVar.mo86266a();
        if (a.f106948d) {
            Iterator it = a.f106945a.iterator();
            while (it.hasNext()) {
                if (!((C42307b) it.next()).mo86141a(this)) {
                    it.remove();
                }
            }
        }
        this.f84982d.mo86251a(a.f106945a);
        this.f84982d.mo86250a((C42345e) new C32775v(this, b));
    }

    /* renamed from: h */
    public final void mo66199h() {
        int i;
        C9432q.m18691b((View) this.mStatusView, 0);
        this.mStatusView.mo19212f();
        this.f84984f = new C32532h<>(0, this.f85000w);
        this.f84984f.mo54788a((C26846a) this);
        this.f84984f.f70682s = getResources().getColor(R.color.a1a);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this);
        wrapLinearLayoutManager.mo4731b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.mListView.setOverScrollMode(2);
        this.f84979a = LayoutInflater.from(this).inflate(R.layout.bb8, this.mListView, false);
        this.f84984f.mo49209c_(this.f84979a);
        this.f84987i = this.f84979a.findViewById(R.id.aut);
        this.f84980b = this.f84979a.findViewById(R.id.auv);
        this.f84981c = this.f84979a.findViewById(R.id.av0);
        this.f84982d = (ShareChannelBar) this.f84979a.findViewById(R.id.bgb);
        C32528d dVar = new C32528d(getResources().getColor(R.color.wn), (int) C9432q.m18687b((Context) this, 0.5f), 1, C9432q.m18687b((Context) this, 20.0f), C9432q.m18687b((Context) this, 20.0f));
        this.f84986h = dVar;
        this.mListView.mo4798a((C1331h) this.f84986h);
        this.mListView.setAdapter(this.f84984f);
        View view = this.f84980b;
        Resources resources = getResources();
        if (C10675b.m21499c()) {
            i = R.color.aql;
        } else {
            i = R.color.aqk;
        }
        view.setBackgroundColor(resources.getColor(i));
        this.mRefreshLayout.setOnRefreshListener(new C32776w(this));
        this.f84985g = new C26876b<>();
        this.f84985g.mo54800a(this);
        this.f84985g.mo54799a(this.f84995r);
        this.f84985g.mo44934a_(Integer.valueOf(1));
        this.f84983e.mo65893a();
        C32777x xVar = new C32777x(this);
        this.mBtnFloatInviteAll.setOnClickListener(xVar);
        this.f84987i.setOnClickListener(xVar);
        this.f84990l = C9432q.m18687b((Context) this, 84.0f);
        this.mBtnFloatInviteAllContainer.setTranslationY(this.f84990l);
        this.mListView.mo4801a((C1340m) new C1340m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                boolean z;
                super.onScrolled(recyclerView, i, i2);
                InviteFriendsActivity.this.f84991m += i2;
                if (InviteFriendsActivity.this.f84991m < 0) {
                    InviteFriendsActivity.this.f84991m = 0;
                }
                if (InviteFriendsActivity.this.mBtnFloatInviteAllContainer.getVisibility() == 0) {
                    int j = ((LinearLayoutManager) recyclerView.getLayoutManager()).mo4749j();
                    int computeVerticalScrollOffset = InviteFriendsActivity.this.mListView.computeVerticalScrollOffset();
                    StringBuilder sb = new StringBuilder(" scrollY = ");
                    sb.append(computeVerticalScrollOffset);
                    sb.append(", ");
                    if (computeVerticalScrollOffset > InviteFriendsActivity.this.f84989k) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    if (InviteFriendsActivity.this.f84989k <= 0) {
                        int measuredHeight = InviteFriendsActivity.this.f84979a.getMeasuredHeight();
                        if (measuredHeight > 0) {
                            InviteFriendsActivity.this.f84989k = measuredHeight;
                        } else {
                            return;
                        }
                    }
                    if (j > 0) {
                        if (i2 > 0 && !InviteFriendsActivity.this.f84992n) {
                            InviteFriendsActivity.this.mo66196a(true);
                            InviteFriendsActivity.this.f84992n = true;
                        }
                    } else if (i2 < 0 && InviteFriendsActivity.this.f84992n) {
                        InviteFriendsActivity.this.mo66196a(false);
                        InviteFriendsActivity.this.f84992n = false;
                    }
                }
            }
        });
    }

    /* renamed from: c */
    private void m75473c(boolean z) {
        if (!z) {
            this.f84984f.mo54798c(false);
            this.f84984f.mo54788a((C26846a) null);
            return;
        }
        this.f84984f.ao_();
    }

    /* renamed from: b */
    private boolean m75472b(boolean z) {
        int i;
        boolean z2;
        boolean z3;
        if (C32564a.m75339a().mo65884b() <= 0) {
            return false;
        }
        if (z) {
            C32570c cVar = this.f84983e;
            if (cVar.f84796b == null || !cVar.f84796b.isFloatInviteAll()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                return false;
            }
        } else {
            C32570c cVar2 = this.f84983e;
            if (cVar2.f84796b == null || !cVar2.f84796b.isShowInviteAll()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return false;
            }
        }
        if (this.f84984f != null) {
            List a = this.f84984f.mo50673a();
            if (a == null) {
                return false;
            }
            int size = a.size();
            C32570c cVar3 = this.f84983e;
            if (cVar3.f84796b == null) {
                i = 10000;
            } else {
                i = cVar3.f84796b.getLimitInviteAllCount();
            }
            if (size > i || a.isEmpty()) {
                return false;
            }
        }
        if (SharePrefCache.inst().getLastInviteAllTimeStamp() + 604800000 <= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo66196a(boolean z) {
        AnimatorListener animatorListener;
        TimeInterpolator timeInterpolator;
        if (this.f84997t != null && this.f84997t.isRunning()) {
            this.f84997t.cancel();
        }
        if (z) {
            this.f84997t = ValueAnimator.ofFloat(new float[]{this.mBtnFloatInviteAllContainer.getTranslationY(), 0.0f});
        } else {
            this.f84997t = ValueAnimator.ofFloat(new float[]{this.mBtnFloatInviteAllContainer.getTranslationY(), this.f84990l});
        }
        this.f84997t.setDuration(500);
        this.f84997t.addUpdateListener(new C32778y(this));
        ValueAnimator valueAnimator = this.f84997t;
        if (z) {
            animatorListener = this.f84999v;
        } else {
            animatorListener = this.f84998u;
        }
        valueAnimator.addListener(animatorListener);
        ValueAnimator valueAnimator2 = this.f84997t;
        if (z) {
            timeInterpolator = new C10672b();
        } else {
            timeInterpolator = new C10673c();
        }
        valueAnimator2.setInterpolator(timeInterpolator);
        this.f84997t.start();
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            if (this.f84984f.mo50673a() == null) {
                this.mStatusView.setVisibility(0);
                this.mStatusView.mo19213g();
                if (this.f84982d.getVisibility() != 8) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mStatusView.getLayoutParams();
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) C9432q.m18687b((Context) this, 134.0f), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    this.mStatusView.setLayoutParams(marginLayoutParams);
                }
                C9432q.m18691b(this.f84987i, 8);
            }
            C9432q.m18691b((View) this.mRefreshLayout, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bb3);
        if (getIntent().hasExtra("enter_from")) {
            f84978q = getIntent().getStringExtra("enter_from");
        }
        User curUser = C20854a.m53167g().getCurUser();
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                InviteFriendsActivity.this.onBackPressed();
            }
        });
        this.mTitleBar.setTitle(getText(R.string.bt3));
        this.mTitleBar.setTitleColor(getResources().getColor(R.color.a1k));
        this.mStatusView.setBuilder(C10719a.m21676a((Context) this).mo19223a().mo19225a(R.string.bx4, R.string.axw));
        this.f84983e = new C32570c(this.f84995r, this);
        if (curUser.isPhoneBinded()) {
            mo66197c();
        } else {
            C26890h.m65011a("phone_bundling_show", C23089d.m56640a().mo47829a("enter_from", "invite_friends").f61491a);
            C37139b bVar = new C37139b(this, new C37140a() {
                /* renamed from: b */
                public final void mo66202b(Dialog dialog) {
                    InviteFriendsActivity.this.mo66197c();
                }

                /* renamed from: a */
                public final void mo66201a(Dialog dialog) {
                    C26890h.m65011a("phone_bundling_click", C23089d.m56640a().mo47829a("enter_from", "invite_friends").f61491a);
                    InviteFriendsActivity.this.mo66197c();
                }
            }, null);
            bVar.f94808b = "invite_friends";
            C47700ay.m103235a(bVar.f94807a);
        }
        C26894c.m65022a(findViewById(R.id.csm));
        C47888fj.m103590b(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo47026b(List<Friend> list, boolean z) {
        if (isViewValid()) {
            this.f84984f.ao_();
            this.f84984f.mo50304b(list);
            this.mStatusView.setVisibility(4);
            m75473c(z);
            mo65899b();
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<Friend> list, boolean z) {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            if (list == null) {
                this.mStatusView.setVisibility(0);
            } else {
                this.f84984f.ao_();
                List<String> list2 = ((InviteContactFriendsModel) this.f84985g.mo54803n()).mIndexLetters;
                List<Integer> list3 = ((InviteContactFriendsModel) this.f84985g.mo54803n()).mIndexCounts;
                if (this.f84996s != null) {
                    this.mListView.mo4815b((C1331h) this.f84996s);
                    this.f84996s = null;
                }
                if (!list2.isEmpty() && !list3.isEmpty()) {
                    int[] iArr = new int[list3.size()];
                    for (int i = 0; i < list3.size(); i++) {
                        iArr[i] = ((Integer) list3.get(i)).intValue();
                    }
                    String[] strArr = new String[list2.size()];
                    list2.toArray(strArr);
                    C32527c cVar = new C32527c(strArr, iArr);
                    this.f84996s = new C32530f(this, cVar, this.f84984f.mo49208b());
                    this.mListView.mo4798a((C1331h) this.f84996s);
                    C32532h<Friend> hVar = this.f84984f;
                    hVar.f84701e = cVar;
                    hVar.f84702f.f84705a = -1;
                }
                this.f84984f.mo50303a(list);
                this.mStatusView.mo19209d();
                this.mStatusView.setVisibility(4);
                m75473c(z);
            }
            this.f84991m = 0;
            mo65899b();
            C9432q.m18691b((View) this.mRefreshLayout, 0);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47937a.m103720a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
