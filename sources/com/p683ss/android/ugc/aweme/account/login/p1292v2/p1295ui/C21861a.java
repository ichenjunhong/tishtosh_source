package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a */
public final class C21861a {

    /* renamed from: a */
    public String f59179a;

    /* renamed from: b */
    public String f59180b;

    /* renamed from: c */
    public boolean f59181c;

    /* renamed from: d */
    public String f59182d;

    /* renamed from: e */
    public String f59183e;

    /* renamed from: f */
    public boolean f59184f;

    /* renamed from: g */
    public String f59185g;

    /* renamed from: h */
    public boolean f59186h;

    /* renamed from: i */
    public boolean f59187i;

    public C21861a() {
        this(null, null, false, null, null, false, null, false, false, 511, null);
    }

    private C21861a(String str, String str2, boolean z, String str3, String str4, boolean z2, String str5, boolean z3, boolean z4) {
        this.f59179a = str;
        this.f59180b = str2;
        this.f59181c = z;
        this.f59182d = str3;
        this.f59183e = str4;
        this.f59184f = z2;
        this.f59185g = str5;
        this.f59186h = z3;
        this.f59187i = z4;
    }

    public /* synthetic */ C21861a(String str, String str2, boolean z, String str3, String str4, boolean z2, String str5, boolean z3, boolean z4, int i, C52707g gVar) {
        String str6;
        boolean z5;
        String str7;
        String str8;
        boolean z6;
        int i2 = i;
        String str9 = null;
        if ((i2 & 1) != 0) {
            str6 = null;
        } else {
            str6 = str;
        }
        boolean z7 = true;
        if ((i2 & 4) != 0) {
            z5 = true;
        } else {
            z5 = z;
        }
        if ((i2 & 8) != 0) {
            str7 = null;
        } else {
            str7 = str3;
        }
        if ((i2 & 16) != 0) {
            str8 = null;
        } else {
            str8 = str4;
        }
        boolean z8 = false;
        if ((i2 & 32) != 0) {
            z6 = false;
        } else {
            z6 = z2;
        }
        if ((i2 & 64) == 0) {
            str9 = str5;
        }
        if ((i2 & 128) == 0) {
            z7 = z3;
        }
        if ((i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) == 0) {
            z8 = z4;
        }
        this(str6, null, z5, str7, str8, z6, str9, z7, z8);
    }
}
