package com.p683ss.android.ugc.aweme.photomovie;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C43775ef;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.photomovie.f */
public final class C38796f {
    /* renamed from: a */
    static void m86205a(PhotoMovieContext photoMovieContext, SynthetiseResult synthetiseResult, LinkedHashMap<String, String> linkedHashMap) {
        String str;
        String str2;
        linkedHashMap.put("video_type", "6");
        if (photoMovieContext.mMusic != null) {
            linkedHashMap.put("music_id", String.valueOf(photoMovieContext.mMusic.getId()));
        }
        if (!TextUtils.isEmpty(photoMovieContext.creationId)) {
            linkedHashMap.put("creation_id", photoMovieContext.creationId);
        }
        linkedHashMap.put("original", "0");
        String str3 = "transition_type";
        if (photoMovieContext.mPlayType == 0) {
            str = "1";
        } else {
            str = "2";
        }
        linkedHashMap.put(str3, str);
        if (!TextUtils.isEmpty(photoMovieContext.shopDraftId)) {
            linkedHashMap.put("shop_draft_id", photoMovieContext.shopDraftId);
        }
        if (!TextUtils.isEmpty(photoMovieContext.mFilterName)) {
            linkedHashMap.put("filter_name", photoMovieContext.mFilterName);
        }
        if (photoMovieContext.mFilterId > 0) {
            linkedHashMap.put("filter_id", String.valueOf(photoMovieContext.mFilterId));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(photoMovieContext.mCoverStartTm);
        linkedHashMap.put("cover_tsp", sb.toString());
        new C43775ef().mo89282a((BaseShortVideoContext) photoMovieContext, synthetiseResult, linkedHashMap);
        HashMap a = C39618d.f101179t.mo74305a((Object) photoMovieContext);
        if (!a.isEmpty()) {
            linkedHashMap.putAll(a);
        }
        linkedHashMap.put("video_cnt", "0");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(photoMovieContext.mRealImageCount);
        linkedHashMap.put("pic_cnt", sb2.toString());
        String str4 = "is_multi_content";
        if (photoMovieContext.mRealImageCount > 1) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        linkedHashMap.put(str4, str2);
        if (photoMovieContext.poiServerMobParam != null) {
            linkedHashMap.putAll(photoMovieContext.poiServerMobParam);
        }
    }
}
