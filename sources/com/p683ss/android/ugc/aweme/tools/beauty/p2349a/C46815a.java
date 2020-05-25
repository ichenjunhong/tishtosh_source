package com.p683ss.android.ugc.aweme.tools.beauty.p2349a;

import android.os.Build.VERSION;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.aweme.themechange.base.C46786a;
import com.p683ss.android.ugc.aweme.tools.beauty.C46871e;
import com.p683ss.android.ugc.aweme.tools.beauty.p2351c.C46829a;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.a */
public final class C46815a extends C1322a<C46817b> {

    /* renamed from: a */
    public final ArrayList<ComposerBeauty> f118277a = new ArrayList<>();

    /* renamed from: b */
    public C52682m<? super ComposerBeauty, ? super Integer, C52860x> f118278b;

    /* renamed from: c */
    public int f118279c;

    /* renamed from: d */
    public int f118280d = -1;

    /* renamed from: e */
    private final C52682m<ComposerBeauty, Integer, C52860x> f118281e = new C46816a(this);

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.a.a$a */
    static final class C46816a extends C52712l implements C52682m<ComposerBeauty, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C46815a f118282a;

        C46816a(C46815a aVar) {
            this.f118282a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ComposerBeauty composerBeauty = (ComposerBeauty) obj;
            int intValue = ((Number) obj2).intValue();
            C52711k.m112240b(composerBeauty, "beautyBean");
            this.f118282a.f118279c = intValue;
            C52682m<? super ComposerBeauty, ? super Integer, C52860x> mVar = this.f118282a.f118278b;
            if (mVar != null) {
                mVar.invoke(composerBeauty, Integer.valueOf(intValue));
            }
            this.f118282a.notifyDataSetChanged();
            return C52860x.f131107a;
        }
    }

    public final int getItemCount() {
        return this.f118277a.size();
    }

    /* renamed from: a */
    public final void mo94058a(List<ComposerBeauty> list) {
        C52711k.m112240b(list, "beautyBeans");
        this.f118277a.clear();
        this.f118277a.addAll(list);
        notifyDataSetChanged();
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.g4, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…           parent, false)");
        C46817b bVar = new C46817b(inflate);
        bVar.f118288e = this.f118281e;
        return bVar;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        boolean z2;
        C46817b bVar = (C46817b) vVar;
        C52711k.m112240b(bVar, "viewHodler");
        if (this.f118280d == -1) {
            View view = bVar.itemView;
            C52711k.m112236a((Object) view, "viewHodler.itemView");
            this.f118280d = view.getResources().getColor(R.color.a3_);
        }
        Object obj = this.f118277a.get(i);
        C52711k.m112236a(obj, "data[index]");
        ComposerBeauty composerBeauty = (ComposerBeauty) obj;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f118277a.size() <= 1 || i != this.f118277a.size() - 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i2 = this.f118280d;
        C52711k.m112240b(composerBeauty, "beautyBean");
        UrlModel urlModel = new UrlModel();
        Effect effect = composerBeauty.getEffect();
        if (effect.getIconUrl() != null) {
            com.p683ss.android.ugc.effectmanager.common.model.UrlModel iconUrl = composerBeauty.getEffect().getIconUrl();
            C52711k.m112236a((Object) iconUrl, "beautyBean.effect.iconUrl");
            urlModel.setUri(iconUrl.getUri());
            com.p683ss.android.ugc.effectmanager.common.model.UrlModel iconUrl2 = composerBeauty.getEffect().getIconUrl();
            C52711k.m112236a((Object) iconUrl2, "beautyBean.effect.iconUrl");
            urlModel.setUrlList(iconUrl2.getUrlList());
        }
        if (composerBeauty.getSelected()) {
            bVar.f118285b.mo93970a(true);
        } else {
            bVar.f118285b.mo93970a(false);
        }
        bVar.f118285b.mo93975d(composerBeauty.getShowDot());
        bVar.f118285b.setEnableUI(composerBeauty.getEnable());
        bVar.f118285b.setClickStatusColor(i2);
        bVar.f118285b.mo93968a(urlModel);
        bVar.f118285b.setText(effect.getName());
        AVDmtImageTextView aVDmtImageTextView = bVar.f118285b;
        C46819b bVar2 = new C46819b(bVar, urlModel, composerBeauty, i2, z, z2);
        aVDmtImageTextView.setOnClickListener(bVar2);
        int c = C46829a.f118310b.mo94076c(composerBeauty);
        bVar.f118287d = c;
        if (!C46871e.m101791b(composerBeauty)) {
            switch (c) {
                case -1:
                case 0:
                case 4:
                    bVar.mo94060b();
                    ImageView imageView = bVar.f118286c;
                    C52711k.m112236a((Object) imageView, "ivDownload");
                    imageView.setVisibility(0);
                    break;
                case 1:
                case 3:
                    bVar.mo94060b();
                    ImageView imageView2 = bVar.f118286c;
                    C52711k.m112236a((Object) imageView2, "ivDownload");
                    imageView2.setVisibility(8);
                    break;
                case 2:
                    ImageView imageView3 = bVar.f118286c;
                    C52711k.m112236a((Object) imageView3, "ivDownload");
                    imageView3.setVisibility(0);
                    bVar.f118286c.setImageResource(R.drawable.ed);
                    if (!bVar.mo94059a().isRunning()) {
                        bVar.mo94059a().start();
                    }
                    ImageView imageView4 = bVar.f118286c;
                    C52711k.m112236a((Object) imageView4, "ivDownload");
                    imageView4.setVisibility(0);
                    break;
                default:
                    bVar.mo94060b();
                    ImageView imageView5 = bVar.f118286c;
                    C52711k.m112236a((Object) imageView5, "ivDownload");
                    imageView5.setVisibility(0);
                    break;
            }
        } else {
            ImageView imageView6 = bVar.f118286c;
            C52711k.m112236a((Object) imageView6, "ivDownload");
            imageView6.setVisibility(8);
        }
        View view2 = bVar.itemView;
        C52711k.m112236a((Object) view2, "itemView");
        LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = (int) C46786a.m101622a();
            if (z) {
                marginLayoutParams.leftMargin = (int) C46786a.m101624b();
            } else {
                marginLayoutParams.leftMargin = 0;
            }
            if (VERSION.SDK_INT >= 17) {
                marginLayoutParams.setMarginEnd((int) C46786a.m101622a());
                if (z) {
                    marginLayoutParams.setMarginStart((int) C46786a.m101624b());
                } else {
                    marginLayoutParams.setMarginStart(0);
                }
            }
            if (z2) {
                marginLayoutParams.rightMargin = (int) C46786a.m101624b();
                if (VERSION.SDK_INT >= 17) {
                    marginLayoutParams.setMarginEnd((int) C46786a.m101624b());
                }
            }
            View view3 = bVar.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            view3.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
