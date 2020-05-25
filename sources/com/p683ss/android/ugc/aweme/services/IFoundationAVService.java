package com.p683ss.android.ugc.aweme.services;

import android.app.Application;
import android.content.Context;
import com.p683ss.android.ugc.aweme.services.draft.IDraftService;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService;
import com.p683ss.android.ugc.aweme.services.filter.IFilterService;
import com.p683ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.p683ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p683ss.android.ugc.aweme.services.video.IVideoCoverService;
import com.p683ss.android.ugc.aweme.services.video.VideoExposureData;

/* renamed from: com.ss.android.ugc.aweme.services.IFoundationAVService */
public interface IFoundationAVService {
    public static final int MUSIC_LENGTH_FOR_COPYRIGHT = 15000;
    public static final int THEME_TYPE_BLACK = 2;
    public static final int THEME_TYPE_WHITE = 1;

    /* renamed from: com.ss.android.ugc.aweme.services.IFoundationAVService$IFetchResourcesListener */
    public interface IFetchResourcesListener {
        void onFailed(Exception exc);

        void onSuccess(String[] strArr);
    }

    IAVSettingsService avSettingsService();

    VideoExposureData convertToExposureData(Object obj);

    IDraftService draftService();

    IEffectService effectService();

    boolean enableMultiPublisherScheduler();

    void fetchResourcesNeededByRequirements(String[] strArr, IFetchResourcesListener iFetchResourcesListener);

    IFilterService getFilterService();

    ISDKService getSDKService();

    IVideoLegalCheckerAndToastService getVideoLegalCheckerAndToastService(Context context);

    void loadLibrary(String str, Application application);

    void setLastStickerId(Context context, String str, int i);

    String shortVideoDir();

    void tryCopyDuetDefaultLayout();

    IVideoCoverService videoCoverService();
}
