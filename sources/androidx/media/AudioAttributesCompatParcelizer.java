package androidx.media;

import android.support.p030v4.media.AudioAttributesCompat;
import android.support.p030v4.media.AudioAttributesImpl;
import androidx.versionedparcelable.C1524a;
import androidx.versionedparcelable.C1526c;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C1524a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.mImpl = (AudioAttributesImpl) aVar.mo5891b(audioAttributesCompat.mImpl, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C1524a aVar) {
        aVar.mo5883a((C1526c) audioAttributesCompat.mImpl, 1);
    }
}
