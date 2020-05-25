package com.p683ss.android.ugc.gamora.recorder.p2481o;

import android.content.Context;
import android.net.Uri;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.List;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.o.c */
public final class C49917c extends C1322a<C1352v> {

    /* renamed from: f */
    public static final C49918a f125078f = new C49918a(null);

    /* renamed from: a */
    public C49919b f125079a;

    /* renamed from: b */
    public OnClickListener f125080b;

    /* renamed from: c */
    Animation f125081c;

    /* renamed from: d */
    public int f125082d;

    /* renamed from: e */
    public final List<C49923d> f125083e;

    /* renamed from: g */
    private boolean f125084g;

    /* renamed from: h */
    private C52847n<C49920c, Integer> f125085h;

    /* renamed from: i */
    private final boolean f125086i;

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.c$a */
    public static final class C49918a {
        private C49918a() {
        }

        public /* synthetic */ C49918a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.c$b */
    public interface C49919b {
        /* renamed from: a */
        void mo97340a(C49923d dVar, int i);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.c$c */
    public static final class C49920c extends C1352v {

        /* renamed from: a */
        public final SimpleDraweeView f125087a;

        /* renamed from: b */
        public final View f125088b;

        public C49920c(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.aro);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.img)");
            this.f125087a = (SimpleDraweeView) findViewById;
            View findViewById2 = view.findViewById(R.id.b25);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.iv_loading)");
            this.f125088b = findViewById2;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.c$d */
    public static final class C49921d extends C1352v {
        public C49921d(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.o.c$e */
    static final class C49922e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49919b f125089a;

        /* renamed from: b */
        final /* synthetic */ C49917c f125090b;

        /* renamed from: c */
        final /* synthetic */ C49920c f125091c;

        /* renamed from: d */
        final /* synthetic */ int f125092d;

        /* renamed from: e */
        final /* synthetic */ int f125093e;

        C49922e(C49919b bVar, C49917c cVar, C49920c cVar2, int i, int i2) {
            this.f125089a = bVar;
            this.f125090b = cVar;
            this.f125091c = cVar2;
            this.f125092d = i;
            this.f125093e = i2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f125090b.f125082d != this.f125092d) {
                this.f125091c.f125088b.setVisibility(0);
                View view2 = this.f125091c.f125088b;
                C49917c cVar = this.f125090b;
                View view3 = this.f125091c.itemView;
                C52711k.m112236a((Object) view3, "holder.itemView");
                Context context = view3.getContext();
                C52711k.m112236a((Object) context, "holder.itemView.context");
                if (cVar.f125081c == null) {
                    cVar.f125081c = AnimationUtils.loadAnimation(context, R.anim.fu);
                }
                Animation animation = cVar.f125081c;
                if (animation == null) {
                    C52711k.m112234a();
                }
                view2.startAnimation(animation);
                this.f125090b.mo97725a(this.f125092d);
                this.f125089a.mo97340a((C49923d) this.f125090b.f125083e.get(this.f125093e), this.f125092d);
            }
        }
    }

    /* renamed from: b */
    public final void mo97726b() {
        if (this.f125082d >= 0) {
            this.f125082d = -1;
            C52847n<C49920c, Integer> nVar = this.f125085h;
            if (nVar != null) {
                onBindViewHolder((C1352v) nVar.getFirst(), ((Number) nVar.getSecond()).intValue());
            }
        }
    }

    public final int getItemCount() {
        if (this.f125086i) {
            return this.f125083e.size() + 1;
        }
        return this.f125083e.size();
    }

    /* renamed from: a */
    public final void mo97724a() {
        this.f125084g = false;
        if (this.f125082d >= 0) {
            C52847n<C49920c, Integer> nVar = this.f125085h;
            if (nVar != null) {
                C49920c cVar = (C49920c) nVar.getFirst();
                if (cVar != null) {
                    View view = cVar.f125088b;
                    if (view != null) {
                        view.clearAnimation();
                    }
                }
            }
            C52847n<C49920c, Integer> nVar2 = this.f125085h;
            if (nVar2 != null) {
                C49920c cVar2 = (C49920c) nVar2.getFirst();
                if (cVar2 != null) {
                    View view2 = cVar2.f125088b;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                }
            }
        }
    }

    public final int getItemViewType(int i) {
        if (!this.f125086i || i != 0) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo97725a(int i) {
        if (this.f125082d != i && i >= 0) {
            int i2 = this.f125082d;
            this.f125082d = i;
            if (i2 >= 0) {
                notifyItemChanged(i2);
            }
            this.f125084g = true;
            notifyItemChanged(this.f125082d);
        }
    }

    public C49917c(List<C49923d> list, boolean z) {
        C52711k.m112240b(list, "data");
        this.f125083e = list;
        this.f125086i = z;
        this.f125082d = -1;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bkh, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…lbum_more, parent, false)");
            return new C49921d(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.axv, viewGroup, false);
        C52711k.m112236a((Object) inflate2, "LayoutInflater.from(pare…ackground, parent, false)");
        return new C49920c(inflate2);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        boolean z;
        int i2;
        String str;
        C52711k.m112240b(vVar, "viewholder");
        if (!this.f125086i || i != 0) {
            C49920c cVar = (C49920c) vVar;
            if (this.f125082d == i) {
                z = true;
            } else {
                z = false;
            }
            if (cVar.f125087a.isSelected() != z) {
                cVar.f125087a.setSelected(z);
                cVar.f125087a.invalidate();
            }
            if (!z) {
                cVar.f125088b.clearAnimation();
                cVar.f125088b.setVisibility(8);
            } else {
                this.f125085h = new C52847n<>(cVar, Integer.valueOf(i));
            }
            if (this.f125086i) {
                i2 = i - 1;
            } else {
                i2 = i;
            }
            if (((C49923d) this.f125083e.get(i2)).mo97728a() == null) {
                str = Uri.fromFile(new File(((C49923d) this.f125083e.get(i2)).f125095a)).toString();
            } else {
                UrlModel a = ((C49923d) this.f125083e.get(i2)).mo97728a();
                if (a != null) {
                    List urlList = a.getUrlList();
                    if (urlList != null) {
                        str = (String) urlList.get(0);
                    }
                }
                str = null;
            }
            C50181a.m108292a(cVar.f125087a, str);
            C49919b bVar = this.f125079a;
            if (bVar != null) {
                View view = cVar.itemView;
                C49922e eVar = new C49922e(bVar, this, cVar, i, i2);
                view.setOnClickListener(eVar);
                return;
            }
            return;
        }
        OnClickListener onClickListener = this.f125080b;
        if (onClickListener != null) {
            vVar.itemView.setOnClickListener(onClickListener);
        }
    }

    public /* synthetic */ C49917c(List list, boolean z, int i, C52707g gVar) {
        this(list, false);
    }
}
