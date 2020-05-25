package com.p683ss.android.ugc.aweme.p2377ug.referral;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.common.p920d.C13683f;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.ug.referral.a */
public final class C47486a extends Dialog {

    /* renamed from: a */
    final String f119765a;

    /* renamed from: b */
    public final String f119766b;

    /* renamed from: c */
    final Activity f119767c;

    /* renamed from: d */
    private final String f119768d;

    /* renamed from: e */
    private final String f119769e;

    /* renamed from: f */
    private CircleImageView f119770f = ((CircleImageView) findViewById(R.id.b5_));

    /* renamed from: g */
    private DmtTextView f119771g = ((DmtTextView) findViewById(R.id.dao));

    /* renamed from: h */
    private DmtTextView f119772h = ((DmtTextView) findViewById(R.id.dap));

    /* renamed from: i */
    private DmtButton f119773i = ((DmtButton) findViewById(R.id.p8));

    /* renamed from: j */
    private ImageView f119774j = ((ImageView) findViewById(R.id.ayq));

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C47490d.f119778a = true;
        C26890h.m65011a("referral_pop_up", C13683f.m27638of("referral_code", this.f119766b, "invite_user_id", this.f119765a));
    }

    public C47486a(Context context, Activity activity, String str, String str2, String str3, String str4) {
        super(context);
        getWindow().setBackgroundDrawableResource(R.color.a8w);
        getWindow().requestFeature(1);
        setContentView(R.layout.b4g);
        setCanceledOnTouchOutside(false);
        this.f119765a = str;
        this.f119768d = str2;
        this.f119769e = str3;
        this.f119766b = str4;
        this.f119767c = activity;
        C23515d.m57677a((RemoteImageView) this.f119770f, this.f119769e);
        this.f119771g.setText(getContext().getString(R.string.bt_, new Object[]{this.f119768d}));
        this.f119772h.setText(R.string.bta);
        this.f119773i.setOnClickListener(new C47488b(this));
        this.f119774j.setOnClickListener(new C47489c(this));
    }
}
