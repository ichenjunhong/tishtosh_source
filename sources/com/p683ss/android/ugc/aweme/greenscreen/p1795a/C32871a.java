package com.p683ss.android.ugc.aweme.greenscreen.p1795a;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.a.a */
public final class C32871a extends C1322a<C32882c> {

    /* renamed from: a */
    public C32883d f85482a;

    /* renamed from: b */
    public C32884e f85483b;

    /* renamed from: c */
    ArrayList<MediaModel> f85484c = new ArrayList<>();

    /* renamed from: d */
    private final int f85485d = (((C9432q.m18670a(this.f85486e) - (((int) C9432q.m18687b(this.f85486e, 1.0f)) * 3)) + 0) / 4);

    /* renamed from: e */
    private final Context f85486e;

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.a.a$a */
    public static final class C32872a extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C32871a f85487a;

        /* renamed from: b */
        final /* synthetic */ C32882c f85488b;

        /* renamed from: a */
        public final void mo59929a(View view) {
            if (view != null && -1 != this.f85488b.getAdapterPosition()) {
                MediaModel mediaModel = this.f85488b.f85505b;
                if (mediaModel != null) {
                    C32883d dVar = this.f85487a.f85482a;
                    if (dVar != null) {
                        dVar.mo69796a(view, mediaModel);
                    }
                }
            }
        }

        C32872a(C32871a aVar, C32882c cVar) {
            this.f85487a = aVar;
            this.f85488b = cVar;
        }
    }

    public final int getItemCount() {
        return this.f85484c.size();
    }

    public final /* synthetic */ void onViewAttachedToWindow(C1352v vVar) {
        C32882c cVar = (C32882c) vVar;
        C52711k.m112240b(cVar, "holder");
        super.onViewAttachedToWindow(cVar);
        int adapterPosition = cVar.getAdapterPosition();
        int size = this.f85484c.size();
        if (adapterPosition >= 0 && size > adapterPosition) {
            Object obj = this.f85484c.get(adapterPosition);
            C52711k.m112236a(obj, "mDataList[holderPos]");
            String str = ((MediaModel) obj).f95397p;
            C32884e eVar = this.f85483b;
            if (eVar != null) {
                eVar.mo69797a(str);
            }
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f85486e).inflate(R.layout.b5e, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C32882c(inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C32882c cVar = (C32882c) vVar;
        C52711k.m112240b(cVar, "holder");
        int size = this.f85484c.size();
        if (i >= 0 && size > i) {
            View view = cVar.itemView;
            C52711k.m112236a((Object) view, "holder.itemView");
            LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams == null || layoutParams.width == this.f85485d || layoutParams.height == this.f85485d)) {
                layoutParams.width = this.f85485d;
                layoutParams.height = this.f85485d;
            }
            Object obj = this.f85484c.get(i);
            C52711k.m112236a(obj, "mDataList[position]");
            MediaModel mediaModel = (MediaModel) obj;
            cVar.f85505b = mediaModel;
            C50181a.m108294a(cVar.f85504a, mediaModel.f95389h, this.f85485d, this.f85485d, Config.ARGB_4444);
            cVar.itemView.setOnClickListener(new C32872a(this, cVar));
        }
    }

    public C32871a(Context context, int i, float f, int i2) {
        C52711k.m112240b(context, "context");
        this.f85486e = context;
    }
}
