package com.p683ss.android.ugc.asve.sandbox.p1252c;

import android.content.Context;
import android.graphics.Bitmap;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p683ss.android.medialib.presenter.C19378e;
import com.p683ss.android.medialib.presenter.IStickerRequestCallback;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.effect.composer.C20501c;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.asve.sandbox.C20752d;
import com.p683ss.android.ugc.asve.sandbox.C20776e;
import com.p683ss.android.ugc.asve.sandbox.C20788i;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20594aa;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20596ac;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20609a;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20619k;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20635j;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20636k;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20637l;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20639n;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20640o;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20649x;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20651z;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20658a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20706p;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20709q;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20715s;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20724v;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20724v.C20725a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20727w;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20730x;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20730x.C20731a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20733y;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20733y.C20734a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20736z;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20736z.C20737a;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20818a;
import com.p683ss.android.vesdk.C50601ah.C50621i;
import com.p683ss.android.vesdk.C50601ah.C50627o;
import com.p683ss.android.vesdk.C50634ao;
import com.p683ss.android.vesdk.C50790w;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.c.c */
public final class C20749c implements C20489b {

    /* renamed from: a */
    public final Map<C50627o, C20730x> f56614a = new LinkedHashMap();

    /* renamed from: b */
    public C50621i f56615b;

    /* renamed from: d */
    public C20818a f56616d;

    /* renamed from: e */
    public OnARTextCountCallback f56617e;

    /* renamed from: f */
    public OnARTextContentCallback f56618f;

    /* renamed from: g */
    public IStickerRequestCallback f56619g;

    /* renamed from: h */
    public OnCherEffectParmaCallback f56620h;

    /* renamed from: i */
    public C2593a f56621i;

    /* renamed from: j */
    public final Map<C50790w, C20736z> f56622j;

    /* renamed from: k */
    private final C20788i f56623k;

    /* renamed from: a */
    public final C19378e mo43448a() {
        return null;
    }

    /* renamed from: a */
    public final boolean mo43484a(C50634ao aoVar, int i) {
        C52711k.m112240b(aoVar, "touchPointer");
        return false;
    }

    /* renamed from: b */
    public final void mo43492b(Context context) {
        C52711k.m112240b(context, "context");
    }

    /* renamed from: d */
    public final void mo43513d(String str, String str2) {
    }

    /* renamed from: a */
    public final void mo43460a(Context context, String str, String str2, String str3) {
        this.f56623k.mo43963a(str, str2, str3);
    }

    /* renamed from: b */
    public final void mo43496b(String str, float f) {
        this.f56623k.mo43982b(str, f);
    }

    /* renamed from: a */
    public final void mo43474a(String str, String str2, float f, float f2, float f3) {
        this.f56623k.mo43962a(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final void mo43468a(C50627o oVar) {
        C52711k.m112240b(oVar, "slamDetectListener");
        C20730x xVar = (C20730x) this.f56614a.get(oVar);
        if (xVar != null) {
            this.f56623k.mo43956a(xVar);
            this.f56614a.remove(oVar);
        }
    }

    /* renamed from: a */
    public final void mo43471a(String str, int i, int i2, String str2) {
        C52711k.m112240b(str2, "arg3");
        this.f56623k.mo43960a(str, i, i2, str2);
    }

    /* renamed from: a */
    public final void mo43467a(C50621i iVar) {
        C52711k.m112240b(iVar, "callback");
        this.f56615b = iVar;
        C20788i iVar2 = this.f56623k;
        C52711k.m112240b(iVar, "$this$stub");
        iVar2.mo43952a((C20709q) new C20651z(iVar));
    }

    /* renamed from: a */
    public final void mo43466a(C20818a aVar) {
        C52711k.m112240b(aVar, "callback");
        this.f56616d = aVar;
        C20788i iVar = this.f56623k;
        C52711k.m112240b(aVar, "$this$stub");
        iVar.mo43953a((C20715s) new C20636k(aVar));
    }

    /* renamed from: a */
    public final void mo43458a(int i, String str, float f, float f2) {
        C52711k.m112240b(str, "strBeautyFaceRes");
        this.f56623k.mo43949a(i, str, f, f2);
    }

    /* renamed from: a */
    public final void mo43457a(int i, String str) {
        C52711k.m112240b(str, "strBeautyFaceRes");
        this.f56623k.mo43948a(i, str);
    }

    /* renamed from: a */
    public final void mo43451a(float f) {
        this.f56623k.mo43942a(f);
    }

    /* renamed from: a */
    public final void mo43478a(Map<Integer, Float> map) {
        C52711k.m112240b(map, "intensityDict");
        this.f56623k.mo43967a((Map) map);
    }

    /* renamed from: a */
    public final void mo43475a(String str, Map<Integer, Float> map) {
        C52711k.m112240b(str, "resourcePath");
        C52711k.m112240b(map, "intensityDict");
        this.f56623k.mo43964a(str, (Map) map);
    }

    /* renamed from: a */
    public final void mo43473a(String str, String str2, float f) {
        this.f56623k.mo43961a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo43480a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        String str2 = str;
        C52711k.m112240b(str2, "phoneParamPath");
        this.f56623k.mo43968a(z, i, z2, z3, z4, z5, str2);
    }

    /* renamed from: a */
    public final void mo43481a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f56623k.mo43969a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final void mo43482a(double[] dArr, double d) {
        C52711k.m112240b(dArr, "wRbs");
        this.f56623k.mo43970a(dArr, d);
    }

    /* renamed from: a */
    public final void mo43452a(float f, float f2) {
        this.f56623k.mo43978b(f, f2);
    }

    /* renamed from: a */
    public final void mo43455a(int i, float f, float f2, int i2) {
        this.f56623k.mo43946a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final void mo43453a(float f, float f2, float f3, float f4, float f5) {
        this.f56623k.mo43944a(f, f2, f3, f4, f5);
    }

    /* renamed from: b */
    public final void mo43495b(String str) {
        C52711k.m112240b(str, "language");
        this.f56623k.mo44016g(str);
    }

    /* renamed from: a */
    public final void mo43463a(OnARTextCountCallback onARTextCountCallback) {
        C52711k.m112240b(onARTextCountCallback, "callback");
        this.f56617e = onARTextCountCallback;
        C20788i iVar = this.f56623k;
        C52711k.m112240b(onARTextCountCallback, "$this$stub");
        iVar.mo43955a((C20727w) new C20640o(onARTextCountCallback));
    }

    /* renamed from: a */
    public final void mo43462a(OnARTextContentCallback onARTextContentCallback) {
        C52711k.m112240b(onARTextContentCallback, "callback");
        this.f56618f = onARTextContentCallback;
        C20788i iVar = this.f56623k;
        C52711k.m112240b(onARTextContentCallback, "$this$stub");
        iVar.mo43950a((C20658a) new C20639n(onARTextContentCallback));
    }

    /* renamed from: a */
    public final void mo43459a(Context context) {
        C52711k.m112240b(context, "context");
        this.f56623k.mo44004e();
    }

    /* renamed from: a */
    public final void mo43465a(IStickerRequestCallback iStickerRequestCallback) {
        C20734a aVar;
        this.f56619g = iStickerRequestCallback;
        C20788i iVar = this.f56623k;
        if (iStickerRequestCallback != null) {
            C52711k.m112240b(iStickerRequestCallback, "$this$stub");
            aVar = new C20649x(iStickerRequestCallback);
        } else {
            aVar = null;
        }
        iVar.mo43957a((C20733y) aVar);
    }

    /* renamed from: a */
    public final void mo43470a(String str) {
        this.f56623k.mo44018h(str);
    }

    /* renamed from: a */
    public final void mo43464a(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C52711k.m112240b(onCherEffectParmaCallback, "callback");
        this.f56620h = onCherEffectParmaCallback;
        C20788i iVar = this.f56623k;
        C52711k.m112240b(onCherEffectParmaCallback, "$this$stub");
        iVar.mo43951a((C20706p) new C20635j(onCherEffectParmaCallback));
    }

    /* renamed from: a */
    public final void mo43483a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f56623k.mo43971a(strArr, dArr, zArr);
    }

    /* renamed from: a */
    public final void mo43479a(boolean z) {
        this.f56623k.mo44022k(z);
    }

    /* renamed from: b */
    public final void mo43498b(boolean z) {
        this.f56623k.mo44023l(z);
    }

    /* renamed from: a */
    public final void mo43454a(int i) {
        this.f56623k.mo44011f(i);
    }

    /* renamed from: a */
    public final void mo43456a(int i, long j, long j2, String str) {
        C52711k.m112240b(str, "msg");
        this.f56623k.mo43947a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo43461a(C2593a aVar) {
        C20725a aVar2;
        this.f56621i = aVar;
        C20788i iVar = this.f56623k;
        if (aVar != null) {
            C52711k.m112240b(aVar, "$this$stub");
            aVar2 = new C20637l(aVar);
        } else {
            aVar2 = null;
        }
        iVar.mo43954a((C20724v) aVar2);
    }

    /* renamed from: a */
    public final void mo43472a(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "value");
        this.f56623k.mo43983b(str, str2);
    }

    /* renamed from: b */
    public final void mo43494b(C50790w wVar) {
        C52711k.m112240b(wVar, "landmarkListener");
        if (this.f56622j.get(wVar) != null) {
            this.f56623k.mo43958a((C20736z) this.f56622j.get(wVar));
            return;
        }
        C52711k.m112240b(wVar, "$this$stub");
        C20737a aaVar = new C20594aa(wVar);
        this.f56622j.put(wVar, aaVar);
        this.f56623k.mo43958a((C20736z) aaVar);
    }

    /* renamed from: a */
    public final void mo43469a(C50790w wVar) {
        C52711k.m112240b(wVar, "landmarkListener");
        if (((C20736z) this.f56622j.get(wVar)) != null) {
            this.f56623k.mo43981b((C20736z) this.f56622j.get(wVar));
            this.f56622j.remove(wVar);
        }
    }

    /* renamed from: a */
    public final void mo43476a(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "list");
        this.f56623k.mo43965a(list, i);
    }

    /* renamed from: b */
    public final void mo43497b(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "list");
        this.f56623k.mo43984b(list, i);
    }

    /* renamed from: a */
    public final void mo43477a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C52711k.m112240b(list, "oldNodes");
        C52711k.m112240b(list2, "newNodes");
        this.f56623k.mo43966a(list, list2, i);
    }

    /* renamed from: b */
    public final void mo43487b() {
        this.f56623k.mo44009f();
    }

    /* renamed from: c */
    public final void mo43500c() {
        this.f56623k.mo43997d();
    }

    /* renamed from: d */
    public final void mo43510d() {
        this.f56623k.mo43975b();
    }

    /* renamed from: e */
    public final C20501c mo43518e() {
        C20776e g = this.f56623k.mo44015g();
        if (g == null) {
            g = new C20609a();
        }
        C52711k.m112240b(g, "$this$proxy");
        return new C20619k(g);
    }

    /* renamed from: f */
    public final void mo43524f() {
        this.f56623k.mo43988c();
    }

    /* renamed from: c */
    public final int mo43499c(float f) {
        return this.f56623k.mo43986c(f);
    }

    /* renamed from: d */
    public final int mo43508d(float f) {
        return this.f56623k.mo43995d(f);
    }

    /* renamed from: e */
    public final int mo43516e(float f) {
        return this.f56623k.mo44003e(f);
    }

    /* renamed from: f */
    public final int mo43522f(float f) {
        return this.f56623k.mo44008f(f);
    }

    /* renamed from: g */
    public final int mo43527g(float f) {
        return this.f56623k.mo44014g(f);
    }

    /* renamed from: h */
    public final void mo43531h(boolean z) {
        this.f56623k.mo44020i(z);
    }

    /* renamed from: i */
    public final void mo43532i(boolean z) {
        this.f56623k.mo44021j(z);
    }

    /* renamed from: j */
    public final boolean mo43533j(boolean z) {
        return this.f56623k.mo43972a(z);
    }

    /* renamed from: k */
    public final void mo43534k(boolean z) {
        this.f56623k.mo43985b(z);
    }

    /* renamed from: l */
    public final void mo43535l(boolean z) {
        this.f56623k.mo43993c(z);
    }

    /* renamed from: m */
    public final void mo43536m(boolean z) {
        this.f56623k.mo44001d(z);
    }

    /* renamed from: n */
    public final void mo43537n(boolean z) {
        this.f56623k.mo44025n(z);
    }

    /* renamed from: d */
    public final int mo43509d(String str) {
        C52711k.m112240b(str, "strResPath");
        return this.f56623k.mo43973b(str);
    }

    /* renamed from: e */
    public final int mo43517e(String str) {
        C52711k.m112240b(str, "strRes");
        return this.f56623k.mo43987c(str);
    }

    /* renamed from: f */
    public final int mo43523f(String str) {
        C52711k.m112240b(str, "resourcePath");
        return this.f56623k.mo43996d(str);
    }

    /* renamed from: g */
    public final void mo43528g(String str) {
        this.f56623k.mo44012f(str);
    }

    /* renamed from: h */
    public final float mo43530h(String str) {
        C52711k.m112240b(str, "filterPath");
        return this.f56623k.mo44002e(str);
    }

    /* renamed from: a */
    public final int mo43443a(Bitmap bitmap) {
        return this.f56623k.mo43933a(bitmap);
    }

    /* renamed from: g */
    public final void mo43529g(boolean z) {
        this.f56623k.mo44019h(z);
    }

    public C20749c(C20788i iVar) {
        Object newProxyInstance = Proxy.newProxyInstance(C20788i.class.getClassLoader(), new Class[]{C20788i.class}, new C20752d(iVar));
        if (newProxyInstance != null) {
            this.f56623k = (C20788i) newProxyInstance;
            this.f56622j = new LinkedHashMap();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.ISandBoxRemoteEffectService");
    }

    /* renamed from: b */
    public final void mo43489b(float f) {
        this.f56623k.mo43977b(f);
    }

    /* renamed from: c */
    public final void mo43503c(int i) {
        this.f56623k.mo43979b(i);
    }

    /* renamed from: d */
    public final void mo43512d(int i) {
        this.f56623k.mo43991c(i);
    }

    /* renamed from: e */
    public final void mo43520e(int i) {
        this.f56623k.mo43945a(i);
    }

    /* renamed from: f */
    public final void mo43526f(boolean z) {
        this.f56623k.mo44017g(z);
    }

    /* renamed from: c */
    public final void mo43504c(String str) {
        C52711k.m112240b(str, "strBeautyFaceRes");
        this.f56623k.mo43959a(str);
    }

    /* renamed from: e */
    public final void mo43521e(boolean z) {
        this.f56623k.mo44013f(z);
    }

    /* renamed from: b */
    public final void mo43491b(int i) {
        this.f56623k.mo43999d(i);
    }

    /* renamed from: d */
    public final void mo43515d(boolean z) {
        this.f56623k.mo44007e(z);
    }

    /* renamed from: a */
    public final void mo43449a(double d) {
        this.f56623k.mo43940a(d);
    }

    /* renamed from: c */
    public final void mo43506c(boolean z) {
        this.f56623k.mo44024m(z);
    }

    /* renamed from: b */
    public final void mo43493b(C50627o oVar) {
        C52711k.m112240b(oVar, "slamDetectListener");
        if (this.f56614a.get(oVar) != null) {
            this.f56623k.mo43980b((C20730x) this.f56614a.get(oVar));
            return;
        }
        C52711k.m112240b(oVar, "$this$stub");
        C20731a acVar = new C20596ac(oVar);
        this.f56614a.put(oVar, acVar);
        this.f56623k.mo43980b((C20730x) acVar);
    }

    /* renamed from: a */
    public final int mo43441a(int i, float f) {
        return this.f56623k.mo43931a(i, f);
    }

    /* renamed from: a */
    public final int mo43442a(int i, int i2) {
        return this.f56623k.mo43932a(i, i2);
    }

    /* renamed from: b */
    public final int mo43486b(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "imagePath");
        return this.f56623k.mo43938a(str, str2);
    }

    /* renamed from: a */
    public final int mo43444a(String str, float f) {
        C52711k.m112240b(str, "strRes");
        return this.f56623k.mo43934a(str, f);
    }

    /* renamed from: c */
    public final void mo43502c(float f, float f2) {
        this.f56623k.mo43998d(f, f2);
    }

    /* renamed from: d */
    public final void mo43511d(float f, float f2) {
        this.f56623k.mo44005e(f, f2);
    }

    /* renamed from: e */
    public final void mo43519e(float f, float f2) {
        this.f56623k.mo44010f(f, f2);
    }

    /* renamed from: f */
    public final void mo43525f(float f, float f2) {
        this.f56623k.mo43943a(f, f2);
    }

    /* renamed from: b */
    public final void mo43490b(float f, float f2) {
        this.f56623k.mo43990c(f, f2);
    }

    /* renamed from: d */
    public final void mo43514d(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "list");
        this.f56623k.mo43992c(list, i);
    }

    /* renamed from: c */
    public final void mo43505c(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "list");
        this.f56623k.mo44000d(list, i);
    }

    /* renamed from: c */
    public final int[] mo43507c(String str, String str2) {
        C52711k.m112240b(str, "nodePath");
        C52711k.m112240b(str2, "nodeKey");
        int[] c = this.f56623k.mo43994c(str, str2);
        C52711k.m112236a((Object) c, "safeRemoteEffectControll…lusion(nodePath, nodeKey)");
        return c;
    }

    /* renamed from: b */
    public final int mo43485b(String str, float f, float f2) {
        C52711k.m112240b(str, "strRes");
        return this.f56623k.mo43974b(str, f, f2);
    }

    /* renamed from: a */
    public final int mo43445a(String str, float f, float f2) {
        C52711k.m112240b(str, "strRes");
        return this.f56623k.mo43935a(str, f, f2);
    }

    /* renamed from: c */
    public final void mo43501c(double d, double d2, double d3, double d4) {
        this.f56623k.mo43989c(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final void mo43488b(double d, double d2, double d3, double d4) {
        this.f56623k.mo43976b(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo43447a(String str, int i, int i2, boolean z) {
        return this.f56623k.mo43937a(str, i, i2, z);
    }

    /* renamed from: a */
    public final void mo43450a(double d, double d2, double d3, double d4) {
        this.f56623k.mo43941a(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo43446a(String str, int i, int i2, String str2, boolean z) {
        return this.f56623k.mo43936a(str, i, i2, str2, z);
    }
}
