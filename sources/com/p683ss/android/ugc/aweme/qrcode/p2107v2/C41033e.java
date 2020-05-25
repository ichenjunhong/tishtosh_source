package com.p683ss.android.ugc.aweme.qrcode.p2107v2;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.e */
final /* synthetic */ class C41033e implements Runnable {

    /* renamed from: a */
    private final ScanQRCodeActivityV2 f104348a;

    C41033e(ScanQRCodeActivityV2 scanQRCodeActivityV2) {
        this.f104348a = scanQRCodeActivityV2;
    }

    public final void run() {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.f104348a;
        scanQRCodeActivityV2.f104310q = false;
        scanQRCodeActivityV2.f104311r = false;
        if (scanQRCodeActivityV2.f104302i != null) {
            scanQRCodeActivityV2.f104302i.enableCameraScan(true, scanQRCodeActivityV2.f104303j.mo83450a());
        }
    }
}
