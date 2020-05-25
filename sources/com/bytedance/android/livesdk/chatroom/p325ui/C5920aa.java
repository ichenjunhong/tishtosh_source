package com.bytedance.android.livesdk.chatroom.p325ui;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.C2970d;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.aa */
public final class C5920aa extends C1322a<C1352v> {

    /* renamed from: a */
    public FansClubData f15579a;

    /* renamed from: b */
    public boolean f15580b = true;

    /* renamed from: c */
    public C5921a f15581c;

    /* renamed from: d */
    private List<C2970d> f15582d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.aa$a */
    interface C5921a {
        /* renamed from: a */
        void mo11856a(C2970d dVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.aa$b */
    class C5922b extends C1352v {

        /* renamed from: a */
        HSImageView f15583a;

        /* renamed from: b */
        TextView f15584b;

        /* renamed from: c */
        TextView f15585c;

        /* renamed from: d */
        TextView f15586d;

        /* renamed from: e */
        View f15587e;

        /* renamed from: f */
        TextView f15588f;

        /* renamed from: g */
        C2970d f15589g;

        /* renamed from: h */
        int f15590h;

        C5922b(View view, int i) {
            super(view);
            this.f15590h = i;
            this.f15583a = (HSImageView) view.findViewById(R.id.adm);
            this.f15584b = (TextView) view.findViewById(R.id.title);
            this.f15585c = (TextView) view.findViewById(R.id.baa);
            this.f15587e = view.findViewById(R.id.cks);
            this.f15586d = (TextView) view.findViewById(R.id.fb);
            this.f15583a.setOnClickListener(new C5923ab(this));
            this.f15588f = (TextView) view.findViewById(R.id.ade);
            this.f15588f.setOnClickListener(new C5924ac(this));
        }
    }

    public final int getItemCount() {
        if (this.f15582d == null) {
            return 0;
        }
        return this.f15582d.size();
    }

    public final int getItemViewType(int i) {
        if (i == this.f15582d.size() - 1) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo11855a(C2970d dVar) {
        if (dVar != null) {
            dVar.f8705f = true;
        }
        for (C2970d dVar2 : this.f15582d) {
            if (dVar2 != null && !dVar2.equals(dVar)) {
                dVar2.f8705f = false;
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public static void m12921a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5922b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.all, viewGroup, false), i);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        C5922b bVar = (C5922b) vVar;
        C2970d dVar = (C2970d) this.f15582d.get(i);
        bVar.f15589g = dVar;
        int i2 = 0;
        if (bVar.f15590h == 1) {
            m12921a(bVar.f15588f, 0);
            m12921a(bVar.f15583a, 8);
            m12921a(bVar.f15584b, 8);
            m12921a(bVar.f15585c, 8);
            m12921a(bVar.f15586d, 8);
        } else {
            m12921a(bVar.f15588f, 8);
            m12921a(bVar.f15583a, 0);
            m12921a(bVar.f15584b, 0);
            m12921a(bVar.f15585c, 0);
            m12921a(bVar.f15586d, 0);
            if (dVar.f8704e != null) {
                C5213c.m11820a(bVar.f15583a, dVar.f8704e.f8668b);
                bVar.f15584b.setText(dVar.f8704e.f8667a);
            }
            bVar.f15585c.setText(C3922z.m9905a((int) R.string.ea3, String.valueOf(dVar.f8702c)));
            if (dVar.f8700a != null) {
                bVar.f15586d.setText(dVar.f8700a.getNickName());
            }
            if (C5920aa.this.f15580b && C5920aa.this.f15579a != null && !TextUtils.isEmpty(C5920aa.this.f15579a.clubName) && C5920aa.this.f15579a.clubName.equals(dVar.f8704e.f8667a)) {
                dVar.f8705f = true;
                C5920aa.this.f15580b = false;
            }
        }
        if (dVar != null) {
            View view = bVar.f15587e;
            if (!dVar.f8705f) {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
    }

    public C5920aa(List<C2970d> list, FansClubData fansClubData, C5921a aVar) {
        if (list != null) {
            C2970d dVar = new C2970d();
            if (fansClubData == null) {
                dVar.f8705f = true;
            }
            list.add(dVar);
        }
        this.f15582d = list;
        this.f15579a = fansClubData;
        this.f15581c = aVar;
    }
}
