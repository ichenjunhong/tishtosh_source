package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData */
public class MultiEditVideoStatusRecordData implements Parcelable, Serializable {
    public static final Creator<MultiEditVideoStatusRecordData> CREATOR = new Creator<MultiEditVideoStatusRecordData>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MultiEditVideoStatusRecordData[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MultiEditVideoStatusRecordData(parcel);
        }
    };
    @C17952c(mo34828a = "cover_img_path")
    public String coverImagePath;
    @C17952c(mo34828a = "cur_multi_edit_data")
    public MultiEditVideoRecordData curMultiEditVideoRecordData;
    @C17952c(mo34828a = "cur_select_index")
    public int currentEditIndex = -1;
    @C17952c(mo34828a = "edit_segments")
    public ArrayList<TimeSpeedModelExtension> editSegments;
    @C17952c(mo34828a = "is_multi_edit_retake")
    public boolean isMultiEditRetake;
    @C17952c(mo34828a = "is_support_multi_edit")
    public boolean isSupportMultiEdit;
    @C17952c(mo34828a = "is_use_multi_edit")
    public boolean isUseMultiEdit;
    @C17952c(mo34828a = "origin_multi_edit_data")
    public MultiEditVideoRecordData originMultiEditRecordData;
    @C17952c(mo34828a = "original_music_start")
    public int originalMusicStart;
    @C17952c(mo34828a = "original_segments")
    public ArrayList<TimeSpeedModelExtension> originalSegments;
    @C17952c(mo34828a = "record_music")
    public C42482c recordMusic;
    @C17952c(mo34828a = "restore_multi_edit_data")
    public MultiEditVideoRecordData restoreMultiEditVideoRecordData;
    @C17952c(mo34828a = "restore_edit_segments")
    public ArrayList<TimeSpeedModelExtension> restoreSegments;
    @C17952c(mo34828a = "segment_size_change")
    public boolean segmentSizeChange;
    @C17952c(mo34828a = "single_restore_multi_edit_data")
    public MultiEditVideoRecordData singleRestoreMultiEditRecordData;
    @C17952c(mo34828a = "single_restore_segments")
    public ArrayList<TimeSpeedModelExtension> singleRestoreSegments;
    @C17952c(mo34828a = "video_meta_data")
    public String videoMetaData;

    public int describeContents() {
        return 0;
    }

    public MultiEditVideoStatusRecordData() {
    }

    protected MultiEditVideoStatusRecordData(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.curMultiEditVideoRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.restoreMultiEditVideoRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.singleRestoreMultiEditRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.originMultiEditRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.currentEditIndex = parcel.readInt();
        boolean z4 = false;
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.segmentSizeChange = z;
        this.originalSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.editSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.restoreSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.singleRestoreSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isMultiEditRetake = z2;
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isUseMultiEdit = z3;
        this.coverImagePath = parcel.readString();
        this.recordMusic = (C42482c) parcel.readSerializable();
        this.originalMusicStart = parcel.readInt();
        this.videoMetaData = parcel.readString();
        if (parcel.readByte() == 1) {
            z4 = true;
        }
        this.isSupportMultiEdit = z4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.curMultiEditVideoRecordData, i);
        parcel.writeParcelable(this.restoreMultiEditVideoRecordData, i);
        parcel.writeParcelable(this.singleRestoreMultiEditRecordData, i);
        parcel.writeParcelable(this.originMultiEditRecordData, i);
        parcel.writeInt(this.currentEditIndex);
        parcel.writeByte(this.segmentSizeChange ? (byte) 1 : 0);
        parcel.writeTypedList(this.originalSegments);
        parcel.writeTypedList(this.editSegments);
        parcel.writeTypedList(this.restoreSegments);
        parcel.writeTypedList(this.singleRestoreSegments);
        parcel.writeByte(this.isMultiEditRetake ? (byte) 1 : 0);
        parcel.writeByte(this.isUseMultiEdit ? (byte) 1 : 0);
        parcel.writeString(this.coverImagePath);
        parcel.writeSerializable(this.recordMusic);
        parcel.writeInt(this.originalMusicStart);
        parcel.writeString(this.videoMetaData);
        parcel.writeByte(this.isSupportMultiEdit ? (byte) 1 : 0);
    }
}
