package com.zhihu.matisse.internal.p2254ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.view.ViewPager;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p030v4.view.p042b.C1023b;
import android.support.p043v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27548d;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33102c;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.C45352b;
import com.zhihu.matisse.internal.entity.C45353c;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p2252b.C45344c;
import com.zhihu.matisse.internal.p2253c.C45347c;
import com.zhihu.matisse.internal.p2253c.C45348d;
import com.zhihu.matisse.internal.p2254ui.p2626a.C52533c;
import com.zhihu.matisse.internal.p2254ui.widget.C52542b;
import com.zhihu.matisse.internal.p2254ui.widget.CheckRadioView;
import com.zhihu.matisse.internal.p2254ui.widget.CheckView;
import com.zhihu.matisse.p2250b.C45335b;
import p2674it.sephiroth.android.library.imagezoom.ImageViewTouch;

/* renamed from: com.zhihu.matisse.internal.ui.BasePreviewActivity */
public abstract class BasePreviewActivity extends AppCompatActivity implements C0997e, OnClickListener, C45335b {

    /* renamed from: a */
    protected final C45344c f114688a = new C45344c(this);

    /* renamed from: b */
    protected C45353c f114689b;

    /* renamed from: c */
    protected ViewPager f114690c;

    /* renamed from: d */
    protected C52533c f114691d;

    /* renamed from: e */
    protected CheckView f114692e;

    /* renamed from: f */
    protected TextView f114693f;

    /* renamed from: g */
    protected TextView f114694g;

    /* renamed from: h */
    protected TextView f114695h;

    /* renamed from: i */
    protected int f114696i = -1;

    /* renamed from: j */
    public CheckRadioView f114697j;

    /* renamed from: k */
    protected boolean f114698k;

    /* renamed from: l */
    private LinearLayout f114699l;

    /* renamed from: m */
    private FrameLayout f114700m;

    /* renamed from: n */
    private FrameLayout f114701n;

    /* renamed from: o */
    private boolean f114702o = false;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onBackPressed() {
        m98901a(false);
        super.onBackPressed();
    }

    /* renamed from: d */
    public final int mo91680d() {
        int f = this.f114688a.mo91654f();
        int i = 0;
        for (int i2 = 0; i2 < f; i2++) {
            Item item = (Item) this.f114688a.mo91645b().get(i2);
            if (item.mo91663a() && C45347c.m98877a(item.f114656d) > ((float) this.f114689b.f114683t)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private void mo91640a() {
        this.f114697j.setChecked(this.f114698k);
        if (!this.f114698k) {
            this.f114697j.setColor(-1);
        }
        if (mo91680d() > 0 && this.f114698k) {
            C52542b.m112029a("", getString(R.string.c4z, new Object[]{Integer.valueOf(this.f114689b.f114683t)})).show(getSupportFragmentManager(), C52542b.class.getName());
            this.f114697j.setChecked(false);
            this.f114697j.setColor(-1);
            this.f114698k = false;
        }
    }

    /* renamed from: c */
    public final void mo91679c() {
        int f = this.f114688a.mo91654f();
        if (f == 0) {
            this.f114694g.setText(R.string.c4s);
            this.f114694g.setEnabled(false);
        } else if (f != 1 || !this.f114689b.mo91672b()) {
            this.f114694g.setEnabled(true);
            this.f114694g.setText(getString(R.string.c4r, new Object[]{Integer.valueOf(f)}));
        } else {
            this.f114694g.setText(R.string.c4s);
            this.f114694g.setEnabled(true);
        }
        if (this.f114689b.f114681r) {
            this.f114699l.setVisibility(0);
            mo91640a();
            return;
        }
        this.f114699l.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo91626b() {
        if (this.f114689b.f114682s) {
            if (this.f114702o) {
                this.f114701n.animate().setInterpolator(new C1023b()).translationYBy((float) this.f114701n.getMeasuredHeight()).start();
                this.f114700m.animate().translationYBy((float) (-this.f114700m.getMeasuredHeight())).setInterpolator(new C1023b()).start();
            } else {
                this.f114701n.animate().setInterpolator(new C1023b()).translationYBy((float) (-this.f114701n.getMeasuredHeight())).start();
                this.f114700m.animate().setInterpolator(new C1023b()).translationYBy((float) this.f114700m.getMeasuredHeight()).start();
            }
            this.f114702o = !this.f114702o;
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        Context b = C33102c.m76095b(context);
        C27548d.m66217a(b);
        super.attachBaseContext(b);
    }

    /* renamed from: b */
    public final boolean mo91678b(Item item) {
        C45352b d = this.f114688a.mo91650d(item);
        C45352b.m98892a(this, d);
        if (d == null) {
            return true;
        }
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f114688a.mo91646b(bundle);
        bundle.putBoolean("checkState", this.f114698k);
        super.onSaveInstanceState(bundle);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.pz) {
            onBackPressed();
            return;
        }
        if (view.getId() == R.id.py) {
            m98901a(true);
            finish();
        }
    }

    /* renamed from: a */
    private void m98901a(boolean z) {
        Intent intent = new Intent();
        intent.putExtra("extra_result_bundle", this.f114688a.mo91642a());
        intent.putExtra("extra_result_apply", z);
        intent.putExtra("extra_result_original_enable", this.f114698k);
        setResult(-1, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91676a(Item item) {
        if (item.mo91664b()) {
            this.f114695h.setVisibility(0);
            TextView textView = this.f114695h;
            StringBuilder sb = new StringBuilder();
            sb.append(C45347c.m98877a(item.f114656d));
            sb.append("M");
            textView.setText(sb.toString());
        } else {
            this.f114695h.setVisibility(8);
        }
        if (item.mo91665c()) {
            this.f114699l.setVisibility(8);
            return;
        }
        if (this.f114689b.f114681r) {
            this.f114699l.setVisibility(0);
        }
    }

    public void onPageSelected(int i) {
        CheckView checkView;
        CheckView checkView2;
        C52533c cVar = (C52533c) this.f114690c.getAdapter();
        if (!(this.f114696i == -1 || this.f114696i == i)) {
            C45360b bVar = (C45360b) cVar.instantiateItem(this.f114690c, this.f114696i);
            if (bVar.getView() != null) {
                ((ImageViewTouch) bVar.getView().findViewById(R.id.arl)).mo110710a();
            }
            Item c = cVar.mo110066c(i);
            boolean z = true;
            if (this.f114689b.f114669f) {
                int e = this.f114688a.mo91652e(c);
                this.f114692e.setCheckedNum(e);
                if (e > 0) {
                    checkView2 = this.f114692e;
                } else {
                    checkView2 = this.f114692e;
                    if (this.f114688a.mo91653e()) {
                        z = false;
                    }
                }
                checkView2.setEnabled(z);
            } else {
                boolean c2 = this.f114688a.mo91649c(c);
                this.f114692e.setChecked(c2);
                if (c2) {
                    checkView = this.f114692e;
                } else {
                    checkView = this.f114692e;
                    if (this.f114688a.mo91653e()) {
                        z = false;
                    }
                }
                checkView.setEnabled(z);
            }
            mo91676a(c);
        }
        this.f114696i = i;
    }

    public void onCreate(Bundle bundle) {
        setTheme(C45353c.m98893a().f114667d);
        super.onCreate(bundle);
        if (!C45353c.m98893a().f114679p) {
            setResult(0);
            finish();
            return;
        }
        setContentView((int) R.layout.cn);
        if (C45348d.m98882b()) {
            getWindow().addFlags(67108864);
        }
        this.f114689b = C45353c.m98893a();
        if (this.f114689b.mo91673c()) {
            setRequestedOrientation(this.f114689b.f114668e);
        }
        if (bundle == null) {
            this.f114688a.mo91643a(getIntent().getBundleExtra("extra_default_bundle"));
            this.f114698k = getIntent().getBooleanExtra("extra_result_original_enable", false);
        } else {
            this.f114688a.mo91643a(bundle);
            this.f114698k = bundle.getBoolean("checkState");
        }
        this.f114693f = (TextView) findViewById(R.id.pz);
        this.f114694g = (TextView) findViewById(R.id.py);
        this.f114695h = (TextView) findViewById(R.id.cp1);
        this.f114693f.setOnClickListener(this);
        this.f114694g.setOnClickListener(this);
        this.f114690c = (ViewPager) findViewById(R.id.bvv);
        this.f114690c.addOnPageChangeListener(this);
        this.f114691d = new C52533c(getSupportFragmentManager(), null);
        this.f114690c.setAdapter(this.f114691d);
        this.f114692e = (CheckView) findViewById(R.id.sw);
        this.f114692e.setCountable(this.f114689b.f114669f);
        this.f114700m = (FrameLayout) findViewById(R.id.md);
        this.f114701n = (FrameLayout) findViewById(R.id.d3n);
        this.f114692e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (BasePreviewActivity.this.f114691d.getCount() > 0) {
                    Item c = BasePreviewActivity.this.f114691d.mo110066c(BasePreviewActivity.this.f114690c.getCurrentItem());
                    if (BasePreviewActivity.this.f114688a.mo91649c(c)) {
                        BasePreviewActivity.this.f114688a.mo91647b(c);
                        if (BasePreviewActivity.this.f114689b.f114669f) {
                            BasePreviewActivity.this.f114692e.setCheckedNum(DynamicTabYellowPointVersion.DEFAULT);
                        } else {
                            BasePreviewActivity.this.f114692e.setChecked(false);
                        }
                    } else if (BasePreviewActivity.this.mo91678b(c)) {
                        BasePreviewActivity.this.f114688a.mo91644a(c);
                        if (BasePreviewActivity.this.f114689b.f114669f) {
                            BasePreviewActivity.this.f114692e.setCheckedNum(BasePreviewActivity.this.f114688a.mo91652e(c));
                        } else {
                            BasePreviewActivity.this.f114692e.setChecked(true);
                        }
                    }
                    BasePreviewActivity.this.mo91679c();
                    if (BasePreviewActivity.this.f114689b.f114680q != null) {
                        BasePreviewActivity.this.f114688a.mo91648c();
                        BasePreviewActivity.this.f114688a.mo91651d();
                    }
                }
            }
        });
        this.f114699l = (LinearLayout) findViewById(R.id.bvh);
        this.f114697j = (CheckRadioView) findViewById(R.id.bvg);
        this.f114699l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                int d = BasePreviewActivity.this.mo91680d();
                if (d > 0) {
                    C52542b.m112029a("", BasePreviewActivity.this.getString(R.string.c4y, new Object[]{Integer.valueOf(d), Integer.valueOf(BasePreviewActivity.this.f114689b.f114683t)})).show(BasePreviewActivity.this.getSupportFragmentManager(), C52542b.class.getName());
                    return;
                }
                BasePreviewActivity.this.f114698k = true ^ BasePreviewActivity.this.f114698k;
                BasePreviewActivity.this.f114697j.setChecked(BasePreviewActivity.this.f114698k);
                if (!BasePreviewActivity.this.f114698k) {
                    BasePreviewActivity.this.f114697j.setColor(-1);
                }
            }
        });
        mo91679c();
    }
}
