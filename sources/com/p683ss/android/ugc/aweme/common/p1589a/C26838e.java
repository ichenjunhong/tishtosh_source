package com.p683ss.android.ugc.aweme.common.p1589a;

import android.graphics.drawable.Animatable;
import android.os.Build.VERSION;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.p945f.p946a.C13856a;
import com.p683ss.android.ugc.aweme.base.p1417h.C23536a;
import com.p683ss.android.ugc.aweme.framework.p1782c.C32462a;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;

/* renamed from: com.ss.android.ugc.aweme.common.a.e */
public abstract class C26838e<T> extends C1352v implements C26843i {

    /* renamed from: k */
    public T f70665k;

    /* renamed from: l */
    public SmartImageView f70666l;

    /* renamed from: m */
    protected boolean f70667m;

    /* renamed from: n */
    boolean f70668n = true;

    /* renamed from: f */
    public final boolean mo54780f() {
        return this.f70667m;
    }

    public final void aQ_() {
        this.f70666l.mo23137b();
    }

    public final void aR_() {
        this.f70666l.mo23138c();
    }

    /* renamed from: a */
    private static boolean mo50301a() {
        boolean z;
        if (VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        return C23536a.m57711a("aweme_app", "use_dynamic_cover", z);
    }

    /* renamed from: g */
    public final boolean mo54781g() {
        if (C23337c.m57398a()) {
            return false;
        }
        if ((!C26839f.m64886a(this.itemView.getContext()) || C32462a.m75159a(this.itemView.getContext())) && mo50301a()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo54782j() throws Exception {
        if (this.f70666l != null && this.f70666l.getController() != null && this.f70666l.getController().mo25749i() != null) {
            Animatable i = this.f70666l.getController().mo25749i();
            if (i instanceof C13856a) {
                ((C13856a) i).mo25995a();
            }
        }
    }

    /* renamed from: c */
    public final void mo54779c(boolean z) {
        this.f70668n = z;
    }

    public C26838e(View view) {
        super(view);
    }

    /* renamed from: b */
    public final void mo54778b(boolean z) {
        this.f70666l.setUserVisibleHint(z);
    }

    /* renamed from: a */
    public final void mo54775a(boolean z) {
        this.f70666l.setAttached(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo54774a(T t, int i) {
        this.f70666l.setUserVisibleHint(false);
    }
}
