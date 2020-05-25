package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.l */
public final class C45615l extends C1322a<C1352v> {

    /* renamed from: a */
    public C1690c f115380a;

    /* renamed from: b */
    public C52847n<Integer, Bitmap>[] f115381b = new C52847n[this.f115383d.f115388a];

    /* renamed from: c */
    public boolean f115382c = true;

    /* renamed from: d */
    private C45617m f115383d;

    /* renamed from: e */
    private int f115384e;

    /* renamed from: f */
    private int f115385f;

    public final int getItemCount() {
        return this.f115383d.f115388a;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.afs, viewGroup, false);
        if (inflate != null) {
            ImageView imageView = (ImageView) inflate;
            LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.height = this.f115385f;
            layoutParams.width = this.f115384e;
            imageView.setLayoutParams(layoutParams);
            return new C45622o(imageView);
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.ImageView");
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        View view = vVar.itemView;
        if (view != null) {
            ImageView imageView = (ImageView) view;
            Bitmap bitmap = null;
            if (i > this.f115381b.length) {
                imageView.setImageBitmap(null);
            } else if (this.f115381b[i] == null) {
                C52847n<Integer, Bitmap> nVar = this.f115381b[0];
                if (nVar != null) {
                    bitmap = (Bitmap) nVar.getSecond();
                }
                imageView.setImageBitmap(bitmap);
            } else {
                C52847n<Integer, Bitmap> nVar2 = this.f115381b[i];
                if (nVar2 != null) {
                    bitmap = (Bitmap) nVar2.getSecond();
                }
                imageView.setImageBitmap(bitmap);
            }
        } else {
            throw new C52857u("null cannot be cast to non-null type android.widget.ImageView");
        }
    }

    public C45615l(C42542c cVar, int i, int i2) {
        C52711k.m112240b(cVar, "videoCoverGenerator");
        this.f115384e = i;
        this.f115385f = i2;
        this.f115383d = new C45617m(cVar, this.f115384e, this.f115385f, cVar.mo78726a());
        C1690c f = this.f115383d.mo92001a().mo6545f((C1710e<? super T>) new C1710e<C52847n<? extends Integer, ? extends Bitmap>>(this) {

            /* renamed from: a */
            final /* synthetic */ C45615l f115386a;

            {
                this.f115386a = r1;
            }

            public final /* synthetic */ void accept(Object obj) {
                C52847n<Integer, Bitmap> nVar = (C52847n) obj;
                this.f115386a.f115381b[((Number) nVar.getFirst()).intValue()] = nVar;
                if (this.f115386a.f115382c) {
                    this.f115386a.f115382c = false;
                    this.f115386a.notifyDataSetChanged();
                    return;
                }
                this.f115386a.notifyItemChanged(((Number) nVar.getFirst()).intValue());
            }
        });
        C52711k.m112236a((Object) f, "videoCoverDataSource.asO…)\n            }\n        }");
        this.f115380a = f;
    }
}
