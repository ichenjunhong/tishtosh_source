package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.p2211a;

import android.graphics.Bitmap;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.p683ss.android.ugc.aweme.shortvideo.widget.C45622o;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a */
public final class C44001a extends C1322a<C1352v> {

    /* renamed from: a */
    private int f111428a;

    /* renamed from: b */
    private int f111429b;

    /* renamed from: c */
    private List<Bitmap> f111430c = new ArrayList(7);

    public final int getItemCount() {
        return this.f111430c.size();
    }

    /* renamed from: a */
    public final void mo89830a(List<Bitmap> list) {
        if (list != null && !list.isEmpty()) {
            this.f111430c.clear();
            this.f111430c.addAll(list);
            notifyDataSetChanged();
        }
    }

    public C44001a(int i, int i2) {
        this.f111428a = i;
        this.f111429b = i2;
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        Bitmap bitmap = (Bitmap) this.f111430c.get(i);
        ImageView imageView = (ImageView) vVar.itemView;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        ImageView imageView = (ImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.afs, viewGroup, false);
        LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = this.f111429b;
        layoutParams.width = this.f111428a;
        imageView.setScaleType(ScaleType.CENTER_CROP);
        imageView.setLayoutParams(layoutParams);
        return new C45622o(imageView);
    }
}
