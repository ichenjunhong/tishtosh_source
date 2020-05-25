package com.p683ss.android.ugc.aweme.services.effect;

import android.content.Context;
import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.C53682y;

/* renamed from: com.ss.android.ugc.aweme.services.effect.IEffectService */
public interface IEffectService {

    /* renamed from: com.ss.android.ugc.aweme.services.effect.IEffectService$OnVideoCoverCallback */
    public interface OnVideoCoverCallback {
        void onGetVideoCoverFailed(int i);

        void onGetVideoCoverSuccess(Bitmap bitmap);
    }

    C29252f createEffectPlatform(Context context, String str, C53682y yVar);

    C29252f createMvEffectPlatform(Context context, String str, C53682y yVar);

    void fetchEffectWithMusicBind(C29252f fVar, String str, String str2, C48705j jVar);

    void fetchEffectWithMusicBind(C29252f fVar, String str, Map<String, String> map, C48705j jVar);

    String getCacheDir();

    ArrayList<String> getDraftEffectList();

    String getLiveStickerPannel();

    Map<String, String> getPoiLastMap();

    void getVideoCoverByCallback(List<EffectPointModel> list, C31459g gVar, float f, int i, boolean z, C29059c cVar, OnVideoCoverCallback onVideoCoverCallback);

    void getVideoCoverByCallback(List<EffectPointModel> list, String str, float f, int i, boolean z, EditPreviewInfo editPreviewInfo, OnVideoCoverCallback onVideoCoverCallback);

    void setPoiLastSP();
}
