package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CodecException;

public final class bhp extends Exception {

    /* renamed from: a */
    private final String f42435a;

    /* renamed from: b */
    private final String f42436b;

    public bhp(bie bie, Throwable th, int i) {
        String valueOf = String.valueOf(bie);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(valueOf);
        super(sb.toString(), th);
        this.f42435a = null;
        String str = i < 0 ? "neg_" : "";
        int abs = Math.abs(i);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 64);
        sb2.append("com.google.android.gms.ads.exoplayer1.MediaCodecTrackRenderer_");
        sb2.append(str);
        sb2.append(abs);
        this.f42436b = sb2.toString();
    }

    public bhp(bie bie, Throwable th, String str) {
        String valueOf = String.valueOf(bie);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(valueOf).length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        super(sb.toString(), th);
        this.f42435a = str;
        String str2 = null;
        if (blp.f42854a >= 21 && (th instanceof CodecException)) {
            str2 = ((CodecException) th).getDiagnosticInfo();
        }
        this.f42436b = str2;
    }
}
