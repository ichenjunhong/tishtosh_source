package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2212b;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44286c;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.p2216a.C44286c.C44287a;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.b */
public final class C44011b extends C44286c {

    /* renamed from: a */
    public int f111460a = -1;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.b$a */
    public final class C44012a extends C44287a {

        /* renamed from: a */
        final /* synthetic */ C44011b f111461a;

        public C44012a(C44011b bVar, ViewGroup viewGroup) {
            C52711k.m112240b(viewGroup, "parent");
            this.f111461a = bVar;
            super(bVar, viewGroup);
        }

        /* renamed from: a */
        public final void mo89845a(MyMediaModel myMediaModel, C44012a aVar, int i) {
            C52711k.m112240b(aVar, "holder");
            super.mo90182a(myMediaModel, aVar, i);
            this.f112107c.setVisibility(0);
            int i2 = 8;
            if (C44011b.m96993c(myMediaModel)) {
                this.f112108d.setVisibility(8);
                TextView textView = this.f112107c;
                Context context = this.f112107c.getContext();
                C52711k.m112236a((Object) context, "timeDuration.context");
                textView.setTextColor(context.getResources().getColor(R.color.k5));
                View view = this.f112109e;
                if (i == this.f111461a.f111460a) {
                    i2 = 0;
                }
                view.setVisibility(i2);
            } else {
                this.f112108d.setVisibility(0);
                this.f112109e.setVisibility(8);
                TextView textView2 = this.f112107c;
                Context context2 = this.f112107c.getContext();
                C52711k.m112236a((Object) context2, "timeDuration.context");
                textView2.setTextColor(context2.getResources().getColor(R.color.a1l));
            }
            C44011b bVar = this.f111461a;
            long j = 0;
            if (!C50201e.m108355a(bVar.f112102c) && i >= 0 && i < bVar.f112102c.size()) {
                j = ((C44010a) bVar.f112102c.get(i)).f111459a;
            }
            float f = (1.0f * ((float) j)) / 1000.0f;
            TextView textView3 = this.f112107c;
            Context context3 = this.f112107c.getContext();
            C52711k.m112236a((Object) context3, "timeDuration.context");
            textView3.setText(context3.getResources().getString(R.string.g0s, new Object[]{Float.valueOf(f)}));
        }
    }

    /* renamed from: b */
    private static MyMediaModel m96568b() {
        MyMediaModel myMediaModel = new MyMediaModel(System.currentTimeMillis());
        myMediaModel.f95383b = "";
        myMediaModel.f95389h = "";
        myMediaModel.f95386e = 0;
        myMediaModel.f95385d = 4;
        return myMediaModel;
    }

    /* renamed from: c */
    private final void m96569c() {
        if (this.f111460a >= 0 && this.f111460a < getItemCount()) {
            notifyItemChanged(this.f111460a);
        }
    }

    /* renamed from: a */
    public final int mo89839a() {
        int i = 0;
        for (Object next : this.f112101b) {
            int i2 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            if (m96993c((MyMediaModel) next)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo89840a(int i) {
        if (i > 0) {
            int i2 = 1;
            while (true) {
                this.f112101b.add(m96568b());
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        this.f111460a = 0;
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo89844b(MyMediaModel myMediaModel) {
        C52711k.m112240b(myMediaModel, "mediaModel");
        int a = mo89839a();
        if (a >= 0 && a < getItemCount()) {
            this.f112101b.remove(a);
            this.f112101b.add(a, myMediaModel);
            notifyItemChanged(a);
            this.f111460a = mo89839a();
            m96569c();
        }
    }

    /* renamed from: a */
    public final void mo89842a(MyMediaModel myMediaModel) {
        if (myMediaModel != null) {
            int size = this.f112101b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                Object obj = this.f112101b.get(i);
                C52711k.m112236a(obj, "mediaModelList[i]");
                if (C52711k.m112239a((Object) ((MyMediaModel) obj).f95383b, (Object) myMediaModel.f95383b)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                int a = mo89839a();
                if (a == -1) {
                    this.f111460a = i;
                } else if (a >= i) {
                    m96569c();
                    this.f111460a = i;
                }
                this.f112101b.remove(myMediaModel);
                this.f112101b.add(i, m96568b());
                notifyItemChanged(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo89843a(ArrayList<C44010a> arrayList) {
        if (!C50201e.m108355a(arrayList)) {
            if (arrayList == null) {
                C52711k.m112234a();
            }
            C52711k.m112240b(arrayList, "<set-?>");
            this.f112102c = arrayList;
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "viewGroup");
        return new C44012a(this, viewGroup);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "viewHolder");
        C44012a aVar = (C44012a) vVar;
        aVar.mo89845a((MyMediaModel) this.f112101b.get(i), aVar, i);
    }

    /* renamed from: a */
    public final void mo89841a(C1352v vVar, C1352v vVar2) {
        C52711k.m112240b(vVar, "sourceHolder");
        C52711k.m112240b(vVar2, "targetHolder");
        int adapterPosition = vVar.getAdapterPosition();
        int adapterPosition2 = vVar2.getAdapterPosition();
        if (adapterPosition < this.f112101b.size() && adapterPosition2 < this.f112101b.size()) {
            notifyItemMoved(adapterPosition, adapterPosition2);
            Object remove = this.f112101b.remove(adapterPosition);
            C52711k.m112236a(remove, "mediaModelList.removeAt(from)");
            this.f112101b.add(adapterPosition2, (MyMediaModel) remove);
        }
    }
}
