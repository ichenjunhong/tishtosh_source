package com.p683ss.android.ugc.aweme.p1807im.sdk.group.view;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.p043v7.app.C1164e;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11181c;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11202k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34214b;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.g */
public final class C34332g extends C1164e {

    /* renamed from: f */
    public static final C34333a f88649f = new C34333a(null);

    /* renamed from: a */
    public final DmtEditText f88650a = ((DmtEditText) this.f88655g.findViewById(R.id.abw));

    /* renamed from: b */
    public final ImageButton f88651b = ((ImageButton) this.f88655g.findViewById(R.id.nh));

    /* renamed from: c */
    public final DmtButton f88652c = ((DmtButton) this.f88655g.findViewById(R.id.yn));

    /* renamed from: d */
    public C11190e f88653d;

    /* renamed from: e */
    public final String f88654e;

    /* renamed from: g */
    private final View f88655g;

    /* renamed from: h */
    private final DmtButton f88656h = ((DmtButton) this.f88655g.findViewById(R.id.q7));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.g$a */
    public static final class C34333a {
        private C34333a() {
        }

        public /* synthetic */ C34333a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.g$b */
    public static final class C34334b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C34332g f88657a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
        }

        C34334b(C34332g gVar) {
            this.f88657a = gVar;
        }

        public final void afterTextChanged(Editable editable) {
            C34332g gVar = this.f88657a;
            DmtEditText dmtEditText = this.f88657a.f88650a;
            C52711k.m112236a((Object) dmtEditText, "mNameEdit");
            EditText editText = dmtEditText;
            Editable text = editText.getText();
            if (text.length() > 20) {
                C10691a.m21545b(gVar.getContext(), C11010c.m22280a().getResources().getString(R.string.bis, new Object[]{"20"})).mo19066a();
                int selectionEnd = Selection.getSelectionEnd(text);
                String obj = text.toString();
                if (obj != null) {
                    String substring = obj.substring(0, 20);
                    C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    editText.setText(substring);
                    Editable text2 = editText.getText();
                    if (selectionEnd > text2.length()) {
                        selectionEnd = text2.length();
                    }
                    Selection.setSelection(text2, selectionEnd);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0080  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            /*
                r0 = this;
                java.lang.String r2 = "s"
                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
                boolean r2 = android.text.TextUtils.isEmpty(r1)
                r3 = 1056964608(0x3f000000, float:0.5)
                r4 = 0
                if (r2 == 0) goto L_0x0035
                com.ss.android.ugc.aweme.im.sdk.group.view.g r1 = r0.f88657a
                android.widget.ImageButton r1 = r1.f88651b
                java.lang.String r2 = "mClearBtn"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                r2 = 8
                r1.setVisibility(r2)
                com.ss.android.ugc.aweme.im.sdk.group.view.g r1 = r0.f88657a
                com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r1.f88652c
                java.lang.String r2 = "mConfirmBtn"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                r1.setEnabled(r4)
                com.ss.android.ugc.aweme.im.sdk.group.view.g r1 = r0.f88657a
                com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r1.f88652c
                java.lang.String r2 = "mConfirmBtn"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                r1.setAlpha(r3)
                return
            L_0x0035:
                java.lang.String r1 = r1.toString()
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                com.ss.android.ugc.aweme.im.sdk.group.view.g r2 = r0.f88657a
                com.bytedance.im.core.c.e r2 = r2.f88653d
                if (r2 == 0) goto L_0x0052
                com.bytedance.im.core.c.b r2 = r2.mo20685a()
                if (r2 == 0) goto L_0x0052
                com.bytedance.im.core.c.c r2 = r2.getCoreInfo()
                if (r2 == 0) goto L_0x0052
                java.lang.String r2 = r2.getName()
                goto L_0x0053
            L_0x0052:
                r2 = 0
            L_0x0053:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L_0x0080
                com.ss.android.ugc.aweme.im.sdk.group.view.g r1 = r0.f88657a
                android.widget.ImageButton r1 = r1.f88651b
                java.lang.String r2 = "mClearBtn"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                r1.setVisibility(r4)
                com.ss.android.ugc.aweme.im.sdk.group.view.g r1 = r0.f88657a
                com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r1.f88652c
                java.lang.String r2 = "mConfirmBtn"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                r1.setEnabled(r4)
                com.ss.android.ugc.aweme.im.sdk.group.view.g r1 = r0.f88657a
                com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r1.f88652c
                java.lang.String r2 = "mConfirmBtn"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                r1.setAlpha(r3)
                return
            L_0x0080:
                com.ss.android.ugc.aweme.im.sdk.group.view.g r1 = r0.f88657a
                android.widget.ImageButton r1 = r1.f88651b
                java.lang.String r2 = "mClearBtn"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                r1.setVisibility(r4)
                com.ss.android.ugc.aweme.im.sdk.group.view.g r1 = r0.f88657a
                com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r1.f88652c
                java.lang.String r2 = "mConfirmBtn"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                r2 = 1
                r1.setEnabled(r2)
                com.ss.android.ugc.aweme.im.sdk.group.view.g r1 = r0.f88657a
                com.bytedance.ies.dmt.ui.widget.DmtButton r1 = r1.f88652c
                java.lang.String r2 = "mConfirmBtn"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                r2 = 1065353216(0x3f800000, float:1.0)
                r1.setAlpha(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34332g.C34334b.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.g$c */
    static final class C34335c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34332g f88658a;

        C34335c(C34332g gVar) {
            this.f88658a = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f88658a.f88650a.setText("");
            this.f88658a.f88650a.clearFocus();
            this.f88658a.mo72345a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.g$d */
    static final class C34336d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34332g f88659a;

        C34336d(C34332g gVar) {
            this.f88659a = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f88659a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.g$e */
    static final class C34337e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34332g f88660a;

        C34337e(C34332g gVar) {
            this.f88660a = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r4) {
            /*
                r3 = this;
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r4)
                com.ss.android.ugc.aweme.im.sdk.group.view.g r4 = r3.f88660a
                com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = r4.f88650a
                java.lang.String r1 = "mNameEdit"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                android.text.Editable r0 = r0.getText()
                if (r0 == 0) goto L_0x0015
            L_0x0012:
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                goto L_0x0018
            L_0x0015:
                java.lang.String r0 = ""
                goto L_0x0012
            L_0x0018:
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35211ax.m79597a(r0)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r0 == 0) goto L_0x002d
                int r1 = r0.length()
                if (r1 != 0) goto L_0x002b
                goto L_0x002d
            L_0x002b:
                r1 = 0
                goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                if (r1 == 0) goto L_0x003f
                android.content.Context r4 = r4.getContext()
                r0 = 2132545358(0x7f1c0f4e, float:2.0743903E38)
                com.bytedance.ies.dmt.ui.d.a r4 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r4, r0)
                r4.mo19066a()
                return
            L_0x003f:
                com.bytedance.im.core.c.e r1 = r4.f88653d
                if (r1 == 0) goto L_0x0054
                com.bytedance.im.core.c.b r1 = r1.mo20685a()
                if (r1 == 0) goto L_0x0054
                com.bytedance.im.core.c.c r1 = r1.getCoreInfo()
                if (r1 == 0) goto L_0x0054
                java.lang.String r1 = r1.getName()
                goto L_0x0055
            L_0x0054:
                r1 = 0
            L_0x0055:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                if (r0 != 0) goto L_0x008e
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r1 = "conversation_id"
                java.lang.String r2 = r4.f88654e
                r0.put(r1, r2)
                java.lang.String r1 = "group_name_confirm_quick_click"
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79472a(r1, r0)
                com.bytedance.im.core.c.e r0 = r4.f88653d
                if (r0 == 0) goto L_0x008e
                com.bytedance.ies.dmt.ui.widget.DmtEditText r1 = r4.f88650a
                java.lang.String r2 = "mNameEdit"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                android.text.Editable r1 = r1.getText()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                com.ss.android.ugc.aweme.im.sdk.group.view.g$g r2 = new com.ss.android.ugc.aweme.im.sdk.group.view.g$g
                r2.<init>(r4)
                com.bytedance.im.core.a.a.b r2 = (com.bytedance.p702im.core.p703a.p704a.C11162b) r2
                r0.mo20689a(r1, r2)
                return
            L_0x008e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34332g.C34337e.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.g$f */
    static final class C34338f implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ C34332g f88661a;

        C34338f(C34332g gVar) {
            this.f88661a = gVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            C0013i.m12a(100).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<Void, Object>(this) {

                /* renamed from: a */
                final /* synthetic */ C34338f f88662a;

                {
                    this.f88662a = r1;
                }

                public final /* synthetic */ Object then(C0013i iVar) {
                    if (this.f88662a.f88661a.f88650a != null) {
                        this.f88662a.f88661a.f88650a.requestFocus();
                        C34332g gVar = this.f88662a.f88661a;
                        InputMethodManager inputMethodManager = (InputMethodManager) gVar.getContext().getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.showSoftInput(gVar.f88650a, 1);
                        }
                    }
                    return null;
                }
            }, C0013i.f25b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.g$g */
    public static final class C34340g implements C11162b<C11180b> {

        /* renamed from: a */
        final /* synthetic */ C34332g f88663a;

        C34340g(C34332g gVar) {
            this.f88663a = gVar;
        }

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            Context context = this.f88663a.getContext();
            C52711k.m112236a((Object) context, "context");
            C34214b.m78054a(context, kVar);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20506a(Object obj) {
            if (((C11180b) obj) != null) {
                C10691a.m21542b(this.f88663a.getContext(), (int) R.string.bir).mo19066a();
                this.f88663a.dismiss();
            }
        }
    }

    public final void cancel() {
        mo72345a();
        super.cancel();
    }

    public final void dismiss() {
        mo72345a();
        super.dismiss();
    }

    /* renamed from: a */
    public final void mo72345a() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            DmtEditText dmtEditText = this.f88650a;
            C52711k.m112236a((Object) dmtEditText, "mNameEdit");
            inputMethodManager.hideSoftInputFromWindow(dmtEditText.getWindowToken(), 0);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        requestWindowFeature(1);
        setContentView(this.f88655g);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-2, -2);
        }
        this.f88653d = new C11190e(this.f88654e);
        this.f88650a.addTextChangedListener(new C34334b(this));
        C11190e eVar = this.f88653d;
        if (eVar != null) {
            C11180b a = eVar.mo20685a();
            if (a != null) {
                C11181c coreInfo = a.getCoreInfo();
                if (coreInfo != null) {
                    Map ext = coreInfo.getExt();
                    if (ext != null && ext.containsKey("a:s_name_operator") && (!C52711k.m112239a((Object) (String) ext.get("a:s_name_operator"), (Object) "0"))) {
                        this.f88650a.setText(coreInfo.getName());
                        DmtEditText dmtEditText = this.f88650a;
                        C52711k.m112236a((Object) dmtEditText, "mNameEdit");
                        Editable text = dmtEditText.getText();
                        if (text != null) {
                            this.f88650a.setSelection(text.length());
                        }
                    }
                }
            }
        }
        ImageButton imageButton = this.f88651b;
        C52711k.m112236a((Object) imageButton, "mClearBtn");
        DmtEditText dmtEditText2 = this.f88650a;
        C52711k.m112236a((Object) dmtEditText2, "mNameEdit");
        CharSequence text2 = dmtEditText2.getText();
        int i = 0;
        if (!(text2 == null || text2.length() == 0)) {
            z = false;
        }
        if (z) {
            i = 4;
        }
        imageButton.setVisibility(i);
        this.f88651b.setOnClickListener(new C34335c(this));
        this.f88656h.setOnClickListener(new C34336d(this));
        this.f88652c.setOnClickListener(new C34337e(this));
        setOnShowListener(new C34338f(this));
    }

    public C34332g(Context context, String str) {
        C52711k.m112240b(context, "context");
        super(context, R.style.v0);
        this.f88654e = str;
        View inflate = LayoutInflater.from(context).inflate(R.layout.bfx, null);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…p_name_edit_dialog, null)");
        this.f88655g = inflate;
    }
}
