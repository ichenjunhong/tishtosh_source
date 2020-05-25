package com.bytedance.retrofit2;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12688d;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.u */
public final class C12799u<T> {

    /* renamed from: a */
    public final C12688d f33551a;

    /* renamed from: b */
    public final T f33552b;

    /* renamed from: c */
    public final TypedInput f33553c;

    /* renamed from: d */
    public C12796s f33554d;

    /* renamed from: a */
    public final int mo23958a() {
        return this.f33551a.f33347b;
    }

    /* renamed from: b */
    public final List<C12685b> mo23959b() {
        return this.f33551a.f33349d;
    }

    /* renamed from: c */
    public final boolean mo23960c() {
        return this.f33551a.mo23866a();
    }

    /* renamed from: a */
    public static <T> C12799u<T> m25687a(T t, C12688d dVar) {
        if (dVar == null) {
            throw new NullPointerException("rawResponse == null");
        } else if (dVar.mo23866a()) {
            return new C12799u<>(dVar, t, null);
        } else {
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
    }

    /* renamed from: a */
    public static <T> C12799u<T> m25686a(TypedInput typedInput, C12688d dVar) {
        if (typedInput == null) {
            throw new NullPointerException("body == null");
        } else if (dVar == null) {
            throw new NullPointerException("rawResponse == null");
        } else if (!dVar.mo23866a()) {
            return new C12799u<>(dVar, null, typedInput);
        } else {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
    }

    private C12799u(C12688d dVar, T t, TypedInput typedInput) {
        this.f33551a = dVar;
        this.f33552b = t;
        this.f33553c = typedInput;
    }
}
