package com.p683ss.android.ugc.aweme.app.debug;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.C41592d;
import com.p683ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p683ss.android.ugc.aweme.setting.p2136e.C41595a;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.app.debug.AbsABActivity */
public abstract class AbsABActivity extends AmeBaseActivity {

    /* renamed from: c */
    protected LinearLayout f61448c;

    /* renamed from: d */
    protected AbTestModel f61449d;

    /* renamed from: e */
    protected C23074a f61450e;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.a3;
    }

    public void back() {
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo47790c();

    public boolean isRegisterEventBus() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo47794d() {
        this.f61450e = (C23074a) getIntent().getSerializableExtra("paeg_param");
        ((TextView) findViewById(R.id.title)).setText(this.f61450e.category);
        this.f61448c = (LinearLayout) findViewById(R.id.b6t);
        this.f61449d = C41589c.m91432a().mo85306m();
        mo47790c();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo47794d();
    }

    @C53771m
    public void onEvent(C41595a aVar) {
        C41592d.m91454b().mo49464a(getApplicationContext(), "ab_test_model", (Object) this.f61449d);
    }
}
