package com.p683ss.android.ugc.aweme.filter;

import com.p683ss.android.ugc.aweme.common.p1592d.C26864a;
import java.io.FileOutputStream;
import java.io.InputStream;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52725c;

/* renamed from: com.ss.android.ugc.aweme.filter.as */
public final class C31418as {

    /* renamed from: a */
    public static final C31418as f82253a = new C31418as();

    /* renamed from: com.ss.android.ugc.aweme.filter.as$a */
    public static final class C31419a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ InputStream f82254a;

        /* renamed from: b */
        final /* synthetic */ FileOutputStream f82255b;

        /* renamed from: c */
        final /* synthetic */ C52725c f82256c;

        /* renamed from: d */
        final /* synthetic */ byte[] f82257d;

        /* renamed from: e */
        final /* synthetic */ C52725c f82258e;

        /* renamed from: f */
        final /* synthetic */ C26864a f82259f;

        /* renamed from: g */
        final /* synthetic */ String f82260g;

        /* renamed from: h */
        final /* synthetic */ long f82261h;

        public C31419a(InputStream inputStream, FileOutputStream fileOutputStream, C52725c cVar, byte[] bArr, C52725c cVar2, C26864a aVar, String str, long j) {
            this.f82254a = inputStream;
            this.f82255b = fileOutputStream;
            this.f82256c = cVar;
            this.f82257d = bArr;
            this.f82258e = cVar2;
            this.f82259f = aVar;
            this.f82260g = str;
            this.f82261h = j;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f82256c.element = this.f82254a.read(this.f82257d);
            return Integer.valueOf(this.f82256c.element);
        }
    }

    private C31418as() {
    }
}
