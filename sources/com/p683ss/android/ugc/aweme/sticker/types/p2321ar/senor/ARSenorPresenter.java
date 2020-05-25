package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.senor;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.hardware.Sensor;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.shortvideo.senor.BaseSenorPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.senor.C44510a;
import com.p683ss.android.ugc.aweme.shortvideo.senor.defult.C44511a;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.senor.ARSenorPresenter */
public class ARSenorPresenter extends BaseSenorPresenter {

    /* renamed from: b */
    private C44511a f117358b;

    /* renamed from: c */
    private final C20457b f117359c;

    /* renamed from: d */
    private final C20489b f117360d;

    /* renamed from: e */
    private boolean f117361e;

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
    }

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
    }

    public void unRegister() {
        super.unRegister();
        if (this.f117358b != null) {
            this.f117358b.disable();
        }
    }

    /* renamed from: a */
    public final void mo90408a() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        super.mo90408a();
        C20489b bVar = this.f117360d;
        Sensor defaultSensor = mo90414c().getDefaultSensor(1);
        if (defaultSensor == null) {
            z = false;
        } else {
            C46518a aVar = new C46518a(this.f117360d, this.f117361e);
            mo90414c().registerListener(aVar, defaultSensor, mo90412b(defaultSensor.getType(), 0));
            mo90410a((C44510a) aVar);
            z = true;
        }
        Sensor defaultSensor2 = mo90414c().getDefaultSensor(4);
        if (defaultSensor2 == null) {
            z2 = false;
        } else {
            C46520c cVar = new C46520c(this.f117360d, this.f117361e);
            mo90414c().registerListener(cVar, defaultSensor2, mo90412b(defaultSensor2.getType(), 0));
            mo90410a((C44510a) cVar);
            z2 = true;
        }
        Sensor defaultSensor3 = mo90414c().getDefaultSensor(9);
        if (defaultSensor3 == null) {
            this.f117358b = new C44511a(mo90415d(), this.f117359c);
            this.f117358b.enable();
            z3 = false;
        } else {
            C46519b bVar2 = new C46519b(this.f117360d, this.f117361e);
            mo90414c().registerListener(bVar2, defaultSensor3, mo90412b(defaultSensor3.getType(), 0));
            mo90410a((C44510a) bVar2);
            z3 = true;
        }
        Sensor sensor = null;
        if (VERSION.SDK_INT >= 18) {
            sensor = mo90414c().getDefaultSensor(15);
        }
        if (sensor == null) {
            sensor = mo90414c().getDefaultSensor(11);
            if (sensor == null) {
                z4 = false;
                bVar.mo43480a(false, 0, z, z2, z3, z4, "");
            }
        }
        C46521d dVar = new C46521d(mo90414c(), this.f117360d, this.f117361e);
        mo90414c().registerListener(dVar, sensor, mo90412b(sensor.getType(), 0));
        mo90410a((C44510a) dVar);
        z4 = true;
        bVar.mo43480a(false, 0, z, z2, z3, z4, "");
    }

    public ARSenorPresenter(Context context, C0184k kVar, C20457b bVar, C20489b bVar2, boolean z) {
        super(context, kVar);
        this.f117360d = bVar2;
        this.f117359c = bVar;
        this.f117361e = z;
    }
}
