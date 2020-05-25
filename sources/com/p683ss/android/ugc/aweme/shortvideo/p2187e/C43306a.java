package com.p683ss.android.ugc.aweme.shortvideo.p2187e;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.p525e.C9402b;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47768ci;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.e.a */
public final class C43306a {
    /* renamed from: a */
    public static void m94986a(String str, C42482c cVar, int i) {
        float[] musicWaveData;
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putString("music_path", str);
        String str2 = "";
        if (cVar != null) {
            try {
                str2 = JSON.toJSONString(cVar);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                if (cVar.getMusicWaveData() != null) {
                    for (float f : cVar.getMusicWaveData()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(f);
                        sb2.append(",");
                        sb.append(sb2.toString());
                    }
                }
                StringBuilder sb3 = new StringBuilder("music id:");
                sb3.append(cVar.getMusicId());
                sb3.append("; music name:");
                sb3.append(cVar.getName());
                sb3.append("; music wave data:");
                sb3.append(sb.toString());
                C45407ay.m98968a(sb3.toString());
                throw e;
            }
        }
        edit.putString("music_model", str2);
        edit.putInt("music_start", i);
        C9402b.m18594a(edit);
    }

    /* renamed from: a */
    public static void m94988a(ArrayList<TimeSpeedModelExtension> arrayList) {
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putString("segment_video", ShortVideoContext.m93016a(arrayList));
        C9402b.m18594a(edit);
    }

    /* renamed from: a */
    public static void m94987a(String str, String str2) {
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putString("filter_labels", str);
        edit.putString("filter_ids", str2);
        C9402b.m18594a(edit);
    }

    /* renamed from: a */
    public static void m94989a(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
            edit.putString("video_record_metadata", C47768ci.m103397a(map));
            C9402b.m18594a(edit);
        }
    }

    /* renamed from: a */
    public static void m94978a() {
        C45407ay.m98968a("PublishSharedPref reset");
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putString("music_path", "");
        edit.putString("music_model", "");
        edit.putInt("music_start", 0);
        edit.putInt("face_beauty", 0);
        edit.putString("segment_video", "");
        edit.putInt("hard_encode", 0);
        edit.putString("mp4_path", "");
        edit.putString("duet_video_path", "");
        edit.putString("duet_audio_path", "");
        edit.putString("creation_id", "");
        edit.putInt("record_mode", 0);
        edit.putString("poi_context", "");
        edit.putString("challenge", "");
        edit.putString("comment_video_moodel", "");
        C9402b.m18594a(edit);
    }

    /* renamed from: b */
    public static RecordScene m94990b() {
        RecordScene recordScene = new RecordScene();
        SharedPreferences a = C35807d.m80935a(C39629l.m88233b(), "publish", 0);
        recordScene.musicPath = a.getString("music_path", "");
        recordScene.musicStart = a.getInt("music_start", 0);
        recordScene.videoSegments = ShortVideoContext.m93017a(a.getString("segment_video", ""));
        recordScene.faceBeauty = a.getInt("face_beauty", 0);
        recordScene.hardEncode = a.getInt("hard_encode", 0);
        recordScene.mp4Path = a.getString("mp4_path", "");
        recordScene.maxDuration = a.getLong("max_duration", 15000);
        recordScene.duetAudioPath = a.getString("duet_audio_path", "");
        recordScene.duetVideoPath = a.getString("duet_video_path", "");
        recordScene.shootMode = a.getInt("shoot_mode", 0);
        recordScene.creationId = a.getString("creation_id", UUID.randomUUID().toString());
        recordScene.recordMode = a.getInt("record_mode", 0);
        recordScene.filterLabels = a.getString("filter_labels", "");
        recordScene.filterIds = a.getString("filter_ids", "");
        recordScene.poiContextStr = a.getString("poi_context", "");
        recordScene.challengeStr = a.getString("challenge", "");
        recordScene.commentVideoModel = RecordScene.string2CommentVideoModel(a.getString("comment_video_moodel", ""));
        recordScene.reactionParams = RecordScene.string2ReactionParams(a.getString("reaction", ""));
        recordScene.stitchParams = RecordScene.string2StitchParams(a.getString("stitch_params", ""));
        recordScene.extractFramesModel = ExtractFramesModel.string2Model(a.getString("shot_extract_frame", ""));
        recordScene.cherEffectParam = RecordScene.getCherEffectParam(a.getString("ve_cher_effect_param", ""));
        recordScene.videoRecordMetadata = C47768ci.m103398a(a.getString("video_record_metadata", ""));
        try {
            recordScene.musicModel = DraftUpdateServiceImpl.createDraftUpdateServicebyMonsterPlugin().transformNewAVMusic(a.getString("music_model", ""));
        } catch (Throwable unused) {
        }
        return recordScene;
    }

    /* renamed from: a */
    public static void m94979a(int i) {
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putInt("hard_encode", i);
        C9402b.m18594a(edit);
    }

    /* renamed from: b */
    public static void m94991b(int i) {
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putInt("face_beauty", i);
        C9402b.m18594a(edit);
    }

    /* renamed from: c */
    public static void m94994c(int i) {
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putInt("shoot_mode", i);
        C9402b.m18594a(edit);
    }

    /* renamed from: a */
    public static void m94980a(long j) {
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putLong("max_duration", j);
        C9402b.m18594a(edit);
    }

    /* renamed from: b */
    public static void m94992b(String str) {
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putString("poi_context", str);
        C9402b.m18594a(edit);
    }

    /* renamed from: a */
    public static void m94981a(CommentVideoModel commentVideoModel) {
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        if (commentVideoModel != null) {
            edit.putString("comment_video_moodel", C39629l.m88232a().mo58566D().mo34889b(commentVideoModel));
        } else {
            edit.remove("comment_video_moodel");
        }
        C9402b.m18594a(edit);
    }

    /* renamed from: a */
    public static void m94982a(ExtractFramesModel extractFramesModel) {
        ExtractFramesModel extractFramesModel2 = new ExtractFramesModel(extractFramesModel.extractType);
        extractFramesModel2.extractFramesDir = extractFramesModel.extractFramesDir;
        if (extractFramesModel.frames != null && !extractFramesModel.frames.isEmpty()) {
            extractFramesModel2.frames.putAll(extractFramesModel.frames);
        }
        if (extractFramesModel.stickerFaces != null && !extractFramesModel.stickerFaces.isEmpty()) {
            extractFramesModel2.stickerFaces.putAll(extractFramesModel.stickerFaces);
        }
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putString("shot_extract_frame", C39629l.m88232a().mo58566D().mo34889b(extractFramesModel2));
        C9402b.m18594a(edit);
    }

    /* renamed from: a */
    public static void m94983a(ReactionParams reactionParams) {
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putString("reaction", C39629l.m88232a().mo58566D().mo34889b(reactionParams));
        C9402b.m18594a(edit);
    }

    /* renamed from: a */
    public static void m94984a(StitchParams stitchParams) {
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putString("stitch_params", C39629l.m88232a().mo58566D().mo34889b(stitchParams));
        C9402b.m18594a(edit);
    }

    /* renamed from: a */
    public static void m94985a(String str) {
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putString("creation_id", str);
        C9402b.m18594a(edit);
    }

    /* renamed from: b */
    public static void m94993b(String str, String str2) {
        Editor edit = C35807d.m80935a(C39629l.m88233b(), "publish", 0).edit();
        edit.putString("duet_video_path", str);
        edit.putString("duet_audio_path", str2);
        C9402b.m18594a(edit);
    }
}
