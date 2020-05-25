package com.bytedance.android.live.broadcast.effect.p205b.p206a;

import android.graphics.Color;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.C2978h;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.effect.C3203b;
import com.bytedance.android.live.broadcast.effect.C3366v;
import com.bytedance.android.live.broadcast.effect.C3366v.C3368b;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.effect.b.a.e */
public final class C3229e extends C1322a<C3230a> {

    /* renamed from: a */
    public List<? extends C8688c> f9336a;

    /* renamed from: b */
    public int f9337b;

    /* renamed from: c */
    public C3231b f9338c;

    /* renamed from: d */
    private final String f9339d;

    /* renamed from: e */
    private final C3232c f9340e;

    /* renamed from: f */
    private final int f9341f;

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.e$a */
    public final class C3230a extends C1352v {

        /* renamed from: a */
        final /* synthetic */ C3229e f9342a;

        public C3230a(C3229e eVar, View view) {
            C52711k.m112240b(view, "view");
            this.f9342a = eVar;
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.e$b */
    public interface C3231b {
        /* renamed from: a */
        void mo8558a(C8688c cVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.e$c */
    public static final class C3232c implements C3368b {

        /* renamed from: a */
        final /* synthetic */ C3229e f9343a;

        C3232c(C3229e eVar) {
            this.f9343a = eVar;
        }

        /* renamed from: a */
        public final void mo8557a(C8688c cVar) {
            C52711k.m112240b(cVar, "sticker");
            this.f9343a.notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.e$d */
    static final class C3233d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3229e f9344a;

        /* renamed from: b */
        final /* synthetic */ C3230a f9345b;

        C3233d(C3229e eVar, C3230a aVar) {
            this.f9344a = eVar;
            this.f9345b = aVar;
        }

        public final void onClick(View view) {
            int adapterPosition = this.f9345b.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < this.f9344a.f9336a.size()) {
                C3203b b = C3395f.m9156f().mo8741b();
                C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
                if (b.mo8551a().mo8282a((C8688c) this.f9344a.f9336a.get(adapterPosition))) {
                    this.f9344a.f9337b = adapterPosition;
                    C3231b bVar = this.f9344a.f9338c;
                    if (bVar != null) {
                        bVar.mo8558a((C8688c) this.f9344a.f9336a.get(this.f9344a.f9337b));
                    }
                    this.f9344a.notifyDataSetChanged();
                }
            }
        }
    }

    public C3229e() {
        this(0, 1, null);
    }

    public final int getItemCount() {
        return this.f9336a.size();
    }

    public C3229e(int i) {
        this.f9341f = i;
        this.f9339d = "LiveSmallSubItemBeautyAdapter";
        this.f9336a = new ArrayList();
        this.f9340e = new C3232c(this);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "view");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f9341f, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(view…temLayoutId, view, false)");
        return new C3230a(this, inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C3230a aVar = (C3230a) vVar;
        C52711k.m112240b(aVar, "viewHolder");
        boolean z = false;
        if (this.f9337b == i) {
            View view = aVar.itemView;
            C52711k.m112236a((Object) view, "viewHolder.itemView");
            View findViewById = view.findViewById(R.id.li);
            C52711k.m112236a((Object) findViewById, "viewHolder.itemView.border");
            findViewById.setVisibility(0);
            View view2 = aVar.itemView;
            C52711k.m112236a((Object) view2, "viewHolder.itemView");
            ((TextView) view2.findViewById(R.id.dcn)).setTextColor(Color.parseColor("#ffc95c"));
        } else {
            View view3 = aVar.itemView;
            C52711k.m112236a((Object) view3, "viewHolder.itemView");
            View findViewById2 = view3.findViewById(R.id.li);
            C52711k.m112236a((Object) findViewById2, "viewHolder.itemView.border");
            findViewById2.setVisibility(4);
            View view4 = aVar.itemView;
            C52711k.m112236a((Object) view4, "viewHolder.itemView");
            ((TextView) view4.findViewById(R.id.dcn)).setTextColor(Color.parseColor("#ffffffff"));
        }
        View view5 = aVar.itemView;
        C52711k.m112236a((Object) view5, "viewHolder.itemView");
        HSImageView hSImageView = (HSImageView) view5.findViewById(R.id.ayg);
        C2978h hVar = ((C8688c) this.f9336a.get(i)).f23740a;
        C52711k.m112236a((Object) hVar, "stickerList[index].icon");
        String str = hVar.f8729a;
        C2978h hVar2 = ((C8688c) this.f9336a.get(i)).f23740a;
        C52711k.m112236a((Object) hVar2, "stickerList[index].icon");
        C5213c.m11824b(hSImageView, C3287f.m9008a(str, hVar2.f8730b));
        View view6 = aVar.itemView;
        C52711k.m112236a((Object) view6, "viewHolder.itemView");
        TextView textView = (TextView) view6.findViewById(R.id.dcn);
        C52711k.m112236a((Object) textView, "viewHolder.itemView.tv_name");
        textView.setText(((C8688c) this.f9336a.get(i)).f23745f);
        C3203b b = C3395f.m9156f().mo8741b();
        C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
        if (b.mo8551a().mo8282a((C8688c) this.f9336a.get(i))) {
            View view7 = aVar.itemView;
            C52711k.m112236a((Object) view7, "viewHolder.itemView");
            ImageView imageView = (ImageView) view7.findViewById(R.id.b25);
            C52711k.m112236a((Object) imageView, "viewHolder.itemView.iv_loading");
            imageView.setVisibility(8);
            if (this.f9337b == i) {
                C3203b b2 = C3395f.m9156f().mo8741b();
                C52711k.m112236a((Object) b2, "LiveInternalService.inst().liveEffectService()");
                b2.mo8553b().mo8735a((C8688c) this.f9336a.get(this.f9337b));
            } else {
                C3395f.m9156f().mo8740a().mo8274b(C3037b.f8916d, (C8688c) this.f9336a.get(i));
            }
        } else {
            View view8 = aVar.itemView;
            C52711k.m112236a((Object) view8, "viewHolder.itemView");
            ImageView imageView2 = (ImageView) view8.findViewById(R.id.b25);
            C52711k.m112236a((Object) imageView2, "viewHolder.itemView.iv_loading");
            imageView2.setVisibility(0);
            C3203b b3 = C3395f.m9156f().mo8741b();
            C52711k.m112236a((Object) b3, "LiveInternalService.inst().liveEffectService()");
            C3366v b4 = b3.mo8553b();
            C8688c cVar = (C8688c) this.f9336a.get(i);
            if (this.f9337b == i) {
                z = true;
            }
            b4.mo8736a(cVar, z, this.f9340e);
        }
        aVar.itemView.setOnClickListener(new C3233d(this, aVar));
    }

    private /* synthetic */ C3229e(int i, int i2, C52707g gVar) {
        this(R.layout.ald);
    }
}
