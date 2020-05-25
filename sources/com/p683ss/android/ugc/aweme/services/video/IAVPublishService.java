package com.p683ss.android.ugc.aweme.services.video;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43305e;
import com.p683ss.android.ugc.aweme.shortvideo.C43804f;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44386j;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.services.video.IAVPublishService */
public interface IAVPublishService {

    /* renamed from: com.ss.android.ugc.aweme.services.video.IAVPublishService$LiveThumCallback */
    public interface LiveThumCallback {
        void onCallback(String str, String str2);

        void publishSuccess(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.video.IAVPublishService$OnPublishCallback */
    public interface OnPublishCallback {
        void onStartPublish();

        void onStopPublish();
    }

    /* renamed from: com.ss.android.ugc.aweme.services.video.IAVPublishService$onLivePublishCallback */
    public interface onLivePublishCallback {
        void onLivePublishCallback(JSONObject jSONObject);
    }

    void addAVNationalTaskTips(C43804f fVar);

    void addChallenge(Challenge challenge);

    void addMusic(MusicModel musicModel);

    void addNationalTask(C43305e eVar);

    void addPublishCallback(C44334o<C42421al> oVar);

    void addPublishCallback(C44334o<C42421al> oVar, String str);

    void cancelRestoreOnMain();

    void cancelSynthetise(Context context);

    boolean checkIsAlreadyPublished(Context context);

    boolean containEmoji(String str);

    void deleteLivePublishItem(String str);

    boolean endWithHashTag(String str);

    C43804f getAVNationalTaskTips();

    Bitmap getCover(C44386j jVar);

    AVChallenge getCurChallenge();

    C42482c getCurMusic();

    boolean getKitManageRegister();

    onLivePublishCallback getLivePublishCallback();

    LiveThumCallback getLiveThumCallback();

    C44386j getPublishModel(String str);

    String getShootWay();

    void hideUploadRecoverWindow(Context context, boolean z);

    boolean inPublishPage(Context context);

    boolean isPublishServiceRunning(Context context);

    boolean isPublishable();

    boolean isPublishing();

    boolean needRestore();

    boolean processPublish(FragmentActivity fragmentActivity, Intent intent);

    void publishFromDraft(FragmentActivity fragmentActivity, C29059c cVar);

    void removeAVNationalTaskTips();

    void removePublishCallback(C44334o<C42421al> oVar);

    void setCurMusic(MusicModel musicModel);

    void setCurMusic(MusicModel musicModel, Boolean bool);

    void setFakeMusic(MusicModel musicModel);

    void setHashTagRegex(String str);

    void setKitManageRegister(boolean z);

    void setLiveThumCallback(LiveThumCallback liveThumCallback);

    void setMusicChooseType(int i);

    void setPublishStatus(int i);

    void showLivePublishFailedPopwindow(FragmentActivity fragmentActivity, String str);

    void showLivePublishSuccessPopwindow(FragmentActivity fragmentActivity, String str, String str2);

    void showUploadRecoverIfNeed(boolean z, FragmentActivity fragmentActivity);

    void showUploadingDialog();

    void startLivePublishActivity(Context context, Intent intent, onLivePublishCallback onlivepublishcallback);

    void startPublish(FragmentActivity fragmentActivity, Bundle bundle);

    void tryRestorePublish(FragmentActivity fragmentActivity, C52671b<Boolean, Void> bVar);

    void uploadRecoverPopViewSetVisibility(boolean z);
}
