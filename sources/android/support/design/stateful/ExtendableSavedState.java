package android.support.design.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p030v4.p038f.C0800n;
import android.support.p030v4.view.AbsSavedState;

public class ExtendableSavedState extends AbsSavedState {
    public static final Creator<ExtendableSavedState> CREATOR = new ClassLoaderCreator<ExtendableSavedState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ExtendableSavedState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, null);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }
    };

    /* renamed from: a */
    public final C0800n<String, Bundle> f1528a;

    public String toString() {
        StringBuilder sb = new StringBuilder("ExtendableSavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.f1528a);
        sb.append("}");
        return sb.toString();
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f1528a = new C0800n<>();
    }

    private ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f1528a = new C0800n<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f1528a.put(strArr[i], bundleArr[i]);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f1528a.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) this.f1528a.mo2576b(i2);
            bundleArr[i2] = (Bundle) this.f1528a.mo2577c(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
