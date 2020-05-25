package com.bytedance.ies.bullet.kit.web;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.bytedance.ies.bullet.kit.web.p */
public final class C10549p extends Error {

    /* renamed from: a */
    private final int f28018a;

    /* renamed from: b */
    private final CharSequence f28019b;

    /* renamed from: c */
    private final CharSequence f28020c;

    public final CharSequence getDescription() {
        return this.f28019b;
    }

    public final int getErrorCode() {
        return this.f28018a;
    }

    public final CharSequence getFailingUrl() {
        return this.f28020c;
    }

    public C10549p(int i, CharSequence charSequence, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder("WebLoadError, errorCode: ");
        sb.append(i);
        sb.append(", desc: ");
        sb.append(charSequence);
        sb.append(", failingUrl: ");
        sb.append(charSequence2);
        super(sb.toString());
        this.f28018a = i;
        this.f28019b = charSequence;
        this.f28020c = charSequence2;
    }

    public /* synthetic */ C10549p(int i, CharSequence charSequence, CharSequence charSequence2, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            charSequence = null;
        }
        if ((i2 & 4) != 0) {
            charSequence2 = null;
        }
        this(i, charSequence, charSequence2);
    }
}
