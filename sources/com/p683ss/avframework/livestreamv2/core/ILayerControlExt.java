package com.p683ss.avframework.livestreamv2.core;

import com.p683ss.avframework.buffer.VideoFrame;
import com.p683ss.avframework.livestreamv2.RenderView;
import com.p683ss.avframework.livestreamv2.core.ILayerControl.ILayer;
import com.p683ss.avframework.mixer.VideoMixer;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerDescription;
import com.p683ss.avframework.mixer.VideoMixer.VideoMixerTexture;

/* renamed from: com.ss.avframework.livestreamv2.core.ILayerControlExt */
public interface ILayerControlExt extends ILayerControl {

    /* renamed from: com.ss.avframework.livestreamv2.core.ILayerControlExt$ILayerExt */
    public interface ILayerExt extends ILayer {
        int getMixerOutHeight();

        int getMixerOutWidth();

        void renderFrame(VideoFrame videoFrame);

        void renderFrame(VideoMixerTexture videoMixerTexture);
    }

    ILayerExt createLayerExt(String str, VideoMixerDescription videoMixerDescription, int i, int i2, int i3);

    RenderView getRenderView();

    VideoMixer getVideoMixer();

    void setLocalOrigin(String str);
}
