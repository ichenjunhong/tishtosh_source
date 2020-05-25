package androidx.media;

import android.support.p030v4.media.AudioAttributesImplBase;
import androidx.versionedparcelable.C1524a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C1524a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.mUsage = aVar.mo5888b(audioAttributesImplBase.mUsage, 1);
        audioAttributesImplBase.mContentType = aVar.mo5888b(audioAttributesImplBase.mContentType, 2);
        audioAttributesImplBase.mFlags = aVar.mo5888b(audioAttributesImplBase.mFlags, 3);
        audioAttributesImplBase.mLegacyStream = aVar.mo5888b(audioAttributesImplBase.mLegacyStream, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C1524a aVar) {
        aVar.mo5879a(audioAttributesImplBase.mUsage, 1);
        aVar.mo5879a(audioAttributesImplBase.mContentType, 2);
        aVar.mo5879a(audioAttributesImplBase.mFlags, 3);
        aVar.mo5879a(audioAttributesImplBase.mLegacyStream, 4);
    }
}
