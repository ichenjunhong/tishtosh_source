package com.bytedance.android.live.wallet.p260c;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.C4383d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.IWalletService.C4283a;
import com.bytedance.android.live.wallet.api.C4297c;
import com.bytedance.android.live.wallet.model.C4461a;
import com.bytedance.android.live.wallet.model.C4466e;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.p259b.C4312a;
import com.bytedance.android.live.wallet.p259b.C4327c;
import com.bytedance.android.live.wallet.p259b.C4327c.C4331b;
import com.bytedance.android.live.wallet.p264g.p265a.C4427c;
import com.bytedance.android.live.wallet.p264g.p266b.C4450a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4604n;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C8807k;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.wallet.c.b */
public final class C4337b extends C4345d implements C4450a {

    /* renamed from: A */
    private C1690c f11878A;

    /* renamed from: B */
    private OnClickListener f11879B = new C4344c(this);

    /* renamed from: a */
    C4427c f11880a;

    /* renamed from: b */
    ProgressBar f11881b;

    /* renamed from: c */
    View f11882c;

    /* renamed from: d */
    ImageView f11883d;

    /* renamed from: e */
    TextView f11884e;

    /* renamed from: f */
    TextView f11885f;

    /* renamed from: g */
    ImageView f11886g;

    /* renamed from: h */
    Activity f11887h;

    /* renamed from: i */
    public C4283a f11888i;

    /* renamed from: j */
    C4383d f11889j;

    /* renamed from: k */
    public final C4461a f11890k;

    /* renamed from: z */
    private String f11891z;

    /* renamed from: a */
    public final void mo10122a(int i) {
    }

    /* renamed from: a */
    public final void mo10126a(C8685b bVar) {
    }

    /* renamed from: c */
    public final void mo10131c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10130b() {
        this.f11890k.mo10274a(this.f11913s);
    }

    /* renamed from: d */
    public final void mo10132d() {
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.f11882c.setVisibility(8);
    }

    public final void show() {
        if (this.f11889j != null && this.f11915u != null) {
            super.show();
        }
    }

    /* renamed from: g */
    private void m10618g() {
        this.f11882c.setVisibility(8);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        C4575an.m10981a((int) R.string.e4j);
    }

    public final void dismiss() {
        super.dismiss();
        if (this.f11878A != null && !this.f11878A.isDisposed()) {
            this.f11878A.dispose();
        }
    }

    /* renamed from: e */
    public final void mo10134e() {
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        m10617b(false);
        this.f11886g.setImageResource(R.drawable.bxx);
        this.f11885f.setText(R.string.e_t);
        this.f11884e.setText(R.string.exm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10121a() {
        if (this.f11915u != null) {
            this.f11909o.setText(C3922z.m9905a((int) R.string.exy, Float.valueOf(((float) this.f11915u.f23689c) / 100.0f)));
            if (this.f11916v == null || this.f11916v == C8807k.DIAMOND) {
                this.f11910p.setText(String.valueOf(this.f11915u.f23691e));
                if (this.f11883d != null) {
                    this.f11883d.setVisibility(0);
                }
            } else {
                TextView textView = this.f11910p;
                StringBuilder sb = new StringBuilder();
                sb.append(C3922z.m9903a((int) R.string.f0j));
                sb.append(C4604n.m11050a("%.2f", Float.valueOf(((float) this.f11915u.f23688b) / 100.0f)));
                textView.setText(sb);
                if (this.f11883d != null) {
                    this.f11883d.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10127a(Exception exc) {
        m10618g();
    }

    /* renamed from: a */
    public final void mo10125a(C4383d dVar) {
        String str;
        this.f11889j = dVar;
        if (this.f11889j.mo10211b() == 10001) {
            str = "card_ticket";
        } else {
            str = "guard";
        }
        this.f11907m = str;
    }

    /* renamed from: a */
    private void m10616a(boolean z) {
        if (z) {
            setCancelable(false);
            setCanceledOnTouchOutside(false);
            m10617b(true);
        } else {
            m10617b(false);
        }
        if (this.f11889j != null) {
            this.f11889j.mo10210a().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C1710e<C4177d<C4466e>>() {
                public final /* synthetic */ void accept(Object obj) throws Exception {
                    if (((C4466e) ((C4177d) obj).data).f12196a == 0) {
                        C4337b bVar = C4337b.this;
                        if (bVar.f11888i != null) {
                            bVar.f11888i.mo10028a(bVar, bVar.f11889j);
                        }
                        bVar.dismiss();
                        return;
                    }
                    C4337b.this.mo10134e();
                }
            }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
                public final /* synthetic */ void accept(Object obj) throws Exception {
                    Throwable th = (Throwable) obj;
                    C4337b.this.mo10134e();
                }
            });
        }
    }

    /* renamed from: b */
    private void m10617b(boolean z) {
        this.f11882c.setVisibility(0);
        if (z) {
            this.f11881b.setVisibility(0);
            this.f11884e.setVisibility(8);
            this.f11885f.setVisibility(8);
            this.f11886g.setVisibility(8);
            return;
        }
        this.f11881b.setVisibility(8);
        this.f11885f.setVisibility(0);
        this.f11886g.setVisibility(0);
        this.f11884e.setVisibility(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10124a(View view) {
        String str;
        String str2;
        if (this.f11916v != null) {
            C4525b.f12383az.mo10346a(this.f11916v.name());
            switch (this.f11916v) {
                case WEIXIN:
                    str = "weixin";
                    str2 = "wxpay";
                    break;
                case ALIPAY:
                    str = "Alipay";
                    str2 = "alipay";
                    break;
                case FIRE:
                    str = "balance";
                    str2 = "balance";
                    break;
                default:
                    str = "TEST";
                    str2 = "TEST";
                    break;
            }
            new HashMap().put("lable", str);
            HashMap hashMap = new HashMap();
            hashMap.put("lable", String.valueOf(this.f11915u.f23691e));
            C8049c.m15979a().mo14202a("recharge_list", hashMap, C8059j.class, Room.class);
            if (!TextUtils.equals("balance", str2)) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("request_page", this.f11891z);
                hashMap2.put("charge_reason", this.f11907m);
                hashMap2.put("money", String.valueOf(this.f11915u.f23691e + this.f11915u.f23692f));
                hashMap2.put("pay_method", str2);
                C8049c.m15979a().mo14202a("livesdk_recharge_pay", hashMap2, C8059j.class, Room.class);
            }
            if (this.f11915u != null && this.f11916v != null) {
                if (this.f11916v == C8807k.DIAMOND) {
                    m10616a(true);
                    return;
                }
                C4427c cVar = this.f11880a;
                ChargeDeal chargeDeal = this.f11915u;
                C8807k kVar = this.f11916v;
                if (cVar.f12072c.f11857b == C4331b.CONNECTED) {
                    C4327c cVar2 = cVar.f12072c;
                    C4450a aVar = (C4450a) cVar.mo8518c();
                    Activity activity = cVar.f12070a;
                    JSONObject jSONObject = cVar.f12071b;
                    String str3 = cVar.f12073d.f11874f;
                    if (cVar2.f11859d != null) {
                        C4312a aVar2 = cVar2.f11859d;
                        if (!aVar2.f11813i && chargeDeal != null && !TextUtils.isEmpty(chargeDeal.f23693g) && aVar2.f11817m == null) {
                            aVar2.f11809e = aVar;
                            aVar2.f11812h = jSONObject;
                            aVar2.f11817m = chargeDeal.f23693g;
                            aVar2.f11818n.f11844a = activity;
                            aVar2.f11818n.f11845b = chargeDeal.f23687a;
                            aVar2.f11818n.f11850g = chargeDeal.f23691e;
                            if (aVar2.f11809e != null) {
                                aVar2.f11809e.mo10122a((int) R.string.e8w);
                            }
                            aVar2.f11816l = SystemClock.uptimeMillis();
                            if (str3 == null) {
                                str3 = "";
                            }
                            aVar2.f11810f.mo10070a(chargeDeal.f23687a, C8807k.GOOGLE, str3).mo6505a((C1710e<? super T>) new C1710e<C8685b>() {
                                public final /* synthetic */ void accept(Object obj) throws Exception {
                                    C8685b bVar = (C8685b) obj;
                                    if (C4312a.this.f11808d != null) {
                                        Message obtain = Message.obtain();
                                        obtain.what = BaseNotice.COMMENT_REPLY_WITH_VIDEO;
                                        obtain.obj = bVar;
                                        C4312a.this.f11808d.sendMessage(obtain);
                                    }
                                }
                            }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
                                public final /* synthetic */ void accept(Object obj) throws Exception {
                                    Throwable th = (Throwable) obj;
                                    if (C4312a.this.f11808d != null) {
                                        Message obtain = Message.obtain();
                                        obtain.what = BaseNotice.COMMENT_REPLY_WITH_VIDEO;
                                        if (!(th instanceof Exception)) {
                                            th = new Exception(th);
                                        }
                                        obtain.obj = th;
                                        C4312a.this.f11808d.sendMessage(obtain);
                                    }
                                }
                            });
                        }
                    }
                    return;
                }
                cVar.f12074e.mo10117a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11881b = (ProgressBar) findViewById(R.id.dr1);
        this.f11882c = findViewById(R.id.yt);
        this.f11884e = (TextView) findViewById(R.id.d8f);
        this.f11883d = (ImageView) findViewById(R.id.b01);
        this.f11885f = (TextView) findViewById(R.id.d8g);
        this.f11886g = (ImageView) findViewById(R.id.azg);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f11910p.getLayoutParams();
        marginLayoutParams.topMargin = C3922z.m9899a(34.0f);
        this.f11910p.setLayoutParams(marginLayoutParams);
        this.f11878A = ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10089a().mo6545f((C1710e<? super T>) new C1710e<Long>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                Long l = (Long) obj;
                if (C4337b.this.f11890k != null) {
                    C4461a aVar = C4337b.this.f11890k;
                    aVar.mo10275a(aVar.mo10137a());
                    aVar.mo10138b();
                }
            }
        });
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
        C4427c cVar = new C4427c(this.f11887h, new C4297c() {
        }, this.f11907m, this.f11891z, 0);
        this.f11880a = cVar;
        this.f11880a.mo8520a((C4450a) this);
        this.f11909o.setVisibility(8);
        this.f11914t.setOnClickListener(this.f11879B);
        this.f11918x.put(Long.valueOf(this.f11890k.f12179j), this.f11890k);
        this.f11890k.f12187r = this.f11906l;
        HashMap hashMap = new HashMap();
        if (this.f11915u != null) {
            hashMap.put("money", String.valueOf(this.f11915u.f23691e + this.f11915u.f23692f));
        }
        hashMap.put("request_page", this.f11891z);
        if (this.f11889j != null) {
            hashMap.put("charge_reason", this.f11907m);
        }
        C8049c.m15979a().mo14202a("livesdk_check_out_show", hashMap, C8059j.class, Room.class);
    }

    /* renamed from: a */
    public final boolean mo10129a(String str) {
        try {
            mo10141a((ChargeDeal) C2942b.m8369a().mo34884a(str, ChargeDeal.class));
            if (this.f11915u != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C3831a.m9714b("ConsumeDialog", (Throwable) e);
            return false;
        }
    }

    public C4337b(Activity activity, String str) {
        super(activity, false, "", str);
        C43381 r2 = new C4461a(-1, R.drawable.bx0, R.drawable.bx1, C3922z.m9903a((int) R.string.ext), C8807k.DIAMOND) {
            /* renamed from: a */
            public final boolean mo10137a() {
                if (((long) C4337b.this.f11915u.f23691e) <= ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10092b()) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public final void mo10138b() {
                if (mo10137a()) {
                    this.f12183n = C3922z.m9905a((int) R.string.e9p, Long.valueOf(((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10092b()));
                } else {
                    this.f12183n = C3922z.m9903a((int) R.string.e9o);
                }
                this.f12174e.setText(this.f12183n);
                this.f12174e.setVisibility(0);
            }
        };
        this.f11890k = r2;
        this.f11891z = str;
        this.f11887h = activity;
    }

    /* renamed from: a */
    public final void mo10123a(int i, CheckOrderOriginalResult checkOrderOriginalResult) {
        ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14535e().mo6158b();
        m10617b(false);
        this.f11886g.setImageResource(R.drawable.bxy);
        this.f11885f.setText(R.string.e4r);
        this.f11884e.setText(R.string.ez5);
        m10616a(false);
    }

    /* renamed from: a */
    public final void mo10128a(Exception exc, int i) {
        m10618g();
    }
}
