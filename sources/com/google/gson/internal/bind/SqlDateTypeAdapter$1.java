package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.p1077b.C17956a;
import java.sql.Date;

class SqlDateTypeAdapter$1 implements C18097x {
    SqlDateTypeAdapter$1() {
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        if (aVar.f49842b == Date.class) {
            return new C18009g();
        }
        return null;
    }
}
