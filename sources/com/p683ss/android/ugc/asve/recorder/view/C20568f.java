package com.p683ss.android.ugc.asve.recorder.view;

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
import com.p683ss.android.ugc.asve.sandbox.wrap.C20818a;
import com.p683ss.android.vesdk.C50601ah.C50621i;
import com.p683ss.android.vesdk.C50601ah.C50627o;
import com.p683ss.android.vesdk.C50634ao;
import com.p683ss.android.vesdk.C50790w;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.view.f */
public final class C20568f implements C20489b {

    /* renamed from: a */
    private final C20489b f56373a;

    /* renamed from: a */
    public final int mo43441a(int i, float f) {
        return this.f56373a.mo43441a(i, f);
    }

    /* renamed from: a */
    public final int mo43442a(int i, int i2) {
        return this.f56373a.mo43442a(i, i2);
    }

    /* renamed from: a */
    public final int mo43443a(Bitmap bitmap) {
        return this.f56373a.mo43443a(bitmap);
    }

    /* renamed from: a */
    public final int mo43444a(String str, float f) {
        C52711k.m112240b(str, "strRes");
        return this.f56373a.mo43444a(str, f);
    }

    /* renamed from: a */
    public final int mo43445a(String str, float f, float f2) {
        C52711k.m112240b(str, "strRes");
        return this.f56373a.mo43445a(str, f, f2);
    }

    /* renamed from: a */
    public final int mo43446a(String str, int i, int i2, String str2, boolean z) {
        return this.f56373a.mo43446a(str, i, i2, str2, z);
    }

    /* renamed from: a */
    public final int mo43447a(String str, int i, int i2, boolean z) {
        return this.f56373a.mo43447a(str, i, i2, z);
    }

    /* renamed from: a */
    public final C19378e mo43448a() {
        return this.f56373a.mo43448a();
    }

    /* renamed from: a */
    public final void mo43449a(double d) {
        this.f56373a.mo43449a(d);
    }

    /* renamed from: a */
    public final void mo43450a(double d, double d2, double d3, double d4) {
        this.f56373a.mo43450a(d, d2, d3, d4);
    }

    /* renamed from: a */
    public final void mo43451a(float f) {
        this.f56373a.mo43451a(f);
    }

    /* renamed from: a */
    public final void mo43452a(float f, float f2) {
        this.f56373a.mo43452a(f, f2);
    }

    /* renamed from: a */
    public final void mo43453a(float f, float f2, float f3, float f4, float f5) {
        this.f56373a.mo43453a(f, f2, f3, f4, f5);
    }

    /* renamed from: a */
    public final void mo43454a(int i) {
        this.f56373a.mo43454a(i);
    }

    /* renamed from: a */
    public final void mo43455a(int i, float f, float f2, int i2) {
        this.f56373a.mo43455a(i, f, f2, i2);
    }

    /* renamed from: a */
    public final void mo43456a(int i, long j, long j2, String str) {
        C52711k.m112240b(str, "msg");
        this.f56373a.mo43456a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo43457a(int i, String str) {
        C52711k.m112240b(str, "strBeautyFaceRes");
        this.f56373a.mo43457a(i, str);
    }

    /* renamed from: a */
    public final void mo43458a(int i, String str, float f, float f2) {
        C52711k.m112240b(str, "strBeautyFaceRes");
        this.f56373a.mo43458a(i, str, f, f2);
    }

    /* renamed from: a */
    public final void mo43459a(Context context) {
        C52711k.m112240b(context, "context");
        this.f56373a.mo43459a(context);
    }

    /* renamed from: a */
    public final void mo43460a(Context context, String str, String str2, String str3) {
        this.f56373a.mo43460a(context, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo43461a(C2593a aVar) {
        this.f56373a.mo43461a(aVar);
    }

    /* renamed from: a */
    public final void mo43462a(OnARTextContentCallback onARTextContentCallback) {
        C52711k.m112240b(onARTextContentCallback, "callback");
        this.f56373a.mo43462a(onARTextContentCallback);
    }

    /* renamed from: a */
    public final void mo43463a(OnARTextCountCallback onARTextCountCallback) {
        C52711k.m112240b(onARTextCountCallback, "callback");
        this.f56373a.mo43463a(onARTextCountCallback);
    }

    /* renamed from: a */
    public final void mo43464a(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C52711k.m112240b(onCherEffectParmaCallback, "callback");
        this.f56373a.mo43464a(onCherEffectParmaCallback);
    }

    /* renamed from: a */
    public final void mo43465a(IStickerRequestCallback iStickerRequestCallback) {
        this.f56373a.mo43465a(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final void mo43466a(C20818a aVar) {
        C52711k.m112240b(aVar, "callback");
        this.f56373a.mo43466a(aVar);
    }

    /* renamed from: a */
    public final void mo43467a(C50621i iVar) {
        C52711k.m112240b(iVar, "callback");
        this.f56373a.mo43467a(iVar);
    }

    /* renamed from: a */
    public final void mo43468a(C50627o oVar) {
        C52711k.m112240b(oVar, "slamDetectListener");
        this.f56373a.mo43468a(oVar);
    }

    /* renamed from: a */
    public final void mo43469a(C50790w wVar) {
        C52711k.m112240b(wVar, "landmarkListener");
        this.f56373a.mo43469a(wVar);
    }

    /* renamed from: a */
    public final void mo43470a(String str) {
        this.f56373a.mo43470a(str);
    }

    /* renamed from: a */
    public final void mo43471a(String str, int i, int i2, String str2) {
        C52711k.m112240b(str2, "arg3");
        this.f56373a.mo43471a(str, i, i2, str2);
    }

    /* renamed from: a */
    public final void mo43472a(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "value");
        this.f56373a.mo43472a(str, str2);
    }

    /* renamed from: a */
    public final void mo43473a(String str, String str2, float f) {
        this.f56373a.mo43473a(str, str2, f);
    }

    /* renamed from: a */
    public final void mo43474a(String str, String str2, float f, float f2, float f3) {
        this.f56373a.mo43474a(str, str2, f, f2, f3);
    }

    /* renamed from: a */
    public final void mo43475a(String str, Map<Integer, Float> map) {
        C52711k.m112240b(str, "resourcePath");
        C52711k.m112240b(map, "intensityDict");
        this.f56373a.mo43475a(str, map);
    }

    /* renamed from: a */
    public final void mo43476a(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        this.f56373a.mo43476a(list, i);
    }

    /* renamed from: a */
    public final void mo43477a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C52711k.m112240b(list, "oldNodes");
        C52711k.m112240b(list2, "newNodes");
        this.f56373a.mo43477a(list, list2, i);
    }

    /* renamed from: a */
    public final void mo43478a(Map<Integer, Float> map) {
        C52711k.m112240b(map, "intensityDict");
        this.f56373a.mo43478a(map);
    }

    /* renamed from: a */
    public final void mo43479a(boolean z) {
        this.f56373a.mo43479a(z);
    }

    /* renamed from: a */
    public final void mo43480a(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        String str2 = str;
        C52711k.m112240b(str2, "phoneParamPath");
        this.f56373a.mo43480a(z, i, z2, z3, z4, z5, str2);
    }

    /* renamed from: a */
    public final void mo43481a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f56373a.mo43481a(z, z2, z3, z4);
    }

    /* renamed from: a */
    public final void mo43482a(double[] dArr, double d) {
        C52711k.m112240b(dArr, "wRbs");
        this.f56373a.mo43482a(dArr, d);
    }

    /* renamed from: a */
    public final void mo43483a(String[] strArr, double[] dArr, boolean[] zArr) {
        this.f56373a.mo43483a(strArr, dArr, zArr);
    }

    /* renamed from: a */
    public final boolean mo43484a(C50634ao aoVar, int i) {
        C52711k.m112240b(aoVar, "touchPointer");
        return this.f56373a.mo43484a(aoVar, i);
    }

    /* renamed from: b */
    public final int mo43485b(String str, float f, float f2) {
        C52711k.m112240b(str, "strRes");
        return this.f56373a.mo43485b(str, f, f2);
    }

    /* renamed from: b */
    public final int mo43486b(String str, String str2) {
        C52711k.m112240b(str, "key");
        C52711k.m112240b(str2, "imagePath");
        return this.f56373a.mo43486b(str, str2);
    }

    /* renamed from: b */
    public final void mo43487b() {
        this.f56373a.mo43487b();
    }

    /* renamed from: b */
    public final void mo43488b(double d, double d2, double d3, double d4) {
        this.f56373a.mo43488b(d, d2, d3, d4);
    }

    /* renamed from: b */
    public final void mo43489b(float f) {
        this.f56373a.mo43489b(f);
    }

    /* renamed from: b */
    public final void mo43490b(float f, float f2) {
        this.f56373a.mo43490b(f, f2);
    }

    /* renamed from: b */
    public final void mo43491b(int i) {
        this.f56373a.mo43491b(i);
    }

    /* renamed from: b */
    public final void mo43492b(Context context) {
        C52711k.m112240b(context, "context");
        this.f56373a.mo43492b(context);
    }

    /* renamed from: b */
    public final void mo43493b(C50627o oVar) {
        C52711k.m112240b(oVar, "slamDetectListener");
        this.f56373a.mo43493b(oVar);
    }

    /* renamed from: b */
    public final void mo43494b(C50790w wVar) {
        C52711k.m112240b(wVar, "landmarkListener");
        this.f56373a.mo43494b(wVar);
    }

    /* renamed from: b */
    public final void mo43495b(String str) {
        C52711k.m112240b(str, "language");
        this.f56373a.mo43495b(str);
    }

    /* renamed from: b */
    public final void mo43496b(String str, float f) {
        this.f56373a.mo43496b(str, f);
    }

    /* renamed from: b */
    public final void mo43497b(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        this.f56373a.mo43497b(list, i);
    }

    /* renamed from: b */
    public final void mo43498b(boolean z) {
        this.f56373a.mo43498b(z);
    }

    /* renamed from: c */
    public final int mo43499c(float f) {
        return this.f56373a.mo43499c(f);
    }

    /* renamed from: c */
    public final void mo43500c() {
        this.f56373a.mo43500c();
    }

    /* renamed from: c */
    public final void mo43501c(double d, double d2, double d3, double d4) {
        this.f56373a.mo43501c(d, d2, d3, d4);
    }

    /* renamed from: c */
    public final void mo43502c(float f, float f2) {
        this.f56373a.mo43502c(f, f2);
    }

    /* renamed from: c */
    public final void mo43503c(int i) {
        this.f56373a.mo43503c(i);
    }

    /* renamed from: c */
    public final void mo43504c(String str) {
        C52711k.m112240b(str, "strBeautyFaceRes");
        this.f56373a.mo43504c(str);
    }

    /* renamed from: c */
    public final void mo43505c(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        this.f56373a.mo43505c(list, i);
    }

    /* renamed from: c */
    public final void mo43506c(boolean z) {
        this.f56373a.mo43506c(z);
    }

    /* renamed from: c */
    public final int[] mo43507c(String str, String str2) {
        C52711k.m112240b(str, "nodePath");
        C52711k.m112240b(str2, "nodeKey");
        return this.f56373a.mo43507c(str, str2);
    }

    /* renamed from: d */
    public final int mo43508d(float f) {
        return this.f56373a.mo43508d(f);
    }

    /* renamed from: d */
    public final int mo43509d(String str) {
        C52711k.m112240b(str, "strResPath");
        return this.f56373a.mo43509d(str);
    }

    /* renamed from: d */
    public final void mo43510d() {
        this.f56373a.mo43510d();
    }

    /* renamed from: d */
    public final void mo43511d(float f, float f2) {
        this.f56373a.mo43511d(f, f2);
    }

    /* renamed from: d */
    public final void mo43512d(int i) {
        this.f56373a.mo43512d(i);
    }

    /* renamed from: d */
    public final void mo43513d(String str, String str2) {
        this.f56373a.mo43513d(str, str2);
    }

    /* renamed from: d */
    public final void mo43514d(List<ComposerInfo> list, int i) {
        C52711k.m112240b(list, "nodes");
        this.f56373a.mo43514d(list, i);
    }

    /* renamed from: d */
    public final void mo43515d(boolean z) {
        this.f56373a.mo43515d(z);
    }

    /* renamed from: e */
    public final int mo43516e(float f) {
        return this.f56373a.mo43516e(f);
    }

    /* renamed from: e */
    public final int mo43517e(String str) {
        C52711k.m112240b(str, "strRes");
        return this.f56373a.mo43517e(str);
    }

    /* renamed from: e */
    public final C20501c mo43518e() {
        return this.f56373a.mo43518e();
    }

    /* renamed from: e */
    public final void mo43519e(float f, float f2) {
        this.f56373a.mo43519e(f, f2);
    }

    /* renamed from: e */
    public final void mo43520e(int i) {
        this.f56373a.mo43520e(i);
    }

    /* renamed from: e */
    public final void mo43521e(boolean z) {
        this.f56373a.mo43521e(z);
    }

    /* renamed from: f */
    public final int mo43522f(float f) {
        return this.f56373a.mo43522f(f);
    }

    /* renamed from: f */
    public final int mo43523f(String str) {
        C52711k.m112240b(str, "resourcePath");
        return this.f56373a.mo43523f(str);
    }

    /* renamed from: f */
    public final void mo43524f() {
        this.f56373a.mo43524f();
    }

    /* renamed from: f */
    public final void mo43525f(float f, float f2) {
        this.f56373a.mo43525f(f, f2);
    }

    /* renamed from: f */
    public final void mo43526f(boolean z) {
        this.f56373a.mo43526f(z);
    }

    /* renamed from: g */
    public final int mo43527g(float f) {
        return this.f56373a.mo43527g(f);
    }

    /* renamed from: g */
    public final void mo43528g(String str) {
        this.f56373a.mo43528g(str);
    }

    /* renamed from: g */
    public final void mo43529g(boolean z) {
        this.f56373a.mo43529g(z);
    }

    /* renamed from: h */
    public final float mo43530h(String str) {
        C52711k.m112240b(str, "filterPath");
        return this.f56373a.mo43530h(str);
    }

    /* renamed from: h */
    public final void mo43531h(boolean z) {
        this.f56373a.mo43531h(z);
    }

    /* renamed from: i */
    public final void mo43532i(boolean z) {
        this.f56373a.mo43532i(z);
    }

    /* renamed from: j */
    public final boolean mo43533j(boolean z) {
        return this.f56373a.mo43533j(z);
    }

    /* renamed from: k */
    public final void mo43534k(boolean z) {
        this.f56373a.mo43534k(z);
    }

    /* renamed from: l */
    public final void mo43535l(boolean z) {
        this.f56373a.mo43535l(z);
    }

    /* renamed from: m */
    public final void mo43536m(boolean z) {
        this.f56373a.mo43536m(z);
    }

    /* renamed from: n */
    public final void mo43537n(boolean z) {
        this.f56373a.mo43537n(z);
    }

    public C20568f(C20489b bVar) {
        C52711k.m112240b(bVar, "ctrl");
        this.f56373a = bVar;
    }
}
