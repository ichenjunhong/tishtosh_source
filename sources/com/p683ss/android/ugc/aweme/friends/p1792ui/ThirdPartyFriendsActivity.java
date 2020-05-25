package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.activity.C23452y;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.friends.adapter.C32547u;
import com.p683ss.android.ugc.aweme.friends.model.ThirdPartyResultEvent;
import com.p683ss.android.ugc.aweme.friends.model.ThirdPartyUserList;
import com.p683ss.android.ugc.aweme.friends.model.ThirdPartyUsersModel;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RecommendFriendsItemView.C32667a;
import com.p683ss.android.ugc.aweme.friends.service.C32615b;
import com.p683ss.android.ugc.aweme.friends.utils.C32797f.C32798a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.greenrobot.eventbus.C53755c;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ThirdPartyFriendsActivity */
public final class ThirdPartyFriendsActivity extends AmeSSActivity implements OnClickListener, C23452y<User>, C26877c<User> {

    /* renamed from: h */
    public static final C32689a f85166h = new C32689a(null);

    /* renamed from: a */
    public Activity f85167a;

    /* renamed from: b */
    C32734ao f85168b;

    /* renamed from: c */
    C26876b<ThirdPartyUsersModel> f85169c;

    /* renamed from: d */
    public View f85170d;

    /* renamed from: e */
    public View f85171e;

    /* renamed from: f */
    public int f85172f = 1;

    /* renamed from: g */
    public int f85173g = 1;

    /* renamed from: i */
    private ArrayList<User> f85174i = new ArrayList<>();

    /* renamed from: j */
    private String f85175j = "";

    /* renamed from: k */
    private String f85176k = "";

    /* renamed from: l */
    private String f85177l = "";

    /* renamed from: m */
    private boolean f85178m;

    /* renamed from: n */
    private boolean f85179n;

    /* renamed from: o */
    private int f85180o;

    /* renamed from: p */
    private ThirdPartyUsersModel f85181p;

    /* renamed from: q */
    private boolean f85182q;

    /* renamed from: r */
    private HashMap f85183r;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.ThirdPartyFriendsActivity$a */
    public static final class C32689a {
        private C32689a() {
        }

        public /* synthetic */ C32689a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.ThirdPartyFriendsActivity$b */
    static final class C32690b implements C26846a {

        /* renamed from: a */
        final /* synthetic */ ThirdPartyFriendsActivity f85184a;

        C32690b(ThirdPartyFriendsActivity thirdPartyFriendsActivity) {
            this.f85184a = thirdPartyFriendsActivity;
        }

        public final void ar_() {
            C26876b<ThirdPartyUsersModel> bVar = this.f85184a.f85169c;
            if (bVar == null) {
                C52711k.m112237a("mPresenter");
            }
            bVar.mo44934a_(Integer.valueOf(4));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.ThirdPartyFriendsActivity$c */
    static final class C32691c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ThirdPartyFriendsActivity f85185a;

        C32691c(ThirdPartyFriendsActivity thirdPartyFriendsActivity) {
            this.f85185a = thirdPartyFriendsActivity;
        }

        public final void run() {
            ThirdPartyFriendsActivity thirdPartyFriendsActivity = this.f85185a;
            View view = this.f85185a.f85171e;
            if (view == null) {
                C52711k.m112237a("mHeaderView");
            }
            thirdPartyFriendsActivity.f85172f = view.getHeight();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.ThirdPartyFriendsActivity$d */
    static final class C32692d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ThirdPartyFriendsActivity f85186a;

        C32692d(ThirdPartyFriendsActivity thirdPartyFriendsActivity) {
            this.f85186a = thirdPartyFriendsActivity;
        }

        public final void run() {
            ThirdPartyFriendsActivity thirdPartyFriendsActivity = this.f85186a;
            RelativeLayout relativeLayout = (RelativeLayout) this.f85186a.mo66287a(R.id.d17);
            C52711k.m112236a((Object) relativeLayout, "title_container");
            thirdPartyFriendsActivity.f85173g = relativeLayout.getHeight();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.ThirdPartyFriendsActivity$e */
    public static final class C32693e extends C1340m {

        /* renamed from: a */
        final /* synthetic */ ThirdPartyFriendsActivity f85187a;

        C32693e(ThirdPartyFriendsActivity thirdPartyFriendsActivity) {
            this.f85187a = thirdPartyFriendsActivity;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C1332i iVar;
            int i3;
            int i4;
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            ThirdPartyFriendsActivity thirdPartyFriendsActivity = this.f85187a;
            RecyclerView recyclerView2 = (RecyclerView) thirdPartyFriendsActivity.mo66287a(R.id.cg7);
            C1332i iVar2 = null;
            if (recyclerView2 != null) {
                iVar = recyclerView2.getLayoutManager();
            } else {
                iVar = null;
            }
            if (iVar != null) {
                int j = ((LinearLayoutManager) iVar).mo4749j();
                RecyclerView recyclerView3 = (RecyclerView) thirdPartyFriendsActivity.mo66287a(R.id.cg7);
                if (recyclerView3 != null) {
                    iVar2 = recyclerView3.getLayoutManager();
                }
                if (iVar2 != null) {
                    View c = ((LinearLayoutManager) iVar2).mo4736c(j);
                    C32734ao aoVar = thirdPartyFriendsActivity.f85168b;
                    if (aoVar == null) {
                        C52711k.m112237a("mAdapter");
                    }
                    int b = (int) C9432q.m18687b(aoVar.f85274h, 72.0f);
                    if (c != null) {
                        i3 = c.getTop();
                    } else {
                        i3 = 0;
                    }
                    if (j == 0) {
                        i4 = (j * b) - i3;
                    } else {
                        i4 = ((j * b) - i3) + thirdPartyFriendsActivity.f85172f;
                    }
                    float f = (float) i4;
                    Activity activity = this.f85187a.f85167a;
                    if (activity == null) {
                        C52711k.m112237a("mActivity");
                    }
                    float b2 = C9432q.m18687b((Context) activity, 24.0f);
                    float f2 = (f - b2) / (((float) this.f85187a.f85172f) - b2);
                    if (f2 < 0.0f || f == 0.0f) {
                        f2 = 0.0f;
                    } else if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    RelativeLayout relativeLayout = (RelativeLayout) this.f85187a.mo66287a(R.id.d17);
                    C52711k.m112236a((Object) relativeLayout, "title_container");
                    relativeLayout.setAlpha(f2);
                    DmtTextView dmtTextView = (DmtTextView) this.f85187a.mo66287a(R.id.dhb);
                    C52711k.m112236a((Object) dmtTextView, "tv_title");
                    dmtTextView.setAlpha(f2);
                    View view = this.f85187a.f85170d;
                    if (view == null) {
                        C52711k.m112237a("mHeaderViewContainer");
                    }
                    view.setAlpha(1.0f - f2);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
    }

    /* renamed from: a */
    public final View mo66287a(int i) {
        if (this.f85183r == null) {
            this.f85183r = new HashMap();
        }
        View view = (View) this.f85183r.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f85183r.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<User> list, boolean z) {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ThirdPartyFriendsActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ThirdPartyFriendsActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ThirdPartyFriendsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        if (C32615b.f84864a != null) {
            C32615b.f84864a.returnResult(1, null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C53755c.m114319a().mo112959c((Object) this);
    }

    /* renamed from: e */
    public final void mo47031e() {
        if (isViewValid()) {
            C32734ao aoVar = this.f85168b;
            if (aoVar == null) {
                C52711k.m112237a("mAdapter");
            }
            aoVar.am_();
        }
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.au2).init();
    }

    public final void aJ_() {
        C32734ao aoVar = this.f85168b;
        if (aoVar == null) {
            C52711k.m112237a("mAdapter");
        }
        if (aoVar.f70699x) {
            C32734ao aoVar2 = this.f85168b;
            if (aoVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            aoVar2.mo54798c(false);
            C32734ao aoVar3 = this.f85168b;
            if (aoVar3 == null) {
                C52711k.m112237a("mAdapter");
            }
            aoVar3.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        C32734ao aoVar = this.f85168b;
        if (aoVar == null) {
            C52711k.m112237a("mAdapter");
        }
        if (aoVar.f70699x) {
            C32734ao aoVar2 = this.f85168b;
            if (aoVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            aoVar2.mo54798c(false);
            C32734ao aoVar3 = this.f85168b;
            if (aoVar3 == null) {
                C52711k.m112237a("mAdapter");
            }
            aoVar3.notifyDataSetChanged();
        }
    }

    @C53771m(mo112976b = true)
    public final void onThirdPartyResult(ThirdPartyResultEvent thirdPartyResultEvent) {
        C52711k.m112240b(thirdPartyResultEvent, "event");
        if (!thirdPartyResultEvent.userList.isEmpty()) {
            this.f85174i.addAll(thirdPartyResultEvent.userList);
            this.f85178m = thirdPartyResultEvent.hasMore;
            this.f85180o = thirdPartyResultEvent.cursor;
        }
        C53755c.m114319a().mo112963g(C52728w.m112245a(ThirdPartyResultEvent.class));
    }

    public final void onClick(View view) {
        Integer num;
        String str;
        String str2;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.no) {
            boolean z = this.f85179n;
            String str3 = "click_done_button";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", "discover_people_page");
            String str4 = "previous_page";
            if (z) {
                str2 = "sign_up";
            } else {
                str2 = "login";
            }
            C26890h.m65011a(str3, a.mo47829a(str4, str2).f61491a);
            finish();
            return;
        }
        if (num != null && num.intValue() == R.id.dg4) {
            boolean z2 = this.f85179n;
            String str5 = "click_discover_people_skip";
            C23089d a2 = C23089d.m56640a();
            String str6 = "previous_page";
            if (z2) {
                str = "sign_up";
            } else {
                str = "login";
            }
            C26890h.m65011a(str5, a2.mo47829a(str6, str).f61491a);
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ThirdPartyFriendsActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bb5);
        this.f85167a = this;
        C53755c.m114319a().mo112955a((Object) this);
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("thirdparty_platform_name")) {
                String stringExtra = intent.getStringExtra("thirdparty_platform_name");
                C52711k.m112236a((Object) stringExtra, "getStringExtra(LoginCons…THIRDPARTY_PLATFORM_NAME)");
                this.f85175j = stringExtra;
            }
            if (intent.hasExtra("thirdparty_token")) {
                String stringExtra2 = intent.getStringExtra("thirdparty_token");
                C52711k.m112236a((Object) stringExtra2, "getStringExtra(LoginConstants.THIRDPARTY_TOKEN)");
                this.f85176k = stringExtra2;
            }
            if (intent.hasExtra("thirdparty_token_secret")) {
                String stringExtra3 = intent.getStringExtra("thirdparty_token_secret");
                C52711k.m112236a((Object) stringExtra3, "getStringExtra(LoginCons….THIRDPARTY_TOKEN_SECRET)");
                this.f85177l = stringExtra3;
            }
            this.f85179n = getIntent().getBooleanExtra("thirdparty_is_new_user", false);
        }
        this.f85169c = new C26876b<>();
        C26876b<ThirdPartyUsersModel> bVar = this.f85169c;
        if (bVar == null) {
            C52711k.m112237a("mPresenter");
        }
        bVar.mo54800a(this);
        Context context = this;
        this.f85168b = new C32734ao(context);
        C32734ao aoVar = this.f85168b;
        if (aoVar == null) {
            C52711k.m112237a("mAdapter");
        }
        boolean z = this.f85179n;
        String str2 = this.f85175j;
        C52711k.m112240b(str2, "source");
        aoVar.f85272f = z;
        aoVar.f85273g = str2;
        C32734ao aoVar2 = this.f85168b;
        if (aoVar2 == null) {
            C52711k.m112237a("mAdapter");
        }
        C23452y<User> yVar = this;
        C52711k.m112240b(yVar, "recommendListener");
        aoVar2.f85271e = yVar;
        C32734ao aoVar3 = this.f85168b;
        if (aoVar3 == null) {
            C52711k.m112237a("mAdapter");
        }
        aoVar3.mo54788a((C26846a) new C32690b(this));
        RecyclerView recyclerView = (RecyclerView) mo66287a(R.id.cg7);
        C52711k.m112236a((Object) recyclerView, "rv_list");
        Activity activity = this.f85167a;
        if (activity == null) {
            C52711k.m112237a("mActivity");
        }
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(activity));
        if (!TextUtils.isEmpty(this.f85175j) && !TextUtils.isEmpty(this.f85176k)) {
            this.f85181p = new ThirdPartyUsersModel(this.f85175j, this.f85176k, this.f85177l, this.f85179n);
            C26876b<ThirdPartyUsersModel> bVar2 = this.f85169c;
            if (bVar2 == null) {
                C52711k.m112237a("mPresenter");
            }
            ThirdPartyUsersModel thirdPartyUsersModel = this.f85181p;
            if (thirdPartyUsersModel == null) {
                C52711k.m112237a("mThirdPartyUsersModel");
            }
            bVar2.mo54799a(thirdPartyUsersModel);
        }
        ((RecyclerView) mo66287a(R.id.cg7)).mo4798a((C1331h) new C32547u());
        RecyclerView recyclerView2 = (RecyclerView) mo66287a(R.id.cg7);
        C52711k.m112236a((Object) recyclerView2, "rv_list");
        C32734ao aoVar4 = this.f85168b;
        if (aoVar4 == null) {
            C52711k.m112237a("mAdapter");
        }
        recyclerView2.setAdapter(aoVar4);
        View inflate = LayoutInflater.from(context).inflate(R.layout.bbi, (RecyclerView) mo66287a(R.id.cg7), false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(this…y_header, rv_list, false)");
        this.f85170d = inflate;
        View view = this.f85170d;
        if (view == null) {
            C52711k.m112237a("mHeaderViewContainer");
        }
        View findViewById = view.findViewById(R.id.ao4);
        C52711k.m112236a((Object) findViewById, "mHeaderViewContainer.fin…Id(R.id.header_container)");
        this.f85171e = findViewById;
        C32734ao aoVar5 = this.f85168b;
        if (aoVar5 == null) {
            C52711k.m112237a("mAdapter");
        }
        View view2 = this.f85170d;
        if (view2 == null) {
            C52711k.m112237a("mHeaderViewContainer");
        }
        aoVar5.mo49209c_(view2);
        if (this.f85174i.size() > 0) {
            ThirdPartyUsersModel thirdPartyUsersModel2 = this.f85181p;
            if (thirdPartyUsersModel2 == null) {
                C52711k.m112237a("mThirdPartyUsersModel");
            }
            thirdPartyUsersModel2.setListData(new ThirdPartyUserList(this.f85180o, this.f85178m, this.f85174i, new LogPbBean()));
            C32734ao aoVar6 = this.f85168b;
            if (aoVar6 == null) {
                C52711k.m112237a("mAdapter");
            }
            aoVar6.mo51189c(this.f85174i);
        } else {
            C26876b<ThirdPartyUsersModel> bVar3 = this.f85169c;
            if (bVar3 == null) {
                C52711k.m112237a("mPresenter");
            }
            bVar3.mo44934a_(Integer.valueOf(1));
        }
        View view3 = this.f85171e;
        if (view3 == null) {
            C52711k.m112237a("mHeaderView");
        }
        view3.post(new C32691c(this));
        ((RelativeLayout) mo66287a(R.id.d17)).post(new C32692d(this));
        OnClickListener onClickListener = this;
        ((DmtTextView) mo66287a(R.id.dg4)).setOnClickListener(onClickListener);
        ((Button) mo66287a(R.id.no)).setOnClickListener(onClickListener);
        RecyclerView recyclerView3 = (RecyclerView) mo66287a(R.id.cg7);
        if (recyclerView3 != null) {
            recyclerView3.mo4801a((C1340m) new C32693e(this));
        }
        boolean z2 = this.f85179n;
        String str3 = "show_discover_people_page";
        C23089d a = C23089d.m56640a();
        String str4 = "enter_method";
        if (z2) {
            str = "sign_up";
        } else {
            str = "login";
        }
        C26890h.m65011a(str3, a.mo47829a(str4, str).f61491a);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ThirdPartyFriendsActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo47026b(List<User> list, boolean z) {
        if (isViewValid()) {
            boolean z2 = false;
            if (list == null || list.isEmpty()) {
                z = false;
            }
            C32734ao aoVar = this.f85168b;
            if (aoVar == null) {
                C52711k.m112237a("mAdapter");
            }
            aoVar.ao_();
            if (!z) {
                C32734ao aoVar2 = this.f85168b;
                if (aoVar2 == null) {
                    C52711k.m112237a("mAdapter");
                }
                aoVar2.mo54788a((C26846a) null);
                C32734ao aoVar3 = this.f85168b;
                if (aoVar3 == null) {
                    C52711k.m112237a("mAdapter");
                }
                aoVar3.mo54798c(false);
                C32734ao aoVar4 = this.f85168b;
                if (aoVar4 == null) {
                    C52711k.m112237a("mAdapter");
                }
                aoVar4.an_();
            } else {
                C32734ao aoVar5 = this.f85168b;
                if (aoVar5 == null) {
                    C52711k.m112237a("mAdapter");
                }
                aoVar5.ao_();
            }
            C32734ao aoVar6 = this.f85168b;
            if (aoVar6 == null) {
                C52711k.m112237a("mAdapter");
            }
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                aoVar6.f70670n.addAll(collection);
                aoVar6.mo50304b(aoVar6.f70670n);
            }
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<User> list, boolean z) {
        if (!z) {
            C32734ao aoVar = this.f85168b;
            if (aoVar == null) {
                C52711k.m112237a("mAdapter");
            }
            aoVar.mo54798c(false);
        } else {
            C32734ao aoVar2 = this.f85168b;
            if (aoVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            aoVar2.ao_();
        }
        C32734ao aoVar3 = this.f85168b;
        if (aoVar3 == null) {
            C52711k.m112237a("mAdapter");
        }
        aoVar3.mo50303a(list);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo48614a(int i, Object obj, int i2, View view, String str) {
        String str2;
        User user = (User) obj;
        if (isViewValid() && i == C32667a.m75524a() && !this.f85182q) {
            LinearLayout linearLayout = (LinearLayout) mo66287a(R.id.ere);
            if (linearLayout != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                C52711k.m112236a((Object) ofFloat, "ValueAnimator.ofFloat(0f, 1f)");
                ofFloat.setDuration(300);
                ofFloat.addUpdateListener(new C32798a(linearLayout));
                ofFloat.start();
            }
            this.f85182q = true;
            boolean z = this.f85179n;
            String str3 = "show_done_button";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", "discover_people_page");
            String str4 = "previous_page";
            if (z) {
                str2 = "sign_up";
            } else {
                str2 = "login";
            }
            C26890h.m65011a(str3, a.mo47829a(str4, str2).f61491a);
        }
    }
}
