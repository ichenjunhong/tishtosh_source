package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.C27983t;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21839d;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.CommonFlowActivity;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.SignUpOrLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity;
import com.p683ss.android.ugc.aweme.account.p1307ui.UpdatePasswordActivity;
import com.p683ss.android.ugc.aweme.account.utils.C22298e;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.PasswordService */
public class PasswordService extends BasePasswordService {
    public static String FROM_CHANGE_PWD = "from_changePwd";
    private static String HAVE_SET_PWD = "have_set_password";

    private void changePasswordForChildren(Activity activity) {
        Intent intent = new Intent(activity, MusLoginActivity.class);
        intent.putExtra("init_page", 2);
        activity.startActivity(intent);
    }

    private void changePasswordForOldStyle(Activity activity, Bundle bundle, C20840g gVar) {
        if (C22298e.m55183b()) {
            activity.startActivity(new Intent(activity, UpdatePasswordActivity.class));
            return;
        }
        Intent intent = new Intent(activity, MusLoginActivity.class);
        intent.putExtra("init_page", 2);
        activity.startActivity(intent);
    }

    public void setPassword(Activity activity, Bundle bundle, C20840g gVar) {
        Intent intent;
        super.setPassword(activity, bundle, gVar);
        if ((activity instanceof SignUpOrLoginActivity) || (activity instanceof RecoverAccountActivity)) {
            intent = new Intent(activity, SignUpOrLoginActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra("next_page", C21850i.CREATE_PASSWORD_FOR_PHONE.getValue());
        } else {
            intent = new Intent(activity, MusLoginActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra("init_page", 3);
        }
        activity.startActivity(intent);
    }

    public void changePassword(Activity activity, String str, String str2, Bundle bundle, C20840g gVar) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        if (!C23826bi.m58449a().isChildrenMode()) {
            User i = C23826bi.m58468i();
            if (i != null) {
                bundle2.putBoolean(FROM_CHANGE_PWD, true);
                String bindPhone = i.getBindPhone();
                if (TextUtils.isEmpty(bindPhone)) {
                    String email = i.getEmail();
                    if (!TextUtils.isEmpty(email)) {
                        if (i.isEmailVerified()) {
                            if (PasswordRevisionUtils.INSTANCE.isDirectlyChangePwdForEmail()) {
                                C21839d.m54505a(bundle2, email);
                                CommonFlowActivity.f59096f.mo45958a(activity, C21850i.EMAIL_SMS_CHANGE_PASSWORD, C21848h.CHANGE_PASSWORD, bundle2, gVar);
                                return;
                            }
                            super.changePassword(activity, str, str2, bundle2, gVar);
                            changePasswordForOldStyle(activity, bundle2, gVar);
                        } else if (PasswordRevisionUtils.INSTANCE.isNeedVerifyEmail()) {
                            C23826bi.m58471l().verifyEmail(activity, str, bundle2, new PasswordService$$Lambda$0(bundle2, activity, gVar));
                        } else {
                            super.changePassword(activity, str, str2, bundle2, gVar);
                            changePasswordForOldStyle(activity, bundle2, gVar);
                        }
                    } else if (PasswordRevisionUtils.INSTANCE.isNeedBindService()) {
                        C23826bi.m58471l().bindMobile(activity, str, bundle2, new PasswordService$$Lambda$1(bundle2, activity, gVar));
                    } else {
                        C10691a.m21551c((Context) activity, activity.getResources().getString(R.string.sk)).mo19066a();
                    }
                } else if (PasswordRevisionUtils.INSTANCE.isDirectlyChangePwdForPhone()) {
                    C21839d.m54510b(bundle2, bindPhone);
                    CommonFlowActivity.f59096f.mo45958a(activity, C21850i.PHONE_SMS_CHANGE_PASSWORD, C21848h.CHANGE_PASSWORD, bundle2, gVar);
                } else {
                    super.changePassword(activity, str, str2, bundle2, gVar);
                    changePasswordForOldStyle(activity, bundle2, gVar);
                }
            }
        } else if (!bundle2.getBoolean(HAVE_SET_PWD, false)) {
            setPassword(activity, bundle2, gVar);
        } else {
            super.changePassword(activity, str, str2, bundle2, gVar);
            changePasswordForChildren(activity);
        }
    }

    static final /* synthetic */ void lambda$changePassword$0$PasswordService(Bundle bundle, Activity activity, C20840g gVar, int i, int i2, Object obj) {
        if (i2 == 1) {
            bundle.putAll((Bundle) obj);
            CommonFlowActivity.f59096f.mo45958a(activity, C21850i.CHANGE_PASSWORD, C21848h.CHANGE_PASSWORD, bundle, gVar);
        }
    }

    static final /* synthetic */ void lambda$changePassword$1$PasswordService(Bundle bundle, Activity activity, C20840g gVar, int i, int i2, Object obj) {
        if (i2 == 1) {
            if (obj instanceof C27983t) {
                try {
                    C21839d.m54512c(bundle, new JSONObject(((C27983t) obj).f73411b).optString("ticket", ""));
                } catch (JSONException unused) {
                }
            } else {
                bundle.putAll((Bundle) obj);
            }
            CommonFlowActivity.f59096f.mo45958a(activity, C21850i.CHANGE_PASSWORD, C21848h.CHANGE_PASSWORD, bundle, gVar);
        }
    }
}
