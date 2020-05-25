package com.bytedance.android.livesdk.feed.banner.p333a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.banner.C2965a;
import com.bytedance.android.live.uikit.viewpager.C4281a;
import com.bytedance.android.livesdk.feed.C7066p;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.banner.a.c */
public final class C6842c extends C4281a {

    /* renamed from: a */
    public List<C2965a> f18759a = new ArrayList();

    /* renamed from: e */
    public String f18760e;

    /* renamed from: f */
    private C7066p f18761f;

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final int getCount() {
        if (this.f18759a == null) {
            return 0;
        }
        if (this.f18759a.size() > 1) {
            return Integer.MAX_VALUE;
        }
        return this.f18759a.size();
    }

    /* renamed from: a */
    public final void mo13026a(List<C2965a> list) {
        this.f18759a.clear();
        if (list != null) {
            this.f18759a.addAll(list);
        }
        notifyDataSetChanged();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            if (this.f11771b.size() < this.f18759a.size()) {
                this.f11771b.add(view);
            }
        }
    }

    /* renamed from: a */
    public final View mo8729a(int i, View view, ViewGroup viewGroup) {
        C6840a aVar;
        if (view == null) {
            view = this.f11772c.inflate(R.layout.alb, viewGroup, false);
            aVar = new C6840a(view, viewGroup.getContext(), this.f18760e, this.f18761f);
            view.setTag(aVar);
        } else {
            aVar = (C6840a) view.getTag();
        }
        if (this.f18759a != null && !this.f18759a.isEmpty()) {
            List<C2965a> list = this.f18759a;
            C2965a aVar2 = (C2965a) list.get(i % list.size());
            aVar.f18755e = aVar2;
            if (aVar2 != null) {
                aVar.f18753c.setVisibility(8);
                String str = aVar2.f8680h;
                if (!(aVar2.mo7671a() == null || aVar2.mo7671a().getUrls() == null || aVar2.mo7671a().getUrls().size() <= 0)) {
                    aVar.f18751a.setImageURI((String) aVar2.mo7671a().getUrls().get(0));
                }
                if (TextUtils.isEmpty(str)) {
                    aVar.f18752b.setVisibility(8);
                } else {
                    aVar.f18752b.setVisibility(0);
                    aVar.f18752b.setText(str);
                }
            }
        }
        return view;
    }

    public C6842c(Context context, LayoutInflater layoutInflater, String str, C7066p pVar) {
        super(context, layoutInflater);
        this.f18760e = str;
        this.f18761f = pVar;
    }
}
