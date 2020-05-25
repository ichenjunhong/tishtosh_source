package com.p683ss.android.ugc.aweme.sharer;

import android.net.Uri;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.i */
public final class C42323i extends C42318f {

    /* renamed from: b */
    public final Uri f106880b;

    /* renamed from: c */
    public final String f106881c;

    /* renamed from: d */
    public final String f106882d;

    /* renamed from: e */
    public final String f106883e;

    /* renamed from: f */
    public final String f106884f;

    /* renamed from: g */
    public final String f106885g;

    public C42323i(Uri uri, String str) {
        this(uri, str, null, null, null, null, 60, null);
    }

    private C42323i(Uri uri, String str, String str2, String str3, String str4, String str5) {
        C52711k.m112240b(uri, "localUri");
        C52711k.m112240b(str, "localPath");
        super(null);
        this.f106880b = uri;
        this.f106881c = str;
        this.f106882d = str2;
        this.f106883e = str3;
        this.f106884f = str4;
        this.f106885g = str5;
    }

    public /* synthetic */ C42323i(Uri uri, String str, String str2, String str3, String str4, String str5, int i, C52707g gVar) {
        if ((i & 32) != 0) {
            str5 = null;
        }
        this(uri, str, null, null, null, str5);
    }
}
