package com.p683ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.viewpager.C11159a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.p2062a.C39092f;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.i */
public final class C38978i extends C11159a implements C38969a {

    /* renamed from: i */
    public static int f99277i;

    /* renamed from: j */
    public static int f99278j;

    /* renamed from: d */
    public List<C39092f> f99279d;

    /* renamed from: e */
    public int f99280e;

    /* renamed from: f */
    public String f99281f;

    /* renamed from: g */
    public String f99282g;

    /* renamed from: h */
    public C39067g f99283h;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.i$a */
    static class C38979a {

        /* renamed from: a */
        View f99284a;

        /* renamed from: b */
        Context f99285b;

        /* renamed from: c */
        int f99286c;

        /* renamed from: d */
        SmartImageView f99287d;

        /* renamed from: e */
        DmtTextView f99288e;

        /* renamed from: f */
        DmtTextView f99289f;

        /* renamed from: g */
        View f99290g;

        /* renamed from: h */
        View f99291h;

        /* renamed from: i */
        String f99292i;

        /* renamed from: j */
        C39067g f99293j;

        /* renamed from: k */
        String f99294k;

        C38979a(View view, int i, String str, String str2, C39067g gVar) {
            this.f99284a = view;
            this.f99286c = i;
            this.f99292i = str2;
            this.f99293j = gVar;
            this.f99294k = str;
            this.f99285b = view.getContext();
            this.f99287d = (SmartImageView) view.findViewById(R.id.anr);
            this.f99288e = (DmtTextView) view.findViewById(R.id.anm);
            this.f99290g = view.findViewById(R.id.ba2);
            this.f99291h = view.findViewById(R.id.cck);
            this.f99289f = (DmtTextView) view.findViewById(R.id.anw);
        }
    }

    public final int getCount() {
        if (this.f99279d == null) {
            return 0;
        }
        return this.f99279d.size();
    }

    public C38978i(Context context, LayoutInflater layoutInflater) {
        super(context, layoutInflater);
        if (f99277i == 0) {
            int a = C9432q.m18670a(context);
            f99277i = a;
            double d = (double) a;
            Double.isNaN(d);
            f99278j = (int) (d / 4.787d);
        }
    }

    /* renamed from: a */
    public final View mo20489a(int i, View view, ViewGroup viewGroup) {
        C38979a aVar;
        if (view == null) {
            view = this.f30103b.inflate(R.layout.b66, viewGroup, false);
            aVar = new C38979a(view, this.f99280e, this.f99281f, this.f99282g, this.f99283h);
            view.setTag(aVar);
        } else {
            aVar = (C38979a) view.getTag();
        }
        if (getCount() > 0) {
            C39092f fVar = (C39092f) this.f99279d.get(i);
            C12203q.m24645a((Object) C23608p.m57874a(fVar.getBannerUrl())).mo23111a(f99277i, f99278j).mo23116a((C12197k) aVar.f99287d).mo23118a("PoiRankBannerPagerAdapter").mo23121a();
            if (TextUtils.isEmpty(fVar.getSchema())) {
                aVar.f99288e.setVisibility(0);
                aVar.f99288e.setText(fVar.getDescription());
                aVar.f99290g.setVisibility(0);
                aVar.f99291h.setVisibility(0);
            } else {
                aVar.f99288e.setVisibility(8);
                aVar.f99288e.setText("");
                aVar.f99290g.setVisibility(8);
                aVar.f99291h.setVisibility(8);
                if (!TextUtils.isEmpty(fVar.getTag())) {
                    aVar.f99289f.setText(fVar.getTag());
                    aVar.f99289f.setVisibility(0);
                    aVar.f99284a.setOnClickListener(new C38980j(aVar, fVar, i));
                }
            }
            aVar.f99289f.setVisibility(8);
            aVar.f99284a.setOnClickListener(new C38980j(aVar, fVar, i));
        }
        return view;
    }
}
