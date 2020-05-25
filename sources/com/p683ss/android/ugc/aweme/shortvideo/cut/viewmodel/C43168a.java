package com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel;

import com.p683ss.android.vesdk.C50720o.C50743d;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a */
public final class C43168a {

    /* renamed from: e */
    public static final C43169a f109117e = new C43169a(null);

    /* renamed from: a */
    public C50743d f109118a;

    /* renamed from: b */
    public long f109119b;

    /* renamed from: c */
    public final int f109120c;

    /* renamed from: d */
    public boolean f109121d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a$a */
    public static final class C43169a {
        private C43169a() {
        }

        public /* synthetic */ C43169a(C52707g gVar) {
            this();
        }
    }

    public C43168a(int i, boolean z) {
        this.f109120c = i;
        this.f109121d = z;
        this.f109118a = C50743d.EDITOR_SEEK_FLAG_LastSeek;
    }

    public C43168a(int i, long j, C50743d dVar) {
        C52711k.m112240b(dVar, "seekMode");
        this(3, false, 2, null);
        this.f109119b = j;
        this.f109118a = dVar;
    }

    public /* synthetic */ C43168a(int i, boolean z, int i2, C52707g gVar) {
        this(i, true);
    }
}
