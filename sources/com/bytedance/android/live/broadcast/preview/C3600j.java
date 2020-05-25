package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.broadcast.api.dummy.BroadcastServiceDummy;
import com.bytedance.android.live.broadcast.effect.C3256i;
import com.bytedance.android.live.broadcast.effect.C3266p;
import com.bytedance.android.live.broadcast.effect.p204a.C3198a.C3199a;
import com.bytedance.android.live.broadcast.share.C3621a;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b.C8635a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.android.live.broadcast.preview.j */
final /* synthetic */ class C3600j implements OnClickListener {

    /* renamed from: a */
    private final C3589i f10279a;

    C3600j(C3589i iVar) {
        this.f10279a = iVar;
    }

    public final void onClick(View view) {
        boolean z;
        C3589i iVar = this.f10279a;
        int id = view.getId();
        if (id == R.id.ajy) {
            int i = 1 - iVar.f10256n;
            C8049c.m15979a().mo14203a("camera_switch", new C8059j().mo14213a("live_take_page").mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click"));
            iVar.f10256n = i;
            C4525b.f12433g.mo10348b(Integer.valueOf(iVar.f10256n));
            if (iVar.f10254l != null) {
                iVar.f10254l.mo8944a(i);
            }
            return;
        }
        C3256i iVar2 = null;
        if (id == R.id.ue) {
            iVar.f10263u = null;
            if (iVar.f10254l != null) {
                iVar.f10254l.mo8942a();
            }
        } else if (id == R.id.ajk) {
            iVar.mo8963c();
        } else if (id == R.id.clm) {
            C8049c.m15979a().mo14202a("live_take_beauty_click", iVar.mo8960a(new HashMap<>()), new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_page"));
            iVar.mo8964d();
        } else if (id == R.id.bde) {
            if (iVar.f10255m == C8710m.SCREEN_RECORD) {
                C8049c.m15979a().mo14203a("game_take_guide", new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14218f("click").mo14213a("live_take_page"));
                ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(iVar.getContext(), C4704c.m11227b("https:///webcast.tiktokv.com/falcon/live_inroom/page/game_course/index.html").mo10505a(C3922z.m9903a((int) R.string.ew2)));
            } else {
                ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10490a(iVar.getContext(), C4704c.m11227b(C3589i.f10186a).mo10505a(C3922z.m9903a((int) R.string.enx)));
                HashMap hashMap = new HashMap();
                hashMap.put("request_page", "live_start");
                C8049c.m15979a().mo14202a("thirdparty_take_guide", hashMap, new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_page"));
            }
        } else if (id == R.id.clq) {
            if (!C3513ak.m9322a(iVar.f10244b)) {
                C4204a.m10421a((Context) iVar.f10244b, (int) R.string.eno);
            }
            C8049c.m15979a().mo14202a("live_take_filter_click", iVar.mo8960a(new HashMap<>()), new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_page"));
            if (iVar.isAdded() && iVar.getChildFragmentManager().mo2224a("filter_dialog_tag") == null) {
                if (iVar.f10254l != null && !TextUtils.isEmpty(null)) {
                    iVar2 = C3256i.m8925a(iVar.f10268z, null, true, true);
                }
                if (iVar2 == null && iVar.f10264v != null) {
                    iVar2 = C3256i.m8926a(iVar.f10268z, iVar.f10264v, true);
                }
                if (iVar2 == null) {
                    C3199a aVar = iVar.f10268z;
                    iVar2 = new C3256i();
                    iVar2.f9407b = aVar;
                    Bundle bundle = new Bundle();
                    iVar2.f9409d = C3266p.m8943a().f9434b;
                    bundle.putBoolean("bundle_full_screen", true);
                    iVar2.setArguments(bundle);
                    iVar2.f9406a = true;
                }
                iVar2.f9408c = new C3609s(iVar);
                iVar2.show(iVar.getChildFragmentManager(), "filter_dialog_tag");
                iVar.mo8961a(8);
            }
        } else if (id != R.id.cln) {
            if (id == R.id.bcj) {
                if (iVar.f10253k != null) {
                    iVar.f10253k.mo9151b();
                }
            } else if (id == R.id.ev_) {
                BroadcastServiceDummy.hasShown = true;
                if (C3621a.f10325a != null) {
                    long b = ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b();
                    HashMap hashMap2 = new HashMap();
                    C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
                    if (a != null) {
                        hashMap2.putAll(a.mo14192a());
                    }
                    if (iVar.getActivity() != null) {
                        StringBuilder sb = new StringBuilder(((IHostApp) C4116c.m10249a(IHostApp.class)).isInMusicallyRegion() ? "https://m.tiktok.com/share/live/-1?" : "https://t.tiktok.com/share/live/-1?");
                        Locale locale = iVar.getActivity().getResources().getConfiguration().locale;
                        if (locale != null) {
                            sb.append("language=");
                            sb.append(locale.toString());
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            sb.append("&");
                        }
                        sb.append("anchor_id=");
                        sb.append(b);
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("request_page", "live_take");
                        hashMap3.putAll(hashMap2);
                        hashMap3.put("anchor_id", String.valueOf(b));
                        C8049c.m15979a().mo14202a("anchor_share_click", hashMap3, new C8059j(), Room.class);
                        C8635a a2 = C8633b.m17039a();
                        a2.f23653b = -1;
                        C3621a.f10325a.mo15815a(iVar.getActivity(), a2.mo15111a(b).mo15115a(true).mo15119d(sb.toString()).mo15114a((Map<String, String>) hashMap2).mo15116a(), new C8632a() {
                            /* renamed from: a */
                            public final void mo8971a(Throwable th) {
                            }

                            /* renamed from: a */
                            public final void mo8970a(String str, String str2) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("share_platform", str);
                                hashMap.put("is_pyramid_sale", "0");
                                hashMap.put("type", str2);
                                hashMap.put("share_type", str2);
                                hashMap.put("user_type", "anchor");
                                hashMap.put("request_page", "live_take");
                                C8049c.m15979a().mo14202a("share", hashMap, new C8059j(), Room.class);
                            }
                        });
                    }
                }
            }
        }
    }
}
