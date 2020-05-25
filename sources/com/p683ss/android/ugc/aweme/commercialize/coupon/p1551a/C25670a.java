package com.p683ss.android.ugc.aweme.commercialize.coupon.p1551a;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.coupon.C25668a;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25686a;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.a.a */
public final class C25670a extends C1322a<C1352v> {

    /* renamed from: b */
    public static int f67889b;

    /* renamed from: a */
    public List<C25687b> f67890a = new ArrayList();

    /* renamed from: c */
    public boolean f67891c;

    /* renamed from: d */
    public boolean f67892d;

    /* renamed from: e */
    private List<String> f67893e = new ArrayList();

    /* renamed from: f */
    private WeakReference<Activity> f67894f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.a.a$a */
    static class C25671a extends C1352v {

        /* renamed from: a */
        TextView f67895a;

        /* renamed from: b */
        Context f67896b;

        /* renamed from: c */
        TextView f67897c;

        /* renamed from: d */
        TextView f67898d;

        /* renamed from: e */
        AvatarImageView f67899e;

        /* renamed from: f */
        RemoteImageView f67900f;

        /* renamed from: g */
        WeakReference<Activity> f67901g;

        /* renamed from: h */
        ImageView f67902h;

        C25671a(View view, WeakReference<Activity> weakReference) {
            super(view);
            this.f67896b = view.getContext();
            this.f67901g = weakReference;
            this.f67895a = (TextView) view.findViewById(R.id.d1l);
            this.f67897c = (TextView) view.findViewById(R.id.blb);
            this.f67898d = (TextView) view.findViewById(R.id.cst);
            this.f67899e = (AvatarImageView) view.findViewById(R.id.i0);
            this.f67900f = (RemoteImageView) view.findViewById(R.id.anp);
            this.f67902h = (ImageView) view.findViewById(R.id.asa);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.a.a$b */
    static class C25672b extends C1352v {

        /* renamed from: a */
        View f67903a;

        /* renamed from: b */
        WeakReference<Activity> f67904b;

        C25672b(View view, WeakReference<Activity> weakReference) {
            super(view);
            this.f67903a = view;
            this.f67904b = weakReference;
        }
    }

    public final int getItemCount() {
        if (!this.f67892d || this.f67891c) {
            return this.f67890a.size();
        }
        return this.f67890a.size() + 1;
    }

    /* renamed from: a */
    public final void mo52819a(List<C25687b> list) {
        this.f67890a = list;
        notifyDataSetChanged();
    }

    public C25670a(Activity activity) {
        this.f67894f = new WeakReference<>(activity);
    }

    public final int getItemViewType(int i) {
        if (!this.f67892d || this.f67891c || i != getItemCount() - 1) {
            return 0;
        }
        return 1;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C25672b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.in, viewGroup, false), this.f67894f);
        }
        return new C25671a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sw, viewGroup, false), this.f67894f);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        String str;
        String str2;
        String str3;
        if (i < getItemCount()) {
            if (!this.f67892d || this.f67891c || i != getItemCount() - 1) {
                C25687b bVar = (C25687b) this.f67890a.get(i);
                if (vVar instanceof C25671a) {
                    C25671a aVar = (C25671a) vVar;
                    boolean z = this.f67892d;
                    if (bVar != null) {
                        aVar.f67897c.setText(bVar.getMerchantName());
                        aVar.f67895a.setText(bVar.getTitle());
                        if (bVar.getStatus() != C25686a.StatusValid.value) {
                            aVar.f67898d.setVisibility(0);
                            aVar.f67898d.setBackground(aVar.f67896b.getResources().getDrawable(R.drawable.j0));
                            aVar.f67898d.setText(C25668a.m62225a(aVar.f67898d.getContext(), bVar.getStatus(), false));
                        } else if (TextUtils.isEmpty(bVar.hintText)) {
                            aVar.f67898d.setVisibility(8);
                        } else {
                            aVar.f67898d.setVisibility(0);
                            aVar.f67898d.setBackground(aVar.f67896b.getResources().getDrawable(R.drawable.f133592com));
                            aVar.f67898d.setText(bVar.hintText);
                        }
                        C23515d.m57669a((RemoteImageView) aVar.f67899e, bVar.getLogoImageUrl());
                        C23515d.m57669a(aVar.f67900f, bVar.getHeadImageUrl());
                        if (bVar.isDefaultHeadImage()) {
                            aVar.f67902h.setVisibility(8);
                            aVar.f67897c.setShadowLayer(C9432q.m18687b(aVar.f67896b, 1.5f), 0.0f, C9432q.m18687b(aVar.f67896b, 0.5f), aVar.f67896b.getResources().getColor(R.color.y_));
                            aVar.f67895a.setShadowLayer(C9432q.m18687b(aVar.f67896b, 1.5f), 0.0f, C9432q.m18687b(aVar.f67896b, 0.5f), aVar.f67896b.getResources().getColor(R.color.y_));
                        } else {
                            aVar.f67902h.setVisibility(0);
                            aVar.f67902h.setImageResource(R.drawable.iw);
                            aVar.f67902h.setAlpha(1.0f);
                            aVar.f67897c.setShadowLayer(0.0f, 0.0f, 0.0f, aVar.f67896b.getResources().getColor(R.color.y_));
                            aVar.f67895a.setShadowLayer(0.0f, 0.0f, 0.0f, aVar.f67896b.getResources().getColor(R.color.y_));
                        }
                        aVar.itemView.setOnClickListener(new C25673b(aVar, bVar, i, z));
                    }
                }
                Context context = vVar.itemView.getContext();
                if (!(context == null || bVar == null)) {
                    String codeId = bVar.getCodeId();
                    if (!this.f67893e.contains(codeId)) {
                        this.f67893e.add(codeId);
                        String str4 = "show_coupon";
                        C23089d a = C23089d.m56640a();
                        String str5 = "enter_from";
                        if (this.f67892d) {
                            str = "card_bag";
                        } else {
                            str = "invalid_card_bag";
                        }
                        C23089d a2 = a.mo47829a(str5, str);
                        String str6 = "previous_page";
                        if (this.f67892d) {
                            str2 = "card_bag";
                        } else {
                            str2 = "invalid_card_bag";
                        }
                        C23089d a3 = a2.mo47829a(str6, str2).mo47826a("coupon_id", bVar.getCouponId());
                        String str7 = "enter_method";
                        if (this.f67892d) {
                            str3 = "click_card_bag";
                        } else {
                            str3 = "click_invalid_card_bag";
                        }
                        C26890h.m65011a(str4, a3.mo47829a(str7, str3).mo47829a("coupon_type", C25668a.m62225a(context, bVar.getStatus(), true)).mo47829a("source_type", C25668a.m62226a(bVar)).f61491a);
                    }
                }
            } else if (vVar instanceof C25672b) {
                C25672b bVar2 = (C25672b) vVar;
                bVar2.f67903a.setOnClickListener(new C25674c(bVar2));
            }
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i, List list) {
        if (list.isEmpty()) {
            onBindViewHolder(vVar, i);
            return;
        }
        onBindViewHolder(vVar, i);
        if (vVar instanceof C25671a) {
            View view = ((C25671a) vVar).itemView;
            view.postDelayed(new Runnable(view) {

                /* renamed from: a */
                final /* synthetic */ View f68013a;

                public final void run() {
                    ObjectAnimator.ofFloat(this.f68013a, "alpha", new float[]{1.0f, 0.5f, 1.0f}).setDuration(600).start();
                }

                {
                    this.f68013a = r1;
                }
            }, (long) view.getContext().getResources().getInteger(R.integer.j));
        }
    }
}
