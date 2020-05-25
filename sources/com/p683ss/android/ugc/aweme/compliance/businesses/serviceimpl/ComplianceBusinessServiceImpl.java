package com.p683ss.android.ugc.aweme.compliance.businesses.serviceimpl;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.compliance.business.api.services.C27022b;
import com.p683ss.android.ugc.aweme.compliance.business.api.services.IComplianceBusinessService;
import com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1605c.C27037a;
import com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1605c.C27037a.C27038a;
import com.p683ss.android.ugc.aweme.compliance.businesses.commentfilter.p1605c.C27037a.C27039b;
import com.p683ss.android.ugc.aweme.compliance.businesses.setting.p1609ui.ChildrenModeSettingActivity;
import com.p683ss.android.ugc.aweme.compliance.businesses.vzbv.p1610a.C27075a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29973d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.serviceimpl.ComplianceBusinessServiceImpl */
public final class ComplianceBusinessServiceImpl implements IComplianceBusinessService {
    public final Object getCommentFilterPushSettingCallback() {
        return C27037a.f71357a;
    }

    public final Class<? extends Activity> provideChildrenModeSettingActivityClass() {
        return ChildrenModeSettingActivity.class;
    }

    public final C27022b getBanAppealService() {
        return new C27060a();
    }

    public final boolean isShowPrivacyAccountSetting() {
        return C27075a.m65301a();
    }

    public static IComplianceBusinessService createIComplianceBusinessServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IComplianceBusinessService.class);
        if (a != null) {
            return (IComplianceBusinessService) a;
        }
        if (C27991b.f73498bb == null) {
            synchronized (IComplianceBusinessService.class) {
                if (C27991b.f73498bb == null) {
                    C27991b.f73498bb = new ComplianceBusinessServiceImpl();
                }
            }
        }
        return (ComplianceBusinessServiceImpl) C27991b.f73498bb;
    }

    public final void tryShowCommentFilterGuide(Activity activity, Aweme aweme, Comment comment) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(comment, "comment");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(comment, "comment");
        if (activity != null && !activity.isFinishing()) {
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            String curUserId = a.getCurUserId();
            C29973d a2 = C29973d.m70118a();
            StringBuilder sb = new StringBuilder("comment_filter_function_open_");
            IAccountUserService a3 = C20902b.m53242a();
            C52711k.m112236a((Object) a3, "AccountUserProxyService.get()");
            sb.append(a3.getCurUserId());
            Boolean a4 = a2.mo60148a(sb.toString(), Boolean.valueOf(false));
            C52711k.m112236a((Object) a4, "ReactNativeStorage.insta…e.get().curUserId, false)");
            if (a4.booleanValue()) {
                CharSequence charSequence = curUserId;
                if (TextUtils.equals(aweme.getAuthorUid(), charSequence)) {
                    User user = comment.getUser();
                    C52711k.m112236a((Object) user, "comment.user");
                    if (!TextUtils.equals(user.getUid(), charSequence)) {
                        C29973d a5 = C29973d.m70118a();
                        StringBuilder sb2 = new StringBuilder("settings_times_");
                        sb2.append(curUserId);
                        String a6 = a5.mo60150a(sb2.toString(), "0");
                        C52711k.m112236a((Object) a6, "storage.get(SETTING_TIMES_KEY + uid, \"0\")");
                        if (Integer.parseInt(a6) <= 0) {
                            StringBuilder sb3 = new StringBuilder("not_now_times_");
                            sb3.append(curUserId);
                            String a7 = a5.mo60150a(sb3.toString(), "0");
                            C52711k.m112236a((Object) a7, "storage.get(NOT_NOW_TIMES_KEY + uid, \"0\")");
                            if (Integer.parseInt(a7) <= 1) {
                                Dialog b = new C10643a(activity).mo18899b((int) R.string.aoj).mo18893a(activity.getString(R.string.b9e), (OnClickListener) new C27038a(a5, curUserId, activity)).mo18903b(activity.getString(R.string.cio), (OnClickListener) new C27039b(a5, curUserId)).mo18897a().mo18882b();
                                b.setCanceledOnTouchOutside(false);
                                b.setCancelable(false);
                            }
                        }
                    }
                }
            }
        }
    }
}
