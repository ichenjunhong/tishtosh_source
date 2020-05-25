package com.bytedance.android.livesdk.rank.p413f;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.C5184d;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.rank.model.C8214a;
import com.bytedance.android.livesdk.rank.model.C8216c;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.rank.view.C8232e.C8236a;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2663f.p2664a.p2665a.C53035c;

/* renamed from: com.bytedance.android.livesdk.rank.f.d */
public final class C8176d extends C53035c<C8216c, C8177a> {

    /* renamed from: a */
    C8214a f22313a;

    /* renamed from: com.bytedance.android.livesdk.rank.f.d$a */
    static class C8177a extends C1352v {

        /* renamed from: a */
        TextView f22314a;

        /* renamed from: b */
        TextView f22315b;

        /* renamed from: c */
        View f22316c;

        /* renamed from: d */
        ImageView f22317d;

        /* renamed from: e */
        ImageView f22318e;

        /* renamed from: f */
        TextView f22319f;

        /* renamed from: g */
        View f22320g;

        /* renamed from: h */
        ImageView f22321h;

        /* renamed from: i */
        ImageView f22322i;

        /* renamed from: j */
        TextView f22323j;

        /* renamed from: k */
        View f22324k;

        /* renamed from: l */
        ImageView f22325l;

        /* renamed from: m */
        ImageView f22326m;

        /* renamed from: n */
        TextView f22327n;

        /* renamed from: o */
        int f22328o;

        /* renamed from: p */
        List<C8219f> f22329p;

        /* renamed from: q */
        private C8236a f22330q;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo14353a(C8219f fVar) {
            long[] a;
            User user = fVar.f22442a;
            if (user != null) {
                String str = "";
                if (this.f22328o == 1) {
                    str = "hourly_rank_last";
                } else if (this.f22328o == 2) {
                    str = "regional_rank_last";
                }
                String str2 = str;
                C4495a a2 = C4495a.m10823a();
                long a3 = fVar.mo14364a();
                if (this.f22330q == null) {
                    a = new long[0];
                } else {
                    a = this.f22330q.mo14354a();
                }
                C5184d dVar = new C5184d(user, a3, a, fVar.f22444c, str2);
                a2.mo10301a((Object) dVar);
            }
        }

        C8177a(View view, C8236a aVar) {
            super(view);
            this.f22330q = aVar;
            this.f22314a = (TextView) view.findViewById(R.id.b6g);
            this.f22315b = (TextView) view.findViewById(R.id.b6h);
            this.f22316c = view.findViewById(R.id.bqy);
            this.f22317d = (ImageView) view.findViewById(R.id.dm_);
            this.f22318e = (ImageView) view.findViewById(R.id.ay4);
            this.f22319f = (TextView) view.findViewById(R.id.dn4);
            this.f22320g = view.findViewById(R.id.bqz);
            this.f22321h = (ImageView) view.findViewById(R.id.dma);
            this.f22322i = (ImageView) view.findViewById(R.id.ay5);
            this.f22323j = (TextView) view.findViewById(R.id.dn5);
            this.f22324k = view.findViewById(R.id.br0);
            this.f22325l = (ImageView) view.findViewById(R.id.dmb);
            this.f22326m = (ImageView) view.findViewById(R.id.ay6);
            this.f22327n = (TextView) view.findViewById(R.id.dn6);
            this.f22315b.setOnClickListener(new C8179f(this));
            this.f22317d.setOnClickListener(new C8180g(this));
            this.f22321h.setOnClickListener(new C8181h(this));
            this.f22325l.setOnClickListener(new C8182i(this));
        }

        /* renamed from: a */
        static void m16256a(C8219f fVar, ImageView imageView, ImageView imageView2, TextView textView) {
            ImageModel imageModel;
            String str;
            if (fVar != null && imageView != null && imageView2 != null && textView != null) {
                User user = fVar.f22442a;
                if (user != null) {
                    imageModel = user.getAvatarThumb();
                } else {
                    imageModel = null;
                }
                C5213c.m11826b(imageView, imageModel, imageView.getWidth(), imageView.getHeight(), R.drawable.bt6);
                if (user != null) {
                    str = user.getNickName();
                } else {
                    str = "";
                }
                textView.setText(str);
                if (fVar.mo14364a() > 0) {
                    imageView2.setImageResource(R.drawable.c3q);
                    imageView2.setVisibility(0);
                    return;
                }
                imageView2.setVisibility(8);
            }
        }
    }

    public C8176d(C8214a aVar) {
        this.f22313a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C8177a(layoutInflater.inflate(R.layout.ah3, viewGroup, false), new C8178e(this));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        C8177a aVar = (C8177a) vVar;
        C8216c cVar = (C8216c) obj;
        if (cVar != null) {
            aVar.f22329p = cVar.f22436a;
            if (aVar.f22329p != null && aVar.f22329p.size() >= 3) {
                String str = cVar.f22437b;
                if (str == null || str.isEmpty()) {
                    aVar.f22314a.setVisibility(8);
                    aVar.f22315b.setVisibility(8);
                } else {
                    aVar.f22314a.setText(aVar.itemView.getContext().getString(R.string.edz, new Object[]{str}));
                    aVar.f22315b.setText(str);
                }
                aVar.f22328o = cVar.f22438c;
                if (aVar.f22328o != 2) {
                    aVar.f22316c.setBackgroundResource(R.drawable.c2p);
                    aVar.f22320g.setBackgroundResource(R.drawable.c2q);
                    aVar.f22324k.setBackgroundResource(R.drawable.c2r);
                } else {
                    aVar.f22316c.setBackgroundResource(R.drawable.c2u);
                    aVar.f22320g.setBackgroundResource(R.drawable.c2v);
                    aVar.f22324k.setBackgroundResource(R.drawable.c2w);
                }
                C8177a.m16256a((C8219f) aVar.f22329p.get(0), aVar.f22317d, aVar.f22318e, aVar.f22319f);
                C8177a.m16256a((C8219f) aVar.f22329p.get(1), aVar.f22321h, aVar.f22322i, aVar.f22323j);
                C8177a.m16256a((C8219f) aVar.f22329p.get(2), aVar.f22325l, aVar.f22326m, aVar.f22327n);
            }
        }
    }
}
