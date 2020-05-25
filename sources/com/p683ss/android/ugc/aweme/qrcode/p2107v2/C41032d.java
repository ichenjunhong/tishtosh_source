package com.p683ss.android.ugc.aweme.qrcode.p2107v2;

import com.p683ss.android.ugc.aweme.qrcode.p2107v2.ScanQRCodeActivityV2.C41026b;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVCameraService.IAVCameraReadyCallback;
import com.p683ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.d */
final /* synthetic */ class C41032d implements IAVCameraReadyCallback {

    /* renamed from: a */
    private final ScanQRCodeActivityV2 f104346a;

    /* renamed from: b */
    private final C41026b f104347b;

    C41032d(ScanQRCodeActivityV2 scanQRCodeActivityV2, C41026b bVar) {
        this.f104346a = scanQRCodeActivityV2;
        this.f104347b = bVar;
    }

    public final void finish(Object obj) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.f104346a;
        C41026b bVar = this.f104347b;
        IQRCodeScanner iQRCodeScanner = (IQRCodeScanner) obj;
        if (iQRCodeScanner != null) {
            scanQRCodeActivityV2.f104302i = iQRCodeScanner;
            if (scanQRCodeActivityV2.f104304k != null) {
                scanQRCodeActivityV2.f104304k.mo83452a(scanQRCodeActivityV2.f104302i);
            }
            scanQRCodeActivityV2.mo83520j();
        }
        if (bVar != null) {
            bVar.mo83536a();
        }
    }
}
