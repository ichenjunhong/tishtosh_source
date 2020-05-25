package com.p683ss.android.ugc.aweme.status;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.PagerAdapter;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.status.j */
public final class C45794j extends PagerAdapter {

    /* renamed from: a */
    public LayoutInflater f115735a;

    /* renamed from: b */
    public HashMap<Integer, RecyclerView> f115736b = new HashMap<>();

    /* renamed from: c */
    public RecordStatusViewModel f115737c;

    /* renamed from: d */
    public ArrayList<EffectCategoryResponse> f115738d = new ArrayList<>();

    /* renamed from: e */
    public int f115739e = -1;

    /* renamed from: f */
    public int f115740f;

    /* renamed from: g */
    public FragmentActivity f115741g;

    public final boolean isViewFromObject(View view, Object obj) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(obj, "p1");
        return view == obj;
    }

    public final int getCount() {
        return this.f115738d.size() + 1;
    }

    public final CharSequence getPageTitle(int i) {
        if (i == 0) {
            return this.f115741g.getString(R.string.g1_);
        }
        Object obj = this.f115738d.get(i - 1);
        C52711k.m112236a(obj, "categoryList.get(position - 1)");
        return ((EffectCategoryResponse) obj).getName();
    }

    public C45794j(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        this.f115741g = fragmentActivity;
        FragmentActivity fragmentActivity2 = this.f115741g;
        if (fragmentActivity2 != null) {
            LayoutInflater from = LayoutInflater.from(fragmentActivity2);
            C52711k.m112236a((Object) from, "LayoutInflater.from(activity as Context)");
            this.f115735a = from;
            C0209x a = C0214z.m440a(this.f115741g).mo359a(RecordStatusViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…tusViewModel::class.java)");
            this.f115737c = (RecordStatusViewModel) a;
            this.f115737c.mo92157b().observe(this.f115741g, new C0199s<EffectChannelResponse>(this) {

                /* renamed from: a */
                final /* synthetic */ C45794j f115742a;

                {
                    this.f115742a = r1;
                }

                public final /* synthetic */ void onChanged(Object obj) {
                    EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
                    if (effectChannelResponse != null) {
                        this.f115742a.f115738d.clear();
                        this.f115742a.f115738d.addAll(effectChannelResponse.getCategoryResponseList());
                        this.f115742a.notifyDataSetChanged();
                        return;
                    }
                    C10691a.m21549c((Context) this.f115742a.f115741g, (int) R.string.cfw, 1).mo19066a();
                }
            });
            this.f115740f = C39618d.f101151O.mo83118b(C40796a.StatusPhoneType);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.content.Context");
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "container");
        RecyclerView recyclerView = (RecyclerView) this.f115736b.get(Integer.valueOf(i));
        if (recyclerView == null || recyclerView.getParent() != null) {
            RecyclerView recyclerView2 = new RecyclerView(this.f115741g);
            recyclerView2.setLayoutParams(new LayoutParams(-1, -1));
            recyclerView2.setLayoutManager(new GridLayoutManager(this.f115741g, 2));
            if (i == 0) {
                int i2 = this.f115740f;
                String string = this.f115741g.getString(R.string.g1_);
                C52711k.m112236a((Object) string, "activity.getString(R.str…eation_shoot_status_tab1)");
                recyclerView2.setAdapter(new C45790i(this.f115741g, "all", i2, string));
                this.f115737c.mo92158c().setValue("all");
            } else {
                FragmentActivity fragmentActivity = this.f115741g;
                int i3 = i - 1;
                Object obj = this.f115738d.get(i3);
                C52711k.m112236a(obj, "categoryList.get(position - 1)");
                String key = ((EffectCategoryResponse) obj).getKey();
                C52711k.m112236a((Object) key, "categoryList.get(position - 1).key");
                int i4 = this.f115740f;
                Object obj2 = this.f115738d.get(i3);
                C52711k.m112236a(obj2, "categoryList.get(position - 1)");
                String name = ((EffectCategoryResponse) obj2).getName();
                C52711k.m112236a((Object) name, "categoryList.get(position - 1).name");
                recyclerView2.setAdapter(new C45790i(fragmentActivity, key, i4, name));
                C0198r c = this.f115737c.mo92158c();
                Object obj3 = this.f115738d.get(i3);
                C52711k.m112236a(obj3, "categoryList.get(position - 1)");
                c.setValue(((EffectCategoryResponse) obj3).getKey());
            }
            recyclerView2.mo4798a((C1331h) new C45738b(this.f115741g, recyclerView2));
            this.f115736b.put(Integer.valueOf(i), recyclerView2);
            viewGroup.addView(recyclerView2);
            return recyclerView2;
        }
        viewGroup.addView(recyclerView);
        return recyclerView;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C52711k.m112240b(viewGroup, "container");
        C52711k.m112240b(obj, "view");
        viewGroup.removeView((RecyclerView) obj);
    }

    public final void setPrimaryItem(View view, int i, Object obj) {
        C52711k.m112240b(view, "container");
        C52711k.m112240b(obj, "object");
        if (this.f115739e != i) {
            this.f115739e = i;
        }
    }
}
