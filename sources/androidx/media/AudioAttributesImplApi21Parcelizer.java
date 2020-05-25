package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import android.support.p030v4.media.AudioAttributesImplApi21;
import androidx.versionedparcelable.C1524a;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C1524a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.mAudioAttributes = (AudioAttributes) aVar.mo5889b(audioAttributesImplApi21.mAudioAttributes, 1);
        audioAttributesImplApi21.mLegacyStreamType = aVar.mo5888b(audioAttributesImplApi21.mLegacyStreamType, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C1524a aVar) {
        aVar.mo5881a((Parcelable) audioAttributesImplApi21.mAudioAttributes, 1);
        aVar.mo5879a(audioAttributesImplApi21.mLegacyStreamType, 2);
    }
}
