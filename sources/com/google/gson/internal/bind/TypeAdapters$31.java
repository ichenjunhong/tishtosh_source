package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;

class TypeAdapters$31 implements C18097x {

    /* renamed from: a */
    final /* synthetic */ C17956a f49985a;

    /* renamed from: b */
    final /* synthetic */ C18095w f49986b;

    TypeAdapters$31(C17956a aVar, C18095w wVar) {
        this.f49985a = aVar;
        this.f49986b = wVar;
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        if (aVar.equals(this.f49985a)) {
            return this.f49986b;
        }
        return null;
    }
}
