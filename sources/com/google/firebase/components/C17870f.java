package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.firebase.components.f */
public final class C17870f extends C17871g {

    /* renamed from: a */
    private final List<C17863a<?>> f49664a;

    public final List<C17863a<?>> getComponentsInCycle() {
        return this.f49664a;
    }

    public C17870f(List<C17863a<?>> list) {
        StringBuilder sb = new StringBuilder("Dependency cycle detected: ");
        sb.append(Arrays.toString(list.toArray()));
        super(sb.toString());
        this.f49664a = list;
    }
}
