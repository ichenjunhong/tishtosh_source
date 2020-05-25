package com.p683ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import android.hardware.SensorManager;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.common.C26858d;
import com.p683ss.android.ugc.aweme.common.C26858d.C26860b;
import com.p683ss.android.ugc.aweme.common.C26913l;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoService;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.main.C36553cd;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.legoImp.service.DouDouService */
public class DouDouService implements LegoService {
    private C26858d douDetector;
    public C35919a listener;
    private C26860b onDouListener;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.DouDouService$EnsureDouDetectorTask */
    class EnsureDouDetectorTask implements LegoTask {
        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BACKGROUND;
        }

        EnsureDouDetectorTask() {
        }

        public void run(Context context) {
            C32458a.m75144a("EnsureDouDetectorTask");
            if (DouDouService.this.switchDouDetectorBySetting(context)) {
                DouDouService.this.onResume();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.DouDouService$a */
    public interface C35919a {
        /* renamed from: a */
        boolean mo74598a();
    }

    public void init(Context context) {
    }

    public C35898h type() {
        return C35898h.BACKGROUND;
    }

    public void onDestroy() {
        if (this.listener != null) {
            this.listener = null;
        }
        if (this.onDouListener != null) {
            this.onDouListener = null;
        }
    }

    public void onPause() {
        if (this.douDetector != null) {
            this.douDetector.mo54814b();
        }
    }

    public void ensureDouDetector() {
        C35857a.m81001b().mo74526a(new EnsureDouDetectorTask()).mo74527a();
    }

    public void onResume() {
        if (this.douDetector != null) {
            C26858d dVar = this.douDetector;
            if (dVar.f70707c != null) {
                SensorManager sensorManager = dVar.f70706b;
                if (sensorManager != null) {
                    sensorManager.registerListener(dVar, dVar.f70707c, 2);
                }
                dVar.mo54813a();
                C26913l lVar = dVar.f70709e;
                if (lVar != null) {
                    lVar.mo54868a();
                }
            }
        }
    }

    public void setDouDouListener(C35919a aVar) {
        this.listener = aVar;
    }

    public void enableDouDetection(boolean z) {
        if (this.douDetector != null) {
            this.douDetector.f70705a = z;
        }
    }

    private void initDouDetectorAndActivityMonitor(final Context context) {
        if (this.onDouListener == null) {
            this.onDouListener = new C26860b() {
                /* renamed from: b */
                public final void mo54819b() {
                    DouDouService.this.switchDouDetectorBySetting(context);
                }

                /* renamed from: a */
                public final boolean mo54818a() {
                    if (!DouDouService.this.switchDouDetectorBySetting(context) || DouDouService.this.listener == null) {
                        return false;
                    }
                    return DouDouService.this.listener.mo74598a();
                }
            };
        }
        this.douDetector = new C26858d(context, this.onDouListener);
    }

    public boolean switchDouDetectorBySetting(Context context) {
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().configService().storySettingDoudouSwitch() && !C36553cd.m82449e()) {
            TimeLockRuler.isTeenModeON();
        }
        if (this.douDetector != null) {
            this.douDetector.mo54814b();
            this.douDetector = null;
        }
        return false;
    }
}
