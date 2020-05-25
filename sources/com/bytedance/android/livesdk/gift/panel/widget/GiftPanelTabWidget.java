package com.bytedance.android.livesdk.gift.panel.widget;

import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0198r;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p043v7.p044a.p045a.C1124a;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3865ac;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.gift.C7624q;
import com.bytedance.android.livesdk.gift.C7649u;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.schema.interfaces.C8260a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.Widget;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

public class GiftPanelTabWidget extends Widget implements OnClickListener {

    /* renamed from: a */
    View f20890a;

    /* renamed from: b */
    View f20891b;

    /* renamed from: c */
    long f20892c;

    /* renamed from: d */
    GiftDialogViewModel f20893d;

    /* renamed from: e */
    private TextView f20894e;

    /* renamed from: f */
    private TextView f20895f;

    /* renamed from: g */
    private TextView f20896g;

    /* renamed from: h */
    private TextView f20897h;

    /* renamed from: i */
    private TextView f20898i;

    /* renamed from: j */
    private TextView f20899j;

    /* renamed from: k */
    private View f20900k;

    /* renamed from: l */
    private View f20901l;

    /* renamed from: m */
    private boolean f20902m;

    /* renamed from: n */
    private View f20903n;

    /* renamed from: o */
    private boolean f20904o;

    public int getLayoutId() {
        return R.layout.aib;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f20893d != null) {
            this.f20893d.mo13948a(this);
        }
    }

    public void onCreate() {
        int i;
        C7595ao aoVar;
        C7595ao aoVar2;
        super.onCreate();
        if (this.dataCenter != null) {
            this.f20893d = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
            if (this.f20893d != null) {
                boolean z = false;
                if (this.f20893d.f20775h) {
                    this.contentView.setAlpha(0.3f);
                    this.contentView.setEnabled(false);
                }
                this.containerView.setVisibility(0);
                this.f20894e = (TextView) this.contentView.findViewById(R.id.d2l);
                this.f20895f = (TextView) this.contentView.findViewById(R.id.d2k);
                this.f20897h = (TextView) this.contentView.findViewById(R.id.d2m);
                this.f20898i = (TextView) this.contentView.findViewById(R.id.d2n);
                this.f20896g = (TextView) this.contentView.findViewById(R.id.d2o);
                this.f20900k = this.contentView.findViewById(R.id.c6p);
                this.f20890a = this.contentView.findViewById(R.id.c6o);
                this.f20901l = this.contentView.findViewById(R.id.a2t);
                Room room = (Room) this.dataCenter.get("data_room", null);
                boolean booleanValue = ((Boolean) this.dataCenter.get("data_is_anchor", Boolean.valueOf(false))).booleanValue();
                this.f20895f.setVisibility(8);
                TextView textView = this.f20896g;
                if (C7624q.m15620b(room, booleanValue)) {
                    i = 0;
                } else {
                    i = 8;
                }
                textView.setVisibility(i);
                this.f20897h.setVisibility(8);
                int a = C7624q.m15618a(room, booleanValue);
                if (a != 3) {
                    switch (a) {
                        case 0:
                            this.f20894e.setVisibility(0);
                            break;
                        case 1:
                            if (this.f20894e != null) {
                                Drawable b = C1124a.m3315b(this.context, R.drawable.bs2);
                                if (b != null) {
                                    b.setBounds(new Rect(0, 0, (int) C9432q.m18687b(this.context, 18.0f), (int) C9432q.m18687b(this.context, 18.0f)));
                                }
                                if (C4206c.m10426a(this.context)) {
                                    this.f20894e.setCompoundDrawables(b, null, null, null);
                                } else {
                                    this.f20894e.setCompoundDrawables(null, null, b, null);
                                }
                                this.f20902m = true;
                            }
                            GiftDialogViewModel giftDialogViewModel = this.f20893d;
                            if (C7624q.m15620b(room, booleanValue)) {
                                aoVar2 = C7595ao.PROP;
                            } else {
                                aoVar2 = C7595ao.GIFT;
                            }
                            giftDialogViewModel.f20774g = aoVar2;
                            break;
                    }
                } else {
                    this.f20894e.setVisibility(0);
                    GiftDialogViewModel giftDialogViewModel2 = this.f20893d;
                    if (this.f20896g.isShown()) {
                        aoVar = C7595ao.PROP;
                    } else {
                        aoVar = C7595ao.GIFT;
                    }
                    giftDialogViewModel2.f20774g = aoVar;
                }
                this.f20891b = this.contentView.findViewById(R.id.ak_);
                this.f20899j = (TextView) this.contentView.findViewById(R.id.bra);
                this.f20891b.setOnClickListener(new C7586af(this));
                this.f20901l.setVisibility(0);
                this.f20903n = this.contentView.findViewById(R.id.br_);
                User from = User.from(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a());
                if (!(from == null || from.getNobleLevelInfo() == null || from.getNobleLevelInfo().getNobleLevel() <= 0)) {
                    z = true;
                }
                this.f20904o = z;
                this.f20895f.setVisibility(8);
                this.f20903n.setVisibility(8);
                this.f20894e.setOnClickListener(this);
                this.f20895f.setOnClickListener(this);
                this.f20897h.setOnClickListener(this);
                this.f20896g.setOnClickListener(this);
                this.f20898i.setOnClickListener(this);
                this.f20903n.setOnClickListener(this);
                this.containerView.post(new C7587ag(this));
                this.f20893d.f20793z.observe(this, new C7588ah(this));
                if (((Boolean) C4525b.f12427by.mo10345a()).booleanValue()) {
                    mo13974a(true);
                }
                this.f20893d.f20777j.observe(this, new C7584ad(this));
                this.f20893d.f20778k.observe(this, new C7585ae(this));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13974a(boolean z) {
        int i;
        View view = this.f20900k;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    private void m15610a(float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20901l, "x", new float[]{this.f20901l.getX(), f});
        ofFloat.setDuration(200);
        ofFloat.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13973a(C7595ao aoVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        float f;
        if (this.f20893d.f20776i.getValue() != aoVar) {
            C0198r<Boolean> rVar = this.f20893d.f20756C;
            boolean z6 = true;
            if (aoVar == C7595ao.PROP) {
                z = true;
            } else {
                z = false;
            }
            rVar.postValue(Boolean.valueOf(z));
            TextView textView = this.f20894e;
            if (aoVar == C7595ao.GIFT) {
                z2 = true;
            } else {
                z2 = false;
            }
            m15611a(textView, z2);
            TextView textView2 = this.f20895f;
            if (aoVar == C7595ao.FANS_CLUB_GIFT) {
                z3 = true;
            } else {
                z3 = false;
            }
            m15611a(textView2, z3);
            TextView textView3 = this.f20897h;
            if (aoVar == C7595ao.HONOR_LEVEL_GIFT) {
                z4 = true;
            } else {
                z4 = false;
            }
            m15611a(textView3, z4);
            TextView textView4 = this.f20896g;
            if (aoVar == C7595ao.PROP) {
                z5 = true;
            } else {
                z5 = false;
            }
            m15611a(textView4, z5);
            TextView textView5 = this.f20898i;
            if (aoVar != C7595ao.NOBLE_GIFT) {
                z6 = false;
            }
            m15611a(textView5, z6);
            int width = this.f20901l.getWidth();
            switch (aoVar) {
                case GIFT:
                    f = this.f20894e.getX();
                    i = this.f20894e.getWidth();
                    break;
                case FANS_CLUB_GIFT:
                    f = this.f20895f.getX();
                    i = this.f20895f.getWidth();
                    break;
                case HONOR_LEVEL_GIFT:
                    f = this.f20897h.getX();
                    i = this.f20897h.getWidth();
                    break;
                case PROP:
                    f = this.f20896g.getX();
                    i = this.f20896g.getWidth();
                    break;
                case NOBLE_GIFT:
                    f = this.f20898i.getX();
                    i = this.f20898i.getWidth();
                    break;
                default:
                    return;
            }
            int i2 = (i - width) / 2;
            if (i2 < 0) {
                i2 = 0;
            }
            m15610a(f + ((float) i2));
            this.f20893d.f20785r.postValue(null);
            this.f20893d.f20786s.postValue(null);
            this.f20893d.f20780m.postValue(Boolean.valueOf(false));
            this.f20893d.f20776i.postValue(aoVar);
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        if (view.getId() == R.id.d2l) {
            if (this.f20902m) {
                C4575an.m10981a((int) R.string.e5c);
            } else {
                mo13973a(C7595ao.GIFT);
            }
        } else if (view.getId() == R.id.d2k) {
            mo13973a(C7595ao.FANS_CLUB_GIFT);
            if (((C4282a) C4116c.m10249a(C4282a.class)).user() != null) {
                str2 = String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b());
            } else {
                str2 = "";
            }
            HashMap hashMap = new HashMap();
            Room room = (Room) this.dataCenter.get("data_room", null);
            if (room != null) {
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("orientation", String.valueOf(room.getOrientation()));
            }
            hashMap.put("user_id", str2);
            C8049c.m15979a().mo14202a("fans_club_gift_show", hashMap, new C8059j(), Room.class);
        } else if (view.getId() == R.id.d2m) {
            mo13973a(C7595ao.HONOR_LEVEL_GIFT);
            if (((C4282a) C4116c.m10249a(C4282a.class)).user() != null) {
                str = String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b());
            } else {
                str = "";
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("user_id", str);
            C8049c.m15979a().mo14202a("level_gift_tab_click", hashMap2, new C8059j(), Room.class);
        } else if (view.getId() == R.id.d2o) {
            mo13973a(C7595ao.PROP);
            C7649u.m15656a().mo14017d();
            this.f20900k.setVisibility(8);
        } else if (view.getId() == R.id.d2n) {
            mo13973a(C7595ao.NOBLE_GIFT);
        } else {
            if (view.getId() == R.id.br_) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("type", "gift");
                C8049c.m15979a().mo14202a("livesdk_nobility_page_click", hashMap3, new Object[0]);
                ((C8260a) C4116c.m10249a(C8260a.class)).handle(this.context, Uri.parse((String) LiveConfigSettingKeys.LIVE_NOBLE_INTRODUCE_SCHEMA.mo9431a()).buildUpon().appendQueryParameter("status_bar_height", String.valueOf((int) C3922z.m9914e(C3865ac.m9795a(this.context)))).build());
            }
        }
    }

    /* renamed from: a */
    private void m15611a(TextView textView, boolean z) {
        int i;
        if (this.context != null) {
            Resources resources = this.context.getResources();
            if (z) {
                i = R.color.alt;
            } else {
                i = R.color.ahx;
            }
            textView.setTextColor(resources.getColor(i));
        }
    }
}
