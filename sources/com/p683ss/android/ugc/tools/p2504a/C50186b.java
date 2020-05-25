package com.p683ss.android.ugc.tools.p2504a;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.p936c.C13791d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.tools.a.b */
public final class C50186b<INFO> implements C13791d<INFO> {

    /* renamed from: a */
    private final C13791d<INFO>[] f125735a;

    public C50186b(C13791d<INFO>... dVarArr) {
        C52711k.m112240b(dVarArr, "listener");
        this.f125735a = dVarArr;
    }

    public final void onRelease(String str) {
        C13791d<INFO>[] dVarArr = this.f125735a;
        if (dVarArr != null) {
            for (C13791d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            }
        }
    }

    public final void onFailure(String str, Throwable th) {
        C13791d<INFO>[] dVarArr = this.f125735a;
        if (dVarArr != null) {
            for (C13791d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            }
        }
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
        C13791d<INFO>[] dVarArr = this.f125735a;
        if (dVarArr != null) {
            for (C13791d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th);
                }
            }
        }
    }

    public final void onIntermediateImageSet(String str, INFO info) {
        C13791d<INFO>[] dVarArr = this.f125735a;
        if (dVarArr != null) {
            for (C13791d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, info);
                }
            }
        }
    }

    public final void onSubmit(String str, Object obj) {
        C13791d<INFO>[] dVarArr = this.f125735a;
        if (dVarArr != null) {
            for (C13791d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            }
        }
    }

    public final void onFinalImageSet(String str, INFO info, Animatable animatable) {
        C13791d<INFO>[] dVarArr = this.f125735a;
        if (dVarArr != null) {
            for (C13791d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onFinalImageSet(str, info, animatable);
                }
            }
        }
    }
}
