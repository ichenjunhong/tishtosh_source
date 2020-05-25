package com.bytedance.android.live.broadcast.effect.sticker.p210ui.gestureV2;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3044a;
import com.bytedance.android.live.broadcast.effect.C3203b;
import com.bytedance.android.live.broadcast.effect.sticker.p209a.C3277a;
import com.bytedance.android.live.broadcast.effect.sticker.p209a.C3279b;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.b */
public final class C3323b extends C1322a<C3325b> implements C3044a {

    /* renamed from: h */
    public static final C3324a f9552h = new C3324a(null);

    /* renamed from: a */
    public final C3277a f9553a;

    /* renamed from: b */
    public C3326c f9554b;

    /* renamed from: c */
    public C8688c f9555c;

    /* renamed from: d */
    public final List<C8688c> f9556d;

    /* renamed from: e */
    EffectCategoryResponse f9557e;

    /* renamed from: f */
    public C8688c f9558f;

    /* renamed from: g */
    public boolean f9559g = true;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.b$a */
    public static final class C3324a {
        private C3324a() {
        }

        public /* synthetic */ C3324a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.b$b */
    public final class C3325b extends C1352v {

        /* renamed from: a */
        public final ImageView f9560a;

        /* renamed from: b */
        public final View f9561b;

        /* renamed from: c */
        public final View f9562c;

        /* renamed from: d */
        public final ProgressBar f9563d;

        /* renamed from: e */
        public final View f9564e;

        /* renamed from: f */
        final /* synthetic */ C3323b f9565f;

        public C3325b(C3323b bVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f9565f = bVar;
            super(view);
            View findViewById = view.findViewById(R.id.ar5);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.image)");
            this.f9560a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.iz);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.background)");
            this.f9561b = findViewById2;
            View findViewById3 = view.findViewById(R.id.a7x);
            C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.download_icon)");
            this.f9562c = findViewById3;
            View findViewById4 = view.findViewById(R.id.bh6);
            C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.loading)");
            this.f9563d = (ProgressBar) findViewById4;
            View findViewById5 = view.findViewById(R.id.caq);
            C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.red_point)");
            this.f9564e = findViewById5;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.b$c */
    public interface C3326c {
        /* renamed from: a */
        void mo8702a(boolean z, C8688c cVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.b$d */
    public static final class C3327d implements C48710o {

        /* renamed from: a */
        final /* synthetic */ C3325b f9566a;

        /* renamed from: a */
        public final void mo8641a() {
            this.f9566a.f9564e.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo8642b() {
            this.f9566a.f9564e.setVisibility(8);
        }

        C3327d(C3325b bVar) {
            this.f9566a = bVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.b$e */
    static final class C3328e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3323b f9567a;

        /* renamed from: b */
        final /* synthetic */ C3325b f9568b;

        /* renamed from: c */
        final /* synthetic */ C8688c f9569c;

        C3328e(C3323b bVar, C3325b bVar2, C8688c cVar) {
            this.f9567a = bVar;
            this.f9568b = bVar2;
            this.f9569c = cVar;
        }

        public final void onClick(View view) {
            if (this.f9567a.f9559g) {
                final C8688c cVar = (C8688c) this.f9567a.f9556d.get(this.f9568b.getAdapterPosition());
                this.f9567a.f9553a.mo8646a(cVar.f23756q, this.f9569c.f23754o, (C48715t) new C48715t(this) {

                    /* renamed from: a */
                    final /* synthetic */ C3328e f9570a;

                    {
                        this.f9570a = r1;
                    }

                    /* renamed from: a */
                    public final void mo8708a() {
                        this.f9570a.f9567a.mo8705a(cVar, (C48710o) new C48710o(this) {

                            /* renamed from: a */
                            final /* synthetic */ C33291 f9572a;

                            /* renamed from: a */
                            public final void mo8641a() {
                                this.f9572a.f9570a.f9568b.f9564e.setVisibility(0);
                            }

                            /* renamed from: b */
                            public final void mo8642b() {
                                this.f9572a.f9570a.f9568b.f9564e.setVisibility(8);
                            }

                            {
                                this.f9572a = r1;
                            }
                        });
                    }
                });
                if (C8688c.m17189a(cVar, this.f9567a.f9555c)) {
                    C3326c cVar2 = this.f9567a.f9554b;
                    if (cVar2 != null) {
                        cVar2.mo8702a(false, this.f9567a.f9555c);
                    }
                    this.f9567a.f9555c = null;
                } else if (!this.f9567a.f9553a.mo8282a(cVar)) {
                    this.f9567a.f9558f = cVar;
                    this.f9567a.f9553a.mo8281a(C3037b.f8913a, cVar, (C3044a) this.f9567a);
                } else {
                    if (!C8688c.m17189a(this.f9567a.f9555c, cVar)) {
                        C3326c cVar3 = this.f9567a.f9554b;
                        if (cVar3 != null) {
                            cVar3.mo8702a(false, this.f9567a.f9555c);
                        }
                    }
                    C8688c cVar4 = this.f9567a.f9555c;
                    this.f9567a.f9555c = cVar;
                    if (cVar4 != null && C3323b.m9061a(cVar4, this.f9567a.f9556d)) {
                        int a = C3323b.m9060a(this.f9567a.f9556d, cVar4);
                        if (a >= 0) {
                            this.f9567a.notifyItemChanged(a);
                        }
                    }
                    C3326c cVar5 = this.f9567a.f9554b;
                    if (cVar5 != null) {
                        cVar5.mo8702a(true, this.f9567a.f9555c);
                    }
                }
                this.f9567a.mo8706b(cVar);
                this.f9567a.notifyItemChanged(this.f9568b.getAdapterPosition());
            }
        }
    }

    public final int getItemCount() {
        if (C9414h.m18630a(this.f9556d)) {
            return 0;
        }
        return this.f9556d.size();
    }

    public C3323b() {
        C3203b b = C3395f.m9156f().mo8741b();
        C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
        C3279b a = b.mo8551a();
        C52711k.m112236a((Object) a, "LiveInternalService.inst…e().liveComposerPresenter");
        this.f9553a = a;
        this.f9556d = new ArrayList();
    }

    /* renamed from: b */
    public final int mo8706b(C8688c cVar) {
        int size = this.f9556d.size();
        for (int i = 0; i < size; i++) {
            if (C8688c.m17189a(cVar, (C8688c) this.f9556d.get(i))) {
                this.f9556d.set(i, cVar);
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo8704a(C8688c cVar) {
        C52711k.m112240b(cVar, "sticker");
        if (!C8688c.m17189a(this.f9555c, cVar)) {
            if (this.f9555c != null) {
                List<C8688c> list = this.f9556d;
                C8688c cVar2 = this.f9555c;
                if (cVar2 == null) {
                    C52711k.m112234a();
                }
                notifyItemChanged(m9060a(list, cVar2));
            }
            int a = m9060a(this.f9556d, cVar);
            this.f9555c = (C8688c) this.f9556d.get(a);
            notifyItemChanged(a);
        }
    }

    /* renamed from: a */
    public static int m9060a(List<C8688c> list, C8688c cVar) {
        int i = 0;
        for (C8688c a : list) {
            if (C8688c.m17189a(a, cVar)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo8284b(String str, C8688c cVar) {
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(cVar, "sticker");
        C4575an.m10981a((int) R.string.efn);
        int b = mo8706b(cVar);
        if (b >= 0) {
            notifyItemChanged(b);
        }
    }

    /* renamed from: a */
    public static boolean m9061a(C8688c cVar, List<? extends C8688c> list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C8688c) obj).mo15141a(cVar)) {
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bws, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…ure_magic, parent, false)");
        return new C3325b(this, inflate);
    }

    /* renamed from: c */
    public final void mo8285c(String str, C8688c cVar) {
        Object obj;
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(cVar, "sticker");
        if (this.f9559g) {
            long j = cVar.f23744e;
            C8688c cVar2 = this.f9558f;
            if (cVar2 != null) {
                obj = Long.valueOf(cVar2.f23744e);
            } else {
                obj = Integer.valueOf(-1);
            }
            if ((obj instanceof Long) && j == ((Long) obj).longValue()) {
                C3326c cVar3 = this.f9554b;
                if (cVar3 != null) {
                    cVar3.mo8702a(false, this.f9555c);
                }
                C8688c cVar4 = this.f9555c;
                this.f9555c = cVar;
                if (cVar4 != null && m9061a(cVar4, this.f9556d)) {
                    int a = m9060a(this.f9556d, cVar4);
                    if (a >= 0) {
                        notifyItemChanged(a);
                    }
                }
                C3326c cVar5 = this.f9554b;
                if (cVar5 != null) {
                    cVar5.mo8702a(true, this.f9555c);
                }
            }
        }
        int b = mo8706b(cVar);
        if (b >= 0) {
            notifyItemChanged(b);
        }
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        C3325b bVar = (C3325b) vVar;
        C52711k.m112240b(bVar, "holder");
        C8688c cVar = (C8688c) this.f9556d.get(i);
        C5213c.m11814a(bVar.f9560a, cVar.f23740a.mo7701a());
        int i3 = 8;
        bVar.f9561b.setVisibility(8);
        if (C8688c.m17189a(this.f9555c, cVar)) {
            bVar.f9561b.setVisibility(0);
        }
        ProgressBar progressBar = bVar.f9563d;
        if (cVar.f23761v) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        progressBar.setVisibility(i2);
        View view = bVar.f9562c;
        if (!cVar.f23760u) {
            i3 = 0;
        }
        view.setVisibility(i3);
        mo8705a(cVar, (C48710o) new C3327d(bVar));
        bVar.itemView.setOnClickListener(new C3328e(this, bVar, cVar));
    }

    /* renamed from: a */
    public final void mo8705a(C8688c cVar, C48710o oVar) {
        if (cVar == null || C9414h.m18630a(cVar.f23747h) || !cVar.f23747h.contains("new")) {
            oVar.mo8642b();
        } else {
            this.f9553a.mo8645a(cVar.f23756q, cVar.f23754o, oVar);
        }
    }

    /* renamed from: a */
    public final void mo8283a(String str, C8688c cVar) {
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(cVar, "sticker");
        if (mo8706b(cVar) >= 0) {
            notifyDataSetChanged();
        }
    }
}
