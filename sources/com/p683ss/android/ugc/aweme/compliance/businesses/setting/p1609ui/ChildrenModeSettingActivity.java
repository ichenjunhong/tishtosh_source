package com.p683ss.android.ugc.aweme.compliance.businesses.setting.p1609ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.router.SmartRouter;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountService.C20834a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.experiment.C20966a;
import com.p683ss.android.ugc.aweme.antiaddic.C22692c;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.p1420ui.session.C23706b;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.ComplianceBusinessDependServiceImpl;
import com.p683ss.android.ugc.aweme.compliance.businesses.setting.p1608a.C27061a;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.language.I18nManagerService;
import com.p683ss.android.ugc.aweme.login.C27960d;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.services.external.ICacheService;
import com.p683ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p683ss.android.ugc.aweme.setting.C41631k;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.services.C41713b;
import com.p683ss.android.ugc.aweme.utils.C47684at;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeSettingActivity */
public class ChildrenModeSettingActivity extends AmeBaseActivity implements OnClickListener, C20834a {

    /* renamed from: a */
    C27960d f71414a;

    /* renamed from: b */
    protected C10641a f71415b;

    /* renamed from: c */
    private int f71416c;

    /* renamed from: d */
    private long f71417d;
    CommonItemView mAccountAndSafetyItem;
    CommonItemView mClearCacheItem;
    CommonItemView mCommonProtocolItem;
    CommonItemView mCommunityGuidelinesItem;
    CommonItemView mCopyRightPolicyItem;
    CommonItemView mDataSaver;
    CommonItemView mFeedbackAndHelpItem;
    CommonItemView mHelperCenter;
    CommonItemView mLogout;
    CommonItemView mOpenDebugTest;
    CommonItemView mPrivacyPolicyItem;
    CommonItemView mProtocolItem;
    CommonItemView mSafetyCenter;
    TextTitleBar mTitleBar;
    CommonItemView mUnderAgeProtection;
    TextView mUserInfo;
    TextView mVersionView;
    ViewGroup rootView;
    View statusBar;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.b7n;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    private void m65286d() {
        ComplianceBusinessDependServiceImpl.createIComplianceBusinessDependServicebyMonsterPlugin().syncParentalData(new C22692c() {
            /* renamed from: a */
            public final void mo47081a(Exception exc) {
                ChildrenModeSettingActivity.this.mo55300a(true);
            }

            /* renamed from: a */
            public final void mo47080a(C41686c cVar, boolean z) {
                ChildrenModeSettingActivity.this.mo55300a(true);
            }
        });
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.bk, R.anim.by);
    }

    public void onDestroy() {
        super.onDestroy();
        C20854a.m53161a().removeLoginOrLogoutListener(this);
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.wo).init();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo55301c() {
        if (this.f71415b == null) {
            C10643a aVar = new C10643a(this);
            aVar.mo18885a((int) R.string.ahh).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) new C27072e(this)).mo18886a((int) R.string.c1n, (DialogInterface.OnClickListener) new C27073f(this));
            if (C20966a.m53329a()) {
                StringBuilder sb = new StringBuilder("@");
                sb.append(C47915gg.m103656e(C20902b.m53242a().getCurUser()));
                aVar.mo18902b(sb.toString());
            }
            this.f71415b = aVar.mo18897a();
        }
        this.f71415b.mo18882b();
    }

    public void exit(View view) {
        finish();
    }

    @C53771m
    public void onEvent(C35471h hVar) {
        if (TextUtils.equals("user", hVar.itemType)) {
            C47881fd.m103578a(this, this.rootView, hVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo55298a(C0013i iVar) throws Exception {
        if (iVar.mo26b()) {
            this.mClearCacheItem.setRightText("0 M");
            C10691a.m21533a((Context) this, (int) R.string.a3a).mo19066a();
        }
        return null;
    }

    /* renamed from: b */
    private boolean m65285b(boolean z) {
        int i;
        if (!C23794bh.m58390d().mo47112i()) {
            return false;
        }
        if (BusinessComponentServiceUtils.getParentalPlatformService().getRole() != C22687a.CHILD) {
            BusinessComponentServiceUtils.getTimeLockHelperService().mo47090a(new C23706b<Boolean>() {
                /* renamed from: a */
                public final /* synthetic */ void mo47089a(Object obj) {
                    Boolean bool = (Boolean) obj;
                    ChildrenModeSettingActivity.this.mo55301c();
                }
            }, "logout");
            return true;
        } else if (!z) {
            m65286d();
            return true;
        } else {
            boolean h = C23794bh.m58390d().mo47111h();
            boolean b = C23794bh.m58390d().mo47105b();
            if (!h && !b) {
                return false;
            }
            if (b) {
                i = R.string.x0;
            } else {
                i = R.string.x1;
            }
            C10691a.m21533a((Context) this, i).mo19066a();
            return true;
        }
    }

    /* renamed from: a */
    public final void mo55300a(boolean z) {
        if (!AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishable()) {
            C10691a.m21542b((Context) this, (int) R.string.d0x).mo19066a();
        } else if (!C27074g.m65299a(this)) {
            C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
        } else if (isActive() && !m65285b(z)) {
            mo55301c();
        }
    }

    public void onVersionClick(View view) {
        if (System.currentTimeMillis() - this.f71417d < 500) {
            this.f71416c++;
        } else {
            this.f71416c = 0;
        }
        if (this.f71416c >= 4) {
            this.mUserInfo.setVisibility(0);
            String serverDeviceId = AppLog.getServerDeviceId();
            if (serverDeviceId == null) {
                serverDeviceId = "";
            }
            IAVSettingsService avsettingsConfig = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig();
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder("UserId: ");
            sb2.append(C20854a.m53167g().getCurUserId());
            sb.append(sb2.toString());
            sb.append("\n");
            StringBuilder sb3 = new StringBuilder("DeviceId: ");
            sb3.append(serverDeviceId);
            sb.append(sb3.toString());
            sb.append("\n");
            StringBuilder sb4 = new StringBuilder("UpdateVerionCode: ");
            sb4.append(C11010c.m22286g());
            sb.append(sb4.toString());
            sb.append("\n");
            StringBuilder sb5 = new StringBuilder("GitSHA: ");
            sb5.append(C11010c.m22291l());
            sb.append(sb5.toString());
            sb.append("\n");
            StringBuilder sb6 = new StringBuilder("VESDK: ");
            sb6.append(avsettingsConfig.getVESDKVersion());
            sb.append(sb6.toString());
            sb.append("\n");
            StringBuilder sb7 = new StringBuilder("EffectSdk: ");
            sb7.append(avsettingsConfig.getEffectVersion());
            sb.append(sb7.toString());
            sb.append("\n");
            sb.append(C41713b.f105569a.getReleaseBuildString());
            this.mUserInfo.setText(sb.toString());
            this.f71416c = 0;
        }
        this.f71417d = System.currentTimeMillis();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        this.mTitleBar.setTitle((int) R.string.e0i);
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                ChildrenModeSettingActivity.this.exit(view);
            }
        });
        if (VERSION.SDK_INT >= 19) {
            this.statusBar.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        C23729p.m58261a(true, this.mSafetyCenter);
        String a = C2240a.m6772a(getString(R.string.df4), new Object[]{C11010c.m22294o(), String.valueOf(C11010c.m22293n())});
        TextView textView = this.mVersionView;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("");
        textView.setText(sb.toString());
        this.rootView.setBackgroundColor(getResources().getColor(R.color.a3i));
        this.mTitleBar.setBackgroundColor(getResources().getColor(R.color.a2j));
        C23729p.m58261a(C41631k.m91508c(), this.mDataSaver);
        C27061a.m65278a(R.array.b2, (ViewGroup) this.rootView.findViewById(R.id.bga));
        this.mOpenDebugTest.setLeftText("Debug Test");
        this.mOpenDebugTest.setVisibility(8);
        try {
            ICacheService cacheConfig = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig();
            File[] fileArr = new File[5];
            fileArr[0] = getCacheDir();
            fileArr[1] = C48016e.m103940b();
            fileArr[2] = new File(cacheConfig.stickerDir());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C11010c.m22280a().getFilesDir().getAbsolutePath());
            sb2.append("/aweme_monitor");
            File file = new File(sb2.toString());
            if (!file.exists()) {
                file.mkdir();
            }
            fileArr[3] = file;
            fileArr[4] = C33200k.m76279d().getAudioDownloadCachePath();
            String b = C47684at.m103200b(fileArr);
            if (!C9431p.m18664a(b)) {
                this.mClearCacheItem.setRightText(b);
            }
        } catch (Exception unused) {
            this.mClearCacheItem.setRightText("0.00M");
        }
        this.mAccountAndSafetyItem.setOnClickListener(this);
        this.mUnderAgeProtection.setOnClickListener(this);
        this.mCommonProtocolItem.setOnClickListener(this);
        this.mFeedbackAndHelpItem.setOnClickListener(this);
        this.mHelperCenter.setOnClickListener(this);
        this.mProtocolItem.setOnClickListener(this);
        this.mPrivacyPolicyItem.setOnClickListener(this);
        this.mCopyRightPolicyItem.setOnClickListener(this);
        this.mClearCacheItem.setOnClickListener(this);
        this.mOpenDebugTest.setOnClickListener(this);
        this.mLogout.setOnClickListener(this);
        this.mCommunityGuidelinesItem.setOnClickListener(this);
        this.mSafetyCenter.setOnClickListener(this);
        this.mDataSaver.setOnClickListener(this);
        C23794bh.m58380F().mo7199a(1);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.compliance.businesses.setting.ui.ChildrenModeSettingActivity", "onCreate", false);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.x) {
            if (!C32800a.m75679a(view)) {
                C26890h.m65011a("enter_account_safety", C23089d.m56640a().mo47829a("enter_from", "settings_page").f61491a);
                if (this.mAccountAndSafetyItem.f28450d) {
                    this.mAccountAndSafetyItem.mo19039b();
                    C23542f.m57717b().mo48707b("has_notified_email_verification", 1);
                }
                startActivity(new Intent(this, ChildrenModeManageMyAccountActivity.class));
            }
        } else if (id == R.id.dl8) {
            if (!C32800a.m75679a(view)) {
                C26890h.m65011a("enter_teen_protection", C23089d.m56640a().mo47829a("enter_method", "click_button").mo47829a("enter_from", "settings_page").f61491a);
                ComplianceBusinessDependServiceImpl.createIComplianceBusinessDependServicebyMonsterPlugin().enterDigitalWellbeing(this);
            }
        } else if (id == R.id.a3f) {
            if (!C32800a.m75679a(view)) {
                SmartRouter.buildRoute((Context) this, "aweme://setting/datasaver").open();
                C26890h.onEventV3("enter_data_saver");
            }
        } else if (id == R.id.yh) {
            if (!C32800a.m75679a(view)) {
                C23196ad.m56841a("enter_general_setting").mo47957b("previous_page", "settings_page").mo47957b("enter_method", "click_button").mo48076e();
                C26890h.m65011a("display_settings", C23089d.m56640a().mo47829a("enter_from", "settings_page").f61491a);
                SmartRouter.buildRoute((Context) this, "aweme://childrendisplay/setting").open();
            }
        } else if (id != R.id.aer) {
            if (id == R.id.aoo) {
                if (!C32800a.m75679a(view)) {
                    if (!C27074g.m65299a(this)) {
                        C10691a.m21548c((Context) this, (int) R.string.cg1).mo19066a();
                    } else {
                        C18922i iVar = new C18922i("https://support.tiktok.com");
                        iVar.mo38778a("lang", C23794bh.m58378D().mo46907a(this));
                        SmartRouter.buildRoute((Context) this, "aweme://webview").withParam("url", iVar.mo38774a()).withParam("title", getString(R.string.b23)).open();
                    }
                }
            } else if (id == R.id.cy5) {
                if (!C32800a.m75679a(view)) {
                    if (!C27074g.m65299a(this)) {
                        C10691a.m21548c((Context) this, (int) R.string.cg1).mo19066a();
                    } else {
                        String str = "terms-of-use";
                        C52711k.m112240b(str, "projectKey");
                        I18nManagerService createI18nManagerServicebyMonsterPlugin = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin();
                        C52711k.m112236a((Object) createI18nManagerServicebyMonsterPlugin, "service");
                        String appLanguage = createI18nManagerServicebyMonsterPlugin.getAppLanguage();
                        String e = C35837h.m80980e();
                        StringBuilder sb = new StringBuilder("https://www.tiktok.com/in_app/redirect?region=");
                        sb.append(e);
                        sb.append("&language=");
                        sb.append(appLanguage);
                        sb.append("&projectKey=");
                        sb.append(str);
                        C18922i iVar2 = new C18922i(sb.toString());
                        iVar2.mo38778a("lang", C23794bh.m58378D().mo46907a(this));
                        SmartRouter.buildRoute((Context) this, "aweme://webview").withParam("url", iVar2.mo38774a()).withParam("title", getString(R.string.ccm)).open();
                    }
                }
            } else if (id == R.id.c4x) {
                if (!C32800a.m75679a(view)) {
                    if (!C27074g.m65299a(this)) {
                        C10691a.m21548c((Context) this, (int) R.string.cg1).mo19066a();
                    } else {
                        SmartRouter.buildRoute((Context) this, "aweme://webview").withParam(Uri.parse("https://www.tiktok.com/aweme/inapp/v2/c_privacy")).withParam("hide_status_bar", true).withParam("title", getString(R.string.cwv)).open();
                        C26890h.m65011a("enter_privacy_policy_entrance", C23089d.m56640a().mo47829a("enter_from", "settings_page").f61491a);
                    }
                }
            } else if (id == R.id.a0n) {
                if (!C32800a.m75679a(view)) {
                    if (!C27074g.m65299a(this)) {
                        C10691a.m21548c((Context) this, (int) R.string.cg1).mo19066a();
                    } else {
                        SmartRouter.buildRoute((Context) this, "aweme://webview").withParam(Uri.parse("https://www.tiktok.com/legal/copyright-policy")).withParam("title", getString(R.string.aiy)).open();
                    }
                }
            } else if (id == R.id.ts) {
                if (!C32800a.m75679a(view)) {
                    C23196ad.m56841a("click_clean_cache_button").mo47957b("enter_from", "settings_page").mo48076e();
                    C0013i.m16a((Callable<TResult>) new C27070c<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C27071d<TResult,TContinuationResult>(this), C0013i.f25b);
                }
            } else if (id == R.id.bux) {
                if (!C32800a.m75679a(view)) {
                }
            } else if (id == R.id.bjf) {
                if (!C32800a.m75679a(view)) {
                    mo55300a(false);
                }
            } else if (id == R.id.e3g) {
                if (!C32800a.m75679a(view)) {
                    if (!C27074g.m65299a(this)) {
                        C10691a.m21548c((Context) this, (int) R.string.cg1).mo19066a();
                    } else {
                        C18922i iVar3 = new C18922i("https://www.tiktok.com/community-guidelines");
                        iVar3.mo38778a("lang", C23794bh.m58378D().mo46907a(this));
                        iVar3.mo38778a("enter_from", "settings");
                        SmartRouter.buildRoute((Context) this, "aweme://webview").withParam("url", iVar3.mo38774a()).withParam("title", getString(R.string.agg)).open();
                    }
                }
            } else if (id == R.id.cgi && !C32800a.m75679a(view)) {
                if (!C27074g.m65299a(this)) {
                    C10691a.m21548c((Context) this, (int) R.string.cg1).mo19066a();
                    return;
                }
                C26890h.m65011a("click_safety_center", C23089d.m56640a().f61491a);
                String a = C23794bh.m58378D().mo46907a(this);
                StringBuilder sb2 = new StringBuilder("https://www.tiktok.com/");
                sb2.append(a);
                sb2.append("/safety/");
                SmartRouter.buildRoute((Context) this, "aweme://webview").withParam("url", sb2.toString()).withParam("title", getString(R.string.d9o)).open();
            }
        } else if (!C32800a.m75679a(view)) {
            C26890h.m65011a("FAQ", C23089d.m56640a().mo47829a("enter_from", "settings").f61491a);
            C26890h.m65011a("click_feedback_entrance", new C23089d().mo47829a("enter_from", "settings").f61491a);
            C18922i iVar4 = new C18922i("https://www.tiktok.com/aweme/inapp/v2/c_feedback");
            iVar4.mo38778a("enter_from", "settings");
            SmartRouter.buildRoute((Context) this, "aweme://webview").withParam("url", iVar4.mo38774a()).withParam("hide_nav_bar", true).open();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo55299a(DialogInterface dialogInterface, int i) {
        if (!C27074g.m65299a(this)) {
            C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
            return;
        }
        C18898c.m46009a(this, "log_out_popup", "confirm");
        C26890h.m65011a("log_out", C23089d.m56640a().mo47829a("enter_from", "settings_page").mo47826a("f_mode", 1).f61491a);
        C20854a.m53161a().addLoginOrLogoutListener(this);
        runOnUiThread(new C27069b(this));
        C20854a.m53162b().logout("user_logout", "user_logout");
    }

    /* renamed from: a */
    public final void mo44376a(int i, boolean z, int i2, User user) {
        if (!isFinishing() && this.f71414a != null && this.f71414a.isShowing()) {
            this.f71414a.dismiss();
        }
    }
}
