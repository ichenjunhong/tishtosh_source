package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelImpl implements Parcelable {
    public static final Creator<ParcelImpl> CREATOR = new Creator<ParcelImpl>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ParcelImpl[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }
    };

    /* renamed from: a */
    public final C1526c f5476a;

    public int describeContents() {
        return 0;
    }

    protected ParcelImpl(Parcel parcel) {
        this.f5476a = new C1525b(parcel).mo5900g();
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1525b(parcel).mo5882a(this.f5476a);
    }
}
