package com.p683ss.android.ugc.aweme.p1807im.sdk.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11181c;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11202k;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34214b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35211ax;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity */
public final class EditGroupInfoActivity extends AmeActivity {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88057a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditGroupInfoActivity.class), "mTitleBar", "getMTitleBar()Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditGroupInfoActivity.class), "mInfoEditText", "getMInfoEditText()Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditGroupInfoActivity.class), "mWordCountText", "getMWordCountText()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditGroupInfoActivity.class), "mClearEditInfoImage", "getMClearEditInfoImage()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(EditGroupInfoActivity.class), "mLoadingStatusView", "getMLoadingStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;"))};

    /* renamed from: d */
    public static final C34059a f88058d = new C34059a(null);

    /* renamed from: b */
    public String f88059b;

    /* renamed from: c */
    public C11190e f88060c;

    /* renamed from: e */
    private final C52668f f88061e = C52732g.m112285a(new C34067i(this));

    /* renamed from: f */
    private final C52668f f88062f = C52732g.m112285a(new C34065g(this));

    /* renamed from: g */
    private final C52668f f88063g = C52732g.m112285a(new C34068j(this));

    /* renamed from: h */
    private final C52668f f88064h = C52732g.m112285a(new C34064f(this));

    /* renamed from: i */
    private final C52668f f88065i = C52732g.m112285a(new C34066h(this));

    /* renamed from: j */
    private Integer f88066j;

    /* renamed from: k */
    private HashMap f88067k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$a */
    public static final class C34059a {
        private C34059a() {
        }

        public /* synthetic */ C34059a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$b */
    public static final class C34060b implements C35356a {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f88068a;

        /* renamed from: c */
        public final void mo70671c() {
        }

        /* renamed from: a */
        public final void mo70669a() {
            this.f88068a.onBackPressed();
        }

        /* renamed from: b */
        public final void mo70670b() {
            this.f88068a.mo72027f();
        }

        C34060b(EditGroupInfoActivity editGroupInfoActivity) {
            this.f88068a = editGroupInfoActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$c */
    public static final class C34061c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f88069a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C34061c(EditGroupInfoActivity editGroupInfoActivity) {
            this.f88069a = editGroupInfoActivity;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            CharSequence charSequence = editable;
            int i = 0;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ImTextTitleBar a = this.f88069a.mo72022a();
                C52711k.m112236a((Object) a, "mTitleBar");
                View rightView = a.getRightView();
                C52711k.m112236a((Object) rightView, "mTitleBar.rightView");
                rightView.setAlpha(0.34f);
                ImTextTitleBar a2 = this.f88069a.mo72022a();
                C52711k.m112236a((Object) a2, "mTitleBar");
                View rightView2 = a2.getRightView();
                C52711k.m112236a((Object) rightView2, "mTitleBar.rightView");
                rightView2.setEnabled(false);
                ImageView d = this.f88069a.mo72025d();
                C52711k.m112236a((Object) d, "mClearEditInfoImage");
                d.setVisibility(8);
            } else if (TextUtils.equals(charSequence, this.f88069a.f88059b)) {
                ImTextTitleBar a3 = this.f88069a.mo72022a();
                C52711k.m112236a((Object) a3, "mTitleBar");
                View rightView3 = a3.getRightView();
                C52711k.m112236a((Object) rightView3, "mTitleBar.rightView");
                rightView3.setAlpha(0.34f);
                ImTextTitleBar a4 = this.f88069a.mo72022a();
                C52711k.m112236a((Object) a4, "mTitleBar");
                View rightView4 = a4.getRightView();
                C52711k.m112236a((Object) rightView4, "mTitleBar.rightView");
                rightView4.setEnabled(false);
                ImageView d2 = this.f88069a.mo72025d();
                C52711k.m112236a((Object) d2, "mClearEditInfoImage");
                d2.setVisibility(0);
            } else {
                ImTextTitleBar a5 = this.f88069a.mo72022a();
                C52711k.m112236a((Object) a5, "mTitleBar");
                View rightView5 = a5.getRightView();
                C52711k.m112236a((Object) rightView5, "mTitleBar.rightView");
                rightView5.setAlpha(1.0f);
                ImTextTitleBar a6 = this.f88069a.mo72022a();
                C52711k.m112236a((Object) a6, "mTitleBar");
                View rightView6 = a6.getRightView();
                C52711k.m112236a((Object) rightView6, "mTitleBar.rightView");
                rightView6.setEnabled(true);
                ImageView d3 = this.f88069a.mo72025d();
                C52711k.m112236a((Object) d3, "mClearEditInfoImage");
                d3.setVisibility(0);
            }
            if (editable != null) {
                i = editable.length();
            }
            int i2 = 20;
            if (i <= 20) {
                i2 = i;
            }
            TextView c = this.f88069a.mo72024c();
            C52711k.m112236a((Object) c, "mWordCountText");
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append("/20");
            c.setText(sb.toString());
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EditGroupInfoActivity editGroupInfoActivity = this.f88069a;
            DmtEditText b = this.f88069a.mo72023b();
            C52711k.m112236a((Object) b, "mInfoEditText");
            EditText editText = b;
            Editable text = editText.getText();
            if (text.length() > 20) {
                C10691a.m21545b((Context) editGroupInfoActivity, editGroupInfoActivity.getString(R.string.bis, new Object[]{"20"})).mo19066a();
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
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$d */
    static final class C34062d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f88070a;

        C34062d(EditGroupInfoActivity editGroupInfoActivity) {
            this.f88070a = editGroupInfoActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f88070a.mo72023b().setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$e */
    static final class C34063e implements OnEditorActionListener {

        /* renamed from: a */
        public static final C34063e f88071a = new C34063e();

        C34063e() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent == null || keyEvent.getKeyCode() != 66) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$f */
    static final class C34064f extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f88072a;

        C34064f(EditGroupInfoActivity editGroupInfoActivity) {
            this.f88072a = editGroupInfoActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f88072a.mo72021a((int) R.id.az7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$g */
    static final class C34065g extends C52712l implements C52670a<DmtEditText> {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f88073a;

        C34065g(EditGroupInfoActivity editGroupInfoActivity) {
            this.f88073a = editGroupInfoActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtEditText) this.f88073a.mo72021a((int) R.id.abr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$h */
    static final class C34066h extends C52712l implements C52670a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f88074a;

        C34066h(EditGroupInfoActivity editGroupInfoActivity) {
            this.f88074a = editGroupInfoActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtStatusView) this.f88074a.mo72021a((int) R.id.drd);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$i */
    static final class C34067i extends C52712l implements C52670a<ImTextTitleBar> {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f88075a;

        C34067i(EditGroupInfoActivity editGroupInfoActivity) {
            this.f88075a = editGroupInfoActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImTextTitleBar) this.f88075a.mo72021a((int) R.id.d10);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$j */
    static final class C34068j extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f88076a;

        C34068j(EditGroupInfoActivity editGroupInfoActivity) {
            this.f88076a = editGroupInfoActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f88076a.mo72021a((int) R.id.dil);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$k */
    static final class C34069k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f88077a;

        C34069k(EditGroupInfoActivity editGroupInfoActivity) {
            this.f88077a = editGroupInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f88077a.mo72027f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$l */
    static final class C34070l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f88078a;

        C34070l(EditGroupInfoActivity editGroupInfoActivity) {
            this.f88078a = editGroupInfoActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            EditGroupInfoActivity.super.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$m */
    static final class C34071m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EditGroupInfoActivity f88079a;

        /* renamed from: b */
        final /* synthetic */ String f88080b;

        C34071m(EditGroupInfoActivity editGroupInfoActivity, String str) {
            this.f88079a = editGroupInfoActivity;
            this.f88080b = str;
        }

        public final void run() {
            this.f88079a.mo72026e().mo19212f();
            C11190e eVar = this.f88079a.f88060c;
            if (eVar != null) {
                eVar.mo20689a(this.f88080b, (C11162b<C11180b>) new C11162b<C11180b>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C34071m f88081a;

                    {
                        this.f88081a = r1;
                    }

                    /* renamed from: a */
                    public final void mo20508a(C11202k kVar) {
                        DmtStatusView e = this.f88081a.f88079a.mo72026e();
                        C52711k.m112236a((Object) e, "mLoadingStatusView");
                        e.setVisibility(8);
                        C34214b.m78054a(this.f88081a.f88079a, kVar);
                    }

                    /* renamed from: a */
                    public final /* synthetic */ void mo20506a(Object obj) {
                        String str;
                        C11180b bVar = (C11180b) obj;
                        DmtStatusView e = this.f88081a.f88079a.mo72026e();
                        C52711k.m112236a((Object) e, "mLoadingStatusView");
                        e.setVisibility(8);
                        if (bVar != null) {
                            Intent intent = new Intent();
                            String str2 = "editInfo";
                            C11181c coreInfo = bVar.getCoreInfo();
                            if (coreInfo != null) {
                                str = coreInfo.getName();
                            } else {
                                str = null;
                            }
                            intent.putExtra(str2, str);
                            this.f88081a.f88079a.setResult(222, intent);
                            this.f88081a.f88079a.finish();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final View mo72021a(int i) {
        if (this.f88067k == null) {
            this.f88067k = new HashMap();
        }
        View view = (View) this.f88067k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f88067k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final ImTextTitleBar mo72022a() {
        return (ImTextTitleBar) this.f88061e.getValue();
    }

    /* renamed from: b */
    public final DmtEditText mo72023b() {
        return (DmtEditText) this.f88062f.getValue();
    }

    /* renamed from: c */
    public final TextView mo72024c() {
        return (TextView) this.f88063g.getValue();
    }

    /* renamed from: d */
    public final ImageView mo72025d() {
        return (ImageView) this.f88064h.getValue();
    }

    /* renamed from: e */
    public final DmtStatusView mo72026e() {
        return (DmtStatusView) this.f88065i.getValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    /* renamed from: f */
    public final void mo72027f() {
        String str;
        DmtEditText b = mo72023b();
        C52711k.m112236a((Object) b, "mInfoEditText");
        CharSequence text = b.getText();
        if (text == null) {
            text = "";
        }
        String a = C35211ax.m79597a(text.toString());
        CharSequence charSequence = a;
        if (TextUtils.isEmpty(charSequence)) {
            C10691a.m21542b((Context) this, (int) R.string.bip).mo19066a();
        } else if (!TextUtils.equals(charSequence, this.f88059b)) {
            Context context = this;
            C11190e eVar = this.f88060c;
            if (eVar != null) {
                str = eVar.f30190a;
            } else {
                str = null;
            }
            C34214b.m78055a(context, str, new C34071m(this, a));
        }
    }

    public final void onBackPressed() {
        CharSequence charSequence = this.f88059b;
        DmtEditText b = mo72023b();
        C52711k.m112236a((Object) b, "mInfoEditText");
        if (!TextUtils.equals(charSequence, b.getText())) {
            DmtEditText b2 = mo72023b();
            C52711k.m112236a((Object) b2, "mInfoEditText");
            if (!TextUtils.isEmpty(C35211ax.m79597a(String.valueOf(b2.getText())))) {
                new C10643a(this).mo18899b((int) R.string.bju).mo18911e(R.style.mp).mo18886a((int) R.string.bmm, (DialogInterface.OnClickListener) new C34069k(this)).mo18900b((int) R.string.bhm, (DialogInterface.OnClickListener) new C34070l(this)).mo18897a().mo18882b();
                return;
            }
        }
        super.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r6 == null) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r6)
            r6 = 2132214730(0x7f1703ca, float:2.007331E38)
            r5.setContentView(r6)
            com.ss.android.ugc.aweme.im.sdk.providedservices.IImplService r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77718b()
            r0 = r5
            android.app.Activity r0 = (android.app.Activity) r0
            r6.setupStatusBar(r0)
            android.content.Intent r6 = r5.getIntent()
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L_0x002e
            java.lang.String r3 = "type"
            int r6 = r6.getIntExtra(r3, r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x002f
        L_0x002e:
            r6 = r0
        L_0x002f:
            r5.f88066j = r6
            android.content.Intent r6 = r5.getIntent()
            if (r6 == 0) goto L_0x003e
            java.lang.String r3 = "conversationId"
            java.lang.String r6 = r6.getStringExtra(r3)
            goto L_0x003f
        L_0x003e:
            r6 = r0
        L_0x003f:
            r3 = r6
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x004d
            int r3 = r3.length()
            if (r3 != 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r3 = 0
            goto L_0x004e
        L_0x004d:
            r3 = 1
        L_0x004e:
            if (r3 != 0) goto L_0x0057
            com.bytedance.im.core.c.e r3 = new com.bytedance.im.core.c.e
            r3.<init>(r6)
            r5.f88060c = r3
        L_0x0057:
            android.content.Intent r6 = r5.getIntent()
            if (r6 == 0) goto L_0x0065
            java.lang.String r3 = "editInfo"
            java.lang.String r6 = r6.getStringExtra(r3)
            if (r6 != 0) goto L_0x0067
        L_0x0065:
            java.lang.String r6 = ""
        L_0x0067:
            r5.f88059b = r6
            java.lang.Integer r6 = r5.f88066j
            if (r6 != 0) goto L_0x006e
            goto L_0x00ad
        L_0x006e:
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x00ad
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r6 = r5.mo72022a()
            r3 = 2132545287(0x7f1c0f07, float:2.074376E38)
            java.lang.String r3 = r5.getString(r3)
            r6.setTitle(r3)
            android.widget.TextView r6 = r5.mo72024c()
            java.lang.String r3 = "mWordCountText"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r5.f88059b
            if (r4 == 0) goto L_0x009c
            int r0 = r4.length()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x009c:
            r3.append(r0)
            java.lang.String r0 = "/20"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.setText(r0)
        L_0x00ad:
            com.bytedance.ies.dmt.ui.widget.DmtEditText r6 = r5.mo72023b()
            java.lang.String r0 = r5.f88059b
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.setText(r0)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r6 = r5.mo72023b()
            java.lang.String r0 = r5.f88059b
            if (r0 != 0) goto L_0x00c3
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00c3:
            int r0 = r0.length()
            r6.setSelection(r0)
            java.lang.String r6 = r5.f88059b
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x00d8
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00d7
            goto L_0x00d8
        L_0x00d7:
            r2 = 0
        L_0x00d8:
            if (r2 == 0) goto L_0x00e8
            android.widget.ImageView r6 = r5.mo72025d()
            java.lang.String r0 = "mClearEditInfoImage"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            r0 = 8
            r6.setVisibility(r0)
        L_0x00e8:
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r6 = r5.mo72022a()
            java.lang.String r0 = "mTitleBar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            android.view.View r6 = r6.getRightView()
            java.lang.String r0 = "mTitleBar.rightView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            r6.setEnabled(r1)
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r6 = r5.mo72022a()
            java.lang.String r0 = "mTitleBar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            android.view.View r6 = r6.getRightView()
            java.lang.String r0 = "mTitleBar.rightView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            r0 = 1051595899(0x3eae147b, float:0.34)
            r6.setAlpha(r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r6 = r5.mo72026e()
            r0 = r5
            android.content.Context r0 = (android.content.Context) r0
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a.m21676a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = r0.mo19223a()
            r6.setBuilder(r0)
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar r6 = r5.mo72022a()
            com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$b r0 = new com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$b
            r0.<init>(r5)
            com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar$a r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a) r0
            r6.setOnTitlebarClickListener(r0)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r6 = r5.mo72023b()
            com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$c r0 = new com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$c
            r0.<init>(r5)
            android.text.TextWatcher r0 = (android.text.TextWatcher) r0
            r6.addTextChangedListener(r0)
            android.widget.ImageView r6 = r5.mo72025d()
            com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$d r0 = new com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$d
            r0.<init>(r5)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r6.setOnClickListener(r0)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r6 = r5.mo72023b()
            com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity$e r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.detail.EditGroupInfoActivity.C34063e.f88071a
            android.widget.TextView$OnEditorActionListener r0 = (android.widget.TextView.OnEditorActionListener) r0
            r6.setOnEditorActionListener(r0)
            java.lang.String r6 = "com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity"
            java.lang.String r0 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r6, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.EditGroupInfoActivity.onCreate(android.os.Bundle):void");
    }
}
