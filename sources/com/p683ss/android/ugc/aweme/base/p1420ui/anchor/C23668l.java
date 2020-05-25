package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.bullet.p653ui.common.BulletContainerView;
import com.p683ss.android.ugc.aweme.bullet.C24098a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.l */
public abstract class C23668l implements C23667k {

    /* renamed from: a */
    private boolean f63100a;

    /* renamed from: t */
    public final ViewGroup f63101t;

    /* renamed from: c */
    public abstract boolean mo49081c();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final BulletContainerView mo49101i() {
        View childAt = this.f63101t.getChildAt(1);
        if (!(childAt instanceof BulletContainerView)) {
            childAt = null;
        }
        return (BulletContainerView) childAt;
    }

    public C23668l(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        this.f63101t = viewGroup;
    }

    /* renamed from: a */
    public void mo49076a(Aweme aweme, JSONObject jSONObject) {
        if (mo49081c() && !this.f63100a) {
            ViewGroup viewGroup = this.f63101t;
            Context context = this.f63101t.getContext();
            C52711k.m112236a((Object) context, "parent.context");
            BulletContainerView bulletContainerView = new BulletContainerView(context, null, 0, 6, null);
            bulletContainerView.mo18274a(C24098a.m58973a().getBulletCoreProvider());
            viewGroup.addView(bulletContainerView, -1, -2);
            this.f63100a = true;
        }
        View childAt = this.f63101t.getChildAt(0);
        View childAt2 = this.f63101t.getChildAt(1);
        if (mo49081c()) {
            if (childAt != null) {
                childAt.setVisibility(8);
            }
            if (childAt2 != null) {
                childAt2.setVisibility(0);
            }
            return;
        }
        if (childAt != null) {
            childAt.setVisibility(0);
        }
        if (childAt2 != null) {
            childAt2.setVisibility(8);
        }
    }
}
