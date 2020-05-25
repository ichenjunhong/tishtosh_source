package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Pair;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData */
public class MultiEditVideoRecordData implements Parcelable, Serializable {
    public static final Creator<MultiEditVideoRecordData> CREATOR = new Creator<MultiEditVideoRecordData>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MultiEditVideoRecordData[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MultiEditVideoRecordData(parcel);
        }
    };
    @C17952c(mo34828a = "concat_audio")
    public String concatAudio;
    @C17952c(mo34828a = "concat_video")
    public String concatVideo;
    @C17952c(mo34828a = "cover_path")
    public String coverPath;
    public String curRecordingDir;
    @C17952c(mo34828a = "end_time")
    public long endTime;
    @C17952c(mo34828a = "has_retake")
    public boolean hasRetake;
    @C17952c(mo34828a = "is_single_video")
    public boolean isSingleVideo;
    @C17952c(mo34828a = "left_slide_x")
    public float leftSlideX;
    @C17952c(mo34828a = "music_duration")
    public int musicDuration;
    @C17952c(mo34828a = "music_index")
    public int musicIndex = -1;
    @C17952c(mo34828a = "music_path")
    public String musicPath;
    @C17952c(mo34828a = "music_trimin")
    public int musicTrimIn;
    @C17952c(mo34828a = "music_volume")
    public float musicVolume = 0.5f;
    @C17952c(mo34828a = "origin_volume")
    public float originVolume = 0.5f;
    @C17952c(mo34828a = "video_duration")
    public int preVideoDuration;
    @C17952c(mo34828a = "right_slide_x")
    public float rightSlideX;
    @C17952c(mo34828a = "segment_list")
    public List<MultiEditVideoSegmentRecordData> segmentDataList;
    @C17952c(mo34828a = "start_time")
    public long startTime;
    @C17952c(mo34828a = "use_music")
    public boolean useMusic;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    private int m96061a() {
        return (int) (this.endTime - this.startTime);
    }

    public MultiEditVideoRecordData() {
    }

    public List<MediaModel> convertMediaModelList() {
        if (this.segmentDataList == null || this.segmentDataList.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (MultiEditVideoSegmentRecordData convertModel : this.segmentDataList) {
            arrayList.add(convertModel.convertModel());
        }
        return arrayList;
    }

    public boolean isPlaySingleSegmentMusic() {
        if (this.musicDuration + 1000 >= ((Integer) getPlayInOutTime().second).intValue() - ((Integer) getPlayInOutTime().first).intValue()) {
            return true;
        }
        return false;
    }

    public void resetTimeData() {
        if (this.segmentDataList != null && !this.segmentDataList.isEmpty()) {
            this.startTime = 0;
            this.endTime = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
                multiEditVideoSegmentRecordData.resetTime();
                this.endTime += multiEditVideoSegmentRecordData.videoLength / 1000;
            }
        }
    }

    public MultiEditVideoRecordData cloneData() {
        MultiEditVideoRecordData multiEditVideoRecordData = new MultiEditVideoRecordData();
        multiEditVideoRecordData.concatVideo = this.concatVideo;
        multiEditVideoRecordData.concatAudio = this.concatAudio;
        multiEditVideoRecordData.useMusic = this.useMusic;
        multiEditVideoRecordData.startTime = this.startTime;
        multiEditVideoRecordData.endTime = this.endTime;
        multiEditVideoRecordData.leftSlideX = this.leftSlideX;
        multiEditVideoRecordData.rightSlideX = this.rightSlideX;
        multiEditVideoRecordData.curRecordingDir = this.curRecordingDir;
        multiEditVideoRecordData.segmentDataList = new ArrayList();
        for (MultiEditVideoSegmentRecordData cloneData : this.segmentDataList) {
            multiEditVideoRecordData.segmentDataList.add(cloneData.cloneData());
        }
        multiEditVideoRecordData.musicPath = this.musicPath;
        multiEditVideoRecordData.originVolume = this.originVolume;
        multiEditVideoRecordData.musicVolume = this.musicVolume;
        multiEditVideoRecordData.hasRetake = this.hasRetake;
        multiEditVideoRecordData.musicTrimIn = this.musicTrimIn;
        multiEditVideoRecordData.musicDuration = this.musicDuration;
        multiEditVideoRecordData.preVideoDuration = this.preVideoDuration;
        multiEditVideoRecordData.coverPath = this.coverPath;
        multiEditVideoRecordData.isSingleVideo = this.isSingleVideo;
        return multiEditVideoRecordData;
    }

    public Pair<Integer, Integer> getPlayInOutTime() {
        int i;
        int i2 = (int) this.startTime;
        if (m96061a() > 0) {
            i = m96061a();
        } else if (this.segmentDataList == null || this.segmentDataList.isEmpty()) {
            i = 0;
        } else {
            long j = 0;
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : this.segmentDataList) {
                j += multiEditVideoSegmentRecordData.endTime - multiEditVideoSegmentRecordData.startTime;
            }
            i = (int) j;
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i2 + i));
    }

    public void copyData(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            this.startTime = multiEditVideoRecordData.startTime;
            this.endTime = multiEditVideoRecordData.endTime;
            this.leftSlideX = multiEditVideoRecordData.leftSlideX;
            this.rightSlideX = multiEditVideoRecordData.rightSlideX;
            this.useMusic = multiEditVideoRecordData.useMusic;
            this.concatVideo = multiEditVideoRecordData.concatVideo;
            this.concatAudio = multiEditVideoRecordData.concatAudio;
            this.musicIndex = multiEditVideoRecordData.musicIndex;
            this.musicVolume = multiEditVideoRecordData.musicVolume;
            this.originVolume = multiEditVideoRecordData.originVolume;
            this.musicPath = multiEditVideoRecordData.musicPath;
            this.hasRetake = multiEditVideoRecordData.hasRetake;
            this.musicTrimIn = multiEditVideoRecordData.musicTrimIn;
            this.musicDuration = multiEditVideoRecordData.musicDuration;
            this.preVideoDuration = multiEditVideoRecordData.preVideoDuration;
            this.coverPath = multiEditVideoRecordData.coverPath;
            this.isSingleVideo = multiEditVideoRecordData.isSingleVideo;
        }
    }

    public boolean isEqual(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData == null || multiEditVideoRecordData.segmentDataList == null || multiEditVideoRecordData.segmentDataList.isEmpty() || this.segmentDataList == null || this.segmentDataList.isEmpty() || this.segmentDataList.size() != multiEditVideoRecordData.segmentDataList.size()) {
            return false;
        }
        for (int i = 0; i < this.segmentDataList.size(); i++) {
            if (!((MultiEditVideoSegmentRecordData) this.segmentDataList.get(i)).isEqual((MultiEditVideoSegmentRecordData) multiEditVideoRecordData.segmentDataList.get(i))) {
                return false;
            }
        }
        return true;
    }

    protected MultiEditVideoRecordData(Parcel parcel) {
        boolean z;
        boolean z2;
        this.segmentDataList = parcel.createTypedArrayList(MultiEditVideoSegmentRecordData.CREATOR);
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useMusic = z;
        this.concatVideo = parcel.readString();
        this.concatAudio = parcel.readString();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.leftSlideX = parcel.readFloat();
        this.rightSlideX = parcel.readFloat();
        this.curRecordingDir = parcel.readString();
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.hasRetake = z2;
        this.musicPath = parcel.readString();
        this.originVolume = parcel.readFloat();
        this.musicVolume = parcel.readFloat();
        this.musicTrimIn = parcel.readInt();
        this.musicDuration = parcel.readInt();
        this.preVideoDuration = parcel.readInt();
        this.coverPath = parcel.readString();
        if (parcel.readByte() == 1) {
            z3 = true;
        }
        this.isSingleVideo = z3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.segmentDataList);
        parcel.writeByte(this.useMusic ? (byte) 1 : 0);
        parcel.writeString(this.concatVideo);
        parcel.writeString(this.concatAudio);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeFloat(this.leftSlideX);
        parcel.writeFloat(this.rightSlideX);
        parcel.writeString(this.curRecordingDir);
        parcel.writeByte(this.hasRetake ? (byte) 1 : 0);
        parcel.writeString(this.musicPath);
        parcel.writeFloat(this.originVolume);
        parcel.writeFloat(this.musicVolume);
        parcel.writeInt(this.musicTrimIn);
        parcel.writeInt(this.musicDuration);
        parcel.writeInt(this.preVideoDuration);
        parcel.writeString(this.coverPath);
        parcel.writeByte(this.isSingleVideo ? (byte) 1 : 0);
    }
}
