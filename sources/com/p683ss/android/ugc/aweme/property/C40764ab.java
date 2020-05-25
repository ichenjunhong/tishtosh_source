package com.p683ss.android.ugc.aweme.property;

import com.p683ss.android.ugc.aweme.property.C40761aa.C40762a;
import com.p683ss.android.ugc.aweme.property.C40761aa.C40763b;

/* renamed from: com.ss.android.ugc.aweme.property.ab */
public abstract /* synthetic */ class C40764ab {
    /* renamed from: a */
    public static Object m90170a(C40762a aVar, C40763b bVar, Object obj) {
        if (bVar == null) {
            throw new NullPointerException();
        } else if (bVar == C40763b.Boolean && !(obj instanceof Boolean)) {
            throw new IllegalArgumentException();
        } else if (bVar == C40763b.Float && !(obj instanceof Float)) {
            throw new IllegalArgumentException();
        } else if (bVar == C40763b.Integer && !(obj instanceof Integer)) {
            throw new IllegalArgumentException();
        } else if (bVar != C40763b.Long || (obj instanceof Long)) {
            if (bVar != C40763b.String || (obj instanceof String)) {
                return obj;
            }
            throw new IllegalArgumentException();
        } else if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        } else {
            throw new IllegalArgumentException();
        }
    }
}
