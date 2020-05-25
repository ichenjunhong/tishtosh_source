package com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.C2759d;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2763g;
import com.bytedance.als.C2764h;
import com.bytedance.als.C2765i;
import com.bytedance.als.C2766j;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.p780m.C12356a;
import com.bytedance.p780m.C12361b;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.medialib.p1181c.C19233b;
import com.p683ss.android.ugc.asve.p1241e.C20391c;
import com.p683ss.android.ugc.asve.recorder.ASMediaSegment;
import com.p683ss.android.ugc.asve.recorder.C20420b;
import com.p683ss.android.ugc.asve.recorder.camera.C20463c;
import com.p683ss.android.ugc.asve.recorder.camera.p1246a.C20455b;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.p1245b.C20426a;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.asve.sandbox.C20809p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.SafeHandler;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23524d;
import com.p683ss.android.ugc.aweme.base.utils.C23727n;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31405ah;
import com.p683ss.android.ugc.aweme.filter.C31406ai;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.C31460h;
import com.p683ss.android.ugc.aweme.filter.p1744c.C31454c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.C42429as;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.C43304dz;
import com.p683ss.android.ugc.aweme.shortvideo.C43307ea;
import com.p683ss.android.ugc.aweme.shortvideo.C43791eo;
import com.p683ss.android.ugc.aweme.shortvideo.C43807fb;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.beauty.C42451a;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43236a;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.ugc.aweme.shortvideo.p2187e.C43306a;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44878a;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44885g;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44887h;
import com.p683ss.android.ugc.aweme.shortvideo.p2241t.C44888i;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45182h;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.EmbaddedWindowInfo;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.TimeSpeedModelExtension;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45099b;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2245c.C45101d;
import com.p683ss.android.ugc.aweme.shortvideo.p2255v.C45474a;
import com.p683ss.android.ugc.aweme.shortvideo.p2255v.C45475b;
import com.p683ss.android.ugc.aweme.shortvideo.record.C44436a;
import com.p683ss.android.ugc.aweme.shortvideo.record.C44455e;
import com.p683ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.p683ss.android.ugc.aweme.shortvideo.record.CameraModule.C44435a;
import com.p683ss.android.ugc.aweme.shortvideo.record.p2223a.C44442a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.backgroundvideo.C46448b;
import com.p683ss.android.ugc.aweme.tools.C46807aa;
import com.p683ss.android.ugc.aweme.tools.C46808ab;
import com.p683ss.android.ugc.aweme.tools.C46938d;
import com.p683ss.android.ugc.aweme.tools.C47063h;
import com.p683ss.android.ugc.aweme.tools.C47064i;
import com.p683ss.android.ugc.aweme.tools.C47066k;
import com.p683ss.android.ugc.aweme.tools.C47067l;
import com.p683ss.android.ugc.aweme.tools.C47093m;
import com.p683ss.android.ugc.aweme.tools.C47323n;
import com.p683ss.android.ugc.aweme.tools.C47324o;
import com.p683ss.android.ugc.aweme.tools.C47337r;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.aweme.tools.C47347v;
import com.p683ss.android.ugc.aweme.tools.C47348w;
import com.p683ss.android.ugc.aweme.tools.C47349x;
import com.p683ss.android.ugc.aweme.tools.C47351z;
import com.p683ss.android.ugc.aweme.tools.extract.C47038j;
import com.p683ss.android.ugc.aweme.tools.extract.C47044m;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.gamora.recorder.p2478l.C49860a;
import com.p683ss.android.ugc.gamora.recorder.sticker.p2484a.C50048n;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.C50601ah.C50625m;
import com.p683ss.android.vesdk.C50630ak;
import com.p683ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52847n;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.b */
public class C45017b extends C2764h<C45004a> implements C12356a, C45004a {

    /* renamed from: A */
    public boolean f113983A;

    /* renamed from: B */
    public boolean f113984B;

    /* renamed from: C */
    public int f113985C;

    /* renamed from: D */
    public int f113986D;

    /* renamed from: E */
    public boolean f113987E;

    /* renamed from: F */
    public boolean f113988F;

    /* renamed from: G */
    public boolean f113989G;

    /* renamed from: H */
    int f113990H;

    /* renamed from: I */
    public C45010ae f113991I;

    /* renamed from: J */
    public final C52668f<C42451a> f113992J;

    /* renamed from: K */
    public final C52668f<C50048n> f113993K;

    /* renamed from: L */
    public C19233b f113994L;

    /* renamed from: M */
    int f113995M;

    /* renamed from: N */
    boolean f113996N;

    /* renamed from: O */
    C44435a f113997O;

    /* renamed from: P */
    List<String> f113998P;

    /* renamed from: Q */
    private final C2765i<Boolean> f113999Q = new C2765i<>();

    /* renamed from: R */
    private final C2765i<Boolean> f114000R = new C2765i<>();

    /* renamed from: S */
    private final C2765i<C52860x> f114001S = new C2765i<>();

    /* renamed from: T */
    private final C2765i<Integer> f114002T = new C2765i<>();

    /* renamed from: U */
    private final C2765i<C47323n> f114003U = new C2765i<>();

    /* renamed from: V */
    private final C2765i<C47093m> f114004V = new C2765i<>();

    /* renamed from: W */
    private final C2765i<C47351z> f114005W = new C2765i<>();

    /* renamed from: X */
    private final C2765i<Boolean> f114006X = new C2765i<>();

    /* renamed from: Y */
    private final C2765i<C47349x> f114007Y;

    /* renamed from: Z */
    private final C2765i<C46808ab> f114008Z;

    /* renamed from: aa */
    private final C2765i<C47324o> f114009aa;

    /* renamed from: ab */
    private final C2765i<Boolean> f114010ab;

    /* renamed from: ac */
    private final C2765i<Boolean> f114011ac;

    /* renamed from: ad */
    private final C2765i<C47347v> f114012ad;

    /* renamed from: ae */
    private final C2765i<C47064i> f114013ae;

    /* renamed from: af */
    private final C2765i<C52860x> f114014af;

    /* renamed from: ag */
    private final C2766j<Boolean> f114015ag;

    /* renamed from: ah */
    private C44442a f114016ah;

    /* renamed from: ai */
    private C44436a f114017ai;

    /* renamed from: aj */
    private final C45182h f114018aj;

    /* renamed from: ak */
    private boolean f114019ak;

    /* renamed from: al */
    private boolean f114020al;

    /* renamed from: am */
    private final C23524d<JSONObject> f114021am;

    /* renamed from: an */
    private final Handler f114022an;

    /* renamed from: ao */
    private final C2765i<Integer> f114023ao;

    /* renamed from: b */
    final C12361b f114024b;

    /* renamed from: c */
    public final C2766j<Boolean> f114025c = new C2766j<>(Boolean.valueOf(false));

    /* renamed from: d */
    public final C2765i<Integer> f114026d = new C2765i<>();

    /* renamed from: e */
    public final C2765i<C52860x> f114027e = new C2765i<>();

    /* renamed from: f */
    final C2765i<C52847n<Integer, Float>> f114028f = new C2765i<>();

    /* renamed from: g */
    public final C2765i<C47337r> f114029g = new C2765i<>();

    /* renamed from: h */
    public final C2766j<C43866a> f114030h;

    /* renamed from: i */
    public final C2765i<C47349x> f114031i;

    /* renamed from: j */
    public final C2765i<C47351z> f114032j;

    /* renamed from: k */
    final C2765i<C52860x> f114033k;

    /* renamed from: l */
    public final C2765i<C47063h> f114034l;

    /* renamed from: m */
    public final C2765i<C47066k> f114035m;

    /* renamed from: n */
    public final C2765i<C52860x> f114036n;

    /* renamed from: o */
    public C47339t f114037o;

    /* renamed from: p */
    public final AppCompatActivity f114038p;

    /* renamed from: q */
    public SurfaceView f114039q;

    /* renamed from: r */
    public ASCameraView f114040r;

    /* renamed from: s */
    public CameraModule f114041s;

    /* renamed from: t */
    public ShortVideoContext f114042t;

    /* renamed from: u */
    public C44885g f114043u;

    /* renamed from: v */
    public C47038j f114044v;

    /* renamed from: w */
    public SafeHandler f114045w;

    /* renamed from: x */
    public SurfaceHolder f114046x;

    /* renamed from: y */
    public volatile boolean f114047y;

    /* renamed from: z */
    public boolean f114048z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.b$a */
    static class C45022a implements C20809p {

        /* renamed from: a */
        private WeakReference<C45017b> f114053a;

        /* renamed from: a */
        public final void mo44156a() {
            if (this.f114053a != null) {
                C45017b bVar = (C45017b) this.f114053a.get();
                if (bVar != null) {
                    try {
                        C23727n.m58238a(new C45031j(bVar));
                    } catch (Exception unused) {
                    }
                }
            }
        }

        private C45022a(C45017b bVar) {
            this.f114053a = new WeakReference<>(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b.b$b */
    public class C45023b implements Runnable {

        /* renamed from: a */
        ShortVideoContextViewModel f114054a = C45017b.this.mo91389al();

        public final void run() {
            long j;
            long j2;
            boolean z;
            boolean z2;
            if (!C45017b.this.mo91389al().mo86391c()) {
                long endFrameTimeUS = C45017b.this.mo91307M().getEndFrameTimeUS() / 1000;
                if (endFrameTimeUS <= 0) {
                    StringBuilder sb = new StringBuilder("VideoNewActivity UpdateProgressSegment duration = ");
                    sb.append(endFrameTimeUS);
                    C50203g.m108361b(sb.toString());
                }
                if (C45017b.this.f114042t.f107095au == 1) {
                    j = TimeSpeedModelExtension.calculateRealTime(endFrameTimeUS, (double) C47339t.NORMAL.value()) + C45017b.this.f114042t.mo86372m();
                } else {
                    j = TimeSpeedModelExtension.calculateRealTime(endFrameTimeUS, (double) C45017b.this.f114037o.value()) + C45017b.this.f114042t.mo86372m();
                }
                Long l = (Long) this.f114054a.mo86382a("auto_stop_time");
                if (l == null) {
                    j2 = 0;
                } else {
                    j2 = l.longValue();
                }
                ((C50048n) C45017b.this.f113993K.getValue()).mo97797B().mo97785a((int) j);
                if (!C39618d.f101152P.mo83103a(C40790a.DuetFixNewPlan) ? (C45017b.this.f114042t.mo86366g() || C45017b.this.f114042t.mo86365f()) && C45017b.this.mo91307M().getDataSourceVideoCompleteListener() != null ? !C45017b.this.f113988F || j <= C45017b.this.f114042t.mo86377r() : j <= C45017b.this.f114042t.mo86377r() : j <= C45017b.this.f114042t.mo86377r()) {
                    z = false;
                } else {
                    z = true;
                }
                if (j2 <= 0 || j2 >= C45017b.this.f114042t.mo86377r() || j <= j2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2 || z) {
                    if (z) {
                        C45017b.this.f114042t.f107094at = System.currentTimeMillis();
                    }
                    C47351z zVar = new C47351z();
                    C45017b.this.mo91335a(zVar);
                    C45017b.this.mo91354b(zVar);
                    if (z2) {
                        this.f114054a.mo86384a(0);
                    }
                    if (z) {
                        C45017b.this.f114044v.mo94320a(true);
                        if (C45017b.this.f114042t.f107122o) {
                            ((C49860a) ApiCenter.m7844a((FragmentActivity) C45017b.this.f114038p).mo7339a(C49860a.class)).mo97684a(2);
                        } else {
                            C45017b.this.mo91329a(new C47323n("record_full"));
                            C45017b.this.mo91338a(false);
                        }
                    }
                    return;
                }
                C45017b.this.mo91383a(endFrameTimeUS);
                C45017b.this.f114045w.post(this);
            }
        }

        public C45023b() {
        }
    }

    /* renamed from: A */
    public final C2762f<C47337r> mo91295A() {
        return this.f114029g;
    }

    /* renamed from: B */
    public final C2762f<C47066k> mo91296B() {
        return this.f114035m;
    }

    /* renamed from: C */
    public final C2762f<C52860x> mo91297C() {
        return this.f114036n;
    }

    /* renamed from: D */
    public final C2762f<C47064i> mo91298D() {
        return this.f114013ae;
    }

    /* renamed from: E */
    public final C2763g<Boolean> mo91299E() {
        return this.f114015ag;
    }

    /* renamed from: F */
    public final C2762f<Boolean> mo91300F() {
        return this.f114006X;
    }

    /* renamed from: G */
    public final C2763g<C43866a> mo91301G() {
        return this.f114030h;
    }

    /* renamed from: I */
    public final CameraModule mo91303I() {
        return this.f114041s;
    }

    /* renamed from: J */
    public final C44442a mo91304J() {
        return this.f114016ah;
    }

    /* renamed from: K */
    public final C44885g mo91305K() {
        return this.f114043u;
    }

    /* renamed from: L */
    public final C44436a mo91306L() {
        return this.f114017ai;
    }

    /* renamed from: M */
    public final ASCameraView mo91307M() {
        return this.f114040r;
    }

    /* renamed from: N */
    public final SurfaceView mo91308N() {
        return this.f114039q;
    }

    /* renamed from: O */
    public final C47038j mo91309O() {
        return this.f114044v;
    }

    /* renamed from: S */
    public final C47339t mo91313S() {
        return this.f114037o;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2759d mo7353a() {
        return this;
    }

    /* renamed from: ad */
    public final C2762f<C47324o> mo91344ad() {
        return this.f114009aa;
    }

    /* renamed from: ae */
    public final C2762f<C46808ab> mo91345ae() {
        return this.f114008Z;
    }

    /* renamed from: ag */
    public final C2762f<C47063h> mo91347ag() {
        return this.f114034l;
    }

    /* renamed from: ah */
    public final C2762f<C52860x> mo91348ah() {
        return this.f114014af;
    }

    /* renamed from: aj */
    public final C2762f<Integer> mo91350aj() {
        return this.f114023ao;
    }

    /* renamed from: ao */
    public final List<String> mo91392ao() {
        return this.f113998P;
    }

    /* renamed from: h */
    public final C2763g<Boolean> mo91362h() {
        return this.f114025c;
    }

    /* renamed from: i */
    public final C2762f<Boolean> mo91363i() {
        return this.f113999Q;
    }

    /* renamed from: j */
    public final C12361b mo23370j() {
        return this.f114024b;
    }

    /* renamed from: k */
    public final C2762f<Integer> mo91364k() {
        return this.f114026d;
    }

    /* renamed from: l */
    public final C2762f<Boolean> mo91365l() {
        return this.f114000R;
    }

    /* renamed from: m */
    public final C2762f<C52860x> mo91366m() {
        return this.f114027e;
    }

    /* renamed from: n */
    public final C2762f<C52860x> mo91367n() {
        return this.f114001S;
    }

    /* renamed from: o */
    public final C2762f<C52847n<Integer, Float>> mo91368o() {
        return this.f114028f;
    }

    /* renamed from: p */
    public final C2762f<Integer> mo91369p() {
        return this.f114002T;
    }

    /* renamed from: q */
    public final C2762f<Boolean> mo91370q() {
        return this.f114011ac;
    }

    /* renamed from: r */
    public final C2762f<Boolean> mo91371r() {
        return this.f114010ab;
    }

    /* renamed from: s */
    public final C2762f<C47347v> mo91372s() {
        return this.f114012ad;
    }

    /* renamed from: t */
    public final C2762f<C47323n> mo91373t() {
        return this.f114003U;
    }

    /* renamed from: u */
    public final C2762f<C47093m> mo91374u() {
        return this.f114004V;
    }

    /* renamed from: v */
    public final C2762f<C47349x> mo91375v() {
        return this.f114007Y;
    }

    /* renamed from: w */
    public final C2762f<C47349x> mo91376w() {
        return this.f114031i;
    }

    /* renamed from: x */
    public final C2762f<C47351z> mo91377x() {
        return this.f114005W;
    }

    /* renamed from: y */
    public final C2762f<C47351z> mo91378y() {
        return this.f114032j;
    }

    /* renamed from: z */
    public final C2762f<C52860x> mo91379z() {
        return this.f114033k;
    }

    /* renamed from: a */
    public final void mo91329a(C47323n nVar) {
        this.f114003U.mo7350a(nVar);
    }

    /* renamed from: a */
    public final void mo91336a(String str) {
        this.f114043u.mo91005a(str);
    }

    /* renamed from: a */
    public final void mo91337a(String str, float f) {
        this.f114043u.mo91028a(str, f);
    }

    /* renamed from: a */
    public final void mo91332a(C47339t tVar) {
        this.f114037o = tVar;
        ShortVideoContextViewModel al = mo91389al();
        double value = (double) tVar.value();
        al.mo86385a("record_speed", Double.valueOf(value));
        if (al.f107137d == null) {
            al.f107137d = new C0198r<>();
        }
        al.f107137d.setValue(Double.valueOf(value));
        if (this.f114042t != null) {
            C26890h.m65011a("choose_speed_mode", C42438az.m93209a().mo86526a("creation_id", this.f114042t.f107131x).mo86526a("shoot_way", this.f114042t.f107132y).mo86523a("draft_id", this.f114042t.f107022A).mo86526a("speed_mode", tVar.description()).f107329a);
        }
    }

    /* renamed from: a */
    public final void mo91334a(C47349x xVar) {
        C45182h hVar = this.f114018aj;
        if (hVar.f114311e == null) {
            hVar.f114311e = new C43791eo(hVar.f114307a, hVar.f114308b, hVar.f114309c, hVar.f114310d);
        }
        hVar.f114311e.onEvent(xVar);
        this.f114007Y.mo7350a(xVar);
    }

    /* renamed from: a */
    public final void mo91335a(C47351z zVar) {
        this.f114018aj.mo91480a(zVar);
    }

    /* renamed from: a */
    public final void mo91386a(C47067l lVar) {
        this.f114018aj.mo91386a(lVar);
    }

    /* renamed from: a */
    public final void mo91328a(C47064i iVar) {
        mo91311Q();
        this.f114013ae.mo7350a(iVar);
    }

    /* renamed from: a */
    public final void mo91387a(C47348w wVar) {
        this.f114018aj.mo91387a(wVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d A[PHI: r2 
      PHI: (r2v1 boolean) = (r2v2 boolean), (r2v0 boolean), (r2v0 boolean), (r2v0 boolean), (r2v0 boolean) binds: [B:32:0x007c, B:30:0x0078, B:25:0x006d, B:21:0x0064, B:3:0x000c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo91340a(boolean r6, boolean r7) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.shortvideo.record.CameraModule r0 = r5.f114041s
            com.ss.android.ugc.asve.recorder.camera.a.b r0 = r0.f112404e
            int r1 = r0.f56090f
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x0011
            if (r6 != 0) goto L_0x0010
            if (r7 != 0) goto L_0x0010
            goto L_0x007d
        L_0x0010:
            return r3
        L_0x0011:
            int r1 = r0.f56090f
            r4 = 2
            if (r1 != r4) goto L_0x0068
            if (r6 != 0) goto L_0x0067
            android.content.Context r6 = r0.f56089e
            com.ss.android.ugc.asve.recorder.camera.b r7 = r0.f56091g
            boolean r7 = r7.mo43359b()
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            if (r7 != 0) goto L_0x0035
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 27
            if (r7 <= r0) goto L_0x0063
            boolean r6 = com.p683ss.android.medialib.camera.C19293i.m47122a(r6, r3)
            if (r6 == 0) goto L_0x0063
            r6 = 1
            goto L_0x0064
        L_0x0035:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            java.lang.String r0 = "support_anti_shake"
            r1 = 0
            r7.putSerializable(r0, r1)
            r0 = 5
            com.ss.android.vesdk.VECameraSettings$CAMERA_TYPE r0 = com.p683ss.android.ugc.asve.recorder.camera.C20482f.m51067b(r0)
            com.p683ss.android.vesdk.C50704j.m109625a(r6, r0, r7)
            java.lang.String r6 = "support_anti_shake"
            java.io.Serializable r6 = r7.getSerializable(r6)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L_0x0063
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            java.lang.Object r6 = r6.get(r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0063
            boolean r6 = r6.booleanValue()
            goto L_0x0064
        L_0x0063:
            r6 = 0
        L_0x0064:
            if (r6 == 0) goto L_0x0067
            goto L_0x007d
        L_0x0067:
            return r3
        L_0x0068:
            int r1 = r0.f56090f
            r4 = 3
            if (r1 != r4) goto L_0x0071
            if (r6 != 0) goto L_0x0070
            goto L_0x007d
        L_0x0070:
            return r3
        L_0x0071:
            int r0 = r0.f56090f
            r1 = 4
            if (r0 != r1) goto L_0x007c
            if (r6 != 0) goto L_0x007b
            if (r7 != 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            return r3
        L_0x007c:
            r2 = 0
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45017b.mo91340a(boolean, boolean):boolean");
    }

    /* renamed from: a */
    public final boolean mo91339a(ScaleGestureDetector scaleGestureDetector) {
        CameraModule cameraModule = this.f114041s;
        C23569o.m57779a("zoom_info_log", new C42437ay().mo86517a("isDragEnable", Boolean.valueOf(cameraModule.f112403d)).mo86518a("mMaxZoom", Float.valueOf(cameraModule.f112405f.getMaxCameraZoom())).mo86517a("mCameraZoomList", Boolean.valueOf(C9414h.m18631b(cameraModule.f112405f.getCameraZoomList()))).mo86522b());
        if (cameraModule.f112403d) {
            return true;
        }
        cameraModule.mo90313c();
        if (cameraModule.mo90314d()) {
            return true;
        }
        float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
        C20420b bVar = cameraModule.f112405f.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43360b(currentSpan);
        return true;
    }

    /* renamed from: a */
    public final void mo91333a(C47347v vVar) {
        C43304dz.m94976a(this.f114038p, mo91389al().f107134a, vVar);
        this.f114012ad.mo7350a(vVar);
    }

    /* renamed from: a */
    public final void mo91330a(C47324o oVar) {
        this.f114009aa.mo7350a(oVar);
    }

    /* renamed from: a */
    public final void mo91338a(boolean z) {
        this.f114015ag.mo7345a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo91331a(C47337r rVar) {
        this.f114029g.mo7350a(rVar);
        C47337r.f119492a.release(rVar);
    }

    /* renamed from: U */
    public final int mo91315U() {
        return this.f114041s.mo90316f();
    }

    /* renamed from: ab */
    public final void mo91342ab() {
        this.f114041s.mo90308a(0.0f);
    }

    /* renamed from: ac */
    public final void mo91343ac() {
        this.f114041s.f112405f.mo43621a();
    }

    /* renamed from: ai */
    public final void mo91349ai() {
        this.f114014af.mo7350a(C52860x.f131107a);
    }

    /* renamed from: an */
    public final void mo91391an() {
        this.f114038p.finish();
    }

    public final void bM_() {
        super.bM_();
        mo91390am();
    }

    /* renamed from: P */
    public final void mo91310P() {
        this.f114022an.post(new C45044w(this));
    }

    /* renamed from: T */
    public final void mo91314T() {
        new C45023b().run();
    }

    /* renamed from: V */
    public final boolean mo91316V() {
        if (this.f114041s.mo90316f() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public final boolean mo91317W() {
        return this.f114041s.mo90312b().mo43436f();
    }

    /* renamed from: X */
    public final int mo91318X() {
        return this.f114041s.f112405f.getNextFlashMode();
    }

    /* renamed from: Y */
    public final boolean mo91319Y() {
        return this.f114041s.mo90312b().mo43437g();
    }

    /* renamed from: Z */
    public final boolean mo91320Z() {
        return this.f114041s.mo90312b().mo43430b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: al */
    public final ShortVideoContextViewModel mo91389al() {
        return (ShortVideoContextViewModel) C0214z.m440a((FragmentActivity) this.f114038p).mo359a(ShortVideoContextViewModel.class);
    }

    /* renamed from: u_ */
    public final void mo7359u_() {
        super.mo7359u_();
        if (this.f114039q != null) {
            this.f114039q.setVisibility(8);
        }
    }

    /* renamed from: ar */
    private boolean m98426ar() {
        C20420b bVar = this.f114041s.f112405f.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43372i().mo43435e();
    }

    /* renamed from: R */
    public final void mo91312R() {
        int f = this.f114041s.mo90316f();
        if (f == 0) {
            C47093m a = C47093m.m102238a();
            a.f118903b = false;
            mo91321a(a);
            return;
        }
        if (f == 1) {
            C47093m b = C47093m.m102239b();
            b.f118903b = false;
            mo91321a(b);
        }
    }

    public final void bN_() {
        super.bN_();
        this.f114040r.setDataSourceVideoCompleteListener(null);
        this.f114040r.setSATZoomListener(null);
        this.f114040r.mo43627a(this.f113994L);
        C45101d.m98617a(C45099b.RECORD_ON_DESTROY);
    }

    /* renamed from: s_ */
    public final void mo7357s_() {
        super.mo7357s_();
        this.f114039q.setVisibility(0);
        mo91352b(this.f114041s.f112405f.getFlashMode());
    }

    /* renamed from: t_ */
    public final void mo7358t_() {
        super.mo7358t_();
        if (this.f114042t != null) {
            mo91307M().mo43640e(this.f114042t.mo86361c());
        }
        C45101d.m98617a(C45099b.RECORD_ON_RESUME);
    }

    /* renamed from: H */
    public final Point mo91302H() {
        Point point = new Point();
        if (!(this.f114039q == null || this.f114039q.getLayoutParams() == null || !(this.f114039q.getLayoutParams() instanceof LayoutParams))) {
            LayoutParams layoutParams = (LayoutParams) this.f114039q.getLayoutParams();
            point.x = layoutParams.width;
            point.y = layoutParams.height;
        }
        return point;
    }

    /* renamed from: am */
    public final boolean mo91390am() {
        C47625i.m103103a("forceStopRecord() called");
        if (!mo91389al().mo86391c() || mo91389al().mo86387a()) {
            C47351z zVar = new C47351z();
            mo91335a(zVar);
            mo91354b(zVar);
        }
        return true;
    }

    /* renamed from: aa */
    public final void mo91341aa() {
        int i;
        C20420b bVar = this.f114041s.f112405f.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        bVar.mo43253b().mo43372i().mo43427a((C19263c) null);
        this.f114011ac.mo7350a(Boolean.valueOf(mo91320Z()));
        if (m98426ar()) {
            if (mo91320Z()) {
                i = 5;
            } else {
                i = 6;
            }
            mo91352b(i);
        }
        mo91323a(0);
        if (m98426ar() && mo91320Z()) {
            C10691a.m21543b((Context) this.f114038p, (int) R.string.apz, 1).mo19066a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aq */
    public void mo91394aq() {
        this.f114001S.mo7350a(C52860x.f131107a);
        C47625i.m103103a("resetAllPlayStatus() called");
        this.f114042t.f107118k.mo86459f();
        this.f114042t.f107118k.mo86461h();
        C43306a.m94978a();
        for (int i = 0; i < this.f114042t.f107119l.size(); i++) {
            mo91307M().mo43641f();
        }
        this.f114042t.f107119l.clear();
        this.f114042t.f107120m = 0;
        this.f113988F = false;
        mo91383a(-1);
    }

    public final void bO_() {
        super.bO_();
        C50630ak.m109154a();
        this.f114017ai = new C44436a(this.f114038p, C45039r.f114078a);
        this.f114039q.getHolder().addCallback(new Callback() {
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C45407ay.m98968a("CameraLogicComponent => surfaceCreated");
                StringBuilder sb = new StringBuilder("w = ");
                sb.append(C45017b.this.f114039q.getWidth());
                sb.append("   h = ");
                sb.append(C45017b.this.f114039q.getHeight());
                C23569o.m57779a("zoom_info_log", new C23088c().mo47824a("camera_surface_view_size", sb.toString()).mo47825b());
                ASCameraView aSCameraView = C45017b.this.f114040r;
                C19233b bVar = C45017b.this.f113994L;
                C52711k.m112240b(bVar, "listener");
                C20420b bVar2 = aSCameraView.f56318e;
                if (bVar2 == null) {
                    C52711k.m112237a("recorder");
                }
                bVar2.mo43248a(bVar);
                C45017b bVar3 = C45017b.this;
                C47625i.m103103a("initMediaProcess() called");
                C20420b bVar4 = bVar3.f114040r.f56318e;
                if (bVar4 == null) {
                    C52711k.m112237a("recorder");
                }
                bVar4.mo43257e().mo43320j();
                C45017b.this.mo91393ap();
                ASCameraView aSCameraView2 = C45017b.this.f114040r;
                Surface surface = surfaceHolder.getSurface();
                String str = Build.DEVICE;
                C52671b bVar5 = C45045x.f114084a;
                C52711k.m112240b(surface, "surface");
                C52711k.m112240b(str, "deviceName");
                C20420b bVar6 = aSCameraView2.f56318e;
                if (bVar6 == null) {
                    C52711k.m112237a("recorder");
                }
                bVar6.mo43257e().mo43305b(surface, str, bVar5);
                if (C39618d.f101152P.mo83103a(C40790a.OpenRecordToViewOptimize)) {
                    C45017b.this.f114025c.mo7345a(Boolean.valueOf(true));
                }
                C45017b.this.f114046x = surfaceHolder;
                if (C45017b.this.f113984B) {
                    C45017b.this.f113984B = false;
                    if (C45017b.this.f114048z) {
                        C45017b.this.mo91388ak();
                    }
                } else {
                    C45017b.this.f114041s.mo90307a();
                }
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                CameraModule cameraModule = C45017b.this.f114041s;
                C45407ay.m98973d("camera release");
                if (cameraModule.f112405f.mo43638d()) {
                    cameraModule.mo90309a(0);
                    cameraModule.f112405f.mo43621a();
                }
                cameraModule.f112405f.setCameraPreviewSizeInterface(null);
                ASCameraView aSCameraView = cameraModule.f112405f;
                C52711k.m112240b(cameraModule, "zoomListener");
                C20420b bVar = aSCameraView.f56318e;
                if (bVar == null) {
                    C52711k.m112237a("recorder");
                }
                bVar.mo43253b().mo43357b((C20463c) cameraModule);
                C45017b.this.mo91390am();
                ASCameraView aSCameraView2 = C45017b.this.f114040r;
                C52671b bVar2 = C45046y.f114085a;
                C20420b bVar3 = aSCameraView2.f56318e;
                if (bVar3 == null) {
                    C52711k.m112237a("recorder");
                }
                bVar3.mo43257e().mo43306b(bVar2);
                C45017b bVar4 = C45017b.this;
                C20420b bVar5 = bVar4.f114040r.f56318e;
                if (bVar5 == null) {
                    C52711k.m112237a("recorder");
                }
                bVar5.mo43253b().mo43386s();
                C20420b bVar6 = bVar4.f114040r.f56318e;
                if (bVar6 == null) {
                    C52711k.m112237a("recorder");
                }
                bVar6.mo43257e().mo43319i();
                bVar4.f114040r.mo43627a(bVar4.f113994L);
                bVar4.f113987E = false;
                bVar4.mo91389al().mo86390c(false);
                bVar4.mo91389al().mo86397f(false);
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C45407ay.m98968a("CameraLogicComponent => surfaceChanged");
                ASCameraView aSCameraView = C45017b.this.f114040r;
                Surface surface = surfaceHolder.getSurface();
                C20420b bVar = aSCameraView.f56318e;
                if (bVar == null) {
                    C52711k.m112237a("recorder");
                }
                bVar.mo43257e().mo43291a(surface);
            }
        });
        getLifecycle().mo324a(this.f114041s);
        this.f114041s.mo90307a();
        ASCameraView M = mo91307M();
        C45036o oVar = new C45036o(this);
        C52711k.m112240b(oVar, "callback");
        M.f56319f.add(oVar);
        if (C44455e.m97284d()) {
            mo91307M().getCameraController().mo43348a((C50625m) new C45038q(this));
        }
        C45101d.m98617a(C45099b.RECORD_ON_CREATE);
        this.f114044v = new C47044m(this.f114040r.getMediaController());
        if (this.f114042t != null) {
            this.f114044v.mo94317a(this.f114042t.f107092ar);
        }
        this.f114044v.mo94323d();
    }

    /* renamed from: Q */
    public final void mo91311Q() {
        C47625i.m103103a("clearEdit() called");
        this.f114042t.f107118k.mo86461h();
        C43306a.m94978a();
        for (int i = 0; i < this.f114042t.mo86375p().size(); i++) {
            mo91307M().mo43641f();
        }
        C48016e.m103942b(new File(this.f114042t.f107118k.mo86460g().getPath()));
        C46448b.m100838b(this.f114042t.mo86375p(), this.f114042t.f107126s);
        this.f114042t.mo86375p().clear();
        this.f114042t.mo86357a(0);
        if (!(this.f114044v == null || this.f114044v.mo94324e() == null || this.f114042t.f107101b == 1)) {
            C48016e.m103954e(this.f114044v.mo94324e().extractFramesDir);
            C48016e.m103947c(this.f114044v.mo94324e().extractFramesDir);
            this.f114044v.mo94316a();
        }
        this.f113988F = false;
    }

    /* renamed from: af */
    public final String mo91346af() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.f114011ac.mo7348a() == null || !((Boolean) this.f114011ac.mo7348a()).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (this.f114010ab.mo7348a() == null || !((Boolean) this.f114010ab.mo7348a()).booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f114028f.mo7348a() != null && ((Integer) ((C52847n) this.f114028f.mo7348a()).getFirst()).intValue() == CAMERA_FACING_ID.FACING_TELEPHOTO.ordinal()) {
            z3 = true;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(1);
        }
        if (z2) {
            if (sb.length() != 0) {
                sb.append(":");
            }
            sb.append(2);
        }
        if (z3) {
            if (sb.length() != 0) {
                sb.append(":");
            }
            sb.append(3);
        }
        return sb.toString();
    }

    /* renamed from: ak */
    public final void mo91388ak() {
        C45407ay.m98968a("CameraLogicComponent => previewCamera");
        if (!this.f114042t.mo86361c()) {
            this.f114040r.mo43620a((Context) this.f114038p, this.f114017ai.mo90324a());
        } else {
            this.f114040r.setMusicPath(this.f114042t.f107118k.mo86458e().getPath());
            this.f114040r.mo43630a(this.f114042t.f107118k.mo86458e().getPath(), this.f114042t.mo86373n(), this.f114042t.mo86372m());
            this.f114040r.mo43620a((Context) this.f114038p, this.f114017ai.mo90324a());
        }
        this.f114040r.setDetectionMode(C39618d.f101152P.mo83103a(C40790a.EnableEffectParallelFwk));
        ASCameraView aSCameraView = this.f114040r;
        Surface surface = this.f114039q.getHolder().getSurface();
        String str = Build.DEVICE;
        C52671b bVar = C45041t.f114080a;
        C52711k.m112240b(surface, "surface");
        C52711k.m112240b(str, "deviceName");
        C20420b bVar2 = aSCameraView.f56318e;
        if (bVar2 == null) {
            C52711k.m112237a("recorder");
        }
        bVar2.mo43257e().mo43292a(surface, str, bVar);
        this.f113999Q.mo7350a(Boolean.valueOf(true));
        this.f113983A = true;
    }

    /* renamed from: ap */
    public final void mo91393ap() {
        String str;
        boolean z;
        C47625i.m103103a("initDuetAndReaction() called");
        if ((C43236a.m94873a(this.f114042t) || this.f114042t.mo86366g()) && !this.f114042t.f107031J) {
            ShortVideoContext shortVideoContext = this.f114042t;
            ASCameraView M = mo91307M();
            boolean a = C39618d.f101152P.mo83103a(C40790a.EnableEchoCancellation);
            if (M.f56318e != null) {
                C20420b bVar = M.f56318e;
                if (bVar == null) {
                    C52711k.m112237a("recorder");
                }
                z = bVar.mo43257e().mo43317g(a);
            } else {
                z = false;
            }
            shortVideoContext.f107031J = z;
        }
        C20420b bVar2 = mo91307M().f56318e;
        if (bVar2 == null) {
            C52711k.m112237a("recorder");
        }
        bVar2.mo43275a();
        ASCameraView M2 = mo91307M();
        C45026e eVar = new C45026e(this);
        C52711k.m112240b(eVar, "callback");
        C20420b bVar3 = M2.f56318e;
        if (bVar3 == null) {
            C52711k.m112237a("recorder");
        }
        bVar3.mo43251a((C52671b<? super Integer, C52860x>) eVar);
        ASCameraView M3 = mo91307M();
        C45028g gVar = new C45028g(this);
        C52711k.m112240b(gVar, "callback");
        C20420b bVar4 = M3.f56318e;
        if (bVar4 == null) {
            C52711k.m112237a("recorder");
        }
        bVar4.mo43256d().mo43464a((OnCherEffectParmaCallback) gVar);
        if (this.f114042t.f107069aU != null) {
            ASCameraView M4 = mo91307M();
            String[] matrix = this.f114042t.f107069aU.getMatrix();
            double[] duration = this.f114042t.f107069aU.getDuration();
            boolean[] segUseCher = this.f114042t.f107069aU.getSegUseCher();
            C20420b bVar5 = M4.f56318e;
            if (bVar5 == null) {
                C52711k.m112237a("recorder");
            }
            bVar5.mo43256d().mo43483a(matrix, duration, segUseCher);
        }
        if (this.f114042t.mo86365f()) {
            C47625i.m103103a("initDuet() called");
            ShortVideoContext shortVideoContext2 = this.f114042t;
            int i = this.f114042t.f107032K;
            int i2 = this.f114042t.f107033L;
            EmbaddedWindowInfo embaddedWindowInfo = new EmbaddedWindowInfo();
            embaddedWindowInfo.f113636c = 0;
            embaddedWindowInfo.f113637d = 0;
            embaddedWindowInfo.f113634a = i;
            embaddedWindowInfo.f113635b = i2;
            embaddedWindowInfo.f113638e = 0;
            embaddedWindowInfo.f113639f = Integer.MAX_VALUE;
            ArrayList arrayList = new ArrayList();
            arrayList.add(embaddedWindowInfo);
            shortVideoContext2.f107039R = arrayList;
        }
        if (this.f114042t.mo86366g()) {
            C47625i.m103103a("initReaction() called");
            int b = C39618d.f101151O.mo83118b(C40796a.DefaultMicrophoneState);
            if (b == 3 || b == 2) {
                this.f114042t.f107040S = true;
            }
            if (this.f114016ah == null) {
                this.f114016ah = new C44442a(this.f114038p, mo91307M(), this);
            }
        }
        if (!this.f114042t.mo86375p().isEmpty()) {
            File g = this.f114042t.f107118k.mo86460g();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = this.f114042t.f107119l.iterator();
            while (it.hasNext()) {
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) it.next();
                arrayList2.add(new ASMediaSegment((long) timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()));
            }
            C20426a mediaController = mo91307M().getMediaController();
            String path = g.getPath();
            ShortVideoContext shortVideoContext3 = this.f114042t;
            String l = shortVideoContext3.mo86371l();
            if (l != null) {
                str = l;
            } else if (shortVideoContext3.f107028G != null) {
                str = shortVideoContext3.f107028G;
            } else if (shortVideoContext3.f107035N != null) {
                str = shortVideoContext3.f107035N.wavPath;
            } else {
                str = null;
            }
            mediaController.mo43299a(arrayList2, path, str, this.f114042t.f107113f, new C45027f(this, arrayList2, g));
        }
    }

    /* renamed from: a */
    public final void mo91325a(C45010ae aeVar) {
        this.f113991I = aeVar;
    }

    /* renamed from: b */
    public final void mo91354b(C47351z zVar) {
        this.f114005W.mo7350a(zVar);
    }

    /* renamed from: a */
    public final int mo91321a(C47093m mVar) {
        int g = this.f114041s.mo90317g();
        mo91353b(mVar);
        return g;
    }

    /* renamed from: b */
    public final void mo91352b(int i) {
        this.f114002T.mo7350a(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final void mo91359d(int i) {
        this.f114023ao.mo7350a(Integer.valueOf(i));
    }

    /* renamed from: f */
    public final void mo91396f(boolean z) {
        this.f114006X.mo7350a(Boolean.valueOf(z));
    }

    /* renamed from: b */
    public final void mo91353b(C47093m mVar) {
        this.f114004V.mo7350a(mVar);
        if (!mVar.f118902a) {
            mo91323a(0);
        }
    }

    /* renamed from: c */
    public final int mo91357c(boolean z) {
        C47093m mVar;
        if (mo91315U() == 1) {
            mVar = C47093m.m102239b();
        } else {
            mVar = C47093m.m102238a();
        }
        mVar.f118903b = z;
        return mo91321a(mVar);
    }

    /* renamed from: d */
    public final boolean mo91360d(boolean z) {
        C20420b bVar = this.f114041s.f112405f.f56318e;
        if (bVar == null) {
            C52711k.m112237a("recorder");
        }
        return bVar.mo43253b().mo43372i().mo43433c(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo91395e(int i) {
        C47349x xVar = new C47349x(mo91313S());
        xVar.f119500b = i;
        if (this.f114038p != null) {
            mo91334a(xVar);
        }
    }

    /* renamed from: a */
    public final void mo91323a(int i) {
        this.f114041s.mo90309a(i);
        this.f114002T.mo7350a(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo91355b(boolean z) {
        this.f114000R.mo7350a(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo91358c(int i) {
        if (C45474a.m99107a(this.f114040r)) {
            C45475b bVar = new C45475b(this.f114038p);
            bVar.mo91753a(R.raw.shutter_sound_shoot, bVar.f114899a.getStreamMaxVolume(3), bVar.f114899a.getStreamVolume(3), new C45033l(this, i));
            return;
        }
        mo91395e(i);
    }

    /* renamed from: e */
    public final void mo91361e(boolean z) {
        int i;
        C20455b bVar = this.f114041s.f112404e;
        AppCompatActivity appCompatActivity = this.f114038p;
        C20455b.f56086d = z;
        C20391c a = C20391c.m50589a(bVar.f56089e);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        a.mo43224b(i);
        bVar.mo43399a(z);
        mo91352b(0);
        this.f114010ab.mo7350a(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo91383a(long j) {
        long j2;
        if (this.f114042t.f107122o) {
            j2 = this.f114042t.f107121n;
        } else {
            j2 = this.f114042t.f107120m;
        }
        if (j > 0) {
            j2 += TimeSpeedModelExtension.calculateRealTime(j, (double) this.f114037o.value());
        }
        this.f114029g.mo7350a(C47337r.m102705a(this.f114042t.mo86375p(), j2));
    }

    /* renamed from: a */
    public final void mo91327a(C46807aa aaVar) {
        C45182h hVar = this.f114018aj;
        if (hVar.f114312f == null) {
            hVar.f114312f = new C43807fb(hVar.f114307a, hVar.f114309c, hVar.f114310d);
        }
        hVar.f114312f.onEvent(aaVar);
    }

    /* renamed from: a */
    public final void mo91384a(C46938d dVar) {
        this.f114018aj.mo91384a(dVar);
    }

    /* renamed from: a */
    public final void mo91385a(C47063h hVar) {
        this.f114018aj.mo91385a(hVar);
    }

    /* renamed from: a */
    public final void mo91322a(float f, float f2) {
        if (this.f114041s.mo90311a((View) this.f114039q, f, f2)) {
            this.f114040r.mo43624a((int) f, (int) f2);
        }
    }

    /* renamed from: b */
    public final void mo91351b(float f, float f2) {
        float f3 = f + 100.0f;
        this.f114041s.f112403d = false;
        if (f3 >= 0.0f) {
            C42429as.m93194a(this.f114038p, f2);
            AppCompatActivity appCompatActivity = this.f114038p;
            C52711k.m112240b(appCompatActivity, "context");
            float b = (f3 - C9432q.m18687b((Context) appCompatActivity, 35.0f)) / C42429as.m93194a(appCompatActivity, f2);
            if (((double) b) > 0.98d) {
                b = 1.0f;
            }
            CameraModule cameraModule = this.f114041s;
            cameraModule.f112403d = true;
            cameraModule.mo90313c();
            if (!cameraModule.mo90314d()) {
                C20420b bVar = cameraModule.f112405f.f56318e;
                if (bVar == null) {
                    C52711k.m112237a("recorder");
                }
                bVar.mo43253b().mo43364c(b);
            }
        }
    }

    /* renamed from: b */
    public final void mo91356b(boolean z, boolean z2) {
        C45016ah ahVar;
        if (z) {
            ahVar = C45016ah.FORM_60S;
        } else {
            ahVar = C45016ah.FORM_15S;
        }
        mo91326a(ahVar, z2);
        this.f114042t.f107088an = !z2;
    }

    /* renamed from: a */
    public final void mo91326a(C45016ah ahVar, boolean z) {
        boolean z2;
        C2765i<C46808ab> iVar = this.f114008Z;
        if (ahVar == C45016ah.FORM_60S) {
            z2 = true;
        } else {
            z2 = false;
        }
        iVar.mo7350a(new C46808ab(z2, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0263, code lost:
        if (r4 != false) goto L_0x0267;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x03b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C45017b(com.bytedance.p780m.C12361b r13, com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23524d<org.json.JSONObject> r14) {
        /*
            r12 = this;
            r12.<init>()
            com.bytedance.als.j r0 = new com.bytedance.als.j
            r1 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r2)
            r12.f114025c = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f113999Q = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114026d = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114000R = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114027e = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114001S = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114028f = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114002T = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114003U = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114004V = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114005W = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114029g = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114006X = r0
            com.bytedance.als.j r0 = new com.bytedance.als.j
            r2 = 0
            r0.<init>(r2)
            r12.f114030h = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114031i = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114007Y = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114008Z = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114032j = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114033k = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114009aa = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114010ab = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114011ac = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114012ad = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114034l = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114035m = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114013ae = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114036n = r0
            com.bytedance.als.i r0 = new com.bytedance.als.i
            r0.<init>()
            r12.f114014af = r0
            com.bytedance.als.j r0 = new com.bytedance.als.j
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r0.<init>(r3)
            r12.f114015ag = r0
            com.ss.android.ugc.aweme.tools.t r0 = com.p683ss.android.ugc.aweme.tools.C47339t.NORMAL
            r12.f114037o = r0
            com.ss.android.ugc.aweme.base.SafeHandler r0 = new com.ss.android.ugc.aweme.base.SafeHandler
            r0.<init>(r12)
            r12.f114045w = r0
            r0 = 1
            r12.f114047y = r0
            r12.f114048z = r1
            r12.f113983A = r1
            r12.f113984B = r0
            r3 = 1280(0x500, float:1.794E-42)
            r12.f113985C = r3
            r3 = 720(0x2d0, float:1.009E-42)
            r12.f113986D = r3
            r12.f113988F = r1
            r12.f113990H = r1
            r12.f114019ak = r1
            r12.f114020al = r1
            com.ss.android.ugc.aweme.shortvideo.ui.t r3 = new com.ss.android.ugc.aweme.shortvideo.ui.t
            com.ss.android.ugc.aweme.base.SafeHandler r4 = r12.f114045w
            com.ss.android.ugc.aweme.shortvideo.ui.b.b$2 r5 = new com.ss.android.ugc.aweme.shortvideo.ui.b.b$2
            r5.<init>()
            r3.<init>(r4, r5)
            r12.f113994L = r3
            r12.f113995M = r1
            r12.f113996N = r1
            com.ss.android.ugc.aweme.shortvideo.ui.b.b$3 r3 = new com.ss.android.ugc.aweme.shortvideo.ui.b.b$3
            r3.<init>()
            r12.f113997O = r3
            r12.f113998P = r2
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            r12.f114022an = r3
            com.bytedance.als.i r3 = new com.bytedance.als.i
            r3.<init>()
            r12.f114023ao = r3
            r12.f114024b = r13
            com.bytedance.m.b r3 = r12.f114024b
            java.lang.Class<android.support.v7.app.AppCompatActivity> r4 = android.support.p043v7.app.AppCompatActivity.class
            java.lang.Object r3 = r3.mo23372a(r4)
            android.support.v7.app.AppCompatActivity r3 = (android.support.p043v7.app.AppCompatActivity) r3
            r12.f114038p = r3
            com.bytedance.m.b r3 = r12.f114024b
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContext> r4 = com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext.class
            java.lang.Object r3 = r3.mo23372a(r4)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = (com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext) r3
            r12.f114042t = r3
            r12.f114021am = r14
            com.ss.android.ugc.aweme.shortvideo.ui.b.c r3 = new com.ss.android.ugc.aweme.shortvideo.ui.b.c
            r3.<init>(r12)
            d.f r3 = p2628d.C52732g.m112285a(r3)
            r12.f113992J = r3
            com.ss.android.ugc.aweme.shortvideo.ui.b.d r3 = new com.ss.android.ugc.aweme.shortvideo.ui.b.d
            r3.<init>(r12)
            d.f r3 = p2628d.C52732g.m112285a(r3)
            r12.f113993K = r3
            com.ss.android.ugc.aweme.property.h r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r4 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.OptimizeEffectRenderFirstFrame
            boolean r3 = r3.mo83103a(r4)
            r12.f114020al = r3
            boolean r3 = r12.f114020al
            if (r3 == 0) goto L_0x01a7
            com.ss.android.ugc.aweme.tools.beauty.c.f r3 = new com.ss.android.ugc.aweme.tools.beauty.c.f
            java.lang.String r4 = ""
            r3.<init>(r4)
            com.bytedance.keva.Keva r4 = com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46864f.f118403b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r3.f118405a
            r5.append(r6)
            java.lang.String r6 = "key_need_face_detect"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            boolean r4 = r4.getBoolean(r5, r1)
            if (r4 == 0) goto L_0x01a3
            com.bytedance.keva.Keva r5 = com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46864f.f118403b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r3 = r3.f118405a
            r6.append(r3)
            java.lang.String r3 = "key_need_face_detect"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r5.storeBoolean(r3, r1)
        L_0x01a3:
            if (r4 == 0) goto L_0x01a7
            r3 = 1
            goto L_0x01a8
        L_0x01a7:
            r3 = 0
        L_0x01a8:
            r12.f114019ak = r3
            com.ss.android.ugc.asve.recorder.view.ASCameraView r3 = new com.ss.android.ugc.asve.recorder.view.ASCameraView
            android.support.v7.app.AppCompatActivity r4 = r12.f114038p
            r3.<init>(r4)
            r12.f114040r = r3
            android.view.SurfaceView r3 = new android.view.SurfaceView
            android.support.v7.app.AppCompatActivity r4 = r12.f114038p
            r3.<init>(r4)
            r12.f114039q = r3
            com.ss.android.ugc.asve.recorder.view.ASCameraView r3 = r12.f114040r
            android.view.SurfaceView r4 = r12.f114039q
            r3.addView(r4)
            com.ss.android.ugc.aweme.shortvideo.fw r3 = new com.ss.android.ugc.aweme.shortvideo.fw
            r3.<init>()
            com.ss.android.vesdk.h r3 = com.p683ss.android.ugc.aweme.shortvideo.C43854fw.m96287a()
            com.p683ss.android.ugc.aweme.port.p2082in.C39618d.m88210a(r3)
            com.ss.android.ugc.aweme.property.l r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r4 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EffectSdkConfigSettings
            java.lang.String r3 = r3.mo83121e(r4)
            com.p683ss.android.medialib.VideoSdkCore.setEffectJsonConfig(r3)
            com.p683ss.android.vesdk.runtime.VEEffectConfig.setEffectJsonConfig(r3)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r12.f114042t
            com.ss.android.ugc.aweme.property.h r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r5 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableSingleSegmentConcatUseCopy
            boolean r4 = r4.mo83103a(r5)
            r3.f107038Q = r4
            com.ss.android.ugc.asve.recorder.view.ASCameraView r3 = r12.f114040r
            r3.f56315b = r12
            dmt.av.video.c.d r3 = new dmt.av.video.c.d
            android.support.v7.app.AppCompatActivity r5 = r12.f114038p
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r6 = r12.f114042t
            android.support.v7.app.AppCompatActivity r4 = r12.f114038p
            com.ss.android.ugc.aweme.property.l r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r8 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.WideCameraInfo
            int r7 = r7.mo83118b(r8)
            int r4 = com.p683ss.android.ugc.asve.recorder.camera.C20453a.m50910a(r4, r7, r0)
            com.ss.android.ugc.aweme.property.l r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r8 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.ShakeFreeWhiteList
            int r7 = r7.mo83118b(r8)
            int r7 = com.p683ss.android.ugc.asve.recorder.camera.p1246a.C20455b.m50913a(r7)
            r8 = -1
            if (r4 == r0) goto L_0x028d
            r9 = 3
            if (r7 != r9) goto L_0x0215
            goto L_0x028d
        L_0x0215:
            if (r4 == r9) goto L_0x028a
            if (r7 != r0) goto L_0x021b
            goto L_0x028a
        L_0x021b:
            r9 = 2
            if (r7 != r9) goto L_0x0222
            com.ss.android.ugc.asve.b.e r4 = com.p683ss.android.ugc.asve.p1238b.C20323e.AS_CAMERA_OPPO
            goto L_0x028f
        L_0x0222:
            r10 = 5
            if (r4 == r10) goto L_0x0287
            if (r7 != r10) goto L_0x0228
            goto L_0x0287
        L_0x0228:
            if (r4 != r9) goto L_0x022f
            com.ss.android.ugc.asve.b.e r4 = com.p683ss.android.ugc.asve.p1238b.C20323e.AS_CAMERA_2
            r7 = 0
            r9 = 0
            goto L_0x0291
        L_0x022f:
            com.ss.android.ugc.aweme.property.l r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r7 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.InCamera2BlackList
            int r4 = r4.mo83118b(r7)
            if (r4 == r0) goto L_0x0266
            com.ss.android.ugc.aweme.property.l r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r7 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.RecordCameraType
            int r4 = r4.mo83118b(r7)
            if (r4 != r9) goto L_0x024b
            com.ss.android.ugc.asve.b.e r4 = com.p683ss.android.ugc.asve.p1238b.C20323e.AS_CAMERA_CHRY_CAMKIT
            int r4 = com.p683ss.android.ugc.asve.p1238b.C20323e.toIntValue(r4)
            r9 = r4
            goto L_0x0267
        L_0x024b:
            com.ss.android.ugc.aweme.property.h r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r7 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecordCameraTypeAB
            int r4 = r4.mo83104b(r7)
            switch(r4) {
                case 0: goto L_0x0266;
                case 1: goto L_0x0267;
                default: goto L_0x0256;
            }
        L_0x0256:
            com.ss.android.ugc.aweme.property.l r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r7 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.RecordCameraType
            int r4 = r4.mo83118b(r7)
            if (r4 != r0) goto L_0x0262
            r4 = 1
            goto L_0x0263
        L_0x0262:
            r4 = 0
        L_0x0263:
            if (r4 == 0) goto L_0x0266
            goto L_0x0267
        L_0x0266:
            r9 = 1
        L_0x0267:
            com.ss.android.ugc.asve.b.e r4 = com.p683ss.android.ugc.asve.p1238b.C20323e.fromOrdinal(r9)
            com.ss.android.ugc.aweme.property.h r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r9 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecordCameraCompatLevelAB
            int r7 = r7.mo83104b(r9)
            if (r7 != r8) goto L_0x027e
            com.ss.android.ugc.aweme.property.l r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r9 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.RecordCameraCompatLevel
            int r7 = r7.mo83118b(r9)
            goto L_0x0290
        L_0x027e:
            com.ss.android.ugc.aweme.property.h r7 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r9 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RecordCameraCompatLevelAB
            int r7 = r7.mo83104b(r9)
            goto L_0x0290
        L_0x0287:
            com.ss.android.ugc.asve.b.e r4 = com.p683ss.android.ugc.asve.p1238b.C20323e.AS_CAMERA_VIVO
            goto L_0x028f
        L_0x028a:
            com.ss.android.ugc.asve.b.e r4 = com.p683ss.android.ugc.asve.p1238b.C20323e.AS_CAMERA_MI
            goto L_0x028f
        L_0x028d:
            com.ss.android.ugc.asve.b.e r4 = com.p683ss.android.ugc.asve.p1238b.C20323e.AS_CAMERA_CHRY
        L_0x028f:
            r7 = 0
        L_0x0290:
            r9 = 1
        L_0x0291:
            com.ss.android.ugc.aweme.property.h r10 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r11 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableExposureOptimize
            boolean r10 = r10.mo83103a(r11)
            if (r10 == 0) goto L_0x02a4
            com.ss.android.ugc.asve.b.o r8 = com.p683ss.android.ugc.asve.p1238b.C20336o.AS_OPTION_FLAG_PICTURE_SIZE
            byte r8 = r8.getOption()
            r8 = r8 | r1
            byte r8 = (byte) r8
            goto L_0x02ad
        L_0x02a4:
            com.ss.android.ugc.asve.b.o r10 = com.p683ss.android.ugc.asve.p1238b.C20336o.AS_OPTION_FLAG_PICTURE_SIZE
            byte r10 = r10.getOption()
            r8 = r8 ^ r10
            r8 = r8 & r1
            byte r8 = (byte) r8
        L_0x02ad:
            com.ss.android.ugc.aweme.property.h r10 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r11 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.CameraOptionFlagsOpt
            boolean r10 = r10.mo83103a(r11)
            if (r10 == 0) goto L_0x02ba
            r8 = r8 | 8
            byte r8 = (byte) r8
        L_0x02ba:
            com.ss.android.ugc.aweme.shortvideo.util.u$1 r10 = new com.ss.android.ugc.aweme.shortvideo.util.u$1
            r10.<init>(r4, r7, r9, r8)
            r8 = 0
            android.support.v7.app.AppCompatActivity r4 = r12.f114038p
            boolean r9 = com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2243a.C44939a.m98279a(r4)
            r4 = r3
            r7 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.shortvideo.ui.b.b$a r4 = new com.ss.android.ugc.aweme.shortvideo.ui.b.b$a
            r4.<init>()
            r3.f131324d = r4
            boolean r4 = r12.f114020al
            if (r4 == 0) goto L_0x02e3
            r3.f131322b = r0
            boolean r4 = r12.f114019ak
            if (r4 == 0) goto L_0x02df
            r4 = 1
            goto L_0x02e1
        L_0x02df:
            r4 = 0
        L_0x02e1:
            r3.f131323c = r4
        L_0x02e3:
            com.ss.android.ugc.asve.recorder.view.ASCameraView r4 = r12.f114040r
            java.lang.String r5 = "recorderContext"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r5)
            r5 = r4
            com.ss.android.ugc.asve.recorder.view.ASCameraView r5 = (com.p683ss.android.ugc.asve.recorder.view.ASCameraView) r5
            android.arch.lifecycle.k r5 = r5.f56315b
            if (r5 == 0) goto L_0x02f3
            r5 = 1
            goto L_0x02f4
        L_0x02f3:
            r5 = 0
        L_0x02f4:
            if (r5 == 0) goto L_0x03b4
            com.ss.android.ugc.asve.recorder.view.ASCameraView$k r5 = new com.ss.android.ugc.asve.recorder.view.ASCameraView$k
            r5.<init>(r4, r3)
            com.ss.android.ugc.asve.context.h r5 = (com.p683ss.android.ugc.asve.context.C20363h) r5
            android.arch.lifecycle.k r3 = r4.f56315b
            if (r3 != 0) goto L_0x0306
            java.lang.String r6 = "lifecycleOwner"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0306:
            com.ss.android.ugc.asve.recorder.b r3 = com.p683ss.android.ugc.asve.recorder.C20420b.C20421a.m50673a(r3, r5)
            r4.f56318e = r3
            android.view.TextureView r5 = r4.f56316c
            if (r5 == 0) goto L_0x0314
            android.view.TextureView$SurfaceTextureListener r2 = r5.getSurfaceTextureListener()
        L_0x0314:
            android.view.TextureView r5 = r4.f56316c
            if (r5 == 0) goto L_0x0322
            com.ss.android.ugc.asve.recorder.view.ASCameraView$f r6 = new com.ss.android.ugc.asve.recorder.view.ASCameraView$f
            r6.<init>(r2, r3)
            android.view.TextureView$SurfaceTextureListener r6 = (android.view.TextureView.SurfaceTextureListener) r6
            r5.setSurfaceTextureListener(r6)
        L_0x0322:
            com.ss.android.ugc.asve.recorder.b r2 = r4.f56318e
            if (r2 != 0) goto L_0x032b
            java.lang.String r3 = "recorder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x032b:
            d.f.a.q<java.lang.Integer, java.lang.Integer, java.lang.String, d.x> r3 = r4.f56320g
            r2.mo43252a(r3)
            com.ss.android.ugc.asve.recorder.view.ASCameraView r2 = r12.f114040r
            com.ss.android.ugc.aweme.port.in.u r3 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101144H
            com.ss.android.ugc.aweme.property.l r3 = r3.mo58574e()
            com.ss.android.ugc.aweme.property.l$a r4 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnableUseEffect
            boolean r3 = r3.mo83117a(r4)
            com.ss.android.ugc.asve.recorder.b r2 = r2.f56318e
            if (r2 != 0) goto L_0x0347
            java.lang.String r4 = "recorder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0347:
            com.ss.android.ugc.asve.recorder.effect.b r2 = r2.mo43256d()
            r2.mo43532i(r3)
            com.ss.android.ugc.asve.recorder.view.ASCameraView r2 = r12.f114040r
            com.ss.android.ugc.aweme.shortvideo.ui.b.s r3 = new com.ss.android.ugc.aweme.shortvideo.ui.b.s
            r3.<init>(r12)
            r2.setDataSourceVideoCompleteListener(r3)
            com.ss.android.ugc.aweme.port.in.be r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101174o
            java.lang.String r3 = "key_first_use_camera"
            boolean r2 = r2.mo74237a(r3, r0)
            if (r2 == 0) goto L_0x0382
            com.ss.android.ugc.aweme.port.in.be r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101174o
            java.lang.String r3 = "key_first_use_camera"
            r2.mo74240b(r3, r1)
            com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r3 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.RearCamera
            boolean r2 = r2.mo83103a(r3)
            if (r2 == 0) goto L_0x037b
            com.ss.android.ugc.aweme.property.l r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.CameraPosition
            r0.mo83113a(r2, r1)
            goto L_0x0382
        L_0x037b:
            com.ss.android.ugc.aweme.property.l r1 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101151O
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.CameraPosition
            r1.mo83113a(r2, r0)
        L_0x0382:
            com.ss.android.ugc.aweme.shortvideo.record.CameraModule r0 = new com.ss.android.ugc.aweme.shortvideo.record.CameraModule
            java.lang.Class<android.support.v7.app.AppCompatActivity> r1 = android.support.p043v7.app.AppCompatActivity.class
            java.lang.Object r13 = r13.mo23372a(r1)
            r4 = r13
            android.support.v7.app.AppCompatActivity r4 = (android.support.p043v7.app.AppCompatActivity) r4
            com.ss.android.ugc.aweme.shortvideo.record.CameraModule$a r5 = r12.f113997O
            com.ss.android.ugc.asve.recorder.view.ASCameraView r7 = r12.f114040r
            r3 = r0
            r6 = r14
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r12.f114041s = r0
            com.ss.android.ugc.asve.recorder.view.ASCameraView r13 = r12.f114040r
            com.ss.android.ugc.asve.recorder.effect.b r13 = r13.getEffectController()
            com.ss.android.ugc.aweme.shortvideo.t.g r14 = new com.ss.android.ugc.aweme.shortvideo.t.g
            r14.<init>(r13)
            r12.f114043u = r14
            com.ss.android.ugc.aweme.shortvideo.ui.h r13 = new com.ss.android.ugc.aweme.shortvideo.ui.h
            android.support.v7.app.AppCompatActivity r14 = r12.f114038p
            com.ss.android.ugc.asve.recorder.view.ASCameraView r0 = r12.f114040r
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r12.f114042t
            r13.<init>(r14, r0, r12, r1)
            r12.f114018aj = r13
            return
        L_0x03b4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "must set lifecycleOwner before start"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45017b.<init>(com.bytedance.m.b, com.ss.android.ugc.aweme.base.d.a.d):void");
    }

    /* renamed from: a */
    public final void mo91324a(C44878a aVar, float f, C31405ah ahVar) {
        int i;
        float f2;
        C31459g gVar;
        C44885g gVar2 = this.f114043u;
        int c = C44885g.m98094c(f);
        int i2 = aVar.f113580b;
        if (c == -1) {
            i = i2 - 1;
            if (i < 0) {
                i = 0;
            }
        } else {
            int i3 = i2;
            i2 = Math.max(Math.min(C39618d.f101144H.mo58584o().mo64333c().mo64347b().size() - 1, i2 + 1), 0);
            i = i3;
        }
        C31454c c2 = C39618d.f101144H.mo58584o().mo64333c();
        String c3 = c2.mo64349c(i);
        String c4 = c2.mo64349c(i2);
        if (gVar2.f113589d == 2) {
            if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(C43307ea.f109504q);
                sb.append("beautify_filter");
                c3 = sb.toString();
            }
            if (i2 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C43307ea.f109504q);
                sb2.append("beautify_filter");
                c4 = sb2.toString();
            }
        }
        String str = c4;
        String str2 = c3;
        if (f < 0.0f) {
            f2 = Math.abs(f);
        } else {
            f2 = 1.0f - f;
        }
        gVar2.f113588c = aVar;
        List b = C39618d.f101144H.mo58584o().mo64333c().mo64347b();
        C31459g gVar3 = null;
        if (i2 < b.size()) {
            gVar = (C31459g) b.get(i2);
        } else {
            gVar = null;
        }
        if (i < b.size()) {
            gVar3 = (C31459g) b.get(i);
        }
        if (gVar != null && gVar3 != null) {
            C20489b bVar = gVar2.f113586a;
            C20489b bVar2 = gVar2.f113586a;
            bVar2.getClass();
            float a = C31460h.m73279a(gVar, ahVar, (C31406ai) new C44887h(bVar2));
            C20489b bVar3 = gVar2.f113586a;
            bVar3.getClass();
            bVar.mo43474a(str2, str, f2, a, C31460h.m73279a(gVar3, ahVar, (C31406ai) new C44888i(bVar3)));
        }
    }
}
