package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.viewmodule.p326a.p327a.C6435e;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.facebook.imagepipeline.p975o.C14232c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveToolbarWidget extends LiveRecyclableWidget implements C0199s<KVData> {

    /* renamed from: a */
    static final int f17940a = 2132216392;

    /* renamed from: b */
    public Map<C6605h, View> f17941b;

    /* renamed from: c */
    private List<C6605h> f17942c = new ArrayList();

    /* renamed from: d */
    private C6609j f17943d;

    /* renamed from: e */
    private Map<C6605h, View> f17944e = new HashMap();

    /* renamed from: f */
    private List<View> f17945f = new ArrayList();

    /* renamed from: g */
    private ViewGroup f17946g;

    /* renamed from: h */
    private boolean f17947h;

    public int getLayoutId() {
        return R.layout.aqj;
    }

    public void onClear() {
        super.onClear();
        C6610k.m13989e();
    }

    public void onUnload() {
        C6610k.m13987c().mo12667a(C6605h.GOODS, (C6597a) new C6435e(8));
        this.dataCenter.removeObserver(this);
        for (C6605h hVar : this.f17942c) {
            View view = (View) this.f17941b.get(hVar);
            if (view != null) {
                this.f17946g.removeView(view);
                this.f17943d.mo12686b(hVar, view);
            }
        }
        this.f17942c.clear();
        C6610k.m13988d();
    }

    /* renamed from: a */
    private void m13951a() {
        LayoutInflater from = LayoutInflater.from(this.context);
        for (C6605h hVar : this.f17942c) {
            View view = (View) this.f17944e.get(hVar);
            if (view == null) {
                view = from.inflate(hVar.getLayoutId(), this.f17946g, false);
                if (hVar.getLayoutId() == f17940a) {
                    this.f17944e.put(hVar, view);
                }
            }
            if (hVar.getLayoutId() == f17940a) {
                view.setBackgroundResource(hVar.getDrawableUnfolded());
            }
            if (hVar == C6605h.TURNTABLE) {
                HSImageView hSImageView = (HSImageView) view.findViewById(R.id.d62);
                String str = (String) LiveSettingKeys.TURNTABLE_ICON_URL.mo9431a();
                if (str != null && !str.isEmpty()) {
                    C5213c.m11822a(hSImageView, str);
                } else if (hSImageView != null) {
                    hSImageView.setImageURI(C14232c.m29168a((int) R.drawable.bvl).mo26449a().mSourceUri);
                }
            }
            view.setTag(hVar);
            view.setVisibility(8);
            this.f17941b.put(hVar, view);
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            this.f17946g.addView(view);
            this.f17943d.mo12683a(hVar, view);
        }
    }

    public void onInit(Object... objArr) {
        this.f17946g = (ViewGroup) this.contentView.findViewById(R.id.ac);
    }

    public void onLoad(Object... objArr) {
        boolean z;
        this.f17943d = (C6609j) C6610k.m13985a();
        this.f17941b = this.f17943d.f17961b;
        this.f17943d.f17960a = this.dataCenter;
        ((C6609j) C6610k.m13986b()).f17960a = this.dataCenter;
        this.dataCenter.observe("data_screen_record_is_open", this).observe("data_keyboard_status", this).observe("cmd_hide_other_toolbar", this).observeForever("cmd_hide_in_douyin_commerce", this);
        if (TextUtils.isEmpty((CharSequence) LiveConfigSettingKeys.LIVE_TURNTABLE_URL.mo9431a())) {
            ((IGiftService) C4116c.m10249a(IGiftService.class)).onTurnTableUrlEmpty("LiveConfigSettingKeys取出为空");
        }
        C4514j.m10883j().mo10325f().mo12672a(this.dataCenter, this.f17942c);
        List<C6605h> list = this.f17942c;
        if (C9414h.m18630a(list) || !list.contains(C6605h.TURNTABLE)) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sb = new StringBuilder("toolbarButton list contain TurnTable : ");
        sb.append(z);
        C3831a.m9712b("LiveToolbarWidget", sb.toString());
        m13951a();
        C4514j.m10883j().mo10325f().mo12671a(this.dataCenter, this.context);
        this.dataCenter.get("data_room");
        ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1755796428) {
                if (hashCode != -1548871708) {
                    if (hashCode != 1060055221) {
                        if (hashCode == 1939188655 && key.equals("data_screen_record_is_open")) {
                            c = 0;
                        }
                    } else if (key.equals("data_keyboard_status")) {
                        c = 1;
                    }
                } else if (key.equals("cmd_hide_in_douyin_commerce")) {
                    c = 2;
                }
            } else if (key.equals("cmd_hide_other_toolbar")) {
                c = 3;
            }
            int i = 4;
            switch (c) {
                case 0:
                    if (!((Boolean) kVData.getData()).booleanValue() && !this.f17947h) {
                        i = 0;
                    }
                    this.contentView.setVisibility(i);
                    return;
                case 1:
                    if (((Boolean) kVData.getData()).booleanValue()) {
                        this.contentView.setVisibility(4);
                        return;
                    }
                    this.contentView.setVisibility(0);
                    this.f17947h = false;
                    return;
                case 2:
                    if (((Boolean) kVData.getData()).booleanValue()) {
                        this.contentView.setVisibility(4);
                        return;
                    } else {
                        this.contentView.setVisibility(0);
                        return;
                    }
                case 3:
                    if (!((Boolean) kVData.getData(Boolean.valueOf(false))).booleanValue()) {
                        for (View visibility : this.f17945f) {
                            visibility.setVisibility(0);
                        }
                        this.f17945f.clear();
                        break;
                    } else {
                        this.f17945f.clear();
                        for (C6605h hVar : this.f17942c) {
                            View view = (View) this.f17941b.get(hVar);
                            if (!(view == null || hVar == C6605h.INCOME_MORE || view.getVisibility() != 0)) {
                                view.setVisibility(8);
                                this.f17945f.add(view);
                            }
                        }
                        return;
                    }
            }
        }
    }
}
