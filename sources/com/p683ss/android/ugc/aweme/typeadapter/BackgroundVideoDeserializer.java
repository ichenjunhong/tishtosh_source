package com.p683ss.android.ugc.aweme.typeadapter;

import com.google.gson.C18080j;
import com.google.gson.C18081k;
import com.google.gson.C18082l;
import com.p683ss.android.ugc.aweme.sticker.model.C46066a;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer */
public final class BackgroundVideoDeserializer implements C18081k<C46066a> {
    /* renamed from: a */
    public final /* synthetic */ Object mo9501a(C18082l lVar, Type type, C18080j jVar) {
        return m102780b(lVar, type, jVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e A[Catch:{ Exception -> 0x0008 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e A[Catch:{ Exception -> 0x0008 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0058 A[Catch:{ Exception -> 0x0008 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009d A[Catch:{ Exception -> 0x0008 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p683ss.android.ugc.aweme.sticker.model.C46066a m102780b(com.google.gson.C18082l r17, java.lang.reflect.Type r18, com.google.gson.C18080j r19) {
        /*
            r1 = 0
            if (r17 == 0) goto L_0x000b
            com.google.gson.o r0 = r17.mo35009m()     // Catch:{ Exception -> 0x0008 }
            goto L_0x000c
        L_0x0008:
            r0 = move-exception
            goto L_0x00c0
        L_0x000b:
            r0 = r1
        L_0x000c:
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "videoPath"
            com.google.gson.l r2 = r0.mo35022b(r2)     // Catch:{ Exception -> 0x0008 }
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = r2.mo34905c()     // Catch:{ Exception -> 0x0008 }
            goto L_0x001c
        L_0x001b:
            r2 = r1
        L_0x001c:
            if (r0 == 0) goto L_0x002b
            java.lang.String r3 = "audioPath"
            com.google.gson.l r3 = r0.mo35022b(r3)     // Catch:{ Exception -> 0x0008 }
            if (r3 == 0) goto L_0x002b
            java.lang.String r3 = r3.mo34905c()     // Catch:{ Exception -> 0x0008 }
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            if (r0 == 0) goto L_0x003b
            java.lang.String r4 = "maxDuration"
            com.google.gson.l r4 = r0.mo35022b(r4)     // Catch:{ Exception -> 0x0008 }
            if (r4 == 0) goto L_0x003b
            long r4 = r4.mo34909f()     // Catch:{ Exception -> 0x0008 }
            goto L_0x003d
        L_0x003b:
            r4 = 0
        L_0x003d:
            r9 = r4
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Exception -> 0x0008 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0008 }
            if (r4 != 0) goto L_0x0050
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Exception -> 0x0008 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0008 }
            if (r4 == 0) goto L_0x0092
        L_0x0050:
            if (r0 == 0) goto L_0x0092
            java.util.Set r0 = r0.mo35016a()     // Catch:{ Exception -> 0x0008 }
            if (r0 == 0) goto L_0x0092
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ Exception -> 0x0008 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0008 }
        L_0x005e:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x0008 }
            if (r4 == 0) goto L_0x0092
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x0008 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Exception -> 0x0008 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Exception -> 0x0008 }
            java.lang.String r5 = "it.value"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ Exception -> 0x0008 }
            com.google.gson.l r4 = (com.google.gson.C18082l) r4     // Catch:{ Exception -> 0x0008 }
            java.lang.String r4 = r4.mo34905c()     // Catch:{ Exception -> 0x0008 }
            java.lang.String r5 = "value"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)     // Catch:{ Exception -> 0x0008 }
            java.lang.String r5 = "-bgv-v"
            r6 = 1
            boolean r5 = p2628d.p2650m.C52830p.m112412c(r4, r5, r6)     // Catch:{ Exception -> 0x0008 }
            if (r5 == 0) goto L_0x0088
            r2 = r4
        L_0x0088:
            java.lang.String r5 = "-bgv-a"
            boolean r5 = p2628d.p2650m.C52830p.m112412c(r4, r5, r6)     // Catch:{ Exception -> 0x0008 }
            if (r5 == 0) goto L_0x005e
            r3 = r4
            goto L_0x005e
        L_0x0092:
            r7 = r2
            r8 = r3
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0008 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0008 }
            if (r0 != 0) goto L_0x00bf
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0008 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0008 }
            if (r0 != 0) goto L_0x00bf
            com.ss.android.ugc.aweme.sticker.model.a r0 = new com.ss.android.ugc.aweme.sticker.model.a     // Catch:{ Exception -> 0x0008 }
            if (r7 != 0) goto L_0x00ad
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x0008 }
        L_0x00ad:
            if (r8 != 0) goto L_0x00b2
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x0008 }
        L_0x00b2:
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 56
            r16 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r11, r12, r14, r15, r16)     // Catch:{ Exception -> 0x0008 }
            return r0
        L_0x00bf:
            return r1
        L_0x00c0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Deserializer bgv failed "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98971b(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer.m102780b(com.google.gson.l, java.lang.reflect.Type, com.google.gson.j):com.ss.android.ugc.aweme.sticker.model.a");
    }
}
