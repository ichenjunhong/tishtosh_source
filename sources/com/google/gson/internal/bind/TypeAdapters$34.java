package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;

class TypeAdapters$34 implements C18097x {

    /* renamed from: a */
    final /* synthetic */ Class f49992a;

    /* renamed from: b */
    final /* synthetic */ Class f49993b;

    /* renamed from: c */
    final /* synthetic */ C18095w f49994c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Factory[type=");
        sb.append(this.f49992a.getName());
        sb.append("+");
        sb.append(this.f49993b.getName());
        sb.append(",adapter=");
        sb.append(this.f49994c);
        sb.append("]");
        return sb.toString();
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        Class<? super T> cls = aVar.f49842b;
        if (cls == this.f49992a || cls == this.f49993b) {
            return this.f49994c;
        }
        return null;
    }

    TypeAdapters$34(Class cls, Class cls2, C18095w wVar) {
        this.f49992a = cls;
        this.f49993b = cls2;
        this.f49994c = wVar;
    }
}
