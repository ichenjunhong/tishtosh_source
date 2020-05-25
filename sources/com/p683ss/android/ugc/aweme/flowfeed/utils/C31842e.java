package com.p683ss.android.ugc.aweme.flowfeed.utils;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.utils.C47724bl;
import com.p683ss.android.ugc.aweme.video.C48021h;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.e */
public final class C31842e {

    /* renamed from: a */
    public Aweme f83200a;

    /* renamed from: b */
    public int f83201b;

    /* renamed from: c */
    public C47724bl f83202c = new C47724bl(1);

    /* renamed from: d */
    public int f83203d;

    /* renamed from: e */
    public int f83204e;

    /* renamed from: f */
    public long f83205f = -1;

    /* renamed from: g */
    public boolean f83206g;

    /* renamed from: h */
    public C48021h f83207h;

    /* renamed from: i */
    public String f83208i;

    /* renamed from: j */
    public boolean f83209j = false;

    /* renamed from: k */
    private long f83210k = -1;

    public final int hashCode() {
        return this.f83208i.hashCode();
    }

    /* renamed from: a */
    public final void mo64943a() {
        if (this.f83205f == -1) {
            this.f83205f = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final void mo64947b(String str) {
        if (this.f83210k != -1) {
            C23794bh.m58392f().mo64986a(this.f83200a, System.currentTimeMillis() - this.f83210k, str);
            this.f83210k = -1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj || ((obj instanceof C31842e) && TextUtils.equals(this.f83208i, ((C31842e) obj).f83208i))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo64944a(String str) {
        if (this.f83210k == -1) {
            this.f83210k = System.currentTimeMillis();
            C23794bh.m58392f().mo64989a(this.f83200a, str);
        }
    }

    /* renamed from: a */
    public static String m74200a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }

    public C31842e(Aweme aweme, C47724bl blVar, String str) {
        this.f83200a = aweme;
        this.f83202c = blVar;
        this.f83208i = str;
    }

    /* renamed from: a */
    public final void mo64946a(boolean z, String str, String str2, String str3) {
        if (this.f83205f != -1) {
            C23794bh.m58392f().mo64988a(this.f83200a, System.currentTimeMillis() - this.f83205f, z, str, str2, str3);
            this.f83205f = -1;
        }
    }

    /* renamed from: a */
    public final void mo64945a(String str, String str2, String str3, boolean z, String str4) {
        if (!this.f83206g) {
            this.f83206g = true;
            C23794bh.m58392f().mo64996a(this.f83200a, str, str2, str3, z, str4);
        }
    }
}
