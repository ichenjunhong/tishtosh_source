package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.chatroom.p309e.C5084b;
import com.bytedance.android.livesdk.chatroom.p309e.C5115z;
import com.bytedance.android.livesdk.chatroom.p325ui.GameMsgLinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.widget.LiveMessageRecyclerView;
import com.bytedance.android.livesdk.floatwindow.C7176g;
import com.bytedance.android.livesdk.floatwindow.C7182h;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.message.model.C7808am;
import com.bytedance.android.livesdk.message.model.C7810ao;
import com.bytedance.android.livesdk.message.model.C7835bj;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.host.C8794c;
import com.bytedance.android.livesdkapi.host.C8794c.C8795a;
import com.bytedance.android.livesdkapi.host.C8794c.C8797c;
import com.bytedance.android.message.C8868a;
import com.bytedance.common.utility.p522b.C9376b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1675ac;
import p064c.p065a.C2149h;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p079b.C1830n;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.live.broadcast.widget.d */
public final class C3764d extends LinearLayout {

    /* renamed from: f */
    static int f10633f = -1;

    /* renamed from: a */
    TextView f10634a;

    /* renamed from: b */
    TextView f10635b;

    /* renamed from: c */
    public LiveMessageRecyclerView f10636c;

    /* renamed from: d */
    public boolean f10637d = true;

    /* renamed from: e */
    public C3769c f10638e;

    /* renamed from: g */
    public ArrayList<Integer> f10639g;

    /* renamed from: h */
    private ImageView f10640h;

    /* renamed from: i */
    private C3767a f10641i;

    /* renamed from: j */
    private List<C5084b> f10642j;

    /* renamed from: k */
    private C1690c f10643k;

    /* renamed from: l */
    private GameMsgLinearLayoutManager f10644l;

    /* renamed from: m */
    private C8868a f10645m;

    /* renamed from: n */
    private View f10646n;

    /* renamed from: com.bytedance.android.live.broadcast.widget.d$a */
    class C3767a extends C1322a<C3768b> {

        /* renamed from: a */
        public List<C5084b> f10651a;

        /* renamed from: c */
        private final LayoutInflater f10653c;

        public final int getItemCount() {
            if (this.f10651a == null) {
                return 0;
            }
            return this.f10651a.size();
        }

        C3767a() {
            this.f10653c = LayoutInflater.from(C3764d.this.getContext());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo9147a(List<C5084b> list) {
            this.f10651a = list;
            try {
                notifyDataSetChanged();
            } catch (Exception unused) {
                C3764d.this.f10636c.getRecycledViewPool().mo5085a();
                notifyDataSetChanged();
            } catch (Throwable unused2) {
            }
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C3768b(this.f10653c.inflate(R.layout.alw, viewGroup, false));
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            boolean z;
            boolean z2;
            boolean z3;
            C3768b bVar = (C3768b) vVar;
            C5084b bVar2 = (C5084b) this.f10651a.get(i);
            if ((bVar2.f13643a.getIntType() == C8629a.GIFT.getIntType() || bVar2.f13643a.getIntType() == C8629a.DOODLE_GIFT.getIntType()) && !((Boolean) C4525b.f12365ah.mo10345a()).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (bVar2.f13643a.getIntType() != C8629a.CHAT.getIntType() || ((Boolean) C4525b.f12364ag.mo10345a()).booleanValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (bVar2.f13643a.getIntType() != C8629a.MEMBER.getIntType() || ((Boolean) C4525b.f12366ai.mo10345a()).booleanValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
            int intType = bVar2.f13643a.getIntType();
            if (z || z2 || z3 || !C3764d.this.f10639g.contains(Integer.valueOf(intType)) || bVar2.f13649g) {
                bVar2.f13649g = true;
            } else {
                bVar2.f13649g = false;
                Spannable o = bVar2.mo10990o();
                if (o != null) {
                    bVar.f10654a.setVisibility(0);
                    C3764d.this.mo9138a(bVar.f10654a, o, bVar2.f13643a);
                    return;
                }
            }
            bVar.f10654a.setVisibility(8);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.d$b */
    class C3768b extends C1352v {

        /* renamed from: a */
        TextView f10654a;

        C3768b(View view) {
            super(view);
            this.f10654a = (TextView) view.findViewById(R.id.text);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.d$c */
    public interface C3769c {
        /* renamed from: a */
        void mo8423a(boolean z);
    }

    private int getLayoutId() {
        return R.layout.apm;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (this.f10643k != null) {
            this.f10643k.dispose();
        }
        this.f10645m = null;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9137a() {
        try {
            this.f10641i.notifyDataSetChanged();
            int size = this.f10641i.f10651a.size();
            if (size > 0) {
                this.f10636c.mo4833d(size);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final void mo9140c() {
        m9599a(this.f10637d);
        if (this.f10637d) {
            this.f10640h.setImageResource(R.drawable.btv);
            this.f10636c.setVisibility(8);
            this.f10634a.setVisibility(0);
            mo9139b();
            return;
        }
        this.f10640h.setImageResource(R.drawable.btu);
        this.f10636c.setVisibility(0);
        this.f10641i.mo9147a(this.f10642j);
        this.f10634a.setVisibility(4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9139b() {
        if (this.f10645m != null) {
            List b = this.f10645m.mo11727b();
            this.f10642j.clear();
            this.f10642j.addAll(b);
            if (!C9376b.m18558a((Collection<T>) this.f10642j)) {
                boolean z = true;
                C5084b bVar = (C5084b) this.f10642j.get(b.size() - 1);
                if (bVar != null) {
                    boolean z2 = !((Boolean) C4525b.f12365ah.mo10345a()).booleanValue();
                    boolean z3 = !((Boolean) C4525b.f12364ag.mo10345a()).booleanValue();
                    boolean z4 = !((Boolean) C4525b.f12366ai.mo10345a()).booleanValue();
                    T t = bVar.f13643a;
                    if ((bVar.f13644b != 1 || (t instanceof C7835bj)) && this.f10639g.contains(Integer.valueOf(bVar.f13643a.getIntType()))) {
                        if (!(bVar.f13643a.getIntType() == C8629a.GIFT.getIntType() || bVar.f13643a.getIntType() == C8629a.DOODLE_GIFT.getIntType()) || !z2) {
                            z = false;
                        }
                        if (!z) {
                            if (bVar.f13643a.getIntType() == C8629a.CHAT.getIntType() && z3) {
                                return;
                            }
                            if (!(t instanceof C7835bj) || (((C7835bj) t).mo14147a() == 1 && !z4)) {
                                mo9138a(this.f10634a, bVar.mo10990o(), t);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m9598a(int i) {
        f10633f = i;
    }

    public final void setOnViewClickListener(C3769c cVar) {
        this.f10638e = cVar;
    }

    private void setMsgList(List<C5084b> list) {
        this.f10642j = new ArrayList(list);
        this.f10641i.mo9147a(this.f10642j);
    }

    public final void setPresenter(C8868a aVar) {
        this.f10645m = aVar;
        if (aVar != null) {
            setMsgList(aVar.mo11727b());
        }
    }

    /* renamed from: a */
    private void m9599a(boolean z) {
        C7176g gVar = (C7176g) C7182h.m14893a(IBroadcastService.TAG_MSG_VIEW);
        if (gVar != null && gVar.mo13316c()) {
            if (z) {
                gVar.f19485a.mo13320b((int) C4577ap.m10990a(getContext(), 280.0f), (int) C4577ap.m10990a(getContext(), 24.0f));
            } else {
                gVar.f19485a.mo13320b((int) C4577ap.m10990a(getContext(), 280.0f), (int) C4577ap.m10990a(getContext(), 220.0f));
            }
        }
    }

    public C3764d(Context context) {
        super(context);
        inflate(getContext(), getLayoutId(), this);
        this.f10634a = (TextView) findViewById(R.id.dc5);
        this.f10635b = (TextView) findViewById(R.id.dcz);
        this.f10640h = (ImageView) findViewById(R.id.axz);
        this.f10646n = findViewById(R.id.yy);
        this.f10636c = (LiveMessageRecyclerView) findViewById(R.id.blk);
        this.f10646n.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C3764d.this.f10637d = !C3764d.this.f10637d;
                C3764d.this.mo9140c();
                if (C3764d.this.f10638e != null) {
                    C3764d.this.f10638e.mo8423a(C3764d.this.f10637d);
                }
            }
        });
        mo9140c();
        this.f10641i = new C3767a();
        this.f10644l = new GameMsgLinearLayoutManager(getContext(), 1, false);
        this.f10636c.setLayoutManager(this.f10644l);
        this.f10636c.setAdapter(this.f10641i);
        this.f10636c.setItemAnimator(null);
        this.f10639g = new ArrayList<>();
        this.f10639g.add(Integer.valueOf(C8629a.GIFT.getIntType()));
        this.f10639g.add(Integer.valueOf(C8629a.DOODLE_GIFT.getIntType()));
        this.f10639g.add(Integer.valueOf(C8629a.CHAT.getIntType()));
        this.f10639g.add(Integer.valueOf(C8629a.MEMBER.getIntType()));
        this.f10639g.add(Integer.valueOf(C8629a.SCREEN.getIntType()));
        m9598a(0);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C1675ac a = C2168a.m6519a();
        C1745b.m6050a(timeUnit, "unit is null");
        C1745b.m6050a(a, "scheduler is null");
        C1830n nVar = new C1830n(Math.max(0, 1), Math.max(0, 1), timeUnit, a);
        this.f10643k = C2150a.m6483a((C2149h<T>) nVar).mo6440a(100, false, false).mo6443a(C1667a.m5940a()).mo6438a((C1710e<? super T>) new C3770e<Object>(this), C3771f.f10657a);
    }

    /* renamed from: a */
    public final void mo9138a(final TextView textView, final Spannable spannable, C7859c cVar) {
        long j;
        if (cVar instanceof C7810ao) {
            j = ((C7810ao) cVar).f21494c;
        } else if (cVar instanceof C7808am) {
            j = ((C7808am) cVar).f21486b;
        } else {
            textView.setText(spannable);
            j = -1;
        }
        if (j > 0) {
            C7505d findGiftById = ((IGiftService) C4116c.m10249a(IGiftService.class)).findGiftById(j);
            if (findGiftById != null) {
                ((C8794c) C4116c.m10249a(C8794c.class)).mo15490a(findGiftById.f20541b, (C8797c) new C8797c() {
                    /* renamed from: a */
                    public final void mo9146a(C8795a aVar) {
                    }

                    /* renamed from: a */
                    public final void mo9145a(Bitmap bitmap) {
                        C5115z.m11755a(spannable, bitmap.copy(Config.ARGB_8888, true));
                        textView.setText(spannable);
                    }
                });
            }
        }
    }
}
