package com.p683ss.android.ugc.aweme.music.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p669e.C10705c;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.j */
public final class C37301j extends C26840g<MusicOwnerInfo> {

    /* renamed from: a */
    public C37302a f95205a;

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.j$a */
    public interface C37302a {
        /* renamed from: a */
        void mo76604a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.adapter.j$b */
    public final class C37303b extends C1352v {

        /* renamed from: a */
        public final AvatarImageView f95206a;

        /* renamed from: b */
        public final DmtTextView f95207b;

        /* renamed from: c */
        public final DmtTextView f95208c;

        /* renamed from: d */
        public final ImageView f95209d;

        /* renamed from: e */
        public final ImageView f95210e;

        /* renamed from: f */
        final /* synthetic */ C37301j f95211f;

        public C37303b(C37301j jVar, final View view) {
            C52711k.m112240b(view, "itemView");
            this.f95211f = jVar;
            super(view);
            View findViewById = view.findViewById(R.id.bod);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.music_owner_ai_head)");
            this.f95206a = (AvatarImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.boi);
            C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.….music_owner_tv_nickname)");
            this.f95207b = (DmtTextView) findViewById2;
            TextPaint paint = this.f95207b.getPaint();
            C52711k.m112236a((Object) paint, "tp");
            paint.setFakeBoldText(true);
            View findViewById3 = view.findViewById(R.id.boj);
            C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.….music_owner_tv_username)");
            this.f95208c = (DmtTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.boe);
            C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.music_owner_iv_badge)");
            this.f95209d = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.emh);
            C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.….music_username_iv_badge)");
            this.f95210e = (ImageView) findViewById5;
            C10705c.m21579a(view);
            view.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C37303b f95212a;

                {
                    this.f95212a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (this.f95212a.f95211f.f95205a != null && !C32800a.m75679a(view)) {
                        C37302a aVar = this.f95212a.f95211f.f95205a;
                        if (aVar != null) {
                            aVar.mo76604a(this.f95212a.getLayoutPosition());
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.blk, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C37303b(this, inflate);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (vVar instanceof C37303b) {
            C37303b bVar = (C37303b) vVar;
            List a = mo50673a();
            C52711k.m112236a((Object) a, "data");
            C52711k.m112240b(a, "items");
            MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) a.get(i);
            bVar.f95206a.mo48930a(musicOwnerInfo.getAvatar());
            C23515d.m57672a((RemoteImageView) bVar.f95206a, musicOwnerInfo.getAvatar(), bVar.f95206a.getControllerListener());
            if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Sound")) {
                bVar.f95207b.setText(musicOwnerInfo.getNickName());
                bVar.f95208c.setText(musicOwnerInfo.getHandle());
                bVar.f95210e.setVisibility(8);
                bVar.f95209d.setVisibility(8);
                if (musicOwnerInfo.getVerified()) {
                    bVar.f95210e.setImageResource(R.drawable.ah0);
                    bVar.f95210e.setVisibility(0);
                }
            } else {
                bVar.f95207b.setText(musicOwnerInfo.getNickName());
                DmtTextView dmtTextView = bVar.f95208c;
                StringBuilder sb = new StringBuilder("@");
                sb.append(musicOwnerInfo.getHandle());
                dmtTextView.setText(sb.toString());
                bVar.f95209d.setVisibility(8);
                if (musicOwnerInfo.getVerified()) {
                    bVar.f95209d.setImageResource(R.drawable.ah0);
                    bVar.f95209d.setVisibility(0);
                }
            }
        }
    }
}
