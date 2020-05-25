package com.bytedance.android.livesdk.gift.relay;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.relay.C7642i.C7643a;
import com.bytedance.android.livesdk.gift.relay.p381a.C7631c;
import com.bytedance.android.livesdk.gift.relay.p381a.C7631c.C7632a;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.relay.a */
public final class C7627a extends C1322a<C7642i> implements C7643a {

    /* renamed from: a */
    public final List<C7632a> f20963a = new ArrayList();

    /* renamed from: b */
    public C7632a f20964b;

    /* renamed from: c */
    public C7628a f20965c;

    /* renamed from: d */
    private Context f20966d;

    /* renamed from: e */
    private LayoutInflater f20967e;

    /* renamed from: f */
    private C7631c f20968f;

    /* renamed from: com.bytedance.android.livesdk.gift.relay.a$a */
    public interface C7628a {
        /* renamed from: a */
        void mo13993a(C7632a aVar);
    }

    public final int getItemCount() {
        return this.f20963a.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo13991a(C7632a aVar) {
        for (int i = 0; i < this.f20963a.size(); i++) {
            if (aVar == this.f20963a.get(i)) {
                return i;
            }
        }
        return -1;
    }

    public C7627a(Context context, C7631c cVar) {
        this.f20966d = context;
        this.f20968f = cVar;
        this.f20967e = LayoutInflater.from(this.f20966d);
    }

    /* renamed from: a */
    public final void mo13992a(C7642i iVar, C7632a aVar) {
        if (this.f20965c != null) {
            this.f20965c.mo13993a(aVar);
        }
        if (this.f20964b != null) {
            this.f20964b.f20994g = false;
            if (this.f20964b == aVar) {
                this.f20964b = null;
                return;
            }
        }
        if (aVar != null) {
            aVar.f20994g = true;
            this.f20964b = aVar;
        }
        iVar.mo13998a(true);
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7642i iVar = new C7642i(this.f20967e.inflate(R.layout.al0, null), this.f20968f);
        WindowManager windowManager = (WindowManager) this.f20966d.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        iVar.itemView.setLayoutParams(new LayoutParams((point.x - ((int) C4577ap.m10990a(this.f20966d, 28.0f))) / 3, (int) C4577ap.m10990a(this.f20966d, 120.0f)));
        return iVar;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        int i2;
        C7642i iVar = (C7642i) vVar;
        C7632a aVar = (C7632a) this.f20963a.get(i);
        if (aVar != null) {
            if (!(aVar == null || iVar.f21046g == null)) {
                Context context = iVar.itemView.getContext();
                iVar.mo13998a(aVar.f20994g);
                C5213c.m11820a(iVar.f21040a, aVar.f20991d);
                C5213c.m11820a(iVar.f21041b, aVar.f20992e);
                if (aVar.f20989b == 500) {
                    C5213c.m11820a(iVar.f21042c, aVar.f20993f);
                } else {
                    iVar.f21042c.setVisibility(8);
                }
                iVar.f21043d.setText(aVar.f20988a);
                C7505d findGiftById = GiftManager.inst().findGiftById(iVar.f21046g.f20985c);
                if (findGiftById != null) {
                    i2 = findGiftById.f20545f;
                } else {
                    i2 = 0;
                }
                iVar.f21044e.setText(String.valueOf(aVar.f20989b * i2));
                Drawable drawable = context.getResources().getDrawable(R.drawable.bsx);
                drawable.setBounds(new Rect(0, 0, (int) C4577ap.m10990a(context, 12.0f), (int) C9432q.m18687b(context, 12.0f)));
                if (C4206c.m10426a(context)) {
                    iVar.f21044e.setCompoundDrawables(null, null, drawable, null);
                } else {
                    iVar.f21044e.setCompoundDrawables(drawable, null, null, null);
                }
                iVar.itemView.setOnClickListener(new C7644j(iVar, aVar));
            }
            iVar.f21045f = this;
        }
    }
}
