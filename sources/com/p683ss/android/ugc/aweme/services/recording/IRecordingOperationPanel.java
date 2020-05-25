package com.p683ss.android.ugc.aweme.services.recording;

import android.arch.lifecycle.C0176h;
import android.support.p030v4.app.C0654k;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.framework.services.IStickerService.FaceSticker;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44880c;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44882e;

/* renamed from: com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel */
public interface IRecordingOperationPanel {
    RemoteImageView backgroundView();

    void closeRecording();

    C20489b effectController();

    C44880c filterModule();

    C0654k fragmentManager();

    int getCameraPos();

    C0176h getLifecycle();

    void onGameStickerChosen(FaceSticker faceSticker, String str);

    void onHidePanel(String str);

    void onShowPanel(String str);

    void onStickerCancel(FaceSticker faceSticker, String str);

    void onStickerChosen(FaceSticker faceSticker, String str);

    void setCameraPos(int i);

    void updateLiveBackgroundView();

    C44882e videoRecorder();
}
