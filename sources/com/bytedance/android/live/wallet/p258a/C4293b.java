package com.bytedance.android.live.wallet.p258a;

import android.content.Context;
import android.support.p030v4.view.PagerAdapter;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.GridLayoutManager.C1302b;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.core.p230g.C3909r;
import com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip.C4379a;
import com.bytedance.android.live.wallet.model.C4467f;
import com.bytedance.android.live.wallet.p258a.C4287a.C4289b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.wallet.a.b */
public final class C4293b extends PagerAdapter implements C4379a {

    /* renamed from: a */
    public String f11789a = "";

    /* renamed from: b */
    public List<? extends C4467f> f11790b;

    /* renamed from: c */
    public final C4289b f11791c;

    /* renamed from: com.bytedance.android.live.wallet.a.b$a */
    public static final class C4294a extends C1302b {

        /* renamed from: c */
        final /* synthetic */ C4287a f11792c;

        C4294a(C4287a aVar) {
            this.f11792c = aVar;
        }

        /* renamed from: a */
        public final int mo4690a(int i) {
            if (this.f11792c.getItemViewType(i) == 1) {
                return 3;
            }
            return 1;
        }
    }

    public final int getItemPosition(Object obj) {
        C52711k.m112240b(obj, "object");
        return -2;
    }

    public final int getCount() {
        return this.f11790b.size();
    }

    /* renamed from: a */
    public final void mo10045a(List<? extends C4467f> list) {
        C52711k.m112240b(list, "<set-?>");
        this.f11790b = list;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(obj, "object");
        return C52711k.m112239a((Object) view, obj);
    }

    public C4293b(List<? extends C4467f> list, C4289b bVar) {
        C52711k.m112240b(list, "vigoRechargeList");
        C52711k.m112240b(bVar, "mOnClickDeal");
        this.f11790b = list;
        this.f11791c = bVar;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "container");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aok, viewGroup, false);
        if (inflate != null) {
            RecyclerView recyclerView = (RecyclerView) inflate;
            recyclerView.setOverScrollMode(2);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(viewGroup.getContext(), 3);
            recyclerView.setLayoutManager(gridLayoutManager);
            C4287a aVar = new C4287a((C4467f) this.f11790b.get(i), this.f11789a, this.f11791c);
            recyclerView.setAdapter(aVar);
            gridLayoutManager.f4526g = new C4294a(aVar);
            viewGroup.addView(inflate);
            return inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
    }

    /* renamed from: a */
    public final View mo10044a(Context context, int i) {
        View view;
        int i2;
        C52711k.m112240b(context, "context");
        C4467f fVar = (C4467f) this.f11790b.get(i);
        Integer num = null;
        if (C52711k.m112239a((Object) fVar.f12197a, (Object) "Huoli")) {
            view = LayoutInflater.from(context).inflate(R.layout.amx, null);
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.amw, null);
        }
        String str = ((C4467f) this.f11790b.get(i)).f12197a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1791295757:
                    if (str.equals("Pay by mobile")) {
                        num = Integer.valueOf(R.drawable.c0h);
                        break;
                    }
                    break;
                case -816503921:
                    if (str.equals("GooglePay")) {
                        num = Integer.valueOf(R.drawable.c0i);
                        break;
                    }
                    break;
                case -46205774:
                    if (str.equals("MasterCard")) {
                        num = Integer.valueOf(R.drawable.c0j);
                        break;
                    }
                    break;
                case 2666593:
                    if (str.equals("Visa")) {
                        num = Integer.valueOf(R.drawable.c0l);
                        break;
                    }
                    break;
                case 342921846:
                    if (str.equals("OneCard")) {
                        num = Integer.valueOf(R.drawable.c0k);
                        break;
                    }
                    break;
            }
        }
        if (num != null) {
            ((ImageView) view.findViewById(R.id.az0)).setImageResource(num.intValue());
        }
        View findViewById = view.findViewById(R.id.ayz);
        if (findViewById != null) {
            if (fVar.f12199c == 1) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            findViewById.setVisibility(i2);
        }
        C3909r.m9883b((ImageView) view.findViewById(R.id.ayz), fVar.f12201e);
        C52711k.m112236a((Object) view, "tabView");
        return view;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C52711k.m112240b(viewGroup, "container");
        C52711k.m112240b(obj, "object");
        viewGroup.removeView((View) obj);
    }
}
