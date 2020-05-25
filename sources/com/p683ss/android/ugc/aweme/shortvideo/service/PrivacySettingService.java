package com.p683ss.android.ugc.aweme.shortvideo.service;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.policy.C39498b;
import com.p683ss.android.ugc.aweme.services.IPrivacySettingService;
import com.p683ss.android.ugc.aweme.services.IPrivacySettingService.OnPostNowClickListener;
import com.p683ss.android.ugc.aweme.shortvideo.experiment.PublishPrivacyConfirmationExperiment;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.service.PrivacySettingService */
public class PrivacySettingService implements IPrivacySettingService {
    private int getMessage(int i) {
        return i == 1 ? R.string.fk3 : R.string.fk5;
    }

    private int getTitle(int i) {
        return i == 1 ? R.string.fk4 : R.string.fk6;
    }

    static final /* synthetic */ void lambda$showPrivacyConfirmationDialog$1$PrivacySettingService(DialogInterface dialogInterface, int i) {
    }

    public static IPrivacySettingService createIPrivacySettingServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IPrivacySettingService.class);
        if (a != null) {
            return (IPrivacySettingService) a;
        }
        if (C27991b.f73454aK == null) {
            synchronized (IPrivacySettingService.class) {
                if (C27991b.f73454aK == null) {
                    C27991b.f73454aK = new PrivacySettingService();
                }
            }
        }
        return (PrivacySettingService) C27991b.f73454aK;
    }

    public boolean needShowPrivacyConfirmationDialog(Activity activity) {
        int a = C10181b.m20511a().mo18168a(PublishPrivacyConfirmationExperiment.class, true, "publish_privacy_account_confirm", 31744, 0);
        boolean z = !C20902b.m53242a().getCurUser().isAcceptPrivatePolicy();
        if (z && C20902b.m53242a().getCurUser().isSecret()) {
            new C39498b(activity).mo80526a();
            return false;
        } else if (!z || a == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void showPrivacyConfirmationDialog(Activity activity, OnPostNowClickListener onPostNowClickListener) {
        int a = C10181b.m20511a().mo18168a(PublishPrivacyConfirmationExperiment.class, true, "publish_privacy_account_confirm", 31744, 0);
        C10643a b = new C10643a(activity).mo18885a(getTitle(a)).mo18899b(getMessage(a)).mo18893a(activity.getString(R.string.cx2), (OnClickListener) new C44514a(onPostNowClickListener)).mo18903b(activity.getString(R.string.wf), C44515b.f112629a);
        b.f28284o = new C44516c(activity);
        b.mo18897a().mo18883c();
        C26890h.m65011a("account_privacy_show_notify", C23089d.m56640a().f61491a);
    }

    static final /* synthetic */ void lambda$showPrivacyConfirmationDialog$0$PrivacySettingService(OnPostNowClickListener onPostNowClickListener, DialogInterface dialogInterface, int i) {
        if (onPostNowClickListener != null) {
            onPostNowClickListener.onPostNowClick();
        }
    }
}
