package com.bytedance.android.livesdk.chatroom.p309e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p225d.C3836d;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.p325ui.C6155ep;
import com.bytedance.android.livesdk.chatroom.p325ui.C6227w;
import com.bytedance.android.livesdk.i18n.C7676b;
import com.bytedance.android.livesdk.widget.C8534c;
import com.bytedance.android.livesdk.widget.C8546g;
import com.bytedance.android.livesdkapi.message.C8848e;
import com.bytedance.android.livesdkapi.message.C8851g;
import com.bytedance.android.livesdkapi.message.C8852h;
import com.bytedance.android.livesdkapi.message.C8853i;
import com.bytedance.common.utility.C9432q;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.ss.android.ugc.trill.R;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.z */
public final class C5115z {

    /* renamed from: a */
    public static final Spannable f13664a = new SpannableString("");

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d2, code lost:
        if (r11.getTag().equals(r9) != false) goto L_0x00d6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11762a(java.lang.String r17, java.util.List<com.bytedance.android.livesdkapi.message.C8853i> r18, java.util.List<java.lang.String> r19, java.util.Map<java.lang.Integer, com.bytedance.android.livesdkapi.message.C8853i> r20) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            if (r0 == 0) goto L_0x0268
            if (r1 == 0) goto L_0x0268
            int r4 = r18.size()
            if (r4 != 0) goto L_0x0014
            goto L_0x0268
        L_0x0014:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r2)
            r4.add(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = -1
            r10 = -1
            r11 = -1
        L_0x002b:
            int r12 = r17.length()
            r13 = 1
            if (r7 >= r12) goto L_0x0242
            char r12 = r0.charAt(r7)
            r14 = 58
            r15 = 125(0x7d, float:1.75E-43)
            if (r12 == r14) goto L_0x021d
            r14 = 123(0x7b, float:1.72E-43)
            if (r12 == r14) goto L_0x01e8
            if (r12 == r15) goto L_0x0046
        L_0x0042:
            r6 = 125(0x7d, float:1.75E-43)
            goto L_0x0238
        L_0x0046:
            if (r9 == r6) goto L_0x0051
            java.lang.CharSequence r9 = r0.subSequence(r9, r7)
            java.lang.String r9 = r9.toString()
            goto L_0x0063
        L_0x0051:
            java.lang.String r9 = "string"
            java.lang.CharSequence r11 = r0.subSequence(r10, r7)
            java.lang.String r11 = r11.toString()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r11 = r11.intValue()
        L_0x0063:
            if (r11 == r6) goto L_0x01e7
            int r14 = r4.length()
            if (r14 <= 0) goto L_0x0072
            int r14 = r4.length()
            r4.delete(r5, r14)
        L_0x0072:
            if (r11 < 0) goto L_0x00d5
            int r6 = r18.size()
            if (r11 >= r6) goto L_0x00d5
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            if (r6 != 0) goto L_0x00d5
            if (r1 == 0) goto L_0x00d5
            int r6 = r18.size()
            if (r6 != 0) goto L_0x0089
            goto L_0x00d5
        L_0x0089:
            java.lang.Object r6 = r1.get(r11)
            com.bytedance.android.livesdkapi.message.i r6 = (com.bytedance.android.livesdkapi.message.C8853i) r6
            int r11 = r6.f24162a
            com.bytedance.android.livesdkapi.message.e r16 = com.bytedance.android.livesdkapi.message.C8848e.HEART
            int r14 = r16.getPieceType()
            if (r11 != r14) goto L_0x009c
            com.bytedance.android.livesdkapi.message.e r11 = com.bytedance.android.livesdkapi.message.C8848e.HEART
            goto L_0x00ca
        L_0x009c:
            com.bytedance.android.livesdkapi.message.e r14 = com.bytedance.android.livesdkapi.message.C8848e.USER
            int r14 = r14.getPieceType()
            if (r11 != r14) goto L_0x00a7
            com.bytedance.android.livesdkapi.message.e r11 = com.bytedance.android.livesdkapi.message.C8848e.USER
            goto L_0x00ca
        L_0x00a7:
            com.bytedance.android.livesdkapi.message.e r14 = com.bytedance.android.livesdkapi.message.C8848e.STRING
            int r14 = r14.getPieceType()
            if (r11 != r14) goto L_0x00b2
            com.bytedance.android.livesdkapi.message.e r11 = com.bytedance.android.livesdkapi.message.C8848e.STRING
            goto L_0x00ca
        L_0x00b2:
            com.bytedance.android.livesdkapi.message.e r14 = com.bytedance.android.livesdkapi.message.C8848e.GIFT
            int r14 = r14.getPieceType()
            if (r11 != r14) goto L_0x00bd
            com.bytedance.android.livesdkapi.message.e r11 = com.bytedance.android.livesdkapi.message.C8848e.GIFT
            goto L_0x00ca
        L_0x00bd:
            com.bytedance.android.livesdkapi.message.e r14 = com.bytedance.android.livesdkapi.message.C8848e.PATTERN_REF
            int r14 = r14.getPieceType()
            if (r11 != r14) goto L_0x00c8
            com.bytedance.android.livesdkapi.message.e r11 = com.bytedance.android.livesdkapi.message.C8848e.PATTERN_REF
            goto L_0x00ca
        L_0x00c8:
            com.bytedance.android.livesdkapi.message.e r11 = com.bytedance.android.livesdkapi.message.C8848e.UNKNOWN
        L_0x00ca:
            java.lang.String r11 = r11.getTag()
            boolean r9 = r11.equals(r9)
            if (r9 == 0) goto L_0x00d5
            goto L_0x00d6
        L_0x00d5:
            r6 = 0
        L_0x00d6:
            if (r6 == 0) goto L_0x01e0
            if (r6 != 0) goto L_0x00dd
        L_0x00da:
            r14 = 0
            goto L_0x01d1
        L_0x00dd:
            int r9 = r6.f24162a
            com.bytedance.android.livesdkapi.message.e r11 = com.bytedance.android.livesdkapi.message.C8848e.STRING
            int r11 = r11.getPieceType()
            if (r9 != r11) goto L_0x00eb
            java.lang.String r9 = r6.f24164c
            goto L_0x01d0
        L_0x00eb:
            com.bytedance.android.livesdkapi.message.e r11 = com.bytedance.android.livesdkapi.message.C8848e.USER
            int r11 = r11.getPieceType()
            if (r9 != r11) goto L_0x011b
            com.bytedance.android.livesdkapi.message.m r9 = r6.f24165d
            if (r9 == 0) goto L_0x00da
            com.bytedance.android.live.base.model.user.User r11 = r9.f24174a
            if (r11 != 0) goto L_0x00fc
            goto L_0x00da
        L_0x00fc:
            java.lang.String r11 = ""
            boolean r14 = r9.f24175b
            if (r14 == 0) goto L_0x0104
            java.lang.String r11 = " :"
        L_0x0104:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            com.bytedance.android.live.base.model.user.User r9 = r9.f24174a
            java.lang.String r9 = com.bytedance.android.livesdk.message.C7792f.m15860a(r9)
            r14.append(r9)
            r14.append(r11)
            java.lang.String r14 = r14.toString()
            goto L_0x01d1
        L_0x011b:
            com.bytedance.android.livesdkapi.message.e r11 = com.bytedance.android.livesdkapi.message.C8848e.GIFT
            int r11 = r11.getPieceType()
            if (r9 != r11) goto L_0x0183
            com.bytedance.android.livesdkapi.message.j r9 = r6.f24166e
            if (r9 != 0) goto L_0x0128
            goto L_0x00da
        L_0x0128:
            java.lang.String r11 = " . "
            com.bytedance.android.livesdkapi.message.d r14 = r9.f24170b
            r16 = 2132550624(0x7f1c23e0, float:2.0754584E38)
            if (r14 == 0) goto L_0x016f
            com.bytedance.android.livesdkapi.message.d r14 = r9.f24170b
            java.lang.String r14 = r14.f24143a
            if (r14 == 0) goto L_0x016f
            java.lang.String r14 = ""
            com.bytedance.android.livesdkapi.message.d r15 = r9.f24170b
            java.lang.String r15 = r15.f24143a
            if (r15 == 0) goto L_0x014b
            com.bytedance.android.livesdk.i18n.b r14 = com.bytedance.android.livesdk.i18n.C7676b.m15696a()
            com.bytedance.android.livesdkapi.message.d r15 = r9.f24170b
            java.lang.String r15 = r15.f24143a
            java.lang.String r14 = r14.mo14036a(r15)
        L_0x014b:
            boolean r15 = android.text.TextUtils.isEmpty(r14)
            if (r15 == 0) goto L_0x0155
            com.bytedance.android.livesdkapi.message.d r9 = r9.f24170b
            java.lang.String r14 = r9.f24144b
        L_0x0155:
            boolean r9 = android.text.TextUtils.isEmpty(r14)
            if (r9 == 0) goto L_0x015f
            java.lang.String r14 = com.bytedance.android.live.core.p230g.C3922z.m9903a(r16)
        L_0x015f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r14)
            r9.append(r11)
            java.lang.String r14 = r9.toString()
            goto L_0x01d1
        L_0x016f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = com.bytedance.android.live.core.p230g.C3922z.m9903a(r16)
            r9.append(r14)
            r9.append(r11)
            java.lang.String r14 = r9.toString()
            goto L_0x01d1
        L_0x0183:
            int r11 = r6.f24162a
            com.bytedance.android.livesdkapi.message.e r14 = com.bytedance.android.livesdkapi.message.C8848e.HEART
            int r14 = r14.getPieceType()
            if (r11 != r14) goto L_0x0190
            java.lang.String r9 = " "
            goto L_0x01d0
        L_0x0190:
            com.bytedance.android.livesdkapi.message.e r11 = com.bytedance.android.livesdkapi.message.C8848e.PATTERN_REF
            int r11 = r11.getPieceType()
            if (r9 != r11) goto L_0x00da
            com.bytedance.android.livesdkapi.message.l r9 = r6.f24168g
            if (r9 != 0) goto L_0x019f
            java.lang.String r9 = ""
            goto L_0x01d0
        L_0x019f:
            java.lang.String r11 = ""
            java.lang.String r14 = r9.f24172a
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x01c4
            com.bytedance.android.livesdk.i18n.b r14 = com.bytedance.android.livesdk.i18n.C7676b.m15696a()
            java.lang.String r15 = r9.f24172a
            java.lang.String r14 = r14.mo14036a(r15)
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x01c4
            com.bytedance.android.livesdk.i18n.b r11 = com.bytedance.android.livesdk.i18n.C7676b.m15696a()
            java.lang.String r9 = r9.f24172a
            java.lang.String r9 = r11.mo14036a(r9)
            goto L_0x01d0
        L_0x01c4:
            java.lang.String r14 = r9.f24173b
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x01cf
            java.lang.String r9 = r9.f24173b
            goto L_0x01d0
        L_0x01cf:
            r9 = r11
        L_0x01d0:
            r14 = r9
        L_0x01d1:
            r2.add(r14)
            int r9 = r19.size()
            int r9 = r9 - r13
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3.put(r9, r6)
        L_0x01e0:
            int r8 = r8 + -1
            r6 = 125(0x7d, float:1.75E-43)
            r9 = -1
            r11 = -1
            goto L_0x0238
        L_0x01e7:
            return
        L_0x01e8:
            int r8 = r8 + 1
            if (r8 == r13) goto L_0x01ed
            return
        L_0x01ed:
            int r6 = r7 + 1
            int r10 = r4.length()
            if (r10 <= 0) goto L_0x021a
            int r10 = r4.length()
            if (r10 <= 0) goto L_0x021a
            java.lang.String r10 = r4.toString()
            r2.add(r10)
            int r10 = r19.size()
            int r10 = r10 - r13
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.bytedance.android.livesdk.chatroom.e.q r13 = new com.bytedance.android.livesdk.chatroom.e.q
            r13.<init>()
            r3.put(r10, r13)
            int r10 = r4.length()
            r4.delete(r5, r10)
        L_0x021a:
            r10 = r6
            goto L_0x0042
        L_0x021d:
            if (r8 == 0) goto L_0x023d
            if (r8 == r13) goto L_0x0222
            return
        L_0x0222:
            java.lang.CharSequence r6 = r0.subSequence(r10, r7)
            java.lang.String r6 = r6.toString()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r6 = r6.intValue()
            int r9 = r7 + 1
            r11 = r6
            r6 = 125(0x7d, float:1.75E-43)
            r10 = -1
        L_0x0238:
            if (r12 == r6) goto L_0x023d
            r4.append(r12)
        L_0x023d:
            int r7 = r7 + 1
            r6 = -1
            goto L_0x002b
        L_0x0242:
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0267
            java.lang.String r0 = r4.toString()
            r2.add(r0)
            int r0 = r19.size()
            int r0 = r0 - r13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.bytedance.android.livesdk.chatroom.e.q r1 = new com.bytedance.android.livesdk.chatroom.e.q
            r1.<init>()
            r3.put(r0, r1)
            int r0 = r4.length()
            r4.delete(r5, r0)
        L_0x0267:
            return
        L_0x0268:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11762a(java.lang.String, java.util.List, java.util.List, java.util.Map):void");
    }

    /* renamed from: a */
    private static int m11754a(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return C3922z.m9909b((int) R.color.alt);
        }
    }

    /* renamed from: a */
    public static Spannable m11758a(String str, C8851g gVar) {
        return m11759a(str, gVar, null);
    }

    /* renamed from: a */
    public static Spannable m11755a(Spannable spannable, Bitmap bitmap) {
        if (bitmap == null || ((bitmap.isRecycled() && spannable == null) || spannable.length() == 0)) {
            return spannable;
        }
        int b = (int) C9432q.m18687b(C3922z.m9915e(), 16.0f);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(C3922z.m9915e().getResources(), bitmap);
        bitmapDrawable.setBounds(0, 0, b, b);
        spannable.setSpan(new C8534c(bitmapDrawable), spannable.length() - 1, spannable.length(), 33);
        return spannable;
    }

    /* renamed from: a */
    public static Spannable m11756a(C8851g gVar, String str) {
        String str2;
        if (gVar == null && TextUtils.isEmpty(str)) {
            return f13664a;
        }
        if (gVar == null) {
            return new SpannableString(str);
        }
        if (gVar.f24155a == null || TextUtils.isEmpty(C7676b.m15696a().mo14036a(gVar.f24155a))) {
            str2 = gVar.f24156b;
        } else {
            str2 = C7676b.m15696a().mo14036a(gVar.f24155a);
        }
        Spannable a = m11758a(str2, gVar);
        if (a != f13664a) {
            return a;
        }
        if (TextUtils.isEmpty(str)) {
            return f13664a;
        }
        return new SpannableString(str);
    }

    /* renamed from: a */
    public static Spannable m11759a(String str, C8851g gVar, C5084b bVar) {
        if (TextUtils.isEmpty(str) || gVar == null) {
            return f13664a;
        }
        if (gVar.f24158d == null || gVar.f24158d.size() == 0) {
            SpannableString spannableString = new SpannableString(str);
            if (gVar.f24157c != null) {
                C8852h hVar = gVar.f24157c;
                if (!TextUtils.isEmpty(hVar.f24159a)) {
                    spannableString.setSpan(new ForegroundColorSpan(m11754a(hVar.f24159a)), 0, spannableString.length(), 18);
                }
            }
            m11760a(spannableString, 0, spannableString.length(), bVar, false, -1);
            return spannableString;
        }
        try {
            List<C8853i> list = gVar.f24158d;
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m11762a(str, list, (List<String>) arrayList, (Map<Integer, C8853i>) linkedHashMap);
            if (arrayList.size() <= 0 || arrayList.size() != linkedHashMap.size()) {
                return f13664a;
            }
            return m11757a(gVar, (List<String>) arrayList, (Map<Integer, C8853i>) linkedHashMap, bVar);
        } catch (Exception e) {
            C3831a.m9706a(6, "ttlive_exception", e.getStackTrace());
            StringWriter stringWriter = new StringWriter();
            C17840a.m43751a((Throwable) e, new PrintWriter(stringWriter));
            HashMap hashMap = new HashMap();
            hashMap.put("stack_trace", stringWriter.toString());
            C3837e.m9743a(C3836d.m9735b("ttlive_parse_text_status"), 1, (Map<String, Object>) hashMap);
            return f13664a;
        }
    }

    /* renamed from: a */
    private static Spannable m11757a(C8851g gVar, List<String> list, Map<Integer, C8853i> map, C5084b bVar) {
        C8852h hVar;
        if (list.size() == 0 || map.size() == 0) {
            return f13664a;
        }
        if (list.size() != map.size()) {
            return f13664a;
        }
        StringBuilder sb = new StringBuilder();
        for (String append : list) {
            sb.append(append);
        }
        Spannable spannableString = new SpannableString(sb);
        if (gVar.f24157c != null) {
            C8852h hVar2 = gVar.f24157c;
            if (!TextUtils.isEmpty(hVar2.f24159a)) {
                spannableString.setSpan(new ForegroundColorSpan(m11754a(hVar2.f24159a)), 0, spannableString.length(), 18);
            }
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C8853i iVar = (C8853i) map.get(Integer.valueOf(i2));
            if (iVar == null || (iVar instanceof C5105q)) {
                m11760a(spannableString, i, i + str2.length(), bVar, false, -1);
            } else if (iVar.f24162a == C8848e.STRING.getPieceType() && iVar.f24163b == null) {
                m11760a(spannableString, i, i + str2.length(), bVar, false, -1);
            } else if (iVar.f24162a == C8848e.PATTERN_REF.getPieceType() && iVar.f24163b == null) {
                m11760a(spannableString, i, i + str2.length(), bVar, false, -1);
            } else {
                if (iVar.f24163b == null) {
                    hVar = gVar.f24157c;
                } else {
                    hVar = iVar.f24163b;
                }
                C8852h hVar3 = hVar;
                if (iVar.f24162a == C8848e.STRING.getPieceType() || iVar.f24162a == C8848e.PATTERN_REF.getPieceType()) {
                    spannableString.setSpan(new ForegroundColorSpan(m11754a(hVar3.f24159a)), i, str2.length() + i, 17);
                    m11760a(spannableString, i, i + str2.length(), bVar, true, m11754a(hVar3.f24159a));
                } else if (iVar.f24162a == C8848e.USER.getPieceType() && iVar.f24165d != null) {
                    int a = m11754a(hVar3.f24159a);
                    spannableString.setSpan(new C6155ep(iVar.f24165d.f24174a, a, false), i, str2.length() + i, 17);
                    spannableString.setSpan(new ForegroundColorSpan(a), i, str2.length() + i, 17);
                } else if (iVar.f24162a == C8848e.GIFT.getPieceType() && iVar.f24166e != null) {
                    int indexOf = str2.indexOf(" . ");
                    if (indexOf >= 0 && indexOf < str2.length()) {
                        m11760a(spannableString, i, i + indexOf, bVar, false, -1);
                    }
                } else if (iVar.f24162a == C8848e.HEART.getPieceType() && iVar.f24167f != null) {
                    Context e = C3922z.m9915e();
                    spannableString = m11755a(spannableString, C8546g.m16855a(e, m11754a(iVar.f24167f.f24171a), e.getResources().getDimensionPixelSize(R.dimen.qp), e.getResources().getDimensionPixelSize(R.dimen.qo)));
                }
                if (hVar3.f24161c >= 700) {
                    spannableString.setSpan(new StyleSpan(1), i, str2.length() + i, 33);
                } else if (hVar3.f24161c > 0) {
                    spannableString.setSpan(new StyleSpan(0), i, str2.length() + i, 33);
                }
            }
            i += str2.length();
        }
        return spannableString;
    }

    /* renamed from: a */
    public static void m11761a(Spannable spannable, Bitmap bitmap, int i, int i2, C5084b bVar) {
        if (bitmap != null && !bitmap.isRecycled() && spannable != null && spannable.length() != 0 && i >= 0 && i <= spannable.length() && i <= i2) {
            int b = (int) C9432q.m18687b(C3922z.m9915e(), 16.0f);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(C3922z.m9915e().getResources(), bitmap);
            bitmapDrawable.setBounds(0, 0, b, b);
            spannable.setSpan(new C8534c(bitmapDrawable), i, i2, 33);
            m11760a(spannable, i, i2, bVar, false, -1);
        }
    }

    /* renamed from: a */
    private static void m11760a(Spannable spannable, int i, int i2, C5084b bVar, boolean z, int i3) {
        C6227w wVar;
        if (bVar != null && bVar.mo10980e() != null) {
            if (z) {
                wVar = new C6227w(bVar.mo10980e(), i3);
            } else {
                wVar = new C6227w(bVar.mo10980e());
            }
            spannable.setSpan(wVar, i, i2, 17);
        }
    }
}
