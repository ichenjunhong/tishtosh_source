package com.p683ss.android.ugc.aweme.sharer;

import android.net.Uri;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sharer.k */
public final class C42325k extends C42318f {

    /* renamed from: b */
    public final Uri f106888b;

    /* renamed from: c */
    public final String f106889c;

    /* renamed from: d */
    public final String f106890d;

    /* renamed from: e */
    public final String f106891e;

    /* renamed from: f */
    public final String f106892f;

    /* renamed from: g */
    public final String f106893g;

    public C42325k(Uri uri, String str) {
        this(uri, str, null, null, null, null, 60, null);
    }

    private C42325k(Uri uri, String str, String str2, String str3, String str4, String str5) {
        C52711k.m112240b(uri, "localUri");
        super(null);
        this.f106888b = uri;
        this.f106889c = str;
        this.f106890d = str2;
        this.f106891e = str3;
        this.f106892f = str4;
        this.f106893g = str5;
    }

    public /* synthetic */ C42325k(Uri uri, String str, String str2, String str3, String str4, String str5, int i, C52707g gVar) {
        String str6;
        String str7;
        String str8;
        String str9;
        if ((i & 2) != 0) {
            str6 = null;
        } else {
            str6 = str;
        }
        if ((i & 4) != 0) {
            str7 = null;
        } else {
            str7 = str2;
        }
        if ((i & 16) != 0) {
            str8 = null;
        } else {
            str8 = str4;
        }
        if ((i & 32) != 0) {
            str9 = null;
        } else {
            str9 = str5;
        }
        this(uri, str6, str7, null, str8, str9);
    }
}
