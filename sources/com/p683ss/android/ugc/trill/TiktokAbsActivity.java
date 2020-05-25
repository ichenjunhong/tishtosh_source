package com.p683ss.android.ugc.trill;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.content.C0732g;
import android.view.View;
import com.bytedance.common.utility.p522b.C9379e;
import com.bytedance.ies.uikit.base.C11081c;
import com.bytedance.ies.uikit.base.C11081c.C11082a;
import com.bytedance.ies.uikit.base.C11081c.C11083b;
import com.bytedance.ies.uikit.base.C11081c.C11084c;
import com.bytedance.ies.uikit.base.C11086d;
import com.bytedance.ies.uikit.base.C11087e;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.activity.C23424c;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.trill.TiktokAbsActivity */
public abstract class TiktokAbsActivity extends Activity implements C11086d {

    /* renamed from: c */
    protected static int f126170c;

    /* renamed from: a */
    protected boolean f126171a;

    /* renamed from: b */
    protected boolean f126172b;

    /* renamed from: d */
    protected int f126173d = 0;

    /* renamed from: e */
    private C9379e<C11087e> f126174e = new C9379e<>();

    /* renamed from: f */
    private BroadcastReceiver f126175f;

    /* renamed from: a */
    private int m108555a() {
        return getResources().getColor(R.color.f8);
    }

    /* renamed from: b */
    private void m108556b() {
        if (VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(m108555a());
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            C11065a.m22392a(this, m108555a());
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (f126170c == 0) {
            C11084c d = C11081c.m22432d();
            if (d != null) {
                d.mo20107a(false);
            }
        }
        f126170c++;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C0732g.m2130a((Context) this).mo2402a(this.f126175f);
        super.onDestroy();
        this.f126172b = true;
        if (!this.f126174e.mo17007b()) {
            Iterator it = this.f126174e.iterator();
            while (it.hasNext()) {
                C11087e eVar = (C11087e) it.next();
                if (eVar != null) {
                    eVar.bi_();
                }
            }
            this.f126174e.mo17004a();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f126171a = false;
        C11082a b = C11081c.m22430b();
        if (b != null) {
            b.mo20105b(this);
        }
        if (!this.f126174e.mo17007b()) {
            Iterator it = this.f126174e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f126171a = true;
        C11082a b = C11081c.m22430b();
        if (b != null) {
            b.mo20104a(this);
        }
        if (!this.f126174e.mo17007b()) {
            Iterator it = this.f126174e.iterator();
            while (it.hasNext()) {
                C11087e eVar = (C11087e) it.next();
                if (eVar != null) {
                    eVar.mo20108a();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        int i = f126170c - 1;
        f126170c = i;
        if (i == 0) {
            C11084c d = C11081c.m22432d();
            if (d != null) {
                d.mo20107a(true);
            }
        }
        this.f126171a = false;
        if (!this.f126174e.mo17007b()) {
            Iterator it = this.f126174e.iterator();
            while (it.hasNext()) {
                C11087e eVar = (C11087e) it.next();
                if (eVar != null) {
                    eVar.bj_();
                }
            }
        }
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m108556b();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m108556b();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f126175f = new BroadcastReceiver() {
            public final void onReceive(Context context, Intent intent) {
                if (!TiktokAbsActivity.this.isFinishing()) {
                    TiktokAbsActivity.this.finish();
                }
            }
        };
        C0732g.m2130a((Context) this).mo2403a(this.f126175f, new IntentFilter("com.ss.android.common.app.action.exit_app"));
        if (this.f126173d != 0) {
            C23424c.m57556a(this, this.f126173d);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C11083b c = C11081c.m22431c();
        if (c == null || !c.mo20106a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }
}
