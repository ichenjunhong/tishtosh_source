package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p030v4.p038f.C0794k;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import com.google.p1057b.p1060c.C17564ai;
import com.google.p1057b.p1060c.C17666bt;
import com.p683ss.android.ugc.asve.p1241e.C20393d;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p683ss.android.ugc.aweme.draft.model.C29067e;
import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p683ss.android.ugc.aweme.effect.EffectPointModel;
import com.p683ss.android.ugc.aweme.greenscreen.GreenScreenImage;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerCategoryParams;
import com.p683ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p683ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.p683ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1388at.C23289b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.services.video.VideoExposureData;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.C43308eb;
import com.p683ss.android.ugc.aweme.shortvideo.C43895j;
import com.p683ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.p683ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p683ss.android.ugc.aweme.shortvideo.StoryBoomModel;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43577d;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43596f;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C43597g;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.C43668b;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2194f.C43470a;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.StoryFestivalModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45623a;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p683ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.utils.C47716bd;
import com.p683ss.android.ugc.aweme.utils.C47768ci;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.VESize;
import com.p683ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel */
public class VideoPublishEditModel extends BaseShortVideoContext implements Serializable, Cloneable {
    public static final Creator<VideoPublishEditModel> CREATOR = new Creator<VideoPublishEditModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VideoPublishEditModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VideoPublishEditModel(parcel);
        }
    };
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private EditPreviewInfo f109577a;
    public String aiMusicLogPbImprId;
    public UrlModel audioTrack;
    public boolean autoEnhanceOn;
    public int autoEnhanceType;

    /* renamed from: b */
    private String f109578b;
    public int beautyType;

    /* renamed from: c */
    private final transient C17971f f109579c;
    public String cameraIds;
    public ArrayList<String> cameraLensInfo;
    public String ccVid;
    public int comFrom;
    public CommentVideoModel commentVideoModel;
    public CompileProbeResult compileProbeResult;
    public boolean containBackgroundVideo;
    public ArrayList<Integer> countDownModes;
    public String creationId;

    /* renamed from: d */
    private transient C43597g f109580d;
    public C29067e defaultSelectStickerPoi;
    public int draftId;
    public String duetLayout;

    /* renamed from: e */
    private int f109581e;
    public String enterFrom;
    public ExtractFramesModel extractFramesModel;

    /* renamed from: f */
    private int f109582f;
    public boolean faceBeautyOpen;
    public int fastImportErrorCode;
    public String fastImportResolution;
    public int gameScore;
    public String greenScreenDefaultImage;
    public ArrayList<GreenScreenImage> greenScreenImages;
    public ArrayList<ImportVideoInfo> importInfoList;
    public InfoStickerCategoryParams infoStickerCategoryParams;
    public InfoStickerModel infoStickerModel;
    public boolean isCommerceMusic;
    public boolean isFastImport;
    public boolean isMuted;
    public boolean isOriginalSound;
    public boolean isStickPointMode;
    public boolean isStoryTextRecord;
    public transient boolean isSyntheticHardEncode;
    public LivePublishModel livePublishModel;
    public int mAudioRecordIndex;
    public ArrayList<BeautyMetadata> mBeautyMetadatas;
    public String mBindMvId;
    public int mCameraPosition;
    public String mCurFilterIds;
    public String mCurFilterLabels;
    public int mCurMusicLength;
    public String mDir;
    public User mDuetAuthor;
    public String mDuetFrom;
    public String mDuetHashTag;
    public boolean mDurationMode;
    public ArrayList<EffectPointModel> mEffectList;
    public String mEncodedAudioOutputFile;
    public String mEyesLabels;
    public int mFaceBeauty;
    public String mFirstStickerMusicIdsJson;
    public boolean mFromCut;
    public boolean mFromMultiCut;
    public int mHardEncode;
    public String mId3Album;
    public String mId3Author;
    public String mId3Title;
    public boolean mIsMultiVideo;
    public int mMusicEnd;
    public String mMusicOrigin;
    public String mMusicPath;
    public int mMusicRecType;
    public int mMusicShowRank;
    public int mMusicStart;
    public int mMusicType;
    public int mOrigin;
    public int mOutVideoHeight;
    public int mOutVideoWidth;
    public String mOutputFile;
    public String mParallelUploadOutputFile;
    public int mRecordVideoSelectedFilterIndex;
    public float mRecordVideoSelectedFilterIntensity;
    public String mReshapeLabels;
    public int mRestoreType;
    @C17952c(mo34828a = "save_model")
    public AVUploadSaveModel mSaveModel;
    public float mSelectedFilterIntensity;
    public int mSelectedId;
    public int mShootMode;
    public String mSmoothSkinLabels;
    public String mStickerID;
    public String mStickerPath;
    public C43470a mSubtitleMusicChangeChecker;
    public String mTanningLabels;
    public EffectPointModel mTimeEffect;
    public String mUploadPath;
    public int mUseFilter;
    public boolean mUseMusicBeforeEdit;
    public int mVideoCanvasHeight;
    public int mVideoCanvasWidth;
    public float mVideoCoverStartTm;
    public String mVideoSegmentsDesc;
    public int mWatermarkVideoHeight;
    public int mWatermarkVideoWidth;
    public boolean mWillGoOnShortVideo;
    public transient Workspace mWorkspace;
    public long maxDuration;
    public String md5;
    public int mentionEditTextLength;
    public ExtraMentionUserModel mentionUserModel;
    public Map<String, Object> metadataMap;
    public String microAppId;
    public C43758o microAppModel;
    public MultiEditVideoStatusRecordData multiEditVideoRecordData;
    public String musicId;
    public float musicVolume;
    public C23289b mvCreateVideoData;
    public int photoCount;
    public String pic2VideoSource;
    public float previewStartTime;
    public ReactionParams reactionParams;
    public int recordMode;
    public String reviewVideoId;
    public UrlModel sendToUserHead;
    public String shopDraftId;
    public SocialModel socialModel;
    public StatusCreateVideoData statusCreateVideoData;
    public C45623a stickPointData;
    public StickerChallenge stickerChallenge;
    public StitchParams stitchParams;
    public StoryBoomModel storyBoomModel;
    public StoryFestivalModel storyFestivalModel;
    public boolean successEnableAEC;
    public float suggestHumanVolume;
    public float suggestVideoVolume;
    public boolean supportRetake;
    public String textEffectIds;
    public String textTypes;
    public List<String> texts;
    public C43895j uploadMiscInfoStruct;
    public UploadSpeedInfo uploadSpeedInfo;
    public boolean usePaint;
    public AudioEffectParam veAudioEffectParam;
    public AudioRecorderParam veAudioRecorderParam;
    public ClientCherEffectParam veCherEffectParam;
    public VideoCategoryParam videoCategory;
    public int videoCount;
    public int videoEditorType;
    public String videoSpeed;
    public int videoType;
    public float voiceVolume;

    public int describeContents() {
        return 0;
    }

    public String getBindMvId() {
        return this.mBindMvId;
    }

    public int getCamera() {
        return this.mCameraPosition;
    }

    public String getCameraIds() {
        return this.cameraIds;
    }

    public String getCity() {
        return this.city;
    }

    public User getDuetAuthor() {
        return this.mDuetAuthor;
    }

    public String getDuetFrom() {
        return this.mDuetFrom;
    }

    public String getDuetHashTag() {
        return this.mDuetHashTag;
    }

    public String getEnterFrom() {
        return this.enterFrom;
    }

    public String getFilterIds() {
        return this.mCurFilterIds;
    }

    public int getFilterIndex() {
        return this.mSelectedId;
    }

    public String getFilterName() {
        return this.mCurFilterLabels;
    }

    public String getFxName() {
        return null;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public String getMicroAppId() {
        return this.microAppId;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getNationalTaskId() {
        return this.nationalTaskId;
    }

    public int getNewVersion() {
        return this.f109581e;
    }

    public int getOriginal() {
        return this.mOrigin;
    }

    public String getOutputFile() {
        return this.mOutputFile;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public int getPrettify() {
        return this.mFaceBeauty;
    }

    public EditPreviewInfo getPreviewInfo() {
        return this.f109577a;
    }

    public ReactionParams getReactionParams() {
        return this.reactionParams;
    }

    public UrlModel getSendToUserHead() {
        return this.sendToUserHead;
    }

    public String getSpeed() {
        return this.videoSpeed;
    }

    public int getStickPointType() {
        return this.f109582f;
    }

    public String getStickers() {
        return this.mStickerID;
    }

    public StitchParams getStitchParams() {
        return this.stitchParams;
    }

    public List<AVTextExtraStruct> getStructList() {
        return this.structList;
    }

    public String getSyncPlatforms() {
        return this.mSyncPlatforms;
    }

    public String getTagId() {
        return this.tagId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVideoCoverPath() {
        return this.f109578b;
    }

    public boolean isCommercialMusic() {
        return this.isCommerceMusic;
    }

    public boolean isOriginalSound() {
        return this.isOriginalSound;
    }

    public int isPrivate() {
        return this.isPrivate;
    }

    public String draftDir() {
        return uniqueVideoSessionDir(C43308eb.f109493f);
    }

    public void generateVideoCoverPath() {
        this.f109578b = C43761q.m96174a();
    }

    public Float getPreviewStartTime() {
        return Float.valueOf(this.previewStartTime);
    }

    public boolean isCommentReply() {
        return CommentUtils.isDataValid(this.commentVideoModel);
    }

    public boolean isCutSameVideoType() {
        if (this.cutSameEditData != null) {
            return true;
        }
        return false;
    }

    public int isMusic() {
        if (this.mMusicPath == null) {
            return 0;
        }
        return 1;
    }

    public boolean isUploadVideo() {
        if (this.mOrigin == 0) {
            return true;
        }
        return false;
    }

    public boolean publishFromLive() {
        if (this.livePublishModel != null) {
            return true;
        }
        return false;
    }

    public MultiEditVideoRecordData getCurMultiEditVideoRecordData() {
        if (!isMultiVideoEdit()) {
            return null;
        }
        return this.multiEditVideoRecordData.curMultiEditVideoRecordData;
    }

    public int getFrom() {
        if (this.mFromCut) {
            return 0;
        }
        if (this.mFromMultiCut) {
            return 1;
        }
        return 3;
    }

    public int getImportVideoCount() {
        if (this.importInfoList == null) {
            return 0;
        }
        return this.importInfoList.size();
    }

    public String getLocalFinalPath() {
        if (this.mSaveModel == null) {
            return null;
        }
        return this.mSaveModel.getLocalFinalPath();
    }

    public String getLocalTempPath() {
        if (this.mSaveModel == null) {
            return null;
        }
        return this.mSaveModel.getLocalTempPath();
    }

    public long getMultiEditVideoStartTime() {
        if (!isMultiVideoEdit()) {
            return 0;
        }
        return getCurMultiEditVideoRecordData().startTime;
    }

    public C42482c getOriginalRecordMusic() {
        if (!isMultiVideoEdit()) {
            return null;
        }
        return this.multiEditVideoRecordData.recordMusic;
    }

    public int getSpecialPoints() {
        if (this.mTimeEffect == null) {
            return 0;
        }
        return this.mTimeEffect.getEndPoint();
    }

    public int getTimeEffectStartPoint() {
        if (this.mTimeEffect == null) {
            return 0;
        }
        return this.mTimeEffect.getStartPoint();
    }

    public String getValidVideoCoverPath() {
        if (C50200d.m108346a(this.f109578b)) {
            return this.f109578b;
        }
        return null;
    }

    public boolean hasOriginalSound() {
        if (getWavFile() != null) {
            return true;
        }
        return false;
    }

    public boolean hasRecord() {
        if (this.veAudioRecorderParam == null || !this.veAudioRecorderParam.hasRecord()) {
            return false;
        }
        return true;
    }

    public boolean hasRetake() {
        if (!isMultiVideoEdit()) {
            return false;
        }
        return this.multiEditVideoRecordData.curMultiEditVideoRecordData.hasRetake;
    }

    public boolean hasSubtitle() {
        if (this.infoStickerModel != null) {
            return this.infoStickerModel.hasSubtitle();
        }
        return false;
    }

    public boolean isAllowClearMusic() {
        if (isMvThemeVideoType() || isStatusVideoType()) {
            return false;
        }
        return true;
    }

    public boolean isDuet() {
        if (!TextUtils.isEmpty(getDuetFrom())) {
            return true;
        }
        return false;
    }

    public boolean isGreenScreen() {
        if (this.mShootMode == 13) {
            return true;
        }
        return false;
    }

    public boolean isMediaFromGallery() {
        return TextUtils.equals(getAvetParameter().getContentSource(), "upload");
    }

    public boolean isReviewVideo() {
        if (!TextUtils.isEmpty(this.reviewVideoId)) {
            return true;
        }
        return false;
    }

    public boolean isSaveLocal() {
        if (this.mSaveModel == null || !this.mSaveModel.isSaveLocal()) {
            return false;
        }
        return true;
    }

    public boolean isSaveLocalWithWaterMark() {
        if (this.mSaveModel == null || !this.mSaveModel.isSaveLocalWithWaterMark()) {
            return false;
        }
        return true;
    }

    public boolean isSaveLocalWithoutWaterMark() {
        if (this.mSaveModel == null || this.mSaveModel.isWaterMark()) {
            return false;
        }
        return true;
    }

    public boolean isSaveToAlbum() {
        if (this.mSaveModel == null || !this.mSaveModel.getSaveToAlbum()) {
            return false;
        }
        return true;
    }

    public boolean isSaveToLocalPathInsteadOfAlbum() {
        if (this.mSaveModel == null || !this.mSaveModel.isSaveToAppPathInsteadOfAlbum()) {
            return false;
        }
        return true;
    }

    public boolean isStatusVideoType() {
        if (this.statusCreateVideoData == null || this.videoEditorType != 5) {
            return false;
        }
        return true;
    }

    public boolean isStitchMode() {
        if (getStitchParams() != null) {
            return true;
        }
        return false;
    }

    public boolean isUseMultiEdit() {
        if (!isMultiVideoEdit()) {
            return false;
        }
        return this.multiEditVideoRecordData.isUseMultiEdit;
    }

    public void setUseMultiEdit() {
        if (isMultiVideoEdit()) {
            this.multiEditVideoRecordData.isUseMultiEdit = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VideoPublishEditModel clone() {
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(this);
        obtain.setDataPosition(0);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obtain.readValue(VideoPublishEditModel.class.getClassLoader());
        obtain.recycle();
        return videoPublishEditModel;
    }

    public String audioPath() {
        if (getPreviewInfo() == null) {
            return null;
        }
        return ((EditVideoSegment) getPreviewInfo().getVideoList().get(0)).getAudioPath();
    }

    public String getDescriptionByUpload() {
        if (C9414h.m18631b(this.importInfoList)) {
            return ((ImportVideoInfo) this.importInfoList.get(0)).getDescription();
        }
        return "";
    }

    public int getEffect() {
        if (this.mTimeEffect == null) {
            return 0;
        }
        return Integer.parseInt(this.mTimeEffect.getKey());
    }

    public String getMusicIdByUpload() {
        if (C9414h.m18631b(this.importInfoList)) {
            return ((ImportVideoInfo) this.importInfoList.get(0)).getMusicId();
        }
        return "";
    }

    public String getMusicOrigin() {
        if (!TextUtils.isEmpty(this.mMusicOrigin)) {
            return this.mMusicOrigin;
        }
        if (isCutSameVideoType()) {
            return "jianying_mv_default";
        }
        return "original";
    }

    public int getVideoLength() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return getPreviewInfo().getPreviewVideoLength();
    }

    public String getVideoResolution() {
        StringBuilder sb = new StringBuilder();
        sb.append(videoWidth());
        sb.append("*");
        sb.append(videoHeight());
        return sb.toString();
    }

    public String getWavFile() {
        if (audioPath() != null && new File(audioPath()).exists()) {
            return audioPath();
        }
        return null;
    }

    public boolean hasInfoStickers() {
        if (this.infoStickerModel == null || !C9414h.m18631b(this.infoStickerModel.stickers)) {
            return false;
        }
        return true;
    }

    public boolean hasLyricSticker() {
        if (!hasInfoStickers() || !this.infoStickerModel.hasLyricSticker()) {
            return false;
        }
        return true;
    }

    public boolean hasNotAudioRecord() {
        if (this.veAudioRecorderParam == null || !this.veAudioRecorderParam.hasRecord()) {
            return true;
        }
        return false;
    }

    public boolean isMvThemeVideoType() {
        if (this.mvCreateVideoData == null || (this.videoEditorType != 2 && this.videoEditorType != 3)) {
            return false;
        }
        return true;
    }

    public boolean isPreviewInfoValid() {
        if (getPreviewInfo() != null && !getPreviewInfo().getVideoList().isEmpty()) {
            return true;
        }
        C50203g.m108361b("EditPreviewInfo in VideoPublishEditModel is null");
        return false;
    }

    public boolean isReaction() {
        if (getReactionParams() == null || TextUtils.isEmpty(getReactionParams().reactionFromId)) {
            return false;
        }
        return true;
    }

    public boolean isRetakeVideo() {
        if (isMultiVideoEdit() && this.multiEditVideoRecordData.restoreMultiEditVideoRecordData != null && this.multiEditVideoRecordData.isMultiEditRetake) {
            return true;
        }
        return false;
    }

    public boolean isReverse() {
        if (this.mTimeEffect == null || !"1".equals(this.mTimeEffect.getKey())) {
            return false;
        }
        return true;
    }

    public boolean isSelfLive() {
        if (this.livePublishModel == null || !this.livePublishModel.getSelfVideo().booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean isStoryBoomMode() {
        if (getAvetParameter().getShootMode() != 6 || this.storyBoomModel == null) {
            return false;
        }
        return true;
    }

    public boolean isUseTimeReverseEffect() {
        if (this.mTimeEffect == null || !this.mTimeEffect.getKey().equals("1")) {
            return false;
        }
        return true;
    }

    public boolean publishFromLiveHighLight() {
        if (this.livePublishModel == null || this.livePublishModel.getType().intValue() != 2) {
            return false;
        }
        return true;
    }

    public boolean publishFromLiveScreenCapture() {
        if (this.livePublishModel == null || this.livePublishModel.getType().intValue() != 1) {
            return false;
        }
        return true;
    }

    public String reverseVideoPath() {
        if (getPreviewInfo() == null) {
            return null;
        }
        return getPreviewInfo().reverseVideo();
    }

    public int segmentCounts() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return getPreviewInfo().getVideoList().size();
    }

    public int videoFps() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return C43668b.m95929a(getPreviewInfo());
    }

    public String videoPath() {
        if (getPreviewInfo() == null) {
            return "";
        }
        return ((EditVideoSegment) getPreviewInfo().getVideoList().get(0)).getVideoPath();
    }

    public void copyMultiEditMusicInfo() {
        if (isMultiVideoEdit()) {
            getCurMultiEditVideoRecordData().musicPath = this.mMusicPath;
            getCurMultiEditVideoRecordData().musicVolume = this.musicVolume;
            getCurMultiEditVideoRecordData().originVolume = this.voiceVolume;
            getCurMultiEditVideoRecordData().musicTrimIn = this.mMusicStart;
        }
    }

    public String getContactAudioPathAsKey() {
        if (isMultiVideoEdit()) {
            String str = this.multiEditVideoRecordData.curMultiEditVideoRecordData.concatAudio;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } else if (this.stitchParams != null && !TextUtils.isEmpty(this.stitchParams.getConcatAudioPath())) {
            return this.stitchParams.getConcatAudioPath();
        }
        return audioPath();
    }

    public String getContactVideoPathAsKey() {
        if (this.multiEditVideoRecordData != null && this.multiEditVideoRecordData.curMultiEditVideoRecordData != null) {
            String str = this.multiEditVideoRecordData.curMultiEditVideoRecordData.concatVideo;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } else if (this.stitchParams != null && !TextUtils.isEmpty(this.stitchParams.getConcatVideoPath())) {
            return this.stitchParams.getConcatVideoPath();
        }
        return videoPath();
    }

    public C43597g getMainBusinessContext() {
        if (!C20393d.m50598a()) {
            String mainBusinessData = super.getMainBusinessData();
            if (mainBusinessData != null) {
                try {
                    return (C43597g) this.f109579c.mo34884a(mainBusinessData, C43597g.class);
                } catch (Exception unused) {
                }
            }
            return null;
        } else if (this.f109580d != null) {
            return this.f109580d;
        } else {
            String mainBusinessData2 = super.getMainBusinessData();
            if (mainBusinessData2 != null) {
                try {
                    this.f109580d = (C43597g) this.f109579c.mo34884a(mainBusinessData2, C43597g.class);
                } catch (Exception unused2) {
                    return null;
                }
            }
            return this.f109580d;
        }
    }

    public String getMainBusinessData() {
        if (!C20393d.m50598a()) {
            return super.getMainBusinessData();
        }
        String mainBusinessData = super.getMainBusinessData();
        if (mainBusinessData != null) {
            return mainBusinessData;
        }
        if (this.f109580d != null) {
            mainBusinessData = this.f109579c.mo34889b(this.f109580d);
            super.setMainBusinessData(mainBusinessData);
        }
        return mainBusinessData;
    }

    public boolean hasStickers() {
        List list;
        C43597g mainBusinessContext = getMainBusinessContext();
        if (mainBusinessContext != null) {
            list = C43577d.m95726a(mainBusinessContext, 1, C43596f.TRACK_PAGE_EDIT);
        } else {
            list = null;
        }
        if (hasInfoStickers() || (list != null && !list.isEmpty() && ((InteractStickerStruct) list.get(0)).getVoteStruct() != null)) {
            return true;
        }
        return false;
    }

    public boolean hasText() {
        if (this.infoStickerModel != null && !C9376b.m18558a((Collection<T>) this.infoStickerModel.stickers)) {
            for (StickerItemModel stickerItemModel : this.infoStickerModel.stickers) {
                if (stickerItemModel.type == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isMultiVideoEditFeature() {
        if (!isMultiVideoEdit() || isDuet() || isReaction() || isStitchMode() || this.containBackgroundVideo || !this.supportRetake || !C47716bd.m103285a() || isGreenScreen()) {
            return false;
        }
        return true;
    }

    public boolean isTimeEffectApply() {
        if (this.mTimeEffect == null) {
            return false;
        }
        String key = this.mTimeEffect.getKey();
        if (TextUtils.equals("1", key) || TextUtils.equals("2", key) || TextUtils.equals("3", key)) {
            return true;
        }
        return false;
    }

    public boolean shouldUploadExtractFrames() {
        if (!TextUtils.isEmpty(this.mStickerID) || ((this.mEffectList != null && !this.mEffectList.isEmpty()) || (this.infoStickerModel != null && C9414h.m18631b(this.infoStickerModel.stickers)))) {
            return true;
        }
        return false;
    }

    public boolean shouldUploadOriginalSound() {
        if ((this.mOrigin != 0 || isMusic() <= 0) && (((!hasOriginalSound() && !this.isFastImport && !hasRecord()) || this.mMusicPath == null || this.musicVolume <= 0.0f || (this.voiceVolume <= 0.0f && !hasRecord())) && this.veAudioEffectParam == null)) {
            return false;
        }
        return true;
    }

    public VideoPublishEditModel() {
        this.mAudioRecordIndex = -1;
        this.aiMusicLogPbImprId = "";
        this.mentionEditTextLength = -1;
        this.mBeautyMetadatas = new ArrayList<>();
        this.mSelectedFilterIntensity = -1.0f;
        this.mRecordVideoSelectedFilterIntensity = -1.0f;
        this.mEffectList = new ArrayList<>();
        this.importInfoList = new ArrayList<>();
        this.mDuetFrom = "";
        this.isMuted = false;
        this.infoStickerCategoryParams = new InfoStickerCategoryParams();
        this.greenScreenImages = new ArrayList<>();
        this.mSubtitleMusicChangeChecker = new C43470a();
        this.f109579c = new C17971f();
        this.uploadSpeedInfo = new UploadSpeedInfo();
        this.f109582f = 0;
        this.textTypes = "";
        this.textEffectIds = "";
        this.pic2VideoSource = "";
        this.suggestHumanVolume = 1.0f;
        this.suggestVideoVolume = 1.0f;
        this.successEnableAEC = false;
    }

    /* renamed from: b */
    private String m95060b() {
        C17666bt it = C17564ai.copyOf((Iterable<? extends E>) this.infoStickerModel.stickers).iterator();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (it.hasNext()) {
            StickerItemModel stickerItemModel = (StickerItemModel) it.next();
            if (!TextUtils.isEmpty(stickerItemModel.stickerId) && stickerItemModel.type != 2) {
                if (z) {
                    z = false;
                } else {
                    sb.append(',');
                }
                if (!TextUtils.isEmpty(stickerItemModel.tabId)) {
                    sb.append(stickerItemModel.tabId);
                } else if (this.infoStickerCategoryParams.getInfoStickerCategoryMap().containsKey(stickerItemModel.stickerId)) {
                    sb.append((String) this.infoStickerCategoryParams.getInfoStickerCategoryMap().get(stickerItemModel.stickerId));
                } else if (stickerItemModel.type == 10) {
                    sb.append("giphy");
                }
            }
        }
        return sb.toString();
    }

    public String formatCameraLensInfo() {
        String[] split;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.cameraLensInfo.size(); i++) {
            for (String str : ((String) this.cameraLensInfo.get(i)).split(":")) {
                if (!str.isEmpty()) {
                    hashSet.add(Integer.valueOf(str));
                }
            }
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append(arrayList.get(i2));
            if (i2 != arrayList.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public String getEditEffectList() {
        if (C9414h.m18630a(this.mEffectList)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(((EffectPointModel) this.mEffectList.get(0)).getKey());
        for (int i = 1; i < this.mEffectList.size(); i++) {
            sb.append(",");
            sb.append(((EffectPointModel) this.mEffectList.get(i)).getKey());
        }
        return sb.toString();
    }

    public String getInfoStickerList() {
        String str = (String) C43577d.m95729b(getMainBusinessContext()).f2711a;
        if (this.infoStickerModel == null || C9414h.m18630a(this.infoStickerModel.stickers)) {
            return str;
        }
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder(",");
            sb.append(str);
            str2 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.infoStickerModel.getNotEmptyInfoStickerIds());
        sb2.append(str2);
        return sb2.toString();
    }

    public List<MediaModel> getMediaModelList() {
        if (isMultiVideoEdit()) {
            return getCurMultiEditVideoRecordData().convertMediaModelList();
        }
        ArrayList arrayList = new ArrayList();
        if (getPreviewInfo() != null) {
            for (EditVideoSegment editVideoSegment : getPreviewInfo().getVideoList()) {
                boolean z = this.isFastImport;
                C52711k.m112240b(editVideoSegment, "$this$toMediaModel");
                MediaModel mediaModel = new MediaModel(-1);
                mediaModel.f95383b = editVideoSegment.getVideoPath();
                mediaModel.f95390i = editVideoSegment.getVideoFileInfo().getWidth();
                mediaModel.f95391j = editVideoSegment.getVideoFileInfo().getHeight();
                mediaModel.f95386e = editVideoSegment.getVideoFileInfo().getDuration();
                if (z && editVideoSegment.getVideoCutInfo() != null) {
                    VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                    if (videoCutInfo == null) {
                        C52711k.m112234a();
                    }
                    mediaModel.f95396o = videoCutInfo.getSpeed();
                }
                arrayList.add(mediaModel);
            }
        }
        return arrayList;
    }

    public List<Integer> getVideoRotateArray() {
        if (getPreviewInfo() == null) {
            return Collections.singletonList(Integer.valueOf(0));
        }
        ArrayList arrayList = new ArrayList();
        for (EditVideoSegment editVideoSegment : getPreviewInfo().getVideoList()) {
            if (editVideoSegment.getVideoCutInfo() != null) {
                arrayList.add(Integer.valueOf(editVideoSegment.getVideoCutInfo().getRotate()));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Integer.valueOf(0));
        }
        return arrayList;
    }

    public boolean isChangeMultiEditData() {
        if (!isMultiVideoEdit() || this.multiEditVideoRecordData.originMultiEditRecordData == null) {
            return false;
        }
        Pair playInOutTime = getCurMultiEditVideoRecordData().getPlayInOutTime();
        Pair playInOutTime2 = this.multiEditVideoRecordData.originMultiEditRecordData.getPlayInOutTime();
        if (((Integer) playInOutTime.first).equals(playInOutTime2.first) && ((Integer) playInOutTime.second).equals(playInOutTime2.second) && getCurMultiEditVideoRecordData().isEqual(this.multiEditVideoRecordData.originMultiEditRecordData)) {
            return false;
        }
        return true;
    }

    public boolean isMultiVideoEdit() {
        boolean z;
        if (!this.mIsFromDraft || !C39629l.m88232a().mo58574e().mo83117a(C40796a.DraftUseMultiVideoEdit)) {
            if ((!C47716bd.m103285a() && !C47716bd.m103286b()) || isStitchMode()) {
                return false;
            }
            if (isMvThemeVideoType() || this.mFromCut || this.mFromMultiCut) {
                z = false;
            } else {
                z = true;
            }
            if (this.multiEditVideoRecordData != null) {
                this.multiEditVideoRecordData.isSupportMultiEdit = z;
            }
            if (!z || this.multiEditVideoRecordData == null || this.multiEditVideoRecordData.curMultiEditVideoRecordData == null) {
                return false;
            }
            return true;
        } else if (this.multiEditVideoRecordData == null || !this.multiEditVideoRecordData.isSupportMultiEdit || this.multiEditVideoRecordData.curMultiEditVideoRecordData == null) {
            return false;
        } else {
            return true;
        }
    }

    public void setMultiEditBeautyMetadatas() {
        if (isMultiVideoEdit() && !C50201e.m108355a(this.multiEditVideoRecordData.editSegments)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.multiEditVideoRecordData.editSegments.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
                if (!(timeSpeedModelExtension == null || timeSpeedModelExtension.getBeautyMetadata() == null)) {
                    arrayList.add(timeSpeedModelExtension.getBeautyMetadata());
                }
            }
            if (!C50201e.m108355a(arrayList)) {
                this.mBeautyMetadatas.clear();
                this.mBeautyMetadatas.addAll(arrayList);
            }
        }
    }

    public void setMultiEditCameraLensInfo() {
        if (isMultiVideoEdit() && !C50201e.m108355a(this.multiEditVideoRecordData.editSegments)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.multiEditVideoRecordData.editSegments.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
                if (!(timeSpeedModelExtension == null || timeSpeedModelExtension.getCameraLensInfo() == null)) {
                    arrayList.add(timeSpeedModelExtension.getCameraLensInfo());
                }
            }
            if (!C50201e.m108355a(arrayList)) {
                this.cameraLensInfo.clear();
                this.cameraLensInfo.addAll(arrayList);
            }
        }
    }

    public void setMultiEditStickIds() {
        if (isMultiVideoEdit() && this.multiEditVideoRecordData.editSegments != null && !this.multiEditVideoRecordData.editSegments.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.multiEditVideoRecordData.editSegments.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
                if (timeSpeedModelExtension != null && !TextUtils.isEmpty(timeSpeedModelExtension.getStickerId())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(timeSpeedModelExtension.getStickerId());
                    sb2.append(",");
                    sb.append(sb2.toString());
                }
            }
            if (!TextUtils.isEmpty(sb.toString())) {
                this.mStickerID = sb.toString().substring(0, sb.toString().length() - 1);
            }
        }
    }

    public int sourceVideoHeight() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        EditPreviewInfo previewInfo = getPreviewInfo();
        boolean z = this.isFastImport;
        C52711k.m112240b(previewInfo, "$this$sourceVideoHeight");
        if (!z) {
            return ((EditVideoSegment) previewInfo.getVideoList().get(0)).getVideoFileInfo().getHeight();
        }
        if (previewInfo.getCalculateSourceHeight() <= 0) {
            VESize calcTargetRes = VEUtils.calcTargetRes(previewInfo.getTotalVideoWidth(), previewInfo.getTotalVideoHeight(), C43668b.m95941b(previewInfo), Integer.MAX_VALUE);
            previewInfo.setCalculateSourceWidth(calcTargetRes.width);
            previewInfo.setCalculateSourceHeight(calcTargetRes.height);
        }
        return previewInfo.getCalculateSourceHeight();
    }

    public int sourceVideoWidth() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        EditPreviewInfo previewInfo = getPreviewInfo();
        boolean z = this.isFastImport;
        C52711k.m112240b(previewInfo, "$this$sourceVideoWidth");
        if (!z) {
            return ((EditVideoSegment) previewInfo.getVideoList().get(0)).getVideoFileInfo().getWidth();
        }
        if (previewInfo.getCalculateSourceWidth() <= 0) {
            VESize calcTargetRes = VEUtils.calcTargetRes(previewInfo.getTotalVideoWidth(), previewInfo.getTotalVideoHeight(), C43668b.m95941b(previewInfo), Integer.MAX_VALUE);
            previewInfo.setCalculateSourceWidth(calcTargetRes.width);
            previewInfo.setCalculateSourceHeight(calcTargetRes.height);
        }
        return previewInfo.getCalculateSourceWidth();
    }

    public int videoHeight() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        EditPreviewInfo previewInfo = getPreviewInfo();
        boolean z = this.isFastImport;
        boolean isStitchMode = isStitchMode();
        C52711k.m112240b(previewInfo, "$this$videoHeight");
        if (z) {
            if (previewInfo.getCalculateHeight() <= 0) {
                VESize calcTargetRes = VEUtils.calcTargetRes(previewInfo.getTotalVideoWidth(), previewInfo.getTotalVideoHeight(), C43668b.m95941b(previewInfo), previewInfo.getPreviewWidth());
                previewInfo.setCalculateWidth(calcTargetRes.width);
                previewInfo.setCalculateHeight(calcTargetRes.height);
            }
            return previewInfo.getCalculateHeight();
        } else if (!isStitchMode || previewInfo.getVideoList().size() < 2) {
            return ((EditVideoSegment) previewInfo.getVideoList().get(0)).getVideoFileInfo().getHeight();
        } else {
            return ((EditVideoSegment) previewInfo.getVideoList().get(1)).getVideoFileInfo().getHeight();
        }
    }

    public int videoWidth() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        EditPreviewInfo previewInfo = getPreviewInfo();
        boolean z = this.isFastImport;
        boolean isStitchMode = isStitchMode();
        C52711k.m112240b(previewInfo, "$this$videoWidth");
        if (z) {
            if (previewInfo.getCalculateWidth() <= 0) {
                VESize calcTargetRes = VEUtils.calcTargetRes(previewInfo.getTotalVideoWidth(), previewInfo.getTotalVideoHeight(), C43668b.m95941b(previewInfo), previewInfo.getPreviewWidth());
                previewInfo.setCalculateWidth(calcTargetRes.width);
                previewInfo.setCalculateHeight(calcTargetRes.height);
            }
            return previewInfo.getCalculateWidth();
        } else if (!isStitchMode || previewInfo.getVideoList().size() < 2) {
            return ((EditVideoSegment) previewInfo.getVideoList().get(0)).getVideoFileInfo().getWidth();
        } else {
            return ((EditVideoSegment) previewInfo.getVideoList().get(1)).getVideoFileInfo().getWidth();
        }
    }

    public String getInfoStickerFrom() {
        String[] split;
        C0794k b = C43577d.m95729b(getMainBusinessContext());
        String str = (String) b.f2711a;
        String str2 = (String) b.f2712b;
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            for (String str3 : str.split(",")) {
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                } else if (this.infoStickerCategoryParams.getInfoStickerCategoryMap().containsKey(str3)) {
                    sb.append((String) this.infoStickerCategoryParams.getInfoStickerCategoryMap().get(str3));
                }
            }
        }
        if (this.commentVideoModel != null && !TextUtils.isEmpty(this.commentVideoModel.getAwemeId())) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append(",");
            }
            sb.append("comment_reply");
        }
        if (this.infoStickerModel == null || C9414h.m18630a(this.infoStickerModel.stickers)) {
            return sb.toString();
        }
        String sb2 = sb.toString();
        String b2 = m95060b();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b2);
        sb3.append(sb2);
        return sb3.toString();
    }

    public void removeAudioEffectChallengeFromTitleAndStruct(AVChallenge aVChallenge) {
        m95058a(aVChallenge);
    }

    public void setCommercialMusic(boolean z) {
        this.isCommerceMusic = z;
    }

    public void setMicroAppId(String str) {
        this.microAppId = str;
    }

    public void setNewVersion(int i) {
        this.f109581e = i;
    }

    public void setOriginalSound(boolean z) {
        this.isOriginalSound = z;
    }

    public void setPreviewInfo(EditPreviewInfo editPreviewInfo) {
        this.f109577a = editPreviewInfo;
    }

    public void setPreviewStartTime(float f) {
        this.previewStartTime = f;
    }

    public void setStickPointType(int i) {
        this.f109582f = i;
    }

    public void setVideoCoverPath(String str) {
        this.f109578b = str;
    }

    public static VideoPublishEditModel makeCopy(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.clone();
    }

    public void setVideoLength(int i) {
        if (getPreviewInfo() != null) {
            getPreviewInfo().setPreviewVideoLength(i);
        }
    }

    public void removeChallengeFromTitleAndStruct(Collection<AVChallenge> collection) {
        for (AVChallenge a : collection) {
            m95058a(a);
        }
    }

    public void setMainBusinessData(String str) {
        if (!C20393d.m50598a()) {
            super.setMainBusinessData(str);
        } else if (!TextUtils.equals(super.getMainBusinessData(), str)) {
            super.setMainBusinessData(str);
            if (this.f109580d != null) {
                this.f109580d = null;
            }
        }
    }

    /* renamed from: b */
    private AVTextExtraStruct m95059b(AVChallenge aVChallenge) {
        if (!(aVChallenge == null || this.structList == null)) {
            for (AVTextExtraStruct aVTextExtraStruct : this.structList) {
                if (aVChallenge.challengeName.equals(aVTextExtraStruct.getHashTagName())) {
                    return aVTextExtraStruct;
                }
            }
        }
        return null;
    }

    public static VideoExposureData convertToExposureData(Object obj) {
        String str;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        String videoPath = videoPublishEditModel.videoPath();
        float f = videoPublishEditModel.mVideoCoverStartTm;
        String mainBusinessData = videoPublishEditModel.getMainBusinessData();
        String str2 = videoPublishEditModel.mOutputFile;
        String videoPath2 = videoPublishEditModel.videoPath();
        if (videoPublishEditModel.creationId == null) {
            str = UUID.randomUUID().toString();
        } else {
            str = videoPublishEditModel.creationId;
        }
        VideoExposureData videoExposureData = new VideoExposureData(videoPath, f, mainBusinessData, str2, videoPath2, str, videoPublishEditModel.isSaveLocal(), videoPublishEditModel.getLocalFinalPath(), videoPublishEditModel.mSaveModel, videoPublishEditModel.mOrigin, videoPublishEditModel.getDraftPrimaryKey(), videoPublishEditModel.mShootWay);
        return videoExposureData;
    }

    public void setMainBusinessContext(C43597g gVar) {
        if (!C20393d.m50598a()) {
            super.setMainBusinessData(this.f109579c.mo34889b(gVar));
        } else if (this.f109580d != gVar) {
            this.f109580d = gVar;
            if (super.getMainBusinessData() != null) {
                super.setMainBusinessData(null);
            }
        }
    }

    public String uniqueVideoSessionDir(String str) {
        String contactVideoPathAsKey = getContactVideoPathAsKey();
        if (this.isFastImport) {
            if (TextUtils.isEmpty(this.creationId)) {
                this.creationId = UUID.randomUUID().toString();
            }
            contactVideoPathAsKey = this.creationId;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(C9395d.m18571a(contactVideoPathAsKey));
        return sb.toString();
    }

    /* renamed from: a */
    private void m95058a(AVChallenge aVChallenge) {
        if (aVChallenge != null) {
            if (!TextUtils.isEmpty(this.title)) {
                String str = this.title;
                StringBuilder sb = new StringBuilder("#");
                sb.append(aVChallenge.challengeName);
                sb.append(" ");
                this.title = str.replace(sb.toString(), "");
            }
            if (this.structList != null && !this.structList.isEmpty()) {
                AVTextExtraStruct b = m95059b(aVChallenge);
                if (b != null) {
                    this.structList.remove(b);
                }
            }
        }
    }

    public void setMultiEditChallenges(AVChallenge aVChallenge) {
        if (isMultiVideoEdit() && this.multiEditVideoRecordData.editSegments != null && !this.multiEditVideoRecordData.editSegments.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.multiEditVideoRecordData.editSegments.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
                if (!(timeSpeedModelExtension == null || timeSpeedModelExtension.getHashtag() == null)) {
                    arrayList.add(timeSpeedModelExtension.getHashtag());
                }
            }
            if (!arrayList.isEmpty()) {
                if (aVChallenge != null) {
                    Iterator it2 = this.challenges.iterator();
                    while (it2.hasNext()) {
                        if (!aVChallenge.equals(it2.next())) {
                            it2.remove();
                        }
                    }
                } else {
                    this.challenges.clear();
                }
                this.challenges.addAll(arrayList);
            }
        }
    }

    protected VideoPublishEditModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        super(parcel);
        this.mAudioRecordIndex = -1;
        this.aiMusicLogPbImprId = "";
        this.mentionEditTextLength = -1;
        this.mBeautyMetadatas = new ArrayList<>();
        this.mSelectedFilterIntensity = -1.0f;
        this.mRecordVideoSelectedFilterIntensity = -1.0f;
        this.mEffectList = new ArrayList<>();
        this.importInfoList = new ArrayList<>();
        this.mDuetFrom = "";
        boolean z17 = false;
        this.isMuted = false;
        this.infoStickerCategoryParams = new InfoStickerCategoryParams();
        this.greenScreenImages = new ArrayList<>();
        this.mSubtitleMusicChangeChecker = new C43470a();
        this.f109579c = new C17971f();
        this.uploadSpeedInfo = new UploadSpeedInfo();
        this.f109582f = 0;
        this.textTypes = "";
        this.textEffectIds = "";
        this.pic2VideoSource = "";
        this.suggestHumanVolume = 1.0f;
        this.suggestVideoVolume = 1.0f;
        this.successEnableAEC = false;
        setPreviewInfo((EditPreviewInfo) parcel.readParcelable(EditPreviewInfo.class.getClassLoader()));
        this.mDir = parcel.readString();
        this.mCurFilterLabels = parcel.readString();
        this.mCurFilterIds = parcel.readString();
        this.mSmoothSkinLabels = parcel.readString();
        this.commentVideoModel = (CommentVideoModel) parcel.readSerializable();
        this.mSubtitleMusicChangeChecker = (C43470a) parcel.readSerializable();
        this.mReshapeLabels = parcel.readString();
        this.videoSpeed = parcel.readString();
        this.cameraIds = parcel.readString();
        this.beautyType = parcel.readInt();
        this.mMusicPath = parcel.readString();
        this.mVideoSegmentsDesc = parcel.readString();
        this.mStickerPath = parcel.readString();
        this.mStickerID = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mFromCut = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mFromMultiCut = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.faceBeautyOpen = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mWillGoOnShortVideo = z4;
        this.mOrigin = parcel.readInt();
        this.mHardEncode = parcel.readInt();
        this.mRestoreType = parcel.readInt();
        this.mFaceBeauty = parcel.readInt();
        this.mSelectedId = parcel.readInt();
        this.mSelectedFilterIntensity = parcel.readFloat();
        this.mRecordVideoSelectedFilterIndex = parcel.readInt();
        this.mRecordVideoSelectedFilterIntensity = parcel.readFloat();
        this.mCameraPosition = parcel.readInt();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.autoEnhanceOn = z5;
        this.autoEnhanceType = parcel.readInt();
        this.mMusicStart = parcel.readInt();
        this.mMusicEnd = parcel.readInt();
        this.mMusicOrigin = parcel.readString();
        this.mMusicShowRank = parcel.readInt();
        this.mMusicRecType = parcel.readInt();
        this.mUseFilter = parcel.readInt();
        this.mVideoCoverStartTm = parcel.readFloat();
        this.maxDuration = parcel.readLong();
        this.mTimeEffect = (EffectPointModel) parcel.readParcelable(EffectPointModel.class.getClassLoader());
        this.mEffectList = parcel.createTypedArrayList(EffectPointModel.CREATOR);
        this.importInfoList = parcel.createTypedArrayList(ImportVideoInfo.CREATOR);
        this.audioTrack = (UrlModel) parcel.readSerializable();
        this.musicId = parcel.readString();
        this.previewStartTime = parcel.readFloat();
        this.mOutputFile = parcel.readString();
        this.mId3Title = parcel.readString();
        this.mId3Author = parcel.readString();
        this.mId3Album = parcel.readString();
        this.mMusicType = parcel.readInt();
        this.mDuetFrom = parcel.readString();
        this.mDuetAuthor = (User) parcel.readSerializable();
        this.mDuetHashTag = parcel.readString();
        this.mShootMode = parcel.readInt();
        this.creationId = parcel.readString();
        this.ccVid = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.mDurationMode = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.isMuted = z7;
        this.draftId = parcel.readInt();
        this.mEncodedAudioOutputFile = parcel.readString();
        this.mParallelUploadOutputFile = parcel.readString();
        this.voiceVolume = parcel.readFloat();
        this.musicVolume = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mIsMultiVideo = z8;
        this.shopDraftId = parcel.readString();
        this.f109581e = parcel.readInt();
        this.mSaveModel = (AVUploadSaveModel) parcel.readParcelable(AVUploadSaveModel.class.getClassLoader());
        this.reactionParams = (ReactionParams) parcel.readParcelable(ReactionParams.class.getClassLoader());
        this.recordMode = parcel.readInt();
        this.gameScore = parcel.readInt();
        this.mEyesLabels = parcel.readString();
        this.mTanningLabels = parcel.readString();
        this.f109578b = parcel.readString();
        this.microAppId = parcel.readString();
        this.extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
        this.infoStickerModel = (InfoStickerModel) parcel.readParcelable(InfoStickerModel.class.getClassLoader());
        this.microAppModel = (C43758o) parcel.readSerializable();
        this.texts = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.usePaint = z9;
        this.videoType = parcel.readInt();
        this.socialModel = (SocialModel) parcel.readParcelable(SocialModel.class.getClassLoader());
        this.storyBoomModel = (StoryBoomModel) parcel.readParcelable(StoryBoomModel.class.getClassLoader());
        this.md5 = parcel.readString();
        this.storyFestivalModel = (StoryFestivalModel) parcel.readParcelable(StoryFestivalModel.class.getClassLoader());
        this.multiEditVideoRecordData = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.isStoryTextRecord = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.supportRetake = z11;
        this.mentionUserModel = (ExtraMentionUserModel) parcel.readSerializable();
        this.mFirstStickerMusicIdsJson = parcel.readString();
        this.defaultSelectStickerPoi = (C29067e) parcel.readSerializable();
        this.uploadMiscInfoStruct = (C43895j) parcel.readSerializable();
        this.videoEditorType = parcel.readInt();
        this.mvCreateVideoData = (C23289b) parcel.readSerializable();
        this.compileProbeResult = (CompileProbeResult) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.isFastImport = z12;
        this.fastImportResolution = parcel.readString();
        this.veCherEffectParam = (ClientCherEffectParam) parcel.readParcelable(ClientCherEffectParam.class.getClassLoader());
        this.mOutVideoWidth = parcel.readInt();
        this.mOutVideoHeight = parcel.readInt();
        this.aiMusicLogPbImprId = parcel.readString();
        this.comFrom = parcel.readInt();
        this.mVideoCanvasWidth = parcel.readInt();
        this.mVideoCanvasHeight = parcel.readInt();
        this.veAudioEffectParam = (AudioEffectParam) parcel.readParcelable(AudioEffectParam.class.getClassLoader());
        this.aiMusicLogPbImprId = parcel.readString();
        this.comFrom = parcel.readInt();
        this.uploadSpeedInfo = (UploadSpeedInfo) parcel.readParcelable(UploadSpeedInfo.class.getClassLoader());
        this.fastImportErrorCode = parcel.readInt();
        if (parcel.readByte() == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.isCommerceMusic = z13;
        if (parcel.readByte() == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.isOriginalSound = z14;
        this.mBindMvId = parcel.readString();
        this.stickerChallenge = (StickerChallenge) parcel.readParcelable(StickerChallenge.class.getClassLoader());
        this.metadataMap = C47768ci.m103398a(parcel.readString());
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.isStickPointMode = z15;
        this.mUploadPath = parcel.readString();
        this.countDownModes = new ArrayList<>();
        parcel.readList(this.countDownModes, Integer.class.getClassLoader());
        this.veAudioRecorderParam = (AudioRecorderParam) parcel.readParcelable(AudioRecorderParam.class.getClassLoader());
        this.videoCategory = (VideoCategoryParam) parcel.readParcelable(VideoCategoryParam.class.getClassLoader());
        this.textTypes = parcel.readString();
        this.textEffectIds = parcel.readString();
        this.videoCount = parcel.readInt();
        this.photoCount = parcel.readInt();
        this.mentionEditTextLength = parcel.readInt();
        this.pic2VideoSource = parcel.readString();
        this.statusCreateVideoData = (StatusCreateVideoData) parcel.readParcelable(StatusCreateVideoData.class.getClassLoader());
        if (parcel.readByte() == 1) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.mUseMusicBeforeEdit = z16;
        if (parcel.readByte() != 0) {
            z17 = true;
        }
        this.containBackgroundVideo = z17;
        this.reviewVideoId = parcel.readString();
        this.stickPointData = (C45623a) parcel.readSerializable();
        this.mBeautyMetadatas = parcel.createTypedArrayList(BeautyMetadata.CREATOR);
        this.infoStickerCategoryParams = (InfoStickerCategoryParams) parcel.readParcelable(InfoStickerCategoryParams.class.getClassLoader());
        this.f109582f = parcel.readInt();
        this.duetLayout = parcel.readString();
        this.livePublishModel = (LivePublishModel) parcel.readSerializable();
        this.stitchParams = (StitchParams) parcel.readParcelable(StitchParams.class.getClassLoader());
        this.greenScreenDefaultImage = parcel.readString();
        this.greenScreenImages = parcel.createTypedArrayList(GreenScreenImage.CREATOR);
        this.cameraLensInfo = parcel.createStringArrayList();
    }

    public Rect getLiveWaterMarkRect(Context context, int[] iArr) {
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        if (!publishFromLiveScreenCapture()) {
            return null;
        }
        Float[] watermarkLocation = this.livePublishModel.getWatermarkLocation();
        int b = C43303dy.m94971b(context);
        int e = C43303dy.m94974e(context);
        int g = C22452a.m55501g();
        float f5 = (float) ((g * b) / e);
        float f6 = (float) g;
        float f7 = (f5 * 1.0f) / f6;
        int intValue = this.livePublishModel.getRotate().intValue();
        if (watermarkLocation == null || watermarkLocation.length != 4) {
            return null;
        }
        float floatValue = watermarkLocation[0].floatValue();
        float floatValue2 = watermarkLocation[2].floatValue();
        float floatValue3 = watermarkLocation[1].floatValue();
        float floatValue4 = watermarkLocation[3].floatValue();
        float f8 = 0.0f;
        if (intValue != 0) {
            if (intValue == 90) {
                float f9 = (float) e;
                float f10 = (float) b;
                f = floatValue2 * f10 * f7;
                i = (int) (((f6 - (f10 * f7)) / 2.0f) + 0.0f);
                f8 = (1.0f - floatValue4) * f9 * f7;
                f3 = (1.0f - floatValue3) * f9 * f7;
                f2 = floatValue * f10 * f7;
            } else if (intValue == 180) {
                f8 = (1.0f - floatValue2) * f5;
                f4 = (1.0f - floatValue) * f5;
                f = (1.0f - floatValue3) * f6;
                f2 = (1.0f - floatValue4) * f6;
            } else if (intValue != 270) {
                f3 = 0.0f;
                i = 0;
                f2 = 0.0f;
                f = 0.0f;
            } else {
                float f11 = (float) e;
                f3 = floatValue4 * f11 * f7;
                float f12 = (float) b;
                f2 = (1.0f - floatValue2) * f12 * f7;
                f = (1.0f - floatValue) * f12 * f7;
                i = (int) (((f6 - (f12 * f7)) / 2.0f) + 0.0f);
                f8 = floatValue3 * f11 * f7;
            }
            int b2 = (int) C9432q.m18687b(context, 8.0f);
            return new Rect((((int) f8) - b2) + 0, (((int) f2) - b2) + i, ((int) f3) + b2 + 0, ((int) f) + b2 + i);
        }
        f8 = floatValue * f5;
        f4 = floatValue2 * f5;
        f2 = floatValue3 * f6;
        f = floatValue4 * f6;
        f3 = f4;
        i = 0;
        int b22 = (int) C9432q.m18687b(context, 8.0f);
        return new Rect((((int) f8) - b22) + 0, (((int) f2) - b22) + i, ((int) f3) + b22 + 0, ((int) f) + b22 + i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(getPreviewInfo(), i);
        parcel.writeString(this.mDir);
        parcel.writeString(this.mCurFilterLabels);
        parcel.writeString(this.mCurFilterIds);
        parcel.writeString(this.mSmoothSkinLabels);
        parcel.writeSerializable(this.commentVideoModel);
        parcel.writeSerializable(this.mSubtitleMusicChangeChecker);
        parcel.writeString(this.mReshapeLabels);
        parcel.writeString(this.videoSpeed);
        parcel.writeString(this.cameraIds);
        parcel.writeInt(this.beautyType);
        parcel.writeString(this.mMusicPath);
        parcel.writeString(this.mVideoSegmentsDesc);
        parcel.writeString(this.mStickerPath);
        parcel.writeString(this.mStickerID);
        parcel.writeByte(this.mFromCut ? (byte) 1 : 0);
        parcel.writeByte(this.mFromMultiCut ? (byte) 1 : 0);
        parcel.writeByte(this.faceBeautyOpen ? (byte) 1 : 0);
        parcel.writeByte(this.mWillGoOnShortVideo ? (byte) 1 : 0);
        parcel.writeInt(this.mOrigin);
        parcel.writeInt(this.mHardEncode);
        parcel.writeInt(this.mRestoreType);
        parcel.writeInt(this.mFaceBeauty);
        parcel.writeInt(this.mSelectedId);
        parcel.writeFloat(this.mSelectedFilterIntensity);
        parcel.writeInt(this.mRecordVideoSelectedFilterIndex);
        parcel.writeFloat(this.mRecordVideoSelectedFilterIntensity);
        parcel.writeInt(this.mCameraPosition);
        parcel.writeInt(this.autoEnhanceOn ? 1 : 0);
        parcel.writeInt(this.autoEnhanceType);
        parcel.writeInt(this.mMusicStart);
        parcel.writeInt(this.mMusicEnd);
        parcel.writeString(this.mMusicOrigin);
        parcel.writeInt(this.mMusicShowRank);
        parcel.writeInt(this.mMusicRecType);
        parcel.writeInt(this.mUseFilter);
        parcel.writeFloat(this.mVideoCoverStartTm);
        parcel.writeLong(this.maxDuration);
        parcel.writeParcelable(this.mTimeEffect, i);
        parcel.writeTypedList(this.mEffectList);
        parcel.writeTypedList(this.importInfoList);
        parcel.writeSerializable(this.audioTrack);
        parcel.writeString(this.musicId);
        parcel.writeFloat(this.previewStartTime);
        parcel.writeString(this.mOutputFile);
        parcel.writeString(this.mId3Title);
        parcel.writeString(this.mId3Author);
        parcel.writeString(this.mId3Album);
        parcel.writeInt(this.mMusicType);
        parcel.writeString(this.mDuetFrom);
        parcel.writeSerializable(this.mDuetAuthor);
        parcel.writeString(this.mDuetHashTag);
        parcel.writeInt(this.mShootMode);
        parcel.writeString(this.creationId);
        parcel.writeString(this.ccVid);
        parcel.writeByte(this.mDurationMode ? (byte) 1 : 0);
        parcel.writeByte(this.isMuted ? (byte) 1 : 0);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.mEncodedAudioOutputFile);
        parcel.writeString(this.mParallelUploadOutputFile);
        parcel.writeFloat(this.voiceVolume);
        parcel.writeFloat(this.musicVolume);
        parcel.writeByte(this.mIsMultiVideo ? (byte) 1 : 0);
        parcel.writeString(this.shopDraftId);
        parcel.writeInt(this.f109581e);
        parcel.writeParcelable(this.mSaveModel, i);
        parcel.writeParcelable(this.reactionParams, i);
        parcel.writeInt(this.recordMode);
        parcel.writeInt(this.gameScore);
        parcel.writeString(this.mEyesLabels);
        parcel.writeString(this.mTanningLabels);
        parcel.writeString(this.f109578b);
        parcel.writeString(this.microAppId);
        parcel.writeSerializable(this.extractFramesModel);
        parcel.writeParcelable(this.infoStickerModel, i);
        parcel.writeSerializable(this.microAppModel);
        parcel.writeStringList(this.texts);
        parcel.writeByte(this.usePaint ? (byte) 1 : 0);
        parcel.writeInt(this.videoType);
        parcel.writeParcelable(this.socialModel, i);
        parcel.writeParcelable(this.storyBoomModel, i);
        parcel.writeString(this.md5);
        parcel.writeParcelable(this.storyFestivalModel, i);
        parcel.writeParcelable(this.multiEditVideoRecordData, i);
        parcel.writeByte(this.isStoryTextRecord ? (byte) 1 : 0);
        parcel.writeByte(this.supportRetake ? (byte) 1 : 0);
        parcel.writeSerializable(this.mentionUserModel);
        parcel.writeString(this.mFirstStickerMusicIdsJson);
        parcel.writeSerializable(this.defaultSelectStickerPoi);
        parcel.writeSerializable(this.uploadMiscInfoStruct);
        parcel.writeInt(this.videoEditorType);
        parcel.writeSerializable(this.mvCreateVideoData);
        parcel.writeSerializable(this.compileProbeResult);
        parcel.writeByte(this.isFastImport ? (byte) 1 : 0);
        parcel.writeString(this.fastImportResolution);
        parcel.writeParcelable(this.veCherEffectParam, i);
        parcel.writeInt(this.mOutVideoWidth);
        parcel.writeInt(this.mOutVideoHeight);
        parcel.writeString(this.aiMusicLogPbImprId);
        parcel.writeInt(this.comFrom);
        parcel.writeInt(this.mVideoCanvasWidth);
        parcel.writeInt(this.mVideoCanvasHeight);
        parcel.writeParcelable(this.veAudioEffectParam, i);
        parcel.writeString(this.aiMusicLogPbImprId);
        parcel.writeInt(this.comFrom);
        parcel.writeParcelable(this.uploadSpeedInfo, i);
        parcel.writeInt(this.fastImportErrorCode);
        parcel.writeByte(this.isCommerceMusic ? (byte) 1 : 0);
        parcel.writeByte(this.isOriginalSound ? (byte) 1 : 0);
        parcel.writeString(this.mBindMvId);
        parcel.writeParcelable(this.stickerChallenge, i);
        parcel.writeString(C47768ci.m103397a(this.metadataMap));
        parcel.writeByte(this.isStickPointMode ? (byte) 1 : 0);
        parcel.writeString(this.mUploadPath);
        parcel.writeList(this.countDownModes);
        parcel.writeParcelable(this.veAudioRecorderParam, i);
        parcel.writeParcelable(this.videoCategory, i);
        parcel.writeString(this.textTypes);
        parcel.writeString(this.textEffectIds);
        parcel.writeInt(this.videoCount);
        parcel.writeInt(this.photoCount);
        parcel.writeInt(this.mentionEditTextLength);
        parcel.writeString(this.pic2VideoSource);
        parcel.writeParcelable(this.statusCreateVideoData, i);
        parcel.writeByte(this.mUseMusicBeforeEdit ? (byte) 1 : 0);
        parcel.writeByte(this.containBackgroundVideo ? (byte) 1 : 0);
        parcel.writeString(this.reviewVideoId);
        parcel.writeSerializable(this.stickPointData);
        parcel.writeTypedList(this.mBeautyMetadatas);
        parcel.writeParcelable(this.infoStickerCategoryParams, i);
        parcel.writeInt(this.f109582f);
        parcel.writeString(this.duetLayout);
        parcel.writeSerializable(this.livePublishModel);
        parcel.writeParcelable(this.stitchParams, i);
        parcel.writeString(this.greenScreenDefaultImage);
        parcel.writeTypedList(this.greenScreenImages);
        parcel.writeStringList(this.cameraLensInfo);
    }
}
