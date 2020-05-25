package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.ugc.asve.p1241e.C20397h;
import com.p683ss.android.ugc.asve.recorder.camera.C20463c;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20703o.C20704a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.ad */
public final class C20597ad extends C20704a {

    /* renamed from: a */
    public final WeakReference<C20463c> f56442a;

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.ad$a */
    static final class C20598a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C20597ad f56443a;

        /* renamed from: b */
        final /* synthetic */ int f56444b;

        /* renamed from: c */
        final /* synthetic */ float f56445c;

        /* renamed from: d */
        final /* synthetic */ boolean f56446d;

        C20598a(C20597ad adVar, int i, float f, boolean z) {
            this.f56443a = adVar;
            this.f56444b = i;
            this.f56445c = f;
            this.f56446d = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C20463c cVar = (C20463c) this.f56443a.f56442a.get();
            if (cVar != null) {
                cVar.mo43414a(this.f56444b, this.f56445c, this.f56446d);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.a.ad$b */
    static final class C20599b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C20597ad f56447a;

        /* renamed from: b */
        final /* synthetic */ int f56448b;

        /* renamed from: c */
        final /* synthetic */ boolean f56449c;

        /* renamed from: d */
        final /* synthetic */ boolean f56450d;

        /* renamed from: e */
        final /* synthetic */ float f56451e;

        /* renamed from: f */
        final /* synthetic */ int[] f56452f;

        C20599b(C20597ad adVar, int i, boolean z, boolean z2, float f, int[] iArr) {
            this.f56447a = adVar;
            this.f56448b = i;
            this.f56449c = z;
            this.f56450d = z2;
            this.f56451e = f;
            this.f56452f = iArr;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            List list;
            List list2;
            C20463c cVar = (C20463c) this.f56447a.f56442a.get();
            if (cVar != null) {
                int i = this.f56448b;
                boolean z = this.f56449c;
                boolean z2 = this.f56450d;
                float f = this.f56451e;
                int[] iArr = this.f56452f;
                if (iArr != null) {
                    C52711k.m112240b(iArr, "$this$toList");
                    switch (iArr.length) {
                        case 0:
                            list2 = C52575l.m112097a();
                            break;
                        case 1:
                            list2 = C52575l.m112092a(Integer.valueOf(iArr[0]));
                            break;
                        default:
                            C52711k.m112240b(iArr, "$this$toMutableList");
                            ArrayList arrayList = new ArrayList(iArr.length);
                            for (int valueOf : iArr) {
                                arrayList.add(Integer.valueOf(valueOf));
                            }
                            list = arrayList;
                            break;
                    }
                } else {
                    list2 = null;
                }
                list = list2;
                cVar.mo43415a(i, z, z2, f, list);
            }
            return C52860x.f131107a;
        }
    }

    public C20597ad(C20463c cVar) {
        C52711k.m112240b(cVar, "zoomListener");
        this.f56442a = new WeakReference<>(cVar);
    }

    /* renamed from: a */
    public final void mo43746a(int i, float f, boolean z) {
        C20397h.m50605a(new C20598a(this, i, f, z));
    }

    /* renamed from: a */
    public final void mo43747a(int i, boolean z, boolean z2, float f, int[] iArr) {
        C20599b bVar = new C20599b(this, i, z, z2, f, iArr);
        C20397h.m50605a(bVar);
    }
}
