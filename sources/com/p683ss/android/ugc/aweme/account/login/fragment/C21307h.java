package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13106e;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13128e;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.google.p1057b.p1060c.C17666bt;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.api.p1266b.C20900b;
import com.p683ss.android.ugc.aweme.account.base.C20916a;
import com.p683ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p683ss.android.ugc.aweme.account.login.bean.EmailExistBean;
import com.p683ss.android.ugc.aweme.account.login.model.C21386a;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21109n;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21120y;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21568ah.C21569a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.MusCountryListActivity;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.MusRegisterTabLayout;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.MusRegisterTabLayout.C21535a;
import com.p683ss.android.ugc.aweme.account.login.sms.C21460a;
import com.p683ss.android.ugc.aweme.account.login.view.C22023a;
import com.p683ss.android.ugc.aweme.account.login.view.C22023a.C22025b;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a.C20976a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import com.p683ss.android.ugc.aweme.account.p1302o.C22097f;
import com.p683ss.android.ugc.aweme.account.shortvideo.p1306ui.PressFadeLinearLayout;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.util.C22271m.C22273a;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.account.utils.C22299f;
import com.p683ss.android.ugc.aweme.account.utils.C22305k;
import com.p683ss.android.ugc.aweme.account.views.C22311a;
import com.p683ss.android.ugc.aweme.account.views.C22313c;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.ss.android.ugc.trill.R;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.h */
public abstract class C21307h extends C21168a implements C20976a, C21109n {

    /* renamed from: A */
    public String f57870A;

    /* renamed from: B */
    public String f57871B;

    /* renamed from: C */
    public String f57872C;

    /* renamed from: D */
    C21460a f57873D;

    /* renamed from: E */
    C22023a f57874E;

    /* renamed from: F */
    public boolean f57875F = false;

    /* renamed from: G */
    private ViewGroup f57876G;

    /* renamed from: H */
    private ViewGroup f57877H;

    /* renamed from: I */
    private TextView f57878I;

    /* renamed from: J */
    private PressFadeLinearLayout f57879J;

    /* renamed from: K */
    private View f57880K;

    /* renamed from: L */
    private Boolean f57881L = Boolean.valueOf(false);

    /* renamed from: M */
    private C13011d f57882M;

    /* renamed from: O */
    private OnFocusChangeListener f57883O = new OnFocusChangeListener() {
        public final void onFocusChange(View view, boolean z) {
            int i = 0;
            if (view.getId() == R.id.ac1) {
                ImageView imageView = C21307h.this.f57896y;
                if (!z || TextUtils.isEmpty(C21307h.this.f57888q.getText())) {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
            }
            if (view.getId() == R.id.abm) {
                ImageView imageView2 = C21307h.this.f57895x;
                if (!z || TextUtils.isEmpty(C21307h.this.f57887p.getText())) {
                    i = 8;
                }
                imageView2.setVisibility(i);
            }
        }
    };

    /* renamed from: P */
    private int f57884P = 0;

    /* renamed from: Q */
    private int f57885Q = 0;

    /* renamed from: o */
    public MusRegisterTabLayout f57886o;

    /* renamed from: p */
    public EditText f57887p;

    /* renamed from: q */
    public EditText f57888q;

    /* renamed from: r */
    public View f57889r;

    /* renamed from: s */
    public LoginButton f57890s;

    /* renamed from: t */
    public TextView f57891t;

    /* renamed from: u */
    public TextView f57892u;

    /* renamed from: v */
    public View f57893v;

    /* renamed from: w */
    public TextView f57894w;

    /* renamed from: x */
    public ImageView f57895x;

    /* renamed from: y */
    public ImageView f57896y;

    /* renamed from: z */
    public MusRegisterTabLayout f57897z;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return false;
    }

    /* renamed from: i */
    public abstract void mo45372i();

    /* renamed from: j */
    public abstract void mo45373j();

    public void onDestroyView() {
        super.onDestroyView();
    }

    /* renamed from: a */
    public final void mo45160a() {
        this.f57890s.mo45160a();
    }

    /* renamed from: c */
    public final void mo45161c() {
        this.f57890s.mo45161c();
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m58184c(this.f57888q);
    }

    public void onStart() {
        super.onStart();
        this.f57888q.postDelayed(new Runnable() {
            public final void run() {
                C21307h.this.mo45322a((View) C21307h.this.f57888q);
            }
        }, 500);
    }

    public void onStop() {
        super.onStop();
        this.f57873D.mo45643b();
    }

    /* renamed from: n */
    private boolean m53896n() {
        C21569a aVar;
        if (this.f57511d == null) {
            aVar = null;
        } else {
            aVar = this.f57511d.mo45024a(0);
        }
        if (aVar == null || !TextUtils.equals(m53897o(), aVar.f58505a) || aVar.f58506b.f60053c == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private String m53897o() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57891t.getText().toString());
        sb.append("-");
        sb.append(this.f57888q.getText().toString());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo45452l() {
        if (this.f57881L.booleanValue()) {
            C26890h.m65011a("register_switch_email", new C20856a().f56798a);
        } else {
            this.f57881L = Boolean.valueOf(true);
        }
        this.f57876G.setVisibility(8);
        this.f57877H.setVisibility(0);
        this.f57890s.setEnabled(!TextUtils.isEmpty(this.f57887p.getText()));
        this.f57887p.requestFocus();
        mo45322a((View) this.f57887p);
        if (this.f57511d != null) {
            this.f57511d.mo45034c(1);
        }
        m53894c(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo45453m() {
        if (this.f57881L.booleanValue()) {
            C26890h.m65011a("register_switch_phone", new C20856a().f56798a);
        } else {
            this.f57881L = Boolean.valueOf(true);
        }
        this.f57876G.setVisibility(0);
        this.f57877H.setVisibility(8);
        this.f57890s.setEnabled(!TextUtils.isEmpty(this.f57888q.getText()));
        this.f57888q.requestFocus();
        mo45322a((View) this.f57888q);
        if (this.f57511d != null) {
            this.f57511d.mo45034c(0);
        }
        m53894c(true);
    }

    /* renamed from: k */
    public final void mo45451k() {
        String string;
        String string2;
        C26890h.m65011a("register_click_next", new C20856a().mo44776a("platform", "phone").f56798a);
        if (C22305k.m55195a(this.f57891t.getText().toString())) {
            if (getContext() != null) {
                boolean b = C22305k.m55196b(this.f57891t.getText().toString());
                String string3 = getString(R.string.dd7);
                StringBuilder sb = new StringBuilder();
                sb.append(this.f57870A);
                sb.append(" ");
                sb.append(this.f57872C);
                String string4 = getString(R.string.dd4, sb.toString());
                if (b) {
                    string = getString(R.string.dd6);
                } else {
                    string = getString(R.string.dd5);
                }
                String str = string;
                if (b) {
                    string2 = getString(R.string.dd5);
                } else {
                    string2 = getString(R.string.dd6);
                }
                String str2 = string2;
                String str3 = this.f57516n;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f57870A);
                sb2.append(" ");
                sb2.append(this.f57872C);
                C22025b bVar = new C22025b(string3, string4, str, str2, str3, sb2.toString());
                this.f57874E = new C22023a(getContext(), bVar);
                this.f57874E.f59502a = new C21324j(this);
                this.f57874E.f59503b = new C21325k(this, b);
                this.f57874E.f59504c = new C21326l(this, b);
                C47700ay.m103235a(this.f57874E);
            }
        } else if (m53896n()) {
            C21168a aVar = (C21168a) C22271m.m55124a(C21227aw.class, getArguments()).mo46372a("country_code_alpha_2", this.f57892u.getText().toString()).mo46372a("country_code", this.f57891t.getText().toString()).mo46372a("phone_number", this.f57888q.getText().toString()).mo46373a("from_register", true).mo46373a("use_whatsapp_code", C22305k.m55199e(m53897o())).mo46370a();
            aVar.mo45323a(this.f57511d);
            mo45321a((Fragment) aVar, false);
        } else {
            m53893a(false, true);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57873D = new C21460a(this, this.f57515m);
        this.f57873D.mo45640a();
        this.f57881L = Boolean.valueOf(false);
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (!(bundle == null || this.f57886o.getCurrentPage() != 0 || C20975a.m53336a() == null)) {
            mo44974a(C20975a.m53336a());
        }
    }

    /* renamed from: a */
    public final void mo44974a(C21386a aVar) {
        if (aVar != null) {
            String str = aVar.f58044d;
            if (!TextUtils.isEmpty(str) && !str.startsWith("+")) {
                StringBuilder sb = new StringBuilder("+");
                sb.append(str);
                str = sb.toString();
            }
            this.f57891t.setText(str);
            this.f57892u.setText(aVar.f58043c);
        }
    }

    /* renamed from: c */
    private void m53894c(boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sb = new StringBuilder();
        sb.append(C23723j.m58219b(R.string.cbn));
        sb.append(" ");
        String sb2 = sb.toString();
        String b = C23723j.m58219b(R.string.cbo);
        StringBuilder sb3 = new StringBuilder(" ");
        sb3.append(C23723j.m58219b(R.string.cbp));
        sb3.append(" ");
        String sb4 = sb3.toString();
        String b2 = C23723j.m58219b(R.string.cbq);
        spannableStringBuilder.append(sb2).append(b);
        spannableStringBuilder.append(sb4).append(b2);
        if (z) {
            spannableStringBuilder.append(" ").append(C23723j.m58219b(R.string.cch));
        }
        int color = getContext().getResources().getColor(R.color.j6);
        int color2 = getContext().getResources().getColor(R.color.up);
        spannableStringBuilder.setSpan(new C22313c(color, color2) {
            public final void onClick(View view) {
                C21307h.this.mo45373j();
            }
        }, sb2.length(), sb2.length() + b.length(), 34);
        spannableStringBuilder.setSpan(new C22313c(color, color2) {
            public final void onClick(View view) {
                C21307h.this.mo45372i();
            }
        }, sb2.length() + b.length() + sb4.length(), sb2.length() + b.length() + sb4.length() + b2.length(), 34);
        this.f57878I.setHighlightColor(C23723j.m58216a(17170445));
        this.f57878I.setText(spannableStringBuilder);
        this.f57878I.setMovementMethod(C22311a.m55214a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0092  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m53895d(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.m53896n()
            r1 = 0
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r5.m53897o()
            boolean r0 = com.p683ss.android.ugc.aweme.account.utils.C22305k.m55199e(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0014
            if (r6 != 0) goto L_0x0020
        L_0x0014:
            java.lang.String r0 = r5.m53897o()
            boolean r0 = com.p683ss.android.ugc.aweme.account.utils.C22305k.m55199e(r0)
            if (r0 != 0) goto L_0x0083
            if (r6 != 0) goto L_0x0083
        L_0x0020:
            java.lang.Class<com.ss.android.ugc.aweme.account.login.fragment.aw> r0 = com.p683ss.android.ugc.aweme.account.login.fragment.C21227aw.class
            android.os.Bundle r3 = r5.getArguments()
            com.ss.android.ugc.aweme.account.util.m$a r0 = com.p683ss.android.ugc.aweme.account.util.C22271m.m55124a(r0, r3)
            java.lang.String r3 = "country_code_alpha_2"
            android.widget.TextView r4 = r5.f57892u
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            com.ss.android.ugc.aweme.account.util.m$a r0 = r0.mo46372a(r3, r4)
            java.lang.String r3 = "country_code"
            android.widget.TextView r4 = r5.f57891t
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            com.ss.android.ugc.aweme.account.util.m$a r0 = r0.mo46372a(r3, r4)
            java.lang.String r3 = "phone_number"
            android.widget.EditText r4 = r5.f57888q
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            com.ss.android.ugc.aweme.account.util.m$a r0 = r0.mo46372a(r3, r4)
            java.lang.String r3 = "from_register"
            com.ss.android.ugc.aweme.account.util.m$a r0 = r0.mo46373a(r3, r2)
            java.lang.String r3 = "use_whatsapp_code"
            java.lang.String r4 = r5.m53897o()
            boolean r4 = com.p683ss.android.ugc.aweme.account.utils.C22305k.m55199e(r4)
            com.ss.android.ugc.aweme.account.util.m$a r0 = r0.mo46373a(r3, r4)
            java.lang.String r3 = "from_choose_dialog"
            com.ss.android.ugc.aweme.account.util.m$a r0 = r0.mo46373a(r3, r2)
            android.support.v4.app.Fragment r0 = r0.mo46370a()
            com.ss.android.ugc.aweme.account.login.fragment.a r0 = (com.p683ss.android.ugc.aweme.account.login.fragment.C21168a) r0
            com.ss.android.ugc.aweme.account.login.fragment.n r2 = r5.f57511d
            r0.mo45323a(r2)
            r5.mo45321a(r0, r1)
            goto L_0x0088
        L_0x0083:
            r5.f57875F = r2
        L_0x0085:
            r5.m53893a(r6, r1)
        L_0x0088:
            com.ss.android.ugc.aweme.account.login.view.a r0 = r5.f57874E
            com.p683ss.android.ugc.aweme.utils.C47700ay.m103236b(r0)
            if (r6 == 0) goto L_0x0092
            java.lang.String r6 = "phone_verification_click_whatsapp"
            goto L_0x0094
        L_0x0092:
            java.lang.String r6 = "phone_verification_click_sms"
        L_0x0094:
            com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
            r0.<init>()
            java.lang.String r1 = "enter_type"
            java.lang.String r2 = r5.f57516n
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.fragment.C21307h.m53895d(boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo45326b(boolean z) {
        if (this.f57885Q == 0) {
            this.f57885Q = this.f57886o.getBottom() - this.f57508a.getBottom();
        }
        if (this.f57884P == 0) {
            this.f57884P = this.f57886o.getTop() - this.f57508a.getBottom();
        }
        if (!z) {
            this.f57897z.animate().alpha(0.0f).setDuration(110).start();
            this.f57886o.animate().translationY(0.0f).alpha(1.0f).setStartDelay(110).setDuration(220).start();
            this.f57880K.animate().translationY(0.0f).setStartDelay(110).setDuration(220).start();
        } else if (this.f57890s.getTop() - this.f57880K.getBottom() <= f57506j) {
            this.f57897z.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57886o.animate().translationY((float) (-this.f57884P)).alpha(0.0f).setDuration(220).start();
            this.f57880K.animate().translationY((float) (-this.f57885Q)).setDuration(220).start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo45450b(boolean z, View view) {
        m53895d(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo45449a(boolean z, View view) {
        m53895d(!z);
    }

    /* renamed from: a */
    private void m53893a(final boolean z, final boolean z2) {
        String str;
        String str2;
        mo45161c();
        if (z) {
            str = "send_whatsapp_code";
        } else {
            str = "send_sms";
        }
        C20856a aVar = new C20856a();
        String str3 = "send_method";
        if (z2) {
            str2 = "auto_system";
        } else {
            str2 = "user_click";
        }
        C26890h.m65011a(str, aVar.mo44776a(str3, str2).mo44774a("send_reason", C22165u.f59781u).mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).f56798a);
        C213207 r10 = new C21120y(this) {
            /* renamed from: c */
            public final void onNeedSecureCaptcha(C12993e<C13120s> eVar) {
                super.onNeedSecureCaptcha(eVar);
                if (z) {
                    C22097f.m54900b(1, C22165u.f59781u, eVar.f34000c, eVar.f34001d);
                } else if (z2) {
                    C22097f.m54898a(1, C22165u.f59781u, eVar.f34000c, eVar.f34001d);
                } else {
                    C22097f.m54899a(1, C22165u.f59781u, eVar.f34000c, eVar.f34001d, "choose_dialog");
                }
                if (C21307h.this.isViewValid()) {
                    C21307h.this.mo45160a();
                    C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "phone").mo44774a("is_success", 0).mo44774a("error_code", eVar.f34000c).mo44776a("error_desc", eVar.f34001d).mo44774a("is_register", 1).f56798a);
                    C21307h.this.f57875F = false;
                }
            }

            /* renamed from: b */
            public final void mo45170b(C12993e<C13120s> eVar) {
                if (z) {
                    C22097f.m54900b(1, C22165u.f59781u, eVar.f34000c, eVar.f34001d);
                } else if (z2) {
                    C22097f.m54898a(1, C22165u.f59781u, eVar.f34000c, eVar.f34001d);
                } else {
                    C22097f.m54899a(1, C22165u.f59781u, eVar.f34000c, eVar.f34001d, "choose_dialog");
                }
                if (C21307h.this.isViewValid() && C21307h.this.getContext() != null) {
                    C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "phone").mo44774a("is_success", 0).mo44774a("error_code", eVar.f34000c).mo44776a("error_desc", eVar.f34001d).mo44774a("is_register", 1).f56798a);
                    if (eVar.f34000c == 1002 || eVar.f34000c == 1003) {
                        C21307h.this.f57893v.setVisibility(0);
                        C21307h.this.f57894w.setText(R.string.ca7);
                        C21307h.this.f57889r.setBackgroundColor(C21307h.this.getResources().getColor(R.color.xn));
                    } else if (eVar.f34000c == 1001) {
                        C10691a.m21542b((Context) C23826bi.m58460b(), (int) R.string.coj).mo19066a();
                    } else {
                        C10691a.m21545b((Context) C23826bi.m58460b(), C22275o.m55130a((C12990b) eVar)).mo19066a();
                    }
                    C21307h.this.mo45160a();
                    C21307h.this.f57875F = false;
                }
            }

            public final void onSuccess(C12993e<C13120s> eVar) {
                if (z) {
                    C22097f.m54900b(0, C22165u.f59781u, 0, "");
                } else if (z2) {
                    C22097f.m54898a(0, C22165u.f59781u, 0, "");
                } else {
                    C22097f.m54899a(0, C22165u.f59781u, 0, "", "choose_dialog");
                }
                if (C21307h.this.isViewValid() && C21307h.this.getContext() != null) {
                    C21307h.this.mo45160a();
                    C21307h.this.f57893v.setVisibility(8);
                    C21307h.this.f57889r.setBackgroundColor(C21307h.this.getResources().getColor(R.color.a3v));
                    C22273a a = C22271m.m55124a(C21227aw.class, C21307h.this.getArguments()).mo46372a("country_code_alpha_2", C21307h.this.f57892u.getText().toString()).mo46372a("country_code", C21307h.this.f57891t.getText().toString()).mo46372a("phone_number", C21307h.this.f57888q.getText().toString());
                    a.f60042a.putLong("sms_have_send_time", 60);
                    C21168a aVar = (C21168a) a.mo46373a("from_register", true).mo46373a("use_whatsapp_code", z).mo46373a("from_choose_dialog", !z2).mo46373a("reset_ticker", C21307h.this.f57875F).mo46370a();
                    if (aVar != null) {
                        C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "phone").mo44774a("is_success", 1).mo44774a("is_register", 1).f56798a);
                    }
                    aVar.mo45323a(C21307h.this.f57511d);
                    C21307h.this.mo45321a((Fragment) aVar, false);
                    C21307h.this.f57875F = false;
                }
            }

            /* renamed from: a */
            public final void onNeedCaptcha(C12993e<C13120s> eVar, String str) {
                if (C21307h.this.isViewValid() && C21307h.this.getContext() != null) {
                    C21307h.this.mo45160a();
                    C21307h.this.f57893v.setVisibility(8);
                    C21307h.this.f57889r.setBackgroundColor(C21307h.this.getResources().getColor(R.color.a3v));
                    C21168a aVar = (C21168a) C22271m.m55124a(C21227aw.class, C21307h.this.getArguments()).mo46372a("country_code_alpha_2", C21307h.this.f57892u.getText().toString()).mo46372a("country_code", C21307h.this.f57891t.getText().toString()).mo46372a("phone_number", C21307h.this.f57888q.getText().toString()).mo46373a("from_register", true).mo46373a("reset_ticker", C21307h.this.f57875F).mo46370a();
                    if (aVar != null) {
                        C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "phone").mo44774a("is_success", 1).mo44774a("is_register", 1).f56798a);
                    }
                    aVar.mo45323a(C21307h.this.f57511d);
                    C21307h.this.mo45321a((Fragment) aVar, false);
                    C21307h.this.f57875F = false;
                }
            }
        };
        if (z) {
            FragmentActivity activity = getActivity();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57891t.getText().toString());
            sb.append(this.f57888q.getText().toString());
            C20900b.m53233a(activity, sb.toString(), "", C22165u.f59781u, 0, "", 0, C22299f.m55184a() ? 1 : 0, r10).mo24766d();
            return;
        }
        C13011d dVar = this.f57882M;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f57891t.getText().toString());
        sb2.append(this.f57888q.getText().toString());
        dVar.mo24611a(sb2.toString(), "", C22165u.f59781u, 0, "", 0, C22299f.m55184a() ? 1 : 0, (C13139p) r10);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57882M = C13081d.m26312a(getActivity());
        C20975a.m53338a((C20976a) this);
        this.f57886o = (MusRegisterTabLayout) view.findViewById(R.id.cwz);
        this.f57876G = (ViewGroup) view.findViewById(R.id.bxi);
        this.f57887p = (EditText) view.findViewById(R.id.abm);
        this.f57888q = (EditText) view.findViewById(R.id.ac1);
        this.f57889r = view.findViewById(R.id.acb);
        this.f57890s = (LoginButton) view.findViewById(R.id.o9);
        this.f57890s.setLoginBackgroundRes(R.drawable.cgr);
        this.f57890s.setLoadingBackground(R.drawable.ch1);
        this.f57878I = (TextView) view.findViewById(R.id.cy4);
        this.f57891t = (TextView) view.findViewById(R.id.a1f);
        this.f57879J = (PressFadeLinearLayout) view.findViewById(R.id.a1d);
        this.f57892u = (TextView) view.findViewById(R.id.a1e);
        this.f57893v = view.findViewById(R.id.dvn);
        this.f57894w = (TextView) view.findViewById(R.id.dvm);
        this.f57877H = (ViewGroup) view.findViewById(R.id.a_o);
        this.f57895x = (ImageView) view.findViewById(R.id.tt);
        this.f57896y = (ImageView) view.findViewById(R.id.u1);
        this.f57880K = view.findViewById(R.id.zr);
        this.f57897z = (MusRegisterTabLayout) view.findViewById(R.id.d3k);
        this.f57897z.setVisibility(0);
        this.f57886o.setVisibility(0);
        this.f57879J.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21307h.this.getActivity().startActivity(new Intent(C21307h.this.getActivity(), MusCountryListActivity.class));
            }
        });
        this.f57886o.setListener(new C21535a() {
            /* renamed from: a */
            public final void mo45455a() {
                C21307h.this.f57897z.setCurrentPageWithoutClick(0);
                C21307h.this.mo45453m();
            }

            /* renamed from: b */
            public final void mo45456b() {
                C21307h.this.f57897z.setCurrentPageWithoutClick(1);
                C21307h.this.mo45452l();
            }
        });
        this.f57897z.setListener(new C21535a() {
            /* renamed from: a */
            public final void mo45455a() {
                C21307h.this.f57886o.setCurrentPageWithoutClick(0);
                C21307h.this.mo45453m();
            }

            /* renamed from: b */
            public final void mo45456b() {
                C21307h.this.f57886o.setCurrentPageWithoutClick(1);
                C21307h.this.mo45452l();
            }
        });
        this.f57888q.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                int i;
                if (C21307h.this.f57886o.getCurrentPage() == 0) {
                    C21307h.this.f57890s.setEnabled(!TextUtils.isEmpty(C21307h.this.f57888q.getText()));
                    ImageView imageView = C21307h.this.f57896y;
                    if (!C21307h.this.f57888q.hasFocus() || TextUtils.isEmpty(editable.toString())) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    imageView.setVisibility(i);
                    if (TextUtils.isEmpty(editable.toString())) {
                        C21307h.this.f57893v.setVisibility(8);
                        C21307h.this.f57889r.setBackgroundColor(C21307h.this.getResources().getColor(R.color.j1));
                    }
                }
            }
        });
        this.f57888q.setOnFocusChangeListener(this.f57883O);
        this.f57887p.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                int i;
                if (C21307h.this.f57886o.getCurrentPage() == 1) {
                    C21307h.this.f57890s.setEnabled(Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", 2).matcher(C21307h.this.f57887p.getText().toString()).matches());
                    ImageView imageView = C21307h.this.f57895x;
                    if (!C21307h.this.f57887p.hasFocus() || TextUtils.isEmpty(editable.toString())) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    imageView.setVisibility(i);
                    if (TextUtils.isEmpty(editable.toString())) {
                        C21307h.this.f57893v.setVisibility(8);
                        C21307h.this.f57889r.setBackgroundColor(C21307h.this.getResources().getColor(R.color.j1));
                    }
                }
            }
        });
        this.f57887p.setOnFocusChangeListener(this.f57883O);
        this.f57890s.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C21307h.this.f57886o.getCurrentPage() == 1) {
                    C21307h.this.mo45161c();
                    C21307h hVar = C21307h.this;
                    C26890h.m65011a("register_click_next", new C20856a().mo44776a("platform", "email").f56798a);
                    if (C22282t.m55142a()) {
                        MusLoginManager f = hVar.mo45328f();
                        f.f57210b.mo24641a(hVar.f57887p.getText().toString(), (Map) null, (String) null, (C13128e) new C13128e() {
                            public final void onSuccess(C12993e<C13106e> eVar) {
                                if (C21307h.this.isViewValid() && C21307h.this.getContext() != null) {
                                    C21307h.this.mo45160a();
                                    try {
                                        if (eVar.f34007h == null || ((C13106e) eVar.f34007h).f34252d != 1) {
                                            C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "email").mo44774a("is_success", 1).mo44774a("is_register", 1).f56798a);
                                            C21168a aVar = (C21168a) C22271m.m55124a(C21259bc.class, C21307h.this.getArguments()).mo46372a("email", C21307h.this.f57887p.getText().toString()).mo46372a("enter_type", C21307h.this.f57516n).mo46373a("from_register", true).mo46371a("set_pass_scene", 3).mo46370a();
                                            aVar.mo45323a(C21307h.this.f57511d);
                                            C21307h.this.mo45321a((Fragment) aVar, false);
                                            return;
                                        }
                                        C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "email").mo44774a("is_success", 1).mo44774a("is_register", 1).f56798a);
                                        if (C21307h.this.getActivity() instanceof MusLoginActivity) {
                                            ((MusLoginActivity) C21307h.this.getActivity()).f57198a = null;
                                        }
                                        C21168a aVar2 = (C21168a) C22271m.m55124a(C21217ar.m53745a(), C21307h.this.getArguments()).mo46372a("email", C21307h.this.f57887p.getText().toString()).mo46371a("order", 1).mo46372a("enter_type", C21307h.this.f57516n).mo46371a("login_type", 1).mo46373a("from_register", true).mo46370a();
                                        aVar2.mo45323a(C21307h.this.f57511d);
                                        C21307h.this.mo45321a((Fragment) aVar2, false);
                                    } catch (Exception unused) {
                                        C10691a.m21543b(C21307h.this.getContext(), (int) R.string.az9, 0).mo19066a();
                                    }
                                }
                            }

                            public final void onError(C12993e<C13106e> eVar, int i) {
                                if (C21307h.this.isViewValid() && C21307h.this.getContext() != null) {
                                    C21307h.this.mo45160a();
                                    if (eVar.f34000c <= 0) {
                                        StringBuilder sb = new StringBuilder("CheckEmail:");
                                        sb.append(eVar.f34001d);
                                        C22093d.m54876a(1, -10000, sb.toString());
                                        C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "email").mo44774a("is_success", 0).mo44776a("error_code", "").mo44774a("is_register", 1).f56798a);
                                        C10691a.m21543b(C21307h.this.getContext(), (int) R.string.ccn, 0).mo19066a();
                                    } else if (eVar.f34000c == 1105) {
                                        C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "email").mo44774a("is_success", 0).mo44774a("error_code", eVar.f34000c).mo44774a("is_register", 1).f56798a);
                                        String str = eVar.f34001d;
                                        if (!TextUtils.isEmpty(str)) {
                                            str = C21307h.this.getString(R.string.az9);
                                        }
                                        C10691a.m21545b(C21307h.this.getContext(), str).mo19066a();
                                        int i2 = eVar.f34000c;
                                        StringBuilder sb2 = new StringBuilder("CheckEmail:");
                                        sb2.append(str);
                                        C22093d.m54876a(1, i2, sb2.toString());
                                    } else if (eVar.f34000c == 4) {
                                        C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "email").mo44774a("is_success", 0).mo44774a("error_code", eVar.f34000c).mo44774a("is_register", 1).f56798a);
                                        String str2 = eVar.f34001d;
                                        if (!TextUtils.isEmpty(str2)) {
                                            str2 = C21307h.this.getString(R.string.az9);
                                        }
                                        C10691a.m21545b(C21307h.this.getContext(), str2).mo19066a();
                                        int i3 = eVar.f34000c;
                                        StringBuilder sb3 = new StringBuilder("CheckEmail:");
                                        sb3.append(str2);
                                        C22093d.m54876a(1, i3, sb3.toString());
                                    } else if (eVar.f34000c == 6) {
                                        C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "email").mo44774a("is_success", 0).mo44774a("error_code", eVar.f34000c).mo44774a("is_register", 1).f56798a);
                                        C10691a.m21542b(C21307h.this.getContext(), (int) R.string.dni).mo19066a();
                                        C22093d.m54876a(1, eVar.f34000c, "CheckEmail:");
                                    }
                                }
                            }
                        });
                    } else {
                        MusLoginManager f2 = hVar.mo45328f();
                        String obj = hVar.f57887p.getText().toString();
                        C17825i.m43740a(f2.f57209a.emailExist("1", MusLoginManager.m53448a(obj)), new C17824h<EmailExistBean>() {
                            public final void onFailure(Throwable th) {
                                StringBuilder sb = new StringBuilder("emailExist:");
                                sb.append(th.getMessage());
                                C22093d.m54876a(1, -10000, sb.toString());
                                if (C21307h.this.isViewValid() && C21307h.this.getContext() != null) {
                                    C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "email").mo44774a("is_success", 0).mo44776a("error_code", "").mo44774a("is_register", 1).f56798a);
                                    C21307h.this.mo45160a();
                                    Toast makeText = Toast.makeText(C21307h.this.getContext(), R.string.ccn, 0);
                                    if (VERSION.SDK_INT == 25) {
                                        C47905fy.m103630a(makeText);
                                    }
                                    makeText.show();
                                }
                            }

                            public final /* synthetic */ void onSuccess(Object obj) {
                                EmailExistBean emailExistBean = (EmailExistBean) obj;
                                if (C21307h.this.isViewValid() && C21307h.this.getContext() != null) {
                                    C21307h.this.mo45160a();
                                    if (emailExistBean.getStatus_code() == 40001) {
                                        C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "email").mo44774a("is_success", 0).mo44774a("error_code", emailExistBean.getStatus_code()).mo44774a("is_register", 1).f56798a);
                                        C10691a.m21542b(C21307h.this.getContext(), (int) R.string.ccn).mo19066a();
                                        C22093d.m54876a(1, emailExistBean.getStatus_code(), emailExistBean.getStatus_msg());
                                    } else if (emailExistBean.isIs_registered()) {
                                        if (C21307h.this.getActivity() instanceof MusLoginActivity) {
                                            ((MusLoginActivity) C21307h.this.getActivity()).f57198a = null;
                                        }
                                        C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "email").mo44774a("is_success", 0).mo44774a("error_code", emailExistBean.getStatus_code()).mo44774a("is_register", 1).f56798a);
                                        C21168a aVar = (C21168a) C22271m.m55124a(C21217ar.m53745a(), C21307h.this.getArguments()).mo46372a("email", C21307h.this.f57887p.getText().toString()).mo46371a("order", 1).mo46372a("enter_type", C21307h.this.f57516n).mo46371a("login_type", 1).mo46373a("from_register", true).mo46372a("enter_from", C21307h.this.f57514l).mo46370a();
                                        aVar.mo45323a(C21307h.this.f57511d);
                                        C21307h.this.mo45321a((Fragment) aVar, false);
                                    } else {
                                        C26890h.m65011a("register_click_next_result", new C20856a().mo44776a("platform", "email").mo44774a("is_success", 1).mo44774a("is_register", 1).f56798a);
                                        C21168a aVar2 = (C21168a) C22271m.m55124a(C21259bc.class, C21307h.this.getArguments()).mo46372a("email", C21307h.this.f57887p.getText().toString()).mo46372a("enter_type", C21307h.this.f57516n).mo46373a("from_register", true).mo46371a("login_type", 1).mo46372a("enter_from", C21307h.this.f57514l).mo46370a();
                                        aVar2.mo45323a(C21307h.this.f57511d);
                                        C21307h.this.mo45321a((Fragment) aVar2, false);
                                    }
                                }
                            }
                        }, C20916a.f56902a);
                    }
                } else if (C21307h.this.f57886o.getCurrentPage() == 0) {
                    C21307h.this.f57870A = C21307h.this.f57891t.getText().toString();
                    C21307h.this.f57871B = C21307h.this.f57892u.getText().toString();
                    C21307h.this.f57872C = C21307h.this.f57888q.getText().toString();
                    C21307h.this.mo45451k();
                }
            }
        });
        this.f57895x.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21307h.this.f57887p.setText("");
                C21307h.this.f57895x.setVisibility(8);
            }
        });
        this.f57896y.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21307h.this.f57888q.setText("");
                C21307h.this.f57896y.setVisibility(8);
            }
        });
        this.f57890s.postDelayed(new C21323i(this), 100);
        if (TextUtils.equals(getArguments().getString("login_register_type", "mobile"), "email")) {
            this.f57886o.setCurrentPageWithoutClick(1);
            mo45452l();
        }
        if (bundle == null) {
            if (TextUtils.isEmpty(this.f57870A) || TextUtils.isEmpty(this.f57871B) || TextUtils.isEmpty(this.f57872C)) {
                String str = null;
                TelephonyManager telephonyManager = (TelephonyManager) getActivity().getSystemService("phone");
                if (telephonyManager != null) {
                    str = telephonyManager.getSimCountryIso();
                }
                if (TextUtils.isEmpty(str)) {
                    str = Locale.getDefault().getCountry();
                }
                if (!TextUtils.isEmpty(str)) {
                    C17666bt it = C21386a.m54007b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C21386a aVar = (C21386a) it.next();
                        if (aVar.f58043c.equalsIgnoreCase(str)) {
                            String str2 = aVar.f58044d;
                            if (!TextUtils.isEmpty(str2) && !str2.startsWith("+")) {
                                StringBuilder sb = new StringBuilder("+");
                                sb.append(str2);
                                str2 = sb.toString();
                            }
                            this.f57891t.setText(str2);
                            this.f57892u.setText(aVar.f58043c);
                        }
                    }
                }
            } else {
                this.f57891t.setText(this.f57870A);
                this.f57892u.setText(this.f57871B);
                this.f57888q.setText(this.f57872C);
            }
            if (this.f57511d != null && !this.f57881L.booleanValue()) {
                this.f57886o.setCurrentPage(this.f57511d.mo45033c());
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f57873D != null) {
            this.f57873D.mo45641a(i, i2, intent);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b06, viewGroup, false);
    }
}
