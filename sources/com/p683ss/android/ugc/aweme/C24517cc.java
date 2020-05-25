package com.p683ss.android.ugc.aweme;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.bef.effectsdk.C2592c;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.medialib.camera.C19264d;
import com.p683ss.android.medialib.model.EnigmaResult;
import com.p683ss.android.medialib.p1185qr.ScanSettings;
import com.p683ss.android.ugc.asve.context.C20353a;
import com.p683ss.android.ugc.asve.context.C20354b;
import com.p683ss.android.ugc.asve.context.C20355c;
import com.p683ss.android.ugc.asve.p1238b.C20331k;
import com.p683ss.android.ugc.asve.p1240d.C20372b.C20374b;
import com.p683ss.android.ugc.asve.recorder.C20420b;
import com.p683ss.android.ugc.asve.recorder.C20420b.C20421a;
import com.p683ss.android.ugc.asve.sandbox.C20809p;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.p683ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.OnEnigmaScanListener;
import com.p683ss.android.ugc.aweme.shortvideo.C43854fw;
import com.p683ss.android.ugc.effectmanager.C48580c;
import com.p683ss.android.vesdk.C50630ak;
import com.p683ss.android.vesdk.VECameraSettings.CAMERA_FLASH_MODE;

/* renamed from: com.ss.android.ugc.aweme.cc */
public final class C24517cc implements IQRCodeScanner {

    /* renamed from: a */
    public C20420b f64936a;

    /* renamed from: b */
    public OnEnigmaScanListener f64937b;

    public final void release() {
        if (this.f64936a != null) {
            this.f64936a.mo43259g().mo43202c();
        }
    }

    public final void stop() {
        if (this.f64936a != null) {
            this.f64936a.mo43259g().mo43201b();
        }
    }

    public final void stopPicScan() {
        if (this.f64936a != null) {
            this.f64936a.mo43259g().mo43193a();
        }
    }

    public final void closeLight() {
        if (this.f64936a != null) {
            this.f64936a.mo43253b().mo43354b(CAMERA_FLASH_MODE.CAMERA_FLASH_OFF.ordinal());
        }
    }

    public final void openLight() {
        if (this.f64936a != null) {
            this.f64936a.mo43253b().mo43354b(CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH.ordinal());
        }
    }

    public final void pauseEffectAudio(boolean z) {
        this.f64936a.mo43259g().mo43199a(z);
    }

    public final void zoomByRatio(float f) {
        if (this.f64936a != null) {
            this.f64936a.mo43253b().mo43364c(f);
        }
    }

    public final void setScanListener(OnEnigmaScanListener onEnigmaScanListener) {
        this.f64937b = onEnigmaScanListener;
        if (this.f64936a != null) {
            this.f64936a.mo43259g().mo43196a((C20374b) new C20374b() {
                /* renamed from: a */
                public final void mo43203a(int i) {
                    if (C24517cc.this.f64937b != null) {
                        C24517cc.this.f64937b.onFail(i);
                    }
                }

                /* renamed from: a */
                public final void mo43204a(EnigmaResult enigmaResult) {
                    if (C24517cc.this.f64937b != null) {
                        C24517cc.this.f64937b.onSuccess(enigmaResult);
                    }
                }
            });
        }
    }

    public final void enableCameraScan(boolean z, long j) {
        if (this.f64936a != null) {
            this.f64936a.mo43259g().mo43200a(z, j);
        }
    }

    public final void processTouchEvent(float f, float f2) {
        this.f64936a.mo43259g().mo43194a(f, f2);
    }

    public C24517cc(Context context, final SurfaceHolder surfaceHolder) {
        new C43854fw();
        C39618d.m88210a(C43854fw.m96287a());
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        fragmentActivity.getClass();
        this.f64936a = C20421a.m50673a(new C24523cd(fragmentActivity), new C20354b() {
            /* renamed from: b */
            public final boolean mo43118b() {
                return true;
            }

            /* renamed from: c */
            public final SurfaceHolder mo43119c() {
                return surfaceHolder;
            }

            /* renamed from: n */
            public final boolean mo43130n() {
                return false;
            }

            /* renamed from: o */
            public final C20809p mo43131o() {
                return null;
            }

            /* renamed from: a */
            public final Boolean mo43117a() {
                return Boolean.valueOf(true);
            }

            /* renamed from: m */
            public final C20355c mo43129m() {
                return new C20353a() {
                    /* renamed from: a */
                    public final C20331k mo43109a() {
                        return C20331k.AS_CAMERA_LENS_BACK;
                    }

                    /* renamed from: f */
                    public final boolean mo43114f() {
                        return false;
                    }
                };
            }
        });
        this.f64936a.mo43253b().mo43342a((C19263c) new C19263c() {
            /* renamed from: a */
            public final void mo39670a(int i) {
            }

            /* renamed from: a */
            public final void mo39671a(int i, int i2, String str) {
                if (C24517cc.this.f64937b != null) {
                    C24517cc.this.f64937b.onFail(-1000);
                }
            }
        });
        surfaceHolder.addCallback(new Callback() {
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                if (C24517cc.this.f64936a != null) {
                    C24517cc.this.f64936a.mo43253b().mo43355b(C20331k.AS_CAMERA_LENS_BACK.ordinal(), null);
                }
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (C24517cc.this.f64936a != null) {
                    C24517cc.this.f64936a.mo43253b().mo43375l();
                }
            }
        });
        if (surfaceHolder.getSurface() != null && surfaceHolder.getSurface().isValid() && this.f64936a != null) {
            this.f64936a.mo43253b().mo43355b(C20331k.AS_CAMERA_LENS_BACK.ordinal(), null);
        }
    }

    public final void startPicScan(String str, ScanSettings scanSettings, long j) {
        if (this.f64936a != null) {
            this.f64936a.mo43259g().mo43198a(str, scanSettings, j);
        }
    }

    public final void switchEffectWithTag(String str, int i, int i2, String str2) {
        this.f64936a.mo43259g().mo43197a(str, i, i2, str2);
    }

    public final void startScan(Context context, C19264d dVar, SurfaceHolder surfaceHolder, ScanSettings scanSettings) {
        C39618d.m88216e();
        C50630ak.m109157a((C2592c) C48580c.m105110b().mo96136e());
        if (this.f64936a != null) {
            this.f64936a.mo43259g().mo43195a(scanSettings.detectRectLeft, scanSettings.detectRectTop, scanSettings.detectRectWidth, scanSettings.detectRectHeight);
        }
    }
}
