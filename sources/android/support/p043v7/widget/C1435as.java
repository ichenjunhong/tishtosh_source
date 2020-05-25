package android.support.p043v7.widget;

import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;

/* renamed from: android.support.v7.widget.as */
final class C1435as {
    /* renamed from: a */
    static int m4978a(C1349s sVar, C1422ak akVar, View view, View view2, C1332i iVar, boolean z) {
        if (iVar.mo5062s() == 0 || sVar.mo5115a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(C1332i.m4418c(view) - C1332i.m4418c(view2)) + 1;
        }
        return Math.min(akVar.mo5524e(), akVar.mo5519b(view2) - akVar.mo5516a(view));
    }

    /* renamed from: b */
    static int m4980b(C1349s sVar, C1422ak akVar, View view, View view2, C1332i iVar, boolean z) {
        if (iVar.mo5062s() == 0 || sVar.mo5115a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return sVar.mo5115a();
        }
        return (int) ((((float) (akVar.mo5519b(view2) - akVar.mo5516a(view))) / ((float) (Math.abs(C1332i.m4418c(view) - C1332i.m4418c(view2)) + 1))) * ((float) sVar.mo5115a()));
    }

    /* renamed from: a */
    static int m4979a(C1349s sVar, C1422ak akVar, View view, View view2, C1332i iVar, boolean z, boolean z2) {
        int i;
        if (iVar.mo5062s() == 0 || sVar.mo5115a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(C1332i.m4418c(view), C1332i.m4418c(view2));
        int max = Math.max(C1332i.m4418c(view), C1332i.m4418c(view2));
        if (z2) {
            i = Math.max(0, (sVar.mo5115a() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(akVar.mo5519b(view2) - akVar.mo5516a(view))) / ((float) (Math.abs(C1332i.m4418c(view) - C1332i.m4418c(view2)) + 1)))) + ((float) (akVar.mo5518b() - akVar.mo5516a(view))));
    }
}
