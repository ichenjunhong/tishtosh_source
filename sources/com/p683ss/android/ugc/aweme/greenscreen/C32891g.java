package com.p683ss.android.ugc.aweme.greenscreen;

import android.net.Uri;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2327e.C46504a;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.utils.C50201e;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.g */
public final class C32891g extends C1322a<C1352v> {

    /* renamed from: a */
    public String f85517a;

    /* renamed from: b */
    public final ArrayList<String> f85518b = new ArrayList<>();

    /* renamed from: c */
    public int f85519c = -1;

    /* renamed from: d */
    public final C32926v f85520d;

    /* renamed from: e */
    private RecyclerView f85521e;

    /* renamed from: com.ss.android.ugc.aweme.greenscreen.g$a */
    public static final class C32892a extends C47687av {

        /* renamed from: a */
        final /* synthetic */ C32891g f85522a;

        /* renamed from: b */
        final /* synthetic */ C46504a f85523b;

        /* renamed from: a */
        public final void mo59929a(View view) {
            C52711k.m112240b(view, "v");
            int adapterPosition = this.f85523b.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < this.f85522a.f85518b.size()) {
                if (adapterPosition == this.f85522a.f85519c) {
                    this.f85522a.f85517a = null;
                    this.f85522a.notifyItemChanged(adapterPosition);
                    this.f85522a.f85519c = -1;
                    this.f85522a.f85520d.mo69814a();
                    return;
                }
                this.f85522a.f85517a = (String) this.f85522a.f85518b.get(adapterPosition);
                this.f85522a.notifyItemChanged(this.f85522a.f85519c);
                this.f85522a.notifyItemChanged(adapterPosition);
                this.f85522a.f85520d.mo69815a(this.f85522a.f85517a);
                this.f85522a.f85519c = adapterPosition;
            }
        }

        C32892a(C32891g gVar, C46504a aVar, long j) {
            this.f85522a = gVar;
            this.f85523b = aVar;
            super(500);
        }
    }

    public final int getItemCount() {
        return this.f85518b.size();
    }

    /* renamed from: a */
    public final void mo69803a() {
        this.f85517a = null;
        if (this.f85519c >= 0) {
            notifyItemChanged(this.f85519c);
        }
        this.f85519c = -1;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f85521e = recyclerView;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f85521e = null;
    }

    public C32891g(C32926v vVar) {
        C52711k.m112240b(vVar, "callback");
        this.f85520d = vVar;
    }

    /* renamed from: a */
    public final void mo69804a(String str) {
        if (!TextUtils.isEmpty(str) && !C50201e.m108355a(this.f85518b)) {
            int size = this.f85518b.size();
            for (int i = 0; i < size; i++) {
                if (C52830p.m112407a(str, (String) this.f85518b.get(i), false, 2, null)) {
                    this.f85517a = (String) this.f85518b.get(i);
                    if (this.f85519c >= 0) {
                        notifyItemChanged(this.f85519c);
                    }
                    notifyItemChanged(i);
                    this.f85519c = i;
                    RecyclerView recyclerView = this.f85521e;
                    if (recyclerView != null) {
                        C1332i layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.mo4741e(i);
                        }
                    }
                }
            }
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.s4, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        C46504a aVar = new C46504a(inflate);
        inflate.setOnClickListener(new C32892a(this, aVar, 500));
        return aVar;
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        if (vVar instanceof C46504a) {
            Object obj = this.f85518b.get(i);
            C52711k.m112236a(obj, "dataList[position]");
            String str = (String) obj;
            if (TextUtils.equals(this.f85517a, str)) {
                ((C46504a) vVar).f117340a.setVisibility(0);
            } else {
                ((C46504a) vVar).f117340a.setVisibility(8);
            }
            String uri = Uri.fromFile(new File(str)).toString();
            C52711k.m112236a((Object) uri, "Uri.fromFile(File(imagePath)).toString()");
            C46504a aVar = (C46504a) vVar;
            int b = (int) C9432q.m18687b(aVar.f117341b.getContext(), 50.0f);
            C50181a.m108293a(aVar.f117341b, uri, b, b);
        }
    }
}
