package com.bytedance.android.livesdk.gift.effect.doodle;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.core.p230g.C3897k;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4005af;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.C6736d;
import com.bytedance.android.livesdk.chatroom.api.DoodleGiftApi;
import com.bytedance.android.livesdk.chatroom.event.C5171aq;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.p325ui.RtlViewPagerShower;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C7648t;
import com.bytedance.android.livesdk.gift.DoodleCanvasView;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.effect.doodle.p360a.C7344a;
import com.bytedance.android.livesdk.gift.effect.doodle.p360a.C7346c;
import com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.DoodleTemplate;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.p379a.C7495f;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7565d;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p421v.C8374c;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C1674ab;
import p064c.p065a.C1681ae;
import p064c.p065a.C2203w;
import p064c.p065a.p071d.C1706a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.a */
public final class C7330a extends C6736d implements OnClickListener, C7366q {

    /* renamed from: A */
    private View f19973A;

    /* renamed from: B */
    private DoodleGiftView f19974B;

    /* renamed from: C */
    private TextView f19975C;

    /* renamed from: D */
    private ImageView f19976D;

    /* renamed from: E */
    private ImageView f19977E;

    /* renamed from: F */
    private ImageView f19978F;

    /* renamed from: G */
    private RecyclerView f19979G;

    /* renamed from: H */
    private View f19980H;

    /* renamed from: I */
    private TextView f19981I;

    /* renamed from: J */
    private TextView f19982J;

    /* renamed from: K */
    private ImageView f19983K;

    /* renamed from: L */
    private RtlViewPagerShower f19984L;

    /* renamed from: M */
    private Button f19985M;

    /* renamed from: N */
    private HSImageView f19986N;

    /* renamed from: O */
    private boolean f19987O;

    /* renamed from: P */
    private int f19988P;

    /* renamed from: Q */
    private int f19989Q;

    /* renamed from: R */
    private long f19990R;

    /* renamed from: S */
    private boolean f19991S;

    /* renamed from: T */
    private AnimatorSet f19992T = new AnimatorSet();

    /* renamed from: U */
    private AnimatorSet f19993U = new AnimatorSet();

    /* renamed from: V */
    private C8335g<C3009i> f19994V = new C8335g<C3009i>() {
        public final /* synthetic */ void onNext(Object obj) {
            super.onNext((C3009i) obj);
            ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
            C7330a aVar = C7330a.this;
            if (((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c() && aVar.f20001g != null && aVar.f20001g.getOwner() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("target_uid", String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()));
                hashMap.put("sec_target_uid", ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a().getSecUid());
                hashMap.put("packed_level", "2");
                hashMap.put("request_from", "admin");
                hashMap.put("current_room_id", String.valueOf(aVar.f20001g.getId()));
                hashMap.put("anchor_id", String.valueOf(aVar.f20001g.getOwner().getId()));
                hashMap.put("sec_anchor_id", aVar.f20001g.getOwner().getSecUid());
                ((C4005af) ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14515a(hashMap).mo6153a((C1681ae<T, ? extends R>) C4021e.m10137a((Fragment) aVar))).mo9410a(new C7353e(aVar), C4064k.m10187b());
            }
        }
    };

    /* renamed from: a */
    public Activity f19995a;

    /* renamed from: b */
    public boolean f19996b;

    /* renamed from: c */
    public boolean f19997c;

    /* renamed from: d */
    public boolean f19998d;

    /* renamed from: e */
    public long f19999e;

    /* renamed from: f */
    public DataCenter f20000f;

    /* renamed from: g */
    public Room f20001g;

    /* renamed from: h */
    public User f20002h;

    /* renamed from: i */
    User f20003i;

    /* renamed from: k */
    DoodleCanvasView f20004k;

    /* renamed from: l */
    View f20005l;

    /* renamed from: m */
    public ImageView f20006m;

    /* renamed from: n */
    public HSImageView f20007n;

    /* renamed from: o */
    public RecyclerView f20008o;

    /* renamed from: p */
    C8374c f20009p;

    /* renamed from: q */
    C7344a f20010q;

    /* renamed from: r */
    public C7346c f20011r;

    /* renamed from: s */
    C7525b f20012s;

    /* renamed from: t */
    boolean f20013t;

    /* renamed from: u */
    public int f20014u;

    /* renamed from: v */
    C7565d f20015v;

    /* renamed from: w */
    public String f20016w;

    /* renamed from: x */
    public int f20017x;

    /* renamed from: y */
    private View f20018y;

    /* renamed from: z */
    private View f20019z;

    /* renamed from: d */
    private void m15166d() {
        m15167e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13598a(List<C7495f> list) {
        if (list != null && !list.isEmpty()) {
            this.f20010q.mo13615a(mo13600b());
            this.f20010q.notifyDataSetChanged();
            m15160b(list.size());
        }
    }

    /* renamed from: a */
    public final void mo13597a(Object obj, boolean z) {
        if (obj instanceof C7495f) {
            if (this.f19979G != null) {
                C7495f fVar = (C7495f) obj;
                fVar.f20514b = z;
                int b = this.f20010q.mo13616b(fVar.mo13919p());
                if (b != -1) {
                    this.f19999e = fVar.mo13919p();
                    C1352v f = this.f19979G.mo4847f(b);
                    if (f instanceof C7361m) {
                        ((C7361m) f).mo13625a(z);
                    } else {
                        this.f20010q.notifyItemChanged(b);
                    }
                }
                if (z) {
                    C7505d r = fVar.mo13921r();
                    this.f20004k.mo13340a(r.f20543d, r.f20545f, r.f20541b);
                }
            }
        } else if ((obj instanceof DoodleTemplate) && this.f20008o != null) {
            DoodleTemplate doodleTemplate = (DoodleTemplate) obj;
            doodleTemplate.setSelected(z);
            C7346c cVar = this.f20011r;
            long id = doodleTemplate.getId();
            int i = 0;
            while (true) {
                if (i < cVar.f20040a.size()) {
                    if (cVar.f20040a.get(i) != null && ((DoodleTemplate) cVar.f20040a.get(i)).getId() == id) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                C1352v f2 = this.f20008o.mo4847f(i);
                if (f2 instanceof C7363o) {
                    ((C7363o) f2).mo13627a(z);
                    C9432q.m18691b((View) this.f19986N, 0);
                    C5213c.m11820a(this.f19986N, doodleTemplate.image);
                    this.f19986N.setAlpha(0.2f);
                    C9432q.m18691b(this.f19973A, 8);
                    if (z) {
                        m15161b(false);
                    }
                } else {
                    this.f20011r.notifyItemChanged(i);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13599a(final boolean z) {
        final View view = getView();
        if (view != null) {
            if (z) {
                this.f20014u = view.getHeight();
            }
            view.post(new Runnable() {
                public final void run() {
                    float f;
                    float f2;
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = (float) C7330a.this.f20014u;
                    }
                    if (z) {
                        f2 = (float) C7330a.this.f20014u;
                    } else {
                        f2 = 0.0f;
                    }
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, f2);
                    translateAnimation.setDuration(300);
                    translateAnimation.setFillAfter(true);
                    view.startAnimation(translateAnimation);
                }
            });
        }
    }

    /* renamed from: f */
    private void m15168f() {
        C9432q.m18691b((View) this.f19986N, 8);
    }

    /* renamed from: a */
    public final void mo13593a() {
        if (this.f20009p != null && this.f20009p.mo14577e()) {
            this.f20009p.dismiss();
        }
    }

    /* renamed from: i */
    private List<C7505d> m15169i() {
        ArrayList arrayList = new ArrayList();
        List<C7505d> giftList = GiftManager.inst().getGiftList();
        if (giftList != null && !giftList.isEmpty()) {
            for (C7505d dVar : giftList) {
                if (dVar != null && dVar.f20548i) {
                    if (dVar.f20564y) {
                        if (m15164c(dVar)) {
                            arrayList.add(dVar);
                        }
                    } else if (dVar.mo13923b()) {
                        if (m15158a(dVar)) {
                            arrayList.add(dVar);
                        }
                    } else if (!dVar.mo13924c()) {
                        arrayList.add(dVar);
                    } else if (m15162b(dVar)) {
                        arrayList.add(dVar);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    private List<C7505d> m15170j() {
        ArrayList arrayList = new ArrayList();
        List<GiftPage> giftPageList = GiftManager.inst().getGiftPageList();
        if (giftPageList != null && !giftPageList.isEmpty()) {
            for (GiftPage giftPage : giftPageList) {
                if (!(giftPage == null || giftPage.gifts == null || giftPage.gifts.isEmpty())) {
                    if (giftPage.pageType == 1) {
                        arrayList.addAll(giftPage.gifts);
                    } else if (giftPage.pageType == 2) {
                        arrayList.addAll(m15159b(giftPage.gifts));
                    } else if (giftPage.pageType == 3) {
                        arrayList.addAll(m15163c(giftPage.gifts));
                    } else if (giftPage.pageType == 4) {
                        arrayList.addAll(m15165d(giftPage.gifts));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    private void m15171k() {
        if (this.f19995a instanceof FragmentActivity) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(IWalletService.KEY_BUNDLE_IS_ANCHOR, this.f19996b);
            bundle.putString(IWalletService.KEY_BUNDLE_CHARGE_REASON, "click");
            if (((IWalletService) C4116c.m10249a(IWalletService.class)).getRechargeType() != 3) {
                ((IWalletService) C4116c.m10249a(IWalletService.class)).showRechargeDialog((FragmentActivity) this.f19995a, bundle, this.f20000f, new C7356h(this));
                mo13599a(true);
                return;
            }
            ((IWalletService) C4116c.m10249a(IWalletService.class)).showRechargeDialog((FragmentActivity) this.f19995a, bundle, this.f20000f, null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo13602c() {
        if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            ((C4002ac) ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14516a(this.f19995a, C8337i.m16520a().mo14541a()).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) this))).mo9407a((C1674ab<? super T>) this.f19994V);
        } else if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14528a(C8336h.RECHARGE)) {
            if (((Integer) LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE.mo9431a()).intValue() == 1) {
                m15171k();
            } else {
                ((IWalletService) C4116c.m10249a(IWalletService.class)).openWallet(this.f19995a);
            }
        }
    }

    public final void onResume() {
        super.onResume();
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()));
        C8049c.m15979a().mo14202a("livesdk_doodling_gift_canvas_opend_show", hashMap, Room.class, new C8059j());
        ((IWalletService) C4116c.m10249a(IWalletService.class)).walletCenter().mo10097e();
    }

    /* renamed from: e */
    private void m15167e() {
        if (this.f20008o != null && !this.f19992T.isRunning() && this.f20006m.getVisibility() != 8) {
            if (this.f19993U.isRunning()) {
                this.f19993U.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20006m, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.setDuration(167);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    C9432q.m18691b((View) C7330a.this.f20006m, 8);
                }
            });
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f20007n, "scaleX", new float[]{0.65f, 1.0f});
            ofFloat2.setDuration(167);
            this.f20007n.setPivotX(0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f20007n, "alpha", new float[]{0.0f, 1.0f});
            ofFloat3.setStartDelay(67);
            ofFloat3.setDuration(66);
            ofFloat3.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C9432q.m18691b((View) C7330a.this.f20007n, 0);
                }
            });
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f20008o, "translationX", new float[]{-240.0f, 0.0f, 0.0f});
            ofFloat4.setStartDelay(167);
            ofFloat4.setDuration(333);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f20008o, "alpha", new float[]{0.0f, 1.0f});
            ofFloat5.setStartDelay(167);
            ofFloat5.setDuration(166);
            ofFloat5.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C9432q.m18691b((View) C7330a.this.f20008o, 0);
                }
            });
            this.f19992T.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
            this.f19992T.setInterpolator(new LinearInterpolator());
            this.f19992T.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public List<C7495f> mo13600b() {
        List<C7505d> arrayList = new ArrayList<>();
        if (GiftManager.inst().isGiftListLoaded()) {
            int currentStrategyByLiveType = GiftManager.inst().getCurrentStrategyByLiveType();
            if (currentStrategyByLiveType == 0) {
                arrayList = m15169i();
            } else if (currentStrategyByLiveType == 1) {
                arrayList = m15170j();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C7505d dVar : arrayList) {
            if (dVar != null && dVar.f20548i && dVar.f20556q) {
                arrayList2.add(new C7495f(dVar));
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    private boolean m15158a(C7505d dVar) {
        return GiftManager.inst().canSendHonorGift(this.f20003i, dVar);
    }

    /* renamed from: b */
    private boolean m15162b(C7505d dVar) {
        return GiftManager.inst().canSendNobleGift(this.f20003i, dVar);
    }

    /* renamed from: b */
    private List<C7505d> m15159b(List<C7505d> list) {
        ArrayList arrayList = new ArrayList();
        for (C7505d dVar : list) {
            if (m15164c(dVar)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private List<C7505d> m15163c(List<C7505d> list) {
        ArrayList arrayList = new ArrayList();
        for (C7505d dVar : list) {
            if (m15158a(dVar)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private List<C7505d> m15165d(List<C7505d> list) {
        ArrayList arrayList = new ArrayList();
        for (C7505d dVar : list) {
            if (m15162b(dVar)) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f19998d) {
            i = R.style.yw;
        } else {
            i = R.style.yv;
        }
        setStyle(1, i);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C4495a.m10823a().mo10301a((Object) new C5171aq(false));
        super.onDismiss(dialogInterface);
        mo13593a();
    }

    /* renamed from: b */
    private void m15161b(boolean z) {
        if (z) {
            this.f20011r.mo13617a();
            m15168f();
            if (!this.f19991S) {
                C9432q.m18691b(this.f19973A, 0);
            }
            this.f20007n.setBackground(C3922z.m9911c(R.drawable.dzp));
            this.f20007n.setAlpha(1.0f);
            return;
        }
        this.f20007n.setBackground(C3922z.m9911c(R.drawable.dzq));
    }

    /* renamed from: c */
    private boolean m15164c(C7505d dVar) {
        if (this.f20001g == null || this.f20001g.getOwner() == null) {
            return false;
        }
        return GiftManager.inst().canSendFansClubGift(this.f20001g.getOwner(), this.f20003i, dVar);
    }

    /* renamed from: b */
    private void m15160b(int i) {
        this.f19988P = ((i - 1) / 4) + 1;
        if (this.f19988P == 1) {
            C9432q.m18691b((View) this.f19984L, 8);
            return;
        }
        Drawable drawable = this.f19995a.getResources().getDrawable(R.drawable.dzl);
        Drawable drawable2 = this.f19995a.getResources().getDrawable(R.drawable.dzm);
        int a = C3922z.m9899a(60.0f) / this.f19988P;
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setSize(a, C3922z.m9899a(1.0f));
            ((GradientDrawable) drawable2).setSize(a, C3922z.m9899a(1.0f));
        }
        this.f19984L.setMargin(0);
        this.f19984L.mo11848a(drawable, drawable2);
        this.f19984L.mo11847a(this.f19988P, this.f19989Q);
    }

    public final void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            if (!this.f19997c || (!this.f19996b && !C3894h.m9842a(getContext()))) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            if (this.f19997c) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
            window.setSoftInputMode(48);
            if (this.f19998d) {
                window.setLayout(-1, -2);
                LayoutParams attributes = window.getAttributes();
                attributes.width = C3922z.m9910c();
                attributes.height = C3922z.m9908b() - C3922z.m9912d();
                window.setAttributes(attributes);
                return;
            }
            window.setLayout(-1, -1);
        }
    }

    /* renamed from: a */
    private void m15156a(C7525b bVar) {
        long j;
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < bVar.f20670a.size(); i++) {
            C7648t tVar = (C7648t) bVar.f20670a.get(i);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("id", tVar.f21073c);
                jSONObject2.put("x", tVar.f21071a);
                jSONObject2.put("y", tVar.f21072b);
                jSONArray.put(jSONObject2);
            } catch (Exception unused) {
            }
        }
        try {
            jSONObject.put("points", jSONArray);
            jSONObject.put("origin_width", bVar.f20671b);
            jSONObject.put("origin_height", bVar.f20672c);
        } catch (Exception unused2) {
        }
        this.f20013t = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f20015v != C7565d.GUEST || this.f20002h == null) {
            j = this.f20001g.getOwnerUserId();
        } else {
            j = this.f20002h.getId();
        }
        ((DoodleGiftApi) C4157e.m10322a().mo9550a(DoodleGiftApi.class)).sendDoodleGift(998, this.f20001g.getId(), jSONObject.toString(), j).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6506a((C1710e<? super T>) new C7357i<Object>(this, bVar, uptimeMillis), (C1710e<? super Throwable>) new C7358j<Object>(this), (C1706a) new C7359k(this));
    }

    /* renamed from: a */
    public final void mo13594a(int i) {
        int i2 = i / 4;
        if (i2 >= 0 && i2 < this.f19988P) {
            this.f19989Q = i2;
            this.f19984L.mo11846a(this.f19989Q);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo13601b(long j) {
        if (j != 0) {
            int b = this.f20010q.mo13616b(j);
            if (b != -1) {
                this.f20010q.mo13614a(this.f20010q.mo13612a(j));
                mo13594a(b);
                this.f19979G.mo4814b((b / 4) * 4);
            }
        }
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.e2c) {
            dismiss();
            return;
        }
        if (view.getId() == R.id.e_w) {
            if (this.f20012s == null || this.f20012s.f20670a.size() < ((Integer) C6718b.f18308E.mo9431a()).intValue()) {
                C4575an.m10987a(C3897k.m9852a(C3922z.m9903a((int) R.string.ebx), C6718b.f18308E.mo9431a()));
            } else if (this.f20012s != null && this.f20012s.f20673d > 0 && !this.f20013t && this.f20001g != null) {
                if (!((IHostContext) C4116c.m10249a(IHostContext.class)).isLocalTest() && this.f19990R < ((long) this.f20012s.f20673d)) {
                    mo13602c();
                    C4575an.m10981a((int) R.string.f0x);
                } else if (!C7360l.m15199a(this.f19995a)) {
                    C4204a.m10421a((Context) this.f19995a, (int) R.string.e77);
                } else if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
                    ((C4002ac) ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14516a(this.f19995a, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ev8)).mo14539a(1001).mo14544d("live_detail").mo14545e("gift_send").mo14543c("enableGift").mo14541a()).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) this))).mo9407a((C1674ab<? super T>) this.f19994V);
                } else {
                    if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14528a(C8336h.GIFT)) {
                        if (((IHostContext) C4116c.m10249a(IHostContext.class)).isNeedProtectUnderage()) {
                            C4575an.m10981a((int) R.string.epj);
                        } else {
                            m15156a(this.f20012s);
                            dismiss();
                        }
                    }
                }
            }
        } else if (view.getId() == R.id.en9) {
            m15161b(true);
        } else if (view.getId() == R.id.ezg) {
            m15166d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13595a(long j) {
        this.f19990R = j;
        if (this.f19981I != null) {
            boolean c = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c();
            TextView textView = this.f19981I;
            if (!c) {
                j = 0;
            }
            textView.setText(String.valueOf(j));
        }
    }

    /* renamed from: a */
    private void m15157a(boolean z, CharSequence charSequence) {
        this.f19975C.setText(charSequence);
        if (z) {
            this.f19985M.setTextColor(C3922z.m9909b((int) R.color.alt));
            this.f19985M.setBackground(C3922z.m9911c(R.drawable.dzj));
            return;
        }
        this.f19985M.setTextColor(C3922z.m9909b((int) R.color.b2y));
        this.f19985M.setBackground(C3922z.m9911c(R.drawable.dzk));
    }

    /* renamed from: a */
    private static CharSequence m15155a(int i, int i2) {
        if (i < ((Integer) C6718b.f18308E.mo9431a()).intValue()) {
            return C3897k.m9852a(C3922z.m9903a((int) R.string.ebx), C6718b.f18308E.mo9431a());
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(String.valueOf(i2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C3922z.m9909b((int) R.color.b3e)), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.insert(0, C3922z.m9903a((int) R.string.hoy));
        spannableStringBuilder.append(C3922z.m9903a((int) R.string.e9h));
        return spannableStringBuilder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x02a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
            r3 = this;
            super.onViewCreated(r4, r5)
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r3.f20001g
            if (r4 != 0) goto L_0x000b
            r3.dismiss()
            return
        L_0x000b:
            android.view.View r4 = r3.getView()
            r3.f20018y = r4
            android.view.View r4 = r3.f20018y
            if (r4 == 0) goto L_0x02b8
            android.view.View r4 = r3.f20018y
            r5 = 2132018626(0x7f1405c2, float:1.9675564E38)
            android.view.View r4 = r4.findViewById(r5)
            r3.f20019z = r4
            android.view.View r4 = r3.f20018y
            r5 = 2132018627(0x7f1405c3, float:1.9675566E38)
            android.view.View r4 = r4.findViewById(r5)
            r3.f19973A = r4
            android.view.View r4 = r3.f20018y
            r5 = 2132018695(0x7f140607, float:1.9675704E38)
            android.view.View r4 = r4.findViewById(r5)
            com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView r4 = (com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView) r4
            r3.f19974B = r4
            android.view.View r4 = r3.f20018y
            r5 = 2132018621(0x7f1405bd, float:1.9675554E38)
            android.view.View r4 = r4.findViewById(r5)
            com.bytedance.android.livesdk.gift.DoodleCanvasView r4 = (com.bytedance.android.livesdk.gift.DoodleCanvasView) r4
            r3.f20004k = r4
            android.view.View r4 = r3.f20018y
            r5 = 2132023387(0x7f14185b, float:1.968522E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f19975C = r4
            android.view.View r4 = r3.f20018y
            r5 = 2132018104(0x7f1403b8, float:1.9674505E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f19978F = r4
            android.widget.ImageView r4 = r3.f19978F
            r4.setOnClickListener(r3)
            android.view.View r4 = r3.f20018y
            r5 = 2132018628(0x7f1405c4, float:1.9675568E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f19976D = r4
            android.view.View r4 = r3.f20018y
            r5 = 2132018622(0x7f1405be, float:1.9675556E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f19977E = r4
            android.view.View r4 = r3.f20018y
            r5 = 2132018546(0x7f140572, float:1.9675402E38)
            android.view.View r4 = r4.findViewById(r5)
            r3.f19980H = r4
            android.view.View r4 = r3.f20018y
            r5 = 2132018551(0x7f140577, float:1.9675412E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f19981I = r4
            android.view.View r4 = r3.f20018y
            r5 = 2132022104(0x7f141358, float:1.9682618E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f19982J = r4
            android.view.View r4 = r3.f20018y
            r5 = 2132022099(0x7f141353, float:1.9682608E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f19983K = r4
            android.view.View r4 = r3.f19980H
            com.bytedance.android.livesdk.gift.effect.doodle.b r5 = new com.bytedance.android.livesdk.gift.effect.doodle.b
            r5.<init>(r3)
            r4.setOnClickListener(r5)
            android.view.View r4 = r3.f20018y
            r5 = 2132021487(0x7f1410ef, float:1.9681367E38)
            android.view.View r4 = r4.findViewById(r5)
            com.bytedance.android.livesdk.chatroom.ui.RtlViewPagerShower r4 = (com.bytedance.android.livesdk.chatroom.p325ui.RtlViewPagerShower) r4
            r3.f19984L = r4
            android.view.View r4 = r3.f20018y
            r5 = 2132019356(0x7f14089c, float:1.9677045E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.Button r4 = (android.widget.Button) r4
            r3.f19985M = r4
            android.widget.Button r4 = r3.f19985M
            r4.setOnClickListener(r3)
            android.view.View r4 = r3.f20018y
            r5 = 2132019319(0x7f140877, float:1.967697E38)
            android.view.View r4 = r4.findViewById(r5)
            android.support.v7.widget.RecyclerView r4 = (android.support.p043v7.widget.RecyclerView) r4
            r3.f19979G = r4
            com.bytedance.android.livesdk.gift.effect.doodle.a.a r4 = new com.bytedance.android.livesdk.gift.effect.doodle.a.a
            android.app.Activity r5 = r3.f19995a
            r4.<init>(r5)
            r3.f20010q = r4
            com.bytedance.android.livesdk.gift.effect.doodle.a.a r4 = r3.f20010q
            r4.f20035a = r3
            android.support.v7.widget.RecyclerView r4 = r3.f19979G
            com.bytedance.android.livesdk.gift.effect.doodle.a.a r5 = r3.f20010q
            r4.setAdapter(r5)
            android.support.v7.widget.RecyclerView r4 = r3.f19979G
            android.support.v7.widget.LinearLayoutManager r5 = new android.support.v7.widget.LinearLayoutManager
            android.app.Activity r0 = r3.f19995a
            r1 = 0
            r5.<init>(r0, r1, r1)
            r4.setLayoutManager(r5)
            android.view.View r4 = r3.f20018y
            r5 = 2132018600(0x7f1405a8, float:1.9675511E38)
            android.view.View r4 = r4.findViewById(r5)
            r5 = 8
            r4.setVisibility(r5)
            android.view.View r4 = r3.f20018y
            r0 = 2132018547(0x7f140573, float:1.9675404E38)
            android.view.View r4 = r4.findViewById(r0)
            r4.setVisibility(r5)
            android.view.View r4 = r3.f20018y
            r5 = 2132023274(0x7f1417ea, float:1.9684991E38)
            android.view.View r4 = r4.findViewById(r5)
            com.bytedance.android.live.core.widget.HSImageView r4 = (com.bytedance.android.live.core.widget.HSImageView) r4
            r3.f19986N = r4
            android.view.View r4 = r3.f20018y
            r5 = 2132023273(0x7f1417e9, float:1.968499E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f20006m = r4
            android.widget.ImageView r4 = r3.f20006m
            r4.setOnClickListener(r3)
            android.view.View r4 = r3.f20018y
            r5 = 2132021296(0x7f141030, float:1.968098E38)
            android.view.View r4 = r4.findViewById(r5)
            com.bytedance.android.live.core.widget.HSImageView r4 = (com.bytedance.android.live.core.widget.HSImageView) r4
            r3.f20007n = r4
            com.bytedance.android.live.core.widget.HSImageView r4 = r3.f20007n
            r4.setOnClickListener(r3)
            android.view.View r4 = r3.f20018y
            r5 = 2132023276(0x7f1417ec, float:1.9684995E38)
            android.view.View r4 = r4.findViewById(r5)
            r3.f20005l = r4
            android.view.View r4 = r3.f20018y
            r5 = 2132023277(0x7f1417ed, float:1.9684997E38)
            android.view.View r4 = r4.findViewById(r5)
            android.support.v7.widget.RecyclerView r4 = (android.support.p043v7.widget.RecyclerView) r4
            r3.f20008o = r4
            com.bytedance.android.livesdk.gift.effect.doodle.a.c r4 = new com.bytedance.android.livesdk.gift.effect.doodle.a.c
            android.app.Activity r5 = r3.f19995a
            r4.<init>(r5)
            r3.f20011r = r4
            com.bytedance.android.livesdk.gift.effect.doodle.a.c r4 = r3.f20011r
            r4.f20041b = r3
            android.support.v7.widget.RecyclerView r4 = r3.f20008o
            com.bytedance.android.livesdk.gift.effect.doodle.a.c r5 = r3.f20011r
            r4.setAdapter(r5)
            android.support.v7.widget.RecyclerView r4 = r3.f20008o
            android.support.v7.widget.LinearLayoutManager r5 = new android.support.v7.widget.LinearLayoutManager
            android.app.Activity r0 = r3.f19995a
            r5.<init>(r0, r1, r1)
            r4.setLayoutManager(r5)
            android.support.v7.widget.RecyclerView r4 = r3.f20008o
            com.bytedance.android.livesdk.gift.effect.doodle.a$6 r5 = new com.bytedance.android.livesdk.gift.effect.doodle.a$6
            r5.<init>()
            r4.mo4798a(r5)
            com.bytedance.ies.sdk.widgets.DataCenter r4 = r3.f20000f
            if (r4 == 0) goto L_0x01a5
            com.bytedance.ies.sdk.widgets.DataCenter r4 = r3.f20000f
            java.lang.String r5 = "data_user_in_room"
            r0 = 0
            java.lang.Object r4 = r4.get(r5, r0)
            com.bytedance.android.live.base.model.user.User r4 = (com.bytedance.android.live.base.model.user.User) r4
            r3.f20003i = r4
        L_0x01a5:
            com.bytedance.android.livesdk.gift.effect.doodle.a$7 r4 = new com.bytedance.android.livesdk.gift.effect.doodle.a$7
            r4.<init>()
            r5 = 1
            com.bytedance.android.livesdk.widget.c.a r0 = r4.mo14964a(r5)
            r2 = 4
            r0.mo14967b(r2)
            android.support.v7.widget.RecyclerView r0 = r3.f19979G
            r4.mo14975a(r0)
            android.support.v7.widget.RecyclerView r4 = r3.f19979G
            com.bytedance.android.livesdk.gift.effect.doodle.a$8 r0 = new com.bytedance.android.livesdk.gift.effect.doodle.a$8
            r0.<init>()
            r4.mo4801a(r0)
            java.util.List r4 = r3.mo13600b()
            r3.mo13598a(r4)
            com.bytedance.android.livesdk.gift.GiftManager r4 = com.bytedance.android.livesdk.gift.GiftManager.inst()
            java.util.List r4 = r4.getDoodleTemplates()
            if (r4 == 0) goto L_0x01ef
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x01ef
            com.bytedance.android.live.core.setting.p<java.lang.Integer> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_DOODLE_TEMPLATE_ENABLE
            java.lang.Object r0 = r0.mo9431a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2 = 2
            if (r0 != r2) goto L_0x01ea
            r0 = 1
            goto L_0x01eb
        L_0x01ea:
            r0 = 0
        L_0x01eb:
            if (r0 == 0) goto L_0x01ef
            r0 = 1
            goto L_0x01f0
        L_0x01ef:
            r0 = 0
        L_0x01f0:
            r3.f19987O = r0
            boolean r0 = r3.f19987O
            if (r0 == 0) goto L_0x0244
            com.bytedance.android.livesdk.gift.effect.doodle.a.c r0 = r3.f20011r
            if (r4 == 0) goto L_0x020b
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0201
            goto L_0x020b
        L_0x0201:
            java.util.List<com.bytedance.android.livesdk.gift.model.DoodleTemplate> r2 = r0.f20040a
            r2.clear()
            java.util.List<com.bytedance.android.livesdk.gift.model.DoodleTemplate> r0 = r0.f20040a
            r0.addAll(r4)
        L_0x020b:
            com.bytedance.android.live.core.widget.HSImageView r4 = r3.f19986N
            com.bytedance.common.utility.C9432q.m18691b(r4, r1)
            android.view.View r4 = r3.f20005l
            com.bytedance.common.utility.C9432q.m18691b(r4, r1)
            com.bytedance.android.live.core.widget.HSImageView r4 = r3.f19986N
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            r0 = 1062836634(0x3f59999a, float:0.85)
            android.app.Activity r2 = r3.f19995a
            int r2 = com.bytedance.android.livesdk.p279af.C4577ap.m10991a(r2)
            float r2 = (float) r2
            float r2 = r2 * r0
            int r0 = (int) r2
            r4.width = r0
            int r0 = r4.width
            r4.height = r0
            com.bytedance.android.live.core.widget.HSImageView r0 = r3.f19986N
            r0.setLayoutParams(r4)
            r3.m15161b(r5)
            android.view.View r4 = r3.f20018y
            if (r4 == 0) goto L_0x0244
            android.view.View r4 = r3.f20018y
            com.bytedance.android.livesdk.gift.effect.doodle.g r5 = new com.bytedance.android.livesdk.gift.effect.doodle.g
            r5.<init>(r3)
            r4.post(r5)
        L_0x0244:
            com.bytedance.android.livesdk.gift.DoodleCanvasView r4 = r3.f20004k
            r4.setDoodleCanvasBackground(r1)
            com.bytedance.android.livesdk.gift.DoodleCanvasView r4 = r3.f20004k
            com.bytedance.android.livesdk.gift.effect.doodle.view.DoodleGiftView r5 = r3.f19974B
            r4.setDrawDoodleGiftView(r5)
            com.bytedance.android.livesdk.gift.DoodleCanvasView r4 = r3.f20004k
            com.bytedance.android.livesdk.gift.effect.doodle.a$9 r5 = new com.bytedance.android.livesdk.gift.effect.doodle.a$9
            r5.<init>()
            r4.setDoodleCanvasListener(r5)
            java.lang.CharSequence r4 = m15155a(r1, r1)
            r3.m15157a(r1, r4)
            android.widget.ImageView r4 = r3.f19976D
            r4.setEnabled(r1)
            android.widget.ImageView r4 = r3.f19977E
            r4.setEnabled(r1)
            android.widget.ImageView r4 = r3.f19976D
            com.bytedance.android.livesdk.gift.effect.doodle.c r5 = new com.bytedance.android.livesdk.gift.effect.doodle.c
            r5.<init>(r3)
            r4.setOnClickListener(r5)
            android.widget.ImageView r4 = r3.f19977E
            com.bytedance.android.livesdk.gift.effect.doodle.d r5 = new com.bytedance.android.livesdk.gift.effect.doodle.d
            r5.<init>(r3)
            r4.setOnClickListener(r5)
            com.bytedance.android.live.base.model.user.User r4 = r3.f20002h
            if (r4 == 0) goto L_0x029d
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r3.f20001g
            if (r4 == 0) goto L_0x029d
            com.bytedance.android.live.base.model.user.User r4 = r3.f20002h
            long r4 = r4.getId()
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r3.f20001g
            long r0 = r0.getOwnerUserId()
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0298
            goto L_0x029d
        L_0x0298:
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d r4 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7565d.GUEST
            r3.f20015v = r4
            goto L_0x02a1
        L_0x029d:
            com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d r4 = com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.C7565d.ANCHOR
            r3.f20015v = r4
        L_0x02a1:
            android.view.View r4 = r3.f20018y
            boolean r4 = r4 instanceof com.bytedance.android.livesdk.gift.effect.doodle.view.CustomConstraintLayout
            if (r4 == 0) goto L_0x02b3
            android.view.View r4 = r3.f20018y
            com.bytedance.android.livesdk.gift.effect.doodle.view.CustomConstraintLayout r4 = (com.bytedance.android.livesdk.gift.effect.doodle.view.CustomConstraintLayout) r4
            com.bytedance.android.livesdk.gift.effect.doodle.a$10 r5 = new com.bytedance.android.livesdk.gift.effect.doodle.a$10
            r5.<init>()
            r4.setDispatchTouchEventCallback(r5)
        L_0x02b3:
            long r4 = r3.f19999e
            r3.mo13601b(r4)
        L_0x02b8:
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r4 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r4 = com.bytedance.android.live.p245d.C4116c.m10249a(r4)
            com.bytedance.android.live.wallet.IWalletService r4 = (com.bytedance.android.live.wallet.IWalletService) r4
            com.bytedance.android.live.wallet.b r4 = r4.walletCenter()
            long r4 = r4.mo10092b()
            r3.mo13595a(r4)
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r4 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r4 = com.bytedance.android.live.p245d.C4116c.m10249a(r4)
            com.bytedance.android.live.wallet.IWalletService r4 = (com.bytedance.android.live.wallet.IWalletService) r4
            com.bytedance.android.live.wallet.b r4 = r4.walletCenter()
            c.a.v r4 = r4.mo10089a()
            com.bytedance.android.live.core.rxutils.autodispose.m r5 = com.bytedance.android.live.core.rxutils.autodispose.C4021e.m10137a(r3)
            java.lang.Object r4 = r4.mo6525a(r5)
            com.bytedance.android.live.core.rxutils.autodispose.ac r4 = (com.bytedance.android.live.core.rxutils.autodispose.C4002ac) r4
            com.bytedance.android.livesdk.gift.effect.doodle.f r5 = new com.bytedance.android.livesdk.gift.effect.doodle.f
            r5.<init>(r3)
            c.a.d.e r0 = com.bytedance.android.live.core.rxutils.C4064k.m10187b()
            r4.mo9406a(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.doodle.C7330a.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo13596a(C7525b bVar, boolean z) {
        boolean z2;
        boolean z3;
        if (bVar == null || bVar.f20670a.isEmpty()) {
            this.f20012s = null;
            this.f19991S = false;
            this.f19976D.setEnabled(false);
            this.f19977E.setEnabled(false);
            m15157a(false, m15155a(0, 0));
            if (z) {
                m15166d();
                if (this.f20011r != null && this.f20011r.f20042c == null) {
                    m15161b(true);
                }
            }
            if (!this.f19987O) {
                C9432q.m18691b(this.f19973A, 0);
            }
        } else {
            if (this.f20012s == null || bVar.f20673d > this.f20012s.f20673d) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f19991S = true;
            this.f20012s = bVar;
            this.f19976D.setEnabled(true);
            this.f19977E.setEnabled(true);
            C9432q.m18691b(this.f19973A, 8);
            int size = bVar.f20670a.size();
            if (size >= ((Integer) C6718b.f18308E.mo9431a()).intValue()) {
                z3 = true;
            } else {
                z3 = false;
            }
            m15157a(z3, m15155a(size, bVar.f20673d));
            if (z2 && this.f20008o != null && !this.f19993U.isRunning() && this.f20006m.getVisibility() != 0) {
                if (this.f19992T.isRunning()) {
                    this.f19992T.cancel();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f20008o, "translationX", new float[]{0.0f, -240.0f, -240.0f});
                ofFloat.setDuration(333);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f20008o, "alpha", new float[]{1.0f, 0.0f});
                ofFloat2.setDuration(167);
                ofFloat2.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C9432q.m18691b((View) C7330a.this.f20008o, 8);
                    }
                });
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f20007n, "scaleX", new float[]{1.0f, 0.65f});
                ofFloat3.setStartDelay(167);
                ofFloat3.setDuration(166);
                this.f20007n.setPivotX(0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f20007n, "alpha", new float[]{1.0f, 0.0f});
                ofFloat4.setStartDelay(167);
                ofFloat4.setDuration(166);
                ofFloat4.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C9432q.m18691b((View) C7330a.this.f20007n, 8);
                    }
                });
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f20006m, "alpha", new float[]{0.0f, 1.0f});
                ofFloat5.setStartDelay(300);
                ofFloat5.setDuration(166);
                ofFloat5.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationStart(Animator animator) {
                        C9432q.m18691b((View) C7330a.this.f20006m, 0);
                    }
                });
                this.f19993U.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
                this.f19993U.setInterpolator(new LinearInterpolator());
                this.f19993U.start();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.bw2, viewGroup, false);
    }
}
