package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.C17971f;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.greenscreen.GreenScreenImage;
import com.p683ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p683ss.android.ugc.aweme.sticker.C46071n;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension */
public class TimeSpeedModelExtension implements Parcelable {
    public static final Creator<TimeSpeedModelExtension> CREATOR = new Creator<TimeSpeedModelExtension>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TimeSpeedModelExtension[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new TimeSpeedModelExtension(parcel);
        }
    };
    private static final C17971f GSON = createIFoundationAVServiceProxybyMonsterPlugin().getNetworkService().getRetrofitFactoryGson();
    private int cameraId;
    private String cameraLensInfo;
    private int duration;
    private boolean isBusiSticker;
    private boolean isRedPacketSticker;
    private List<String> mARText;
    private C46066a mBackgroundVideo;
    private BeautyMetadata mBeautyMetadata;
    private List<String> mBubbleText;
    private AVChallenge mChallenge;
    private GreenScreenImage mGreenScreenImage;
    private String mStickerId;
    private List<String> mStickerMusicIds;
    private EmbaddedWindowInfo mWindowInfo;
    private double speed;
    private C46071n stickerInfo;
    private C44985aq stickerPoi;
    private boolean supportRetake;
    private String words;

    public TimeSpeedModelExtension() {
    }

    public int describeContents() {
        return 0;
    }

    public List<String> getARTexts() {
        return this.mARText;
    }

    public C46066a getBackgroundVideo() {
        return this.mBackgroundVideo;
    }

    public BeautyMetadata getBeautyMetadata() {
        return this.mBeautyMetadata;
    }

    public List<String> getBubbleTexts() {
        return this.mBubbleText;
    }

    public int getCameraId() {
        return this.cameraId;
    }

    public String getCameraLensInfo() {
        return this.cameraLensInfo;
    }

    public int getDuration() {
        return this.duration;
    }

    public GreenScreenImage getGreenScreenImage() {
        return this.mGreenScreenImage;
    }

    public AVChallenge getHashtag() {
        return this.mChallenge;
    }

    public double getSpeed() {
        return this.speed;
    }

    public String getStickerId() {
        return this.mStickerId;
    }

    public List<String> getStickerMusicIds() {
        return this.mStickerMusicIds;
    }

    public C44985aq getStickerPoi() {
        return this.stickerPoi;
    }

    public boolean isBusiSticker() {
        return this.isBusiSticker;
    }

    public boolean isSupportRetake() {
        return this.supportRetake;
    }

    public C18085o toJson() {
        return GSON.mo34875a((Object) this).mo35009m();
    }

    public String getGradeKey() {
        if (this.stickerInfo == null) {
            return "";
        }
        if (this.stickerInfo.getGradeKey() == null) {
            return "";
        }
        return this.stickerInfo.getGradeKey();
    }

    public String getPropSource() {
        if (this.stickerInfo == null) {
            return "";
        }
        if (this.stickerInfo.getPropSource() == null) {
            return "";
        }
        return this.stickerInfo.getPropSource();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("durationSDK: ");
        sb.append(getDuration());
        sb.append(" speed: ");
        sb.append(getSpeed());
        return sb.toString();
    }

    public static IFoundationAVServiceProxy createIFoundationAVServiceProxybyMonsterPlugin() {
        Object a = C27991b.m66756a(IFoundationAVServiceProxy.class);
        if (a != null) {
            return (IFoundationAVServiceProxy) a;
        }
        return (IFoundationAVServiceProxy) C20302a.m50070a(IFoundationAVServiceProxy.class).mo42947a(new C20310d()).mo42946a().mo42948b();
    }

    public void adjustDuration(long j) {
        this.duration = (int) j;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setStickerMusicIds(List<String> list) {
        this.mStickerMusicIds = list;
    }

    public static TimeSpeedModelExtension fromJson(C18085o oVar) {
        return (TimeSpeedModelExtension) GSON.mo34881a((C18082l) oVar, TimeSpeedModelExtension.class);
    }

    public static int calculateRealTime(List<TimeSpeedModelExtension> list) {
        int i = 0;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        for (TimeSpeedModelExtension timeSpeedModelExtension : list) {
            i += calculateRealTime(timeSpeedModelExtension.duration, timeSpeedModelExtension.speed);
        }
        return i;
    }

    protected TimeSpeedModelExtension(Parcel parcel) {
        boolean z;
        boolean z2;
        this.duration = parcel.readInt();
        this.speed = parcel.readDouble();
        this.cameraId = parcel.readInt();
        this.mStickerId = parcel.readString();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isBusiSticker = z;
        this.stickerPoi = (C44985aq) parcel.readSerializable();
        this.mStickerMusicIds = parcel.createStringArrayList();
        this.stickerInfo = (C46071n) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isRedPacketSticker = z2;
        this.words = parcel.readString();
        this.mChallenge = (AVChallenge) parcel.readSerializable();
        this.mWindowInfo = (EmbaddedWindowInfo) parcel.readParcelable(EmbaddedWindowInfo.class.getClassLoader());
        this.mBubbleText = parcel.createStringArrayList();
        this.mARText = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z3 = true;
        }
        this.supportRetake = z3;
        this.mBeautyMetadata = (BeautyMetadata) parcel.readParcelable(BeautyMetadata.class.getClassLoader());
        this.cameraLensInfo = parcel.readString();
        this.mGreenScreenImage = (GreenScreenImage) parcel.readParcelable(GreenScreenImage.class.getClassLoader());
    }

    public static int calculateRealTime(int i, double d) {
        double d2 = (double) i;
        Double.isNaN(d2);
        return (int) ((d2 * 1.0d) / d);
    }

    public static long calculateRealTime(long j, double d) {
        double d2 = (double) j;
        Double.isNaN(d2);
        return (long) ((d2 * 1.0d) / d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.duration);
        parcel.writeDouble(this.speed);
        parcel.writeInt(this.cameraId);
        parcel.writeString(this.mStickerId);
        parcel.writeByte(this.isBusiSticker ? (byte) 1 : 0);
        parcel.writeSerializable(this.stickerPoi);
        parcel.writeStringList(this.mStickerMusicIds);
        parcel.writeSerializable(this.stickerInfo);
        parcel.writeByte(this.isRedPacketSticker ? (byte) 1 : 0);
        parcel.writeString(this.words);
        parcel.writeSerializable(this.mChallenge);
        parcel.writeParcelable(this.mWindowInfo, i);
        parcel.writeStringList(this.mBubbleText);
        parcel.writeStringList(this.mARText);
        parcel.writeByte(this.supportRetake ? (byte) 1 : 0);
        parcel.writeParcelable(this.mBeautyMetadata, i);
        parcel.writeString(this.cameraLensInfo);
        parcel.writeParcelable(this.mGreenScreenImage, i);
    }

    public TimeSpeedModelExtension(int i, double d, String str, AVChallenge aVChallenge, List<String> list) {
        this.duration = i;
        this.speed = d;
        this.mStickerId = str;
        this.mChallenge = aVChallenge;
        this.mStickerMusicIds = list;
    }

    public TimeSpeedModelExtension(int i, double d, String str, C44985aq aqVar, C46071n nVar, AVChallenge aVChallenge, List<String> list, EmbaddedWindowInfo embaddedWindowInfo, List<String> list2, List<String> list3, int i2, boolean z, boolean z2, C46066a aVar, BeautyMetadata beautyMetadata, String str2, GreenScreenImage greenScreenImage) {
        this.duration = i;
        this.speed = d;
        this.mStickerId = str;
        this.stickerPoi = aqVar;
        this.stickerInfo = nVar;
        this.mChallenge = aVChallenge;
        this.mStickerMusicIds = list;
        this.mWindowInfo = embaddedWindowInfo;
        this.mARText = list2;
        this.mBubbleText = list3;
        this.cameraId = i2;
        this.isBusiSticker = z;
        this.mBackgroundVideo = aVar;
        this.supportRetake = z2;
        this.mBeautyMetadata = beautyMetadata;
        this.cameraLensInfo = str2;
        this.mGreenScreenImage = greenScreenImage;
    }
}
