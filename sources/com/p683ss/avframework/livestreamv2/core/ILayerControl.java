package com.p683ss.avframework.livestreamv2.core;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import java.security.InvalidParameterException;

/* renamed from: com.ss.avframework.livestreamv2.core.ILayerControl */
public interface ILayerControl {

    /* renamed from: com.ss.avframework.livestreamv2.core.ILayerControl$ILayer */
    public interface ILayer {
        void dispose();

        int getHeight();

        VideoMixerDescription getLayerDescription();

        int getRealFps();

        int getWidth();

        boolean isEnable();

        Canvas lockCanvas();

        String name();

        void pause();

        void resume();

        void setAnimationMode(int i, long j, RectF rectF);

        void setEnable(boolean z);

        void setVisibility(int i);

        void unlockCanvasAndPost(Canvas canvas, long j);

        void updateDescription(VideoMixerDescription videoMixerDescription);
    }

    ILayer createLayer(String str, VideoMixerDescription videoMixerDescription, int i, int i2) throws InvalidParameterException;

    ILayer getLayer(String str);

    ILayer[] getLayers();

    ILayer getLocalOriginLayer();

    float getRealRenderFps();

    int layerSize();

    void setOriginTriggering(String str);
}
