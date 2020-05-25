package com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.text.EffectTextInputView.C46525a;
import com.p683ss.android.ugc.tools.view.widget.C50275d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.text.e */
public final class C46531e extends C46541n {
    /* renamed from: a */
    public final void mo93311a() {
        if (!TextUtils.isEmpty(this.f117436j) && this.f117429c != null && this.f117430d != null) {
            this.f117429c.mo43471a(this.f117436j, this.f117430d.f117424b, this.f117430d.f117425c, this.f117430d.f117426d);
            this.f117429c.mo43515d(true);
        }
    }

    /* renamed from: a */
    public final C46541n mo93307a(EffectTextInputView effectTextInputView) {
        effectTextInputView.setEffectTextChangeListener(new C46525a() {
            /* renamed from: a */
            public final void mo93304a(String str) {
                if (C46531e.this.f117433g) {
                    C46531e.this.mo93320a(str);
                }
            }

            /* renamed from: b */
            public final void mo93305b(String str) {
                C46531e.this.f117436j = str;
                C46531e.this.f117429c.mo43515d(true);
                C46531e.this.f117429c.mo43471a(str, C46531e.this.f117430d.f117424b, C46531e.this.f117430d.f117425c, C46531e.this.f117430d.f117426d);
            }
        });
        return super.mo93307a(effectTextInputView);
    }

    public C46531e(FragmentActivity fragmentActivity, C20489b bVar) {
        super(fragmentActivity, bVar);
    }

    /* renamed from: a */
    public final int mo93306a(int i, String str) {
        this.f117429c.mo43463a((OnARTextCountCallback) new C46533f(this, i, str));
        return this.f117435i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo93312a(int i, int i2, String str) {
        this.f117435i = i;
        if (this.f117435i > 0 || i2 != 1) {
            if (!TextUtils.isEmpty(str)) {
                this.f117435i += str.length();
            }
            if (this.f117427a != null) {
                this.f117427a.setMaxTextCount(this.f117435i);
            }
            return;
        }
        C50275d.m108539b((Context) this.f117432f, this.f117432f.getResources().getString(R.string.d52)).mo98174a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo93313a(int i, String str, int i2) {
        this.f117432f.runOnUiThread(new C46534g(this, i2, i, str));
    }
}
