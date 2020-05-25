package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.filter.StrArray;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43236a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43758o;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p683ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.p683ss.android.ugc.aweme.shortvideo.p2187e.C43306a;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43876f;
import com.p683ss.android.ugc.aweme.shortvideo.p2204h.C43881j;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46804e;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46806g;
import com.p683ss.android.ugc.p2425e.C48557d;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.utils.C50203g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ec */
public final class C43309ec {
    /* renamed from: a */
    public static void m95003a(ShortVideoContext shortVideoContext) {
        String str;
        shortVideoContext.f107115h = null;
        if (shortVideoContext.mo86365f()) {
            str = shortVideoContext.f107028G;
        } else if (shortVideoContext.mo86366g()) {
            str = shortVideoContext.f107035N.wavPath;
        } else {
            str = null;
        }
        shortVideoContext.f107112e = str;
        if (!TextUtils.isEmpty(shortVideoContext.f107112e)) {
            shortVideoContext.f107118k.mo86453a(new File(shortVideoContext.f107112e));
        } else {
            shortVideoContext.f107118k.mo86459f();
        }
        m95007c(shortVideoContext);
        shortVideoContext.f107114g = (int) shortVideoContext.f107110c;
        shortVideoContext.f107111d = null;
    }

    /* renamed from: c */
    private static void m95007c(ShortVideoContext shortVideoContext) {
        String str;
        if (shortVideoContext.mo86365f()) {
            shortVideoContext.f107110c = new C43876f().mo89431a(shortVideoContext.f107028G, shortVideoContext.f107027F);
        } else if (shortVideoContext.mo86366g()) {
            shortVideoContext.f107110c = new C43876f().mo89431a(shortVideoContext.f107035N.wavPath, shortVideoContext.f107035N.videoPath);
        } else {
            C43881j jVar = new C43881j();
            if (shortVideoContext.mo86361c()) {
                str = shortVideoContext.f107118k.mo86458e().getPath();
            } else {
                str = null;
            }
            shortVideoContext.f107110c = jVar.mo89432a(str);
        }
        StringBuilder sb = new StringBuilder("maxduration is ");
        sb.append(shortVideoContext.f107110c);
        C50203g.m108363d(sb.toString());
    }

    /* renamed from: b */
    private static void m95006b(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.mo86361c()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (!shortVideoContext.f107118k.mo86458e().exists()) {
                shortVideoContext.f107114g = (int) shortVideoContext.f107110c;
                return;
            }
            try {
                m95002a(mediaMetadataRetriever, shortVideoContext.f107118k.mo86458e().getPath());
                shortVideoContext.f107114g = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                shortVideoContext.f107114g = (int) shortVideoContext.f107110c;
            }
        } else {
            shortVideoContext.f107114g = (int) shortVideoContext.f107110c;
        }
    }

    /* renamed from: a */
    public static ShortVideoContext m95000a(Intent intent) {
        int i;
        int i2;
        boolean z;
        boolean z2 = false;
        String str = null;
        switch (intent.getIntExtra("restore", 0)) {
            case 0:
                return m95004b(intent);
            case 1:
                ShortVideoContext shortVideoContext = new ShortVideoContext(1);
                shortVideoContext.f107023B = AVETParameterKt.generateAVETParam(intent);
                shortVideoContext.f107132y = intent.getStringExtra("shoot_way");
                shortVideoContext.f107118k = (Workspace) intent.getParcelableExtra("workspace");
                shortVideoContext.f107048a = intent.getIntExtra("draft_to_edit_from", 0);
                if (shortVideoContext.f107118k.mo86458e() != null && C50200d.m108346a(shortVideoContext.f107118k.mo86458e().getPath())) {
                    shortVideoContext.f107112e = shortVideoContext.f107118k.mo86458e().toString();
                }
                if (intent.hasExtra("extra_bind_mv_id")) {
                    shortVideoContext.f107061aM = intent.getStringExtra("extra_bind_mv_id");
                }
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) intent.getSerializableExtra("video_edit_model");
                if (videoPublishEditModel.videoWidth() == 0) {
                    i = C39629l.m88232a().mo58578i().getVideoWidth();
                } else {
                    i = videoPublishEditModel.videoWidth();
                }
                shortVideoContext.f107116i = i;
                if (videoPublishEditModel.videoHeight() == 0) {
                    i2 = C39629l.m88232a().mo58578i().getVideoHeight();
                } else {
                    i2 = videoPublishEditModel.videoHeight();
                }
                shortVideoContext.f107117j = i2;
                shortVideoContext.f107081ag = videoPublishEditModel.mShootMode;
                shortVideoContext.f107089ao = videoPublishEditModel.mDurationMode;
                shortVideoContext.f107040S = videoPublishEditModel.isMuted;
                shortVideoContext.f107131x = videoPublishEditModel.creationId;
                shortVideoContext.f107022A = videoPublishEditModel.draftId;
                shortVideoContext.mo86370k().setDraftId(videoPublishEditModel.draftId);
                shortVideoContext.mo86370k().setCreationId(videoPublishEditModel.creationId);
                shortVideoContext.f107082ah = StrArray.from(videoPublishEditModel.mCurFilterLabels);
                shortVideoContext.f107083ai = StrArray.from(videoPublishEditModel.mCurFilterIds);
                if (intent.hasExtra("stitch_params")) {
                    shortVideoContext.mo86358a((StitchParams) intent.getParcelableExtra("stitch_params"));
                } else {
                    shortVideoContext.mo86374o();
                }
                RecordScene recordScene = C43214dh.m94817a().f109294i;
                if (recordScene == null || recordScene.isSegmentsNotValid()) {
                    shortVideoContext.f107119l = new C43789em();
                    shortVideoContext.f107120m = 0;
                    shortVideoContext.f107127t = C40797m.m90243a() ? 1 : 0;
                    shortVideoContext.f107128u = true;
                    C43881j jVar = new C43881j();
                    if (shortVideoContext.mo86361c()) {
                        str = shortVideoContext.f107118k.mo86458e().getPath();
                    }
                    shortVideoContext.f107110c = jVar.mo89432a(str);
                    shortVideoContext.f107114g = (int) shortVideoContext.f107110c;
                } else {
                    shortVideoContext.f107119l = new C43789em(recordScene.videoSegments);
                    shortVideoContext.f107120m = (long) TimeSpeedModelExtension.calculateRealTime(shortVideoContext.f107119l);
                    shortVideoContext.f107113f = recordScene.musicStart;
                    shortVideoContext.f107127t = recordScene.hardEncode;
                    if (recordScene.faceBeauty > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    shortVideoContext.f107128u = z;
                    shortVideoContext.f107110c = recordScene.maxDuration;
                    m95006b(shortVideoContext);
                    shortVideoContext.f107111d = recordScene.audioTrack;
                }
                shortVideoContext.f107041T = videoPublishEditModel.title;
                shortVideoContext.f107042U = videoPublishEditModel.chain;
                shortVideoContext.f107043V = videoPublishEditModel.disableDeleteChain;
                shortVideoContext.f107044W = videoPublishEditModel.structList;
                shortVideoContext.f107115h = videoPublishEditModel.mMusicOrigin;
                shortVideoContext.f107045X = videoPublishEditModel.isPrivate;
                if (!TextUtils.isEmpty(videoPublishEditModel.pic2VideoSource)) {
                    String[] split = videoPublishEditModel.pic2VideoSource.split(",");
                    if (split.length > 0) {
                        shortVideoContext.f107103bb.addAll(Arrays.asList(split));
                    }
                }
                shortVideoContext.f107102ba = 0;
                shortVideoContext.f107046Y = true;
                C46806g.m101653a(C44309n.m97057a((BaseShortVideoContext) videoPublishEditModel), C44309n.m97056a(shortVideoContext), C46804e.DRAFT, C46804e.RECORD);
                shortVideoContext.f107092ar = videoPublishEditModel.extractFramesModel;
                shortVideoContext.f107068aT = videoPublishEditModel.draftEditTransferModel;
                shortVideoContext.f107130w = videoPublishEditModel.metadataMap;
                shortVideoContext.f107125r = videoPublishEditModel.commentVideoModel;
                if (intent.hasExtra("extra_ve_cher_effect_param")) {
                    shortVideoContext.f107069aU = (ClientCherEffectParam) intent.getParcelableExtra("extra_ve_cher_effect_param");
                }
                switch (intent.getIntExtra("retake_shoot_mode", -1)) {
                    case 1:
                        m95001a(intent, shortVideoContext);
                        break;
                    case 2:
                        m95005b(intent, shortVideoContext);
                        break;
                }
                shortVideoContext.f107107bf = videoPublishEditModel.greenScreenDefaultImage;
                return shortVideoContext;
            case 2:
                ShortVideoContext shortVideoContext2 = new ShortVideoContext(2);
                shortVideoContext2.f107023B = AVETParameterKt.generateAVETParam(intent);
                shortVideoContext2.f107132y = intent.getStringExtra("shoot_way");
                shortVideoContext2.f107118k = Workspace.m93091a();
                shortVideoContext2.f107022A = 0;
                UrlModel a = C39618d.f101168i.mo80559a((Object) intent.getSerializableExtra("music_model"));
                if (a != null) {
                    shortVideoContext2.f107111d = a;
                }
                if (intent.hasExtra("extra_bind_mv_id")) {
                    shortVideoContext2.f107061aM = intent.getStringExtra("extra_bind_mv_id");
                }
                shortVideoContext2.f107116i = C39618d.f101176q.getVideoWidth();
                shortVideoContext2.f107117j = C39618d.f101176q.getVideoHeight();
                if (intent.hasExtra("stitch_params")) {
                    shortVideoContext2.mo86358a((StitchParams) intent.getParcelableExtra("stitch_params"));
                } else {
                    shortVideoContext2.mo86374o();
                }
                RecordScene b = C43306a.m94990b();
                shortVideoContext2.f107089ao = C39618d.f101151O.mo83117a(C40796a.DurationMode);
                if (b.isSegmentsNotValid()) {
                    shortVideoContext2.mo86370k().setCreationId(UUID.randomUUID().toString());
                    shortVideoContext2.f107131x = UUID.randomUUID().toString();
                    shortVideoContext2.f107119l = new C43789em();
                    shortVideoContext2.f107120m = 0;
                    shortVideoContext2.f107127t = C40797m.m90243a() ? 1 : 0;
                    shortVideoContext2.f107128u = true;
                    C43881j jVar2 = new C43881j();
                    if (shortVideoContext2.mo86361c()) {
                        str = shortVideoContext2.f107118k.mo86458e().getPath();
                    }
                    shortVideoContext2.f107110c = jVar2.mo89432a(str);
                    m95006b(shortVideoContext2);
                } else {
                    shortVideoContext2.mo86370k().setCreationId(b.creationId);
                    shortVideoContext2.f107131x = b.creationId;
                    shortVideoContext2.f107119l = new C43789em(b.videoSegments);
                    shortVideoContext2.f107120m = (long) TimeSpeedModelExtension.calculateRealTime(shortVideoContext2.f107119l);
                    shortVideoContext2.f107112e = b.musicPath;
                    if (!TextUtils.isEmpty(b.musicPath)) {
                        shortVideoContext2.f107118k.mo86453a(new File(b.musicPath));
                    }
                    shortVideoContext2.f107113f = b.musicStart;
                    shortVideoContext2.f107127t = b.hardEncode;
                    if (b.faceBeauty > 0) {
                        z2 = true;
                    }
                    shortVideoContext2.f107128u = z2;
                    shortVideoContext2.f107110c = b.maxDuration;
                    m95006b(shortVideoContext2);
                    shortVideoContext2.f107111d = b.audioTrack;
                    C43214dh.m94817a().mo50200a(b.musicModel);
                    shortVideoContext2.f107035N = b.reactionParams;
                    shortVideoContext2.f107036O = b.stitchParams;
                    shortVideoContext2.f107092ar = b.extractFramesModel;
                    shortVideoContext2.f107082ah = StrArray.from(b.filterLabels);
                    shortVideoContext2.f107083ai = StrArray.from(b.filterIds);
                    shortVideoContext2.f107034M = b.poiContextStr;
                    shortVideoContext2.f107069aU = b.cherEffectParam;
                    shortVideoContext2.f107130w = b.videoRecordMetadata;
                    shortVideoContext2.f107125r = b.commentVideoModel;
                    C43214dh.m94817a().mo87850a(b.getChallengeFromStr());
                }
                return shortVideoContext2;
            default:
                return m95004b(intent);
        }
    }

    /* renamed from: b */
    private static ShortVideoContext m95004b(Intent intent) {
        String str;
        boolean z;
        boolean z2;
        ShortVideoContext shortVideoContext = new ShortVideoContext(0);
        shortVideoContext.f107023B = AVETParameterKt.generateAVETParam(intent);
        shortVideoContext.f107131x = intent.getStringExtra("creation_id");
        shortVideoContext.f107132y = intent.getStringExtra("shoot_way");
        shortVideoContext.f107133z = intent.getStringExtra("enter_from");
        shortVideoContext.f107022A = 0;
        shortVideoContext.f107118k = Workspace.m93091a();
        shortVideoContext.f107081ag = intent.getIntExtra("shoot_mode", 0);
        shortVideoContext.f107027F = intent.getStringExtra("duet_video_path");
        shortVideoContext.f107028G = intent.getStringExtra("duet_audio_path");
        shortVideoContext.f107026E = intent.getStringExtra("duet_from");
        shortVideoContext.f107024C = (User) intent.getSerializableExtra("duet_author");
        shortVideoContext.f107025D = intent.getStringExtra("duet_hash_tag");
        shortVideoContext.f107032K = intent.getIntExtra("duet_video_width", 0);
        shortVideoContext.f107033L = intent.getIntExtra("duet_video_height", -1);
        shortVideoContext.f107035N = (ReactionParams) intent.getParcelableExtra("reaction_params");
        if (shortVideoContext.mo86365f()) {
            str = shortVideoContext.f107028G;
        } else if (shortVideoContext.mo86366g()) {
            str = shortVideoContext.f107035N.wavPath;
        } else {
            str = intent.getStringExtra(LeakCanaryFileProvider.f132050j);
        }
        shortVideoContext.f107112e = str;
        if (shortVideoContext.f107081ag == 12) {
            StitchParams stitchParams = (StitchParams) intent.getParcelableExtra("stitch_params");
            shortVideoContext.mo86358a(stitchParams);
            if (!TextUtils.isEmpty(stitchParams.getMusicPath()) && stitchParams.getMusicStart() >= 0) {
                shortVideoContext.f107112e = stitchParams.getMusicPath();
            }
        } else {
            shortVideoContext.mo86374o();
        }
        if (!TextUtils.isEmpty(shortVideoContext.f107112e)) {
            shortVideoContext.f107118k.mo86453a(new File(shortVideoContext.f107112e));
        }
        if (intent.hasExtra("extra_bind_mv_id")) {
            shortVideoContext.f107061aM = intent.getStringExtra("extra_bind_mv_id");
        }
        UrlModel a = C39618d.f101168i.mo80559a((Object) intent.getSerializableExtra("music_model"));
        if (a != null) {
            shortVideoContext.f107111d = a;
        }
        shortVideoContext.f107089ao = C42433aw.m93201a().mo86512a();
        if (shortVideoContext.f107081ag != 12) {
            if (C39618d.f101151O.mo83118b(C40796a.DefaultMicrophoneState) == 3 || C43236a.m94873a(shortVideoContext)) {
                z2 = true;
            } else {
                z2 = false;
            }
            shortVideoContext.f107040S = z2;
        }
        m95007c(shortVideoContext);
        shortVideoContext.f107113f = intent.getIntExtra("music_start", 0);
        shortVideoContext.f107114g = (int) shortVideoContext.f107110c;
        shortVideoContext.f107116i = C39618d.f101176q.getVideoWidth();
        shortVideoContext.f107117j = C39618d.f101176q.getVideoHeight();
        shortVideoContext.f107119l = new C43789em();
        shortVideoContext.f107120m = 0;
        shortVideoContext.f107127t = C40797m.m90243a() ? 1 : 0;
        shortVideoContext.f107128u = C43774ee.m96217a().mo86509a();
        List<AVChallenge> list = C43214dh.m94817a().f109287b;
        if (!C9414h.m18631b(list) || TextUtils.isEmpty(((AVChallenge) list.get(0)).getStickerId())) {
            shortVideoContext.f107075aa = intent.getBooleanExtra("use_preset_sticker_at_first", false);
        } else {
            shortVideoContext.f107047Z = ((AVChallenge) list.get(0)).getStickerId();
            shortVideoContext.f107075aa = true;
        }
        shortVideoContext.f107072aX = intent.getStringExtra("filter_business_sticker");
        shortVideoContext.f107076ab = intent.getStringExtra("task_id");
        shortVideoContext.f107079ae = intent.getStringExtra("is_forced_music_from_show_way");
        C43305e eVar = C43214dh.m94817a().f109288c;
        if (eVar == null || C9376b.m18558a((Collection<T>) eVar.getStickerIds())) {
            shortVideoContext.f107075aa = intent.getBooleanExtra("use_preset_sticker_at_first", shortVideoContext.f107075aa);
        } else {
            shortVideoContext.f107047Z = (String) eVar.getStickerIds().get(0);
            shortVideoContext.f107075aa = true;
        }
        if (eVar != null && !C9376b.m18558a((Collection<T>) eVar.getMvIds())) {
            shortVideoContext.f107061aM = (String) eVar.getMvIds().get(0);
        }
        if (eVar != null) {
            shortVideoContext.f107076ab = eVar.getId();
        }
        if (eVar != null && !C9376b.m18558a((Collection<T>) eVar.getChallengeNames())) {
            shortVideoContext.f107077ac = (ArrayList) eVar.getChallengeNames();
        }
        shortVideoContext.f107078ad = (List) intent.getSerializableExtra("task_mentioned_users");
        if (eVar != null && !C9376b.m18558a((Collection<T>) eVar.getMentionedUsers())) {
            shortVideoContext.f107078ad = eVar.getMentionedUsers();
        }
        C43804f fVar = C43214dh.m94817a().f109289d;
        if (!(fVar == null || TextUtils.isEmpty(shortVideoContext.f107112e) || (fVar.f110928e == null && fVar.f110927d == null))) {
            fVar.f110936m = shortVideoContext.f107112e;
        }
        shortVideoContext.f107080af = intent.getStringExtra("tag_id");
        if (TextUtils.isEmpty(shortVideoContext.f107047Z)) {
            shortVideoContext.f107047Z = intent.getStringExtra("sticker_id");
        }
        shortVideoContext.f107097aw = (GameDuetResource) intent.getParcelableExtra("duet_sticker_game");
        shortVideoContext.f107034M = intent.getStringExtra("poi_struct_in_tools_line");
        shortVideoContext.f107054aF = (C43758o) intent.getSerializableExtra("micro_app_info");
        if (intent.getBooleanExtra("enter_record_from_other_platform", false) || shortVideoContext.f107054aF != null) {
            z = true;
        } else {
            z = false;
        }
        shortVideoContext.f107055aG = z;
        shortVideoContext.f107056aH = intent.getBooleanExtra("to_live", false);
        shortVideoContext.f107057aI = intent.getBooleanExtra("extra_to_status", false);
        shortVideoContext.f107058aJ = intent.getBooleanExtra("extra_to_xs", false);
        if (shortVideoContext.f107058aJ) {
            shortVideoContext.f107059aK = intent.getStringExtra("xs_enter_from");
        } else {
            shortVideoContext.f107059aK = "plus_float";
        }
        shortVideoContext.f107060aL = intent.getStringExtra("xs_city");
        if (intent.hasExtra("extra_mention_uid") && intent.hasExtra("extra_mention_user_name")) {
            shortVideoContext.f107063aO = ExtraMentionUserModel.Companion.newInstance(intent.getStringExtra("extra_mention_uid"), intent.getStringExtra("extra_mention_user_name"));
        }
        shortVideoContext.f107125r = (CommentVideoModel) intent.getSerializableExtra("comment_video_model");
        C43306a.m94981a(shortVideoContext.f107125r);
        shortVideoContext.f107090ap = true;
        shortVideoContext.f107105bd = intent.getStringExtra("effect_meta_info");
        shortVideoContext.f107106be = intent.getStringExtra("effect_image");
        C46806g.m101651a(intent, C44309n.m97056a(shortVideoContext));
        return shortVideoContext;
    }

    /* renamed from: a */
    public static void m95001a(Intent intent, ShortVideoContext shortVideoContext) {
        RetakeVideoContext retakeVideoContext = (RetakeVideoContext) intent.getParcelableExtra("retake_video");
        shortVideoContext.f107123p = retakeVideoContext.f107012a;
        shortVideoContext.f107121n = 0;
        shortVideoContext.f107122o = true;
        if (retakeVideoContext.f107016e != null) {
            shortVideoContext.f107119l = new C43789em(retakeVideoContext.f107016e.editSegments);
        }
        shortVideoContext.mo86375p().clear();
        shortVideoContext.f107118k.mo86454b(retakeVideoContext.f107017f);
        shortVideoContext.f107124q = retakeVideoContext;
        if (retakeVideoContext.f107018g != null) {
            shortVideoContext.mo86358a(retakeVideoContext.f107018g);
        } else {
            shortVideoContext.mo86374o();
        }
        String str = retakeVideoContext.f107016e.curMultiEditVideoRecordData.musicPath;
        boolean isPlaySingleSegmentMusic = retakeVideoContext.f107016e.curMultiEditVideoRecordData.isPlaySingleSegmentMusic();
        if (str == null || !isPlaySingleSegmentMusic) {
            m95003a(shortVideoContext);
            return;
        }
        shortVideoContext.f107113f = retakeVideoContext.f107016e.curMultiEditVideoRecordData.musicTrimIn;
        shortVideoContext.f107118k.mo86453a(new File(str));
        shortVideoContext.f107112e = str;
    }

    /* renamed from: b */
    public static void m95005b(Intent intent, ShortVideoContext shortVideoContext) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("original_segments");
        int intExtra = intent.getIntExtra("original_music_start", 0);
        C42482c b = C43214dh.m94817a().mo50201b();
        shortVideoContext.f107123p = 0;
        shortVideoContext.f107121n = 0;
        shortVideoContext.f107122o = false;
        shortVideoContext.f107124q = null;
        shortVideoContext.f107119l = new C43789em(parcelableArrayListExtra);
        shortVideoContext.f107120m = (long) TimeSpeedModelExtension.calculateRealTime(shortVideoContext.f107119l);
        shortVideoContext.f107118k.mo86466m();
        if (b != null) {
            String a = C48557d.m105031a().mo96061a(b.getPath());
            shortVideoContext.f107118k.mo86453a(new File(a));
            shortVideoContext.f107112e = a;
            shortVideoContext.f107113f = intExtra;
        } else {
            m95003a(shortVideoContext);
        }
        if (intent.hasExtra("stitch_params")) {
            shortVideoContext.mo86358a((StitchParams) intent.getParcelableExtra("stitch_params"));
        } else {
            shortVideoContext.mo86374o();
        }
    }

    /* renamed from: a */
    private static void m95002a(MediaMetadataRetriever mediaMetadataRetriever, String str) throws IllegalArgumentException {
        FileInputStream fileInputStream;
        Throwable th;
        if (str != null) {
            try {
                fileInputStream = new FileInputStream(str);
                mediaMetadataRetriever.setDataSource(fileInputStream.getFD(), 0, 576460752303423487L);
                fileInputStream.close();
                return;
            } catch (FileNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IOException e2) {
                throw new IllegalArgumentException(e2);
            } catch (Throwable th2) {
                C17840a.m43752a(th, th2);
            }
        } else {
            throw new IllegalArgumentException("path == null");
        }
        throw th;
    }
}
