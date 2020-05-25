package com.twitter.sdk.android.core.internal.scribe;

import com.twitter.sdk.android.core.internal.scribe.C52173r.C52177c;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.y */
final /* synthetic */ class C52185y implements C52177c {

    /* renamed from: a */
    private final boolean[] f129899a;

    /* renamed from: b */
    private final ByteArrayOutputStream f129900b;

    C52185y(boolean[] zArr, ByteArrayOutputStream byteArrayOutputStream) {
        this.f129899a = zArr;
        this.f129900b = byteArrayOutputStream;
    }

    /* renamed from: a */
    public final void mo108910a(InputStream inputStream, int i) {
        boolean[] zArr = this.f129899a;
        ByteArrayOutputStream byteArrayOutputStream = this.f129900b;
        byte[] bArr = new byte[i];
        inputStream.read(bArr);
        if (zArr[0]) {
            byteArrayOutputStream.write(ScribeFilesSender.f129781a);
        } else {
            zArr[0] = true;
        }
        byteArrayOutputStream.write(bArr);
    }
}
