package com.p683ss.android.ugc.aweme.filter;

import android.animation.ObjectAnimator;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31494g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;
import com.p683ss.android.ugc.tools.view.p2509b.C50209b;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.b */
public final class C31420b extends C50209b<C31459g> {

    /* renamed from: a */
    public int f82262a;

    /* renamed from: b */
    public boolean f82263b;

    /* renamed from: c */
    public C31414ao f82264c;

    /* renamed from: d */
    RecyclerView f82265d;

    /* renamed from: e */
    public boolean f82266e;

    /* renamed from: f */
    public C31407aj f82267f;

    /* renamed from: g */
    public C31499l f82268g;

    /* renamed from: h */
    private final int f82269h = -3;

    /* renamed from: i */
    private final int f82270i = -4;

    /* renamed from: j */
    private final int f82271j = 2;

    /* renamed from: u */
    private boolean f82272u;

    /* renamed from: v */
    private C31477o f82273v;

    /* renamed from: com.ss.android.ugc.aweme.filter.b$a */
    class C31423a extends C1352v {
        C31423a(View view) {
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.b$b */
    class C31424b extends C1352v {
        C31424b(View view) {
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.b$c */
    public class C31425c extends C1352v {

        /* renamed from: a */
        ImageView f82278a;

        /* renamed from: b */
        public AVDmtImageTextView f82279b;

        /* renamed from: c */
        C31494g f82280c = C31494g.FILTER_STATE_UNKNOWN;

        /* renamed from: d */
        ObjectAnimator f82281d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo64325a() {
            if (this.f82281d != null && this.f82281d.isRunning()) {
                this.f82281d.cancel();
            }
            this.f82278a.setRotation(0.0f);
            this.f82278a.setImageResource(R.drawable.ec);
        }

        C31425c(View view) {
            super(view);
            this.f82279b = (AVDmtImageTextView) view.findViewById(R.id.avq);
            this.f82278a = (ImageView) view.findViewById(R.id.b0b);
            view.setOnClickListener(new OnClickListener(C31420b.this) {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    int adapterPosition = C31425c.this.getAdapterPosition();
                    if (adapterPosition != -1) {
                        C31459g gVar = (C31459g) C31420b.this.mo92825b().get(adapterPosition);
                        boolean a = C31487c.m73325a(C31420b.this.f82268g, gVar);
                        if (!a) {
                            C31420b.this.f82268g.mo64406a(gVar);
                        }
                        if (C31420b.this.f82264c != null) {
                            C31414ao aoVar = C31420b.this.f82264c;
                            C31459g gVar2 = (C31459g) C31420b.this.mo92825b().get(adapterPosition);
                            C31420b bVar = C31420b.this;
                            int i = -1;
                            for (int i2 = 0; i2 <= adapterPosition; i2++) {
                                if (!TextUtils.equals(((C31459g) bVar.mo92825b().get(i2)).f82325b, "LINE")) {
                                    i++;
                                }
                            }
                            aoVar.mo64313a(gVar2, i, a);
                        }
                        C31425c.this.f82279b.mo93974c(false);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final int mo64314a() {
        if (this.f82272u || this.f82263b) {
            return 1;
        }
        return super.mo64314a();
    }

    public final void aY_() {
        C31459g c = mo64324c();
        if (c != null) {
            mo64320a(c);
        }
    }

    /* renamed from: c */
    public final C31459g mo64324c() {
        if (C9414h.m18630a(mo92825b())) {
            return null;
        }
        for (C31459g gVar : mo92825b()) {
            if (C31487c.m73325a(this.f82268g, gVar)) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo64318a(List<C31459g> list) {
        this.f125763k = list;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f82265d = recyclerView;
    }

    /* renamed from: b */
    private void m73208b(int i) {
        if (this.f82265d != null) {
            if (this.f82265d.getWidth() == 0) {
                this.f82265d.post(new C31428c(this, i));
            } else {
                this.f82265d.mo4814b(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo64319a(boolean z) {
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.f125764l = getItemCount();
    }

    /* renamed from: b */
    public final void mo64322b(C31459g gVar) {
        if (gVar != null) {
            for (int i = 0; i < getItemCount(); i++) {
                if (gVar.f82324a == ((C31459g) mo92825b().get(i)).f82324a) {
                    m73208b(i);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo64315a(int i) {
        if (this.f82272u && i == 0) {
            return -3;
        }
        if (this.f82263b && i == 0) {
            return -4;
        }
        if (((C31459g) mo92825b().get(i)).f82325b.equals("LINE")) {
            return 2;
        }
        return 1;
    }

    /* renamed from: b */
    public final void mo64323b(boolean z) {
        this.f82266e = z;
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (((C31459g) mo92825b().get(i)).f82324a == this.f82262a) {
                notifyItemChanged(i, mo92825b().get(i));
                notifyItemRangeChanged(i, 1);
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo64320a(C31459g gVar) {
        int itemCount = getItemCount();
        int i = gVar.f82324a;
        if (this.f82262a == i) {
            return true;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= itemCount) {
                break;
            } else if (((C31459g) mo92825b().get(i2)).f82324a == this.f82262a) {
                notifyItemChanged(i2, mo92825b().get(i2));
                break;
            } else {
                i2++;
            }
        }
        for (int i3 = 0; i3 < itemCount; i3++) {
            if (((C31459g) mo92825b().get(i3)).f82324a == i) {
                notifyItemChanged(i3, mo92825b().get(i3));
                m73207a((C31459g) mo92825b().get(i3), i3);
                m73208b(i3);
                this.f82262a = i;
                return true;
            }
        }
        return false;
    }

    public C31420b(C31407aj ajVar, C31499l lVar) {
        this.f82267f = ajVar;
        this.f82268g = lVar;
    }

    /* renamed from: a */
    private void m73207a(C31459g gVar, int i) {
        Effect c = C31487c.m73328c(this.f82268g.mo64415e(), gVar);
        if (this.f82267f != null && c != null) {
            this.f82267f.mo64307a(c.getId(), c.getTagsUpdatedAt(), new C48715t() {
                /* renamed from: a */
                public final void mo8708a() {
                }
            });
        }
    }

    /* renamed from: a */
    public final C1352v mo64316a(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return new C31424b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fj, viewGroup, false));
        }
        switch (i) {
            case -4:
                return new C31423a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fi, viewGroup, false));
            case ImageFrame.NV21 /*-3*/:
                this.f82273v = new C31477o(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fk, viewGroup, false));
                return this.f82273v;
            default:
                return new C31425c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fh, viewGroup, false));
        }
    }

    /* renamed from: a */
    public final void mo64317a(C1352v vVar, int i) {
        boolean z;
        switch (mo64315a(i)) {
            case -4:
                return;
            case ImageFrame.NV21 /*-3*/:
                C31477o oVar = (C31477o) vVar;
                oVar.f82369b = ObjectAnimator.ofFloat(oVar.f82368a, "rotation", new float[]{0.0f, 360.0f});
                oVar.f82369b.setDuration(800);
                oVar.f82369b.setRepeatMode(1);
                oVar.f82369b.setRepeatCount(-1);
                oVar.f82369b.start();
                return;
            case 1:
                C31425c cVar = (C31425c) vVar;
                C31459g gVar = (C31459g) mo92825b().get(i);
                cVar.f82279b.mo93969a(gVar.f82329f.toString());
                cVar.f82279b.setText(gVar.f82325b);
                AVDmtImageTextView aVDmtImageTextView = cVar.f82279b;
                if (C31420b.this.f82266e || C31420b.this.f82262a != gVar.f82324a) {
                    z = false;
                } else {
                    z = true;
                }
                aVDmtImageTextView.mo93970a(z);
                C31494g a = C31420b.this.f82268g.mo64408a(gVar.f82324a);
                if (cVar.f82280c != a) {
                    cVar.f82280c = a;
                    switch (a) {
                        case FILTER_STATE_NOT_DOWNLOAD:
                            cVar.mo64325a();
                            cVar.f82278a.setVisibility(0);
                            return;
                        case FILTER_STATE_DOWNLOAD_SUCCESS:
                            cVar.mo64325a();
                            cVar.f82278a.setVisibility(8);
                            return;
                        case FILTER_STATE_DOWNLOADING:
                            cVar.f82278a.setVisibility(0);
                            cVar.f82278a.setImageResource(R.drawable.ed);
                            cVar.f82281d = ObjectAnimator.ofFloat(cVar.f82278a, "rotation", new float[]{0.0f, 360.0f});
                            cVar.f82281d.setDuration(800);
                            cVar.f82281d.setRepeatMode(1);
                            cVar.f82281d.setRepeatCount(-1);
                            cVar.f82281d.setInterpolator(new LinearInterpolator());
                            cVar.f82281d.start();
                            break;
                    }
                }
                break;
            case 2:
                return;
        }
    }

    public final void onBindViewHolder(C1352v vVar, int i, List list) {
        boolean z;
        if (list.isEmpty()) {
            onBindViewHolder(vVar, i);
            return;
        }
        if (getItemViewType(i) == 1) {
            C31425c cVar = (C31425c) vVar;
            C31459g gVar = (C31459g) mo92825b().get(i);
            AVDmtImageTextView aVDmtImageTextView = cVar.f82279b;
            if (this.f82266e || this.f82262a != gVar.f82324a) {
                z = false;
            } else {
                z = true;
            }
            aVDmtImageTextView.mo93970a(z);
            if (this.f82262a == gVar.f82324a) {
                cVar.f82279b.mo93970a(true);
            }
            cVar.f82279b.mo93974c(false);
        }
    }
}
