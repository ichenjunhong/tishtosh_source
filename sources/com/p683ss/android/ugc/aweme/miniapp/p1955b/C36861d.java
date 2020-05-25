package com.p683ss.android.ugc.aweme.miniapp.p1955b;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36966e;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.b.d */
public final class C36861d extends C1322a<C1352v> {

    /* renamed from: a */
    public List<C36966e> f94210a = new ArrayList();

    /* renamed from: b */
    private List<String> f94211b = new ArrayList();

    /* renamed from: c */
    private int f94212c = 0;

    /* renamed from: d */
    private boolean f94213d;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.b.d$a */
    interface C36862a {
        /* renamed from: a */
        void mo76060a(String str);
    }

    public final int getItemCount() {
        int size = this.f94210a.size();
        if (this.f94212c == 0) {
            return size;
        }
        if (this.f94212c == 1) {
            return (this.f94213d ? 1 : 0) + size;
        }
        StringBuilder sb = new StringBuilder("invalid item type");
        sb.append(this.f94212c);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo76059a(List<C36966e> list) {
        this.f94210a.clear();
        this.f94210a.addAll(list);
        notifyDataSetChanged();
    }

    public C36861d(int i) {
    }

    /* renamed from: a */
    private void m82928a(Context context, C36966e eVar) {
        String str;
        if (context != null && eVar != null && this.f94212c != 1) {
            String appId = eVar.getAppId();
            if (!this.f94211b.contains(appId)) {
                this.f94211b.add(appId);
                C36983a.m83185b().mo76294a().preloadMiniApp(appId, eVar.getType());
                String str2 = "mp_show";
                C23089d a = C23089d.m56640a().mo47829a("mp_id", eVar.getAppId()).mo47829a("author_id", C20902b.m53242a().getCurUserId()).mo47829a("enter_from", "setting_page").mo47829a("click_type", "setting_page_inner");
                String str3 = "_param_for_special";
                if (eVar.getType() == 1) {
                    str = "micro_app";
                } else {
                    str = "micro_game";
                }
                C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
            }
        }
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f94212c == 0) {
            return new C36864f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vz, viewGroup, false));
        }
        if (this.f94212c == 1) {
            return new C36858a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aab, viewGroup, false));
        }
        StringBuilder sb = new StringBuilder("invalid item type");
        sb.append(this.f94212c);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        if (this.f94212c == 0) {
            C36966e eVar = (C36966e) this.f94210a.get(i);
            if (vVar instanceof C36864f) {
                C36864f fVar = (C36864f) vVar;
                C36863e eVar2 = new C36863e(this, i, eVar);
                int i2 = 8;
                if (eVar == null) {
                    fVar.f94217a.setVisibility(8);
                } else {
                    TextView textView = fVar.f94217a;
                    if (i == 0) {
                        i2 = 0;
                    }
                    textView.setVisibility(i2);
                    fVar.f94218b.setText(eVar.getName());
                    C23515d.m57677a(fVar.f94219c, eVar.getIcon());
                    fVar.itemView.setOnClickListener(new C36865g(eVar, eVar2));
                }
            }
            m82928a(vVar.itemView.getContext(), eVar);
            return;
        }
        if (this.f94212c == 1 && (vVar instanceof C36858a)) {
            if (i <= this.f94210a.size() - 1) {
                C36966e eVar3 = (C36966e) this.f94210a.get(i);
                C36858a aVar = (C36858a) vVar;
                aVar.f94204a.setText(eVar3.getName());
                aVar.itemView.setTag(eVar3);
                C23515d.m57677a(aVar.f94205b, eVar3.getIcon());
                aVar.itemView.setOnClickListener(new C36859b(aVar, eVar3));
                m82928a(vVar.itemView.getContext(), eVar3);
            } else if (this.f94213d) {
                C36858a aVar2 = (C36858a) vVar;
                aVar2.f94204a.setText(aVar2.f94206c.getString(R.string.c7j));
                aVar2.itemView.setTag(null);
                C23515d.m57668a(aVar2.f94205b, (int) R.drawable.a_u);
                aVar2.itemView.setOnClickListener(new C36860c(aVar2));
            }
        }
    }
}
