package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.text.Editable;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.login.C22041x;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.aj */
final /* synthetic */ class C21202aj implements Runnable {

    /* renamed from: a */
    private final C211981 f57600a;

    /* renamed from: b */
    private final Editable f57601b;

    C21202aj(C211981 r1, Editable editable) {
        this.f57600a = r1;
        this.f57601b = editable;
    }

    public final void run() {
        C211981 r0 = this.f57600a;
        Editable editable = this.f57601b;
        if (editable.toString().length() >= 0 && editable.toString().length() < 8) {
            C21197ah.this.f57586o.setEnabled(false);
        } else if (editable.toString().length() > 20) {
            C21197ah.this.f57587p.setVisibility(0);
            C21197ah.this.f57588q.setText(C21197ah.this.getResources().getString(R.string.cbg));
            C21197ah.this.f57586o.setEnabled(false);
        } else if (TextUtils.isEmpty(editable.toString()) || C22041x.m54771a(editable.toString())) {
            C21197ah.this.f57587p.setVisibility(8);
            C21197ah.this.f57586o.setEnabled(true);
        } else {
            C21197ah.this.f57587p.setVisibility(0);
            C21197ah.this.f57588q.setText(C21197ah.this.getResources().getString(R.string.cbd));
            C21197ah.this.f57586o.setEnabled(false);
        }
    }
}
