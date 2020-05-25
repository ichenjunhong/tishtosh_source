package com.facebook.drawee.p936c;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.drawee.c.f */
public class C13793f<INFO> implements C13791d<INFO> {

    /* renamed from: a */
    private final List<C13791d<? super INFO>> f35928a = new ArrayList(2);

    /* renamed from: a */
    public final synchronized void mo25765a() {
        this.f35928a.clear();
    }

    /* renamed from: a */
    public final synchronized void mo25766a(C13791d<? super INFO> dVar) {
        this.f35928a.add(dVar);
    }

    /* renamed from: b */
    public final synchronized void mo25767b(C13791d<? super INFO> dVar) {
        int indexOf = this.f35928a.indexOf(dVar);
        if (indexOf != -1) {
            this.f35928a.set(indexOf, null);
        }
    }

    public synchronized void onRelease(String str) {
        int size = this.f35928a.size();
        for (int i = 0; i < size; i++) {
            try {
                C13791d dVar = (C13791d) this.f35928a.get(i);
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void onFailure(String str, Throwable th) {
        int size = this.f35928a.size();
        for (int i = 0; i < size; i++) {
            try {
                C13791d dVar = (C13791d) this.f35928a.get(i);
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onIntermediateImageFailed(String str, Throwable th) {
        int size = this.f35928a.size();
        for (int i = 0; i < size; i++) {
            try {
                C13791d dVar = (C13791d) this.f35928a.get(i);
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onIntermediateImageSet(String str, INFO info) {
        int size = this.f35928a.size();
        for (int i = 0; i < size; i++) {
            try {
                C13791d dVar = (C13791d) this.f35928a.get(i);
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, info);
                }
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void onSubmit(String str, Object obj) {
        int size = this.f35928a.size();
        for (int i = 0; i < size; i++) {
            try {
                C13791d dVar = (C13791d) this.f35928a.get(i);
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void onFinalImageSet(String str, INFO info, Animatable animatable) {
        int size = this.f35928a.size();
        for (int i = 0; i < size; i++) {
            try {
                C13791d dVar = (C13791d) this.f35928a.get(i);
                if (dVar != null) {
                    dVar.onFinalImageSet(str, info, animatable);
                }
            } catch (Exception unused) {
            }
        }
    }
}
