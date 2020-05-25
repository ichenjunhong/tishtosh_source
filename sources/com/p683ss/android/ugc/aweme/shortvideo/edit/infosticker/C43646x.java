package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0781c;
import com.p683ss.android.ugc.aweme.out.AVServiceImpl;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2193e.C43460a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.p2193e.C43460a.C43466e;
import dmt.p2652av.video.C53030y;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.x */
final /* synthetic */ class C43646x implements C0781c {

    /* renamed from: a */
    private final C43535i f110544a;

    /* renamed from: b */
    private final boolean f110545b;

    /* renamed from: c */
    private final boolean f110546c;

    C43646x(C43535i iVar, boolean z, boolean z2) {
        this.f110544a = iVar;
        this.f110545b = z;
        this.f110546c = z2;
    }

    public final void accept(Object obj) {
        C43535i iVar = this.f110544a;
        boolean z = this.f110545b;
        boolean z2 = this.f110546c;
        Void voidR = (Void) obj;
        boolean z3 = !z;
        iVar.f110161d.setVisibility(z3 ? 0 : 4);
        if (z3) {
            iVar.f110161d.mo88449e();
        }
        if (z) {
            iVar.f110161d.f109936k = InfoStickerEditView.f109903l;
            iVar.f110167j.mo43019a(true);
            return;
        }
        iVar.f110161d.f109936k = 0;
        if (z2) {
            C43460a aVar = iVar.f110137F;
            FragmentActivity fragmentActivity = iVar.f110160c;
            if (fragmentActivity != null) {
                if (aVar.f109856i == null) {
                    aVar.f109856i = new C43505aq(fragmentActivity);
                }
                C43505aq aqVar = aVar.f109856i;
                if (aqVar == null || !aqVar.isShowing()) {
                    C43505aq aqVar2 = aVar.f109856i;
                    if (aqVar2 != null) {
                        aqVar2.show();
                    }
                }
            }
            IFetchResourcesListener eVar = new C43466e(iVar.f110137F);
            C52711k.m112240b(eVar, "listener");
            AVServiceImpl.createIInternalAVServicebyMonsterPlugin().fetchResourcesNeededByRequirements(new String[]{"objectTracking"}, eVar);
            return;
        }
        iVar.f110167j.mo43019a(true);
        iVar.f110168k.mo88489a().setValue(C53030y.m112772a());
    }
}
