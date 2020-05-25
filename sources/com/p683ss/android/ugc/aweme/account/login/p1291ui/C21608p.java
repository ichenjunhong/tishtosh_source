package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.C0654k;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.dialog.C11104b;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.p683ss.android.ugc.aweme.account.util.C22284v;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.p */
public final class C21608p extends C0649f {

    /* renamed from: a */
    public EditText f58588a;

    /* renamed from: b */
    public TextView f58589b;

    /* renamed from: c */
    public View f58590c;

    /* renamed from: d */
    public C21612a f58591d;

    /* renamed from: e */
    public C21613b f58592e;

    /* renamed from: f */
    public int f58593f;

    /* renamed from: g */
    public boolean f58594g;

    /* renamed from: h */
    private ImageView f58595h;

    /* renamed from: i */
    private View f58596i;

    /* renamed from: j */
    private String f58597j;

    /* renamed from: k */
    private boolean f58598k;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.p$a */
    public interface C21612a {
        /* renamed from: a */
        void mo45150a();

        /* renamed from: b */
        void mo45151b(String str, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.p$b */
    public interface C21613b {
        /* renamed from: b */
        void mo45889b();
    }

    public final void onStop() {
        super.onStop();
        this.f58598k = false;
    }

    public final void onStart() {
        super.onStart();
        this.f58598k = true;
        mo45885a(this.f58597j, "", this.f58593f);
        C11104b bVar = (C11104b) getDialog();
        if (bVar != null) {
            bVar.mo20129a(-1).setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (C21608p.this.f58591d == null) {
                        C21608p.this.dismiss();
                    } else if (TextUtils.isEmpty(C21608p.this.f58588a.getText().toString())) {
                        C21608p.this.f58590c.setVisibility(8);
                        C21608p.this.f58589b.setText(R.string.ayx);
                        C21608p.this.f58589b.setVisibility(0);
                    } else {
                        C21608p.this.f58591d.mo45151b(C21608p.this.f58588a.getText().toString(), C21608p.this.f58593f);
                    }
                }
            });
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f58589b != null) {
            this.f58589b.setVisibility(4);
        }
        super.onDismiss(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f58597j = arguments.getString("captcha_data");
        this.f58593f = arguments.getInt("captcha_scenario");
        setCancelable(false);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C11105a a = C22284v.m55156a(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.azs, null);
        this.f58595h = (ImageView) inflate.findViewById(R.id.qk);
        this.f58596i = inflate.findViewById(R.id.sb);
        this.f58588a = (EditText) inflate.findViewById(R.id.qn);
        this.f58589b = (TextView) inflate.findViewById(R.id.ab7);
        this.f58590c = inflate.findViewById(R.id.c6n);
        this.f58596i.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C21608p.this.f58591d != null) {
                    C21608p.this.f58591d.mo45150a();
                }
            }
        });
        a.mo20138a(inflate);
        a.mo20136a((int) R.string.bv3, (DialogInterface.OnClickListener) null);
        a.mo20145b((int) R.string.wf, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (C21608p.this.f58592e != null) {
                    C21608p.this.f58592e.mo45889b();
                }
            }
        });
        return a.mo20143a();
    }

    public final void show(C0654k kVar, String str) {
        try {
            super.show(kVar, str);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public static C21608p m54320a(String str, int i, C21612a aVar) {
        C21608p pVar = new C21608p();
        Bundle bundle = new Bundle();
        bundle.putString("captcha_data", str);
        bundle.putInt("captcha_scenario", i);
        pVar.setArguments(bundle);
        pVar.f58591d = aVar;
        return pVar;
    }

    /* renamed from: a */
    public final void mo45885a(String str, String str2, int i) {
        if (this.f58598k) {
            this.f58593f = i;
            this.f58597j = str;
            if (this.f58595h != null) {
                LayoutParams layoutParams = this.f58595h.getLayoutParams();
                try {
                    byte[] decode = Base64.decode(this.f58597j, 1);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    this.f58595h.setImageBitmap(decodeByteArray);
                    if (decodeByteArray.getWidth() <= 0 || decodeByteArray.getHeight() <= 0) {
                        layoutParams.height = 0;
                    } else {
                        layoutParams.width = getResources().getDimensionPixelSize(R.dimen.wy);
                        layoutParams.height = (layoutParams.width * decodeByteArray.getHeight()) / decodeByteArray.getWidth();
                    }
                } catch (Exception unused) {
                    layoutParams.height = 0;
                }
            }
            if (TextUtils.isEmpty(str2)) {
                this.f58590c.setVisibility(0);
                this.f58589b.setVisibility(8);
                return;
            }
            this.f58590c.setVisibility(8);
            this.f58589b.setVisibility(0);
            this.f58589b.setText(str2);
        }
    }
}
