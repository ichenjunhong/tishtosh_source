package com.p683ss.android.ugc.aweme.homepage.p1801ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.k */
public abstract class C33071k extends FrameLayout {

    /* renamed from: a */
    private String f85886a;

    /* renamed from: b */
    private boolean f85887b;

    /* renamed from: c */
    private MainBottomTabView f85888c;

    /* renamed from: e */
    public boolean f85889e;

    /* renamed from: f */
    protected boolean f85890f;

    /* renamed from: a */
    public abstract void mo70006a();

    /* renamed from: a */
    public abstract void mo70007a(int i);

    /* renamed from: a */
    public abstract void mo70008a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo70009b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo70010c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo70011d();

    /* renamed from: e */
    public abstract void mo70012e();

    /* renamed from: f */
    public abstract void mo70013f();

    /* renamed from: g */
    public abstract void mo70014g();

    public MainBottomTabView getMainBottomView() {
        return this.f85888c;
    }

    public ImageView getRefreshIcon() {
        return null;
    }

    public String getTabType() {
        return this.f85886a;
    }

    /* renamed from: h */
    public abstract void mo70016h();

    public boolean isSelected() {
        return this.f85887b;
    }

    /* renamed from: j */
    public abstract void mo70018j();

    /* renamed from: k */
    public abstract void mo70019k();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo70024r() {
    }

    public void setActivated(boolean z) {
    }

    /* renamed from: p */
    public final void mo70065p() {
        setSelected(false);
        if (this.f85889e) {
            mo70009b();
        } else {
            mo70006a();
        }
    }

    /* renamed from: q */
    public final void mo70066q() {
        if (!this.f85889e) {
            this.f85889e = true;
            mo70011d();
        }
    }

    public void setRefreshing(boolean z) {
        this.f85889e = z;
    }

    public void setSelected(boolean z) {
        this.f85887b = z;
    }

    /* renamed from: b */
    public final void mo70061b(boolean z) {
        setSelected(true);
        if (this.f85889e) {
            mo70010c();
        } else {
            mo70008a(z);
        }
    }

    /* renamed from: a */
    public final void mo70060a(String str) {
        int i;
        if (getRefreshIcon() != null) {
            ImageView refreshIcon = getRefreshIcon();
            Resources resources = getResources();
            if ("HOME".equals(str)) {
                i = R.color.aod;
            } else {
                i = R.color.ji;
            }
            refreshIcon.setColorFilter(resources.getColor(i));
        }
    }

    public C33071k(Context context, String str, MainBottomTabView mainBottomTabView) {
        super(context);
        this.f85886a = str;
        this.f85888c = mainBottomTabView;
    }
}
