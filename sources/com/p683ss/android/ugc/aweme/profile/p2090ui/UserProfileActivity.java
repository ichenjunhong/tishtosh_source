package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1736ui.SlideSwitchLayout;
import com.p683ss.android.ugc.aweme.miniapp_api.C36918a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39950ab;
import com.p683ss.android.ugc.aweme.profile.presenter.C39983q;
import com.p683ss.android.ugc.aweme.profile.service.C40010c;
import com.p683ss.android.ugc.aweme.push.C40884a;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.p683ss.android.ugc.aweme.utils.C47859eq;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UserProfileActivity */
public class UserProfileActivity extends AmeSlideSSActivity implements C39983q {

    /* renamed from: b */
    public List<C23422a> f102601b = new ArrayList();

    /* renamed from: c */
    private String f102602c;

    /* renamed from: d */
    private String f102603d;

    /* renamed from: e */
    private String f102604e;

    /* renamed from: f */
    private String f102605f;

    /* renamed from: g */
    private String f102606g;

    /* renamed from: h */
    private String f102607h;

    /* renamed from: i */
    private String f102608i;

    /* renamed from: j */
    private String f102609j;

    /* renamed from: k */
    private String f102610k;

    /* renamed from: l */
    private String f102611l;

    /* renamed from: m */
    private String f102612m;
    @BindView(2131494826)
    protected DmtStatusView mDmtStatusView;
    @BindView(2131495317)
    LinearLayout mProfileLayout;
    @BindView(2131494699)
    SlideSwitchLayout mSlideSwitchLayout;

    /* renamed from: n */
    private Aweme f102613n;

    /* renamed from: o */
    private String f102614o;

    /* renamed from: p */
    private String f102615p;

    /* renamed from: q */
    private String f102616q;

    /* renamed from: r */
    private int f102617r;

    /* renamed from: s */
    private C39950ab f102618s;

    /* renamed from: t */
    private String f102619t;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    /* renamed from: a */
    public static void m89408a(Context context, String str, String str2, String str3) {
        if (context != null && !TextUtils.isEmpty(str)) {
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtra("enter_from", str3);
            intent.putExtra("uid", str);
            intent.putExtra("sec_user_id", str2);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public final void mo81908a(String str, String str2) {
        this.f102614o = str;
        this.f102616q = str2;
        m89410e();
        this.mDmtStatusView.mo19209d();
    }

    /* renamed from: a */
    public final void mo65244a() {
        this.mDmtStatusView.mo19209d();
        onBackPressed();
    }

    public Resources getResources() {
        C47859eq.m103530a(this, this.mFirstResumed);
        return super.getResources();
    }

    public void finish() {
        super.finish();
        if (C47842ed.m103485a(this)) {
            super.overridePendingTransition(R.anim.bm, R.anim.bv);
        }
        C40884a.m90455a(this);
        C36918a.m83054a(this);
    }

    /* renamed from: e */
    private void m89410e() {
        C0654k supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2224a("userprofilefragment");
        if (a == null) {
            a = C40010c.f101950a.mo82031d();
            a.setArguments(m89411f());
        }
        supportFragmentManager.mo2225a().mo2192b(R.id.f7d, a, "userprofilefragment").mo2195c();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onResume", true);
        if (C47859eq.m103531b(this)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onResume", false);
            return;
        }
        super.onResume();
        C47859eq.m103529a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.UserProfileActivity", "onResume", false);
    }

    /* renamed from: d */
    private void m89409d() {
        String str;
        if (TextUtils.equals(this.f102609j, "open_screen_ad") && !TextUtils.isEmpty(this.f102614o)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("enter_from", "click_open_screen_ad");
                jSONObject.put("enter_method", "open_screen_ad");
            } catch (JSONException unused) {
            }
            String str2 = "enter_detail";
            if (TextUtils.equals(this.f102614o, C20902b.m53242a().getCurUserId())) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            C26890h.m65008a((Context) this, str2, str, "0", "0", jSONObject);
        }
    }

    /* renamed from: f */
    private Bundle m89411f() {
        Bundle bundle = new Bundle();
        bundle.putString("uid", this.f102614o);
        bundle.putString("sec_user_id", this.f102616q);
        bundle.putString("profile_from", this.f102602c);
        bundle.putString("video_id", this.f102603d);
        bundle.putString("profile_from", "other_user");
        bundle.putString("type", this.f102604e);
        bundle.putString("enter_method", this.f102611l);
        bundle.putString("enter_from", this.f102609j);
        bundle.putString("request_id", this.f102605f);
        bundle.putString("room_id", this.f102606g);
        bundle.putString("room_owner_id", this.f102607h);
        bundle.putString("user_type", this.f102608i);
        bundle.putBoolean("isFromFeed", false);
        bundle.putString("poi_id", this.f102610k);
        bundle.putString("extra_previous_page_position", getIntent().getStringExtra("extra_previous_page_position"));
        bundle.putString("enter_from_request_id", getIntent().getStringExtra("enter_from_request_id"));
        bundle.putString("scene_id", this.f102612m);
        bundle.putInt("need_track_compare_recommend_reason", getIntent().getIntExtra("need_track_compare_recommend_reason", 0));
        bundle.putString("previous_recommend_reason", getIntent().getStringExtra("previous_recommend_reason"));
        bundle.putString("recommend_from_type", getIntent().getStringExtra("recommend_from_type"));
        bundle.putInt("is_cold_launch", getIntent().getIntExtra("is_cold_launch", 0));
        bundle.putInt("from_recommend_card", getIntent().getIntExtra("from_recommend_card", 0));
        bundle.putString("id", getIntent().getStringExtra("id"));
        bundle.putInt("general_search_card_type", getIntent().getIntExtra("general_search_card_type", 0));
        return bundle;
    }

    /* renamed from: a */
    private static int m89399a(User user) {
        if (user == null) {
            return 0;
        }
        return user.getCommerceUserLevel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01fb, code lost:
        if (android.text.TextUtils.equals(r8.f102614o, com.p683ss.android.ugc.aweme.account.C20902b.m53242a().getCurUserId()) != false) goto L_0x01fd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0266  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.profile.ui.UserProfileActivity"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r9)
            boolean r9 = com.p683ss.android.ugc.aweme.utils.C47842ed.m103485a(r8)
            if (r9 == 0) goto L_0x001a
            r9 = 2131034269(0x7f05009d, float:1.767905E38)
            r0 = 2131034281(0x7f0500a9, float:1.7679075E38)
            super.overridePendingTransition(r9, r0)
        L_0x001a:
            android.view.Window r9 = r8.getWindow()
            r0 = 48
            r9.setSoftInputMode(r0)
            r8.requestDisableOptimizeViewHierarchy()
            r9 = 2132215556(0x7f170704, float:2.0074985E38)
            r8.setContentView(r9)
            com.p683ss.android.ugc.aweme.base.utils.C23729p.m58263b(r8)
            com.p683ss.android.ugc.aweme.base.utils.C23729p.m58269c(r8)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            int r0 = com.p683ss.android.ugc.aweme.base.utils.C23724k.m58226c(r8)
            r1 = -1
            r9.<init>(r0, r1)
            android.widget.LinearLayout r0 = r8.mProfileLayout
            r0.setLayoutParams(r9)
            com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout r9 = r8.mSlideSwitchLayout
            r0 = 0
            r9.setScrowToChildWhenRequestChildFocus(r0)
            com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout r9 = r8.mSlideSwitchLayout
            java.lang.String r1 = "page_profile"
            android.content.Context r3 = r9.getContext()
            boolean r3 = com.p683ss.android.ugc.aweme.utils.C47918gj.m103682a(r3)
            if (r3 == 0) goto L_0x0060
            java.util.List<com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a> r3 = r9.f80493c
            com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a r4 = new com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a
            r4.<init>(r1, r0)
            r3.add(r0, r4)
            goto L_0x006a
        L_0x0060:
            java.util.List<com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a> r3 = r9.f80493c
            com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a r4 = new com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a
            r4.<init>(r1, r0)
            r3.add(r4)
        L_0x006a:
            java.util.List<com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout$a> r1 = r9.f80493c
            int r1 = r1.size()
            int r1 = r1 - r2
            r9.f80491a = r1
            com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout r9 = r8.mSlideSwitchLayout
            java.lang.String r1 = "page_profile"
            r9.mo63373a(r1, r0)
            com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout r9 = r8.mSlideSwitchLayout
            r9.setCanScroll(r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r9 = r8.mDmtStatusView
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r1 = com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a.m21676a(r8)
            r9.setBuilder(r1)
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r1 = "uid"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102614o = r1
            java.lang.String r1 = r8.f102614o
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00a4
            java.lang.String r1 = "id"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102614o = r1
        L_0x00a4:
            java.lang.String r1 = "sec_user_id"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102616q = r1
            java.lang.String r1 = r8.f102616q
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00bc
            java.lang.String r1 = "sec_uid"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102616q = r1
        L_0x00bc:
            java.lang.String r1 = r8.f102616q
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.utils.ew r1 = com.p683ss.android.ugc.aweme.utils.C47865ew.m103536a()
            java.lang.String r3 = r8.f102614o
            java.lang.String r1 = r1.mo95083c(r3)
            r8.f102616q = r1
        L_0x00d0:
            java.lang.String r1 = "unique_id"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102615p = r1
            java.lang.String r1 = "profile_from"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102602c = r1
            java.lang.String r1 = "video_id"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102603d = r1
            java.lang.String r1 = "type"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102604e = r1
            java.lang.String r1 = "profile_enterprise_type"
            int r1 = r9.getIntExtra(r1, r0)
            r8.f102617r = r1
            java.lang.String r1 = "enter_method"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102611l = r1
            java.lang.String r1 = "request_id"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102605f = r1
            java.lang.String r1 = "room_id"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102606g = r1
            java.lang.String r1 = "room_owner_id"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102607h = r1
            java.lang.String r1 = "user_type"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102608i = r1
            java.lang.String r1 = "scene_id"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102612m = r1
            java.lang.String r1 = "poi_id"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102610k = r1
            java.lang.String r1 = "enter_from"
            java.lang.String r1 = r9.getStringExtra(r1)
            r8.f102609j = r1
            java.lang.String r1 = "extra_from_event_enter_from"
            java.lang.String r1 = r9.getStringExtra(r1)
            java.lang.String r3 = "extra_from_event_type"
            java.lang.String r3 = r9.getStringExtra(r3)
            java.lang.String r4 = "extra_from_pre_page"
            java.lang.String r4 = r9.getStringExtra(r4)
            java.lang.String r5 = "extra_from_pre_relation_from"
            java.lang.String r5 = r9.getStringExtra(r5)
            android.arch.lifecycle.y r6 = android.arch.lifecycle.C0214z.m440a(r8)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.StatusStoreViewModel> r7 = com.p683ss.android.ugc.aweme.shortvideo.StatusStoreViewModel.class
            android.arch.lifecycle.x r6 = r6.mo359a(r7)
            com.ss.android.ugc.aweme.shortvideo.StatusStoreViewModel r6 = (com.p683ss.android.ugc.aweme.shortvideo.StatusStoreViewModel) r6
            java.lang.String r7 = "extra_from_event_type"
            r6.mo86405a(r7, r3)
            java.lang.String r3 = "extra_from_pre_page"
            r6.mo86405a(r3, r4)
            java.lang.String r3 = "extra_from_pre_relation_from"
            r6.mo86405a(r3, r5)
            java.lang.String r3 = "extra_from_event_enter_from"
            r6.mo86405a(r3, r1)
            java.lang.String r1 = "face_to_face"
            boolean r1 = android.text.TextUtils.equals(r4, r1)
            if (r1 == 0) goto L_0x017d
            java.lang.String r1 = "extra_previous_page_position"
            r9.putExtra(r1, r4)
        L_0x017d:
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r1 = com.p683ss.android.ugc.aweme.awemeservice.C23324d.m57378a()
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r1 = (com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService) r1
            java.lang.String r3 = "source_aid"
            java.lang.String r3 = r9.getStringExtra(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.getRawAdAwemeById(r3)
            r8.f102613n = r1
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r3 = "from_micro_app"
            java.lang.String r1 = r1.getStringExtra(r3)
            r8.f102619t = r1
            java.lang.String r1 = r8.f102619t
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01b5
            android.net.Uri r1 = r9.getData()
            if (r1 == 0) goto L_0x01b5
            android.net.Uri r9 = r9.getData()
            java.lang.String r1 = "from"
            java.lang.String r9 = r9.getQueryParameter(r1)
            r8.f102619t = r9
        L_0x01b5:
            java.lang.String r9 = r8.f102614o
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x01ed
            java.lang.String r9 = r8.f102616q
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x01ed
            java.lang.String r9 = r8.f102615p
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x01ce
            goto L_0x01fd
        L_0x01ce:
            java.lang.String r9 = r8.f102615p
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            java.lang.String r1 = r1.getUniqueId()
            boolean r9 = android.text.TextUtils.equals(r9, r1)
            if (r9 == 0) goto L_0x01ff
            com.ss.android.ugc.aweme.IAccountUserService r9 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r9 = r9.getCurUserId()
            r8.f102614o = r9
            goto L_0x01fd
        L_0x01ed:
            java.lang.String r9 = r8.f102614o
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r1 = r1.getCurUserId()
            boolean r9 = android.text.TextUtils.equals(r9, r1)
            if (r9 == 0) goto L_0x01ff
        L_0x01fd:
            r9 = 1
            goto L_0x0200
        L_0x01ff:
            r9 = 0
        L_0x0200:
            if (r9 == 0) goto L_0x022c
            android.support.v4.app.k r1 = r8.getSupportFragmentManager()
            java.lang.String r2 = "myprofilefragment"
            android.support.v4.app.Fragment r2 = r1.mo2224a(r2)
            if (r2 != 0) goto L_0x0214
            com.ss.android.ugc.aweme.profile.service.c r2 = com.p683ss.android.ugc.aweme.profile.service.C40010c.f101950a
            com.ss.android.ugc.aweme.base.e.a r2 = r2.mo82027b()
        L_0x0214:
            android.os.Bundle r3 = r8.m89411f()
            r2.setArguments(r3)
            android.support.v4.app.r r1 = r1.mo2225a()
            r3 = 2132024586(0x7f141d0a, float:1.9687652E38)
            java.lang.String r4 = "myprofilefragment"
            android.support.v4.app.r r1 = r1.mo2192b(r3, r2, r4)
            r1.mo2195c()
            goto L_0x0261
        L_0x022c:
            java.lang.String r1 = r8.f102614o
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x025e
            java.lang.String r1 = r8.f102616q
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x023d
            goto L_0x025e
        L_0x023d:
            java.lang.String r1 = r8.f102615p
            com.ss.android.ugc.aweme.profile.presenter.ab r3 = r8.f102618s
            if (r3 != 0) goto L_0x024f
            com.ss.android.ugc.aweme.profile.presenter.ab r3 = new com.ss.android.ugc.aweme.profile.presenter.ab
            r3.<init>()
            r8.f102618s = r3
            com.ss.android.ugc.aweme.profile.presenter.ab r3 = r8.f102618s
            r3.mo54800a(r8)
        L_0x024f:
            com.ss.android.ugc.aweme.profile.presenter.ab r3 = r8.f102618s
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r1
            r3.mo44934a_(r2)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r8.mDmtStatusView
            r1.mo19212f()
            goto L_0x0261
        L_0x025e:
            r8.m89410e()
        L_0x0261:
            r8.m89409d()
            if (r9 != 0) goto L_0x026d
            com.ss.android.ugc.aweme.antiaddic.lock.b r9 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()
            r9.mo47101a(r8)
        L_0x026d:
            java.lang.String r9 = "com.ss.android.ugc.aweme.profile.ui.UserProfileActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r9, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public static void m89400a(Context context, Bundle bundle) {
        if (context != null) {
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m89401a(Context context, User user) {
        if (context != null && user != null) {
            m89407a(context, user.getUid(), user.getSecUid(), m89399a(user), "");
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isViewValid()) {
            return false;
        }
        for (C23422a onKeyDown : this.f102601b) {
            if (onKeyDown.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    public static void m89402a(Context context, User user, String str) {
        m89403a(context, user, str, "");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1 || i2 != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (this.mSlideSwitchLayout != null) {
            this.mSlideSwitchLayout.setCurrentItem("page_profile");
        }
    }

    /* renamed from: a */
    public static void m89406a(Context context, String str, String str2) {
        if (context != null && str != null && !str.equals("")) {
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtra("uid", str);
            intent.putExtra("sec_user_id", str2);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    private static void m89403a(Context context, User user, String str, String str2) {
        m89404a(context, user, str, str2, "");
    }

    /* renamed from: a */
    public static void m89404a(Context context, User user, String str, String str2, String str3) {
        m89405a(context, user, str, str2, str3, "");
    }

    /* renamed from: a */
    private static void m89407a(Context context, String str, String str2, int i, String str3) {
        if (context != null && str != null && !str.equals("")) {
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtra("uid", str);
            intent.putExtra("sec_user_id", str2);
            intent.putExtra("profile_enterprise_type", i);
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("enter_from_request_id", str3);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m89405a(Context context, User user, String str, String str2, String str3, String str4) {
        if (context != null && user != null && !TextUtils.isEmpty(user.getUid())) {
            String uid = user.getUid();
            String secUid = user.getSecUid();
            Intent intent = new Intent(context, UserProfileActivity.class);
            intent.putExtra("enter_from", str);
            intent.putExtra("uid", uid);
            intent.putExtra("sec_user_id", secUid);
            intent.putExtra("profile_enterprise_type", m89399a(user));
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("enter_from_request_id", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                intent.putExtra("extra_previous_page_position", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                intent.putExtra("enter_method", str4);
            }
            context.startActivity(intent);
        }
    }
}
