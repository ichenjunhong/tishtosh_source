package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.discover.helper.C28209q;
import com.p683ss.android.ugc.aweme.discover.widget.BannerViewPager;
import com.p683ss.android.ugc.aweme.discover.widget.IndicatorView;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.adapter.C38970b;
import com.p683ss.android.ugc.aweme.poi.adapter.C38978i;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39092f;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38957b;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiCommonBannerViewHolder */
public class PoiCommonBannerViewHolder extends C1352v {

    /* renamed from: a */
    public List<C39092f> f99344a;

    /* renamed from: b */
    private C28209q f99345b;

    /* renamed from: c */
    private C38978i f99346c;

    /* renamed from: d */
    private Context f99347d;

    /* renamed from: e */
    private View f99348e;

    /* renamed from: f */
    private C39067g f99349f;
    protected View mDividerBottom;
    protected IndicatorView mIndicator;
    protected BannerViewPager mViewPager;

    public PoiCommonBannerViewHolder(View view) {
        super(view);
        this.f99347d = view.getContext();
        this.f99348e = view;
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    public final void mo79144a(C39092f fVar, int i) {
        C39452l.m87730a(this.f99349f, "banner_show", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("previous_page", this.f99349f.getPreviousPage()).mo47829a("banner_id", fVar.getBid()).mo47826a("client_order", i).mo47829a("city_info", C23198ae.m56845a()).mo47829a("from_poi_id", this.f99349f.getPoiId()));
    }

    /* renamed from: a */
    public final void mo79143a(C38957b bVar, C39067g gVar) {
        if (bVar == null || bVar.size() == 0) {
            this.f99348e.setVisibility(8);
        } else if (this.f99344a == null) {
            this.f99349f = gVar;
            this.f99348e.setVisibility(0);
            this.f99344a = bVar.getBanners();
            this.f99345b = new C28209q(this.mViewPager);
            C1056u.m3049c((View) this.mIndicator, 0);
            if (this.f99346c == null) {
                this.f99346c = new C38978i(this.f99347d, LayoutInflater.from(this.f99347d));
                this.f99346c.f99283h = this.f99349f;
                this.mViewPager.setAdapter(new C38970b(this.f99346c, this.f99344a.size(), true));
            }
            this.f99345b.f74055b = this.f99344a.size();
            C38978i iVar = this.f99346c;
            List<C39092f> list = this.f99344a;
            iVar.f99280e = 0;
            iVar.f99281f = "";
            iVar.f99279d = list;
            iVar.f99282g = "poi_page";
            iVar.notifyDataSetChanged();
            this.mIndicator.mo58544a(this.mViewPager);
            if (this.f99344a.size() > 1) {
                this.mIndicator.setVisibility(0);
                this.f99345b.mo56624a();
            } else {
                this.mIndicator.setVisibility(8);
                this.f99345b.mo56625b();
                this.mViewPager.setOnTouchListener(null);
            }
            mo79144a((C39092f) this.f99344a.get(0), 0);
            this.mViewPager.addOnPageChangeListener(new C0997e() {
                public final void onPageScrollStateChanged(int i) {
                }

                public final void onPageScrolled(int i, float f, int i2) {
                }

                public final void onPageSelected(int i) {
                    int size = i % PoiCommonBannerViewHolder.this.f99344a.size();
                    PoiCommonBannerViewHolder.this.mo79144a((C39092f) PoiCommonBannerViewHolder.this.f99344a.get(size), size);
                }
            });
        }
    }
}
