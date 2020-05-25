package com.p683ss.android.ugc.aweme.services.publish;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.story.shootvideo.p2339b.p2340a.C46667a;

/* renamed from: com.ss.android.ugc.aweme.services.publish.IPublishService */
public interface IPublishService {

    /* renamed from: com.ss.android.ugc.aweme.services.publish.IPublishService$OnGetRecoverDraftCallback */
    public interface OnGetRecoverDraftCallback {
        void onFail();

        void onSuccess(C29059c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.publish.IPublishService$OnPublishCallback */
    public interface OnPublishCallback {
        void onStartPublish();

        void onStopPublish();
    }

    /* renamed from: com.ss.android.ugc.aweme.services.publish.IPublishService$profileLivePublishCallback */
    public interface profileLivePublishCallback {
        void onPublish(String str);
    }

    void cancelSynthetise(Context context);

    boolean checkIsAlreadyPublished(Context context);

    void getRecoverDraftIfHave(Context context, OnGetRecoverDraftCallback onGetRecoverDraftCallback);

    Class<? extends Service> getShortVideoPublishServiceClass();

    void hideUploadRecoverWindow(Context context, boolean z);

    boolean inPublishPage(Context context);

    boolean isPublishServiceRunning(Context context);

    boolean isVideoPublishPreviewActivity(Context context);

    boolean processPublish(FragmentActivity fragmentActivity, Intent intent);

    void publishFromDraft(FragmentActivity fragmentActivity, C29059c cVar);

    C46667a queryKnowFriends(int i, int i2) throws Exception;

    void setUploadRecoverPath(String str);

    void showUploadRecoverIfNeed(boolean z, FragmentActivity fragmentActivity);

    void startPublish(FragmentActivity fragmentActivity, Bundle bundle);

    void uploadRecoverPopViewSetVisibility(boolean z);
}
