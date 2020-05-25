package com.bytedance.android.livesdk.feed.p341i;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.p235h.C3923a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.feed.C6957i;
import com.bytedance.android.livesdk.feed.C7023m;
import com.bytedance.android.livesdk.feed.dislike.C6861a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p334c.C6856b;
import com.bytedance.android.livesdkapi.depend.model.live.C8706l;
import com.bytedance.android.livesdkapi.depend.model.live.C8706l.C8708b;
import com.bytedance.android.livesdkapi.p429a.C8603a;
import com.bytedance.android.livesdkapi.p429a.C8605c;
import com.bytedance.android.livesdkapi.p450h.C8757g;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.livesdk.feed.i.t */
public final class C6997t extends C3923a<FeedItem> {

    /* renamed from: b */
    public FeedItem f19113b;

    /* renamed from: c */
    public boolean f19114c;

    /* renamed from: d */
    public boolean f19115d;

    /* renamed from: e */
    C8605c f19116e;

    /* renamed from: f */
    protected final C6957i f19117f;

    /* renamed from: g */
    protected final FeedDataKey f19118g;

    /* renamed from: h */
    private HSImageView f19119h;

    /* renamed from: i */
    private TextView f19120i;

    /* renamed from: j */
    private TextView f19121j;

    /* renamed from: k */
    private TextView f19122k;

    /* renamed from: l */
    private ImageView f19123l;

    /* renamed from: m */
    private int f19124m = -1;

    /* renamed from: n */
    private View f19125n;

    /* renamed from: o */
    private boolean f19126o;

    /* renamed from: p */
    private boolean f19127p;

    /* renamed from: q */
    private C8603a f19128q;

    /* renamed from: r */
    private C2180b<Object> f19129r;

    /* renamed from: s */
    private C2180b<Object> f19130s;

    /* renamed from: f */
    private static String m14630f() {
        return "feed_ad";
    }

    /* renamed from: e */
    private void m14629e() {
        C6856b.m14400c().mo13054p();
        this.itemView.getContext();
        this.itemView.hashCode();
    }

    /* renamed from: g */
    private void m14631g() {
        if (this.f19116e != null && this.f19113b != null && this.f19113b.item != null && (this.f19113b.item instanceof C8706l)) {
            ((C8706l) this.f19113b.item).mo15386a(1);
        }
    }

    /* renamed from: a */
    public final void mo9278a() {
        super.mo9278a();
        if (this.f19113b != null) {
            C6856b.m14400c().mo13054p();
            this.itemView.getContext();
            this.itemView.hashCode();
        }
        if (this.f19127p) {
            this.f19127p = false;
            if (this.f19113b != null) {
                C6856b.m14400c().mo13054p();
                this.itemView.getContext();
            }
        }
    }

    /* renamed from: c */
    public final void mo9282c() {
        super.mo9282c();
        if (!(this.f19113b == null || this.f19113b.item == null || !(this.f19113b.item instanceof C8706l))) {
            C8706l lVar = (C8706l) this.f19113b.item;
            C6856b.m14400c().mo13054p();
            this.itemView.getContext();
            m14630f();
            lVar.getId();
            lVar.mo15387a();
            C6856b.m14400c().mo13054p();
            this.itemView.getContext();
            Object[] objArr = {this.f19113b.adJSONObject, "show"};
        }
        m14631g();
    }

    /* renamed from: d */
    public final void mo9283d() {
        super.mo9283d();
        if (!(this.f19116e == null || this.f19113b == null || this.f19113b.item == null || !(this.f19113b.item instanceof C8706l))) {
            C8706l lVar = (C8706l) this.f19113b.item;
            try {
                JSONObject a = this.f19116e.mo15097a(lVar.mo15386a(1));
                JSONObject a2 = lVar.mo15387a();
                if (a != null) {
                    long optLong = a.optLong("duration", 0);
                    a.put("play_50", a.optLong("play_100", 0));
                    a.remove("duration");
                    a2.put("duration", optLong);
                    a2.put("ad_extra_data", a);
                }
                C6856b.m14400c().mo13054p();
                this.itemView.getContext();
                lVar.getId();
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    private void m14628a(String str) {
        if (!(this.f19113b == null || this.f19113b.item == null || !(this.f19113b.item instanceof C8706l))) {
            C8706l lVar = (C8706l) this.f19113b.item;
            if (lVar.f23860b.equals("app")) {
                C6856b.m14400c().mo13054p();
                this.itemView.getContext();
                m14630f();
                return;
            }
            lVar.mo15388a(str, 0);
            C6856b.m14400c().mo13054p();
            this.itemView.getContext();
            m14630f();
            lVar.getId();
            C6856b.m14400c().mo13054p();
            this.itemView.getContext();
            Object[] objArr = {this.f19113b.adJSONObject, "click"};
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13170b(Object obj) throws Exception {
        m14629e();
        m14631g();
        if (this.f19114c) {
            this.f19117f.mo13099a(this.f19118g, String.valueOf(this.f19113b.item.getId()));
            C4204a.m10421a(this.itemView.getContext(), (int) R.string.eag);
            this.f19114c = false;
            this.f19114c = false;
        }
        if (this.f19115d) {
            C6856b.m14400c().mo13054p();
            this.itemView.getContext();
        }
        if (this.f19116e != null) {
            ((C8706l) this.f19113b.item).mo15386a(1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13169b(FeedItem feedItem, View view) {
        m14627a(feedItem, 2);
        m14628a("image");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo13171c(FeedItem feedItem, View view) {
        m14627a(feedItem, 1);
        m14628a("title");
    }

    /* renamed from: a */
    private void m14627a(FeedItem feedItem, int i) {
        if (feedItem != null && feedItem.item != null && (feedItem.item instanceof C8706l)) {
            C6856b.m14400c().mo13054p();
            this.itemView.getContext();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13167a(PopupWindow popupWindow, View view) {
        this.f19117f.mo13099a(this.f19118g, String.valueOf(this.f19113b.item.getId()));
        C6856b.m14400c().mo13054p();
        this.itemView.getContext();
        C4204a.m10421a(this.itemView.getContext(), (int) R.string.eag);
        C6965af.m14589a(popupWindow);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13168a(FeedItem feedItem, View view) {
        m14627a(feedItem, 3);
        if (feedItem != null && feedItem.item != null && (feedItem.item instanceof C8706l) && !TextUtils.equals(((C8706l) feedItem.item).f23860b, "app")) {
            m14628a("more_button");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo9280a(Object obj, int i) {
        FeedItem feedItem = (FeedItem) obj;
        this.f19113b = feedItem;
        if (!this.f19127p) {
            this.f19127p = true;
            if (this.f19113b != null) {
                C6856b.m14400c().mo13054p();
                this.itemView.getContext();
                new Object[1][0] = new Object() {
                };
            }
        }
        if (this.f19124m <= 0) {
            this.f19124m = C9432q.m18670a(this.f19119h.getContext());
        }
        this.f19119h.setLayoutParams(new LayoutParams(this.f19124m, this.f19124m));
        if (feedItem != null && (feedItem.item instanceof C8706l)) {
            C8706l lVar = (C8706l) feedItem.item;
            this.f19120i.setOnClickListener(new C7000v(this, feedItem));
            this.itemView.setOnClickListener(new C7002x(this, feedItem));
            if (this.f19126o) {
                this.itemView.setOnLongClickListener(new C7003y(this));
            } else {
                this.itemView.setOnLongClickListener(null);
            }
            this.f19125n.setOnClickListener(new C7004z(this, feedItem));
            if (!C9376b.m18558a((Collection<T>) lVar.f23862d) && lVar.f23862d.get(0) != null && !C9376b.m18558a((Collection<T>) ((C8708b) lVar.f23862d.get(0)).f23889c)) {
                this.f19119h.setImageURI((String) ((C8708b) lVar.f23862d.get(0)).f23889c.get(0));
            }
            if (!TextUtils.isEmpty(lVar.f23848A)) {
                this.f19120i.setText(lVar.f23848A);
                this.f19120i.setVisibility(0);
            } else {
                this.f19120i.setVisibility(8);
            }
            if (!TextUtils.isEmpty(lVar.f23849B)) {
                this.f19122k.setText(lVar.f23849B);
            }
            this.f19121j.setText(lVar.f23873o);
            m14629e();
            if (this.f19129r != null) {
                mo9279a(this.f19129r.mo6505a((C1710e<? super T>) new C6960aa<Object>(this), C6961ab.f19051a));
            }
            if (this.f19130s != null) {
                mo9279a(this.f19130s.mo6505a((C1710e<? super T>) new C6962ac<Object>(this), C6963ad.f19053a));
            }
        }
    }

    public C6997t(View view, C6861a aVar, C6957i iVar, FeedDataKey feedDataKey, C7023m mVar, C8757g gVar, C2180b<FeedItem> bVar, C2180b<Boolean> bVar2, C2180b<Object> bVar3, C2180b<Object> bVar4) {
        boolean z;
        super(view);
        this.f19119h = (HSImageView) view.findViewById(R.id.axr);
        this.f19120i = (TextView) view.findViewById(R.id.title);
        this.f19121j = (TextView) view.findViewById(R.id.d6k);
        this.f19123l = (ImageView) view.findViewById(R.id.b1t);
        this.f19125n = view.findViewById(R.id.d5);
        this.f19122k = (TextView) view.findViewById(R.id.c3);
        this.f19128q = new C6999u(this);
        if (feedDataKey == null || mVar == null || !mVar.mo13184b(feedDataKey.f18992c)) {
            z = false;
        } else {
            z = true;
        }
        this.f19126o = z;
        this.f19117f = iVar;
        this.f19118g = feedDataKey;
        this.f19129r = bVar3;
        this.f19130s = bVar4;
        this.f19116e = C6856b.m14400c().mo13054p().mo15497a();
    }
}
