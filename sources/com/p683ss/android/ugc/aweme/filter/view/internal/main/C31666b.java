package com.p683ss.android.ugc.aweme.filter.view.internal.main;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31619a;
import com.p683ss.android.ugc.aweme.filter.view.p1750a.C31614i;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.p683ss.android.ugc.tools.utils.C50204h;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1723a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.b */
public class C31666b implements C31619a {

    /* renamed from: a */
    public OnClickListener f82711a;

    /* renamed from: b */
    public View f82712b;

    /* renamed from: c */
    public final Object f82713c = new Object();

    /* renamed from: d */
    private final C1689b f82714d = new C1689b();

    /* renamed from: e */
    private final Context f82715e;

    /* renamed from: f */
    private final C31614i f82716f;

    /* renamed from: com.ss.android.ugc.aweme.filter.view.internal.main.b$a */
    static final class C31667a<T> implements C1710e<Object> {

        /* renamed from: a */
        final /* synthetic */ C31666b f82717a;

        C31667a(C31666b bVar) {
            this.f82717a = bVar;
        }

        public final void accept(Object obj) {
            if (obj == this.f82717a.f82713c) {
                OnClickListener onClickListener = this.f82717a.f82711a;
                if (onClickListener != null) {
                    View view = this.f82717a.f82712b;
                    if (view == null) {
                        C52711k.m112237a("entranceView");
                    }
                    onClickListener.onClick(view);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo64518a() {
        FrameLayout frameLayout = new FrameLayout(this.f82715e);
        frameLayout.addView(mo64577b(), new LayoutParams(-2, -2, 17));
        this.f82712b = frameLayout;
        C31614i iVar = this.f82716f;
        View view = this.f82712b;
        if (view == null) {
            C52711k.m112237a("entranceView");
        }
        iVar.mo64499a(view, this.f82713c);
        this.f82714d.mo6181a(this.f82716f.mo64503f().mo6505a((C1710e<? super T>) new C31667a<Object>(this), C1723a.f5846e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AVDmtHorizontalImageTextLayout mo64577b() {
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = new AVDmtHorizontalImageTextLayout(this.f82715e, null, 0, 6, null);
        Context context = aVDmtHorizontalImageTextLayout.getContext();
        C52711k.m112236a((Object) context, "context");
        aVDmtHorizontalImageTextLayout.setText(context.getResources().getString(R.string.nv));
        aVDmtHorizontalImageTextLayout.setTextSize(15);
        aVDmtHorizontalImageTextLayout.setGravity(17);
        aVDmtHorizontalImageTextLayout.setChangeColor(false);
        aVDmtHorizontalImageTextLayout.setImageRes(R.drawable.am8);
        Context context2 = aVDmtHorizontalImageTextLayout.getContext();
        C52711k.m112236a((Object) context2, "context");
        aVDmtHorizontalImageTextLayout.setPadding(0, 0, (int) C50204h.m108364a(context2, 12.0f), 0);
        return aVDmtHorizontalImageTextLayout;
    }

    /* renamed from: a */
    public final void mo64519a(OnClickListener onClickListener) {
        C52711k.m112240b(onClickListener, "clickListener");
        this.f82711a = onClickListener;
    }

    public C31666b(Context context, C31614i iVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(iVar, "tabListView");
        this.f82715e = context;
        this.f82716f = iVar;
    }
}
