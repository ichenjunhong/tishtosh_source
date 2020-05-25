package com.bytedance.android.livesdk.rank;

import android.arch.lifecycle.C0176h.C0177a;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3899m;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C3991a;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4004ae;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.livesdk.chatroom.event.C5197p;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8065e.C8066a;
import com.bytedance.android.livesdk.p399o.C8067f;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.p455i.C8816f;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;

public class BackToPreRoomWidget extends LiveRecyclableWidget {

    /* renamed from: a */
    private C8209j f22179a;

    public int getLayoutId() {
        return R.layout.agk;
    }

    public void onInit(Object[] objArr) {
    }

    public void onUnload() {
        long j;
        if (this.f22179a != null) {
            C8209j jVar = this.f22179a;
            DataCenter dataCenter = this.dataCenter;
            String str = "data_back_to_pre_room_fraction";
            if (jVar.f22401i == null) {
                j = ((long) ((C8816f) LiveConfigSettingKeys.BACK_TO_PRE_ROOM_SETTING.mo9431a()).f24068a) * 1000;
            } else {
                j = jVar.f22401i.getCurrentPlayTime();
            }
            dataCenter.lambda$put$1$DataCenter(str, Long.valueOf(j));
        }
    }

    public void onLoad(Object[] objArr) {
        if (this.contentView != null) {
            this.f22179a = new C8209j(this.context, getLifecycle(), (ViewGroup) this.contentView);
            C8209j jVar = this.f22179a;
            DataCenter dataCenter = this.dataCenter;
            if (dataCenter != null) {
                Bundle bundle = (Bundle) dataCenter.get("data_room_back");
                jVar.f22402j = bundle;
                if (bundle != null) {
                    Parcelable parcelable = jVar.f22402j.getParcelable("pre_room_user_avatar");
                    if (parcelable instanceof ImageModel) {
                        C3899m.m9863a(jVar.f22395c, (ImageModel) parcelable, null, jVar.f22393a, jVar.f22393a, null, null, false);
                    }
                    C9432q.m18691b((View) jVar.f22394b, 0);
                    String str = (String) C8049c.m15979a().mo14201a(C8059j.class).mo14192a().get("source");
                    jVar.f22394b.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            if (C8209j.this.f22402j != null) {
                                long j = C8209j.this.f22402j.getLong("live.intent.extra.ROOM_ID", 0);
                                C4495a a = C4495a.m10823a();
                                Bundle bundle = C8209j.this.f22402j;
                                a.mo10301a((Object) new C5197p(j, new Bundle(), true));
                            }
                        }
                    });
                    long longValue = ((Long) dataCenter.get("data_room_id", Long.valueOf(0))).longValue();
                    if (jVar.f22398f != longValue && !C8123a.m16195a()) {
                        C4575an.m10983a(jVar.f22394b.getContext(), (int) R.string.e4h);
                    }
                    jVar.f22398f = longValue;
                    ((C4002ac) C2201v.m6614b(jVar).mo6539d(300000, TimeUnit.MILLISECONDS).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6525a((C2203w<T, ? extends R>) C4021e.m10141a((C4004ae) C3991a.m10105a(jVar.f22400h, C0177a.ON_DESTROY)))).mo9406a(new C8211k(jVar), C4064k.m10187b());
                    C8049c.m15979a().mo14202a("livesdk_return_show", C8066a.m16007a().mo14221a("banner_type", C8067f.m16013a("enter_method", C8049c.m15979a().mo14201a(C8059j.class))).f22045a, new Object[0]);
                    return;
                }
            }
            jVar.f22394b.setVisibility(8);
        } else {
            C9432q.m18691b((View) this.containerView, 8);
        }
    }
}
