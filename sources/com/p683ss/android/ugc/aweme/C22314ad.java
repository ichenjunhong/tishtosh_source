package com.p683ss.android.ugc.aweme;

import android.content.Context;
import android.view.SurfaceHolder;
import com.bef.effectsdk.C2592c;
import com.p683ss.android.medialib.camera.C19264d;
import com.p683ss.android.medialib.camera.C19274g;
import com.p683ss.android.medialib.model.EnigmaResult;
import com.p683ss.android.medialib.p1185qr.EnigmaScanner;
import com.p683ss.android.medialib.p1185qr.EnigmaScanner.C19385a;
import com.p683ss.android.medialib.p1185qr.ScanSettings;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.p683ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.OnEnigmaScanListener;
import com.p683ss.android.ugc.effectmanager.C48580c;
import com.p683ss.android.vesdk.C50630ak;

/* renamed from: com.ss.android.ugc.aweme.ad */
public final class C22314ad implements IQRCodeScanner {

    /* renamed from: a */
    public OnEnigmaScanListener f60110a;

    /* renamed from: b */
    private EnigmaScanner f60111b;

    /* renamed from: c */
    private C19274g f60112c = C19274g.m47034b();

    public final void pauseEffectAudio(boolean z) {
    }

    public final void processTouchEvent(float f, float f2) {
    }

    public final void switchEffectWithTag(String str, int i, int i2, String str2) {
    }

    public final void stopPicScan() {
        this.f60111b.stopPicScan();
    }

    public C22314ad() {
        m55217a();
    }

    public final void closeLight() {
        if (this.f60112c != null) {
            this.f60112c.mo39729a(false);
        }
    }

    public final void openLight() {
        if (this.f60112c != null) {
            this.f60112c.mo39729a(true);
        }
    }

    public final void release() {
        m55217a();
        this.f60111b.release();
        this.f60111b = null;
    }

    public final void stop() {
        m55217a();
        this.f60111b.stop();
    }

    /* renamed from: a */
    private void m55217a() {
        if (this.f60111b == null) {
            this.f60111b = new EnigmaScanner();
        }
        this.f60111b.setListener(new C19385a() {
            /* renamed from: a */
            public final void mo40444a(EnigmaResult enigmaResult) {
                if (C22314ad.this.f60110a != null) {
                    C22314ad.this.f60110a.onSuccess(enigmaResult);
                }
            }

            /* renamed from: a */
            public final void mo40443a(int i, int i2) {
                if (C22314ad.this.f60110a != null) {
                    C22314ad.this.f60110a.onFail(i);
                }
            }
        });
    }

    public final void setScanListener(OnEnigmaScanListener onEnigmaScanListener) {
        m55217a();
        this.f60110a = onEnigmaScanListener;
    }

    public final void zoomByRatio(float f) {
        if (this.f60112c != null) {
            this.f60112c.mo39720a(f);
        }
    }

    public final void enableCameraScan(boolean z, long j) {
        m55217a();
        this.f60111b.enableCameraScanWithRequirement(z, j);
    }

    public final void startPicScan(String str, ScanSettings scanSettings, long j) {
        m55217a();
        this.f60111b.startScan(str, scanSettings, j);
    }

    public final void startScan(Context context, C19264d dVar, SurfaceHolder surfaceHolder, ScanSettings scanSettings) {
        C39618d.m88216e();
        C50630ak.m109157a((C2592c) C48580c.m105110b().mo96136e());
        m55217a();
        this.f60111b.startScan(context, dVar, surfaceHolder, scanSettings);
    }
}
