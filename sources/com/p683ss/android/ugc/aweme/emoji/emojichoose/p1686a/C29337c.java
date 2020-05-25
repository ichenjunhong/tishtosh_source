package com.p683ss.android.ugc.aweme.emoji.emojichoose.p1686a;

import android.content.res.Resources;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29289e;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.a.c */
public final class C29337c extends C1322a<C29338a> {

    /* renamed from: a */
    public int f76810a;

    /* renamed from: b */
    public int f76811b;

    /* renamed from: c */
    private int f76812c;

    /* renamed from: d */
    private List<C29335a> f76813d = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.a.c$a */
    public static class C29338a extends C29289e<C29335a> {

        /* renamed from: a */
        private ImageView f76814a;

        /* renamed from: b */
        private int f76815b;

        /* renamed from: c */
        private int f76816c;

        C29338a(View view) {
            super(view);
            Resources resources = view.getResources();
            this.f76814a = (ImageView) view.findViewById(R.id.b1o);
            this.f76815b = resources.getDimensionPixelSize(R.dimen.hc);
            this.f76816c = resources.getDimensionPixelSize(R.dimen.hd);
        }

        /* renamed from: a */
        public final void mo59236a(C29335a aVar) {
            int i;
            super.mo59236a(aVar);
            LayoutParams layoutParams = (LayoutParams) this.f76814a.getLayoutParams();
            if (aVar.f76808b == R.drawable.xy) {
                i = this.f76816c;
            } else {
                i = this.f76815b;
            }
            layoutParams.height = i;
            layoutParams.width = i;
            this.f76814a.setLayoutParams(layoutParams);
            this.f76814a.setSelected(aVar.f76807a);
            this.f76814a.setImageResource(aVar.f76808b);
        }
    }

    public final int getItemCount() {
        return this.f76813d.size();
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        ((C29338a) vVar).mo59236a((C29335a) this.f76813d.get(i));
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C29338a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ld, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo59274a(int i, int i2, int i3) {
        if (this.f76810a != i || this.f76811b != i2 || this.f76812c != i3) {
            this.f76810a = i;
            this.f76812c = i3;
            this.f76813d.clear();
            for (int i4 = 0; i4 < i; i4++) {
                C29335a aVar = new C29335a();
                if (i4 == 0 && i3 == 4) {
                    aVar.f76808b = R.drawable.xy;
                } else {
                    aVar.f76808b = R.drawable.xv;
                }
                this.f76813d.add(aVar);
                if (i4 == i2) {
                    this.f76811b = i2;
                    ((C29335a) this.f76813d.get(i2)).f76807a = true;
                }
            }
            notifyDataSetChanged();
        }
    }
}
