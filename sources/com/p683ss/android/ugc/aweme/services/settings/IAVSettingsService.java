package com.p683ss.android.ugc.aweme.services.settings;

import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.port.C39525a;

/* renamed from: com.ss.android.ugc.aweme.services.settings.IAVSettingsService */
public interface IAVSettingsService {
    C39525a<Boolean> bubbleGuideShown();

    boolean duetSupportChangeLayout();

    boolean enableDuetReactVEEditor();

    boolean enableFeedbackLog();

    boolean enableInstagramSilentShare();

    int enableMainPlusSpecialEntrance();

    boolean enablePhotoMovie();

    boolean enablePreUploadByUser();

    boolean enableReact();

    boolean enableSaveUploadVideo();

    boolean enableStatusMode();

    boolean enableStickTopMusicAfterClickMusicSyncAnchor();

    boolean enableStickerDetailsEntrance();

    boolean enableStitch();

    boolean enableUploadFallback();

    boolean enableUploadSyncIns();

    boolean enableUploadSyncInsStory();

    boolean enableUploadSyncTwitter();

    String getEffectVersion();

    int getMvPlan();

    boolean getPublishProgressOptimize();

    String getStatusTabKey();

    String getVESDKVersion();

    boolean isEnableGetThumbsWithEffect();

    boolean isEnableUseVEGetThumbs();

    boolean isEnableVideoEditActivityUploadSpeedProbe();

    boolean isLongVideoPermitted();

    boolean isPhotoEditEnabled();

    boolean isXsSupport();

    boolean needLoginBeforeRecord();

    long progressBarThreshold();

    int recommentMusicByAIPolicy();

    void setDefaultFilterForCamera(int i, int i2);

    void setEnablePreUploadByUser(boolean z);

    void setLongVideoPermitted(boolean z);

    boolean shareVideo2GifEditable();

    boolean showMvThemeRecordMode();

    boolean showStickerCollection();

    void updateABTestModel(C18085o oVar);

    void updateUserSettings(C18085o oVar);

    boolean uploadOptimizeForPie();
}
