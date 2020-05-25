package com.p683ss.avframework.livestreamv2.core;

import android.content.Intent;
import android.view.View;
import com.p683ss.avframework.livestreamv2.game.MessageBox;

/* renamed from: com.ss.avframework.livestreamv2.core.IGameEngine */
public interface IGameEngine {

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngine$GameLoadCallback */
    public interface GameLoadCallback extends GamePreloadCallback {
        void onError(String str, Throwable th);

        void onSuccess(String str, IGameClient iGameClient);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngine$GamePreloadCallback */
    public interface GamePreloadCallback {

        /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngine$GamePreloadCallback$GamePreloadTask */
        public interface GamePreloadTask {
            boolean cancel();

            String getGameId();
        }

        void onDownloadCancel(String str);

        void onDownloadError(String str, String str2, Throwable th);

        void onDownloadStart(String str, GamePreloadTask gamePreloadTask);

        void onDownloadSuccess(String str);

        void onDownloadingProgress(String str, int i);
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngine$IGameClient */
    public interface IGameClient {

        /* renamed from: com.ss.avframework.livestreamv2.core.IGameEngine$IGameClient$Listener */
        public interface Listener {
            void onGameSetMessageHandler(boolean z);

            void onReceiveGameClientMessage(MessageBox messageBox);
        }

        void destroy();

        void pause();

        boolean postMessage(MessageBox messageBox);

        void resume();

        void setListener(Listener listener);
    }

    void clearGameResource(String str);

    void enablePublish(boolean z);

    String getAudioLayerName();

    GameParameter getPublishParameter();

    String getVideoLayerName();

    void initGameEngine();

    boolean isEnablePublish();

    boolean isEnableRender();

    boolean isGamePackageDownloaded(String str);

    boolean onActivityResult(String str, int i, int i2, Intent intent);

    boolean onBackPressed(String str);

    void onMemoryWarning(String str, int i);

    void onRequestPermissionsResult(String str, int i, String[] strArr, int[] iArr);

    void preload(String str, GamePreloadCallback gamePreloadCallback);

    void setDisplay(View view);

    void setEnableRender(boolean z);

    void setPublishParameter(GameParameter gameParameter);

    void startGame(String str, GameLoadCallback gameLoadCallback, GameParameter gameParameter);

    void updateCameraPosition(float f, float f2, float f3, float f4, boolean z);
}
