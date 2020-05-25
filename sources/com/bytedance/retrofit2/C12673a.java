package com.bytedance.retrofit2;

import com.bytedance.retrofit2.C12744f.C12745a;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p831b.C12697ad;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.retrofit2.a */
final class C12673a extends C12745a {

    /* renamed from: com.bytedance.retrofit2.a$a */
    static final class C12674a implements C12744f<TypedInput, TypedInput> {

        /* renamed from: a */
        static final C12674a f33309a = new C12674a();

        C12674a() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo9557a(Object obj) throws IOException {
            return m25501a((TypedInput) obj);
        }

        /* renamed from: a */
        private static TypedInput m25501a(TypedInput typedInput) throws IOException {
            if (typedInput == null || (typedInput instanceof TypedByteArray)) {
                return typedInput;
            }
            String mimeType = typedInput.mimeType();
            InputStream in = typedInput.mo9554in();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (in != null) {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = in.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                TypedByteArray typedByteArray = new TypedByteArray(mimeType, byteArrayOutputStream.toByteArray(), new String[0]);
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException unused) {
                    }
                }
                return typedByteArray;
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$b */
    static final class C12675b implements C12744f<C12685b, C12685b> {

        /* renamed from: a */
        static final C12675b f33310a = new C12675b();

        C12675b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo9557a(Object obj) throws IOException {
            return (C12685b) obj;
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$c */
    static final class C12676c implements C12744f<Object, Object> {

        /* renamed from: a */
        static final C12676c f33311a = new C12676c();

        C12676c() {
        }

        /* renamed from: a */
        public final Object mo9557a(Object obj) throws IOException {
            return obj;
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$d */
    static final class C12677d implements C12744f<TypedOutput, TypedOutput> {

        /* renamed from: a */
        static final C12677d f33312a = new C12677d();

        C12677d() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo9557a(Object obj) throws IOException {
            return (TypedOutput) obj;
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$e */
    static final class C12678e implements C12744f<TypedInput, TypedInput> {

        /* renamed from: a */
        static final C12678e f33313a = new C12678e();

        C12678e() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo9557a(Object obj) throws IOException {
            return (TypedInput) obj;
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$f */
    static final class C12679f implements C12744f<String, String> {

        /* renamed from: a */
        static final C12679f f33314a = new C12679f();

        C12679f() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo9557a(Object obj) throws IOException {
            return (String) obj;
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$g */
    static final class C12680g implements C12744f<TypedInput, String> {

        /* renamed from: a */
        static final C12680g f33315a = new C12680g();

        C12680g() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo9557a(Object obj) throws IOException {
            TypedInput typedInput = (TypedInput) obj;
            if (!(typedInput instanceof TypedByteArray)) {
                return null;
            }
            String str = "UTF-8";
            if (typedInput.mimeType() != null) {
                str = MimeUtil.parseCharset(typedInput.mimeType(), str);
            }
            return new String(((TypedByteArray) typedInput).getBytes(), str);
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$h */
    static final class C12681h implements C12744f<Object, String> {

        /* renamed from: a */
        static final C12681h f33316a = new C12681h();

        C12681h() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo9557a(Object obj) throws IOException {
            return String.valueOf(obj);
        }
    }

    /* renamed from: com.bytedance.retrofit2.a$i */
    static final class C12682i implements C12744f<TypedInput, Void> {

        /* renamed from: a */
        static final C12682i f33317a = new C12682i();

        C12682i() {
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo9557a(Object obj) throws IOException {
            InputStream in = ((TypedInput) obj).mo9554in();
            if (in != null) {
                in.close();
            }
            return null;
        }
    }

    C12673a() {
    }

    /* renamed from: b */
    public final C12744f<?, Object> mo23850b(Type type, Annotation[] annotationArr, C12792q qVar) {
        if (type == Object.class) {
            return C12676c.f33311a;
        }
        return null;
    }

    /* renamed from: c */
    public final C12744f<?, String> mo23851c(Type type, Annotation[] annotationArr, C12792q qVar) {
        if (type == String.class) {
            return C12679f.f33314a;
        }
        return null;
    }

    /* renamed from: d */
    public final C12744f<?, C12685b> mo23852d(Type type, Annotation[] annotationArr, C12792q qVar) {
        if (type == C12685b.class) {
            return C12675b.f33310a;
        }
        return null;
    }

    /* renamed from: a */
    public final C12744f<TypedInput, ?> mo9551a(Type type, Annotation[] annotationArr, C12792q qVar) {
        if (type == TypedInput.class) {
            Class<C12697ad> cls = C12697ad.class;
            int length = annotationArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (cls.isInstance(annotationArr[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return C12678e.f33313a;
            }
            return C12674a.f33309a;
        } else if (type == String.class) {
            return C12680g.f33315a;
        } else {
            if (type == Void.class) {
                return C12682i.f33317a;
            }
            return null;
        }
    }

    /* renamed from: a */
    public final C12744f<?, TypedOutput> mo9552a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C12792q qVar) {
        if (TypedOutput.class.isAssignableFrom(C12801w.m25695a(type))) {
            return C12677d.f33312a;
        }
        return null;
    }
}
