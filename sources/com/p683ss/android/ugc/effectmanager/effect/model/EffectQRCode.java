package com.p683ss.android.ugc.effectmanager.effect.model;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectQRCode */
public final class EffectQRCode {
    private final String qrCodeText;

    public final String getQrCodeText() {
        return this.qrCodeText;
    }

    private EffectQRCode(String str) {
        this.qrCodeText = str;
    }

    public static EffectQRCode create(String str) {
        return new EffectQRCode(str);
    }
}
