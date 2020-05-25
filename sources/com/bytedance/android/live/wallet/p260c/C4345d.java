package com.bytedance.android.live.wallet.p260c;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.p038f.C0779b;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.dialog.C4220b.C4221a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.C4461a;
import com.bytedance.android.live.wallet.model.C4461a.C4462a;
import com.bytedance.android.live.wallet.model.C4464c;
import com.bytedance.android.live.wallet.model.C4465d;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C8807k;
import com.bytedance.common.utility.C9431p;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.live.wallet.c.d */
public class C4345d extends C4336a {

    /* renamed from: a */
    private final C4461a f11899a;

    /* renamed from: b */
    private final C4461a f11900b;

    /* renamed from: c */
    private final C4461a f11901c;

    /* renamed from: d */
    private final boolean f11902d;

    /* renamed from: e */
    private final C1689b f11903e = new C1689b();

    /* renamed from: f */
    private final C8807k[] f11904f = {C8807k.WEIXIN, C8807k.ALIPAY};

    /* renamed from: g */
    private OnClickListener f11905g = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            if (C4345d.this.f11916v != null) {
                C4495a.m10823a().mo10301a((Object) new C4465d(C4345d.this.f11915u, C4345d.this.f11916v));
                C4525b.f12383az.mo10346a(C4345d.this.f11916v.name());
                switch (C43516.f11925a[C4345d.this.f11916v.ordinal()]) {
                    case 1:
                        str = "wxpay";
                        break;
                    case 2:
                        str = "alipay";
                        break;
                    case 3:
                        str = "balance";
                        break;
                    default:
                        str = "TEST";
                        break;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("request_page", C4345d.this.f11908n);
                hashMap.put("charge_reason", C4345d.this.f11907m);
                hashMap.put("money", String.valueOf(C4345d.this.f11915u.f23691e + C4345d.this.f11915u.f23692f));
                hashMap.put("pay_method", str);
                C8049c.m15979a().mo14202a("livesdk_recharge_pay", hashMap, C8059j.class, Room.class);
            }
        }
    };

    /* renamed from: l */
    protected C4462a f11906l = new C4462a() {
        /* renamed from: a */
        public final void mo10146a(C4461a aVar, boolean z) {
            if (z) {
                C4345d.this.f11916v = null;
                C4345d.this.mo10144f();
            } else if (!aVar.mo10137a()) {
                String str = (String) C6718b.f18341c.mo9431a();
                if (!TextUtils.isEmpty(str)) {
                    new C4221a(C4345d.this.getContext()).mo9695b((CharSequence) str).mo9685a(17039370, C4355h.f11929a).mo9692a().show();
                }
            } else {
                C4345d.this.f11916v = aVar.f12186q;
                C4345d.this.mo10144f();
            }
        }
    };

    /* renamed from: m */
    protected String f11907m;

    /* renamed from: n */
    protected String f11908n;

    /* renamed from: o */
    protected TextView f11909o;

    /* renamed from: p */
    protected TextView f11910p;

    /* renamed from: q */
    protected TextView f11911q;

    /* renamed from: r */
    protected ProgressBar f11912r;

    /* renamed from: s */
    protected ViewGroup f11913s;

    /* renamed from: t */
    protected View f11914t;

    /* renamed from: u */
    protected ChargeDeal f11915u;

    /* renamed from: v */
    protected C8807k f11916v;

    /* renamed from: w */
    protected Context f11917w;

    /* renamed from: x */
    protected final Map<Long, C4461a> f11918x = new HashMap();

    /* renamed from: y */
    public final Set<C8807k> f11919y = new C0779b();

    /* renamed from: com.bytedance.android.live.wallet.c.d$6 */
    static /* synthetic */ class C43516 {

        /* renamed from: a */
        static final /* synthetic */ int[] f11925a = new int[C8807k.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.bytedance.android.livesdkapi.host.k[] r0 = com.bytedance.android.livesdkapi.host.C8807k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11925a = r0
                int[] r0 = f11925a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.android.livesdkapi.host.k r1 = com.bytedance.android.livesdkapi.host.C8807k.WEIXIN     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f11925a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.android.livesdkapi.host.k r1 = com.bytedance.android.livesdkapi.host.C8807k.ALIPAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f11925a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.android.livesdkapi.host.k r1 = com.bytedance.android.livesdkapi.host.C8807k.FIRE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f11925a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.android.livesdkapi.host.k r1 = com.bytedance.android.livesdkapi.host.C8807k.TEST     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p260c.C4345d.C43516.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10130b() {
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11903e.mo6180a();
    }

    /* renamed from: c */
    private void mo10131c() {
        this.f11912r.setVisibility(0);
        this.f11911q.setVisibility(8);
        this.f11914t.setEnabled(false);
        this.f11913s.removeAllViews();
        this.f11903e.mo6181a(((WalletApi) C4157e.m10322a().mo9550a(WalletApi.class)).fetchOptionList().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C4353f<Object>(this), (C1710e<? super Throwable>) new C4354g<Object>(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10121a() {
        this.f11909o.setText(C3922z.m9905a((int) R.string.exy, Float.valueOf(((float) this.f11915u.f23689c) / 100.0f)));
        TextView textView = this.f11910p;
        StringBuilder sb = new StringBuilder();
        sb.append(C3922z.m9903a((int) R.string.f0j));
        sb.append(C4604n.m11050a("%.2f", Float.valueOf(((float) this.f11915u.f23688b) / 100.0f)));
        textView.setText(sb);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo10144f() {
        if (this.f11916v == null) {
            this.f11914t.setEnabled(false);
            for (C4461a aVar : this.f11918x.values()) {
                if (aVar.f12177h != null) {
                    aVar.f12177h.setChecked(false);
                }
            }
        } else {
            Iterator it = this.f11918x.values().iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                C4461a aVar2 = (C4461a) it.next();
                if (aVar2.f12177h != null) {
                    CheckBox checkBox = aVar2.f12177h;
                    if (aVar2.f12186q != this.f11916v) {
                        z = false;
                    }
                    checkBox.setChecked(z);
                }
            }
            this.f11914t.setEnabled(true);
        }
        mo10121a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo10143b(View view) {
        mo10131c();
    }

    /* renamed from: a */
    public final void mo10141a(ChargeDeal chargeDeal) {
        this.f11915u = chargeDeal;
        if (this.f11909o != null) {
            mo10144f();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10142a(Throwable th) throws Exception {
        C3831a.m9706a(6, "PayDialog", th.getStackTrace());
        this.f11912r.setVisibility(8);
        this.f11911q.setVisibility(0);
        this.f11914t.setEnabled(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C4176c cVar) throws Exception {
        this.f11912r.setVisibility(8);
        this.f11911q.setVisibility(8);
        mo10130b();
        for (C4464c cVar2 : cVar.f11365b) {
            C4461a aVar = (C4461a) this.f11918x.get(Long.valueOf(cVar2.f12189a));
            if (aVar != null) {
                if (cVar2.f12192d) {
                    aVar.f12184o = cVar2.f12190b;
                    aVar.f12185p = cVar2.f12191c;
                    aVar.mo10274a(this.f11913s);
                } else {
                    this.f11918x.remove(Long.valueOf(cVar2.f12189a));
                }
            }
        }
        String str = (String) C4525b.f12383az.mo10345a();
        if (C9431p.m18664a(str)) {
            this.f11916v = null;
        } else if (C8807k.valueOf(str) != C8807k.FIRE || this.f11899a.mo10137a()) {
            this.f11916v = C8807k.valueOf(str);
            if (this.f11916v == C8807k.FIRE || this.f11916v == C8807k.TEST) {
                this.f11916v = C8807k.WEIXIN;
            }
            if (this.f11919y.contains(this.f11916v)) {
                this.f11916v = null;
                C8807k[] kVarArr = this.f11904f;
                int length = kVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C8807k kVar = kVarArr[i];
                    if (!this.f11919y.contains(kVar)) {
                        this.f11916v = kVar;
                        break;
                    }
                    i++;
                }
            }
        } else {
            this.f11916v = null;
        }
        mo10144f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aj3);
        Window window = getWindow();
        boolean z = true;
        try {
            if (getContext().getResources().getConfiguration().orientation != 1) {
                z = false;
            }
        } catch (Exception e) {
            C3831a.m9714b("PayDialog", (Throwable) e);
        }
        if (window != null) {
            if (z) {
                getWindow().setLayout(-1, -2);
                getWindow().setGravity(80);
            } else {
                getWindow().setLayout(-2, -1);
                getWindow().setWindowAnimations(R.style.zj);
                getWindow().setGravity(21);
            }
        }
        this.f11919y.clear();
        int intValue = ((Integer) C6718b.f18340b.mo9431a()).intValue();
        if ((intValue & 1) > 0) {
            this.f11919y.add(C8807k.WEIXIN);
        }
        if ((intValue & 2) > 0) {
            this.f11919y.add(C8807k.ALIPAY);
        }
        this.f11909o = (TextView) findViewById(R.id.ddy);
        this.f11910p = (TextView) findViewById(R.id.dec);
        this.f11912r = (ProgressBar) findViewById(R.id.c6b);
        this.f11913s = (ViewGroup) findViewById(R.id.bg4);
        this.f11911q = (TextView) findViewById(R.id.dbf);
        this.f11911q.setOnClickListener(new C4352e(this));
        this.f11914t = findViewById(R.id.op);
        this.f11914t.setOnClickListener(this.f11905g);
        if (this.f11915u != null) {
            mo10121a();
        }
        if (!this.f11902d) {
            this.f11918x.remove(Long.valueOf(this.f11899a.f12179j));
        }
        mo10131c();
    }

    public C4345d(Context context, boolean z, String str, String str2) {
        super(context, R.style.zb);
        C43461 r0 = new C4461a(0, R.drawable.bx2, R.drawable.bx3, C3922z.m9903a((int) R.string.exw), C8807k.FIRE) {
            /* renamed from: a */
            public final boolean mo10137a() {
                if (((long) C4345d.this.f11915u.f23691e) <= ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10096d() / 10) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public final void mo10138b() {
                String a = C3922z.m9903a((int) R.string.exq);
                Locale locale = Locale.US;
                double c = (double) ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10094c();
                Double.isNaN(c);
                StringBuilder sb = new StringBuilder(C2240a.m6773a(locale, a, new Object[]{Double.valueOf(c / 100.0d)}));
                if (((long) C4345d.this.f11915u.f23691e) > ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10096d() / 10) {
                    sb.append(C4345d.this.f11917w.getString(R.string.exx));
                }
                this.f12183n = sb.toString();
                this.f12174e.setText(this.f12183n);
                this.f12174e.setVisibility(0);
            }
        };
        this.f11899a = r0;
        C43472 r02 = new C4461a(1, R.drawable.bwy, R.drawable.bwz, C3922z.m9903a((int) R.string.exp), C8807k.ALIPAY) {
            /* renamed from: b */
            public final void mo10138b() {
            }

            /* renamed from: a */
            public final boolean mo10137a() {
                if (!C4345d.this.f11919y.contains(C8807k.ALIPAY)) {
                    return true;
                }
                return false;
            }
        };
        this.f11900b = r02;
        C43483 r03 = new C4461a(2, R.drawable.bx4, R.drawable.bx5, C3922z.m9903a((int) R.string.ey4), C8807k.WEIXIN) {
            /* renamed from: b */
            public final void mo10138b() {
            }

            /* renamed from: a */
            public final boolean mo10137a() {
                if (!C4345d.this.f11919y.contains(C8807k.WEIXIN)) {
                    return true;
                }
                return false;
            }
        };
        this.f11901c = r03;
        this.f11917w = context;
        this.f11902d = false;
        this.f11907m = str;
        this.f11908n = str2;
        this.f11899a.f12187r = this.f11906l;
        this.f11900b.f12187r = this.f11906l;
        this.f11901c.f12187r = this.f11906l;
        this.f11918x.put(Long.valueOf(this.f11899a.f12179j), this.f11899a);
        this.f11918x.put(Long.valueOf(this.f11900b.f12179j), this.f11900b);
        this.f11918x.put(Long.valueOf(this.f11901c.f12179j), this.f11901c);
    }
}
