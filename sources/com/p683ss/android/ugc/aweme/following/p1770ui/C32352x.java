package com.p683ss.android.ugc.aweme.following.p1770ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24501b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.C32112c;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.FollowingAdapter;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32772s;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;
import com.p683ss.android.ugc.aweme.profile.util.C40556o;
import com.p683ss.android.ugc.aweme.utils.C47849eh;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.following.ui.x */
public abstract class C32352x extends C23526a implements C10713a, C23452y<User>, C26877c<User>, C39979m {

    /* renamed from: b */
    protected FollowingAdapter f84216b;

    /* renamed from: c */
    protected C32772s f84217c;

    /* renamed from: d */
    protected TextTitleBar f84218d;

    /* renamed from: e */
    RecyclerView f84219e;

    /* renamed from: j */
    DmtStatusView f84220j;

    /* renamed from: k */
    SwipeRefreshLayout f84221k;

    /* renamed from: l */
    protected C32199n f84222l;

    /* renamed from: m */
    protected int f84223m;

    /* renamed from: n */
    protected C10719a f84224n;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.x$a */
    class C32356a implements C32112c {
        private C32356a() {
        }

        /* renamed from: a */
        public final boolean mo56498a(User user) {
            int i = 0;
            if (C32352x.this.f84217c.mo66352o()) {
                return false;
            }
            if (user.getFollowStatus() == 0) {
                i = 1;
            }
            C32352x.this.f84217c.mo66349a(new C39970a().mo81871a(user.getUid()).mo81874b(user.getSecUid()).mo81869a(i).mo81877d(user.getFollowerStatus()).mo81872a());
            return true;
        }

        /* renamed from: a */
        public final void mo56497a(User user, int i) {
            UserProfileActivity.m89402a((Context) C32352x.this.getActivity(), user, C32352x.this.mo65484s());
            ((C23249s) new C23249s().mo48137c(C32352x.this.mo65236k()).mo47941a("click_card")).mo48144s(user.getUid()).mo48076e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.x$b */
    public enum C32357b implements Serializable {
        following,
        follower
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo48614a(int i, Object obj, int i2, View view, String str) {
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: b */
    public void mo19167b(View view) {
    }

    /* renamed from: c */
    public final void mo47029c(List<User> list, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo65233h();

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public abstract int mo65234i();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract String mo65236k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract int mo65237l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo65238m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract int mo65239n();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract int mo65242p();

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract C26876b mo65243q();

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            this.f84216b.am_();
        }
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (isViewValid() && C9376b.m18558a((Collection<T>) this.f84216b.mo50673a())) {
            this.f84220j.mo19212f();
        }
    }

    public final void aJ_() {
        if (isViewValid()) {
            this.f84221k.setRefreshing(false);
            this.f84216b.mo50303a(null);
            this.f84216b.an_();
            this.f84220j.mo19213g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo65240o() {
        return C20902b.m53242a().getCurUserId().equals(this.f84222l.getUid());
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f84217c != null) {
            this.f84217c.mo66347S_();
        }
        if (mo65243q() != null) {
            mo65243q().mo46991S_();
        }
    }

    /* renamed from: r */
    public final boolean mo65483r() {
        if (!C32359z.m74690a(getContext())) {
            C10691a.m21542b(getContext(), (int) R.string.cg1).mo19066a();
            return false;
        }
        return mo65243q().mo44934a_(Integer.valueOf(1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo65235j() {
        this.f84218d.setTitle(mo65242p());
        this.f84218d.setTitleColor(getResources().getColor(R.color.xj));
        this.f84218d.setOnTitleBarClickListener(this);
        C47849eh.m103498b(this.f84219e);
        this.f84224n = C10719a.m21676a(getContext()).mo19232b(C48190g.m104428a(getContext(), new C32358y(this)));
        MtEmptyView a = MtEmptyView.m21697a(getContext());
        a.setStatus(new C10723a(getContext()).mo19277a(mo65237l()).mo19280b(mo65238m()).mo19282c(mo65239n()).f28711a);
        this.f84224n.mo19231b((View) a);
        this.f84220j.setBuilder(this.f84224n);
    }

    /* renamed from: s */
    public final String mo65484s() {
        if (TextUtils.isEmpty(mo65236k())) {
            return "";
        }
        String k = mo65236k();
        char c = 65535;
        int hashCode = k.hashCode();
        if (hashCode != -198284867) {
            if (hashCode == 1539074444 && k.equals("following_list")) {
                c = 0;
            }
        } else if (k.equals("fans_list")) {
            c = 1;
        }
        switch (c) {
            case 0:
                if (mo65240o()) {
                    return "following";
                }
                return "other_following";
            case 1:
                if (mo65240o()) {
                    return "fans";
                }
                return "other_fans";
            default:
                return "";
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @C53771m
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        m74660a(followStatus);
    }

    /* renamed from: a */
    private void m74660a(FollowStatus followStatus) {
        if (isViewValid() && this.f84216b != null) {
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        if (isViewValid()) {
            this.f84216b.mo54793i();
        }
    }

    /* renamed from: a */
    public final void mo19166a(View view) {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public void onFollowFail(final Exception exc) {
        if (isViewValid()) {
            if (C24501b.m59896a(exc)) {
                C24501b.m59895a(getChildFragmentManager(), (C23459a) exc, new C24493b() {
                    /* renamed from: a */
                    public final void mo45353a() {
                        C32352x.this.f84217c.mo66351c();
                    }

                    /* renamed from: b */
                    public final void mo45354b() {
                        C22971a.m56494a(C32352x.this.getContext(), exc, R.string.b47);
                    }
                });
            } else {
                C22971a.m56494a(getContext(), exc, R.string.b47);
            }
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        User user;
        if (isViewValid()) {
            m74660a(followStatus);
            FollowingAdapter followingAdapter = this.f84216b;
            String str = followStatus.userId;
            if (followingAdapter.f70670n != null) {
                Iterator it = followingAdapter.f70670n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    user = (User) it.next();
                    if (TextUtils.equals(user.getUid(), str)) {
                        break;
                    }
                }
            }
            user = null;
            if (user != null) {
                C40556o.m89968a(getContext(), user, followStatus);
            }
            if (followStatus.followStatus == 0 && user != null && !TextUtils.isEmpty(user.getRemarkName())) {
                user.setRemarkName("");
                int a = this.f84216b.mo65284a(followStatus.userId);
                if (a != -1) {
                    this.f84216b.notifyItemChanged(a);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo47025b(Exception exc) {
        if (isViewValid()) {
            int i = 0;
            this.f84221k.setRefreshing(false);
            this.f84216b.mo50303a(null);
            this.f84216b.an_();
            if (!mo65240o() && getContext() != null) {
                Throwable a = C22971a.m56490a((Throwable) exc);
                if ((a instanceof C23459a) && this.f84222l != null) {
                    C23459a aVar = (C23459a) a;
                    User user = this.f84222l.getUser();
                    if (user != null) {
                        if (aVar.getErrorCode() == 2077 && user.isBlock) {
                            i = R.string.tk;
                        } else if (aVar.getErrorCode() == 2078 && user.isBlocked()) {
                            i = R.string.bth;
                        }
                    }
                }
                if (!(i == 0 || this.f84224n == null || this.f84220j == null)) {
                    this.f84220j.mo19209d();
                    this.f84224n.mo19232b(new C10723a(getContext()).mo19277a((int) R.drawable.aqw).mo19280b((int) R.string.t9).mo19282c(i).f28711a);
                    this.f84220j.setBuilder(this.f84224n);
                }
            }
            this.f84220j.mo19214h();
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<User> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            this.f84216b.mo54798c(false);
        } else {
            this.f84216b.ao_();
        }
        this.f84216b.mo50304b(list);
    }

    /* renamed from: a */
    public void mo47018a(List<User> list, boolean z) {
        if (isViewValid()) {
            this.f84216b.mo54798c(true);
            this.f84221k.setRefreshing(false);
            this.f84216b.mo50303a(list);
            this.f84220j.mo19209d();
            if (!z) {
                this.f84216b.mo54798c(false);
            } else {
                this.f84216b.ao_();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f84222l = (C32199n) getArguments().getSerializable("following_page_param");
        this.f84223m = getArguments().getInt("following_or_follower_count", 0);
        mo65235j();
        this.f84216b = new FollowingAdapter(this);
        this.f84216b.mo65285a(this.f84222l);
        this.f84216b.mo54788a((C26846a) new C26846a() {
            public final void ar_() {
                if (C32352x.this.isViewValid()) {
                    C32352x.this.mo65243q().mo44934a_(Integer.valueOf(4));
                }
            }
        });
        this.f84216b.f83754f = new C32356a();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo4731b(1);
        this.f84219e.setLayoutManager(wrapLinearLayoutManager);
        this.f84219e.setOverScrollMode(2);
        this.f84219e.setAdapter(this.f84216b);
        this.f84219e.getItemAnimator().f4728i = 0;
        ((C1440au) this.f84219e.getItemAnimator()).f5184m = false;
        this.f84221k.setOnRefreshListener(new C23596b() {
            /* renamed from: a */
            public final void mo47048a() {
                if (C32352x.this.mo65243q() != null) {
                    C32352x.this.mo65483r();
                } else {
                    C32352x.this.f84221k.setRefreshing(false);
                }
            }
        });
        mo65233h();
        mo65483r();
        this.f84217c = C32616c.f84865a.getFollowPresenter();
        this.f84217c.mo66348a((C39979m) this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo65234i(), viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        this.f84218d = (TextTitleBar) inflate.findViewById(R.id.d10);
        this.f84219e = (RecyclerView) inflate.findViewById(R.id.bc3);
        this.f84220j = (DmtStatusView) inflate.findViewById(R.id.csv);
        return inflate;
    }
}
