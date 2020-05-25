package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.adapter.C38977h;
import com.p683ss.android.ugc.aweme.poi.model.C39102ah;
import com.p683ss.android.ugc.aweme.poi.model.C39103ai;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38960e;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductInfoViewHolder */
public class PoiDcdProductInfoViewHolder extends C39010a<C39102ah> {

    /* renamed from: g */
    public int f99352g;

    /* renamed from: h */
    public C38960e f99353h;

    /* renamed from: i */
    private C39067g f99354i;
    TextView mAllProduct;
    View mAllProductContainer;
    TextView mTitle;

    public final void bH_() {
        if (this.f99353h != null) {
            mo79146a(this.f99353h.productInfo, "slide_left");
        }
    }

    public PoiDcdProductInfoViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    public final void mo79146a(C39103ai aiVar, String str) {
        if (aiVar != null && !TextUtils.isEmpty(aiVar.url)) {
            C39452l.m87730a(this.f99354i, "project_click_more", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("enter_method", str).mo47829a("poi_id", this.f99353h.poiId).mo47829a("content_type", this.f99353h.getSpSource()));
            C39452l.m87727a(this.f99413b, aiVar.url, "poi_page", "click_more");
        }
    }

    /* renamed from: a */
    public final void mo79145a(C38960e eVar, final C39067g gVar) {
        boolean z;
        if (!(this.f99353h != null || eVar == null || eVar.productInfo == null)) {
            this.f99353h = eVar;
            this.f99354i = gVar;
            C39103ai aiVar = this.f99353h.productInfo;
            this.mTitle.setText(aiVar.title);
            this.mAllProduct.setText(aiVar.urlTitle);
            if (!C9376b.m18558a((Collection<T>) aiVar.products)) {
                C38977h hVar = new C38977h(aiVar, gVar);
                this.f99416e = aiVar.products;
                ScrollToOpenLayout scrollToOpenLayout = this.f99414c;
                if (mo79160b() >= 5) {
                    z = true;
                } else {
                    z = false;
                }
                scrollToOpenLayout.setEnable(z);
                WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this.itemView.getContext());
                wrapLinearLayoutManager.mo4731b(0);
                boolean z2 = !TextUtils.isEmpty(aiVar.url);
                int b = mo79160b();
                if (!z2 || b < 5) {
                    this.f99414c.setOnScrollToEndListener(null);
                    this.f99415d.setText(this.f99413b.getString(R.string.chg));
                } else {
                    this.f99414c.setOnScrollToEndListener(this);
                    this.f99415d.setText(this.f99413b.getString(R.string.b1r));
                }
                this.f99412a.mo4798a((C1331h) new C1331h() {
                    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
                        super.getItemOffsets(rect, view, recyclerView, sVar);
                        rect.right = (int) C9432q.m18687b(recyclerView.getContext(), 6.0f);
                    }
                });
                this.f99412a.mo4801a((C1340m) new C1340m() {
                    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                        if (PoiDcdProductInfoViewHolder.this.f99352g != i && i == 0) {
                            C39452l.m87730a(gVar, "project_card_slide", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("poi_id", PoiDcdProductInfoViewHolder.this.f99353h.poiId).mo47829a("content_type", PoiDcdProductInfoViewHolder.this.f99353h.getSpSource()));
                        }
                        PoiDcdProductInfoViewHolder.this.f99352g = i;
                    }
                });
                this.f99412a.setLayoutManager(wrapLinearLayoutManager);
                this.f99412a.setAdapter(hVar);
            }
            this.mAllProductContainer.setOnClickListener(new C39013c(this, aiVar));
        }
    }
}
