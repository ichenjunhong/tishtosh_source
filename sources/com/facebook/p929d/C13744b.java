package com.facebook.p929d;

/* renamed from: com.facebook.d.b */
public abstract class C13744b<T> implements C13748e<T> {
    public void onCancellation(C13745c<T> cVar) {
    }

    /* access modifiers changed from: protected */
    public abstract void onFailureImpl(C13745c<T> cVar);

    /* access modifiers changed from: protected */
    public abstract void onNewResultImpl(C13745c<T> cVar);

    public void onProgressUpdate(C13745c<T> cVar) {
    }

    public void onFailure(C13745c<T> cVar) {
        try {
            onFailureImpl(cVar);
        } finally {
            cVar.mo25677g();
        }
    }

    public void onNewResult(C13745c<T> cVar) {
        boolean b = cVar.mo25672b();
        try {
            onNewResultImpl(cVar);
        } finally {
            if (b) {
                cVar.mo25677g();
            }
        }
    }
}
