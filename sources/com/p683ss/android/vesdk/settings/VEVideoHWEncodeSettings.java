package com.p683ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.vesdk.settings.VEVideoHWEncodeSettings */
public class VEVideoHWEncodeSettings implements Parcelable {
    public static final Creator<VEVideoHWEncodeSettings> CREATOR = new Creator<VEVideoHWEncodeSettings>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VEVideoHWEncodeSettings[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VEVideoHWEncodeSettings(parcel);
        }
    };
    private static final String TAG = "VEVideoHWEncodeSettings";
    public long mBitrate = 6000000;
    public double mFullHd_bitrate_ratio = 1.0d;
    public int mGop = 35;
    public double mH_fps_bitrate_ratio = 1.0d;
    public double mHp_bitrate_ratio = 0.75d;
    public int mProfile = VEVideoEncodeProfile.ENCODE_PROFILE_UNKNOWN.ordinal();
    public double mSd_bitrate_ratio = 1.0d;

    public int describeContents() {
        return 0;
    }

    public VEVideoHWEncodeSettings() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VEVideoHWEncodeSettings{mBitrate=");
        sb.append(this.mBitrate);
        sb.append(", mProfile=");
        sb.append(this.mProfile);
        sb.append(", mHp_bitrate_ratio=");
        sb.append(this.mHp_bitrate_ratio);
        sb.append(", mFullHd_bitrate_ratio=");
        sb.append(this.mFullHd_bitrate_ratio);
        sb.append(", mSd_bitrate_ratio=");
        sb.append(this.mSd_bitrate_ratio);
        sb.append(", mH_fps_bitrate_ratio=");
        sb.append(this.mH_fps_bitrate_ratio);
        sb.append(", mGop=");
        sb.append(this.mGop);
        sb.append('}');
        return sb.toString();
    }

    protected VEVideoHWEncodeSettings(Parcel parcel) {
        this.mBitrate = parcel.readLong();
        this.mProfile = parcel.readInt();
        this.mHp_bitrate_ratio = parcel.readDouble();
        this.mFullHd_bitrate_ratio = parcel.readDouble();
        this.mSd_bitrate_ratio = parcel.readDouble();
        this.mH_fps_bitrate_ratio = parcel.readDouble();
        this.mGop = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mBitrate);
        parcel.writeInt(this.mProfile);
        parcel.writeDouble(this.mHp_bitrate_ratio);
        parcel.writeDouble(this.mFullHd_bitrate_ratio);
        parcel.writeDouble(this.mSd_bitrate_ratio);
        parcel.writeDouble(this.mH_fps_bitrate_ratio);
        parcel.writeInt(this.mGop);
    }
}
