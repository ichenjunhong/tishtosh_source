package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;

class TypeAdapters$32 implements C18097x {

    /* renamed from: a */
    final /* synthetic */ Class f49987a;

    /* renamed from: b */
    final /* synthetic */ C18095w f49988b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Factory[type=");
        sb.append(this.f49987a.getName());
        sb.append(",adapter=");
        sb.append(this.f49988b);
        sb.append("]");
        return sb.toString();
    }

    TypeAdapters$32(Class cls, C18095w wVar) {
        this.f49987a = cls;
        this.f49988b = wVar;
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        if (aVar.f49842b == this.f49987a) {
            return this.f49988b;
        }
        return null;
    }
}
