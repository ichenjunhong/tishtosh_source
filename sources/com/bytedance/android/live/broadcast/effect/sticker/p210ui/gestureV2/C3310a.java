package com.bytedance.android.live.broadcast.effect.sticker.p210ui.gestureV2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.bytedance.android.live.C2940a;
import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.api.p195b.C3040c;
import com.bytedance.android.live.broadcast.api.p195b.C3043d.C3045b;
import com.bytedance.android.live.broadcast.effect.C3203b;
import com.bytedance.android.live.broadcast.effect.sticker.C3287f;
import com.bytedance.android.live.broadcast.effect.sticker.p210ui.C3300a;
import com.bytedance.android.live.broadcast.effect.sticker.p210ui.gestureV2.C3323b.C3326c;
import com.bytedance.android.live.broadcast.effect.sticker.p210ui.gestureV2.C3331c.C3334c;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C4239a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p272ad.C4526c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.a */
public final class C3310a extends C2940a implements C3300a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f9528a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3310a.class), "gestureMagicTabAdapter", "getGestureMagicTabAdapter()Lcom/bytedance/android/live/broadcast/effect/sticker/ui/gestureV2/LiveGestureMagicTabAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3310a.class), "gestureMagicListAdapter", "getGestureMagicListAdapter()Lcom/bytedance/android/live/broadcast/effect/sticker/ui/gestureV2/LiveGestureMagicListAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C3310a.class), "liveComposerManager", "getLiveComposerManager()Lcom/bytedance/android/live/broadcast/api/effect/ILiveComposerManager;"))};

    /* renamed from: h */
    public static final C3311a f9529h = new C3311a(null);

    /* renamed from: b */
    public Map<String, C8688c> f9530b = new HashMap();

    /* renamed from: c */
    public List<? extends EffectCategoryResponse> f9531c;

    /* renamed from: d */
    public final HashMap<Integer, Integer[]> f9532d = new HashMap<>();

    /* renamed from: e */
    public int f9533e;

    /* renamed from: f */
    public DataCenter f9534f;

    /* renamed from: g */
    public boolean f9535g = true;

    /* renamed from: i */
    private OnDismissListener f9536i;

    /* renamed from: j */
    private final C52668f f9537j = C52732g.m112285a(new C3313c(this));

    /* renamed from: k */
    private final C52668f f9538k = C52732g.m112285a(C3312b.f9541a);

    /* renamed from: l */
    private final C52668f f9539l = C52732g.m112285a(C3314d.f9543a);

    /* renamed from: m */
    private HashMap f9540m;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.a$a */
    public static final class C3311a {
        private C3311a() {
        }

        public /* synthetic */ C3311a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.a$b */
    static final class C3312b extends C52712l implements C52670a<C3323b> {

        /* renamed from: a */
        public static final C3312b f9541a = new C3312b();

        C3312b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C3323b();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.a$c */
    static final class C3313c extends C52712l implements C52670a<C3331c> {

        /* renamed from: a */
        final /* synthetic */ C3310a f9542a;

        C3313c(C3310a aVar) {
            this.f9542a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C3331c(this.f9542a.getContext());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.a$d */
    static final class C3314d extends C52712l implements C52670a<C3040c> {

        /* renamed from: a */
        public static final C3314d f9543a = new C3314d();

        C3314d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C3395f.m9156f().mo8740a();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.a$e */
    static final class C3315e implements OnClickListener {

        /* renamed from: a */
        public static final C3315e f9544a = new C3315e();

        C3315e() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.a$f */
    static final class C3316f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3310a f9545a;

        C3316f(C3310a aVar) {
            this.f9545a = aVar;
        }

        public final void onClick(View view) {
            this.f9545a.mo8694d();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.a$g */
    static final class C3317g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3310a f9546a;

        C3317g(C3310a aVar) {
            this.f9546a = aVar;
        }

        public final void onClick(View view) {
            this.f9546a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.a$h */
    static final class C3318h implements OnClickListener {

        /* renamed from: a */
        public static final C3318h f9547a = new C3318h();

        C3318h() {
        }

        public final void onClick(View view) {
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.a$i */
    public static final class C3319i implements C3334c {

        /* renamed from: a */
        final /* synthetic */ C3310a f9548a;

        C3319i(C3310a aVar) {
            this.f9548a = aVar;
        }

        /* renamed from: a */
        public final void mo8701a(int i) {
            int i2;
            if (this.f9548a.mo8696f()) {
                List<? extends EffectCategoryResponse> list = this.f9548a.f9531c;
                if (list != null) {
                    i2 = list.size();
                } else {
                    i2 = -1;
                }
                if (i2 >= i) {
                    List<? extends EffectCategoryResponse> list2 = this.f9548a.f9531c;
                    if (list2 != null) {
                        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) list2.get(i);
                        if (effectCategoryResponse != null) {
                            this.f9548a.mo8688a(this.f9548a.f9533e);
                            this.f9548a.f9533e = i;
                            C3323b b = this.f9548a.mo8691b();
                            if (effectCategoryResponse != null && !C9414h.m18630a(effectCategoryResponse.getTotalEffects())) {
                                b.f9557e = effectCategoryResponse;
                                b.f9556d.clear();
                                for (Effect a : effectCategoryResponse.getTotalEffects()) {
                                    C8688c a2 = C3287f.m9010a(a);
                                    C52711k.m112236a((Object) a2, "sticker");
                                    a2.f23760u = b.f9553a.mo8282a(a2);
                                    b.f9556d.add(a2);
                                }
                                if (b.f9555c != null) {
                                    C8688c cVar = b.f9555c;
                                    if (cVar == null) {
                                        C52711k.m112234a();
                                    }
                                    if (!C3323b.m9061a(cVar, b.f9556d)) {
                                        b.f9555c = null;
                                    }
                                }
                                b.notifyDataSetChanged();
                            }
                            SwitchCompat switchCompat = (SwitchCompat) this.f9548a.mo8690b(R.id.akf);
                            C52711k.m112236a((Object) switchCompat, "gesture_magic_switch");
                            if (switchCompat.isChecked()) {
                                this.f9548a.mo8692b(effectCategoryResponse, i);
                            } else {
                                this.f9548a.mo8689a(effectCategoryResponse, i);
                            }
                            Integer[] numArr = (Integer[]) this.f9548a.f9532d.get(Integer.valueOf(this.f9548a.f9533e));
                            if (numArr != null && numArr.length == 2) {
                                StringBuilder sb = new StringBuilder("x:");
                                sb.append(numArr);
                                sb.append("[0]+y:");
                                sb.append(numArr);
                                sb.append("[1]");
                                C3831a.m9716d("LiveGestureMagicDialogFragment", sb.toString());
                                RecyclerView recyclerView = (RecyclerView) this.f9548a.mo8690b(R.id.e_d);
                                C52711k.m112236a((Object) recyclerView, "gesture_magic_list");
                                C1332i layoutManager = recyclerView.getLayoutManager();
                                if (!(layoutManager instanceof LinearLayoutManager)) {
                                    layoutManager = null;
                                }
                                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                                if (linearLayoutManager != null) {
                                    linearLayoutManager.mo4721a(numArr[0].intValue(), numArr[1].intValue());
                                }
                            }
                            this.f9548a.mo8695e();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.a$j */
    public static final class C3320j implements C3326c {

        /* renamed from: a */
        final /* synthetic */ C3310a f9549a;

        C3320j(C3310a aVar) {
            this.f9549a = aVar;
        }

        /* renamed from: a */
        public final void mo8702a(boolean z, C8688c cVar) {
            String str;
            if (this.f9549a.mo8696f() && ((SwitchCompat) this.f9549a.mo8690b(R.id.akf)) != null) {
                if (cVar != null) {
                    str = cVar.f23759t;
                } else {
                    str = null;
                }
                if (!C9431p.m18664a(str)) {
                    this.f9549a.mo8687a().mo8710a(z, this.f9549a.f9533e);
                    if (z) {
                        C3203b b = C3395f.m9156f().mo8741b();
                        C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
                        if (b.mo8551a().mo8282a(cVar)) {
                            SwitchCompat switchCompat = (SwitchCompat) this.f9549a.mo8690b(R.id.akf);
                            if (switchCompat != null && switchCompat.isChecked()) {
                                this.f9549a.mo8693c().mo8268a(C3037b.f8913a, cVar);
                            }
                        }
                    } else {
                        this.f9549a.mo8693c().mo8274b(C3037b.f8913a, cVar);
                    }
                    this.f9549a.mo8695e();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.a$k */
    static final class C3321k implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C3310a f9550a;

        C3321k(C3310a aVar) {
            this.f9550a = aVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            if (!this.f9550a.f9535g) {
                Map hashMap = new HashMap();
                String str2 = "status";
                if (z) {
                    str = "on";
                } else {
                    str = "off";
                }
                hashMap.put(str2, str);
                C8049c.m15979a().mo14202a("live_take_gesture_switch_click", hashMap, Room.class);
            } else {
                this.f9550a.f9535g = false;
            }
            C4526c<Boolean> cVar = C4525b.f12372ao;
            C52711k.m112236a((Object) cVar, "LivePluginProperties.GESTURE_MAGIC_SWITCH");
            cVar.mo10346a(Boolean.valueOf(z));
            C3331c a = this.f9550a.mo8687a();
            if (a.f9577d != z) {
                a.f9577d = z;
            }
            C3323b b = this.f9550a.mo8691b();
            if (b.f9559g != z) {
                b.f9559g = z;
            }
            if (z) {
                View b2 = this.f9550a.mo8690b(R.id.bmv);
                C52711k.m112236a((Object) b2, "mongolian_view");
                b2.setVisibility(8);
                TextView textView = (TextView) this.f9550a.mo8690b(R.id.d_u);
                C52711k.m112236a((Object) textView, "tv_gesture_magic_tip");
                textView.setText(C3922z.m9903a((int) R.string.hql));
                for (C8688c a2 : this.f9550a.f9530b.values()) {
                    this.f9550a.mo8693c().mo8268a(C3037b.f8913a, a2);
                }
                this.f9550a.mo8695e();
                return;
            }
            C4526c<Map<String, Boolean>> cVar2 = C4525b.f12371an;
            C52711k.m112236a((Object) cVar2, "LivePluginProperties.SHOW_GUIDE_GESTURE_MAGIC_V2");
            cVar2.mo10346a(new HashMap());
            TextView textView2 = (TextView) this.f9550a.mo8690b(R.id.d_u);
            C52711k.m112236a((Object) textView2, "tv_gesture_magic_tip");
            textView2.setText(C3922z.m9903a((int) R.string.hqk));
            View b3 = this.f9550a.mo8690b(R.id.bmv);
            C52711k.m112236a((Object) b3, "mongolian_view");
            b3.setVisibility(0);
            this.f9550a.f9530b.clear();
            List<C8688c> a3 = this.f9550a.mo8693c().mo8260a(C3037b.f8913a);
            C52711k.m112236a((Object) a3, "liveComposerManager.getC…ickerPanel.GESTURE_PANEL)");
            for (C8688c cVar3 : a3) {
                List<? extends EffectCategoryResponse> list = this.f9550a.f9531c;
                if (list != null) {
                    for (EffectCategoryResponse effectCategoryResponse : list) {
                        C52711k.m112236a((Object) cVar3, "sticker");
                        List totalEffects = effectCategoryResponse.getTotalEffects();
                        C52711k.m112236a((Object) totalEffects, "it.totalEffects");
                        if (C3310a.m9045a(cVar3, totalEffects)) {
                            Map<String, C8688c> map = this.f9550a.f9530b;
                            String id = effectCategoryResponse.getId();
                            C52711k.m112236a((Object) id, "it.id");
                            map.put(id, cVar3);
                        }
                    }
                }
            }
            this.f9550a.mo8693c().mo8273b(C3037b.f8913a);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.a$l */
    public static final class C3322l implements C3045b {

        /* renamed from: a */
        final /* synthetic */ C3310a f9551a;

        /* renamed from: a */
        public final void mo8286a() {
            if (this.f9551a.mo8696f()) {
                ((LoadingStatusView) this.f9551a.mo8690b(R.id.csv)).mo9845d();
            }
        }

        C3322l(C3310a aVar) {
            this.f9551a = aVar;
        }

        /* renamed from: a */
        public final void mo8287a(EffectChannelResponse effectChannelResponse) {
            if (this.f9551a.mo8696f()) {
                if (effectChannelResponse != null) {
                    List categoryResponseList = effectChannelResponse.getCategoryResponseList();
                    if (categoryResponseList != null && !categoryResponseList.isEmpty()) {
                        this.f9551a.f9531c = effectChannelResponse.getCategoryResponseList();
                        ((LoadingStatusView) this.f9551a.mo8690b(R.id.csv)).mo9842a();
                        LoadingStatusView loadingStatusView = (LoadingStatusView) this.f9551a.mo8690b(R.id.csv);
                        C52711k.m112236a((Object) loadingStatusView, "status_view");
                        loadingStatusView.setVisibility(8);
                        C3331c a = this.f9551a.mo8687a();
                        a.f9574a = effectChannelResponse.getCategoryResponseList();
                        a.notifyDataSetChanged();
                        C3334c cVar = a.f9576c;
                        if (cVar != null) {
                            cVar.mo8701a(a.f9575b);
                        }
                        C3310a aVar = this.f9551a;
                        List<? extends EffectCategoryResponse> list = aVar.f9531c;
                        if (list != null) {
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                SwitchCompat switchCompat = (SwitchCompat) aVar.mo8690b(R.id.akf);
                                C52711k.m112236a((Object) switchCompat, "gesture_magic_switch");
                                if (switchCompat.isChecked()) {
                                    aVar.mo8692b((EffectCategoryResponse) list.get(i), i);
                                } else {
                                    aVar.mo8689a((EffectCategoryResponse) list.get(i), i);
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                ((LoadingStatusView) this.f9551a.mo8690b(R.id.csv)).mo9844c();
            }
        }
    }

    /* renamed from: a */
    public final C3331c mo8687a() {
        return (C3331c) this.f9537j.getValue();
    }

    /* renamed from: b */
    public final View mo8690b(int i) {
        if (this.f9540m == null) {
            this.f9540m = new HashMap();
        }
        View view = (View) this.f9540m.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f9540m.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    public final C3323b mo8691b() {
        return (C3323b) this.f9538k.getValue();
    }

    /* renamed from: c */
    public final C3040c mo8693c() {
        return (C3040c) this.f9539l.getValue();
    }

    public final void onStart() {
        super.onStart();
        mo8694d();
    }

    public final boolean isShowing() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog.isShowing();
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo8696f() {
        if (!isAdded() || isHidden() || getView() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo8694d() {
        ((LoadingStatusView) mo8690b(R.id.csv)).mo9843b();
        C3203b b = C3395f.m9156f().mo8741b();
        C52711k.m112236a((Object) b, "LiveInternalService.inst().liveEffectService()");
        b.mo8551a().mo8280a(C3037b.f8913a, new C3322l(this));
    }

    public final void onDestroyView() {
        mo8688a(this.f9533e);
        SwitchCompat switchCompat = (SwitchCompat) mo8690b(R.id.akf);
        C52711k.m112236a((Object) switchCompat, "gesture_magic_switch");
        if (switchCompat.isChecked()) {
            C4526c<Map<String, String>> cVar = C4525b.f12374aq;
            C52711k.m112236a((Object) cVar, "LivePluginProperties.GESTURE_MAGIC_OLD_SELECT_PATH");
            cVar.mo10346a(new HashMap());
        } else {
            C4526c<Map<String, String>> cVar2 = C4525b.f12374aq;
            C52711k.m112236a((Object) cVar2, "LivePluginProperties.GESTURE_MAGIC_OLD_SELECT_PATH");
            Map map = (Map) cVar2.mo10345a();
            for (Entry entry : this.f9530b.entrySet()) {
                C52711k.m112236a((Object) map, "saveMap");
                map.put(entry.getKey(), ((C8688c) entry.getValue()).f23759t);
            }
            C4526c<Map<String, String>> cVar3 = C4525b.f12374aq;
            C52711k.m112236a((Object) cVar3, "LivePluginProperties.GESTURE_MAGIC_OLD_SELECT_PATH");
            cVar3.mo10346a(map);
        }
        this.f9535g = true;
        super.onDestroyView();
        if (this.f9540m != null) {
            this.f9540m.clear();
        }
    }

    /* renamed from: e */
    public final void mo8695e() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        List<? extends EffectCategoryResponse> list = this.f9531c;
        if (list != null) {
            EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) list.get(this.f9533e);
            if (effectCategoryResponse != null) {
                List a = mo8693c().mo8260a(C3037b.f8913a);
                C52711k.m112236a((Object) a, "liveComposerManager.getC…ickerPanel.GESTURE_PANEL)");
                Iterator it = a.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    C8688c cVar = (C8688c) obj2;
                    C52711k.m112236a((Object) cVar, "it");
                    List totalEffects = effectCategoryResponse.getTotalEffects();
                    C52711k.m112236a((Object) totalEffects, "response.totalEffects");
                    if (m9045a(cVar, totalEffects)) {
                        break;
                    }
                }
                if (((C8688c) obj2) != null) {
                    C4526c<Map<String, Boolean>> cVar2 = C4525b.f12371an;
                    C52711k.m112236a((Object) cVar2, "LivePluginProperties.SHOW_GUIDE_GESTURE_MAGIC_V2");
                    Map map = (Map) cVar2.mo10345a();
                    if (!map.containsKey(effectCategoryResponse.getId()) || (!C52711k.m112239a((Object) (Boolean) map.get(effectCategoryResponse.getId()), (Object) Boolean.valueOf(true)))) {
                        C52711k.m112236a((Object) map, "gestureGuideMap");
                        map.put(effectCategoryResponse.getId(), Boolean.valueOf(true));
                        List tags = effectCategoryResponse.getTags();
                        C52711k.m112236a((Object) tags, "response.tags");
                        Iterator it2 = tags.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            String str = (String) obj3;
                            C52711k.m112236a((Object) str, "it");
                            if (C52830p.m112411b(str, "tip", false, 2, null)) {
                                break;
                            }
                        }
                        String str2 = (String) obj3;
                        if (str2 != null) {
                            Iterator it3 = C52830p.m112452b((CharSequence) str2, new String[]{":"}, false, 0, 6, (Object) null).iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj4 = null;
                                    break;
                                }
                                obj4 = it3.next();
                                if (!C9431p.m18665a("tip", (String) obj4)) {
                                    break;
                                }
                            }
                            String str3 = (String) obj4;
                            if (str3 != null) {
                                obj = str3;
                            }
                        }
                        if (obj != null) {
                            DataCenter dataCenter = this.f9534f;
                            if (dataCenter == null) {
                                C52711k.m112237a("dataCenter");
                            }
                            dataCenter.lambda$put$1$DataCenter("cmd_sticker_tip", obj);
                            C4526c<Map<String, Boolean>> cVar3 = C4525b.f12371an;
                            C52711k.m112236a((Object) cVar3, "LivePluginProperties.SHOW_GUIDE_GESTURE_MAGIC_V2");
                            cVar3.mo10346a(map);
                        }
                    }
                }
            }
        }
    }

    public final void setOnDismissListener(OnDismissListener onDismissListener) {
        C52711k.m112240b(onDismissListener, "onDismissListener");
        this.f9536i = onDismissListener;
    }

    /* renamed from: a */
    public static final C3310a m9044a(DataCenter dataCenter) {
        C52711k.m112240b(dataCenter, "dataCenter");
        C3310a aVar = new C3310a();
        aVar.f9534f = dataCenter;
        return aVar;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.z7);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f9536i != null) {
            OnDismissListener onDismissListener = this.f9536i;
            if (onDismissListener == null) {
                C52711k.m112234a();
            }
            onDismissListener.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: a */
    public final void mo8688a(int i) {
        RecyclerView recyclerView = (RecyclerView) mo8690b(R.id.e_d);
        C52711k.m112236a((Object) recyclerView, "gesture_magic_list");
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            View g = linearLayoutManager.mo5050g(0);
            if (g != null) {
                C52711k.m112236a((Object) g, "layoutManager.getChildAt(0) ?: return");
                this.f9532d.put(Integer.valueOf(i), new Integer[]{Integer.valueOf(LinearLayoutManager.m4418c(g)), Integer.valueOf(g.getLeft())});
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.requestWindowFeature(1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(true);
        }
        super.onActivityCreated(bundle);
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            Window window = dialog3.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        Dialog dialog4 = getDialog();
        if (dialog4 != null) {
            Window window2 = dialog4.getWindow();
            if (window2 != null) {
                window2.setGravity(80);
            }
        }
        Dialog dialog5 = getDialog();
        if (dialog5 != null) {
            Window window3 = dialog5.getWindow();
            if (window3 != null) {
                window3.setLayout(-1, C3922z.m9899a(228.0f));
            }
        }
    }

    /* renamed from: a */
    public static boolean m9045a(C8688c cVar, List<? extends Effect> list) {
        Object obj;
        boolean z;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Effect effect = (Effect) obj;
            long j = cVar.f23744e;
            Long valueOf = Long.valueOf(effect.getEffectId());
            if (valueOf != null && j == valueOf.longValue()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo8692b(EffectCategoryResponse effectCategoryResponse, int i) {
        Object obj;
        boolean z;
        List a = mo8693c().mo8260a(C3037b.f8913a);
        C52711k.m112236a((Object) a, "liveComposerManager.getC…ickerPanel.GESTURE_PANEL)");
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C8688c cVar = (C8688c) obj;
            C52711k.m112236a((Object) cVar, "it");
            List totalEffects = effectCategoryResponse.getTotalEffects();
            C52711k.m112236a((Object) totalEffects, "response.totalEffects");
            if (m9045a(cVar, totalEffects)) {
                break;
            }
        }
        C8688c cVar2 = (C8688c) obj;
        C3331c a2 = mo8687a();
        if (cVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        a2.mo8710a(z, i);
        if (i == this.f9533e && cVar2 != null) {
            mo8691b().mo8704a(cVar2);
        }
    }

    /* renamed from: a */
    public final void mo8689a(EffectCategoryResponse effectCategoryResponse, int i) {
        Object obj;
        C4526c<Map<String, String>> cVar = C4525b.f12374aq;
        C52711k.m112236a((Object) cVar, "LivePluginProperties.GESTURE_MAGIC_OLD_SELECT_PATH");
        String str = (String) ((Map) cVar.mo10345a()).get(effectCategoryResponse.getId());
        if (str != null) {
            List totalEffects = effectCategoryResponse.getTotalEffects();
            C52711k.m112236a((Object) totalEffects, "response.totalEffects");
            Iterator it = totalEffects.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Effect effect = (Effect) obj;
                C52711k.m112236a((Object) effect, "it");
                if (C9431p.m18665a(effect.getUnzipPath(), str)) {
                    break;
                }
            }
            Effect effect2 = (Effect) obj;
            if (effect2 != null) {
                C8688c a = C3287f.m9010a(effect2);
                Map<String, C8688c> map = this.f9530b;
                String id = effectCategoryResponse.getId();
                C52711k.m112236a((Object) id, "response.id");
                C52711k.m112236a((Object) a, "sticker");
                map.put(id, a);
                mo8687a().mo8710a(true, i);
                if (i == this.f9533e) {
                    mo8691b().mo8704a(a);
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        ((LoadingStatusView) mo8690b(R.id.csv)).setOnClickListener(C3315e.f9544a);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aqx, null, false);
        inflate.setOnClickListener(new C3316f(this));
        ((LoadingStatusView) mo8690b(R.id.csv)).setBuilder(C4239a.m10480a(getContext()).mo9847a((int) C9432q.m18687b(getContext(), 56.0f)).mo9852c(inflate));
        mo8690b(R.id.a6c).setOnClickListener(new C3317g(this));
        mo8690b(R.id.a5e).setOnClickListener(C3318h.f9547a);
        RecyclerView recyclerView = (RecyclerView) mo8690b(R.id.e_e);
        C52711k.m112236a((Object) recyclerView, "gesture_magic_tab");
        recyclerView.setLayoutManager(new LiveGestureMagicDialogFragment$onViewCreated$5(this, getContext(), 0, false));
        RecyclerView recyclerView2 = (RecyclerView) mo8690b(R.id.e_e);
        C52711k.m112236a((Object) recyclerView2, "gesture_magic_tab");
        recyclerView2.setAdapter(mo8687a());
        RecyclerView recyclerView3 = (RecyclerView) mo8690b(R.id.e_d);
        C52711k.m112236a((Object) recyclerView3, "gesture_magic_list");
        recyclerView3.setLayoutManager(new LiveGestureMagicDialogFragment$onViewCreated$6(this, getContext(), 0, false));
        RecyclerView recyclerView4 = (RecyclerView) mo8690b(R.id.e_d);
        C52711k.m112236a((Object) recyclerView4, "gesture_magic_list");
        recyclerView4.setAdapter(mo8691b());
        C3331c a = mo8687a();
        C3334c iVar = new C3319i(this);
        C52711k.m112240b(iVar, "listener");
        a.f9576c = iVar;
        C3323b b = mo8691b();
        C3326c jVar = new C3320j(this);
        C52711k.m112240b(jVar, "listener");
        b.f9554b = jVar;
        ((SwitchCompat) mo8690b(R.id.akf)).setThumbResource(R.drawable.e3m);
        ((SwitchCompat) mo8690b(R.id.akf)).setTrackResource(R.drawable.e3p);
        ((SwitchCompat) mo8690b(R.id.akf)).setOnCheckedChangeListener(new C3321k(this));
        SwitchCompat switchCompat = (SwitchCompat) mo8690b(R.id.akf);
        C52711k.m112236a((Object) switchCompat, "gesture_magic_switch");
        C4526c<Boolean> cVar = C4525b.f12372ao;
        C52711k.m112236a((Object) cVar, "LivePluginProperties.GESTURE_MAGIC_SWITCH");
        Object a2 = cVar.mo10345a();
        C52711k.m112236a(a2, "LivePluginProperties.GESTURE_MAGIC_SWITCH.value");
        switchCompat.setChecked(((Boolean) a2).booleanValue());
        C4526c<Boolean> cVar2 = C4525b.f12372ao;
        C52711k.m112236a((Object) cVar2, "LivePluginProperties.GESTURE_MAGIC_SWITCH");
        Object a3 = cVar2.mo10345a();
        C52711k.m112236a(a3, "LivePluginProperties.GESTURE_MAGIC_SWITCH.value");
        if (((Boolean) a3).booleanValue()) {
            this.f9535g = false;
        }
        TextView textView = (TextView) mo8690b(R.id.d_u);
        C52711k.m112236a((Object) textView, "tv_gesture_magic_tip");
        C4526c<Boolean> cVar3 = C4525b.f12372ao;
        C52711k.m112236a((Object) cVar3, "LivePluginProperties.GESTURE_MAGIC_SWITCH");
        Object a4 = cVar3.mo10345a();
        C52711k.m112236a(a4, "LivePluginProperties.GESTURE_MAGIC_SWITCH.value");
        if (((Boolean) a4).booleanValue()) {
            i = R.string.hql;
        } else {
            i = R.string.hqk;
        }
        textView.setText(C3922z.m9903a(i));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bw5, viewGroup, false);
    }
}
