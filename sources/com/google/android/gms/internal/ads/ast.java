package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15671a;
import com.google.android.gms.internal.ads.axz.C15672b;

public final class ast extends axz<ast, C15639a> implements azl {
    private static volatile azv<ast> zzdu;
    static final ast zzflj = new ast();

    /* renamed from: com.google.android.gms.internal.ads.ast$a */
    public static final class C15639a extends C15671a<ast, C15639a> implements azl {
        /* synthetic */ C15639a(asu asu) {
            this();
        }

        private C15639a() {
            super(ast.zzflj);
        }
    }

    private ast() {
    }

    /* renamed from: a */
    public static ast m34078a(awo awo) throws ayi {
        return (ast) axz.m34706a(zzflj, awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo28773a(int i, Object obj, Object obj2) {
        switch (asu.f41310a[i - 1]) {
            case 1:
                return new ast();
            case 2:
                return new C15639a(null);
            case 3:
                return m34713a((azj) zzflj, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzflj;
            case 5:
                azv<ast> azv = zzdu;
                if (azv == null) {
                    synchronized (ast.class) {
                        azv = zzdu;
                        if (azv == null) {
                            azv = new C15672b<>(zzflj);
                            zzdu = azv;
                        }
                    }
                }
                return azv;
            case 6:
                return Byte.valueOf(1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axz.m34715a(ast.class, zzflj);
    }
}
