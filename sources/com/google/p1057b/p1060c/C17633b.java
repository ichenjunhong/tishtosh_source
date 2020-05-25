package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.util.NoSuchElementException;

/* renamed from: com.google.b.c.b */
public abstract class C17633b<T> extends C17666bt<T> {

    /* renamed from: a */
    C17635a f49303a = C17635a.NOT_READY;

    /* renamed from: b */
    private T f49304b;

    /* renamed from: com.google.b.c.b$a */
    enum C17635a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo34140a();

    protected C17633b() {
    }

    public final T next() {
        if (hasNext()) {
            this.f49303a = C17635a.NOT_READY;
            T t = this.f49304b;
            this.f49304b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        boolean z;
        if (this.f49303a != C17635a.FAILED) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42667b(z);
        switch (this.f49303a) {
            case DONE:
                return false;
            case READY:
                return true;
            default:
                this.f49303a = C17635a.FAILED;
                this.f49304b = mo34140a();
                if (this.f49303a == C17635a.DONE) {
                    return false;
                }
                this.f49303a = C17635a.READY;
                return true;
        }
    }
}
