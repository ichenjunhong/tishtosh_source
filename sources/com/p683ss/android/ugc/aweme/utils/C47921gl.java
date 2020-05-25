package com.p683ss.android.ugc.aweme.utils;

import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.ttuploader.TTVideoInfo;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.gl */
public final class C47921gl {
    /* renamed from: a */
    public static final VideoCreation m103687a(TTVideoInfo tTVideoInfo) {
        int i;
        C52711k.m112240b(tTVideoInfo, "info");
        int i2 = 0;
        try {
            JSONObject jSONObject = new JSONObject(tTVideoInfo.mVideoMediaInfo);
            i = jSONObject.getInt("width");
            try {
                i2 = jSONObject.getInt("height");
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            i = 0;
        }
        VideoCreation videoHeight = new VideoCreation().setMaterialId(tTVideoInfo.mVideoId).setCoverUri(tTVideoInfo.mCoverUri).setVideoWidth(i).setVideoHeight(i2);
        C52711k.m112236a((Object) videoHeight, "VideoCreation().setMater…tVideoHeight(videoHeight)");
        return videoHeight;
    }

    /* renamed from: a */
    public static final void m103688a(VideoCreation videoCreation, LinkedHashMap<String, String> linkedHashMap) {
        C52711k.m112240b(videoCreation, "result");
        C52711k.m112240b(linkedHashMap, "fieldmap");
        StringBuilder sb = new StringBuilder();
        sb.append(videoCreation.videoWidth);
        linkedHashMap.put("video_width", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(videoCreation.videoHeight);
        linkedHashMap.put("video_height", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(videoCreation.mCoverUri);
        linkedHashMap.put("video_cover_uri", sb3.toString());
    }
}
