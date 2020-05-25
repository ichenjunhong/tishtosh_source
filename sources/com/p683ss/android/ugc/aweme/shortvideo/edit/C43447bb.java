package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.content.Intent;
import android.text.TextUtils;
import com.p683ss.android.ttve.editorInfo.C20084a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.draft.model.C29057a;
import com.p683ss.android.ugc.aweme.draft.model.C29058b;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.draft.model.C29067e;
import com.p683ss.android.ugc.aweme.draft.model.C29068f;
import com.p683ss.android.ugc.aweme.draft.model.C29070h;
import com.p683ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.p683ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p683ss.android.ugc.aweme.effect.EffectListModel;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.imported.C35523d;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p683ss.android.ugc.aweme.p1388at.C23289b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.C43895j;
import com.p683ss.android.ugc.aweme.shortvideo.C44309n;
import com.p683ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p683ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.C42386b;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42673r;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43597g;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43672e;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2192d.C43456a;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVETParameterKt;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45623a;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p683ss.android.ugc.aweme.sticker.C46071n;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46448b;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46804e;
import com.p683ss.android.ugc.aweme.tools.p2346a.C46806g;
import com.p683ss.android.ugc.aweme.utils.C47768ci;
import com.p683ss.android.ugc.tools.utils.C50197a;
import com.p683ss.android.vesdk.VEUtils;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bb */
public final class C43447bb {

    /* renamed from: a */
    private final String f109839a;

    public C43447bb(String str) {
        this.f109839a = str;
    }

    /* renamed from: b */
    private static ClientCherEffectParam m95227b(C29059c cVar) {
        if (cVar == null || cVar.f76142T == null || cVar.mo58769af() == null) {
            return null;
        }
        C29068f af = cVar.mo58769af();
        return new ClientCherEffectParam(af.f76180a, af.f76181b, af.f76182c);
    }

    /* renamed from: c */
    private static AudioEffectParam m95230c(C29059c cVar) {
        String str;
        if (cVar == null || cVar.f76142T == null || cVar.mo58770ag() == null) {
            return null;
        }
        C29070h ag = cVar.mo58770ag();
        if (ag.f76191a != null) {
            str = ag.f76191a;
        } else {
            str = "";
        }
        AudioEffectParam audioEffectParam = new AudioEffectParam(str, ag.f76192b, ag.f76193c, ag.f76194d, ag.f76195e, ag.f76196f, ag.f76197g, null, ag.f76198h);
        return audioEffectParam;
    }

    /* renamed from: a */
    public final VideoPublishEditModel mo88378a(Intent intent) {
        float f;
        float f2;
        VideoPublishEditModel b = m95228b(intent);
        if (b.getDuetFrom() == null || C39629l.m88232a().mo58583n().mo83103a(C40790a.StudioDuetChangeLayout)) {
            f = intent.getFloatExtra("music_volume", 0.5f);
        } else {
            f = 1.0f;
        }
        b.musicVolume = f;
        if (b.isMuted) {
            f2 = 0.0f;
        } else {
            f2 = intent.getFloatExtra("voice_volume", 0.5f);
        }
        b.voiceVolume = f2;
        if (b.isFastImport && b.isStickPointMode) {
            b.voiceVolume = 0.0f;
        }
        return b;
    }

    /* renamed from: b */
    public static void m95229b(VideoPublishEditModel videoPublishEditModel) {
        if (TextUtils.isEmpty(videoPublishEditModel.title) && videoPublishEditModel.publishFromLiveScreenCapture() && !videoPublishEditModel.isSelfLive()) {
            StringBuilder sb = new StringBuilder("@");
            sb.append(C43456a.m95260a(videoPublishEditModel.livePublishModel.getAuthor()));
            String sb2 = sb.toString();
            String string = C39629l.m88233b().getString(R.string.g12, new Object[]{sb2});
            if (string.endsWith(sb2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" ");
                string = sb3.toString();
            }
            int indexOf = string.indexOf(sb2);
            int length = sb2.length() + indexOf;
            ArrayList arrayList = new ArrayList();
            if (videoPublishEditModel.livePublishModel.getAuthor() != null) {
                arrayList.add(m95225a(indexOf, length, videoPublishEditModel.livePublishModel.getAuthor().getUid(), ""));
                videoPublishEditModel.structList = arrayList;
            }
            videoPublishEditModel.title = string;
        }
    }

    /* renamed from: a */
    public static VideoPublishEditModel m95224a(C29059c cVar) {
        boolean z;
        String str;
        float f;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.setPreviewInfo(C29061d.m68500e(cVar));
        videoPublishEditModel.mDir = C43308eb.f109491d;
        if (cVar.mo58743T()) {
            videoPublishEditModel.mvCreateVideoData = cVar.mo58741R();
            if (videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.mvType != 1) {
                videoPublishEditModel.videoEditorType = 2;
            } else {
                videoPublishEditModel.videoEditorType = 3;
            }
            videoPublishEditModel.uploadMiscInfoStruct = cVar.mo58749Z();
        }
        if (cVar.mo58744U()) {
            videoPublishEditModel.statusCreateVideoData = cVar.mo58742S();
            videoPublishEditModel.videoEditorType = 5;
            videoPublishEditModel.uploadMiscInfoStruct = cVar.mo58749Z();
        }
        videoPublishEditModel.isStickPointMode = cVar.mo58764aa();
        if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.stickPointData = cVar.mo58784au();
        }
        videoPublishEditModel.containBackgroundVideo = cVar.mo58765ab();
        videoPublishEditModel.isFastImport = cVar.mo58767ad();
        videoPublishEditModel.fastImportResolution = cVar.mo58768ae();
        videoPublishEditModel.title = cVar.f76144b.f76028a;
        videoPublishEditModel.challenges = cVar.f76144b.f76030c;
        videoPublishEditModel.commentVideoModel = cVar.mo58773aj();
        videoPublishEditModel.structList = cVar.f76144b.f76029b;
        videoPublishEditModel.musicId = C35523d.m80266a(cVar.f76147e);
        videoPublishEditModel.mMusicPath = cVar.f76149g;
        videoPublishEditModel.mMusicStart = cVar.f76154l;
        videoPublishEditModel.mMusicEnd = cVar.mo58799i();
        videoPublishEditModel.mMusicOrigin = cVar.mo58815x();
        videoPublishEditModel.mSelectedId = cVar.f76153k;
        videoPublishEditModel.mFaceBeauty = cVar.f76127E;
        videoPublishEditModel.mCameraPosition = cVar.f76162t;
        videoPublishEditModel.mCurFilterLabels = cVar.f76161s;
        videoPublishEditModel.mCurFilterIds = cVar.mo58790b();
        videoPublishEditModel.mOrigin = cVar.f76156n;
        videoPublishEditModel.mVideoSegmentsDesc = cVar.f76130H;
        videoPublishEditModel.mHardEncode = cVar.f76131I;
        videoPublishEditModel.mStickerID = cVar.f76134L;
        videoPublishEditModel.defaultSelectStickerPoi = cVar.mo58802l();
        videoPublishEditModel.isPrivate = cVar.f76124B;
        videoPublishEditModel.commentSetting = cVar.mo58804n();
        videoPublishEditModel.maxDuration = cVar.f76126D;
        videoPublishEditModel.audioTrack = cVar.f76159q;
        videoPublishEditModel.videoSpeed = cVar.f76158p;
        videoPublishEditModel.cameraIds = cVar.mo58805o();
        videoPublishEditModel.beautyType = cVar.mo58806p();
        videoPublishEditModel.mBeautyMetadatas = cVar.mo58807q();
        videoPublishEditModel.mUploadPath = cVar.mo58794d();
        videoPublishEditModel.importInfoList = cVar.mo58808r();
        videoPublishEditModel.metadataMap = cVar.mo58812u();
        videoPublishEditModel.commerceData = C39630m.m88234a().mo58597A().mo74190a(cVar);
        videoPublishEditModel.mSelectedFilterIntensity = cVar.mo58780aq();
        videoPublishEditModel.setVideoLength(cVar.f76144b.f76031d);
        if (cVar.f76125C != null) {
            videoPublishEditModel.mEffectList = cVar.f76125C.getEffectPointModels();
        }
        int i = cVar.f76155m;
        if (i != 0) {
            videoPublishEditModel.mTimeEffect = new EffectPointModel();
            videoPublishEditModel.mTimeEffect.setKey(String.valueOf(i));
            videoPublishEditModel.mTimeEffect.setStartPoint(cVar.mo58801k());
            videoPublishEditModel.mTimeEffect.setEndPoint(cVar.f76132J);
        }
        videoPublishEditModel.mVideoCoverStartTm = cVar.f76138P;
        videoPublishEditModel.setVideoCoverPath(cVar.mo58803m());
        videoPublishEditModel.mOutVideoWidth = cVar.mo58795e();
        videoPublishEditModel.mOutVideoHeight = cVar.mo58796f();
        videoPublishEditModel.mVideoCanvasWidth = cVar.mo58797g();
        videoPublishEditModel.mVideoCanvasHeight = cVar.mo58798h();
        if (cVar.f76147e != null && C39630m.m88234a().mo58610h().mo74176c()) {
            videoPublishEditModel.mId3Album = cVar.f76147e.getAlbum();
            videoPublishEditModel.mId3Author = cVar.f76147e.getSinger();
            videoPublishEditModel.mId3Title = cVar.f76147e.getName();
            videoPublishEditModel.mMusicType = C39630m.m88234a().mo58604b().mo80577a(cVar.f76147e.getMusicType()) ? 1 : 0;
            videoPublishEditModel.previewStartTime = cVar.f76147e.getPreviewStartTime();
        }
        videoPublishEditModel.mDuetFrom = cVar.f76139Q;
        videoPublishEditModel.mSyncPlatforms = cVar.f76140R;
        boolean z2 = false;
        if (cVar.mo58813v() == 1) {
            z = true;
        } else {
            z = false;
        }
        videoPublishEditModel.mFromMultiCut = z;
        if (cVar.mo58813v() == 0) {
            z2 = true;
        }
        videoPublishEditModel.mFromCut = z2;
        videoPublishEditModel.mShootMode = cVar.mo58814w();
        videoPublishEditModel.microAppId = cVar.mo58734K();
        videoPublishEditModel.microAppModel = cVar.mo58736M();
        videoPublishEditModel.microAppModel = cVar.mo58736M();
        videoPublishEditModel.creationId = cVar.mo58817z();
        videoPublishEditModel.draftId = cVar.mo58724A();
        float f2 = 0.5f;
        float f3 = 0.0f;
        if (cVar.f76137O == C39629l.m88232a().mo58573d().mo80733b()) {
            videoPublishEditModel.voiceVolume = ((float) cVar.f76151i) / 100.0f;
            f2 = ((float) cVar.f76152j) / 100.0f;
        } else {
            if (videoPublishEditModel.hasOriginalSound()) {
                f = 0.5f;
            } else {
                f = 0.0f;
            }
            videoPublishEditModel.voiceVolume = f;
            if (videoPublishEditModel.isMusic() <= 0) {
                f2 = 0.0f;
            }
        }
        videoPublishEditModel.musicVolume = f2;
        videoPublishEditModel.mShootWay = cVar.mo58728E();
        videoPublishEditModel.autoEnhanceType = cVar.mo58776am();
        videoPublishEditModel.autoEnhanceOn = cVar.mo58775al();
        videoPublishEditModel.mDurationMode = cVar.mo58816y();
        videoPublishEditModel.mIsMultiVideo = cVar.mo58725B();
        videoPublishEditModel.setNewVersion(cVar.f76137O);
        videoPublishEditModel.reactionParams = cVar.mo58729F();
        videoPublishEditModel.isMuted = cVar.mo58730G();
        if (!videoPublishEditModel.isMuted) {
            f3 = videoPublishEditModel.voiceVolume;
        }
        videoPublishEditModel.voiceVolume = f3;
        videoPublishEditModel.recordMode = cVar.mo58726C();
        videoPublishEditModel.gameScore = cVar.mo58727D();
        videoPublishEditModel.extractFramesModel = cVar.mo58731H();
        videoPublishEditModel.mSaveModel = cVar.mo58732I();
        videoPublishEditModel.infoStickerModel = cVar.mo58735L();
        videoPublishEditModel.poiId = cVar.mo58733J();
        videoPublishEditModel.videoType = cVar.mo58737N();
        videoPublishEditModel.usePaint = cVar.mo58739P();
        videoPublishEditModel.texts = cVar.mo58738O();
        videoPublishEditModel.socialModel = cVar.mo58740Q();
        Workspace a = C42386b.m93131a(videoPublishEditModel);
        videoPublishEditModel.mOutputFile = a.mo86463j().getPath();
        videoPublishEditModel.mEncodedAudioOutputFile = a.mo86464k().getPath();
        videoPublishEditModel.mParallelUploadOutputFile = a.mo86465l().getPath();
        C46806g.m101653a(C44309n.m97059b(cVar.f76142T), C44309n.m97058b((BaseShortVideoContext) videoPublishEditModel), C46804e.DRAFT, C46804e.PUBLISH);
        videoPublishEditModel.setStickPointType(cVar.f76142T.f76063aC);
        if (cVar.f76142T == null) {
            str = null;
        } else {
            str = cVar.f76142T.f76041H;
        }
        videoPublishEditModel.mFirstStickerMusicIdsJson = str;
        videoPublishEditModel.draftEditTransferModel = new DraftEditTransferModel(cVar.mo58774ak(), C29061d.m68501f(cVar));
        videoPublishEditModel.veCherEffectParam = m95227b(cVar);
        videoPublishEditModel.veAudioEffectParam = m95230c(cVar);
        videoPublishEditModel.videoCategory = cVar.mo58750a();
        videoPublishEditModel.stickerChallenge = cVar.mo58779ap();
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableRecordConversion)) {
            videoPublishEditModel.veAudioRecorderParam = cVar.mo58771ah();
        }
        videoPublishEditModel.multiEditVideoRecordData = cVar.mo58777an();
        videoPublishEditModel.supportRetake = cVar.mo58783at();
        videoPublishEditModel.videoCount = cVar.mo58809s();
        videoPublishEditModel.photoCount = cVar.mo58810t();
        videoPublishEditModel.pic2VideoSource = cVar.mo58766ac();
        videoPublishEditModel.allowDownloadSetting = cVar.mo58781ar();
        videoPublishEditModel.mUseMusicBeforeEdit = cVar.mo58800j();
        videoPublishEditModel.reviewVideoId = cVar.mo58782as();
        if (videoPublishEditModel.isReviewVideo()) {
            C43214dh.m94817a().f109286a = cVar.f76147e;
            videoPublishEditModel.musicId = null;
            videoPublishEditModel.mMusicPath = null;
        }
        if (cVar.mo58759aB() != null) {
            videoPublishEditModel.stitchParams = cVar.mo58759aB();
        }
        if (cVar.mo58743T()) {
            videoPublishEditModel.mvCreateVideoData = cVar.mo58741R();
            if (videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.mvType != 1) {
                videoPublishEditModel.videoEditorType = 2;
            } else {
                videoPublishEditModel.videoEditorType = 3;
            }
            videoPublishEditModel.uploadMiscInfoStruct = cVar.mo58749Z();
        } else if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.videoEditorType = 4;
        } else if (videoPublishEditModel.isStitchMode()) {
            videoPublishEditModel.videoEditorType = 7;
        } else if (videoPublishEditModel.isMultiVideoEdit()) {
            videoPublishEditModel.videoEditorType = 6;
        }
        videoPublishEditModel.setMainBusinessData(cVar.mo58786aw());
        videoPublishEditModel.stickerInfo = cVar.mo58787ax();
        videoPublishEditModel.duetLayout = cVar.mo58758aA();
        videoPublishEditModel.livePublishModel = cVar.mo58788ay();
        videoPublishEditModel.cutSameEditData = cVar.mo58778ao();
        if (videoPublishEditModel.isCutSameVideoType()) {
            videoPublishEditModel.uploadMiscInfoStruct = cVar.mo58749Z();
        }
        videoPublishEditModel.isCommerceMusic = cVar.mo58760aC();
        if (videoPublishEditModel.isGreenScreen()) {
            videoPublishEditModel.greenScreenDefaultImage = cVar.mo58761aD();
            videoPublishEditModel.uploadMiscInfoStruct = cVar.mo58749Z();
            videoPublishEditModel.greenScreenImages = cVar.mo58762aE();
        }
        videoPublishEditModel.cameraLensInfo = cVar.mo58763aF();
        return videoPublishEditModel;
    }

    /* renamed from: b */
    private static VideoPublishEditModel m95228b(Intent intent) {
        String str;
        int i;
        float f;
        VideoPublishEditModel videoPublishEditModel = new VideoPublishEditModel();
        videoPublishEditModel.setPreviewInfo((EditPreviewInfo) intent.getParcelableExtra("extra_edit_preview_info"));
        videoPublishEditModel.setAvetParameter(AVETParameterKt.generateAVETParam(intent));
        videoPublishEditModel.mWorkspace = (Workspace) intent.getParcelableExtra("workspace");
        if (videoPublishEditModel.mWorkspace == null) {
            videoPublishEditModel.mWorkspace = Workspace.m93091a();
        }
        videoPublishEditModel.mFromCut = intent.getBooleanExtra("fromCut", false);
        videoPublishEditModel.mFromMultiCut = intent.getBooleanExtra("fromMultiCut", false);
        videoPublishEditModel.mDir = intent.getStringExtra("dir");
        if (TextUtils.isEmpty(videoPublishEditModel.mDir)) {
            str = C43307ea.f109491d;
        } else {
            str = videoPublishEditModel.mDir;
        }
        videoPublishEditModel.mDir = str;
        videoPublishEditModel.mEncodedAudioOutputFile = videoPublishEditModel.mWorkspace.mo86464k().getPath();
        videoPublishEditModel.mParallelUploadOutputFile = videoPublishEditModel.mWorkspace.mo86465l().getPath();
        videoPublishEditModel.mFaceBeauty = intent.getIntExtra("face_beauty", 0);
        videoPublishEditModel.faceBeautyOpen = intent.getBooleanExtra("face_beauty_open", false);
        if (intent.hasExtra("extra_beauty_data")) {
            videoPublishEditModel.mBeautyMetadatas = intent.getParcelableArrayListExtra("extra_beauty_data");
        }
        videoPublishEditModel.mSelectedId = intent.getIntExtra("filter_id", 0);
        videoPublishEditModel.mSelectedFilterIntensity = intent.getFloatExtra("extra_selected_filter_intensity", -1.0f);
        videoPublishEditModel.mRecordVideoSelectedFilterIndex = intent.getIntExtra("extra_record_video_selected_filter_index", 0);
        videoPublishEditModel.mRecordVideoSelectedFilterIntensity = intent.getFloatExtra("extra_record_video_selected_filter_intensity", -1.0f);
        videoPublishEditModel.mCameraPosition = intent.getIntExtra("camera", 0);
        videoPublishEditModel.mCurFilterLabels = intent.getStringExtra("filter_lables");
        videoPublishEditModel.mCurFilterIds = intent.getStringExtra("filter_ids");
        videoPublishEditModel.mSmoothSkinLabels = intent.getStringExtra("smooth_skin_labels");
        videoPublishEditModel.mReshapeLabels = intent.getStringExtra("smooth_reshape_labels");
        videoPublishEditModel.mTanningLabels = intent.getStringExtra("smooth_tanning_labels");
        videoPublishEditModel.mEyesLabels = intent.getStringExtra("smooth_eyes_labels");
        videoPublishEditModel.videoCategory = (VideoCategoryParam) intent.getParcelableExtra("video_category");
        videoPublishEditModel.commentVideoModel = (CommentVideoModel) intent.getSerializableExtra("comment_video_model");
        videoPublishEditModel.videoSpeed = intent.getStringExtra("extra_aweme_speed");
        videoPublishEditModel.cameraIds = intent.getStringExtra("extra_av_camera_ids");
        videoPublishEditModel.beautyType = intent.getIntExtra("extra_beauty_type", -1);
        videoPublishEditModel.metadataMap = C47768ci.m103398a(intent.getStringExtra("extra_video_record_metadata"));
        if (videoPublishEditModel.mWorkspace.mo86458e() != null) {
            videoPublishEditModel.mMusicPath = videoPublishEditModel.mWorkspace.mo86458e().getPath();
            videoPublishEditModel.mMusicStart = intent.getIntExtra("music_start", 0);
            videoPublishEditModel.mMusicEnd = intent.getIntExtra("extra_music_end", 0);
        }
        videoPublishEditModel.mOutputFile = videoPublishEditModel.mWorkspace.mo86463j().getPath();
        if (intent.getBooleanExtra("enable_music_path_check", true) && videoPublishEditModel.mMusicPath == null) {
            C43214dh.m94817a().mo50200a((C42482c) null);
        }
        videoPublishEditModel.maxDuration = intent.getLongExtra("max_duration", 15000);
        videoPublishEditModel.audioTrack = (UrlModel) intent.getSerializableExtra("wav_form");
        if (!videoPublishEditModel.mFromCut) {
            videoPublishEditModel.mVideoSegmentsDesc = intent.getStringExtra("video_segment");
        }
        videoPublishEditModel.mHardEncode = intent.getIntExtra("hard_encode", 0);
        videoPublishEditModel.mStickerPath = intent.getStringExtra("sticker_path");
        videoPublishEditModel.mStickerID = intent.getStringExtra("sticker_id");
        videoPublishEditModel.defaultSelectStickerPoi = (C29067e) intent.getSerializableExtra("default_select_sticker_poi");
        videoPublishEditModel.stickerInfo = (C46071n) intent.getSerializableExtra("sticker_info");
        videoPublishEditModel.mFirstStickerMusicIdsJson = intent.getStringExtra("first_sticker_music_ids");
        videoPublishEditModel.mRestoreType = intent.getIntExtra("restore", 0);
        if (videoPublishEditModel.mSelectedId == 0) {
            i = 1;
        } else {
            i = 0;
        }
        videoPublishEditModel.mUseFilter = i;
        videoPublishEditModel.mWillGoOnShortVideo = intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.RECORD_FILTER", false);
        videoPublishEditModel.mShootWay = intent.getStringExtra("shoot_way");
        videoPublishEditModel.nationalTaskId = intent.getStringExtra("task_id");
        videoPublishEditModel.mIsFromDraft = intent.getBooleanExtra("isFromDraft", false);
        if (videoPublishEditModel.mIsFromDraft) {
            videoPublishEditModel.mVideoCanvasWidth = intent.getIntExtra("extra_video_canvas_width", 0);
            videoPublishEditModel.mVideoCanvasHeight = intent.getIntExtra("extra_video_canvas_height", 0);
        }
        float f2 = 0.0f;
        videoPublishEditModel.mVideoCoverStartTm = intent.getFloatExtra("videoCoverStartTm", 0.0f);
        videoPublishEditModel.generateVideoCoverPath();
        videoPublishEditModel.mEffectList = intent.getParcelableArrayListExtra("effectList");
        videoPublishEditModel.mTimeEffect = (EffectPointModel) intent.getParcelableExtra("time_effect");
        videoPublishEditModel.mOrigin = intent.getIntExtra("origin", 0);
        videoPublishEditModel.challenges = (List) intent.getSerializableExtra("challenge");
        videoPublishEditModel.nationalTaskId = intent.getStringExtra("task_id");
        videoPublishEditModel.tagId = intent.getStringExtra("tag_id");
        videoPublishEditModel.mDuetFrom = intent.getStringExtra("duet_from");
        videoPublishEditModel.mDuetAuthor = (User) intent.getSerializableExtra("duet_author");
        videoPublishEditModel.mDuetHashTag = intent.getStringExtra("duet_hash_tag");
        videoPublishEditModel.mSyncPlatforms = intent.getStringExtra("sync_platform");
        videoPublishEditModel.mShootMode = intent.getIntExtra("shoot_mode", 0);
        videoPublishEditModel.creationId = intent.getStringExtra("creation_id");
        videoPublishEditModel.ccVid = intent.getStringExtra("cc_vid");
        videoPublishEditModel.draftId = intent.getIntExtra("draft_id", 0);
        float f3 = 0.5f;
        if (videoPublishEditModel.hasOriginalSound()) {
            f = 0.5f;
        } else {
            f = 0.0f;
        }
        videoPublishEditModel.voiceVolume = f;
        if (videoPublishEditModel.mDuetFrom != null && !C39629l.m88232a().mo58583n().mo83103a(C40790a.StudioDuetChangeLayout)) {
            f3 = 1.0f;
        } else if (videoPublishEditModel.isMusic() <= 0) {
            f3 = 0.0f;
        }
        videoPublishEditModel.musicVolume = f3;
        videoPublishEditModel.title = intent.getStringExtra("video_title");
        videoPublishEditModel.chain = intent.getStringExtra("video_title_chain");
        videoPublishEditModel.disableDeleteChain = intent.getBooleanExtra("disable_delete_title_chain", false);
        videoPublishEditModel.isPrivate = intent.getIntExtra("is_rivate", 0);
        videoPublishEditModel.commentSetting = intent.getIntExtra("comment_setting", 0);
        videoPublishEditModel.structList = (List) intent.getSerializableExtra("struct_list");
        videoPublishEditModel.mDurationMode = intent.getBooleanExtra("duration_mode", false);
        videoPublishEditModel.mIsMultiVideo = intent.getBooleanExtra("upload_video_type", false);
        videoPublishEditModel.autoEnhanceType = intent.getIntExtra("extra_auto_enhance_type", 0);
        videoPublishEditModel.autoEnhanceOn = intent.getBooleanExtra("extra_auto_enhance_state", false);
        videoPublishEditModel.poiId = intent.getStringExtra("poi_struct_in_tools_line");
        C46806g.m101651a(intent, C44309n.m97058b((BaseShortVideoContext) videoPublishEditModel));
        videoPublishEditModel.reactionParams = (ReactionParams) intent.getParcelableExtra("reaction_params");
        videoPublishEditModel.isMuted = intent.getBooleanExtra("is_muted", false);
        if (!videoPublishEditModel.isMuted) {
            f2 = videoPublishEditModel.voiceVolume;
        }
        videoPublishEditModel.voiceVolume = f2;
        videoPublishEditModel.recordMode = intent.getIntExtra("record_mode", 0);
        videoPublishEditModel.gameScore = intent.getIntExtra("record_game_score", 0);
        videoPublishEditModel.mMusicOrigin = intent.getStringExtra("music_origin");
        videoPublishEditModel.microAppId = intent.getStringExtra("micro_app_id");
        videoPublishEditModel.microAppModel = (C43758o) intent.getSerializableExtra("micro_app_info");
        videoPublishEditModel.extractFramesModel = (ExtractFramesModel) intent.getSerializableExtra("extract_model");
        videoPublishEditModel.infoStickerModel = (InfoStickerModel) intent.getParcelableExtra("infosticker_model");
        videoPublishEditModel.md5 = intent.getStringExtra("md5");
        videoPublishEditModel.storyFestivalModel = (StoryFestivalModel) intent.getParcelableExtra("story_festival_model");
        if (intent.hasExtra("extra_import_video_info_list")) {
            videoPublishEditModel.importInfoList = intent.getParcelableArrayListExtra("extra_import_video_info_list");
        }
        videoPublishEditModel.videoCount = intent.getIntExtra("extra_video_count", 0);
        videoPublishEditModel.photoCount = intent.getIntExtra("extra_photo_count", 0);
        videoPublishEditModel.enterFrom = intent.getStringExtra("enter_from");
        videoPublishEditModel.sendToUserHead = (UrlModel) intent.getSerializableExtra("send_to_user_head");
        videoPublishEditModel.isFastImport = intent.getBooleanExtra("extra_av_is_fast_import", false);
        videoPublishEditModel.fastImportErrorCode = intent.getIntExtra("extra_fast_import_error_code", -1);
        videoPublishEditModel.fastImportResolution = intent.getStringExtra("extra_av_enable_fast_import_resolution");
        videoPublishEditModel.isStickPointMode = intent.getBooleanExtra("extra_stickpoint_mode", false);
        videoPublishEditModel.suggestHumanVolume = intent.getFloatExtra("extra_suggest_human_volume", 1.0f);
        videoPublishEditModel.suggestVideoVolume = intent.getFloatExtra("extra_suggest_video_volume", 1.0f);
        videoPublishEditModel.successEnableAEC = intent.getBooleanExtra("extra_success_enable_aec", false);
        if (intent.hasExtra("extra_share_context")) {
            C26916m mVar = (C26916m) intent.getSerializableExtra("extra_share_context");
            if (mVar != null) {
                mVar.mAppName = intent.getStringExtra("extra_share_app_name");
                C52711k.m112240b(videoPublishEditModel, "model");
                C52711k.m112240b(mVar, "context");
            }
            C43597g gVar = new C43597g();
            gVar.setShareContext(mVar);
            videoPublishEditModel.setMainBusinessContext(gVar);
        }
        if (intent.hasExtra("extra_mention_user_model")) {
            videoPublishEditModel.mentionUserModel = (ExtraMentionUserModel) intent.getSerializableExtra("extra_mention_user_model");
        }
        if (intent.hasExtra("extra_ar_text")) {
            videoPublishEditModel.arTextList = intent.getStringArrayListExtra("extra_ar_text");
        }
        if (intent.hasExtra("extra_sticker_text")) {
            videoPublishEditModel.messageBubbleTexts = intent.getStringArrayListExtra("extra_sticker_text");
        }
        if (intent.hasExtra("extra_countdown_mode")) {
            videoPublishEditModel.countDownModes = intent.getIntegerArrayListExtra("extra_countdown_mode");
        }
        if (intent.hasExtra("extra_draft_transform_model")) {
            videoPublishEditModel.draftEditTransferModel = (DraftEditTransferModel) intent.getParcelableExtra("extra_draft_transform_model");
        }
        if (intent.hasExtra("av_upload_struct")) {
            videoPublishEditModel.uploadMiscInfoStruct = (C43895j) intent.getSerializableExtra("av_upload_struct");
        }
        videoPublishEditModel.containBackgroundVideo = intent.getBooleanExtra("contain_backgroundvideo", false);
        videoPublishEditModel.supportRetake = intent.getBooleanExtra("support_retake", true);
        if (intent.hasExtra("extra_multi_edit_video_data")) {
            videoPublishEditModel.multiEditVideoRecordData = (MultiEditVideoStatusRecordData) intent.getParcelableExtra("extra_multi_edit_video_data");
        }
        if (intent.hasExtra("key_mv_theme_data")) {
            videoPublishEditModel.mvCreateVideoData = (C23289b) intent.getSerializableExtra("key_mv_theme_data");
            if (videoPublishEditModel.mvCreateVideoData != null) {
                if (videoPublishEditModel.mvCreateVideoData.mvType == 1) {
                    videoPublishEditModel.videoEditorType = 3;
                } else {
                    videoPublishEditModel.videoEditorType = 2;
                }
            }
        } else if (videoPublishEditModel.isStickPointMode) {
            videoPublishEditModel.videoEditorType = 4;
        } else if (intent.hasExtra("stitch_params") || videoPublishEditModel.isStitchMode()) {
            videoPublishEditModel.videoEditorType = 7;
            videoPublishEditModel.stitchParams = (StitchParams) intent.getParcelableExtra("stitch_params");
        } else if (videoPublishEditModel.isMultiVideoEdit()) {
            videoPublishEditModel.videoEditorType = 6;
        }
        if (intent.hasExtra("key_stick_point_data")) {
            videoPublishEditModel.stickPointData = (C45623a) intent.getSerializableExtra("key_stick_point_data");
        }
        if (intent.hasExtra("extra_ve_cher_effect_param")) {
            videoPublishEditModel.veCherEffectParam = (ClientCherEffectParam) intent.getParcelableExtra("extra_ve_cher_effect_param");
        }
        if (intent.hasExtra("extra_ve_audio_effect_param")) {
            videoPublishEditModel.veAudioEffectParam = (AudioEffectParam) intent.getParcelableExtra("extra_ve_audio_effect_param");
        }
        if (intent.hasExtra("sticker_challenge")) {
            videoPublishEditModel.stickerChallenge = (StickerChallenge) intent.getParcelableExtra("sticker_challenge");
        }
        if (intent.hasExtra("audio_record_param")) {
            videoPublishEditModel.veAudioRecorderParam = (AudioRecorderParam) intent.getParcelableExtra("audio_record_param");
        }
        videoPublishEditModel.pic2VideoSource = intent.getStringExtra("picture_source");
        videoPublishEditModel.allowDownloadSetting = intent.getIntExtra("download_setting", 0);
        if (intent.hasExtra("key_status_video_data")) {
            videoPublishEditModel.statusCreateVideoData = (StatusCreateVideoData) intent.getParcelableExtra("key_status_video_data");
            if (videoPublishEditModel.statusCreateVideoData != null) {
                videoPublishEditModel.videoEditorType = 5;
                if (!TextUtils.isEmpty(videoPublishEditModel.statusCreateVideoData.getMusicPath()) && TextUtils.isEmpty(videoPublishEditModel.mMusicPath)) {
                    videoPublishEditModel.mMusicPath = videoPublishEditModel.statusCreateVideoData.getMusicPath();
                }
            }
        }
        videoPublishEditModel.mUseMusicBeforeEdit = intent.getBooleanExtra("use_music_before_edit", false);
        videoPublishEditModel.reviewVideoId = intent.getStringExtra("video_id");
        videoPublishEditModel.duetLayout = intent.getStringExtra("extra_duet_layout");
        if (intent.hasExtra("live_publish_model")) {
            videoPublishEditModel.livePublishModel = (LivePublishModel) intent.getSerializableExtra("live_publish_model");
        }
        if (videoPublishEditModel.mShootMode == 13) {
            videoPublishEditModel.greenScreenDefaultImage = intent.getStringExtra("green_screen_default_image");
            if (intent.hasExtra("green_screen_image_list")) {
                videoPublishEditModel.greenScreenImages = intent.getParcelableArrayListExtra("green_screen_image_list");
            }
        }
        videoPublishEditModel.cameraLensInfo = intent.getStringArrayListExtra("extra_camera_lens_info");
        videoPublishEditModel.cutSameEditData = (CutSameEditData) intent.getParcelableExtra("cutsame_data");
        return videoPublishEditModel;
    }

    /* renamed from: a */
    public final C29059c mo88377a(VideoPublishEditModel videoPublishEditModel) {
        C29068f fVar;
        C29059c cVar = new C29059c();
        cVar.mo58753a(videoPublishEditModel.getPreviewInfo());
        cVar.mo58752a(videoPublishEditModel.getNewVersion());
        C29057a aVar = new C29057a();
        aVar.f76028a = videoPublishEditModel.title;
        aVar.f76032e = videoPublishEditModel.chain;
        aVar.f76033f = videoPublishEditModel.disableDeleteChain;
        aVar.f76030c = videoPublishEditModel.challenges;
        aVar.f76031d = videoPublishEditModel.getVideoLength();
        aVar.f76029b = videoPublishEditModel.getStructList();
        cVar.f76144b = aVar;
        cVar.mo58755a(C39630m.m88234a().mo58621s().mo74229a(videoPublishEditModel.poiId));
        if (videoPublishEditModel.isReviewVideo()) {
            cVar.f76147e = C43214dh.m94817a().f109286a;
        } else {
            cVar.f76147e = C43214dh.m94817a().mo50201b();
        }
        cVar.f76142T.f76058Y = videoPublishEditModel.videoCategory;
        cVar.f76142T.f76097az = videoPublishEditModel.commentVideoModel;
        cVar.f76149g = videoPublishEditModel.mMusicPath;
        cVar.f76154l = videoPublishEditModel.mMusicStart;
        int i = videoPublishEditModel.mMusicEnd;
        if (cVar.f76142T != null) {
            cVar.f76142T.f76055V = i;
        }
        cVar.f76142T.f76109m = videoPublishEditModel.mMusicOrigin;
        C29061d.m68495a(cVar, videoPublishEditModel.getFilterIndex());
        cVar.f76142T.f76086ao = videoPublishEditModel.mSelectedFilterIntensity;
        cVar.f76127E = videoPublishEditModel.mFaceBeauty;
        cVar.f76162t = videoPublishEditModel.mCameraPosition;
        cVar.f76161s = videoPublishEditModel.mCurFilterLabels;
        cVar.f76142T.f76119w = videoPublishEditModel.mCurFilterIds;
        cVar.f76156n = videoPublishEditModel.mOrigin;
        cVar.f76128F = C39629l.m88232a().mo58593x().mo74283c();
        cVar.f76130H = videoPublishEditModel.mVideoSegmentsDesc;
        cVar.f76131I = videoPublishEditModel.mHardEncode;
        cVar.f76134L = videoPublishEditModel.mStickerID;
        cVar.f76142T.f76042I = videoPublishEditModel.defaultSelectStickerPoi;
        cVar.f76142T.f76049P = videoPublishEditModel.getVideoCoverPath();
        cVar.f76163u = videoPublishEditModel.faceBeautyOpen ? 1 : 0;
        cVar.f76142T.f76061aA = videoPublishEditModel.mBeautyMetadatas;
        cVar.f76124B = videoPublishEditModel.isPrivate;
        cVar.f76142T.f76039F = videoPublishEditModel.commentSetting;
        cVar.f76126D = videoPublishEditModel.maxDuration;
        cVar.f76159q = videoPublishEditModel.audioTrack;
        cVar.f76158p = videoPublishEditModel.videoSpeed;
        cVar.f76142T.f76072aa = videoPublishEditModel.cameraIds;
        cVar.f76142T.f76073ab = videoPublishEditModel.beautyType;
        cVar.f76142T.f76074ac = videoPublishEditModel.importInfoList;
        cVar.mo58757a(videoPublishEditModel.metadataMap);
        cVar.f76142T.f76051R = videoPublishEditModel.mOutVideoWidth;
        cVar.f76142T.f76052S = videoPublishEditModel.mOutVideoHeight;
        cVar.f76142T.f76053T = videoPublishEditModel.mVideoCanvasWidth;
        cVar.f76142T.f76054U = videoPublishEditModel.mVideoCanvasHeight;
        EffectListModel effectListModel = new EffectListModel();
        effectListModel.setEffectPointModels(videoPublishEditModel.mEffectList);
        cVar.f76125C = effectListModel;
        cVar.f76155m = videoPublishEditModel.getEffect();
        int timeEffectStartPoint = videoPublishEditModel.getTimeEffectStartPoint();
        cVar.f76142T.f76057X = Integer.valueOf(timeEffectStartPoint);
        cVar.f76132J = videoPublishEditModel.getSpecialPoints();
        cVar.mo58751a(videoPublishEditModel.mVideoCoverStartTm);
        cVar.f76139Q = videoPublishEditModel.mDuetFrom;
        cVar.f76142T.f76079ah = videoPublishEditModel.mUploadPath;
        cVar.f76140R = videoPublishEditModel.mSyncPlatforms;
        cVar.f76142T.f76098b = videoPublishEditModel.getFrom();
        cVar.f76142T.f76060a = videoPublishEditModel.mShootMode;
        cVar.f76142T.f76107k = videoPublishEditModel.microAppId;
        cVar.f76142T.f76035B = videoPublishEditModel.microAppModel;
        cVar.f76142T.f76099c = videoPublishEditModel.creationId;
        cVar.mo58791b(videoPublishEditModel.draftId);
        String str = videoPublishEditModel.mShootWay;
        if (TextUtils.isEmpty(str)) {
            str = "edit_draft";
        }
        cVar.f76142T.f76100d = str;
        cVar.f76142T.f76122z = videoPublishEditModel.autoEnhanceOn;
        cVar.f76142T.f76034A = videoPublishEditModel.autoEnhanceType;
        cVar.f76142T.f76103g = videoPublishEditModel.mDurationMode;
        cVar.f76142T.f76102f = videoPublishEditModel.mIsMultiVideo;
        cVar.f76142T.f76106j = videoPublishEditModel.reactionParams;
        cVar.f76142T.f76108l = videoPublishEditModel.isMuted;
        cVar.f76142T.f76104h = videoPublishEditModel.recordMode;
        cVar.f76142T.f76105i = videoPublishEditModel.gameScore;
        cVar.f76142T.f76118v = videoPublishEditModel.extractFramesModel;
        cVar.mo58754a(videoPublishEditModel.mSaveModel);
        cVar.f76142T.f76121y = videoPublishEditModel.infoStickerModel;
        cVar.f76142T.f76036C = videoPublishEditModel.videoType;
        cVar.f76142T.f76037D = videoPublishEditModel.texts;
        cVar.f76142T.f76038E = videoPublishEditModel.usePaint;
        cVar.f76142T.f76040G = videoPublishEditModel.socialModel;
        cVar.f76142T.f76075ad = videoPublishEditModel.stickerChallenge;
        if (videoPublishEditModel.getNewVersion() == C39629l.m88232a().mo58573d().mo80733b()) {
            cVar.f76152j = (int) (videoPublishEditModel.musicVolume * 100.0f);
            cVar.f76151i = (int) (videoPublishEditModel.voiceVolume * 100.0f);
        }
        C46806g.m101653a(C44309n.m97057a((BaseShortVideoContext) videoPublishEditModel), C44309n.m97054a(cVar.f76142T), C46804e.PUBLISH, C46804e.DRAFT);
        cVar.f76142T.f76112p = videoPublishEditModel.poiData;
        cVar.f76142T.f76063aC = videoPublishEditModel.getStickPointType();
        cVar.f76142T.f76041H = videoPublishEditModel.mFirstStickerMusicIdsJson;
        cVar.f76142T.f76113q = videoPublishEditModel.commerceData;
        cVar.f76142T.f76046M = videoPublishEditModel.isFastImport;
        cVar.f76142T.f76047N = videoPublishEditModel.fastImportResolution;
        cVar.f76142T.f76043J = videoPublishEditModel.mvCreateVideoData;
        cVar.f76142T.f76044K = videoPublishEditModel.statusCreateVideoData;
        cVar.f76142T.f76078ag = videoPublishEditModel.isStickPointMode;
        cVar.f76142T.f76093av = videoPublishEditModel.containBackgroundVideo;
        cVar.f76142T.f76045L = videoPublishEditModel.uploadMiscInfoStruct;
        if (videoPublishEditModel.draftEditTransferModel != null) {
            cVar.f76146d = videoPublishEditModel.draftEditTransferModel.getPrimaryKey();
            if (videoPublishEditModel.draftEditTransferModel.getVideoSegmentsCopy() != null) {
                cVar.mo58756a(videoPublishEditModel.draftEditTransferModel.getVideoSegmentsCopy());
            }
        }
        videoPublishEditModel.draftEditTransferModel = new DraftEditTransferModel(cVar.mo58774ak(), C29061d.m68501f(cVar));
        C29070h hVar = null;
        if (videoPublishEditModel == null || videoPublishEditModel.veCherEffectParam == null) {
            fVar = null;
        } else {
            fVar = new C29068f(videoPublishEditModel.veCherEffectParam.getMatrix(), videoPublishEditModel.veCherEffectParam.getDuration(), videoPublishEditModel.veCherEffectParam.getSegUseCher());
        }
        cVar.f76142T.f76050Q = fVar;
        if (!(videoPublishEditModel == null || videoPublishEditModel.veAudioEffectParam == null)) {
            hVar = new C29070h(videoPublishEditModel.veAudioEffectParam.getUploadId(), videoPublishEditModel.veAudioEffectParam.getTrackType(), videoPublishEditModel.veAudioEffectParam.getTrackIndex(), videoPublishEditModel.veAudioEffectParam.getEffectPath(), videoPublishEditModel.veAudioEffectParam.getEffectTag(), videoPublishEditModel.veAudioEffectParam.getSeqIn(), videoPublishEditModel.veAudioEffectParam.getSeqOut(), videoPublishEditModel.veAudioEffectParam.getChallenge());
        }
        cVar.f76142T.f76056W = hVar;
        if (videoPublishEditModel.veAudioRecorderParam != null) {
            AudioRecorderParam audioRecorderParam = videoPublishEditModel.veAudioRecorderParam;
            C52711k.m112240b(cVar, "$this$setAudioRecorderParam");
            C52711k.m112240b(audioRecorderParam, "param");
            AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
            audioRecorderParam2.copyFrom(audioRecorderParam);
            audioRecorderParam2.setAudioUrl(C50197a.m108326a(audioRecorderParam2));
            audioRecorderParam2.setExtraUrl("");
            cVar.f76142T.f76077af = audioRecorderParam2;
        }
        if (videoPublishEditModel.mOrigin == 0) {
            cVar.mo58757a(C20084a.m49601a());
        } else {
            cVar.mo58757a(videoPublishEditModel.metadataMap);
        }
        cVar.f76142T.f76084am = videoPublishEditModel.videoCount;
        cVar.f76142T.f76085an = videoPublishEditModel.photoCount;
        String str2 = videoPublishEditModel.pic2VideoSource;
        C29058b bVar = cVar.f76142T;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        C52711k.m112240b(str2, "<set-?>");
        bVar.f76087ap = str2;
        cVar.f76142T.f76088aq = videoPublishEditModel.allowDownloadSetting;
        boolean z = videoPublishEditModel.mUseMusicBeforeEdit;
        if (cVar.f76142T != null) {
            cVar.f76142T.f76089ar = z;
        }
        cVar.f76142T.f76090as = videoPublishEditModel.reviewVideoId;
        cVar.f76142T.f76092au = videoPublishEditModel.multiEditVideoRecordData;
        cVar.f76142T.f76091at = videoPublishEditModel.supportRetake;
        cVar.f76142T.f76094aw = videoPublishEditModel.stickPointData;
        cVar.f76142T.f76095ax = C46448b.m100834a(videoPublishEditModel);
        cVar.f76142T.f76110n = videoPublishEditModel.getMainBusinessData();
        cVar.f76142T.f76096ay = videoPublishEditModel.stickerInfo;
        if (C39629l.m88232a().mo58583n().mo83104b(C40790a.EffectSDKInfoStickerUseAmazing) == 1) {
            cVar.f76142T.f76062aB = false;
        }
        cVar.f76142T.f76064aD = videoPublishEditModel.duetLayout;
        cVar.f76142T.f76065aE = videoPublishEditModel.livePublishModel;
        cVar.f76142T.f76066aF = videoPublishEditModel.stitchParams;
        cVar.f76142T.f76067aG = videoPublishEditModel.isCommerceMusic;
        if (videoPublishEditModel.isGreenScreen()) {
            cVar.f76142T.f76068aH = videoPublishEditModel.greenScreenDefaultImage;
            cVar.f76142T.f76069aI = videoPublishEditModel.greenScreenImages;
        }
        cVar.f76142T.f76070aJ = videoPublishEditModel.cameraLensInfo;
        cVar.f76142T.f76071aK = videoPublishEditModel.cutSameEditData;
        int a = C29061d.m68492a(cVar);
        if (a != 0 && !cVar.mo58743T()) {
            C23569o.m57776a("aweme_draft_load_fail_rate", -1, C23088c.m56631a().mo47824a("owner", this.f109839a).mo47824a("validity", String.valueOf(a)).mo47824a("videoPath", C29061d.m68497b(cVar)).mo47819a("is_fast_import", Boolean.valueOf(cVar.mo58767ad())).mo47825b());
        }
        return cVar;
    }

    /* renamed from: a */
    public static boolean m95226a(VideoPublishEditModel videoPublishEditModel, Intent intent, String str) {
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        Intent intent2 = intent;
        String str2 = str;
        if (intent2 != null) {
            videoPublishEditModel2.musicId = intent2.getStringExtra("id");
            videoPublishEditModel2.creationId = intent2.getStringExtra("creation_id");
            videoPublishEditModel2.mShootWay = intent2.getStringExtra("shoot_way");
            videoPublishEditModel2.challenges = (List) intent2.getSerializableExtra("challenge");
        }
        videoPublishEditModel2.mOrigin = 0;
        videoPublishEditModel2.mFromCut = true;
        videoPublishEditModel2.isFastImport = true;
        videoPublishEditModel2.fastImportResolution = C42673r.f107974a.mo86990a();
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str2, iArr) != 0) {
            return false;
        }
        VideoFileInfo videoFileInfo = new VideoFileInfo(iArr[0], iArr[1], (long) iArr[3], iArr[7], 0);
        EditVideoSegment editVideoSegment = new EditVideoSegment(str2, null, videoFileInfo);
        VideoCutInfo videoCutInfo = new VideoCutInfo(0, editVideoSegment.getVideoFileInfo().getDuration(), 1.0f, 0);
        editVideoSegment.setVideoCutInfo(videoCutInfo);
        ArrayList arrayList = new ArrayList();
        arrayList.add(editVideoSegment);
        videoPublishEditModel2.setPreviewInfo(new C43672e(C39629l.m88232a().mo58579j().getVideoWidth(), C39629l.m88232a().mo58579j().getVideoHeight()).mo89102a(arrayList));
        videoPublishEditModel.videoWidth();
        ArrayList<ImportVideoInfo> arrayList2 = new ArrayList<>();
        ImportVideoInfo importVideoInfo = r1;
        ImportVideoInfo importVideoInfo2 = new ImportVideoInfo(iArr[0], iArr[1], iArr[6], iArr[8], str, (long) iArr[3], (long) iArr[3], null, null);
        arrayList2.add(importVideoInfo);
        videoPublishEditModel2.importInfoList = arrayList2;
        videoPublishEditModel2.mDir = C43308eb.f109491d;
        Workspace a = C42386b.m93131a(videoPublishEditModel);
        videoPublishEditModel2.mOutputFile = a.mo86463j().getPath();
        videoPublishEditModel2.mEncodedAudioOutputFile = a.mo86464k().getPath();
        videoPublishEditModel2.mParallelUploadOutputFile = a.mo86465l().getPath();
        videoPublishEditModel2.videoCount = 1;
        videoPublishEditModel2.voiceVolume = 0.5f;
        videoPublishEditModel2.mShootMode = -1;
        videoPublishEditModel2.mDuetFrom = null;
        videoPublishEditModel2.setNewVersion(C39629l.m88232a().mo58573d().mo80733b());
        videoPublishEditModel.generateVideoCoverPath();
        return true;
    }

    /* renamed from: a */
    private static AVTextExtraStruct m95225a(int i, int i2, String str, String str2) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.setAtUserType("");
        aVTextExtraStruct.setType(0);
        aVTextExtraStruct.setStart(i);
        aVTextExtraStruct.setEnd(i2);
        aVTextExtraStruct.setUserId(str);
        aVTextExtraStruct.setAwemeId(str2);
        return aVTextExtraStruct;
    }
}
