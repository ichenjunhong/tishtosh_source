package com.bytedance.android.livesdk.rank.p408a;

import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5697f;
import com.bytedance.android.livesdk.chatroom.widget.AvatarIconView;
import com.bytedance.android.livesdk.widget.C8534c;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.rank.a.a */
public final class C8124a extends C1322a<C8125a> {

    /* renamed from: a */
    private List<C5697f> f22183a;

    /* renamed from: b */
    private OnClickListener f22184b = C8126b.f22191a;

    /* renamed from: com.bytedance.android.livesdk.rank.a.a$a */
    static class C8125a extends C1352v {

        /* renamed from: a */
        public ImageView f22185a;

        /* renamed from: b */
        public View f22186b;

        /* renamed from: c */
        public TextView f22187c;

        /* renamed from: d */
        public AvatarIconView f22188d;

        /* renamed from: e */
        public TextView f22189e;

        /* renamed from: f */
        public TextView f22190f;

        C8125a(View view) {
            super(view);
            this.f22186b = view;
            this.f22185a = (ImageView) view.findViewById(R.id.b3d);
            this.f22187c = (TextView) view.findViewById(R.id.c85);
            this.f22188d = (AvatarIconView) view.findViewById(R.id.hi);
            this.f22189e = (TextView) view.findViewById(R.id.bpp);
            this.f22190f = (TextView) view.findViewById(R.id.chj);
        }
    }

    public final int getItemCount() {
        if (C9414h.m18630a(this.f22183a)) {
            return 0;
        }
        return this.f22183a.size();
    }

    public C8124a(List<C5697f> list) {
        this.f22183a = list;
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C8125a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aq2, null));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C8125a aVar = (C8125a) vVar;
        if (!C9414h.m18630a(this.f22183a)) {
            C5697f fVar = (C5697f) this.f22183a.get(i);
            if (fVar != null) {
                aVar.f22187c.setText(String.valueOf(fVar.f14967c));
                if (fVar.f14967c <= 3) {
                    aVar.f22187c.setVisibility(8);
                    aVar.f22185a.setVisibility(0);
                    if (fVar.f14967c == 1) {
                        aVar.f22185a.setImageResource(R.drawable.bua);
                    } else if (fVar.f14967c == 2) {
                        aVar.f22185a.setImageResource(R.drawable.bub);
                    } else if (fVar.f14967c == 3) {
                        aVar.f22185a.setImageResource(R.drawable.buc);
                    }
                } else {
                    aVar.f22187c.setVisibility(0);
                    aVar.f22185a.setVisibility(8);
                }
                User user = fVar.f14965a;
                if (user != null) {
                    aVar.f22186b.setTag(user);
                    aVar.f22186b.setOnClickListener(this.f22184b);
                    aVar.f22188d.setAvatar(user.getAvatarThumb());
                    if (user.getUserHonor() != null) {
                        aVar.f22188d.setIcon(user.getUserHonor().mo8157l());
                    }
                    aVar.f22189e.setText(user.getNickName());
                }
                String c = C3890e.m9835c(fVar.f14966b);
                StringBuilder sb = new StringBuilder("  ");
                sb.append(c);
                SpannableString spannableString = new SpannableString(sb.toString());
                int b = (int) C9432q.m18687b(C3922z.m9915e(), 16.0f);
                Drawable drawable = C3922z.m9915e().getResources().getDrawable(R.drawable.buz);
                drawable.setBounds(0, 0, b, b);
                spannableString.setSpan(new C8534c(drawable), 0, 1, 33);
                aVar.f22190f.setText(spannableString);
            }
        }
    }
}
