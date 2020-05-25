package com.p683ss.android.ugc.aweme.poi.p2074ui.publish;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.poi.model.C39117aw;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2074ui.publish.C39397c.C39398a;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.d */
public final class C39403d extends LinearLayout {

    /* renamed from: a */
    private RecyclerView f100784a;

    /* renamed from: b */
    private C39397c f100785b;

    /* renamed from: c */
    private C39398a f100786c;

    public final void setOnItemClick(C39398a aVar) {
        this.f100786c = aVar;
    }

    public final void setData(List<C39117aw> list) {
        if (list == null || list.size() == 0) {
            setVisibility(8);
            return;
        }
        this.f100784a.setLayoutManager(new WrapLinearLayoutManager(getContext(), 0, false));
        this.f100784a.mo4798a((C1331h) new C1331h() {
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
                int i;
                int i2;
                int f = RecyclerView.m4275f(view);
                if (f == 0) {
                    i = (int) C9432q.m18687b(C39403d.this.getContext(), 16.0f);
                } else {
                    i = 0;
                }
                if (f != recyclerView.getAdapter().getItemCount() - 1) {
                    i2 = (int) C9432q.m18687b(C39403d.this.getContext(), 10.0f);
                } else {
                    i2 = (int) C9432q.m18687b(C39403d.this.getContext(), 16.0f);
                }
                rect.set(i, 0, i2, 0);
            }
        });
        this.f100785b = new C39397c(list);
        this.f100785b.f100774a = this.f100786c;
        this.f100784a.setAdapter(this.f100785b);
    }

    /* renamed from: a */
    public final void mo80375a(PoiStruct poiStruct, List<C39117aw> list) {
        if (list != null) {
            if (poiStruct == null) {
                for (C39117aw awVar : list) {
                    awVar.f99793b = false;
                }
            } else {
                for (C39117aw awVar2 : list) {
                    if (awVar2.f99792a.getPoiId().equals(poiStruct.getPoiId())) {
                        awVar2.f99793b = true;
                    } else {
                        awVar2.f99793b = false;
                    }
                }
            }
            if (this.f100785b != null) {
                this.f100785b.notifyDataSetChanged();
            }
        }
    }
}
