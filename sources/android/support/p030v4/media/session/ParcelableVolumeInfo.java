package android.support.p030v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new Creator<ParcelableVolumeInfo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }
    };

    /* renamed from: a */
    public int f3068a;

    /* renamed from: b */
    public int f3069b;

    /* renamed from: c */
    public int f3070c;

    /* renamed from: d */
    public int f3071d;

    /* renamed from: e */
    public int f3072e;

    public int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f3068a = parcel.readInt();
        this.f3070c = parcel.readInt();
        this.f3071d = parcel.readInt();
        this.f3072e = parcel.readInt();
        this.f3069b = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3068a);
        parcel.writeInt(this.f3070c);
        parcel.writeInt(this.f3071d);
        parcel.writeInt(this.f3072e);
        parcel.writeInt(this.f3069b);
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f3068a = i;
        this.f3069b = i2;
        this.f3070c = i3;
        this.f3071d = i4;
        this.f3072e = i5;
    }
}
