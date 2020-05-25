package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.app.Activity;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.lobby.auth.C12316a;
import com.bytedance.lobby.auth.C12318c.C12320a;
import com.bytedance.lobby.internal.C12347d;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24501b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.friends.adapter.C32528d;
import com.p683ss.android.ugc.aweme.friends.adapter.C32532h;
import com.p683ss.android.ugc.aweme.friends.adapter.C32534i;
import com.p683ss.android.ugc.aweme.friends.model.Friend;
import com.p683ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32505b;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32568a;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39971i;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42281n;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42295u;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42299w;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity */
public class InviteUserListActivity extends AmeSSActivity implements C12316a, C26846a, C26877c<Friend>, C39979m {

    /* renamed from: e */
    private static final boolean f85013e = false;

    /* renamed from: a */
    public boolean f85014a;

    /* renamed from: b */
    public C26876b<C32568a> f85015b;

    /* renamed from: c */
    public C39971i f85016c;

    /* renamed from: d */
    public String f85017d;

    /* renamed from: f */
    private C32532h f85018f;

    /* renamed from: g */
    private C32528d f85019g;

    /* renamed from: h */
    private C12347d f85020h;

    /* renamed from: i */
    private int f85021i = 3;

    /* renamed from: j */
    private String f85022j;

    /* renamed from: k */
    private String f85023k;

    /* renamed from: l */
    private C32505b f85024l = new C32505b() {
        /* renamed from: a */
        public final boolean mo65816a(Friend friend) {
            if (!C32714ad.m75595a(InviteUserListActivity.this)) {
                C10691a.m21542b((Context) InviteUserListActivity.this, (int) R.string.cg1).mo19066a();
                return false;
            } else if (InviteUserListActivity.this.f85014a) {
                return false;
            } else {
                InviteUserListActivity.this.f85014a = true;
                return true;
            }
        }

        /* renamed from: a */
        public final boolean mo65817a(String str, String str2, int i, int i2) {
            if (!C32714ad.m75595a(InviteUserListActivity.this)) {
                C10691a.m21542b((Context) InviteUserListActivity.this, (int) R.string.cg1).mo19066a();
                return false;
            } else if (InviteUserListActivity.this.f85015b == null || InviteUserListActivity.this.f85016c.mo54804o()) {
                return false;
            } else {
                InviteUserListActivity.this.f85016c.mo66349a(new C39970a().mo81871a(str).mo81874b(str2).mo81869a(i2).mo81876c(InviteUserListActivity.this.f85017d).mo81877d(i).mo81872a());
                return true;
            }
        }
    };
    TextView mInviteText;
    RecyclerView mListView;
    SwipeRefreshLayout mRefreshLayout;
    DmtStatusView mStatusView;
    ButtonTitleBar mTitleBar;
    TextView mTitleView;

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    public void back() {
        onBackPressed();
    }

    /* renamed from: c */
    public final void mo47029c(List<Friend> list, boolean z) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onFollowSuccess(FollowStatus followStatus) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            this.f85018f.am_();
        }
    }

    public final void ar_() {
        if (isViewValid()) {
            this.f85015b.mo44934a_(Integer.valueOf(4));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f85015b != null) {
            this.f85015b.mo46991S_();
        }
        if (this.f85016c != null) {
            this.f85016c.mo46991S_();
        }
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (isViewValid()) {
            if (this.f85018f.mo48636c() == 0) {
                this.mRefreshLayout.setRefreshing(false);
                this.mStatusView.setVisibility(0);
                this.mStatusView.mo19212f();
                return;
            }
            this.mRefreshLayout.setRefreshing(true);
        }
    }

    public final void aJ_() {
        if (isViewValid()) {
            this.mStatusView.setVisibility(0);
            this.mStatusView.mo19213g();
            this.mRefreshLayout.setRefreshing(false);
            if (this.f85018f.f70699x) {
                this.f85018f.mo54798c(false);
                this.f85018f.notifyDataSetChanged();
            }
        }
    }

    public void finish() {
        super.finish();
        if (isTaskRoot()) {
            C41302w.m91042a().mo83858a((Activity) this, C41311y.m91065a("aweme://main").mo83870a("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION").mo83871a());
        }
    }

    /* renamed from: d */
    private C42324j m75497d() {
        User curUser = C20854a.m53167g().getCurUser();
        String a = C2240a.m6772a(getString(R.string.bt7), new Object[]{C47915gg.m103656e(curUser)});
        StringBuilder sb = new StringBuilder();
        sb.append("https://tiktokv.com/invitef/download");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a);
        sb2.append(" ");
        sb2.append(sb.toString());
        return new C42324j(sb2.toString());
    }

    /* renamed from: b */
    public final void mo66211b() {
        if (this.f85021i == 3) {
            this.f85015b.mo54799a(new ThirdPartyFriendModel("facebook", this.f85022j, null));
        } else if (this.f85021i == 2) {
            this.f85015b.mo54799a(new ThirdPartyFriendModel("twitter", this.f85022j, this.f85023k));
        } else if (this.f85021i == 4) {
            this.f85015b.mo54799a(new ThirdPartyFriendModel("vk", this.f85022j, this.f85023k));
        } else {
            return;
        }
        this.f85015b.mo44934a_(Integer.valueOf(1));
        this.f85016c = new C39971i();
        this.f85016c.mo54800a(this);
        this.f85014a = false;
    }

    /* renamed from: c */
    private void m75496c() {
        if (this.f85021i == 2) {
            C26890h.m65011a("friend_list_notify_show", C23089d.m56640a().mo47829a("enter_from", "twitter").f61491a);
            C12347d.m24858a(new C12320a(this).mo23309a("twitter").mo23308a((C12316a) this).mo23310a());
        } else if (this.f85021i == 3) {
            C26890h.m65011a("friend_list_notify_show", C23089d.m56640a().mo47829a("enter_from", "facebook").f61491a);
            C12347d.m24858a(new C12320a(this).mo23309a("facebook").mo23307a(new C47661ab().mo94972a("fb_read_permissions", "public_profile, user_friends, user_age_range, email").f120139a).mo23308a((C12316a) this).mo23310a());
        } else {
            if (this.f85021i == 4) {
                C26890h.m65011a("friend_list_notify_show", C23089d.m56640a().mo47829a("enter_from", "vk").f61491a);
                C12347d.m24858a(new C12320a(this).mo23309a("vk").mo23308a((C12316a) this).mo23310a());
            }
        }
    }

    /* renamed from: a */
    private void m75495a(boolean z) {
        if (!z) {
            this.f85018f.mo54798c(false);
            this.f85018f.mo54788a((C26846a) null);
            return;
        }
        this.f85018f.ao_();
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (isViewValid()) {
            this.mStatusView.setVisibility(0);
            this.mStatusView.mo19213g();
            if (this.f85018f.f70699x) {
                this.f85018f.mo54798c(false);
                this.f85018f.notifyDataSetChanged();
            }
            this.mRefreshLayout.setRefreshing(false);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        if (isViewValid()) {
            this.f85018f.co_();
            boolean z = false;
            if (exc != null && (exc instanceof C23459a) && ((C23459a) exc).getErrorCode() == 101) {
                z = true;
            }
            if (z) {
                m75496c();
            }
        }
    }

    /* renamed from: d */
    public final void mo66213d(Exception exc) {
        C22971a.m56494a(this, exc, R.string.b47);
        int a = this.f85018f.mo65832a(this.f85016c.f101910b);
        if (a >= 0) {
            C32534i iVar = (C32534i) this.mListView.mo4847f(a);
            if (iVar != null) {
                iVar.mo65837a();
            }
        }
    }

    public void onFollowFail(final Exception exc) {
        if (isViewValid() && this.f85016c != null && this.f85018f != null) {
            if (C24501b.m59896a(exc)) {
                C24501b.m59895a(getSupportFragmentManager(), (C23459a) exc, new C24493b() {
                    /* renamed from: a */
                    public final void mo45353a() {
                        InviteUserListActivity.this.f85016c.mo44935c();
                    }

                    /* renamed from: b */
                    public final void mo45354b() {
                        InviteUserListActivity.this.mo66213d(exc);
                    }
                });
            } else {
                mo66213d(exc);
            }
        }
    }

    @C53771m
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (isViewValid()) {
            this.f85018f.mo65833a(followStatus);
            int a = this.f85018f.mo65832a(followStatus.userId);
            if (a != -1) {
                C32534i iVar = (C32534i) this.mListView.mo4847f(a);
                if (iVar != null) {
                    iVar.mo65837a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r0.equals("facebook") == false) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23306a(com.bytedance.lobby.auth.AuthResult r7) {
        /*
            r6 = this;
            boolean r0 = r6.mStatusDestroyed
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r7.f32453a
            r1 = 2132545883(0x7f1c115b, float:2.0744968E38)
            r2 = 0
            if (r0 != 0) goto L_0x002e
            boolean r7 = r7.f32454b
            if (r7 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout r7 = r6.mRefreshLayout
            r7.setRefreshing(r2)
            r6.mo66211b()
            return
        L_0x001a:
            android.content.res.Resources r7 = r6.getResources()
            java.lang.String r7 = r7.getString(r1)
            r6.showCustomToast(r7)
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout r7 = r6.mRefreshLayout
            r7.setRefreshing(r2)
            r6.finish()
            return
        L_0x002e:
            java.lang.String r0 = r7.f32456d
            r3 = -1
            int r4 = r0.hashCode()
            r5 = -916346253(0xffffffffc961aa73, float:-924327.2)
            if (r4 == r5) goto L_0x0057
            r5 = 3765(0xeb5, float:5.276E-42)
            if (r4 == r5) goto L_0x004d
            r5 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r4 == r5) goto L_0x0044
            goto L_0x0061
        L_0x0044:
            java.lang.String r4 = "facebook"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x004d:
            java.lang.String r2 = "vk"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0061
            r2 = 2
            goto L_0x0062
        L_0x0057:
            java.lang.String r2 = "twitter"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0061
            r2 = 1
            goto L_0x0062
        L_0x0061:
            r2 = -1
        L_0x0062:
            switch(r2) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x0070;
                case 2: goto L_0x0067;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x00e9
        L_0x0067:
            java.lang.String r7 = r7.f32458f
            r6.f85022j = r7
            r6.mo66211b()
            goto L_0x00e9
        L_0x0070:
            java.lang.String r0 = r7.f32458f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = r7.f32459g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0081
            goto L_0x00a7
        L_0x0081:
            java.lang.String r0 = "friend_list_notify_confirm"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "twitter"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
            java.lang.String r0 = r7.f32458f
            r6.f85022j = r0
            java.lang.String r7 = r7.f32459g
            r6.f85023k = r7
            java.lang.String r7 = r6.f85022j
            java.lang.String r0 = r6.f85023k
            com.p683ss.android.ugc.trill.p2516b.p2517a.C50310a.m108579b(r7, r0)
            r6.mo66211b()
            return
        L_0x00a7:
            android.content.res.Resources r7 = r6.getResources()
            java.lang.String r7 = r7.getString(r1)
            r6.showCustomToast(r7)
            return
        L_0x00b3:
            java.lang.String r0 = "friend_list_notify_confirm"
            com.ss.android.ugc.aweme.app.f.d r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "facebook"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
            java.lang.String r0 = r7.f32458f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00da
            android.content.res.Resources r7 = r6.getResources()
            java.lang.String r7 = r7.getString(r1)
            r6.showCustomToast(r7)
            return
        L_0x00da:
            java.lang.String r0 = r7.f32458f
            r6.f85022j = r0
            java.lang.String r0 = r6.f85022j
            long r1 = r7.f32460h
            com.p683ss.android.ugc.trill.p2516b.p2517a.C50310a.m108576a(r0, r1)
            r6.mo66211b()
            return
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.p1792ui.InviteUserListActivity.mo23306a(com.bytedance.lobby.auth.AuthResult):void");
    }

    public void onClick(View view) {
        if (view.getId() == R.id.auu) {
            if (this.f85021i == 3) {
                C26890h.m65011a("invite_friend", C23089d.m56640a().mo47829a("enter_from", "facebook").f61491a);
                C42281n nVar = new C42281n(new C32712ab(this));
                if (nVar.mo86141a(this)) {
                    nVar.mo86134a(m75497d(), (Context) this);
                } else {
                    C10691a.m21542b((Context) this, (int) R.string.c5y).mo19066a();
                }
            } else if (this.f85021i == 2) {
                C26890h.m65011a("invite_friend", C23089d.m56640a().mo47829a("enter_from", "twitter").f61491a);
                new C42295u().mo86134a(m75497d(), (Context) this);
            } else if (this.f85021i == 4) {
                C26890h.m65011a("invite_friend", C23089d.m56640a().mo47829a("enter_from", "vk").f61491a);
                new C42299w().mo86134a(m75497d(), (Context) this);
            }
        } else if (view.getId() == R.id.ccd) {
            setResult(-1);
            finish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r13)
            r13 = 2132214686(0x7f17039e, float:2.007322E38)
            r12.setContentView(r13)
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r0 = "type"
            r1 = 3
            int r13 = r13.getIntExtra(r0, r1)
            r12.f85021i = r13
            android.content.Intent r13 = r12.getIntent()
            java.lang.String r0 = "enter_from"
            java.lang.String r13 = r13.getStringExtra(r0)
            r12.f85017d = r13
            r13 = 2132019791(0x7f140a4f, float:1.9677927E38)
            android.view.View r0 = r12.findViewById(r13)
            android.content.res.Resources r3 = r12.getResources()
            r4 = 2131821891(0x7f110543, float:1.9276538E38)
            int r3 = r3.getColor(r4)
            r0.setBackgroundColor(r3)
            android.widget.TextView r0 = r12.mInviteText
            r3 = 2132545880(0x7f1c1158, float:2.0744962E38)
            r0.setText(r3)
            int r0 = r12.f85021i
            r3 = 2
            r4 = 4
            if (r0 != r1) goto L_0x0056
            android.widget.TextView r0 = r12.mTitleView
            r5 = 2132544512(0x7f1c0c00, float:2.0742187E38)
            r0.setText(r5)
            goto L_0x006f
        L_0x0056:
            int r0 = r12.f85021i
            if (r0 != r3) goto L_0x0063
            android.widget.TextView r0 = r12.mTitleView
            r5 = 2132551548(0x7f1c277c, float:2.0756458E38)
            r0.setText(r5)
            goto L_0x006f
        L_0x0063:
            int r0 = r12.f85021i
            if (r0 != r4) goto L_0x006f
            android.widget.TextView r0 = r12.mTitleView
            r5 = 2132551911(0x7f1c28e7, float:2.0757194E38)
            r0.setText(r5)
        L_0x006f:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r12.mStatusView
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r5 = com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a.m21676a(r12)
            r6 = 2132544434(0x7f1c0bb2, float:2.074203E38)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r5 = r5.mo19224a(r6)
            r0.setBuilder(r5)
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout r0 = r12.mRefreshLayout
            com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity$1 r5 = new com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity$1
            r5.<init>()
            r0.setOnRefreshListener(r5)
            com.ss.android.ugc.aweme.views.WrapLinearLayoutManager r0 = new com.ss.android.ugc.aweme.views.WrapLinearLayoutManager
            r0.<init>(r12)
            android.support.v7.widget.RecyclerView r5 = r12.mListView
            r5.setLayoutManager(r0)
            com.ss.android.ugc.aweme.friends.adapter.d r0 = new com.ss.android.ugc.aweme.friends.adapter.d
            android.content.res.Resources r5 = r12.getResources()
            r6 = 2131821851(0x7f11051b, float:1.9276457E38)
            int r7 = r5.getColor(r6)
            r5 = 1056964608(0x3f000000, float:0.5)
            float r5 = com.bytedance.common.utility.C9432q.m18687b(r12, r5)
            int r8 = (int) r5
            r9 = 1
            r5 = 1101004800(0x41a00000, float:20.0)
            float r10 = com.bytedance.common.utility.C9432q.m18687b(r12, r5)
            float r11 = com.bytedance.common.utility.C9432q.m18687b(r12, r5)
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            r12.f85019g = r0
            android.support.v7.widget.RecyclerView r0 = r12.mListView
            com.ss.android.ugc.aweme.friends.adapter.d r5 = r12.f85019g
            r0.mo4798a(r5)
            com.ss.android.ugc.aweme.friends.adapter.h r0 = new com.ss.android.ugc.aweme.friends.adapter.h
            int r5 = r12.f85021i
            com.ss.android.ugc.aweme.friends.a.b r6 = r12.f85024l
            r0.<init>(r5, r6)
            r12.f85018f = r0
            com.ss.android.ugc.aweme.friends.adapter.h r0 = r12.f85018f
            r0.mo54788a(r12)
            com.ss.android.ugc.aweme.friends.adapter.h r0 = r12.f85018f
            r5 = 0
            r0.mo54798c(r5)
            android.support.v7.widget.RecyclerView r0 = r12.mListView
            com.ss.android.ugc.aweme.friends.adapter.h r6 = r12.f85018f
            r0.setAdapter(r6)
            com.ss.android.ugc.aweme.common.f.b r0 = new com.ss.android.ugc.aweme.common.f.b
            r0.<init>()
            r12.f85015b = r0
            com.ss.android.ugc.aweme.common.f.b<com.ss.android.ugc.aweme.friends.c.a> r0 = r12.f85015b
            r0.mo54800a(r12)
            com.bytedance.lobby.internal.d r0 = com.bytedance.lobby.internal.C12347d.m24857a()
            r12.f85020h = r0
            int r0 = r12.f85021i
            if (r0 != r1) goto L_0x00f7
            java.lang.String r0 = com.p683ss.android.ugc.trill.p2516b.p2517a.C50310a.m108577b()
            goto L_0x0124
        L_0x00f7:
            int r0 = r12.f85021i
            if (r0 != r3) goto L_0x0110
            java.lang.String r0 = "twitter_access_token"
            java.lang.String r1 = ""
            java.lang.String r0 = com.p683ss.android.ugc.trill.p2516b.p2517a.C50310a.m108575a(r0, r1)
            r12.f85022j = r0
            java.lang.String r0 = "twitter_access_token_secret"
            java.lang.String r1 = ""
            java.lang.String r0 = com.p683ss.android.ugc.trill.p2516b.p2517a.C50310a.m108575a(r0, r1)
            r12.f85023k = r0
            goto L_0x0126
        L_0x0110:
            int r0 = r12.f85021i
            if (r0 != r4) goto L_0x0126
            com.bytedance.lobby.internal.d r0 = r12.f85020h
            java.lang.String r1 = "vk"
            com.bytedance.lobby.auth.d r0 = r0.mo23349b(r1)
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r0.mo23314b()
            goto L_0x0124
        L_0x0123:
            r0 = 0
        L_0x0124:
            r12.f85022j = r0
        L_0x0126:
            java.lang.String r0 = r12.f85022j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0133
            r12.mo66211b()
            goto L_0x0136
        L_0x0133:
            r12.m75496c()
        L_0x0136:
            com.ss.android.ugc.aweme.friends.adapter.h r0 = r12.f85018f
            android.content.res.Resources r1 = r12.getResources()
            r2 = 2131821804(0x7f1104ec, float:1.9276362E38)
            int r1 = r1.getColor(r2)
            r0.f70682s = r1
            java.lang.String r0 = r12.f85017d
            java.lang.String r1 = "guide_to_invite_third_friends"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0183
            android.view.View r13 = r12.findViewById(r13)
            r0 = 8
            r13.setVisibility(r0)
            com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar r13 = r12.mTitleBar
            android.widget.ImageView r13 = r13.getStartBtn()
            r13.setVisibility(r4)
            com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar r13 = r12.mTitleBar
            com.bytedance.ies.dmt.ui.widget.DmtTextView r13 = r13.getEndBtn()
            r13.setVisibility(r5)
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131821719(0x7f110497, float:1.927619E38)
            int r0 = r0.getColor(r1)
            r13.setTextColor(r0)
            r0 = 1099431936(0x41880000, float:17.0)
            r13.setTextSize(r0)
            r0 = 2132544121(0x7f1c0a79, float:2.0741394E38)
            r13.setText(r0)
        L_0x0183:
            java.lang.String r13 = "com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity"
            java.lang.String r0 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r13, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.friends.p1792ui.InviteUserListActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: b */
    public final void mo47026b(List<Friend> list, boolean z) {
        if (isViewValid()) {
            m75495a(z);
            this.f85018f.mo50304b(list);
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<Friend> list, boolean z) {
        if (isViewValid()) {
            this.mStatusView.mo19209d();
            this.mStatusView.setVisibility(8);
            this.mRefreshLayout.setRefreshing(false);
            this.f85018f.mo54798c(true);
            this.f85018f.mo50303a(list);
            m75495a(z);
        }
    }
}
