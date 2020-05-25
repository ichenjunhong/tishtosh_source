package com.p683ss.android.ugc.aweme.tools.beauty;

import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.d */
public final class C46870d {

    /* renamed from: a */
    public final ComposerBeauty f118406a;

    /* renamed from: b */
    public final String f118407b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComposerBeautyDownload(beauty=");
        sb.append(this.f118406a);
        sb.append(", unzipPath=");
        sb.append(this.f118407b);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return C46871e.m101786a(this.f118406a.getEffect().getEffectId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46870d) {
            return C52711k.m112239a((Object) ((C46870d) obj).f118407b, (Object) this.f118407b);
        }
        return false;
    }

    private C46870d(ComposerBeauty composerBeauty, String str) {
        C52711k.m112240b(composerBeauty, "beauty");
        C52711k.m112240b(str, "unzipPath");
        this.f118406a = composerBeauty;
        this.f118407b = str;
    }

    public /* synthetic */ C46870d(ComposerBeauty composerBeauty, String str, int i, C52707g gVar) {
        String unzipPath = composerBeauty.getEffect().getUnzipPath();
        C52711k.m112236a((Object) unzipPath, "beauty.effect.unzipPath");
        this(composerBeauty, unzipPath);
    }
}
