package android.support.p030v4.media;

import android.media.AudioAttributes;

/* renamed from: android.support.v4.media.AudioAttributesImplApi21 */
public final class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    AudioAttributes f2792a;

    /* renamed from: b */
    int f2793b = -1;

    AudioAttributesImplApi21() {
    }

    public final int hashCode() {
        return this.f2792a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat: audioattributes=");
        sb.append(this.f2792a);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f2792a.equals(((AudioAttributesImplApi21) obj).f2792a);
    }
}
