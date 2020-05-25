package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
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
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.friends.adapter.C32528d;
import com.p683ss.android.ugc.aweme.friends.adapter.C32532h;
import com.p683ss.android.ugc.aweme.friends.adapter.C32534i;
import com.p683ss.android.ugc.aweme.friends.model.ContactModel;
import com.p683ss.android.ugc.aweme.friends.model.Friend;
import com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.p683ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InviteFriendsCallback;
import com.p683ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32505b;
import com.p683ss.android.ugc.aweme.friends.p1788b.C32564a;
import com.p683ss.android.ugc.aweme.friends.p1789c.C32570c;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38041h;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39971i;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;
import com.p683ss.android.ugc.aweme.push.C40884a;
import com.p683ss.android.ugc.aweme.utils.C47673an;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47888fj;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.p683ss.android.ugc.aweme.utils.permission.C47940b;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ContactsActivity */
public class ContactsActivity extends AmeSSActivity implements C26846a, C26877c, C39979m {

    /* renamed from: a */
    public C32532h<Friend> f84883a;

    /* renamed from: b */
    public C26876b<ThirdPartyFriendModel> f84884b;

    /* renamed from: c */
    public C39971i f84885c;

    /* renamed from: d */
    C32528d f84886d;

    /* renamed from: e */
    boolean f84887e;
    RelativeLayout enterBindRl;

    /* renamed from: f */
    public String f84888f = "";

    /* renamed from: g */
    public C32570c f84889g;

    /* renamed from: h */
    public List<Friend> f84890h = new ArrayList();

    /* renamed from: i */
    private InviteContactFriendsModel f84891i = new InviteContactFriendsModel("contact");
    ImageView ivBindPhone;

    /* renamed from: j */
    private C32505b f84892j = new C32505b() {
        /* renamed from: a */
        public final boolean mo65816a(final Friend friend) {
            final ContactModel contactModel = new ContactModel(friend.getSocialName(), friend.getNickname());
            if (C32564a.m75339a().mo65884b() == 0) {
                friend.setInvited(true);
                ((ThirdPartyFriendModel) ContactsActivity.this.f84884b.mo54803n()).addInvitedContact(friend.getSocialName());
                int a = ContactsActivity.this.f84883a.mo65831a(contactModel);
                if (a != -1) {
                    C32534i iVar = (C32534i) ContactsActivity.this.mListView.mo4847f(a);
                    if (iVar != null) {
                        iVar.mo65839b();
                    }
                }
                User curUser = C20854a.m53167g().getCurUser();
                ContactsActivity.this.f84889g.mo65895a(C32570c.m75348a(ContactsActivity.this.f84889g.mo65896b(), "", "invitesinglesms", "find_contact_friends", true), new C32758g(this, curUser, contactModel));
            } else if (ContactsActivity.this.f84890h.contains(friend)) {
                return false;
            } else {
                ContactsActivity.this.f84890h.add(friend);
                User curUser2 = C20854a.m53167g().getCurUser();
                ContactsActivity.this.f84889g.mo65894a(curUser2, Arrays.asList(new ContactModel[]{contactModel}), "find_contact_friends", new InviteFriendsCallback() {
                    public final void onSuccess() {
                        if (ContactsActivity.this.isViewValid()) {
                            friend.setInvited(true);
                            ContactsActivity.this.f84890h.remove(friend);
                            int a = ContactsActivity.this.f84883a.mo65831a(contactModel);
                            if (a != -1) {
                                C32534i iVar = (C32534i) ContactsActivity.this.mListView.mo4847f(a);
                                if (iVar != null) {
                                    iVar.mo65839b();
                                }
                            }
                            ((ThirdPartyFriendModel) ContactsActivity.this.f84884b.mo54803n()).addInvitedContact(friend.getSocialName());
                        }
                    }

                    public final void onFailed(String str) {
                        ContactsActivity.this.f84890h.remove(friend);
                        C10691a.m21542b((Context) ContactsActivity.this, (int) R.string.dob).mo19066a();
                    }
                });
            }
            return true;
        }

        /* renamed from: a */
        public final boolean mo65817a(String str, String str2, int i, int i2) {
            if (!C32759h.m75633a(ContactsActivity.this)) {
                C10691a.m21542b((Context) ContactsActivity.this, (int) R.string.cg1).mo19066a();
                return false;
            } else if (ContactsActivity.this.f84885c == null || ContactsActivity.this.f84885c.mo54804o()) {
                return false;
            } else {
                ContactsActivity.this.f84885c.mo66349a(new C39970a().mo81871a(str).mo81874b(str2).mo81869a(i2).mo81873b(4).mo81876c(ContactsActivity.this.f84888f).mo81877d(i).mo81872a());
                return true;
            }
        }
    };
    RecyclerView mListView;
    SwipeRefreshLayout mRefreshLayout;
    DmtStatusView mStatusView;
    TextTitleBar mTitleBar;

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List list, boolean z) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onFollowSuccess(FollowStatus followStatus) {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onWindowFocusChanged", true);
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
            this.f84883a.am_();
        }
    }

    public void enterBindPhone() {
        C20854a.m53165e().bindMobile(this, "", null, null);
    }

    public final void ar_() {
        this.f84884b.mo44934a_(Integer.valueOf(4));
    }

    public void closeBindPhoneHint() {
        this.enterBindRl.setVisibility(8);
        SharePrefCache.inst().getHasEnterBindPhone().mo47776a(Boolean.valueOf(true));
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f84884b != null) {
            this.f84884b.mo46991S_();
        }
        if (this.f84885c != null) {
            this.f84885c.mo46991S_();
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onResume", true);
        super.onResume();
        if (this.f84887e) {
            mo66147c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onResume", false);
    }

    public final void aJ_() {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            this.f84883a.mo50303a(null);
            this.f84883a.ao_();
            this.mStatusView.setVisibility(0);
            this.mStatusView.mo19213g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo66147c() {
        this.f84887e = false;
        if (C47673an.m103185b(this)) {
            mo66146b();
            return;
        }
        C26890h.m65011a("contact_notify_show", C23089d.m56640a().mo47829a("pop_logic", "add_friend").mo47829a("enter_from", "contact").f61491a);
        C47673an.m103184a(this, new C32753b() {
            /* renamed from: b */
            public final void mo60073b() {
                C47940b.m103728a(R.string.ch5, R.string.ch4, ContactsActivity.this);
            }

            /* renamed from: a */
            public final void mo60072a() {
                C26890h.m65011a("contact_notify_confirm", C23089d.m56640a().mo47829a("enter_from", "contact").f61491a);
                ContactsActivity.this.mo66146b();
            }
        });
    }

    /* renamed from: b */
    public final void mo66146b() {
        C9432q.m18691b((View) this.mStatusView, 0);
        this.mStatusView.mo19212f();
        this.f84883a = new C32532h<>(0, this.f84892j);
        this.f84883a.mo54788a((C26846a) this);
        this.f84883a.f70682s = getResources().getColor(R.color.a1a);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this);
        wrapLinearLayoutManager.mo4731b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.mListView.setOverScrollMode(2);
        C32528d dVar = new C32528d(getResources().getColor(R.color.wn), (int) C9432q.m18687b((Context) this, 0.5f), 1, C9432q.m18687b((Context) this, 20.0f), C9432q.m18687b((Context) this, 20.0f));
        this.f84886d = dVar;
        this.mListView.mo4798a((C1331h) this.f84886d);
        this.mListView.setAdapter(this.f84883a);
        this.f84889g.mo65893a();
        this.mRefreshLayout.setOnRefreshListener(new C32757f(this));
        this.f84884b = new C26876b<>();
        this.f84884b.mo54800a(this);
        this.f84884b.mo54799a(new ThirdPartyFriendModel("contact"));
        this.f84884b.mo44934a_(Integer.valueOf(1));
        this.f84885c = new C39971i();
        this.f84885c.mo54800a(this);
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            if (this.f84883a.mo50673a() == null) {
                this.mStatusView.setVisibility(0);
                this.mStatusView.mo19213g();
            }
        }
    }

    /* renamed from: a */
    private void m75415a(boolean z) {
        if (!z) {
            this.f84883a.mo54798c(false);
            this.f84883a.mo54788a((C26846a) null);
            return;
        }
        this.f84883a.ao_();
    }

    /* renamed from: d */
    public final void mo66149d(Exception exc) {
        C22971a.m56494a(this, exc, R.string.b47);
        int a = this.f84883a.mo65832a(this.f84885c.f101910b);
        if (a >= 0) {
            C32534i iVar = (C32534i) this.mListView.mo4847f(a);
            if (iVar != null) {
                iVar.mo65837a();
            }
        }
    }

    public void onFollowFail(final Exception exc) {
        if (isViewValid() && this.f84885c != null && this.f84883a != null) {
            if (C24501b.m59896a(exc)) {
                C24501b.m59895a(getSupportFragmentManager(), (C23459a) exc, new C24493b() {
                    /* renamed from: a */
                    public final void mo45353a() {
                        ContactsActivity.this.f84885c.mo44935c();
                    }

                    /* renamed from: b */
                    public final void mo45354b() {
                        ContactsActivity.this.mo66149d(exc);
                    }
                });
            } else {
                mo66149d(exc);
            }
        }
    }

    @C53771m
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (isViewValid()) {
            this.f84883a.mo65833a(followStatus);
            int a = this.f84883a.mo65832a(followStatus.userId);
            if (a != -1) {
                C32534i iVar = (C32534i) this.mListView.mo4847f(a);
                if (iVar != null) {
                    iVar.mo65837a();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bb1);
        if (getIntent().hasExtra("enter_from")) {
            this.f84888f = getIntent().getStringExtra("enter_from");
        }
        User curUser = C20854a.m53167g().getCurUser();
        if (((Boolean) SharePrefCache.inst().getHasEnterBindPhone().mo47782d()).booleanValue() || curUser.isPhoneBinded()) {
            this.enterBindRl.setVisibility(8);
        } else {
            this.enterBindRl.setVisibility(0);
        }
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                ContactsActivity.this.onBackPressed();
            }
        });
        this.mTitleBar.setTitle(getText(R.string.c70));
        this.mTitleBar.setTitleColor(getResources().getColor(R.color.a1k));
        if (C38046d.m85102b(4)) {
            C38046d.m85103c(4);
            C47718bf.m103288a(new C38041h(4));
        }
        C10719a a = C10719a.m21676a((Context) this).mo19223a();
        MtEmptyView a2 = MtEmptyView.m21697a((Context) this);
        a2.setStatus(new C10723a(this).mo19277a((int) R.drawable.aqy).mo19280b((int) R.string.bx4).mo19282c(R.string.axv).f28711a);
        a.mo19231b((View) a2);
        this.mStatusView.setBuilder(a);
        this.f84889g = new C32570c(this.f84891i, null);
        if (curUser.isPhoneBinded()) {
            mo66147c();
        } else {
            C26890h.m65011a("phone_bundling_show", C23089d.m56640a().mo47829a("enter_from", "contact").f61491a);
            C10643a aVar = new C10643a(this);
            aVar.mo18885a((int) R.string.bx1).mo18899b((int) R.string.bx0).mo18900b((int) R.string.dke, C32754c.f85312a).mo18886a((int) R.string.bwz, (OnClickListener) new C32755d(this));
            Dialog b = aVar.mo18897a().mo18882b();
            b.setOnDismissListener(new C32756e(this));
            b.setCanceledOnTouchOutside(false);
            b.setCancelable(false);
            b.show();
        }
        C26894c.m65022a(findViewById(R.id.csm));
        C47888fj.m103590b(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo47026b(List list, boolean z) {
        if (isViewValid()) {
            this.f84883a.ao_();
            this.f84883a.mo50304b(list);
            this.mStatusView.setVisibility(4);
            m75415a(z);
        }
    }

    /* renamed from: a */
    public final void mo47018a(List list, boolean z) {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            if (list == null) {
                this.mStatusView.setVisibility(0);
                return;
            }
            this.f84883a.mo54798c(true);
            this.f84883a.ao_();
            this.mStatusView.mo19209d();
            this.f84883a.mo50303a(list);
            this.mStatusView.setVisibility(4);
            m75415a(z);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47937a.m103720a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* renamed from: a */
    public static Intent m75414a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, ContactsActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("enter_from", str);
        }
        intent.putExtra("just_granted_read_contacts", z);
        return intent;
    }
}
