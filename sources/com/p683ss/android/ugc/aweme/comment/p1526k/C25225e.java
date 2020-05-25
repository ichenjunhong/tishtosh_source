package com.p683ss.android.ugc.aweme.comment.p1526k;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.comment.C25146c;
import com.p683ss.android.ugc.aweme.comment.adapter.C25112e;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25220c.C25222b;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25220c.C25223c;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26129j;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52820l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.comment.k.e */
public final class C25225e {

    /* renamed from: com.ss.android.ugc.aweme.comment.k.e$a */
    public static final class C25226a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C52670a f66824a;

        public C25226a(C52670a aVar) {
            this.f66824a = aVar;
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            this.f66824a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.k.e$b */
    public static final class C25227b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C52670a f66825a;

        public C25227b(C52670a aVar) {
            this.f66825a = aVar;
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            if (!C32800a.m75679a(view)) {
                this.f66825a.invoke();
            }
        }
    }

    /* renamed from: a */
    public static final String m61331a(Comment comment) {
        return m61337a(comment, false, false, 3, null);
    }

    /* renamed from: a */
    public static final String m61335a(Comment comment, boolean z) {
        return m61337a(comment, z, false, 2, null);
    }

    /* renamed from: e */
    public static final boolean m61344e(Comment comment) {
        C52711k.m112240b(comment, "$this$hasTextExtra");
        return true;
    }

    /* renamed from: f */
    public static final String m61345f(Comment comment) {
        return m61334a(comment, null, 1, null);
    }

    /* renamed from: c */
    public static final String m61342c(Comment comment) {
        return m61332a(comment, (Paint) null, 0);
    }

    /* renamed from: b */
    public static final List<TextExtraStruct> m61340b(Comment comment) {
        C52711k.m112240b(comment, "$this$getDisplayTextExtra");
        return m61341b(comment, false, true);
    }

    /* renamed from: h */
    private static String m61347h(Comment comment) {
        C52711k.m112240b(comment, "$this$getTopTagStr");
        String string = C11010c.m22280a().getResources().getString(R.string.e1y);
        C52711k.m112236a((Object) string, "AppContextManager.getApp…s.getString(R.string.top)");
        return string;
    }

    /* renamed from: g */
    private static boolean m61346g(Comment comment) {
        C52711k.m112240b(comment, "$this$hasNamePrefix");
        if (TextUtils.isEmpty(comment.getReplyToUserName()) || TextUtils.isEmpty(comment.getReplyToReplyCommentId()) || TextUtils.equals(comment.getReplyToReplyCommentId(), "0") || comment.getAliasAweme() != null || comment.isTranslated()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private static String m61348i(Comment comment) {
        Context context;
        C52711k.m112240b(comment, "$this$getTimeDesc");
        Activity g = C11016e.m22312g();
        if (g != null) {
            context = g;
        } else {
            context = C11010c.m22280a();
        }
        String b = C47903fw.m103625b(context, ((long) comment.getCreateTime()) * 1000);
        C52711k.m112236a((Object) b, "TimeUtils.formatCreateTi…ateTime.toLong() * 1000L)");
        return new C52820l("(.)").replace((CharSequence) b, "$1⁠");
    }

    /* renamed from: d */
    public static final String m61343d(Comment comment) {
        boolean z;
        C52711k.m112240b(comment, "$this$getForwardText");
        if (TextUtils.isEmpty(comment.getForwardId())) {
            String text = comment.getText();
            if (text == null) {
                text = "";
            }
            return text;
        }
        String string = C11010c.m22280a().getString(R.string.b5x);
        CharSequence text2 = comment.getText();
        if (text2 == null || text2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(" • ");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        String text3 = comment.getText();
        if (text3 == null) {
            text3 = "";
        }
        sb2.append(text3);
        return sb2.toString();
    }

    /* renamed from: a */
    public static final String m61338a(C26129j jVar) {
        C52711k.m112240b(jVar, "$this$getTimeDesc");
        if (TextUtils.isEmpty(jVar.mTimeDesc)) {
            String b = C47903fw.m103625b(C11010c.m22280a(), jVar.getCommentTime() * 1000);
            C52711k.m112236a((Object) b, "TimeUtils.formatCreateTi…t(), commentTime * 1000L)");
            jVar.mTimeDesc = new C52820l("(.)").replace((CharSequence) b, "$1⁠");
        }
        String str = jVar.mTimeDesc;
        C52711k.m112236a((Object) str, "mTimeDesc");
        return str;
    }

    /* renamed from: a */
    public static final String m61333a(Comment comment, String str) {
        String str2;
        C52711k.m112240b(comment, "$this$getTextWithGifEmojiDetailTail");
        C52711k.m112240b(str, "displayText");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (comment.getEmoji() != null) {
            str2 = " ";
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m61336a(Comment comment, boolean z, boolean z2) {
        boolean z3;
        C52711k.m112240b(comment, "$this$getDisplayText");
        String text = comment.getText();
        if (text == null) {
            text = "";
        }
        StringBuilder sb = new StringBuilder(text);
        if (!TextUtils.isEmpty(comment.getForwardId())) {
            String string = C11010c.m22280a().getString(R.string.b5x);
            CharSequence text2 = comment.getText();
            if (text2 == null || text2.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" • ");
                string = sb2.toString();
            }
            sb.insert(0, string);
        }
        if (m61346g(comment)) {
            sb.insert(0, C11010c.m22280a().getString(R.string.a96, new Object[]{comment.getReplyToUserName()}));
        }
        if (z) {
            sb.append(" ");
            sb.append(m61348i(comment));
        }
        if (z2) {
            sb.append(" ");
            sb.append(m61347h(comment));
        }
        String sb3 = sb.toString();
        C52711k.m112236a((Object) sb3, "builder.toString()");
        return sb3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0143  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m61332a(com.p683ss.android.ugc.aweme.comment.model.Comment r19, android.graphics.Paint r20, int r21) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            com.ss.android.ugc.aweme.profile.model.User r3 = r19.getUser()
            if (r3 == 0) goto L_0x016d
            java.lang.String r3 = r0.mUserNamePrefix
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x016d
            com.ss.android.ugc.aweme.profile.model.User r3 = r19.getUser()
            java.lang.String r3 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103653c(r3)
            java.util.List r4 = r19.getReplyComments()
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = com.bytedance.common.utility.p522b.C9376b.m18558a(r4)
            if (r4 != 0) goto L_0x0056
            java.util.List r4 = r19.getReplyComments()
            java.lang.String r5 = "replyComments"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.Object r4 = p2628d.p2629a.C52575l.m112137e(r4)
            if (r4 == 0) goto L_0x0056
            java.util.List r4 = r19.getReplyComments()
            java.lang.String r5 = "replyComments"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.Object r4 = p2628d.p2629a.C52575l.m112137e(r4)
            java.lang.String r5 = "replyComments.first()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.comment.model.Comment r4 = (com.p683ss.android.ugc.aweme.comment.model.Comment) r4
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getUser()
            java.lang.String r4 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103653c(r4)
            goto L_0x0058
        L_0x0056:
            java.lang.String r4 = ""
        L_0x0058:
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0065
            java.lang.String r4 = r19.getReplyToUserName()
        L_0x0065:
            if (r1 == 0) goto L_0x0128
            if (r2 <= 0) goto L_0x0128
            int r5 = r19.getLabelType()
            if (r5 <= 0) goto L_0x0128
            java.lang.String r5 = r19.getLabelText()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0128
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x008b
            java.lang.String r5 = "："
            float r5 = r1.measureText(r5)
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            android.text.SpannableString r6 = new android.text.SpannableString
            java.lang.String r7 = r19.getLabelText()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.<init>(r7)
            com.ss.android.ugc.aweme.comment.k.c$a r7 = new com.ss.android.ugc.aweme.comment.k.c$a
            int r8 = r19.getLabelType()
            r7.<init>(r8)
            java.lang.String r8 = r19.getLabelText()
            int r8 = r8.length()
            int r8 = r8 + -1
            r9 = 33
            r10 = 0
            r6.setSpan(r7, r10, r8, r9)
            android.text.StaticLayout r8 = new android.text.StaticLayout
            r12 = r6
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            android.text.TextPaint r13 = r7.mo51481a(r1)
            r14 = 10000(0x2710, float:1.4013E-41)
            android.text.Layout$Alignment r15 = android.text.Layout.Alignment.ALIGN_NORMAL
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            r18 = 0
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            float r6 = r8.getLineWidth(r10)
            float r7 = r1.measureText(r3)
            float r7 = r7 + r6
            float r7 = r7 + r5
            float r2 = (float) r2
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0128
            java.lang.String r7 = "..."
            float r8 = r1.measureText(r7)
        L_0x00dc:
            java.lang.String r9 = "username"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r9)
            int r9 = r3.length()
            int r9 = r9 + -1
            if (r3 == 0) goto L_0x0120
            java.lang.String r3 = r3.substring(r10, r9)
            java.lang.String r9 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r9)
            float r9 = r1.measureText(r3)
            float r9 = r9 + r6
            float r9 = r9 + r8
            float r9 = r9 + r5
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x00dc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r7)
            java.lang.String r3 = r1.toString()
            com.ss.android.ugc.aweme.profile.model.User r1 = r19.getUser()
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103653c(r1)
            int r1 = r1.length()
            int r2 = r3.length()
            int r1 = r1 - r2
            r0.offset = r1
            goto L_0x0128
        L_0x0120:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x0128:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            int r2 = r19.getLabelType()
            if (r2 <= 0) goto L_0x013a
            java.lang.String r2 = r19.getLabelText()
            r1.append(r2)
        L_0x013a:
            r2 = r4
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0162
            java.lang.String r2 = " "
            r1.append(r2)
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2132548394(0x7f1c1b2a, float:2.0750061E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r4)
        L_0x0162:
            java.lang.String r2 = "："
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mUserNamePrefix = r1
        L_0x016d:
            java.lang.String r1 = r0.mUserNamePrefix
            if (r1 != 0) goto L_0x0175
            java.lang.String r1 = ""
            r0.mUserNamePrefix = r1
        L_0x0175:
            java.lang.String r0 = r0.mUserNamePrefix
            java.lang.String r1 = "mUserNamePrefix"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.p1526k.C25225e.m61332a(com.ss.android.ugc.aweme.comment.model.Comment, android.graphics.Paint, int):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0143  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m61339b(com.p683ss.android.ugc.aweme.comment.model.Comment r19, android.graphics.Paint r20, int r21) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            com.ss.android.ugc.aweme.profile.model.User r3 = r19.getUser()
            if (r3 == 0) goto L_0x0168
            java.lang.String r3 = r0.mUserNamePrefix
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0168
            com.ss.android.ugc.aweme.profile.model.User r3 = r19.getUser()
            java.lang.String r3 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103642a(r3)
            java.util.List r4 = r19.getReplyComments()
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = com.bytedance.common.utility.p522b.C9376b.m18558a(r4)
            if (r4 != 0) goto L_0x0056
            java.util.List r4 = r19.getReplyComments()
            java.lang.String r5 = "replyComments"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.Object r4 = p2628d.p2629a.C52575l.m112137e(r4)
            if (r4 == 0) goto L_0x0056
            java.util.List r4 = r19.getReplyComments()
            java.lang.String r5 = "replyComments"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.Object r4 = p2628d.p2629a.C52575l.m112137e(r4)
            java.lang.String r5 = "replyComments.first()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.ss.android.ugc.aweme.comment.model.Comment r4 = (com.p683ss.android.ugc.aweme.comment.model.Comment) r4
            com.ss.android.ugc.aweme.profile.model.User r4 = r4.getUser()
            java.lang.String r4 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103642a(r4)
            goto L_0x0058
        L_0x0056:
            java.lang.String r4 = ""
        L_0x0058:
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0065
            java.lang.String r4 = r19.getReplyToUserName()
        L_0x0065:
            if (r1 == 0) goto L_0x0128
            if (r2 <= 0) goto L_0x0128
            int r5 = r19.getLabelType()
            if (r5 <= 0) goto L_0x0128
            java.lang.String r5 = r19.getLabelText()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0128
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x008b
            java.lang.String r5 = "："
            float r5 = r1.measureText(r5)
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            android.text.SpannableString r6 = new android.text.SpannableString
            java.lang.String r7 = r19.getLabelText()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.<init>(r7)
            com.ss.android.ugc.aweme.comment.k.c$a r7 = new com.ss.android.ugc.aweme.comment.k.c$a
            int r8 = r19.getLabelType()
            r7.<init>(r8)
            java.lang.String r8 = r19.getLabelText()
            int r8 = r8.length()
            int r8 = r8 + -1
            r9 = 33
            r10 = 0
            r6.setSpan(r7, r10, r8, r9)
            android.text.StaticLayout r8 = new android.text.StaticLayout
            r12 = r6
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            android.text.TextPaint r13 = r7.mo51481a(r1)
            r14 = 10000(0x2710, float:1.4013E-41)
            android.text.Layout$Alignment r15 = android.text.Layout.Alignment.ALIGN_NORMAL
            r16 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            r18 = 0
            r11 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            float r6 = r8.getLineWidth(r10)
            float r7 = r1.measureText(r3)
            float r7 = r7 + r6
            float r7 = r7 + r5
            float r2 = (float) r2
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0128
            java.lang.String r7 = "..."
            float r8 = r1.measureText(r7)
        L_0x00dc:
            java.lang.String r9 = "username"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r9)
            int r9 = r3.length()
            int r9 = r9 + -1
            if (r3 == 0) goto L_0x0120
            java.lang.String r3 = r3.substring(r10, r9)
            java.lang.String r9 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r9)
            float r9 = r1.measureText(r3)
            float r9 = r9 + r6
            float r9 = r9 + r8
            float r9 = r9 + r5
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x00dc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r7)
            java.lang.String r3 = r1.toString()
            com.ss.android.ugc.aweme.profile.model.User r1 = r19.getUser()
            java.lang.String r1 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103642a(r1)
            int r1 = r1.length()
            int r2 = r3.length()
            int r1 = r1 - r2
            r0.offset = r1
            goto L_0x0128
        L_0x0120:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x0128:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            int r2 = r19.getLabelType()
            if (r2 <= 0) goto L_0x013a
            java.lang.String r2 = r19.getLabelText()
            r1.append(r2)
        L_0x013a:
            r2 = r4
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0162
            java.lang.String r2 = " "
            r1.append(r2)
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2132548394(0x7f1c1b2a, float:2.0750061E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r4)
        L_0x0162:
            java.lang.String r1 = r1.toString()
            r0.mUserNamePrefix = r1
        L_0x0168:
            java.lang.String r1 = r0.mUserNamePrefix
            if (r1 != 0) goto L_0x0170
            java.lang.String r1 = ""
            r0.mUserNamePrefix = r1
        L_0x0170:
            java.lang.String r0 = r0.mUserNamePrefix
            java.lang.String r1 = "mUserNamePrefix"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.p1526k.C25225e.m61339b(com.ss.android.ugc.aweme.comment.model.Comment, android.graphics.Paint, int):java.lang.String");
    }

    /* renamed from: b */
    private static List<TextExtraStruct> m61341b(Comment comment, boolean z, boolean z2) {
        List<TextExtraStruct> list;
        int i;
        boolean z3;
        C52711k.m112240b(comment, "$this$getDisplayTextExtra");
        if (comment.getTextExtra() != null) {
            list = new ArrayList<>(comment.getTextExtra().size());
            for (TextExtraStruct clone : comment.getTextExtra()) {
                TextExtraStruct clone2 = clone.clone();
                C52711k.m112236a((Object) clone2, "textExtraStruct.clone()");
                list.add(clone2);
            }
        } else {
            list = new ArrayList<>();
        }
        String i2 = m61348i(comment);
        String text = comment.getText();
        if (text == null) {
            text = "";
        }
        int length = text.length() + 1;
        String text2 = comment.getText();
        if (text2 == null) {
            text2 = "";
        }
        int length2 = text2.length() + i2.length();
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(TextExtraStruct.TYPE_CUSTOM);
        if (C25282a.m61494a().isBlackBackground() || C25112e.m61020a()) {
            i = C11010c.m22280a().getResources().getColor(R.color.a1a);
        } else {
            i = C11010c.m22280a().getResources().getColor(R.color.a8i);
        }
        textExtraStruct.setCustomSpan(new C25222b(C23728o.m58246c(13.0d), i));
        textExtraStruct.setStart(length);
        textExtraStruct.setEnd(length2);
        list.add(textExtraStruct);
        String h = m61347h(comment);
        int length3 = i2.length() + 1;
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.setType(TextExtraStruct.TYPE_CUSTOM);
        textExtraStruct2.setCustomSpan(new C25223c());
        String text3 = comment.getText();
        if (text3 == null) {
            text3 = "";
        }
        textExtraStruct2.setStart(text3.length() + length3 + 1);
        String text4 = comment.getText();
        if (text4 == null) {
            text4 = "";
        }
        textExtraStruct2.setEnd(text4.length() + length3 + 1 + h.length());
        list.add(textExtraStruct2);
        if (!TextUtils.isEmpty(comment.getForwardId())) {
            String string = C11010c.m22280a().getString(R.string.b5x);
            CharSequence text5 = comment.getText();
            if (text5 == null || text5.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" • ");
                string = sb.toString();
            }
            int length4 = string.length();
            for (TextExtraStruct textExtraStruct3 : list) {
                textExtraStruct3.setStart(textExtraStruct3.getStart() + length4);
                textExtraStruct3.setEnd(textExtraStruct3.getEnd() + length4);
                textExtraStruct3.setUserId(textExtraStruct3.getUserId());
            }
        }
        if (m61346g(comment)) {
            String string2 = C11010c.m22280a().getString(R.string.a96, new Object[]{comment.getReplyToUserName()});
            int length5 = string2.length();
            for (TextExtraStruct textExtraStruct4 : list) {
                textExtraStruct4.setStart(textExtraStruct4.getStart() + length5);
                textExtraStruct4.setEnd(textExtraStruct4.getEnd() + length5);
            }
            TextExtraStruct a = C25146c.m61086a();
            a.setType(TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN);
            C52711k.m112236a((Object) string2, "replyUsernamePrefix");
            CharSequence charSequence = string2;
            String replyToUserName = comment.getReplyToUserName();
            C52711k.m112236a((Object) replyToUserName, "replyToUserName");
            int a2 = C52830p.m112419a(charSequence, replyToUserName, 0, false, 6, (Object) null);
            a.setStart(a2);
            a.setUserId(comment.getReplyToUserId());
            a.setEnd(a2 + comment.getReplyToUserName().length());
            list.add(a);
        }
        return list;
    }

    /* renamed from: a */
    public static /* synthetic */ String m61334a(Comment comment, String str, int i, Object obj) {
        String text = comment.getText();
        C52711k.m112236a((Object) text, "text");
        return m61333a(comment, text);
    }

    /* renamed from: a */
    public static /* synthetic */ String m61337a(Comment comment, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return m61336a(comment, z, false);
    }
}
