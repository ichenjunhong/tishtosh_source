package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.p683ss.android.ugc.aweme.account.base.C20916a;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.digitsverify.SendVerificationCodeActivity;
import com.p683ss.android.ugc.aweme.account.p1307ui.BindMobileActivity;
import com.p683ss.android.ugc.aweme.account.utils.C22298e;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.services.ProAccountService */
public class ProAccountService extends BaseProAccountService {
    public boolean enableNewPhoneBindFlow() {
        return PasswordRevisionUtils.INSTANCE.isNeedBindService();
    }

    public void switchProAccount(int i, String str, String str2, int i2, final C20840g gVar) {
        super.switchProAccount(i, str, str2, i2, gVar);
        C17825i.m43740a(AccountApiInModule.f56869b.switchProAccount(i, str, str2, i2), new C17824h<BaseResponse>() {
            public void onFailure(Throwable th) {
                if (gVar != null) {
                    gVar.onResult(14, 3, null);
                }
            }

            public void onSuccess(BaseResponse baseResponse) {
                if (gVar != null) {
                    if (baseResponse == null || baseResponse.status_code != 0) {
                        gVar.onResult(14, 3, null);
                    } else {
                        gVar.onResult(14, 1, null);
                    }
                }
            }
        }, C20916a.f56902a);
    }

    public void bindProAccountMobile(Activity activity, String str, C20840g gVar, int i, String str2) {
        Intent intent;
        super.bindProAccountMobile(activity, str, gVar, i, str2);
        if (C22298e.m55182a()) {
            intent = new Intent(activity, SendVerificationCodeActivity.class);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra(C21459s.f58200j, str);
                intent.putExtra(C21459s.f58202l, i);
                intent.putExtra(C21459s.f58203m, str2);
            }
        } else {
            intent = new Intent(activity, BindMobileActivity.class);
            if (!TextUtils.isEmpty(str)) {
                intent.putExtra(C21459s.f58200j, str);
            }
            intent.putExtra(C21459s.f58202l, i);
            intent.putExtra(C21459s.f58203m, str2);
        }
        intent.putExtra(C21459s.f58201k, "enter_from_bind_pre_account");
        activity.startActivity(intent);
    }
}
