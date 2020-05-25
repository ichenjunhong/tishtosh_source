package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.medialib.camera.C19268f.C19269a;
import com.p683ss.android.medialib.camera.C19274g.C19279a;
import com.p683ss.android.medialib.presenter.C19358a;
import com.p683ss.android.ugc.asve.recorder.camera.C20463c;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20661aa;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c.C20668a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20676f;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20700n;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20703o;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20712r;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20718t;
import com.p683ss.android.vesdk.C50601ah.C50625m;
import java.util.Collection;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.b */
public final class C20600b {

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$a */
    public static final class C20601a implements C19263c {

        /* renamed from: a */
        final /* synthetic */ C20667c f56453a;

        C20601a(C20667c cVar) {
            this.f56453a = cVar;
        }

        /* renamed from: a */
        public final void mo39670a(int i) {
            this.f56453a.mo43764a(i);
        }

        /* renamed from: a */
        public final void mo39671a(int i, int i2, String str) {
            this.f56453a.mo43765a(i, i2, str);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$b */
    public static final class C20602b implements C19358a {

        /* renamed from: a */
        final /* synthetic */ C20676f f56454a;

        public C20602b(C20676f fVar) {
            this.f56454a = fVar;
        }

        /* renamed from: b */
        public final void mo40235b(int i, int i2) {
            this.f56454a.mo43766a(i, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$c */
    public static final class C20603c implements C20463c {

        /* renamed from: a */
        final /* synthetic */ C20703o f56455a;

        public C20603c(C20703o oVar) {
            this.f56455a = oVar;
        }

        /* renamed from: a */
        public final void mo43414a(int i, float f, boolean z) {
            this.f56455a.mo43746a(i, f, z);
        }

        /* renamed from: a */
        public final void mo43415a(int i, boolean z, boolean z2, float f, List<Integer> list) {
            int[] iArr;
            C20703o oVar = this.f56455a;
            if (list != null) {
                iArr = C52575l.m112134c((Collection<Integer>) list);
            } else {
                iArr = null;
            }
            oVar.mo43747a(i, z, z2, f, iArr);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$d */
    public static final class C20604d extends C52712l implements C52671b<float[], C52860x> {

        /* renamed from: a */
        final /* synthetic */ C20712r f56456a;

        public C20604d(C20712r rVar) {
            this.f56456a = rVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            float[] fArr = (float[]) obj;
            C52711k.m112240b(fArr, "result");
            this.f56456a.mo43849a(fArr);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$e */
    public static final class C20605e implements C19279a {

        /* renamed from: a */
        final /* synthetic */ C20718t f56457a;

        public C20605e(C20718t tVar) {
            this.f56457a = tVar;
        }

        /* renamed from: a */
        public final void mo39748a() {
            this.f56457a.mo43776a();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$f */
    public static final class C20606f implements C19269a {

        /* renamed from: a */
        final /* synthetic */ C20700n f56458a;

        public C20606f(C20700n nVar) {
            this.f56458a = nVar;
        }

        /* renamed from: a */
        public final void mo39714a() {
            this.f56458a.mo43763a();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.b$g */
    public static final class C20607g implements C50625m {

        /* renamed from: a */
        final /* synthetic */ C20661aa f56459a;

        public C20607g(C20661aa aaVar) {
            this.f56459a = aaVar;
        }

        /* renamed from: a */
        public final void mo43397a(int i, float f) {
            this.f56459a.mo43744a(i, f);
        }
    }

    /* renamed from: a */
    public static final C19263c m51918a(C20667c cVar) {
        C52711k.m112240b(cVar, "$this$proxy");
        return new C20601a(cVar);
    }

    /* renamed from: a */
    public static final C20668a m51919a(C19263c cVar) {
        C52711k.m112240b(cVar, "$this$stub");
        return new C20631h(cVar);
    }
}
