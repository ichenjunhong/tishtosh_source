package p2699pl.droidsonroids.gif;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

/* renamed from: pl.droidsonroids.gif.GifViewSavedState */
class GifViewSavedState extends BaseSavedState {
    public static final Creator<GifViewSavedState> CREATOR = new Creator<GifViewSavedState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GifViewSavedState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GifViewSavedState(parcel);
        }
    };

    /* renamed from: a */
    final long[][] f133491a;

    private GifViewSavedState(Parcel parcel) {
        super(parcel);
        this.f133491a = new long[parcel.readInt()][];
        for (int i = 0; i < this.f133491a.length; i++) {
            this.f133491a[i] = parcel.createLongArray();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f133491a.length);
        for (long[] writeLongArray : this.f133491a) {
            parcel.writeLongArray(writeLongArray);
        }
    }
}
