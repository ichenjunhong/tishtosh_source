package com.google.android.gms.internal.ads;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;

public final class awd {

    /* renamed from: a */
    private final byte[] f41454a = new byte[UnReadVideoExperiment.BROWSE_RECORD_LIST];

    /* renamed from: b */
    private int f41455b;

    /* renamed from: c */
    private int f41456c;

    public awd(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f41454a[i] = (byte) i;
        }
        byte b = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            b = (b + this.f41454a[i2] + bArr[i2 % bArr.length]) & 255;
            byte b2 = this.f41454a[i2];
            byte[] bArr2 = this.f41454a;
            bArr2[i2] = bArr2[b];
            this.f41454a[b] = b2;
        }
        this.f41455b = 0;
        this.f41456c = 0;
    }

    /* renamed from: a */
    public final void mo29577a(byte[] bArr) {
        int i = this.f41455b;
        int i2 = this.f41456c;
        for (int i3 = 0; i3 < 256; i3++) {
            i = (i + 1) & NormalGiftView.ALPHA_255;
            i2 = (i2 + this.f41454a[i]) & NormalGiftView.ALPHA_255;
            byte b = this.f41454a[i];
            byte[] bArr2 = this.f41454a;
            bArr2[i] = bArr2[i2];
            this.f41454a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f41454a[(this.f41454a[i] + this.f41454a[i2]) & NormalGiftView.ALPHA_255]);
        }
        this.f41455b = i;
        this.f41456c = i2;
    }
}
