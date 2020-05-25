package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.fu */
final class C16693fu implements Comparator<C16691fs> {
    C16693fu() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C16691fs fsVar = (C16691fs) obj;
        C16691fs fsVar2 = (C16691fs) obj2;
        C16698fz fzVar = (C16698fz) fsVar.iterator();
        C16698fz fzVar2 = (C16698fz) fsVar2.iterator();
        while (fzVar.hasNext() && fzVar2.hasNext()) {
            int compare = Integer.compare(C16691fs.m39865a(fzVar.mo32027a()), C16691fs.m39865a(fzVar2.mo32027a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(fsVar.size(), fsVar2.size());
    }
}
