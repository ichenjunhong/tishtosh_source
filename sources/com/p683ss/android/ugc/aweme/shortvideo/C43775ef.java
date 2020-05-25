package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p030v4.p040os.C0958a;
import android.text.TextUtils;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C17971f;
import com.google.gson.C18083m;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.p1463br.C23967a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.photo.p2045a.C38653a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.services.watermark.IWaterMarkService.IWatermarkParam;
import com.p683ss.android.ugc.aweme.shortvideo.api.C42426a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43446ba;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43594e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractionCheckInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.C43560c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44370d;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44372f;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45454s;
import com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46688i;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46699k;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46700l;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46701m;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46702n;
import com.p683ss.android.ugc.aweme.utils.C47922gm;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import com.p683ss.android.vesdk.VEUtils;
import com.p683ss.android.vesdk.VEWatermarkParam;
import dmt.p2652av.video.C52972j;
import dmt.p2652av.video.C52979m;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ef */
public final class C43775ef {

    /* renamed from: a */
    public static final ExecutorService f110844a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49846a(C43780eg.f110851a).mo49847a());

    /* renamed from: b */
    private List<CreateAnchorInfo> f110845b = new ArrayList();

    /* renamed from: a */
    public static Bitmap m96219a(Object obj) {
        return m96218a((VideoPublishEditModel) obj);
    }

    /* renamed from: a */
    public static Bitmap m96218a(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (videoPublishEditModel.isMvThemeVideoType()) {
            String str2 = videoPublishEditModel.mvCreateVideoData.videoCoverImgPath;
            if (C48016e.m103944b(str2)) {
                return C45454s.m99048a(str2, 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED);
            }
        }
        if (videoPublishEditModel.isStatusVideoType()) {
            String videoCoverImgPath = videoPublishEditModel.statusCreateVideoData.getVideoCoverImgPath();
            if (C48016e.m103944b(videoCoverImgPath)) {
                return C45454s.m99048a(videoCoverImgPath, 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED);
            }
        }
        if (videoPublishEditModel.isMultiVideoEdit()) {
            String str3 = videoPublishEditModel.multiEditVideoRecordData.coverImagePath;
            if (C48016e.m103944b(str3)) {
                return C45454s.m99048a(str3, 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED);
            }
        }
        String validVideoCoverPath = videoPublishEditModel.getValidVideoCoverPath();
        if (validVideoCoverPath != null) {
            return C45454s.m99048a(validVideoCoverPath, 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED);
        }
        if (videoPublishEditModel.getPreviewInfo() == null) {
            str = "";
        } else {
            str = ((EditVideoSegment) videoPublishEditModel.getPreviewInfo().getVideoList().get(0)).getVideoPath();
        }
        C47922gm.m103690a();
        return C47922gm.m103689a(str, 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, 1);
    }

    /* renamed from: b */
    public static boolean m96221b(Object obj) {
        boolean z;
        String str;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (!videoPublishEditModel.isSaveLocal()) {
            return false;
        }
        String localTempPath = videoPublishEditModel.getLocalTempPath();
        boolean isSaveToLocalPathInsteadOfAlbum = videoPublishEditModel.isSaveToLocalPathInsteadOfAlbum();
        if (videoPublishEditModel.isSaveToAlbum() || !isSaveToLocalPathInsteadOfAlbum) {
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(localTempPath) || !new File(localTempPath).exists() || new File(localTempPath).length() <= 0) {
            return false;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(C23967a.m58772a(C39618d.f101160a));
            sb.append(new File(localTempPath).getName());
            str = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C39618d.f101182w.mo74168a((Context) C39618d.f101160a));
            sb2.append(new File(localTempPath).getName());
            str = sb2.toString();
        }
        if (!z || !C44372f.m97167a()) {
            C48016e.m103948c(localTempPath, str);
        } else {
            VEUtils.extractVideo(localTempPath, str);
        }
        videoPublishEditModel.mSaveModel.setLocalFinalPath(str);
        if (z) {
            C38653a.m85993a(C39618d.f101160a, str);
        }
        return true;
    }

    /* renamed from: a */
    private void m96220a(VideoPublishEditModel videoPublishEditModel, Collection<InteractStickerStruct> collection) {
        if (videoPublishEditModel != null && !C9376b.m18558a(collection) && C43446ba.m95223b(videoPublishEditModel)) {
            for (InteractStickerStruct interactStickerStruct : collection) {
                List<NormalTrackTimeStamp> list = null;
                try {
                    list = (List) C39618d.f101139C.getRetrofitFactoryGson().mo34885a(interactStickerStruct.getTrackList(), new C17956a<List<NormalTrackTimeStamp>>() {
                    }.f49843c);
                } catch (Exception unused) {
                }
                if (C9414h.m18631b(list)) {
                    for (NormalTrackTimeStamp normalTrackTimeStamp : list) {
                        if (normalTrackTimeStamp != null) {
                            float[] a = C43446ba.m95222a(normalTrackTimeStamp.getX(), normalTrackTimeStamp.getY(), videoPublishEditModel.mVideoCanvasWidth, videoPublishEditModel.mVideoCanvasHeight, videoPublishEditModel.mOutVideoWidth, videoPublishEditModel.mOutVideoHeight);
                            normalTrackTimeStamp.setX(C43560c.m95657b(a[0]));
                            normalTrackTimeStamp.setY(C43560c.m95657b(a[1]));
                        }
                    }
                    try {
                        interactStickerStruct.setTrackList(C39618d.f101161b.mo34889b(list));
                    } catch (C18083m unused2) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:219:0x071f, code lost:
        if (r0 == null) goto L_0x0721;
     */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x069e  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x06a3  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x071b  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0729  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0732  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0747  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0750  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0767 A[SYNTHETIC, Splitter:B:233:0x0767] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0785  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x078c  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x07a8  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x07ab  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x07b6  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x07b9  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x07c6  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x07c9  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x07d6  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x07d9  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x07e2  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x07ff  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0872  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0875  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0880  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0890  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x0893  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x08af  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x08b2  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x08cc  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x08cf  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x08d8  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x08e5  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x08e8  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x08f3  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0927  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x095d  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x095f  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x096e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89283a(com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12, java.util.LinkedHashMap<java.lang.String, java.lang.String> r13) {
        /*
            r11 = this;
            java.lang.String r0 = r12.reviewVideoId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002c
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.f109286a
            if (r0 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.shortvideo.dh r0 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r0 = r0.f109286a
            java.lang.String r0 = r0.mid
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "music_id"
            com.ss.android.ugc.aweme.shortvideo.dh r1 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
            com.ss.android.ugc.aweme.shortvideo.c r1 = r1.f109286a
            java.lang.String r1 = r1.mid
            r13.put(r0, r1)
            goto L_0x005d
        L_0x002c:
            java.lang.String r0 = r12.musicId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "music_id"
            java.lang.String r1 = r12.musicId
            r13.put(r0, r1)
            goto L_0x005d
        L_0x003c:
            boolean r0 = r12.isStitchMode()
            if (r0 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r0 = r12.stitchParams
            if (r0 == 0) goto L_0x005d
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r0 = r12.stitchParams
            java.lang.String r0 = r0.getMusicId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "music_id"
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r1 = r12.stitchParams
            java.lang.String r1 = r1.getMusicId()
            r13.put(r0, r1)
        L_0x005d:
            java.lang.String r0 = "original"
            int r1 = r12.getOriginal()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r13.put(r0, r1)
            java.lang.String r0 = r12.creationId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "creation_id"
            java.lang.String r1 = r12.creationId
            r13.put(r0, r1)
        L_0x0079:
            java.lang.String r0 = r12.ccVid
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0088
            java.lang.String r0 = "cc_vid"
            java.lang.String r1 = r12.ccVid
            r13.put(r0, r1)
        L_0x0088:
            java.lang.String r0 = r12.getSpeed()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "speed"
            java.lang.String r1 = r12.getSpeed()
            r13.put(r0, r1)
        L_0x009b:
            java.lang.String r0 = "args"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            java.lang.String r0 = "fieldmap"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r0 = r12.commentVideoModel
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "reply_id"
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r1 = r12.commentVideoModel
            java.lang.String r1 = r1.getReplyId()
            r13.put(r0, r1)
            java.lang.String r0 = "reply_to_reply_id"
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r1 = r12.commentVideoModel
            java.lang.String r1 = r1.getReplyToReplyId()
            r13.put(r0, r1)
            java.lang.String r0 = "channel_id"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r2 = r12.commentVideoModel
            int r2 = r2.getChannelId()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.put(r0, r1)
            java.lang.String r0 = "reply_aweme_id"
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r1 = r12.commentVideoModel
            java.lang.String r1 = r1.getAwemeId()
            r13.put(r0, r1)
            java.lang.String r0 = "reply_user_id"
            com.ss.android.ugc.aweme.comment.model.CommentVideoModel r1 = r12.commentVideoModel
            java.lang.String r1 = r1.getUserId()
            r13.put(r0, r1)
        L_0x00f0:
            java.lang.String r0 = r12.getStickers()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0129
            java.lang.String r0 = "stickers"
            java.lang.String r1 = r12.getStickers()
            r13.put(r0, r1)
            java.lang.String r0 = r12.getPropSource()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0116
            java.lang.String r0 = "prop_selected_from"
            java.lang.String r1 = r12.getPropSource()
            r13.put(r0, r1)
        L_0x0116:
            java.lang.String r0 = r12.getPropGradeKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0129
            java.lang.String r0 = "grade_prop_list"
            java.lang.String r1 = r12.getPropGradeKey()
            r13.put(r0, r1)
        L_0x0129:
            java.lang.String r0 = r12.getFilterName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x013c
            java.lang.String r0 = "filter_name"
            java.lang.String r1 = r12.getFilterName()
            r13.put(r0, r1)
        L_0x013c:
            java.lang.String r0 = r12.getFilterIds()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x014f
            java.lang.String r0 = "filter_id"
            java.lang.String r1 = r12.getFilterIds()
            r13.put(r0, r1)
        L_0x014f:
            java.lang.String r0 = "camera"
            int r1 = r12.getCamera()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r13.put(r0, r1)
            java.lang.String r0 = "prettify"
            int r1 = r12.getPrettify()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r13.put(r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r1 = r12.mEffectList
            boolean r1 = com.bytedance.common.utility.C9414h.m18631b(r1)
            if (r1 == 0) goto L_0x017b
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r1 = r12.mEffectList
            r0.addAll(r1)
        L_0x017b:
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r12.mTimeEffect
            if (r1 == 0) goto L_0x0184
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r12.mTimeEffect
            r0.add(r1)
        L_0x0184:
            boolean r1 = com.bytedance.common.utility.C9414h.m18631b(r0)
            if (r1 == 0) goto L_0x01ba
            java.lang.String r1 = "fx_name"
            com.google.b.a.f r2 = com.p683ss.android.ugc.aweme.effect.C29210o.f76516a
            java.util.List r2 = com.google.p1057b.p1060c.C17593ar.m43278a(r0, r2)
            com.google.b.a.l r3 = com.p683ss.android.ugc.aweme.effect.C29211p.f76517a
            java.util.Collection r2 = com.google.p1057b.p1060c.C17699l.m43482a(r2, r3)
            com.google.b.c.ak r2 = com.google.p1057b.p1060c.C17570ak.copyOf(r2)
            java.lang.String r3 = ","
            java.lang.String r2 = android.text.TextUtils.join(r3, r2)
            r13.put(r1, r2)
            java.lang.String r1 = "effect_id"
            com.google.b.a.f r2 = com.p683ss.android.ugc.aweme.effect.C29209n.f76515a
            java.util.List r0 = com.google.p1057b.p1060c.C17593ar.m43278a(r0, r2)
            com.google.b.c.ak r0 = com.google.p1057b.p1060c.C17570ak.copyOf(r0)
            java.lang.String r2 = ","
            java.lang.String r0 = android.text.TextUtils.join(r2, r0)
            r13.put(r1, r0)
        L_0x01ba:
            java.lang.String r0 = r12.mId3Author
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01c9
            java.lang.String r0 = "author"
            java.lang.String r1 = r12.mId3Author
            r13.put(r0, r1)
        L_0x01c9:
            java.lang.String r0 = r12.mId3Title
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01d8
            java.lang.String r0 = "title"
            java.lang.String r1 = r12.mId3Title
            r13.put(r0, r1)
        L_0x01d8:
            java.lang.String r0 = r12.mId3Album
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01e7
            java.lang.String r0 = "album"
            java.lang.String r1 = r12.mId3Album
            r13.put(r0, r1)
        L_0x01e7:
            int r0 = r12.mMusicType
            if (r0 <= 0) goto L_0x01f6
            java.lang.String r0 = "music_type"
            int r1 = r12.mMusicType
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r13.put(r0, r1)
        L_0x01f6:
            java.lang.String r0 = r12.getDuetFrom()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0209
            java.lang.String r0 = "duet_from"
            java.lang.String r1 = r12.getDuetFrom()
            r13.put(r0, r1)
        L_0x0209:
            java.lang.String r0 = r12.shopDraftId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0218
            java.lang.String r0 = "shop_draft_id"
            java.lang.String r1 = r12.shopDraftId
            r13.put(r0, r1)
        L_0x0218:
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r0 = r12.stitchParams
            if (r0 == 0) goto L_0x0233
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r0 = r12.stitchParams
            java.lang.String r0 = r0.getAwemeId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0233
            java.lang.String r0 = "stitch_from"
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r1 = r12.stitchParams
            java.lang.String r1 = r1.getAwemeId()
            r13.put(r0, r1)
        L_0x0233:
            java.lang.String r0 = "is_upload_audio_track"
            boolean r1 = r12.shouldUploadOriginalSound()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r13.put(r0, r1)
            java.lang.String r0 = "is_multi_video_upload"
            boolean r1 = r12.mIsMultiVideo
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r13.put(r0, r1)
            int r0 = r12.recordMode
            r1 = 1
            if (r0 != r1) goto L_0x0266
            java.lang.String r0 = "game_type"
            int r2 = r12.recordMode
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r13.put(r0, r2)
            java.lang.String r0 = "game_score"
            int r2 = r12.gameScore
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r13.put(r0, r2)
        L_0x0266:
            java.lang.String r0 = "use_camera_type"
            com.ss.android.ugc.aweme.property.l r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r3 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.RecordUseSuccessCameraType
            int r2 = r2.mo83118b(r3)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r13.put(r0, r2)
            com.ss.android.ugc.aweme.property.l r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.RecordUseSuccessRecordProfile
            int r0 = r0.mo83118b(r2)
            java.lang.String r2 = "h264_high_profile"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.put(r2, r0)
            java.lang.String r0 = "camera_compat_level"
            com.ss.android.medialib.camera.g r2 = com.p683ss.android.medialib.camera.C19274g.m47034b()
            com.ss.android.medialib.camera.f r3 = r2.f53191b
            boolean r3 = r3 instanceof com.p683ss.android.medialib.camera.C19250b
            r4 = 0
            if (r3 == 0) goto L_0x029c
            com.ss.android.medialib.camera.f r2 = r2.f53191b
            com.ss.android.medialib.camera.b r2 = (com.p683ss.android.medialib.camera.C19250b) r2
            int r2 = r2.f53128e
            goto L_0x029d
        L_0x029c:
            r2 = 0
        L_0x029d:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r13.put(r0, r2)
            java.lang.String r0 = r12.mEyesLabels
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02b3
            java.lang.String r0 = "eye"
            java.lang.String r2 = r12.mEyesLabels
            r13.put(r0, r2)
        L_0x02b3:
            java.lang.String r0 = r12.mReshapeLabels
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02c2
            java.lang.String r0 = "shape"
            java.lang.String r2 = r12.mReshapeLabels
            r13.put(r0, r2)
        L_0x02c2:
            java.lang.String r0 = r12.mTanningLabels
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02d1
            java.lang.String r0 = "tanning"
            java.lang.String r2 = r12.mTanningLabels
            r13.put(r0, r2)
        L_0x02d1:
            java.lang.String r0 = r12.mSmoothSkinLabels
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02e0
            java.lang.String r0 = "smooth"
            java.lang.String r2 = r12.mSmoothSkinLabels
            r13.put(r0, r2)
        L_0x02e0:
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo> r0 = r12.importInfoList
            boolean r0 = com.bytedance.common.utility.C9414h.m18631b(r0)
            if (r0 == 0) goto L_0x0337
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo> r2 = r12.importInfoList
            java.util.Iterator r2 = r2.iterator()
        L_0x02f3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x032e
            java.lang.Object r3 = r2.next()
            com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo r3 = (com.p683ss.android.ugc.aweme.shortvideo.ImportVideoInfo) r3
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "h"
            int r7 = r3.getVideoHeight()     // Catch:{ JSONException -> 0x032c }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x032c }
            java.lang.String r6 = "w"
            int r7 = r3.getVideoWidth()     // Catch:{ JSONException -> 0x032c }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x032c }
            java.lang.String r6 = "b"
            int r7 = r3.getBitRate()     // Catch:{ JSONException -> 0x032c }
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x032c }
            java.lang.String r6 = "e"
            int r3 = r3.getEncodeId()     // Catch:{ JSONException -> 0x032c }
            r5.put(r6, r3)     // Catch:{ JSONException -> 0x032c }
            r0.put(r5)     // Catch:{ JSONException -> 0x032c }
            goto L_0x02f3
        L_0x032c:
            goto L_0x02f3
        L_0x032e:
            java.lang.String r2 = "import_video_info"
            java.lang.String r0 = r0.toString()
            r13.put(r2, r0)
        L_0x0337:
            com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r0 = r12.getReactionParams()
            if (r0 == 0) goto L_0x042b
            com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r0 = r12.getReactionParams()
            java.lang.String r0 = r0.reactionFromId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x042b
            java.lang.String r0 = "react_from"
            com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r2 = r12.getReactionParams()
            java.lang.String r2 = r2.reactionFromId
            r13.put(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r0 = r12.getReactionParams()
            java.lang.String r0 = r0.reactionOriginId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x036b
            java.lang.String r0 = "react_origin"
            com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r2 = r12.getReactionParams()
            java.lang.String r2 = r2.reactionOriginId
            r13.put(r0, r2)
        L_0x036b:
            com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r0 = r12.getReactionParams()
            java.lang.String r0 = r0.reactionViewId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0382
            java.lang.String r0 = "react_view"
            com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r2 = r12.getReactionParams()
            java.lang.String r2 = r2.reactionViewId
            r13.put(r0, r2)
        L_0x0382:
            com.google.gson.f r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101161b
            com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r2 = r12.getReactionParams()
            java.util.List<com.ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo> r2 = r2.windowInfoList
            boolean r2 = com.bytedance.common.utility.C9414h.m18631b(r2)
            if (r2 == 0) goto L_0x042b
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r7 = r12.getReactionParams()
            java.util.List<com.ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo> r7 = r7.windowInfoList
            java.util.Iterator r7 = r7.iterator()
        L_0x03ae:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0407
            java.lang.Object r8 = r7.next()
            com.ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo r8 = (com.p683ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r8.getWidth()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r2.add(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r8.getHeight()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r3.add(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            float r10 = r8.getAngle()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r5.add(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r8 = r8.getType()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r6.add(r8)
            goto L_0x03ae
        L_0x0407:
            java.lang.String r7 = "react_width"
            java.lang.String r2 = r0.mo34889b(r2)
            r13.put(r7, r2)
            java.lang.String r2 = "react_height"
            java.lang.String r3 = r0.mo34889b(r3)
            r13.put(r2, r3)
            java.lang.String r2 = "react_angle"
            java.lang.String r3 = r0.mo34889b(r5)
            r13.put(r2, r3)
            java.lang.String r2 = "react_type"
            java.lang.String r0 = r0.mo34889b(r6)
            r13.put(r2, r0)
        L_0x042b:
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r0 = r12.stitchParams
            if (r0 == 0) goto L_0x043a
            java.lang.String r0 = "stitch_from"
            com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams r2 = r12.stitchParams
            java.lang.String r2 = r2.getAwemeId()
            r13.put(r0, r2)
        L_0x043a:
            java.lang.String r0 = "music_begin_time"
            int r2 = r12.mMusicStart
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r13.put(r0, r2)
            java.lang.String r0 = "music_end_time"
            int r2 = r12.mMusicStart
            int r3 = r12.getVideoLength()
            int r2 = r2 + r3
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r13.put(r0, r2)
            java.lang.String r0 = r12.duetLayout
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0464
            java.lang.String r0 = "duet_layout"
            java.lang.String r2 = r12.duetLayout
            r13.put(r0, r2)
        L_0x0464:
            boolean r0 = r12.hasInfoStickers()
            if (r0 == 0) goto L_0x0480
            java.lang.String r0 = "info_sticker"
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r2 = r12.infoStickerModel
            java.lang.String r2 = r2.getInfoStickerIds()
            r13.put(r0, r2)
            java.lang.String r0 = "other_sticker"
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r2 = r12.infoStickerModel
            java.lang.String r2 = r2.getOtherEffect()
            r13.put(r0, r2)
        L_0x0480:
            java.lang.String r0 = "music_selected_from"
            java.lang.String r2 = r12.getMusicOrigin()
            r13.put(r0, r2)
            java.lang.String r0 = r12.mMusicOrigin
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04b1
            java.lang.String r0 = "edit_page_recommend"
            java.lang.String r2 = r12.mMusicOrigin
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x04b1
            java.lang.String r0 = "music_show_rank"
            int r2 = r12.mMusicShowRank
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r13.put(r0, r2)
            java.lang.String r0 = "music_rec_type"
            int r2 = r12.mMusicRecType
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r13.put(r0, r2)
        L_0x04b1:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.g r0 = r12.getMainBusinessContext()
            if (r0 == 0) goto L_0x053c
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.g r0 = r12.getMainBusinessContext()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.f[] r2 = new com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f[r1]
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.f r3 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f.TRACK_PAGE_EDIT
            r2[r4] = r3
            java.util.List r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d.m95727a(r0, r2)
            java.util.List<com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo> r2 = r11.f110845b
            java.util.List r3 = com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46717e.m101406c(r0)
            r2.addAll(r3)
            java.util.List<com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo> r2 = r11.f110845b
            java.util.List r3 = com.p683ss.android.ugc.aweme.story.shootvideo.textrecord.C46717e.m101407d(r0)
            r2.addAll(r3)
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r0)
            if (r2 != 0) goto L_0x04f7
            com.ss.android.ugc.aweme.shortvideo.ef$3 r2 = new com.ss.android.ugc.aweme.shortvideo.ef$3
            r2.<init>()
            java.util.Collections.sort(r0, r2)
            r11.m96220a(r12, r0)
            java.lang.String r2 = "interaction_stickers"
            com.ss.android.ugc.aweme.port.in.ax r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101139C
            com.google.gson.f r3 = r3.getRetrofitFactoryGson()
            java.lang.String r0 = r3.mo34889b(r0)
            r13.put(r2, r0)
        L_0x04f7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "info_sticker"
            boolean r2 = r13.containsKey(r2)
            if (r2 == 0) goto L_0x0515
            java.lang.String r2 = "info_sticker"
            java.lang.Object r2 = r13.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r2)
            if (r3 != 0) goto L_0x0515
            r0.append(r2)
        L_0x0515:
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.g r2 = r12.getMainBusinessContext()
            android.support.v4.f.k r2 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d.m95729b(r2)
            F r2 = r2.f2711a
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r0.length()
            if (r3 != 0) goto L_0x052b
            r0.append(r2)
            goto L_0x0533
        L_0x052b:
            java.lang.String r3 = ","
            r0.append(r3)
            r0.append(r2)
        L_0x0533:
            java.lang.String r2 = "info_sticker"
            java.lang.String r0 = r0.toString()
            r13.put(r2, r0)
        L_0x053c:
            if (r12 == 0) goto L_0x056b
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.g r0 = r12.getMainBusinessContext()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.f[] r2 = new com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f[r1]
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.f r3 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f.TRACK_PAGE_RECORD
            r2[r4] = r3
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e r0 = com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d.m95720a(r0)
            if (r0 == 0) goto L_0x0562
            boolean r5 = r0.isEmpty(r2)
            if (r5 == 0) goto L_0x055a
            goto L_0x0562
        L_0x055a:
            java.util.List r0 = r0.getStickerStructsByPage(r2)
            r3.addAll(r0)
            goto L_0x0563
        L_0x0562:
            r3 = 0
        L_0x0563:
            boolean r0 = com.bytedance.common.utility.p522b.C9376b.m18558a(r3)
            if (r0 != 0) goto L_0x056b
            r0 = 1
            goto L_0x056c
        L_0x056b:
            r0 = 0
        L_0x056c:
            if (r0 == 0) goto L_0x0577
            java.lang.String r0 = "aweme_type"
            java.lang.String r2 = "54"
            r13.put(r0, r2)
            goto L_0x0604
        L_0x0577:
            boolean r0 = r12.isMvThemeVideoType()
            if (r0 == 0) goto L_0x0586
            java.lang.String r0 = "aweme_type"
            java.lang.String r2 = "53"
            r13.put(r0, r2)
            goto L_0x0604
        L_0x0586:
            boolean r0 = r12.isStitchMode()
            if (r0 == 0) goto L_0x0594
            java.lang.String r0 = "aweme_type"
            java.lang.String r2 = "58"
            r13.put(r0, r2)
            goto L_0x0604
        L_0x0594:
            boolean r0 = r12.isStickPointMode
            if (r0 == 0) goto L_0x05e9
            java.lang.String r0 = "aweme_type"
            java.lang.String r2 = "55"
            r13.put(r0, r2)
            java.lang.String r0 = "video_id"
            java.lang.Object r0 = r13.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.f108636a
            com.ss.android.ugc.aweme.shortvideo.x.a r3 = r12.stickPointData
            if (r3 == 0) goto L_0x0604
            boolean r3 = com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f.m94311d()
            if (r3 == 0) goto L_0x0604
            com.ss.android.ugc.aweme.shortvideo.x.a r3 = r12.stickPointData
            java.lang.String r3 = r3.getAiCutId()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x05ca
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x05ca
            com.ss.android.ugc.aweme.shortvideo.x.a r3 = r12.stickPointData
            r3.setAiCutId(r2)
        L_0x05ca:
            com.ss.android.ugc.aweme.shortvideo.x.a r2 = r12.stickPointData
            java.lang.String r2 = r2.getAiCutId()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0604
            com.ss.android.ugc.aweme.shortvideo.x.a r2 = r12.stickPointData
            r2.setVideoId(r0)
            com.google.gson.f r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101161b
            com.ss.android.ugc.aweme.shortvideo.x.a r2 = r12.stickPointData
            java.lang.String r0 = r0.mo34889b(r2)
            java.lang.String r2 = "stick_point_data"
            r13.put(r2, r0)
            goto L_0x0604
        L_0x05e9:
            boolean r0 = r12.isStatusVideoType()
            if (r0 == 0) goto L_0x05f7
            java.lang.String r0 = "aweme_type"
            java.lang.String r2 = "56"
            r13.put(r0, r2)
            goto L_0x0604
        L_0x05f7:
            boolean r0 = r12.isGreenScreen()
            if (r0 == 0) goto L_0x0604
            java.lang.String r0 = "aweme_type"
            java.lang.String r2 = "60"
            r13.put(r0, r2)
        L_0x0604:
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r0 = r12.statusCreateVideoData
            if (r0 == 0) goto L_0x0694
            java.lang.String r0 = "status_background_size"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r3 = r12.statusCreateVideoData
            int r3 = r3.getBgSize()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r13.put(r0, r2)
            java.lang.String r0 = "status_background_height"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r3 = r12.statusCreateVideoData
            int r3 = r3.getBgHeight()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r13.put(r0, r2)
            java.lang.String r0 = "status_background_width"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r3 = r12.statusCreateVideoData
            int r3 = r3.getBgHeight()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r13.put(r0, r2)
            java.lang.String r0 = "status_template_text"
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r2 = r12.statusCreateVideoData
            java.lang.String r2 = r2.getTemplateText()
            r13.put(r0, r2)
            java.lang.String r0 = "status_user_text"
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r2 = r12.statusCreateVideoData
            java.lang.String r2 = r2.getUserText()
            r13.put(r0, r2)
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r0 = r12.statusCreateVideoData
            java.lang.String r0 = r0.getUserText()
            int r0 = r0.length()
            java.lang.String r2 = "status_text_length"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r13.put(r2, r0)
            java.lang.String r0 = "status_background_id"
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r2 = r12.statusCreateVideoData
            java.lang.String r2 = r2.getBgId()
            r13.put(r0, r2)
            java.lang.String r0 = "status_background_selected_from"
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r2 = r12.statusCreateVideoData
            java.lang.String r2 = r2.getBgFrom()
            r13.put(r0, r2)
        L_0x0694:
            java.lang.String r0 = r12.getDescriptionByUpload()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x06a3
            java.lang.String r0 = com.p683ss.android.ugc.aweme.shortvideo.upload.C45307k.m98775a(r12)
            goto L_0x06c0
        L_0x06a3:
            java.lang.String r2 = "music_id"
            java.lang.Object r2 = r13.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x06c0
            java.lang.String r2 = r12.getMusicIdByUpload()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x06c0
            java.lang.String r3 = "music_id"
            r13.put(r3, r2)
        L_0x06c0:
            boolean r2 = r12.isCutSameVideoType()
            if (r2 == 0) goto L_0x06e7
            java.lang.String r2 = "music_id"
            java.lang.Object r2 = r13.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x06e7
            com.ss.android.ugc.aweme.draft.model.CutSameEditData r2 = r12.cutSameEditData
            java.lang.String r2 = r2.f76013f
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x06e7
            java.lang.String r2 = "music_id"
            com.ss.android.ugc.aweme.draft.model.CutSameEditData r3 = r12.cutSameEditData
            java.lang.String r3 = r3.f76013f
            r13.put(r2, r3)
        L_0x06e7:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x06f2
            java.lang.String r2 = "source_info"
            r13.put(r2, r0)
        L_0x06f2:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r12.veAudioRecorderParam
            if (r0 == 0) goto L_0x0700
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r12.veAudioRecorderParam
            boolean r0 = r0.hasRecord()
            if (r0 == 0) goto L_0x0700
            r0 = 1
            goto L_0x0701
        L_0x0700:
            r0 = 0
        L_0x0701:
            java.lang.String r2 = "is_dubbed"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r13.put(r2, r0)
            java.lang.String r0 = "args"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r12.veAudioEffectParam
            if (r0 == 0) goto L_0x0721
            java.lang.String r0 = r0.getUploadId()
            if (r0 != 0) goto L_0x0723
        L_0x0721:
            java.lang.String r0 = ""
        L_0x0723:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x072e
            java.lang.String r2 = "voice_modify_id"
            r13.put(r2, r0)
        L_0x072e:
            com.ss.android.ugc.aweme.draft.model.VideoCategoryParam r0 = r12.videoCategory
            if (r0 == 0) goto L_0x0741
            com.ss.android.ugc.aweme.draft.model.VideoCategoryParam r0 = r12.videoCategory
            int r0 = r0.getCategoryIndex()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "category"
            r13.put(r2, r0)
        L_0x0741:
            boolean r0 = r12.isMvThemeVideoType()
            if (r0 == 0) goto L_0x0750
            com.ss.android.ugc.aweme.at.b r0 = r12.mvCreateVideoData
            int r0 = r0.videoCoverStartTime
            float r0 = (float) r0
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r2
            goto L_0x0752
        L_0x0750:
            float r0 = r12.mVideoCoverStartTm
        L_0x0752:
            java.lang.String r2 = "cover_tsp"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r13.put(r2, r0)
            com.ss.android.ugc.aweme.shortvideo.j r0 = r12.uploadMiscInfoStruct
            if (r0 == 0) goto L_0x077f
            com.google.gson.f r0 = new com.google.gson.f     // Catch:{ Exception -> 0x077e }
            r0.<init>()     // Catch:{ Exception -> 0x077e }
            com.ss.android.ugc.aweme.shortvideo.j r2 = r12.uploadMiscInfoStruct     // Catch:{ Exception -> 0x077e }
            java.lang.String r0 = r0.mo34889b(r2)     // Catch:{ Exception -> 0x077e }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x077e }
            if (r2 != 0) goto L_0x077f
            java.lang.String r2 = "misc_info"
            r13.put(r2, r0)     // Catch:{ Exception -> 0x077e }
            goto L_0x077f
        L_0x077e:
        L_0x077f:
            java.lang.String r0 = "countdown_list"
            java.util.ArrayList<java.lang.Integer> r2 = r12.countDownModes
            if (r2 == 0) goto L_0x078c
            java.util.ArrayList<java.lang.Integer> r2 = r12.countDownModes
            java.lang.String r2 = r2.toString()
            goto L_0x078e
        L_0x078c:
            java.lang.String r2 = ""
        L_0x078e:
            r13.put(r0, r2)
            java.lang.String r0 = "is_music_looped"
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r3 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RearMusicAutoLoop
            boolean r2 = r2.mo83103a(r3)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r13.put(r0, r2)
            java.lang.String r0 = "text_fonts"
            java.lang.String r2 = r12.textTypes
            if (r2 == 0) goto L_0x07ab
            java.lang.String r2 = r12.textTypes
            goto L_0x07ad
        L_0x07ab:
            java.lang.String r2 = ""
        L_0x07ad:
            r13.put(r0, r2)
            java.lang.String r0 = "text_font_effect_ids"
            java.lang.String r2 = r12.textEffectIds
            if (r2 == 0) goto L_0x07b9
            java.lang.String r2 = r12.textEffectIds
            goto L_0x07bb
        L_0x07b9:
            java.lang.String r2 = ""
        L_0x07bb:
            r13.put(r0, r2)
            java.lang.String r0 = "is_subtitled"
            boolean r2 = r12.hasSubtitle()
            if (r2 == 0) goto L_0x07c9
            java.lang.String r2 = "1"
            goto L_0x07cb
        L_0x07c9:
            java.lang.String r2 = "0"
        L_0x07cb:
            r13.put(r0, r2)
            java.lang.String r0 = "has_text"
            boolean r2 = r12.hasText()
            if (r2 == 0) goto L_0x07d9
            java.lang.String r2 = "1"
            goto L_0x07db
        L_0x07d9:
            java.lang.String r2 = "0"
        L_0x07db:
            r13.put(r0, r2)
            int r0 = r12.mentionEditTextLength
            if (r0 < 0) goto L_0x07f5
            java.lang.String r0 = "caption_word_cnt"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r12.mentionEditTextLength
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r13.put(r0, r2)
        L_0x07f5:
            com.ss.android.ugc.aweme.property.h r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableFilterIntensityJust
            boolean r0 = r0.mo83103a(r2)
            if (r0 == 0) goto L_0x0854
            int r0 = r12.mSelectedId
            if (r0 != 0) goto L_0x0808
            int r0 = r12.mRecordVideoSelectedFilterIndex
            float r2 = r12.mRecordVideoSelectedFilterIntensity
            goto L_0x080c
        L_0x0808:
            int r0 = r12.mSelectedId
            float r2 = r12.mSelectedFilterIntensity
        L_0x080c:
            java.lang.String r3 = "filter_value"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r13.put(r3, r5)
            com.ss.android.ugc.aweme.port.in.u r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101144H
            com.ss.android.ugc.aweme.filter.c.a r3 = r3.mo58584o()
            com.ss.android.ugc.aweme.filter.c.c r3 = r3.mo64333c()
            com.ss.android.ugc.aweme.filter.g r0 = r3.mo64346b(r0)
            float r3 = r0.f82334k
            float r3 = r3 - r2
            float r2 = java.lang.Math.abs(r3)
            double r2 = (double) r2
            r5 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0847
            float r0 = r0.f82334k
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0845
            goto L_0x0847
        L_0x0845:
            r0 = 0
            goto L_0x0848
        L_0x0847:
            r0 = 1
        L_0x0848:
            java.lang.String r2 = "is_original_filter"
            if (r0 == 0) goto L_0x084f
            java.lang.String r0 = "1"
            goto L_0x0851
        L_0x084f:
            java.lang.String r0 = "0"
        L_0x0851:
            r13.put(r2, r0)
        L_0x0854:
            java.lang.String r0 = "beautify_info"
            java.lang.String r2 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58351a()
            r13.put(r0, r2)
            java.lang.String r0 = "beautify_used"
            int r2 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58353b()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r13.put(r0, r2)
            java.lang.String r0 = "is_composer"
            boolean r2 = com.p683ss.android.ugc.aweme.beauty.C23780d.m58365a()
            if (r2 == 0) goto L_0x0875
            java.lang.String r2 = "1"
            goto L_0x0877
        L_0x0875:
            java.lang.String r2 = "0"
        L_0x0877:
            r13.put(r0, r2)
            java.lang.String r0 = "fast_import"
            boolean r2 = r12.isFastImport
            if (r2 == 0) goto L_0x0883
            java.lang.String r2 = "1"
            goto L_0x0885
        L_0x0883:
            java.lang.String r2 = "0"
        L_0x0885:
            r13.put(r0, r2)
            java.lang.String r0 = "music_volume"
            java.lang.String r2 = r12.mMusicPath
            r3 = 1120403456(0x42c80000, float:100.0)
            if (r2 != 0) goto L_0x0893
            java.lang.String r2 = ""
            goto L_0x08a4
        L_0x0893:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            float r5 = r12.musicVolume
            float r5 = r5 * r3
            int r5 = (int) r5
            r2.append(r5)
            java.lang.String r2 = r2.toString()
        L_0x08a4:
            r13.put(r0, r2)
            java.lang.String r0 = "origin_volume"
            boolean r2 = r12.hasOriginalSound()
            if (r2 != 0) goto L_0x08b2
            java.lang.String r2 = ""
            goto L_0x08c3
        L_0x08b2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            float r5 = r12.voiceVolume
            float r5 = r5 * r3
            int r3 = (int) r5
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L_0x08c3:
            r13.put(r0, r2)
            java.lang.String r0 = "improve_status"
            boolean r2 = r12.autoEnhanceOn
            if (r2 == 0) goto L_0x08cf
            java.lang.String r2 = "1"
            goto L_0x08d1
        L_0x08cf:
            java.lang.String r2 = "0"
        L_0x08d1:
            r13.put(r0, r2)
            java.util.HashMap r0 = r12.poiServerMobParam
            if (r0 == 0) goto L_0x08dd
            java.util.HashMap r0 = r12.poiServerMobParam
            r13.putAll(r0)
        L_0x08dd:
            java.lang.String r0 = "is_trimmed"
            boolean r2 = r12.isUseMultiEdit()
            if (r2 == 0) goto L_0x08e8
            java.lang.String r2 = "1"
            goto L_0x08ea
        L_0x08e8:
            java.lang.String r2 = "0"
        L_0x08ea:
            r13.put(r0, r2)
            boolean r0 = r12.publishFromLiveScreenCapture()
            if (r0 == 0) goto L_0x0927
            java.lang.String r0 = "live_type"
            java.lang.String r2 = "live_record"
            r13.put(r0, r2)
            java.lang.String r0 = "live_id"
            com.ss.android.ugc.aweme.shortvideo.edit.LivePublishModel r2 = r12.livePublishModel
            java.lang.String r2 = r2.getRoomId()
            r13.put(r0, r2)
            java.lang.String r0 = "live_record_start_time"
            com.ss.android.ugc.aweme.shortvideo.edit.LivePublishModel r2 = r12.livePublishModel
            java.lang.String r2 = r2.getStartTime()
            r13.put(r0, r2)
            java.lang.String r0 = "live_record_end_time"
            com.ss.android.ugc.aweme.shortvideo.edit.LivePublishModel r2 = r12.livePublishModel
            java.lang.String r2 = r2.getEndTime()
            r13.put(r0, r2)
            java.lang.String r0 = "live_record_anchor_id"
            com.ss.android.ugc.aweme.shortvideo.edit.LivePublishModel r2 = r12.livePublishModel
            java.lang.String r2 = r2.getAnchorId()
            r13.put(r0, r2)
            goto L_0x094a
        L_0x0927:
            boolean r0 = r12.publishFromLiveHighLight()
            if (r0 == 0) goto L_0x094a
            java.lang.String r0 = "live_type"
            java.lang.String r2 = "live_highlight"
            r13.put(r0, r2)
            java.lang.String r0 = "live_id"
            com.ss.android.ugc.aweme.shortvideo.edit.LivePublishModel r2 = r12.livePublishModel
            java.lang.String r2 = r2.getRoomId()
            r13.put(r0, r2)
            java.lang.String r0 = "highlight_id"
            com.ss.android.ugc.aweme.shortvideo.edit.LivePublishModel r2 = r12.livePublishModel
            java.lang.String r2 = r2.getFragmentId()
            r13.put(r0, r2)
        L_0x094a:
            int r0 = r12.getVideoLength()
            java.lang.String r2 = "fieldMap"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r2)
            r2 = r13
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "is_long_video"
            r5 = 60000(0xea60, float:8.4078E-41)
            if (r0 <= r5) goto L_0x095f
            r0 = 1
            goto L_0x0960
        L_0x095f:
            r0 = 0
        L_0x0960:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.put(r3, r0)
            int r0 = r12.mShootMode
            r2 = 13
            if (r0 != r2) goto L_0x096e
            goto L_0x096f
        L_0x096e:
            r1 = 0
        L_0x096f:
            if (r1 != 0) goto L_0x097d
            boolean r0 = r12.containBackgroundVideo
            if (r0 != 0) goto L_0x097d
            java.lang.String r0 = r12.pic2VideoSource
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0984
        L_0x097d:
            java.lang.String r0 = "green_screen"
            java.lang.String r1 = "1"
            r13.put(r0, r1)
        L_0x0984:
            java.util.ArrayList<java.lang.String> r0 = r12.cameraLensInfo
            if (r0 == 0) goto L_0x099b
            java.lang.String r0 = r12.formatCameraLensInfo()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x099b
            java.lang.String r0 = "camera_lens_info"
            java.lang.String r12 = r12.formatCameraLensInfo()
            r13.put(r0, r12)
        L_0x099b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.C43775ef.mo89283a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.util.LinkedHashMap):void");
    }

    /* renamed from: a */
    public final C43211de<SynthetiseResult> mo89281a(VideoPublishEditModel videoPublishEditModel, C0958a aVar, boolean z) {
        IWatermarkParam iWatermarkParam;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        VEWatermarkParam vEWatermarkParam = null;
        int i = 2;
        if (videoPublishEditModel.isSaveLocalWithWaterMark()) {
            int[] a = C52979m.m112710a(videoPublishEditModel);
            C52972j.m112700a(videoPublishEditModel2, new Integer[]{Integer.valueOf(a[0]), Integer.valueOf(a[1])});
            final int[] iArr = {videoPublishEditModel2.mWatermarkVideoWidth, videoPublishEditModel2.mWatermarkVideoHeight};
            int saveType = videoPublishEditModel2.mSaveModel.getSaveType();
            boolean a2 = C43301dw.m94963a(saveType);
            iWatermarkParam = WaterMarkServiceImpl.createIWaterMarkServicebyMonsterPlugin().watermarkParamBuilderService().createWatermark(saveType, videoPublishEditModel.getLocalTempPath(), C39618d.f101183x.mo74285e(), iArr, true, videoPublishEditModel.getLocalTempPath(), a2);
            if (a2 && iWatermarkParam != null) {
                int i2 = iArr[1] - iArr[0];
                if (i2 > 0) {
                    iWatermarkParam.setYOffset(iWatermarkParam.getYOffset() + (i2 / 2));
                }
            }
            if (iWatermarkParam == null) {
                return new C43211de<SynthetiseResult>() {
                    {
                        StringBuilder sb = new StringBuilder("add water failed, context is ");
                        sb.append(iArr[0]);
                        sb.append(" ");
                        sb.append(iArr[1]);
                        mo34623a((Throwable) new C43809fd(sb.toString(), new SynthetiseResult()));
                    }
                };
            }
        } else {
            iWatermarkParam = null;
        }
        C39618d.m88217f();
        if (videoPublishEditModel2.mSaveModel == null || videoPublishEditModel2.mSaveModel.getSaveType() != 1) {
            i = 0;
        }
        C52979m mVar = new C52979m(i);
        if (iWatermarkParam != null) {
            vEWatermarkParam = (VEWatermarkParam) iWatermarkParam.getRaw();
        }
        return mVar.mo110544a(videoPublishEditModel2, vEWatermarkParam, aVar);
    }

    /* renamed from: a */
    public final void mo89282a(BaseShortVideoContext baseShortVideoContext, SynthetiseResult synthetiseResult, LinkedHashMap<String, String> linkedHashMap) {
        C43594e eVar;
        List list;
        int i;
        int[] a;
        C17971f fVar = C39618d.f101161b;
        if (baseShortVideoContext.challenges != null && !baseShortVideoContext.challenges.isEmpty()) {
            ArrayList arrayList = new ArrayList(baseShortVideoContext.challenges.size());
            for (AVChallenge cid : baseShortVideoContext.challenges) {
                arrayList.add(cid.getCid());
            }
            linkedHashMap.put("challenge_list", fVar.mo34889b(arrayList));
        }
        if (baseShortVideoContext.title != null) {
            linkedHashMap.put("text", baseShortVideoContext.title);
        }
        if (baseShortVideoContext.structList != null && !baseShortVideoContext.structList.isEmpty()) {
            String b = fVar.mo34889b(baseShortVideoContext.structList);
            if (b.contains("hashTagName")) {
                b = b.replaceAll("hashTagName", "hashtag_name");
            }
            linkedHashMap.put("text_extra", b);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.city)) {
            linkedHashMap.put("city", baseShortVideoContext.city);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.longitude)) {
            linkedHashMap.put("longitude", baseShortVideoContext.longitude);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.latitude)) {
            linkedHashMap.put("latitude", baseShortVideoContext.latitude);
        }
        linkedHashMap.put("is_private", String.valueOf(baseShortVideoContext.isPrivate));
        linkedHashMap.put("is_hash_tag", "1");
        if (!TextUtils.isEmpty(baseShortVideoContext.mSyncPlatforms)) {
            for (int i2 : C42426a.m93192a(baseShortVideoContext.mSyncPlatforms)) {
                if (i2 != 100) {
                    switch (i2) {
                        case 0:
                            linkedHashMap.put("sync_to_hotsoon", "1");
                            break;
                        case 1:
                            linkedHashMap.put("sync_to_toutiao", "1");
                            break;
                        case 2:
                            linkedHashMap.put("sync_to_duoshan", "1");
                            break;
                    }
                } else {
                    linkedHashMap.put("sync_to_helo", "1");
                }
            }
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.mShootWay)) {
            linkedHashMap.put("shoot_way", baseShortVideoContext.mShootWay);
        }
        linkedHashMap.put("is_hard_code", String.valueOf(synthetiseResult.getReportHardEncode()));
        if (!TextUtils.isEmpty(synthetiseResult.cpuName)) {
            linkedHashMap.put("cpu_info", synthetiseResult.cpuName);
        }
        if (!TextUtils.isEmpty(synthetiseResult.gpuName)) {
            linkedHashMap.put("gpu_info", synthetiseResult.gpuName);
        }
        linkedHashMap.put("file_fps", String.valueOf(synthetiseResult.getFps()));
        linkedHashMap.put("item_comment", String.valueOf(baseShortVideoContext.commentSetting));
        C52711k.m112240b(baseShortVideoContext, "args");
        C52711k.m112240b(linkedHashMap, "fieldmap");
        Map map = linkedHashMap;
        map.put("item_react", String.valueOf(baseShortVideoContext.reactDuetSetting));
        map.put("item_duet", String.valueOf(baseShortVideoContext.reactDuetSetting));
        if (C39618d.f101151O.mo83117a(C40796a.PostDownloadSetting) && C39618d.f101152P.mo83104b(C40790a.EnablePublishPrivacySetting) == 2) {
            map.put("item_download", String.valueOf(baseShortVideoContext.allowDownloadSetting));
        }
        for (C44370d a2 : C39618d.f101179t.mo74314b()) {
            a2.mo52805a(baseShortVideoContext, linkedHashMap, this.f110845b);
        }
        if (!C23715d.m58202a((Collection<T>) baseShortVideoContext.arTextList)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = baseShortVideoContext.arTextList.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            String jSONArray2 = jSONArray.toString();
            if (!TextUtils.isEmpty(jSONArray2)) {
                linkedHashMap.put("ar_text", jSONArray2);
            }
        }
        JSONArray jSONArray3 = new JSONArray();
        if (!C23715d.m58202a((Collection<T>) baseShortVideoContext.messageBubbleTexts)) {
            JSONArray jSONArray4 = new JSONArray();
            Iterator it2 = baseShortVideoContext.messageBubbleTexts.iterator();
            while (it2.hasNext()) {
                jSONArray4.put((String) it2.next());
            }
            try {
                jSONArray3.put(new JSONObject().put("type", 1).put("data", jSONArray4));
            } catch (JSONException unused) {
            }
        }
        boolean z = baseShortVideoContext instanceof VideoPublishEditModel;
        if (z) {
            JSONArray a3 = C46688i.m101323a((VideoPublishEditModel) baseShortVideoContext, C46699k.f117827a, C46700l.f117828a);
            if (a3.length() > 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    String str = "type";
                    if (((VideoPublishEditModel) baseShortVideoContext).isStatusVideoType()) {
                        i = 6;
                    } else {
                        i = 4;
                    }
                    jSONArray3.put(jSONObject.put(str, i).put("data", a3));
                } catch (JSONException unused2) {
                }
            }
        }
        if (z) {
            JSONArray a4 = C46688i.m101323a((VideoPublishEditModel) baseShortVideoContext, C46701m.f117829a, C46702n.f117830a);
            if (a4.length() > 0) {
                try {
                    jSONArray3.put(new JSONObject().put("type", 5).put("data", a4));
                } catch (JSONException unused3) {
                }
            }
        }
        if (z) {
            JSONArray jSONArray5 = new JSONArray();
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            if (videoPublishEditModel.isCommentReply()) {
                jSONArray5.put(videoPublishEditModel.commentVideoModel.getCommentMsg());
            }
            if (jSONArray5.length() > 0) {
                try {
                    jSONArray3.put(new JSONObject().put("type", 8).put("data", jSONArray5));
                } catch (JSONException unused4) {
                }
            }
        }
        if (baseShortVideoContext.cutSameEditData != null && !C23715d.m58202a((Collection<T>) baseShortVideoContext.cutSameEditData.mo58681a())) {
            JSONArray jSONArray6 = new JSONArray();
            for (String put : baseShortVideoContext.cutSameEditData.mo58681a()) {
                jSONArray6.put(put);
            }
            try {
                jSONArray3.put(new JSONObject().put("type", 7).put("data", jSONArray6));
            } catch (JSONException unused5) {
            }
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.getMainBusinessData())) {
            if (!C9376b.m18558a(C43577d.m95725a(baseShortVideoContext, C43596f.TRACK_PAGE_EDIT))) {
                C43596f fVar2 = C43596f.TRACK_PAGE_EDIT;
                if (z) {
                    eVar = C43577d.m95720a(((VideoPublishEditModel) baseShortVideoContext).getMainBusinessContext());
                } else {
                    eVar = C43577d.m95721a(baseShortVideoContext.getMainBusinessData());
                }
                InteractionCheckInfo interactionCheckInfo = null;
                if (eVar == null) {
                    list = null;
                } else {
                    list = eVar.getTrackByType(Integer.valueOf(1), fVar2);
                }
                if (!(list == null || list.isEmpty() || ((InteractStickerStruct) list.get(0)).getVoteStruct() == null)) {
                    try {
                        JSONObject put2 = new JSONObject().put("type", 3);
                        String str2 = "data";
                        C17971f retrofitFactoryGson = C39618d.f101139C.getRetrofitFactoryGson();
                        VoteStruct voteStruct = ((InteractStickerStruct) list.get(0)).getVoteStruct();
                        if (voteStruct != null) {
                            interactionCheckInfo = new InteractionCheckInfo();
                            LinkedList linkedList = new LinkedList();
                            if (voteStruct.getOptions().size() == 2) {
                                linkedList.add(((OptionsBean) voteStruct.getOptions().get(0)).getPostOption());
                                linkedList.add(((OptionsBean) voteStruct.getOptions().get(1)).getPostOption());
                                interactionCheckInfo.setOptions(linkedList);
                            }
                            interactionCheckInfo.setQuestion(voteStruct.getQuestion());
                        }
                        jSONArray3.put(put2.put(str2, new JSONObject(retrofitFactoryGson.mo34889b(interactionCheckInfo))));
                    } catch (JSONException unused6) {
                    }
                }
            }
        }
        if (jSONArray3.length() != 0) {
            linkedHashMap.put("sticker_text", jSONArray3.toString());
        }
    }
}
