package com.bytedance.android.live.broadcast.p198b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.floatwindow.C7184i;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.widget.C8543d;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.b.i */
public final class C3073i extends C8543d implements OnCheckedChangeListener {

    /* renamed from: a */
    private boolean f8998a;

    /* renamed from: b */
    private boolean f8999b;

    /* renamed from: c */
    private ToggleButton f9000c;

    /* renamed from: d */
    private ToggleButton f9001d;

    /* renamed from: e */
    private ToggleButton f9002e;

    /* renamed from: f */
    private boolean f9003f;

    /* renamed from: h */
    private boolean f9004h;

    /* renamed from: a */
    public final int mo8344a() {
        return R.layout.ait;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getWindow() != null && !C3922z.m9916f()) {
            getWindow().setLayout(C3922z.m9899a(376.0f), C3922z.m9899a(230.0f));
            getWindow().setGravity(8388693);
        }
        this.f9000c = (ToggleButton) findViewById(R.id.d1w);
        this.f9001d = (ToggleButton) findViewById(R.id.d1y);
        this.f9002e = (ToggleButton) findViewById(R.id.d1x);
        this.f9000c.setChecked(this.f8998a);
        this.f9001d.setChecked(this.f8999b);
        this.f9002e.setChecked(this.f9004h);
        this.f9000c.setOnCheckedChangeListener(this);
        this.f9001d.setOnCheckedChangeListener(this);
        this.f9002e.setOnCheckedChangeListener(this);
        findViewById(R.id.d1x).setVisibility(8);
        this.f9002e.setVisibility(8);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int id = compoundButton.getId();
        if (id == R.id.d1w) {
            this.f8998a = z;
            C4525b.f12364ag.mo10346a(Boolean.valueOf(this.f8998a));
        } else if (id == R.id.d1y) {
            this.f8999b = z;
            C4525b.f12365ah.mo10346a(Boolean.valueOf(this.f8999b));
        } else if (id == R.id.d1x) {
            this.f9004h = z;
            C4525b.f12365ah.mo10346a(Boolean.valueOf(this.f9004h));
        }
        if (z && !C7184i.m14909a(getContext())) {
            new C8552a(getContext(), 0).mo15012d((int) R.string.f0t).mo15008c((int) R.string.eo3).mo15003b(0, (int) R.string.exh, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C7184i.m14912b(C3073i.this.getContext());
                    dialogInterface.dismiss();
                }
            }).mo15003b(1, (int) R.string.e45, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo15001b().show();
        }
    }

    public C3073i(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        super(context);
        this.f8998a = z;
        this.f8999b = z2;
        this.f9003f = z4;
        this.f9004h = z3;
    }
}
