package com.p683ss.android.ugc.aweme.protection.digitalwellbeing;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.router.SmartRouter;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22711b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.protection.api.services.C40858a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity */
public final class DigitalWellbeingActivity extends AmeBaseActivity implements OnClickListener {

    /* renamed from: a */
    public static final C40874a f104043a = new C40874a(null);

    /* renamed from: b */
    private ButtonTitleBar f104044b;

    /* renamed from: c */
    private CommonItemView f104045c;

    /* renamed from: d */
    private CommonItemView f104046d;

    /* renamed from: e */
    private CommonItemView f104047e;

    /* renamed from: com.ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity$a */
    public static final class C40874a {
        private C40874a() {
        }

        public /* synthetic */ C40874a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity$b */
    static final class C40875b implements OnClickListener {

        /* renamed from: a */
        public static final C40875b f104048a = new C40875b();

        C40875b() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("enter_kid_platform", (Map<String, String>) new HashMap<String,String>());
            if (BusinessComponentServiceUtils.getParentalPlatformService().getRole() == C22687a.PARENT) {
                C41302w.m91042a().mo83861a(BusinessComponentServiceUtils.getParentalPlatformService().getParentScheme());
            } else {
                C41302w.m91042a().mo83861a(BusinessComponentServiceUtils.getParentalPlatformService().getEntranceScheme());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity$c */
    public static final class C40876c implements C10713a {

        /* renamed from: a */
        final /* synthetic */ DigitalWellbeingActivity f104049a;

        /* renamed from: b */
        public final void mo19167b(View view) {
        }

        C40876c(DigitalWellbeingActivity digitalWellbeingActivity) {
            this.f104049a = digitalWellbeingActivity;
        }

        /* renamed from: a */
        public final void mo19166a(View view) {
            this.f104049a.onBackPressed();
        }
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.b7p;
    }

    public final boolean isRegisterEventBus() {
        return true;
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.au2).init();
    }

    public final void onResume() {
        int i;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity", "onResume", true);
        super.onResume();
        if (BusinessComponentServiceUtils.getParentalPlatformService().getRole() == C22687a.CHILD) {
            finish();
        }
        m90430a(false);
        m90432b(false);
        CommonItemView commonItemView = this.f104047e;
        if (commonItemView == null) {
            C52711k.m112237a("mParentModeSetting");
        }
        if (BusinessComponentServiceUtils.getParentalPlatformService().getRole() == C22687a.PARENT) {
            i = R.string.baj;
        } else {
            i = R.string.ciq;
        }
        commonItemView.setRightText(getString(i));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity", "onResume", false);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onEvent(TimeLockUserSetting timeLockUserSetting) {
        int i;
        if (timeLockUserSetting != null && !timeLockUserSetting.isNotifyParentModeOnly()) {
            m90430a(false);
            m90432b(false);
        }
        CommonItemView commonItemView = this.f104047e;
        if (commonItemView == null) {
            C52711k.m112237a("mParentModeSetting");
        }
        if (BusinessComponentServiceUtils.getParentalPlatformService().getRole() == C22687a.PARENT) {
            i = R.string.baj;
        } else {
            i = R.string.ciq;
        }
        commonItemView.setRightText(getString(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m90430a(boolean z) {
        String str;
        int i;
        String str2;
        if (BusinessComponentServiceUtils.getParentalPlatformService().getRole() == C22687a.UNLINK_LOCKED) {
            C41686c pushSettings = BusinessComponentServiceUtils.getParentalPlatformService().getPushSettings();
            if (pushSettings != null) {
                i = pushSettings.f105480W;
            } else {
                i = 0;
            }
            if (i > 0) {
                CommonItemView commonItemView = this.f104045c;
                if (commonItemView == null) {
                    C52711k.m112237a("mTimeLockSetting");
                }
                commonItemView.setRightText(getString(R.string.gcc));
                return;
            }
            CommonItemView commonItemView2 = this.f104045c;
            if (commonItemView2 == null) {
                C52711k.m112237a("mTimeLockSetting");
            }
            C22711b d = C23794bh.m58390d();
            C52711k.m112236a((Object) d, "LegacyServiceUtils.getTimeLockRulerService()");
            if (d.mo47113j()) {
                str2 = getString(R.string.baj);
            } else {
                str2 = getString(R.string.ciq);
            }
            commonItemView2.setRightText(str2);
            if (z) {
                CommonItemView commonItemView3 = this.f104045c;
                if (commonItemView3 == null) {
                    C52711k.m112237a("mTimeLockSetting");
                }
                commonItemView3.setOnClickListener(this);
            }
            return;
        }
        CommonItemView commonItemView4 = this.f104045c;
        if (commonItemView4 == null) {
            C52711k.m112237a("mTimeLockSetting");
        }
        C22711b d2 = C23794bh.m58390d();
        C52711k.m112236a((Object) d2, "LegacyServiceUtils.getTimeLockRulerService()");
        if (d2.mo47111h()) {
            str = getString(R.string.baj);
        } else {
            str = getString(R.string.ciq);
        }
        commonItemView4.setRightText(str);
        if (z) {
            CommonItemView commonItemView5 = this.f104045c;
            if (commonItemView5 == null) {
                C52711k.m112237a("mTimeLockSetting");
            }
            commonItemView5.setOnClickListener(this);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m90432b(boolean r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService r0 = com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils.getParentalPlatformService()
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r0 = r0.getRole()
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r1 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.UNLINK_LOCKED
            r2 = 2132547071(0x7f1c15ff, float:2.0747378E38)
            r3 = 2132545063(0x7f1c0e27, float:2.0743305E38)
            if (r0 != r1) goto L_0x0093
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService r0 = com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils.getParentalPlatformService()
            com.ss.android.ugc.aweme.setting.serverpush.a.c r0 = r0.getPushSettings()
            if (r0 == 0) goto L_0x0037
            int r0 = r0.f105479V
            r1 = 1
            if (r0 != r1) goto L_0x0037
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r6 = r5.f104046d
            if (r6 != 0) goto L_0x002a
            java.lang.String r0 = "mTeenagerModeSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x002a:
            r0 = 2132544524(0x7f1c0c0c, float:2.0742212E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.setRightText(r0)
            return
        L_0x0037:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r5.f104046d
            if (r0 != 0) goto L_0x0040
            java.lang.String r1 = "mTeenagerModeSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0040:
            com.ss.android.ugc.aweme.antiaddic.lock.b r1 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()
            java.lang.String r4 = "LegacyServiceUtils.getTimeLockRulerService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            boolean r1 = r1.mo47114k()
            if (r1 != 0) goto L_0x0078
            com.ss.android.ugc.aweme.app.v r1 = com.p683ss.android.ugc.aweme.app.C23183v.m56778a()
            java.lang.String r4 = "CommonSharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            com.ss.android.ugc.aweme.app.bf r1 = r1.mo47912h()
            java.lang.String r4 = "CommonSharePrefCache.inst().isForceMinor"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.Object r1 = r1.mo47782d()
            java.lang.String r4 = "CommonSharePrefCache.inst().isForceMinor.cache"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0073
            goto L_0x0078
        L_0x0073:
            java.lang.String r1 = r5.getString(r2)
            goto L_0x007c
        L_0x0078:
            java.lang.String r1 = r5.getString(r3)
        L_0x007c:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setRightText(r1)
            if (r6 == 0) goto L_0x0092
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r6 = r5.f104046d
            if (r6 != 0) goto L_0x008c
            java.lang.String r0 = "mTeenagerModeSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x008c:
            r0 = r5
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r6.setOnClickListener(r0)
        L_0x0092:
            return
        L_0x0093:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = r5.f104046d
            if (r0 != 0) goto L_0x009c
            java.lang.String r1 = "mTeenagerModeSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x009c:
            com.ss.android.ugc.aweme.antiaddic.lock.b r1 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()
            java.lang.String r4 = "LegacyServiceUtils.getTimeLockRulerService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r4)
            boolean r1 = r1.mo47105b()
            if (r1 == 0) goto L_0x00b0
            java.lang.String r1 = r5.getString(r3)
            goto L_0x00b4
        L_0x00b0:
            java.lang.String r1 = r5.getString(r2)
        L_0x00b4:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setRightText(r1)
            if (r6 == 0) goto L_0x00ca
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r6 = r5.f104046d
            if (r6 != 0) goto L_0x00c4
            java.lang.String r0 = "mTeenagerModeSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00c4:
            r0 = r5
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r6.setOnClickListener(r0)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity.m90432b(boolean):void");
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.a5w) {
            C26890h.m65011a("enter_time_lock", C23089d.m56640a().f61491a);
            SmartRouter.buildRoute((Context) this, "//settimelock").withParam("SetTimeLockActivityKeyType", 0).withParam("SetTimeLockActivityKeyFromParent", false).open();
            return;
        }
        if (num != null && num.intValue() == R.id.a5v) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            C26890h.m65011a("enter_teen_mode", C23089d.m56640a().mo47829a("enter_from", C40858a.f104020a.getTimeLockHelperEnterFrom()).mo47826a("is_login", g.isLogin() ? 1 : 0).f61491a);
            SmartRouter.buildRoute((Context) this, "//settimelock").withParam("SetTimeLockActivityKeyType", 1).withParam("SetTimeLockActivityKeyFromParent", false).open();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r4)
            r4 = 2132023420(0x7f14187c, float:1.9685287E38)
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r0 = "findViewById(R.id.title_layout)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar r4 = (com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar) r4
            r3.f104044b = r4
            com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar r4 = r3.f104044b
            if (r4 != 0) goto L_0x0024
            java.lang.String r0 = "mTitle"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0024:
            r0 = 2132549021(0x7f1c1d9d, float:2.0751333E38)
            r4.setTitle(r0)
            com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar r4 = r3.f104044b
            if (r4 != 0) goto L_0x0033
            java.lang.String r0 = "mTitle"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0033:
            com.ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity$c r0 = new com.ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity$c
            r0.<init>(r3)
            com.bytedance.ies.dmt.ui.titlebar.a.a r0 = (com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a) r0
            r4.setOnTitleBarClickListener(r0)
            com.ss.android.ugc.aweme.app.v r4 = com.p683ss.android.ugc.aweme.app.C23183v.m56778a()
            java.lang.String r0 = "CommonSharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            com.ss.android.ugc.aweme.app.bf r4 = r4.mo47913i()
            java.lang.String r0 = "CommonSharePrefCache.ins….hadEnterDigitalWellbeing"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.mo47776a(r0)
            r4 = 2132018564(0x7f140584, float:1.9675438E38)
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r0 = "findViewById(R.id.digital_wellbeing_time_lock)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r4
            r3.f104045c = r4
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r3.f104045c
            if (r4 != 0) goto L_0x006f
            java.lang.String r0 = "mTimeLockSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x006f:
            r0 = 2132543829(0x7f1c0955, float:2.0740802E38)
            java.lang.String r0 = r3.getString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setLeftText(r0)
            r4 = 2132018563(0x7f140583, float:1.9675436E38)
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r0 = "findViewById(R.id.digital_wellbeing_teenager_mode)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r4
            r3.f104046d = r4
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r3.f104046d
            if (r4 != 0) goto L_0x0094
            java.lang.String r0 = "mTeenagerModeSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0094:
            r0 = 2132543828(0x7f1c0954, float:2.07408E38)
            java.lang.String r0 = r3.getString(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setLeftText(r0)
            r3.m90430a(r2)
            r3.m90432b(r2)
            r4 = 2132018562(0x7f140582, float:1.9675434E38)
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r0 = "findViewById(R.id.digital_wellbeing_parent_mode)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = (com.bytedance.ies.dmt.p664ui.common.views.CommonItemView) r4
            r3.f104047e = r4
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService r4 = com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils.getParentalPlatformService()
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r4 = r4.getRole()
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r0 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.CLOSE
            r1 = 0
            if (r4 == r0) goto L_0x0177
            boolean r4 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r4 != 0) goto L_0x0177
            com.ss.android.ugc.aweme.app.v r4 = com.p683ss.android.ugc.aweme.app.C23183v.m56778a()
            java.lang.String r0 = "CommonSharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            com.ss.android.ugc.aweme.app.bf r4 = r4.mo47912h()
            java.lang.String r0 = "CommonSharePrefCache.inst().isForceMinor"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            java.lang.Object r4 = r4.mo47782d()
            java.lang.String r0 = "CommonSharePrefCache.inst().isForceMinor.cache"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x00ee
            goto L_0x0177
        L_0x00ee:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r3.f104047e
            if (r4 != 0) goto L_0x00f7
            java.lang.String r0 = "mParentModeSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00f7:
            r4.setVisibility(r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r3.f104047e
            if (r4 != 0) goto L_0x0103
            java.lang.String r0 = "mParentModeSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0103:
            java.lang.Class<com.ss.android.ugc.aweme.ao> r0 = com.p683ss.android.ugc.aweme.C22783ao.class
            java.lang.Object r0 = com.p683ss.android.ugc.C27991b.m66756a(r0)
            if (r0 == 0) goto L_0x010e
            com.ss.android.ugc.aweme.ao r0 = (com.p683ss.android.ugc.aweme.C22783ao) r0
            goto L_0x0127
        L_0x010e:
            java.lang.Class<com.ss.android.ugc.aweme.ao> r0 = com.p683ss.android.ugc.aweme.C22783ao.class
            com.ss.android.ugc.a.a r0 = com.p683ss.android.ugc.p1235a.C20302a.m50070a(r0)
            com.ss.android.ugc.a.d r2 = new com.ss.android.ugc.a.d
            r2.<init>()
            com.ss.android.ugc.a.a r0 = r0.mo42947a(r2)
            com.ss.android.ugc.a.a r0 = r0.mo42946a()
            java.lang.Object r0 = r0.mo42948b()
            com.ss.android.ugc.aweme.ao r0 = (com.p683ss.android.ugc.aweme.C22783ao) r0
        L_0x0127:
            com.ss.android.ugc.aweme.ao r0 = (com.p683ss.android.ugc.aweme.C22783ao) r0
            java.lang.String r0 = r0.mo47258s()
            if (r0 != 0) goto L_0x013b
            r0 = 2132548898(0x7f1c1d22, float:2.0751083E38)
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r2 = "getString(R.string.setti…_family_mode_option_name)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
        L_0x013b:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setLeftText(r0)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r3.f104047e
            if (r4 != 0) goto L_0x0149
            java.lang.String r0 = "mParentModeSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0149:
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService r0 = com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils.getParentalPlatformService()
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r0 = r0.getRole()
            com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a r2 = com.p683ss.android.ugc.aweme.antiaddic.IParentalPlatformService.C22687a.NONE
            if (r0 == r2) goto L_0x015d
            r0 = 2132545063(0x7f1c0e27, float:2.0743305E38)
        L_0x0158:
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0161
        L_0x015d:
            r0 = 2132547071(0x7f1c15ff, float:2.0747378E38)
            goto L_0x0158
        L_0x0161:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setRightText(r0)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r3.f104047e
            if (r4 != 0) goto L_0x016f
            java.lang.String r0 = "mParentModeSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x016f:
            com.ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity$b r0 = com.p683ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity.C40875b.f104048a
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r4.setOnClickListener(r0)
            goto L_0x0185
        L_0x0177:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r3.f104047e
            if (r4 != 0) goto L_0x0180
            java.lang.String r0 = "mParentModeSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0180:
            r0 = 8
            r4.setVisibility(r0)
        L_0x0185:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r3.f104047e
            if (r4 != 0) goto L_0x018e
            java.lang.String r0 = "mParentModeSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x018e:
            r4.setRightIconRes(r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r3.f104046d
            if (r4 != 0) goto L_0x019a
            java.lang.String r0 = "mTeenagerModeSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x019a:
            r4.setRightIconRes(r1)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = r3.f104045c
            if (r4 != 0) goto L_0x01a6
            java.lang.String r0 = "mTimeLockSetting"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x01a6:
            r4.setRightIconRes(r1)
            java.lang.String r4 = "com.ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity"
            java.lang.String r0 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.digitalwellbeing.DigitalWellbeingActivity.onCreate(android.os.Bundle):void");
    }
}
