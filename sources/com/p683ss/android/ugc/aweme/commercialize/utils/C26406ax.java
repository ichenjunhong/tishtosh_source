package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.p936c.C13791d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ax */
public final class C26406ax<INFO> implements C13791d<INFO> {

    /* renamed from: a */
    private final C13791d<INFO>[] f69652a;

    public C26406ax(C13791d<INFO>... dVarArr) {
        C52711k.m112240b(dVarArr, "listener");
        this.f69652a = dVarArr;
    }

    public final void onRelease(String str) {
        C13791d<INFO>[] dVarArr = this.f69652a;
        if (dVarArr != null) {
            for (C13791d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            }
        }
    }

    public final void onFailure(String str, Throwable th) {
        C13791d<INFO>[] dVarArr = this.f69652a;
        if (dVarArr != null) {
            for (C13791d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            }
        }
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
        C13791d<INFO>[] dVarArr = this.f69652a;
        if (dVarArr != null) {
            for (C13791d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th);
                }
            }
        }
    }

    public final void onIntermediateImageSet(String str, INFO info) {
        C13791d<INFO>[] dVarArr = this.f69652a;
        if (dVarArr != null) {
            for (C13791d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, info);
                }
            }
        }
    }

    public final void onSubmit(String str, Object obj) {
        C13791d<INFO>[] dVarArr = this.f69652a;
        if (dVarArr != null) {
            for (C13791d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            }
        }
    }

    public final void onFinalImageSet(String str, INFO info, Animatable animatable) {
        C13791d<INFO>[] dVarArr = this.f69652a;
        if (dVarArr != null) {
            for (C13791d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onFinalImageSet(str, info, animatable);
                }
            }
        }
    }
}
