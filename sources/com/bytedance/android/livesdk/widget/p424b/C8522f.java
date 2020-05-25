package com.bytedance.android.livesdk.widget.p424b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.livesdk.chatroom.model.C5761p;
import com.bytedance.android.livesdk.chatroom.p325ui.SmoothLinearLayoutManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C7835bj;
import com.bytedance.android.livesdk.message.model.C7869cj;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p416t.C8299d;
import com.bytedance.android.livesdk.widget.p424b.C8532g.C8533a;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.common.utility.C9432q;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.widget.b.f */
public final class C8522f extends RelativeLayout implements OnMessageListener {

    /* renamed from: i */
    public static final C8523a f23378i = new C8523a(null);

    /* renamed from: q */
    private static final String f23379q = C8522f.class.getSimpleName();

    /* renamed from: r */
    private static final int f23380r = 4;

    /* renamed from: s */
    private static final int f23381s = f23381s;

    /* renamed from: t */
    private static final int f23382t = 50;

    /* renamed from: a */
    public RecyclerView f23383a;

    /* renamed from: b */
    C1690c f23384b;

    /* renamed from: c */
    C1690c f23385c;

    /* renamed from: d */
    C1690c f23386d;

    /* renamed from: e */
    C1690c f23387e;

    /* renamed from: f */
    public int f23388f;

    /* renamed from: g */
    ValueAnimator f23389g;

    /* renamed from: h */
    public int f23390h;

    /* renamed from: j */
    private C8513e f23391j;

    /* renamed from: k */
    private SmoothLinearLayoutManager f23392k;

    /* renamed from: l */
    private int f23393l;

    /* renamed from: m */
    private int f23394m;

    /* renamed from: n */
    private Room f23395n;

    /* renamed from: o */
    private final ArrayList<C8511d> f23396o = new ArrayList<>();

    /* renamed from: p */
    private final IMessageManager f23397p;

    /* renamed from: com.bytedance.android.livesdk.widget.b.f$a */
    public static final class C8523a {
        private C8523a() {
        }

        public /* synthetic */ C8523a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.f$b */
    static final class C8524b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C8522f f23398a;

        C8524b(C8522f fVar) {
            this.f23398a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LayoutParams layoutParams;
            RecyclerView recyclerView = this.f23398a.f23383a;
            if (recyclerView != null) {
                layoutParams = recyclerView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    ((RelativeLayout.LayoutParams) layoutParams).bottomMargin = -((int) ((1.0f - floatValue) * ((float) this.f23398a.f23388f)));
                    RecyclerView recyclerView2 = this.f23398a.f23383a;
                    if (recyclerView2 != null) {
                        recyclerView2.setLayoutParams(layoutParams);
                        return;
                    }
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.f$c */
    public static final class C8525c extends C1331h {

        /* renamed from: a */
        final /* synthetic */ C8522f f23399a;

        C8525c(C8522f fVar) {
            this.f23399a = fVar;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            C52711k.m112240b(rect, "outRect");
            C52711k.m112240b(view, "view");
            C52711k.m112240b(recyclerView, "parent");
            C52711k.m112240b(sVar, "state");
            rect.top = this.f23399a.f23390h;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.f$d */
    static final class C8526d<T> implements C1710e<Integer> {

        /* renamed from: a */
        final /* synthetic */ C8522f f23400a;

        C8526d(C8522f fVar) {
            this.f23400a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
            this.f23400a.mo14959c();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.f$e */
    static final class C8527e<T> implements C1710e<Long> {

        /* renamed from: a */
        final /* synthetic */ C8522f f23401a;

        C8527e(C8522f fVar) {
            this.f23401a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            this.f23401a.mo14958b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.f$f */
    static final class C8528f<T> implements C1710e<Integer> {

        /* renamed from: a */
        final /* synthetic */ C8522f f23402a;

        C8528f(C8522f fVar) {
            this.f23402a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
            this.f23402a.mo14958b();
            this.f23402a.mo14956a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.f$g */
    static final class C8529g<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C8529g f23403a = new C8529g();

        C8529g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.f$h */
    static final class C8530h<T> implements C1710e<Integer> {

        /* renamed from: a */
        final /* synthetic */ C8522f f23404a;

        C8530h(C8522f fVar) {
            this.f23404a = fVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
            this.f23404a.mo14958b();
            this.f23404a.mo14956a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.b.f$i */
    static final class C8531i<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C8531i f23405a = new C8531i();

        C8531i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: f */
    private final void m16795f() {
        m16791b(this.f23396o.size() - 1);
    }

    /* renamed from: c */
    public final void mo14959c() {
        if (this.f23394m > 0) {
            this.f23396o.add(new C8504a(this.f23394m));
            m16795f();
            this.f23394m = 0;
        }
    }

    /* renamed from: d */
    private final void m16793d() {
        C2201v b = C2201v.m6614b(Integer.valueOf(1));
        C4097p<C5761p> pVar = LiveConfigSettingKeys.LIVE_EXTERNAL_CONFIG;
        C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.LIVE_EXTERNAL_CONFIG");
        Object a = pVar.mo9431a();
        C52711k.m112236a(a, "LiveConfigSettingKeys.LIVE_EXTERNAL_CONFIG.value");
        this.f23384b = b.mo6539d((long) ((C5761p) a).f15149b, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C8530h<Object>(this), (C1710e<? super Throwable>) C8531i.f23405a);
    }

    /* renamed from: e */
    private final void m16794e() {
        C2201v b = C2201v.m6614b(Integer.valueOf(1));
        C4097p<C5761p> pVar = LiveConfigSettingKeys.LIVE_EXTERNAL_CONFIG;
        C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.LIVE_EXTERNAL_CONFIG");
        Object a = pVar.mo9431a();
        C52711k.m112236a(a, "LiveConfigSettingKeys.LIVE_EXTERNAL_CONFIG.value");
        this.f23386d = b.mo6539d((long) ((C5761p) a).f15148a, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C8528f<Object>(this), (C1710e<? super Throwable>) C8529g.f23403a);
    }

    /* renamed from: a */
    public final void mo14956a() {
        C4097p<C5761p> pVar = LiveConfigSettingKeys.LIVE_EXTERNAL_CONFIG;
        C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.LIVE_EXTERNAL_CONFIG");
        Object a = pVar.mo9431a();
        C52711k.m112236a(a, "LiveConfigSettingKeys.LIVE_EXTERNAL_CONFIG.value");
        this.f23385c = C4585b.m11020a((long) ((C5761p) a).f15150c, TimeUnit.SECONDS).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C8527e<Object>(this));
    }

    /* renamed from: b */
    public final void mo14958b() {
        if (this.f23393l > 0) {
            if (this.f23393l > 0) {
                this.f23396o.add(new C8505b(this.f23393l));
                m16795f();
                this.f23393l = 0;
            }
            this.f23387e = C2201v.m6614b(Integer.valueOf(1)).mo6539d(1, TimeUnit.SECONDS).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C8526d<Object>(this));
            return;
        }
        mo14959c();
    }

    public final void setRoom(Room room) {
        C52711k.m112240b(room, "room");
        this.f23395n = room;
    }

    /* renamed from: a */
    public final void mo14957a(int i) {
        if (i == 1) {
            m16790a(this.f23395n);
        } else if (i == 2) {
            m16793d();
        } else {
            if (i == 3 || i == 4) {
                m16792b(this.f23395n);
            }
        }
    }

    public final void onMessage(IMessage iMessage) {
        C52711k.m112240b(iMessage, "message");
        if ((iMessage instanceof C8001m) || (iMessage instanceof C7869cj)) {
            if (this.f23394m < f23381s) {
                this.f23394m++;
            }
        } else if ((iMessage instanceof C7835bj) && this.f23393l < f23381s) {
            this.f23393l++;
        }
    }

    /* renamed from: b */
    private void m16791b(int i) {
        LayoutParams layoutParams;
        C8513e eVar = this.f23391j;
        if (eVar != null) {
            eVar.notifyItemInserted(i);
            RecyclerView recyclerView = this.f23383a;
            if (recyclerView != null) {
                recyclerView.mo4833d(eVar.getItemCount() - 1);
            }
        }
        if (i <= 2) {
            float f = (float) i;
            this.f23389g = ValueAnimator.ofFloat(new float[]{f / 3.0f, (f + 1.0f) / 3.0f});
            ValueAnimator valueAnimator = this.f23389g;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new C8524b(this));
            }
            ValueAnimator valueAnimator2 = this.f23389g;
            if (valueAnimator2 != null) {
                valueAnimator2.setDuration(200);
            }
            ValueAnimator valueAnimator3 = this.f23389g;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        }
        if (i == 1 && this.f23391j != null) {
            int i2 = C8513e.f23360i;
            if (i2 > 0) {
                int i3 = (i2 * 3) + (this.f23390h * 3);
                if (this.f23388f < i3) {
                    RecyclerView recyclerView2 = this.f23383a;
                    if (recyclerView2 != null) {
                        layoutParams = recyclerView2.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if (layoutParams != null) {
                        layoutParams.height = i3;
                    }
                    RecyclerView recyclerView3 = this.f23383a;
                    if (recyclerView3 != null) {
                        recyclerView3.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m16790a(Room room) {
        boolean z;
        boolean z2;
        if (room != null) {
            C8513e eVar = this.f23391j;
            if (eVar != null) {
                eVar.mo14951a(room);
            }
            User owner = room.getOwner();
            boolean z3 = false;
            if (owner != null) {
                FansClubMember fansClub = owner.getFansClub();
                if (fansClub != null) {
                    FansClubData data = fansClub.getData();
                    if (data != null) {
                        if (data.anchorId != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            data = null;
                        }
                        if (data != null) {
                            this.f23396o.add(new C8532g(C8533a.m16802a()));
                            m16795f();
                            return;
                        }
                    }
                }
            }
            String distanceKm = room.getDistanceKm();
            if (distanceKm != null) {
                if (distanceKm.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    distanceKm = null;
                }
                if (distanceKm != null) {
                    this.f23396o.add(new C8532g(C8533a.m16803b(), distanceKm));
                    m16795f();
                    return;
                }
            }
            Integer valueOf = Integer.valueOf(room.getUserCount());
            if (valueOf.intValue() > f23382t) {
                z3 = true;
            }
            if (!z3) {
                valueOf = null;
            }
            if (valueOf != null) {
                this.f23396o.add(new C8532g(C8533a.m16804c(), valueOf.intValue()));
                m16795f();
            }
        }
    }

    /* renamed from: b */
    private final void m16792b(Room room) {
        boolean z;
        boolean z2;
        if (room != null) {
            C8513e eVar = this.f23391j;
            if (eVar != null) {
                eVar.mo14951a(room);
            }
            User owner = room.getOwner();
            boolean z3 = false;
            if (owner != null) {
                FansClubMember fansClub = owner.getFansClub();
                if (fansClub != null) {
                    FansClubData data = fansClub.getData();
                    if (data != null) {
                        if (data.anchorId != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            data = null;
                        }
                        if (data != null) {
                            this.f23396o.add(new C8532g(C8533a.m16802a()));
                            m16795f();
                            m16794e();
                            return;
                        }
                    }
                }
            }
            if (C8299d.m16446a(getContext(), "android.permission.ACCESS_FINE_LOCATION") && C8830k.m17331e().mo13039a().hasLocation()) {
                String distanceKm = room.getDistanceKm();
                if (distanceKm != null) {
                    if (distanceKm.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(!z)) {
                        distanceKm = null;
                    }
                    if (distanceKm != null) {
                        this.f23396o.add(new C8532g(C8533a.m16803b(), distanceKm));
                        m16795f();
                        m16794e();
                        return;
                    }
                }
            }
            Integer valueOf = Integer.valueOf(room.getUserCount());
            if (valueOf.intValue() > f23382t) {
                z3 = true;
            }
            if (!z3) {
                valueOf = null;
            }
            if (valueOf != null) {
                this.f23396o.add(new C8532g(C8533a.m16804c(), valueOf.intValue()));
                m16795f();
                m16794e();
                return;
            }
        }
        m16793d();
    }

    public C8522f(Context context, IMessageManager iMessageManager) {
        C52711k.m112240b(context, "context");
        super(context);
        this.f23397p = iMessageManager;
        LayoutInflater.from(context).inflate(R.layout.bwe, this, true);
        this.f23383a = (RecyclerView) findViewById(R.id.blk);
        this.f23391j = new C8513e();
        this.f23392k = new SmoothLinearLayoutManager(context, 1, false);
        SmoothLinearLayoutManager smoothLinearLayoutManager = this.f23392k;
        if (smoothLinearLayoutManager != null) {
            smoothLinearLayoutManager.f15577a = 200.0f;
        }
        RecyclerView recyclerView = this.f23383a;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.f23392k);
        }
        this.f23390h = (int) C9432q.m18687b(context, (float) f23380r);
        RecyclerView recyclerView2 = this.f23383a;
        if (recyclerView2 != null) {
            recyclerView2.mo4798a((C1331h) new C8525c(this));
        }
        RecyclerView recyclerView3 = this.f23383a;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.f23391j);
        }
        RecyclerView recyclerView4 = this.f23383a;
        LayoutParams layoutParams = null;
        if (recyclerView4 != null) {
            recyclerView4.setItemAnimator(null);
        }
        RecyclerView recyclerView5 = this.f23383a;
        if (recyclerView5 != null) {
            layoutParams = recyclerView5.getLayoutParams();
        }
        if (layoutParams instanceof MarginLayoutParams) {
            this.f23388f = -((MarginLayoutParams) layoutParams).bottomMargin;
        }
        C8513e eVar = this.f23391j;
        if (eVar != null) {
            LayoutInflater from = LayoutInflater.from(context);
            C52711k.m112236a((Object) from, "LayoutInflater.from(context)");
            C52711k.m112240b(from, "layoutInflater");
            eVar.f23362a = from;
            List<? extends C8511d> list = this.f23396o;
            C52711k.m112240b(list, "messages");
            eVar.f23363b = list;
            eVar.notifyDataSetChanged();
            RecyclerView recyclerView6 = this.f23383a;
            if (recyclerView6 != null) {
                recyclerView6.setFadingEdgeLength(0);
            }
        }
        IMessageManager iMessageManager2 = this.f23397p;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C8629a.CHAT.getIntType(), this);
        }
        IMessageManager iMessageManager3 = this.f23397p;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(C8629a.SCREEN.getIntType(), this);
        }
        IMessageManager iMessageManager4 = this.f23397p;
        if (iMessageManager4 != null) {
            iMessageManager4.addMessageListener(C8629a.MEMBER.getIntType(), this);
        }
    }
}
