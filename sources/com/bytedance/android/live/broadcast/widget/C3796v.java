package com.bytedance.android.live.broadcast.widget;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.effect.C3236c;
import com.bytedance.android.live.broadcast.effect.C3251f.C3252a;
import com.bytedance.android.live.broadcast.effect.C3256i;
import com.bytedance.android.live.broadcast.effect.C3266p;
import com.bytedance.android.live.broadcast.effect.C3266p.C3271a;
import com.bytedance.android.live.broadcast.effect.p204a.C3198a.C3199a;
import com.bytedance.android.live.broadcast.effect.p205b.p206a.C3213b;
import com.bytedance.android.live.broadcast.p201c.C3150a;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.dialog.C4220b.C4221a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.chatroom.event.C5206y;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p385j.p387b.C7705a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8681d;
import com.bytedance.android.livesdkapi.depend.p438f.C8630a;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.ies.p672e.C10753b;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.live.broadcast.widget.v */
public final class C3796v implements OnClickListener, C3271a {

    /* renamed from: a */
    TextView f10729a;

    /* renamed from: b */
    ImageView f10730b;

    /* renamed from: c */
    View f10731c;

    /* renamed from: d */
    CheckedTextView f10732d;

    /* renamed from: e */
    public C8681d f10733e;

    /* renamed from: f */
    C3846a f10734f;

    /* renamed from: g */
    C10753b f10735g;

    /* renamed from: h */
    Game f10736h;

    /* renamed from: i */
    boolean f10737i;

    /* renamed from: j */
    private View f10738j;

    /* renamed from: k */
    private View f10739k;

    /* renamed from: l */
    private View f10740l;

    /* renamed from: m */
    private ImageView f10741m;

    /* renamed from: n */
    private TextView f10742n;

    /* renamed from: o */
    private C6736d f10743o;

    /* renamed from: p */
    private View f10744p;

    /* renamed from: q */
    private C8710m f10745q;

    /* renamed from: r */
    private TextView f10746r;

    /* renamed from: s */
    private C3199a f10747s;

    /* renamed from: c */
    private boolean m9652c() {
        C3009i a = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
        if (!C8607a.f23572a && a != null && a.isEnableShowCommerceSale()) {
            if (this.f10745q == C8710m.VIDEO) {
                return true;
            }
            C8710m mVar = this.f10745q;
            C8710m mVar2 = C8710m.THIRD_PARTY;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo9169b() {
        if (this.f10740l != null) {
            C3009i a = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
            if (m9652c()) {
                this.f10740l.setVisibility(0);
                ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).liveCommerceService().mo9607b(Long.valueOf(a.getId())).mo6505a((C1710e<? super T>) new C3799x<Object>(this), (C1710e<? super Throwable>) new C3800y<Object>(this));
                return;
            }
            this.f10740l.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9167a() {
        C3009i a = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
        if (a != null) {
            C8630a aVar = new C8630a("has_show_commodity_dialog", Boolean.valueOf(false));
            if (((Boolean) aVar.mo10345a()).booleanValue()) {
                ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).liveCommerceService().mo9605a(Long.valueOf(a.getId())).mo6505a((C1710e<? super T>) new C3747ae<Object>(this), (C1710e<? super Throwable>) new C3748af<Object>(this));
            } else {
                new C4221a(this.f10734f.getActivity()).mo9684a((int) R.string.esv).mo9693b((int) R.string.esu).mo9685a((int) R.string.est, (DialogInterface.OnClickListener) new C3749ag(this, aVar)).mo9694b(R.string.ess, C3750ah.f10619a).mo9691a(false).mo9692a().show();
            }
        }
    }

    public final void onEvent(C5206y yVar) {
        mo9169b();
    }

    /* renamed from: a */
    public final void mo9168a(int i) {
        this.f10744p.setVisibility(i);
        this.f10746r.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo8592a(boolean z) {
        if (z) {
            if (C3266p.m8943a().mo8636d()) {
                this.f10739k.setVisibility(0);
            } else {
                this.f10739k.setVisibility(8);
            }
            if (this.f10733e != null && ((Integer) C4525b.f12317M.mo10345a()).intValue() > 0) {
                this.f10733e.mo8948b(((Integer) C4525b.f12317M.mo10345a()).intValue());
            }
        }
    }

    public final void onClick(View view) {
        C3256i iVar;
        int id = view.getId();
        if (id == R.id.clm) {
            C8049c.m15979a().mo14203a("live_take_beauty_click", new C8059j().mo14214b("live_take").mo14213a("live_take_page").mo14218f("click"));
            if (!((Boolean) LiveConfigSettingKeys.LIVE_ENABLE_SMALL_ITEM_BEAUTY.mo9431a()).booleanValue()) {
                if (this.f10743o == null) {
                    this.f10743o = C3236c.m8869a(new C3252a() {
                        /* renamed from: a */
                        public final void mo8582a(float f) {
                            if (C3796v.this.f10733e != null) {
                                C3796v.this.f10733e.mo8943a(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a * f);
                            }
                        }

                        /* renamed from: b */
                        public final void mo8583b(float f) {
                            if (C3796v.this.f10733e != null) {
                                C3796v.this.f10733e.mo8947b(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21201b.f21205a * f);
                            }
                        }

                        /* renamed from: c */
                        public final void mo8584c(float f) {
                            if (C3796v.this.f10733e != null) {
                                C3796v.this.f10733e.mo8949c(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21202c.f21205a * f);
                            }
                        }

                        /* renamed from: d */
                        public final void mo8585d(float f) {
                            if (C3796v.this.f10733e != null) {
                                C3796v.this.f10733e.mo8950d(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21203d.f21205a * f);
                            }
                        }
                    }, this.f10747s, true, 0, false);
                    ((C3236c) this.f10743o).f9349a = new C3743aa(this);
                }
                this.f10743o.show(this.f10734f.getChildFragmentManager(), "beauty_filter_dialog_tag");
            } else if (!C3752aj.m9596a(C3922z.m9915e())) {
                C4575an.m10981a((int) R.string.f1k);
            } else if (this.f10734f != null) {
                this.f10743o = C3395f.m9156f().mo8741b().mo8552a(this.f10734f.getActivity(), Boolean.valueOf(false));
                C3213b bVar = (C3213b) this.f10743o;
                C3798w wVar = new C3798w(this);
                C52711k.m112240b(wVar, "onDismissListener");
                bVar.f9308b = wVar;
            }
            mo9168a(8);
        } else if (id == R.id.clq) {
            C8049c.m15979a().mo14203a("live_take_filter_click", new C8059j().mo14214b("live_take").mo14213a("live_take_page").mo14218f("click"));
            if (this.f10734f.isAdded() && this.f10734f.getChildFragmentManager().mo2224a("filter_dialog_tag") == null) {
                String str = "";
                if (this.f10733e != null) {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    iVar = C3256i.m8925a(this.f10747s, str, true, true);
                } else {
                    iVar = C3256i.m8926a(this.f10747s, C3266p.m8943a().f9434b, true);
                }
                iVar.f9408c = new C3744ab(this);
                iVar.show(this.f10734f.getChildFragmentManager(), "filter_dialog_tag");
                mo9168a(8);
            }
        } else if (id == R.id.clx) {
            Boolean valueOf = Boolean.valueOf(!((Boolean) this.f10738j.getTag(R.id.d5k)).booleanValue());
            this.f10738j.setTag(R.id.d5k, valueOf);
            Boolean bool = (Boolean) this.f10738j.getTag(R.id.d5k);
            if (bool == null) {
                bool = Boolean.valueOf(this.f10735g.mo19444a("hotsoon.pref.LAST_SET_LANDSCAPE", true));
                this.f10738j.setTag(R.id.d5k, bool);
            }
            if (!bool.booleanValue()) {
                this.f10741m.setImageResource(R.drawable.c01);
                this.f10742n.setText(R.string.eta);
            } else {
                this.f10741m.setImageResource(R.drawable.c00);
                this.f10742n.setText(R.string.et8);
            }
            this.f10735g.mo19441a("hotsoon.pref.LAST_SET_LANDSCAPE", (Object) valueOf).mo19443a();
        } else if (id == R.id.clr) {
            Game game = this.f10736h;
            C3150a aVar = new C3150a();
            aVar.f9176c = game;
            C3745ac acVar = new C3745ac(this, aVar);
            aVar.f9177d = acVar;
            if (aVar.f9175b != null) {
                aVar.f9175b.f9186b = acVar;
            }
            aVar.f9174a = new C3746ad(this);
            aVar.show(this.f10734f.getChildFragmentManager(), C3150a.class.getSimpleName());
            mo9168a(8);
        } else if (id == R.id.cln) {
            mo9167a();
        }
    }
}
