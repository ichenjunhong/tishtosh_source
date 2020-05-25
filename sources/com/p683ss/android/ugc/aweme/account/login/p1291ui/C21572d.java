package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.telephony.PhoneNumberUtils;
import com.p683ss.android.mobilelib.present.CommonPresent;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a.C21135a;
import com.p683ss.android.ugc.aweme.main.service.C36699t;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.d */
public abstract class C21572d<T extends CommonPresent> extends C21542a<T> {

    /* renamed from: l */
    public C21135a f58509l = new C21135a();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo45840j() {
        return C21134a.m53621b(this.f58509l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final String mo45842l() {
        return this.f58509l.getRawInput();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final String mo45843m() {
        return this.f58509l.getCountryIso();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo45844n() {
        return this.f58509l.getCountryCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public String mo45845o() {
        return C21134a.m53619a(this.f58509l);
    }

    public void onResume() {
        super.onResume();
        mo45849q();
    }

    /* renamed from: a */
    private C21135a mo44971a() {
        if (getActivity() == null || !(getActivity() instanceof LoginOrRegisterActivity)) {
            return null;
        }
        return ((LoginOrRegisterActivity) getActivity()).f58363o;
    }

    /* renamed from: q */
    private void mo45849q() {
        if (mo44971a() != null) {
            this.f58509l.setCountryCode(mo44971a().getCountryCode());
            this.f58509l.setNationalNumber(mo44971a().getNationalNumber());
            this.f58509l.setRawInput(mo44971a().getRawInput());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo45841k() {
        C21135a aVar = this.f58509l;
        if (aVar != null && mo44971a() != null) {
            mo44971a().setCountryCode(aVar.getCountryCode());
            mo44971a().setNationalNumber(aVar.getNationalNumber());
            mo44971a().setRawInput(aVar.getRawInput());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final String mo45846p() {
        if (VERSION.SDK_INT >= 21) {
            StringBuilder sb = new StringBuilder("+");
            sb.append(this.f58509l.getCountryCode());
            sb.append(' ');
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f58509l.getNationalNumber());
            sb.append(C21134a.m53620a(sb2.toString()));
            return PhoneNumberUtils.formatNumber(sb.toString(), this.f58509l.getCountryIso());
        }
        StringBuilder sb3 = new StringBuilder("+");
        sb3.append(this.f58509l.getCountryCode());
        sb3.append(' ');
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f58509l.getNationalNumber());
        sb3.append(C21134a.m53620a(sb4.toString()));
        return sb3.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45838a(int i) {
        this.f58509l.setCountryCode(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo45839a(long j) {
        this.f58509l.setNationalNumber(j);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        mo45849q();
        if (mo45844n() == 0) {
            mo45838a(C21134a.m53618a((Context) activity).mo45244a(((C36699t) C23826bi.m58450a(C36699t.class)).mo47865b(), Locale.getDefault().getCountry()));
        }
    }
}
