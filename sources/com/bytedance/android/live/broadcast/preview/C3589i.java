package com.bytedance.android.live.broadcast.preview;

import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Message;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.Fragment;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.C3617q;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.dummy.BroadcastServiceDummy;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.bgbroadcast.BgBroadcastServiceImpl;
import com.bytedance.android.live.broadcast.effect.C3197a;
import com.bytedance.android.live.broadcast.effect.C3236c;
import com.bytedance.android.live.broadcast.effect.C3251f.C3252a;
import com.bytedance.android.live.broadcast.effect.C3261l;
import com.bytedance.android.live.broadcast.effect.C3266p;
import com.bytedance.android.live.broadcast.effect.C3266p.C3271a;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.effect.p204a.C3198a.C3199a;
import com.bytedance.android.live.broadcast.p198b.C3066c;
import com.bytedance.android.live.broadcast.p198b.C3066c.C3067a;
import com.bytedance.android.live.broadcast.p198b.C3076j.C3077a;
import com.bytedance.android.live.broadcast.p202d.C3161a;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.broadcast.share.AbsStartLiveShareView;
import com.bytedance.android.live.broadcast.share.AbsStartLiveShareView.C3620a;
import com.bytedance.android.live.broadcast.share.C3622b;
import com.bytedance.android.live.broadcast.viewmodel.StartLiveBannerViewModel;
import com.bytedance.android.live.broadcast.widget.C3776k;
import com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4192k;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.uikit.dialog.C4220b;
import com.bytedance.android.live.uikit.dialog.C4220b.C4221a;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.browser.p289c.C4697b.C4703e;
import com.bytedance.android.livesdk.chatroom.event.C5206y;
import com.bytedance.android.livesdk.chatroom.model.C5728aq;
import com.bytedance.android.livesdk.chatroom.model.C5743c.C5744a;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4528e;
import com.bytedance.android.livesdk.p279af.C4571ak;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p279af.C4609s;
import com.bytedance.android.livesdk.p279af.C4620v;
import com.bytedance.android.livesdk.p385j.p387b.C7705a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.C8737f.C8738a;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8681d;
import com.bytedance.android.livesdkapi.depend.model.p442a.C8682e;
import com.bytedance.android.livesdkapi.host.C8777a;
import com.bytedance.android.livesdkapi.host.C8803g;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.host.IHostPlugin.C8768a;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.android.livesdkapi.p456j.C8828a;
import com.bytedance.common.utility.C9425l;
import com.bytedance.common.utility.C9425l.C9426a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.p672e.C10753b;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p975o.C14234d;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.live.broadcast.preview.i */
public final class C3589i extends C3846a implements C3067a, C3077a, C3271a, C3620a, C8682e, C9382a {

    /* renamed from: F */
    private static C17971f f10185F = C2942b.m8369a();

    /* renamed from: a */
    static String f10186a = "https://webcast.tiktokv.com/falcon/webcast_mt/page/obs_intro/index.html";

    /* renamed from: A */
    boolean f10187A = false;

    /* renamed from: B */
    InputFilter f10188B;

    /* renamed from: G */
    private C9381g f10189G;

    /* renamed from: H */
    private Room f10190H;

    /* renamed from: I */
    private boolean f10191I;

    /* renamed from: J */
    private ImageView f10192J;

    /* renamed from: K */
    private View f10193K;

    /* renamed from: L */
    private HSImageView f10194L;

    /* renamed from: M */
    private int f10195M = 109;

    /* renamed from: N */
    private TextView f10196N;

    /* renamed from: O */
    private View f10197O;

    /* renamed from: P */
    private View f10198P;

    /* renamed from: Q */
    private View f10199Q;

    /* renamed from: R */
    private View f10200R;

    /* renamed from: S */
    private View f10201S;

    /* renamed from: T */
    private View f10202T;

    /* renamed from: U */
    private View f10203U;

    /* renamed from: V */
    private View f10204V;

    /* renamed from: W */
    private View f10205W;

    /* renamed from: X */
    private View f10206X;

    /* renamed from: Y */
    private View f10207Y;

    /* renamed from: Z */
    private TextView f10208Z;

    /* renamed from: aA */
    private ProgressDialog f10209aA;

    /* renamed from: aB */
    private C1690c f10210aB;

    /* renamed from: aC */
    private boolean f10211aC = false;

    /* renamed from: aD */
    private boolean f10212aD = false;

    /* renamed from: aE */
    private boolean f10213aE = true;

    /* renamed from: aF */
    private StartLiveViewModel f10214aF;

    /* renamed from: aG */
    private C1690c f10215aG;

    /* renamed from: aH */
    private OnClickListener f10216aH = new C3600j(this);

    /* renamed from: aI */
    private final TextWatcher f10217aI = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            C3589i.this.f10247e = 32;
            Editable text = C3589i.this.f10246d.getText();
            if (text == null) {
                str = "";
            } else {
                str = text.toString();
            }
            int trimmedLength = TextUtils.getTrimmedLength(str);
            if (trimmedLength > C3589i.this.f10247e) {
                C3589i iVar = C3589i.this;
                EditText editText = C3589i.this.f10246d;
                iVar.f10188B = new LengthFilter(str.length());
                editText.setFilters(new InputFilter[]{iVar.f10188B});
            } else {
                C3589i iVar2 = C3589i.this;
                EditText editText2 = C3589i.this.f10246d;
                if (iVar2.f10188B != null) {
                    editText2.setFilters(new InputFilter[0]);
                    iVar2.f10188B = null;
                }
            }
            if (trimmedLength > C3589i.this.f10247e) {
                C4575an.m10985a(C3589i.this.getContext(), C3589i.this.getString(R.string.ed6, Integer.valueOf(C3589i.this.f10247e)));
                String substring = str.substring(0, C3589i.this.f10247e);
                C3589i.this.f10246d.setText(substring);
                C3589i.this.f10246d.setSelection(substring.length());
            }
        }
    };

    /* renamed from: aa */
    private View f10218aa;

    /* renamed from: ab */
    private View f10219ab;

    /* renamed from: ac */
    private TextView f10220ac;

    /* renamed from: ad */
    private View f10221ad;

    /* renamed from: ae */
    private ImageView f10222ae;

    /* renamed from: af */
    private TextView f10223af;

    /* renamed from: ag */
    private View f10224ag;

    /* renamed from: ah */
    private ImageView f10225ah;

    /* renamed from: ai */
    private TextView f10226ai;

    /* renamed from: aj */
    private View f10227aj;

    /* renamed from: ak */
    private View f10228ak;

    /* renamed from: al */
    private View f10229al;

    /* renamed from: am */
    private HSImageView f10230am;

    /* renamed from: an */
    private View f10231an;

    /* renamed from: ao */
    private TextView f10232ao;

    /* renamed from: ap */
    private View f10233ap;

    /* renamed from: aq */
    private View f10234aq;

    /* renamed from: ar */
    private String f10235ar;

    /* renamed from: as */
    private AbsStartLiveShareView f10236as;

    /* renamed from: at */
    private C3236c f10237at;

    /* renamed from: au */
    private boolean f10238au;

    /* renamed from: av */
    private C10753b f10239av;

    /* renamed from: aw */
    private User f10240aw;

    /* renamed from: ax */
    private StartLiveBannerViewModel f10241ax;

    /* renamed from: ay */
    private Game f10242ay;

    /* renamed from: az */
    private String f10243az;

    /* renamed from: b */
    public Activity f10244b;

    /* renamed from: c */
    View f10245c;

    /* renamed from: d */
    public EditText f10246d;

    /* renamed from: e */
    public int f10247e;

    /* renamed from: f */
    public View f10248f;

    /* renamed from: g */
    C3066c f10249g;

    /* renamed from: h */
    TextView f10250h;

    /* renamed from: i */
    CheckedTextView f10251i;

    /* renamed from: j */
    C8548h f10252j;

    /* renamed from: k */
    C3776k f10253k;

    /* renamed from: l */
    public C8681d f10254l;

    /* renamed from: m */
    C8710m f10255m;

    /* renamed from: n */
    int f10256n = 1;

    /* renamed from: o */
    public final C1689b f10257o = new C1689b();

    /* renamed from: p */
    int f10258p = 0;

    /* renamed from: q */
    public int f10259q = 0;

    /* renamed from: r */
    C4703e f10260r;

    /* renamed from: s */
    C5744a f10261s;

    /* renamed from: t */
    C4220b f10262t;

    /* renamed from: u */
    String f10263u = "";

    /* renamed from: v */
    public List<FilterModel> f10264v;

    /* renamed from: w */
    C1690c f10265w;

    /* renamed from: x */
    WidgetManager f10266x;

    /* renamed from: y */
    SelectLiveTypeWidget f10267y;

    /* renamed from: z */
    C3199a f10268z = new C3199a() {
        /* renamed from: a */
        public final void mo8488a(int i) {
            if (C3589i.this.f10254l != null) {
                C3589i.this.f10254l.mo8948b(i);
            }
            C4525b.f12317M.mo10346a(Integer.valueOf(i));
            if (C3589i.this.f10254l != null) {
                float a = C3261l.m8929a(C3266p.m8943a().f9434b, i) / 100.0f;
                if (((Float) C4525b.f12318N.mo10345a()).floatValue() > a) {
                    C3589i.this.f10254l.mo8943a(a);
                    C4525b.f12318N.mo10346a(Float.valueOf(a));
                }
            }
            String str = "";
            List<FilterModel> list = C3266p.m8943a().f9434b;
            if (i < list.size()) {
                str = ((FilterModel) list.get(i)).getFilterId();
            }
            C3589i.this.mo8969p();
            if (!C9431p.m18664a(str) && !str.equals("0")) {
                HashMap hashMap = new HashMap();
                hashMap.put("filter_id", str);
                C8049c.m15979a().mo14202a("live_take_filter_select", C3589i.this.mo8960a(hashMap), new C8059j().mo14214b("live_take").mo14218f("click").mo14219g("click").mo14213a("live_take_page"));
            }
        }
    };

    /* renamed from: n */
    public final Fragment mo8913n() {
        return this;
    }

    /* renamed from: g */
    public final String mo8907g() {
        return C3617q.INST.getBeautyFilePath();
    }

    /* renamed from: h */
    public final String mo8908h() {
        return C3617q.INST.getFaceReshapeFilePath();
    }

    /* renamed from: j */
    public final int mo8910j() {
        return ((Integer) C4525b.f12433g.mo10347b()).intValue();
    }

    public final void onPause() {
        super.onPause();
        if (!this.f10211aC) {
            this.f10189G.removeMessages(2333);
        }
    }

    /* renamed from: t */
    private boolean m9404t() {
        Boolean bool = (Boolean) this.f10199Q.getTag(R.id.d5k);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* renamed from: v */
    private static float m9406v() {
        return ((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21201b.f21205a * ((Float) C4525b.f12319O.mo10345a()).floatValue();
    }

    /* renamed from: w */
    private static float m9407w() {
        return ((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21202c.f21205a * ((Float) C4525b.f12320P.mo10345a()).floatValue();
    }

    /* renamed from: x */
    private static float m9408x() {
        return ((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21203d.f21205a * ((Float) C4525b.f12321Q.mo10345a()).floatValue();
    }

    /* renamed from: m */
    public final void mo8912m() {
        if (this.f10252j != null && this.f10252j.isShowing()) {
            this.f10252j.dismiss();
        }
    }

    /* renamed from: p */
    public final void mo8969p() {
        if (C3266p.m8943a().mo8636d()) {
            this.f10201S.setVisibility(0);
        } else {
            this.f10201S.setVisibility(8);
        }
    }

    /* renamed from: u */
    private int m9405u() {
        C5728aq aqVar = (C5728aq) f10185F.mo34884a((String) ((Map) C4525b.f12315K.mo10345a()).get(this.f10255m.name()), C5728aq.class);
        if (aqVar == null) {
            return -1;
        }
        return aqVar.f15081a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo8964d() {
        if (this.f10237at == null) {
            this.f10237at = C3236c.m8869a(new C3252a() {
                /* renamed from: a */
                public final void mo8582a(float f) {
                    if (C3589i.this.f10254l != null) {
                        C3589i.this.f10254l.mo8943a(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a * f);
                    }
                }

                /* renamed from: b */
                public final void mo8583b(float f) {
                    if (C3589i.this.f10254l != null) {
                        C3589i.this.f10254l.mo8947b(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21201b.f21205a * f);
                    }
                }

                /* renamed from: c */
                public final void mo8584c(float f) {
                    if (C3589i.this.f10254l != null) {
                        C3589i.this.f10254l.mo8949c(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21202c.f21205a * f);
                    }
                }

                /* renamed from: d */
                public final void mo8585d(float f) {
                    if (C3589i.this.f10254l != null) {
                        C3589i.this.f10254l.mo8950d(((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21203d.f21205a * f);
                    }
                }
            }, this.f10268z, true, 0, true);
            this.f10237at.f9349a = new C3610t(this);
        }
        Fragment a = getChildFragmentManager().mo2224a("beauty_filter_dialog_tag");
        if (!this.f10238au && a == null) {
            this.f10238au = true;
            this.f10237at.show(getChildFragmentManager(), "beauty_filter_dialog_tag");
            mo8961a(8);
        }
    }

    /* renamed from: i */
    public final List<Pair<String, String>> mo8909i() {
        ArrayList arrayList = new ArrayList();
        for (FilterModel filterModel : C3266p.m8943a().f9434b) {
            arrayList.add(new Pair(filterModel.getName(), filterModel.getFilterPath()));
        }
        return arrayList;
    }

    /* renamed from: o */
    public final void mo8967o() {
        if (this.f10254l != null) {
            this.f10254l.mo8943a(0.0f);
            this.f10254l.mo8947b(m9406v());
            this.f10254l.mo8949c(m9407w());
            this.f10254l.mo8950d(m9408x());
            this.f10254l.mo8948b(((Integer) C4525b.f12317M.mo10345a()).intValue());
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f10253k != null) {
            C3776k kVar = this.f10253k;
            if (kVar.f10672e != null) {
                kVar.f10672e.mo9579b();
                kVar.f10672e = null;
            }
            kVar.f10673f = null;
        }
        if (this.f10215aG != null && !this.f10215aG.isDisposed()) {
            this.f10215aG.dispose();
        }
    }

    public final void onResume() {
        super.onResume();
        if (!this.f10211aC) {
            if (this.f10191I) {
                m9401q();
                this.f10191I = false;
            }
            C3982g.m10092c(C3983a.CreateStartLivePreview);
            C3974b.m10061a().mo9374a(C3983a.CreateStartLivePreview.name());
        }
    }

    /* renamed from: q */
    private void m9401q() {
        ((C8777a) C4116c.m10249a(C8777a.class)).mo15489b().mo15407a((C8738a) C4528e.LAST_SHARE_CHANNEL, this.f10263u);
        C4525b.f12445s.mo10346a(this.f10263u);
        C8049c.m15979a().mo14203a("live_action", new Object[0]);
        if (this.f10190H != null) {
            if (!C8828a.LiveResource.isInstalled()) {
                C8828a.LiveResource.checkInstall(this.f10244b, new C8768a() {
                    /* renamed from: a */
                    public final void mo8214a(String str) {
                        if (C4116c.m10249a(IHostPlugin.class) != null && !((IHostPlugin) C4116c.m10249a(IHostPlugin.class)).isFull()) {
                            ((IHostPlugin) C4116c.m10249a(IHostPlugin.class)).preload(C8828a.LiveResource.getPackageName());
                        }
                        C8828a.LiveResource.load(C3589i.this.f10244b, false);
                        C3589i.this.mo8962b();
                    }
                });
            } else {
                mo8962b();
            }
        }
    }

    /* renamed from: s */
    private void m9403s() {
        Boolean bool = (Boolean) this.f10199Q.getTag(R.id.d5k);
        if (bool == null) {
            bool = Boolean.valueOf(this.f10239av.mo19444a("hotsoon.pref.LAST_SET_LANDSCAPE", true));
            this.f10199Q.setTag(R.id.d5k, bool);
        }
        if (!bool.booleanValue()) {
            this.f10225ah.setImageResource(R.drawable.c01);
            this.f10226ai.setText(R.string.eta);
            return;
        }
        this.f10225ah.setImageResource(R.drawable.c00);
        this.f10226ai.setText(R.string.et8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo8959a() {
        if (this.f10255m == null || this.f10255m.equals(C8710m.VIDEO)) {
            return "video_live";
        }
        if (this.f10255m.equals(C8710m.THIRD_PARTY)) {
            return "third_party";
        }
        return "video_live";
    }

    /* renamed from: e */
    public final void mo8965e() {
        if (!C3617q.INST.isLoadedRes()) {
            if (C4116c.m10249a(IHostPlugin.class) != null && !((IHostPlugin) C4116c.m10249a(IHostPlugin.class)).isFull()) {
                ((IHostPlugin) C4116c.m10249a(IHostPlugin.class)).preload(C8828a.LiveResource.getPackageName());
            }
            if (this.f10252j == null && getContext() != null && mo8452l()) {
                this.f10252j = new C8552a(getContext(), 2).mo15005b((OnDismissListener) new C3612v(this)).mo15011d();
            }
            C3617q.INST.isLoadedRes.observe(this, new C3613w(this));
            return;
        }
        mo8967o();
    }

    /* renamed from: f */
    public final void mo8966f() {
        if (this.f10229al != null) {
            C3009i a = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
            if (C8607a.f23572a || a == null || !a.isEnableShowCommerceSale() || this.f10255m != C8710m.VIDEO) {
                this.f10229al.setVisibility(8);
                return;
            }
            this.f10229al.setVisibility(0);
            ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).liveCommerceService().mo9607b(Long.valueOf(a.getId())).mo6505a((C1710e<? super T>) new C3615y<Object>(this), (C1710e<? super Throwable>) new C3616z<Object>(this));
        }
    }

    /* renamed from: k */
    public final void mo8911k() {
        if (C8828a.LiveResource.isInstalled()) {
            mo8965e();
        } else if (!C3513ak.m9322a(this.f10244b)) {
            C4204a.m10421a((Context) this.f10244b, (int) R.string.e79);
        } else if (C9425l.m18652c(this.f10244b) == C9426a.MOBILE_2G) {
            C4204a.m10421a((Context) this.f10244b, (int) R.string.ex9);
        } else {
            if (this.f10259q <= 3) {
                C8828a.LiveResource.checkInstall(getContext(), new C8768a() {
                    /* renamed from: a */
                    public final void mo8214a(String str) {
                        if (!C3512aj.m9321a(C3589i.this.f10244b)) {
                            C4204a.m10421a((Context) C3589i.this.f10244b, (int) R.string.e79);
                        } else if (C9425l.m18652c(C3589i.this.f10244b) == C9426a.MOBILE_2G) {
                            C4204a.m10421a((Context) C3589i.this.f10244b, (int) R.string.ex9);
                        } else {
                            C3589i.this.mo8965e();
                        }
                    }
                });
            }
        }
    }

    public final void onDestroyView() {
        if (!this.f10211aC) {
            C3266p.m8943a().mo8632b((C3271a) this);
            if (this.f10249g != null && this.f10249g.isShowing()) {
                this.f10249g.dismiss();
                this.f10249g.f8945a = null;
            }
            if (this.f10252j != null && this.f10252j.isShowing()) {
                this.f10252j.dismiss();
            }
            this.f10249g = null;
            if (this.f10210aB != null && !this.f10210aB.isDisposed()) {
                this.f10210aB.dispose();
            }
            this.f10235ar = null;
            ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10494a(this.f10260r);
            this.f10257o.mo6180a();
            if (this.f10265w != null && !this.f10265w.isDisposed()) {
                this.f10265w.dispose();
            }
        }
        super.onDestroyView();
    }

    /* renamed from: r */
    private boolean m9402r() {
        if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14516a(getActivity(), C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ev_)).mo14539a(-1).mo14544d("video_take").mo14545e("open_live").mo14543c("bottom_tab").mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<C3009i>() {
                public final void onSubscribe(C1690c cVar) {
                    super.onSubscribe(cVar);
                    C3589i.this.f10257o.mo6181a(cVar);
                }
            });
            return false;
        } else if (!C3513ak.m9322a(this.f10244b)) {
            C4204a.m10421a((Context) this.f10244b, (int) R.string.e79);
            return false;
        } else if (C9425l.m18652c(this.f10244b) == C9426a.MOBILE_2G) {
            C4204a.m10421a((Context) this.f10244b, (int) R.string.ex9);
            return false;
        } else if (!((IHostContext) C4116c.m10249a(IHostContext.class)).isNeedProtectUnderage()) {
            return true;
        } else {
            C4575an.m10981a((int) R.string.epk);
            return false;
        }
    }

    /* renamed from: b */
    public final void mo8962b() {
        Class cls;
        try {
            C3982g.m10091b(C3983a.CreateLive);
            C3974b.m10061a().mo9377a(C3983a.CreateLive.name(), (C0184k) this, getContext());
            C3974b.m10061a().mo9384b(C3983a.CreateLive.name(), (C0184k) this, getContext());
            Activity activity = this.f10244b;
            if (this.f10255m.isStreamingBackground) {
                cls = ((IHostApp) C4116c.m10249a(IHostApp.class)).getHostActivity(6);
            } else {
                cls = ((IHostApp) C4116c.m10249a(IHostApp.class)).getHostActivity(5);
            }
            Intent intent = new Intent(activity, cls);
            if (C8710m.THIRD_PARTY == this.f10255m || C8710m.SCREEN_RECORD == this.f10255m) {
                C4525b.f12361ad.mo10346a(Boolean.valueOf(false));
            }
            if (C8710m.SCREEN_RECORD == this.f10255m) {
                intent.putExtra("hotsoon.intent.extra.IS_LANDSCAPE", m9404t());
            }
            C4525b.f12314J.mo10346a(this.f10255m.name());
            this.f10244b.startActivity(intent);
            ((C4193l) C4116c.m10249a(C4193l.class)).setCurrentRoom(this.f10190H);
            ((C8777a) C4116c.m10249a(C8777a.class)).mo15488a().mo15411a(true);
            this.f10244b.finish();
            this.f10244b.overridePendingTransition(0, 0);
            ((IBroadcastService) C4116c.m10249a(IBroadcastService.class)).startLiveManager().mo8930a();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo8963c() {
        boolean z;
        this.f10195M = 10001;
        if (m9402r()) {
            if (this.f10255m.isStreamingBackground) {
                Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
                if (currentRoom != null && ((currentRoom.isScreenshot && this.f10255m == C8710m.SCREEN_RECORD) || (currentRoom.isThirdParty && this.f10255m == C8710m.THIRD_PARTY))) {
                    this.f10190H = currentRoom;
                    C3982g.m10091b(C3983a.CreateLive);
                    C3974b.m10061a().mo9385c(C3983a.CreateLive.name(), this, getContext());
                    m9401q();
                    return;
                }
            }
            long j = 0;
            if (this.f10255m == C8710m.SCREEN_RECORD) {
                if (VERSION.SDK_INT >= 21) {
                    Game game = this.f10242ay;
                    if (game == null) {
                        C4575an.m10981a((int) R.string.f1z);
                        this.f10202T.performClick();
                        return;
                    }
                    j = game.gameId;
                    if (BgBroadcastServiceImpl.getProjection() == null) {
                        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getActivity().getSystemService("media_projection");
                        if (mediaProjectionManager == null) {
                            C4575an.m10981a((int) R.string.f1x);
                            return;
                        } else {
                            startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 20001);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            long j2 = j;
            this.f10195M = 109;
            if (this.f10209aA == null) {
                this.f10209aA = C4571ak.m10972a(this.f10244b, getString(R.string.e8x));
                this.f10209aA.setCancelable(false);
                this.f10209aA.setCanceledOnTouchOutside(false);
            }
            if (!this.f10209aA.isShowing()) {
                this.f10209aA.show();
            }
            String obj = this.f10246d.getText().toString();
            m9399b(obj);
            C4192k roomManager = ((C4193l) C4116c.m10249a(C4193l.class)).roomManager();
            C9381g gVar = this.f10189G;
            String a = this.f10253k.mo9148a();
            C8710m mVar = this.f10255m;
            int u = m9405u();
            if (this.f10255m != C8710m.VIDEO || this.f10251i == null || !this.f10251i.isChecked()) {
                z = false;
            } else {
                z = true;
            }
            roomManager.mo9631a(gVar, obj, a, mVar, u, j2, z, 1);
            C8068g.m16014a((Context) this.f10244b);
            C3982g.m10091b(C3983a.CreateLive);
            C3974b.m10061a().mo9385c(C3983a.CreateLive.name(), this, getContext());
        }
    }

    /* renamed from: a */
    public final void mo8898a(C8681d dVar) {
        this.f10254l = dVar;
    }

    /* renamed from: b */
    public final void mo8903b(int i) {
        this.f10247e = i;
    }

    public final void onEvent(C5206y yVar) {
        mo8966f();
    }

    /* renamed from: a */
    public final void mo8899a(String str) {
        this.f10263u = str;
    }

    /* renamed from: a */
    public final void mo8592a(boolean z) {
        if (z) {
            mo8969p();
        }
    }

    /* renamed from: c */
    public final void mo8905c(int i) {
        C4525b.f12433g.mo10348b(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final HashMap<String, String> mo8960a(HashMap<String, String> hashMap) {
        long j;
        if (this.f10190H != null) {
            j = this.f10190H.getId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", String.valueOf(j));
        return hashMap;
    }

    /* renamed from: a */
    private void m9398a(Game game) {
        if (game == null) {
            this.f10224ag.setVisibility(0);
            this.f10222ae.setVisibility(8);
            this.f10223af.setText(R.string.et6);
            return;
        }
        this.f10224ag.setVisibility(8);
        this.f10222ae.setVisibility(0);
        C5213c.m11814a(this.f10222ae, game.icon);
        this.f10223af.setText(game.name);
    }

    /* renamed from: c */
    private boolean m9400c(String str) {
        if (!isAdded()) {
            return false;
        }
        Fragment a = getChildFragmentManager().mo2224a(str);
        if (a != null && (a instanceof C0649f)) {
            C0649f fVar = (C0649f) a;
            if (fVar.getDialog() != null && fVar.getDialog().isShowing()) {
                return true;
            }
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3982g.m10091b(C3983a.CreateStartLivePreview);
        C3974b.m10061a().mo9384b(C3983a.CreateStartLivePreview.name(), (C0184k) this, getContext());
        C3974b.m10061a().mo9377a(C3983a.CreateStartLivePreview.name(), (C0184k) this, getContext());
        BroadcastServiceDummy.hasShown = false;
    }

    /* renamed from: b */
    private static void m9399b(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("event_type", "click");
        hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
        hashMap.put("event_page", "live_action");
        hashMap.put("event_module", "title");
        hashMap.put("live_edit_type", "title");
        String str3 = "title_status";
        if (str.length() == 0) {
            str2 = "off";
        } else {
            str2 = "on";
        }
        hashMap.put(str3, str2);
        C8049c.m15979a().mo14202a("live_edit_features", hashMap, new Object[0]);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("event_type", "click");
        hashMap2.put("event_belong", CustomActionPushReceiver.f104061f);
        hashMap2.put("event_page", "live_action");
        hashMap2.put("event_module", "action");
        hashMap2.put("is_beauty", "off");
        C8049c.m15979a().mo14202a("live_action", hashMap2, new Object[0]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8961a(int i) {
        if (i == 0) {
            this.f10238au = false;
        }
        if (!this.f10212aD) {
            this.f10197O.setVisibility(i);
            this.f10196N.setVisibility(i);
        }
    }

    /* renamed from: d */
    public final void mo8906d(int i) {
        boolean c = m9400c("beauty_filter_dialog_tag");
        boolean c2 = m9400c("filter_dialog_tag");
        if (!c && !c2) {
            String str = "";
            List<FilterModel> list = C3266p.m8943a().f9434b;
            if (i < list.size()) {
                str = ((FilterModel) list.get(i)).getFilterId();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", "draw");
            hashMap.put("filter_id", str);
            C8049c.m15979a().mo14202a("live_take_filter_select", mo8960a(hashMap), new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_page"));
            C4525b.f12317M.mo10346a(Integer.valueOf(i));
            float a = C3261l.m8929a(C3266p.m8943a().f9434b, i);
            if (0.0f > (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a * a) / 100.0f) {
                float f = a / 100.0f;
                this.f10254l.mo8943a(f);
                C4525b.f12318N.mo10346a(Float.valueOf(f));
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f10244b = getActivity();
        this.f10189G = new C9381g(this);
        if (!this.f10211aC) {
            this.f10241ax = (StartLiveBannerViewModel) C0214z.m438a((Fragment) this).mo359a(StartLiveBannerViewModel.class);
            this.f10241ax.f10378a.observe(this, new C3505ac(this));
            C3266p.m8943a().mo8628a((C3271a) this);
            C3266p.m8943a().mo8634c();
            if (getActivity() != null) {
                getActivity().getWindow().setSoftInputMode(48);
            }
            f10186a = (String) LiveConfigSettingKeys.LIVE_OBS_HELPER_PAGE.mo9431a();
            this.f10266x = WidgetManager.m22273of((Fragment) this, this.f10245c);
            this.f10214aF = (StartLiveViewModel) C0214z.m440a(getActivity()).mo359a(StartLiveViewModel.class);
            this.f10214aF.mo8876d().observe(this, new C3601k(this));
            mo8352a(C8710m.VIDEO);
            ((ILiveSDKService) C4116c.m10249a(ILiveSDKService.class)).dnsOptimizer().mo9576a(true);
            this.f10215aG = C3395f.m9156f().mo8742c().mo9019b().getBroadcastConfig().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3608r<Object>(this), C3614x.f10293a);
            ((C4139d) C4116c.m10249a(C4139d.class)).getGpuInfoFetcher().mo9526a(getActivity(), this.f10245c, C3506ad.f9996a);
        }
    }

    /* renamed from: a */
    public final void mo8363a(C5728aq aqVar) {
        String str;
        int i;
        TextView textView = this.f10220ac;
        if (aqVar == null) {
            str = getString(R.string.etf);
        } else {
            str = aqVar.f15082b;
        }
        textView.setText(str);
        View view = this.f10221ad;
        if (aqVar == null) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        Map map = (Map) C4525b.f12315K.mo10345a();
        map.put(this.f10255m.name(), f10185F.mo34889b(aqVar));
        C4525b.f12315K.mo10346a(map);
    }

    /* renamed from: a */
    public final void mo8352a(C8710m mVar) {
        String str;
        boolean z;
        if (mo8452l()) {
            if (this.f10245c != null) {
                View view = this.f10245c;
                if (mVar != C8710m.VIDEO) {
                    z = true;
                } else {
                    z = false;
                }
                view.setClickable(z);
            }
            if (mVar != this.f10255m) {
                this.f10255m = mVar;
                if (!(this.f10260r == null || this.f10260r.f12813a == null)) {
                    this.f10260r.f12813a.setVisibility(4);
                }
                if (this.f10250h != null) {
                    this.f10250h.setVisibility(8);
                }
                if (this.f10255m == C8710m.AUDIO) {
                    str = "1";
                } else if (this.f10255m == C8710m.VIDEO) {
                    str = "2";
                } else if (this.f10255m == C8710m.SCREEN_RECORD) {
                    str = "3";
                } else {
                    str = "4";
                }
                this.f10241ax.mo9027a(str);
                if (this.f10249g != null && this.f10249g.isShowing()) {
                    this.f10249g.dismiss();
                }
                if (this.f10253k != null) {
                    this.f10253k.mo9149a(mVar);
                }
                switch (mVar) {
                    case VIDEO:
                        this.f10220ac.setVisibility(8);
                        this.f10193K.setVisibility(8);
                        this.f10199Q.setVisibility(8);
                        this.f10227aj.setVisibility(8);
                        this.f10202T.setVisibility(8);
                        this.f10194L.setVisibility(8);
                        this.f10196N.setText(R.string.e52);
                        this.f10192J.setVisibility(0);
                        this.f10198P.setVisibility(0);
                        this.f10200R.setVisibility(0);
                        this.f10228ak.setVisibility(0);
                        if (!(!((Boolean) LiveSettingKeys.LIVE_SHARE_LEAD_OUTTER.mo9431a()).booleanValue() || this.f10240aw == null || this.f10240aw.getSecret() == 1)) {
                            this.f10233ap.setVisibility(0);
                            this.f10234aq.setVisibility(0);
                            break;
                        }
                    case AUDIO:
                        this.f10220ac.setVisibility(8);
                        this.f10192J.setVisibility(4);
                        this.f10193K.setVisibility(8);
                        this.f10198P.setVisibility(8);
                        this.f10199Q.setVisibility(8);
                        this.f10227aj.setVisibility(8);
                        this.f10202T.setVisibility(8);
                        this.f10194L.setVisibility(0);
                        this.f10196N.setText(R.string.e52);
                        this.f10208Z.setText(R.string.ena);
                        this.f10228ak.setVisibility(8);
                        this.f10200R.setVisibility(8);
                        this.f10233ap.setVisibility(8);
                        this.f10234aq.setVisibility(8);
                        break;
                    case THIRD_PARTY:
                        this.f10220ac.setVisibility(8);
                        this.f10192J.setVisibility(4);
                        this.f10193K.setVisibility(0);
                        this.f10198P.setVisibility(8);
                        this.f10199Q.setVisibility(8);
                        this.f10227aj.setVisibility(8);
                        this.f10202T.setVisibility(8);
                        this.f10194L.setVisibility(0);
                        this.f10196N.setText(R.string.e52);
                        this.f10208Z.setText(R.string.enb);
                        this.f10228ak.setVisibility(8);
                        this.f10200R.setVisibility(8);
                        this.f10233ap.setVisibility(8);
                        this.f10234aq.setVisibility(8);
                        break;
                    case SCREEN_RECORD:
                        this.f10220ac.setVisibility(8);
                        this.f10192J.setVisibility(4);
                        this.f10193K.setVisibility(0);
                        this.f10198P.setVisibility(8);
                        this.f10199Q.setVisibility(0);
                        this.f10227aj.setVisibility(0);
                        this.f10202T.setVisibility(0);
                        m9398a(this.f10242ay);
                        m9403s();
                        this.f10194L.setVisibility(0);
                        this.f10196N.setText(R.string.e52);
                        this.f10208Z.setText(R.string.en_);
                        this.f10228ak.setVisibility(8);
                        this.f10200R.setVisibility(8);
                        this.f10233ap.setVisibility(8);
                        this.f10234aq.setVisibility(8);
                        break;
                }
                if (mVar != C8710m.VIDEO) {
                    float a = ((float) C9432q.m18670a(getContext())) / ((float) C9432q.m18688b(getContext()));
                    if (mVar == C8710m.AUDIO) {
                        this.f10194L.setBackgroundResource(R.drawable.bj5);
                    } else if (this.f10240aw == null || this.f10240aw.getAvatarLarge() == null) {
                        this.f10194L.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25757b(C14232c.m29168a((int) R.drawable.buk).mo26458a((C14234d) new C4620v(5, a, null)).mo26449a())).mo25759b(this.f10194L.getController())).mo25763d());
                    } else {
                        C5213c.m11821a(this.f10194L, this.f10240aw.getAvatarLarge(), (C14234d) new C4620v(5, a, null));
                    }
                    this.f10194L.setVisibility(0);
                }
            }
        }
    }

    public final void handleMsg(Message message) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z3 = false;
        if (message.obj instanceof Exception) {
            Exception exc = (Exception) message.obj;
            C3982g.m10084a(C3983a.CreateLive);
            if (message.what == 1) {
                if (mo8452l()) {
                    if (this.f10209aA != null) {
                        this.f10209aA.dismiss();
                    }
                    if (exc instanceof C2949a) {
                        int errorCode = ((C2949a) exc).getErrorCode();
                        if (errorCode == 2403) {
                            Context context = getContext();
                            if (context != null) {
                                new C8552a(context, 0).mo15008c((int) R.string.f0v).mo15003b(1, (int) R.string.f26, C3559d.f10134a).mo15003b(0, (int) R.string.ebs, (DialogInterface.OnClickListener) new C3560e(context)).mo15001b().show();
                            }
                        } else if (errorCode != 10018) {
                            switch (errorCode) {
                                case 30010:
                                    if (this.f10244b != null) {
                                        if (this.f10262t == null) {
                                            C4221a aVar = new C4221a(this.f10244b);
                                            aVar.mo9689a((CharSequence) getString(R.string.f37)).mo9694b(R.string.e45, new C3603m(this)).mo9685a((int) R.string.f34, (DialogInterface.OnClickListener) new C3604n(this)).mo9693b((int) R.string.f35);
                                            aVar.mo9686a((OnCancelListener) new C3605o(this));
                                            this.f10262t = aVar.mo9692a();
                                            this.f10262t.setCanceledOnTouchOutside(true);
                                        }
                                        this.f10262t.show();
                                        C8068g.m16014a((Context) this.f10244b);
                                        break;
                                    }
                                    break;
                                case 30011:
                                    new C8552a(getContext(), 0).mo14996a(true).mo15008c((int) R.string.f21).mo15003b(0, (int) R.string.e4g, (DialogInterface.OnClickListener) new C3510ah(this)).mo15003b(1, (int) R.string.e41, C3602l.f10281a).mo15001b().show();
                                    break;
                                default:
                                    C4602l.m11047a((Context) this.f10244b, (Throwable) exc, (int) R.string.e8y);
                                    break;
                            }
                        } else {
                            C3009i a = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
                            if (!(this.f10244b == null || a == null)) {
                                this.f10257o.mo6181a(C3395f.m9156f().mo8742c().mo9017a().getBanUserInfo().mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C3606p<Object>(this), (C1710e<? super Throwable>) new C3607q<Object>(this)));
                            }
                        }
                    } else {
                        C4602l.m11047a((Context) this.f10244b, (Throwable) exc, (int) R.string.e8y);
                    }
                }
                C8068g.m16014a((Context) this.f10244b);
                if (this.f10255m == C8710m.AUDIO) {
                    z3 = true;
                }
                C3161a.m8755a(exc, z3);
            }
            return;
        }
        if (message.what == 1) {
            if (mo8452l()) {
                this.f10190H = (Room) message.obj;
                if (Room.isValid(this.f10190H)) {
                    Room room = this.f10190H;
                    if (room == null || this.f10255m != room.getStreamType()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        long id = this.f10190H.getId();
                        if (this.f10209aA != null && this.f10209aA.isShowing() && mo8452l()) {
                            this.f10209aA.dismiss();
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("event_belong", "live_take");
                        hashMap.put("event_type", "click");
                        hashMap.put("enter_from", this.f10243az);
                        hashMap.put("event_page", "live_take_page");
                        hashMap.put("room_id", String.valueOf(this.f10190H.getId()));
                        hashMap.put("live_type", mo8959a());
                        hashMap.put("streaming_type", this.f10255m.logStreamingType);
                        if (this.f10255m == C8710m.SCREEN_RECORD) {
                            Game game = this.f10242ay;
                            if (game != null) {
                                hashMap.put("game_name", game.name);
                            }
                        }
                        C8049c.m15979a().mo14202a("live_take", hashMap, new Object[0]);
                        if (this.f10246d.getText() != null && !TextUtils.isEmpty(this.f10246d.getText())) {
                            HashMap hashMap2 = new HashMap();
                            String str9 = "live_type";
                            if (this.f10190H.isLiveTypeAudio()) {
                                str8 = "voice_live";
                            } else {
                                str8 = "video_live";
                            }
                            hashMap2.put(str9, str8);
                            hashMap2.put("streaming_type", this.f10255m.logStreamingType);
                            C8049c.m15979a().mo14202a("pm_live_take_title_write", hashMap2, new C8059j().mo14214b("live_take").mo14218f("other").mo14213a("live_take_page"), new C8060k());
                        }
                        C3261l.m8930a(id);
                        if (this.f10255m == C8710m.AUDIO) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C3161a.m8757a(z2);
                        float floatValue = ((Float) C4525b.f12318N.mo10345a()).floatValue() * 100.0f;
                        float floatValue2 = ((Float) C4525b.f12319O.mo10345a()).floatValue() * 100.0f;
                        float floatValue3 = ((Float) C4525b.f12320P.mo10345a()).floatValue() * 100.0f;
                        float floatValue4 = ((Float) C4525b.f12321Q.mo10345a()).floatValue() * 100.0f;
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("event_page", "live_take_page");
                        String str10 = "live_type";
                        if (this.f10190H.isLiveTypeAudio()) {
                            str = "voice_live";
                        } else {
                            str = "video_live";
                        }
                        hashMap3.put(str10, str);
                        hashMap3.put("streaming_type", this.f10255m.logStreamingType);
                        hashMap3.put("anchor_id", String.valueOf(this.f10240aw.getId()));
                        String str11 = "is_tag";
                        if (m9405u() == -1) {
                            str2 = "0";
                        } else {
                            str2 = "1";
                        }
                        hashMap3.put(str11, str2);
                        String str12 = "is_beauty";
                        if (this.f10255m == C8710m.VIDEO && !(floatValue == 0.0f && floatValue2 == 0.0f && floatValue3 == 0.0f && floatValue4 == 0.0f)) {
                            str3 = "1";
                        } else {
                            str3 = "0";
                        }
                        hashMap3.put(str12, str3);
                        String str13 = "beauty_white";
                        if (this.f10255m != C8710m.VIDEO) {
                            str4 = "0";
                        } else {
                            str4 = String.valueOf(floatValue);
                        }
                        hashMap3.put(str13, str4);
                        String str14 = "beauty_skin";
                        if (this.f10255m != C8710m.VIDEO) {
                            str5 = "0";
                        } else {
                            str5 = String.valueOf(floatValue2);
                        }
                        hashMap3.put(str14, str5);
                        String str15 = "beauty_bigeye";
                        if (this.f10255m != C8710m.VIDEO) {
                            str6 = "0";
                        } else {
                            str6 = String.valueOf(floatValue3);
                        }
                        hashMap3.put(str15, str6);
                        String str16 = "beauty_facethin";
                        if (this.f10255m != C8710m.VIDEO) {
                            str7 = "0";
                        } else {
                            str7 = String.valueOf(floatValue4);
                        }
                        hashMap3.put(str16, str7);
                        C8049c.m15979a().mo14202a("pm_live_take_edit_features", hashMap3, new C8059j().mo14214b("live_take").mo14218f("click"));
                        if (TextUtils.isEmpty(this.f10263u)) {
                            m9401q();
                        } else {
                            ((C4193l) C4116c.m10249a(C4193l.class)).setCurrentRoom(this.f10190H);
                            if (getActivity() != null) {
                                this.f10191I = C3622b.m9456a(getActivity(), this.f10263u, this.f10190H);
                                C4525b.f12445s.mo10346a(this.f10263u);
                                String str17 = this.f10263u;
                                if (C9431p.m18665a(this.f10263u, "weixin_moment")) {
                                    str17 = "weixin_moment";
                                }
                                C8068g.m16014a((Context) getActivity());
                                this.f10190H.getId();
                                HashMap hashMap4 = new HashMap();
                                hashMap4.put("event_belong", "live_interact");
                                hashMap4.put("event_page", "live_take_page");
                                hashMap4.put("room_id", String.valueOf(this.f10190H.getId()));
                                hashMap4.put("platform", str17);
                                C8049c.m15979a().mo14202a("live_take_share", hashMap4, new Object[0]);
                                if (!this.f10191I) {
                                    m9401q();
                                } else {
                                    int intValue = ((Integer) LiveSettingKeys.START_LIVE_SHARE_TIMEOUT.mo9431a()).intValue();
                                    if (intValue > 0) {
                                        this.f10189G.sendEmptyMessageDelayed(2333, ((long) intValue) * 1000);
                                        C3982g.m10084a(C3983a.CreateLive);
                                    }
                                }
                            }
                            return;
                        }
                    }
                }
                if (this.f10209aA != null) {
                    this.f10209aA.dismiss();
                }
                IllegalStateException illegalStateException = new IllegalStateException("invalid room");
                C4602l.m11047a((Context) this.f10244b, (Throwable) illegalStateException, (int) R.string.e8y);
                if (this.f10255m == C8710m.AUDIO) {
                    z3 = true;
                }
                C3161a.m8755a(illegalStateException, z3);
                C3982g.m10084a(C3983a.CreateLive);
            }
        } else if (message.what == 2333) {
            m9401q();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f10239av = C10753b.m21793a(getContext());
        if (C4116c.m10249a(C4282a.class) == null || ((C4282a) C4116c.m10249a(C4282a.class)).user() == null || C4116c.m10249a(ILiveSDKService.class) == null || C4116c.m10249a(IHostNetwork.class) == null) {
            C4575an.m10981a((int) R.string.e_x);
            getActivity().finish();
            this.f10211aC = true;
            return;
        }
        String a = this.f10239av.mo19442a("hotsoon.pref.LAST_SET_GAME", (String) null);
        if (!TextUtils.isEmpty(a)) {
            this.f10242ay = Game.fromJson(a);
        }
        this.f10194L = (HSImageView) this.f10245c.findViewById(R.id.c7v);
        this.f10205W = this.f10245c.findViewById(R.id.dgc);
        this.f10208Z = (TextView) this.f10245c.findViewById(R.id.dgb);
        this.f10208Z.setOnClickListener(this.f10216aH);
        this.f10192J = (ImageView) this.f10245c.findViewById(R.id.ajy);
        this.f10192J.setOnClickListener(this.f10216aH);
        this.f10193K = this.f10245c.findViewById(R.id.bde);
        this.f10193K.setOnClickListener(this.f10216aH);
        this.f10218aa = this.f10245c.findViewById(R.id.ue);
        this.f10218aa.setOnClickListener(this.f10216aH);
        this.f10207Y = this.f10245c.findViewById(R.id.cs9);
        this.f10246d = (EditText) this.f10245c.findViewById(R.id.be_);
        this.f10246d.setTextDirection(2);
        this.f10246d.setOnFocusChangeListener(new C3507ae(this));
        this.f10203U = this.f10245c.findViewById(R.id.cxn);
        this.f10248f = this.f10245c.findViewById(R.id.d61);
        this.f10219ab = this.f10245c.findViewById(R.id.cq7);
        this.f10220ac = (TextView) this.f10245c.findViewById(R.id.cq6);
        this.f10220ac.setOnClickListener(this.f10216aH);
        this.f10221ad = this.f10245c.findViewById(R.id.uq);
        this.f10221ad.setOnClickListener(this.f10216aH);
        this.f10204V = this.f10245c.findViewById(R.id.dfv);
        this.f10236as = (AbsStartLiveShareView) this.f10245c.findViewById(R.id.drc);
        this.f10197O = this.f10245c.findViewById(R.id.clo);
        this.f10198P = this.f10245c.findViewById(R.id.clm);
        this.f10198P.setOnClickListener(this.f10216aH);
        this.f10199Q = this.f10245c.findViewById(R.id.clx);
        this.f10199Q.setOnClickListener(this.f10216aH);
        this.f10200R = this.f10245c.findViewById(R.id.clq);
        this.f10200R.setOnClickListener(this.f10216aH);
        this.f10233ap = this.f10245c.findViewById(R.id.ev_);
        this.f10234aq = this.f10245c.findViewById(R.id.ev9);
        this.f10233ap.setOnClickListener(this.f10216aH);
        if (!(!((Boolean) LiveSettingKeys.LIVE_SHARE_LEAD_OUTTER.mo9431a()).booleanValue() || this.f10240aw == null || this.f10240aw.getSecret() == 1)) {
            this.f10233ap.setVisibility(0);
            this.f10234aq.setVisibility(0);
        }
        this.f10201S = this.f10245c.findViewById(R.id.avj);
        this.f10202T = this.f10245c.findViewById(R.id.clr);
        this.f10202T.setOnClickListener(this.f10216aH);
        this.f10228ak = this.f10245c.findViewById(R.id.cm1);
        this.f10229al = this.f10245c.findViewById(R.id.cln);
        this.f10229al.setOnClickListener(this.f10216aH);
        this.f10251i = (CheckedTextView) this.f10245c.findViewById(R.id.yf);
        this.f10222ae = (ImageView) this.f10245c.findViewById(R.id.cls);
        this.f10224ag = this.f10245c.findViewById(R.id.clt);
        this.f10223af = (TextView) this.f10245c.findViewById(R.id.clu);
        this.f10225ah = (ImageView) this.f10245c.findViewById(R.id.cly);
        this.f10226ai = (TextView) this.f10245c.findViewById(R.id.clz);
        this.f10227aj = this.f10245c.findViewById(R.id.cm2);
        this.f10196N = (TextView) this.f10245c.findViewById(R.id.ajk);
        this.f10196N.setOnClickListener(this.f10216aH);
        this.f10250h = (TextView) this.f10245c.findViewById(R.id.dbb);
        this.f10230am = (HSImageView) this.f10245c.findViewById(R.id.bcj);
        this.f10230am.setImageResource(R.drawable.bnz);
        this.f10230am.setOnClickListener(this.f10216aH);
        this.f10206X = this.f10245c.findViewById(R.id.api);
        this.f10232ao = (TextView) this.f10245c.findViewById(R.id.dba);
        this.f10231an = this.f10245c.findViewById(R.id.bck);
        this.f10253k = new C3776k(this.f10245c, this);
        if (this.f10247e <= 0) {
            this.f10247e = 20;
        }
        if (!this.f10211aC) {
            this.f10240aw.getAvatarMedium();
            mo8961a(0);
        }
        C3197a.m8831a();
        if (this.f10254l != null) {
            this.f10254l.mo8946b();
        }
        this.f10246d.addTextChangedListener(this.f10217aI);
        this.f10245c.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (C3589i.this.getContext() != null) {
                    C4609s.m11068b(C3589i.this.getContext(), C3589i.this.f10246d);
                }
                return false;
            }
        });
        if (mo8452l()) {
            if (this.f10265w != null && !this.f10265w.isDisposed()) {
                this.f10265w.dispose();
            }
            this.f10265w = C3395f.m9156f().mo8742c().mo9020c().getLatestRoom().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C3508af<Object>(this), C3509ag.f9999a);
        }
        if (!((Boolean) LiveSettingKeys.LIVE_START_BROADCAST_COVER.mo9431a()).booleanValue()) {
            this.f10206X.setVisibility(0);
            this.f10207Y.setVisibility(4);
            this.f10246d.setSingleLine();
            C3776k kVar = this.f10253k;
            C3776k.m9620a(kVar.f10670c, 8);
            C3776k.m9620a(kVar.f10668a, 8);
            C3776k.m9620a(kVar.f10669b, 8);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!this.f10211aC) {
            if (i != 20001 || VERSION.SDK_INT < 21) {
                C4116c.m10249a(C8803g.class);
                if (i2 != 0) {
                    this.f10253k.f10672e.mo9578a(i, i2, intent);
                } else if (i == 10001) {
                    mo8963c();
                } else {
                    if (i == 10002) {
                        mo8964d();
                    }
                }
            } else {
                if (i2 == -1) {
                    MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getActivity().getSystemService("media_projection");
                    if (mediaProjectionManager != null) {
                        MediaProjection mediaProjection = mediaProjectionManager.getMediaProjection(i2, intent);
                        if (mediaProjection != null) {
                            BgBroadcastServiceImpl.setProjection(mediaProjection);
                            mo8963c();
                            return;
                        }
                    }
                }
                C4575an.m10981a((int) R.string.f1x);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f10245c = LayoutInflater.from(getContext()).inflate(R.layout.akt, viewGroup, false);
        if (C4116c.m10249a(C4282a.class) == null || ((C4282a) C4116c.m10249a(C4282a.class)).user() == null || C4116c.m10249a(ILiveSDKService.class) == null || C4116c.m10249a(IHostNetwork.class) == null) {
            C4575an.m10981a((int) R.string.e_x);
            getActivity().finish();
            this.f10211aC = true;
            return null;
        }
        this.f10240aw = (User) ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a();
        if (this.f10240aw.getId() != ((Long) C4525b.f12312H.mo10345a()).longValue()) {
            C4525b.f12312H.mo10346a(Long.valueOf(this.f10240aw.getId()));
            C4525b.f12314J.mo10346a(C8710m.VIDEO.name());
        }
        C4495a.m10823a().mo10300a(C5206y.class).mo6513a(C4064k.m10180a(this)).mo6545f((C1710e<? super T>) new C1710e<C5206y>() {
            public final /* synthetic */ void accept(Object obj) throws Exception {
                C3589i.this.onEvent((C5206y) obj);
            }
        });
        return this.f10245c;
    }
}
