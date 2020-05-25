package com.facebook.imagepipeline.p972l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.memory.C14085n;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;

/* renamed from: com.facebook.imagepipeline.l.d */
public final class C14054d extends DalvikPurgeableDecoder {

    /* renamed from: a */
    private final C14085n f36722a;

    public C14054d(C14085n nVar) {
        this.f36722a = nVar;
    }

    public final Bitmap decodeByteArrayAsPurgeable(C13715a<C13709h> aVar, Options options) {
        C13709h hVar = (C13709h) aVar.mo25630a();
        int a = hVar.mo25608a();
        C13715a a2 = this.f36722a.mo26341a(a);
        try {
            byte[] bArr = (byte[]) a2.mo25630a();
            hVar.mo25609a(0, bArr, 0, a);
            return (Bitmap) C13689i.m27653a(BitmapFactory.decodeByteArray(bArr, 0, a, options), (Object) "BitmapFactory returned null");
        } finally {
            C13715a.m27752c(a2);
        }
    }

    public final Bitmap decodeJPEGByteArrayAsPurgeable(C13715a<C13709h> aVar, int i, Options options) {
        byte[] bArr;
        boolean z;
        if (endsWithEOI(aVar, i)) {
            bArr = null;
        } else {
            bArr = EOI;
        }
        C13709h hVar = (C13709h) aVar.mo25630a();
        if (i <= hVar.mo25608a()) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        int i2 = i + 2;
        C13715a a = this.f36722a.mo26341a(i2);
        try {
            byte[] bArr2 = (byte[]) a.mo25630a();
            hVar.mo25609a(0, bArr2, 0, i);
            if (bArr != null) {
                bArr2[i] = -1;
                bArr2[i + 1] = -39;
                i = i2;
            }
            return (Bitmap) C13689i.m27653a(BitmapFactory.decodeByteArray(bArr2, 0, i, options), (Object) "BitmapFactory returned null");
        } finally {
            C13715a.m27752c(a);
        }
    }
}
