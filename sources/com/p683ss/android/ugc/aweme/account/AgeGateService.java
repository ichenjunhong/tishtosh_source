package com.p683ss.android.ugc.aweme.account;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Intent;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.keva.Keva;
import com.p683ss.android.sdk.p1207a.C19718b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.C22543ah;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.IAgeGateService;
import com.p683ss.android.ugc.aweme.account.agegate.C20884b;
import com.p683ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity;
import com.p683ss.android.ugc.aweme.account.agegate.activity.DeleteVideoAlertActivity;
import com.p683ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p683ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.SignUpOrLoginActivity;
import com.p683ss.android.ugc.aweme.account.model.CachedUserAgeInfo;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.account.util.C22288y;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;

/* renamed from: com.ss.android.ugc.aweme.account.AgeGateService */
public class AgeGateService implements C0183j, IAgeGateService {
    public static boolean showingAccountDelete;
    private boolean mKeepCallback;
    private C0184k mOwner;
    private C22543ah mResultListener;

    public IAgeGateService keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    public void notifyFinish() {
        if (this.mResultListener != null) {
            this.mResultListener.mo44969a();
            this.mResultListener = null;
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        if (this.mOwner != null) {
            this.mOwner.getLifecycle().mo325b(this);
        }
        this.mResultListener = null;
    }

    public static IAgeGateService createIAgeGateServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IAgeGateService.class);
        if (a != null) {
            return (IAgeGateService) a;
        }
        if (C27991b.f73504bh == null) {
            synchronized (IAgeGateService.class) {
                if (C27991b.f73504bh == null) {
                    C27991b.f73504bh = new AgeGateService();
                }
            }
        }
        return (AgeGateService) C27991b.f73504bh;
    }

    public void syncAgeGateInfo() {
        if (C32816h.m75716b().getEnableNewUserInfoSync().booleanValue()) {
            CachedUserAgeInfo b = C22288y.m55175b();
            if (C23826bi.m58466g() && b != null) {
                C22288y.m55170a(b.getBirthday(), b.getUserMode(), true);
            }
        }
    }

    public void showAccountDeletedByAgeGatePage(Activity activity) {
        if (!(C11016e.m22312g() instanceof AccountDeletedActivity) && !showingAccountDelete) {
            showingAccountDelete = true;
            activity.startActivity(new Intent(activity, AccountDeletedActivity.class));
        }
    }

    public boolean showFTCAgeGateForCurrentUser(Activity activity, C22543ah ahVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.mOwner != null) {
            this.mOwner.getLifecycle().mo325b(this);
            this.mOwner = null;
            this.mResultListener = null;
        }
        this.mResultListener = ahVar;
        if (!this.mKeepCallback && (activity instanceof C0184k)) {
            this.mOwner = (C0184k) activity;
            this.mOwner.getLifecycle().mo324a(this);
        }
        this.mKeepCallback = false;
        if (C20884b.f56852c || activity == null) {
            return false;
        }
        Intent intent = new Intent(activity, MusLoginActivity.class);
        intent.putExtra("is_trans_login_user", true);
        if ((!C23826bi.m58449a().isLogin() || C19718b.m48210a().mo41123a("facebook") || C19718b.m48210a().mo41123a("google") || i != 1) && i != 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", true);
            intent = new Intent(activity, SignUpOrLoginActivity.class);
            intent.putExtra("is_trans_login_user", true);
            intent.putExtra("next_page", C21850i.AGE_GATE.getValue());
            intent.putExtra("age_gate_action", i);
            intent.putExtra("enter_type", "click_login");
        } else {
            IAccountUserService a = C23826bi.m58449a();
            if (!a.isLogin() || a.getCurUser().getUserMode() != 2 || !C22282t.m55151f().getBoolean("ftc_create_account_showing", false)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                intent.putExtra("init_page", 5);
                intent.putExtra("enter_type", "click_sign_up");
            } else {
                IAccountUserService a2 = C23826bi.m58449a();
                if (!a2.isLogin() || a2.getCurUser().getUserMode() != 2 || !C22282t.m55151f().getBoolean("ftc_create_password_showing", false)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    intent.putExtra("init_page", 6);
                    intent.putExtra("enter_type", "click_sign_up");
                } else if (!C22282t.m55151f().getBoolean("ftc_delete_video_alert_showing", false)) {
                    return false;
                } else {
                    Intent intent2 = new Intent(activity, DeleteVideoAlertActivity.class);
                    AgeGateResponse ageGateResponse = new AgeGateResponse(0, "", C22282t.m55151f().getBoolean("ftc_age_gate_response_prompt", true), 0, C22282t.m55143b());
                    intent2.putExtra("age_gate_response", ageGateResponse);
                    activity.startActivity(intent2);
                    return true;
                }
            }
        }
        C20884b.f56852c = true;
        activity.startActivity(intent);
        return true;
    }
}
