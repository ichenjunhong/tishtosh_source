package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.m */
public final class C4910m extends C10779d<C4911a, C4912b> {

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$a */
    public static final class C4911a {
        @C17952c(mo34828a = "type")

        /* renamed from: a */
        public final String f13200a;
        @C17952c(mo34828a = "title")

        /* renamed from: b */
        public final String f13201b;
        @C17952c(mo34828a = "text")

        /* renamed from: c */
        public final String f13202c;
        @C17952c(mo34828a = "left_button_text")

        /* renamed from: d */
        public final String f13203d;
        @C17952c(mo34828a = "left_button_text_color")

        /* renamed from: e */
        public final String f13204e;
        @C17952c(mo34828a = "right_button_text")

        /* renamed from: f */
        public final String f13205f;
        @C17952c(mo34828a = "right_button_text_color")

        /* renamed from: g */
        public final String f13206g;
        @C17952c(mo34828a = "corner_radius")

        /* renamed from: h */
        public final Float f13207h;

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
            if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f13207h, (java.lang.Object) r3.f13207h) != false) goto L_0x005b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x005b
                boolean r0 = r3 instanceof com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4910m.C4911a
                if (r0 == 0) goto L_0x0059
                com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$a r3 = (com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4910m.C4911a) r3
                java.lang.String r0 = r2.f13200a
                java.lang.String r1 = r3.f13200a
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r2.f13201b
                java.lang.String r1 = r3.f13201b
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r2.f13202c
                java.lang.String r1 = r3.f13202c
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r2.f13203d
                java.lang.String r1 = r3.f13203d
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r2.f13204e
                java.lang.String r1 = r3.f13204e
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r2.f13205f
                java.lang.String r1 = r3.f13205f
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r2.f13206g
                java.lang.String r1 = r3.f13206g
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
                if (r0 == 0) goto L_0x0059
                java.lang.Float r0 = r2.f13207h
                java.lang.Float r3 = r3.f13207h
                boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
                if (r3 == 0) goto L_0x0059
                goto L_0x005b
            L_0x0059:
                r3 = 0
                return r3
            L_0x005b:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4910m.C4911a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f13200a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f13201b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f13202c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f13203d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f13204e;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.f13205f;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.f13206g;
            int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            Float f = this.f13207h;
            if (f != null) {
                i = f.hashCode();
            }
            return hashCode7 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(type=");
            sb.append(this.f13200a);
            sb.append(", title=");
            sb.append(this.f13201b);
            sb.append(", text=");
            sb.append(this.f13202c);
            sb.append(", leftButtonText=");
            sb.append(this.f13203d);
            sb.append(", leftButtonTextColor=");
            sb.append(this.f13204e);
            sb.append(", rightButtonText=");
            sb.append(this.f13205f);
            sb.append(", rightButtonTextColor=");
            sb.append(this.f13206g);
            sb.append(", cornerRadius=");
            sb.append(this.f13207h);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$b */
    public static final class C4912b {
        @C17952c(mo34828a = "code")

        /* renamed from: a */
        public final int f13208a = 1;
        @C17952c(mo34828a = "action")

        /* renamed from: b */
        public final String f13209b;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C4912b) {
                    C4912b bVar = (C4912b) obj;
                    if (!(this.f13208a == bVar.f13208a) || !C52711k.m112239a((Object) this.f13209b, (Object) bVar.f13209b)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.f13208a) * 31;
            String str = this.f13209b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(code=");
            sb.append(this.f13208a);
            sb.append(", action=");
            sb.append(this.f13209b);
            sb.append(")");
            return sb.toString();
        }

        public C4912b(int i, String str) {
            C52711k.m112240b(str, "action");
            this.f13209b = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$c */
    static final class C4913c extends C52712l implements C52682m<DialogInterface, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C4910m f13210a;

        /* renamed from: b */
        final /* synthetic */ C4911a f13211b;

        /* renamed from: c */
        final /* synthetic */ C52727e f13212c;

        C4913c(C4910m mVar, C4911a aVar, C52727e eVar) {
            this.f13210a = mVar;
            this.f13211b = aVar;
            this.f13212c = eVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            DialogInterface dialogInterface = (DialogInterface) obj;
            ((Number) obj2).intValue();
            C52711k.m112240b(dialogInterface, "<anonymous parameter 0>");
            this.f13210a.finishWithResult(new C4912b(1, "right"));
            ((C52670a) this.f13212c.element).invoke();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$d */
    static final class C4914d extends C52712l implements C52682m<DialogInterface, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C4910m f13213a;

        /* renamed from: b */
        final /* synthetic */ C4911a f13214b;

        /* renamed from: c */
        final /* synthetic */ C52727e f13215c;

        C4914d(C4910m mVar, C4911a aVar, C52727e eVar) {
            this.f13213a = mVar;
            this.f13214b = aVar;
            this.f13215c = eVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            DialogInterface dialogInterface = (DialogInterface) obj;
            ((Number) obj2).intValue();
            C52711k.m112240b(dialogInterface, "<anonymous parameter 0>");
            this.f13213a.finishWithResult(new C4912b(1, "left"));
            ((C52670a) this.f13215c.element).invoke();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$e */
    static final class C4915e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C8548h f13216a;

        C4915e(C8548h hVar) {
            this.f13216a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C8548h hVar = this.f13216a;
            if (hVar != null) {
                hVar.dismiss();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.m$f */
    static final class C4916f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C4916f f13217a = new C4916f();

        C4916f() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    public final void onTerminate() {
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) {
        C4911a aVar = (C4911a) obj;
        C52711k.m112240b(aVar, "params");
        C52711k.m112240b(fVar, "context");
        try {
            String str = aVar.f13200a;
            if (str.hashCode() == 951117504) {
                if (str.equals("confirm")) {
                    Context context = fVar.f28972a;
                    C52711k.m112236a((Object) context, "context.context");
                    C52727e eVar = new C52727e();
                    eVar.element = (C52670a) C4916f.f13217a;
                    C8552a aVar2 = new C8552a(context, 4);
                    String str2 = aVar.f13201b;
                    if (str2 != null) {
                        aVar2.mo15013d((CharSequence) str2);
                    }
                    String str3 = aVar.f13202c;
                    if (str3 != null) {
                        aVar2.mo15009c((CharSequence) str3);
                    }
                    Float f = aVar.f13207h;
                    if (f != null) {
                        aVar2.mo14997a(f.floatValue());
                    }
                    aVar2.mo14996a(false);
                    m11413a(aVar2, 0, aVar.f13205f, aVar.f13206g, new C4913c(this, aVar, eVar));
                    m11413a(aVar2, 1, aVar.f13203d, aVar.f13204e, new C4914d(this, aVar, eVar));
                    eVar.element = (C52670a) new C4915e(aVar2.mo15011d());
                    return;
                }
            }
            finishWithFailure();
        } catch (Throwable th) {
            finishWithFailure();
            C8064d.m16005b();
            C8064d.m9718a(5, th.getStackTrace());
        }
    }

    /* renamed from: a */
    private static void m11413a(C8552a aVar, int i, String str, String str2, C52682m<? super DialogInterface, ? super Integer, C52860x> mVar) {
        boolean z;
        if (str != null) {
            CharSequence charSequence = str;
            if (charSequence.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                SpannableString spannableString = new SpannableString(charSequence);
                if (str2 != null) {
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(str2)), 0, spannableString.length(), 33);
                }
                aVar.mo15004b(i, (CharSequence) spannableString, (OnClickListener) new C4917n(mVar));
            }
        }
    }
}
