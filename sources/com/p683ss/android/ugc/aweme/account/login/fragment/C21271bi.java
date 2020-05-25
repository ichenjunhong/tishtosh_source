package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p859d.C13081d;
import com.bytedance.sdk.account.p861f.p862a.C13117p;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p862a.C13121t;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13136m;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13141r;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.agegate.C20884b;
import com.p683ss.android.ugc.aweme.account.api.p1266b.C20900b;
import com.p683ss.android.ugc.aweme.account.login.C21459s;
import com.p683ss.android.ugc.aweme.account.login.C21518u;
import com.p683ss.android.ugc.aweme.account.login.C21635v;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1287ui.FindPswByEmailActivity;
import com.p683ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p683ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21047c;
import com.p683ss.android.ugc.aweme.account.login.p1280a.C21052h;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21108m;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21568ah.C21569a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21608p.C21612a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21632y;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a.p1294a.C21639a;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21472c;
import com.p683ss.android.ugc.aweme.account.login.view.C22023a;
import com.p683ss.android.ugc.aweme.account.login.view.C22023a.C22025b;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.p1279l.C21022f;
import com.p683ss.android.ugc.aweme.account.p1279l.C21023g;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import com.p683ss.android.ugc.aweme.account.p1302o.C22097f;
import com.p683ss.android.ugc.aweme.account.util.C22271m;
import com.p683ss.android.ugc.aweme.account.util.C22275o;
import com.p683ss.android.ugc.aweme.account.utils.C22305k;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47905fy;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bi */
public class C21271bi extends C21168a {

    /* renamed from: o */
    public static final boolean f57754o = false;

    /* renamed from: A */
    public C21277b f57755A;

    /* renamed from: B */
    public C21275a f57756B;

    /* renamed from: C */
    public C21278c f57757C;

    /* renamed from: D */
    public C21047c f57758D;

    /* renamed from: E */
    public C21047c f57759E;

    /* renamed from: F */
    C22023a f57760F;

    /* renamed from: G */
    public boolean f57761G;

    /* renamed from: H */
    public C13011d f57762H;

    /* renamed from: I */
    private TextView f57763I;

    /* renamed from: J */
    private boolean f57764J;

    /* renamed from: K */
    private View f57765K;

    /* renamed from: L */
    private TextView f57766L;

    /* renamed from: M */
    private int f57767M;

    /* renamed from: O */
    private TextView f57768O;

    /* renamed from: P */
    private TextView f57769P;

    /* renamed from: Q */
    private View f57770Q;

    /* renamed from: R */
    private View f57771R;

    /* renamed from: S */
    private View f57772S;

    /* renamed from: T */
    private int f57773T;

    /* renamed from: U */
    private int f57774U;

    /* renamed from: p */
    public String f57775p;

    /* renamed from: q */
    public String f57776q;

    /* renamed from: r */
    public String f57777r;

    /* renamed from: s */
    public EditText f57778s;

    /* renamed from: t */
    public View f57779t;

    /* renamed from: u */
    public View f57780u;

    /* renamed from: v */
    public LoginButton f57781v;

    /* renamed from: w */
    public int f57782w;

    /* renamed from: x */
    public View f57783x;

    /* renamed from: y */
    public String f57784y;

    /* renamed from: z */
    public int f57785z = -1;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bi$a */
    class C21275a implements C21612a {
        /* renamed from: a */
        public final void mo45150a() {
            if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                C21271bi.this.mo45159d();
                C21271bi.this.f57762H.mo24604a(C22165u.f59781u, (C13136m) new C13136m() {
                    public final void onError(C12993e<C13117p> eVar, int i) {
                    }

                    public final /* bridge */ /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                    }

                    public final void onSuccess(C12993e<C13117p> eVar) {
                        if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null && eVar.f34007h != null && !TextUtils.isEmpty(((C13117p) eVar.f34007h).f34303a)) {
                            C21271bi.this.mo45158a(((C13117p) eVar.f34007h).f34303a, null, C22165u.f59761a, C21271bi.this.f57756B);
                        }
                    }
                });
            }
        }

        private C21275a() {
        }

        /* renamed from: b */
        public final void mo45151b(String str, int i) {
            if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                C21271bi.this.mo45159d();
                C21271bi.this.f57785z = C22165u.f59761a;
                C13011d dVar = C21271bi.this.f57762H;
                StringBuilder sb = new StringBuilder();
                sb.append(C21271bi.this.f57776q);
                sb.append("-");
                sb.append(C21271bi.this.f57777r);
                dVar.mo24614a(sb.toString(), str, C21271bi.this.f57785z, (C13139p) C21271bi.this.f57755A);
                C26890h.m65011a("send_sms", new C20856a().mo44776a("send_method", "user_click").mo44774a("send_reason", C22165u.f59761a).mo44776a("enter_method", C21271bi.this.f57515m).mo44776a("enter_from", C21271bi.this.f57514l).f56798a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bi$b */
    class C21277b extends C21052h {

        /* renamed from: a */
        public boolean f57791a;

        /* renamed from: b */
        public boolean f57792b = true;

        /* renamed from: a */
        public final void mo45100a() {
            if (this.f57791a) {
                C22097f.m54900b(0, C21271bi.this.f57785z, 0, "");
            } else if (this.f57792b) {
                C22097f.m54898a(0, C21271bi.this.f57785z, 0, "");
            } else {
                C22097f.m54899a(0, C21271bi.this.f57785z, 0, "", "choose_dialog");
            }
            if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                if (!C20884b.m53202c()) {
                    C21271bi.this.mo45413a(this.f57791a, this.f57792b);
                } else {
                    C21271bi.this.mo45324a(false);
                    C21271bi.this.f57783x.setVisibility(8);
                    C21271bi.this.f57780u.setBackgroundColor(C21271bi.this.getResources().getColor(R.color.j1));
                    if (!C20884b.m53201b()) {
                        C21168a aVar = (C21168a) C22271m.m55124a(C21346u.class, C21271bi.this.getArguments()).mo46372a("country_code_alpha_2", C21271bi.this.f57775p).mo46372a("country_code", C21271bi.this.f57776q).mo46372a("phone_number", C21271bi.this.f57777r).mo46372a("enter_type", C21271bi.this.f57516n).mo46371a("init_page", 0).mo46373a("use_whatsapp_code", this.f57791a).mo46373a("from_choose_dialog", true ^ this.f57792b).mo46373a("reset_ticker", C21271bi.this.f57761G).mo46370a();
                        aVar.mo45323a(C21271bi.this.f57511d);
                        C21271bi.this.mo45321a((Fragment) aVar, false);
                    } else if (C21472c.m54111a()) {
                        C21168a aVar2 = (C21168a) C22271m.m55124a(C21290bt.class, C21271bi.this.getArguments()).mo46372a("enter_type", C21271bi.this.f57516n).mo46371a("init_page", 0).mo46372a("country_code_alpha_2", C21271bi.this.f57775p).mo46372a("country_code", C21271bi.this.f57776q).mo46372a("phone_number", C21271bi.this.f57777r).mo46373a("use_whatsapp_code", this.f57791a).mo46373a("from_choose_dialog", true ^ this.f57792b).mo46373a("reset_ticker", C21271bi.this.f57761G).mo46370a();
                        aVar2.mo45323a(C21271bi.this.f57511d);
                        C21271bi.this.mo45321a((Fragment) aVar2, false);
                    } else {
                        C21168a aVar3 = (C21168a) C22271m.m55124a(C21227aw.class, C21271bi.this.getArguments()).mo46372a("country_code_alpha_2", C21271bi.this.f57775p).mo46372a("country_code", C21271bi.this.f57776q).mo46372a("phone_number", C21271bi.this.f57777r).mo46373a("NEW_PHONE_USER", true).mo46373a("use_whatsapp_code", this.f57791a).mo46373a("from_choose_dialog", true ^ this.f57792b).mo46373a("reset_ticker", C21271bi.this.f57761G).mo46370a();
                        if (aVar3 != null) {
                            C21271bi.m53845c(this.f57791a);
                        }
                        aVar3.mo45323a(C21271bi.this.f57511d);
                        C21271bi.this.mo45321a((Fragment) aVar3, false);
                    }
                }
                C21271bi.this.f57761G = false;
            }
        }

        /* renamed from: a */
        public final void mo45103a(C12993e<C13120s> eVar) {
            C21271bi.this.mo45324a(false);
            C10691a.m21545b(C21271bi.this.getContext(), C22275o.m55130a((C12990b) eVar)).mo19066a();
            C21271bi.this.f57761G = false;
        }

        /* renamed from: a */
        public final void mo45101a(int i) {
            if (this.f57791a) {
                C22097f.m54900b(1, C21271bi.this.f57785z, i, "PhoneInvalid");
            } else if (this.f57792b) {
                C22097f.m54898a(1, C21271bi.this.f57785z, i, "PhoneInvalid");
            } else {
                C22097f.m54899a(1, C21271bi.this.f57785z, i, "PhoneInvalid", "choose_dialog");
            }
            if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                C21271bi.this.mo45324a(false);
                C21289bs.m53878a(Toast.makeText(C21271bi.this.getActivity(), R.string.ca7, 0));
                C21271bi.this.f57761G = false;
            }
        }

        /* renamed from: b */
        public final void mo45105b(int i) {
            if (this.f57791a) {
                C22097f.m54900b(1, C21271bi.this.f57785z, i, "RejectSec");
            } else if (this.f57792b) {
                C22097f.m54898a(1, C21271bi.this.f57785z, i, "RejectSec");
            } else {
                C22097f.m54899a(1, C21271bi.this.f57785z, i, "RejectSec", "choose_dialog");
            }
            super.mo45105b(i);
            if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                C21271bi.this.mo45324a(false);
                C21271bi.this.f57761G = false;
            }
        }

        /* renamed from: b */
        public final void mo45170b(C12993e<C13120s> eVar) {
            if (this.f57791a) {
                C22097f.m54900b(1, C21271bi.this.f57785z, eVar.f34000c, eVar.f34001d);
            } else if (this.f57792b) {
                C22097f.m54898a(1, C21271bi.this.f57785z, eVar.f34000c, eVar.f34001d);
            } else {
                C22097f.m54899a(1, C21271bi.this.f57785z, eVar.f34000c, eVar.f34001d, "choose_dialog");
            }
            if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                C21271bi.this.mo45324a(false);
                String a = C21639a.m54348a(C21271bi.this.getContext(), eVar.f34000c, eVar.f34001d);
                if (!TextUtils.isEmpty(a)) {
                    C21289bs.m53878a(Toast.makeText(C21271bi.this.getContext(), a, 0));
                }
                C21271bi.this.f57761G = false;
            }
        }

        public C21277b(C21108m mVar) {
            super(mVar);
        }

        /* renamed from: a */
        public final void mo45102a(int i, String str) {
            if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                C21271bi.this.mo45324a(false);
                C21271bi.this.f57783x.setVisibility(8);
                C21271bi.this.f57780u.setBackgroundColor(C21271bi.this.getResources().getColor(R.color.j1));
                C21168a aVar = (C21168a) C22271m.m55124a(C21227aw.class, C21271bi.this.getArguments()).mo46372a("country_code_alpha_2", C21271bi.this.f57775p).mo46372a("country_code", C21271bi.this.f57776q).mo46372a("phone_number", C21271bi.this.f57777r).mo46373a("use_whatsapp_code", this.f57791a).mo46373a("from_choose_dialog", !this.f57792b).mo46373a("reset_ticker", C21271bi.this.f57761G).mo46370a();
                aVar.mo45323a(C21271bi.this.f57511d);
                C21271bi.this.mo45321a((Fragment) aVar, false);
                C21271bi.this.f57761G = false;
            }
        }

        /* renamed from: a */
        public final void mo45104a(String str, String str2) {
            if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                C21271bi.this.mo45324a(false);
                C21271bi.this.f57783x.setVisibility(8);
                C21271bi.this.f57780u.setBackgroundColor(C21271bi.this.getResources().getColor(R.color.j1));
                C21271bi.this.mo45158a(str, str2, C22165u.f59761a, C21271bi.this.f57756B);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bi$c */
    class C21278c implements C21612a {
        /* renamed from: a */
        public final void mo45150a() {
            if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                C21271bi.this.mo45159d();
                C21271bi.this.f57762H.mo24604a(C22165u.f59781u, (C13136m) new C13136m() {
                    public final void onError(C12993e<C13117p> eVar, int i) {
                    }

                    public final /* bridge */ /* synthetic */ void onNeedCaptcha(C12990b bVar, String str) {
                    }

                    public final void onSuccess(C12993e<C13117p> eVar) {
                        if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null && eVar.f34007h != null && !TextUtils.isEmpty(((C13117p) eVar.f34007h).f34303a)) {
                            C21271bi.this.mo45158a(((C13117p) eVar.f34007h).f34303a, null, C22165u.f59767g, C21271bi.this.f57757C);
                        }
                    }
                });
            }
        }

        private C21278c() {
        }

        /* renamed from: b */
        public final void mo45151b(String str, int i) {
            if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                C21271bi.this.mo45159d();
                C21271bi.this.f57781v.mo45161c();
                if (C21271bi.this.f57782w == 0) {
                    C13011d dVar = C21271bi.this.f57762H;
                    StringBuilder sb = new StringBuilder();
                    sb.append(C21271bi.this.f57776q);
                    sb.append(C21271bi.this.f57777r);
                    dVar.mo24624a(sb.toString(), C21271bi.this.f57778s.getText().toString(), str, C22165u.f59767g, (C13141r) C21271bi.this.f57758D);
                    return;
                }
                if (C21271bi.this.f57782w == 1) {
                    C21271bi.this.f57762H.mo24624a(C21271bi.this.f57784y, C21271bi.this.f57778s.getText().toString(), str, C22165u.f59767g, (C13141r) C21271bi.this.f57759E);
                }
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo45410a() {
        mo45322a((View) this.f57778s);
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m58184c(this.f57778s);
    }

    public void onStart() {
        super.onStart();
        this.f57778s.postDelayed(new C21280bj(this), 500);
    }

    /* renamed from: j */
    private String m53848j() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57776q);
        sb.append("-");
        sb.append(this.f57777r);
        return sb.toString();
    }

    /* renamed from: i */
    private boolean m53847i() {
        C21569a aVar;
        if (this.f57511d == null) {
            aVar = null;
        } else {
            aVar = this.f57511d.mo45024a(0);
        }
        if (aVar == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57776q);
        sb.append("-");
        sb.append(this.f57777r);
        if (!TextUtils.equals(sb.toString(), aVar.f58505a) || aVar.f58506b.f60053c == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static void m53845c(boolean z) {
        if (z) {
            C26890h.m65011a("phone_login_enter_whatsapp_code", null);
        } else {
            C26890h.m65011a("phone_login_enter_sms", null);
        }
    }

    /* renamed from: a */
    public final void mo45411a(String str) {
        this.f57783x.setVisibility(0);
        this.f57766L.setText(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0079  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m53846d(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.m53847i()
            r1 = 0
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r6.m53848j()
            boolean r0 = com.p683ss.android.ugc.aweme.account.utils.C22305k.m55199e(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0014
            if (r7 != 0) goto L_0x0020
        L_0x0014:
            java.lang.String r0 = r6.m53848j()
            boolean r0 = com.p683ss.android.ugc.aweme.account.utils.C22305k.m55199e(r0)
            if (r0 != 0) goto L_0x006a
            if (r7 != 0) goto L_0x006a
        L_0x0020:
            java.lang.String r0 = r6.m53848j()
            boolean r0 = com.p683ss.android.ugc.aweme.account.utils.C22305k.m55199e(r0)
            java.lang.Class<com.ss.android.ugc.aweme.account.login.fragment.aw> r3 = com.p683ss.android.ugc.aweme.account.login.fragment.C21227aw.class
            android.os.Bundle r4 = r6.getArguments()
            com.ss.android.ugc.aweme.account.util.m$a r3 = com.p683ss.android.ugc.aweme.account.util.C22271m.m55124a(r3, r4)
            java.lang.String r4 = "country_code_alpha_2"
            java.lang.String r5 = r6.f57775p
            com.ss.android.ugc.aweme.account.util.m$a r3 = r3.mo46372a(r4, r5)
            java.lang.String r4 = "country_code"
            java.lang.String r5 = r6.f57776q
            com.ss.android.ugc.aweme.account.util.m$a r3 = r3.mo46372a(r4, r5)
            java.lang.String r4 = "phone_number"
            java.lang.String r5 = r6.f57777r
            com.ss.android.ugc.aweme.account.util.m$a r3 = r3.mo46372a(r4, r5)
            java.lang.String r4 = "use_whatsapp_code"
            com.ss.android.ugc.aweme.account.util.m$a r3 = r3.mo46373a(r4, r0)
            java.lang.String r4 = "from_choose_dialog"
            com.ss.android.ugc.aweme.account.util.m$a r2 = r3.mo46373a(r4, r2)
            android.support.v4.app.Fragment r2 = r2.mo46370a()
            com.ss.android.ugc.aweme.account.login.fragment.a r2 = (com.p683ss.android.ugc.aweme.account.login.fragment.C21168a) r2
            if (r2 == 0) goto L_0x0061
            m53845c(r0)
        L_0x0061:
            com.ss.android.ugc.aweme.account.login.fragment.n r0 = r6.f57511d
            r2.mo45323a(r0)
            r6.mo45321a(r2, r1)
            goto L_0x006f
        L_0x006a:
            r6.f57761G = r2
        L_0x006c:
            r6.m53844b(r7, r1)
        L_0x006f:
            com.ss.android.ugc.aweme.account.login.view.a r0 = r6.f57760F
            com.p683ss.android.ugc.aweme.utils.C47700ay.m103236b(r0)
            if (r7 == 0) goto L_0x0079
            java.lang.String r7 = "phone_verification_click_whatsapp"
            goto L_0x007b
        L_0x0079:
            java.lang.String r7 = "phone_verification_click_sms"
        L_0x007b:
            com.ss.android.ugc.aweme.account.a.b.a r0 = new com.ss.android.ugc.aweme.account.a.b.a
            r0.<init>()
            java.lang.String r1 = "enter_type"
            java.lang.String r2 = r6.f57516n
            com.ss.android.ugc.aweme.account.a.b.a r0 = r0.mo44776a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56798a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.account.login.fragment.C21271bi.m53846d(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo45416c(View view) {
        String str;
        String str2;
        this.f57781v.mo45161c();
        C21022f fVar = new C21022f();
        if (this.f57782w == 0) {
            str = "phone";
        } else {
            str = "email";
        }
        fVar.mo44995b(str).mo44994a(this.f57514l).mo44990b();
        String str3 = "login_submit";
        C20856a a = new C20856a().mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).mo44776a("enter_type", this.f57516n).mo44776a("group_id", C21021e.m53409a(getArguments())).mo44776a("log_pb", C21021e.m53412b(getArguments()));
        String str4 = "platform";
        if (this.f57782w == 0) {
            str2 = "phone";
        } else {
            str2 = "email";
        }
        C26890h.m65011a(str3, a.mo44776a(str4, str2).f56798a);
        if (this.f57782w == 0) {
            C13011d dVar = this.f57762H;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57776q);
            sb.append(this.f57777r);
            dVar.mo24624a(sb.toString(), this.f57778s.getText().toString(), "", C22165u.f59767g, (C13141r) this.f57758D);
            return;
        }
        if (this.f57782w == 1) {
            this.f57762H.mo24624a(this.f57784y, this.f57778s.getText().toString(), "", C22165u.f59767g, (C13141r) this.f57758D);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f57775p = arguments.getString("country_code_alpha_2");
            this.f57776q = arguments.getString("country_code");
            this.f57777r = arguments.getString("phone_number");
            this.f57767M = arguments.getInt("order");
            this.f57784y = arguments.getString("email");
            this.f57782w = arguments.getInt("login_type", 0);
            this.f57764J = arguments.getBoolean("from_register", false);
        }
        if (this.f57782w == 0) {
            C26890h.m65011a("phone_login_enter_password", new C20856a().f56798a);
        }
        this.f57762H = C13081d.m26312a(getContext());
        this.f57755A = new C21277b(this);
        this.f57756B = new C21275a();
        this.f57757C = new C21278c();
        this.f57758D = new C21047c(this) {
            /* renamed from: a */
            public final void mo45082a(int i) {
                C21271bi.this.f57781v.mo45160a();
                if (C21271bi.this.f57782w == 1) {
                    C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "email").mo44776a("enter_method", C21271bi.this.f57515m).mo44776a("enter_type", C21271bi.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", i).f56798a);
                } else if (C21271bi.this.f57782w == 0) {
                    C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "phone").mo44776a("enter_method", C21271bi.this.f57515m).mo44776a("enter_type", C21271bi.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", i).f56798a);
                }
                C21168a aVar = (C21168a) C22271m.m55124a(C21227aw.class, C21271bi.this.getArguments()).mo46372a("country_code_alpha_2", C21271bi.this.f57775p).mo46372a("country_code", C21271bi.this.f57776q).mo46372a("phone_number", C21271bi.this.f57777r).mo46371a("code_type", 2).mo46370a();
                aVar.mo45323a(C21271bi.this.f57511d);
                C21271bi.this.mo45321a((Fragment) aVar, false);
            }

            /* renamed from: a */
            public final void mo45083a(C12993e<C13121t> eVar) {
                String str;
                if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null && eVar.f34007h != null && ((C13121t) eVar.f34007h).f34337t != null) {
                    C21271bi.this.f57781v.mo45160a();
                    new C21023g().mo44997b("phone").mo44996a("1").mo44990b();
                    String str2 = "login_success";
                    C20856a a = new C20856a().mo44776a("enter_method", C21271bi.this.f57515m).mo44776a("enter_from", C21271bi.this.f57514l);
                    String str3 = "platform";
                    if (C21271bi.this.f57782w == 1) {
                        str = "email";
                    } else {
                        str = "phone";
                    }
                    C26890h.m65011a(str2, a.mo44776a(str3, str).mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                    C21271bi.this.f57783x.setVisibility(8);
                    C21271bi.this.f57780u.setBackgroundColor(C21271bi.this.getResources().getColor(R.color.j1));
                    C21271bi.m53691a(((C13121t) eVar.f34007h).f34337t.f34481i, ((C13121t) eVar.f34007h).f34337t);
                    if (C21271bi.this.f57511d != null) {
                        Bundle bundle = new Bundle(C21271bi.this.getArguments());
                        bundle.putString("platform", "mobile");
                        if (C21271bi.this.f57782w == 0) {
                            bundle.putString("login_path", "phone_password");
                        } else {
                            bundle.putString("login_path", "email_or_username");
                        }
                        C21271bi.this.f57511d.mo45026a(bundle);
                    }
                    if (C21271bi.this.getArguments() != null && C21271bi.this.getArguments().getBoolean("need_remember_login_method", true)) {
                        if (C21271bi.this.f57782w == 0) {
                            PhoneLoginMethod phoneLoginMethod = new PhoneLoginMethod(C23826bi.m58463d(), LoginMethodName.PHONE_NUMBER_PASS, C21271bi.this.f57775p, C21271bi.this.f57776q, C21271bi.this.f57777r);
                            C21518u.m54176b(phoneLoginMethod);
                        } else if (C21271bi.this.f57782w == 1) {
                            C21518u.m54176b(new AccountPassLoginMethod(C23826bi.m58463d(), LoginMethodName.EMAIL_PASS, C21271bi.this.f57784y));
                        }
                    }
                }
            }

            /* renamed from: b */
            public final void mo45085b(C12993e<C13121t> eVar) {
                String str;
                String str2;
                if (C21271bi.this.f57782w == 0) {
                    C22093d.m54877a(false, eVar.f34000c, eVar.f34001d);
                } else {
                    C22093d.m54876a(1, eVar.f34000c, eVar.f34001d);
                }
                if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                    if (C21271bi.this.f57782w == 1) {
                        C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "email").mo44776a("enter_method", C21271bi.this.f57515m).mo44776a("enter_type", C21271bi.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", eVar.f34000c).f56798a);
                    } else if (C21271bi.this.f57782w == 0) {
                        C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "phone").mo44776a("enter_method", C21271bi.this.f57515m).mo44776a("enter_type", C21271bi.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", eVar.f34000c).f56798a);
                    }
                    C21271bi.this.f57781v.mo45160a();
                    new C21023g().mo44997b("phone").mo44996a("0").mo44998c(String.valueOf(eVar.f34000c)).mo44990b();
                    if (!C21459s.f58194d.contains(Integer.valueOf(eVar.f34000c))) {
                        if (eVar.f34000c == 1034) {
                            C21271bi biVar = C21271bi.this;
                            if (TextUtils.isEmpty(eVar.f34001d)) {
                                str2 = C21271bi.this.getString(R.string.c2j);
                            } else {
                                str2 = eVar.f34001d;
                            }
                            biVar.mo45411a(str2);
                        } else if (eVar.f34000c == 2027 || eVar.f34000c == 2028) {
                            if (TextUtils.isEmpty(eVar.f34001d)) {
                                str = C21271bi.this.getString(R.string.c2p);
                            } else {
                                str = eVar.f34001d;
                            }
                            C10691a.m21545b(C21271bi.this.getContext(), str).mo19066a();
                        } else {
                            C21271bi.this.mo45411a(C21271bi.this.getString(R.string.c2j));
                        }
                    }
                }
            }

            /* renamed from: a */
            public final void mo45084a(C12993e<C13121t> eVar, String str) {
                String str2;
                if (C21271bi.this.f57782w == 0) {
                    C22093d.m54877a(false, eVar.f34000c, eVar.f34001d);
                } else {
                    C22093d.m54876a(1, eVar.f34000c, eVar.f34001d);
                }
                if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                    if (C21271bi.this.f57782w == 1) {
                        C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "email").mo44776a("enter_method", C21271bi.this.f57515m).mo44776a("enter_type", C21271bi.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", eVar.f34000c).f56798a);
                    } else if (C21271bi.this.f57782w == 0) {
                        C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "phone").mo44776a("enter_method", C21271bi.this.f57515m).mo44776a("enter_type", C21271bi.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", eVar.f34000c).f56798a);
                    }
                    C21271bi.this.f57781v.mo45160a();
                    new C21023g().mo44997b("phone").mo44996a("0").mo44998c(str).mo44990b();
                    C21271bi.this.f57780u.setBackgroundColor(C21271bi.this.getResources().getColor(R.color.xn));
                    C21271bi biVar = C21271bi.this;
                    if (TextUtils.isEmpty(eVar.f34001d)) {
                        str2 = C21271bi.this.getString(R.string.c2j);
                    } else {
                        str2 = eVar.f34001d;
                    }
                    biVar.mo45411a(str2);
                }
            }
        };
        this.f57759E = new C21047c(this) {
            /* renamed from: a */
            public final void mo45082a(int i) {
            }

            /* renamed from: a */
            public final void mo45083a(C12993e<C13121t> eVar) {
                if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null && eVar.f34007h != null && ((C13121t) eVar.f34007h).f34337t != null) {
                    C21271bi.this.f57781v.mo45160a();
                    C21271bi.this.f57783x.setVisibility(8);
                    C21271bi.this.f57780u.setBackgroundColor(C21271bi.this.getResources().getColor(R.color.j1));
                    new C21023g().mo44997b("email").mo44996a("1").mo44990b();
                    C26890h.m65011a("login_success", new C20856a().mo44776a("enter_method", C21635v.f58646a).mo44776a("enter_from", C21635v.f58647b).mo44776a("enter_type", C21271bi.this.f57516n).mo44776a("platform", "email").mo44774a("status", 1).mo44774a("_perf_monitor", 1).f56798a);
                    C21271bi.m53691a(((C13121t) eVar.f34007h).f34337t.f34481i, ((C13121t) eVar.f34007h).f34337t);
                    if (C21271bi.this.f57511d != null) {
                        Bundle bundle = new Bundle(C21271bi.this.getArguments());
                        bundle.putString("platform", "mobile");
                        bundle.putString("login_path", "email_or_username");
                        C21271bi.this.f57511d.mo45026a(bundle);
                    }
                }
            }

            /* renamed from: b */
            public final void mo45085b(C12993e<C13121t> eVar) {
                C22093d.m54876a(1, eVar.f34000c, eVar.f34001d);
                if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                    C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "email").mo44776a("enter_method", C21271bi.this.f57515m).mo44776a("enter_type", C21271bi.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", eVar.f34000c).f56798a);
                    C21271bi.this.f57781v.mo45160a();
                    new C21023g().mo44997b("email").mo44996a("0").mo44998c(String.valueOf(eVar.f34000c)).mo44990b();
                    String a = C21639a.m54348a(C21271bi.this.getContext(), eVar.f34000c, eVar.f34001d);
                    if (!TextUtils.isEmpty(a)) {
                        Toast makeText = Toast.makeText(C21271bi.this.getContext(), a, 0);
                        if (VERSION.SDK_INT == 25) {
                            C47905fy.m103630a(makeText);
                        }
                        makeText.show();
                    }
                }
            }

            /* renamed from: a */
            public final void mo45084a(C12993e<C13121t> eVar, String str) {
                C22093d.m54876a(1, eVar.f34000c, eVar.f34001d);
                if (C21271bi.this.isViewValid() && C21271bi.this.getContext() != null) {
                    C26890h.m65011a("login_failure", new C20856a().mo44776a("platform", "email").mo44776a("enter_method", C21271bi.this.f57515m).mo44776a("enter_type", C21271bi.this.f57516n).mo44776a("carrier", "").mo44774a("error_code", eVar.f34000c).f56798a);
                    C21271bi.this.f57781v.mo45160a();
                    new C21023g().mo44997b("email").mo44996a("0").mo44998c(str).mo44990b();
                    C21271bi.this.f57780u.setBackgroundColor(C21271bi.this.getResources().getColor(R.color.xn));
                    C21271bi.this.mo45411a(C21271bi.this.getResources().getString(R.string.cbf));
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo45414b(View view) {
        if (this.f57782w == 1) {
            C26890h.m65011a("click_forget_password", new C20856a().mo44776a("platform", "email").f56798a);
            Intent intent = new Intent(getActivity(), FindPswByEmailActivity.class);
            intent.putExtra("enter_type", this.f57516n);
            startActivityForResult(intent, PreloadTask.BYTE_UNIT_NUMBER);
            return;
        }
        if (this.f57782w == 0) {
            C26890h.m65011a("click_forget_password", new C20856a().mo44776a("platform", "phone").f56798a);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57776q);
            sb.append("-");
            sb.append(this.f57777r);
            mo45325b(C22271m.m55124a(C21632y.class, getArguments()).mo46372a("enter_type", this.f57516n).mo46372a("phone_number", sb.toString()).mo46370a(), false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo45417d(View view) {
        String str;
        String string;
        C26890h.m65011a("switch_to_sms_verification", new C20856a().mo44776a("enter_method", this.f57515m).f56798a);
        if (C22305k.m55195a(this.f57776q)) {
            if (getContext() != null) {
                boolean b = C22305k.m55196b(this.f57776q);
                if (this.f57760F == null) {
                    String string2 = getString(R.string.dd7);
                    String string3 = getString(R.string.dd4, m53848j());
                    if (b) {
                        str = getString(R.string.dd6);
                    } else {
                        str = getString(R.string.dd5);
                    }
                    if (b) {
                        string = getString(R.string.dd5);
                    } else {
                        string = getString(R.string.dd6);
                    }
                    C22025b bVar = new C22025b(string2, string3, str, string, this.f57516n, m53848j());
                    this.f57760F = new C22023a(getContext(), bVar);
                }
                this.f57760F.f59502a = new C21286bp(this);
                this.f57760F.f59503b = new C21287bq(this, b);
                this.f57760F.f59504c = new C21288br(this, b);
                C47700ay.m103235a(this.f57760F);
            }
        } else if (m53847i()) {
            boolean e = C22305k.m55199e(m53848j());
            C21168a aVar = (C21168a) C22271m.m55124a(C21227aw.class, getArguments()).mo46372a("country_code_alpha_2", this.f57775p).mo46372a("country_code", this.f57776q).mo46372a("phone_number", this.f57777r).mo46373a("use_whatsapp_code", e).mo46370a();
            if (aVar != null) {
                m53845c(e);
            }
            aVar.mo45323a(this.f57511d);
            mo45321a((Fragment) aVar, false);
        } else {
            m53844b(false, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo45326b(boolean z) {
        if (this.f57774U == 0) {
            this.f57774U = this.f57768O.getBottom() - this.f57508a.getBottom();
        }
        if (this.f57773T == 0) {
            this.f57773T = this.f57768O.getTop() - this.f57508a.getBottom();
        }
        if (!z) {
            this.f57770Q.animate().alpha(0.0f).setDuration(110).start();
            this.f57771R.animate().alpha(0.0f).setDuration(110).start();
            this.f57768O.animate().translationY(0.0f).alpha(1.0f).setStartDelay(110).setDuration(220).start();
            this.f57772S.animate().translationY(0.0f).setStartDelay(110).setDuration(220).start();
        } else if (this.f57781v.getTop() - this.f57772S.getBottom() <= f57506j) {
            this.f57770Q.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57771R.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57768O.animate().translationY((float) (-this.f57773T)).alpha(0.0f).setDuration(220).start();
            this.f57772S.animate().translationY((float) (-this.f57774U)).setDuration(220).start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo45415b(boolean z, View view) {
        m53846d(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo45412a(boolean z, View view) {
        m53846d(!z);
    }

    /* renamed from: a */
    public final void mo45413a(boolean z, boolean z2) {
        mo45324a(false);
        this.f57783x.setVisibility(8);
        this.f57780u.setBackgroundColor(getResources().getColor(R.color.j1));
        C21168a aVar = (C21168a) C22271m.m55124a(C21227aw.class, getArguments()).mo46372a("country_code_alpha_2", this.f57775p).mo46372a("country_code", this.f57776q).mo46372a("phone_number", this.f57777r).mo46373a("use_whatsapp_code", z).mo46373a("from_choose_dialog", !z2).mo46373a("reset_ticker", this.f57761G).mo46370a();
        aVar.mo45323a(this.f57511d);
        mo45321a((Fragment) aVar, false);
    }

    /* renamed from: b */
    private void m53844b(boolean z, boolean z2) {
        int i;
        String str;
        mo45324a(true);
        if (!C20884b.m53202c()) {
            i = C22165u.f59781u;
        } else {
            i = C22165u.f59761a;
        }
        this.f57785z = i;
        this.f57755A.f57791a = z;
        this.f57755A.f57792b = false;
        if (z) {
            FragmentActivity activity = getActivity();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57776q);
            sb.append(this.f57777r);
            C20900b.m53234a(activity, sb.toString(), "", this.f57785z, this.f57755A).mo24766d();
        } else {
            C13011d dVar = this.f57762H;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f57776q);
            sb2.append(this.f57777r);
            dVar.mo24614a(sb2.toString(), "", this.f57785z, (C13139p) this.f57755A);
        }
        if (z) {
            str = "send_whatsapp_code";
        } else {
            str = "send_sms";
        }
        C26890h.m65011a(str, new C20856a().mo44776a("send_method", "user_click").mo44774a("send_reason", C22165u.f59761a).mo44776a("enter_method", this.f57515m).mo44776a("enter_from", this.f57514l).f56798a);
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f57763I = (TextView) view.findViewById(R.id.bwh);
        this.f57778s = (EditText) view.findViewById(R.id.abz);
        this.f57780u = view.findViewById(R.id.abl);
        this.f57779t = view.findViewById(R.id.u0);
        this.f57781v = (LoginButton) view.findViewById(R.id.o9);
        this.f57781v.setLoginBackgroundRes(R.drawable.cgq);
        this.f57781v.setAutoMirrored(false);
        this.f57781v.setLoadingBackground(R.drawable.ch1);
        this.f57765K = view.findViewById(R.id.ob);
        this.f57783x = view.findViewById(R.id.dvj);
        this.f57766L = (TextView) view.findViewById(R.id.dvi);
        this.f57768O = (TextView) view.findViewById(R.id.title);
        this.f57769P = (TextView) view.findViewById(R.id.a_p);
        this.f57770Q = view.findViewById(R.id.d3l);
        this.f57771R = view.findViewById(R.id.d3m);
        this.f57772S = view.findViewById(R.id.zr);
        this.f57779t.setOnClickListener(new C21281bk(this));
        View view2 = this.f57765K;
        if (this.f57764J) {
            i = 8;
        } else {
            i = 0;
        }
        view2.setVisibility(i);
        View findViewById = view.findViewById(R.id.oc);
        findViewById.setOnTouchListener(new C48221a(0.5f, 150, null));
        findViewById.setOnClickListener(new C21282bl(this));
        this.f57778s.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                int i;
                boolean isEmpty = TextUtils.isEmpty(editable.toString());
                View view = C21271bi.this.f57779t;
                if (isEmpty) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
                C21271bi.this.f57781v.setEnabled(!isEmpty);
                if (isEmpty) {
                    C21271bi.this.f57783x.setVisibility(8);
                    C21271bi.this.f57780u.setBackgroundColor(C21271bi.this.getResources().getColor(R.color.j1));
                }
            }
        });
        this.f57778s.setOnFocusChangeListener(new C21283bm(this));
        this.f57781v.setOnClickListener(new C21284bn(this));
        C21285bo boVar = new C21285bo(this);
        this.f57763I.setOnTouchListener(new C48221a(0.5f, 150, null));
        this.f57763I.setOnClickListener(boVar);
        if (this.f57782w == 1) {
            this.f57768O.setText(R.string.can);
            this.f57769P.setVisibility(0);
            this.f57769P.setText(C2240a.m6772a(getResources().getString(R.string.c9v), new Object[]{this.f57784y}));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.b05, viewGroup, false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1024) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && this.f57511d != null) {
            Bundle bundle = new Bundle(getArguments());
            bundle.putString("platform", "email");
            this.f57511d.mo45026a(bundle);
        }
    }
}
