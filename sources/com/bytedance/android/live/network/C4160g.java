package com.bytedance.android.live.network;

import com.bytedance.retrofit2.C12744f;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.mime.TypedInput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.android.live.network.g */
final /* synthetic */ class C4160g implements C12744f {

    /* renamed from: a */
    private final C4158f f11341a;

    /* renamed from: b */
    private final Class f11342b;

    /* renamed from: c */
    private final Class[] f11343c;

    /* renamed from: d */
    private final String f11344d;

    /* renamed from: e */
    private final Type f11345e;

    /* renamed from: f */
    private final Annotation[] f11346f;

    /* renamed from: g */
    private final C12792q f11347g;

    C4160g(C4158f fVar, Class cls, Class[] clsArr, String str, Type type, Annotation[] annotationArr, C12792q qVar) {
        this.f11341a = fVar;
        this.f11342b = cls;
        this.f11343c = clsArr;
        this.f11344d = str;
        this.f11345e = type;
        this.f11346f = annotationArr;
        this.f11347g = qVar;
    }

    /* renamed from: a */
    public final Object mo9557a(Object obj) {
        return this.f11341a.mo9553a(this.f11342b, this.f11343c, this.f11344d, this.f11345e, this.f11346f, this.f11347g, (TypedInput) obj);
    }
}
