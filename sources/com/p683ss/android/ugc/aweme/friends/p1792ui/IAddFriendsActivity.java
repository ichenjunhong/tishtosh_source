package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.AppBarLayout.LayoutParams;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p030v4.widget.SwipeRefreshLayout.C1091b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.google.gson.C17971f;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1407a.C23457c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24501b;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24527a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.discover.adapter.C27797ad;
import com.p683ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28485an;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28486ao;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.C32112c;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.friends.adapter.C32546t;
import com.p683ss.android.ugc.aweme.friends.experiment.SuggestionFriendsEntranceTypeExperiment;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32506c;
import com.p683ss.android.ugc.aweme.friends.service.C32619f;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38041h;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad.C23197a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39971i;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;
import com.p683ss.android.ugc.aweme.profile.presenter.C39981o;
import com.p683ss.android.ugc.aweme.profile.presenter.C39993z;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.p683ss.android.ugc.aweme.services.function.IFunctionKey;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47849eh;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity */
public class IAddFriendsActivity extends BaseAddFriendsActivity implements C1091b, C23452y<User>, C26846a, C26877c<SearchUser>, C32506c, C39979m, C39981o {

    /* renamed from: b */
    public ForegroundColorSpan f84924b;

    /* renamed from: c */
    public String f84925c = "";

    /* renamed from: d */
    C28486ao f84926d;

    /* renamed from: e */
    public C28485an f84927e;

    /* renamed from: f */
    C10719a f84928f;

    /* renamed from: g */
    C39993z f84929g;

    /* renamed from: h */
    public C39971i f84930h;

    /* renamed from: i */
    int f84931i = 0;

    /* renamed from: j */
    String f84932j;

    /* renamed from: k */
    String f84933k;

    /* renamed from: l */
    private C10719a f84934l;

    /* renamed from: m */
    private C32546t f84935m;
    AppBarLayout mAppBarLayout;
    ImageButton mBtnSearchClear;
    DmtEditText mEditSearch;
    RecyclerView mRecyclerView;
    SwipeRefreshLayout mRefreshLayout;
    String mSearchHitString;
    LinearLayout mSearchLayout;
    DmtStatusView mStatusView;
    DmtTextView mTvSearchBtn;
    DmtTextView mTvSearchHit;

    /* renamed from: n */
    private SparseArray<String> f84936n = new SparseArray<>();

    /* renamed from: o */
    private String f84937o;

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<SearchUser> list, boolean z) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onPointerCaptureChanged(boolean z) {
    }

    public void onRefresh() {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66145a(boolean z) {
        startActivity(ContactsActivity.m75414a(this, this.f84935m != null ? this.f84935m.f84734c : "", true));
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        if (isViewValid()) {
            this.mStatusView.mo19212f();
        }
    }

    public final void aJ_() {
        if (isViewValid()) {
            this.mStatusView.mo19213g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo66169d() {
        if (this.mTvSearchBtn == null || !this.mTvSearchBtn.isShown()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            this.f84927e.am_();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    public final void ar_() {
        if (SuggestionFriendsEntranceTypeExperiment.m75374a() && this.f84929g != null) {
            this.f84929g.mo81923b(15, null, 3, this.f84931i, C47945d.m103731a(), C47945d.m103733b());
            this.f84935m.mo54798c(true);
            this.f84935m.am_();
        }
    }

    public void finish() {
        if (mo66169d()) {
            mo66170h();
            this.mTvSearchBtn.setVisibility(8);
            C26894c.m65021a(this, this.mEditSearch);
            this.mEditSearch.setCursorVisible(false);
            this.mEditSearch.clearFocus();
            this.mRecyclerView.setAdapter(this.f84935m);
            this.mStatusView.setBuilder(this.f84934l);
            mo66168b(true);
            return;
        }
        super.finish();
    }

    /* renamed from: h */
    public final void mo66170h() {
        this.mTvSearchHit.setVisibility(8);
        this.mBtnSearchClear.setVisibility(8);
        this.mTvSearchHit.setText("");
        this.mEditSearch.getText().clear();
        this.f84925c = "";
        this.f84927e.mo58157f();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity", "onResume", true);
        super.onResume();
        if (C38046d.m85102b(4)) {
            this.f84935m.mo65848a(true);
        } else {
            this.f84935m.mo65848a(false);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity", "onResume", false);
    }

    /* access modifiers changed from: 0000 */
    public void searchUser() {
        if (!TextUtils.isEmpty(this.f84925c)) {
            C26894c.m65021a(this, this.mEditSearch);
            this.mTvSearchHit.setVisibility(8);
            this.f84926d.mo58159a_(Integer.valueOf(1), this.f84925c, Integer.valueOf(1));
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        if (isViewValid()) {
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        if (isViewValid()) {
            this.mStatusView.mo19214h();
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        if (isViewValid()) {
            this.f84927e.co_();
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.mEditSearch.setText("");
        this.f84935m.mo54785f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo66168b(boolean z) {
        LayoutParams layoutParams = (LayoutParams) this.mSearchLayout.getLayoutParams();
        if (z) {
            layoutParams.f1586a = 1;
        } else {
            layoutParams.f1586a = 0;
            this.mAppBarLayout.setExpanded(true);
        }
        this.mSearchLayout.setLayoutParams(layoutParams);
    }

    @C53771m
    public void onNotificationIndicatorEvent(C38041h hVar) {
        if (hVar.f96815a == 4) {
            if (C38046d.m85102b(hVar.f96815a)) {
                this.f84935m.mo65848a(true);
                return;
            }
            this.f84935m.mo65848a(false);
        }
    }

    /* renamed from: a */
    private void m75444a(int i) {
        if (this.f84929g.mo81924d().getNewUserCount() > 0 && i < this.f84929g.mo81924d().getNewUserCount()) {
            this.f84935m.f84736e = true;
            C1352v f = this.mRecyclerView.mo4847f(this.f84935m.f84735d);
            if (f instanceof C32730an) {
                C32730an anVar = (C32730an) f;
                if (anVar.f85259a) {
                    anVar.mo66321a();
                }
            }
        }
    }

    public void onFollowFail(final Exception exc) {
        if (isViewValid()) {
            if (!mo66169d()) {
                C22971a.m56494a(this, exc, R.string.b47);
            } else if (C24501b.m59896a(exc)) {
                C24501b.m59895a(getSupportFragmentManager(), (C23459a) exc, new C24493b() {
                    /* renamed from: a */
                    public final void mo45353a() {
                        IAddFriendsActivity.this.f84930h.mo44935c();
                    }

                    /* renamed from: b */
                    public final void mo45354b() {
                        C22971a.m56494a(IAddFriendsActivity.this, exc, R.string.b47);
                    }
                });
            } else {
                C22971a.m56494a(this, exc, R.string.b47);
            }
        }
    }

    /* renamed from: a */
    public final void mo60635a(Exception exc) {
        if (C9376b.m18558a((Collection<T>) this.f84935m.mo50673a())) {
            C10691a.m21542b((Context) this, (int) R.string.f5k).mo19066a();
            this.mStatusView.mo19214h();
        } else if (exc instanceof C23457c) {
            this.f84935m.ao_();
            this.f84935m.mo54788a((C26846a) null);
        } else {
            this.f84935m.co_();
        }
    }

    /* renamed from: b */
    public final void mo60638b(RecommendList recommendList) {
        this.f84935m.ao_();
        C32546t tVar = this.f84935m;
        List<User> userList = recommendList.getUserList();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (User user : userList) {
            if (hashSet.add(user.getUid())) {
                arrayList.add(user);
            }
        }
        userList.clear();
        userList.addAll(arrayList);
        tVar.mo50304b(userList);
        this.f84935m.mo54798c(true);
        if (!recommendList.hasMore()) {
            this.f84935m.mo54788a((C26846a) null);
            this.f84935m.mo54798c(false);
        }
    }

    @C53771m
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (this.f84935m != null && !followStatus.isFollowSucess) {
            C32546t tVar = this.f84935m;
            if (followStatus != null && !C9431p.m18664a(followStatus.userId)) {
                List a = tVar.mo50673a();
                if (a != null) {
                    Iterator it = a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        User user = (User) it.next();
                        if (followStatus.userId.equals(user.getUid())) {
                            user.setFollowStatus(followStatus.followStatus);
                            break;
                        }
                    }
                }
                tVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    public final void mo60634a(RecommendList recommendList) {
        int i;
        if (recommendList == null || C9376b.m18558a((Collection<T>) recommendList.getUserList())) {
            this.mStatusView.mo19213g();
            this.f84935m.ao_();
            return;
        }
        List userList = recommendList.getUserList();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i2 = 1;
        while (true) {
            if (i2 >= userList.size()) {
                break;
            }
            User user = (User) userList.get(0);
            if (!(user == null || user.getUid() == null || userList.get(i2) == null || !user.getUid().equals(((User) userList.get(i2)).getUid()))) {
                arrayList.add(Integer.valueOf(i2));
            }
            i2++;
        }
        for (Integer intValue : arrayList) {
            userList.remove(intValue.intValue());
        }
        recommendList.setUserList(userList);
        int newUserCount = recommendList.getNewUserCount();
        if (!(newUserCount == -1 || recommendList.getUserList() == null || newUserCount > recommendList.getUserList().size())) {
            for (i = 0; i < newUserCount; i++) {
                ((User) recommendList.getUserList().get(i)).setNewRecommend(true);
            }
        }
        this.mStatusView.setVisibility(8);
        C32546t tVar = this.f84935m;
        int newUserCount2 = recommendList.getNewUserCount();
        if (newUserCount2 > 5) {
            newUserCount2 = 5;
        }
        tVar.f84732a = newUserCount2;
        this.f84935m.mo50303a(recommendList.getUserList());
        this.f84935m.mo54798c(true);
        this.f84935m.mo54788a((C26846a) this);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(2);
        if (getIntent() != null) {
            this.f84931i = getIntent().getIntExtra("bundle_recommend_count", 0);
            this.f84932j = getIntent().getStringExtra("bundle_puid");
            this.f84933k = getIntent().getStringExtra("bundle_puid");
            this.f84937o = getIntent().getStringExtra("request_id");
        }
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: a */
            public final void mo19166a(View view) {
                IAddFriendsActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo19167b(View view) {
                C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", "find_friends").f61491a);
                C32619f.f84867a.startQRCodePermissionActivity(IAddFriendsActivity.this, false);
            }
        });
        int intExtra = getIntent().getIntExtra("bundle_recommend_user_type", 1);
        if (intExtra == 2) {
            this.mTitleBar.getTitleView().setText(R.string.f5d);
            this.mSearchLayout.setVisibility(8);
        }
        if (FunctionSupportService.INSTANCE.notSupport(IFunctionKey.QR_CODE)) {
            this.mTitleBar.getEndBtn().setVisibility(8);
        }
        this.mRefreshLayout.setEnabled(false);
        this.f84935m = new C32546t(this, this);
        this.f84935m.f84737f = this;
        this.f84935m.mo54798c(false);
        this.f84935m.f70682s = getResources().getColor(R.color.a1a);
        this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this));
        this.mRecyclerView.mo4801a((C1340m) new C32461a(this));
        C47849eh.m103498b(this.mRecyclerView);
        this.mRecyclerView.setAdapter(this.f84935m);
        if (intExtra == 6) {
            this.f84935m.f84734c = "fans";
        } else if (intExtra == 5) {
            this.f84935m.f84734c = "following";
        } else {
            this.f84935m.f84734c = "personal_homepage";
        }
        this.f84935m.f84733b = intExtra;
        this.f84934l = C10719a.m21676a((Context) this).mo19223a().mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C32766m(this));
        MtEmptyView a = MtEmptyView.m21697a((Context) this);
        a.setStatus(new C10723a(this).mo19277a((int) R.drawable.ar0).mo19280b((int) R.string.f5w).mo19282c(R.string.f5x).f28711a);
        this.f84928f = C10719a.m21676a((Context) this).mo19231b((View) a).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                IAddFriendsActivity.this.searchUser();
            }
        });
        this.mStatusView.setBuilder(this.f84934l);
        this.mStatusView.mo19212f();
        this.mRecyclerView.bringToFront();
        this.f84930h = new C39971i();
        if (SuggestionFriendsEntranceTypeExperiment.m75374a()) {
            this.f84929g = new C39993z(new RecommendCommonUserModel(), this);
            this.f84929g.mo81918a(15, null, 3, this.f84931i, C47945d.m103731a(), this.f84932j, C47945d.m103733b(), null, this.f84933k);
        }
        this.f84930h.mo54800a(this);
        this.f84926d = C41431k.f105004a.createSearchUserPresenter(false);
        this.f84926d.mo58158a((C26877c) this);
        this.f84926d.mo56543a("find_friends");
        this.f84927e = C41431k.f105004a.createSearchUserAdapter(new C27797ad(false), this.f84925c, new C32112c() {
            /* renamed from: a */
            public final boolean mo56498a(User user) {
                String str;
                int i = 0;
                if (IAddFriendsActivity.this.f84930h.mo54804o()) {
                    return false;
                }
                if (user.getFollowStatus() == 0) {
                    str = "follow";
                } else {
                    str = "follow_cancel";
                }
                new C23253w(str).mo48161b("find_friends").mo48163c("follow_button").mo48166f(user.getUid()).mo48164d("search_result").mo48165e("other_places").mo48169s(user.getRequestId()).mo48076e();
                if (user.getFollowStatus() == 0) {
                    i = 1;
                }
                IAddFriendsActivity.this.f84930h.mo66349a(new C39970a().mo81871a(user.getUid()).mo81869a(i).mo81876c("search_result").mo81877d(user.getFollowerStatus()).mo81872a());
                return true;
            }

            /* renamed from: a */
            public final void mo56497a(User user, int i) {
                C32619f.f84867a.sendEnterPersonalDetailForAddFriend(i, IAddFriendsActivity.this.f84925c, 0, user.getRequestId(), user.getUid(), IAddFriendsActivity.this.f84925c);
                C40733z.f103767a.startUserPfoeilActivity(IAddFriendsActivity.this, user, "find_friends", "", "main_head", "");
            }
        }, null);
        this.f84927e.mo58151a((C26846a) new C32767n(this));
        this.mEditSearch.setHint(R.string.cpx);
        this.mSearchHitString = getString(R.string.cpx);
        this.mEditSearch.setOnTouchListener(new C32768o(this));
        this.mBtnSearchClear.setOnClickListener(new C32769p(this));
        this.f84924b = new ForegroundColorSpan(getResources().getColor(R.color.a1b));
        this.mEditSearch.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IAddFriendsActivity.this.f84925c = charSequence.toString();
                if (charSequence.length() > 0) {
                    if (IAddFriendsActivity.this.f84927e.mo58150a() != null && IAddFriendsActivity.this.f84927e.mo58150a().size() > 0) {
                        IAddFriendsActivity.this.f84927e.mo58157f();
                    }
                    IAddFriendsActivity.this.mBtnSearchClear.setVisibility(0);
                    IAddFriendsActivity.this.mTvSearchHit.setVisibility(0);
                    StringBuilder sb = new StringBuilder();
                    sb.append(IAddFriendsActivity.this.mSearchHitString);
                    sb.append("：");
                    sb.append(charSequence);
                    SpannableString spannableString = new SpannableString(sb.toString());
                    spannableString.setSpan(IAddFriendsActivity.this.f84924b, 0, IAddFriendsActivity.this.mSearchHitString.length() + 1, 17);
                    IAddFriendsActivity.this.mTvSearchHit.setText(spannableString);
                    if (IAddFriendsActivity.this.mRecyclerView.getAdapter() != IAddFriendsActivity.this.f84927e) {
                        IAddFriendsActivity.this.mRecyclerView.setAdapter((C1322a) IAddFriendsActivity.this.f84927e);
                    }
                    return;
                }
                IAddFriendsActivity.this.mo66170h();
            }
        });
        this.mEditSearch.setOnEditorActionListener(new C32770q(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo47026b(List<SearchUser> list, boolean z) {
        if (isViewValid() && mo66169d() && !this.mTvSearchHit.isShown()) {
            if (!this.f84926d.mo56575e()) {
                this.f84927e.mo58155c(false);
            } else {
                this.f84927e.ao_();
            }
            this.f84927e.mo58154b(list);
        }
    }

    /* renamed from: a */
    public final void mo65818a(String str, int i) {
        C41302w a = C41302w.m91042a();
        StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
        sb.append(str);
        a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("refer", "find_friends").mo83871a());
        m75444a(i);
    }

    /* renamed from: a */
    public final void mo47018a(List<SearchUser> list, boolean z) {
        if (isViewValid() && mo66169d() && !this.mTvSearchHit.isShown()) {
            this.f84927e.mo58155c(true);
            if (!z) {
                this.f84927e.mo58155c(false);
            } else {
                this.f84927e.ao_();
            }
            this.mStatusView.mo19209d();
            this.f84927e.mo50303a(list);
            C23089d a = C23089d.m56640a();
            a.mo47829a("enter_from", "find_friends").mo47829a("search_keyword", this.f84925c).mo47829a("log_pb", new C17971f().mo34889b(((SearchApiResult) this.f84926d.mo56576f().getData()).logPb));
            C26890h.m65012a("search_user", C23198ae.m56851a(a.f61491a));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    /* renamed from: a */
    public static Intent m75443a(Context context, int i, int i2, String str) {
        Intent intent = new Intent(context, IAddFriendsActivity.class);
        intent.putExtra("bundle_recommend_count", i);
        intent.putExtra("bundle_recommend_user_type", i2);
        intent.putExtra("request_id", str);
        return intent;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo48614a(int i, Object obj, int i2, View view, String str) {
        int i3;
        String str2;
        String str3;
        User user = (User) obj;
        if (i == 101) {
            C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", "find_friends").mo47829a("to_user_id", user.getUid()).mo47829a("enter_method", "card").mo47829a("rec_reason", user.getRecommendReason()).mo47831b().f61491a);
            String str4 = "follow_card";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", "find_friends").mo47829a("rec_uid", user.getUid()).mo47829a("event_type", "enter_profile").mo47826a("impr_order", i2).mo47829a("req_id", (String) this.f84936n.get(i2)).mo47829a("trigger_reason", "friend_rec_message").mo47829a("rec_reason", user.getRecommendReason());
            String str5 = "card_type";
            if (user.isNewRecommend()) {
                str3 = "new";
            } else {
                str3 = "past";
            }
            C26890h.m65011a(str4, a.mo47829a(str5, str3).f61491a);
            C40733z.f103767a.startUserPfoeilActivity(this, user, "find_friends", this.f84937o, "main_head", "");
            m75444a(i2);
            return;
        }
        if (i == 100 && isViewValid()) {
            if (!C32771r.m75643a(this)) {
                C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
                return;
            }
            if (user.getFollowStatus() != 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i4 = i3 ^ 1;
            C47718bf.m103288a(new C24527a(i4, user));
            if (this.f84930h != null && i4 == 1) {
                C23196ad.m56841a("follow").mo47957b("enter_from", "find_friends").mo47957b("to_user_id", user.getUid()).mo47957b("enter_method", "card").mo47957b("rec_reason", user.getRecommendReason()).mo47958g().mo48076e();
                C23197a b = C23196ad.m56841a("follow_card").mo47957b("enter_from", "find_friends").mo47957b("rec_uid", user.getUid()).mo47957b("event_type", "follow").mo47957b("rec_reason", user.getRecommendReason()).mo47957b("impr_order", String.valueOf(i2)).mo47957b("req_id", (String) this.f84936n.get(i2)).mo47957b("trigger_reason", "friend_rec_message").mo47957b("rec_reason", user.getRecommendReason());
                String str6 = "card_type";
                if (user.isNewRecommend()) {
                    str2 = "new";
                } else {
                    str2 = "past";
                }
                b.mo47957b(str6, str2).mo48076e();
            }
        }
    }
}
