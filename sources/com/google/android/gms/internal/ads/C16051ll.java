package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.ads.ll */
final class C16051ll {

    /* renamed from: a */
    long f45161a;

    /* renamed from: b */
    final String f45162b;

    /* renamed from: c */
    final String f45163c;

    /* renamed from: d */
    final long f45164d;

    /* renamed from: e */
    final long f45165e;

    /* renamed from: f */
    final long f45166f;

    /* renamed from: g */
    final long f45167g;

    /* renamed from: h */
    final List<blz> f45168h;

    private C16051ll(String str, String str2, long j, long j2, long j3, long j4, List<blz> list) {
        this.f45162b = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        this.f45163c = str2;
        this.f45164d = j;
        this.f45165e = j2;
        this.f45166f = j3;
        this.f45167g = j4;
        this.f45168h = list;
    }

    C16051ll(String str, auw auw) {
        List list;
        String str2 = auw.f41391b;
        long j = auw.f41392c;
        long j2 = auw.f41393d;
        long j3 = auw.f41394e;
        long j4 = auw.f41395f;
        if (auw.f41397h != null) {
            list = auw.f41397h;
        } else {
            Map<String, String> map = auw.f41396g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Entry entry : map.entrySet()) {
                arrayList.add(new blz((String) entry.getKey(), (String) entry.getValue()));
            }
            list = arrayList;
        }
        this(str, str2, j, j2, j3, j4, list);
    }

    /* renamed from: a */
    static C16051ll m38016a(C16079mm mmVar) throws IOException {
        if (C16023kk.m37896a((InputStream) mmVar) == 538247942) {
            C16051ll llVar = new C16051ll(C16023kk.m37898a(mmVar), C16023kk.m37898a(mmVar), C16023kk.m37904b((InputStream) mmVar), C16023kk.m37904b((InputStream) mmVar), C16023kk.m37904b((InputStream) mmVar), C16023kk.m37904b((InputStream) mmVar), C16023kk.m37905b(mmVar));
            return llVar;
        }
        throw new IOException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo31163a(OutputStream outputStream) {
        try {
            C16023kk.m37899a(outputStream, 538247942);
            C16023kk.m37901a(outputStream, this.f45162b);
            C16023kk.m37901a(outputStream, this.f45163c == null ? "" : this.f45163c);
            C16023kk.m37900a(outputStream, this.f45164d);
            C16023kk.m37900a(outputStream, this.f45165e);
            C16023kk.m37900a(outputStream, this.f45166f);
            C16023kk.m37900a(outputStream, this.f45167g);
            List<blz> list = this.f45168h;
            if (list != null) {
                C16023kk.m37899a(outputStream, list.size());
                for (blz blz : list) {
                    C16023kk.m37901a(outputStream, blz.f42900a);
                    C16023kk.m37901a(outputStream, blz.f42901b);
                }
            } else {
                C16023kk.m37899a(outputStream, 0);
            }
            outputStream.flush();
            return true;
        } catch (IOException e) {
            new Object[1][0] = e.toString();
            return false;
        }
    }
}
