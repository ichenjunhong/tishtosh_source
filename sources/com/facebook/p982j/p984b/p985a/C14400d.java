package com.facebook.p982j.p984b.p985a;

import android.graphics.Matrix;
import com.facebook.p982j.p984b.C14394a;
import com.facebook.p982j.p984b.C14406b.C14409b;
import com.facebook.p982j.p984b.C14410c;
import java.util.List;

/* renamed from: com.facebook.j.b.a.d */
public final class C14400d extends C14402e<C14410c, Matrix> {

    /* renamed from: a */
    private final C14409b f37393a;

    /* renamed from: b */
    private final float[] f37394b;

    public C14400d(List<C14410c> list, float[][][] fArr, C14409b bVar, float[] fArr2) {
        super(list, fArr);
        this.f37393a = bVar;
        if (fArr2 == null) {
            fArr2 = new float[2];
        }
        this.f37394b = fArr2;
        if (bVar == C14409b.POSITION) {
            this.f37394b[0] = ((C14410c) list.get(0)).f37413a[0];
            this.f37394b[1] = ((C14410c) list.get(0)).f37413a[1];
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo26581a(C14394a aVar, C14394a aVar2, float f, Object obj) {
        float f2;
        float f3;
        float f4;
        float f5;
        C14410c cVar = (C14410c) aVar;
        C14410c cVar2 = (C14410c) aVar2;
        Matrix matrix = (Matrix) obj;
        float f6 = 0.0f;
        switch (this.f37393a) {
            case ROTATION:
                if (cVar2 == null) {
                    float f7 = cVar.f37413a[0];
                    if (this.f37394b != null) {
                        f3 = this.f37394b[0];
                    } else {
                        f3 = 0.0f;
                    }
                    if (this.f37394b != null) {
                        f6 = this.f37394b[1];
                    }
                    matrix.postRotate(f7, f3, f6);
                    break;
                } else {
                    float a = m29510a(cVar.f37413a[0], cVar2.f37413a[0], f);
                    if (this.f37394b != null) {
                        f2 = this.f37394b[0];
                    } else {
                        f2 = 0.0f;
                    }
                    if (this.f37394b != null) {
                        f6 = this.f37394b[1];
                    }
                    matrix.postRotate(a, f2, f6);
                    return;
                }
            case SCALE:
                if (cVar2 == null) {
                    float f8 = cVar.f37413a[0] / 100.0f;
                    float f9 = cVar.f37413a[1] / 100.0f;
                    if (this.f37394b != null) {
                        f5 = this.f37394b[0];
                    } else {
                        f5 = 0.0f;
                    }
                    if (this.f37394b != null) {
                        f6 = this.f37394b[1];
                    }
                    matrix.postScale(f8, f9, f5, f6);
                    break;
                } else {
                    float f10 = cVar.f37413a[0];
                    float f11 = cVar2.f37413a[0];
                    float a2 = m29510a(f10, f11, f) / 100.0f;
                    float a3 = m29510a(cVar.f37413a[1], cVar2.f37413a[1], f) / 100.0f;
                    if (this.f37394b != null) {
                        f4 = this.f37394b[0];
                    } else {
                        f4 = 0.0f;
                    }
                    if (this.f37394b != null) {
                        f6 = this.f37394b[1];
                    }
                    matrix.postScale(a2, a3, f4, f6);
                    return;
                }
            case POSITION:
                if (cVar2 != null) {
                    matrix.postTranslate(m29510a(cVar.f37413a[0], cVar2.f37413a[0], f) - this.f37394b[0], m29510a(cVar.f37413a[1], cVar2.f37413a[1], f) - this.f37394b[1]);
                }
                return;
            case X_POSITION:
                if (cVar2 == null) {
                    matrix.postTranslate(cVar.f37413a[0], 0.0f);
                    break;
                } else {
                    matrix.postTranslate(m29510a(cVar.f37413a[0], cVar2.f37413a[0], f), 0.0f);
                    return;
                }
            case Y_POSITION:
                if (cVar2 == null) {
                    matrix.postTranslate(0.0f, cVar.f37413a[0]);
                    break;
                } else {
                    matrix.postTranslate(0.0f, m29510a(cVar.f37413a[0], cVar2.f37413a[0], f));
                    return;
                }
            default:
                StringBuilder sb = new StringBuilder("Cannot apply matrix transformation to ");
                sb.append(this.f37393a);
                throw new UnsupportedOperationException(sb.toString());
        }
    }
}
