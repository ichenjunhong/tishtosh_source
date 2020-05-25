package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.p683ss.android.ugc.aweme.shortvideo.cut.C42626c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42648h;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.vesdk.VEListener.C50547k;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.n */
public final class C43066n {

    /* renamed from: a */
    public C42648h f108712a;

    /* renamed from: b */
    public C42648h f108713b;

    /* renamed from: c */
    public boolean f108714c;

    /* renamed from: a */
    public final void mo87445a(C42626c cVar, C50547k kVar) {
        C52711k.m112240b(cVar, "settings");
        C52711k.m112240b(kVar, "listener");
        C42648h hVar = this.f108712a;
        if (hVar != null) {
            hVar.mo86910a(cVar, kVar);
        }
    }

    /* renamed from: a */
    public final void mo87446a(List<? extends VideoSegment> list, int i, long j, long j2) {
        C42648h hVar = this.f108713b;
        if (hVar != null) {
            hVar.mo86911a(list, i);
        }
        C42648h hVar2 = this.f108712a;
        if (hVar2 != null) {
            hVar2.mo86911a(list, i);
        }
        if (this.f108714c) {
            C42648h hVar3 = this.f108713b;
            if (hVar3 != null) {
                hVar3.mo86912a(list, i, j, j2);
            }
        } else {
            C42648h hVar4 = this.f108712a;
            if (hVar4 != null) {
                hVar4.mo86912a(list, i, j, j2);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo87447a(float f, float f2, float f3, int i, int i2) {
        if (this.f108712a == null) {
            return false;
        }
        C42648h hVar = this.f108712a;
        if (hVar == null) {
            C52711k.m112234a();
        }
        return hVar.mo86915a(f, f2, f3, i, i2);
    }
}
