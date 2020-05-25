package com.bytedance.p723j;

import java.util.ArrayList;

/* renamed from: com.bytedance.j.d */
public final class C11530d extends UnsatisfiedLinkError {

    /* renamed from: a */
    private static final ArrayList<C11530d> f30909a = new ArrayList<>();

    public static UnsatisfiedLinkError[] getErrors() {
        UnsatisfiedLinkError[] unsatisfiedLinkErrorArr;
        synchronized (f30909a) {
            unsatisfiedLinkErrorArr = (UnsatisfiedLinkError[]) f30909a.toArray(new UnsatisfiedLinkError[0]);
        }
        return unsatisfiedLinkErrorArr;
    }

    C11530d(String str) {
        super(str);
        synchronized (f30909a) {
            f30909a.add(this);
        }
    }

    C11530d(String str, Throwable th) {
        super(str);
        initCause(th);
        synchronized (f30909a) {
            f30909a.add(this);
        }
    }
}
