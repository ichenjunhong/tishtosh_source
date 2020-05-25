package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35200an;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.k */
final /* synthetic */ class C33627k implements OnClickListener {

    /* renamed from: a */
    private final C33611i f87168a;

    C33627k(C33611i iVar) {
        this.f87168a = iVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C33611i iVar = this.f87168a;
        if (!C35200an.m79575a(view, 500)) {
            int i = -2;
            if (view.equals(iVar.f87121c)) {
                iVar.mo71055c(-2);
            } else if (view.equals(iVar.f87123e)) {
                iVar.mo71062j();
                iVar.f87120b.bh_();
            } else if (view.equals(iVar.f87122d)) {
                iVar.f87122d.setSelected(!iVar.f87122d.isSelected());
                if (iVar.f87122d.isSelected()) {
                    iVar.f87122d.setImageResource(R.drawable.d89);
                    iVar.f87122d.setContentDescription(iVar.mo71060h().getResources().getString(R.string.be_));
                    if (C34004b.m77718b().enableExpressionTab()) {
                        boolean z = false;
                        iVar.f87128j.setVisibility(0);
                        if (iVar.f87128j.getCheckedRadioButtonId() == R.id.c92) {
                            z = true;
                        }
                        if (!z) {
                            i = 1;
                        }
                        iVar.mo71055c(i);
                        iVar.mo71052a(z);
                    } else {
                        iVar.mo71055c(1);
                    }
                    C35190af.m79442a();
                    C35190af.m79477b();
                    return;
                }
                iVar.f87122d.setImageResource(2131954291);
                iVar.f87122d.setContentDescription(iVar.mo71060h().getResources().getString(R.string.be3));
                iVar.mo71055c(-2);
                iVar.mo71063k();
            } else if (view.equals(iVar.f87124f)) {
                if (iVar.f87134p == 4) {
                    iVar.mo71057d(5);
                    return;
                }
                iVar.mo71057d(4);
            }
        }
    }
}
