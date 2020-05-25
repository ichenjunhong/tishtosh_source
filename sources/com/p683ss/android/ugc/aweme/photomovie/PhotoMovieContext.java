package com.p683ss.android.ugc.aweme.photomovie;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p683ss.android.ugc.aweme.photomovie.edit.cover.C38764a.C38765a;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMovieContext */
public class PhotoMovieContext extends BaseShortVideoContext implements Parcelable {
    public static final Creator<PhotoMovieContext> CREATOR = new Creator<PhotoMovieContext>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PhotoMovieContext[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PhotoMovieContext(parcel);
        }
    };
    public static final int PHOTO_MOVIE_COVER_HEIGHT = 228;
    public static final int PHOTO_MOVIE_COVER_WIDTH = 128;
    public static final int PHOTO_MOVIE_FROM_DRAFT = 1;
    public static final int PHOTO_MOVIE_FROM_RECORD_UPLOAD = 2;
    public static final int PHOTO_MOVIE_FROM_UPLOAD = 0;
    @C17952c(mo34828a = "creationId")
    public String creationId;
    @C17952c(mo34828a = "draftId")
    public int draftId;
    @C17952c(mo34828a = "extract_model")
    public ExtractFramesModel extractFramesModel;
    @C17952c(mo34828a = "mCoverStartTm")
    public float mCoverStartTm;
    @C17952c(mo34828a = "mFilterId")
    public int mFilterId;
    @C17952c(mo34828a = "mFilterName")
    public String mFilterName;
    @C17952c(mo34828a = "mFilterPath")
    public String mFilterPath;
    @C17952c(mo34828a = "mFinalVideoTmpPath")
    public String mFinalVideoTmpPath;
    @C17952c(mo34828a = "mFrom")
    public int mFrom;
    @C17952c(mo34828a = "mHeight")
    public int mHeight;
    @C17952c(mo34828a = "mImageList")
    public List<String> mImageList;
    @C17952c(mo34828a = "mInputAudioPath")
    public String mInputAudioPath;
    @C17952c(mo34828a = "mMusic")
    public C42482c mMusic;
    @C17952c(mo34828a = "mMusicList")
    public List<C42482c> mMusicList = new ArrayList();
    @C17952c(mo34828a = "mMusicPath")
    public String mMusicPath;
    @C17952c(mo34828a = "mOutputVideoPath")
    public String mOutputVideoPath;
    @C17952c(mo34828a = "mPlayType")
    public int mPlayType;
    @C17952c(mo34828a = "mRealImageCount")
    public int mRealImageCount;
    @C17952c(mo34828a = "save_model")
    public AVUploadSaveModel mSaveModel;
    @C17952c(mo34828a = "mWidth")
    public int mWidth;
    @C17952c(mo34828a = "music_origin")
    public String musicOrigin;
    @C17952c(mo34828a = "photo_time")
    public int photoTime;
    @C17952c(mo34828a = "shop_draft_id")
    public String shopDraftId;
    @C17952c(mo34828a = "trans_time")
    public int transTime;

    /* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMovieContext$a */
    public interface C38719a {
        /* renamed from: a */
        void mo58818a(Bitmap bitmap, int i, int i2);
    }

    public int describeContents() {
        return 0;
    }

    public PhotoMovieContext() {
    }

    public int getImageCount() {
        if (this.mImageList == null) {
            return 0;
        }
        return this.mImageList.size();
    }

    public String getLocalTempPath() {
        if (this.mSaveModel == null) {
            return null;
        }
        return this.mSaveModel.getLocalTempPath();
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

    public static IFoundationAVService createIFoundationAVServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IFoundationAVService.class);
        if (a != null) {
            return (IFoundationAVService) a;
        }
        return (IFoundationAVService) C20302a.m50070a(IFoundationAVService.class).mo42947a(new C20310d()).mo42946a().mo42948b();
    }

    public String getPhotoMovieCover() {
        if (C9376b.m18558a((Collection<T>) this.mImageList) || getVideoLength() == 0) {
            return null;
        }
        return (String) this.mImageList.get(new C38765a().mo78725a(this.mImageList.size(), this.mCoverStartTm / ((((float) getVideoLength()) * 1.0f) / 1000.0f)));
    }

    public void getPhotoMovieCover(C38719a aVar) {
        createIFoundationAVServicebyMonsterPlugin().videoCoverService().getPhotoMovieCover(this, aVar);
    }

    public static PhotoMovieContext convertFromDraft(C29059c cVar) {
        PhotoMovieContext photoMovieContext = cVar.f76145c;
        if (photoMovieContext == null || cVar.f76144b == null) {
            return null;
        }
        photoMovieContext.challenges = cVar.f76144b.f76030c;
        photoMovieContext.title = cVar.f76144b.f76028a;
        photoMovieContext.structList = cVar.f76144b.f76029b;
        photoMovieContext.isPrivate = cVar.f76124B;
        photoMovieContext.mIsFromDraft = true;
        photoMovieContext.mFrom = 1;
        photoMovieContext.poiId = cVar.mo58733J();
        photoMovieContext.mSaveModel = cVar.mo58732I();
        photoMovieContext.draftEditTransferModel = new DraftEditTransferModel(cVar.mo58774ak(), null);
        return photoMovieContext;
    }

    protected PhotoMovieContext(Parcel parcel) {
        super(parcel);
        this.mFinalVideoTmpPath = parcel.readString();
        this.mImageList = parcel.createStringArrayList();
        this.musicOrigin = parcel.readString();
        this.mMusicPath = parcel.readString();
        this.mHeight = parcel.readInt();
        this.mWidth = parcel.readInt();
        this.mPlayType = parcel.readInt();
        this.mOutputVideoPath = parcel.readString();
        this.mInputAudioPath = parcel.readString();
        this.mCoverStartTm = parcel.readFloat();
        this.mMusic = (C42482c) parcel.readSerializable();
        this.mFilterPath = parcel.readString();
        this.mFilterName = parcel.readString();
        this.mFilterId = parcel.readInt();
        this.mFrom = parcel.readInt();
        this.creationId = parcel.readString();
        this.draftId = parcel.readInt();
        this.shopDraftId = parcel.readString();
        this.mSaveModel = (AVUploadSaveModel) parcel.readParcelable(AVUploadSaveModel.class.getClassLoader());
        this.extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
        this.photoTime = parcel.readInt();
        this.transTime = parcel.readInt();
        this.mRealImageCount = parcel.readInt();
    }

    public static PhotoMovieContext convertFromOld(PhotoMovieContextOld photoMovieContextOld) {
        PhotoMovieContext photoMovieContext = new PhotoMovieContext();
        photoMovieContext.mFinalVideoTmpPath = photoMovieContextOld.f98500a;
        photoMovieContext.mImageList = photoMovieContextOld.f98501b;
        photoMovieContext.musicOrigin = photoMovieContextOld.f98513n;
        photoMovieContext.mMusicPath = photoMovieContextOld.f98502c;
        photoMovieContext.mHeight = photoMovieContextOld.f98504e;
        photoMovieContext.mWidth = photoMovieContextOld.f98505f;
        photoMovieContext.mPlayType = photoMovieContextOld.f98506g;
        photoMovieContext.mOutputVideoPath = photoMovieContextOld.f98507h;
        photoMovieContext.mInputAudioPath = photoMovieContextOld.f98508i;
        photoMovieContext.mCoverStartTm = photoMovieContextOld.f98509j;
        photoMovieContext.mMusic = photoMovieContextOld.f98510k;
        photoMovieContext.mFilterPath = photoMovieContextOld.f98511l;
        photoMovieContext.mFrom = photoMovieContextOld.f98512m;
        photoMovieContext.challenges = photoMovieContextOld.challenges;
        photoMovieContext.title = photoMovieContextOld.title;
        photoMovieContext.structList = photoMovieContextOld.structList;
        photoMovieContext.city = photoMovieContextOld.city;
        photoMovieContext.longitude = photoMovieContextOld.longitude;
        photoMovieContext.latitude = photoMovieContextOld.latitude;
        photoMovieContext.isPrivate = photoMovieContextOld.isPrivate;
        photoMovieContext.poiId = photoMovieContextOld.poiId;
        photoMovieContext.poiName = photoMovieContextOld.poiName;
        photoMovieContext.setVideoLength(photoMovieContextOld.getVideoLength());
        photoMovieContext.mSyncPlatforms = photoMovieContextOld.mSyncPlatforms;
        photoMovieContext.mShootWay = photoMovieContextOld.mShootWay;
        photoMovieContext.nationalTaskId = photoMovieContextOld.nationalTaskId;
        photoMovieContext.mIsFromDraft = photoMovieContextOld.mIsFromDraft;
        photoMovieContext.commentSetting = photoMovieContextOld.commentSetting;
        photoMovieContext.photoTime = photoMovieContextOld.f98514o;
        photoMovieContext.transTime = photoMovieContextOld.f98515p;
        photoMovieContext.allowDownloadSetting = photoMovieContextOld.allowDownloadSetting;
        return photoMovieContext;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mFinalVideoTmpPath);
        parcel.writeStringList(this.mImageList);
        parcel.writeString(this.musicOrigin);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mHeight);
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mPlayType);
        parcel.writeString(this.mOutputVideoPath);
        parcel.writeString(this.mInputAudioPath);
        parcel.writeFloat(this.mCoverStartTm);
        parcel.writeSerializable(this.mMusic);
        parcel.writeString(this.mFilterPath);
        parcel.writeString(this.mFilterName);
        parcel.writeInt(this.mFilterId);
        parcel.writeInt(this.mFrom);
        parcel.writeString(this.creationId);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.shopDraftId);
        parcel.writeParcelable(this.mSaveModel, i);
        parcel.writeSerializable(this.extractFramesModel);
        parcel.writeInt(this.photoTime);
        parcel.writeInt(this.transTime);
        parcel.writeInt(this.mRealImageCount);
    }
}
