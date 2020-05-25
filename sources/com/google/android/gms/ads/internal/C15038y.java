package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.C15948hq;
import com.google.android.gms.internal.ads.C16148pa;
import com.google.android.gms.internal.ads.C16151pd;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.ama;
import com.google.android.gms.p1027a.C14886d;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.y */
final class C15038y implements C15948hq<ama> {

    /* renamed from: a */
    private final /* synthetic */ C16148pa f38849a;

    /* renamed from: b */
    private final /* synthetic */ C14992d f38850b;

    /* renamed from: c */
    private final /* synthetic */ C16151pd f38851c;

    C15038y(C16148pa paVar, C14992d dVar, C16151pd pdVar) {
        this.f38849a = paVar;
        this.f38850b = dVar;
        this.f38851c = pdVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        ama ama = (ama) obj;
        View view = ama.getView();
        if (view != null) {
            try {
                if (this.f38849a == null) {
                    if (this.f38851c != null) {
                        if (!this.f38851c.mo31301i()) {
                            this.f38851c.mo31290a(C14886d.m30544a(view));
                            this.f38850b.f38705a.mo27201e();
                            return;
                        }
                        C15033t.m31094a(ama);
                    }
                } else if (!this.f38849a.mo31282k()) {
                    this.f38849a.mo31269a(C14886d.m30544a(view));
                    this.f38850b.f38705a.mo27201e();
                } else {
                    C15033t.m31094a(ama);
                }
            } catch (RemoteException e) {
                abv.m32795c("Unable to call handleClick on mapper", e);
            }
        }
    }
}
