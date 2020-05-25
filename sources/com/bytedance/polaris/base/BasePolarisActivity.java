package com.bytedance.polaris.base;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.polaris.p826d.C12637g;
import com.bytedance.polaris.p826d.C12637g.C12638a;
import com.bytedance.polaris.widget.SwipeOverlayFrameLayout;
import com.bytedance.polaris.widget.SwipeOverlayFrameLayout.C12654a;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;

public abstract class BasePolarisActivity extends AbsPolarisActivity {

    /* renamed from: d */
    protected boolean f33009d;

    /* renamed from: e */
    protected View f33010e;

    /* renamed from: f */
    protected ViewGroup f33011f;

    /* renamed from: g */
    protected TextView f33012g;

    /* renamed from: h */
    public TextView f33013h;

    /* renamed from: i */
    protected TextView f33014i;

    /* renamed from: j */
    protected ProgressBar f33015j;

    /* renamed from: k */
    protected View f33016k;

    /* renamed from: l */
    protected SwipeOverlayFrameLayout f33017l;

    /* renamed from: m */
    public C12637g f33018m;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo23644d() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo23645e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo23646f() {
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C12638a mo23642b() {
        return new C12638a();
    }

    /* renamed from: h */
    public final void mo23647h() {
        if (this.f33011f != null) {
            this.f33011f.setVisibility(8);
        }
    }

    /* renamed from: o_ */
    public final void mo23648o_() {
        if (this.f33011f != null) {
            this.f33011f.setVisibility(0);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f33009d) {
            this.f33009d = false;
        }
    }

    public void onContentChanged() {
        int i;
        super.onContentChanged();
        if (this.f33018m != null) {
            C12637g gVar = this.f33018m;
            if (gVar.f33214h) {
                ViewGroup viewGroup = (ViewGroup) gVar.f33208b.findViewById(16908290);
                if (viewGroup != null) {
                    gVar.f33211e = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                    boolean z = gVar.f33216j;
                    if (VERSION.SDK_INT >= 21 && C12637g.f33207a && gVar.f33211e != null) {
                        View view = gVar.f33211e;
                        if (!z) {
                            i = 0;
                        } else if (gVar.f33209c != 0) {
                            i = gVar.f33209c;
                        } else {
                            gVar.f33209c = C12637g.m25392a((Context) gVar.f33208b, true);
                            i = gVar.f33209c;
                        }
                        view.setPadding(0, i, 0, 0);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo23643c() {
        this.f33010e = findViewById(R.id.cfl);
        this.f33011f = (ViewGroup) findViewById(R.id.d10);
        this.f33016k = findViewById(R.id.bqw);
        if (this.f33011f != null) {
            this.f33012g = (TextView) this.f33011f.findViewById(R.id.ij);
            this.f33013h = (TextView) this.f33011f.findViewById(R.id.ccu);
            this.f33014i = (TextView) this.f33011f.findViewById(R.id.title);
            this.f33015j = (ProgressBar) this.f33011f.findViewById(R.id.ccq);
        }
        if (this.f33012g != null) {
            this.f33012g.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    BasePolarisActivity.this.mo23646f();
                }
            });
        }
        View findViewById = findViewById(R.id.cvu);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.f33017l = (SwipeOverlayFrameLayout) findViewById;
        }
        if (mo23644d() && this.f33017l != null) {
            this.f33017l.setOnSwipeListener(new C12654a() {
                /* renamed from: a */
                public final boolean mo23651a() {
                    if (!BasePolarisActivity.this.mo23644d() || !BasePolarisActivity.this.mo23645e()) {
                        return false;
                    }
                    BasePolarisActivity.this.onBackPressed();
                    return true;
                }

                /* renamed from: b */
                public final boolean mo23652b() {
                    if (!BasePolarisActivity.this.mo23644d() || BasePolarisActivity.this.mo23645e()) {
                        return false;
                    }
                    BasePolarisActivity.this.onBackPressed();
                    return true;
                }
            });
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (this.f33014i != null) {
            this.f33014i.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        requestWindowFeature(10);
        try {
            this.f33018m = new C12637g(this, mo23642b());
            C12637g gVar = this.f33018m;
            if (VERSION.SDK_INT >= 21) {
                if (C12637g.f33207a) {
                    int i = gVar.f33210d;
                    if (VERSION.SDK_INT >= 21 && C12637g.f33207a) {
                        gVar.f33210d = i;
                        if (gVar.f33215i) {
                            if (gVar.f33213g) {
                                gVar.mo23736a(false);
                            } else {
                                if (!(gVar.f33210d == R.color.yv || gVar.f33210d == R.color.yw || gVar.f33210d == R.color.yy)) {
                                    if (gVar.f33210d != R.color.yz) {
                                        if (gVar.f33210d == R.color.z0) {
                                            gVar.mo23736a(true);
                                        }
                                    }
                                }
                                gVar.mo23736a(false);
                            }
                        }
                        gVar.f33208b.getWindow().setStatusBarColor(i);
                    }
                    if (!gVar.f33215i) {
                        gVar.mo23736a(gVar.f33212f);
                    }
                    if (gVar.f33214h) {
                        gVar.f33208b.getWindow().getDecorView().setSystemUiVisibility(PreloadTask.BYTE_UNIT_NUMBER);
                    }
                } else {
                    gVar.f33208b.getWindow().clearFlags(DynamicTabYellowPointVersion.DEFAULT);
                }
            }
        } catch (Throwable unused) {
        }
        super.onCreate(bundle);
        try {
            setContentView((int) R.layout.acj);
            mo23643c();
        } catch (NotFoundException unused2) {
            finish();
        }
    }
}
