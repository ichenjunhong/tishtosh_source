package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.senor;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.aweme.location.p1930a.C36254a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39640v;
import com.p683ss.android.ugc.aweme.port.p2082in.C39640v.C39641a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39640v.C39643c;
import com.p683ss.android.ugc.aweme.shortvideo.senor.BaseSenorPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.senor.C44510a;
import com.p683ss.android.vesdk.C50631al;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.senor.LandmarkARPresenter */
public final class LandmarkARPresenter extends BaseSenorPresenter {

    /* renamed from: b */
    static final /* synthetic */ C52767h[] f117362b = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LandmarkARPresenter.class), "holder", "getHolder()Lcom/ss/android/vesdk/VESensorInfoHolder;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(LandmarkARPresenter.class), "locationService", "getLocationService()Lcom/ss/android/ugc/aweme/port/in/IAVLocationService;"))};

    /* renamed from: c */
    private C46512a f117363c;

    /* renamed from: d */
    private boolean f117364d;

    /* renamed from: e */
    private final C52668f f117365e = C52732g.m112285a(C46513b.f117372a);

    /* renamed from: f */
    private final C52668f f117366f = C52732g.m112285a(C46514c.f117373a);

    /* renamed from: g */
    private final C20426a f117367g;

    /* renamed from: h */
    private final C20457b f117368h;

    /* renamed from: i */
    private final boolean f117369i;

    /* renamed from: j */
    private final boolean f117370j;

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.senor.LandmarkARPresenter$a */
    static final class C46512a extends C44510a {

        /* renamed from: b */
        private final C50631al f117371b;

        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            C52711k.m112240b(sensorEvent, "event");
            double a = m97398a(sensorEvent);
            if (this.f112621a) {
                this.f117371b.mo98908a(sensorEvent.values, a);
            }
        }

        public C46512a(C20426a aVar, boolean z, C50631al alVar) {
            C52711k.m112240b(aVar, "mediaController");
            C52711k.m112240b(alVar, "holder");
            super(z);
            this.f117371b = alVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.senor.LandmarkARPresenter$b */
    static final class C46513b extends C52712l implements C52670a<C50631al> {

        /* renamed from: a */
        public static final C46513b f117372a = new C46513b();

        C46513b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C50631al.m109175a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.senor.LandmarkARPresenter$c */
    static final class C46514c extends C52712l implements C52670a<C39640v> {

        /* renamed from: a */
        public static final C46514c f117373a = new C46514c();

        C46514c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C39629l.m88232a().mo58590u();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.senor.LandmarkARPresenter$d */
    static final class C46515d extends C52712l implements C52671b<float[], C52860x> {

        /* renamed from: a */
        final /* synthetic */ LandmarkARPresenter f117374a;

        C46515d(LandmarkARPresenter landmarkARPresenter) {
            this.f117374a = landmarkARPresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            float[] fArr = (float[]) obj;
            C52711k.m112240b(fArr, "fovAngle");
            this.f117374a.mo93265e().f126926h = fArr;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.senor.LandmarkARPresenter$e */
    static final class C46516e implements C39643c {

        /* renamed from: a */
        final /* synthetic */ LandmarkARPresenter f117375a;

        C46516e(LandmarkARPresenter landmarkARPresenter) {
            this.f117375a = landmarkARPresenter;
        }

        /* renamed from: a */
        public final void mo80714a(C36254a aVar) {
            this.f117375a.mo93265e().mo98907a((float) aVar.getLatitude(), (float) aVar.getLongitude(), aVar.getAccuracy(), C44510a.m97399a(Long.valueOf(aVar.getLocateTime())));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.senor.LandmarkARPresenter$f */
    public static final class C46517f implements C39641a {

        /* renamed from: a */
        final /* synthetic */ LandmarkARPresenter f117376a;

        C46517f(LandmarkARPresenter landmarkARPresenter) {
            this.f117376a = landmarkARPresenter;
        }

        /* renamed from: a */
        public final void mo80713a(float f) {
            this.f117376a.mo93265e().f126924f = f;
        }
    }

    /* renamed from: f */
    private final C39640v m100962f() {
        return (C39640v) this.f117366f.getValue();
    }

    /* renamed from: e */
    public final C50631al mo93265e() {
        return (C50631al) this.f117365e.getValue();
    }

    public final void unRegister() {
        super.unRegister();
        mo93265e().f126927i = false;
        if (this.f117364d) {
            m100962f().mo74221b(mo90415d());
            m100962f().mo74223c(mo90415d());
        }
    }

    /* renamed from: a */
    public final void mo90408a() {
        Sensor sensor;
        super.mo90408a();
        if (VERSION.SDK_INT >= 18) {
            sensor = mo90414c().getDefaultSensor(15);
        } else {
            sensor = null;
        }
        if (sensor == null) {
            sensor = mo90414c().getDefaultSensor(11);
        }
        if (sensor != null) {
            mo93265e().f126927i = true;
            this.f117368h.mo43349a((C52671b<? super float[], C52860x>) new C46515d<Object,C52860x>(this));
            if (this.f117370j) {
                this.f117364d = m100962f().mo74224d();
                this.f117367g.mo43311d(this.f117364d);
                if (this.f117364d) {
                    m100962f().mo74216a(mo90415d(), 3, new C46516e(this));
                    m100962f().mo74217a(mo90415d(), (C39641a) new C46517f(this));
                }
            } else {
                this.f117367g.mo43311d(false);
            }
            this.f117363c = new C46512a(this.f117367g, this.f117369i, mo93265e());
            SensorManager c = mo90414c();
            if (c == null) {
                C52711k.m112234a();
            }
            c.registerListener(this.f117363c, sensor, mo90412b(sensor.getType(), 0));
            mo90410a((C44510a) this.f117363c);
        }
    }

    public LandmarkARPresenter(Context context, C0184k kVar, C20426a aVar, C20457b bVar, boolean z, boolean z2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(aVar, "mediaController");
        C52711k.m112240b(bVar, "cameraService");
        super(context, kVar);
        this.f117367g = aVar;
        this.f117368h = bVar;
        this.f117369i = z;
        this.f117370j = z2;
    }
}
