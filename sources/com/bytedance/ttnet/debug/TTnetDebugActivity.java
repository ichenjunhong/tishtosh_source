package com.bytedance.ttnet.debug;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.bytedance.ttnet.C13303d;
import com.bytedance.ttnet.C13303d.C13311a;
import com.ss.android.ugc.trill.R;

public class TTnetDebugActivity extends Activity {

    /* renamed from: a */
    private CheckBox f34752a;

    /* renamed from: b */
    private CheckBox f34753b;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.abl);
        if (C13303d.m26788a() == C13311a.RELEASE) {
            finish();
            return;
        }
        this.f34752a = (CheckBox) findViewById(R.id.biy);
        this.f34752a.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C13320b.m26823a(TTnetDebugActivity.this, C13320b.f34757a, String.valueOf(z));
                if (z) {
                    C13319a.m26821a();
                }
            }
        });
        this.f34753b = (CheckBox) findViewById(R.id.dvs);
        this.f34753b.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C13320b.m26823a(TTnetDebugActivity.this, C13320b.f34758b, String.valueOf(z));
            }
        });
        if (C13320b.m26824a(this)) {
            this.f34752a.setChecked(true);
        }
        if ("true".equals(C13320b.m26822a(this, C13320b.f34758b))) {
            this.f34753b.setChecked(true);
        }
    }
}
