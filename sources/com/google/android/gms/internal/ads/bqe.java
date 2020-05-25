package com.google.android.gms.internal.ads;

import android.media.MediaCodec.CodecException;

public final class bqe extends Exception {

    /* renamed from: a */
    private final String f43577a;

    /* renamed from: b */
    private final boolean f43578b;

    /* renamed from: c */
    private final String f43579c;

    /* renamed from: d */
    private final String f43580d;

    public bqe(zzlg zzlg, Throwable th, boolean z, int i) {
        String valueOf = String.valueOf(zzlg);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("Decoder init failed: [");
        sb.append(i);
        sb.append("], ");
        sb.append(valueOf);
        super(sb.toString(), th);
        this.f43577a = zzlg.f46253c;
        this.f43578b = false;
        this.f43579c = null;
        String str = i < 0 ? "neg_" : "";
        int abs = Math.abs(i);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 64);
        sb2.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
        sb2.append(str);
        sb2.append(abs);
        this.f43580d = sb2.toString();
    }

    public bqe(zzlg zzlg, Throwable th, boolean z, String str) {
        String valueOf = String.valueOf(zzlg);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(valueOf).length());
        sb.append("Decoder init failed: ");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        super(sb.toString(), th);
        this.f43577a = zzlg.f46253c;
        this.f43578b = false;
        this.f43579c = str;
        String str2 = null;
        if (btw.f43878a >= 21 && (th instanceof CodecException)) {
            str2 = ((CodecException) th).getDiagnosticInfo();
        }
        this.f43580d = str2;
    }
}
