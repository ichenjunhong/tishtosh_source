package com.p683ss.android.ugc.aweme.shortvideo.edit;

import com.p683ss.android.ugc.asve.p1239c.C20342a;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C43738a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p683ss.android.vesdk.C50720o;
import com.p683ss.android.vesdk.VEListener.C50548l;
import com.p683ss.android.vesdk.VERecordData;
import com.p683ss.android.vesdk.runtime.C50765b;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.p */
public final class C43759p implements C43765s {

    /* renamed from: a */
    public C0027j<Boolean> f110808a = new C0027j<>();

    /* renamed from: b */
    public boolean f110809b;

    /* renamed from: c */
    private C20347c f110810c;

    /* renamed from: d */
    private final C20347c f110811d;

    /* renamed from: e */
    private final MultiEditVideoRecordData f110812e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.p$a */
    public static final class C43760a implements C50548l {

        /* renamed from: a */
        final /* synthetic */ C43759p f110813a;

        C43760a(C43759p pVar) {
            this.f110813a = pVar;
        }

        /* renamed from: a */
        public final void mo89270a(int i) {
            boolean z;
            C43759p pVar = this.f110813a;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            pVar.f110809b = z;
            this.f110813a.f110808a.mo44a(Boolean.valueOf(this.f110813a.f110809b));
        }
    }

    /* renamed from: c */
    public final String[] mo59021c() {
        return this.f110811d.mo43066h();
    }

    /* renamed from: d */
    public final String[] mo59022d() {
        return this.f110811d.mo43070j();
    }

    /* renamed from: e */
    public final String[] mo59023e() {
        return this.f110811d.mo43068i();
    }

    /* renamed from: b */
    public final boolean mo59020b() {
        if (mo59021c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C0013i<Boolean> mo59019a() {
        C20342a aVar;
        if (mo59021c() != null) {
            this.f110809b = true;
            this.f110808a.mo44a(Boolean.valueOf(this.f110809b));
        } else {
            C50765b a = this.f110811d.mo43013a();
            VERecordData a2 = C43738a.m96063a(this.f110812e);
            C50548l aVar2 = new C43760a(this);
            C52711k.m112240b(a, "resManager");
            C52711k.m112240b(a2, "recordData");
            C52711k.m112240b(aVar2, "listener");
            C50720o a3 = C50720o.m109677a(a, a2, aVar2);
            if (a3 != null) {
                aVar = new C20342a(a3);
            } else {
                aVar = null;
            }
            this.f110810c = aVar;
        }
        C0013i<TResult> iVar = this.f110808a.f77a;
        C52711k.m112236a((Object) iVar, "prepareTask.task");
        return iVar;
    }

    public C43759p(C20347c cVar, MultiEditVideoRecordData multiEditVideoRecordData) {
        C52711k.m112240b(cVar, "srcVEEditor");
        C52711k.m112240b(multiEditVideoRecordData, "recordData");
        this.f110811d = cVar;
        this.f110812e = multiEditVideoRecordData;
    }
}
