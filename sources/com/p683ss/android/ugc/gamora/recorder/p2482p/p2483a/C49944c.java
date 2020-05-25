package com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a;

import android.app.Activity;
import android.content.Context;
import android.support.p043v7.p051e.C1208c;
import android.support.p043v7.p051e.C1208c.C1211b;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10661a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.aweme.shortvideo.C43844fm;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43259k;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43259k.C43260a;
import com.p683ss.android.ugc.gamora.recorder.p2482p.C49940a;
import com.p683ss.android.ugc.gamora.recorder.p2482p.C49971b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.p.a.c */
public final class C49944c extends C1322a<C1352v> {

    /* renamed from: b */
    public static final C49945a f125129b = new C49945a(null);

    /* renamed from: a */
    public final List<C49971b> f125130a = new ArrayList();

    /* renamed from: c */
    private boolean f125131c = true;

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.c$a */
    public static final class C49945a {
        private C49945a() {
        }

        public /* synthetic */ C49945a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.c$b */
    final class C49946b extends C1352v {

        /* renamed from: a */
        final /* synthetic */ C49944c f125132a;

        public C49946b(C49944c cVar, final View view) {
            C52711k.m112240b(view, "itemView");
            this.f125132a = cVar;
            super(view);
            if (!C43844fm.m96281a(view.getContext())) {
                View findViewById = view.findViewById(R.id.daj);
                C52711k.m112236a((Object) findViewById, "itemView.findViewById<View>(R.id.tv_icon_desc)");
                findViewById.setVisibility(8);
            } else {
                View findViewById2 = view.findViewById(R.id.daj);
                if (findViewById2 != null) {
                    ((TextView) findViewById2).setText(R.string.b2m);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.TextView");
                }
            }
            View findViewById3 = view.findViewById(R.id.b1k);
            if (findViewById3 != null) {
                ((ImageView) findViewById3).setImageResource(R.drawable.ak7);
                view.findViewById(R.id.d1z).setOnClickListener(new OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C49946b f125133a;

                    {
                        this.f125133a = r1;
                    }

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        int adapterPosition = this.f125133a.getAdapterPosition();
                        if (adapterPosition != -1) {
                            C49971b bVar = (C49971b) this.f125133a.f125132a.f125130a.get(adapterPosition);
                            C49940a aVar = bVar.f125192e;
                            if (aVar != null) {
                                aVar.mo50181a(view, bVar);
                            }
                        }
                    }
                });
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.ImageView");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.c$c */
    public final class C49948c extends C1352v {

        /* renamed from: a */
        public SmartImageView f125135a;

        /* renamed from: b */
        public TextView f125136b;

        /* renamed from: c */
        final /* synthetic */ C49944c f125137c;

        public C49948c(C49944c cVar, final View view) {
            C52711k.m112240b(view, "itemView");
            this.f125137c = cVar;
            super(view);
            View findViewById = view.findViewById(R.id.b1k);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.iv_icon)");
            this.f125135a = (SmartImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.daj);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.tv_icon_desc)");
            this.f125136b = (TextView) findViewById2;
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C49948c f125138a;

                {
                    this.f125138a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    int adapterPosition = this.f125138a.getAdapterPosition();
                    if (adapterPosition != -1) {
                        C49971b bVar = (C49971b) this.f125138a.f125137c.f125130a.get(adapterPosition);
                        C49940a aVar = bVar.f125192e;
                        if (bVar.f125191d) {
                            if (bVar.f125196i != null) {
                                bVar.f125196i.mo50183a(this.f125138a.f125135a);
                            }
                            if (aVar != null) {
                                aVar.mo50181a(view, bVar);
                                if (bVar.f125194g) {
                                    this.f125138a.f125135a.setImageResource(bVar.f125189b);
                                    bVar.mo97765a();
                                }
                            }
                        } else if (aVar != null) {
                            aVar.mo50182a(bVar);
                        }
                    }
                }
            });
        }
    }

    public final int getItemCount() {
        return this.f125130a.size();
    }

    public C49944c(List<? extends C49971b> list) {
        C52711k.m112240b(list, "models");
        this.f125130a.addAll(list);
    }

    public final int getItemViewType(int i) {
        if (((C49971b) this.f125130a.get(i)).f125188a == 3) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo97753a(List<? extends C49971b> list) {
        C52711k.m112240b(list, "models");
        ArrayList arrayList = new ArrayList(this.f125130a);
        this.f125130a.clear();
        this.f125130a.addAll(list);
        C1211b a = C1208c.m3655a(new C49950d(arrayList, this.f125130a), true);
        C52711k.m112236a((Object) a, "DiffUtil.calculateDiff(R…Items, itemModels), true)");
        a.mo3931a((C1322a) this);
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fw, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…ar_filter, parent, false)");
            return new C49946b(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zc, viewGroup, false);
        C52711k.m112236a((Object) inflate2, "LayoutInflater.from(pare…mall_icon, parent, false)");
        return new C49948c(this, inflate2);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        float f;
        C52711k.m112240b(vVar, "holder");
        if (getItemViewType(i) == 0) {
            C49971b bVar = (C49971b) this.f125130a.get(i);
            C49948c cVar = (C49948c) vVar;
            SmartImageView smartImageView = cVar.f125135a;
            if (bVar.f125190c != null) {
                C12203q.m24645a((Object) bVar.f125190c).mo23110a(bVar.f125189b).mo23116a((C12197k) smartImageView).mo23121a();
            } else {
                smartImageView.setImageResource(bVar.f125189b);
            }
            if (bVar.f125191d) {
                i2 = NormalGiftView.ALPHA_255;
            } else {
                i2 = 127;
            }
            smartImageView.setImageAlpha(i2);
            TextView textView = cVar.f125136b;
            View view = vVar.itemView;
            C52711k.m112236a((Object) view, "holder.itemView");
            if (bVar.f125191d) {
                f = 1.0f;
            } else {
                f = 0.49803922f;
            }
            textView.setAlpha(f);
            if (bVar.f125195h <= 0) {
                textView.setVisibility(8);
                view.setContentDescription(null);
            } else {
                textView.setVisibility(0);
                textView.setText(bVar.f125195h);
                view.setContentDescription(view.getContext().getText(bVar.f125195h));
            }
            if (bVar.f125193f && bVar.f125196i != null) {
                bVar.f125196i.mo50183a(smartImageView);
            }
            if (bVar.f125188a == 6 && this.f125131c) {
                Context context = smartImageView.getContext();
                C52711k.m112236a((Object) context, "icon.context");
                Activity a = C18998a.m46169a(context);
                if (a != null) {
                    this.f125131c = false;
                    View view2 = smartImageView;
                    C52711k.m112240b(view2, "anchor");
                    C52711k.m112240b(a, "activity");
                    int a2 = C43259k.f109389a.mo48699a("duet_layout_tool_bar_bubble_hint", 0);
                    if (a2 < 3 && view2.getParent() != null && !a.isFinishing()) {
                        view2.postDelayed(new C43260a(a, view2, new C10661a(a).mo19015b((int) R.string.ga4).mo19010a(5000).mo19014a(), a2), 500);
                    }
                }
            }
        }
    }
}
