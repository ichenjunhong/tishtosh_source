package com.bytedance.android.livesdk.chatroom.p325ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.C1674ab;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ca */
final /* synthetic */ class C6021ca implements OnClickListener {

    /* renamed from: a */
    private final C6013bz f15985a;

    C6021ca(C6013bz bzVar) {
        this.f15985a = bzVar;
    }

    public final void onClick(View view) {
        C6013bz bzVar = this.f15985a;
        int id = view.getId();
        boolean z = false;
        if (id == R.id.je) {
            if (!bzVar.f15957i) {
                if (bzVar.f15956h) {
                    bzVar.f15956h = false;
                    bzVar.f15949a.mo14684b(true);
                } else {
                    bzVar.f15956h = true;
                    bzVar.f15949a.mo14683a(true);
                }
                bzVar.mo12016b();
            }
            return;
        }
        if (id == R.id.clb) {
            if (TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                if (!TTLiveSDKContext.getHostService().mo10315h().mo14528a(C8336h.COMMENT)) {
                    if (bzVar.f15956h && TTLiveSDKContext.getHostService().mo10308a().isNeedProtectUnderage()) {
                        C4575an.m10981a((int) R.string.epj);
                    } else if (!(bzVar.f15959k == null || bzVar.f15953e.getText() == null)) {
                        String obj = bzVar.f15953e.getText().toString();
                        boolean z2 = false;
                        for (int i = 0; i < obj.length(); i++) {
                            z2 = !Character.isWhitespace(obj.charAt(i));
                            if (z2) {
                                break;
                            }
                        }
                        if (z2 && obj.length() > 0) {
                            z = true;
                        }
                        if (z) {
                            bzVar.f15959k.mo12023a(obj, bzVar.f15956h);
                        }
                    }
                }
            } else if (bzVar.getActivity() == null) {
                C4575an.m10981a((int) R.string.e6p);
            } else {
                TTLiveSDKContext.getHostService().mo10315h().mo14516a(bzVar.getActivity(), C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ev7)).mo14543c("comment_live").mo14539a(1000).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
            }
        } else if (id == R.id.am7) {
            HashMap hashMap = new HashMap();
            hashMap.put("discount_type", "1");
            C8049c.m15979a().mo14202a("discount_recharge_click", hashMap, Room.class, new C8059j().mo14213a("live_detail").mo14215c("comment").mo14214b("live_function"), new C8060k());
            if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                TTLiveSDKContext.getHostService().mo10315h().mo14516a(bzVar.getContext(), C8337i.m16520a().mo14543c("comment_recharge_guide").mo14539a(1000).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
            } else if (!TTLiveSDKContext.getHostService().mo10315h().mo14528a(C8336h.COMMENT)) {
                bzVar.mo12012a();
                bzVar.f15960l.mo12021a();
            }
        }
    }
}
