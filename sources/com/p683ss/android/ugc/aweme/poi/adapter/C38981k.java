package com.p683ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.C39101ag;
import com.p683ss.android.ugc.aweme.poi.preview.C39154a;
import com.p683ss.android.ugc.aweme.poi.preview.C39159b;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.ttm.player.MediaPlayer;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.k */
public final class C38981k extends C1322a<C38982a> implements C38972d {

    /* renamed from: a */
    private Context f99298a;

    /* renamed from: b */
    private List<C39101ag> f99299b;

    /* renamed from: c */
    private C39159b f99300c;

    /* renamed from: d */
    private RecyclerView f99301d;

    /* renamed from: e */
    private C39067g f99302e;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.k$a */
    protected static class C38982a extends C1352v {

        /* renamed from: a */
        RemoteImageView f99303a;

        /* renamed from: b */
        TextView f99304b;

        /* renamed from: c */
        TextView f99305c;

        /* renamed from: d */
        public C38972d f99306d;

        public C38982a(View view, C38972d dVar) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.f99306d = dVar;
            this.f99304b = (TextView) view.findViewById(R.id.c0v);
            this.f99303a = (RemoteImageView) view.findViewById(R.id.c0t);
            this.f99305c = (TextView) view.findViewById(R.id.c0u);
        }
    }

    public final int getItemCount() {
        if (this.f99299b == null) {
            return 0;
        }
        return this.f99299b.size();
    }

    /* renamed from: a */
    public final void mo79130a(int i) {
        C39154a.m86994a("recommend", ((C39101ag) this.f99299b.get(i)).getTagType(), this.f99302e);
        if (this.f99300c == null) {
            this.f99300c = C39159b.m87005a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            StringBuilder sb = new StringBuilder();
            for (C39101ag agVar : this.f99299b) {
                arrayList.add(agVar.getMedium());
                arrayList2.add(agVar.getLarge());
                arrayList3.add(agVar.title);
                sb.append(agVar.getTagType());
                sb.append("-");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "poi_page");
            hashMap.put("poi_id", this.f99302e.getPoiId());
            hashMap.put("page_type", "recommend");
            hashMap.put("poi_type", this.f99302e.getPoiType());
            hashMap.put("group_id", this.f99302e.getAwemeId());
            hashMap.put("previous_page", this.f99302e.getPreviousPage());
            hashMap.put("pic_tag", sb.toString());
            C39452l.m87736a(hashMap, this.f99302e);
            this.f99300c.mo79799a(this.f99298a, arrayList, arrayList2, arrayList3, this.f99301d, R.id.c0t, this.f99302e.getPoiId(), "recommend", hashMap, true, true);
        }
        this.f99300c.mo79801a("tag_poi_picture", i, getItemCount());
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C38982a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bnd, viewGroup, false), this);
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C38982a aVar = (C38982a) vVar;
        C39101ag agVar = (C39101ag) this.f99299b.get(i);
        if (agVar != null) {
            C23515d.m57670a(aVar.f99303a, agVar.getPicMedium(), (int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, 270);
            aVar.f99304b.setText(agVar.title);
            aVar.f99303a.setOnClickListener(new C38989m(i) {

                /* renamed from: a */
                final /* synthetic */ int f99307a;

                /* renamed from: a */
                public final void mo79133a(View view) {
                    if (C38982a.this.f99306d != null) {
                        C38982a.this.f99306d.mo79130a(this.f99307a);
                    }
                }

                {
                    this.f99307a = r2;
                }
            });
            if (TextUtils.isEmpty(agVar.getTagName())) {
                aVar.f99305c.setVisibility(8);
            } else {
                aVar.f99305c.setVisibility(0);
                aVar.f99305c.setText(agVar.getTagName());
            }
        }
    }

    public C38981k(Context context, RecyclerView recyclerView, List<C39101ag> list, C39067g gVar) {
        this.f99298a = context;
        this.f99299b = list;
        this.f99301d = recyclerView;
        this.f99302e = gVar;
    }
}
