package com.p683ss.android.medialib.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.medialib.util.VEPlatformUtils */
public final class VEPlatformUtils {

    /* renamed from: com.ss.android.medialib.util.VEPlatformUtils$VEPlatform */
    public enum VEPlatform implements Parcelable {
        PLATFORM_UNKNOWN,
        PLATFORM_QCOM,
        PLATFORM_MTK,
        PLATFORM_HISI,
        PLATFORM_EXYNOS;
        
        public static final Creator<VEPlatform> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Creator<VEPlatform>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new VEPlatform[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return VEPlatform.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }
}
