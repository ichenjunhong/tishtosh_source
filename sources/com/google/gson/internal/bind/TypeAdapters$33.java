package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;

class TypeAdapters$33 implements C18097x {

    /* renamed from: a */
    final /* synthetic */ Class f49989a;

    /* renamed from: b */
    final /* synthetic */ Class f49990b;

    /* renamed from: c */
    final /* synthetic */ C18095w f49991c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Factory[type=");
        sb.append(this.f49990b.getName());
        sb.append("+");
        sb.append(this.f49989a.getName());
        sb.append(",adapter=");
        sb.append(this.f49991c);
        sb.append("]");
        return sb.toString();
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        Class<? super T> cls = aVar.f49842b;
        if (cls == this.f49989a || cls == this.f49990b) {
            return this.f49991c;
        }
        return null;
    }

    TypeAdapters$33(Class cls, Class cls2, C18095w wVar) {
        this.f49989a = cls;
        this.f49990b = cls2;
        this.f49991c = wVar;
    }
}
