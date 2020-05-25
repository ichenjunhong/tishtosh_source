package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.IRecordService */
public interface IRecordService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.IRecordService$UICallback */
    public interface UICallback {
        void postFail();

        void postSuccess();

        void preFail(int i);

        void preSuccess();
    }

    void recordActivityResult(Activity activity, int i, int i2, Intent intent);

    void startDuet(Context context, RecordConfig recordConfig, DuetConfig duetConfig, UICallback uICallback);

    void startReact(Context context, RecordConfig recordConfig, ReactConfig reactConfig, UICallback uICallback);

    void startRecord(Activity activity, RecordConfig recordConfig, MusicModel musicModel, boolean z);

    void startRecord(Context context, Intent intent);

    void startRecord(Context context, RecordConfig recordConfig);

    void startRecord(Context context, RecordConfig recordConfig, Uri uri);

    void startRecord(Context context, RecordConfig recordConfig, Challenge challenge, Bundle bundle);

    void startRecordMV(Context context, RecordConfig recordConfig, StickerDownloadConfig stickerDownloadConfig);

    void startSpecialPlusEntrance(Activity activity, RecordConfig recordConfig);

    void startStitch(Context context, Intent intent, StitchParams stitchParams);

    void startSuperEntrace(Activity activity, RecordConfig recordConfig);
}
