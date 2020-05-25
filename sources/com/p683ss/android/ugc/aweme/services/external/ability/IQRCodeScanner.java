package com.p683ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import android.view.SurfaceHolder;
import com.p683ss.android.medialib.camera.C19264d;
import com.p683ss.android.medialib.model.EnigmaResult;
import com.p683ss.android.medialib.p1185qr.ScanSettings;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner */
public interface IQRCodeScanner {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int ERR_CAMERA = ERR_CAMERA;
        private static final int ERR_INIT = ERR_INIT;
        private static final int ERR_RENDER = ERR_RENDER;
        private static final int ERR_TIMEOUT = ERR_TIMEOUT;

        private Companion() {
        }

        public final int getERR_CAMERA() {
            return ERR_CAMERA;
        }

        public final int getERR_INIT() {
            return ERR_INIT;
        }

        public final int getERR_RENDER() {
            return ERR_RENDER;
        }

        public final int getERR_TIMEOUT() {
            return ERR_TIMEOUT;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner$OnEnigmaScanListener */
    public interface OnEnigmaScanListener {
        void onFail(int i);

        void onSuccess(EnigmaResult enigmaResult);
    }

    void closeLight();

    void enableCameraScan(boolean z, long j);

    void openLight();

    void pauseEffectAudio(boolean z);

    void processTouchEvent(float f, float f2);

    void release();

    void setScanListener(OnEnigmaScanListener onEnigmaScanListener);

    void startPicScan(String str, ScanSettings scanSettings, long j);

    void startScan(Context context, C19264d dVar, SurfaceHolder surfaceHolder, ScanSettings scanSettings);

    void stop();

    void stopPicScan();

    void switchEffectWithTag(String str, int i, int i2, String str2);

    void zoomByRatio(float f);
}
