package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.music.IMusicService;

/* renamed from: com.ss.android.ugc.aweme.services.IMainService */
public interface IMainService {
    String getApiUrlPrefix();

    int getAppVersionCode();

    IBusinessGoodsService getBusinessGoodsService();

    ILocalVideoCacheService getLocalVideoCacheService();

    String getStoryEnterFromForMain(Activity activity);

    boolean isContainsKeyWithLruEntries();

    boolean isMainPage(Context context);

    boolean isNotificationTabMStyle();

    boolean isRelationLabelClickEnter();

    boolean isReplaceAwemeCache();

    boolean isUseJediAwemelistFragment();

    IMusicService musicService();

    void setStartWithoutSplash(boolean z);

    boolean shouldChangeToHandle(String str);

    void startActivity(Context context, Aweme aweme, String str, int i, int i2, String str2, boolean z);

    void trackAppsFlyerEvent(String str, String str2);

    void updateIMUserFollowStatus(User user);
}
