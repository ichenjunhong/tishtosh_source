package com.p683ss.android.ugc.aweme.app.api.p1365a;

import com.bytedance.retrofit2.C12744f;
import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.app.api.a.b */
public class C22964b<T> implements C12744f<TypedInput, T> {

    /* renamed from: g */
    private static volatile ExecutorService f61292g;

    /* renamed from: a */
    private Type f61293a;

    /* renamed from: b */
    private Annotation[] f61294b;

    /* renamed from: c */
    private C12792q f61295c;

    /* renamed from: d */
    private List<C12745a> f61296d;

    /* renamed from: e */
    private C12745a f61297e;

    /* renamed from: f */
    private volatile C12744f<TypedInput, T> f61298f;

    /* renamed from: b */
    private static void m56481b() {
        if (f61292g == null) {
            synchronized (C22964b.class) {
                if (f61292g == null) {
                    f61292g = C24076h.m58902c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo47745a() {
        if (this.f61298f == null) {
            synchronized (this) {
                if (this.f61298f == null) {
                    C12745a aVar = this.f61297e;
                    Type type = this.f61293a;
                    Annotation[] annotationArr = this.f61294b;
                    m56480a(type, "type == null");
                    m56480a(annotationArr, "annotations == null");
                    int indexOf = this.f61296d.indexOf(aVar) + 1;
                    int size = this.f61296d.size();
                    int i = indexOf;
                    while (i < size) {
                        C12744f<TypedInput, T> a = ((C12745a) this.f61296d.get(i)).mo9551a(type, annotationArr, this.f61295c);
                        if (a != null) {
                            this.f61298f = a;
                        } else {
                            i++;
                        }
                    }
                    StringBuilder sb = new StringBuilder("Could not locate TypeInput converter for ");
                    sb.append(type);
                    sb.append(".\n");
                    if (aVar != null) {
                        sb.append("  Skipped:");
                        for (int i2 = 0; i2 < indexOf; i2++) {
                            sb.append("\n   * ");
                            sb.append(((C12745a) this.f61296d.get(i2)).getClass().getName());
                        }
                        sb.append(10);
                    }
                    sb.append("  Tried:");
                    int size2 = this.f61296d.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        sb.append("\n   * ");
                        sb.append(((C12745a) this.f61296d.get(i3)).getClass().getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T mo9557a(TypedInput typedInput) throws IOException {
        mo47745a();
        return this.f61298f.mo9557a(typedInput);
    }

    /* renamed from: a */
    private static <T> T m56480a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    C22964b(Type type, Annotation[] annotationArr, C12792q qVar, List<C12745a> list, C12745a aVar) {
        this.f61293a = type;
        this.f61294b = annotationArr;
        this.f61295c = qVar;
        this.f61296d = list;
        this.f61297e = aVar;
        m56481b();
        f61292g.submit(new C22965c(this));
    }
}
