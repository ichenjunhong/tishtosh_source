package com.p683ss.android.anywheredoor_api;

import android.app.Activity;
import android.content.Context;
import com.google.gson.C17971f;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.anywheredoor_api.IAnyWhereDoor */
public interface IAnyWhereDoor extends IAnyWhereInnerService {
    void checkSplashData(Activity activity);

    void cleanSplashVideo();

    void fetchAnchorList(Activity activity);

    Class<?> getComposePbModelClass();

    Context getContext();

    List<C18837a> getGeckoChannels();

    HashMap<String, String> getGeckoInfo();

    C17971f getGson();

    Class<?> getModelByPath(String str);

    IAnyWhereDoorRouter getRouter();

    boolean isDebugOpen();

    void preloadFeed(String str);

    void refreshStartAtlasAccount(Activity activity);

    void refreshUserInfo(Activity activity);

    void synSetting(Activity activity);
}
