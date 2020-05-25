package com.p683ss.android.ugc.aweme;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.ap */
public interface C22787ap {

    /* renamed from: com.ss.android.ugc.aweme.ap$a */
    public interface C22788a {
        /* renamed from: a */
        void mo47260a();
    }

    void addSettingChangeListener(C22788a aVar);

    String getAppLocale();

    Locale getLocaleSetting();

    int getWebViewDestroyMode();

    boolean hasAppByHttp(Context context, Uri uri);

    boolean hasAppWithoutHttp(Context context, Uri uri);

    boolean hasGP(Context context);

    boolean isGpUri(Uri uri);

    void logAppNotInWhiteList(Context context, Aweme aweme, String str);

    void logUninstalledEvent(Context context, Aweme aweme, String str);

    void onLandPageContentLoaded();

    void onSearchIntermindateComponentDidMount(Object obj);

    void onUrlEvent(String str);

    boolean openAppByHttpUri(Context context, Uri uri);

    void openAppWithLog(Context context, Aweme aweme, String str);

    boolean openAppWithoutHttpUri(Context context, Uri uri);

    boolean openGPWebPage(Context context, String str);

    boolean openGpByMarketUri(Context context, Uri uri);

    boolean openGpByUri(Context context, Uri uri);

    void releaseSearchBaseModelHolder();

    void report(Activity activity, String str);

    void sendInitDataToFe(Object obj);

    void startHeaderDetailActivity(Activity activity, View view, float f, User user, boolean z, Challenge challenge, String... strArr);
}
