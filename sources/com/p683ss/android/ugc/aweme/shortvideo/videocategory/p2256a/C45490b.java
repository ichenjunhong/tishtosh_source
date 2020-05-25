package com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2256a;

import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.a.b */
public final class C45490b {

    /* renamed from: e */
    public static final C45491a f114943e = new C45491a(null);

    /* renamed from: a */
    public final int f114944a;

    /* renamed from: b */
    public final int f114945b;

    /* renamed from: c */
    public final VideoCategoryParam f114946c;

    /* renamed from: d */
    public final Object f114947d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.a.b$a */
    public static final class C45491a {
        private C45491a() {
        }

        public /* synthetic */ C45491a(C52707g gVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45490b) {
                C45490b bVar = (C45490b) obj;
                if (this.f114944a == bVar.f114944a) {
                    if (!(this.f114945b == bVar.f114945b) || !C52711k.m112239a((Object) this.f114946c, (Object) bVar.f114946c) || !C52711k.m112239a(this.f114947d, bVar.f114947d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.f114944a * 31) + this.f114945b) * 31;
        VideoCategoryParam videoCategoryParam = this.f114946c;
        int i2 = 0;
        int hashCode = (i + (videoCategoryParam != null ? videoCategoryParam.hashCode() : 0)) * 31;
        Object obj = this.f114947d;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCategoryModel(type=");
        sb.append(this.f114944a);
        sb.append(", positionInList=");
        sb.append(this.f114945b);
        sb.append(", category=");
        sb.append(this.f114946c);
        sb.append(", payload=");
        sb.append(this.f114947d);
        sb.append(")");
        return sb.toString();
    }

    public C45490b(int i, int i2, VideoCategoryParam videoCategoryParam, Object obj) {
        this.f114944a = i;
        this.f114945b = i2;
        this.f114946c = videoCategoryParam;
        this.f114947d = obj;
    }
}
