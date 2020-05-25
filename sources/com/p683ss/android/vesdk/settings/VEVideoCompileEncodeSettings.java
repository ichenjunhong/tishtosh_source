package com.p683ss.android.vesdk.settings;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.vesdk.settings.VEVideoCompileEncodeSettings */
public class VEVideoCompileEncodeSettings implements Parcelable {
    public static final Creator<VEVideoCompileEncodeSettings> CREATOR = new Creator<VEVideoCompileEncodeSettings>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VEVideoCompileEncodeSettings[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VEVideoCompileEncodeSettings(parcel);
        }
    };
    private static final String TAG = "VEVideoCompileEncodeSettings";
    public boolean isSpeedModeSW;
    public boolean isSupportHWEncoder;
    public VEVideoHWEncodeSettings mHWEncodeSetting = new VEVideoHWEncodeSettings();
    public VEVideoSWEncodeSettings mSWEncodeSetting = new VEVideoSWEncodeSettings();
    public int speedMode;
    public boolean useHWEncoder;

    public int describeContents() {
        return 0;
    }

    public VEVideoCompileEncodeSettings() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VEVideoCompileEncodeSettings{useHWEncoder=");
        sb.append(this.useHWEncoder);
        sb.append(", isSupportHWEncoder=");
        sb.append(this.isSupportHWEncoder);
        sb.append(", speedMode=");
        sb.append(this.speedMode);
        sb.append(", mHWEncodeSetting=");
        sb.append(this.mHWEncodeSetting);
        sb.append(", mSWEncodeSetting=");
        sb.append(this.mSWEncodeSetting);
        sb.append('}');
        return sb.toString();
    }

    protected VEVideoCompileEncodeSettings(Parcel parcel) {
        boolean z;
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useHWEncoder = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.isSupportHWEncoder = z2;
        this.speedMode = parcel.readInt();
        this.mHWEncodeSetting = (VEVideoHWEncodeSettings) parcel.readParcelable(VEVideoHWEncodeSettings.class.getClassLoader());
        this.mSWEncodeSetting = (VEVideoSWEncodeSettings) parcel.readParcelable(VEVideoSWEncodeSettings.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.useHWEncoder ? (byte) 1 : 0);
        parcel.writeByte(this.isSupportHWEncoder ? (byte) 1 : 0);
        parcel.writeInt(this.speedMode);
        parcel.writeParcelable(this.mHWEncodeSetting, i);
        parcel.writeParcelable(this.mSWEncodeSetting, i);
    }
}
