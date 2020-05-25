package com.p683ss.android.ugc.aweme.profile.p2085c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1411c.C23485d;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.c.c */
public final class C39819c extends C39807a implements TextWatcher, OnGlobalLayoutListener, C39985s {

    /* renamed from: e */
    public static final C39820a f101614e = new C39820a(null);

    /* renamed from: d */
    public EditText f101615d;

    /* renamed from: f */
    private final int f101616f = C23728o.m58241a(229.0d);

    /* renamed from: g */
    private final String f101617g = "guide_profile_name";

    /* renamed from: h */
    private DmtTextView f101618h;

    /* renamed from: i */
    private View f101619i;

    /* renamed from: j */
    private DmtStatusView f101620j;

    /* renamed from: k */
    private View f101621k;

    /* renamed from: l */
    private final Rect f101622l = new Rect();

    /* renamed from: m */
    private final int f101623m = C23728o.m58241a(80.0d);

    /* renamed from: n */
    private final C39954ad f101624n;

    /* renamed from: o */
    private final String f101625o;

    /* renamed from: p */
    private HashMap f101626p;

    /* renamed from: com.ss.android.ugc.aweme.profile.c.c$a */
    public static final class C39820a {
        private C39820a() {
        }

        /* renamed from: a */
        private static C39819c m88563a() {
            return new C39819c();
        }

        public /* synthetic */ C39820a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo80907a(C0654k kVar, Bundle bundle) {
            C52711k.m112240b(kVar, "fragmentManager");
            Fragment a = kVar.mo2224a("ProfileGuideFillNicknameDialogFragment");
            if (!(a instanceof C39819c)) {
                a = null;
            }
            C39819c cVar = (C39819c) a;
            if (cVar == null) {
                cVar = m88563a();
            }
            if (bundle != null) {
                cVar.setArguments(bundle);
            }
            if (!cVar.isAdded()) {
                kVar.mo2225a().mo2178a((Fragment) cVar, "ProfileGuideFillNicknameDialogFragment").mo2195c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.c.c$b */
    static final class C39821b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39819c f101627a;

        C39821b(C39819c cVar) {
            this.f101627a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            C39819c cVar = this.f101627a;
            String b = cVar.mo80887b();
            C23089d a = C23089d.m56640a().mo47829a("event_type", "save");
            String str2 = "enter_from";
            Bundle arguments = cVar.getArguments();
            String str3 = null;
            if (arguments != null) {
                str = arguments.getString("enter_from");
            } else {
                str = null;
            }
            C23089d a2 = a.mo47829a(str2, str);
            String str4 = "enter_method";
            Bundle arguments2 = cVar.getArguments();
            if (arguments2 != null) {
                str3 = arguments2.getString("enter_method");
            }
            C26890h.m65011a(b, a2.mo47829a(str4, str3).f61491a);
            this.f101627a.mo80904g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.c.c$c */
    static final class C39822c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39819c f101628a;

        C39822c(C39819c cVar) {
            this.f101628a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            C39819c cVar = this.f101628a;
            String b = cVar.mo80887b();
            C23089d a = C23089d.m56640a().mo47829a("event_type", "abandon");
            String str2 = "enter_from";
            Bundle arguments = cVar.getArguments();
            String str3 = null;
            if (arguments != null) {
                str = arguments.getString("enter_from");
            } else {
                str = null;
            }
            C23089d a2 = a.mo47829a(str2, str);
            String str4 = "enter_method";
            Bundle arguments2 = cVar.getArguments();
            if (arguments2 != null) {
                str3 = arguments2.getString("enter_method");
            }
            C26890h.m65011a(b, a2.mo47829a(str4, str3).f61491a);
            this.f101628a.dismiss(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.c.c$d */
    static final class C39823d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39819c f101629a;

        C39823d(C39819c cVar) {
            this.f101629a = cVar;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C39819c cVar = this.f101629a;
            String b = cVar.mo80887b();
            C23089d a = C23089d.m56640a().mo47829a("event_type", "finish");
            String str2 = "enter_from";
            Bundle arguments = cVar.getArguments();
            String str3 = null;
            if (arguments != null) {
                str = arguments.getString("enter_from");
            } else {
                str = null;
            }
            C23089d a2 = a.mo47829a(str2, str);
            String str4 = "enter_method";
            Bundle arguments2 = cVar.getArguments();
            if (arguments2 != null) {
                str3 = arguments2.getString("enter_method");
            }
            C26890h.m65011a(b, a2.mo47829a(str4, str3).f61491a);
            this.f101629a.mo80904g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.c.c$e */
    static final class C39824e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39819c f101630a;

        C39824e(C39819c cVar) {
            this.f101630a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C39819c.m88552a(this.f101630a).setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.c.c$f */
    static final class C39825f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39819c f101631a;

        C39825f(C39819c cVar) {
            this.f101631a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            KeyboardUtils.m58184c(C39819c.m88552a(this.f101631a));
        }
    }

    /* renamed from: a */
    public final int mo80886a() {
        return this.f101616f;
    }

    /* renamed from: b */
    public final String mo80887b() {
        return this.f101617g;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: f */
    public final void mo80893f() {
        if (this.f101626p != null) {
            this.f101626p.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo80893f();
    }

    public final void onPause() {
        super.onPause();
        View view = this.f101621k;
        if (view == null) {
            C52711k.m112237a("mRootLayout");
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public final void onResume() {
        super.onResume();
        View view = this.f101621k;
        if (view == null) {
            C52711k.m112237a("mRootLayout");
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    /* renamed from: c */
    public final void mo80889c() {
        super.mo80889c();
        View view = this.f101621k;
        if (view == null) {
            C52711k.m112237a("mRootLayout");
        }
        view.getWindowVisibleDisplayFrame(this.f101622l);
        EditText editText = this.f101615d;
        if (editText == null) {
            C52711k.m112237a("mNickname");
        }
        editText.requestFocus();
        EditText editText2 = this.f101615d;
        if (editText2 == null) {
            C52711k.m112237a("mNickname");
        }
        KeyboardUtils.m58183b(editText2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo80892e() {
        String str;
        String str2 = "enter_profile_name";
        C23089d a = C23089d.m56640a().mo47829a("event_type", "exit");
        String str3 = "enter_from";
        Bundle arguments = getArguments();
        String str4 = null;
        if (arguments != null) {
            str = arguments.getString("enter_from");
        } else {
            str = null;
        }
        C23089d a2 = a.mo47829a(str3, str);
        String str5 = "enter_method";
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str4 = arguments2.getString("enter_method");
        }
        C26890h.m65011a(str2, a2.mo47829a(str5, str4).f61491a);
    }

    /* renamed from: g */
    public final void mo80904g() {
        EditText editText = this.f101615d;
        if (editText == null) {
            C52711k.m112237a("mNickname");
        }
        String obj = editText.getText().toString();
        DmtStatusView dmtStatusView = this.f101620j;
        if (dmtStatusView == null) {
            C52711k.m112237a("mStatusView");
        }
        dmtStatusView.mo19212f();
        this.f101624n.mo81851a(obj);
    }

    public final void onGlobalLayout() {
        boolean z;
        Rect rect = new Rect();
        View view = this.f101621k;
        if (view == null) {
            C52711k.m112237a("mRootLayout");
        }
        view.getWindowVisibleDisplayFrame(rect);
        if (this.f101622l.bottom - rect.bottom > this.f101623m) {
            z = true;
        } else {
            z = false;
        }
        this.f101588b = !z;
    }

    public C39819c() {
        C39954ad adVar = new C39954ad();
        adVar.mo81850a((C39985s) this);
        this.f101624n = adVar;
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        User curUser = g.getCurUser();
        C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
        this.f101625o = curUser.getNickname();
    }

    public final void dismiss() {
        DmtTextView dmtTextView = this.f101618h;
        if (dmtTextView == null) {
            C52711k.m112237a("mAction");
        }
        if (!dmtTextView.isEnabled()) {
            dismiss(true);
            return;
        }
        Dialog b = new C10643a(getContext()).mo18886a((int) R.string.d_1, (OnClickListener) new C39821b(this)).mo18900b((int) R.string.b8q, (OnClickListener) new C39822c(this)).mo18899b((int) R.string.d_b).mo18896a(false).mo18897a().mo18882b();
        b.setCancelable(false);
        b.setCanceledOnTouchOutside(false);
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m88552a(C39819c cVar) {
        EditText editText = cVar.f101615d;
        if (editText == null) {
            C52711k.m112237a("mNickname");
        }
        return editText;
    }

    /* renamed from: a */
    public final void mo54362a(boolean z) {
        if (this.f101587a) {
            DmtStatusView dmtStatusView = this.f101620j;
            if (dmtStatusView == null) {
                C52711k.m112237a("mStatusView");
            }
            dmtStatusView.mo19209d();
        }
    }

    /* access modifiers changed from: protected */
    public final void dismiss(boolean z) {
        EditText editText = this.f101615d;
        if (editText == null) {
            C52711k.m112237a("mNickname");
        }
        KeyboardUtils.m58184c(editText);
        super.dismiss(z);
    }

    public final void afterTextChanged(Editable editable) {
        boolean z;
        CharSequence charSequence = editable;
        int i = 0;
        boolean z2 = true;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = !C52711k.m112239a((Object) this.f101625o, (Object) String.valueOf(editable));
        DmtTextView dmtTextView = this.f101618h;
        if (dmtTextView == null) {
            C52711k.m112237a("mAction");
        }
        if (z || !z3) {
            z2 = false;
        }
        dmtTextView.setEnabled(z2);
        View view = this.f101619i;
        if (view == null) {
            C52711k.m112237a("mClear");
        }
        if (z) {
            i = 4;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        mo80888b(true);
        if (this.f101587a) {
            DmtStatusView dmtStatusView = this.f101620j;
            if (dmtStatusView == null) {
                C52711k.m112237a("mStatusView");
            }
            dmtStatusView.mo19209d();
        }
        dismiss(false);
        if (i == 0) {
            C47718bf.m103288a(new C23485d());
        }
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        mo80888b(false);
        if (this.f101587a) {
            DmtStatusView dmtStatusView = this.f101620j;
            if (dmtStatusView == null) {
                C52711k.m112237a("mStatusView");
            }
            dmtStatusView.mo19209d();
        }
        if (i != 116) {
            C22971a.m56494a(getContext(), exc, R.string.czy);
        }
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
        mo80888b(false);
        if (this.f101587a) {
            DmtStatusView dmtStatusView = this.f101620j;
            if (dmtStatusView == null) {
                C52711k.m112237a("mStatusView");
            }
            dmtStatusView.mo19209d();
        }
        if (!TextUtils.isEmpty(str)) {
            Context context = getContext();
            if (context == null) {
                context = C11010c.m22280a();
            }
            C10691a.m21545b(context, str).mo19066a();
            if (z) {
                dismiss(false);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.b9e);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.layout_root)");
        this.f101621k = findViewById;
        View findViewById2 = view.findViewById(R.id.a2);
        C52711k.m112236a((Object) findViewById2, "rootView.findViewById(R.id.action)");
        this.f101618h = (DmtTextView) findViewById2;
        DmtTextView dmtTextView = this.f101618h;
        if (dmtTextView == null) {
            C52711k.m112237a("mAction");
        }
        dmtTextView.setOnClickListener(new C39823d(this));
        View findViewById3 = view.findViewById(R.id.to);
        C52711k.m112236a((Object) findViewById3, "rootView.findViewById(R.id.clear)");
        this.f101619i = findViewById3;
        View view2 = this.f101619i;
        if (view2 == null) {
            C52711k.m112237a("mClear");
        }
        view2.setOnClickListener(new C39824e(this));
        View findViewById4 = view.findViewById(R.id.bqr);
        C52711k.m112236a((Object) findViewById4, "rootView.findViewById(R.id.nickname)");
        this.f101615d = (EditText) findViewById4;
        EditText editText = this.f101615d;
        if (editText == null) {
            C52711k.m112237a("mNickname");
        }
        editText.addTextChangedListener(this);
        View findViewById5 = view.findViewById(R.id.b7b);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new C39825f(this));
        }
        View findViewById6 = view.findViewById(R.id.csv);
        C52711k.m112236a((Object) findViewById6, "rootView.findViewById(R.id.status_view)");
        this.f101620j = (DmtStatusView) findViewById6;
        DmtStatusView dmtStatusView = this.f101620j;
        if (dmtStatusView == null) {
            C52711k.m112237a("mStatusView");
        }
        dmtStatusView.setBuilder(C10719a.m21676a(getContext()));
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("show_type");
        } else {
            str = null;
        }
        if (C52711k.m112239a((Object) str, (Object) "show_type_profile_post_guide")) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (!g.getCurUser().nicknameUpdateReminder()) {
                ((TextView) view.findViewById(R.id.title)).setText(R.string.h52);
                EditText editText2 = this.f101615d;
                if (editText2 == null) {
                    C52711k.m112237a("mNickname");
                }
                IAccountUserService g2 = C20854a.m53167g();
                C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
                User curUser = g2.getCurUser();
                C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
                editText2.setText(curUser.getNickname());
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b9d, viewGroup, false);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f101615d;
        if (editText == null) {
            C52711k.m112237a("mNickname");
        }
        Editable text = editText.getText();
        if (text.length() > 20) {
            C10691a.m21545b(getActivity(), getString(R.string.c59, "20")).mo19066a();
            int selectionEnd = Selection.getSelectionEnd(text);
            String obj = text.toString();
            if (obj != null) {
                String substring = obj.substring(0, 20);
                C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                EditText editText2 = this.f101615d;
                if (editText2 == null) {
                    C52711k.m112237a("mNickname");
                }
                editText2.setText(substring);
                EditText editText3 = this.f101615d;
                if (editText3 == null) {
                    C52711k.m112237a("mNickname");
                }
                Editable text2 = editText3.getText();
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
