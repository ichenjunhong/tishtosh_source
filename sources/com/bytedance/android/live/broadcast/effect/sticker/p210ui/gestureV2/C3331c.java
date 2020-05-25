package com.bytedance.android.live.broadcast.effect.sticker.p210ui.gestureV2;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.effect.C3203b;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.c */
public final class C3331c extends C1322a<C3333b> {

    /* renamed from: e */
    public static final C3332a f9573e = new C3332a(null);

    /* renamed from: a */
    List<? extends EffectCategoryResponse> f9574a;

    /* renamed from: b */
    public int f9575b;

    /* renamed from: c */
    public C3334c f9576c;

    /* renamed from: d */
    public boolean f9577d = true;

    /* renamed from: f */
    private final HashMap<String, Boolean> f9578f = new HashMap<>();

    /* renamed from: g */
    private final Context f9579g;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.c$a */
    public static final class C3332a {
        private C3332a() {
        }

        public /* synthetic */ C3332a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.c$b */
    public final class C3333b extends C1352v {

        /* renamed from: a */
        public final ImageView f9580a;

        /* renamed from: b */
        public final View f9581b;

        /* renamed from: c */
        public final View f9582c;

        /* renamed from: d */
        public final View f9583d;

        /* renamed from: e */
        public final View f9584e;

        /* renamed from: f */
        final /* synthetic */ C3331c f9585f;

        public C3333b(C3331c cVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f9585f = cVar;
            super(view);
            View findViewById = view.findViewById(R.id.aqa);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.icon)");
            this.f9580a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.iz);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.background)");
            this.f9581b = findViewById2;
            View findViewById3 = view.findViewById(R.id.eup);
            C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.select_view)");
            this.f9582c = findViewById3;
            View findViewById4 = view.findViewById(R.id.bas);
            C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.line)");
            this.f9583d = findViewById4;
            View findViewById5 = view.findViewById(R.id.caq);
            C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.red_point)");
            this.f9584e = findViewById5;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.c$c */
    public interface C3334c {
        /* renamed from: a */
        void mo8701a(int i);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.c$d */
    static final class C3335d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3331c f9586a;

        /* renamed from: b */
        final /* synthetic */ C3333b f9587b;

        C3335d(C3331c cVar, C3333b bVar) {
            this.f9586a = cVar;
            this.f9587b = bVar;
        }

        public final void onClick(View view) {
            if (this.f9586a.f9577d && this.f9586a.f9575b != this.f9587b.getAdapterPosition()) {
                this.f9586a.notifyItemChanged(this.f9586a.f9575b);
                this.f9586a.f9575b = this.f9587b.getAdapterPosition();
                this.f9586a.notifyItemChanged(this.f9586a.f9575b);
                C3334c cVar = this.f9586a.f9576c;
                if (cVar != null) {
                    cVar.mo8701a(this.f9586a.f9575b);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.c$e */
    public static final class C3336e implements C48710o {

        /* renamed from: a */
        final /* synthetic */ C3331c f9588a;

        /* renamed from: b */
        final /* synthetic */ C3333b f9589b;

        /* renamed from: c */
        final /* synthetic */ EffectCategoryResponse f9590c;

        /* renamed from: d */
        final /* synthetic */ int f9591d;

        /* renamed from: a */
        public final void mo8641a() {
            this.f9589b.f9584e.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo8642b() {
            this.f9588a.mo8709a(this.f9589b, this.f9590c, this.f9591d + 1);
        }

        C3336e(C3331c cVar, C3333b bVar, EffectCategoryResponse effectCategoryResponse, int i) {
            this.f9588a = cVar;
            this.f9589b = bVar;
            this.f9590c = effectCategoryResponse;
            this.f9591d = i;
        }
    }

    public final int getItemCount() {
        List<? extends EffectCategoryResponse> list = this.f9574a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C3331c(Context context) {
        this.f9579g = context;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f9579g).inflate(R.layout.bwt, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C3333b(this, inflate);
    }

    /* renamed from: a */
    private static void m9074a(Effect effect, C48710o oVar) {
        if (C9414h.m18630a(effect.getTags()) || !effect.getTags().contains("new")) {
            oVar.mo8642b();
            return;
        }
        C3203b b = C3395f.m9156f().mo8741b();
        C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
        b.mo8551a().mo8645a(effect.getId(), effect.getTagsUpdatedAt(), oVar);
    }

    /* renamed from: a */
    public final void mo8710a(boolean z, int i) {
        int i2;
        List<? extends EffectCategoryResponse> list = this.f9574a;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = -1;
        }
        if (i2 >= i) {
            List<? extends EffectCategoryResponse> list2 = this.f9574a;
            if (list2 != null) {
                EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) list2.get(i);
                if (effectCategoryResponse != null) {
                    String id = effectCategoryResponse.getId();
                    if (id != null) {
                        this.f9578f.put(id, Boolean.valueOf(z));
                        notifyItemChanged(i);
                    }
                }
            }
        }
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C3333b bVar = (C3333b) vVar;
        C52711k.m112240b(bVar, "holder");
        if (this.f9575b == i) {
            bVar.f9581b.setVisibility(0);
        } else {
            bVar.f9581b.setVisibility(4);
        }
        if (i == this.f9575b || i + 1 == this.f9575b) {
            bVar.f9583d.setVisibility(8);
        } else {
            bVar.f9583d.setVisibility(0);
        }
        List<? extends EffectCategoryResponse> list = this.f9574a;
        if (list != null) {
            EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) list.get(i);
            if (effectCategoryResponse != null) {
                ImageModel imageModel = new ImageModel();
                ArrayList arrayList = new ArrayList();
                if (this.f9575b == i) {
                    if (!C9431p.m18664a(effectCategoryResponse.getIcon_selected_url())) {
                        arrayList.add(effectCategoryResponse.getIcon_selected_url());
                    }
                } else if (!C9431p.m18664a(effectCategoryResponse.getIcon_normal_url())) {
                    arrayList.add(effectCategoryResponse.getIcon_normal_url());
                }
                List list2 = arrayList;
                if (C9414h.m18630a(list2)) {
                    bVar.f9580a.setImageResource(R.drawable.btz);
                } else {
                    imageModel.setUrls(list2);
                    C5213c.m11814a(bVar.f9580a, imageModel);
                }
                if (!this.f9578f.containsKey(effectCategoryResponse.getId()) || !C52711k.m112239a((Object) (Boolean) this.f9578f.get(effectCategoryResponse.getId()), (Object) Boolean.valueOf(true))) {
                    bVar.f9582c.setVisibility(8);
                } else {
                    bVar.f9582c.setVisibility(0);
                }
                if (this.f9575b != i) {
                    bVar.f9582c.setAlpha(0.4f);
                } else {
                    bVar.f9582c.setAlpha(1.0f);
                }
                bVar.f9584e.setVisibility(8);
                mo8709a(bVar, effectCategoryResponse, 0);
                bVar.itemView.setOnClickListener(new C3335d(this, bVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo8709a(C3333b bVar, EffectCategoryResponse effectCategoryResponse, int i) {
        if (i >= effectCategoryResponse.getTotalEffects().size() || i == 30) {
            bVar.f9584e.setVisibility(8);
            return;
        }
        Object obj = effectCategoryResponse.getTotalEffects().get(i);
        C52711k.m112236a(obj, "response.totalEffects[i]");
        m9074a((Effect) obj, (C48710o) new C3336e(this, bVar, effectCategoryResponse, i));
    }
}
