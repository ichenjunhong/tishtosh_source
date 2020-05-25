package android.support.p030v4.media;

import android.util.SparseIntArray;
import androidx.versionedparcelable.C1526c;

/* renamed from: android.support.v4.media.AudioAttributesCompat */
public class AudioAttributesCompat implements C1526c {

    /* renamed from: b */
    private static final SparseIntArray f2789b;

    /* renamed from: c */
    private static final int[] f2790c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};

    /* renamed from: a */
    AudioAttributesImpl f2791a;

    AudioAttributesCompat() {
    }

    public int hashCode() {
        return this.f2791a.hashCode();
    }

    public String toString() {
        return this.f2791a.toString();
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2789b = sparseIntArray;
        sparseIntArray.put(5, 1);
        f2789b.put(6, 2);
        f2789b.put(7, 2);
        f2789b.put(8, 1);
        f2789b.put(9, 1);
        f2789b.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        if (this.f2791a != null) {
            return this.f2791a.equals(audioAttributesCompat.f2791a);
        }
        if (audioAttributesCompat.f2791a == null) {
            return true;
        }
        return false;
    }
}
