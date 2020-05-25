package com.p683ss.android.ugc.aweme.poi.p2074ui.publish;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.poi.model.C39117aw;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.c */
public final class C39397c extends C1322a<C1352v> {

    /* renamed from: a */
    public C39398a f100774a;

    /* renamed from: b */
    private List<C39117aw> f100775b;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.c$a */
    public interface C39398a {
        /* renamed from: a */
        void mo80372a(C39117aw awVar, boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.c$b */
    class C39399b extends C1352v {

        /* renamed from: a */
        View f100776a;

        /* renamed from: b */
        TextView f100777b;

        C39399b(View view) {
            super(view);
            this.f100776a = view;
            this.f100777b = (TextView) view.findViewById(R.id.cjp);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.c$c */
    class C39401c extends C1352v {

        /* renamed from: a */
        SpeedRecommendPoiItemView f100780a;

        C39401c(SpeedRecommendPoiItemView speedRecommendPoiItemView) {
            super(speedRecommendPoiItemView);
            this.f100780a = speedRecommendPoiItemView;
        }
    }

    public final int getItemCount() {
        if (this.f100775b == null) {
            return 1;
        }
        return this.f100775b.size() + 1;
    }

    public C39397c(List<C39117aw> list) {
        this.f100775b = list;
    }

    public final int getItemViewType(int i) {
        if (this.f100775b == null || i != this.f100775b.size()) {
            return 1;
        }
        return 2;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return new C39399b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0l, viewGroup, false));
        }
        return new C39401c((SpeedRecommendPoiItemView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a0k, viewGroup, false));
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        switch (getItemViewType(i)) {
            case 1:
                C39401c cVar = (C39401c) vVar;
                C39117aw awVar = (C39117aw) this.f100775b.get(i);
                SpeedRecommendPoiItemView speedRecommendPoiItemView = cVar.f100780a;
                PoiStruct poiStruct = awVar.f99792a;
                if (poiStruct != null) {
                    speedRecommendPoiItemView.f100772a.setText(poiStruct.getPoiName());
                }
                boolean z = awVar.f99793b;
                speedRecommendPoiItemView.setSelected(z);
                speedRecommendPoiItemView.f100772a.setSelected(z);
                TextView textView = speedRecommendPoiItemView.f100772a;
                if (z) {
                    i2 = speedRecommendPoiItemView.f100772a.getContext().getResources().getColor(R.color.a11);
                } else {
                    i2 = speedRecommendPoiItemView.f100772a.getContext().getResources().getColor(R.color.a1a);
                }
                textView.setTextColor(i2);
                cVar.f100780a.setOnClickListener(new OnClickListener(awVar) {

                    /* renamed from: a */
                    final /* synthetic */ C39117aw f100782a;

                    public final void onClick(View view) {
                        C39117aw awVar;
                        ClickInstrumentation.onClick(view);
                        boolean z = this.f100782a.f99793b;
                        this.f100782a.f99793b = !z;
                        if (C39397c.this.f100774a != null) {
                            C39398a aVar = C39397c.this.f100774a;
                            if (z) {
                                awVar = null;
                            } else {
                                awVar = this.f100782a;
                            }
                            aVar.mo80372a(awVar, false);
                        }
                    }

                    {
                        this.f100782a = r2;
                    }
                });
                return;
            case 2:
                C39399b bVar = (C39399b) vVar;
                bVar.f100777b.setText(R.string.c7l);
                bVar.f100776a.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        if (C39397c.this.f100774a != null) {
                            C39397c.this.f100774a.mo80372a(null, true);
                        }
                    }
                });
                break;
        }
    }
}
