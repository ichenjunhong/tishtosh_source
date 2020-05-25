package p001a;

/* renamed from: a.j */
public final class C0027j<TResult> {

    /* renamed from: a */
    public final C0013i<TResult> f77a = new C0013i<>();

    /* renamed from: a */
    public final boolean mo42a() {
        return this.f77a.mo37i();
    }

    /* renamed from: b */
    public final void mo45b() {
        if (!mo42a()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* renamed from: a */
    public final boolean mo43a(Exception exc) {
        return this.f77a.mo27b(exc);
    }

    /* renamed from: a */
    public final boolean mo44a(TResult tresult) {
        return this.f77a.mo28b(tresult);
    }

    /* renamed from: b */
    public final void mo46b(Exception exc) {
        if (!mo43a(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    /* renamed from: b */
    public final void mo47b(TResult tresult) {
        if (!mo44a(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }
}
