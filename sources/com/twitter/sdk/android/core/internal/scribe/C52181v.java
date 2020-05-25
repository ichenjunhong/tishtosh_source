package com.twitter.sdk.android.core.internal.scribe;

import android.text.TextUtils;
import com.google.gson.C17971f;
import com.google.gson.p1076a.C17952c;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.v */
public class C52181v {
    @C17952c(mo34828a = "event_namespace")

    /* renamed from: a */
    final C52158e f129893a;
    @C17952c(mo34828a = "ts")

    /* renamed from: b */
    final String f129894b;
    @C17952c(mo34828a = "format_version")

    /* renamed from: c */
    final String f129895c = "2";
    @C17952c(mo34828a = "_category_")

    /* renamed from: d */
    final String f129896d;
    @C17952c(mo34828a = "items")

    /* renamed from: e */
    final List<C52144aa> f129897e;

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.v$a */
    public static class C52182a implements C52160f<C52181v> {

        /* renamed from: a */
        private final C17971f f129898a;

        public C52182a(C17971f fVar) {
            this.f129898a = fVar;
        }

        /* renamed from: a */
        public final /* synthetic */ byte[] mo108880a(Object obj) throws IOException {
            return this.f129898a.mo34889b((C52181v) obj).getBytes("UTF-8");
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (this.f129893a != null) {
            i = this.f129893a.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        if (this.f129894b != null) {
            i2 = this.f129894b.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        if (this.f129895c != null) {
            i3 = this.f129895c.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.f129896d != null) {
            i4 = this.f129896d.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.f129897e != null) {
            i5 = this.f129897e.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("event_namespace=");
        sb.append(this.f129893a);
        sb.append(", ts=");
        sb.append(this.f129894b);
        sb.append(", format_version=");
        sb.append(this.f129895c);
        sb.append(", _category_=");
        sb.append(this.f129896d);
        sb.append(", items=");
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(TextUtils.join(", ", this.f129897e));
        sb2.append("]");
        sb.append(sb2.toString());
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C52181v vVar = (C52181v) obj;
        if (this.f129896d == null ? vVar.f129896d != null : !this.f129896d.equals(vVar.f129896d)) {
            return false;
        }
        if (this.f129893a == null ? vVar.f129893a != null : !this.f129893a.equals(vVar.f129893a)) {
            return false;
        }
        if (this.f129895c == null ? vVar.f129895c != null : !this.f129895c.equals(vVar.f129895c)) {
            return false;
        }
        if (this.f129894b == null ? vVar.f129894b != null : !this.f129894b.equals(vVar.f129894b)) {
            return false;
        }
        if (this.f129897e == null ? vVar.f129897e == null : this.f129897e.equals(vVar.f129897e)) {
            return true;
        }
        return false;
    }

    public C52181v(String str, C52158e eVar, long j, List<C52144aa> list) {
        this.f129896d = str;
        this.f129893a = eVar;
        this.f129894b = String.valueOf(j);
        this.f129897e = Collections.unmodifiableList(list);
    }
}
