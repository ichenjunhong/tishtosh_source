package com.bytedance.ies.p675g.p677b;

/* renamed from: com.bytedance.ies.g.b.d */
public abstract class C10779d<P, R> extends C10777b<P, R> {
    public C10783f callContext;
    private C10780a callback;
    private boolean isValid = true;

    /* renamed from: com.bytedance.ies.g.b.d$a */
    interface C10780a {
        /* renamed from: a */
        void mo19526a(Object obj);

        /* renamed from: a */
        void mo19527a(Throwable th);
    }

    /* renamed from: com.bytedance.ies.g.b.d$b */
    public interface C10781b {
        /* renamed from: a */
        C10779d mo10575a();
    }

    /* access modifiers changed from: protected */
    public abstract void invoke(P p, C10783f fVar) throws Exception;

    /* access modifiers changed from: protected */
    public abstract void onTerminate();

    public final void finishWithFailure() {
        finishWithFailure(null);
    }

    public final void finishWithSuccess() {
        finishWithResult(null);
    }

    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.isValid = false;
        this.callContext = null;
    }

    /* access modifiers changed from: 0000 */
    public void terminateActual() {
        onTerminate();
        onDestroy();
    }

    private boolean checkInvalid() {
        if (this.isValid) {
            return true;
        }
        StringBuilder sb = new StringBuilder("Jsb async call already finished: ");
        sb.append(getName());
        sb.append(", hashcode: ");
        sb.append(hashCode());
        C10789i.m21876a(new IllegalStateException(sb.toString()));
        return false;
    }

    public final void finishWithFailure(Throwable th) {
        if (checkInvalid()) {
            this.callback.mo19527a(th);
            onDestroy();
        }
    }

    public final void finishWithResult(R r) {
        if (checkInvalid()) {
            this.callback.mo19526a((Object) r);
            onDestroy();
        }
    }

    /* access modifiers changed from: 0000 */
    public void invokeActual(P p, C10783f fVar, C10780a aVar) throws Exception {
        this.callContext = fVar;
        this.callback = aVar;
        invoke(p, fVar);
    }
}
