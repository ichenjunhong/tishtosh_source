package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.C3059e;
import com.bytedance.android.live.broadcast.api.p195b.C3043d;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3044a;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3045b;
import com.bytedance.android.live.broadcast.api.p197d.C3051b;
import com.bytedance.android.live.core.rxutils.autodispose.C4005af;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5288a.C5289a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5288a.C5290b;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p279af.C4620v;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C1681ae;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.aq */
public class C5939aq extends Dialog implements OnClickListener, OnSeekBarChangeListener, C3045b, C5290b {

    /* renamed from: a */
    public static final String f15627a = "aq";

    /* renamed from: b */
    public TextView f15628b;

    /* renamed from: c */
    C5289a f15629c;

    /* renamed from: d */
    public C3043d f15630d;

    /* renamed from: e */
    public C6007bx f15631e;

    /* renamed from: f */
    protected boolean f15632f;

    /* renamed from: g */
    DataCenter f15633g;

    /* renamed from: h */
    public C3044a f15634h = new C3044a() {
        /* renamed from: a */
        public final void mo8283a(String str, C8688c cVar) {
        }

        /* renamed from: b */
        public final void mo8284b(String str, C8688c cVar) {
            C5939aq.this.mo11869a(str, cVar, 3);
        }

        /* renamed from: c */
        public final void mo8285c(String str, C8688c cVar) {
            C5939aq.this.mo11869a(str, cVar, 2);
        }
    };

    /* renamed from: i */
    private HSImageView f15635i;

    /* renamed from: j */
    private C3051b f15636j;

    /* renamed from: k */
    private View f15637k;

    /* renamed from: l */
    private LottieAnimationView f15638l;

    /* renamed from: m */
    private ImageView f15639m;

    /* renamed from: n */
    private View f15640n;

    /* renamed from: o */
    private View f15641o;

    /* renamed from: p */
    private TextView f15642p;

    /* renamed from: q */
    private TextView f15643q;

    /* renamed from: r */
    private TextView f15644r;

    /* renamed from: s */
    private View f15645s;

    /* renamed from: t */
    private SeekBar f15646t;

    /* renamed from: u */
    private RecyclerView f15647u;

    /* renamed from: v */
    private View f15648v;

    /* renamed from: w */
    private C8548h f15649w;

    /* renamed from: x */
    private int f15650x;

    /* renamed from: y */
    private boolean f15651y;

    /* renamed from: z */
    private final C1689b f15652z = new C1689b();

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo11872d() {
        super.dismiss();
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    /* renamed from: a */
    public final void mo8286a() {
        mo11870a((List<C8688c>) new ArrayList<C8688c>());
    }

    /* renamed from: b */
    public final void mo11142b() {
        m12930b(false);
        dismiss();
        C4575an.m10981a((int) R.string.gzi);
    }

    /* renamed from: c */
    public final void mo11871c() {
        this.f15628b.setText(String.valueOf(this.f15646t.getProgress()));
        m12932g();
    }

    public void dismiss() {
        ((View) this.f15636j).setVisibility(4);
        this.f15637k.setVisibility(0);
        this.f15637k.post(new C5947av(this));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15629c.mo11490a(this);
        this.f15646t.setProgress(this.f15629c.mo11132a());
        this.f15632f = true;
    }

    public void onDetachedFromWindow() {
        this.f15629c.mo11492f();
        this.f15638l.mo6661f();
        this.f15630d.mo8279a();
        this.f15632f = false;
        this.f15652z.mo6180a();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo11874e() {
        if (this.f15632f) {
            this.f15650x = C9432q.m18670a(getContext());
            View findViewById = this.f15641o.findViewById(R.id.bvq);
            LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = this.f15650x;
            findViewById.setLayoutParams(layoutParams);
            this.f15630d.mo8280a(C3037b.f8915c, this);
            m12931f();
        }
    }

    /* renamed from: f */
    private void m12931f() {
        m12929a(true);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f15645s.getLayoutParams();
        layoutParams.f867k = R.id.jp;
        layoutParams.f863g = R.id.jp;
        layoutParams.f860d = R.id.jp;
        this.f15645s.setLayoutParams(layoutParams);
        this.f15646t.setVisibility(0);
        this.f15628b.setVisibility(0);
        this.f15647u.setVisibility(8);
        this.f15648v.setVisibility(8);
        this.f15642p.setTextColor(-1);
        this.f15643q.setTextColor(-2130706433);
        this.f15644r.setTextColor(-2130706433);
    }

    /* renamed from: g */
    private void m12932g() {
        int i;
        if (this.f15646t.getWidth() == 0 || this.f15628b.getWidth() == 0) {
            this.f15628b.invalidate();
        }
        Rect bounds = this.f15646t.getThumb().getBounds();
        if (C4206c.m10426a(getContext())) {
            i = -((this.f15646t.getWidth() - bounds.centerX()) - (this.f15628b.getWidth() / 2));
        } else {
            i = bounds.centerX() - (this.f15628b.getWidth() / 2);
        }
        this.f15628b.setTranslationX((float) i);
    }

    /* renamed from: b */
    private void m12930b(boolean z) {
        if (z) {
            if (this.f15649w == null) {
                this.f15649w = new C8552a(getContext(), 2).mo15008c((int) R.string.ej3).mo15001b();
            }
            if (!this.f15649w.isShowing()) {
                this.f15649w.show();
            }
        } else if (this.f15649w != null && this.f15649w.isShowing()) {
            this.f15649w.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo8287a(EffectChannelResponse effectChannelResponse) {
        ((C4005af) C2201v.m6613b((Iterable<? extends T>) effectChannelResponse.getAllCategoryEffects()).mo6541d(C5944as.f15657a).mo6552k().mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6153a((C1681ae<T, ? extends R>) C4021e.m10139a((View) this.f15647u))).mo9410a(new C5945at(this), C5946au.f15659a);
    }

    /* renamed from: a */
    private void m12929a(boolean z) {
        if (z) {
            ((View) this.f15636j).setVisibility(0);
            this.f15640n.setVisibility(0);
            this.f15635i.setVisibility(4);
            this.f15638l.setVisibility(4);
            this.f15638l.mo6661f();
            this.f15639m.setVisibility(4);
            this.f15629c.mo11133a(1);
            return;
        }
        ((View) this.f15636j).setVisibility(4);
        this.f15640n.setVisibility(4);
        this.f15635i.setVisibility(0);
        this.f15638l.setVisibility(0);
        this.f15638l.mo6654b();
        if (!this.f15651y) {
            ImageModel c = this.f15629c.mo11138c();
            C5213c.m11821a(this.f15635i, c, (C14234d) new C4620v(5, 0.0f, null));
            C5213c.m11826b(this.f15639m, c, this.f15639m.getWidth(), this.f15639m.getHeight(), R.drawable.bt6);
            this.f15651y = true;
        }
        this.f15639m.setVisibility(0);
        this.f15629c.mo11133a(2);
    }

    /* renamed from: a */
    public final void mo11141a(Throwable th) {
        m12930b(false);
        C4602l.m11047a(getContext(), th, (int) R.string.ej1);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.q6) {
            C4639e.m11122a().f12674f = !C4639e.m11122a().f12674f;
            this.f15636j.mo8318a_();
        } else if (id == R.id.ue) {
            dismiss();
        } else if (id == R.id.jp) {
            m12931f();
        } else if (id == R.id.ctf) {
            m12929a(true);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f15645s.getLayoutParams();
            layoutParams.f867k = R.id.ctf;
            layoutParams.f863g = R.id.ctf;
            layoutParams.f860d = R.id.ctf;
            this.f15645s.setLayoutParams(layoutParams);
            this.f15646t.setVisibility(8);
            this.f15628b.setVisibility(8);
            this.f15647u.setVisibility(0);
            this.f15648v.setVisibility(8);
            this.f15642p.setTextColor(-2130706433);
            this.f15643q.setTextColor(-1);
            this.f15644r.setTextColor(-2130706433);
        } else if (id == R.id.gx) {
            m12929a(false);
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f15645s.getLayoutParams();
            layoutParams2.f867k = R.id.gx;
            layoutParams2.f863g = R.id.gx;
            layoutParams2.f860d = R.id.gx;
            this.f15645s.setLayoutParams(layoutParams2);
            this.f15646t.setVisibility(8);
            this.f15628b.setVisibility(8);
            this.f15647u.setVisibility(8);
            this.f15648v.setVisibility(0);
            this.f15642p.setTextColor(-2130706433);
            this.f15643q.setTextColor(-2130706433);
            this.f15644r.setTextColor(-1);
        } else {
            if (id == R.id.g6) {
                if (!this.f15629c.mo11139d()) {
                    m12930b(true);
                    this.f15629c.mo11140e();
                } else if (!C8607a.f23572a || !C4206c.m10426a(getContext())) {
                    this.f15641o.scrollTo(this.f15650x, 0);
                } else {
                    this.f15641o.scrollTo(-this.f15650x, 0);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11870a(List<C8688c> list) {
        if (list.isEmpty()) {
            list.add(new C8688c());
            return;
        }
        list.add(0, new C8688c());
        this.f15631e = new C6007bx(getContext(), list, new C6009a() {
            /* renamed from: a */
            public final void mo11883a(C8688c cVar) {
                if (C5939aq.this.f15630d.mo8282a(cVar)) {
                    C5939aq.this.f15631e.mo12003a(C3037b.f8915c, cVar, 2);
                } else {
                    C5939aq.this.f15630d.mo8281a(C3037b.f8915c, cVar, C5939aq.this.f15634h);
                }
            }

            /* renamed from: b */
            public final void mo11884b(C8688c cVar) {
                C5939aq aqVar = C5939aq.this;
                if (!TextUtils.equals(cVar.f23756q, aqVar.f15629c.mo11136b())) {
                    aqVar.f15629c.mo11135a(cVar.f23756q);
                    ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).composerManager().mo8273b(C3037b.f8915c);
                    if (TextUtils.equals(cVar.f23756q, "")) {
                        aqVar.f15629c.mo11134a((C8688c) null);
                    } else {
                        ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).composerManager().mo8268a(C3037b.f8915c, cVar);
                        aqVar.f15629c.mo11134a(cVar);
                    }
                    C3059e eVar = new C3059e("liveinteract", cVar);
                    if (aqVar.f15633g != null) {
                        aqVar.f15633g.lambda$put$1$DataCenter("cmd_sticker_is_selected", eVar);
                    }
                }
            }
        });
        this.f15647u.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f15647u.setAdapter(this.f15631e);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aig);
        if (getWindow() != null) {
            getWindow().setLayout(-1, -2);
            getWindow().setGravity(80);
        }
        this.f15636j = (C3051b) findViewById(R.id.c4d);
        this.f15637k = findViewById(R.id.eqq);
        this.f15635i = (HSImageView) findViewById(R.id.ho);
        this.f15638l = (LottieAnimationView) findViewById(R.id.gs);
        this.f15639m = (ImageView) findViewById(R.id.hi);
        this.f15640n = findViewById(R.id.q6);
        this.f15641o = findViewById(R.id.bvs);
        this.f15642p = (TextView) findViewById(R.id.jp);
        this.f15643q = (TextView) findViewById(R.id.ctf);
        this.f15644r = (TextView) findViewById(R.id.gx);
        this.f15645s = findViewById(R.id.atj);
        this.f15646t = (SeekBar) findViewById(R.id.jo);
        this.f15628b = (TextView) findViewById(R.id.dz2);
        this.f15647u = (RecyclerView) findViewById(R.id.ctc);
        this.f15648v = findViewById(R.id.gt);
        this.f15640n.setOnClickListener(this);
        findViewById(R.id.ue).setOnClickListener(this);
        this.f15642p.setOnClickListener(this);
        this.f15643q.setOnClickListener(this);
        this.f15644r.setOnClickListener(this);
        this.f15646t.setOnSeekBarChangeListener(this);
        findViewById(R.id.g6).setOnClickListener(this);
        this.f15628b.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                C5939aq.this.mo11871c();
                C5939aq.this.f15628b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        this.f15638l.setAnimation("audio_interact_effect.json");
        this.f15638l.mo6658c(true);
        this.f15641o.post(new C5943ar(this));
    }

    /* renamed from: a */
    public final void mo11869a(String str, C8688c cVar, int i) {
        if (C3037b.f8915c.equals(str)) {
            this.f15631e.mo12003a(str, cVar, i);
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (i >= 0 && i <= seekBar.getMax() && z) {
            mo11871c();
            this.f15629c.mo11137b(i);
            this.f15636j.mo8317a(i);
        }
    }

    public C5939aq(Activity activity, C5289a aVar, DataCenter dataCenter) {
        super(activity, R.style.y1);
        this.f15629c = aVar;
        this.f15633g = dataCenter;
        this.f15630d = ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).stickerPresenter();
    }
}
