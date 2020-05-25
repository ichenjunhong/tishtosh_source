package com.p683ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.medialib.model.EnigmaResult;
import com.p683ss.android.medialib.presenter.C19378e;
import com.p683ss.android.medialib.presenter.IStickerRequestCallback;
import com.p683ss.android.ttve.model.C20094a;
import com.p683ss.android.ttve.model.C20095b;
import com.p683ss.android.ttve.model.C20096c;
import com.p683ss.android.ttve.model.C20097d;
import com.p683ss.android.ttve.model.C20098e;
import com.p683ss.android.vesdk.C50601ah.C50612a;
import com.p683ss.android.vesdk.C50601ah.C50613b;
import com.p683ss.android.vesdk.C50601ah.C50614c;
import com.p683ss.android.vesdk.C50601ah.C50615d;
import com.p683ss.android.vesdk.C50601ah.C50617f;
import com.p683ss.android.vesdk.C50601ah.C50619g;
import com.p683ss.android.vesdk.C50601ah.C50620h;
import com.p683ss.android.vesdk.C50601ah.C50621i;
import com.p683ss.android.vesdk.C50601ah.C50622j;
import com.p683ss.android.vesdk.C50601ah.C50623k;
import com.p683ss.android.vesdk.C50601ah.C50624l;
import com.p683ss.android.vesdk.C50601ah.C50626n;
import com.p683ss.android.vesdk.C50601ah.C50627o;
import com.p683ss.android.vesdk.VEListener.C50539c;
import com.p683ss.android.vesdk.VEListener.C50540d;
import com.p683ss.android.vesdk.VEListener.C50542f;
import com.p683ss.android.vesdk.VEListener.C50543g;
import com.p683ss.android.vesdk.VEListener.C50558v;
import com.p683ss.android.vesdk.VEListener.C50560x;
import com.p683ss.android.vesdk.p2531a.C50589a;
import com.p683ss.android.vesdk.p2531a.C50590b;
import com.p683ss.android.vesdk.p2535e.C50688c;
import com.p683ss.android.vesdk.runtime.C50771d;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vesdk.f */
public abstract class C50690f {

    /* renamed from: A */
    C50771d f127124A;

    /* renamed from: B */
    public C50560x f127125B;

    /* renamed from: C */
    C50543g f127126C;

    /* renamed from: D */
    public C50540d f127127D;

    /* renamed from: E */
    C50619g f127128E;

    /* renamed from: F */
    public C50558v f127129F;

    /* renamed from: G */
    C50622j f127130G;

    /* renamed from: H */
    C50621i f127131H;

    /* renamed from: I */
    C50623k f127132I;

    /* renamed from: J */
    C2593a f127133J;

    /* renamed from: K */
    C50612a f127134K;

    /* renamed from: L */
    C50620h f127135L;

    /* renamed from: M */
    C50617f f127136M;

    /* renamed from: N */
    C50626n f127137N;

    /* renamed from: O */
    C50588a<C50627o> f127138O = new C50588a<>();

    /* renamed from: P */
    C50624l f127139P;

    /* renamed from: Q */
    C50539c f127140Q;

    /* renamed from: R */
    IStickerRequestCallback f127141R;

    /* renamed from: S */
    public VECameraSettings f127142S;

    /* renamed from: T */
    VEVideoEncodeSettings f127143T;

    /* renamed from: U */
    VEAudioEncodeSettings f127144U;

    /* renamed from: V */
    String f127145V;

    /* renamed from: W */
    public boolean f127146W;

    /* renamed from: X */
    C50719n f127147X;

    /* renamed from: Y */
    C50599af f127148Y;

    /* renamed from: Z */
    public C50600ag f127149Z = C50600ag.DEFAULT;

    /* renamed from: aA */
    public float f127150aA = 0.0f;

    /* renamed from: aB */
    public int f127151aB = 0;

    /* renamed from: aC */
    public float f127152aC = 0.0f;

    /* renamed from: aD */
    public int f127153aD = 0;

    /* renamed from: aE */
    public int f127154aE = 0;

    /* renamed from: aF */
    public int f127155aF = 0;

    /* renamed from: aG */
    public float f127156aG = 0.0f;

    /* renamed from: aa */
    String f127157aa;

    /* renamed from: ab */
    long f127158ab;

    /* renamed from: ac */
    long f127159ac;

    /* renamed from: ad */
    int f127160ad;

    /* renamed from: ae */
    int f127161ae = C50594ac.RADIO_FULL.ordinal();

    /* renamed from: af */
    VESize f127162af = null;

    /* renamed from: ag */
    boolean f127163ag = false;

    /* renamed from: ah */
    C20094a f127164ah = new C20094a();

    /* renamed from: ai */
    C20095b f127165ai = new C20095b();

    /* renamed from: aj */
    C20097d f127166aj = new C20097d();

    /* renamed from: ak */
    C20098e f127167ak = new C20098e();

    /* renamed from: al */
    C20096c f127168al = new C20096c();

    /* renamed from: am */
    C50636ap f127169am = new C50636ap();

    /* renamed from: an */
    public boolean f127170an;

    /* renamed from: ao */
    boolean f127171ao = false;

    /* renamed from: ap */
    VESize f127172ap = new VESize(0, 0);

    /* renamed from: aq */
    VESize f127173aq = new VESize(1280, 720);

    /* renamed from: ar */
    float f127174ar = 0.125f;

    /* renamed from: as */
    float f127175as = 0.125f;

    /* renamed from: at */
    public boolean f127176at = false;

    /* renamed from: au */
    boolean f127177au;

    /* renamed from: av */
    VEWatermarkParam f127178av;

    /* renamed from: aw */
    boolean f127179aw = false;

    /* renamed from: ax */
    public int f127180ax = 0;

    /* renamed from: ay */
    public int f127181ay = 0;

    /* renamed from: az */
    public int f127182az = 0;

    /* renamed from: y */
    Context f127183y;

    /* renamed from: z */
    public C50688c f127184z;

    /* renamed from: a */
    public abstract int mo98911a(double d, double d2, double d3, double d4);

    /* renamed from: a */
    public abstract int mo98913a(float f, float f2);

    /* renamed from: a */
    public abstract int mo98914a(float f, float f2, float f3, float f4, float f5);

    /* renamed from: a */
    public abstract int mo98915a(int i, float f);

    /* renamed from: a */
    public abstract int mo98916a(int i, float f, float f2, int i2);

    /* renamed from: a */
    public abstract int mo98917a(int i, String str);

    /* renamed from: a */
    public int mo99064a(Bitmap bitmap) {
        return -1;
    }

    /* renamed from: a */
    public abstract int mo98918a(VEEffectParams vEEffectParams);

    /* renamed from: a */
    public abstract int mo98919a(C50614c cVar);

    /* renamed from: a */
    public abstract int mo98920a(C50615d dVar);

    /* renamed from: a */
    public abstract int mo98921a(String str);

    /* renamed from: a */
    public abstract int mo98922a(String str, float f);

    /* renamed from: a */
    public abstract int mo98923a(String str, float f, float f2);

    /* renamed from: a */
    public abstract int mo98924a(String str, float f, boolean z);

    /* renamed from: a */
    public abstract int mo98925a(String str, int i, int i2, String str2);

    /* renamed from: a */
    public abstract int mo98926a(String str, int i, int i2, boolean z, String str2);

    /* renamed from: a */
    public abstract int mo98927a(String str, int i, int i2, boolean z, boolean z2, CompressFormat compressFormat, C50613b bVar, boolean z3);

    /* renamed from: a */
    public abstract int mo98929a(String str, String str2, int i, String str3, String str4, int i2);

    /* renamed from: a */
    public abstract int mo98930a(String str, Map<Integer, Float> map);

    /* renamed from: a */
    public abstract int mo98932a(Map<Integer, Float> map);

    /* renamed from: a */
    public abstract int mo98933a(boolean z, boolean z2, boolean z3, boolean z4);

    /* renamed from: a */
    public abstract int mo98934a(double[] dArr, double d);

    /* renamed from: a */
    public abstract int mo98935a(String[] strArr, int i);

    /* renamed from: a */
    public abstract String mo98936a();

    /* renamed from: a */
    public abstract void mo98937a(double d);

    /* renamed from: a */
    public abstract void mo98938a(float f, float f2, float f3);

    /* renamed from: a */
    public abstract void mo98939a(float f, float f2, float f3, float f4);

    /* renamed from: a */
    public abstract void mo98941a(int i, float f, VESize vESize, VESize vESize2);

    /* renamed from: a */
    public abstract void mo98942a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract void mo98943a(int i, long j, long j2, String str);

    /* renamed from: a */
    public abstract void mo98946a(IStickerRequestCallback iStickerRequestCallback);

    /* renamed from: a */
    public abstract void mo98947a(VECherEffectParam vECherEffectParam);

    /* renamed from: a */
    public abstract void mo98954a(Runnable runnable);

    /* renamed from: a */
    public abstract void mo98955a(String str, String str2);

    /* renamed from: a */
    public abstract void mo98956a(String str, String str2, float f);

    /* renamed from: a */
    public abstract void mo98957a(String str, String str2, float f, float f2, float f3);

    /* renamed from: a */
    public abstract void mo98958a(String str, String str2, String str3);

    /* renamed from: a */
    public abstract void mo98959a(boolean z, long j);

    /* renamed from: a */
    public abstract void mo98960a(float[] fArr);

    /* renamed from: a */
    public abstract boolean mo98961a(C50634ao aoVar, int i);

    /* renamed from: a */
    public abstract int[] mo98962a(int i, int i2, int i3, int i4, float f);

    /* renamed from: b */
    public abstract int mo98963b(double d, double d2, double d3, double d4);

    /* renamed from: b */
    public abstract int mo98964b(float f);

    /* renamed from: b */
    public abstract int mo98965b(float f, float f2);

    /* renamed from: b */
    public abstract int mo98966b(C50615d dVar);

    /* renamed from: b */
    public abstract int mo98967b(String str);

    /* renamed from: b */
    public abstract int mo98968b(String str, float f, float f2);

    /* renamed from: b */
    public abstract int mo98970b(String[] strArr, int i);

    /* renamed from: b */
    public abstract void mo98971b();

    /* renamed from: b */
    public void mo99072b(int i) {
    }

    /* renamed from: b */
    public abstract void mo98973b(String str, String str2);

    /* renamed from: b */
    public abstract boolean mo98974b(boolean z);

    /* renamed from: c */
    public abstract float mo98975c(String str);

    /* renamed from: c */
    public abstract int mo98976c(double d, double d2, double d3, double d4);

    /* renamed from: c */
    public abstract int mo98977c(float f, float f2);

    /* renamed from: c */
    public abstract int mo98978c(String str, String str2, float f);

    /* renamed from: c */
    public void mo98980c(int i) {
    }

    /* renamed from: c */
    public abstract void mo98981c(int i, int i2);

    /* renamed from: c */
    public abstract void mo98982c(Surface surface);

    /* renamed from: c */
    public abstract void mo98983c(boolean z);

    /* renamed from: c */
    public abstract int[] mo98984c(String str, String str2);

    /* renamed from: d */
    public abstract int mo98987d(float f, float f2);

    /* renamed from: d */
    public abstract int mo98988d(Surface surface);

    /* renamed from: d */
    public abstract int mo98989d(String str);

    /* renamed from: d */
    public abstract int mo98990d(String str, String str2);

    /* renamed from: d */
    public long mo98991d() {
        return 0;
    }

    /* renamed from: d */
    public void mo99075d(int i) {
    }

    /* renamed from: d */
    public abstract void mo98992d(boolean z);

    /* renamed from: d */
    public abstract boolean mo98993d(int i, int i2);

    /* renamed from: e */
    public int mo99076e() {
        return 0;
    }

    /* renamed from: e */
    public abstract int mo98994e(float f, float f2);

    /* renamed from: e */
    public abstract int mo98995e(int i, int i2);

    /* renamed from: e */
    public abstract int mo98996e(String str);

    /* renamed from: e */
    public abstract void mo98997e(boolean z);

    /* renamed from: f */
    public long mo99078f() {
        return 0;
    }

    /* renamed from: f */
    public void mo99079f(String str) {
    }

    /* renamed from: f */
    public abstract void mo98998f(boolean z);

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public abstract int mo98999g(boolean z);

    /* renamed from: g_ */
    public abstract void mo99001g_(boolean z);

    /* renamed from: h */
    public abstract void mo99002h(boolean z);

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public abstract float[] mo99003h();

    /* renamed from: i */
    public abstract void mo99004i();

    /* renamed from: i */
    public abstract void mo99005i(boolean z);

    /* renamed from: j */
    public abstract void mo99006j();

    /* renamed from: j */
    public abstract void mo99007j(boolean z);

    /* renamed from: k */
    public abstract int mo99008k();

    /* renamed from: k */
    public abstract void mo99009k(boolean z);

    /* renamed from: l */
    public abstract void mo99011l();

    /* renamed from: m */
    public abstract void mo99012m(boolean z);

    /* renamed from: m */
    public abstract boolean mo99013m();

    /* renamed from: n */
    public abstract void mo99014n(boolean z);

    /* renamed from: n */
    public abstract int[] mo99015n();

    /* renamed from: o */
    public abstract int mo99016o(boolean z);

    /* renamed from: o */
    public abstract int[] mo99017o();

    /* renamed from: p */
    public abstract float mo99019p();

    /* renamed from: p */
    public abstract void mo99020p(boolean z);

    /* renamed from: q */
    public void mo99021q() {
        this.f127130G = null;
    }

    /* renamed from: q */
    public abstract void mo99022q(boolean z);

    /* renamed from: r */
    public void mo99023r() {
        this.f127131H = null;
    }

    /* renamed from: r */
    public abstract void mo99024r(boolean z);

    /* renamed from: s */
    public abstract EnigmaResult mo99025s();

    /* renamed from: s */
    public void mo99026s(boolean z) {
    }

    /* renamed from: t */
    public abstract C19378e mo99027t();

    /* renamed from: t */
    public abstract void mo99028t(boolean z);

    /* renamed from: v */
    public void mo99084v(boolean z) {
    }

    /* renamed from: w */
    public void mo99085w(boolean z) {
    }

    /* renamed from: a */
    public int mo99066a(C50771d dVar) {
        this.f127124A = dVar;
        return 0;
    }

    /* renamed from: a */
    public void mo98949a(C50617f fVar) {
        this.f127136M = fVar;
    }

    /* renamed from: a */
    public int mo98928a(String str, long j, long j2, int i) {
        this.f127157aa = str;
        this.f127158ab = j;
        this.f127159ac = j2;
        this.f127160ad = i;
        return 0;
    }

    /* renamed from: a */
    public int mo98931a(List<C50632am> list, String str, int i, int i2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo99070a(List<C50632am> list, String str, int i, int i2, C50542f fVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo98944a(Surface surface, C50542f fVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo98948a(C50542f fVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo98940a(float f, C50542f fVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo99069a(String str, String str2, int i, String str3, String str4, C50542f fVar, int i2) {
        fVar.mo43336a(-1);
    }

    /* renamed from: a */
    public void mo98953a(C50636ap apVar) {
        this.f127169am = apVar;
    }

    /* renamed from: a */
    public void mo99067a(C50590b bVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public void mo98952a(C50622j jVar) {
        this.f127130G = jVar;
    }

    /* renamed from: b */
    public void mo99073b(C50622j jVar) {
        this.f127130G = null;
    }

    /* renamed from: a */
    public void mo98951a(C50621i iVar) {
        this.f127131H = iVar;
    }

    /* renamed from: a */
    public void mo98950a(C50620h hVar) {
        this.f127135L = hVar;
    }

    /* renamed from: a */
    public void mo98945a(C2593a aVar) {
        this.f127133J = aVar;
    }

    /* renamed from: a */
    public void mo99068a(C50790w wVar) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    /* renamed from: b */
    public void mo99074b(C50790w wVar) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    /* renamed from: a */
    public void mo99071a(float[] fArr, double d) {
        mo98960a(fArr);
    }

    /* renamed from: c */
    public void mo98979c() {
        throw new UnsupportedOperationException("No longer supported in new refactored version");
    }

    /* renamed from: g */
    public void mo99000g() {
        this.f127126C = null;
        this.f127128E = null;
        this.f127129F = null;
        this.f127125B = null;
        this.f127127D = null;
        this.f127136M = null;
        this.f127130G = null;
        this.f127131H = null;
        this.f127132I = null;
        this.f127134K = null;
        this.f127133J = null;
        this.f127135L = null;
        this.f127137N = null;
        this.f127139P = null;
        this.f127140Q = null;
        this.f127183y = null;
        this.f127184z = null;
    }

    /* renamed from: a */
    public int mo98912a(float f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: u */
    public int mo99081u(boolean z) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }

    /* renamed from: b */
    public void mo98972b(C50542f fVar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public C50690f(Context context, C50771d dVar, C50688c cVar) {
        this.f127183y = context;
        this.f127124A = dVar;
        this.f127184z = cVar;
    }

    /* renamed from: b */
    public int mo98969b(String str, String str2, float f) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /* renamed from: a */
    public int mo99065a(C50589a aVar, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, C50595ad adVar, String str, String str2) {
        throw new UnsupportedOperationException("Not supported yet. Use TECameraVideoRecorder");
    }
}
