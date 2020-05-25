package com.p683ss.android.ugc.aweme.services.external.ability;

import com.p683ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVTransformService */
public interface IAVTransformService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVTransformService$ITransformCallback */
    public interface ITransformCallback<T> {
        void finish(T t);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVTransformService$ITransformProgress */
    public interface ITransformProgress {
        void update(int i);
    }

    void audio2wavebean(String str, ITransformCallback<MusicWaveBean> iTransformCallback);

    void video2gif(VideoShare2GifEditContext videoShare2GifEditContext, ITransformProgress iTransformProgress, ITransformCallback<Boolean> iTransformCallback);

    void video2webp(String str, String str2, int i, int i2, ITransformCallback<Integer> iTransformCallback, ITransformProgress iTransformProgress);
}
