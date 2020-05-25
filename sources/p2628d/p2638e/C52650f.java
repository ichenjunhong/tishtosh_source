package p2628d.p2638e;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import p2628d.C52775l;
import p2628d.C52860x;
import p2628d.C52862z;
import p2628d.p2629a.C52559ak;
import p2628d.p2629a.C52560b;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2649l.C52785g;

/* renamed from: d.e.f */
public final class C52650f implements C52785g<File> {

    /* renamed from: a */
    public final File f130935a;

    /* renamed from: b */
    public final C52658h f130936b;

    /* renamed from: c */
    public final C52671b<File, Boolean> f130937c;

    /* renamed from: d */
    public final C52671b<File, C52860x> f130938d;

    /* renamed from: e */
    public final C52682m<File, IOException, C52860x> f130939e;

    /* renamed from: f */
    public final int f130940f;

    /* renamed from: d.e.f$a */
    static abstract class C52651a extends C52656c {
        public C52651a(File file) {
            C52711k.m112240b(file, "rootDir");
            super(file);
            if (C52862z.f131110a) {
                boolean isDirectory = file.isDirectory();
                if (C52862z.f131110a && !isDirectory) {
                    throw new AssertionError("rootDir must be verified to be directory beforehand.");
                }
            }
        }
    }

    /* renamed from: d.e.f$b */
    final class C52652b extends C52560b<File> {

        /* renamed from: d */
        private final ArrayDeque<C52656c> f130942d = new ArrayDeque<>();

        /* renamed from: d.e.f$b$a */
        final class C52653a extends C52651a {

            /* renamed from: a */
            final /* synthetic */ C52652b f130943a;

            /* renamed from: c */
            private boolean f130944c;

            /* renamed from: d */
            private File[] f130945d;

            /* renamed from: e */
            private int f130946e;

            /* renamed from: f */
            private boolean f130947f;

            /* renamed from: a */
            public final File mo110275a() {
                if (!this.f130947f && this.f130945d == null) {
                    C52671b<File, Boolean> bVar = C52650f.this.f130937c;
                    if (bVar != null && !((Boolean) bVar.invoke(this.f130954b)).booleanValue()) {
                        return null;
                    }
                    this.f130945d = this.f130954b.listFiles();
                    if (this.f130945d == null) {
                        C52682m<File, IOException, C52860x> mVar = C52650f.this.f130939e;
                        if (mVar != null) {
                            File file = this.f130954b;
                            C52645a aVar = new C52645a(this.f130954b, null, "Cannot list files in a directory", 2, null);
                            mVar.invoke(file, aVar);
                        }
                        this.f130947f = true;
                    }
                }
                if (this.f130945d != null) {
                    int i = this.f130946e;
                    File[] fileArr = this.f130945d;
                    if (fileArr == null) {
                        C52711k.m112234a();
                    }
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f130945d;
                        if (fileArr2 == null) {
                            C52711k.m112234a();
                        }
                        int i2 = this.f130946e;
                        this.f130946e = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f130944c) {
                    this.f130944c = true;
                    return this.f130954b;
                }
                C52671b<File, C52860x> bVar2 = C52650f.this.f130938d;
                if (bVar2 != null) {
                    bVar2.invoke(this.f130954b);
                }
                return null;
            }

            public C52653a(C52652b bVar, File file) {
                C52711k.m112240b(file, "rootDir");
                this.f130943a = bVar;
                super(file);
            }
        }

        /* renamed from: d.e.f$b$b */
        final class C52654b extends C52656c {

            /* renamed from: a */
            final /* synthetic */ C52652b f130948a;

            /* renamed from: c */
            private boolean f130949c;

            /* renamed from: a */
            public final File mo110275a() {
                if (this.f130949c) {
                    return null;
                }
                this.f130949c = true;
                return this.f130954b;
            }

            public C52654b(C52652b bVar, File file) {
                C52711k.m112240b(file, "rootFile");
                this.f130948a = bVar;
                super(file);
                if (C52862z.f131110a) {
                    boolean isFile = file.isFile();
                    if (C52862z.f131110a && !isFile) {
                        throw new AssertionError("rootFile must be verified to be file beforehand.");
                    }
                }
            }
        }

        /* renamed from: d.e.f$b$c */
        final class C52655c extends C52651a {

            /* renamed from: a */
            final /* synthetic */ C52652b f130950a;

            /* renamed from: c */
            private boolean f130951c;

            /* renamed from: d */
            private File[] f130952d;

            /* renamed from: e */
            private int f130953e;

            /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
                if (r0.length == 0) goto L_0x0079;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.io.File mo110275a() {
                /*
                    r10 = this;
                    boolean r0 = r10.f130951c
                    r1 = 0
                    if (r0 != 0) goto L_0x0022
                    d.e.f$b r0 = r10.f130950a
                    d.e.f r0 = p2628d.p2638e.C52650f.this
                    d.f.a.b<java.io.File, java.lang.Boolean> r0 = r0.f130937c
                    if (r0 == 0) goto L_0x001c
                    java.io.File r2 = r10.f130954b
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x001c
                    return r1
                L_0x001c:
                    r0 = 1
                    r10.f130951c = r0
                    java.io.File r0 = r10.f130954b
                    return r0
                L_0x0022:
                    java.io.File[] r0 = r10.f130952d
                    if (r0 == 0) goto L_0x0041
                    int r0 = r10.f130953e
                    java.io.File[] r2 = r10.f130952d
                    if (r2 != 0) goto L_0x002f
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x002f:
                    int r2 = r2.length
                    if (r0 >= r2) goto L_0x0033
                    goto L_0x0041
                L_0x0033:
                    d.e.f$b r0 = r10.f130950a
                    d.e.f r0 = p2628d.p2638e.C52650f.this
                    d.f.a.b<java.io.File, d.x> r0 = r0.f130938d
                    if (r0 == 0) goto L_0x0040
                    java.io.File r2 = r10.f130954b
                    r0.invoke(r2)
                L_0x0040:
                    return r1
                L_0x0041:
                    java.io.File[] r0 = r10.f130952d
                    if (r0 != 0) goto L_0x0087
                    java.io.File r0 = r10.f130954b
                    java.io.File[] r0 = r0.listFiles()
                    r10.f130952d = r0
                    java.io.File[] r0 = r10.f130952d
                    if (r0 != 0) goto L_0x006b
                    d.e.f$b r0 = r10.f130950a
                    d.e.f r0 = p2628d.p2638e.C52650f.this
                    d.f.a.m<java.io.File, java.io.IOException, d.x> r0 = r0.f130939e
                    if (r0 == 0) goto L_0x006b
                    java.io.File r2 = r10.f130954b
                    d.e.a r9 = new d.e.a
                    java.io.File r4 = r10.f130954b
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L_0x006b:
                    java.io.File[] r0 = r10.f130952d
                    if (r0 == 0) goto L_0x0079
                    java.io.File[] r0 = r10.f130952d
                    if (r0 != 0) goto L_0x0076
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x0076:
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0087
                L_0x0079:
                    d.e.f$b r0 = r10.f130950a
                    d.e.f r0 = p2628d.p2638e.C52650f.this
                    d.f.a.b<java.io.File, d.x> r0 = r0.f130938d
                    if (r0 == 0) goto L_0x0086
                    java.io.File r2 = r10.f130954b
                    r0.invoke(r2)
                L_0x0086:
                    return r1
                L_0x0087:
                    java.io.File[] r0 = r10.f130952d
                    if (r0 != 0) goto L_0x008e
                    p2628d.p2639f.p2641b.C52711k.m112234a()
                L_0x008e:
                    int r1 = r10.f130953e
                    int r2 = r1 + 1
                    r10.f130953e = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p2628d.p2638e.C52650f.C52652b.C52655c.mo110275a():java.io.File");
            }

            public C52655c(C52652b bVar, File file) {
                C52711k.m112240b(file, "rootDir");
                this.f130950a = bVar;
                super(file);
            }
        }

        /* renamed from: a */
        public final void mo110117a() {
            T t;
            T a;
            while (true) {
                C52656c cVar = (C52656c) this.f130942d.peek();
                if (cVar == null) {
                    t = null;
                    break;
                }
                a = cVar.mo110275a();
                if (a == null) {
                    this.f130942d.pop();
                } else if (C52711k.m112239a((Object) a, (Object) cVar.f130954b) || !a.isDirectory() || this.f130942d.size() >= C52650f.this.f130940f) {
                    t = a;
                } else {
                    this.f130942d.push(m112192a(a));
                }
            }
            t = a;
            if (t != null) {
                this.f130867b = t;
                this.f130866a = C52559ak.Ready;
                return;
            }
            mo110118b();
        }

        public C52652b() {
            if (C52650f.this.f130935a.isDirectory()) {
                this.f130942d.push(m112192a(C52650f.this.f130935a));
            } else if (C52650f.this.f130935a.isFile()) {
                this.f130942d.push(new C52654b(this, C52650f.this.f130935a));
            } else {
                mo110118b();
            }
        }

        /* renamed from: a */
        private final C52651a m112192a(File file) {
            switch (C52657g.f130955a[C52650f.this.f130936b.ordinal()]) {
                case 1:
                    return new C52655c(this, file);
                case 2:
                    return new C52653a(this, file);
                default:
                    throw new C52775l();
            }
        }
    }

    /* renamed from: d.e.f$c */
    static abstract class C52656c {

        /* renamed from: b */
        public final File f130954b;

        /* renamed from: a */
        public abstract File mo110275a();

        public C52656c(File file) {
            C52711k.m112240b(file, "root");
            this.f130954b = file;
        }
    }

    /* renamed from: a */
    public final Iterator<File> mo110157a() {
        return new C52652b<>();
    }

    public C52650f(File file, C52658h hVar) {
        C52711k.m112240b(file, "start");
        C52711k.m112240b(hVar, "direction");
        this(file, hVar, null, null, null, 0, 32, null);
    }

    private C52650f(File file, C52658h hVar, C52671b<? super File, Boolean> bVar, C52671b<? super File, C52860x> bVar2, C52682m<? super File, ? super IOException, C52860x> mVar, int i) {
        this.f130935a = file;
        this.f130936b = hVar;
        this.f130937c = bVar;
        this.f130938d = bVar2;
        this.f130939e = mVar;
        this.f130940f = i;
    }

    private /* synthetic */ C52650f(File file, C52658h hVar, C52671b bVar, C52671b bVar2, C52682m mVar, int i, int i2, C52707g gVar) {
        this(file, hVar, null, null, null, Integer.MAX_VALUE);
    }
}
