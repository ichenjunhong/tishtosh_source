package com.bytedance.android.livesdk.gift.relay;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.linkpk.C4133a;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.chatroom.api.GiftRetrofitApi;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.p378h.C7459a;
import com.bytedance.android.livesdk.gift.relay.p381a.C7631c;
import com.bytedance.android.livesdk.gift.relay.p381a.C7631c.C7632a;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.SpecialCombView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a;
import com.bytedance.android.livesdkapi.depend.p435c.C8618a.C8619a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.relay.b */
public final class C7634b extends C6736d implements OnClickListener, C8619a {

    /* renamed from: A */
    private View f20995A;

    /* renamed from: B */
    private View f20996B;

    /* renamed from: C */
    private C1690c f20997C;

    /* renamed from: D */
    private C7631c f20998D;

    /* renamed from: E */
    private String f20999E;

    /* renamed from: F */
    private String f21000F;

    /* renamed from: G */
    private TextView f21001G;

    /* renamed from: H */
    private View f21002H;

    /* renamed from: I */
    private C4104a f21003I;

    /* renamed from: J */
    private C8335g<C3009i> f21004J = new C8335g<C3009i>() {
        public final /* synthetic */ void onNext(Object obj) {
            super.onNext((C3009i) obj);
            ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
        }
    };

    /* renamed from: a */
    public boolean f21005a;

    /* renamed from: b */
    public Activity f21006b;

    /* renamed from: c */
    public DataCenter f21007c;

    /* renamed from: d */
    public Room f21008d;

    /* renamed from: e */
    public boolean f21009e;

    /* renamed from: f */
    public boolean f21010f;

    /* renamed from: g */
    public boolean f21011g;

    /* renamed from: h */
    public long f21012h;

    /* renamed from: i */
    RecyclerView f21013i;

    /* renamed from: k */
    C7627a f21014k;

    /* renamed from: l */
    TextView f21015l;

    /* renamed from: m */
    boolean f21016m;

    /* renamed from: n */
    SpecialCombView f21017n;

    /* renamed from: o */
    ObjectAnimator f21018o;

    /* renamed from: p */
    C8618a f21019p;

    /* renamed from: q */
    int f21020q = ((Integer) C6718b.f18310G.mo9431a()).intValue();

    /* renamed from: r */
    C7514m f21021r;

    /* renamed from: s */
    private View f21022s;

    /* renamed from: t */
    private View f21023t;

    /* renamed from: u */
    private TextView f21024u;

    /* renamed from: v */
    private TextView f21025v;

    /* renamed from: w */
    private View f21026w;

    /* renamed from: x */
    private TextView f21027x;

    /* renamed from: y */
    private TextView f21028y;

    /* renamed from: z */
    private C1690c f21029z;

    public final void dismissAllowingStateLoss() {
        super.dismissAllowingStateLoss();
        if (this.f21005a && this.f21007c != null && this.f21008d != null) {
            this.f21007c.lambda$put$1$DataCenter("cmd_send_gift", this.f21008d.getOwner());
            this.f21005a = false;
        }
    }

    /* renamed from: b */
    private void m15629b() {
        if (getActivity() != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, this.f21010f);
            bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, "click");
            ((IWalletService) C4116c.m10249a(IWalletService.class)).showRechargeDialog(getActivity(), bundle, this.f21007c, null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f21029z != null && !this.f21029z.isDisposed()) {
            this.f21029z.dispose();
        }
        if (this.f20997C != null && !this.f20997C.isDisposed()) {
            this.f20997C.dispose();
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.f21014k.f20964b != null) {
            int a = this.f21014k.mo13991a(this.f21014k.f20964b);
            if (a >= 0) {
                C1352v f = this.f21013i.mo4847f(a);
                if (f instanceof C7642i) {
                    ((C7642i) f).mo13998a(false);
                }
            }
        }
    }

    public final void onResume() {
        super.onResume();
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
        int intValue = ((Integer) this.f21007c.get("data_gift_relay_recent_sent_index", Integer.valueOf(-1))).intValue();
        if (intValue == -1) {
            m15627a(0);
        } else {
            m15627a(intValue);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13994a() {
        if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            ((C4002ac) ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14516a(this.f21006b, C8337i.m16520a().mo14541a()).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) this))).mo9407a((C1674ab<? super T>) this.f21004J);
        } else if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14528a(C8336h.RECHARGE)) {
            if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.mo9431a()).intValue() == 1) {
                m15629b();
            } else {
                ((IWalletService) C4116c.m10249a(IWalletService.class)).openWallet(this.f21006b);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13995a(long j) {
        TextView textView = this.f21027x;
        if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            j = 0;
        }
        textView.setText(String.valueOf(j));
    }

    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f21011g) {
            i = R.style.yw;
        } else {
            i = R.style.yv;
        }
        setStyle(1, i);
    }

    /* renamed from: a */
    private void m15627a(int i) {
        if (i >= 0) {
            for (C7632a aVar : this.f21014k.f20963a) {
                if (aVar != null) {
                    int a = this.f21014k.mo13991a(aVar);
                    if (a >= 0) {
                        C1352v f = this.f21013i.mo4847f(a);
                        if (f instanceof C7642i) {
                            ((C7642i) f).mo13998a(false);
                        }
                    }
                }
            }
            C1352v f2 = this.f21013i.mo4847f(i);
            if (f2 instanceof C7642i) {
                ((C7642i) f2).mo13998a(true);
            }
            this.f21015l.setBackgroundResource(R.drawable.bp2);
            C7627a aVar2 = this.f21014k;
            if (aVar2.f20963a != null && i >= 0 && i < aVar2.f20963a.size()) {
                C7632a aVar3 = (C7632a) aVar2.f20963a.get(i);
                if (aVar2.f20964b != null) {
                    aVar2.f20964b.f20994g = false;
                }
                if (aVar3 != null) {
                    aVar3.f20994g = true;
                    aVar2.f20964b = aVar3;
                }
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            if (!this.f21009e || (!this.f21010f && !C3894h.m9842a(getContext()))) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            if (this.f21009e) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
            window.setSoftInputMode(48);
            if (this.f21011g) {
                window.setLayout(-1, -2);
                LayoutParams attributes = window.getAttributes();
                attributes.width = C3922z.m9910c();
                attributes.height = C3922z.m9908b() - C3922z.m9912d();
                window.setAttributes(attributes);
            } else {
                window.setLayout(-1, -1);
            }
        }
        this.f21019p = new C8618a(this);
    }

    /* renamed from: a */
    private void m15628a(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                if (new URI(str).getHost() != null) {
                    if (this.f21003I != null) {
                        this.f21003I.dismissAllowingStateLoss();
                        this.f21003I = null;
                    }
                    if (getContext() != null) {
                        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
                        int i = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
                        double d = (double) i;
                        Double.isNaN(d);
                        this.f21003I = ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10487a(C4704c.m11226a(str).mo10510a(i).mo10514b((int) (d * 1.4d)).mo10520e(80));
                        if (this.f21003I != null) {
                            C4104a.m10232a((FragmentActivity) getContext(), this.f21003I);
                        }
                    }
                }
            } catch (URISyntaxException unused) {
            }
        }
    }

    public final void onClick(View view) {
        long j;
        if (view != null) {
            int id = view.getId();
            if (id == R.id.alk) {
                if (this.f21001G.getVisibility() == 0 && this.f21002H.getVisibility() == 0) {
                    this.f21001G.setVisibility(8);
                    this.f21002H.setVisibility(8);
                    return;
                }
                this.f21005a = false;
                dismissAllowingStateLoss();
            } else if (id == R.id.sm) {
                mo13994a();
            } else {
                if (id == R.id.ckz || id == R.id.clh) {
                    if (!(this.f21014k == null || this.f21014k.f20964b == null)) {
                        C7632a aVar = this.f21014k.f20964b;
                        if (this.f20998D != null) {
                            j = this.f20998D.f20985c;
                        } else {
                            j = 0;
                        }
                        int i = aVar.f20989b;
                        C7505d findGiftById = GiftManager.inst().findGiftById(j);
                        if (findGiftById != null) {
                            if (!((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10093b((long) findGiftById.f20545f) && !((IHostContext) C4116c.m10249a(IHostContext.class)).isLocalTest()) {
                                mo13994a();
                            } else if (!this.f21016m) {
                                this.f21016m = true;
                                long uptimeMillis = SystemClock.uptimeMillis();
                                C2201v a = ((GiftRetrofitApi) C4157e.m10322a().mo9550a(GiftRetrofitApi.class)).send(j, this.f21008d.getId(), this.f21008d.getOwnerUserId(), i).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
                                C7639f fVar = new C7639f(this, j, uptimeMillis);
                                this.f20997C = a.mo6506a((C1710e<? super T>) fVar, (C1710e<? super Throwable>) new C7640g<Object>(this, j), (C1706a) new C7641h(this));
                            }
                        }
                    }
                } else if (id == R.id.alu || id == R.id.alx) {
                    m15628a(this.f21000F);
                    HashMap hashMap = new HashMap();
                    Room room = (Room) this.f21007c.get("data_room", null);
                    if (room != null) {
                        long id2 = room.getOwner().getId();
                        long id3 = room.getId();
                        hashMap.put("anchor_id", String.valueOf(id2));
                        hashMap.put("room_id", String.valueOf(id3));
                    }
                    C8049c.m15979a().mo14202a("livesdk_endless_gift_rule_click", hashMap, new Object[0]);
                } else if (id == R.id.ale) {
                    dismissAllowingStateLoss();
                } else if (id == R.id.alr || id == R.id.als) {
                    m15628a(this.f20999E);
                    HashMap hashMap2 = new HashMap();
                    Room room2 = (Room) this.f21007c.get("data_room", null);
                    if (room2 != null) {
                        long id4 = room2.getOwner().getId();
                        long id5 = room2.getId();
                        hashMap2.put("anchor_id", String.valueOf(id4));
                        hashMap2.put("room_id", String.valueOf(id5));
                    }
                    C8049c.m15979a().mo14202a("livesdk_endless_gift_rank_click", hashMap2, new Object[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo11060a(Message message) {
        String str;
        if (message.what == 0) {
            this.f21015l.setVisibility(0);
            this.f21017n.setVisibility(8);
            if (this.f21018o != null && this.f21018o.isStarted()) {
                this.f21018o.cancel();
            }
            if (this.f21021r != null) {
                C7505d findGiftById = GiftManager.inst().findGiftById(this.f21021r.f20613e);
                if (findGiftById != null) {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(this.f21021r.f20632x)) {
                        hashMap.put("request_page", this.f21021r.f20632x);
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(Long.valueOf(this.f21021r.f20613e), Integer.valueOf(this.f21021r.f20616h));
                    hashMap.put("gift_info", C7459a.m15414a(hashMap2));
                    hashMap.put("gift_cnt", String.valueOf(this.f21021r.f20616h));
                    hashMap.put("money", String.valueOf(this.f21021r.f20616h * findGiftById.f20545f));
                    hashMap.put("gift_type", "endless_gift");
                    C8049c a = C8049c.m15979a();
                    String str2 = "send_gift";
                    Object[] objArr = new Object[4];
                    C8059j jVar = new C8059j();
                    if (this.f21010f) {
                        str = "live_take_detail";
                    } else {
                        str = "live_detail";
                    }
                    objArr[0] = jVar.mo14213a(str).mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
                    objArr[1] = Room.class;
                    objArr[2] = this.f21021r;
                    objArr[3] = ((C4133a) C4116c.m10249a(C4133a.class)).getLinkCrossRoomLog();
                    a.mo14202a(str2, hashMap, objArr);
                    this.f21021r = null;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13996a(long j, long j2) {
        if (j == 1) {
            this.f21024u.setText(this.f21006b.getResources().getString(R.string.eca));
            TextView textView = this.f21025v;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f21006b.getResources().getString(R.string.ec6, new Object[]{String.valueOf(j)}));
            sb.append(" ");
            textView.setText(sb.toString());
        } else if (j > 100 || j < 1) {
            this.f21024u.setText(this.f21006b.getResources().getString(R.string.eca));
            TextView textView2 = this.f21025v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f21006b.getResources().getString(R.string.ecc));
            sb2.append(" ");
            textView2.setText(sb2.toString());
        } else {
            this.f21024u.setText(this.f21006b.getResources().getString(R.string.ecb, new Object[]{String.valueOf(j2)}));
            TextView textView3 = this.f21025v;
            Resources resources = this.f21006b.getResources();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(String.valueOf(j));
            sb3.append(" ");
            textView3.setText(resources.getString(R.string.ec6, new Object[]{sb3.toString()}));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        super.onViewCreated(view, bundle);
        View view2 = getView();
        if (view2 != null) {
            this.f21022s = view2.findViewById(R.id.alk);
            this.f21023t = view2.findViewById(R.id.alx);
            this.f21013i = (RecyclerView) view2.findViewById(R.id.bbo);
            this.f21027x = (TextView) view2.findViewById(R.id.d9e);
            this.f21028y = (TextView) view2.findViewById(R.id.sm);
            this.f21015l = (TextView) view2.findViewById(R.id.ckz);
            this.f20995A = view2.findViewById(R.id.ale);
            this.f20996B = view2.findViewById(R.id.alu);
            this.f21024u = (TextView) view2.findViewById(R.id.alr);
            this.f21025v = (TextView) view2.findViewById(R.id.als);
            this.f21026w = view2.findViewById(R.id.alt);
            this.f21017n = (SpecialCombView) view2.findViewById(R.id.clh);
            this.f21017n.setCountDownTime(this.f21020q);
            this.f21001G = (TextView) view2.findViewById(R.id.alv);
            this.f21002H = view2.findViewById(R.id.alw);
            this.f21022s.setOnClickListener(this);
            this.f21023t.setOnClickListener(this);
            this.f21028y.setOnClickListener(this);
            this.f21015l.setOnClickListener(this);
            this.f20995A.setOnClickListener(this);
            this.f20996B.setOnClickListener(this);
            this.f21017n.setOnClickListener(this);
            this.f21024u.setOnClickListener(this);
            this.f21025v.setOnClickListener(this);
            View view3 = this.f20995A;
            if (this.f21005a) {
                i = R.drawable.br1;
            } else {
                i = R.drawable.br3;
            }
            view3.setBackgroundResource(i);
            if (this.f21007c != null) {
                boolean booleanValue = ((Boolean) this.f21007c.get("data_is_gift_relay_showing", Boolean.valueOf(false))).booleanValue();
                TextView textView = this.f21015l;
                Resources resources = this.f21006b.getResources();
                if (booleanValue) {
                    i2 = R.string.ec4;
                } else {
                    i2 = R.string.f1n;
                }
                textView.setText(resources.getString(i2));
            }
            this.f20998D = GiftManager.inst().getGiftRelayInfo(this.f21012h);
            this.f21014k = new C7627a(this.f21006b, this.f20998D);
            this.f21013i.setAdapter(this.f21014k);
            if (this.f20998D != null) {
                C7627a aVar = this.f21014k;
                List<C7632a> list = this.f20998D.f20986d;
                if (list != null && !list.isEmpty()) {
                    aVar.f20963a.clear();
                    aVar.f20963a.addAll(list);
                    if (aVar.f20964b == null) {
                        for (C7632a aVar2 : aVar.f20963a) {
                            aVar2.f20994g = false;
                        }
                    }
                    aVar.notifyDataSetChanged();
                }
                String str = this.f20998D.f20987e;
                if (str != null && !str.isEmpty() && C35807d.m80935a(this.f21006b, "live_sp_gift_relay", 0).getBoolean("show_tips", true)) {
                    C35807d.m80935a(this.f21006b, "live_sp_gift_relay", 0).edit().putBoolean("show_tips", false).apply();
                    this.f21001G.setVisibility(0);
                    this.f21002H.setVisibility(0);
                    StringBuilder sb = new StringBuilder();
                    ArrayList<String> arrayList = new ArrayList<>();
                    String str2 = "";
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    for (int i3 = 0; i3 < str.length(); i3++) {
                        char charAt = str.charAt(i3);
                        if (charAt == '<') {
                            if (!str2.isEmpty()) {
                                arrayList.add(str2);
                                str2 = "";
                            }
                            z = false;
                            z2 = false;
                            z3 = true;
                        } else if (charAt == '>') {
                            z = true;
                            z3 = false;
                        } else if (z && z2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str2);
                            sb2.append(charAt);
                            str2 = sb2.toString();
                            sb.append(charAt);
                        } else if (!z3) {
                            sb.append(charAt);
                        } else if (charAt == '#') {
                            z2 = true;
                        }
                    }
                    String sb3 = sb.toString();
                    SpannableString spannableString = new SpannableString(sb3);
                    for (String str3 : arrayList) {
                        if (str3 != null && !str3.isEmpty()) {
                            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#F5A60A"));
                            int indexOf = sb3.indexOf(str3);
                            spannableString.setSpan(foregroundColorSpan, indexOf, str3.length() + indexOf, 34);
                        }
                    }
                    this.f21001G.setText(spannableString);
                }
                this.f21000F = this.f20998D.f20983a;
                if (this.f21000F == null || this.f21000F.isEmpty()) {
                    this.f20996B.setVisibility(8);
                }
                this.f20999E = this.f20998D.f20984b;
                if (this.f20999E == null || this.f20999E.isEmpty()) {
                    this.f21026w.setVisibility(8);
                }
            }
            this.f21013i.setLayoutManager(new LinearLayoutManager(this.f21006b, 0, false));
            this.f21014k.f20965c = new C7636c(this);
            Drawable drawable = this.f21006b.getResources().getDrawable(R.drawable.bsx);
            drawable.setBounds(new Rect(0, 0, (int) C4577ap.m10990a(this.f21006b, 16.0f), (int) C9432q.m18687b((Context) this.f21006b, 16.0f)));
            if (C4206c.m10426a(this.f21006b)) {
                this.f21027x.setCompoundDrawables(null, null, drawable, null);
            } else {
                this.f21027x.setCompoundDrawables(drawable, null, null, null);
            }
        }
        mo13995a(((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10092b());
        this.f21029z = ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10089a().mo6545f((C1710e<? super T>) new C7637d<Object>(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aia, viewGroup, false);
    }
}
