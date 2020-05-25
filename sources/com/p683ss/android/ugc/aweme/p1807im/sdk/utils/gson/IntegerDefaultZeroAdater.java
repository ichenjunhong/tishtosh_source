package com.p683ss.android.ugc.aweme.p1807im.sdk.utils.gson;

import com.google.gson.C18080j;
import com.google.gson.C18081k;
import com.google.gson.C18082l;
import com.google.gson.C18086p;
import com.google.gson.C18088r;
import com.google.gson.C18089s;
import com.google.gson.C18090t;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.gson.IntegerDefaultZeroAdater */
public class IntegerDefaultZeroAdater implements C18081k<Integer>, C18090t<Integer> {
    /* renamed from: a */
    public final /* synthetic */ C18082l mo9500a(Object obj, Type type, C18089s sVar) {
        return new C18088r((Number) (Integer) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) throws C18086p {
        return m79743b(lVar, type, jVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(2:5|6)|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        throw new com.google.gson.C18091u((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001e */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Integer m79743b(com.google.gson.C18082l r0, java.lang.reflect.Type r1, com.google.gson.C18080j r2) throws com.google.gson.C18086p {
        /*
            java.lang.String r1 = r0.mo34905c()     // Catch:{ Exception -> 0x001e }
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x001e }
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = r0.mo34905c()     // Catch:{ Exception -> 0x001e }
            java.lang.String r2 = "null"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x001e }
            if (r1 == 0) goto L_0x001e
        L_0x0018:
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x001e }
            return r1
        L_0x001e:
            int r0 = r0.mo34910g()     // Catch:{ NumberFormatException -> 0x0027 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            com.google.gson.u r1 = new com.google.gson.u
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.utils.gson.IntegerDefaultZeroAdater.m79743b(com.google.gson.l, java.lang.reflect.Type, com.google.gson.j):java.lang.Integer");
    }
}
