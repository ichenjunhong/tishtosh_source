package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData */
public class MultiEditVideoSegmentRecordData implements Parcelable, Serializable {
    public static final Creator<MultiEditVideoSegmentRecordData> CREATOR = new Creator<MultiEditVideoSegmentRecordData>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MultiEditVideoSegmentRecordData[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MultiEditVideoSegmentRecordData(parcel);
        }
    };
    @C17952c(mo34828a = "audio_length")
    public long audioLength;
    @C17952c(mo34828a = "audio_path")
    public String audioPath;
    @C17952c(mo34828a = "draft_audio_path")
    public String draftAudioPath;
    @C17952c(mo34828a = "draft_video_path")
    public String draftVideoPath;
    @C17952c(mo34828a = "endTime")
    public long endTime;
    @C17952c(mo34828a = "speed")
    public float speed;
    @C17952c(mo34828a = "startTime")
    public long startTime;
    @C17952c(mo34828a = "video_length")
    public long videoLength;
    @C17952c(mo34828a = "video_path")
    public String videoPath;

    public MultiEditVideoSegmentRecordData() {
    }

    public int describeContents() {
        return 0;
    }

    public void resetTime() {
        this.startTime = 0;
        this.endTime = this.videoLength / 1000;
    }

    public MultiEditVideoSegmentRecordData cloneData() {
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
        multiEditVideoSegmentRecordData.videoPath = this.videoPath;
        multiEditVideoSegmentRecordData.videoLength = this.videoLength;
        multiEditVideoSegmentRecordData.draftVideoPath = this.draftVideoPath;
        multiEditVideoSegmentRecordData.draftAudioPath = this.draftAudioPath;
        multiEditVideoSegmentRecordData.audioPath = this.audioPath;
        multiEditVideoSegmentRecordData.audioLength = this.audioLength;
        multiEditVideoSegmentRecordData.speed = this.speed;
        multiEditVideoSegmentRecordData.startTime = this.startTime;
        multiEditVideoSegmentRecordData.endTime = this.endTime;
        return multiEditVideoSegmentRecordData;
    }

    public MediaModel convertModel() {
        MediaModel mediaModel = new MediaModel(-1);
        mediaModel.f95383b = this.videoPath;
        mediaModel.f95386e = this.videoLength / 1000;
        mediaModel.f95390i = 720;
        mediaModel.f95391j = 1080;
        mediaModel.f95394m = (int) this.startTime;
        mediaModel.f95395n = (int) this.endTime;
        return mediaModel;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MultiEditVideoSegmentRecordData{videoPath=");
        sb.append(this.videoPath);
        sb.append(", videoLength=");
        sb.append(this.videoLength);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append('}');
        return sb.toString();
    }

    public void copyData(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        if (multiEditVideoSegmentRecordData != null) {
            this.videoPath = multiEditVideoSegmentRecordData.videoPath;
            this.audioPath = multiEditVideoSegmentRecordData.audioPath;
            this.videoLength = multiEditVideoSegmentRecordData.videoLength;
            this.audioLength = multiEditVideoSegmentRecordData.audioLength;
            this.startTime = multiEditVideoSegmentRecordData.startTime;
            this.endTime = multiEditVideoSegmentRecordData.endTime;
            this.speed = multiEditVideoSegmentRecordData.speed;
        }
    }

    protected MultiEditVideoSegmentRecordData(Parcel parcel) {
        this.videoPath = parcel.readString();
        this.draftVideoPath = parcel.readString();
        this.audioPath = parcel.readString();
        this.draftAudioPath = parcel.readString();
        this.videoLength = parcel.readLong();
        this.audioLength = parcel.readLong();
        this.speed = parcel.readFloat();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
    }

    public boolean isEqual(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData) {
        if (multiEditVideoSegmentRecordData != null && this.videoPath.equals(multiEditVideoSegmentRecordData.videoPath) && this.videoLength == multiEditVideoSegmentRecordData.videoLength && this.audioPath.equals(multiEditVideoSegmentRecordData.audioPath) && this.audioLength == multiEditVideoSegmentRecordData.audioLength && this.speed == multiEditVideoSegmentRecordData.speed && this.startTime == multiEditVideoSegmentRecordData.startTime && this.endTime == multiEditVideoSegmentRecordData.endTime) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoPath);
        parcel.writeString(this.draftVideoPath);
        parcel.writeString(this.audioPath);
        parcel.writeString(this.draftAudioPath);
        parcel.writeLong(this.videoLength);
        parcel.writeLong(this.audioLength);
        parcel.writeFloat(this.speed);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
    }
}
