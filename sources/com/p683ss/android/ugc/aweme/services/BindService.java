package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.C23786bf;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.C23855bk;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.CommonFlowActivity;
import com.p683ss.android.ugc.aweme.account.p1307ui.BindMobileActivity;
import com.p683ss.android.ugc.aweme.account.p1307ui.BindOrModifyPhoneActivity;
import com.p683ss.android.ugc.aweme.account.p1307ui.MModifyMobileActivity;
import com.p683ss.android.ugc.aweme.account.p1307ui.TModifyMobileActivity;
import com.p683ss.android.ugc.aweme.account.util.C22263e;
import com.p683ss.android.ugc.aweme.account.utils.C22298e;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.main.service.C36692m;
import com.p683ss.android.ugc.aweme.settings.PhoneBindFlowSettings;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.BindService */
public class BindService extends BaseBindService {
    public static String FROM_PROACCOUNT = "from_ProAccount";
    private C23786bf mVerificationService;

    public Fragment createLiveBindPhoneFragment(C20840g gVar) {
        return null;
    }

    public void setAuthorzieBindResult(C23855bk bkVar) {
    }

    public void showThirdPartyAccountManagerActivity(Activity activity) {
    }

    public C23786bf getVerificationService() {
        if (this.mVerificationService == null) {
            this.mVerificationService = new VerificationService();
        }
        return this.mVerificationService;
    }

    public boolean enableNewPhoneBindFlow() {
        return C10193n.m20607a().mo18204a(PhoneBindFlowSettings.class, "enable_new_phone_bind_flow", C10181b.m20511a().mo18175c().getEnableNewPhoneBindFlow(), true);
    }

    /* access modifiers changed from: 0000 */
    public C18922i getEmailUrl() {
        C18922i iVar = new C18922i("https://www.tiktok.com/passport/email/email_bind_index/");
        iVar.mo38778a("lang", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage());
        iVar.mo38776a("aid", (int) C23018b.f61359a);
        iVar.mo38778a("locale", ((C36692m) C23826bi.m58450a(C36692m.class)).mo47886a());
        return iVar;
    }

    public void bindEmail(Activity activity, String str, Bundle bundle, C20840g gVar) {
        super.bindEmail(activity, str, bundle, gVar);
        if (EmailRevisionUtils.INSTANCE.isBindEmailNewStyle()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("enter_from", str);
            CommonFlowActivity.f59096f.mo45958a(activity, C21850i.INPUT_EMAIL_BIND, C21848h.BIND_EMAIL, bundle2, gVar);
            return;
        }
        if (!bundle.getBoolean("do_not_use_old_style")) {
            StringBuilder sb = new StringBuilder();
            sb.append(getEmailUrl().mo38774a());
            sb.append("#bind-email");
            C22263e.m55109a(activity, sb.toString(), true);
        }
    }

    public void changeEmail(Activity activity, String str, Bundle bundle, C20840g gVar) {
        super.changeEmail(activity, str, bundle, gVar);
        if (EmailRevisionUtils.INSTANCE.isChangeEmailNewStyle()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("enter_from", str);
            C21839d.m54505a(bundle2, C23826bi.m58468i().getEmail());
            CommonFlowActivity.f59096f.mo45958a(activity, C21850i.VERIFY_EMAIL_BEFORE_CHANGE, C21848h.CHANGE_EMAIL, bundle2, gVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getEmailUrl().mo38774a());
        sb.append("#change-email");
        C22263e.m55109a(activity, sb.toString(), true);
    }

    public void modifyMobile(Activity activity, String str, Bundle bundle, C20840g gVar) {
        Intent intent;
        Class cls;
        super.modifyMobile(activity, str, bundle, gVar);
        if (C10193n.m20607a().mo18204a(PhoneBindFlowSettings.class, "enable_new_phone_bind_flow", C10181b.m20511a().mo18175c().getEnableNewPhoneBindFlow(), true)) {
            C52711k.m112240b(activity, "context");
            intent = new Intent(activity, BindOrModifyPhoneActivity.class).putExtra("current_scene", C21848h.MODIFY_PHONE.getValue()).putExtra("next_page", C21850i.PHONE_SMS_VERIFY.getValue()).putExtra("enter_method", "change_bind_phone_click");
            C52711k.m112236a((Object) intent, "Intent(context, BindOrMo… CHANGE_BIND_PHONE_CLICK)");
        } else {
            if (C22298e.m55182a()) {
                cls = MModifyMobileActivity.class;
            } else {
                cls = TModifyMobileActivity.class;
            }
            intent = new Intent(activity, cls);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ENTER_REASON", str);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }

    public void verifyEmail(Activity activity, String str, Bundle bundle, C20840g gVar) {
        super.verifyEmail(activity, str, bundle, gVar);
        if (EmailRevisionUtils.INSTANCE.isChangeEmailNewStyle()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("enter_from", str);
            C21839d.m54505a(bundle2, C23826bi.m58468i().getEmail());
            CommonFlowActivity.f59096f.mo45958a(activity, C21850i.CONFIRM_EMAIL_BEFORE_VERIFY, C21848h.VERIFY, bundle2, gVar);
            return;
        }
        C18922i emailUrl = getEmailUrl();
        emailUrl.mo38778a("email", C23826bi.m58468i().getEmail());
        if (bundle.getBoolean(FROM_PROACCOUNT, false)) {
            emailUrl.mo38778a("enterfrom", "switchtoproaccount");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(emailUrl.mo38774a());
        sb.append("#verify-email");
        C22263e.m55109a(activity, sb.toString(), true);
    }

    public void bindMobile(Activity activity, String str, Bundle bundle, C20840g gVar) {
        Intent intent;
        super.bindMobile(activity, str, bundle, gVar);
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i = bundle.getInt("current_scene", -1);
        if (i != -1) {
            bundle.putInt("last_scene", i);
            bundle.remove("current_scene");
            bundle.remove("next_page");
            bundle.remove("current_page");
        }
        if (C10193n.m20607a().mo18204a(PhoneBindFlowSettings.class, "enable_new_phone_bind_flow", C10181b.m20511a().mo18175c().getEnableNewPhoneBindFlow(), true)) {
            C52711k.m112240b(activity, "context");
            intent = new Intent(activity, BindOrModifyPhoneActivity.class).putExtra("current_scene", C21848h.BIND_PHONE.getValue()).putExtra("next_page", C21850i.INPUT_PHONE_BIND.getValue()).putExtra("enter_method", "first_bind_phone_click");
            C52711k.m112236a((Object) intent, "Intent(context, BindOrMo…, FIRST_BIND_PHONE_CLICK)");
        } else {
            intent = new Intent(activity, BindMobileActivity.class);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ENTER_REASON", str);
        }
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }
}
