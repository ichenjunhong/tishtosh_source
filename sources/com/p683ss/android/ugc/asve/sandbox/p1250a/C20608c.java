package com.p683ss.android.ugc.asve.sandbox.p1250a;

import android.util.SparseArray;
import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.medialib.FaceBeautyInvoker.FaceInfoCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p683ss.android.medialib.model.FaceAttribute;
import com.p683ss.android.medialib.model.FaceAttributeInfo;
import com.p683ss.android.medialib.model.FaceDetectInfo;
import com.p683ss.android.medialib.presenter.IStickerRequestCallback;
import com.p683ss.android.ugc.asve.recorder.effect.composer.C20501c;
import com.p683ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p683ss.android.ugc.asve.sandbox.C20776e;
import com.p683ss.android.ugc.asve.sandbox.C20776e.C20777a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20658a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20688j.C20689a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20706p;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20709q;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20715s;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20724v;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20727w;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20730x;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20733y;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20736z;
import com.p683ss.android.ugc.asve.sandbox.wrap.ASSimpleFaceInfo;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20818a;
import com.p683ss.android.vesdk.C50601ah.C50621i;
import com.p683ss.android.vesdk.C50601ah.C50622j;
import com.p683ss.android.vesdk.C50601ah.C50627o;
import com.p683ss.android.vesdk.C50790w;
import com.p683ss.android.vesdk.faceinfo.C50691a;
import com.p683ss.android.vesdk.faceinfo.C50692b;
import com.p683ss.android.vesdk.faceinfo.C50695d;
import java.util.ArrayList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.c */
public final class C20608c {

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$a */
    public static final class C20609a extends C20777a {
        /* renamed from: a */
        public final C20776e mo43748a() {
            return this;
        }

        /* renamed from: b */
        public final void mo43755b() {
        }

        /* renamed from: a */
        public final C20776e mo43749a(int i) {
            return this;
        }

        /* renamed from: a */
        public final C20776e mo43750a(String str) {
            return this;
        }

        /* renamed from: a */
        public final C20776e mo43753a(List<String> list) {
            return this;
        }

        /* renamed from: a */
        public final C20776e mo43754a(List<ComposerInfo> list, int i) {
            return this;
        }

        /* renamed from: a */
        public final C20776e mo43751a(String str, String str2, float f) {
            return this;
        }

        /* renamed from: a */
        public final C20776e mo43752a(String str, String str2, int i) {
            C52711k.m112240b(str2, "extra");
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$b */
    public static final class C20610b implements C50627o {

        /* renamed from: a */
        final /* synthetic */ C20730x f56460a;

        public C20610b(C20730x xVar) {
            this.f56460a = xVar;
        }

        /* renamed from: a */
        public final void mo43756a(boolean z) {
            this.f56460a.mo43745a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$c */
    public static final class C20611c implements C20818a {

        /* renamed from: a */
        final /* synthetic */ C20715s f56461a;

        public C20611c(C20715s sVar) {
            this.f56461a = sVar;
        }

        /* renamed from: a */
        public final void mo43757a(ASSimpleFaceInfo[] aSSimpleFaceInfoArr) {
            C52711k.m112240b(aSSimpleFaceInfoArr, "infos");
            this.f56461a.mo43768a(aSSimpleFaceInfoArr);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$d */
    public static final class C20612d implements OnARTextCountCallback {

        /* renamed from: a */
        final /* synthetic */ C20727w f56462a;

        public C20612d(C20727w wVar) {
            this.f56462a = wVar;
        }

        public final void onResult(int i) {
            this.f56462a.mo43773a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$e */
    public static final class C20613e implements OnARTextContentCallback {

        /* renamed from: a */
        final /* synthetic */ C20658a f56463a;

        public C20613e(C20658a aVar) {
            this.f56463a = aVar;
        }

        public final void onResult(String[] strArr) {
            if (strArr != null) {
                this.f56463a.mo43772a(strArr);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$f */
    public static final class C20614f implements IStickerRequestCallback {

        /* renamed from: a */
        final /* synthetic */ C20733y f56464a;

        public C20614f(C20733y yVar) {
            this.f56464a = yVar;
        }

        public final void onStickerRequested(long j, boolean z) {
            this.f56464a.mo43783a(j, z);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$g */
    public static final class C20615g implements C50621i {

        /* renamed from: a */
        final /* synthetic */ C20709q f56465a;

        /* renamed from: b */
        final /* synthetic */ C20709q f56466b;

        public C20615g(C20709q qVar, C20709q qVar2) {
            this.f56465a = qVar;
            this.f56466b = qVar2;
        }

        /* renamed from: a */
        public final void mo43758a(SparseArray<Long> sparseArray, float f) {
            int size = sparseArray.size();
            Integer[] numArr = new Integer[size];
            for (int i = 0; i < size; i++) {
                numArr[i] = Integer.valueOf(0);
            }
            Long[] lArr = new Long[size];
            for (int i2 = 0; i2 < size; i2++) {
                lArr[i2] = Long.valueOf(0);
            }
            for (int i3 = 0; i3 < size; i3++) {
                int keyAt = sparseArray.keyAt(i3);
                Long l = (Long) sparseArray.get(keyAt);
                numArr[i3] = Integer.valueOf(keyAt);
                C52711k.m112236a((Object) l, "time");
                lArr[i3] = l;
            }
            C20709q qVar = this.f56466b;
            int[] a = C52568f.m112078a(numArr);
            C52711k.m112240b(lArr, "$this$toLongArray");
            int length = lArr.length;
            long[] jArr = new long[length];
            for (int i4 = 0; i4 < length; i4++) {
                jArr[i4] = lArr[i4].longValue();
            }
            if (Float.isNaN(f)) {
                f = 0.0f;
            }
            qVar.mo43785a(a, jArr, f);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$h */
    public static final class C20616h implements OnCherEffectParmaCallback {

        /* renamed from: a */
        final /* synthetic */ C20706p f56467a;

        public C20616h(C20706p pVar) {
            this.f56467a = pVar;
        }

        public final void onCherEffect(String[] strArr, double[] dArr, boolean[] zArr) {
            this.f56467a.mo43767a(strArr, dArr, zArr);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$i */
    public static final class C20617i implements C2593a {

        /* renamed from: a */
        final /* synthetic */ C20724v f56468a;

        public C20617i(C20724v vVar) {
            this.f56468a = vVar;
        }

        public final void onMessageReceived(int i, int i2, int i3, String str) {
            this.f56468a.mo43769a(i, i2, i3, str);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$j */
    public static final class C20618j implements C50790w {

        /* renamed from: a */
        final /* synthetic */ C20736z f56469a;

        public C20618j(C20736z zVar) {
            this.f56469a = zVar;
        }

        /* renamed from: a */
        public final void mo43759a(boolean z, boolean z2) {
            this.f56469a.mo43743a(z, z2);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$k */
    public static final class C20619k implements C20501c {

        /* renamed from: a */
        final /* synthetic */ C20776e f56470a;

        /* renamed from: a */
        public final void mo43557a() {
            this.f56470a.mo43755b();
        }

        /* renamed from: b */
        public final C20501c mo43558b() {
            this.f56470a.mo43748a();
            return this;
        }

        public C20619k(C20776e eVar) {
            this.f56470a = eVar;
        }

        /* renamed from: a */
        public final C20501c mo43550a(int i) {
            this.f56470a.mo43749a(i);
            return this;
        }

        /* renamed from: a */
        public final C20501c mo43552a(String str) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            this.f56470a.mo43750a(str);
            return this;
        }

        /* renamed from: a */
        public final C20501c mo43555a(List<String> list) {
            C52711k.m112240b(list, "paths");
            this.f56470a.mo43753a(list);
            return this;
        }

        /* renamed from: a */
        public final C20501c mo43556a(List<ComposerInfo> list, int i) {
            C52711k.m112240b(list, "paths");
            this.f56470a.mo43754a(list, i);
            return this;
        }

        /* renamed from: a */
        public final C20501c mo43553a(String str, String str2, float f) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str2, "featureTag");
            this.f56470a.mo43751a(str, str2, f);
            return this;
        }

        /* renamed from: a */
        public final C20501c mo43554a(String str, String str2, int i) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str2, "extra");
            this.f56470a.mo43752a(str, str2, i);
            return this;
        }

        /* renamed from: a */
        public final C20501c mo43551a(int i, String str, String str2, float f) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str2, "featureTag");
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$l */
    public static final class C20620l extends C20777a {

        /* renamed from: a */
        final /* synthetic */ C20501c f56471a;

        /* renamed from: b */
        public final void mo43755b() {
            this.f56471a.mo43557a();
        }

        /* renamed from: a */
        public final C20776e mo43748a() {
            this.f56471a.mo43558b();
            return this;
        }

        public C20620l(C20501c cVar) {
            this.f56471a = cVar;
        }

        /* renamed from: a */
        public final C20776e mo43749a(int i) {
            this.f56471a.mo43550a(i);
            return this;
        }

        /* renamed from: a */
        public final C20776e mo43750a(String str) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            this.f56471a.mo43552a(str);
            return this;
        }

        /* renamed from: a */
        public final C20776e mo43753a(List<String> list) {
            C52711k.m112240b(list, "paths");
            this.f56471a.mo43555a(list);
            return this;
        }

        /* renamed from: a */
        public final C20776e mo43754a(List<ComposerInfo> list, int i) {
            C52711k.m112240b(list, "paths");
            this.f56471a.mo43556a(list, i);
            return this;
        }

        /* renamed from: a */
        public final C20776e mo43751a(String str, String str2, float f) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str2, "featureTag");
            this.f56471a.mo43553a(str, str2, f);
            return this;
        }

        /* renamed from: a */
        public final C20776e mo43752a(String str, String str2, int i) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            C52711k.m112240b(str2, "extra");
            this.f56471a.mo43554a(str, str2, i);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$m */
    public static final class C20621m implements FaceInfoCallback {

        /* renamed from: a */
        final /* synthetic */ C20818a f56472a;

        public C20621m(C20818a aVar) {
            this.f56472a = aVar;
        }

        public final void onResult(FaceAttributeInfo faceAttributeInfo, FaceDetectInfo faceDetectInfo) {
            C20818a aVar = this.f56472a;
            if (faceAttributeInfo != null) {
                C52711k.m112240b(faceAttributeInfo, "$this$toSimpleFaceInfos");
                List arrayList = new ArrayList();
                FaceAttribute[] info = faceAttributeInfo.getInfo();
                C52711k.m112236a((Object) info, "info");
                for (FaceAttribute faceAttribute : info) {
                    C52711k.m112236a((Object) faceAttribute, "it");
                    C52711k.m112240b(faceAttribute, "$this$toSimpleFaceInfo");
                    arrayList.add(new ASSimpleFaceInfo(faceAttribute.getBoyProb()));
                }
                Object[] array = arrayList.toArray(new ASSimpleFaceInfo[0]);
                if (array != null) {
                    aVar.mo43757a((ASSimpleFaceInfo[]) array);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.c$n */
    public static final class C20622n implements C50622j {

        /* renamed from: a */
        final /* synthetic */ C20818a f56473a;

        public C20622n(C20818a aVar) {
            this.f56473a = aVar;
        }

        /* renamed from: a */
        public final void mo43760a(C50692b bVar, C50695d dVar) {
            if (bVar != null) {
                C20818a aVar = this.f56473a;
                C52711k.m112240b(bVar, "$this$toSimpleFaceInfo");
                List arrayList = new ArrayList();
                C50691a[] aVarArr = bVar.f127210a;
                C52711k.m112236a((Object) aVarArr, "info");
                for (C50691a aVar2 : aVarArr) {
                    C52711k.m112236a((Object) aVar2, "it");
                    C52711k.m112240b(aVar2, "$this$toSimpleFaceInfo");
                    arrayList.add(new ASSimpleFaceInfo(aVar2.f127188b));
                }
                Object[] array = arrayList.toArray(new ASSimpleFaceInfo[0]);
                if (array != null) {
                    aVar.mo43757a((ASSimpleFaceInfo[]) array);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
    }

    /* renamed from: a */
    public static final C20689a m51928a(C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(bVar, "$this$stub");
        return new C20648w(bVar);
    }
}
