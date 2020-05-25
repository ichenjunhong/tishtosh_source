package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.g */
public final class C34622g implements Serializable {

    /* renamed from: a */
    private final String f89193a;

    /* renamed from: b */
    private final String f89194b;

    /* renamed from: c */
    private final Long f89195c;

    /* renamed from: d */
    private final String f89196d;

    /* renamed from: e */
    private final String f89197e;

    /* renamed from: f */
    private final String f89198f;

    /* renamed from: g */
    private final String f89199g;

    /* renamed from: h */
    private int f89200h;

    public final Long getCreate_at() {
        return this.f89195c;
    }

    public final String getIdempotent_id() {
        return this.f89194b;
    }

    public final String getKey() {
        return this.f89193a;
    }

    public final int getMark_read() {
        return this.f89200h;
    }

    public final String getMessage_id() {
        return this.f89199g;
    }

    public final String getSender_sec_uid() {
        return this.f89198f;
    }

    public final String getSender_uid() {
        return this.f89197e;
    }

    public final String getValue() {
        return this.f89196d;
    }

    public final void setMark_read(int i) {
        this.f89200h = i;
    }

    public C34622g(String str, String str2, Long l, String str3, String str4, String str5, String str6, int i) {
        this.f89193a = str;
        this.f89194b = str2;
        this.f89195c = l;
        this.f89196d = str3;
        this.f89197e = str4;
        this.f89198f = str5;
        this.f89199g = str6;
        this.f89200h = i;
    }

    public /* synthetic */ C34622g(String str, String str2, Long l, String str3, String str4, String str5, String str6, int i, int i2, C52707g gVar) {
        int i3;
        if ((i2 & 128) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        this(str, str2, l, str3, str4, str5, str6, i3);
    }
}
