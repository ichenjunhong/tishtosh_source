package com.google.p1057b.p1062e;

import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1060c.C17570ak;
import com.google.p1057b.p1060c.C17665bs;
import com.google.p1057b.p1061d.C17728a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.b.e.f */
public final class C17737f {

    /* renamed from: a */
    private static final C17665bs<File> f49472a = new C17665bs<File>() {
        public final String toString() {
            return "Files.fileTreeTraverser()";
        }
    };

    /* renamed from: b */
    private static final C17728a<File> f49473b = new C17728a<File>() {
    };

    /* renamed from: com.google.b.e.f$1 */
    static class C177381 {
    }

    /* renamed from: com.google.b.e.f$a */
    public static final class C17741a extends C17729a {

        /* renamed from: a */
        private final File f49474a;

        /* renamed from: b */
        private final C17570ak<C17736e> f49475b;

        /* renamed from: a */
        public final /* synthetic */ OutputStream mo34507a() throws IOException {
            return new FileOutputStream(this.f49474a, this.f49475b.contains(C17736e.APPEND));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Files.asByteSink(");
            sb.append(this.f49474a);
            sb.append(", ");
            sb.append(this.f49475b);
            sb.append(")");
            return sb.toString();
        }

        private C17741a(File file, C17736e... eVarArr) {
            this.f49474a = (File) C17421k.m42653a(file);
            this.f49475b = C17570ak.copyOf((E[]) eVarArr);
        }

        public /* synthetic */ C17741a(File file, C17736e[] eVarArr, C177381 r3) {
            this(file, eVarArr);
        }
    }

    /* renamed from: com.google.b.e.f$b */
    public static final class C17742b extends C17730b {

        /* renamed from: a */
        private final File f49476a;

        /* renamed from: a */
        public final /* synthetic */ InputStream mo34509a() throws IOException {
            return new FileInputStream(this.f49476a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Files.asByteSource(");
            sb.append(this.f49476a);
            sb.append(")");
            return sb.toString();
        }

        private C17742b(File file) {
            this.f49476a = (File) C17421k.m42653a(file);
        }

        public /* synthetic */ C17742b(File file, C177381 r2) {
            this(file);
        }
    }
}
