package com.bytedance.retrofit2;

import com.bytedance.retrofit2.p830a.C12686c;

/* renamed from: com.bytedance.retrofit2.b */
public interface C12690b<T> extends Cloneable {
    void cancel();

    C12690b<T> clone();

    void enqueue(C12743e<T> eVar);

    C12799u<T> execute() throws Exception;

    boolean isCanceled();

    C12686c request();
}
