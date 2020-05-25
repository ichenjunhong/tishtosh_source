package com.p683ss.android.ugc.aweme.following.p1768a;

import android.support.p043v7.p051e.C1208c.C1212c;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.a.h */
public final class C32001h extends C1212c<Object> {
    /* renamed from: a */
    public final boolean mo3932a(Object obj, Object obj2) {
        C52711k.m112240b(obj, "p0");
        C52711k.m112240b(obj2, "p1");
        if (!(obj instanceof C32003j) || !(obj2 instanceof C32003j)) {
            if ((obj instanceof C32004k) && (obj2 instanceof C32004k)) {
                C32004k kVar = (C32004k) obj;
                C32004k kVar2 = (C32004k) obj2;
                if (kVar.f83563a != kVar2.f83563a || !C52711k.m112239a((Object) kVar.f83564b.getUid(), (Object) kVar2.f83564b.getUid())) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof C32002i) || !(obj2 instanceof C32002i)) {
                if (!(obj instanceof RecommendContact) || !(obj2 instanceof RecommendContact)) {
                    return false;
                }
                return C52711k.m112239a((Object) ((RecommendContact) obj).getType(), (Object) ((RecommendContact) obj2).getType());
            } else if (((C32002i) obj).f83558a == ((C32002i) obj2).f83558a) {
                return true;
            } else {
                return false;
            }
        } else if (((C32003j) obj).f83561a == ((C32003j) obj2).f83561a) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo3933b(Object obj, Object obj2) {
        C52711k.m112240b(obj, "p0");
        C52711k.m112240b(obj2, "p1");
        if (!(obj instanceof C32003j) || !(obj2 instanceof C32003j)) {
            if ((obj instanceof C32004k) && (obj2 instanceof C32004k)) {
                C32004k kVar = (C32004k) obj;
                C32004k kVar2 = (C32004k) obj2;
                if (kVar.f83563a != kVar2.f83563a || !C52711k.m112239a((Object) kVar.f83564b, (Object) kVar2.f83564b)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof C32002i) || !(obj2 instanceof C32002i)) {
                if (!(obj instanceof RecommendContact) || !(obj2 instanceof RecommendContact)) {
                    return false;
                }
                return C52711k.m112239a((Object) ((RecommendContact) obj).getType(), (Object) ((RecommendContact) obj2).getType());
            } else if (((C32002i) obj).f83558a == ((C32002i) obj2).f83558a) {
                return true;
            } else {
                return false;
            }
        } else if (((C32003j) obj).f83561a == ((C32003j) obj2).f83561a) {
            return true;
        } else {
            return false;
        }
    }
}
