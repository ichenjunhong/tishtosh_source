package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.uikit.dialog.C11104b;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.p683ss.android.ugc.aweme.account.util.C22284v;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.f */
public final class C22006f {

    /* renamed from: a */
    public Activity f59472a;

    /* renamed from: b */
    public ImageView f59473b;

    /* renamed from: c */
    EditText f59474c;

    /* renamed from: d */
    public TextView f59475d;

    /* renamed from: e */
    public View f59476e;

    /* renamed from: f */
    public C22007a f59477f;

    /* renamed from: g */
    public C22008b f59478g;

    /* renamed from: h */
    public String f59479h;

    /* renamed from: i */
    public String f59480i;

    /* renamed from: j */
    public C11104b f59481j;

    /* renamed from: k */
    private View f59482k;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.f$a */
    public interface C22007a {
        void onOk(String str, String str2);

        void onRefreshCaptcha();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.f$b */
    public interface C22008b {
        void onCancel();
    }

    public final void dismiss() {
        this.f59481j.dismiss();
    }

    public C22006f(Activity activity) {
        this.f59472a = activity;
        C11105a a = C22284v.m55156a(activity);
        View inflate = activity.getLayoutInflater().inflate(R.layout.azs, null);
        this.f59473b = (ImageView) inflate.findViewById(R.id.qk);
        this.f59482k = inflate.findViewById(R.id.sb);
        this.f59474c = (EditText) inflate.findViewById(R.id.qn);
        this.f59475d = (TextView) inflate.findViewById(R.id.ab7);
        this.f59476e = inflate.findViewById(R.id.c6n);
        this.f59482k.setOnClickListener(new C22009g(this));
        a.mo20138a(inflate);
        a.mo20141a(false);
        a.mo20136a((int) R.string.bv3, (OnClickListener) null);
        a.mo20145b((int) R.string.wf, (OnClickListener) new C22010h(this));
        this.f59481j = a.mo20143a();
        this.f59481j.setOnShowListener(new C22011i(this));
    }
}
