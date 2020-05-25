package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.setting.Divider;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.followrequest.C32373c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29973d;
import com.p683ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39984r;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.setting.C41626j;
import com.p683ss.android.ugc.aweme.setting.p2139h.C41619j;
import com.p683ss.android.ugc.aweme.setting.p2139h.C41620k;
import com.p683ss.android.ugc.aweme.setting.p2141j.C41629b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41693b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41700e;
import com.p683ss.android.ugc.aweme.setting.services.C41712a;
import com.p683ss.android.ugc.aweme.setting.verification.C41904b;
import com.p683ss.android.ugc.aweme.setting.verification.C41905c;
import com.p683ss.android.ugc.aweme.setting.verification.C41905c.C41906a;
import com.p683ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.PrivacyActivity */
public class PrivacyActivity extends AmeBaseActivity implements OnClickListener, C39985s, C41620k, C41693b {

    /* renamed from: c */
    private static final boolean f105709c = false;

    /* renamed from: A */
    private boolean f105710A = false;

    /* renamed from: B */
    private C22687a f105711B = C22687a.NONE;

    /* renamed from: C */
    private C29973d f105712C;

    /* renamed from: a */
    protected List<CommonItemView> f105713a = new ArrayList();

    /* renamed from: b */
    protected C39984r f105714b;
    protected CommonItemView contactItem;

    /* renamed from: d */
    private List<String> f105715d;

    /* renamed from: e */
    private boolean f105716e = false;

    /* renamed from: f */
    private C41619j f105717f;
    ImageView mBack;
    protected CommonItemView mBlockListItem;
    protected CommonItemView mCommentFilterItem;
    protected CommonItemView mCommentManagerItem;
    protected CommonItemView mDownloadItem;
    protected CommonItemView mDuetItem;
    protected CommonItemView mPersonalizationItem;
    protected CommonItemView mPrivacyManagerItem;
    protected LinearLayout mPrivacyParent;
    protected CommonItemView mPrivateAccount;
    protected CommonItemView mReactItem;
    protected TextView mTitle;
    protected CommonItemView mWhoCanSeeMyLikeListItem;
    protected View personalizationDiv;

    /* renamed from: r */
    private C41700e f105718r;

    /* renamed from: s */
    private C41905c f105719s;
    protected View safeDivider;

    /* renamed from: t */
    private int f105720t = -1;

    /* renamed from: u */
    private int f105721u = 0;

    /* renamed from: v */
    private int f105722v = 0;

    /* renamed from: w */
    private int f105723w = 0;

    /* renamed from: x */
    private int f105724x = 0;

    /* renamed from: y */
    private int f105725y = -1;

    /* renamed from: z */
    private int f105726z = -1;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.btx;
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo54362a(boolean z) {
    }

    public void back() {
        finish();
    }

    /* renamed from: e_ */
    public final void mo55285e_(Exception exc) {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (this.f105717f != null) {
            this.f105717f.mo46991S_();
        }
        if (this.f105719s != null) {
            this.f105719s.mo85818a();
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacyActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a0_).init();
    }

    /* renamed from: d */
    public static Boolean m91731d() {
        String str;
        if (!C20854a.m53167g().isLogin()) {
            return Boolean.valueOf(false);
        }
        Boolean valueOf = Boolean.valueOf(false);
        try {
            valueOf = C32816h.m75716b().getEnableDownloadTtData();
        } catch (Exception unused) {
        }
        if (f105709c) {
            StringBuilder sb = new StringBuilder("Data download feature ");
            if (valueOf.booleanValue()) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            sb.append(str);
        }
        return valueOf;
    }

    public final void bJ_() {
        String str;
        this.contactItem.setChecked(!this.contactItem.mo19040c());
        C20854a.m53167g().updateCurHideSearch(!this.contactItem.mo19040c());
        if (this.contactItem.mo19040c()) {
            str = "shield_on";
        } else {
            str = "shield_off";
        }
        C23196ad.m56841a(str).mo47957b("type", "contact").mo48076e();
    }

    /* renamed from: c */
    public static boolean m91730c() {
        if ((C23794bh.m58381G().mo47253n() || m91731d().booleanValue() || C23794bh.m58381G().mo47245f() != 0) && !C47915gg.m103651b()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private void m91729c(boolean z) {
        int i;
        this.mPrivateAccount.setChecked(z);
        if (z) {
            i = 3;
        } else {
            i = 0;
        }
        m91728c(i);
    }

    /* renamed from: b */
    public final void mo85381b(Exception exc) {
        C10691a.m21542b((Context) this, (int) R.string.cm4).mo19066a();
    }

    /* renamed from: b */
    public final void mo85665b(boolean z) {
        this.f105716e = z;
        m91729c(z);
        this.f105714b.mo81854a(z);
    }

    /* renamed from: a */
    private void m91724a(int i) {
        this.f105720t = i;
        if (i == C41626j.f105358a) {
            this.mCommentManagerItem.setRightText(getString(R.string.h8));
        } else if (i == C41626j.f105359b) {
            this.mCommentManagerItem.setRightText(getString(R.string.as8));
        } else {
            if (i == C41626j.f105361d) {
                this.mCommentManagerItem.setRightText(getString(R.string.h3r));
            }
        }
    }

    /* renamed from: b */
    private void m91726b(int i) {
        this.f105722v = i;
        if (i == 0) {
            this.mReactItem.setRightText(getResources().getString(R.string.h8));
        } else if (i == 1) {
            this.mReactItem.setRightText(getResources().getString(R.string.clq));
        } else {
            if (i == 3) {
                this.mReactItem.setRightText(getResources().getString(R.string.h3r));
            }
        }
    }

    /* renamed from: c */
    private void m91728c(int i) {
        if (this.f105716e) {
            this.f105721u = 3;
            this.mDownloadItem.setRightText(getResources().getString(R.string.clb));
            return;
        }
        this.f105721u = i;
        if (i == 0) {
            this.mDownloadItem.setRightText(getString(R.string.clh));
        } else {
            this.mDownloadItem.setRightText(getString(R.string.clb));
        }
    }

    public void onShieldSwitcherClick(View view) {
        if (this.contactItem.mo19040c()) {
            this.f105717f.mo44934a_(Integer.valueOf(1));
            return;
        }
        this.f105717f.mo44934a_(Integer.valueOf(0));
    }

    /* renamed from: d */
    private void m91732d(int i) {
        this.f105724x = i;
        C23183v.m56778a().mo47909e().mo47776a(Integer.valueOf(i));
        C47718bf.m103288a(new C41873ba());
        if (i == 0) {
            this.mWhoCanSeeMyLikeListItem.setRightText(getString(R.string.h8));
            return;
        }
        if (i == 1) {
            this.mWhoCanSeeMyLikeListItem.setRightText(getString(R.string.h3s));
        }
    }

    /* renamed from: e */
    private void m91733e(int i) {
        int i2;
        this.f105725y = i;
        if (this.f105725y == 0 || (this.f105725y == 1 && !this.f105710A)) {
            try {
                if (C32816h.m75716b().getEnableTImChatEveryone().booleanValue()) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                this.f105725y = i2;
            } catch (C10174a unused) {
            }
        }
        if (this.f105725y == 1) {
            this.mPrivacyManagerItem.setRightText(getResources().getString(R.string.h8));
        } else if (this.f105725y == 2) {
            this.mPrivacyManagerItem.setRightText(getResources().getString(R.string.clq));
        } else {
            if (this.f105725y == 3) {
                this.mPrivacyManagerItem.setRightText(getResources().getString(R.string.h3r));
            }
        }
    }

    /* renamed from: a */
    public final void mo55281a(C41686c cVar) {
        if (cVar != null) {
            this.f105710A = cVar.f105458A;
            this.f105711B = BusinessComponentServiceUtils.getParentalPlatformService().getRole(cVar);
            int i = cVar.f105500p;
            int i2 = cVar.f105501q;
            m91727b(i, i2);
            m91726b(i2);
            m91724a(cVar.f105499o);
            m91728c(cVar.f105502r);
            int i3 = cVar.f105509y;
            this.f105726z = cVar.f105510z;
            m91733e(i3);
            int i4 = cVar.f105469L;
            int i5 = cVar.f105470M;
            String curUserId = C20854a.m53167g().getCurUserId();
            C29973d dVar = this.f105712C;
            StringBuilder sb = new StringBuilder("comment_filter_status_");
            sb.append(curUserId);
            dVar.mo60153b(sb.toString(), Integer.valueOf(i4));
            C29973d dVar2 = this.f105712C;
            StringBuilder sb2 = new StringBuilder("comment_offensive_filter_");
            sb2.append(curUserId);
            dVar2.mo60153b(sb2.toString(), Integer.valueOf(i5));
            m91725a(i4, i5);
            m91732d(cVar.f105460C);
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.c4q) {
            onShieldSwitcherClick(view);
            return;
        }
        if (id == R.id.c4v) {
            if (!isFinishing()) {
                if (this.f105726z == 3 && this.f105711B == C22687a.UNLINK_LOCKED) {
                    C10691a.m21545b((Context) this, getString(R.string.gcd)).mo19066a();
                } else {
                    SmartRouter.buildRoute((Context) this, "aweme://chatcontrol/setting").withParam("chat_set", this.f105725y).withParam("chat_setting_open_everyone", this.f105710A).open(1);
                }
            }
        } else if (id == R.id.c4p) {
            startActivity(new Intent(this, BlackListActivity.class));
            C26890h.onEvent(new MobClick().setEventName("black_list").setLabelName("message"));
        } else if (id == R.id.xc) {
            int i = this.f105720t;
            Intent intent = new Intent(this, CommentControlSettingActivity.class);
            intent.putExtra("currentSettingsValue", i);
            startActivityForResult(intent, 3);
        } else if (id == R.id.c4s) {
            if (!isFinishing()) {
                SmartRouter.buildRoute((Context) this, "aweme://duetcontrol/setting").withParam("currentSettingsValue", this.f105723w).open(2);
            }
        } else if (id == R.id.c4u) {
            if (!isFinishing()) {
                SmartRouter.buildRoute((Context) this, "aweme://reactcontrol/setting").withParam("currentSettingsValue", this.f105722v).open(5);
            }
        } else if (id == R.id.c4r) {
            if (!isFinishing()) {
                int i2 = this.f105721u;
                Intent intent2 = new Intent(this, DownloadControlSettingActivity.class);
                intent2.putExtra("currentSettingsValue", i2);
                startActivityForResult(intent2, 4);
            }
        } else if (id == R.id.c4t) {
            User curUser = C20854a.m53167g().getCurUser();
            if (curUser != null && curUser.isProAccount() && !curUser.isSecret() && !this.f105716e) {
                new C10643a(this).mo18899b((int) R.string.apb).mo18885a((int) R.string.aph).mo18886a((int) R.string.apf, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).mo18897a().mo18882b();
            } else if (this.f105716e) {
                C23196ad.m56841a("shield_off").mo47957b("type", "account").mo48076e();
                new C10643a(this).mo18899b((int) R.string.a01).mo18885a((int) R.string.zy).mo18886a((int) R.string.ah2, (DialogInterface.OnClickListener) new C41892u(this)).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo18897a().mo18882b();
            } else {
                final C41881j jVar = new C41881j(this);
                jVar.show();
                C41905c cVar = this.f105719s;
                C417671 r2 = new C41904b() {
                    /* renamed from: a */
                    public final void mo85279a() {
                        jVar.dismiss();
                    }

                    /* renamed from: a */
                    public final void mo82330a(VerificationResponse verificationResponse) {
                        if (verificationResponse.shouldShowChangeMobileDialog()) {
                            new C10643a(PrivacyActivity.this).mo18902b(PrivacyActivity.this.getString(R.string.d7w)).mo18892a(PrivacyActivity.this.getString(R.string.d7x)).mo18886a((int) R.string.d7r, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    C32373c.m74717a();
                                    PrivacyActivity.this.mo85665b(true);
                                }
                            }).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo18897a().mo18882b();
                            return;
                        }
                        C32373c.m74717a();
                        PrivacyActivity.this.mo85665b(true);
                    }
                };
                C52711k.m112240b(curUser, "user");
                C52711k.m112240b(r2, "callback");
                cVar.mo85820a(C41906a.m91851b(), curUser, r2);
            }
        } else if (id == R.id.x7) {
            if (!isFinishing()) {
                SmartRouter.buildRoute((Context) this, "aweme://filtercomments").open(6);
                C26890h.m65011a("enter_filter_comment", new C23089d().mo47829a("enter_from", "privacy_setting").f61491a);
            }
        } else if (id == R.id.dv4) {
            int i3 = this.f105724x;
            C52711k.m112240b(this, "context");
            Intent intent3 = new Intent(this, WhoCanSeeMyLikeListActivity.class);
            intent3.putExtra("currentSettingsValue", i3);
            startActivityForResult(intent3, 7);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacyActivity", "onCreate", true);
        super.onCreate(bundle);
        this.mTitle.setText(R.string.dfi);
        this.f105713a.add(this.contactItem);
        this.f105713a.add(this.mPrivacyManagerItem);
        this.f105713a.add(this.mBlockListItem);
        this.f105713a.add(this.mReactItem);
        this.f105713a.add(this.mDuetItem);
        this.f105713a.add(this.mDownloadItem);
        this.f105713a.add(this.mCommentManagerItem);
        this.f105713a.add(this.mPrivateAccount);
        this.f105713a.add(this.mCommentFilterItem);
        this.f105713a.add(this.mWhoCanSeeMyLikeListItem);
        this.f105713a.add(this.mPersonalizationItem);
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enableStitch()) {
            this.mDuetItem.setLeftText(getString(R.string.hiq));
        }
        for (CommonItemView rightIconRes : this.f105713a) {
            rightIconRes.setRightIconRes(0);
        }
        if (C47915gg.m103651b()) {
            C23131p.m56692a("ftc_enter_privacy_setting", "", C23088c.m56631a().mo47825b());
        }
        if (!BusinessComponentServiceUtils.getParentalPlatformService().showChatLockEntrance() || !BusinessComponentServiceUtils.getMainHelperService().mo75663d()) {
            z = false;
        } else {
            z = true;
        }
        CommonItemView commonItemView = this.mPrivacyManagerItem;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        commonItemView.setVisibility(i);
        this.contactItem.setChecked(!C20854a.m53167g().getCurUser().isHideSearch());
        if (C41626j.m91500a()) {
            this.mCommentManagerItem.setVisibility(0);
        } else {
            this.mCommentManagerItem.setVisibility(8);
        }
        if (((Integer) SharePrefCache.inst().getPrivacyDownloadSetting().mo47782d()).intValue() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.mDownloadItem.setVisibility(0);
        }
        this.mCommentFilterItem.setVisibility(0);
        if (C20854a.m53167g().getCurUser().isForcePrivateAccount()) {
            this.mPrivateAccount.setAlpha(0.34f);
            this.mPrivateAccount.setOnClickListener(new C41891t(this));
        } else {
            this.mPrivateAccount.setOnClickListener(this);
        }
        CommonItemView commonItemView2 = this.mReactItem;
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enableReact()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        commonItemView2.setVisibility(i2);
        if (m91730c()) {
            this.mPersonalizationItem.setVisibility(8);
            this.personalizationDiv.setVisibility(8);
            this.safeDivider.setVisibility(8);
        } else {
            this.mPersonalizationItem.setOnClickListener(new C41893v(this));
        }
        if (C47915gg.m103651b()) {
            this.personalizationDiv.setVisibility(8);
            this.mPersonalizationItem.setVisibility(8);
            this.contactItem.setVisibility(8);
            this.mPrivacyManagerItem.setVisibility(8);
            this.mPrivateAccount.setVisibility(8);
            this.mCommentManagerItem.setVisibility(8);
            this.mReactItem.setVisibility(8);
            this.mDuetItem.setVisibility(8);
            this.mDownloadItem.setVisibility(8);
        }
        if (!C20854a.m53167g().isLogin()) {
            this.mPersonalizationItem.setLeftText(getString(R.string.dfk));
            this.mPersonalizationItem.setLeftIcon(2131955317);
            if (this.personalizationDiv instanceof Divider) {
                ((Divider) this.personalizationDiv).setLeftText(getString(R.string.dfl));
            } else if (this.personalizationDiv instanceof Divider) {
                ((Divider) this.personalizationDiv).getTxtLeft().setText(R.string.dfl);
            }
            View[] viewArr = {this.mPersonalizationItem, this.personalizationDiv};
            int childCount = this.mPrivacyParent.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.mPrivacyParent.getChildAt(i3);
                int i4 = 0;
                while (true) {
                    if (i4 >= 2) {
                        z3 = false;
                        break;
                    } else if (viewArr[i4] == childAt) {
                        z3 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (!z3 && childAt.getVisibility() != 8) {
                    childAt.setVisibility(8);
                }
            }
        }
        if (C11010c.m22292m() == 5) {
            if (this.f105715d == null) {
                this.f105715d = C41712a.f105567a.itmeListForPrivacySetting();
            }
            if (this.f105715d != null) {
                C41629b.m91504a(this.mPrivacyParent, this.f105715d);
            }
        }
        this.f105717f = new C41619j();
        this.f105717f.mo54800a(this);
        this.f105718r = new C41700e();
        this.f105718r.mo54800a(this);
        this.f105718r.mo44934a_(new Object[0]);
        this.f105719s = new C41905c();
        this.f105714b = ProfileServiceImpl.createIProfileServicebyMonsterPlugin().newUserPresenter();
        this.f105714b.mo81850a((C39985s) this);
        User curUser = C20854a.m53167g().getCurUser();
        if (curUser != null) {
            this.f105716e = curUser.isSecret();
            this.mPrivateAccount.setChecked(this.f105716e);
        }
        this.f105712C = C29973d.m70118a();
        this.contactItem.setOnClickListener(this);
        this.mPrivacyManagerItem.setOnClickListener(this);
        this.mBlockListItem.setOnClickListener(this);
        this.mDuetItem.setOnClickListener(this);
        this.mDownloadItem.setOnClickListener(this);
        this.mCommentManagerItem.setOnClickListener(this);
        this.mReactItem.setOnClickListener(this);
        this.mCommentFilterItem.setOnClickListener(this);
        this.mWhoCanSeeMyLikeListItem.setOnClickListener(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.PrivacyActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        this.f105716e = user.isSecret();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85664a(DialogInterface dialogInterface, int i) {
        mo85665b(false);
        C23196ad.m56841a("change_approve").mo47957b("type", "account").mo48076e();
    }

    /* renamed from: a */
    private void m91725a(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4 = false;
        try {
            z = C32816h.m75716b().getEnableCommentOffensiveFilterSwitch().booleanValue();
        } catch (C10174a unused) {
            z = false;
        }
        if (i2 != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((z && z2) || z3) {
            z4 = true;
        }
        CommonItemView commonItemView = this.mCommentFilterItem;
        if (z4) {
            i3 = R.string.clh;
        } else {
            i3 = R.string.clb;
        }
        commonItemView.setRightText(getString(i3));
    }

    /* renamed from: b */
    private void m91727b(int i, int i2) {
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().duetSupportChangeLayout() && !Keva.getRepo("new_duet_repo").getBoolean("has_set_permission", false)) {
            i = Math.max(i, i2);
            Keva.getRepo("new_duet_repo").storeBoolean("has_set_permission", true);
        }
        this.f105723w = i;
        if (i == 0) {
            this.mDuetItem.setRightText(getResources().getString(R.string.h8));
        } else if (i == 1) {
            this.mDuetItem.setRightText(getResources().getString(R.string.clq));
        } else {
            if (i == 3) {
                this.mDuetItem.setRightText(getResources().getString(R.string.h3r));
            }
        }
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        if (i == 122) {
            this.f105716e = !this.f105716e;
            m91729c(this.f105716e);
            C10691a.m21542b((Context) this, (int) R.string.cm4).mo19066a();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (1 == i && i2 == -1) {
            int intExtra = intent.getIntExtra("currentSettingsValue", -1);
            if (!(-1 == intExtra || intExtra == this.f105725y)) {
                m91733e(intExtra);
            }
        } else if (3 == i && i2 == -1) {
            int intExtra2 = intent.getIntExtra("currentSettingsValue", -1);
            if (!(-1 == intExtra2 || intExtra2 == this.f105720t)) {
                m91724a(intExtra2);
            }
        } else if (4 == i && i2 == -1) {
            m91728c(intent.getIntExtra("currentSettingsValue", 0));
        } else if (5 == i && i2 == -1) {
            m91726b(intent.getIntExtra("currentSettingsValue", 0));
        } else if (2 == i && i2 == -1) {
            m91727b(intent.getIntExtra("currentSettingsValue", 0), -1);
        } else if (6 == i && i2 == -1) {
            m91725a(intent.getIntExtra("comment_filter_status", 0), intent.getIntExtra("comment_offensive_filter", 0));
        } else if (6 == i && i2 == 0) {
            this.f105718r.mo44934a_(new Object[0]);
        } else {
            if (7 == i && i2 == -1) {
                int intExtra3 = intent.getIntExtra("currentSettingsValue", -1);
                if (!(-1 == intExtra3 || intExtra3 == this.f105724x)) {
                    m91732d(intExtra3);
                }
            }
        }
    }
}
