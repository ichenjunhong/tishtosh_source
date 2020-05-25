package com.bytedance.p702im.core.p706c.p707a;

import android.text.TextUtils;

/* renamed from: com.bytedance.im.core.c.a.a */
public final class C11179a {

    /* renamed from: a */
    public String f30169a;

    /* renamed from: b */
    public int f30170b;

    /* renamed from: c */
    public String f30171c;

    /* renamed from: d */
    public String f30172d;

    /* renamed from: e */
    public String f30173e;

    /* renamed from: f */
    public String f30174f;

    /* renamed from: g */
    public String f30175g;

    /* renamed from: h */
    public String f30176h;

    /* renamed from: a */
    public final String mo20560a() {
        if (TextUtils.isEmpty(this.f30169a)) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f30171c)) {
                sb.append(this.f30171c);
                sb.append("|");
            }
            if (!TextUtils.isEmpty(this.f30172d)) {
                sb.append(this.f30172d);
                sb.append("|");
            }
            if (!TextUtils.isEmpty(this.f30173e)) {
                sb.append(this.f30173e);
                sb.append("|");
            }
            if (!TextUtils.isEmpty(this.f30174f)) {
                sb.append(this.f30174f);
                sb.append("|");
            }
            sb.append(this.f30170b);
            this.f30169a = sb.toString();
        }
        return this.f30169a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FTSEntity {combinedKey is ");
        sb.append(this.f30169a);
        sb.append(" , type is ");
        sb.append(this.f30170b);
        sb.append(" , conversationId is ");
        sb.append(this.f30171c);
        sb.append(" , messageUuid is ");
        sb.append(this.f30172d);
        sb.append(" , userId is ");
        sb.append(this.f30173e);
        sb.append(" , entityId is ");
        sb.append(this.f30174f);
        sb.append(" , searchContent is ");
        sb.append(this.f30175g);
        sb.append(" , extra is ");
        sb.append(this.f30176h);
        sb.append("}");
        return sb.toString();
    }
}
