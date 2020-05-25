package com.p2620vk.sdk.api.photo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p2620vk.sdk.C52420c;

/* renamed from: com.vk.sdk.api.photo.VKImageParameters */
public class VKImageParameters extends C52420c implements Parcelable {
    public static final Creator<VKImageParameters> CREATOR = new Creator<VKImageParameters>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKImageParameters[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKImageParameters(parcel);
        }
    };

    /* renamed from: c */
    public C52417a f130751c;

    /* renamed from: d */
    public float f130752d;

    /* renamed from: com.vk.sdk.api.photo.VKImageParameters$a */
    enum C52417a {
        Jpg,
        Png
    }

    public int describeContents() {
        return 0;
    }

    public VKImageParameters() {
        this.f130751c = C52417a.Png;
    }

    private VKImageParameters(Parcel parcel) {
        C52417a aVar;
        this.f130751c = C52417a.Png;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            aVar = null;
        } else {
            aVar = C52417a.values()[readInt];
        }
        this.f130751c = aVar;
        this.f130752d = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        if (this.f130751c == null) {
            i2 = -1;
        } else {
            i2 = this.f130751c.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeFloat(this.f130752d);
    }
}
