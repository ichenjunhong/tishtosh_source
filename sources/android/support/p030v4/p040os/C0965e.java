package android.support.p030v4.p040os;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.os.e */
public final class C0965e {

    /* renamed from: android.support.v4.os.e$a */
    static class C0966a<T> implements ClassLoaderCreator<T> {

        /* renamed from: a */
        private final C0967f<T> f3117a;

        C0966a(C0967f<T> fVar) {
            this.f3117a = fVar;
        }

        public final T createFromParcel(Parcel parcel) {
            return this.f3117a.mo2950a(parcel, null);
        }

        public final T[] newArray(int i) {
            return this.f3117a.mo2951a(i);
        }

        public final T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f3117a.mo2950a(parcel, classLoader);
        }
    }

    /* renamed from: a */
    public static <T> Creator<T> m2810a(C0967f<T> fVar) {
        return new C0966a(fVar);
    }
}
