package com.bytedance.android.live.wallet.p260c;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;

/* renamed from: com.bytedance.android.live.wallet.c.k */
public final class C4374k extends C0649f implements OnClickListener {

    /* renamed from: a */
    private EditText f11963a;

    /* renamed from: b */
    private C4375a f11964b;

    /* renamed from: c */
    private C1690c f11965c;

    /* renamed from: com.bytedance.android.live.wallet.c.k$a */
    public interface C4375a {
        /* renamed from: a */
        void mo10159a(String str);
    }

    public final void dismiss() {
        super.dismiss();
        if (this.f11965c != null && !this.f11965c.isDisposed()) {
            this.f11965c.dispose();
        }
    }

    /* renamed from: a */
    public static C4374k m10673a(C4375a aVar) {
        C4374k kVar = new C4374k();
        kVar.f11964b = aVar;
        return kVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.zd);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return onCreateDialog;
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.d8c) {
            String obj = this.f11963a.getText().toString();
            if (TextUtils.isEmpty(obj) || !obj.contains("@")) {
                C4575an.m10981a((int) R.string.f3e);
                return;
            } else if (this.f11964b != null) {
                this.f11964b.mo10159a(obj);
            }
        }
        dismissAllowingStateLoss();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ai2, viewGroup, false);
        this.f11963a = (EditText) inflate.findViewById(R.id.acg);
        inflate.findViewById(R.id.bez).getLayoutParams().width = C3922z.m9910c();
        inflate.findViewById(R.id.dqz).setOnClickListener(this);
        inflate.findViewById(R.id.d8c).setOnClickListener(this);
        inflate.findViewById(R.id.d7e).setOnClickListener(this);
        return inflate;
    }
}
