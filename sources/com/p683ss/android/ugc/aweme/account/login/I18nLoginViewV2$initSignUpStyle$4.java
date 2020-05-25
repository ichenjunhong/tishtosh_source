package com.p683ss.android.ugc.aweme.account.login;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.base.utils.C23727n;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.I18nLoginViewV2$initSignUpStyle$4 */
public final class I18nLoginViewV2$initSignUpStyle$4 extends LinearLayoutManager {

    /* renamed from: a */
    public boolean f57171a;

    /* renamed from: b */
    final /* synthetic */ C21357j f57172b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nLoginViewV2$initSignUpStyle$4$a */
    static final class C21027a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ I18nLoginViewV2$initSignUpStyle$4 f57173a;

        C21027a(I18nLoginViewV2$initSignUpStyle$4 i18nLoginViewV2$initSignUpStyle$4) {
            this.f57173a = i18nLoginViewV2$initSignUpStyle$4;
        }

        public final void run() {
            RecyclerView a = this.f57173a.f57172b.mo45501a();
            C52711k.m112236a((Object) a, "channle_list");
            C1322a adapter = a.getAdapter();
            if (adapter == null) {
                C52711k.m112234a();
            }
            adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo4677a(C1349s sVar) {
        super.mo4677a(sVar);
        View b = this.f57172b.mo45502b();
        C52711k.m112236a((Object) b, "more");
        if (b.getVisibility() != 8 && !this.f57171a) {
            View childAt = this.f57172b.mo45501a().getChildAt(mo4751l());
            if (childAt != null) {
                RecyclerView a = this.f57172b.mo45501a();
                C52711k.m112236a((Object) a, "channle_list");
                if (((float) (a.getHeight() - childAt.getBottom())) < this.f57172b.f58006i) {
                    View b2 = this.f57172b.mo45502b();
                    C52711k.m112236a((Object) b2, "more");
                    b2.setVisibility(8);
                    RecyclerView a2 = this.f57172b.mo45501a();
                    C52711k.m112236a((Object) a2, "channle_list");
                    C1322a adapter = a2.getAdapter();
                    if (adapter != null) {
                        ((C21398r) adapter).f58056a = true;
                        C23727n.m58240b(new C21027a(this));
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.LoginChannleAdapter");
                    }
                } else {
                    View b3 = this.f57172b.mo45502b();
                    C52711k.m112236a((Object) b3, "more");
                    LayoutParams layoutParams = b3.getLayoutParams();
                    if (layoutParams != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        layoutParams2.setMargins(0, childAt.getBottom(), 0, 0);
                        View b4 = this.f57172b.mo45502b();
                        C52711k.m112236a((Object) b4, "more");
                        b4.setLayoutParams(layoutParams2);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                }
            }
            this.f57171a = true;
        }
    }

    I18nLoginViewV2$initSignUpStyle$4(C21357j jVar, Context context) {
        this.f57172b = jVar;
        super(context);
    }
}
