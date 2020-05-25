package com.p683ss.android.ugc.asve.sandbox.p1253d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p683ss.android.medialib.presenter.IStickerRequestCallback;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.asve.recorder.effect.composer.C20501c;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.asve.sandbox.C20776e;
import com.p683ss.android.ugc.asve.sandbox.C20788i.C20789a;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20610b;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20611c;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20612d;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20613e;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20614f;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20615g;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20616h;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20617i;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20618j;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20608c.C20620l;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20658a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20706p;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20709q;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20715s;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20724v;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20727w;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20730x;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20733y;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20736z;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20818a;
import com.p683ss.android.vesdk.C50601ah.C50621i;
import com.p683ss.android.vesdk.C50601ah.C50627o;
import com.p683ss.android.vesdk.C50790w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: com.ss.android.ugc.asve.sandbox.d.c */
public final class C20757c extends C20789a {

    /* renamed from: a */
    private final Map<IBinder, C50790w> f56647a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<IBinder, C50627o> f56648b = new LinkedHashMap();

    /* renamed from: c */
    private final C20489b f56649c;

    /* renamed from: e */
    public final void mo44006e(int i) {
    }

    /* renamed from: a */
    public final void mo43963a(String str, String str2, String str3) {
        this.f56649c.mo43460a((Context) null, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo43940a(double d) {
        this.f56649c.mo43449a(d);
    }

    /* renamed from: a */
    public final void mo43959a(String str) {
        C52711k.m112240b(str, "strBeautyFaceRes");
        this.f56649c.mo43504c(str);
    }

    /* renamed from: b */
    public final void mo43982b(String str, float f) {
        this.f56649c.mo43496b(str, f);
    }

    /* renamed from: a */
    public final void mo43961a(String str, String str2, float f) {
        this.f56649c.mo43473a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo43962a(String str, String str2, float f, float f2, float f3) {
        this.f56649c.mo43474a(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final void mo43965a(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "list");
        this.f56649c.mo43476a(list, i);
    }

    /* renamed from: b */
    public final void mo43984b(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "list");
        this.f56649c.mo43497b(list, i);
    }

    /* renamed from: a */
    public final void mo43949a(int i, String str, float f, float f2) {
        C52711k.m112240b(str, "strBeautyFaceRes");
        this.f56649c.mo43458a(i, str, f, f2);
    }

    /* renamed from: a */
    public final void mo43948a(int i, String str) {
        C52711k.m112240b(str, "strBeautyFaceRes");
        this.f56649c.mo43457a(i, str);
    }

    /* renamed from: a */
    public final void mo43943a(float f, float f2) {
        this.f56649c.mo43525f(f, f2);
    }

    /* renamed from: a */
    public final void mo43942a(float f) {
        this.f56649c.mo43451a(f);
    }

    /* renamed from: a */
    public final boolean mo43972a(boolean z) {
        return this.f56649c.mo43533j(z);
    }

    /* renamed from: b */
    public final void mo43985b(boolean z) {
        this.f56649c.mo43534k(z);
    }

    /* renamed from: a */
    public final void mo43967a(Map<Object, Object> map) {
        C52711k.m112240b(map, "intensityDict");
        this.f56649c.mo43478a(map);
    }

    /* renamed from: a */
    public final void mo43964a(String str, Map<Object, Object> map) {
        C52711k.m112240b(str, "resourcePath");
        C20489b bVar = this.f56649c;
        if (map != null) {
            bVar.mo43475a(str, map);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.collections.Map<kotlin.Int, kotlin.Float>");
    }

    /* renamed from: a */
    public final void mo43945a(int i) {
        this.f56649c.mo43520e(i);
    }

    /* renamed from: a */
    public final void mo43956a(C20730x xVar) {
        IBinder iBinder = null;
        C50627o oVar = (C50627o) this.f56648b.get(xVar != null ? xVar.asBinder() : null);
        if (oVar != null) {
            this.f56649c.mo43468a(oVar);
            Map<IBinder, C50627o> map = this.f56648b;
            if (xVar != null) {
                iBinder = xVar.asBinder();
            }
            if (map != null) {
                C52731z.m112270f(map).remove(iBinder);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
    }

    /* renamed from: a */
    public final void mo43968a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        String str2 = str;
        C52711k.m112240b(str2, "phoneParamPath");
        this.f56649c.mo43480a(z, i, z2, z3, z4, z5, str2);
    }

    /* renamed from: a */
    public final void mo43969a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f56649c.mo43481a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final void mo43941a(double d, double d2, double d3, double d4) {
        this.f56649c.mo43450a(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final void mo43970a(double[] dArr, double d) {
        C52711k.m112240b(dArr, "wRbs");
        this.f56649c.mo43482a(dArr, d);
    }

    /* renamed from: a */
    public final void mo43946a(int i, float f, float f2, int i2) {
        this.f56649c.mo43455a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final void mo43944a(float f, float f2, float f3, float f4, float f5) {
        this.f56649c.mo43453a(f, f2, f3, f4, f5);
    }

    /* renamed from: a */
    public final void mo43960a(String str, int i, int i2, String str2) {
        C52711k.m112240b(str, "inputext");
        C52711k.m112240b(str2, "var4");
        this.f56649c.mo43471a(str, i, i2, str2);
    }

    /* renamed from: a */
    public final void mo43955a(C20727w wVar) {
        C52711k.m112240b(wVar, "callback");
        C20489b bVar = this.f56649c;
        C52711k.m112240b(wVar, "$this$proxy");
        bVar.mo43463a((OnARTextCountCallback) new C20612d(wVar));
    }

    /* renamed from: a */
    public final void mo43950a(C20658a aVar) {
        C52711k.m112240b(aVar, "callback");
        C20489b bVar = this.f56649c;
        C52711k.m112240b(aVar, "$this$proxy");
        bVar.mo43462a((OnARTextContentCallback) new C20613e(aVar));
    }

    /* renamed from: a */
    public final void mo43957a(C20733y yVar) {
        IStickerRequestCallback iStickerRequestCallback;
        C20489b bVar = this.f56649c;
        if (yVar != null) {
            C52711k.m112240b(yVar, "$this$proxy");
            iStickerRequestCallback = new C20614f(yVar);
        } else {
            iStickerRequestCallback = null;
        }
        bVar.mo43465a(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final void mo43952a(C20709q qVar) {
        C52711k.m112240b(qVar, "callback");
        C20489b bVar = this.f56649c;
        C52711k.m112240b(qVar, "$this$proxy");
        bVar.mo43467a((C50621i) new C20615g(qVar, qVar));
    }

    /* renamed from: a */
    public final void mo43951a(C20706p pVar) {
        C52711k.m112240b(pVar, "callback");
        C20489b bVar = this.f56649c;
        C52711k.m112240b(pVar, "$this$proxy");
        bVar.mo43464a((OnCherEffectParmaCallback) new C20616h(pVar));
    }

    /* renamed from: a */
    public final void mo43971a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f56649c.mo43483a(strArr, dArr, zArr);
    }

    /* renamed from: a */
    public final void mo43953a(C20715s sVar) {
        C52711k.m112240b(sVar, "listener");
        C20489b bVar = this.f56649c;
        C52711k.m112240b(sVar, "$this$proxy");
        bVar.mo43466a((C20818a) new C20611c(sVar));
    }

    /* renamed from: a */
    public final void mo43947a(int i, long j, long j2, String str) {
        C52711k.m112240b(str, "msg");
        this.f56649c.mo43456a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo43954a(C20724v vVar) {
        C2593a aVar;
        C20489b bVar = this.f56649c;
        if (vVar != null) {
            C52711k.m112240b(vVar, "$this$proxy");
            aVar = new C20617i(vVar);
        } else {
            aVar = null;
        }
        bVar.mo43461a(aVar);
    }

    /* renamed from: b */
    public final void mo43983b(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "value");
        this.f56649c.mo43472a(str, str2);
    }

    /* renamed from: a */
    public final void mo43958a(C20736z zVar) {
        C52711k.m112240b(zVar, "landmarkListener");
        C52711k.m112240b(zVar, "$this$proxy");
        C50790w jVar = new C20618j(zVar);
        Map<IBinder, C50790w> map = this.f56647a;
        IBinder asBinder = zVar.asBinder();
        C52711k.m112236a((Object) asBinder, "landmarkListener.asBinder()");
        map.put(asBinder, jVar);
        this.f56649c.mo43494b(jVar);
    }

    /* renamed from: a */
    public final void mo43966a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C52711k.m112240b(list, "oldNodes");
        C52711k.m112240b(list2, "newNodes");
        this.f56649c.mo43477a(list, list2, i);
    }

    /* renamed from: b */
    public final void mo43975b() {
        this.f56649c.mo43510d();
    }

    /* renamed from: f */
    public final void mo44009f() {
        this.f56649c.mo43487b();
    }

    /* renamed from: c */
    public final void mo43988c() {
        this.f56649c.mo43524f();
    }

    /* renamed from: d */
    public final void mo43997d() {
        this.f56649c.mo43500c();
    }

    /* renamed from: e */
    public final void mo44004e() {
        this.f56649c.mo43459a((Context) C20315a.m50093b());
    }

    /* renamed from: g */
    public final C20776e mo44015g() {
        C20501c e = this.f56649c.mo43518e();
        C52711k.m112240b(e, "$this$stub");
        return new C20620l(e);
    }

    /* renamed from: a */
    public final void mo43939a() {
        this.f56649c.mo43492b((Context) C20315a.m50093b());
    }

    /* renamed from: c */
    public final int mo43986c(float f) {
        return this.f56649c.mo43499c(f);
    }

    /* renamed from: d */
    public final int mo43995d(float f) {
        return this.f56649c.mo43508d(f);
    }

    /* renamed from: e */
    public final int mo44003e(float f) {
        return this.f56649c.mo43516e(f);
    }

    /* renamed from: f */
    public final int mo44008f(float f) {
        return this.f56649c.mo43522f(f);
    }

    /* renamed from: g */
    public final int mo44014g(float f) {
        return this.f56649c.mo43527g(f);
    }

    /* renamed from: h */
    public final void mo44018h(String str) {
        this.f56649c.mo43470a(str);
    }

    /* renamed from: i */
    public final void mo44020i(boolean z) {
        this.f56649c.mo43531h(z);
    }

    /* renamed from: j */
    public final void mo44021j(boolean z) {
        this.f56649c.mo43532i(z);
    }

    /* renamed from: k */
    public final void mo44022k(boolean z) {
        this.f56649c.mo43479a(z);
    }

    /* renamed from: l */
    public final void mo44023l(boolean z) {
        this.f56649c.mo43498b(z);
    }

    /* renamed from: m */
    public final void mo44024m(boolean z) {
        this.f56649c.mo43506c(z);
    }

    /* renamed from: n */
    public final void mo44025n(boolean z) {
        this.f56649c.mo43537n(z);
    }

    /* renamed from: b */
    public final int mo43973b(String str) {
        C52711k.m112240b(str, "strResPath");
        return this.f56649c.mo43509d(str);
    }

    /* renamed from: c */
    public final int mo43987c(String str) {
        C52711k.m112240b(str, "strRes");
        return this.f56649c.mo43517e(str);
    }

    /* renamed from: d */
    public final int mo43996d(String str) {
        C52711k.m112240b(str, "resourcePath");
        return this.f56649c.mo43523f(str);
    }

    /* renamed from: e */
    public final float mo44002e(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        return this.f56649c.mo43530h(str);
    }

    /* renamed from: g */
    public final void mo44016g(String str) {
        C52711k.m112240b(str, "language");
        this.f56649c.mo43495b(str);
    }

    /* renamed from: h */
    public final void mo44019h(boolean z) {
        this.f56649c.mo43529g(z);
    }

    public C20757c(C20489b bVar) {
        C52711k.m112240b(bVar, "effectController");
        this.f56649c = bVar;
    }

    /* renamed from: a */
    public final int mo43933a(Bitmap bitmap) {
        return this.f56649c.mo43443a(bitmap);
    }

    /* renamed from: f */
    public final void mo44011f(int i) {
        this.f56649c.mo43454a(i);
    }

    /* renamed from: g */
    public final void mo44017g(boolean z) {
        this.f56649c.mo43526f(z);
    }

    /* renamed from: b */
    public final void mo43977b(float f) {
        this.f56649c.mo43489b(f);
    }

    /* renamed from: d */
    public final void mo43999d(int i) {
        this.f56649c.mo43491b(i);
    }

    /* renamed from: e */
    public final void mo44007e(boolean z) {
        this.f56649c.mo43515d(z);
    }

    /* renamed from: f */
    public final void mo44012f(String str) {
        this.f56649c.mo43528g(str);
    }

    /* renamed from: c */
    public final void mo43991c(int i) {
        this.f56649c.mo43512d(i);
    }

    /* renamed from: f */
    public final void mo44013f(boolean z) {
        this.f56649c.mo43521e(z);
    }

    /* renamed from: b */
    public final void mo43979b(int i) {
        this.f56649c.mo43503c(i);
    }

    /* renamed from: d */
    public final void mo44001d(boolean z) {
        this.f56649c.mo43536m(z);
    }

    /* renamed from: b */
    public final void mo43980b(C20730x xVar) {
        C52711k.m112240b(xVar, "listener");
        C52711k.m112240b(xVar, "$this$proxy");
        C50627o bVar = new C20610b(xVar);
        Map<IBinder, C50627o> map = this.f56648b;
        IBinder asBinder = xVar.asBinder();
        C52711k.m112236a((Object) asBinder, "listener.asBinder()");
        map.put(asBinder, bVar);
        this.f56649c.mo43493b(bVar);
    }

    /* renamed from: c */
    public final void mo43993c(boolean z) {
        this.f56649c.mo43535l(z);
    }

    /* renamed from: b */
    public final void mo43981b(C20736z zVar) {
        C52711k.m112240b(zVar, "landmarkListener");
        C50790w wVar = (C50790w) this.f56647a.get(zVar.asBinder());
        if (wVar != null) {
            this.f56649c.mo43469a(wVar);
            this.f56647a.remove(zVar.asBinder());
        }
    }

    /* renamed from: a */
    public final int mo43931a(int i, float f) {
        return this.f56649c.mo43441a(i, f);
    }

    /* renamed from: a */
    public final int mo43932a(int i, int i2) {
        return this.f56649c.mo43442a(i, i2);
    }

    /* renamed from: f */
    public final void mo44010f(float f, float f2) {
        this.f56649c.mo43519e(f, f2);
    }

    /* renamed from: a */
    public final int mo43934a(String str, float f) {
        C52711k.m112240b(str, "strRes");
        return this.f56649c.mo43444a(str, f);
    }

    /* renamed from: d */
    public final void mo43998d(float f, float f2) {
        this.f56649c.mo43502c(f, f2);
    }

    /* renamed from: e */
    public final void mo44005e(float f, float f2) {
        this.f56649c.mo43511d(f, f2);
    }

    /* renamed from: c */
    public final void mo43990c(float f, float f2) {
        this.f56649c.mo43490b(f, f2);
    }

    /* renamed from: b */
    public final void mo43978b(float f, float f2) {
        this.f56649c.mo43452a(f, f2);
    }

    /* renamed from: d */
    public final void mo44000d(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "list");
        this.f56649c.mo43505c(list, i);
    }

    /* renamed from: c */
    public final void mo43992c(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "list");
        this.f56649c.mo43514d(list, i);
    }

    /* renamed from: a */
    public final int mo43938a(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "imagePath");
        return this.f56649c.mo43486b(str, str2);
    }

    /* renamed from: c */
    public final int[] mo43994c(String str, String str2) {
        C52711k.m112240b(str, "nodePath");
        C52711k.m112240b(str2, "nodeKey");
        return this.f56649c.mo43507c(str, str2);
    }

    /* renamed from: b */
    public final int mo43974b(String str, float f, float f2) {
        C52711k.m112240b(str, "strRes");
        return this.f56649c.mo43485b(str, f, f2);
    }

    /* renamed from: a */
    public final int mo43935a(String str, float f, float f2) {
        C52711k.m112240b(str, "strRes");
        return this.f56649c.mo43445a(str, f, f2);
    }

    /* renamed from: b */
    public final void mo43976b(double d, double d2, double d3, double d4) {
        this.f56649c.mo43488b(d, d2, d3, d4);
    }

    /* renamed from: c */
    public final void mo43989c(double d, double d2, double d3, double d4) {
        this.f56649c.mo43501c(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final int mo43937a(String str, int i, int i2, boolean z) {
        return this.f56649c.mo43447a(str, i, i2, z);
    }

    /* renamed from: a */
    public final int mo43936a(String str, int i, int i2, String str2, boolean z) {
        return this.f56649c.mo43446a(str, i, i2, str2, z);
    }
}
