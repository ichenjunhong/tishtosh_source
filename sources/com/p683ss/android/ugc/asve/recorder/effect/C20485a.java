package com.p683ss.android.ugc.asve.recorder.effect;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.medialib.FaceBeautyInvoker;
import com.p683ss.android.medialib.FaceBeautyInvoker.EffectAlgorithmCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.FaceInfoCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p683ss.android.medialib.p1181c.C19234c;
import com.p683ss.android.medialib.presenter.C19361d;
import com.p683ss.android.medialib.presenter.C19378e;
import com.p683ss.android.medialib.presenter.IStickerRequestCallback;
import com.p683ss.android.ugc.asve.recorder.effect.composer.C20501c;
import com.p683ss.android.ugc.asve.recorder.effect.composer.C20502d;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20621m;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20818a;
import com.p683ss.android.vesdk.C50601ah.C50621i;
import com.p683ss.android.vesdk.C50601ah.C50627o;
import com.p683ss.android.vesdk.C50634ao;
import com.p683ss.android.vesdk.C50790w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52549aa;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2647j.C52751c;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.a */
public final class C20485a implements C20489b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56137a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20485a.class), "slamDetectListenerMap", "getSlamDetectListenerMap()Ljava/util/HashMap;"))};

    /* renamed from: b */
    private final C52668f f56138b = C52732g.m112285a(C20488c.f56143a);

    /* renamed from: d */
    private final C20502d f56139d = new C20502d(this.f56140e);

    /* renamed from: e */
    private final C19361d f56140e;

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.a$a */
    static final class C20486a implements C19234c {

        /* renamed from: a */
        final /* synthetic */ C50627o f56141a;

        C20486a(C50627o oVar) {
            this.f56141a = oVar;
        }

        /* renamed from: a */
        public final void mo39626a(boolean z) {
            this.f56141a.mo43756a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.a$b */
    static final class C20487b implements EffectAlgorithmCallback {

        /* renamed from: a */
        final /* synthetic */ C50621i f56142a;

        C20487b(C50621i iVar) {
            this.f56142a = iVar;
        }

        public final void onResult(int[] iArr, long[] jArr, float f) {
            SparseArray sparseArray = new SparseArray();
            C52711k.m112236a((Object) iArr, "algorithmType");
            C52711k.m112240b(iArr, "$this$indices");
            Iterator it = new C52751c(0, C52568f.m112072a(iArr)).iterator();
            while (it.hasNext()) {
                int a = ((C52549aa) it).mo110114a();
                sparseArray.put(iArr[a], Long.valueOf(jArr[a]));
            }
            this.f56142a.mo43758a(sparseArray, f);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.effect.a$c */
    static final class C20488c extends C52712l implements C52670a<HashMap<C50627o, C19234c>> {

        /* renamed from: a */
        public static final C20488c f56143a = new C20488c();

        C20488c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: g */
    private final HashMap<C50627o, C19234c> m51086g() {
        return (HashMap) this.f56138b.getValue();
    }

    /* renamed from: a */
    public final int mo43442a(int i, int i2) {
        return -1;
    }

    /* renamed from: e */
    public final void mo43520e(int i) {
    }

    /* renamed from: a */
    public final void mo43469a(C50790w wVar) {
        C52711k.m112240b(wVar, "landmarkListener");
        this.f56140e.mo40334b(wVar);
    }

    /* renamed from: a */
    public final void mo43472a(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "value");
        this.f56140e.mo40336b(str, str2);
    }

    /* renamed from: a */
    public final void mo43468a(C50627o oVar) {
        C52711k.m112240b(oVar, "slamDetectListener");
        FaceBeautyInvoker.removeSlamDetectListener((C19234c) m51086g().get(oVar));
        m51086g().remove(oVar);
    }

    /* renamed from: a */
    public final void mo43461a(C2593a aVar) {
        this.f56140e.mo40290a(aVar);
    }

    /* renamed from: a */
    public final void mo43456a(int i, long j, long j2, String str) {
        C52711k.m112240b(str, "msg");
        this.f56140e.mo40285a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo43464a(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C52711k.m112240b(onCherEffectParmaCallback, "callback");
        this.f56140e.mo40292a(onCherEffectParmaCallback);
    }

    /* renamed from: a */
    public final void mo43483a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f56140e.mo40309a(strArr, dArr, zArr);
    }

    /* renamed from: a */
    public final void mo43466a(C20818a aVar) {
        C52711k.m112240b(aVar, "callback");
        C19361d dVar = this.f56140e;
        C52711k.m112240b(aVar, "$this$toVEFaceInfoCallback");
        dVar.mo40307a(true, (FaceInfoCallback) new C20621m(aVar));
    }

    /* renamed from: a */
    public final void mo43479a(boolean z) {
        this.f56140e.mo40379h(z);
    }

    /* renamed from: b */
    public final void mo43498b(boolean z) {
        this.f56140e.mo40409t(z);
    }

    /* renamed from: a */
    public final void mo43454a(int i) {
        this.f56140e.mo40387j(i);
    }

    /* renamed from: a */
    public final void mo43465a(IStickerRequestCallback iStickerRequestCallback) {
        this.f56140e.mo40296a(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final void mo43470a(String str) {
        this.f56140e.mo40376h(str);
    }

    /* renamed from: a */
    public final void mo43459a(Context context) {
        C52711k.m112240b(context, "context");
        this.f56140e.mo40318b(context);
    }

    /* renamed from: a */
    public final void mo43480a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        String str2 = str;
        C52711k.m112240b(str2, "phoneParamPath");
        this.f56140e.mo40270a(z, i, z2, z3, z4, z5, str2);
    }

    /* renamed from: a */
    public final void mo43481a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f56140e.mo40271a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final void mo43482a(double[] dArr, double d) {
        C52711k.m112240b(dArr, "wRbs");
        this.f56140e.mo40272a(dArr, d);
    }

    /* renamed from: a */
    public final void mo43452a(float f, float f2) {
        this.f56140e.mo40317b(f, f2);
    }

    /* renamed from: a */
    public final void mo43455a(int i, float f, float f2, int i2) {
        this.f56140e.mo40250a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final void mo43453a(float f, float f2, float f3, float f4, float f5) {
        this.f56140e.mo40248a(f, f2, f3, f4, f5);
    }

    /* renamed from: a */
    public final void mo43471a(String str, int i, int i2, String str2) {
        C52711k.m112240b(str2, "arg3");
        this.f56140e.mo40323b(str, i, i2, str2);
    }

    /* renamed from: b */
    public final void mo43495b(String str) {
        C52711k.m112240b(str, "language");
        this.f56140e.mo40371g(str);
    }

    /* renamed from: a */
    public final void mo43463a(OnARTextCountCallback onARTextCountCallback) {
        C52711k.m112240b(onARTextCountCallback, "callback");
        this.f56140e.mo40259a(onARTextCountCallback);
    }

    /* renamed from: a */
    public final void mo43462a(OnARTextContentCallback onARTextContentCallback) {
        C52711k.m112240b(onARTextContentCallback, "callback");
        this.f56140e.mo40258a(onARTextContentCallback);
    }

    /* renamed from: a */
    public final void mo43458a(int i, String str, float f, float f2) {
        C52711k.m112240b(str, "strBeautyFaceRes");
        this.f56140e.mo40286a(i, str, f, f2);
    }

    /* renamed from: a */
    public final void mo43457a(int i, String str) {
        C52711k.m112240b(str, "strBeautyFaceRes");
        this.f56140e.mo40333b(i, str);
    }

    /* renamed from: a */
    public final void mo43451a(float f) {
        this.f56140e.mo40330b(f);
    }

    /* renamed from: a */
    public final void mo43478a(Map<Integer, Float> map) {
        C52711k.m112240b(map, "intensityDict");
        this.f56140e.mo40305a(map);
    }

    /* renamed from: a */
    public final void mo43475a(String str, Map<Integer, Float> map) {
        C52711k.m112240b(str, "resourcePath");
        C52711k.m112240b(map, "intensityDict");
        this.f56140e.mo40304a(str, map);
    }

    /* renamed from: b */
    public final void mo43496b(String str, float f) {
        C19361d dVar = this.f56140e;
        if (str == null) {
            str = "";
        }
        dVar.mo40335b(str, f);
    }

    /* renamed from: a */
    public final void mo43473a(String str, String str2, float f) {
        C19361d dVar = this.f56140e;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        dVar.mo40301a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo43474a(String str, String str2, float f, float f2, float f3) {
        C19361d dVar = this.f56140e;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        if (str2 == null) {
            str2 = "";
        }
        dVar.mo40302a(str3, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final void mo43476a(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        this.f56139d.mo43476a(list, i);
    }

    /* renamed from: b */
    public final void mo43497b(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        this.f56139d.mo43497b(list, i);
    }

    /* renamed from: a */
    public final void mo43477a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C52711k.m112240b(list, "oldNodes");
        C52711k.m112240b(list2, "newNodes");
        this.f56139d.mo43477a(list, list2, i);
    }

    /* renamed from: a */
    public final void mo43460a(Context context, String str, String str2, String str3) {
        this.f56140e.mo40289a(context, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo43467a(C50621i iVar) {
        C52711k.m112240b(iVar, "callback");
        this.f56140e.mo40291a((EffectAlgorithmCallback) new C20487b(iVar));
    }

    /* renamed from: b */
    public final void mo43494b(C50790w wVar) {
        C52711k.m112240b(wVar, "landmarkListener");
        this.f56140e.mo40299a(wVar);
    }

    /* renamed from: a */
    public final boolean mo43484a(C50634ao aoVar, int i) {
        C52711k.m112240b(aoVar, "touchPointer");
        return this.f56140e.mo40311a(aoVar, i);
    }

    /* renamed from: b */
    public final void mo43487b() {
        this.f56139d.mo43487b();
    }

    /* renamed from: c */
    public final void mo43500c() {
        this.f56140e.mo40404r();
    }

    /* renamed from: d */
    public final void mo43510d() {
        this.f56140e.mo40411u();
    }

    /* renamed from: e */
    public final C20501c mo43518e() {
        return this.f56139d.mo43518e();
    }

    /* renamed from: f */
    public final void mo43524f() {
        this.f56140e.mo40408s();
    }

    /* renamed from: a */
    public final C19378e mo43448a() {
        return this.f56140e.f53537j;
    }

    /* renamed from: c */
    public final int mo43499c(float f) {
        return this.f56140e.mo40348d(f);
    }

    /* renamed from: d */
    public final int mo43508d(float f) {
        return this.f56140e.mo40356e(f);
    }

    /* renamed from: e */
    public final int mo43516e(float f) {
        return this.f56140e.mo40364f(f);
    }

    /* renamed from: f */
    public final int mo43522f(float f) {
        return this.f56140e.mo40370g(f);
    }

    /* renamed from: g */
    public final int mo43527g(float f) {
        return this.f56140e.mo40375h(f);
    }

    /* renamed from: h */
    public final void mo43531h(boolean z) {
        this.f56140e.f53542o = z;
    }

    /* renamed from: i */
    public final void mo43532i(boolean z) {
        this.f56140e.mo40405r(z);
    }

    /* renamed from: j */
    public final boolean mo43533j(boolean z) {
        return this.f56140e.mo40388j(z);
    }

    /* renamed from: k */
    public final void mo43534k(boolean z) {
        this.f56140e.mo40389k(z);
    }

    /* renamed from: l */
    public final void mo43535l(boolean z) {
        this.f56140e.mo40392l(z);
    }

    /* renamed from: m */
    public final void mo43536m(boolean z) {
        this.f56140e.mo40395m(z);
    }

    /* renamed from: n */
    public final void mo43537n(boolean z) {
        this.f56139d.mo43537n(z);
    }

    /* renamed from: a */
    public final int mo43443a(Bitmap bitmap) {
        return this.f56140e.mo40254a(bitmap);
    }

    /* renamed from: d */
    public final int mo43509d(String str) {
        C52711k.m112240b(str, "strResPath");
        return this.f56140e.mo40321b(str);
    }

    /* renamed from: e */
    public final int mo43517e(String str) {
        C52711k.m112240b(str, "strRes");
        return this.f56140e.mo40340c(str);
    }

    /* renamed from: f */
    public final int mo43523f(String str) {
        C52711k.m112240b(str, "resourcePath");
        return this.f56140e.mo40350d(str);
    }

    /* renamed from: h */
    public final float mo43530h(String str) {
        C52711k.m112240b(str, "filterPath");
        return this.f56140e.mo40363f(str);
    }

    public C20485a(C19361d dVar) {
        C52711k.m112240b(dVar, "mediaRecordPresenter");
        this.f56140e = dVar;
    }

    /* renamed from: g */
    public final void mo43528g(String str) {
        C19361d dVar = this.f56140e;
        if (str == null) {
            str = "";
        }
        dVar.mo40360e(str);
    }

    /* renamed from: g */
    public final void mo43529g(boolean z) {
        this.f56140e.mo40403q(z);
    }

    /* renamed from: b */
    public final void mo43489b(float f) {
        this.f56140e.mo40342c(f);
    }

    /* renamed from: c */
    public final void mo43503c(int i) {
        this.f56140e.mo40378h(i);
    }

    /* renamed from: d */
    public final void mo43512d(int i) {
        this.f56140e.mo40382i(i);
    }

    /* renamed from: e */
    public final void mo43521e(boolean z) {
        this.f56140e.mo40399o(z);
    }

    /* renamed from: f */
    public final void mo43526f(boolean z) {
        this.f56140e.mo40401p(z);
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

    /* renamed from: b */
    public final void mo43491b(int i) {
        this.f56140e.mo40343c(i);
    }

    /* renamed from: a */
    public final void mo43449a(double d) {
        this.f56140e.mo40329b(d);
    }

    /* renamed from: b */
    public final void mo43492b(Context context) {
        C52711k.m112240b(context, "context");
        this.f56140e.mo40287a(context);
    }

    /* renamed from: c */
    public final void mo43506c(boolean z) {
        this.f56140e.mo40412u(z);
    }

    /* renamed from: d */
    public final void mo43515d(boolean z) {
        this.f56140e.mo40396n(z);
    }

    /* renamed from: b */
    public final void mo43493b(C50627o oVar) {
        C52711k.m112240b(oVar, "slamDetectListener");
        m51086g().put(oVar, new C20486a(oVar));
        FaceBeautyInvoker.addSlamDetectListener((C19234c) m51086g().get(oVar));
    }

    /* renamed from: a */
    public final int mo43441a(int i, float f) {
        return this.f56140e.mo40249a(i, f);
    }

    /* renamed from: a */
    public final int mo43444a(String str, float f) {
        C52711k.m112240b(str, "strRes");
        return this.f56140e.mo40261a(str, f);
    }

    /* renamed from: b */
    public final int mo43486b(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "imagePath");
        return this.f56140e.mo40351d(str, str2);
    }

    /* renamed from: c */
    public final void mo43502c(float f, float f2) {
        this.f56140e.mo40349d(f, f2);
    }

    /* renamed from: d */
    public final void mo43511d(float f, float f2) {
        this.f56140e.mo40357e(f, f2);
    }

    /* renamed from: e */
    public final void mo43519e(float f, float f2) {
        this.f56140e.mo40365f(f, f2);
    }

    /* renamed from: f */
    public final void mo43525f(float f, float f2) {
        this.f56140e.mo40281a(f, f2);
    }

    /* renamed from: b */
    public final void mo43490b(float f, float f2) {
        this.f56140e.mo40338c(f, f2);
    }

    /* renamed from: d */
    public final void mo43513d(String str, String str2) {
        this.f56140e.mo40300a(str, str2);
    }

    /* renamed from: c */
    public final void mo43505c(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        this.f56139d.mo43505c(list, i);
    }

    /* renamed from: d */
    public final void mo43514d(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        this.f56139d.mo43514d(list, i);
    }

    /* renamed from: c */
    public final int[] mo43507c(String str, String str2) {
        C52711k.m112240b(str, "nodePath");
        C52711k.m112240b(str2, "nodeKey");
        int[] c = this.f56140e.mo40346c(str, str2);
        C52711k.m112236a((Object) c, "mediaRecordPresenter.che…lusion(nodePath, nodeKey)");
        return c;
    }

    /* renamed from: b */
    public final int mo43485b(String str, float f, float f2) {
        C52711k.m112240b(str, "strRes");
        return this.f56140e.mo40322b(str, f, f2);
    }

    /* renamed from: a */
    public final int mo43445a(String str, float f, float f2) {
        C52711k.m112240b(str, "strRes");
        return this.f56140e.mo40262a(str, f, f2);
    }

    /* renamed from: c */
    public final void mo43501c(double d, double d2, double d3, double d4) {
        this.f56140e.mo40337c(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final void mo43488b(double d, double d2, double d3, double d4) {
        this.f56140e.mo40316b(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo43447a(String str, int i, int i2, boolean z) {
        return this.f56140e.mo40264a(str, i, i2, z);
    }

    /* renamed from: a */
    public final void mo43450a(double d, double d2, double d3, double d4) {
        this.f56140e.mo40245a(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo43446a(String str, int i, int i2, String str2, boolean z) {
        if (z) {
            return this.f56140e.mo40265a(str, i, i2, z, str2);
        }
        return this.f56140e.mo40263a(str, i, i2, str2);
    }
}
