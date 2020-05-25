package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.C23857bl;
import com.p683ss.android.ugc.aweme.IAccountService.C20836c;
import com.p683ss.android.ugc.aweme.account.base.p1268a.C20917a;
import com.p683ss.android.ugc.aweme.account.bean.C20938e;
import com.p683ss.android.ugc.aweme.account.login.C21053aa;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.MusCountryListActivity;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.C21674q;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.SignUpOrLoginActivity;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.util.ThirdLoginSetting;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.account.utils.C22300g;
import com.p683ss.android.ugc.aweme.account.utils.C22301h;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.service.C36691l;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.services.LoginService */
public class LoginService extends BaseLoginService {
    private Dialog mLoginDialog;

    /* renamed from: com.ss.android.ugc.aweme.services.LoginService$_lancet */
    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(Dialog dialog) {
            dialog.dismiss();
        }
    }

    public void loginByTicket(String str, Activity activity, Handler handler) {
    }

    public void saveDTicket(String str) {
    }

    public void showLoginDeviceManagerPage(Activity activity) {
    }

    public void storeLastLoginInfo(String str, User user) {
    }

    public List<C20938e> getAllSupportedLoginPlatform() {
        LinkedList linkedList = new LinkedList(super.getAllSupportedLoginPlatform());
        linkedList.add(new C20938e("Email", 2131951970, "email"));
        linkedList.addAll(C22301h.m55190a(C22301h.m55191a()));
        return linkedList;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.mLoginDialog != null) {
            _lancet.com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(this.mLoginDialog);
            this.mLoginDialog = null;
        }
        if (this.mLoginDialog != null && this.mLoginDialog.isShowing()) {
            _lancet.com_ss_android_ugc_aweme_lancet_DebugCheckLancet_dialogDismiss(this.mLoginDialog);
            this.mLoginDialog = null;
        }
    }

    public boolean isLoginActivity(Activity activity) {
        return activity instanceof MusLoginActivity;
    }

    public void openPrivacyPolicy(Activity activity) {
        C47700ay.m103235a(C20917a.m53263b(activity));
    }

    public void openTermsOfUseProtocol(Activity activity) {
        C47700ay.m103235a(C20917a.m53262a(activity));
    }

    public void showLoginAndRegisterView(C20836c cVar) {
        super.showLoginAndRegisterView(cVar);
        C21635v.f58646a = cVar.f56772d.getString("enter_method", "");
        C21635v.f58647b = cVar.f56772d.getString("enter_from", "");
        Serializable serializable = cVar.f56772d.getSerializable("extra_param");
        if (serializable == null) {
            serializable = new HashMap();
            cVar.f56772d.putSerializable("extra_param", serializable);
        }
        ((Map) serializable).put("params_for_special", "uc_login");
        boolean z = cVar.f56772d.getBoolean("force_use_default_login_method", false);
        C21518u.m54169a().mo30c(new LoginService$$Lambda$0(this, cVar, z, serializable), C0013i.f25b).mo19a((C0011g<TResult, TContinuationResult>) new LoginService$$Lambda$1<TResult,TContinuationResult>(this, z, cVar));
    }

    public void showLoginView(C20836c cVar) {
        super.showLoginView(cVar);
        C26890h.m65011a("click_login", C20856a.m53173a().mo44776a("enter_method", C21635v.f58646a).f56798a);
        C36691l lVar = (C36691l) C23826bi.m58450a(C36691l.class);
        if (lVar != null) {
            lVar.mo47884a("click_login");
            lVar.mo47885b("LOGIN");
        }
        Intent a = SignUpOrLoginActivity.m54539a((Context) cVar.f56769a);
        if (TextUtils.isEmpty(cVar.f56772d.getString("enter_type"))) {
            cVar.f56772d.putString("enter_type", "click_login");
        }
        a.putExtras(cVar.f56772d);
        cVar.f56769a.startActivity(a);
    }

    public void openCountryListActivity(Activity activity, C23857bl blVar) {
        Intent intent = new Intent(activity, MusCountryListActivity.class);
        MusCountryListActivity.f58396d = blVar;
        activity.startActivity(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r0.equals("email") == false) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loginByPlatform(com.p683ss.android.ugc.aweme.IAccountService.C20836c r6, com.p683ss.android.ugc.aweme.account.bean.C20938e r7) {
        /*
            r5 = this;
            super.loginByPlatform(r6, r7)
            android.os.Bundle r0 = r6.f56772d
            java.lang.String r1 = "is_login"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L_0x0032
            r0 = 0
            java.lang.String r1 = r7.f56971c
            java.lang.String r2 = "mobile"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName.PHONE_SMS
            goto L_0x0028
        L_0x001c:
            java.lang.String r7 = r7.f56971c
            java.lang.String r1 = "email"
            boolean r7 = android.text.TextUtils.equals(r7, r1)
            if (r7 == 0) goto L_0x0028
            com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName.EMAIL_PASS
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            android.app.Activity r7 = r6.f56769a
            android.os.Bundle r6 = r6.f56772d
            r5.loginByMethod(r7, r6, r0)
        L_0x0031:
            return
        L_0x0032:
            java.lang.String r0 = r7.f56971c
            r1 = -1
            int r3 = r0.hashCode()
            r4 = -1068855134(0xffffffffc04a90a2, float:-3.1650777)
            if (r3 == r4) goto L_0x004d
            r4 = 96619420(0x5c24b9c, float:1.8271447E-35)
            if (r3 == r4) goto L_0x0044
            goto L_0x0057
        L_0x0044:
            java.lang.String r3 = "email"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0057
            goto L_0x0058
        L_0x004d:
            java.lang.String r2 = "mobile"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0057
            r2 = 0
            goto L_0x0058
        L_0x0057:
            r2 = -1
        L_0x0058:
            switch(r2) {
                case 0: goto L_0x0073;
                case 1: goto L_0x0073;
                default: goto L_0x005b;
            }
        L_0x005b:
            android.os.Bundle r0 = r6.f56772d
            java.lang.String r1 = "enter_type"
            java.lang.String r0 = r0.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00b8
            android.os.Bundle r0 = r6.f56772d
            java.lang.String r1 = "enter_type"
            java.lang.String r2 = "click_login"
            r0.putString(r1, r2)
            goto L_0x00b8
        L_0x0073:
            android.app.Activity r0 = r6.f56769a
            android.content.Intent r0 = com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.SignUpOrLoginActivity.C21859a.m54544a(r0)
            java.lang.String r1 = "child_page"
            java.lang.String r7 = r7.f56971c
            java.lang.String r2 = "mobile"
            boolean r7 = android.text.TextUtils.equals(r7, r2)
            if (r7 == 0) goto L_0x008c
            com.ss.android.ugc.aweme.account.login.v2.base.i r7 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.INPUT_PHONE_SIGN_UP
        L_0x0087:
            int r7 = r7.getValue()
            goto L_0x008f
        L_0x008c:
            com.ss.android.ugc.aweme.account.login.v2.base.i r7 = com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i.INPUT_EMAIL_SIGN_UP
            goto L_0x0087
        L_0x008f:
            r0.putExtra(r1, r7)
            android.os.Bundle r7 = r6.f56772d
            if (r7 == 0) goto L_0x00b2
            android.os.Bundle r7 = r6.f56772d
            java.lang.String r1 = "enter_type"
            java.lang.String r7 = r7.getString(r1)
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x00ad
            android.os.Bundle r7 = r6.f56772d
            java.lang.String r1 = "enter_type"
            java.lang.String r2 = "click_login"
            r7.putString(r1, r2)
        L_0x00ad:
            android.os.Bundle r7 = r6.f56772d
            r0.putExtras(r7)
        L_0x00b2:
            android.app.Activity r6 = r6.f56769a
            r6.startActivity(r0)
            return
        L_0x00b8:
            android.app.Activity r0 = r6.f56769a
            java.lang.String r7 = r7.f56971c
            android.os.Bundle r6 = r6.f56772d
            java.lang.String r1 = com.p683ss.android.ugc.aweme.account.login.C21635v.f58646a
            java.lang.String r2 = com.p683ss.android.ugc.aweme.account.login.C21635v.f58647b
            com.p683ss.android.ugc.aweme.account.login.p1291ui.ThirdPartyLoginView.m54220a(r0, r7, r6, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.services.LoginService.loginByPlatform(com.ss.android.ugc.aweme.IAccountService$c, com.ss.android.ugc.aweme.account.bean.e):void");
    }

    public void openFeedback(Activity activity, String str, String str2) {
        C22300g.m55188a(activity, str, str2);
    }

    private boolean loginByMethod(Activity activity, Bundle bundle, LoginMethodName loginMethodName) {
        switch (loginMethodName) {
            case PHONE_NUMBER_PASS:
            case PHONE_SMS:
                Intent a = SignUpOrLoginActivity.m54539a((Context) activity);
                a.putExtra("child_page", C21850i.INPUT_PHONE_LOGIN.getValue());
                if (TextUtils.isEmpty(bundle.getString("enter_type"))) {
                    bundle.putString("enter_type", "click_login");
                }
                a.putExtras(bundle);
                activity.startActivity(a);
                return true;
            case EMAIL_PASS:
            case USER_NAME_PASS:
                Intent a2 = SignUpOrLoginActivity.m54539a((Context) activity);
                a2.putExtra("child_page", C21850i.INPUT_EMAIL_LOGIN.getValue());
                if (TextUtils.isEmpty(bundle.getString("enter_type"))) {
                    bundle.putString("enter_type", "click_login");
                }
                a2.putExtras(bundle);
                activity.startActivity(a2);
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00df, code lost:
        r12.f56772d.putBoolean("from_last_login", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e6, code lost:
        r2 = loginByMethod(r12.f56769a, r12.f56772d, r13);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Void lambda$showLoginAndRegisterView$1$LoginService(boolean r11, com.p683ss.android.ugc.aweme.IAccountService.C20836c r12, p001a.C0013i r13) throws java.lang.Exception {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0008
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r11 = new com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod
            r11.<init>()
            goto L_0x000c
        L_0x0008:
            com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod r11 = com.p683ss.android.ugc.aweme.account.login.C21518u.m54175b()
        L_0x000c:
            android.app.Activity r13 = r12.f56769a
            r0 = 0
            if (r13 == 0) goto L_0x0111
            android.app.Activity r13 = r12.f56769a
            boolean r13 = r13.isFinishing()
            if (r13 != 0) goto L_0x0111
            com.ss.android.ugc.aweme.account.login.model.LoginMethodName r13 = r11.getLoginMethodName()
            java.lang.String r1 = r12.f56770b
            com.ss.android.ugc.aweme.account.login.model.LoginMethodName r2 = com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName.DEFAULT
            if (r13 == r2) goto L_0x0026
            java.lang.String r2 = "last login"
            goto L_0x0028
        L_0x0026:
            java.lang.String r2 = "normal login"
        L_0x0028:
            com.p683ss.android.ugc.aweme.account.p1277j.C20994a.m53362a(r1, r2)
            com.ss.android.ugc.aweme.account.login.model.LoginMethodName r1 = com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName.THIRD_PARTY
            r2 = 1
            r3 = 0
            if (r13 != r1) goto L_0x00c6
            com.ss.android.ugc.aweme.account.login.model.TPLoginMethod r11 = (com.p683ss.android.ugc.aweme.account.login.model.TPLoginMethod) r11
            com.bytedance.ies.abmock.n r4 = com.bytedance.ies.abmock.C10193n.m20607a()     // Catch:{ Throwable -> 0x0052 }
            java.lang.Class<com.ss.android.ugc.aweme.account.login.InsRecoverUrl> r5 = com.p683ss.android.ugc.aweme.account.login.InsRecoverUrl.class
            java.lang.String r6 = "ins_recover_account_url"
            com.bytedance.ies.abmock.b r13 = com.bytedance.ies.abmock.C10181b.m20511a()     // Catch:{ Throwable -> 0x0052 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r13 = r13.mo18175c()     // Catch:{ Throwable -> 0x0052 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_account_login_InsRecoverSetting r7 = r13.getInsRecoverAccountUrl()     // Catch:{ Throwable -> 0x0052 }
            java.lang.String r8 = "com.ss.android.ugc.aweme.account.login.InsRecoverSetting"
            java.lang.Class<com.ss.android.ugc.aweme.account.login.InsRecoverSetting> r9 = com.p683ss.android.ugc.aweme.account.login.InsRecoverSetting.class
            java.lang.Object r13 = r4.mo18202a(r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0052 }
            com.ss.android.ugc.aweme.account.login.InsRecoverSetting r13 = (com.p683ss.android.ugc.aweme.account.login.InsRecoverSetting) r13     // Catch:{ Throwable -> 0x0052 }
            goto L_0x0053
        L_0x0052:
            r13 = r0
        L_0x0053:
            if (r13 == 0) goto L_0x006b
            boolean r13 = r13.getForbid()
            if (r13 == 0) goto L_0x006b
            java.lang.String r13 = "instagram"
            java.lang.String r1 = r11.getPlatform()
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x0068
            goto L_0x006b
        L_0x0068:
            r2 = 0
            goto L_0x00ee
        L_0x006b:
            android.os.Bundle r13 = r12.f56772d
            java.lang.String r1 = "bundle_login_method"
            r13.putParcelable(r1, r11)
            android.os.Bundle r13 = r12.f56772d
            java.lang.String r1 = "enter_type"
            java.lang.String r13 = r13.getString(r1)
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x0089
            android.os.Bundle r13 = r12.f56772d
            java.lang.String r1 = "enter_type"
            java.lang.String r4 = "click_login"
            r13.putString(r1, r4)
        L_0x0089:
            android.app.Activity r13 = r12.f56769a
            android.os.Bundle r1 = r12.f56772d
            java.lang.String r4 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r4)
            java.lang.String r4 = "data"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)
            java.lang.String r4 = "loginMethod"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r4)
            com.ss.android.ugc.aweme.account.login.ag r4 = new com.ss.android.ugc.aweme.account.login.ag
            r4.<init>(r13, r1, r11)
            android.view.Window r11 = r4.getWindow()
            if (r11 == 0) goto L_0x00be
            android.view.WindowManager$LayoutParams r13 = r11.getAttributes()
            r1 = 80
            r13.gravity = r1
            int r1 = r13.flags
            r1 = r1 | 2
            r13.flags = r1
            r11.setAttributes(r13)
            r13 = 2132607682(0x7f1d02c2, float:2.0870311E38)
            r11.setWindowAnimations(r13)
        L_0x00be:
            r4.show()
            android.app.Dialog r4 = (android.app.Dialog) r4
            r10.mLoginDialog = r4
            goto L_0x00ee
        L_0x00c6:
            int[] r1 = com.p683ss.android.ugc.aweme.services.LoginService.C414981.f105158x974b3082
            int r4 = r13.ordinal()
            r1 = r1[r4]
            switch(r1) {
                case 1: goto L_0x00d2;
                case 2: goto L_0x00d2;
                case 3: goto L_0x00df;
                case 4: goto L_0x00df;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            goto L_0x00e6
        L_0x00d2:
            android.os.Bundle r1 = r12.f56772d
            java.lang.String r4 = "phone_number"
            com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod r11 = (com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod) r11
            com.ss.android.ugc.aweme.account.login.d.a$a r11 = r11.getPhoneNumber()
            r1.putSerializable(r4, r11)
        L_0x00df:
            android.os.Bundle r11 = r12.f56772d
            java.lang.String r1 = "from_last_login"
            r11.putBoolean(r1, r2)
        L_0x00e6:
            android.app.Activity r11 = r12.f56769a
            android.os.Bundle r1 = r12.f56772d
            boolean r2 = r10.loginByMethod(r11, r1, r13)
        L_0x00ee:
            if (r2 != 0) goto L_0x0111
            android.app.Activity r11 = r12.f56769a
            android.os.Bundle r12 = r12.f56772d
            java.lang.String r13 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r13)
            android.content.Intent r13 = new android.content.Intent
            r1 = r11
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.account.login.I18nSignUpActivity> r2 = com.p683ss.android.ugc.aweme.account.login.I18nSignUpActivity.class
            r13.<init>(r1, r2)
            java.lang.String r1 = "sign_up_data"
            r13.putExtra(r1, r12)
            r11.startActivity(r13)
            r12 = 2131034133(0x7f050015, float:1.7678775E38)
            r11.overridePendingTransition(r12, r3)
        L_0x0111:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.services.LoginService.lambda$showLoginAndRegisterView$1$LoginService(boolean, com.ss.android.ugc.aweme.IAccountService$c, a.i):java.lang.Void");
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ List lambda$showLoginAndRegisterView$0$LoginService(C20836c cVar, boolean z, Serializable serializable, C0013i iVar) throws Exception {
        boolean z2;
        boolean z3;
        String str;
        int i;
        String str2;
        int i2;
        int i3;
        if (!cVar.f56772d.getBoolean("from_third_party_login")) {
            LoginMethodName loginMethodName = C21518u.m54175b().getLoginMethodName();
            if (loginMethodName == LoginMethodName.DEFAULT) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || z) {
                z3 = true;
            } else {
                z3 = false;
            }
            C20856a a = C20856a.m53173a().mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).mo44774a("_perf_monitor", 1);
            String str3 = "enter_type";
            if (!z3) {
                str = "click_login";
            } else {
                str = "click_sign_up";
            }
            C20856a a2 = a.mo44776a(str3, str);
            String str4 = "google_status";
            if (cVar.f56769a != null) {
                i = C22299f.m55186b(cVar.f56769a);
            } else {
                i = -1;
            }
            C20856a a3 = a2.mo44774a(str4, i);
            String str5 = "platform";
            if (z2) {
                str2 = platform(loginMethodName);
            } else {
                str2 = "";
            }
            C20856a a4 = a3.mo44776a(str5, str2);
            if (z3) {
                C21053aa[] a5 = C22301h.m55192a(true);
                ThirdLoginSetting thirdLoginSetting = (ThirdLoginSetting) C23859b.m58575b().mo49459a((Context) C23826bi.m58460b(), "i18n_third_login_strategy", ThirdLoginSetting.class);
                if (thirdLoginSetting != null) {
                    i2 = thirdLoginSetting.getDirectShowNumber();
                } else {
                    i2 = 3;
                }
                for (int i4 = 0; i4 < a5.length; i4++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(a5[i4].name().toLowerCase());
                    sb.append("_is_show");
                    String sb2 = sb.toString();
                    if (i4 < i2) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    a4.mo44774a(sb2, i3);
                }
                a4.mo44774a("phone_email_show", 1);
            }
            C21674q.m54386a(a4, (Map) serializable);
            C26890h.m65011a("login_notify", a4.f56798a);
        }
        return (List) iVar.mo34e();
    }
}
