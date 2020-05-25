package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.text.TextUtils;
import android.util.LongSparseArray;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkpk.C4133a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C7519o;
import com.bytedance.android.livesdk.gift.GiftManager;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.model.GiftOperation;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;
import com.bytedance.android.livesdk.gift.p378h.C7459a;
import com.bytedance.android.livesdk.gift.panel.p380a.C7525b;
import com.bytedance.android.livesdk.gift.panel.p380a.C7526c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8058i;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GiftDialogViewModel extends C0209x {

    /* renamed from: A */
    public C0198r<Integer> f20754A;

    /* renamed from: B */
    public C0198r<C7514m> f20755B;

    /* renamed from: C */
    public C0198r<Boolean> f20756C;

    /* renamed from: D */
    public C0198r<String> f20757D;

    /* renamed from: E */
    public C0198r<List<GiftPage>> f20758E;

    /* renamed from: F */
    public C0198r<Integer> f20759F;

    /* renamed from: G */
    public C0198r<GiftOperation> f20760G;

    /* renamed from: H */
    public C0198r<Boolean> f20761H;

    /* renamed from: I */
    public C7514m f20762I;

    /* renamed from: J */
    public int f20763J;

    /* renamed from: K */
    public LongSparseArray<Integer> f20764K;

    /* renamed from: L */
    public C7562a f20765L;

    /* renamed from: M */
    private List<C0198r> f20766M;

    /* renamed from: N */
    private boolean f20767N;

    /* renamed from: a */
    public boolean f20768a;

    /* renamed from: b */
    public boolean f20769b = true;

    /* renamed from: c */
    public C7565d f20770c = C7565d.ANCHOR;

    /* renamed from: d */
    public int f20771d = 1;

    /* renamed from: e */
    public Room f20772e;

    /* renamed from: f */
    public User f20773f;

    /* renamed from: g */
    public C7595ao f20774g;

    /* renamed from: h */
    public boolean f20775h;

    /* renamed from: i */
    public C0198r<C7595ao> f20776i;

    /* renamed from: j */
    public C0198r<Boolean> f20777j;

    /* renamed from: k */
    public C0198r<Boolean> f20778k;

    /* renamed from: l */
    public C0198r<User> f20779l;

    /* renamed from: m */
    public C0198r<Boolean> f20780m;

    /* renamed from: n */
    public C0198r<Boolean> f20781n;

    /* renamed from: o */
    public C0198r<C7526c> f20782o;

    /* renamed from: p */
    public C0198r<Boolean> f20783p;

    /* renamed from: q */
    public C0198r<Boolean> f20784q;

    /* renamed from: r */
    public C0198r<C7490a> f20785r;

    /* renamed from: s */
    public C0198r<C7525b> f20786s;

    /* renamed from: t */
    public C0198r<Boolean> f20787t;

    /* renamed from: u */
    public C0198r<C7595ao> f20788u;

    /* renamed from: v */
    public C0198r<Integer> f20789v;

    /* renamed from: w */
    public C0198r<Integer> f20790w;

    /* renamed from: x */
    public C0198r<Boolean> f20791x;

    /* renamed from: y */
    public C0198r<C7563b> f20792y;

    /* renamed from: z */
    public C0198r<Long> f20793z;

    /* renamed from: com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$a */
    public interface C7562a {
        /* renamed from: a */
        int mo13951a(long j);
    }

    /* renamed from: com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$b */
    public enum C7563b {
        DIAMOND,
        GOLDEN_BEAN
    }

    /* renamed from: com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$c */
    public enum C7564c {
        NORMAL,
        GIFT,
        DOODLE_GIFT,
        PROP,
        TASK_GIFT,
        GIFT_AD
    }

    /* renamed from: com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel$d */
    public enum C7565d {
        ANCHOR,
        GUEST,
        OFFICIAL_GUEST
    }

    /* renamed from: a */
    public final int mo13947a() {
        if (this.f20771d > 0) {
            return this.f20771d;
        }
        return 1;
    }

    /* renamed from: c */
    public final void mo13950c() {
        String str;
        if (this.f20763J > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("source", String.valueOf(this.f20772e.getUserFrom()));
            hashMap.put("request_id", this.f20772e.getRequestId());
            hashMap.put("log_pb", this.f20772e.getLog_pb());
            if (this.f20785r.getValue() == null) {
                hashMap.put("gift_id", "-1");
            } else {
                hashMap.put("gift_id", String.valueOf(((C7490a) this.f20785r.getValue()).mo13919p()));
            }
            hashMap.put("gift_cnt", String.valueOf(this.f20763J));
            C8049c a = C8049c.m15979a();
            String str2 = "send_pop_gift";
            Object[] objArr = new Object[2];
            C8059j jVar = new C8059j();
            if (this.f20768a) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            objArr[0] = jVar.mo14213a(str).mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
            objArr[1] = Room.class;
            a.mo14202a(str2, hashMap, objArr);
            this.f20763J = 0;
        }
    }

    public GiftDialogViewModel() {
        ((Integer) LiveSettingKeys.LIVE_GIFT_DIALOG_STYLE.mo9431a()).intValue();
        this.f20767N = false;
        this.f20763J = 0;
        this.f20764K = new LongSparseArray<>();
        this.f20765L = new C7562a() {
            /* renamed from: a */
            public final int mo13951a(long j) {
                return ((Integer) GiftDialogViewModel.this.f20764K.get(j, Integer.valueOf(-1))).intValue();
            }
        };
        this.f20776i = new C0198r<>();
        this.f20777j = new C0198r<>();
        this.f20778k = new C0198r<>();
        this.f20779l = new C0198r<>();
        this.f20780m = new C0198r<>();
        this.f20781n = new C0198r<>();
        this.f20782o = new C0198r<>();
        this.f20783p = new C0198r<>();
        this.f20784q = new C0198r<>();
        this.f20785r = new C0198r<>();
        this.f20786s = new C0198r<>();
        this.f20787t = new C0198r<>();
        this.f20788u = new C0198r<>();
        this.f20789v = new C0198r<>();
        this.f20790w = new C0198r<>();
        this.f20791x = new C0198r<>();
        this.f20792y = new C0198r<>();
        this.f20793z = new C0198r<>();
        this.f20754A = new C0198r<>();
        this.f20755B = new C0198r<>();
        this.f20756C = new C0198r<>();
        this.f20757D = new C0198r<>();
        this.f20758E = new C0198r<>();
        this.f20759F = new C0198r<>();
        this.f20760G = new C0198r<>();
        this.f20761H = new C0198r<>();
        this.f20766M = new ArrayList();
        this.f20766M.add(this.f20776i);
        this.f20766M.add(this.f20777j);
        this.f20766M.add(this.f20778k);
        this.f20766M.add(this.f20779l);
        this.f20766M.add(this.f20780m);
        this.f20766M.add(this.f20781n);
        this.f20766M.add(this.f20782o);
        this.f20766M.add(this.f20783p);
        this.f20766M.add(this.f20784q);
        this.f20766M.add(this.f20785r);
        this.f20766M.add(this.f20786s);
        this.f20766M.add(this.f20787t);
        this.f20766M.add(this.f20788u);
        this.f20766M.add(this.f20789v);
        this.f20766M.add(this.f20790w);
        this.f20766M.add(this.f20791x);
        this.f20766M.add(this.f20792y);
        this.f20766M.add(this.f20793z);
        this.f20766M.add(this.f20785r);
        this.f20766M.add(this.f20754A);
        this.f20766M.add(this.f20755B);
        this.f20766M.add(this.f20756C);
        this.f20766M.add(this.f20757D);
        this.f20766M.add(this.f20758E);
        this.f20766M.add(this.f20759F);
        this.f20766M.add(this.f20760G);
        this.f20766M.add(this.f20761H);
    }

    /* renamed from: b */
    public final void mo13949b() {
        int i;
        int i2;
        int i3;
        long j;
        String str;
        int i4;
        int i5;
        int i6;
        String str2;
        if (this.f20762I != null && this.f20762I.f20613e != -1 && this.f20762I.f20616h > 0) {
            C7505d findGiftById = GiftManager.inst().findGiftById(this.f20762I.f20613e);
            if (findGiftById != null) {
                if (this.f20767N || !(findGiftById.f20544e == 2 || findGiftById.f20544e == 8)) {
                    if (this.f20762I.f20620l > 0) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        Long valueOf = Long.valueOf(this.f20762I.f20620l);
                        if (findGiftById.f20544e == 2) {
                            i4 = 1;
                        } else {
                            i4 = this.f20762I.f20616h;
                        }
                        hashMap2.put(valueOf, Integer.valueOf(i4));
                        hashMap.put("prop_info", C7459a.m15414a(hashMap2));
                        String str3 = "gift_cnt";
                        if (findGiftById.f20544e == 2) {
                            i5 = 1;
                        } else {
                            i5 = this.f20762I.f20616h;
                        }
                        hashMap.put(str3, String.valueOf(i5));
                        if (findGiftById.f20544e == 2) {
                            i6 = 1;
                        } else {
                            i6 = this.f20762I.f20616h;
                        }
                        hashMap.put("money", String.valueOf(i6 * findGiftById.f20545f));
                        if (!(this.f20773f == null || this.f20773f.getId() == this.f20772e.getOwnerUserId())) {
                            hashMap.put("to_user_id", String.valueOf(this.f20773f.getId()));
                        }
                        hashMap.put("user_id", String.valueOf(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b()));
                        C8049c a = C8049c.m15979a();
                        String str4 = "send_prop";
                        Object[] objArr = new Object[5];
                        C8059j jVar = new C8059j();
                        if (this.f20768a) {
                            str2 = "live_take_detail";
                        } else {
                            str2 = "live_detail";
                        }
                        objArr[0] = jVar.mo14213a(str2).mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
                        objArr[1] = Room.class;
                        objArr[2] = C7519o.m15513a(this.f20762I);
                        objArr[3] = ((C4133a) C4116c.m10249a(C4133a.class)).getLinkCrossRoomLog();
                        objArr[4] = new C8060k();
                        a.mo14202a(str4, hashMap, objArr);
                    } else {
                        int a2 = this.f20765L.mo13951a(this.f20762I.f20613e);
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("gift_position", String.valueOf(a2));
                        if (!TextUtils.isEmpty(this.f20762I.f20632x)) {
                            hashMap3.put("request_page", this.f20762I.f20632x);
                        }
                        HashMap hashMap4 = new HashMap();
                        Long valueOf2 = Long.valueOf(this.f20762I.f20613e);
                        if (findGiftById.f20544e == 2) {
                            i = 1;
                        } else {
                            i = this.f20762I.f20616h;
                        }
                        hashMap4.put(valueOf2, Integer.valueOf(i));
                        hashMap3.put("gift_info", C7459a.m15414a(hashMap4));
                        String str5 = "gift_cnt";
                        if (findGiftById.f20544e == 2) {
                            i2 = 1;
                        } else {
                            i2 = this.f20762I.f20616h;
                        }
                        hashMap3.put(str5, String.valueOf(i2));
                        if (findGiftById.f20544e == 2) {
                            i3 = 1;
                        } else {
                            i3 = this.f20762I.f20616h;
                        }
                        hashMap3.put("money", String.valueOf(i3 * findGiftById.f20545f));
                        if (!(this.f20773f == null || this.f20773f.getId() == this.f20772e.getOwnerUserId())) {
                            hashMap3.put("to_user_id", String.valueOf(this.f20773f.getId()));
                        }
                        hashMap3.put("is_first_consume", String.valueOf(((IWalletService) C4116c.m10249a(IWalletService.class)).isFirstConsume(((C4282a) C4116c.m10249a(C4282a.class)).user().mo14521a())));
                        hashMap3.put("growth_deepevent", "1");
                        String str6 = "to_user_id";
                        if (this.f20773f != null) {
                            j = this.f20773f.getId();
                        } else {
                            j = this.f20772e.getOwnerUserId();
                        }
                        hashMap3.put(str6, String.valueOf(j));
                        if (findGiftById.f20544e == 10) {
                            hashMap3.put("gift_type", "coin_gift");
                        }
                        if (!(this.f20773f == null || this.f20772e == null || this.f20773f.getId() == this.f20772e.getOwnerUserId())) {
                            this.f20762I.f20630v = C8058i.f22019b;
                        }
                        C8049c a3 = C8049c.m15979a();
                        String str7 = "send_gift";
                        Object[] objArr2 = new Object[4];
                        C8059j jVar2 = new C8059j();
                        if (this.f20768a) {
                            str = "live_take_detail";
                        } else {
                            str = "live_detail";
                        }
                        objArr2[0] = jVar2.mo14213a(str).mo14215c("bottom_tab").mo14214b("live_interact").mo14218f("other");
                        objArr2[1] = Room.class;
                        objArr2[2] = C7519o.m15513a(this.f20762I);
                        objArr2[3] = ((C4133a) C4116c.m10249a(C4133a.class)).getLinkCrossRoomLog();
                        a3.mo14202a(str7, hashMap3, objArr2);
                    }
                    this.f20762I = null;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13948a(C0184k kVar) {
        for (C0198r removeObservers : this.f20766M) {
            removeObservers.removeObservers(kVar);
        }
    }
}
