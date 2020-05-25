package org.libsdl.app;

import com.p683ss.android.medialib.p1179a.C19218a.C19219a;

public interface AudioRecorderInterfaceExt extends C19219a, AudioRecorderInterface {
    int initAudioConfig(int i, int i2, int i3, int i4);

    int onProcessData(byte[] bArr, int i);
}
