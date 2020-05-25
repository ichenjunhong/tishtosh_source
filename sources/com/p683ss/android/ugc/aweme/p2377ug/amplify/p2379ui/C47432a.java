package com.p683ss.android.ugc.aweme.p2377ug.amplify.p2379ui;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p2377ug.amplify.api.AmplifyApi;
import com.p683ss.android.ugc.aweme.p2377ug.amplify.api.AmplifyApi.C47426a;
import com.p683ss.android.ugc.aweme.setting.model.PopupSetting;
import com.p683ss.android.ugc.aweme.setting.model.PopupSetting.ButtonActionStruct;
import com.p683ss.android.ugc.aweme.setting.model.PopupSetting.ButtonStruct;
import p064c.p065a.C1687b;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a */
public final class C47432a extends Dialog implements C23422a {

    /* renamed from: b */
    public static final C47433a f119669b = new C47433a(null);

    /* renamed from: a */
    final C1689b f119670a = new C1689b();

    /* renamed from: c */
    private final PopupSetting f119671c;

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$a */
    public static final class C47433a {
        private C47433a() {
        }

        public /* synthetic */ C47433a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$b */
    static final class C47434b extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C47432a f119672a;

        C47434b(C47432a aVar) {
            this.f119672a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            if (str != null) {
                this.f119672a.mo94713a(str);
                C47432a.m102806b("more_item");
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$c */
    static final class C47435c extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C47432a f119673a;

        C47435c(C47432a aVar) {
            this.f119673a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            C47432a aVar = this.f119673a;
            C1690c a = C47432a.m102804a((C52671b<? super AmplifyApi, ? extends C1687b>) C47438f.f119677a).mo6173a(new C47439g(aVar), new C47440h(aVar));
            C52711k.m112236a((Object) a, "doRefuseAction()\n       …miss()\n                })");
            aVar.f119670a.mo6181a(a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$d */
    static final class C47436d extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C47432a f119674a;

        /* renamed from: b */
        final /* synthetic */ ButtonStruct f119675b;

        C47436d(C47432a aVar, ButtonStruct buttonStruct) {
            this.f119674a = aVar;
            this.f119675b = buttonStruct;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            C47432a aVar = this.f119674a;
            ButtonStruct buttonStruct = this.f119675b;
            if (!C47432a.m102805a(buttonStruct)) {
                C1690c a = C47432a.m102804a((C52671b<? super AmplifyApi, ? extends C1687b>) C47437e.f119676a).mo6173a(new C47441i(aVar), new C47442j(aVar));
                C52711k.m112236a((Object) a, "doConfirmAction()\n      …miss()\n                })");
                aVar.f119670a.mo6181a(a);
            } else if (buttonStruct != null) {
                ButtonActionStruct buttonActionStruct = buttonStruct.buttonActionStruct;
                if (buttonActionStruct != null) {
                    String str = buttonActionStruct.target;
                    if (str != null) {
                        aVar.mo94713a(str);
                        aVar.mo94712a();
                        aVar.dismiss();
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$e */
    static final class C47437e extends C52712l implements C52671b<AmplifyApi, C1687b> {

        /* renamed from: a */
        public static final C47437e f119676a = new C47437e();

        C47437e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            AmplifyApi amplifyApi = (AmplifyApi) obj;
            C52711k.m112240b(amplifyApi, "$receiver");
            return amplifyApi.confirmAction();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$f */
    static final class C47438f extends C52712l implements C52671b<AmplifyApi, C1687b> {

        /* renamed from: a */
        public static final C47438f f119677a = new C47438f();

        C47438f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            AmplifyApi amplifyApi = (AmplifyApi) obj;
            C52711k.m112240b(amplifyApi, "$receiver");
            return amplifyApi.refuseAction();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$g */
    static final class C47439g implements C1706a {

        /* renamed from: a */
        final /* synthetic */ C47432a f119678a;

        C47439g(C47432a aVar) {
            this.f119678a = aVar;
        }

        /* renamed from: a */
        public final void mo6199a() {
            C47432a.m102806b("next_time");
            this.f119678a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$h */
    static final class C47440h<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C47432a f119679a;

        C47440h(C47432a aVar) {
            this.f119679a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f119679a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$i */
    static final class C47441i implements C1706a {

        /* renamed from: a */
        final /* synthetic */ C47432a f119680a;

        C47441i(C47432a aVar) {
            this.f119680a = aVar;
        }

        /* renamed from: a */
        public final void mo6199a() {
            this.f119680a.mo94712a();
            this.f119680a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.amplify.ui.a$j */
    static final class C47442j<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C47432a f119681a;

        C47442j(C47432a aVar) {
            this.f119681a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f119681a.dismiss();
        }
    }

    public final void dismiss() {
        super.dismiss();
        this.f119670a.dispose();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94712a() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.setting.model.PopupSetting r0 = r3.f119671c
            com.ss.android.ugc.aweme.setting.model.PopupSetting$PopupText r0 = r0.popupText
            r1 = 1
            if (r0 == 0) goto L_0x0038
            java.util.List<com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonStruct> r0 = r0.buttons
            if (r0 == 0) goto L_0x0038
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x001a
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0032
        L_0x001a:
            java.util.Iterator r0 = r0.iterator()
        L_0x001e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonStruct r2 = (com.p683ss.android.ugc.aweme.setting.model.PopupSetting.ButtonStruct) r2
            boolean r2 = m102805a(r2)
            if (r2 == 0) goto L_0x001e
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "discover_tiktok_amplify"
            goto L_0x0048
        L_0x0046:
            java.lang.String r0 = "join_project"
        L_0x0048:
            m102806b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2377ug.amplify.p2379ui.C47432a.mo94712a():void");
    }

    /* renamed from: a */
    static boolean m102805a(ButtonStruct buttonStruct) {
        if (buttonStruct != null) {
            ButtonActionStruct buttonActionStruct = buttonStruct.buttonActionStruct;
            if (buttonActionStruct != null && buttonActionStruct.actionType == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m102806b(String str) {
        C26890h.m65011a("toast_click", C23089d.m56640a().mo47829a("toast_type", "copyright_permission_introduction").mo47829a("click_position", str).f61491a);
    }

    /* renamed from: a */
    public final void mo94713a(String str) {
        SmartRouter.buildRoute(getContext(), "aweme://webview/").withParam(Uri.parse(str)).open();
    }

    /* renamed from: a */
    static C1687b m102804a(C52671b<? super AmplifyApi, ? extends C1687b> bVar) {
        C1687b b = ((C1687b) bVar.invoke(C47426a.m102802a())).mo6177b(C2168a.m6521b()).mo6174a(C1667a.m5940a()).mo6176b();
        C52711k.m112236a((Object) b, "AmplifyApi.get()\n       …       .onErrorComplete()");
        return b;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0129 A[EDGE_INSN: B:75:0x0129->B:51:0x0129 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0157 A[EDGE_INSN: B:78:0x0157->B:64:0x0157 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            super.onCreate(r14)
            r14 = 1
            r13.requestWindowFeature(r14)
            android.view.Window r0 = r13.getWindow()
            if (r0 == 0) goto L_0x0021
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            if (r0 != 0) goto L_0x0014
            goto L_0x0021
        L_0x0014:
            r1 = 17
            r0.gravity = r1
            android.view.Window r1 = r13.getWindow()
            if (r1 == 0) goto L_0x0021
            r1.setAttributes(r0)
        L_0x0021:
            r0 = 2132214446(0x7f1702ae, float:2.0072734E38)
            r13.setContentView(r0)
            r0 = 0
            r13.setCanceledOnTouchOutside(r0)
            r13.setCancelable(r0)
            com.ss.android.ugc.aweme.setting.model.PopupSetting r1 = r13.f119671c
            com.ss.android.ugc.aweme.setting.model.PopupSetting$PopupText r1 = r1.popupText
            if (r1 != 0) goto L_0x0037
            r13.dismiss()
        L_0x0037:
            java.lang.String r2 = "popup"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.setting.model.PopupSetting$UrlStruct r2 = r1.image
            if (r2 == 0) goto L_0x0054
            java.lang.String[] r2 = r2.url_list
            if (r2 == 0) goto L_0x0054
            r2 = r2[r0]
            if (r2 == 0) goto L_0x0054
            r3 = 2132017407(0x7f1400ff, float:1.9673092E38)
            android.view.View r3 = r13.findViewById(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r3
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r3, r2)
        L_0x0054:
            r2 = 2132017408(0x7f140100, float:1.9673094E38)
            android.view.View r2 = r13.findViewById(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r3 = "amplify_title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r3 = r1.title
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            r2 = 2132017406(0x7f1400fe, float:1.967309E38)
            android.view.View r2 = r13.findViewById(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r3 = r1.context
            com.ss.android.ugc.aweme.ug.amplify.ui.a$b r4 = new com.ss.android.ugc.aweme.ug.amplify.ui.a$b
            r4.<init>(r13)
            d.f.a.b r4 = (p2628d.p2639f.p2640a.C52671b) r4
            java.lang.String r5 = "onClick"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r5)
            r5 = r3
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00f0
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r5 >= r6) goto L_0x0094
            android.text.Spanned r3 = android.text.Html.fromHtml(r3)
            goto L_0x009a
        L_0x0094:
            r5 = 63
            android.text.Spanned r3 = android.text.Html.fromHtml(r3, r5)
        L_0x009a:
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r6 = r3
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5.<init>(r6)
            int r3 = r3.length()
            java.lang.Class<android.text.style.URLSpan> r6 = android.text.style.URLSpan.class
            java.lang.Object[] r3 = r5.getSpans(r0, r3, r6)
            android.text.style.URLSpan[] r3 = (android.text.style.URLSpan[]) r3
            if (r3 == 0) goto L_0x00d0
            int r6 = r3.length
            r7 = 0
        L_0x00b2:
            if (r7 >= r6) goto L_0x00d0
            r8 = r3[r7]
            int r9 = r5.getSpanStart(r8)
            int r10 = r5.getSpanEnd(r8)
            int r11 = r5.getSpanFlags(r8)
            com.ss.android.ugc.aweme.ug.amplify.b$a r12 = new com.ss.android.ugc.aweme.ug.amplify.b$a
            r12.<init>(r4, r8)
            r5.setSpan(r12, r9, r10, r11)
            r5.removeSpan(r8)
            int r7 = r7 + 1
            goto L_0x00b2
        L_0x00d0:
            if (r2 == 0) goto L_0x00e0
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            r4 = 2131822155(0x7f11064b, float:1.9277073E38)
            int r3 = android.support.p030v4.content.C0726c.m2098c(r3, r4)
            r2.setHighlightColor(r3)
        L_0x00e0:
            if (r2 == 0) goto L_0x00e7
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2.setText(r5)
        L_0x00e7:
            if (r2 == 0) goto L_0x00f0
            android.text.method.MovementMethod r3 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r3)
        L_0x00f0:
            java.util.List<com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonStruct> r2 = r1.buttons
            java.lang.String r3 = "popup.buttons"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00fd:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0128
            java.lang.Object r3 = r2.next()
            r5 = r3
            com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonStruct r5 = (com.p683ss.android.ugc.aweme.setting.model.PopupSetting.ButtonStruct) r5
            boolean r6 = m102805a(r5)
            if (r6 != 0) goto L_0x0124
            if (r5 == 0) goto L_0x011e
            com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonActionStruct r5 = r5.buttonActionStruct
            if (r5 == 0) goto L_0x011e
            int r5 = r5.actionType
            r6 = 5
            if (r5 != r6) goto L_0x011e
            r5 = 1
            goto L_0x011f
        L_0x011e:
            r5 = 0
        L_0x011f:
            if (r5 == 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r5 = 0
            goto L_0x0125
        L_0x0124:
            r5 = 1
        L_0x0125:
            if (r5 == 0) goto L_0x00fd
            goto L_0x0129
        L_0x0128:
            r3 = r4
        L_0x0129:
            com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonStruct r3 = (com.p683ss.android.ugc.aweme.setting.model.PopupSetting.ButtonStruct) r3
            java.util.List<com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonStruct> r1 = r1.buttons
            java.lang.String r2 = "popup.buttons"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0138:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0156
            java.lang.Object r2 = r1.next()
            r5 = r2
            com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonStruct r5 = (com.p683ss.android.ugc.aweme.setting.model.PopupSetting.ButtonStruct) r5
            if (r5 == 0) goto L_0x0152
            com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonActionStruct r5 = r5.buttonActionStruct
            if (r5 == 0) goto L_0x0152
            int r5 = r5.actionType
            r6 = 4
            if (r5 != r6) goto L_0x0152
            r5 = 1
            goto L_0x0153
        L_0x0152:
            r5 = 0
        L_0x0153:
            if (r5 == 0) goto L_0x0138
            goto L_0x0157
        L_0x0156:
            r2 = r4
        L_0x0157:
            com.ss.android.ugc.aweme.setting.model.PopupSetting$ButtonStruct r2 = (com.p683ss.android.ugc.aweme.setting.model.PopupSetting.ButtonStruct) r2
            r14 = 2132017405(0x7f1400fd, float:1.9673087E38)
            android.view.View r14 = r13.findViewById(r14)
            com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton r14 = (com.p683ss.android.ugc.aweme.p2377ug.amplify.p2379ui.NotifyBottomButton) r14
            if (r2 == 0) goto L_0x0167
            java.lang.String r0 = r2.text
            goto L_0x0168
        L_0x0167:
            r0 = r4
        L_0x0168:
            java.lang.String r7 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.ug.amplify.ui.a$c r0 = new com.ss.android.ugc.aweme.ug.amplify.ui.a$c
            r0.<init>(r13)
            r9 = r0
            d.f.a.b r9 = (p2628d.p2639f.p2640a.C52671b) r9
            if (r3 == 0) goto L_0x0178
            java.lang.String r4 = r3.text
        L_0x0178:
            java.lang.String r8 = java.lang.String.valueOf(r4)
            com.ss.android.ugc.aweme.ug.amplify.ui.a$d r0 = new com.ss.android.ugc.aweme.ug.amplify.ui.a$d
            r0.<init>(r13, r3)
            r10 = r0
            d.f.a.b r10 = (p2628d.p2639f.p2640a.C52671b) r10
            java.lang.String r0 = "cancelText"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "onCancelClick"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.String r0 = "confirmText"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            java.lang.String r0 = "onConfirmClick"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton$a r0 = new com.ss.android.ugc.aweme.ug.amplify.ui.NotifyBottomButton$a
            r5 = r0
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r14.post(r0)
            java.lang.String r14 = "toast_show"
            com.ss.android.ugc.aweme.app.f.d r0 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "toast_type"
            java.lang.String r2 = "copyright_permission_introduction"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p2377ug.amplify.p2379ui.C47432a.onCreate(android.os.Bundle):void");
    }

    public C47432a(Activity activity, PopupSetting popupSetting) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(popupSetting, "amplifySetting");
        super(activity);
        this.f119671c = popupSetting;
    }
}
