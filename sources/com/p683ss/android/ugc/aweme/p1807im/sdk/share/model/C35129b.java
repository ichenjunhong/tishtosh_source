package com.p683ss.android.ugc.aweme.p1807im.sdk.share.model;

import android.view.ViewGroup;
import android.widget.ImageView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.model.b */
public final class C35129b {

    /* renamed from: a */
    public final ViewGroup f90342a;

    /* renamed from: b */
    public final ImageView f90343b;

    /* renamed from: c */
    public final boolean f90344c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35129b) {
                C35129b bVar = (C35129b) obj;
                if (C52711k.m112239a((Object) this.f90342a, (Object) bVar.f90342a) && C52711k.m112239a((Object) this.f90343b, (Object) bVar.f90343b)) {
                    if (this.f90344c == bVar.f90344c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ViewGroup viewGroup = this.f90342a;
        int i = 0;
        int hashCode = (viewGroup != null ? viewGroup.hashCode() : 0) * 31;
        ImageView imageView = this.f90343b;
        if (imageView != null) {
            i = imageView.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f90344c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareCreateGroupPayload(layout=");
        sb.append(this.f90342a);
        sb.append(", ivCheck=");
        sb.append(this.f90343b);
        sb.append(", whiteBg=");
        sb.append(this.f90344c);
        sb.append(")");
        return sb.toString();
    }
}
