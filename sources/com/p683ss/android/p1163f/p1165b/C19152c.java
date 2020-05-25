package com.p683ss.android.p1163f.p1165b;

import com.p683ss.android.p1163f.C19154c;

/* renamed from: com.ss.android.f.b.c */
public final class C19152c implements C19150a {

    /* renamed from: a */
    private C19150a f52788a;

    public C19152c(C19150a aVar) {
        this.f52788a = aVar;
    }

    /* renamed from: a */
    public final boolean mo39097a(C19154c cVar) {
        boolean a = this.f52788a.mo39097a(cVar);
        if (a) {
            new StringBuilder("enqueue log is ").append(cVar.toString());
        } else {
            new StringBuilder("not enqueue log is ").append(cVar.toString());
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo39098a(C19154c cVar, String str) {
        boolean a = this.f52788a.mo39098a(cVar, str);
        if (a) {
            StringBuilder sb = new StringBuilder("send to ");
            sb.append(str);
            sb.append(" log is ");
            sb.append(cVar.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("not send to ");
            sb2.append(str);
            sb2.append(" log is ");
            sb2.append(cVar.toString());
        }
        return a;
    }
}
