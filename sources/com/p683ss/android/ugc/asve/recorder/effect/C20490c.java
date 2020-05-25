package com.p683ss.android.ugc.asve.recorder.effect;

import android.content.Context;
import android.graphics.Bitmap;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p683ss.android.medialib.presenter.C19378e;
import com.p683ss.android.medialib.presenter.IStickerRequestCallback;
import com.p683ss.android.ugc.asve.recorder.effect.composer.C20501c;
import com.p683ss.android.ugc.asve.recorder.effect.composer.C20503e;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20622n;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20818a;
import com.p683ss.android.vesdk.C50601ah;
import com.p683ss.android.vesdk.C50601ah.C50615d;
import com.p683ss.android.vesdk.C50601ah.C50620h;
import com.p683ss.android.vesdk.C50601ah.C50621i;
import com.p683ss.android.vesdk.C50601ah.C50622j;
import com.p683ss.android.vesdk.C50601ah.C50627o;
import com.p683ss.android.vesdk.C50634ao;
import com.p683ss.android.vesdk.C50790w;
import com.p683ss.android.vesdk.VECherEffectParam;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.c */
public final class C20490c implements C20489b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56144a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20490c.class), "recorderComposer", "getRecorderComposer()Lcom/ss/android/ugc/asve/recorder/effect/composer/VERecorderComposer;"))};

    /* renamed from: b */
    public final C50601ah f56145b;

    /* renamed from: d */
    private final C52668f f56146d = C52732g.m112285a(new C20491a(this));

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.c$a */
    static final class C20491a extends C52712l implements C52670a<C20503e> {

        /* renamed from: a */
        final /* synthetic */ C20490c f56147a;

        C20491a(C20490c cVar) {
            this.f56147a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C20503e(this.f56147a.f56145b);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.c$b */
    static final class C20492b implements C50620h {

        /* renamed from: a */
        final /* synthetic */ OnCherEffectParmaCallback f56148a;

        C20492b(OnCherEffectParmaCallback onCherEffectParmaCallback) {
            this.f56148a = onCherEffectParmaCallback;
        }

        /* renamed from: a */
        public final void mo43538a(String[] strArr, double[] dArr, boolean[] zArr) {
            this.f56148a.onCherEffect(strArr, dArr, zArr);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.c$c */
    public static final class C20493c implements C50615d {

        /* renamed from: a */
        final /* synthetic */ OnARTextCountCallback f56149a;

        /* renamed from: a */
        public final void mo43540a(String[] strArr) {
        }

        C20493c(OnARTextCountCallback onARTextCountCallback) {
            this.f56149a = onARTextCountCallback;
        }

        /* renamed from: a */
        public final void mo43539a(int i) {
            this.f56149a.onResult(i);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.c$d */
    public static final class C20494d implements C50615d {

        /* renamed from: a */
        final /* synthetic */ OnARTextContentCallback f56150a;

        /* renamed from: a */
        public final void mo43539a(int i) {
        }

        C20494d(OnARTextContentCallback onARTextContentCallback) {
            this.f56150a = onARTextContentCallback;
        }

        /* renamed from: a */
        public final void mo43540a(String[] strArr) {
            this.f56150a.onResult(strArr);
        }
    }

    /* renamed from: g */
    private final C20503e m51274g() {
        return (C20503e) this.f56146d.getValue();
    }

    /* renamed from: a */
    public final int mo43442a(int i, int i2) {
        return -1;
    }

    /* renamed from: a */
    public final void mo43479a(boolean z) {
    }

    /* renamed from: b */
    public final void mo43491b(int i) {
    }

    /* renamed from: b */
    public final void mo43492b(Context context) {
        C52711k.m112240b(context, "context");
    }

    /* renamed from: e */
    public final void mo43520e(int i) {
    }

    /* renamed from: b */
    public final void mo43496b(String str, float f) {
        this.f56145b.mo98764a(str, f);
    }

    /* renamed from: a */
    public final void mo43474a(String str, String str2, float f, float f2, float f3) {
        this.f56145b.mo98812a(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final void mo43458a(int i, String str, float f, float f2) {
        C52711k.m112240b(str, "strBeautyFaceRes");
        mo43457a(i, str);
        mo43525f(f, f2);
    }

    /* renamed from: a */
    public final void mo43457a(int i, String str) {
        C52711k.m112240b(str, "strBeautyFaceRes");
        this.f56145b.mo98757a(i, str);
    }

    /* renamed from: a */
    public final void mo43451a(float f) {
        this.f56145b.mo98755a(2, f);
    }

    /* renamed from: a */
    public final void mo43478a(Map<Integer, Float> map) {
        C52711k.m112240b(map, "intensityDict");
        this.f56145b.mo98772a(map);
    }

    /* renamed from: a */
    public final void mo43475a(String str, Map<Integer, Float> map) {
        C52711k.m112240b(str, "resourcePath");
        C52711k.m112240b(map, "intensityDict");
        this.f56145b.mo98770a(str, map);
    }

    /* renamed from: a */
    public final void mo43473a(String str, String str2, float f) {
        this.f56145b.mo98811a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo43460a(Context context, String str, String str2, String str3) {
        this.f56145b.mo98813a(str, str2, str3);
    }

    /* renamed from: a */
    public final void mo43468a(C50627o oVar) {
        C52711k.m112240b(oVar, "slamDetectListener");
        this.f56145b.mo98836b(oVar);
    }

    /* renamed from: a */
    public final void mo43480a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        String str2 = str;
        C52711k.m112240b(str2, "phoneParamPath");
        this.f56145b.mo98773a(z, i, z2, z3, z4, z5, str2);
    }

    /* renamed from: a */
    public final void mo43481a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f56145b.mo98774a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final void mo43482a(double[] dArr, double d) {
        C52711k.m112240b(dArr, "wRbs");
        this.f56145b.mo98775a(dArr, d);
    }

    /* renamed from: a */
    public final void mo43452a(float f, float f2) {
        this.f56145b.mo98842c(f, f2);
    }

    /* renamed from: a */
    public final void mo43455a(int i, float f, float f2, int i2) {
        this.f56145b.mo98756a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final void mo43453a(float f, float f2, float f3, float f4, float f5) {
        this.f56145b.mo98754a(f, f2, f3, f4, f5);
    }

    /* renamed from: a */
    public final void mo43471a(String str, int i, int i2, String str2) {
        C52711k.m112240b(str2, "arg3");
        this.f56145b.mo98828b(str, i, i2, str2);
    }

    /* renamed from: b */
    public final void mo43495b(String str) {
        C52711k.m112240b(str, "language");
        this.f56145b.mo98860f(str);
    }

    /* renamed from: a */
    public final void mo43463a(OnARTextCountCallback onARTextCountCallback) {
        C52711k.m112240b(onARTextCountCallback, "callback");
        this.f56145b.mo98761a((C50615d) new C20493c(onARTextCountCallback));
    }

    /* renamed from: a */
    public final void mo43462a(OnARTextContentCallback onARTextContentCallback) {
        C52711k.m112240b(onARTextContentCallback, "callback");
        this.f56145b.mo98826b((C50615d) new C20494d(onARTextContentCallback));
    }

    /* renamed from: a */
    public final void mo43459a(Context context) {
        C52711k.m112240b(context, "context");
        this.f56145b.mo98890t(true);
    }

    /* renamed from: a */
    public final void mo43465a(IStickerRequestCallback iStickerRequestCallback) {
        this.f56145b.mo98791a(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final void mo43470a(String str) {
        this.f56145b.mo98863g(str);
    }

    /* renamed from: a */
    public final void mo43467a(C50621i iVar) {
        C52711k.m112240b(iVar, "callback");
        this.f56145b.mo98802a(iVar);
    }

    /* renamed from: a */
    public final void mo43464a(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C52711k.m112240b(onCherEffectParmaCallback, "callback");
        this.f56145b.mo98801a((C50620h) new C20492b(onCherEffectParmaCallback));
    }

    /* renamed from: a */
    public final void mo43483a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f56145b.mo98793a(new VECherEffectParam(strArr, dArr, zArr));
    }

    /* renamed from: a */
    public final void mo43466a(C20818a aVar) {
        C52711k.m112240b(aVar, "callback");
        C50601ah ahVar = this.f56145b;
        C52711k.m112240b(aVar, "$this$toVERecoderFaceInfoCallback");
        ahVar.mo98803a((C50622j) new C20622n(aVar));
    }

    /* renamed from: b */
    public final void mo43498b(boolean z) {
        this.f56145b.mo98894v(z);
    }

    /* renamed from: a */
    public final void mo43454a(int i) {
        this.f56145b.mo98845c(i);
    }

    /* renamed from: a */
    public final void mo43456a(int i, long j, long j2, String str) {
        C52711k.m112240b(str, "msg");
        this.f56145b.mo98786a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo43461a(C2593a aVar) {
        this.f56145b.mo98790a(aVar);
    }

    /* renamed from: a */
    public final void mo43472a(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "value");
        this.f56145b.mo98838b(str, str2);
    }

    /* renamed from: a */
    public final void mo43469a(C50790w wVar) {
        C52711k.m112240b(wVar, "landmarkListener");
        this.f56145b.mo98837b(wVar);
    }

    /* renamed from: a */
    public final void mo43476a(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        m51274g().mo43476a(list, i);
    }

    /* renamed from: b */
    public final void mo43497b(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        m51274g().mo43497b(list, i);
    }

    /* renamed from: a */
    public final void mo43477a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C52711k.m112240b(list, "oldNodes");
        C52711k.m112240b(list2, "newNodes");
        m51274g().mo43477a(list, list2, i);
    }

    /* renamed from: a */
    public final boolean mo43484a(C50634ao aoVar, int i) {
        C52711k.m112240b(aoVar, "touchPointer");
        return this.f56145b.mo98819a(aoVar, i);
    }

    /* renamed from: b */
    public final void mo43487b() {
        m51274g().mo43487b();
    }

    /* renamed from: f */
    public final void mo43524f() {
        this.f56145b.mo98881p();
    }

    /* renamed from: c */
    public final void mo43500c() {
        this.f56145b.mo98879o();
    }

    /* renamed from: d */
    public final void mo43510d() {
        this.f56145b.mo98890t(false);
    }

    /* renamed from: e */
    public final C20501c mo43518e() {
        return m51274g().mo43518e();
    }

    /* renamed from: a */
    public final C19378e mo43448a() {
        return this.f56145b.mo98750C();
    }

    /* renamed from: c */
    public final int mo43499c(float f) {
        return this.f56145b.mo98755a(4, f);
    }

    /* renamed from: d */
    public final int mo43508d(float f) {
        return this.f56145b.mo98755a(5, f);
    }

    /* renamed from: g */
    public final int mo43527g(float f) {
        return this.f56145b.mo98824b(f);
    }

    /* renamed from: h */
    public final void mo43531h(boolean z) {
        this.f56145b.mo98882p(z);
    }

    /* renamed from: i */
    public final void mo43532i(boolean z) {
        this.f56145b.mo98876m(z);
    }

    /* renamed from: j */
    public final boolean mo43533j(boolean z) {
        return this.f56145b.mo98874l(z);
    }

    /* renamed from: k */
    public final void mo43534k(boolean z) {
        this.f56145b.mo98872k(z);
    }

    /* renamed from: l */
    public final void mo43535l(boolean z) {
        this.f56145b.mo98868i(z);
    }

    /* renamed from: m */
    public final void mo43536m(boolean z) {
        this.f56145b.mo98870j(z);
    }

    /* renamed from: n */
    public final void mo43537n(boolean z) {
        m51274g().mo43537n(z);
    }

    /* renamed from: a */
    public final int mo43443a(Bitmap bitmap) {
        return this.f56145b.mo98758a(bitmap);
    }

    /* renamed from: d */
    public final int mo43509d(String str) {
        C52711k.m112240b(str, "strResPath");
        return this.f56145b.mo98851d(str);
    }

    /* renamed from: e */
    public final int mo43516e(float f) {
        return this.f56145b.mo98755a(17, f);
    }

    /* renamed from: f */
    public final int mo43522f(float f) {
        return this.f56145b.mo98755a(18, f);
    }

    /* renamed from: h */
    public final float mo43530h(String str) {
        C52711k.m112240b(str, "filterPath");
        return this.f56145b.mo98822b(str);
    }

    public C20490c(C50601ah ahVar) {
        C52711k.m112240b(ahVar, "recoder");
        this.f56145b = ahVar;
    }

    /* renamed from: e */
    public final int mo43517e(String str) {
        C52711k.m112240b(str, "strRes");
        return this.f56145b.mo98856e(str);
    }

    /* renamed from: f */
    public final int mo43523f(String str) {
        C52711k.m112240b(str, "resourcePath");
        return this.f56145b.mo98844c(str);
    }

    /* renamed from: g */
    public final void mo43528g(String str) {
        this.f56145b.mo98763a(str);
    }

    /* renamed from: g */
    public final void mo43529g(boolean z) {
        this.f56145b.mo98880o(z);
    }

    /* renamed from: b */
    public final void mo43489b(float f) {
        this.f56145b.mo98755a(1, f);
    }

    /* renamed from: c */
    public final void mo43503c(int i) {
        this.f56145b.mo98833b(i);
    }

    /* renamed from: d */
    public final void mo43512d(int i) {
        this.f56145b.mo98783a(i);
    }

    /* renamed from: e */
    public final void mo43521e(boolean z) {
        this.f56145b.mo98886r(z);
    }

    /* renamed from: f */
    public final void mo43526f(boolean z) {
        this.f56145b.mo98888s(z);
    }

    /* renamed from: c */
    public final void mo43504c(String str) {
        boolean z;
        int i;
        C52711k.m112240b(str, "strBeautyFaceRes");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 3;
        } else {
            i = 2;
        }
        mo43457a(i, str);
    }

    /* renamed from: a */
    public final void mo43449a(double d) {
        this.f56145b.mo98779a(d);
    }

    /* renamed from: b */
    public final void mo43493b(C50627o oVar) {
        C52711k.m112240b(oVar, "slamDetectListener");
        this.f56145b.mo98804a(oVar);
    }

    /* renamed from: c */
    public final void mo43506c(boolean z) {
        this.f56145b.mo98892u(z);
    }

    /* renamed from: d */
    public final void mo43515d(boolean z) {
        this.f56145b.mo98883q(z);
    }

    /* renamed from: b */
    public final void mo43494b(C50790w wVar) {
        C52711k.m112240b(wVar, "landmarkListener");
        this.f56145b.mo98807a(wVar);
    }

    /* renamed from: a */
    public final int mo43441a(int i, float f) {
        return this.f56145b.mo98755a(i, f);
    }

    /* renamed from: e */
    public final void mo43519e(float f, float f2) {
        this.f56145b.mo98859f(f, f2);
    }

    /* renamed from: a */
    public final int mo43444a(String str, float f) {
        C52711k.m112240b(str, "strRes");
        return this.f56145b.mo98765a(str, f, f);
    }

    /* renamed from: b */
    public final int mo43486b(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "imagePath");
        return this.f56145b.mo98852d(str, str2);
    }

    /* renamed from: c */
    public final void mo43502c(float f, float f2) {
        this.f56145b.mo98850d(f, f2);
    }

    /* renamed from: d */
    public final void mo43511d(float f, float f2) {
        this.f56145b.mo98855e(f, f2);
    }

    /* renamed from: f */
    public final void mo43525f(float f, float f2) {
        this.f56145b.mo98753a(f, f2);
    }

    /* renamed from: b */
    public final void mo43490b(float f, float f2) {
        this.f56145b.mo98825b(f, f2);
    }

    /* renamed from: d */
    public final void mo43513d(String str, String str2) {
        this.f56145b.mo98810a(str, str2);
    }

    /* renamed from: c */
    public final void mo43505c(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        m51274g().mo43505c(list, i);
    }

    /* renamed from: d */
    public final void mo43514d(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        m51274g().mo43514d(list, i);
    }

    /* renamed from: c */
    public final int[] mo43507c(String str, String str2) {
        C52711k.m112240b(str, "nodePath");
        C52711k.m112240b(str2, "nodeKey");
        int[] c = this.f56145b.mo98848c(str, str2);
        C52711k.m112236a((Object) c, "recoder.checkComposerNod…lusion(nodePath, nodeKey)");
        return c;
    }

    /* renamed from: b */
    public final int mo43485b(String str, float f, float f2) {
        C52711k.m112240b(str, "strRes");
        return this.f56145b.mo98827b(str, f, f2);
    }

    /* renamed from: a */
    public final int mo43445a(String str, float f, float f2) {
        C52711k.m112240b(str, "strRes");
        return this.f56145b.mo98765a(str, f, f2);
    }

    /* renamed from: c */
    public final void mo43501c(double d, double d2, double d3, double d4) {
        this.f56145b.mo98841c(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final void mo43488b(double d, double d2, double d3, double d4) {
        this.f56145b.mo98823b(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo43447a(String str, int i, int i2, boolean z) {
        return this.f56145b.mo98768a(str, i, i2, z);
    }

    /* renamed from: a */
    public final void mo43450a(double d, double d2, double d3, double d4) {
        this.f56145b.mo98751a(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo43446a(String str, int i, int i2, String str2, boolean z) {
        if (z) {
            return this.f56145b.mo98769a(str, i, i2, z, str2);
        }
        return this.f56145b.mo98767a(str, i, i2, str2);
    }
}
