package com.p683ss.android.ugc.asve.recorder.view;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.medialib.camera.C19274g.C19279a;
import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.medialib.presenter.C19358a;
import com.p683ss.android.ugc.asve.context.C20355c;
import com.p683ss.android.ugc.asve.context.C20357d;
import com.p683ss.android.ugc.asve.context.C20361f;
import com.p683ss.android.ugc.asve.context.C20362g;
import com.p683ss.android.ugc.asve.context.C20363h;
import com.p683ss.android.ugc.asve.p1238b.C20318a;
import com.p683ss.android.ugc.asve.p1238b.C20323e;
import com.p683ss.android.ugc.asve.p1238b.C20331k;
import com.p683ss.android.ugc.asve.recorder.C20420b;
import com.p683ss.android.ugc.asve.recorder.C20420b.C20422b;
import com.p683ss.android.ugc.asve.recorder.C20439c;
import com.p683ss.android.ugc.asve.recorder.C20504f;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;
import com.p683ss.android.ugc.asve.recorder.camera.p1247b.C20461b;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p683ss.android.ugc.asve.recorder.reaction.p1249a.C20536b;
import com.p683ss.android.ugc.asve.sandbox.C20809p;
import com.p683ss.android.vesdk.C50601ah.C50616e;
import com.p683ss.android.vesdk.C50601ah.C50625m;
import com.p683ss.android.vesdk.runtime.C50771d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import org.libsdl.app.AudioRecorderInterface;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView */
public final class ASCameraView extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56314a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ASCameraView.class), "effectController", "getEffectController()Lcom/ss/android/ugc/asve/recorder/effect/IEffectController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ASCameraView.class), "cameraController", "getCameraController()Lcom/ss/android/ugc/asve/recorder/camera/ICameraController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ASCameraView.class), "mediaController", "getMediaController()Lcom/ss/android/ugc/asve/recorder/media/IMediaController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ASCameraView.class), "attrsHelper", "getAttrsHelper()Lcom/ss/android/ugc/asve/recorder/view/ASCameraViewAttrsHelper;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ASCameraView.class), "touchHelper", "getTouchHelper()Lcom/ss/android/ugc/asve/recorder/view/ASCameraViewTouchHelper;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ASCameraView.class), "cameraViewHelper", "getCameraViewHelper$tools_asve_release()Lcom/ss/android/ugc/asve/recorder/camera/view/CameraViewHelper;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ASCameraView.class), "reactionViewHelper", "getReactionViewHelper$tools_asve_release()Lcom/ss/android/ugc/asve/recorder/reaction/view/ReactionViewHelper;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ASCameraView.class), "gestureDispatcher", "getGestureDispatcher()Lcom/ss/android/ugc/asve/recorder/view/GestureDispatcher;"))};

    /* renamed from: b */
    public C0184k f56315b;

    /* renamed from: c */
    public TextureView f56316c;

    /* renamed from: d */
    public View f56317d;

    /* renamed from: e */
    public C20420b f56318e;

    /* renamed from: f */
    public final List<C52686q<Integer, Integer, String, C52860x>> f56319f;

    /* renamed from: g */
    public final C52686q<Integer, Integer, String, C52860x> f56320g;

    /* renamed from: h */
    private SurfaceView f56321h;

    /* renamed from: i */
    private final C52668f f56322i;

    /* renamed from: j */
    private final C52668f f56323j;

    /* renamed from: k */
    private final C52668f f56324k;

    /* renamed from: l */
    private final C20422b f56325l;

    /* renamed from: m */
    private final C52668f f56326m;

    /* renamed from: n */
    private final C52668f f56327n;

    /* renamed from: o */
    private final C20439c f56328o;

    /* renamed from: p */
    private final C52668f f56329p;

    /* renamed from: q */
    private final C52668f f56330q;

    /* renamed from: r */
    private final C52668f f56331r;

    /* renamed from: s */
    private Runnable f56332s;

    /* renamed from: t */
    private String f56333t;

    /* renamed from: u */
    private String f56334u;

    /* renamed from: v */
    private String f56335v;

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$a */
    static final class C20548a extends C52712l implements C52670a<C20563a> {

        /* renamed from: a */
        final /* synthetic */ Context f56336a;

        C20548a(Context context) {
            this.f56336a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20563a(this.f56336a);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$b */
    static final class C20549b extends C52712l implements C52670a<C20567e> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56337a;

        C20549b(ASCameraView aSCameraView) {
            this.f56337a = aSCameraView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20567e(ASCameraView.m51567a(this.f56337a).mo43253b());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$c */
    static final class C20550c extends C52712l implements C52670a<C20461b> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56338a;

        /* renamed from: b */
        final /* synthetic */ Context f56339b;

        C20550c(ASCameraView aSCameraView, Context context) {
            this.f56338a = aSCameraView;
            this.f56339b = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20461b(this.f56339b, this.f56338a, ASCameraView.m51567a(this.f56338a).f55982d.mo43129m());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$d */
    static final class C20551d extends C52712l implements C52670a<C20568f> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56340a;

        C20551d(ASCameraView aSCameraView) {
            this.f56340a = aSCameraView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20568f(ASCameraView.m51567a(this.f56340a).mo43256d());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$e */
    static final class C20552e extends C52712l implements C52670a<C20569g> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56341a;

        C20552e(ASCameraView aSCameraView) {
            this.f56341a = aSCameraView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f56341a.getTouchHelper().f56369a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$f */
    public static final class C20553f implements SurfaceTextureListener {

        /* renamed from: a */
        final /* synthetic */ SurfaceTextureListener f56342a;

        /* renamed from: b */
        final /* synthetic */ C20420b f56343b;

        /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$f$a */
        static final class C20554a extends C52712l implements C52671b<Integer, C52860x> {

            /* renamed from: a */
            public static final C20554a f56344a = new C20554a();

            C20554a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$f$b */
        static final class C20555b extends C52712l implements C52671b<Integer, C52860x> {

            /* renamed from: a */
            public static final C20555b f56345a = new C20555b();

            C20555b() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return C52860x.f131107a;
            }
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            SurfaceTextureListener surfaceTextureListener = this.f56342a;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
            }
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f56343b.mo43257e().mo43306b((C52671b<? super Integer, C52860x>) C20555b.f56345a);
            SurfaceTextureListener surfaceTextureListener = this.f56342a;
            if (surfaceTextureListener != null) {
                return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
            }
            return true;
        }

        public C20553f(SurfaceTextureListener surfaceTextureListener, C20420b bVar) {
            this.f56342a = surfaceTextureListener;
            this.f56343b = bVar;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            SurfaceTextureListener surfaceTextureListener = this.f56342a;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
            }
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            SurfaceTextureListener surfaceTextureListener = this.f56342a;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
            Surface surface = new Surface(surfaceTexture);
            C20426a e = this.f56343b.mo43257e();
            String str = Build.DEVICE;
            C52711k.m112236a((Object) str, "Build.DEVICE");
            e.mo43292a(surface, str, (C52671b<? super Integer, C52860x>) C20554a.f56344a);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$g */
    static final class C20556g extends C52712l implements C52670a<C20570h> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56346a;

        C20556g(ASCameraView aSCameraView) {
            this.f56346a = aSCameraView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20570h(ASCameraView.m51567a(this.f56346a).mo43257e());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$h */
    static final class C20557h extends C52712l implements C52686q<Integer, Integer, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56347a;

        C20557h(ASCameraView aSCameraView) {
            this.f56347a = aSCameraView;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            String str = (String) obj3;
            for (C52686q invoke : this.f56347a.f56319f) {
                invoke.invoke(Integer.valueOf(intValue), Integer.valueOf(intValue2), str);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$i */
    static final class C20558i extends C52712l implements C52670a<C20536b> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56348a;

        C20558i(ASCameraView aSCameraView) {
            this.f56348a = aSCameraView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20536b(this.f56348a, this.f56348a.getPresentView(), ASCameraView.m51567a(this.f56348a).mo43258f());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$j */
    static final class C20559j extends C52712l implements C52670a<C20564b> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f56349a;

        /* renamed from: b */
        final /* synthetic */ Context f56350b;

        C20559j(ASCameraView aSCameraView, Context context) {
            this.f56349a = aSCameraView;
            this.f56350b = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20564b(this.f56350b, this.f56349a, ASCameraView.m51567a(this.f56349a));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$k */
    public static final class C20560k implements C20363h {

        /* renamed from: a */
        public final C20355c f56351a;

        /* renamed from: b */
        public final C20362g f56352b;

        /* renamed from: c */
        public final C20561a f56353c = new C20561a(this);

        /* renamed from: d */
        public final C20562b f56354d = new C20562b(this);

        /* renamed from: e */
        final /* synthetic */ ASCameraView f56355e;

        /* renamed from: f */
        final /* synthetic */ C20363h f56356f;

        /* renamed from: g */
        private final /* synthetic */ C20363h f56357g;

        /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$k$a */
        public static final class C20561a implements C20355c {

            /* renamed from: a */
            final /* synthetic */ C20560k f56358a;

            /* renamed from: b */
            private final int f56359b;

            /* renamed from: c */
            private final /* synthetic */ C20355c f56360c;

            /* renamed from: a */
            public final C20331k mo43109a() {
                return this.f56360c.mo43109a();
            }

            /* renamed from: b */
            public final C20323e mo43110b() {
                return this.f56360c.mo43110b();
            }

            /* renamed from: c */
            public final C20318a mo43111c() {
                return this.f56360c.mo43111c();
            }

            /* renamed from: d */
            public final boolean mo43112d() {
                return this.f56360c.mo43112d();
            }

            /* renamed from: e */
            public final byte mo43113e() {
                return this.f56360c.mo43113e();
            }

            /* renamed from: f */
            public final boolean mo43114f() {
                return this.f56360c.mo43114f();
            }

            /* renamed from: g */
            public final int mo43115g() {
                return this.f56359b;
            }

            /* renamed from: h */
            public final int[] mo43116h() {
                return this.f56360c.mo43116h();
            }

            C20561a(C20560k kVar) {
                int i;
                this.f56358a = kVar;
                this.f56360c = kVar.f56351a;
                if (kVar.f56351a.mo43115g() != 0) {
                    i = kVar.f56351a.mo43115g();
                } else {
                    i = kVar.f56355e.getAttrsHelper().f56365a;
                }
                this.f56359b = i;
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$k$b */
        public static final class C20562b implements C20362g {

            /* renamed from: a */
            final /* synthetic */ C20560k f56361a;

            /* renamed from: b */
            private final int f56362b;

            /* renamed from: c */
            private final int f56363c;

            /* renamed from: d */
            private final /* synthetic */ C20362g f56364d;

            /* renamed from: a */
            public final String mo43179a() {
                return this.f56364d.mo43179a();
            }

            /* renamed from: b */
            public final String mo43180b() {
                return this.f56364d.mo43180b();
            }

            /* renamed from: c */
            public final float mo43181c() {
                return this.f56364d.mo43181c();
            }

            /* renamed from: d */
            public final boolean mo43182d() {
                return this.f56364d.mo43182d();
            }

            /* renamed from: e */
            public final int mo43183e() {
                return this.f56362b;
            }

            /* renamed from: f */
            public final int mo43184f() {
                return this.f56363c;
            }

            /* renamed from: g */
            public final int mo43185g() {
                return this.f56364d.mo43185g();
            }

            C20562b(C20560k kVar) {
                int i;
                int i2;
                this.f56361a = kVar;
                this.f56364d = kVar.f56352b;
                if (kVar.f56352b.mo43183e() != 0) {
                    i = kVar.f56352b.mo43183e();
                } else {
                    i = kVar.f56355e.getAttrsHelper().f56366b;
                }
                this.f56362b = i;
                if (kVar.f56352b.mo43184f() != 0) {
                    i2 = kVar.f56352b.mo43184f();
                } else {
                    i2 = kVar.f56355e.getAttrsHelper().f56367c;
                }
                this.f56363c = i2;
            }
        }

        /* renamed from: a */
        public final Boolean mo43117a() {
            return this.f56357g.mo43117a();
        }

        /* renamed from: b */
        public final boolean mo43118b() {
            return this.f56357g.mo43118b();
        }

        /* renamed from: c */
        public final SurfaceHolder mo43119c() {
            return this.f56357g.mo43119c();
        }

        /* renamed from: d */
        public final C20504f mo43120d() {
            return this.f56357g.mo43120d();
        }

        /* renamed from: e */
        public final C52847n<Integer, Integer> mo43121e() {
            return this.f56357g.mo43121e();
        }

        /* renamed from: f */
        public final boolean mo43122f() {
            return this.f56357g.mo43122f();
        }

        /* renamed from: g */
        public final boolean mo43123g() {
            return this.f56357g.mo43123g();
        }

        /* renamed from: h */
        public final boolean mo43124h() {
            return this.f56357g.mo43124h();
        }

        /* renamed from: i */
        public final boolean mo43125i() {
            return this.f56357g.mo43125i();
        }

        /* renamed from: j */
        public final C20361f mo43126j() {
            return this.f56357g.mo43126j();
        }

        /* renamed from: l */
        public final C20357d mo43128l() {
            return this.f56357g.mo43128l();
        }

        /* renamed from: n */
        public final boolean mo43130n() {
            return this.f56357g.mo43130n();
        }

        /* renamed from: o */
        public final C20809p mo43131o() {
            return this.f56357g.mo43131o();
        }

        /* renamed from: p */
        public final boolean mo43132p() {
            return this.f56357g.mo43132p();
        }

        /* renamed from: q */
        public final boolean mo43133q() {
            return this.f56357g.mo43133q();
        }

        /* renamed from: r */
        public final boolean mo43134r() {
            return this.f56357g.mo43134r();
        }

        /* renamed from: s */
        public final long mo43135s() {
            return this.f56357g.mo43135s();
        }

        /* renamed from: k */
        public final /* bridge */ /* synthetic */ C20362g mo43127k() {
            return this.f56354d;
        }

        /* renamed from: m */
        public final /* bridge */ /* synthetic */ C20355c mo43129m() {
            return this.f56353c;
        }

        public C20560k(ASCameraView aSCameraView, C20363h hVar) {
            this.f56355e = aSCameraView;
            this.f56356f = hVar;
            this.f56357g = hVar;
            this.f56351a = hVar.mo43129m();
            this.f56352b = hVar.mo43127k();
        }
    }

    public ASCameraView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ASCameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C20563a getAttrsHelper() {
        return (C20563a) this.f56326m.getValue();
    }

    public final String getBeautyFaceRes() {
        return this.f56333t;
    }

    public final C20457b getCameraController() {
        return (C20457b) this.f56323j.getValue();
    }

    public final C20461b getCameraViewHelper$tools_asve_release() {
        return (C20461b) this.f56329p.getValue();
    }

    public final Runnable getDataSourceVideoCompleteListener() {
        return this.f56332s;
    }

    public final C20489b getEffectController() {
        return (C20489b) this.f56322i.getValue();
    }

    public final String getFaceMakeUpRes() {
        return this.f56335v;
    }

    public final C20569g getGestureDispatcher() {
        return (C20569g) this.f56331r.getValue();
    }

    public final C20426a getMediaController() {
        return (C20426a) this.f56324k.getValue();
    }

    public final C20422b getMode() {
        return this.f56325l;
    }

    public final C20536b getReactionViewHelper$tools_asve_release() {
        return (C20536b) this.f56330q.getValue();
    }

    public final String getReshapeRes() {
        return this.f56334u;
    }

    public final C20564b getTouchHelper() {
        return (C20564b) this.f56327n.getValue();
    }

    /* renamed from: a */
    public final void mo43631a(boolean z) {
        getTouchHelper().mo43403a(z);
    }

    /* renamed from: a */
    public final void mo43628a(C50771d dVar, String str) {
        C52711k.m112240b(dVar, "resManager");
        C52711k.m112240b(str, "workSpacePath");
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43250a(dVar, str);
    }

    /* renamed from: a */
    public final void mo43630a(String str, long j, long j2) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43257e().mo43297a(str, j, j2);
    }

    /* renamed from: a */
    public final void mo43629a(C52671b<? super Integer, C52860x> bVar) {
        C20420b bVar2 = this.f56318e;
        if (bVar2 == null) {
            C52711k.m112237a("recorder");
        }
        bVar2.mo43257e().mo43294a(bVar);
    }

    public final int getFPS() {
        return this.f56328o.f56013a;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m51568h();
    }

    public final C0184k getLifecycleOwner() {
        C0184k kVar = this.f56315b;
        if (kVar == null) {
            C52711k.m112237a("lifecycleOwner");
        }
        return kVar;
    }

    public final View getPresentView() {
        View view = this.f56317d;
        if (view == null) {
            C52711k.m112237a("presentView");
        }
        return view;
    }

    /* renamed from: e */
    public final void mo43639e() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43374k();
    }

    /* renamed from: f */
    public final void mo43641f() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43257e().mo43310d();
    }

    /* renamed from: g */
    public final boolean mo43642g() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43257e().mo43318h();
    }

    public final int getBackCameraPos() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43372i().mo43432c();
    }

    public final int getCameraPosition() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43365d();
    }

    public final int getCameraPreviewHeight() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43369f();
    }

    public final int getCameraPreviewWidth() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43367e();
    }

    public final List<Integer> getCameraZoomList() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43373j();
    }

    public final int getCurrentCameraType() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43361c();
    }

    public final long getEndFrameTimeUS() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43257e().mo43316g();
    }

    public final int getFlashMode() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43378o();
    }

    public final int getFrontCameraPos() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43372i().mo43434d();
    }

    public final float getMaxCameraZoom() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43370g();
    }

    public final int getNextFlashMode() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43383p();
    }

    public final int[] getReactionCameraPosInViewPixel() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43258f().mo43575d();
    }

    public final int[] getReactionPosMarginInViewPixel() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43258f().mo43574c();
    }

    public final ReactionWindowInfo getReactionWindowInfo() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43258f().mo43577f();
    }

    public final long getSegmentAudioLength() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43257e().mo43322l();
    }

    public final int getWideStatus() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43372i().mo43425a();
    }

    /* renamed from: a */
    public final void mo43621a() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43375l();
    }

    /* renamed from: b */
    public final boolean mo43634b() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43387t();
    }

    /* renamed from: c */
    public final boolean mo43636c() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43388u();
    }

    /* renamed from: d */
    public final boolean mo43638d() {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43377n();
    }

    public final float[] getSuggestVolume() {
        if (this.f56318e == null) {
            return new float[]{1.0f, 1.0f};
        }
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43257e().mo43333w();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        m51568h();
        if (this.f56316c == null && this.f56321h == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View view = this.f56316c;
            if (view == null) {
                view = this.f56321h;
            }
            View view2 = view;
            if (view2 != null) {
                this.f56317d = view2;
                return;
            }
            throw new IllegalStateException("no present view!");
        }
        throw new IllegalStateException("ASCameraView must contain one SurfaceView or TextureView at least!".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0035  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m51568h() {
        /*
            r6 = this;
            android.view.TextureView r0 = r6.f56316c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r6.getChildCount()
            r1 = 0
            r2 = 0
            if (r0 <= 0) goto L_0x0020
            int r0 = r6.getChildCount()
            r3 = 0
        L_0x0012:
            if (r3 >= r0) goto L_0x0020
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof android.view.TextureView
            if (r5 == 0) goto L_0x001d
            goto L_0x0021
        L_0x001d:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0020:
            r4 = r1
        L_0x0021:
            android.view.TextureView r4 = (android.view.TextureView) r4
            r6.f56316c = r4
            android.view.TextureView r0 = r6.f56316c
            if (r0 == 0) goto L_0x002a
            return
        L_0x002a:
            android.view.SurfaceView r0 = r6.f56321h
            if (r0 == 0) goto L_0x002f
            return
        L_0x002f:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L_0x0048
            int r0 = r6.getChildCount()
        L_0x0039:
            if (r2 >= r0) goto L_0x0048
            android.view.View r3 = r6.getChildAt(r2)
            boolean r4 = r3 instanceof android.view.SurfaceView
            if (r4 == 0) goto L_0x0045
            r1 = r3
            goto L_0x0048
        L_0x0045:
            int r2 = r2 + 1
            goto L_0x0039
        L_0x0048:
            android.view.SurfaceView r1 = (android.view.SurfaceView) r1
            r6.f56321h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.asve.recorder.view.ASCameraView.m51568h():void");
    }

    public final void setBeautyFaceRes(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f56333t = str;
    }

    public final void setFaceMakeUpRes(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f56335v = str;
    }

    public final void setLifecycleOwner(C0184k kVar) {
        C52711k.m112240b(kVar, "<set-?>");
        this.f56315b = kVar;
    }

    public final void setReshapeRes(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f56334u = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C20420b m51567a(ASCameraView aSCameraView) {
        C20420b bVar = aSCameraView.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "event");
        getTouchHelper().mo43402a(motionEvent);
        return true;
    }

    public final void setOnFrameAvailableListener(C50616e eVar) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43249a(eVar);
    }

    /* renamed from: b */
    public final void mo43633b(boolean z) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43257e().mo43309c(z);
    }

    /* renamed from: c */
    public final void mo43635c(boolean z) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43257e().mo43315f(z);
    }

    /* renamed from: d */
    public final void mo43637d(boolean z) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43256d().mo43529g(z);
    }

    public final void setBeautyFaceWhiteIntensity(float f) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43256d().mo43489b(f);
    }

    public final void setBodyBeautyLevel(int i) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43340a(i);
    }

    public final void setCameraPreviewSizeInterface(C19358a aVar) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43345a(aVar);
    }

    public final void setDataSourceVideoCompleteListener(Runnable runnable) {
        if (this.f56318e != null) {
            C20420b bVar = this.f56318e;
            if (bVar == null) {
                C52711k.m112237a("recorder");
            }
            bVar.mo43255c().mo43268a(runnable);
        }
    }

    public final void setDetectInterval(int i) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43256d().mo43503c(i);
    }

    public final void setDetectionMode(boolean z) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43256d().mo43479a(z);
    }

    public final void setDuetSupportChangeLayout(boolean z) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43255c().mo43274d(z);
    }

    public final void setFilter(String str) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43256d().mo43528g(str);
    }

    public final void setHandDetectLowpower(boolean z) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43256d().mo43498b(z);
    }

    public final void setMusicPath(String str) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43257e().mo43295a(str);
    }

    public final void setNextCameraMode(int i) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43362c(i);
    }

    public final void setOnFirstFrameRefreshListener(C19279a aVar) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43344a(aVar);
    }

    public final void setPreviewSizeRatio(float f) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43257e().mo43288a(f);
    }

    public final void setSATZoomListener(C50625m mVar) {
        if (this.f56318e != null) {
            C20420b bVar = this.f56318e;
            if (bVar == null) {
                C52711k.m112237a("recorder");
            }
            bVar.mo43253b().mo43348a(mVar);
        }
    }

    public final void setVideoQuality(int i) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43257e().mo43290a(i);
    }

    /* renamed from: e */
    public final void mo43640e(boolean z) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43256d().mo43526f(z);
    }

    /* renamed from: a */
    public final void mo43622a(float f) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43258f().mo43570a(f);
    }

    /* renamed from: a */
    public final void mo43623a(int i) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43354b(i);
    }

    /* renamed from: a */
    public final void mo43627a(C19233b bVar) {
        C52711k.m112240b(bVar, "listener");
        if (this.f56318e != null) {
            C20420b bVar2 = this.f56318e;
            if (bVar2 == null) {
                C52711k.m112237a("recorder");
            }
            bVar2.mo43254b(bVar);
        }
    }

    /* renamed from: a */
    public final void mo43624a(int i, int i2) {
        getCameraViewHelper$tools_asve_release().mo43412a(i, i2);
    }

    /* renamed from: a */
    public final int mo43620a(Context context, AudioRecorderInterface audioRecorderInterface) {
        C52711k.m112240b(context, "context");
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43257e().mo43281a(context, audioRecorderInterface);
    }

    /* renamed from: a */
    public final void mo43626a(int i, C19263c cVar) {
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43355b(i, cVar);
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        m51568h();
    }

    public ASCameraView(Context context, AttributeSet attributeSet, int i) {
        C20422b bVar;
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f56322i = C52732g.m112285a(new C20551d(this));
        this.f56323j = C52732g.m112285a(new C20549b(this));
        this.f56324k = C52732g.m112285a(new C20556g(this));
        if (this.f56318e != null) {
            C20420b bVar2 = this.f56318e;
            if (bVar2 == null) {
                C52711k.m112237a("recorder");
            }
            bVar = bVar2.f55979a;
        } else {
            bVar = C20422b.CUSTOM;
        }
        this.f56325l = bVar;
        this.f56326m = C52732g.m112285a(new C20548a(context));
        this.f56327n = C52732g.m112285a(new C20559j(this, context));
        this.f56328o = new C20439c();
        this.f56329p = C52732g.m112285a(new C20550c(this, context));
        this.f56330q = C52732g.m112285a(new C20558i(this));
        List<C52686q<Integer, Integer, String, C52860x>> arrayList = new ArrayList<>();
        arrayList.add(this.f56328o);
        this.f56319f = arrayList;
        this.f56320g = new C20557h(this);
        C20563a attrsHelper = getAttrsHelper();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = attrsHelper.f56368d.obtainStyledAttributes(attributeSet, new int[]{R.attr.acd, R.attr.adb, R.attr.adc});
            attrsHelper.f56365a = obtainStyledAttributes.getResourceId(0, 0);
            attrsHelper.f56366b = obtainStyledAttributes.getResourceId(2, 0);
            attrsHelper.f56367c = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
        this.f56331r = C52732g.m112285a(new C20552e(this));
        this.f56333t = "";
        this.f56334u = "";
        this.f56335v = "";
    }

    /* renamed from: a */
    public final void mo43625a(int i, long j, long j2, String str) {
        C52711k.m112240b(str, "msg");
        C20420b bVar = this.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43256d().mo43456a(i, j, j2, str);
    }

    public /* synthetic */ ASCameraView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
