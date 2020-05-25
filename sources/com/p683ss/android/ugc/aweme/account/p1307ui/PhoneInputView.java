package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.account.login.model.C21386a;
import com.p683ss.android.ugc.aweme.account.login.model.C21386a.C21387a;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.MusCountryListActivity;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a.C20976a;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Locale;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52820l;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.ui.PhoneInputView */
public final class PhoneInputView extends LinearLayout implements C20976a {

    /* renamed from: a */
    public static final C22194a f59894a = new C22194a(null);

    /* renamed from: b */
    private static final C52820l f59895b = new C52820l("\\D+");

    /* renamed from: c */
    private static final C21386a f59896c = C21386a.f58037e;

    /* renamed from: d */
    private HashMap f59897d;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.PhoneInputView$a */
    public static final class C22194a {
        private C22194a() {
        }

        public /* synthetic */ C22194a(C52707g gVar) {
            this();
        }
    }

    public PhoneInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private View m55023a(int i) {
        if (this.f59897d == null) {
            this.f59897d = new HashMap();
        }
        View view = (View) this.f59897d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f59897d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getCountryCode() {
        try {
            return Integer.parseInt(getCountryCodeString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final EditText getEditText() {
        return ((InputWithIndicator) m55023a((int) R.id.e3x)).getEditText();
    }

    public final String getFullPhoneNumber() {
        String a = C21134a.m53619a(getPhoneNumberObject());
        C52711k.m112236a((Object) a, "PhoneNumberUtil.formatNu…r(getPhoneNumberObject())");
        return a;
    }

    public final InputWithIndicator getInputView() {
        InputWithIndicator inputWithIndicator = (InputWithIndicator) m55023a((int) R.id.e3x);
        C52711k.m112236a((Object) inputWithIndicator, "country_code_phone_input");
        return inputWithIndicator;
    }

    public final long getPhoneNumber() {
        try {
            return Long.parseLong(getPhoneNumberString());
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final String getPhoneNumberString() {
        return ((InputWithIndicator) m55023a((int) R.id.e3x)).getText();
    }

    public final C21135a getPhoneNumberObject() {
        C21135a create = C21135a.create(getCountryCode(), getPhoneNumber());
        C52711k.m112236a((Object) create, "PhoneNumberUtil.PhoneNum…Code(), getPhoneNumber())");
        return create;
    }

    public final String getCountryCodeString() {
        DmtTextView dmtTextView = (DmtTextView) m55023a((int) R.id.e3v);
        C52711k.m112236a((Object) dmtTextView, "country_code_dd_number");
        CharSequence text = dmtTextView.getText();
        if (text != null) {
            String replace = f59895b.replace(text, "");
            if (replace != null) {
                return replace;
            }
        }
        return "";
    }

    public final String getCountryName() {
        DmtTextView dmtTextView = (DmtTextView) m55023a((int) R.id.e3u);
        C52711k.m112236a((Object) dmtTextView, "country_code_dd_name");
        CharSequence text = dmtTextView.getText();
        if (text != null) {
            String obj = text.toString();
            if (obj != null) {
                if (obj != null) {
                    String obj2 = C52830p.m112447b(obj).toString();
                    if (obj2 != null) {
                        return obj2;
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
        }
        return "";
    }

    /* renamed from: a */
    public final void mo46309a() {
        boolean z;
        boolean z2;
        Object systemService = getContext().getSystemService("phone");
        if (systemService != null) {
            String simCountryIso = ((TelephonyManager) systemService).getSimCountryIso();
            CharSequence charSequence = simCountryIso;
            boolean z3 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Locale locale = Locale.getDefault();
                C52711k.m112236a((Object) locale, "Locale.getDefault()");
                simCountryIso = locale.getCountry();
            }
            CharSequence charSequence2 = simCountryIso;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setCountry(f59896c);
                return;
            }
            for (C21386a aVar : C21387a.m54009a()) {
                if (C52830p.m112406a(aVar.f58043c, simCountryIso, true)) {
                    setCountry(aVar);
                    z3 = true;
                }
            }
            if (!z3) {
                setCountry(f59896c);
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.telephony.TelephonyManager");
    }

    /* renamed from: a */
    public final void mo44974a(C21386a aVar) {
        setCountry(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        if (r0 == null) goto L_0x0006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r2 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setCountry(com.p683ss.android.ugc.aweme.account.login.model.C21386a r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0006
            java.lang.String r0 = r2.f58044d
            if (r0 != 0) goto L_0x0008
        L_0x0006:
            java.lang.String r0 = ""
        L_0x0008:
            r1.setCountryCode(r0)
            if (r2 == 0) goto L_0x0011
            java.lang.String r2 = r2.f58043c
            if (r2 != 0) goto L_0x0013
        L_0x0011:
            java.lang.String r2 = ""
        L_0x0013:
            r1.setCountryName(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.p1307ui.PhoneInputView.setCountry(com.ss.android.ugc.aweme.account.login.model.a):void");
    }

    public final void setCountryCode(String str) {
        C52711k.m112240b(str, "code");
        DmtTextView dmtTextView = (DmtTextView) m55023a((int) R.id.e3v);
        C52711k.m112236a((Object) dmtTextView, "country_code_dd_number");
        dmtTextView.setText(str);
    }

    public final void setCountryName(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        DmtTextView dmtTextView = (DmtTextView) m55023a((int) R.id.e3u);
        C52711k.m112236a((Object) dmtTextView, "country_code_dd_name");
        dmtTextView.setText(str);
    }

    public final void setPhoneNumber(String str) {
        C52711k.m112240b(str, "number");
        ((InputWithIndicator) m55023a((int) R.id.e3x)).setText(str);
    }

    public PhoneInputView(final Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View.inflate(context, R.layout.b17, this);
        C10705c.m21579a((LinearLayout) m55023a((int) R.id.eok));
        C20975a.m53338a((C20976a) this);
        ((LinearLayout) m55023a((int) R.id.eok)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                context.startActivity(new Intent(context, MusCountryListActivity.class));
            }
        });
    }

    public /* synthetic */ PhoneInputView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
