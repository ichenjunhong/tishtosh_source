package com.linecorp.linesdk;

import java.util.NoSuchElementException;

/* renamed from: com.linecorp.linesdk.a */
public final class C18194a<R> {

    /* renamed from: a */
    public static final C18194a<?> f50236a = new C18194a<>(C18233b.SUCCESS, null, LineApiError.f50227a);

    /* renamed from: b */
    public final C18233b f50237b;

    /* renamed from: c */
    public final LineApiError f50238c;

    /* renamed from: d */
    private final R f50239d;

    /* renamed from: a */
    public final boolean mo36272a() {
        if (this.f50237b == C18233b.SUCCESS) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final R mo36273b() {
        if (this.f50239d != null) {
            return this.f50239d;
        }
        throw new NoSuchElementException("response data is null. Please check result by isSuccess before.");
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f50237b.hashCode() * 31;
        if (this.f50239d != null) {
            i = this.f50239d.hashCode();
        } else {
            i = 0;
        }
        return ((hashCode + i) * 31) + this.f50238c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineApiResponse{errorData=");
        sb.append(this.f50238c);
        sb.append(", responseCode=");
        sb.append(this.f50237b);
        sb.append(", responseData=");
        sb.append(this.f50239d);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18194a aVar = (C18194a) obj;
        if (this.f50237b != aVar.f50237b) {
            return false;
        }
        if (this.f50239d == null ? aVar.f50239d == null : this.f50239d.equals(aVar.f50239d)) {
            return this.f50238c.equals(aVar.f50238c);
        }
        return false;
    }

    /* renamed from: a */
    public static <T> C18194a<T> m44389a(C18233b bVar, LineApiError lineApiError) {
        return new C18194a<>(bVar, null, lineApiError);
    }

    public C18194a(C18233b bVar, R r, LineApiError lineApiError) {
        this.f50237b = bVar;
        this.f50239d = r;
        this.f50238c = lineApiError;
    }
}
