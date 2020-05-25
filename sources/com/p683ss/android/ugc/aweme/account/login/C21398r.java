package com.p683ss.android.ugc.aweme.account.login;

import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.account.login.viewmodel.C22029a;
import com.p683ss.android.ugc.aweme.p2396w.C48221a;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.r */
public final class C21398r extends C1322a<C1352v> {

    /* renamed from: a */
    public boolean f58056a = (!this.f58059d);

    /* renamed from: b */
    public boolean f58057b;

    /* renamed from: c */
    public List<? extends C22029a> f58058c;

    /* renamed from: d */
    public final boolean f58059d;

    /* renamed from: e */
    public final int f58060e;

    /* renamed from: com.ss.android.ugc.aweme.account.login.r$a */
    public final class C21399a extends C1352v {

        /* renamed from: a */
        public final ImageView f58061a = ((ImageView) this.f58064d.findViewById(R.id.aqa));

        /* renamed from: b */
        public final TextView f58062b = ((TextView) this.f58064d.findViewById(R.id.sk));

        /* renamed from: c */
        public final float f58063c = (((float) C9432q.m18670a(this.f58064d.getContext())) - C9432q.m18687b(this.f58064d.getContext(), 60.0f));

        /* renamed from: d */
        public final View f58064d;

        /* renamed from: e */
        final /* synthetic */ C21398r f58065e;

        public C21399a(C21398r rVar, View view) {
            C52711k.m112240b(view, "item");
            this.f58065e = rVar;
            super(view);
            this.f58064d = view;
            this.f58064d.setOnTouchListener(new C48221a(0.5f, 150, null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.r$b */
    public final class C21400b extends C1352v {

        /* renamed from: a */
        public final TextView f58066a = ((TextView) this.f58068c.findViewById(R.id.title));

        /* renamed from: b */
        public final TextView f58067b = ((TextView) this.f58068c.findViewById(R.id.ck1));

        /* renamed from: c */
        public final View f58068c;

        /* renamed from: d */
        final /* synthetic */ C21398r f58069d;

        public C21400b(C21398r rVar, View view) {
            C52711k.m112240b(view, "item");
            this.f58069d = rVar;
            super(view);
            this.f58068c = view;
            if (!rVar.f58059d) {
                TextView textView = this.f58066a;
                C52711k.m112236a((Object) textView, "title");
                textView.setText(this.f58068c.getContext().getText(R.string.adx));
                TextView textView2 = this.f58067b;
                C52711k.m112236a((Object) textView2, "secondTitle");
                textView2.setText(this.f58068c.getContext().getText(R.string.adu));
            }
        }
    }

    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public final int getItemCount() {
        int i;
        if (this.f58056a) {
            i = this.f58058c.size();
        } else {
            i = this.f58060e;
        }
        return i + 1;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "p0");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.azg, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(p0.c…dialog_header, p0, false)");
            return new C21400b(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.azc, viewGroup, false);
        C52711k.m112236a((Object) inflate2, "LayoutInflater.from(p0.c…login_channle, p0, false)");
        return new C21399a(this, inflate2);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "p0");
        if (vVar instanceof C21399a) {
            C21399a aVar = (C21399a) vVar;
            C22029a aVar2 = (C22029a) this.f58058c.get(i - 1);
            C52711k.m112240b(aVar2, "loginItemViewModel");
            aVar.f58061a.setImageResource(aVar2.f59521a);
            aVar.f58064d.setOnClickListener(aVar2.f59522b);
            if (!aVar.f58065e.f58056a || !aVar.f58065e.f58057b || aVar.getAdapterPosition() - 1 < aVar.f58065e.f58060e) {
                aVar.f58064d.setAlpha(1.0f);
            } else {
                aVar.f58064d.setAlpha(0.0f);
            }
            String string = aVar.f58064d.getContext().getString(aVar2.f59523c);
            TextView textView = aVar.f58062b;
            C52711k.m112236a((Object) textView, "channelName");
            textView.setText(string);
            TextView textView2 = aVar.f58062b;
            C52711k.m112236a((Object) textView2, "channelName");
            float measureText = textView2.getPaint().measureText(string);
            if (C9432q.m18687b(aVar.f58064d.getContext(), 96.0f) + measureText > aVar.f58063c) {
                TextView textView3 = aVar.f58062b;
                C52711k.m112236a((Object) textView3, "channelName");
                LayoutParams layoutParams = textView3.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.f827J = 0;
                    layoutParams2.f872p = R.id.aqa;
                    layoutParams2.f861e = R.id.aqa;
                    layoutParams2.f873q = -1;
                    layoutParams2.f860d = -1;
                    if (measureText + C9432q.m18687b(aVar.f58064d.getContext(), 58.0f) > aVar.f58063c) {
                        aVar.f58064d.setPadding(aVar.f58064d.getPaddingLeft(), (int) C9432q.m18687b(aVar.f58064d.getContext(), 8.0f), aVar.f58064d.getPaddingRight(), (int) C9432q.m18687b(aVar.f58064d.getContext(), 8.0f));
                    }
                    layoutParams2.leftMargin = (int) C9432q.m18687b(aVar.f58064d.getContext(), 12.0f);
                    if (VERSION.SDK_INT >= 17) {
                        layoutParams2.setMarginStart(layoutParams2.leftMargin);
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                }
            } else {
                TextView textView4 = aVar.f58062b;
                C52711k.m112236a((Object) textView4, "channelName");
                LayoutParams layoutParams3 = textView4.getLayoutParams();
                if (layoutParams3 != null) {
                    ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                    layoutParams4.f827J = 1;
                    layoutParams4.f872p = -1;
                    layoutParams4.f861e = -1;
                    layoutParams4.f873q = 0;
                    layoutParams4.f860d = 0;
                    aVar.f58064d.setPadding(aVar.f58064d.getPaddingLeft(), (int) C9432q.m18687b(aVar.f58064d.getContext(), 13.0f), aVar.f58064d.getPaddingRight(), (int) C9432q.m18687b(aVar.f58064d.getContext(), 13.0f));
                    layoutParams4.leftMargin = 0;
                    if (VERSION.SDK_INT >= 17) {
                        layoutParams4.setMarginStart(0);
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
                }
            }
            TextView textView5 = aVar.f58062b;
            C52711k.m112236a((Object) textView5, "channelName");
            TextView textView6 = aVar.f58062b;
            C52711k.m112236a((Object) textView6, "channelName");
            textView5.setLayoutParams(textView6.getLayoutParams());
        }
    }

    public C21398r(List<? extends C22029a> list, boolean z, int i) {
        C52711k.m112240b(list, "channelList");
        this.f58058c = list;
        this.f58059d = z;
        this.f58060e = i;
    }
}
