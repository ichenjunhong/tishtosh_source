package com.bytedance.android.live.wallet.p258a;

import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.wallet.C4311b;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.C4467f;
import com.bytedance.android.livesdk.p279af.C4569ai;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal.CurrencyPrice;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal.HsSkuDetail;
import com.bytedance.android.livesdkapi.host.C8807k;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.wallet.a.a */
public final class C4287a extends C1322a<C1352v> {

    /* renamed from: f */
    public static final C4288a f11776f = new C4288a(null);

    /* renamed from: h */
    private static final double f11777h = f11777h;

    /* renamed from: a */
    public final boolean f11778a = C52711k.m112239a((Object) this.f11780c.f12197a, (Object) "Huoli");

    /* renamed from: b */
    public final List<ChargeDeal> f11779b;

    /* renamed from: c */
    public final C4467f f11780c;

    /* renamed from: d */
    public final String f11781d;

    /* renamed from: e */
    public final C4289b f11782e;

    /* renamed from: g */
    private final Drawable f11783g;

    /* renamed from: com.bytedance.android.live.wallet.a.a$a */
    public static final class C4288a {
        private C4288a() {
        }

        public /* synthetic */ C4288a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.a$b */
    public interface C4289b {
        /* renamed from: a */
        void mo10042a(C8807k kVar, ChargeDeal chargeDeal, int i);
    }

    /* renamed from: com.bytedance.android.live.wallet.a.a$c */
    public static final class C4290c extends C1352v {
        public C4290c(View view) {
            C52711k.m112240b(view, "rootView");
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.a$d */
    public static final class C4291d extends C1352v {

        /* renamed from: a */
        public final TextView f11784a;

        /* renamed from: b */
        public final TextView f11785b;

        /* renamed from: c */
        public final TextView f11786c;

        public C4291d(View view) {
            C52711k.m112240b(view, "rootView");
            super(view);
            this.f11784a = (TextView) view.findViewById(R.id.a5f);
            this.f11785b = (TextView) view.findViewById(R.id.c4g);
            this.f11786c = (TextView) view.findViewById(R.id.a4e);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.a.a$e */
    static final class C4292e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4287a f11787a;

        /* renamed from: b */
        final /* synthetic */ ChargeDeal f11788b;

        C4292e(C4287a aVar, ChargeDeal chargeDeal) {
            this.f11787a = aVar;
            this.f11788b = chargeDeal;
        }

        public final void onClick(View view) {
            C8807k kVar;
            this.f11787a.notifyDataSetChanged();
            String str = this.f11787a.f11780c.f12197a;
            if (C52711k.m112239a((Object) str, (Object) C8807k.GOOGLE.getValue())) {
                kVar = C8807k.GOOGLE;
            } else if (C52711k.m112239a((Object) str, (Object) C8807k.ONECARD.getValue())) {
                kVar = C8807k.ONECARD;
            } else if (C52711k.m112239a((Object) str, (Object) C8807k.MASTERCARD.getValue())) {
                kVar = C8807k.MASTERCARD;
            } else if (C52711k.m112239a((Object) str, (Object) C8807k.VISA.getValue())) {
                kVar = C8807k.VISA;
            } else if (C52711k.m112239a((Object) str, (Object) C8807k.BOKU.getValue())) {
                kVar = C8807k.BOKU;
            } else if (C52711k.m112239a((Object) str, (Object) C8807k.HUOLI.getValue())) {
                kVar = C8807k.HUOLI;
            } else {
                kVar = C8807k.UNKNOWN;
            }
            this.f11787a.f11782e.mo10042a(kVar, this.f11788b, this.f11787a.f11780c.f12204h);
        }
    }

    public final int getItemCount() {
        return this.f11779b.size() + (this.f11778a ? 1 : 0);
    }

    public final int getItemViewType(int i) {
        if (!this.f11778a || i != 0) {
            return 0;
        }
        return 1;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.amu, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…ance_vigo, parent, false)");
            return new C4290c(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ale, viewGroup, false);
        C52711k.m112236a((Object) inflate2, "LayoutInflater.from(pare…e_diamond, parent, false)");
        return new C4291d(inflate2);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        String str;
        CharSequence charSequence;
        Object obj;
        String str2;
        C52711k.m112240b(vVar, "holder");
        int i2 = 0;
        if (getItemViewType(i) == 1) {
            C4311b walletCenter = ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter();
            C52711k.m112236a((Object) walletCenter, "ServiceManager.getServic…lass.java).walletCenter()");
            double c = (double) walletCenter.mo10094c();
            double d = f11777h;
            Double.isNaN(c);
            String a = C2240a.m6772a("%s：%s%s", Arrays.copyOf(new Object[]{C3922z.m9903a((int) R.string.e3d), C3922z.m9903a((int) R.string.e9v), C4604n.m11050a("%.2f", Double.valueOf(c / d))}, 3));
            C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
            View view = vVar.itemView;
            if (view != null) {
                ((TextView) view).setText(a);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
        }
        if (this.f11778a) {
            i--;
        }
        ChargeDeal chargeDeal = (ChargeDeal) this.f11779b.get(i);
        if (chargeDeal == null) {
            chargeDeal = new ChargeDeal();
        }
        if (vVar instanceof C4291d) {
            if (chargeDeal.f23697k == null) {
                List<CurrencyPrice> list = chargeDeal.f23694h;
                C52711k.m112236a((Object) list, "dealItem.currencyPrice");
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    CurrencyPrice currencyPrice = (CurrencyPrice) obj;
                    C52711k.m112236a((Object) currencyPrice, "it");
                    String str3 = currencyPrice.f23698a;
                    if (this.f11778a) {
                        str2 = "USD";
                    } else {
                        str2 = this.f11781d;
                    }
                    if (C52711k.m112239a((Object) str3, (Object) str2)) {
                        break;
                    }
                }
                CurrencyPrice currencyPrice2 = (CurrencyPrice) obj;
                if (currencyPrice2 != null) {
                    TextView textView = ((C4291d) vVar).f11785b;
                    C52711k.m112236a((Object) textView, "holder.tvPrice");
                    textView.setText(currencyPrice2.f23700c);
                }
            } else {
                TextView textView2 = ((C4291d) vVar).f11785b;
                C52711k.m112236a((Object) textView2, "holder.tvPrice");
                HsSkuDetail hsSkuDetail = chargeDeal.f23697k;
                if (hsSkuDetail != null) {
                    charSequence = hsSkuDetail.f23703c;
                } else {
                    charSequence = null;
                }
                textView2.setText(charSequence);
            }
            C4291d dVar = (C4291d) vVar;
            TextView textView3 = dVar.f11784a;
            C52711k.m112236a((Object) textView3, "holder.tvDiamond");
            textView3.setText(String.valueOf(chargeDeal.f23691e));
            dVar.f11784a.setCompoundDrawables(this.f11783g, null, null, null);
            TextView textView4 = dVar.f11786c;
            C52711k.m112236a((Object) textView4, "holder.tvGivingCount");
            if (TextUtils.isEmpty(chargeDeal.f23690d)) {
                i2 = 4;
            }
            textView4.setVisibility(i2);
            TextView textView5 = dVar.f11786c;
            C52711k.m112236a((Object) textView5, "holder.tvGivingCount");
            if (TextUtils.isEmpty(chargeDeal.f23690d)) {
                str = "";
            } else {
                str = chargeDeal.f23690d;
            }
            textView5.setText(str);
            vVar.itemView.setOnTouchListener(new C4569ai());
            vVar.itemView.setOnClickListener(new C4292e(this, chargeDeal));
        }
    }

    public C4287a(C4467f fVar, String str, C4289b bVar) {
        Object obj;
        C52711k.m112240b(fVar, "chargeItem");
        C52711k.m112240b(str, "currencyCode");
        C52711k.m112240b(bVar, "mOnClickDeal");
        this.f11780c = fVar;
        this.f11781d = str;
        this.f11782e = bVar;
        List<ChargeDeal> list = null;
        if (!C52711k.m112239a((Object) this.f11780c.f12197a, (Object) "Pay by mobile")) {
            list = this.f11780c.f12206j;
        } else {
            List<ChargeDeal> list2 = this.f11780c.f12206j;
            if (list2 != null) {
                Iterable iterable = list2;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    ChargeDeal chargeDeal = (ChargeDeal) next;
                    if (chargeDeal != null) {
                        obj = chargeDeal.f23693g;
                    } else {
                        obj = null;
                    }
                    if (C52711k.m112239a(obj, (Object) this.f11781d)) {
                        arrayList.add(next);
                    }
                }
                list = (List) arrayList;
            }
        }
        if (list == null) {
            list = C52575l.m112097a();
        }
        this.f11779b = list;
        Drawable c = C3922z.m9911c(R.drawable.bsx);
        C52711k.m112236a((Object) c, "ResUtil.getDrawable(R.drawable.ttlive_ic_coin)");
        this.f11783g = c;
        int a = C3922z.m9899a(16.0f);
        this.f11783g.setBounds(0, 0, a, a);
    }
}
