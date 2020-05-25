package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p923g.C13702a;
import com.facebook.common.p923g.C13705d;
import com.facebook.imagepipeline.memory.C14059a.C14061b;

/* renamed from: com.facebook.imagepipeline.memory.o */
public class C14088o extends C14059a<byte[]> implements C13702a {

    /* renamed from: g */
    private final int[] f36809g;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo26309d(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo26305b(int i) {
        return new byte[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ void mo26306b(Object obj) {
        C13689i.m27652a((byte[]) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ int mo26308c(Object obj) {
        byte[] bArr = (byte[]) obj;
        C13689i.m27652a(bArr);
        return bArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo26307c(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.f36809g) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new C14061b(Integer.valueOf(i));
    }

    public C14088o(C13705d dVar, C14068ad adVar, C14069ae aeVar) {
        super(dVar, adVar, aeVar);
        SparseIntArray sparseIntArray = adVar.f36774c;
        this.f36809g = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.f36809g[i] = sparseIntArray.keyAt(i);
        }
        mo26304a();
    }
}
