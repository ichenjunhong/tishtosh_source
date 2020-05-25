package com.p683ss.android.ugc.aweme.setting.personalization.p2144b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.gms.ads.p1029b.C14902a;
import com.google.android.gms.ads.p1029b.C14902a.C14903a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a;
import com.p683ss.android.ugc.aweme.setting.personalization.PersonalizationActivity;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.personalization.b.a */
public final class C41667a {

    /* renamed from: a */
    public static final C41667a f105422a = new C41667a();

    /* renamed from: b */
    private static boolean f105423b = true;

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.b.a$a */
    static final class C41668a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Context f105424a;

        C41668a(Context context) {
            this.f105424a = context;
        }

        /* renamed from: a */
        private boolean m91528a() {
            try {
                C14903a a = C14902a.m30575a(this.f105424a);
                if (a != null) {
                    return a.f38443b;
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m91528a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.b.a$b */
    static final class C41669b<TTaskResult, TContinuationResult> implements C0011g<Boolean, Object> {

        /* renamed from: a */
        final /* synthetic */ C41673b f105425a;

        C41669b(C41673b bVar) {
            this.f105425a = bVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C23183v a = C23183v.m56778a();
            C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
            C23051bf z = a.mo47930z();
            C52711k.m112236a((Object) z, "CommonSharePrefCache.ins…tOutGooglePersonalizedAds");
            C52711k.m112236a((Object) iVar, "it");
            z.mo47776a(iVar.mo34e());
            C40869c.f104035d.mo83209m();
            C41673b bVar = this.f105425a;
            if (bVar != null) {
                Object e = iVar.mo34e();
                C52711k.m112236a(e, "it.result");
                bVar.mo75861a(((Boolean) e).booleanValue());
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.b.a$c */
    public static final class C41670c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Activity f105426a;

        /* renamed from: b */
        final /* synthetic */ String f105427b;

        /* renamed from: c */
        final /* synthetic */ int f105428c;

        /* renamed from: d */
        final /* synthetic */ int f105429d;

        public final void updateDrawState(TextPaint textPaint) {
            C52711k.m112240b(textPaint, "ds");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
            Intent intent = new Intent(this.f105426a, CrossPlatformActivity.class);
            intent.setData(Uri.parse(this.f105427b));
            intent.putExtra("use_webview_title", true);
            this.f105426a.startActivity(intent);
        }

        C41670c(Activity activity, String str, int i, int i2) {
            this.f105426a = activity;
            this.f105427b = str;
            this.f105428c = i;
            this.f105429d = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.b.a$d */
    static final class C41671d implements OnClickListener {

        /* renamed from: a */
        public static final C41671d f105430a = new C41671d();

        C41671d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C40869c.f104035d.mo83203b(true);
            C40878a.m90441a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.personalization.b.a$e */
    static final class C41672e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f105431a;

        C41672e(Activity activity) {
            this.f105431a = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(this.f105431a, PersonalizationActivity.class);
            intent.putExtra(C22858c.f61207c, true);
            this.f105431a.startActivityForResult(intent, 1);
        }
    }

    private C41667a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        if (r3 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r0 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004b, code lost:
        if (r3 == null) goto L_0x004d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85506a(android.app.Activity r7) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r0 = com.p683ss.android.ugc.aweme.protection.C40869c.m90386q()
            if (r0 == 0) goto L_0x0010
            com.ss.android.ugc.aweme.protection.model.CopyWritingInfo r0 = r0.getCopyWriting()
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            android.text.SpannableStringBuilder r1 = m91525a(r7, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = new com.bytedance.ies.dmt.ui.widget.DmtTextView
            r3 = r7
            android.content.Context r3 = (android.content.Context) r3
            r2.<init>(r3)
            android.content.res.Resources r4 = r7.getResources()
            r5 = 17170445(0x106000d, float:2.461195E-38)
            int r4 = r4.getColor(r5)
            r2.setHighlightColor(r4)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.setText(r1)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r1)
            r1 = 17
            r2.setGravity(r1)
            com.bytedance.ies.dmt.ui.b.a$a r1 = new com.bytedance.ies.dmt.ui.b.a$a
            r1.<init>(r3)
            com.bytedance.ies.dmt.ui.b.a$a r1 = r1.mo18906c()
            if (r0 == 0) goto L_0x004d
            java.lang.String r3 = r0.getConfirm()
            if (r3 != 0) goto L_0x004f
        L_0x004d:
            java.lang.String r3 = ""
        L_0x004f:
            com.ss.android.ugc.aweme.setting.personalization.b.a$d r4 = com.p683ss.android.ugc.aweme.setting.personalization.p2144b.C41667a.C41671d.f105430a
            android.content.DialogInterface$OnClickListener r4 = (android.content.DialogInterface.OnClickListener) r4
            com.bytedance.ies.dmt.ui.b.a$a r1 = r1.mo18893a(r3, r4)
            com.bytedance.ies.dmt.ui.b.a$a r1 = r1.mo18898b()
            if (r0 == 0) goto L_0x0063
            java.lang.String r3 = r0.getCheckSettings()
            if (r3 != 0) goto L_0x0065
        L_0x0063:
            java.lang.String r3 = ""
        L_0x0065:
            com.ss.android.ugc.aweme.setting.personalization.b.a$e r4 = new com.ss.android.ugc.aweme.setting.personalization.b.a$e
            r4.<init>(r7)
            android.content.DialogInterface$OnClickListener r4 = (android.content.DialogInterface.OnClickListener) r4
            com.bytedance.ies.dmt.ui.b.a$a r7 = r1.mo18903b(r3, r4)
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r0.getTitle()
            if (r0 != 0) goto L_0x007a
        L_0x0078:
            java.lang.String r0 = ""
        L_0x007a:
            com.bytedance.ies.dmt.ui.b.a$a r7 = r7.mo18892a(r0)
            com.bytedance.ies.dmt.ui.b.a$a r7 = r7.mo18891a(r2)
            r0 = 0
            com.bytedance.ies.dmt.ui.b.a$a r7 = r7.mo18905b(r0)
            com.bytedance.ies.dmt.ui.b.a r7 = r7.mo18897a()
            r7.mo18883c()
            java.lang.String r7 = "ads_notify_show"
            com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
            r0.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "homepage_hot"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.setting.personalization.p2144b.C41667a.mo85506a(android.app.Activity):void");
    }

    /* renamed from: a */
    public static void m91526a(Context context, C41673b bVar) {
        C52711k.m112240b(context, "context");
        C0013i.m16a((Callable<TResult>) new C41668a<TResult>(context)).mo20a((C0011g<TResult, TContinuationResult>) new C41669b<TResult,TContinuationResult>(bVar), C0013i.f25b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (r4 == null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if (r5 == null) goto L_0x00ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0024 A[Catch:{ Exception -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065 A[Catch:{ Exception -> 0x0107 }, LOOP:0: B:18:0x005f->B:20:0x0065, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d A[Catch:{ Exception -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b A[Catch:{ Exception -> 0x0107 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.SpannableStringBuilder m91525a(android.app.Activity r12, com.p683ss.android.ugc.aweme.protection.model.CopyWritingInfo r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L_0x0020
            java.util.List r1 = r13.getPolicyList()     // Catch:{ Exception -> 0x0107 }
            if (r1 == 0) goto L_0x0020
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ Exception -> 0x0107 }
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0107 }
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ Exception -> 0x0107 }
            if (r1 == 0) goto L_0x0018
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ Exception -> 0x0107 }
            if (r1 != 0) goto L_0x0022
            goto L_0x0020
        L_0x0018:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x0107 }
            java.lang.String r13 = "null cannot be cast to non-null type kotlin.Array<T>"
            r12.<init>(r13)     // Catch:{ Exception -> 0x0107 }
            throw r12     // Catch:{ Exception -> 0x0107 }
        L_0x0020:
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0107 }
        L_0x0022:
            if (r13 == 0) goto L_0x002a
            java.lang.String r2 = r13.getSubtext()     // Catch:{ Exception -> 0x0107 }
            if (r2 != 0) goto L_0x002c
        L_0x002a:
            java.lang.String r2 = ""
        L_0x002c:
            int r3 = r1.length     // Catch:{ Exception -> 0x0107 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)     // Catch:{ Exception -> 0x0107 }
            int r3 = r1.length     // Catch:{ Exception -> 0x0107 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r1 = com.C2240a.m6772a(r2, r1)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r2 = "java.lang.String.format(format, *args)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Exception -> 0x0107 }
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x0107 }
            java.lang.String r4 = "\n"
            java.lang.String r5 = "\n\n"
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r1
            java.lang.String r3 = p2628d.p2650m.C52830p.m112401a(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0107 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x0107 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r3 = "\n\n"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)     // Catch:{ Exception -> 0x0107 }
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ Exception -> 0x0107 }
            java.util.regex.Matcher r3 = r3.matcher(r4)     // Catch:{ Exception -> 0x0107 }
        L_0x005f:
            boolean r4 = r3.find()     // Catch:{ Exception -> 0x0107 }
            if (r4 == 0) goto L_0x007b
            android.text.style.AbsoluteSizeSpan r4 = new android.text.style.AbsoluteSizeSpan     // Catch:{ Exception -> 0x0107 }
            r5 = 7
            r6 = 1
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x0107 }
            int r5 = r3.start()     // Catch:{ Exception -> 0x0107 }
            int r5 = r5 + r6
            int r6 = r3.end()     // Catch:{ Exception -> 0x0107 }
            r7 = 33
            r2.setSpan(r4, r5, r6, r7)     // Catch:{ Exception -> 0x0107 }
            goto L_0x005f
        L_0x007b:
            if (r13 == 0) goto L_0x0088
            java.util.List r3 = r13.getPolicyList()     // Catch:{ Exception -> 0x0107 }
            if (r3 == 0) goto L_0x0088
            int r3 = r3.size()     // Catch:{ Exception -> 0x0107 }
            goto L_0x0089
        L_0x0088:
            r3 = 0
        L_0x0089:
            if (r0 >= r3) goto L_0x0110
            if (r13 == 0) goto L_0x009b
            java.util.List r4 = r13.getPolicyList()     // Catch:{ Exception -> 0x0107 }
            if (r4 == 0) goto L_0x009b
            java.lang.Object r4 = r4.get(r0)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0107 }
            if (r4 != 0) goto L_0x009d
        L_0x009b:
            java.lang.String r4 = ""
        L_0x009d:
            if (r13 == 0) goto L_0x00ad
            java.util.List r5 = r13.getPolicyLinkList()     // Catch:{ Exception -> 0x0107 }
            if (r5 == 0) goto L_0x00ad
            java.lang.Object r5 = r5.get(r0)     // Catch:{ Exception -> 0x0107 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0107 }
            if (r5 != 0) goto L_0x00af
        L_0x00ad:
            java.lang.String r5 = ""
        L_0x00af:
            r11 = r5
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x0107 }
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r6 = r4
            int r5 = p2628d.p2650m.C52830p.m112419a(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0107 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x0107 }
            int r4 = r4 + r5
            r6 = -1
            if (r5 == r6) goto L_0x00e6
            if (r4 == r6) goto L_0x00e6
            com.ss.android.ugc.aweme.setting.personalization.b.a$c r6 = new com.ss.android.ugc.aweme.setting.personalization.b.a$c     // Catch:{ Exception -> 0x0107 }
            r6.<init>(r12, r11, r5, r4)     // Catch:{ Exception -> 0x0107 }
            r7 = 18
            r2.setSpan(r6, r5, r4, r7)     // Catch:{ Exception -> 0x0107 }
            android.text.style.ForegroundColorSpan r6 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x0107 }
            android.content.res.Resources r8 = r12.getResources()     // Catch:{ Exception -> 0x0107 }
            r9 = 2131821461(0x7f110395, float:1.9275666E38)
            int r8 = r8.getColor(r9)     // Catch:{ Exception -> 0x0107 }
            r6.<init>(r8)     // Catch:{ Exception -> 0x0107 }
            r2.setSpan(r6, r5, r4, r7)     // Catch:{ Exception -> 0x0107 }
            int r0 = r0 + 1
            goto L_0x0089
        L_0x00e6:
            java.lang.String r12 = "text_highlight_not_match"
            java.lang.String r13 = ""
            com.ss.android.ugc.aweme.app.f.c r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()     // Catch:{ Exception -> 0x0107 }
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "gdpr_dialog"
            com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47824a(r1, r2)     // Catch:{ Exception -> 0x0107 }
            org.json.JSONObject r0 = r0.mo47825b()     // Catch:{ Exception -> 0x0107 }
            com.p683ss.android.ugc.aweme.app.C23131p.m56692a(r12, r13, r0)     // Catch:{ Exception -> 0x0107 }
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder     // Catch:{ Exception -> 0x0107 }
            java.lang.String r13 = ""
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13     // Catch:{ Exception -> 0x0107 }
            r12.<init>(r13)     // Catch:{ Exception -> 0x0107 }
            return r12
        L_0x0107:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            java.lang.String r12 = ""
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            r2.<init>(r12)
        L_0x0110:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.setting.personalization.p2144b.C41667a.m91525a(android.app.Activity, com.ss.android.ugc.aweme.protection.model.CopyWritingInfo):android.text.SpannableStringBuilder");
    }
}
