package com.p683ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.live.ILiveHostOuterService */
public interface ILiveHostOuterService {

    /* renamed from: com.ss.android.ugc.aweme.live.ILiveHostOuterService$a */
    public interface C36000a {
        /* renamed from: a */
        void mo74700a(User user);

        /* renamed from: a */
        void mo74701a(Exception exc);
    }

    Locale currentLocale();

    String getApiHost();

    long getAutoLiveStateIntervalMills();

    TextView getBindMobileTitleView(Context context, int i);

    Intent getCrossPlatformActivityIntent(Context context);

    Intent getDeepLinkHandlerActivityIntent(Context context);

    boolean getEnableAutoLiveState();

    FollowStatus getFollowStatus(User user) throws Exception;

    String getOfflineRootDir();

    List<String> getSafeJsbHostList();

    Intent getSubmitFeedbackActivityIntent(Context context);

    void hideStatusBar(Activity activity);

    void initNetworkInterceptor();

    boolean isDeepLinkHandlerActivity(Context context);

    boolean isEnableShowTeenageTip();

    boolean isFreeFlow();

    boolean isFull();

    boolean isNeedProtectUnderage();

    boolean isOfflineCacheEnable();

    boolean isSafeDomain(String str);

    void monitorImageNetwork(Object obj);

    void notifyShowLiveEntrance(boolean z);

    void requestUser(String str, String str2, C36000a aVar);

    void sendLiveRoomScrollEvent(long j);

    void setCustomStatusBarInLayout(Activity activity);

    void setLiveEntranceAnimEnable(boolean z);

    void share(Activity activity, C8633b bVar, C8632a aVar);

    void showH5QuickShop(Context context, String str);

    void showShareDialog(Activity activity, C8633b bVar, C8632a aVar);

    void startLiveDetailActivity(Context context);

    void startMainActivity(Activity activity, boolean z, boolean z2);

    void updateIMUser(User user);
}
