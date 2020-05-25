package com.google.android.gms.measurement.internal;

import android.support.p030v4.p038f.C0777a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.internal.measurement.C16636dr;
import com.google.android.gms.internal.measurement.C16637ds;
import com.google.android.gms.internal.measurement.C16638dt;
import com.google.android.gms.internal.measurement.C16639du;
import com.google.android.gms.internal.measurement.C16640dv;
import com.google.android.gms.internal.measurement.C16646ea;
import com.google.android.gms.internal.measurement.C16648ec;
import com.google.android.gms.internal.measurement.C16653eh;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.er */
final class C17107er extends C17091ec {
    C17107er(C17092ed edVar) {
        super(edVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo32904d() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x08a6  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0a72 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C16644dz[] mo33269a(java.lang.String r99, com.google.android.gms.internal.measurement.C16647eb[] r100, com.google.android.gms.internal.measurement.C16653eh[] r101) {
        /*
            r98 = this;
            r7 = r98
            r15 = r99
            r13 = r100
            r14 = r101
            com.google.android.gms.common.internal.C15464q.m32125a(r99)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            android.support.v4.f.a r12 = new android.support.v4.f.a
            r12.<init>()
            android.support.v4.f.a r10 = new android.support.v4.f.a
            r10.<init>()
            android.support.v4.f.a r9 = new android.support.v4.f.a
            r9.<init>()
            android.support.v4.f.a r8 = new android.support.v4.f.a
            r8.<init>()
            android.support.v4.f.a r6 = new android.support.v4.f.a
            r6.<init>()
            com.google.android.gms.measurement.internal.eu r0 = r98.mo32856s()
            boolean r23 = r0.mo33284f(r15)
            com.google.android.gms.measurement.internal.ex r0 = r98.mo32910h()
            java.util.Map r0 = r0.mo33325e(r15)
            if (r0 == 0) goto L_0x0183
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0043:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0183
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r0.get(r4)
            com.google.android.gms.internal.measurement.ef r4 = (com.google.android.gms.internal.measurement.C16651ef) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            java.lang.Object r5 = r10.get(r5)
            java.util.BitSet r5 = (java.util.BitSet) r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r9.get(r3)
            java.util.BitSet r3 = (java.util.BitSet) r3
            if (r23 == 0) goto L_0x00b3
            r27 = r0
            android.support.v4.f.a r0 = new android.support.v4.f.a
            r0.<init>()
            if (r4 == 0) goto L_0x00a5
            r28 = r1
            com.google.android.gms.internal.measurement.ea[] r1 = r4.f46843c
            if (r1 != 0) goto L_0x0083
            goto L_0x00a7
        L_0x0083:
            com.google.android.gms.internal.measurement.ea[] r1 = r4.f46843c
            r29 = r3
            int r3 = r1.length
            r30 = r11
            r11 = 0
        L_0x008b:
            if (r11 >= r3) goto L_0x00ab
            r31 = r3
            r3 = r1[r11]
            r32 = r1
            java.lang.Integer r1 = r3.f46784a
            if (r1 == 0) goto L_0x009e
            java.lang.Integer r1 = r3.f46784a
            java.lang.Long r3 = r3.f46785b
            r0.put(r1, r3)
        L_0x009e:
            int r11 = r11 + 1
            r3 = r31
            r1 = r32
            goto L_0x008b
        L_0x00a5:
            r28 = r1
        L_0x00a7:
            r29 = r3
            r30 = r11
        L_0x00ab:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r8.put(r1, r0)
            goto L_0x00bc
        L_0x00b3:
            r27 = r0
            r28 = r1
            r29 = r3
            r30 = r11
            r0 = 0
        L_0x00bc:
            if (r5 != 0) goto L_0x00d7
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r10.put(r1, r5)
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r9.put(r1, r3)
            goto L_0x00d9
        L_0x00d7:
            r3 = r29
        L_0x00d9:
            r1 = 0
        L_0x00da:
            long[] r11 = r4.f46841a
            int r11 = r11.length
            int r11 = r11 << 6
            if (r1 >= r11) goto L_0x012d
            long[] r11 = r4.f46841a
            boolean r11 = com.google.android.gms.measurement.internal.C17099ej.m41622a(r11, r1)
            if (r11 == 0) goto L_0x0112
            com.google.android.gms.measurement.internal.r r11 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r11 = r11.f48453j
            r33 = r8
            java.lang.String r8 = "Filter already evaluated. audience ID, filter ID"
            r34 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r35 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r11.mo33378a(r8, r9, r10)
            r3.set(r1)
            long[] r8 = r4.f46842b
            boolean r8 = com.google.android.gms.measurement.internal.C17099ej.m41622a(r8, r1)
            if (r8 == 0) goto L_0x0118
            r5.set(r1)
            r8 = 1
            goto L_0x0119
        L_0x0112:
            r33 = r8
            r34 = r9
            r35 = r10
        L_0x0118:
            r8 = 0
        L_0x0119:
            if (r0 == 0) goto L_0x0124
            if (r8 != 0) goto L_0x0124
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r0.remove(r8)
        L_0x0124:
            int r1 = r1 + 1
            r8 = r33
            r9 = r34
            r10 = r35
            goto L_0x00da
        L_0x012d:
            r33 = r8
            r34 = r9
            r35 = r10
            com.google.android.gms.internal.measurement.dz r1 = new com.google.android.gms.internal.measurement.dz
            r1.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r12.put(r8, r1)
            r8 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            r1.f46778d = r9
            r1.f46777c = r4
            com.google.android.gms.internal.measurement.ef r4 = new com.google.android.gms.internal.measurement.ef
            r4.<init>()
            r1.f46776b = r4
            com.google.android.gms.internal.measurement.ef r4 = r1.f46776b
            long[] r5 = com.google.android.gms.measurement.internal.C17099ej.m41623a(r5)
            r4.f46842b = r5
            com.google.android.gms.internal.measurement.ef r4 = r1.f46776b
            long[] r3 = com.google.android.gms.measurement.internal.C17099ej.m41623a(r3)
            r4.f46841a = r3
            if (r23 == 0) goto L_0x0175
            com.google.android.gms.internal.measurement.ef r1 = r1.f46776b
            com.google.android.gms.internal.measurement.ea[] r0 = m41765a(r0)
            r1.f46843c = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.support.v4.f.a r1 = new android.support.v4.f.a
            r1.<init>()
            r6.put(r0, r1)
        L_0x0175:
            r0 = r27
            r1 = r28
            r11 = r30
            r8 = r33
            r9 = r34
            r10 = r35
            goto L_0x0043
        L_0x0183:
            r33 = r8
            r34 = r9
            r35 = r10
            r30 = r11
            if (r13 == 0) goto L_0x077c
            android.support.v4.f.a r9 = new android.support.v4.f.a
            r9.<init>()
            int r8 = r13.length
            r27 = 0
            r2 = r27
            r0 = 0
            r1 = 0
            r4 = 0
        L_0x019a:
            if (r4 >= r8) goto L_0x077c
            r5 = r13[r4]
            java.lang.String r10 = r5.f46788b
            com.google.android.gms.internal.measurement.ec[] r11 = r5.f46787a
            r36 = r2
            com.google.android.gms.measurement.internal.eu r2 = r98.mo32856s()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.C17122h.f48360X
            boolean r2 = r2.mo33278c(r15, r3)
            r16 = 1
            if (r2 == 0) goto L_0x036b
            r98.mo32906f()
            java.lang.String r2 = "_eid"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C17099ej.m41625b(r5, r2)
            r3 = r2
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L_0x01c2
            r2 = 1
            goto L_0x01c3
        L_0x01c2:
            r2 = 0
        L_0x01c3:
            if (r2 == 0) goto L_0x01d1
            r38 = r4
            java.lang.String r4 = "_ep"
            boolean r4 = r10.equals(r4)
            if (r4 == 0) goto L_0x01d3
            r4 = 1
            goto L_0x01d4
        L_0x01d1:
            r38 = r4
        L_0x01d3:
            r4 = 0
        L_0x01d4:
            if (r4 == 0) goto L_0x0324
            r98.mo32906f()
            java.lang.String r2 = "_en"
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C17099ej.m41625b(r5, r2)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 == 0) goto L_0x01fb
            com.google.android.gms.measurement.internal.r r2 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48445b
            java.lang.String r4 = "Extra parameter without an event name. eventId"
            r2.mo33377a(r4, r3)
            r41 = r6
            r26 = r38
            r24 = 1
            goto L_0x0310
        L_0x01fb:
            if (r0 == 0) goto L_0x0212
            if (r1 == 0) goto L_0x0212
            long r18 = r3.longValue()
            long r20 = r1.longValue()
            int r2 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x020c
            goto L_0x0212
        L_0x020c:
            r4 = r0
            r18 = r1
            r1 = r36
            goto L_0x023c
        L_0x0212:
            com.google.android.gms.measurement.internal.ex r2 = r98.mo32910h()
            android.util.Pair r2 = r2.mo33300a(r15, r3)
            if (r2 == 0) goto L_0x02ff
            java.lang.Object r4 = r2.first
            if (r4 != 0) goto L_0x0222
            goto L_0x02ff
        L_0x0222:
            java.lang.Object r0 = r2.first
            com.google.android.gms.internal.measurement.eb r0 = (com.google.android.gms.internal.measurement.C16647eb) r0
            java.lang.Object r1 = r2.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r98.mo32906f()
            java.lang.String r4 = "_eid"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C17099ej.m41625b(r0, r4)
            java.lang.Long r4 = (java.lang.Long) r4
            r18 = r4
            r4 = r0
        L_0x023c:
            r0 = 0
            long r19 = r1 - r16
            int r0 = (r19 > r27 ? 1 : (r19 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x0287
            com.google.android.gms.measurement.internal.ex r1 = r98.mo32910h()
            r1.mo32840c()
            com.google.android.gms.measurement.internal.r r0 = r1.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48453j
            java.lang.String r2 = "Clearing complex main event info. appId"
            r0.mo33377a(r2, r15)
            android.database.sqlite.SQLiteDatabase r0 = r1.mo33333w()     // Catch:{ SQLiteException -> 0x026c }
            java.lang.String r2 = "delete from main_event_params where app_id=?"
            r39 = r4
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x026a }
            r21 = 0
            r4[r21] = r15     // Catch:{ SQLiteException -> 0x0268 }
            r0.execSQL(r2, r4)     // Catch:{ SQLiteException -> 0x0268 }
            goto L_0x027d
        L_0x0268:
            r0 = move-exception
            goto L_0x0272
        L_0x026a:
            r0 = move-exception
            goto L_0x0270
        L_0x026c:
            r0 = move-exception
            r39 = r4
            r3 = 1
        L_0x0270:
            r21 = 0
        L_0x0272:
            com.google.android.gms.measurement.internal.r r1 = r1.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48445b
            java.lang.String r2 = "Error clearing complex main event"
            r1.mo33377a(r2, r0)
        L_0x027d:
            r13 = r5
            r41 = r6
            r26 = r38
            r1 = r39
            r24 = 1
            goto L_0x02a4
        L_0x0287:
            r39 = r4
            r4 = 1
            r21 = 0
            com.google.android.gms.measurement.internal.ex r1 = r98.mo32910h()
            r2 = r99
            r13 = r5
            r26 = r38
            r40 = r39
            r24 = 1
            r4 = r19
            r41 = r6
            r6 = r40
            r1.mo33316a(r2, r3, r4, r6)
            r1 = r40
        L_0x02a4:
            com.google.android.gms.internal.measurement.ec[] r0 = r1.f46787a
            int r0 = r0.length
            int r2 = r11.length
            int r0 = r0 + r2
            com.google.android.gms.internal.measurement.ec[] r0 = new com.google.android.gms.internal.measurement.C16648ec[r0]
            com.google.android.gms.internal.measurement.ec[] r2 = r1.f46787a
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L_0x02b0:
            if (r4 >= r3) goto L_0x02cb
            r6 = r2[r4]
            r98.mo32906f()
            r42 = r1
            java.lang.String r1 = r6.f46793a
            com.google.android.gms.internal.measurement.ec r1 = com.google.android.gms.measurement.internal.C17099ej.m41615a(r13, r1)
            if (r1 != 0) goto L_0x02c6
            int r1 = r5 + 1
            r0[r5] = r6
            r5 = r1
        L_0x02c6:
            int r4 = r4 + 1
            r1 = r42
            goto L_0x02b0
        L_0x02cb:
            r42 = r1
            if (r5 <= 0) goto L_0x02eb
            int r1 = r11.length
            r2 = 0
        L_0x02d1:
            if (r2 >= r1) goto L_0x02dd
            r3 = r11[r2]
            int r4 = r5 + 1
            r0[r5] = r3
            int r2 = r2 + 1
            r5 = r4
            goto L_0x02d1
        L_0x02dd:
            int r1 = r0.length
            if (r5 != r1) goto L_0x02e1
            goto L_0x02e7
        L_0x02e1:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r5)
            com.google.android.gms.internal.measurement.ec[] r0 = (com.google.android.gms.internal.measurement.C16648ec[]) r0
        L_0x02e7:
            r29 = r0
            r0 = r10
            goto L_0x02f9
        L_0x02eb:
            com.google.android.gms.measurement.internal.r r0 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48448e
            java.lang.String r1 = "No unique parameters in main event. eventName"
            r0.mo33377a(r1, r10)
            r0 = r10
            r29 = r11
        L_0x02f9:
            r25 = r18
            r36 = r19
            goto L_0x0379
        L_0x02ff:
            r41 = r6
            r26 = r38
            r24 = 1
            com.google.android.gms.measurement.internal.r r2 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48445b
            java.lang.String r4 = "Extra parameter without existing main event. eventName, eventId"
            r2.mo33378a(r4, r10, r3)
        L_0x0310:
            r31 = r8
            r65 = r9
            r79 = r12
            r14 = r30
            r77 = r33
            r78 = r34
            r80 = r35
            r2 = r36
            r72 = r41
            goto L_0x0760
        L_0x0324:
            r13 = r5
            r41 = r6
            r26 = r38
            r24 = 1
            if (r2 == 0) goto L_0x0372
            r98.mo32906f()
            java.lang.String r0 = "_epc"
            java.lang.Long r1 = java.lang.Long.valueOf(r27)
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C17099ej.m41625b(r13, r0)
            if (r0 != 0) goto L_0x033d
            r0 = r1
        L_0x033d:
            java.lang.Long r0 = (java.lang.Long) r0
            long r18 = r0.longValue()
            int r0 = (r18 > r27 ? 1 : (r18 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x0354
            com.google.android.gms.measurement.internal.r r0 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48448e
            java.lang.String r1 = "Complex event with zero extra param count. eventName"
            r0.mo33377a(r1, r10)
            r0 = r3
            goto L_0x0361
        L_0x0354:
            com.google.android.gms.measurement.internal.ex r1 = r98.mo32910h()
            r2 = r99
            r0 = r3
            r4 = r18
            r6 = r13
            r1.mo33316a(r2, r3, r4, r6)
        L_0x0361:
            r25 = r0
            r0 = r10
            r29 = r11
            r42 = r13
            r36 = r18
            goto L_0x0379
        L_0x036b:
            r26 = r4
            r13 = r5
            r41 = r6
            r24 = 1
        L_0x0372:
            r42 = r0
            r25 = r1
            r0 = r10
            r29 = r11
        L_0x0379:
            com.google.android.gms.measurement.internal.ex r1 = r98.mo32910h()
            java.lang.String r2 = r13.f46788b
            com.google.android.gms.measurement.internal.d r1 = r1.mo33301a(r15, r2)
            if (r1 != 0) goto L_0x03d5
            com.google.android.gms.measurement.internal.r r1 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48448e
            java.lang.String r2 = "Event aggregate wasn't created during raw event logging. appId, event"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C17133r.m41997a(r99)
            com.google.android.gms.measurement.internal.p r4 = r98.mo32851n()
            java.lang.String r4 = r4.mo33369a(r0)
            r1.mo33378a(r2, r3, r4)
            com.google.android.gms.measurement.internal.d r1 = new com.google.android.gms.measurement.internal.d
            java.lang.String r10 = r13.f46788b
            r2 = 1
            r4 = 1
            java.lang.Long r6 = r13.f46789c
            long r16 = r6.longValue()
            r18 = 0
            r6 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r31 = r8
            r11 = r33
            r8 = r1
            r44 = r9
            r43 = r34
            r9 = r99
            r45 = r35
            r48 = r11
            r47 = r12
            r46 = r30
            r11 = r2
            r2 = r13
            r3 = r14
            r13 = r4
            r5 = r15
            r15 = r16
            r17 = r18
            r19 = r6
            r8.<init>(r9, r10, r11, r13, r15, r17, r19, r20, r21, r22)
            goto L_0x0416
        L_0x03d5:
            r31 = r8
            r44 = r9
            r47 = r12
            r2 = r13
            r3 = r14
            r5 = r15
            r46 = r30
            r48 = r33
            r43 = r34
            r45 = r35
            com.google.android.gms.measurement.internal.d r4 = new com.google.android.gms.measurement.internal.d
            java.lang.String r6 = r1.f48147a
            java.lang.String r8 = r1.f48148b
            long r9 = r1.f48149c
            long r52 = r9 + r16
            long r9 = r1.f48150d
            long r54 = r9 + r16
            long r9 = r1.f48151e
            long r11 = r1.f48152f
            java.lang.Long r13 = r1.f48153g
            java.lang.Long r14 = r1.f48154h
            java.lang.Long r15 = r1.f48155i
            java.lang.Boolean r1 = r1.f48156j
            r49 = r4
            r50 = r6
            r51 = r8
            r56 = r9
            r58 = r11
            r60 = r13
            r61 = r14
            r62 = r15
            r63 = r1
            r49.<init>(r50, r51, r52, r54, r56, r58, r60, r61, r62, r63)
            r1 = r4
        L_0x0416:
            com.google.android.gms.measurement.internal.ex r4 = r98.mo32910h()
            r4.mo33308a(r1)
            long r8 = r1.f48149c
            r10 = r44
            java.lang.Object r1 = r10.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L_0x043b
            com.google.android.gms.measurement.internal.ex r1 = r98.mo32910h()
            java.util.Map r1 = r1.mo33328f(r5, r0)
            if (r1 != 0) goto L_0x0438
            android.support.v4.f.a r1 = new android.support.v4.f.a
            r1.<init>()
        L_0x0438:
            r10.put(r0, r1)
        L_0x043b:
            r11 = r1
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r12 = r1.iterator()
        L_0x0444:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x074c
            java.lang.Object r1 = r12.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r13 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r14 = r46
            boolean r1 = r14.contains(r1)
            if (r1 == 0) goto L_0x0472
            com.google.android.gms.measurement.internal.r r1 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j
            java.lang.String r4 = "Skipping failed audience ID"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r1.mo33377a(r4, r6)
            r46 = r14
            goto L_0x0444
        L_0x0472:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r15 = r47
            java.lang.Object r1 = r15.get(r1)
            com.google.android.gms.internal.measurement.dz r1 = (com.google.android.gms.internal.measurement.C16644dz) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r6 = r45
            java.lang.Object r4 = r6.get(r4)
            java.util.BitSet r4 = (java.util.BitSet) r4
            r64 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r65 = r10
            r10 = r43
            java.lang.Object r2 = r10.get(r2)
            java.util.BitSet r2 = (java.util.BitSet) r2
            if (r23 == 0) goto L_0x04bb
            r66 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r67 = r12
            r12 = r48
            java.lang.Object r2 = r12.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            r68 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r7 = r41
            java.lang.Object r2 = r7.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            goto L_0x04c6
        L_0x04bb:
            r66 = r2
            r67 = r12
            r7 = r41
            r12 = r48
            r2 = 0
            r68 = 0
        L_0x04c6:
            if (r1 != 0) goto L_0x0525
            com.google.android.gms.internal.measurement.dz r1 = new com.google.android.gms.internal.measurement.dz
            r1.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r15.put(r4, r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r24)
            r1.f46778d = r4
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r6.put(r1, r4)
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            r69 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r10.put(r2, r1)
            if (r23 == 0) goto L_0x051a
            android.support.v4.f.a r2 = new android.support.v4.f.a
            r2.<init>()
            r70 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            r12.put(r1, r2)
            android.support.v4.f.a r1 = new android.support.v4.f.a
            r1.<init>()
            r71 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r7.put(r2, r1)
            r72 = r7
            r2 = r70
            r73 = r71
            r7 = r1
            goto L_0x052f
        L_0x051a:
            r70 = r1
            r72 = r7
            r73 = r68
            r7 = r69
            r2 = r70
            goto L_0x052f
        L_0x0525:
            r69 = r2
            r72 = r7
            r2 = r66
            r73 = r68
            r7 = r69
        L_0x052f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r11.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r16 = r1.iterator()
        L_0x053d:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0730
            java.lang.Object r1 = r16.next()
            com.google.android.gms.internal.measurement.dr r1 = (com.google.android.gms.internal.measurement.C16636dr) r1
            r74 = r2
            com.google.android.gms.measurement.internal.r r2 = r98.mo32854q()
            r75 = r11
            r11 = 2
            boolean r2 = r2.mo33374a(r11)
            if (r2 == 0) goto L_0x058b
            com.google.android.gms.measurement.internal.r r2 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48453j
            java.lang.String r11 = "Evaluating filter. audience, filter, event"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r5 = r1.f46731a
            r76 = r6
            com.google.android.gms.measurement.internal.p r6 = r98.mo32851n()
            r77 = r12
            java.lang.String r12 = r1.f46732b
            java.lang.String r6 = r6.mo33369a(r12)
            r2.mo33379a(r11, r3, r5, r6)
            com.google.android.gms.measurement.internal.r r2 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48453j
            java.lang.String r3 = "Filter definition"
            com.google.android.gms.measurement.internal.ej r5 = r98.mo32906f()
            java.lang.String r5 = r5.mo33123a(r1)
            r2.mo33377a(r3, r5)
            goto L_0x058f
        L_0x058b:
            r76 = r6
            r77 = r12
        L_0x058f:
            java.lang.Integer r2 = r1.f46731a
            if (r2 == 0) goto L_0x06f3
            java.lang.Integer r2 = r1.f46731a
            int r2 = r2.intValue()
            r11 = 256(0x100, float:3.59E-43)
            if (r2 <= r11) goto L_0x059f
            goto L_0x06f3
        L_0x059f:
            if (r23 == 0) goto L_0x0684
            if (r1 == 0) goto L_0x05b1
            java.lang.Boolean r2 = r1.f46735e
            if (r2 == 0) goto L_0x05b1
            java.lang.Boolean r2 = r1.f46735e
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x05b1
            r12 = 1
            goto L_0x05b2
        L_0x05b1:
            r12 = 0
        L_0x05b2:
            if (r1 == 0) goto L_0x05c3
            java.lang.Boolean r2 = r1.f46736f
            if (r2 == 0) goto L_0x05c3
            java.lang.Boolean r2 = r1.f46736f
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x05c3
            r17 = 1
            goto L_0x05c5
        L_0x05c3:
            r17 = 0
        L_0x05c5:
            java.lang.Integer r2 = r1.f46731a
            int r2 = r2.intValue()
            boolean r2 = r4.get(r2)
            if (r2 == 0) goto L_0x05f0
            if (r12 != 0) goto L_0x05f0
            if (r17 != 0) goto L_0x05f0
            com.google.android.gms.measurement.internal.r r2 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48453j
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r1 = r1.f46731a
            r2.mo33378a(r3, r5, r1)
            r2 = r74
            r11 = r75
            r6 = r76
            r12 = r77
            goto L_0x072a
        L_0x05f0:
            r5 = r1
            r6 = r73
            r1 = r98
            r3 = r64
            r11 = r74
            r2 = r5
            r78 = r10
            r79 = r15
            r10 = r101
            r15 = r3
            r3 = r0
            r10 = r4
            r4 = r29
            r81 = r0
            r0 = r5
            r82 = r6
            r80 = r76
            r5 = r8
            java.lang.Boolean r1 = r1.m41757a(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.r r2 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48453j
            java.lang.String r3 = "Event filter result"
            if (r1 != 0) goto L_0x061e
            java.lang.String r4 = "null"
            goto L_0x061f
        L_0x061e:
            r4 = r1
        L_0x061f:
            r2.mo33377a(r3, r4)
            if (r1 != 0) goto L_0x063f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r14.add(r0)
        L_0x062b:
            r4 = r10
            r2 = r11
            r64 = r15
            r11 = r75
            r12 = r77
            r10 = r78
            r15 = r79
            r6 = r80
            r0 = r81
            r73 = r82
            goto L_0x072a
        L_0x063f:
            java.lang.Integer r2 = r0.f46731a
            int r2 = r2.intValue()
            r11.set(r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x062b
            java.lang.Integer r1 = r0.f46731a
            int r1 = r1.intValue()
            r10.set(r1)
            if (r12 != 0) goto L_0x065b
            if (r17 == 0) goto L_0x062b
        L_0x065b:
            java.lang.Long r1 = r15.f46789c
            if (r1 == 0) goto L_0x062b
            if (r17 == 0) goto L_0x0671
            java.lang.Integer r0 = r0.f46731a
            int r0 = r0.intValue()
            java.lang.Long r1 = r15.f46789c
            long r1 = r1.longValue()
            m41766b(r7, r0, r1)
            goto L_0x062b
        L_0x0671:
            java.lang.Integer r0 = r0.f46731a
            int r0 = r0.intValue()
            java.lang.Long r1 = r15.f46789c
            long r1 = r1.longValue()
            r12 = r82
            m41764a(r12, r0, r1)
            goto L_0x0718
        L_0x0684:
            r81 = r0
            r0 = r1
            r78 = r10
            r79 = r15
            r15 = r64
            r12 = r73
            r11 = r74
            r80 = r76
            r10 = r4
            java.lang.Integer r1 = r0.f46731a
            int r1 = r1.intValue()
            boolean r1 = r10.get(r1)
            if (r1 == 0) goto L_0x06b3
            com.google.android.gms.measurement.internal.r r1 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j
            java.lang.String r2 = "Event filter already evaluated true. audience ID, filter ID"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r0 = r0.f46731a
            r1.mo33378a(r2, r3, r0)
            goto L_0x0718
        L_0x06b3:
            r1 = r98
            r2 = r0
            r3 = r81
            r4 = r29
            r5 = r8
            java.lang.Boolean r1 = r1.m41757a(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.r r2 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48453j
            java.lang.String r3 = "Event filter result"
            if (r1 != 0) goto L_0x06cc
            java.lang.String r4 = "null"
            goto L_0x06cd
        L_0x06cc:
            r4 = r1
        L_0x06cd:
            r2.mo33377a(r3, r4)
            if (r1 != 0) goto L_0x06da
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r14.add(r0)
            goto L_0x0718
        L_0x06da:
            java.lang.Integer r2 = r0.f46731a
            int r2 = r2.intValue()
            r11.set(r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0718
            java.lang.Integer r0 = r0.f46731a
            int r0 = r0.intValue()
            r10.set(r0)
            goto L_0x0718
        L_0x06f3:
            r81 = r0
            r0 = r1
            r78 = r10
            r79 = r15
            r15 = r64
            r12 = r73
            r11 = r74
            r80 = r76
            r10 = r4
            com.google.android.gms.measurement.internal.r r1 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48448e
            java.lang.String r2 = "Invalid event filter ID. appId, id"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C17133r.m41997a(r99)
            java.lang.Integer r0 = r0.f46731a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.mo33378a(r2, r3, r0)
        L_0x0718:
            r4 = r10
            r2 = r11
            r73 = r12
            r64 = r15
            r11 = r75
            r12 = r77
            r10 = r78
            r15 = r79
            r6 = r80
            r0 = r81
        L_0x072a:
            r3 = r101
            r5 = r99
            goto L_0x053d
        L_0x0730:
            r79 = r15
            r45 = r6
            r43 = r10
            r48 = r12
            r46 = r14
            r2 = r64
            r10 = r65
            r12 = r67
            r41 = r72
            r47 = r79
            r3 = r101
            r5 = r99
            r7 = r98
            goto L_0x0444
        L_0x074c:
            r65 = r10
            r72 = r41
            r78 = r43
            r80 = r45
            r14 = r46
            r79 = r47
            r77 = r48
            r1 = r25
            r2 = r36
            r0 = r42
        L_0x0760:
            int r4 = r26 + 1
            r13 = r100
            r30 = r14
            r8 = r31
            r9 = r65
            r6 = r72
            r33 = r77
            r34 = r78
            r12 = r79
            r35 = r80
            r7 = r98
            r14 = r101
            r15 = r99
            goto L_0x019a
        L_0x077c:
            r72 = r6
            r79 = r12
            r14 = r30
            r77 = r33
            r78 = r34
            r80 = r35
            r24 = 1
            r1 = r101
            if (r1 == 0) goto L_0x0a9e
            android.support.v4.f.a r0 = new android.support.v4.f.a
            r0.<init>()
            int r2 = r1.length
            r3 = 0
        L_0x0795:
            if (r3 >= r2) goto L_0x0a9e
            r4 = r1[r3]
            java.lang.String r5 = r4.f46850b
            java.lang.Object r5 = r0.get(r5)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x07bc
            com.google.android.gms.measurement.internal.ex r5 = r98.mo32910h()
            java.lang.String r6 = r4.f46850b
            r7 = r99
            java.util.Map r5 = r5.mo33329g(r7, r6)
            if (r5 != 0) goto L_0x07b6
            android.support.v4.f.a r5 = new android.support.v4.f.a
            r5.<init>()
        L_0x07b6:
            java.lang.String r6 = r4.f46850b
            r0.put(r6, r5)
            goto L_0x07be
        L_0x07bc:
            r7 = r99
        L_0x07be:
            java.util.Set r6 = r5.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x07c6:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a88
            java.lang.Object r8 = r6.next()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            boolean r9 = r14.contains(r9)
            if (r9 == 0) goto L_0x07f0
            com.google.android.gms.measurement.internal.r r9 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r9 = r9.f48453j
            java.lang.String r10 = "Skipping failed audience ID"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.mo33377a(r10, r8)
            goto L_0x07c6
        L_0x07f0:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10 = r79
            java.lang.Object r9 = r10.get(r9)
            com.google.android.gms.internal.measurement.dz r9 = (com.google.android.gms.internal.measurement.C16644dz) r9
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r12 = r80
            java.lang.Object r11 = r12.get(r11)
            java.util.BitSet r11 = (java.util.BitSet) r11
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r15 = r78
            java.lang.Object r13 = r15.get(r13)
            java.util.BitSet r13 = (java.util.BitSet) r13
            if (r23 == 0) goto L_0x0835
            r83 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1 = r77
            java.lang.Object r0 = r1.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            r84 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r85 = r2
            r2 = r72
            java.lang.Object r0 = r2.get(r0)
            java.util.Map r0 = (java.util.Map) r0
            goto L_0x0840
        L_0x0835:
            r83 = r0
            r85 = r2
            r2 = r72
            r1 = r77
            r0 = 0
            r84 = 0
        L_0x0840:
            if (r9 != 0) goto L_0x088d
            com.google.android.gms.internal.measurement.dz r9 = new com.google.android.gms.internal.measurement.dz
            r9.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r10.put(r11, r9)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r24)
            r9.f46778d = r11
            java.util.BitSet r11 = new java.util.BitSet
            r11.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r12.put(r9, r11)
            java.util.BitSet r13 = new java.util.BitSet
            r13.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r15.put(r9, r13)
            if (r23 == 0) goto L_0x088d
            android.support.v4.f.a r0 = new android.support.v4.f.a
            r0.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r1.put(r9, r0)
            android.support.v4.f.a r9 = new android.support.v4.f.a
            r9.<init>()
            r86 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.put(r0, r9)
            r87 = r2
            r0 = r86
            goto L_0x0892
        L_0x088d:
            r9 = r0
            r87 = r2
            r0 = r84
        L_0x0892:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r5.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x08a0:
            boolean r16 = r2.hasNext()
            if (r16 == 0) goto L_0x0a72
            java.lang.Object r16 = r2.next()
            r88 = r2
            r2 = r16
            com.google.android.gms.internal.measurement.du r2 = (com.google.android.gms.internal.measurement.C16639du) r2
            r89 = r5
            com.google.android.gms.measurement.internal.r r5 = r98.mo32854q()
            r90 = r6
            r6 = 2
            boolean r5 = r5.mo33374a(r6)
            if (r5 == 0) goto L_0x08f4
            com.google.android.gms.measurement.internal.r r5 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r5 = r5.f48453j
            java.lang.String r6 = "Evaluating filter. audience, filter, property"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r91 = r1
            java.lang.Integer r1 = r2.f46749a
            r92 = r15
            com.google.android.gms.measurement.internal.p r15 = r98.mo32851n()
            r93 = r10
            java.lang.String r10 = r2.f46750b
            java.lang.String r10 = r15.mo33371c(r10)
            r5.mo33379a(r6, r7, r1, r10)
            com.google.android.gms.measurement.internal.r r1 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j
            java.lang.String r5 = "Filter definition"
            com.google.android.gms.measurement.internal.ej r6 = r98.mo32906f()
            java.lang.String r6 = r6.mo33124a(r2)
            r1.mo33377a(r5, r6)
            goto L_0x08fa
        L_0x08f4:
            r91 = r1
            r93 = r10
            r92 = r15
        L_0x08fa:
            java.lang.Integer r1 = r2.f46749a
            if (r1 == 0) goto L_0x0a3d
            java.lang.Integer r1 = r2.f46749a
            int r1 = r1.intValue()
            r5 = 256(0x100, float:3.59E-43)
            if (r1 <= r5) goto L_0x090a
            goto L_0x0a3d
        L_0x090a:
            if (r23 == 0) goto L_0x09ce
            if (r2 == 0) goto L_0x091c
            java.lang.Boolean r1 = r2.f46752d
            if (r1 == 0) goto L_0x091c
            java.lang.Boolean r1 = r2.f46752d
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x091c
            r1 = 1
            goto L_0x091d
        L_0x091c:
            r1 = 0
        L_0x091d:
            if (r2 == 0) goto L_0x092d
            java.lang.Boolean r6 = r2.f46753e
            if (r6 == 0) goto L_0x092d
            java.lang.Boolean r6 = r2.f46753e
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x092d
            r6 = 1
            goto L_0x092e
        L_0x092d:
            r6 = 0
        L_0x092e:
            java.lang.Integer r7 = r2.f46749a
            int r7 = r7.intValue()
            boolean r7 = r11.get(r7)
            if (r7 == 0) goto L_0x095d
            if (r1 != 0) goto L_0x095d
            if (r6 != 0) goto L_0x095d
            com.google.android.gms.measurement.internal.r r1 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j
            java.lang.String r6 = "Property filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r2 = r2.f46749a
            r1.mo33378a(r6, r7, r2)
            r2 = r88
            r5 = r89
            r6 = r90
            r1 = r91
            r15 = r92
            r10 = r93
            goto L_0x0a01
        L_0x095d:
            r10 = r87
            r7 = r98
            java.lang.Boolean r15 = r7.m41758a(r2, r4)
            com.google.android.gms.measurement.internal.r r5 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r5 = r5.f48453j
            r94 = r10
            java.lang.String r10 = "Property filter result"
            if (r15 != 0) goto L_0x0978
            java.lang.String r16 = "null"
            r95 = r12
            r12 = r16
            goto L_0x097b
        L_0x0978:
            r95 = r12
            r12 = r15
        L_0x097b:
            r5.mo33377a(r10, r12)
            if (r15 != 0) goto L_0x0988
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r14.add(r1)
            goto L_0x09f1
        L_0x0988:
            java.lang.Integer r5 = r2.f46749a
            int r5 = r5.intValue()
            r13.set(r5)
            java.lang.Integer r5 = r2.f46749a
            int r5 = r5.intValue()
            boolean r10 = r15.booleanValue()
            r11.set(r5, r10)
            boolean r5 = r15.booleanValue()
            if (r5 == 0) goto L_0x09f1
            if (r1 != 0) goto L_0x09a8
            if (r6 == 0) goto L_0x09f1
        L_0x09a8:
            java.lang.Long r1 = r4.f46849a
            if (r1 == 0) goto L_0x09f1
            if (r6 == 0) goto L_0x09be
            java.lang.Integer r1 = r2.f46749a
            int r1 = r1.intValue()
            java.lang.Long r2 = r4.f46849a
            long r5 = r2.longValue()
            m41766b(r9, r1, r5)
            goto L_0x09f1
        L_0x09be:
            java.lang.Integer r1 = r2.f46749a
            int r1 = r1.intValue()
            java.lang.Long r2 = r4.f46849a
            long r5 = r2.longValue()
            m41764a(r0, r1, r5)
            goto L_0x09f1
        L_0x09ce:
            r95 = r12
            r94 = r87
            r7 = r98
            java.lang.Integer r1 = r2.f46749a
            int r1 = r1.intValue()
            boolean r1 = r11.get(r1)
            if (r1 == 0) goto L_0x0a05
            com.google.android.gms.measurement.internal.r r1 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r1 = r1.f48453j
            java.lang.String r5 = "Property filter already evaluated true. audience ID, filter ID"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r2 = r2.f46749a
            r1.mo33378a(r5, r6, r2)
        L_0x09f1:
            r2 = r88
            r5 = r89
            r6 = r90
            r1 = r91
            r15 = r92
            r10 = r93
            r87 = r94
            r12 = r95
        L_0x0a01:
            r7 = r99
            goto L_0x08a0
        L_0x0a05:
            java.lang.Boolean r1 = r7.m41758a(r2, r4)
            com.google.android.gms.measurement.internal.r r5 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r5 = r5.f48453j
            java.lang.String r6 = "Property filter result"
            if (r1 != 0) goto L_0x0a16
            java.lang.String r10 = "null"
            goto L_0x0a17
        L_0x0a16:
            r10 = r1
        L_0x0a17:
            r5.mo33377a(r6, r10)
            if (r1 != 0) goto L_0x0a24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r14.add(r1)
            goto L_0x09f1
        L_0x0a24:
            java.lang.Integer r5 = r2.f46749a
            int r5 = r5.intValue()
            r13.set(r5)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x09f1
            java.lang.Integer r1 = r2.f46749a
            int r1 = r1.intValue()
            r11.set(r1)
            goto L_0x09f1
        L_0x0a3d:
            r95 = r12
            r94 = r87
            r7 = r98
            com.google.android.gms.measurement.internal.r r0 = r98.mo32854q()
            com.google.android.gms.measurement.internal.t r0 = r0.f48448e
            java.lang.String r1 = "Invalid property filter ID. appId, id"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C17133r.m41997a(r99)
            java.lang.Integer r2 = r2.f46749a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.mo33378a(r1, r5, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r14.add(r0)
            r0 = r83
            r2 = r85
            r5 = r89
            r6 = r90
            r77 = r91
            r78 = r92
            r79 = r93
            r72 = r94
            r80 = r95
            goto L_0x0a82
        L_0x0a72:
            r7 = r98
            r77 = r1
            r79 = r10
            r80 = r12
            r78 = r15
            r0 = r83
            r2 = r85
            r72 = r87
        L_0x0a82:
            r1 = r101
            r7 = r99
            goto L_0x07c6
        L_0x0a88:
            r83 = r0
            r85 = r2
            r94 = r72
            r91 = r77
            r92 = r78
            r93 = r79
            r95 = r80
            r7 = r98
            int r3 = r3 + 1
            r1 = r101
            goto L_0x0795
        L_0x0a9e:
            r94 = r72
            r91 = r77
            r92 = r78
            r93 = r79
            r95 = r80
            r7 = r98
            int r0 = r95.size()
            com.google.android.gms.internal.measurement.dz[] r1 = new com.google.android.gms.internal.measurement.C16644dz[r0]
            java.util.Set r0 = r95.keySet()
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
        L_0x0ab9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0c64
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r4 = r14.contains(r4)
            if (r4 != 0) goto L_0x0c60
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5 = r93
            java.lang.Object r4 = r5.get(r4)
            com.google.android.gms.internal.measurement.dz r4 = (com.google.android.gms.internal.measurement.C16644dz) r4
            if (r4 != 0) goto L_0x0ae6
            com.google.android.gms.internal.measurement.dz r4 = new com.google.android.gms.internal.measurement.dz
            r4.<init>()
        L_0x0ae6:
            int r6 = r3 + 1
            r1[r3] = r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4.f46775a = r3
            com.google.android.gms.internal.measurement.ef r3 = new com.google.android.gms.internal.measurement.ef
            r3.<init>()
            r4.f46776b = r3
            com.google.android.gms.internal.measurement.ef r3 = r4.f46776b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = r95
            java.lang.Object r8 = r9.get(r8)
            java.util.BitSet r8 = (java.util.BitSet) r8
            long[] r8 = com.google.android.gms.measurement.internal.C17099ej.m41623a(r8)
            r3.f46842b = r8
            com.google.android.gms.internal.measurement.ef r3 = r4.f46776b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r10 = r92
            java.lang.Object r8 = r10.get(r8)
            java.util.BitSet r8 = (java.util.BitSet) r8
            long[] r8 = com.google.android.gms.measurement.internal.C17099ej.m41623a(r8)
            r3.f46841a = r8
            if (r23 == 0) goto L_0x0bbf
            com.google.android.gms.internal.measurement.ef r3 = r4.f46776b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r11 = r91
            java.lang.Object r8 = r11.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            com.google.android.gms.internal.measurement.ea[] r8 = m41765a(r8)
            r3.f46843c = r8
            com.google.android.gms.internal.measurement.ef r3 = r4.f46776b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r12 = r94
            java.lang.Object r8 = r12.get(r8)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 != 0) goto L_0x0b4f
            r13 = 0
            com.google.android.gms.internal.measurement.eg[] r8 = new com.google.android.gms.internal.measurement.C16652eg[r13]
            r96 = r2
            r97 = r5
            r15 = r8
            goto L_0x0bbc
        L_0x0b4f:
            r13 = 0
            int r15 = r8.size()
            com.google.android.gms.internal.measurement.eg[] r15 = new com.google.android.gms.internal.measurement.C16652eg[r15]
            java.util.Set r16 = r8.keySet()
            java.util.Iterator r16 = r16.iterator()
            r17 = 0
        L_0x0b60:
            boolean r18 = r16.hasNext()
            if (r18 == 0) goto L_0x0bb8
            java.lang.Object r18 = r16.next()
            r13 = r18
            java.lang.Integer r13 = (java.lang.Integer) r13
            r96 = r2
            com.google.android.gms.internal.measurement.eg r2 = new com.google.android.gms.internal.measurement.eg
            r2.<init>()
            r2.f46846a = r13
            java.lang.Object r13 = r8.get(r13)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x0baa
            java.util.Collections.sort(r13)
            r97 = r5
            int r5 = r13.size()
            long[] r5 = new long[r5]
            java.util.Iterator r13 = r13.iterator()
            r18 = 0
        L_0x0b90:
            boolean r19 = r13.hasNext()
            if (r19 == 0) goto L_0x0ba7
            java.lang.Object r19 = r13.next()
            java.lang.Long r19 = (java.lang.Long) r19
            int r20 = r18 + 1
            long r21 = r19.longValue()
            r5[r18] = r21
            r18 = r20
            goto L_0x0b90
        L_0x0ba7:
            r2.f46847b = r5
            goto L_0x0bac
        L_0x0baa:
            r97 = r5
        L_0x0bac:
            int r5 = r17 + 1
            r15[r17] = r2
            r17 = r5
            r2 = r96
            r5 = r97
            r13 = 0
            goto L_0x0b60
        L_0x0bb8:
            r96 = r2
            r97 = r5
        L_0x0bbc:
            r3.f46844d = r15
            goto L_0x0bc7
        L_0x0bbf:
            r96 = r2
            r97 = r5
            r11 = r91
            r12 = r94
        L_0x0bc7:
            com.google.android.gms.measurement.internal.ex r2 = r98.mo32910h()
            com.google.android.gms.internal.measurement.ef r3 = r4.f46776b
            r2.mo33089j()
            r2.mo32840c()
            com.google.android.gms.common.internal.C15464q.m32125a(r99)
            com.google.android.gms.common.internal.C15464q.m32123a(r3)
            int r4 = r3.mo32479e()     // Catch:{ IOException -> 0x0c3d }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x0c3d }
            int r5 = r4.length     // Catch:{ IOException -> 0x0c3d }
            r8 = 0
            com.google.android.gms.internal.measurement.ks r5 = com.google.android.gms.internal.measurement.C16841ks.m40859a(r4, r8, r5)     // Catch:{ IOException -> 0x0c3b }
            r3.mo31924a(r5)     // Catch:{ IOException -> 0x0c3b }
            r5.mo32439a()     // Catch:{ IOException -> 0x0c3b }
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r5 = "app_id"
            r13 = r99
            r3.put(r5, r13)
            java.lang.String r5 = "audience_id"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r5, r0)
            java.lang.String r0 = "current_results"
            r3.put(r0, r4)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo33333w()     // Catch:{ SQLiteException -> 0x0c29 }
            java.lang.String r4 = "audience_filter_values"
            r5 = 5
            r15 = 0
            long r3 = r0.insertWithOnConflict(r4, r15, r3, r5)     // Catch:{ SQLiteException -> 0x0c27 }
            r16 = -1
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0c51
            com.google.android.gms.measurement.internal.r r0 = r2.mo32854q()     // Catch:{ SQLiteException -> 0x0c27 }
            com.google.android.gms.measurement.internal.t r0 = r0.f48445b     // Catch:{ SQLiteException -> 0x0c27 }
            java.lang.String r3 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C17133r.m41997a(r99)     // Catch:{ SQLiteException -> 0x0c27 }
            r0.mo33377a(r3, r4)     // Catch:{ SQLiteException -> 0x0c27 }
            goto L_0x0c51
        L_0x0c27:
            r0 = move-exception
            goto L_0x0c2b
        L_0x0c29:
            r0 = move-exception
            r15 = 0
        L_0x0c2b:
            com.google.android.gms.measurement.internal.r r2 = r2.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48445b
            java.lang.String r3 = "Error storing filter results. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C17133r.m41997a(r99)
            r2.mo33378a(r3, r4, r0)
            goto L_0x0c51
        L_0x0c3b:
            r0 = move-exception
            goto L_0x0c3f
        L_0x0c3d:
            r0 = move-exception
            r8 = 0
        L_0x0c3f:
            r13 = r99
            r15 = 0
            com.google.android.gms.measurement.internal.r r2 = r2.mo32854q()
            com.google.android.gms.measurement.internal.t r2 = r2.f48445b
            java.lang.String r3 = "Configuration loss. Failed to serialize filter results. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C17133r.m41997a(r99)
            r2.mo33378a(r3, r4, r0)
        L_0x0c51:
            r3 = r6
            r95 = r9
            r92 = r10
            r91 = r11
            r94 = r12
            r2 = r96
            r93 = r97
            goto L_0x0ab9
        L_0x0c60:
            r13 = r99
            goto L_0x0ab9
        L_0x0c64:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)
            com.google.android.gms.internal.measurement.dz[] r0 = (com.google.android.gms.internal.measurement.C16644dz[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17107er.mo33269a(java.lang.String, com.google.android.gms.internal.measurement.eb[], com.google.android.gms.internal.measurement.eh[]):com.google.android.gms.internal.measurement.dz[]");
    }

    /* renamed from: a */
    private final Boolean m41757a(C16636dr drVar, String str, C16648ec[] ecVarArr, long j) {
        C16637ds[] dsVarArr;
        C16637ds[] dsVarArr2;
        Boolean bool;
        if (drVar.f46734d != null) {
            Boolean a = m41756a(j, drVar.f46734d);
            if (a == null) {
                return null;
            }
            if (!a.booleanValue()) {
                return Boolean.valueOf(false);
            }
        }
        HashSet hashSet = new HashSet();
        for (C16637ds dsVar : drVar.f46733c) {
            if (TextUtils.isEmpty(dsVar.f46742d)) {
                mo32854q().f48448e.mo33377a("null or empty param name in filter. event", mo32851n().mo33369a(str));
                return null;
            }
            hashSet.add(dsVar.f46742d);
        }
        C0777a aVar = new C0777a();
        for (C16648ec ecVar : ecVarArr) {
            if (hashSet.contains(ecVar.f46793a)) {
                if (ecVar.f46795c != null) {
                    aVar.put(ecVar.f46793a, ecVar.f46795c);
                } else if (ecVar.f46796d != null) {
                    aVar.put(ecVar.f46793a, ecVar.f46796d);
                } else if (ecVar.f46794b != null) {
                    aVar.put(ecVar.f46793a, ecVar.f46794b);
                } else {
                    mo32854q().f48448e.mo33378a("Unknown value for param. event, param", mo32851n().mo33369a(str), mo32851n().mo33370b(ecVar.f46793a));
                    return null;
                }
            }
        }
        for (C16637ds dsVar2 : drVar.f46733c) {
            boolean equals = Boolean.TRUE.equals(dsVar2.f46741c);
            String str2 = dsVar2.f46742d;
            if (TextUtils.isEmpty(str2)) {
                mo32854q().f48448e.mo33377a("Event has empty param name. event", mo32851n().mo33369a(str));
                return null;
            }
            Object obj = aVar.get(str2);
            if (obj instanceof Long) {
                if (dsVar2.f46740b == null) {
                    mo32854q().f48448e.mo33378a("No number filter for long param. event, param", mo32851n().mo33369a(str), mo32851n().mo33370b(str2));
                    return null;
                }
                Boolean a2 = m41756a(((Long) obj).longValue(), dsVar2.f46740b);
                if (a2 == null) {
                    return null;
                }
                if ((true ^ a2.booleanValue()) ^ equals) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof Double) {
                if (dsVar2.f46740b == null) {
                    mo32854q().f48448e.mo33378a("No number filter for double param. event, param", mo32851n().mo33369a(str), mo32851n().mo33370b(str2));
                    return null;
                }
                Boolean a3 = m41755a(((Double) obj).doubleValue(), dsVar2.f46740b);
                if (a3 == null) {
                    return null;
                }
                if ((true ^ a3.booleanValue()) ^ equals) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof String) {
                if (dsVar2.f46739a != null) {
                    bool = m41762a((String) obj, dsVar2.f46739a);
                } else if (dsVar2.f46740b != null) {
                    String str3 = (String) obj;
                    if (C17099ej.m41621a(str3)) {
                        bool = m41761a(str3, dsVar2.f46740b);
                    } else {
                        mo32854q().f48448e.mo33378a("Invalid param value for number filter. event, param", mo32851n().mo33369a(str), mo32851n().mo33370b(str2));
                        return null;
                    }
                } else {
                    mo32854q().f48448e.mo33378a("No filter for String param. event, param", mo32851n().mo33369a(str), mo32851n().mo33370b(str2));
                    return null;
                }
                if (bool == null) {
                    return null;
                }
                if ((true ^ bool.booleanValue()) ^ equals) {
                    return Boolean.valueOf(false);
                }
            } else if (obj == null) {
                mo32854q().f48453j.mo33378a("Missing param for filter. event, param", mo32851n().mo33369a(str), mo32851n().mo33370b(str2));
                return Boolean.valueOf(false);
            } else {
                mo32854q().f48448e.mo33378a("Unknown param type. event, param", mo32851n().mo33369a(str), mo32851n().mo33370b(str2));
                return null;
            }
        }
        return Boolean.valueOf(true);
    }

    /* renamed from: a */
    private final Boolean m41758a(C16639du duVar, C16653eh ehVar) {
        C16637ds dsVar = duVar.f46751c;
        if (dsVar == null) {
            mo32854q().f48448e.mo33377a("Missing property filter. property", mo32851n().mo33371c(ehVar.f46850b));
            return null;
        }
        boolean equals = Boolean.TRUE.equals(dsVar.f46741c);
        if (ehVar.f46852d != null) {
            if (dsVar.f46740b != null) {
                return m41759a(m41756a(ehVar.f46852d.longValue(), dsVar.f46740b), equals);
            }
            mo32854q().f48448e.mo33377a("No number filter for long property. property", mo32851n().mo33371c(ehVar.f46850b));
            return null;
        } else if (ehVar.f46853e != null) {
            if (dsVar.f46740b != null) {
                return m41759a(m41755a(ehVar.f46853e.doubleValue(), dsVar.f46740b), equals);
            }
            mo32854q().f48448e.mo33377a("No number filter for double property. property", mo32851n().mo33371c(ehVar.f46850b));
            return null;
        } else if (ehVar.f46851c == null) {
            mo32854q().f48448e.mo33377a("User property has no value, property", mo32851n().mo33371c(ehVar.f46850b));
            return null;
        } else if (dsVar.f46739a != null) {
            return m41759a(m41762a(ehVar.f46851c, dsVar.f46739a), equals);
        } else {
            if (dsVar.f46740b == null) {
                mo32854q().f48448e.mo33377a("No string or number filter defined. property", mo32851n().mo33371c(ehVar.f46850b));
            } else if (C17099ej.m41621a(ehVar.f46851c)) {
                return m41759a(m41761a(ehVar.f46851c, dsVar.f46740b), equals);
            } else {
                mo32854q().f48448e.mo33378a("Invalid user property value for Numeric number filter. property, value", mo32851n().mo33371c(ehVar.f46850b), ehVar.f46851c);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static Boolean m41759a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() ^ z);
    }

    /* renamed from: a */
    private final Boolean m41762a(String str, C16640dv dvVar) {
        String str2;
        List list;
        C15464q.m32123a(dvVar);
        if (str == null || dvVar.f46754a == null || dvVar.f46754a.intValue() == 0) {
            return null;
        }
        if (dvVar.f46754a.intValue() == 6) {
            if (dvVar.f46757d == null || dvVar.f46757d.length == 0) {
                return null;
            }
        } else if (dvVar.f46755b == null) {
            return null;
        }
        int intValue = dvVar.f46754a.intValue();
        boolean z = dvVar.f46756c != null && dvVar.f46756c.booleanValue();
        if (z || intValue == 1 || intValue == 6) {
            str2 = dvVar.f46755b;
        } else {
            str2 = dvVar.f46755b.toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (dvVar.f46757d == null) {
            list = null;
        } else {
            String[] strArr = dvVar.f46757d;
            if (z) {
                list = Arrays.asList(strArr);
            } else {
                ArrayList arrayList = new ArrayList();
                for (String upperCase : strArr) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                list = arrayList;
            }
        }
        return m41760a(str, intValue, z, str3, list, intValue == 1 ? str3 : null);
    }

    /* renamed from: a */
    private final Boolean m41760a(String str, int i, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (i == 6) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 1) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i) {
            case 1:
                try {
                    return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    mo32854q().f48448e.mo33377a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* renamed from: a */
    private static Boolean m41756a(long j, C16638dt dtVar) {
        try {
            return m41763a(new BigDecimal(j), dtVar, (double) ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Boolean m41755a(double d, C16638dt dtVar) {
        try {
            return m41763a(new BigDecimal(d), dtVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Boolean m41761a(String str, C16638dt dtVar) {
        if (!C17099ej.m41621a(str)) {
            return null;
        }
        try {
            return m41763a(new BigDecimal(str), dtVar, (double) ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        if (r3 != null) goto L_0x0074;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m41763a(java.math.BigDecimal r7, com.google.android.gms.internal.measurement.C16638dt r8, double r9) {
        /*
            com.google.android.gms.common.internal.C15464q.m32123a(r8)
            java.lang.Integer r0 = r8.f46743a
            r1 = 0
            if (r0 == 0) goto L_0x00f0
            java.lang.Integer r0 = r8.f46743a
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0012
            goto L_0x00f0
        L_0x0012:
            java.lang.Integer r0 = r8.f46743a
            int r0 = r0.intValue()
            r2 = 4
            if (r0 != r2) goto L_0x0024
            java.lang.String r0 = r8.f46746d
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r8.f46747e
            if (r0 != 0) goto L_0x0029
        L_0x0023:
            return r1
        L_0x0024:
            java.lang.String r0 = r8.f46745c
            if (r0 != 0) goto L_0x0029
            return r1
        L_0x0029:
            java.lang.Integer r0 = r8.f46743a
            int r0 = r0.intValue()
            java.lang.Integer r3 = r8.f46743a
            int r3 = r3.intValue()
            if (r3 != r2) goto L_0x005b
            java.lang.String r3 = r8.f46746d
            boolean r3 = com.google.android.gms.measurement.internal.C17099ej.m41621a(r3)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = r8.f46747e
            boolean r3 = com.google.android.gms.measurement.internal.C17099ej.m41621a(r3)
            if (r3 != 0) goto L_0x0048
            goto L_0x005a
        L_0x0048:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r4 = r8.f46746d     // Catch:{ NumberFormatException -> 0x0059 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0059 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0059 }
            java.lang.String r8 = r8.f46747e     // Catch:{ NumberFormatException -> 0x0059 }
            r4.<init>(r8)     // Catch:{ NumberFormatException -> 0x0059 }
            r8 = r3
            r3 = r1
            goto L_0x006d
        L_0x0059:
            return r1
        L_0x005a:
            return r1
        L_0x005b:
            java.lang.String r3 = r8.f46745c
            boolean r3 = com.google.android.gms.measurement.internal.C17099ej.m41621a(r3)
            if (r3 != 0) goto L_0x0064
            return r1
        L_0x0064:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x00ef }
            java.lang.String r8 = r8.f46745c     // Catch:{ NumberFormatException -> 0x00ef }
            r3.<init>(r8)     // Catch:{ NumberFormatException -> 0x00ef }
            r8 = r1
            r4 = r8
        L_0x006d:
            if (r0 != r2) goto L_0x0072
            if (r8 != 0) goto L_0x0074
            return r1
        L_0x0072:
            if (r3 == 0) goto L_0x00ee
        L_0x0074:
            r2 = -1
            r5 = 0
            r6 = 1
            switch(r0) {
                case 1: goto L_0x00e2;
                case 2: goto L_0x00d6;
                case 3: goto L_0x008d;
                case 4: goto L_0x007b;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x00ee
        L_0x007b:
            int r8 = r7.compareTo(r8)
            if (r8 == r2) goto L_0x0088
            int r7 = r7.compareTo(r4)
            if (r7 == r6) goto L_0x0088
            r5 = 1
        L_0x0088:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x008d:
            r0 = 0
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x00ca
            java.math.BigDecimal r8 = new java.math.BigDecimal
            r8.<init>(r9)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r1 = 2
            r0.<init>(r1)
            java.math.BigDecimal r8 = r8.multiply(r0)
            java.math.BigDecimal r8 = r3.subtract(r8)
            int r8 = r7.compareTo(r8)
            if (r8 != r6) goto L_0x00c5
            java.math.BigDecimal r8 = new java.math.BigDecimal
            r8.<init>(r9)
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r1)
            java.math.BigDecimal r8 = r8.multiply(r9)
            java.math.BigDecimal r8 = r3.add(r8)
            int r7 = r7.compareTo(r8)
            if (r7 != r2) goto L_0x00c5
            r5 = 1
        L_0x00c5:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00ca:
            int r7 = r7.compareTo(r3)
            if (r7 != 0) goto L_0x00d1
            r5 = 1
        L_0x00d1:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00d6:
            int r7 = r7.compareTo(r3)
            if (r7 != r6) goto L_0x00dd
            r5 = 1
        L_0x00dd:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00e2:
            int r7 = r7.compareTo(r3)
            if (r7 != r2) goto L_0x00e9
            r5 = 1
        L_0x00e9:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        L_0x00ee:
            return r1
        L_0x00ef:
            return r1
        L_0x00f0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17107er.m41763a(java.math.BigDecimal, com.google.android.gms.internal.measurement.dt, double):java.lang.Boolean");
    }

    /* renamed from: a */
    private static C16646ea[] m41765a(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        int i = 0;
        C16646ea[] eaVarArr = new C16646ea[map.size()];
        for (Integer num : map.keySet()) {
            C16646ea eaVar = new C16646ea();
            eaVar.f46784a = num;
            eaVar.f46785b = (Long) map.get(num);
            int i2 = i + 1;
            eaVarArr[i] = eaVar;
            i = i2;
        }
        return eaVarArr;
    }

    /* renamed from: a */
    private static void m41764a(Map<Integer, Long> map, int i, long j) {
        Long l = (Long) map.get(Integer.valueOf(i));
        long j2 = j / 1000;
        if (l == null || j2 > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j2));
        }
    }

    /* renamed from: b */
    private static void m41766b(Map<Integer, List<Long>> map, int i, long j) {
        List list = (List) map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
            map.put(Integer.valueOf(i), list);
        }
        list.add(Long.valueOf(j / 1000));
    }
}
