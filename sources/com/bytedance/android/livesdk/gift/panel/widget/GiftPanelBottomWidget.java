package com.bytedance.android.livesdk.gift.panel.widget;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.p043v7.widget.ListPopupWindow;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.C4311b;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;
import com.bytedance.android.livesdk.gift.p357e.C7311c;
import com.bytedance.android.livesdk.gift.p357e.C7311c.C7312a;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;
import com.bytedance.android.livesdk.gift.panel.p380a.C7526c;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7563b;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7564c;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.bytedance.android.livesdk.p388k.C7713e;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.p672e.C10753b;
import com.bytedance.ies.sdk.widgets.Widget;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class GiftPanelBottomWidget extends Widget implements OnClickListener, C9382a {

    /* renamed from: a */
    TextView f20798a;

    /* renamed from: b */
    TextView f20799b;

    /* renamed from: c */
    public TextView f20800c;

    /* renamed from: d */
    SpecialCombView f20801d;

    /* renamed from: e */
    public ListPopupWindow f20802e;

    /* renamed from: f */
    public C10753b f20803f;

    /* renamed from: g */
    C7490a f20804g;

    /* renamed from: h */
    int f20805h = ((Integer) C6718b.f18310G.mo9431a()).intValue();

    /* renamed from: i */
    ObjectAnimator f20806i;

    /* renamed from: j */
    Handler f20807j = new C9381g(this);

    /* renamed from: k */
    private View f20808k;

    /* renamed from: l */
    private TextView f20809l;

    /* renamed from: m */
    private View f20810m;

    /* renamed from: n */
    private TextView f20811n;

    /* renamed from: o */
    private View f20812o;

    /* renamed from: p */
    private C7563b f20813p = C7563b.DIAMOND;

    /* renamed from: q */
    private int f20814q;

    /* renamed from: r */
    private GiftDialogViewModel f20815r;

    /* renamed from: s */
    private boolean f20816s;

    /* renamed from: t */
    private C1690c f20817t;

    /* renamed from: u */
    private C1689b f20818u = new C1689b();

    /* renamed from: v */
    private String f20819v = ((String) LiveConfigSettingKeys.LIVE_GOLDEN_BEAN_TASK_SCHEMA.mo9431a());

    /* renamed from: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelBottomWidget$5 */
    static /* synthetic */ class C75705 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20824a = new int[C7563b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$b[] r0 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7563b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20824a = r0
                int[] r0 = f20824a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$b r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7563b.GOLDEN_BEAN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f20824a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$b r1 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7563b.DIAMOND     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.panel.widget.GiftPanelBottomWidget.C75705.<clinit>():void");
        }
    }

    public int getLayoutId() {
        return R.layout.ai3;
    }

    /* renamed from: b */
    private void m15573b() {
        this.f20815r.f20783p.postValue(Boolean.valueOf(true));
    }

    public void onResume() {
        super.onResume();
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f20807j.hasMessages(1001)) {
            this.f20807j.removeMessages(1001);
        }
        if (this.f20817t != null && !this.f20817t.isDisposed()) {
            this.f20817t.dispose();
        }
        this.f20815r.mo13948a(this);
        if (this.f20818u != null && !this.f20818u.isDisposed()) {
            this.f20818u.dispose();
        }
    }

    /* renamed from: a */
    private void m15570a() {
        C7490a aVar = (C7490a) this.f20815r.f20785r.getValue();
        int a = this.f20815r.mo13947a();
        C7525b bVar = (C7525b) this.f20815r.f20786s.getValue();
        if (bVar == null) {
            if (aVar != null) {
                C7526c cVar = new C7526c(m15572b(aVar.f20513a), aVar.mo13919p(), a, aVar.mo13908e());
                this.f20815r.f20782o.postValue(cVar);
            }
        } else if (bVar.f20670a.size() < ((Integer) C6718b.f18308E.mo9431a()).intValue()) {
            this.f20815r.f20787t.postValue(Boolean.valueOf(true));
        } else {
            this.f20815r.f20782o.postValue(new C7526c(C7564c.DOODLE_GIFT, bVar, true));
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f20803f = C10753b.m21793a(this.context);
        this.f20815r = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        this.f20816s = this.f20815r.f20768a;
        this.f20808k = this.contentView.findViewById(R.id.c9r);
        this.f20809l = (TextView) this.contentView.findViewById(R.id.d9e);
        this.f20798a = (TextView) this.contentView.findViewById(R.id.sm);
        this.f20810m = this.contentView.findViewById(R.id.sl);
        this.f20811n = (TextView) this.contentView.findViewById(R.id.c9q);
        this.f20812o = this.contentView.findViewById(R.id.c9o);
        this.f20799b = (TextView) this.contentView.findViewById(R.id.ckz);
        this.f20800c = (TextView) this.contentView.findViewById(R.id.cl_);
        this.f20801d = (SpecialCombView) this.contentView.findViewById(R.id.clh);
        this.f20798a.setOnClickListener(this);
        this.f20810m.setOnClickListener(this);
        this.f20799b.setOnClickListener(this);
        this.f20800c.setOnClickListener(this);
        this.f20801d.setOnClickListener(this);
        this.f20801d.setCountDownTime(this.f20805h);
        this.f20810m.setVisibility(8);
        Drawable drawable = this.context.getResources().getDrawable(R.drawable.bsx);
        drawable.setBounds(new Rect(0, 0, (int) C4577ap.m10990a(this.context, 16.0f), (int) C9432q.m18687b(this.context, 16.0f)));
        if (C4206c.m10426a(this.context)) {
            this.f20809l.setCompoundDrawables(null, null, drawable, null);
        } else {
            this.f20809l.setCompoundDrawables(drawable, null, null, null);
        }
        mo13954a((C7490a) null);
        mo13953a(((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter());
        this.f20817t = ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10089a().mo6545f((C1710e<? super T>) new C1710e<Long>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                Long l = (Long) obj;
                GiftPanelBottomWidget giftPanelBottomWidget = GiftPanelBottomWidget.this;
                if (giftPanelBottomWidget.isViewValid()) {
                    C4311b walletCenter = ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter();
                    if (!TextUtils.isEmpty(walletCenter.mo10098f())) {
                        giftPanelBottomWidget.f20798a.setText(walletCenter.mo10098f());
                    } else {
                        giftPanelBottomWidget.f20798a.setText(R.string.f2f);
                    }
                    giftPanelBottomWidget.mo13953a(walletCenter);
                    giftPanelBottomWidget.mo13954a(giftPanelBottomWidget.f20804g);
                }
            }
        });
        this.f20815r.f20785r.observe(this, new C7603i(this));
        this.f20815r.f20780m.observe(this, new C7604j(this));
        this.f20815r.f20786s.observe(this, new C7605k(this));
        this.f20818u.mo6180a();
        this.f20818u.mo6181a(C4495a.m10823a().mo10300a(C7713e.class).mo6545f((C1710e<? super T>) new C1710e<C7713e>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                GiftPanelBottomWidget.this.onEvent((C7713e) obj);
            }
        }));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13954a(C7490a aVar) {
        mo13955a(aVar, false);
        m15574b(aVar);
    }

    /* renamed from: b */
    private static C7564c m15572b(int i) {
        if (i == 4) {
            return C7564c.TASK_GIFT;
        }
        if (i == 6) {
            return C7564c.GIFT_AD;
        }
        switch (i) {
            case 1:
                return C7564c.GIFT;
            case 2:
                return C7564c.PROP;
            default:
                return C7564c.NORMAL;
        }
    }

    public void onEvent(C7713e eVar) {
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
        mo13954a(this.f20804g);
    }

    /* renamed from: b */
    private void m15574b(C7490a aVar) {
        if (aVar != null && (aVar.f20516d instanceof C7505d)) {
            C7505d dVar = (C7505d) aVar.f20516d;
            if (dVar.f20544e == 11) {
                this.f20815r.f20793z.postValue(Long.valueOf(dVar.f20543d));
                return;
            }
        }
        this.f20815r.f20793z.postValue(Long.valueOf(0));
    }

    /* renamed from: a */
    public final void mo13952a(int i) {
        this.f20814q = i;
        this.f20815r.f20771d = i;
        this.f20800c.setText(String.valueOf(this.f20814q));
        C7490a aVar = (C7490a) this.f20815r.f20785r.getValue();
        if (aVar != null && this.f20815r != null && this.f20815r.f20786s.getValue() == null) {
            this.f20815r.f20754A.postValue(Integer.valueOf(this.f20814q * aVar.mo13904a()));
        }
    }

    public void handleMsg(Message message) {
        if (message.what == 1001) {
            this.f20799b.setVisibility(0);
            this.f20801d.setVisibility(8);
            if (this.f20806i != null && this.f20806i.isStarted()) {
                this.f20806i.cancel();
            }
            mo13954a(this.f20804g);
            this.f20815r.mo13949b();
            this.f20815r.mo13950c();
            this.f20815r.f20780m.postValue(Boolean.valueOf(false));
        }
    }

    /* renamed from: a */
    private void m15571a(C7563b bVar) {
        Drawable drawable;
        int i;
        if (this.f20813p != bVar) {
            C4311b walletCenter = ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter();
            this.f20813p = bVar;
            if (C75705.f20824a[bVar.ordinal()] != 1) {
                drawable = this.context.getResources().getDrawable(R.drawable.bsx);
                this.f20810m.setVisibility(8);
                this.f20798a.setVisibility(0);
                mo13953a(walletCenter);
            } else {
                drawable = this.context.getResources().getDrawable(R.drawable.bu9);
                View view = this.f20810m;
                if (TextUtils.isEmpty(this.f20819v)) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
                this.f20798a.setVisibility(8);
                mo13953a(walletCenter);
            }
            drawable.setBounds(new Rect(0, 0, (int) C4577ap.m10990a(this.context, 16.0f), (int) C9432q.m18687b(this.context, 16.0f)));
            if (C4206c.m10426a(this.context)) {
                this.f20809l.setCompoundDrawables(null, null, drawable, null);
            } else {
                this.f20809l.setCompoundDrawables(drawable, null, null, null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13953a(C4311b bVar) {
        long j = 0;
        if (this.f20813p == C7563b.GOLDEN_BEAN) {
            TextView textView = this.f20809l;
            if (((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
                j = (long) bVar.mo10099g();
            }
            textView.setText(String.valueOf(j));
            return;
        }
        TextView textView2 = this.f20809l;
        if (((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            j = bVar.mo10092b();
        }
        textView2.setText(String.valueOf(j));
    }

    public void onClick(View view) {
        if (view.getId() == R.id.sm) {
            m15573b();
            return;
        }
        if (view.getId() != R.id.sl) {
            if (view.getId() == R.id.ckz) {
                if (this.f20804g != null) {
                    m15570a();
                } else if (((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10092b() <= 0) {
                    m15573b();
                }
            } else if (view.getId() == R.id.cl_ || view.getId() == R.id.cla) {
                if (this.f20802e == null || !this.f20802e.mo4077e()) {
                    if (this.f20802e == null) {
                        this.f20802e = new ListPopupWindow(this.context);
                        this.f20802e.mo4771a((OnDismissListener) new OnDismissListener() {
                            public final void onDismiss() {
                                Drawable drawable = GiftPanelBottomWidget.this.context.getResources().getDrawable(R.drawable.bwv);
                                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                if (GiftPanelBottomWidget.this.f20800c.getId() == R.id.cla) {
                                    GiftPanelBottomWidget.this.f20800c.setCompoundDrawables(drawable, null, null, null);
                                } else {
                                    GiftPanelBottomWidget.this.f20800c.setCompoundDrawables(null, null, drawable, null);
                                }
                                GiftPanelBottomWidget.this.f20802e = null;
                            }
                        });
                        this.f20802e.mo4774b(this.context.getResources().getDimensionPixelSize(R.dimen.pm));
                        this.f20802e.mo4777c(this.context.getResources().getDimensionPixelSize(R.dimen.pk));
                        this.f20802e.mo4769a(this.context.getResources().getDimensionPixelSize(R.dimen.pl));
                        if (C4206c.m10426a(this.context)) {
                            this.f20802e.f4605h = -this.context.getResources().getDimensionPixelSize(R.dimen.pj);
                        } else {
                            this.f20802e.f4605h = this.context.getResources().getDimensionPixelSize(R.dimen.pj);
                        }
                        this.f20802e.mo4588a((ListAdapter) new C7311c(GiftManager.inst().getGroupCountInfo(), new C7312a() {
                            /* renamed from: a */
                            public final void mo13561a(int i) {
                                if (GiftPanelBottomWidget.this.isViewValid()) {
                                    if (GiftPanelBottomWidget.this.f20802e != null) {
                                        GiftPanelBottomWidget.this.f20802e.dismiss();
                                    }
                                    if (i > 0 && i <= 1314) {
                                        GiftPanelBottomWidget.this.f20803f.mo19441a("hotsoon.pref.GIFT_GROUP_COUNT", (Object) Integer.valueOf(i)).mo19443a();
                                        GiftPanelBottomWidget.this.mo13952a(i);
                                    }
                                }
                            }
                        }));
                        this.f20802e.f4612o = this.f20800c;
                        this.f20802e.mo4770a(this.context.getResources().getDrawable(R.drawable.bhg));
                        this.f20802e.mo4772a(true);
                    }
                    Drawable drawable = this.context.getResources().getDrawable(R.drawable.bww);
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    if (this.f20800c.getId() == R.id.cla) {
                        this.f20800c.setCompoundDrawables(drawable, null, null, null);
                    } else {
                        this.f20800c.setCompoundDrawables(null, null, drawable, null);
                    }
                    this.f20802e.mo4075d();
                    Resources resources = this.context.getResources();
                    ListView f = this.f20802e.mo4078f();
                    if (f != null) {
                        f.setVerticalScrollBarEnabled(false);
                        f.setDivider(new ColorDrawable(resources.getColor(R.color.af2)));
                        f.setDividerHeight(resources.getDimensionPixelSize(R.dimen.pi));
                    }
                }
            } else if (view.getId() == R.id.clh) {
                m15570a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13955a(C7490a aVar, boolean z) {
        C7563b bVar;
        int i;
        if (this.f20804g == null || this.f20804g != aVar || z) {
            this.f20799b.setText(R.string.f0w);
            this.f20804g = aVar;
            int i2 = 8;
            if (aVar == null) {
                if (((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10092b() <= 0) {
                    this.f20799b.setBackgroundResource(R.drawable.bkh);
                    this.f20799b.setText(R.string.f2f);
                } else {
                    this.f20799b.setBackgroundResource(R.drawable.bjo);
                }
                this.f20799b.setVisibility(0);
                this.f20800c.setVisibility(8);
                mo13952a(1);
            } else if (aVar.f20513a == 4 || this.f20815r.f20786s.getValue() != null || !aVar.mo13905b()) {
                this.f20799b.setBackgroundResource(R.drawable.bkh);
                this.f20799b.setVisibility(0);
                this.f20800c.setVisibility(8);
                mo13952a(1);
            } else {
                this.f20814q = this.f20803f.mo19439a("hotsoon.pref.GIFT_GROUP_COUNT", 1);
                this.f20800c.setText(String.valueOf(this.f20814q));
                this.f20800c.setVisibility(0);
                TextView textView = this.f20800c;
                if (C4206c.m10426a(this.context)) {
                    i = R.drawable.bjq;
                } else {
                    i = R.drawable.bjp;
                }
                textView.setBackgroundResource(i);
                this.f20799b.setBackgroundResource(R.drawable.bkh);
                this.f20799b.setVisibility(0);
                mo13952a(this.f20814q);
            }
            this.f20811n.setVisibility(8);
            this.f20812o.setVisibility(8);
            TextView textView2 = this.f20798a;
            if (this.f20813p != C7563b.GOLDEN_BEAN) {
                i2 = 0;
            }
            textView2.setVisibility(i2);
            this.f20809l.setVisibility(0);
            this.f20799b.setVisibility(0);
            if (aVar == null || !aVar.mo13907d()) {
                bVar = C7563b.DIAMOND;
            } else {
                bVar = C7563b.GOLDEN_BEAN;
            }
            m15571a(bVar);
        }
    }
}
