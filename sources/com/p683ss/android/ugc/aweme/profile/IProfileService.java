package com.p683ss.android.ugc.aweme.profile;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Handler;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40200a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40453o;
import com.p683ss.android.ugc.aweme.profile.presenter.C39984r;
import com.p683ss.android.ugc.aweme.profile.presenter.UserResponse;
import java.util.List;
import p064c.p065a.C1680ad;

/* renamed from: com.ss.android.ugc.aweme.profile.IProfileService */
public interface IProfileService {
    C26875a<Aweme, ?> createAwemeModel();

    C26875a<Aweme, ?> createAwemeModel(List<? extends Aweme> list);

    C26840g<IMUser> createSearchIMUserAdapter();

    int getMessageProfile();

    Object getPushSettingCallback();

    String getUserApi(String str);

    String getUserApi(String str, String str2, String str3, int i);

    void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4);

    void mobRefreshInProfileAweme(C26875a<?, ?> aVar, List<? extends Aweme> list);

    boolean needShowCompleteProfileGuide();

    boolean needShowCompleteProfileGuideBar();

    boolean needShowCompleteProfileGuideBarForFansDetail();

    C40200a newAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, Bundle bundle);

    C40200a newBasicAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2);

    C40200a newMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2);

    C39984r newUserPresenter();

    void onFansDetailCompleteProfileGuideBarShow();

    void preloadProfile(FragmentActivity fragmentActivity, String str);

    void queryProfileResponseWithDoubleId(Handler handler, String str, String str2, String str3, int i);

    User queryUser(String str, boolean z, String str2);

    void setSearchIMUserData(C26840g<IMUser> gVar, List<IMUser> list);

    void setSearchIMUserKeywords(C26840g<IMUser> gVar, String str);

    void showRemarkEditDialog(Context context, User user, String str, int i, Bundle bundle, C40453o oVar);

    boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, OnDismissListener onDismissListener);

    boolean showRemindUserCompleteProfileDialogAfterFollow(Context context, String str, String str2, User user, int i);

    void startUserPfoeilActivity(Context context, User user, String str, String str2, String str3, String str4);

    void updateProfilePermission(boolean z);

    C1680ad<UserResponse> user(String str, String str2, String str3);

    String userUrl(String str, String str2, String str3, int i);
}
