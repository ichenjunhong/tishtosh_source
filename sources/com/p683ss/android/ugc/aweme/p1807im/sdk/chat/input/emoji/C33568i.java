package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.emoji;

import android.app.Activity;
import android.content.Intent;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.emoji.p1682c.p1683a.C29298a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.emoji.utils.C29478h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo.C33656j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo.PhotoSelectActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.ss.android.ugc.trill.R;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.i */
public final class C33568i extends C1322a<C1352v> {

    /* renamed from: a */
    public C33571a f87013a;

    /* renamed from: b */
    public boolean f87014b;

    /* renamed from: c */
    public LinkedHashSet<C29366a> f87015c = new LinkedHashSet<>();

    /* renamed from: d */
    public List<C29366a> f87016d;

    /* renamed from: e */
    private OnClickListener f87017e = new OnClickListener() {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C33568i.this.f87014b) {
                return;
            }
            if (R.id.b1m == view.getId() || R.id.sy == view.getId()) {
                int intValue = ((Integer) view.getTag()).intValue();
                C29366a a = C33568i.this.mo71024a(intValue);
                if (C33568i.this.f87015c.contains(a)) {
                    C33568i.this.f87015c.remove(a);
                } else {
                    C33568i.this.f87015c.add(a);
                }
                C33568i.this.notifyItemChanged(intValue);
                if (C33568i.this.f87013a != null) {
                    C33568i.this.f87013a.mo71008a();
                }
            }
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.i$a */
    public interface C33571a {
        /* renamed from: a */
        void mo71008a();
    }

    /* renamed from: a */
    public final int mo71023a() {
        return this.f87015c.size();
    }

    /* renamed from: b */
    public final void mo71025b() {
        this.f87015c.clear();
    }

    public final int getItemCount() {
        if (this.f87014b) {
            if (this.f87016d == null) {
                return 0;
            }
            return this.f87016d.size();
        } else if (this.f87016d == null) {
            return 1;
        } else {
            return this.f87016d.size() + 1;
        }
    }

    /* renamed from: a */
    public final C29366a mo71024a(int i) {
        return (C29366a) this.f87016d.get(i);
    }

    public final int getItemViewType(int i) {
        int i2;
        if (this.f87016d == null) {
            i2 = 0;
        } else {
            i2 = this.f87016d.size();
        }
        if (i == i2) {
            return 1;
        }
        return 0;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return new C33572j(viewGroup);
        }
        C33567h hVar = new C33567h(viewGroup);
        hVar.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C33568i.this.f87016d == null || C33568i.this.f87016d.size() < 79) {
                    Activity activity = (Activity) view.getContext();
                    C33656j.m77094a().mo71135a(activity, new C23371a<Boolean>(activity) {

                        /* renamed from: a */
                        final /* synthetic */ Activity f87010a;

                        {
                            this.f87010a = r1;
                        }

                        public final /* synthetic */ void run(Object obj) {
                            if (((Boolean) obj).booleanValue()) {
                                Intent intent = new Intent(this.f87010a, PhotoSelectActivity.class);
                                intent.putExtra("album_action", 1);
                                this.f87010a.startActivity(intent);
                            }
                        }
                    });
                    return;
                }
                C10691a.m21543b(view.getContext(), (int) R.string.bk8, 1).mo19066a();
                C35190af.m79442a();
                C35190af.m79476a(false);
            }
        });
        return hVar;
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        char c;
        if (vVar instanceof C33572j) {
            C33572j jVar = (C33572j) vVar;
            if (!this.f87014b) {
                c = 0;
            } else if (this.f87015c.contains(mo71024a(i))) {
                c = 1;
            } else {
                c = 2;
            }
            jVar.f87022c = this.f87017e;
            C29366a a = mo71024a(i);
            if (c == 0) {
                jVar.f87021b.setVisibility(8);
            } else if (2 == c) {
                jVar.f87021b.setVisibility(0);
                jVar.f87021b.setSelected(false);
            } else if (1 == c) {
                jVar.f87021b.setVisibility(0);
                jVar.f87021b.setSelected(true);
            }
            jVar.f87021b.setOnClickListener(jVar.f87022c);
            jVar.f87020a.setOnClickListener(jVar.f87022c);
            jVar.f87021b.setTag(Integer.valueOf(i));
            jVar.f87020a.setTag(Integer.valueOf(i));
            if (C29298a.m69089c(a)) {
                C29478h.m69558a(jVar.f87020a, a.getAnimateUrl());
                return;
            }
            C23515d.m57669a(jVar.f87020a, a.getAnimateUrl());
        }
    }
}
