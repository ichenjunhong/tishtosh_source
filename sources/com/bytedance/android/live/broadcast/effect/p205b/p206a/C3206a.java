package com.bytedance.android.live.broadcast.effect.p205b.p206a;

import android.graphics.Color;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.C2978h;
import com.bytedance.android.live.broadcast.effect.C3203b;
import com.bytedance.android.live.broadcast.effect.C3366v.C3368b;
import com.bytedance.android.live.broadcast.effect.p205b.p206a.C3229e.C3231b;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.effect.b.a.a */
public final class C3206a extends C1322a<C3207a> {

    /* renamed from: a */
    public List<? extends C8688c> f9286a;

    /* renamed from: b */
    public int f9287b;

    /* renamed from: c */
    public C3208b f9288c;

    /* renamed from: d */
    public SparseArray<Boolean> f9289d;

    /* renamed from: e */
    public SparseArray<Integer> f9290e;

    /* renamed from: f */
    private final String f9291f;

    /* renamed from: g */
    private final C3209c f9292g;

    /* renamed from: h */
    private final int f9293h;

    /* renamed from: i */
    private final int f9294i;

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.a$a */
    public final class C3207a extends C1352v {

        /* renamed from: a */
        public C3229e f9295a;

        /* renamed from: b */
        final /* synthetic */ C3206a f9296b;

        public C3207a(C3206a aVar, View view) {
            C52711k.m112240b(view, "view");
            this.f9296b = aVar;
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.a$b */
    public interface C3208b {
        /* renamed from: a */
        void mo8556a(C8688c cVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.a$c */
    public static final class C3209c implements C3368b {

        /* renamed from: a */
        final /* synthetic */ C3206a f9297a;

        C3209c(C3206a aVar) {
            this.f9297a = aVar;
        }

        /* renamed from: a */
        public final void mo8557a(C8688c cVar) {
            C52711k.m112240b(cVar, "sticker");
            this.f9297a.notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.a$d */
    public static final class C3210d implements C3231b {

        /* renamed from: a */
        final /* synthetic */ C3206a f9298a;

        /* renamed from: b */
        final /* synthetic */ int f9299b;

        /* renamed from: a */
        public final void mo8558a(C8688c cVar) {
            C52711k.m112240b(cVar, "sticker");
            C3208b bVar = this.f9298a.f9288c;
            if (bVar != null) {
                bVar.mo8556a(cVar);
            }
            this.f9298a.f9290e.put(this.f9299b, Integer.valueOf(((C8688c) this.f9298a.f9286a.get(this.f9299b)).f23750k.indexOf(cVar)));
        }

        C3210d(C3206a aVar, int i) {
            this.f9298a = aVar;
            this.f9299b = i;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.a$e */
    static final class C3211e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3206a f9300a;

        /* renamed from: b */
        final /* synthetic */ int f9301b;

        /* renamed from: c */
        final /* synthetic */ C3207a f9302c;

        C3211e(C3206a aVar, int i, C3207a aVar2) {
            this.f9300a = aVar;
            this.f9301b = i;
            this.f9302c = aVar2;
        }

        public final void onClick(View view) {
            this.f9300a.f9289d.put(this.f9301b, Boolean.valueOf(false));
            View view2 = this.f9302c.itemView;
            C52711k.m112236a((Object) view2, "viewHolder.itemView");
            View findViewById = view2.findViewById(R.id.acw);
            C52711k.m112236a((Object) findViewById, "viewHolder.itemView.expanded_layout");
            findViewById.setVisibility(8);
            View view3 = this.f9302c.itemView;
            C52711k.m112236a((Object) view3, "viewHolder.itemView");
            View findViewById2 = view3.findViewById(R.id.ahz);
            C52711k.m112236a((Object) findViewById2, "viewHolder.itemView.fold_layout");
            findViewById2.setVisibility(0);
            C3208b bVar = this.f9300a.f9288c;
            if (bVar != null) {
                bVar.mo8556a((C8688c) this.f9300a.f9286a.get(this.f9301b));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.b.a.a$f */
    static final class C3212f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3206a f9303a;

        /* renamed from: b */
        final /* synthetic */ C3207a f9304b;

        /* renamed from: c */
        final /* synthetic */ boolean f9305c;

        C3212f(C3206a aVar, C3207a aVar2, boolean z) {
            this.f9303a = aVar;
            this.f9304b = aVar2;
            this.f9305c = z;
        }

        public final void onClick(View view) {
            int adapterPosition = this.f9304b.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < this.f9303a.f9286a.size()) {
                C3203b b = C3395f.m9156f().mo8741b();
                C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
                if (b.mo8551a().mo8282a((C8688c) this.f9303a.f9286a.get(adapterPosition)) || this.f9305c) {
                    this.f9303a.f9287b = adapterPosition;
                    if (this.f9305c) {
                        this.f9303a.f9289d.put(adapterPosition, Boolean.valueOf(true));
                        C3208b bVar = this.f9303a.f9288c;
                        if (bVar != null) {
                            Object obj = ((C8688c) this.f9303a.f9286a.get(adapterPosition)).f23750k.get(0);
                            C52711k.m112236a(obj, "stickerList[index].subStickers[0]");
                            bVar.mo8556a((C8688c) obj);
                        }
                    } else {
                        C3208b bVar2 = this.f9303a.f9288c;
                        if (bVar2 != null) {
                            bVar2.mo8556a((C8688c) this.f9303a.f9286a.get(this.f9303a.f9287b));
                        }
                    }
                    this.f9303a.notifyDataSetChanged();
                }
            }
        }
    }

    public C3206a() {
        this(0, 0, 3, null);
    }

    public final int getItemCount() {
        return this.f9286a.size();
    }

    public C3206a(int i, int i2) {
        this.f9293h = i;
        this.f9294i = i2;
        this.f9291f = "LiveSmallItemBeautyAdapter";
        this.f9286a = new ArrayList();
        this.f9289d = new SparseArray<>();
        this.f9290e = new SparseArray<>();
        this.f9292g = new C3209c(this);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "view");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f9293h, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(view…temLayoutId, view, false)");
        return new C3207a(this, inflate);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C3207a aVar = (C3207a) vVar;
        C52711k.m112240b(aVar, "viewHolder");
        if (this.f9287b == i) {
            View view = aVar.itemView;
            C52711k.m112236a((Object) view, "viewHolder.itemView");
            View findViewById = view.findViewById(R.id.ahz);
            C52711k.m112236a((Object) findViewById, "viewHolder.itemView.fold_layout");
            View findViewById2 = findViewById.findViewById(R.id.li);
            C52711k.m112236a((Object) findViewById2, "viewHolder.itemView.fold_layout.border");
            findViewById2.setVisibility(0);
            View view2 = aVar.itemView;
            C52711k.m112236a((Object) view2, "viewHolder.itemView");
            View findViewById3 = view2.findViewById(R.id.ahz);
            C52711k.m112236a((Object) findViewById3, "viewHolder.itemView.fold_layout");
            ((TextView) findViewById3.findViewById(R.id.dcn)).setTextColor(Color.parseColor("#ffc95c"));
        } else {
            View view3 = aVar.itemView;
            C52711k.m112236a((Object) view3, "viewHolder.itemView");
            View findViewById4 = view3.findViewById(R.id.acw);
            C52711k.m112236a((Object) findViewById4, "viewHolder.itemView.expanded_layout");
            findViewById4.setVisibility(8);
            View view4 = aVar.itemView;
            C52711k.m112236a((Object) view4, "viewHolder.itemView");
            View findViewById5 = view4.findViewById(R.id.ahz);
            C52711k.m112236a((Object) findViewById5, "viewHolder.itemView.fold_layout");
            findViewById5.setVisibility(0);
            this.f9289d.put(i, Boolean.valueOf(false));
            View view5 = aVar.itemView;
            C52711k.m112236a((Object) view5, "viewHolder.itemView");
            View findViewById6 = view5.findViewById(R.id.ahz);
            C52711k.m112236a((Object) findViewById6, "viewHolder.itemView.fold_layout");
            View findViewById7 = findViewById6.findViewById(R.id.li);
            C52711k.m112236a((Object) findViewById7, "viewHolder.itemView.fold_layout.border");
            findViewById7.setVisibility(4);
            View view6 = aVar.itemView;
            C52711k.m112236a((Object) view6, "viewHolder.itemView");
            View findViewById8 = view6.findViewById(R.id.ahz);
            C52711k.m112236a((Object) findViewById8, "viewHolder.itemView.fold_layout");
            ((TextView) findViewById8.findViewById(R.id.dcn)).setTextColor(Color.parseColor("#ffffffff"));
        }
        View view7 = aVar.itemView;
        C52711k.m112236a((Object) view7, "viewHolder.itemView");
        View findViewById9 = view7.findViewById(R.id.ahz);
        C52711k.m112236a((Object) findViewById9, "viewHolder.itemView.fold_layout");
        HSImageView hSImageView = (HSImageView) findViewById9.findViewById(R.id.ayg);
        C2978h hVar = ((C8688c) this.f9286a.get(i)).f23740a;
        C52711k.m112236a((Object) hVar, "stickerList[index].icon");
        String str = hVar.f8729a;
        C2978h hVar2 = ((C8688c) this.f9286a.get(i)).f23740a;
        C52711k.m112236a((Object) hVar2, "stickerList[index].icon");
        C5213c.m11824b(hSImageView, C3287f.m9008a(str, hVar2.f8730b));
        View view8 = aVar.itemView;
        C52711k.m112236a((Object) view8, "viewHolder.itemView");
        View findViewById10 = view8.findViewById(R.id.ahz);
        C52711k.m112236a((Object) findViewById10, "viewHolder.itemView.fold_layout");
        TextView textView = (TextView) findViewById10.findViewById(R.id.dcn);
        C52711k.m112236a((Object) textView, "viewHolder.itemView.fold_layout.tv_name");
        textView.setText(((C8688c) this.f9286a.get(i)).f23745f);
        Effect effect = ((C8688c) this.f9286a.get(i)).f23752m;
        boolean z = true;
        if (effect == null || effect.getEffectType() != 1 || C9376b.m18558a((Collection<T>) ((C8688c) this.f9286a.get(i)).f23750k)) {
            z = false;
        }
        C3203b b = C3395f.m9156f().mo8741b();
        C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
        if (b.mo8551a().mo8282a((C8688c) this.f9286a.get(i)) || z) {
            View view9 = aVar.itemView;
            C52711k.m112236a((Object) view9, "viewHolder.itemView");
            ImageView imageView = (ImageView) view9.findViewById(R.id.b25);
            C52711k.m112236a((Object) imageView, "viewHolder.itemView.iv_loading");
            imageView.setVisibility(8);
        } else {
            View view10 = aVar.itemView;
            C52711k.m112236a((Object) view10, "viewHolder.itemView");
            ImageView imageView2 = (ImageView) view10.findViewById(R.id.b25);
            C52711k.m112236a((Object) imageView2, "viewHolder.itemView.iv_loading");
            imageView2.setVisibility(0);
            C3203b b2 = C3395f.m9156f().mo8741b();
            C52711k.m112236a((Object) b2, "LiveInternalService.inst().liveEffectService()");
            b2.mo8553b().mo8736a((C8688c) this.f9286a.get(i), true, null);
        }
        if (z) {
            Object obj = this.f9289d.get(i, Boolean.valueOf(false));
            C52711k.m112236a(obj, "itemStates.get(index, false)");
            if (((Boolean) obj).booleanValue()) {
                View view11 = aVar.itemView;
                C52711k.m112236a((Object) view11, "viewHolder.itemView");
                View findViewById11 = view11.findViewById(R.id.acw);
                C52711k.m112236a((Object) findViewById11, "viewHolder.itemView.expanded_layout");
                findViewById11.setVisibility(0);
                View view12 = aVar.itemView;
                C52711k.m112236a((Object) view12, "viewHolder.itemView");
                View findViewById12 = view12.findViewById(R.id.ahz);
                C52711k.m112236a((Object) findViewById12, "viewHolder.itemView.fold_layout");
                findViewById12.setVisibility(8);
                aVar.f9295a = new C3229e(this.f9294i);
                View view13 = aVar.itemView;
                C52711k.m112236a((Object) view13, "viewHolder.itemView");
                RecyclerView recyclerView = (RecyclerView) view13.findViewById(R.id.cun);
                C52711k.m112236a((Object) recyclerView, "viewHolder.itemView.sub_beauty_list");
                View view14 = aVar.itemView;
                C52711k.m112236a((Object) view14, "viewHolder.itemView");
                recyclerView.setLayoutManager(new LinearLayoutManager(view14.getContext(), 0, false));
                View view15 = aVar.itemView;
                C52711k.m112236a((Object) view15, "viewHolder.itemView");
                RecyclerView recyclerView2 = (RecyclerView) view15.findViewById(R.id.cun);
                C52711k.m112236a((Object) recyclerView2, "viewHolder.itemView.sub_beauty_list");
                recyclerView2.setAdapter(aVar.f9295a);
                Integer num = (Integer) this.f9290e.get(i, Integer.valueOf(-1));
                Integer a = C3395f.m9156f().mo8740a().mo8259a(((C8688c) this.f9286a.get(i)).f23752m);
                if (a != null && C52711k.m112230a(a.intValue(), 0) > 0) {
                    num = a;
                }
                if (C52711k.m112230a(num.intValue(), 0) >= 0) {
                    C3229e eVar = aVar.f9295a;
                    if (eVar != null) {
                        C52711k.m112236a((Object) num, "subIndex");
                        eVar.f9337b = num.intValue();
                    }
                }
                C3229e eVar2 = aVar.f9295a;
                if (eVar2 != null) {
                    List<C8688c> list = ((C8688c) this.f9286a.get(i)).f23750k;
                    C52711k.m112236a((Object) list, "stickerList[index].subStickers");
                    C52711k.m112240b(list, "list");
                    eVar2.f9336a = list;
                    eVar2.notifyDataSetChanged();
                }
                C3229e eVar3 = aVar.f9295a;
                if (eVar3 != null) {
                    C3231b dVar = new C3210d(this, i);
                    C52711k.m112240b(dVar, "listener");
                    eVar3.f9338c = dVar;
                }
                View view16 = aVar.itemView;
                C52711k.m112236a((Object) view16, "viewHolder.itemView");
                View findViewById13 = view16.findViewById(R.id.acw);
                C52711k.m112236a((Object) findViewById13, "viewHolder.itemView.expanded_layout");
                TextView textView2 = (TextView) findViewById13.findViewById(R.id.cuo);
                C52711k.m112236a((Object) textView2, "viewHolder.itemView.expa…d_layout.sub_beauty_title");
                textView2.setText(((C8688c) this.f9286a.get(i)).f23745f);
                View view17 = aVar.itemView;
                C52711k.m112236a((Object) view17, "viewHolder.itemView");
                View findViewById14 = view17.findViewById(R.id.acw);
                C52711k.m112236a((Object) findViewById14, "viewHolder.itemView.expanded_layout");
                ((ImageView) findViewById14.findViewById(R.id.cum)).setOnClickListener(new C3211e(this, i, aVar));
                if (C52711k.m112230a(num.intValue(), 0) > 0) {
                    C3208b bVar = this.f9288c;
                    if (bVar != null) {
                        List<C8688c> list2 = ((C8688c) this.f9286a.get(i)).f23750k;
                        C52711k.m112236a((Object) num, "subIndex");
                        Object obj2 = list2.get(num.intValue());
                        C52711k.m112236a(obj2, "stickerList[index].subStickers[subIndex]");
                        bVar.mo8556a((C8688c) obj2);
                    }
                } else {
                    C3208b bVar2 = this.f9288c;
                    if (bVar2 != null) {
                        Object obj3 = ((C8688c) this.f9286a.get(i)).f23750k.get(0);
                        C52711k.m112236a(obj3, "stickerList[index].subStickers[0]");
                        bVar2.mo8556a((C8688c) obj3);
                    }
                }
                aVar.itemView.setOnClickListener(new C3212f(this, aVar, z));
            }
        }
        View view18 = aVar.itemView;
        C52711k.m112236a((Object) view18, "viewHolder.itemView");
        View findViewById15 = view18.findViewById(R.id.acw);
        C52711k.m112236a((Object) findViewById15, "viewHolder.itemView.expanded_layout");
        findViewById15.setVisibility(8);
        View view19 = aVar.itemView;
        C52711k.m112236a((Object) view19, "viewHolder.itemView");
        View findViewById16 = view19.findViewById(R.id.ahz);
        C52711k.m112236a((Object) findViewById16, "viewHolder.itemView.fold_layout");
        findViewById16.setVisibility(0);
        aVar.itemView.setOnClickListener(new C3212f(this, aVar, z));
    }

    private /* synthetic */ C3206a(int i, int i2, int i3, C52707g gVar) {
        this(R.layout.alj, R.layout.ald);
    }
}
