package com.google.p997a.p998a.p1004c.p1007b.p1008a;

import com.google.p997a.p998a.p1004c.p1007b.C14754b;
import com.google.p997a.p998a.p1009d.p1012c.C14763a;
import java.util.Collections;

/* renamed from: com.google.a.a.c.b.a.b */
public abstract class C14753b<T> extends C14754b<T> {

    /* renamed from: g */
    public final Object f38244g;

    /* renamed from: c */
    public C14753b<T> mo27048b(String str, Object obj) {
        return (C14753b) super.mo27048b(str, obj);
    }

    protected C14753b(C14751a aVar, String str, String str2, Object obj, Class<T> cls) {
        C14763a aVar2;
        String str3 = null;
        if (obj == null) {
            aVar2 = null;
        } else {
            C14763a aVar3 = new C14763a(aVar.mo27043c(), obj);
            if (!Collections.unmodifiableSet(aVar.mo27038a().f38287b).isEmpty()) {
                str3 = "data";
            }
            aVar3.f38269d = str3;
            aVar2 = aVar3;
        }
        super(aVar, str, str2, aVar2, cls);
        this.f38244g = obj;
    }
}
