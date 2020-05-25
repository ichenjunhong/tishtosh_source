package p2628d.p2629a;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: d.a.b */
public abstract class C52560b<T> implements C52695a, Iterator<T> {

    /* renamed from: a */
    protected C52559ak f130866a = C52559ak.NotReady;

    /* renamed from: b */
    protected T f130867b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo110117a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo110118b() {
        this.f130866a = C52559ak.Done;
    }

    public T next() {
        if (hasNext()) {
            this.f130866a = C52559ak.NotReady;
            return this.f130867b;
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        boolean z;
        if (this.f130866a != C52559ak.Failed) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            switch (C52561c.f130868a[this.f130866a.ordinal()]) {
                case 1:
                    return false;
                case 2:
                    return true;
                default:
                    this.f130866a = C52559ak.Failed;
                    mo110117a();
                    if (this.f130866a == C52559ak.Ready) {
                        return true;
                    }
                    return false;
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
