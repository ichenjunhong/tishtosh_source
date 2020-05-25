package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2181a;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C43099t;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C43099t.C43101b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C43099t.C43102c;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C43170w;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.C42663f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C43036f;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2183c.C43025i;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e */
public final class C42992e extends C43099t {

    /* renamed from: g */
    public C43025i f108573g;

    /* renamed from: h */
    private boolean f108574h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e$a */
    public final class C42993a extends C1352v {

        /* renamed from: a */
        final /* synthetic */ C42992e f108575a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e$a$a */
        static final class C42994a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C42993a f108576a;

            C42994a(C42993a aVar) {
                this.f108576a = aVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C43025i iVar = this.f108576a.f108575a.f108573g;
                if (iVar != null) {
                    iVar.mo87327b(view);
                }
            }
        }

        public C42993a(C42992e eVar, ViewGroup viewGroup) {
            C52711k.m112240b(viewGroup, "parent");
            this.f108575a = eVar;
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0t, viewGroup, false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e$b */
    public final class C42995b extends C43102c {

        /* renamed from: d */
        final /* synthetic */ C42992e f108577d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e$b$a */
        static final class C42996a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C42995b f108578a;

            /* renamed from: b */
            final /* synthetic */ C43102c f108579b;

            C42996a(C42995b bVar, C43102c cVar) {
                this.f108578a = bVar;
                this.f108579b = cVar;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (this.f108578a.f108577d.f108809d) {
                    int b = this.f108578a.f108577d.mo87384b(this.f108579b.getAdapterPosition());
                    if (b >= 0 && b < this.f108578a.f108577d.f108806a.size()) {
                        C43101b bVar = this.f108578a.f108577d.f108808c;
                        VideoSegment videoSegment = ((C43170w) this.f108578a.f108577d.f108806a.get(b)).f109123b;
                        C52711k.m112236a((Object) videoSegment, "items[adapterPosition].seg");
                        bVar.mo87356a(view, b, videoSegment.mo86950e());
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo87387a(C43102c cVar) {
            C52711k.m112240b(cVar, "holder");
            this.itemView.setOnClickListener(new C42996a(this, cVar));
        }

        public C42995b(C42992e eVar, ViewGroup viewGroup) {
            C52711k.m112240b(viewGroup, "parent");
            this.f108577d = eVar;
            super(viewGroup);
        }
    }

    /* renamed from: d */
    public final List<C43170w> mo87385d() {
        List<C43170w> list = this.f108806a;
        C52711k.m112236a((Object) list, "items");
        return list;
    }

    /* renamed from: e */
    private final boolean m94230e() {
        if (!C43036f.m94309c() || !this.f108574h) {
            return false;
        }
        return true;
    }

    public final int getItemCount() {
        if (m94230e()) {
            return super.getItemCount() + 1;
        }
        return super.getItemCount();
    }

    /* renamed from: a */
    public final void mo87383a(boolean z) {
        this.f108574h = z;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo87382a(View view) {
        C52711k.m112240b(view, "itemView");
        C43025i iVar = this.f108573g;
        if (iVar != null) {
            iVar.mo87328c(view);
        }
    }

    /* renamed from: b */
    public final int mo87384b(int i) {
        if (m94230e()) {
            return i - 1;
        }
        return i;
    }

    /* renamed from: a */
    public final C43170w mo87381a(int i) {
        if (!m94230e()) {
            return super.mo87381a(i);
        }
        if (getItemViewType(i) != 10002) {
            return null;
        }
        return (C43170w) this.f108806a.get(mo87384b(i));
    }

    public final long getItemId(int i) {
        if (!m94230e()) {
            return super.getItemId(i);
        }
        if (getItemViewType(i) == 10001) {
            return 10001;
        }
        if (getItemViewType(i) == 10003) {
            return 10003;
        }
        return (long) ((C43170w) this.f108806a.get(mo87384b(i))).f109122a;
    }

    public final int getItemViewType(int i) {
        if (!m94230e()) {
            return super.getItemViewType(i);
        }
        if (i == 0) {
            return 10001;
        }
        if (mo87384b(i) < this.f108806a.size()) {
            return 10002;
        }
        return 10003;
    }

    /* renamed from: a */
    public final int mo87380a(RecyclerView recyclerView, int i) {
        C52711k.m112240b(recyclerView, "recyclerView");
        if (m94230e()) {
            i++;
        }
        return super.mo87380a(recyclerView, i);
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        if (vVar instanceof C42993a) {
            C42993a aVar = (C42993a) vVar;
            aVar.itemView.setOnClickListener(new C42994a(aVar));
        } else if (vVar instanceof C42995b) {
            ((C42995b) vVar).mo87505a(mo87381a(i), i, (C43102c) vVar);
        }
        super.onBindViewHolder(vVar, i);
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i == 10001) {
            return new C42993a(this, viewGroup);
        }
        if (i == 10002) {
            return new C42995b(this, viewGroup);
        }
        C1352v onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        C52711k.m112236a((Object) onCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
        return onCreateViewHolder;
    }

    /* renamed from: a */
    public final void mo86930a(C1352v vVar, C1352v vVar2) {
        C52711k.m112240b(vVar, "sourceHolder");
        C52711k.m112240b(vVar2, "targetHolder");
        if (!m94230e()) {
            super.mo86930a(vVar, vVar2);
            return;
        }
        int b = mo87384b(vVar.getAdapterPosition());
        int b2 = mo87384b(vVar2.getAdapterPosition());
        if (b < this.f108806a.size() && b2 < this.f108806a.size()) {
            int i = ((C43102c) vVar).f108814b.f107902a;
            int i2 = ((C43102c) vVar2).f108814b.f107902a;
            mo87494a(i, i2);
            this.f108806a.add(b2, (C43170w) this.f108806a.remove(b));
            notifyItemMoved(vVar.getAdapterPosition(), vVar2.getAdapterPosition());
            this.f108811f.mo86800a(new C42663f(1, i, i2));
        }
    }

    public C42992e(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        C52711k.m112240b(videoEditViewModel, "videoEditViewModel");
        C52711k.m112240b(cutMultiVideoViewModel, "cutMultiVideoViewModel");
        C52711k.m112240b(list, "videoSegments");
        super(videoEditViewModel, cutMultiVideoViewModel, list);
    }
}
