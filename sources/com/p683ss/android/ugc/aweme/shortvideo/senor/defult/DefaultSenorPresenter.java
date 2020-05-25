package com.p683ss.android.ugc.aweme.shortvideo.senor.defult;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.hardware.Sensor;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.senor.BaseSenorPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.senor.C44510a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.senor.defult.DefaultSenorPresenter */
public class DefaultSenorPresenter extends BaseSenorPresenter {

    /* renamed from: b */
    private C44511a f112622b;

    /* renamed from: c */
    private C20457b f112623c;

    /* renamed from: d */
    private boolean f112624d;

    public void unRegister() {
        super.unRegister();
        if (this.f112622b != null) {
            this.f112622b.disable();
        }
    }

    /* renamed from: a */
    public final void mo90408a() {
        super.mo90408a();
        Sensor defaultSensor = mo90414c().getDefaultSensor(9);
        if (defaultSensor == null) {
            this.f112622b = new C44511a(mo90415d(), this.f112623c);
            this.f112622b.enable();
        } else {
            C44512b bVar = new C44512b(this.f112623c, this.f112624d);
            mo90414c().registerListener(bVar, defaultSensor, mo90412b(defaultSensor.getType(), 100000));
            mo90410a((C44510a) bVar);
        }
        Sensor sensor = null;
        if (VERSION.SDK_INT >= 18 && C39629l.m88232a().mo58574e().mo83117a(C40796a.EnableUseGameRotationSensor)) {
            sensor = mo90414c().getDefaultSensor(15);
        }
        if (sensor == null) {
            sensor = mo90414c().getDefaultSensor(11);
        }
        if (sensor != null) {
            C44513c cVar = new C44513c(this.f112623c, this.f112624d);
            mo90414c().registerListener(cVar, sensor, mo90412b(sensor.getType(), 100000));
            mo90410a((C44510a) cVar);
        }
    }

    public DefaultSenorPresenter(Context context, C0184k kVar, C20457b bVar, boolean z) {
        super(context, kVar);
        this.f112623c = bVar;
        this.f112624d = z;
    }
}
