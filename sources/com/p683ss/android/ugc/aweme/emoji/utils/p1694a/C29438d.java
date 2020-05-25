package com.p683ss.android.ugc.aweme.emoji.utils.p1694a;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.d */
public final class C29438d {

    /* renamed from: a */
    private static final Map<C29471z, Class<?>> f77079a = new ConcurrentHashMap();

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.a.d$a */
    public static final class C29439a {

        /* renamed from: a */
        public static final C29439a f77080a = new C29439a(0);

        /* renamed from: b */
        public static final C29439a f77081b = new C29439a(1);

        /* renamed from: c */
        public static final C29439a f77082c = new C29439a(2);

        /* renamed from: d */
        public final int f77083d;

        private C29439a(int i) {
            this.f77083d = i;
        }
    }

    static {
        m69431a(C29436b.class);
        m69431a(C29442g.class);
        m69431a(C29447k.class);
        m69431a(C29446j.class);
        m69431a(C29452o.class);
    }

    /* renamed from: a */
    private static void m69431a(Class<?> cls) {
        try {
            f77079a.put(((C29460v) cls.newInstance()).mo59512e(), cls);
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls);
            sb.append(" doesn't implement ZipExtraField");
            throw new RuntimeException(sb.toString());
        } catch (InstantiationException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls);
            sb2.append(" is not a concrete class");
            throw new RuntimeException(sb2.toString());
        } catch (IllegalAccessException unused3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls);
            sb3.append("'s no-arg constructor is not public");
            throw new RuntimeException(sb3.toString());
        }
    }

    /* renamed from: a */
    public static byte[] m69432a(C29460v[] vVarArr) {
        boolean z;
        int i;
        if (vVarArr.length <= 0 || !(vVarArr[vVarArr.length - 1] instanceof C29448l)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = vVarArr.length - 1;
        } else {
            i = vVarArr.length;
        }
        int i2 = i * 4;
        for (C29460v d : vVarArr) {
            i2 += d.mo59510d().f77201a;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            System.arraycopy(vVarArr[i4].mo59512e().mo59566a(), 0, bArr, i3, 2);
            System.arraycopy(vVarArr[i4].mo59510d().mo59566a(), 0, bArr, i3 + 2, 2);
            byte[] c = vVarArr[i4].mo59509c();
            System.arraycopy(c, 0, bArr, i3 + 4, c.length);
            i3 += c.length + 4;
        }
        if (z) {
            byte[] c2 = vVarArr[vVarArr.length - 1].mo59509c();
            System.arraycopy(c2, 0, bArr, i3, c2.length);
        }
        return bArr;
    }

    /* renamed from: a */
    public static C29460v[] m69433a(byte[] bArr, boolean z, C29439a aVar) throws ZipException {
        C29460v vVar;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i > bArr.length - 4) {
                break;
            }
            C29471z zVar = new C29471z(bArr, i);
            int i2 = new C29471z(bArr, i + 2).f77201a;
            int i3 = i + 4;
            if (i3 + i2 > bArr.length) {
                switch (aVar.f77083d) {
                    case 0:
                        StringBuilder sb = new StringBuilder("bad extra field starting at ");
                        sb.append(i);
                        sb.append(".  Block length of ");
                        sb.append(i2);
                        sb.append(" bytes exceeds remaining data of ");
                        sb.append((bArr.length - i) - 4);
                        sb.append(" bytes.");
                        throw new ZipException(sb.toString());
                    case 1:
                        break;
                    case 2:
                        C29448l lVar = new C29448l();
                        if (z) {
                            lVar.mo59506a(bArr, i, bArr.length - i);
                        } else {
                            lVar.mo59513b(bArr, i, bArr.length - i);
                        }
                        arrayList.add(lVar);
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder("unknown UnparseableExtraField key: ");
                        sb2.append(aVar.f77083d);
                        throw new ZipException(sb2.toString());
                }
            } else {
                try {
                    Class cls = (Class) f77079a.get(zVar);
                    if (cls != null) {
                        vVar = (C29460v) cls.newInstance();
                    } else {
                        C29449m mVar = new C29449m();
                        mVar.f77103a = zVar;
                        vVar = mVar;
                    }
                    if (!z) {
                        if (vVar instanceof C29437c) {
                            ((C29437c) vVar).mo59513b(bArr, i3, i2);
                            arrayList.add(vVar);
                            i += i2 + 4;
                        }
                    }
                    vVar.mo59506a(bArr, i3, i2);
                    arrayList.add(vVar);
                    i += i2 + 4;
                } catch (InstantiationException e) {
                    throw new ZipException(e.getMessage());
                } catch (IllegalAccessException e2) {
                    throw new ZipException(e2.getMessage());
                }
            }
        }
        return (C29460v[]) arrayList.toArray(new C29460v[arrayList.size()]);
    }
}
