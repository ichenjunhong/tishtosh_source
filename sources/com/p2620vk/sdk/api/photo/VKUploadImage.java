package com.p2620vk.sdk.api.photo;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p2620vk.sdk.C52420c;

/* renamed from: com.vk.sdk.api.photo.VKUploadImage */
public class VKUploadImage extends C52420c implements Parcelable {
    public static final Creator<VKUploadImage> CREATOR = new Creator<VKUploadImage>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKUploadImage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKUploadImage(parcel);
        }
    };

    /* renamed from: c */
    public final Bitmap f130756c;

    /* renamed from: d */
    public final VKImageParameters f130757d;

    public int describeContents() {
        return 0;
    }

    private VKUploadImage(Parcel parcel) {
        this.f130756c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f130757d = (VKImageParameters) parcel.readParcelable(VKImageParameters.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f130756c, 0);
        parcel.writeParcelable(this.f130757d, 0);
    }
}
