package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p923g.C13705d;
import com.facebook.imagepipeline.memory.C14059a.C14061b;

/* renamed from: com.facebook.imagepipeline.memory.s */
public abstract class C14092s extends C14059a<C14091r> {

    /* renamed from: g */
    final int[] f36817g;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo26309d(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract C14091r mo26305b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ void mo26306b(Object obj) {
        C14091r rVar = (C14091r) obj;
        C13689i.m27652a(rVar);
        rVar.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ int mo26308c(Object obj) {
        C14091r rVar = (C14091r) obj;
        C13689i.m27652a(rVar);
        return rVar.getSize();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ boolean mo26310d(Object obj) {
        C14091r rVar = (C14091r) obj;
        C13689i.m27652a(rVar);
        if (!rVar.isClosed()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo26307c(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.f36817g) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new C14061b(Integer.valueOf(i));
    }

    C14092s(C13705d dVar, C14068ad adVar, C14069ae aeVar) {
        super(dVar, adVar, aeVar);
        SparseIntArray sparseIntArray = adVar.f36774c;
        this.f36817g = new int[sparseIntArray.size()];
        for (int i = 0; i < this.f36817g.length; i++) {
            this.f36817g[i] = sparseIntArray.keyAt(i);
        }
        mo26304a();
    }
}
