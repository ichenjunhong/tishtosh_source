package com.p683ss.android.ugc.aweme.recommend;

import android.app.Activity;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.n */
public final class C41126n {

    /* renamed from: a */
    public final WeakReference<? extends Activity> f104510a;

    /* renamed from: b */
    public final String f104511b;

    /* renamed from: c */
    public final String f104512c;

    /* renamed from: d */
    public final boolean f104513d;

    public C41126n(WeakReference<? extends Activity> weakReference, String str, String str2) {
        this(weakReference, str, str2, false, 8, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41126n) {
                C41126n nVar = (C41126n) obj;
                if (C52711k.m112239a((Object) this.f104510a, (Object) nVar.f104510a) && C52711k.m112239a((Object) this.f104511b, (Object) nVar.f104511b) && C52711k.m112239a((Object) this.f104512c, (Object) nVar.f104512c)) {
                    if (this.f104513d == nVar.f104513d) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        WeakReference<? extends Activity> weakReference = this.f104510a;
        int i = 0;
        int hashCode = (weakReference != null ? weakReference.hashCode() : 0) * 31;
        String str = this.f104511b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f104512c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f104513d;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecommendUserDialogParams(activityRef=");
        sb.append(this.f104510a);
        sb.append(", enterFrom=");
        sb.append(this.f104511b);
        sb.append(", previousPage=");
        sb.append(this.f104512c);
        sb.append(", isColdBoot=");
        sb.append(this.f104513d);
        sb.append(")");
        return sb.toString();
    }

    private C41126n(WeakReference<? extends Activity> weakReference, String str, String str2, boolean z) {
        C52711k.m112240b(weakReference, "activityRef");
        this.f104510a = weakReference;
        this.f104511b = str;
        this.f104512c = str2;
        this.f104513d = z;
    }

    private /* synthetic */ C41126n(WeakReference weakReference, String str, String str2, boolean z, int i, C52707g gVar) {
        this(weakReference, str, str2, false);
    }
}
