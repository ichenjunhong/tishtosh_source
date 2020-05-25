package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.AnimatorSet;
import android.arch.lifecycle.C0199s;
import android.content.DialogInterface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.p030v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.SubscriptSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.p194a.C3036b;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4629a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4630b;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4631c;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.C4632d;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5556fq;
import com.bytedance.android.livesdk.chatroom.interact.p319h.C5556fq.C5557a;
import com.bytedance.android.livesdk.chatroom.model.C5745d;
import com.bytedance.android.livesdk.chatroom.p307c.C5038d;
import com.bytedance.android.livesdk.chatroom.p307c.C5044e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.C7211h;
import com.bytedance.android.livesdk.gift.assets.C7214j;
import com.bytedance.android.livesdk.gift.effect.p359b.C7328a;
import com.bytedance.android.livesdk.gift.effect.p359b.C7329b;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4574am;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4594h;
import com.bytedance.android.livesdk.p279af.C4594h.C4596b;
import com.bytedance.android.livesdk.p279af.p280a.C4551a;
import com.bytedance.android.livesdk.p300c.C4961a;
import com.bytedance.android.livesdk.p399o.C8028a;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdk.widget.GradientTextView;
import com.bytedance.android.livesdk.widget.PKProgressBar;
import com.bytedance.android.livesdkapi.depend.model.live.C8722v;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.KVData;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.trill.R;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;

public class LinkPKWidget extends SubWidget implements C0199s<KVData>, OnClickListener, C5557a {

    /* renamed from: A */
    private LinkPkTaskWidget f17216A;

    /* renamed from: B */
    private C3036b f17217B;

    /* renamed from: C */
    private C7329b f17218C;

    /* renamed from: D */
    private Random f17219D;

    /* renamed from: d */
    TextView f17220d;

    /* renamed from: e */
    ImageView f17221e;

    /* renamed from: f */
    TextView f17222f;

    /* renamed from: g */
    ImageView f17223g;

    /* renamed from: h */
    SimpleDraweeView f17224h;

    /* renamed from: i */
    View f17225i;

    /* renamed from: j */
    AnimatorSet f17226j;

    /* renamed from: k */
    AnimatorSet f17227k;

    /* renamed from: l */
    C5556fq f17228l;

    /* renamed from: m */
    private View f17229m;

    /* renamed from: n */
    private ViewGroup f17230n;

    /* renamed from: o */
    private GradientTextView f17231o;

    /* renamed from: p */
    private ImageView f17232p;

    /* renamed from: q */
    private ImageView f17233q;

    /* renamed from: r */
    private TextView f17234r;

    /* renamed from: s */
    private C8548h f17235s;

    /* renamed from: t */
    private C5044e f17236t;

    /* renamed from: u */
    private C5038d<PKProgressBar> f17237u;

    /* renamed from: v */
    private C5038d<TextView> f17238v;

    /* renamed from: w */
    private C8548h f17239w;

    /* renamed from: x */
    private boolean f17240x;

    /* renamed from: y */
    private boolean f17241y;

    /* renamed from: z */
    private C1690c f17242z;

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.aq5;
    }

    /* renamed from: c */
    public final void mo11471c() {
        if (isViewValid()) {
            C4575an.m10981a((int) R.string.ej7);
        }
    }

    /* renamed from: d */
    public final void mo11472d() {
        C9432q.m18691b(this.f17229m, 0);
        C9432q.m18691b((View) this.f17237u.f13491b, 0);
    }

    /* renamed from: h */
    private void m13673h() {
        if (!(!this.f17154c || this.f17218C == null || this.f17217B == null)) {
            C7328a a = this.f17217B.mo8250a();
            if (a != null && a.f19956a == this.f17218C.f19956a) {
                this.f17217B.mo8252b();
            }
        }
        this.f17152a.f12609D = C4630b.HIDE;
        this.f17218C = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo12439e() {
        if (!this.f17154c) {
            this.f17241y = true;
            StringBuilder sb = new StringBuilder("onAdjustUiToVideoPosition :");
            sb.append(this.f17152a.f12621l);
            this.f17152a.lambda$put$1$DataCenter("cmd_log_link", sb.toString());
            if (this.f17152a.f12621l != 0) {
                m13670a((C4177d) this.f17152a.get("data_pk_current_room_interact_info"));
            }
            this.f17152a.f12608C = null;
        }
    }

    public void onDestroy() {
        this.f17228l.mo8247a();
        this.f17152a.removeObserver(this);
        this.f17236t.mo10906a();
        if (this.f17242z != null) {
            this.f17242z.dispose();
        }
        if (this.f17216A != null) {
            this.f17216A.mo12442c();
        }
        super.onDestroy();
    }

    /* renamed from: g */
    private void m13672g() {
        ((PKProgressBar) this.f17237u.f13491b).setVisibility(0);
        this.f17229m.setVisibility(0);
        if (((Integer) this.f17152a.get("data_pk_battle_mode", Integer.valueOf(0))).intValue() == 0) {
            this.f17230n.setVisibility(0);
        }
        StringBuilder sb = new StringBuilder("show success :");
        sb.append(this.f17230n.getVisibility());
        this.f17152a.lambda$put$1$DataCenter("cmd_log_link", sb.toString());
        this.f17152a.lambda$put$1$DataCenter("cmd_pk_show_interface", new C5745d());
    }

    /* renamed from: a */
    public final void mo11468a() {
        if (isViewValid()) {
            if (this.f17239w == null) {
                this.f17239w = new C8552a(this.context).mo15012d((int) R.string.eiz).mo15008c((int) R.string.ej8).mo15003b(0, (int) R.string.eiw, (DialogInterface.OnClickListener) new C6520da(this)).mo15003b(1, (int) R.string.elq, (DialogInterface.OnClickListener) new C6521db(this)).mo15001b();
            }
            if (!this.f17239w.isShowing()) {
                this.f17239w.show();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo12440f() {
        C4632d dVar = (C4632d) LinkCrossRoomDataHolder.m11103a().get("data_pk_state");
        if (dVar == C4632d.PK) {
            if (!((String) C4525b.f12438l.mo10345a()).equals(C4574am.m10979b(System.currentTimeMillis()))) {
                C4525b.f12340aI.mo10346a(Integer.valueOf(((Integer) C4525b.f12437k.mo10345a()).intValue()));
                C4525b.f12438l.mo10346a(C4574am.m10979b(System.currentTimeMillis()));
            } else if (((Integer) C4525b.f12340aI.mo10345a()).intValue() <= 0) {
                C4575an.m10981a((int) R.string.ejb);
                return;
            }
        }
        if (this.f17235s == null) {
            this.f17235s = new C8552a(this.context, 0).mo15013d((CharSequence) C3922z.m9903a((int) R.string.ejh)).mo15003b(0, (int) R.string.ehc, (DialogInterface.OnClickListener) new C6524de(this, dVar)).mo15003b(1, (int) R.string.e45, C6525df.f17838a).mo15001b();
        }
        if (dVar == C4632d.PK) {
            TextView textView = this.f17235s.f23443a;
            textView.setGravity(17);
            textView.setVisibility(8);
            String a = C3922z.m9905a((int) R.string.eji, C4525b.f12340aI.mo10345a(), C4525b.f12436j.mo10345a());
            String[] split = a.split("\n");
            int length = split[split.length - 1].length();
            SpannableString spannableString = new SpannableString(a);
            spannableString.setSpan(new ForegroundColorSpan(this.context.getResources().getColor(R.color.ag7)), 0, spannableString.length() - length, 17);
            spannableString.setSpan(new ForegroundColorSpan(this.context.getResources().getColor(R.color.ab2)), (spannableString.length() - length) - 1, spannableString.length(), 17);
            spannableString.setSpan(new SubscriptSpan(), (spannableString.length() - length) - 1, spannableString.length(), 17);
            spannableString.setSpan(new RelativeSizeSpan(1.1428572f), (spannableString.length() - length) - 1, spannableString.length(), 17);
            this.f17235s.mo14983a((CharSequence) spannableString);
            this.f17235s.f23444b.setLineSpacing(0.0f, 1.1f);
            this.f17235s.f23444b.setGravity(17);
            this.f17235s.f23444b.setVisibility(0);
        } else {
            this.f17235s.f23443a.setGravity(8388611);
            this.f17235s.setTitle((int) R.string.ejh);
            this.f17235s.f23443a.setVisibility(0);
            this.f17235s.f23444b.setVisibility(8);
        }
        if (!this.f17235s.isShowing()) {
            this.f17235s.show();
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f17229m = this.contentView.findViewById(R.id.kf);
        this.f17231o = (GradientTextView) this.contentView.findViewById(R.id.ddo);
        this.f17230n = (ViewGroup) this.contentView.findViewById(R.id.b_d);
        this.f17225i = this.contentView.findViewById(R.id.zr);
        this.f17224h = (SimpleDraweeView) this.contentView.findViewById(R.id.b31);
        this.f17220d = (TextView) this.contentView.findViewById(R.id.da1);
        this.f17221e = (ImageView) this.contentView.findViewById(R.id.b13);
        this.f17222f = (TextView) this.contentView.findViewById(R.id.did);
        this.f17223g = (ImageView) this.contentView.findViewById(R.id.b5b);
        this.f17234r = (TextView) this.contentView.findViewById(R.id.d6s);
        this.f17234r.setOnClickListener(this);
        this.f17232p = (ImageView) this.contentView.findViewById(R.id.b33);
        this.f17233q = (ImageView) this.contentView.findViewById(R.id.b1w);
        this.f17229m.setVisibility(4);
        this.f17236t = new C5044e(this.f17152a, this.contentView);
        this.f17237u = this.f17236t.mo10905a(R.id.by3).mo10900a(C6513cu.f17825a).mo10901a("data_pk_anchor_score", C6514cv.f17826a).mo10901a("data_pk_guest_score", C6517cy.f17829a).mo10902a();
        this.f17238v = this.f17236t.mo10905a(R.id.dh7).mo10901a("data_pk_time_left", C6518cz.f17830a).mo10902a();
        this.f17152a.observe("data_pk_state", this).observe("data_link_state", this).observe("data_pk_result", this).observe("cmd_show_gift_task_info", this).observe("cmd_show_steal_tower_info", this).observe("data_pk_current_room_interact_info", this);
        this.f17228l = new C5556fq(this.dataCenter);
        this.f17228l.mo8520a((C5557a) this);
        enableSubWidgetManager();
        this.f17152a.lambda$put$1$DataCenter("cmd_log_link", "LinkPkWidget loaded");
        if (!this.f17154c && this.f17152a.f12608C != null) {
            mo12439e();
        }
    }

    /* renamed from: a */
    public final void mo11469a(String str) {
        this.f17231o.setVisibility(8);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.d6s) {
            this.f17228l.mo11463b();
        }
    }

    /* renamed from: b */
    private void m13671b(String str) {
        C4104a.m10232a((FragmentActivity) this.context, C4514j.m10883j().mo10322c().mo10487a(C4704c.m11226a(str).mo10510a(280).mo10514b(384)));
    }

    /* renamed from: a */
    public final void mo12438a(Uri uri) {
        this.f17224h.setController(((C13773e) C13771c.m27870a().mo25725b(uri).mo25762c(true)).mo25763d());
        this.f17224h.setVisibility(0);
        this.f17242z = C2201v.m6592a(2000, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C6515cw<Object>(this), (C1710e<? super Throwable>) new C6516cx<Object>(this));
    }

    /* renamed from: a */
    private void m13670a(C4177d<C8722v> dVar) {
        if (this.f17241y) {
            this.f17241y = false;
            long a = (C4551a.m10939a() - this.f17152a.f12621l) / 1000;
            StringBuilder sb = new StringBuilder("onPkInfoUpdated duration:");
            sb.append(this.f17152a.f12619j);
            sb.append(", timePast");
            sb.append(a);
            sb.append(", penaltyDuration");
            sb.append(this.f17152a.f12629t);
            this.f17152a.lambda$put$1$DataCenter("cmd_log_link", sb.toString());
            if (this.f17152a.f12619j > 0 && a < ((long) (this.f17152a.f12619j + this.f17152a.f12629t))) {
                m13672g();
                if (a >= ((long) this.f17152a.f12619j)) {
                    return;
                }
                if (!this.f17152a.f12610E.f12649h || !this.f17152a.f12610E.f12647f) {
                    this.f17231o.setVisibility(8);
                    mo11470a(false);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11470a(boolean z) {
        long j;
        if (this.f17240x || this.f17154c || z) {
            this.f17240x = false;
            C63101 r6 = new C7214j() {
                /* renamed from: a */
                public final void mo8669a(Throwable th) {
                    LinkPKWidget.this.mo12438a(Uri.parse("asset://com.ss.android.ies.live.sdk/pk_animation.webp"));
                }

                /* renamed from: a */
                public final void mo8668a(long j, String str) {
                    String str2;
                    C4596b a = C4594h.m11029a(str);
                    if (a != null) {
                        str2 = a.mo10396a(LinkPKWidget.this.context);
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        LinkPKWidget.this.mo12438a(new Builder().scheme("file").path(str2).build());
                        return;
                    }
                    LinkPKWidget.this.mo12438a(Uri.parse("asset://com.ss.android.ies.live.sdk/pk_animation.webp"));
                }
            };
            if (LiveSettingKeys.ASSET_ANIM_ID_MAP.mo9431a() == null) {
                j = 0;
            } else {
                j = ((C4961a) LiveSettingKeys.ASSET_ANIM_ID_MAP.mo9431a()).f13301a;
            }
            C7211h assetsManager = ((IGiftService) C4116c.m10249a(IGiftService.class)).getAssetsManager();
            if (assetsManager != null) {
                AssetsModel c = assetsManager.mo13434c(j);
                if (c == null) {
                    C8028a.m15932a("资源列表中找不到这个PK特效", String.valueOf(j));
                    mo12438a(Uri.parse("asset://com.ss.android.ies.live.sdk/pk_animation.webp"));
                    return;
                } else if (c.getResourceType() != 6) {
                    C8028a.m15932a("获取到的特效资源不是PK特效", String.valueOf(j));
                    mo12438a(Uri.parse("asset://com.ss.android.ies.live.sdk/pk_animation.webp"));
                    return;
                } else {
                    assetsManager.mo13428a(j, r6, 4);
                }
            }
            return;
        }
        this.f17240x = true;
    }

    public /* synthetic */ void onChanged(Object obj) {
        C7329b bVar;
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            switch (key.hashCode()) {
                case -2082923311:
                    if (key.equals("cmd_show_steal_tower_info")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1692693464:
                    if (key.equals("data_pk_current_room_interact_info")) {
                        c = 1;
                        break;
                    }
                    break;
                case 855900630:
                    if (key.equals("cmd_show_gift_task_info")) {
                        c = 3;
                        break;
                    }
                    break;
                case 872172481:
                    if (key.equals("data_link_state")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1505611330:
                    if (key.equals("data_pk_state")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    C4632d dVar = (C4632d) kVData.getData();
                    if (dVar == C4632d.PK) {
                        if (this.f17154c) {
                            m13672g();
                            if (this.f17225i.getHeight() == 0) {
                                int a = C9432q.m18670a(getContext());
                                C9432q.m18679a(this.f17225i, a, (int) (((((float) (a / 2)) * 1.0f) / 9.0f) * 13.0f));
                            }
                        }
                        this.f17221e.setVisibility(8);
                        this.f17223g.setVisibility(8);
                        ((TextView) this.f17238v.f13491b).setVisibility(0);
                        this.f17220d.setVisibility(8);
                        this.f17222f.setVisibility(8);
                        this.f17232p.setVisibility(0);
                        this.f17233q.setVisibility(8);
                        this.f17231o.setVisibility(8);
                        this.f17234r.setVisibility(8);
                        if (this.f17239w != null && this.f17239w.isShowing()) {
                            this.f17239w.dismiss();
                        }
                    } else if (dVar == C4632d.PENAL) {
                        if (isViewValid()) {
                            this.f17231o.setGradient(false);
                            this.f17231o.setText(C3922z.m9903a((int) R.string.ekj));
                            this.f17231o.setVisibility(0);
                            this.f17232p.setVisibility(8);
                            this.f17233q.setVisibility(8);
                            C4631c cVar = (C4631c) this.f17152a.get("data_pk_result");
                            if (cVar == C4631c.EVEN) {
                                this.f17221e.setImageResource(R.drawable.bxa);
                                this.f17223g.setImageResource(R.drawable.bxa);
                            } else if (cVar == C4631c.LEFT_WON) {
                                this.f17221e.setImageResource(R.drawable.bxb);
                                this.f17223g.setImageResource(R.drawable.bxc);
                            } else {
                                this.f17221e.setImageResource(R.drawable.bxc);
                                this.f17223g.setImageResource(R.drawable.bxb);
                            }
                            this.f17220d.setText(String.valueOf(((PKProgressBar) this.f17237u.f13491b).getRightValue()));
                            this.f17222f.setText(String.valueOf(((PKProgressBar) this.f17237u.f13491b).getLeftValue()));
                            this.f17223g.setScaleX(1.0f);
                            this.f17223g.setScaleY(1.0f);
                            this.f17223g.setTranslationX(0.0f);
                            this.f17223g.setTranslationY(0.0f);
                            this.f17221e.setScaleX(1.0f);
                            this.f17221e.setScaleY(1.0f);
                            this.f17221e.setTranslationX(0.0f);
                            this.f17221e.setTranslationY(0.0f);
                            this.f17222f.setVisibility(0);
                            this.f17220d.setVisibility(0);
                            this.f17223g.setVisibility(0);
                            this.f17221e.setVisibility(0);
                            if (this.f17154c) {
                                if (this.f17152a.f12627r == 0) {
                                    this.f17234r.setVisibility(0);
                                }
                                if (cVar == C4631c.RIGHT_WON) {
                                    if (this.f17217B == null) {
                                        this.f17217B = (C3036b) this.dataCenter.get("data_sticker_message_manager");
                                    }
                                    if (this.f17217B != null) {
                                        Integer[] numArr = (Integer[]) LiveConfigSettingKeys.PK_PANEL_STICKER.mo9431a();
                                        if (numArr != null && numArr.length > 0) {
                                            if (this.f17219D == null) {
                                                this.f17219D = new Random();
                                            }
                                            int intValue = numArr[this.f17219D.nextInt(numArr.length)].intValue();
                                            int intValue2 = ((Integer) LiveConfigSettingKeys.PK_PANEL_STICKER_DURATION.mo9431a()).intValue();
                                            long j = (long) intValue;
                                            String assetsPath = ((IGiftService) C4116c.m10249a(IGiftService.class)).getAssetsPath("effects", j);
                                            if (C9431p.m18664a(assetsPath)) {
                                                bVar = null;
                                            } else {
                                                bVar = (C7329b) new C7329b().mo13592d(false).mo13591d((long) intValue2).mo13578a(System.currentTimeMillis()).mo13585b(j).mo13582a(assetsPath).mo13583a(true);
                                            }
                                            this.f17218C = bVar;
                                            if (this.f17218C != null) {
                                                this.f17152a.f12609D = C4630b.SHOW;
                                                this.f17217B.mo8251a(this.f17218C);
                                                C7328a a2 = this.f17217B.mo8250a();
                                                if (!(a2 == null || a2.f19956a == this.f17218C.f19956a)) {
                                                    this.f17217B.mo8252b();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ((C4002ac) C2201v.m6592a(3, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) autoDispose())).mo9406a(new C6522dc(this), new C6523dd(this));
                        }
                    } else if (dVar == C4632d.FINISHED) {
                        this.f17223g.setVisibility(8);
                        this.f17221e.setVisibility(8);
                        PKProgressBar pKProgressBar = (PKProgressBar) this.f17237u.f13491b;
                        pKProgressBar.f23159d = 0;
                        pKProgressBar.f23160e = 0;
                        pKProgressBar.f23156a = 0.5f;
                        pKProgressBar.invalidate();
                        this.f17230n.setVisibility(0);
                        this.f17232p.setVisibility(8);
                        this.f17233q.setVisibility(0);
                        ((TextView) this.f17238v.f13491b).setVisibility(8);
                        this.f17231o.setText(C3922z.m9903a((int) R.string.ejt));
                        this.f17231o.setVisibility(0);
                        this.f17231o.setGradient(true);
                        ((PKProgressBar) this.f17237u.f13491b).setVisibility(8);
                        this.f17229m.setVisibility(8);
                        this.f17234r.setVisibility(8);
                        if (this.f17239w != null && this.f17239w.isShowing()) {
                            this.f17239w.dismiss();
                        }
                        this.f17152a.f12619j = 0;
                        if (this.f17152a.f12627r == 1) {
                            ((Boolean) C4525b.f12350aS.mo10345a()).booleanValue();
                        }
                    }
                    if (C4630b.SHOW == this.f17152a.f12609D && dVar != C4632d.PENAL) {
                        m13673h();
                        return;
                    }
                case 1:
                    m13670a((C4177d) kVData.getData());
                    return;
                case 2:
                    if (C4629a.UNLOADED.equals((C4629a) kVData.getData()) && this.f17152a.f12619j > 0) {
                        m13673h();
                        return;
                    }
                case 3:
                    m13671b("https://hotsoon.snssdk.com/falcon/live_inroom/page/pk_task_intro/index.html?show_task=true");
                    return;
                case 4:
                    m13671b("https://hotsoon.snssdk.com/falcon/live_inroom/page/pk_task_intro/index.html");
                    break;
            }
        }
    }

    LinkPKWidget(View view, ViewGroup viewGroup) {
        super(view, viewGroup);
        TTLiveSDKContext.getHostService().mo10310c().initImageLib();
    }
}
