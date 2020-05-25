package com.p683ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import com.ss.android.ugc.trill.R;
import java.util.Calendar;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ax */
public final class C45406ax {

    /* renamed from: a */
    public static final C45406ax f114792a = new C45406ax();

    private C45406ax() {
    }

    /* renamed from: a */
    private static String m98966a(Context context, Calendar calendar) {
        int i;
        C52711k.m112240b(calendar, "calendar");
        if (context != null) {
            switch (calendar.get(7)) {
                case 1:
                    i = R.string.fjo;
                    break;
                case 2:
                    i = R.string.fjm;
                    break;
                case 3:
                    i = R.string.fjq;
                    break;
                case 4:
                    i = R.string.fjr;
                    break;
                case 5:
                    i = R.string.fjp;
                    break;
                case 6:
                    i = R.string.fjl;
                    break;
                default:
                    i = R.string.fjn;
                    break;
            }
            String string = context.getString(i);
            if (string != null) {
                return string;
            }
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r5 == null) goto L_0x0026;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m98967b(android.content.Context r3, long r4) {
        /*
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.lang.String r1 = "this"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setTimeInMillis(r4)
            com.ss.android.ugc.aweme.language.I18nManagerService r4 = com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin()
            java.lang.String r5 = "ServiceManager.get().get…nagerService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.language.I18nManagerService r4 = (com.p683ss.android.ugc.aweme.language.I18nManagerService) r4
            java.util.Locale r4 = r4.getCountryLocale()
            if (r3 == 0) goto L_0x0026
            r5 = 2132541765(0x7f1c0145, float:2.0736616E38)
            java.lang.String r5 = r3.getString(r5)
            if (r5 != 0) goto L_0x0028
        L_0x0026:
            java.lang.String r5 = "MM-dd-yyyy"
        L_0x0028:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "calendar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r3 = m98966a(r3, r0)
            r1.append(r3)
            java.lang.String r3 = ", "
            r1.append(r3)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r3.<init>(r5, r4)
            java.util.Date r4 = r0.getTime()
            java.lang.String r3 = r3.format(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.util.C45406ax.m98967b(android.content.Context, long):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0094, code lost:
        if (r13 == null) goto L_0x009f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m98965a(android.content.Context r13, long r14) {
        /*
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.lang.String r1 = "this"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setTimeInMillis(r14)
            com.ss.android.ugc.aweme.language.I18nManagerService r14 = com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin()
            java.lang.String r15 = "ServiceManager.get().get…nagerService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r14, r15)
            com.ss.android.ugc.aweme.language.I18nManagerService r14 = (com.p683ss.android.ugc.aweme.language.I18nManagerService) r14
            java.util.Locale r14 = r14.getCountryLocale()
            if (r13 == 0) goto L_0x009f
            r15 = 2132541765(0x7f1c0145, float:2.0736616E38)
            java.lang.String r1 = r13.getString(r15)
            if (r1 == 0) goto L_0x009f
            java.lang.String r2 = "{"
            java.lang.String r3 = ""
            r4 = 0
            r5 = 4
            r6 = 0
            java.lang.String r7 = p2628d.p2650m.C52830p.m112401a(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "}"
            java.lang.String r9 = ""
            r10 = 0
            r11 = 4
            r12 = 0
            java.lang.String r13 = p2628d.p2650m.C52830p.m112401a(r7, r8, r9, r10, r11, r12)
            r15 = r13
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            java.lang.String r2 = "d"
            r3 = 0
            r5 = 6
            r1 = r15
            int r7 = p2628d.p2650m.C52830p.m112419a(r1, r2, r3, r4, r5, r6)
            java.lang.String r2 = "d"
            int r1 = p2628d.p2650m.C52830p.m112446b(r1, r2, r3, r4, r5, r6)
            if (r7 != 0) goto L_0x0065
            if (r13 == 0) goto L_0x005d
            r15 = 3
            java.lang.String r13 = r13.substring(r15)
            java.lang.String r15 = "(this as java.lang.String).substring(startIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r15)
            goto L_0x0094
        L_0x005d:
            d.u r13 = new d.u
            java.lang.String r14 = "null cannot be cast to non-null type java.lang.String"
            r13.<init>(r14)
            throw r13
        L_0x0065:
            int r2 = r13.length()
            int r2 = r2 + -1
            if (r1 != r2) goto L_0x0088
            int r15 = r13.length()
            int r15 = r15 + -4
            if (r13 == 0) goto L_0x0080
            r1 = 0
            java.lang.String r13 = r13.substring(r1, r15)
            java.lang.String r15 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r15)
            goto L_0x0094
        L_0x0080:
            d.u r13 = new d.u
            java.lang.String r14 = "null cannot be cast to non-null type java.lang.String"
            r13.<init>(r14)
            throw r13
        L_0x0088:
            int r1 = r1 + 2
            if (r13 == 0) goto L_0x0097
            java.lang.CharSequence r13 = p2628d.p2650m.C52830p.m112427a(r15, r7, r1)
            java.lang.String r13 = r13.toString()
        L_0x0094:
            if (r13 != 0) goto L_0x00a1
            goto L_0x009f
        L_0x0097:
            d.u r13 = new d.u
            java.lang.String r14 = "null cannot be cast to non-null type kotlin.CharSequence"
            r13.<init>(r14)
            throw r13
        L_0x009f:
            java.lang.String r13 = "MM-yyyy"
        L_0x00a1:
            java.text.SimpleDateFormat r15 = new java.text.SimpleDateFormat
            r15.<init>(r13, r14)
            java.lang.String r13 = "calendar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r13)
            java.util.Date r13 = r0.getTime()
            java.lang.String r13 = r15.format(r13)
            java.lang.String r14 = "SimpleDateFormat(formatS…le).format(calendar.time)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r13, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.util.C45406ax.m98965a(android.content.Context, long):java.lang.String");
    }
}
