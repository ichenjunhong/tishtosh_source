package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.facebook.Profile;
import com.facebook.common.p920d.C13683f;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.experiment.C20966a;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1411c.C23484c;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.utils.C23726m;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.experiment.p1695a.C29499a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32463a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33102c;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p1256aa.C20847b;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.qrcode.C40952c.C40954a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p683ss.android.ugc.aweme.sdk.Wallet.DEFAULT;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.setting.C41520aa;
import com.p683ss.android.ugc.aweme.setting.p2136e.C41596b;
import com.p683ss.android.ugc.aweme.setting.p2140i.C41625a;
import com.p683ss.android.ugc.aweme.setting.p2141j.C41628a;
import com.p683ss.android.ugc.aweme.setting.p2141j.C41629b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2147ui.PushSettingManagerActivity;
import com.p683ss.android.ugc.aweme.setting.services.C41712a;
import com.p683ss.android.ugc.aweme.utils.C47841ec;
import com.p683ss.android.ugc.aweme.utils.C47859eq;
import com.p683ss.android.ugc.aweme.utils.C47888fj;
import com.p683ss.android.ugc.aweme.utils.C47897fr;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.wallet.C48223a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity */
public class I18nSettingNewVersionActivity extends SettingNewVersionActivity {

    /* renamed from: a */
    protected boolean f105699a;

    /* renamed from: ad */
    private List<String> f105700ad;

    /* renamed from: b */
    protected C10641a f105701b;

    /* renamed from: c */
    CommonItemView f105702c;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.bu1;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: K */
    private static boolean m91693K() {
        return C47897fr.m103604c();
    }

    /* renamed from: I */
    private void m91691I() {
        int i;
        CommonItemView commonItemView = this.f105702c;
        if (m91693K()) {
            i = 0;
        } else {
            i = 8;
        }
        commonItemView.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo85635g() {
        super.mo85635g();
        SmartRouter.buildRoute((Context) this, "aweme://account/setting").open();
    }

    public Resources getResources() {
        C47859eq.m103530a(this, this.mFirstResumed);
        return super.getResources();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo85636l() {
        SmartRouter.buildRoute((Context) this, "aweme://contentpreference").open();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo85633e() {
        super.mo85633e();
        if (C47915gg.m103651b()) {
            this.f105783Q.setVisibility(8);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C20854a.m53161a().removeLoginOrLogoutListener(this);
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.wo).init();
    }

    /* renamed from: y */
    public final void mo85654y() {
        if (!C41889r.m91838a(this)) {
            C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
        } else {
            C23794bh.m58384J().checkForUpdate(this, true);
        }
    }

    /* renamed from: J */
    private void m91692J() {
        if (C47897fr.m103605d() && C47897fr.m103602a()) {
            this.f105783Q.setVisibility(8);
        }
        if (this.f105702c == null || !C47897fr.m103607f()) {
            this.f105702c.mo19039b();
        } else {
            this.f105702c.mo19038a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo85625B() {
        super.mo85625B();
        if (C29499a.m69636a()) {
            this.f105771E.setLeftIcon(R.drawable.dwi);
            this.f105771E.setLeftText(getString(R.string.dg9));
            return;
        }
        C2201v.m6601a((C2205y<T>) new C41885n<T>(this)).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C41886o<Object>(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo85627D() {
        C26890h.m65011a("enter_notification_setting", C23089d.m56640a().mo47829a("previous_page", "settings_page").mo47829a("enter_method", "click_button").f61491a);
        C26890h.onEvent(MobClick.obtain().setEventName("notification_setting").setLabelName("settings_page"));
        startActivity(new Intent(this, PushSettingManagerActivity.class));
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo85628E() {
        String str = "https://www.tiktok.com/i18n/forparents/";
        if (!isFinishing()) {
            Intent intent = new Intent(this, CrossPlatformActivity.class);
            intent.putExtra("title", getString(R.string.dex));
            intent.setData(Uri.parse(str));
            startActivity(intent);
        }
    }

    /* renamed from: d */
    public final View[] mo85632d() {
        return new View[]{this.f105802r, this.f105778L, this.f105804t, this.f105779M, this.f105805u, this.f105807w, this.f105787U, this.f105777K, this.f105780N, this.f105776J};
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo85637m() {
        super.mo85637m();
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_type", "analytics");
        StringBuilder sb = new StringBuilder("https://www.tiktok.com/insight?hide_nav_bar=1&full_screen=1&status_bar_height=");
        sb.append(C47888fj.m103585a(44));
        C41628a.m91503a(this, sb.toString(), hashMap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo85638n() {
        C23196ad.m56841a("enter_general_setting").mo47957b("previous_page", "settings_page").mo47957b("enter_method", "click_button").mo48076e();
        C26890h.m65011a("display_settings", C23089d.m56640a().mo47829a("enter_from", "settings_page").f61491a);
        SmartRouter.buildRoute((Context) this, "aweme://display/setting").open();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo85652w() {
        C52711k.m112240b(this, "activity");
        Context context = this;
        if (!C41520aa.m91344a(context)) {
            C10691a.m21548c(context, (int) R.string.cg1).mo19066a();
        } else {
            SmartRouter.buildRoute(context, "aweme://webview").withParam(Uri.parse("https://www.tiktok.com/legal/copyright-policy")).withParam("title", getString(R.string.aiy)).open();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo85653x() {
        C23196ad.m56841a("enter_privacy_setting").mo47957b("previous_page", "settings_page").mo47957b("enter_method", "click_button").mo48076e();
        startActivity(new Intent(this, PrivacyActivity.class));
        C26890h.onEvent(MobClick.obtain().setEventName("privacy").setLabelName("settings"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo85624A() {
        if (this.f105701b == null) {
            C10643a aVar = new C10643a(this);
            aVar.mo18885a((int) R.string.ahh).mo18900b((int) R.string.wf, (OnClickListener) new C41883l(this)).mo18886a((int) R.string.c1n, (OnClickListener) new C41884m(this));
            if (C20966a.m53329a()) {
                User curUser = C20854a.m53167g().getCurUser();
                String o = C47915gg.m103666o(curUser);
                if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Login")) {
                    o = C47915gg.m103656e(curUser);
                }
                aVar.mo18902b(o);
            }
            this.f105701b = aVar.mo18897a();
        }
        Dialog b = this.f105701b.mo18882b();
        if (b != null) {
            View findViewById = b.findViewById(16908299);
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setGravity(8388611);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo85626C() {
        boolean a = C29499a.m69636a();
        StringBuilder sb = new StringBuilder("enableSettingDiskManager: ");
        sb.append(a);
        C32458a.m75141a(3, "clear-cache", sb.toString());
        if (a) {
            startActivity(new Intent(this, DiskManagerActivity.class));
            return;
        }
        C23196ad.m56841a("click_clean_cache_button").mo47957b("enter_from", "settings_page").mo48076e();
        C0013i.m16a((Callable<TResult>) new C41887p<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C41888q<TResult,TContinuationResult>(this), C0013i.f25b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo85634f() {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "settings_page");
        hashMap.put("scene_id", "1003");
        C26890h.m65011a("enter_wallet_page", (Map<String, String>) hashMap);
        C26890h.onEvent(new MobClick().setEventName("wallet").setLabelName("setting"));
        C26890h.m65011a("wallet_click", C23089d.m56640a().mo47829a("enter_from", "settings_page").f61491a);
        C48223a.m104473a(this, IWalletMainProxy.KEY_PAGE_INDEX);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo85645p() {
        C41625a aVar = C41625a.f105357a;
        C41625a.m91498a().storeBoolean("referral_code_badge", true);
        this.f105786T.mo19039b();
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf referralEntrance = inst.getReferralEntrance();
        C52711k.m112236a((Object) referralEntrance, "SharePrefCache.inst().referralEntrance");
        Object d = referralEntrance.mo47782d();
        C52711k.m112236a(d, "SharePrefCache.inst().referralEntrance.cache");
        SmartRouter.buildRoute((Context) this, "aweme://webview").withParam("use_webview_title", true).withParam(Uri.parse((String) d)).open();
        C26890h.m65011a("click_referral_invite_friends", C13683f.m27637of("enter_from", "settings_page"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo85646q() {
        C52711k.m112240b(this, "activity");
        Context context = this;
        if (!C41520aa.m91344a(context)) {
            C10691a.m21548c(context, (int) R.string.cg1).mo19066a();
            return;
        }
        C18922i iVar = new C18922i("https://support.tiktok.com");
        iVar.mo38778a("lang", C23794bh.m58378D().mo46907a(context));
        SmartRouter.buildRoute(context, "aweme://webview").withParam("url", iVar.mo38774a()).withParam("title", getString(R.string.b23)).open();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo85647r() {
        C52711k.m112240b(this, "activity");
        Context context = this;
        if (!C41520aa.m91344a(context)) {
            C10691a.m21548c(context, (int) R.string.cg1).mo19066a();
            return;
        }
        C26890h.m65011a("click_safety_center", C23089d.m56640a().f61491a);
        String a = C23794bh.m58378D().mo46907a(context);
        StringBuilder sb = new StringBuilder("https://www.tiktok.com/");
        sb.append(a);
        sb.append("/safety/");
        SmartRouter.buildRoute(context, "aweme://webview").withParam("url", sb.toString()).withParam("title", getString(R.string.d9o)).open();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo85648s() {
        C52711k.m112240b(this, "activity");
        Context context = this;
        if (!C41520aa.m91344a(context)) {
            C10691a.m21548c(context, (int) R.string.cg1).mo19066a();
            return;
        }
        C18922i iVar = new C18922i(C47841ec.m103484a("terms-of-use"));
        iVar.mo38778a("lang", C23794bh.m58378D().mo46907a(context));
        SmartRouter.buildRoute(context, "aweme://webview").withParam("url", iVar.mo38774a()).withParam("title", getString(R.string.ccm)).open();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo85649t() {
        if (!C41889r.m91838a(this)) {
            C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
            return;
        }
        C26890h.m65011a("enter_imprint", C23089d.m56640a().mo47829a("previous_page", "settings_page").mo47829a("enter_method", "click_button").f61491a);
        SmartRouter.buildRoute((Context) this, "aweme://webview").withParam("url", C23794bh.m58381G().mo47248i()).withParam("title", getString(R.string.hfj)).open();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo85650u() {
        C52711k.m112240b(this, "activity");
        Context context = this;
        if (!C41520aa.m91344a(context)) {
            C10691a.m21548c(context, (int) R.string.cg1).mo19066a();
            return;
        }
        C18922i iVar = new C18922i("https://www.tiktok.com/community-guidelines");
        iVar.mo38778a("lang", C23794bh.m58378D().mo46907a(context));
        iVar.mo38778a("enter_from", "settings");
        SmartRouter.buildRoute(context, "aweme://webview").withParam("url", iVar.mo38774a()).withParam("title", getString(R.string.agg)).open();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo85651v() {
        if (!C41889r.m91838a(this)) {
            C10691a.m21548c((Context) this, (int) R.string.cg1).mo19066a();
            return;
        }
        String j = C23794bh.m58381G().mo47249j();
        if (TextUtils.isEmpty(j)) {
            j = C47841ec.m103484a("privacy-policy");
        }
        SmartRouter.buildRoute((Context) this, "aweme://webview").withParam(Uri.parse(j)).withParam("hide_status_bar", true).withParam("title", getString(R.string.cwv)).open();
        C26890h.m65011a("enter_privacy_policy_entrance", C23089d.m56640a().mo47829a("enter_from", "settings_page").f61491a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo85655z() {
        User curUser = C20854a.m53167g().getCurUser();
        String o = C47915gg.m103666o(curUser);
        if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle(Profile.f35248a)) {
            o = C47915gg.m103656e(curUser);
        }
        SmartRouter.buildRoute((Context) this, "aweme://qrcodev2").withParam("extra_params", (Serializable) new C40954a().mo83446a(4, C47915gg.m103665n(curUser), "personal_homepage").mo83449a(o, C47915gg.m103667p(curUser), C47915gg.m103661j(curUser)).f104177a).open();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo85639o() {
        C18922i iVar;
        if (!C41889r.m91838a(this)) {
            C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
            return;
        }
        C26890h.m65011a("enter_feedback_page", C23089d.m56640a().mo47829a("enter_from", "settings_page").f61491a);
        C26890h.m65011a("FAQ", C23089d.m56640a().mo47829a("enter_from", "settings").f61491a);
        C26890h.m65011a("click_feedback_entrance", new C23089d().mo47829a("enter_from", "settings").f61491a);
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) this, "aweme://webview");
        if (C47915gg.m103651b()) {
            iVar = new C18922i("https://www.tiktok.com/aweme/inapp/v2/c_feedback");
        } else {
            try {
                C41302w.m91042a().mo83861a(C32816h.m75716b().getFeedbackConf().getNormalEntry());
                return;
            } catch (Exception unused) {
                iVar = new C18922i("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/");
                iVar.mo38778a("locale", C33102c.m76088a(this).getLanguage());
            }
        }
        iVar.mo38778a("enter_from", "settings");
        buildRoute.withParam(Uri.parse(iVar.toString())).withParam("hide_nav_bar", true).open();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo85631c() {
        boolean z;
        boolean z2;
        super.mo85631c();
        String a = C2240a.m6772a(getString(R.string.hhz), new Object[]{C11010c.m22294o(), String.valueOf(C11010c.m22293n())});
        TextView textView = this.f105773G;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("");
        textView.setText(sb.toString());
        if (DEFAULT.provideWalletService_Monster() != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || TextUtils.equals(C11010c.m22295p(), "amazon")) {
            this.f105778L.setVisibility(8);
        } else {
            this.f105778L.setVisibility(0);
        }
        String a2 = C23726m.m58236a(C11010c.m22280a(), "");
        if (TextUtils.isEmpty(a2) || a2.length() < 3) {
            z2 = false;
        } else {
            z2 = "510".equals(a2.substring(0, 3));
        }
        if (z2) {
            this.f105782P.setVisibility(0);
        } else {
            this.f105782P.setVisibility(8);
        }
        this.f105782P.setLeftText(getString(R.string.dex));
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf referralEntrance = inst.getReferralEntrance();
        C52711k.m112236a((Object) referralEntrance, "SharePrefCache.inst().referralEntrance");
        if (!TextUtils.isEmpty((CharSequence) referralEntrance.mo47782d())) {
            this.f105786T.setVisibility(0);
            C41625a aVar = C41625a.f105357a;
            if (!C41625a.m91498a().getBoolean("referral_code_badge", false)) {
                this.f105786T.mo19038a();
            }
        }
        this.f105784R.setVisibility(8);
        C23729p.m58261a(true, this.f105785S);
        if (C47915gg.m103651b()) {
            C23729p.m58261a(false, this.f105778L, this.f105779M, this.f105805u, this.f105806v, this.f105775I);
        }
        this.f105800e.setBackgroundColor(getResources().getColor(R.color.a3i));
        this.f105801f.setBackgroundColor(getResources().getColor(R.color.a2j));
        this.f105802r.setVisibility(8);
        if (getIntent() != null) {
            this.f105699a = getIntent().getBooleanExtra("from_pro_account", false);
        }
        mo85686F();
    }

    public void onResume() {
        int i;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onResume", true);
        if (C47859eq.m103531b(this)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onResume", false);
            return;
        }
        super.onResume();
        if (!C20854a.m53167g().isLogin()) {
            if (!PrivacyActivity.m91730c()) {
                this.f105806v.setVisibility(0);
            } else {
                this.f105806v.setVisibility(8);
            }
        } else if (this.f105806v.getVisibility() != 0 && !C47915gg.m103651b()) {
            this.f105806v.setVisibility(0);
        }
        User curUser = C20854a.m53167g().getCurUser();
        if (curUser != null && !curUser.getIsCreater() && !this.f105699a) {
            this.f105783Q.setVisibility(8);
        }
        m91691I();
        if (this.f105699a && this.f105783Q != null) {
            this.f105783Q.setVisibility(0);
            C23542f.m57724i().mo48710b("show_insights_red", true);
            C10643a aVar = new C10643a(this);
            if (!C47897fr.m103605d() || !C47897fr.m103602a()) {
                i = R.string.apd;
            } else {
                i = R.string.hmn;
            }
            aVar.mo18885a((int) R.string.apj).mo18899b(i).mo18886a((int) R.string.apf, C41882k.f106030a).mo18897a().mo18882b();
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            User curUser2 = a.getCurUser();
            C52711k.m112236a((Object) curUser2, "AccountUserProxyService.get().curUser");
            Editor edit = C35807d.m80935a(C32463a.m75161a(), "tcm_pro_account", 0).edit();
            StringBuilder sb = new StringBuilder("tcm_first_dot");
            sb.append(curUser2.getUid());
            edit.putBoolean(sb.toString(), true).apply();
            this.f105699a = false;
        }
        if (C23542f.m57724i().mo48705a("show_insights_red", false)) {
            this.f105783Q.mo19038a();
        } else {
            this.f105783Q.mo19039b();
        }
        m91692J();
        if (this.f105700ad == null) {
            this.f105700ad = C41712a.f105567a.itmeListForSetting();
        }
        if (this.f105700ad != null) {
            C41629b.m91504a((ViewGroup) this.f105800e.findViewById(R.id.bga), this.f105700ad);
        }
        mo85688H();
        C47859eq.m103529a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onResume", false);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onEvent(C41596b bVar) {
        m91691I();
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onEvent(C23484c cVar) {
        m91691I();
        m91692J();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f105699a = intent.getBooleanExtra("from_pro_account", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo85629a(C0013i iVar) throws Exception {
        if (iVar.mo26b()) {
            this.f105771E.setRightText("0.0MB");
            C10691a.m21533a((Context) this, (int) R.string.a3a).mo19066a();
        }
        return null;
    }

    public void onClick(View view) {
        super.onClick(view);
        if (view.getId() == R.id.eqs && !C32800a.m75679a(view)) {
            SmartRouter.buildRoute((Context) this, "aweme://proaccount").open();
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onEvent(C20847b bVar) {
        SmartRouter.buildRoute((Context) this, "aweme://main?tab=1").withParam("tab", 1).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME").addFlags(67108864).open();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f105702c = (CommonItemView) findViewById(R.id.eqs);
        this.f105702c.setRightIconRes(0);
        this.f105702c.setOnClickListener(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo85630a(DialogInterface dialogInterface, int i) {
        if (!C41889r.m91838a(this)) {
            C10691a.m21542b((Context) this, (int) R.string.cg1).mo19066a();
            return;
        }
        C18898c.m46009a(this, "log_out_popup", "confirm");
        C26890h.m65011a("log_out", C23089d.m56640a().mo47829a("enter_from", "settings_page").mo47829a("user_id", C20854a.m53167g().getCurUserId()).mo47826a("f_mode", C47915gg.m103651b() ? 1 : 0).f61491a);
        C20854a.m53161a().addLoginOrLogoutListener(this);
        runOnUiThread(new C41853ah(this));
        C20854a.m53162b().logout("user_logout", "user_logout");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 19 && i2 == -1) {
            C23794bh.m58384J().mobUpdateEvent("app_update_click");
        }
    }
}
