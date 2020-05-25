package com.google.gson.internal.bind;

import com.google.gson.C17971f;
import com.google.gson.C18095w;
import com.google.gson.C18097x;
import com.google.gson.internal.C18043c;
import com.google.gson.p1076a.C17951b;
import com.google.gson.p1077b.C17956a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements C18097x {

    /* renamed from: a */
    private final C18043c f49946a;

    public JsonAdapterAnnotationTypeAdapterFactory(C18043c cVar) {
        this.f49946a = cVar;
    }

    public final <T> C18095w<T> create(C17971f fVar, C17956a<T> aVar) {
        C17951b bVar = (C17951b) aVar.f49842b.getAnnotation(C17951b.class);
        if (bVar == null) {
            return null;
        }
        return m44154a(this.f49946a, fVar, aVar, bVar);
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [com.google.gson.w, com.google.gson.w<?>] */
    /* JADX WARNING: type inference failed for: r8v13, types: [com.google.gson.w] */
    /* JADX WARNING: type inference failed for: r8v14, types: [com.google.gson.w] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.gson.C18095w<?> m44154a(com.google.gson.internal.C18043c r8, com.google.gson.C17971f r9, com.google.gson.p1077b.C17956a<?> r10, com.google.gson.p1076a.C17951b r11) {
        /*
            java.lang.Class r0 = r11.mo34826a()
            com.google.gson.b.a r0 = com.google.gson.p1077b.C17956a.m44006a(r0)
            com.google.gson.internal.h r8 = r8.mo34954a(r0)
            java.lang.Object r8 = r8.mo34956a()
            boolean r0 = r8 instanceof com.google.gson.C18095w
            if (r0 == 0) goto L_0x0017
            com.google.gson.w r8 = (com.google.gson.C18095w) r8
            goto L_0x0072
        L_0x0017:
            boolean r0 = r8 instanceof com.google.gson.C18097x
            if (r0 == 0) goto L_0x0022
            com.google.gson.x r8 = (com.google.gson.C18097x) r8
            com.google.gson.w r8 = r8.create(r9, r10)
            goto L_0x0072
        L_0x0022:
            boolean r0 = r8 instanceof com.google.gson.C18090t
            if (r0 != 0) goto L_0x0058
            boolean r1 = r8 instanceof com.google.gson.C18081k
            if (r1 == 0) goto L_0x002b
            goto L_0x0058
        L_0x002b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r11.<init>(r0)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r11.append(r8)
            java.lang.String r8 = " as a @JsonAdapter for "
            r11.append(r8)
            java.lang.String r8 = r10.toString()
            r11.append(r8)
            java.lang.String r8 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            throw r9
        L_0x0058:
            r1 = 0
            if (r0 == 0) goto L_0x0060
            r0 = r8
            com.google.gson.t r0 = (com.google.gson.C18090t) r0
            r3 = r0
            goto L_0x0061
        L_0x0060:
            r3 = r1
        L_0x0061:
            boolean r0 = r8 instanceof com.google.gson.C18081k
            if (r0 == 0) goto L_0x0068
            r1 = r8
            com.google.gson.k r1 = (com.google.gson.C18081k) r1
        L_0x0068:
            r4 = r1
            com.google.gson.internal.bind.TreeTypeAdapter r8 = new com.google.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r8
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0072:
            if (r8 == 0) goto L_0x007e
            boolean r9 = r11.mo34827b()
            if (r9 == 0) goto L_0x007e
            com.google.gson.w r8 = r8.nullSafe()
        L_0x007e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.m44154a(com.google.gson.internal.c, com.google.gson.f, com.google.gson.b.a, com.google.gson.a.b):com.google.gson.w");
    }
}
