package com.p683ss.android.ugc.aweme.services.external;

import android.content.Context;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p683ss.android.ugc.aweme.services.video.VideoExposureData;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.services.external.IInfoService */
public interface IInfoService {
    VideoExposureData convertToExposureData(Object obj);

    void endDownloadEffectAlog(Effect effect, long j, long j2, int i, C48649d dVar);

    Map<Object, Object> getDataMapForEditActivity(Context context);

    List<MediaModel> getMediaLoaderImages(Context context);

    List<MusicModel> recommandMusic();

    C26916m shareContextInfo(Object obj);

    void startDownloadEffectAlog(Effect effect, long j);

    IStickerUtilsService stickerInfo();
}
