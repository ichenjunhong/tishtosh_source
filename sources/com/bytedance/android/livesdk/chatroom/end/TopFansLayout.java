package com.bytedance.android.livesdk.chatroom.end;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.setting.C4085g;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.end.C5142j.C5144a;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p279af.p281b.C4586c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.C8727z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.C1674ab;
import p064c.p065a.C1683ag;
import p064c.p065a.C2201v;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

public class TopFansLayout extends LinearLayout implements C0183j, C5144a {

    /* renamed from: a */
    public List<C5124b> f13671a = new ArrayList();

    /* renamed from: b */
    public final C1689b f13672b = new C1689b();

    /* renamed from: c */
    C5123a f13673c;

    /* renamed from: d */
    Activity f13674d;

    /* renamed from: e */
    public Room f13675e;

    /* renamed from: f */
    OnClickListener f13676f;

    /* renamed from: g */
    public C5142j f13677g;

    /* renamed from: h */
    public String f13678h;

    /* renamed from: i */
    public View f13679i = null;

    /* renamed from: j */
    public boolean f13680j = true;

    /* renamed from: k */
    OnClickListener f13681k = new OnClickListener() {
        public final void onClick(View view) {
            if (view.getId() == R.id.b0t) {
                C8727z zVar = (C8727z) view.getTag(R.id.d5g);
                User user = zVar.f23996b;
                if (user != null) {
                    TopFansLayout.this.f13679i = view;
                    if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                        TTLiveSDKContext.getHostService().mo10315h().mo14516a(TopFansLayout.this.getContext(), C8337i.m16520a().mo14540a(C4085g.m10200a()).mo14542b(C4085g.m10201b()).mo14544d("live_detail").mo14545e("follow").mo14543c(CustomActionPushReceiver.f104061f).mo14539a(1).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<C3009i>() {
                            public final void onSubscribe(C1690c cVar) {
                                super.onSubscribe(cVar);
                                TopFansLayout.this.f13672b.mo6181a(cVar);
                            }
                        });
                        return;
                    }
                    TopFansLayout.this.f13677g.mo11031a(user.getId(), TopFansLayout.this.f13675e, TopFansLayout.this.f13678h, TopFansLayout.this);
                    TopFansLayout.m11766a("pm_live_take_anchor_follow_audience", zVar);
                }
            }
        }
    };

    /* renamed from: l */
    private List<C8727z> f13682l;

    /* renamed from: m */
    private Fragment f13683m;

    /* renamed from: n */
    private DataCenter f13684n;

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.TopFansLayout$a */
    public interface C5123a {
        /* renamed from: a */
        void mo11015a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.end.TopFansLayout$b */
    static class C5124b {

        /* renamed from: a */
        public View f13690a;

        /* renamed from: b */
        public View f13691b;

        /* renamed from: c */
        public VHeadView f13692c;

        /* renamed from: d */
        public TextView f13693d;

        /* renamed from: e */
        public TextView f13694e;

        private C5124b(View view) {
            this.f13691b = view;
            this.f13690a = view.findViewById(R.id.b0t);
            this.f13692c = (VHeadView) view.findViewById(R.id.ao0);
            this.f13693d = (TextView) view.findViewById(R.id.d3r);
            this.f13694e = (TextView) view.findViewById(R.id.d3q);
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f13672b.mo6180a();
        this.f13677g.f13793a.mo6180a();
    }

    /* renamed from: a */
    public final void mo11005a() {
        for (C5124b bVar : this.f13671a) {
            final User user = ((C8727z) bVar.f13692c.getTag(R.id.d5g)).f23996b;
            TTLiveSDKContext.getHostService().mo10315h().mo14530b(user.getId()).mo6159b((C1683ag<? super T>) new C1683ag<C3009i>() {
                public final void onError(Throwable th) {
                }

                public final void onSubscribe(C1690c cVar) {
                    TopFansLayout.this.f13672b.mo6181a(cVar);
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    C3009i iVar = (C3009i) obj;
                    if (!TopFansLayout.this.f13671a.isEmpty()) {
                        for (C5124b bVar : TopFansLayout.this.f13671a) {
                            C8727z zVar = (C8727z) bVar.f13692c.getTag(R.id.d5g);
                            User user = zVar.f23996b;
                            if (user != null && user.getId() == user.getId()) {
                                zVar.f23996b = User.from(user);
                                bVar.f13692c.setTag(R.id.d5g, zVar);
                                bVar.f13690a.setTag(R.id.d5g, zVar);
                                if (user.getId() == TTLiveSDKContext.getHostService().mo10315h().mo14529b() || user.isFollowing() || !TopFansLayout.this.f13680j) {
                                    bVar.f13690a.setVisibility(8);
                                    return;
                                } else {
                                    bVar.f13690a.setVisibility(0);
                                    return;
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public void setDataCenter(DataCenter dataCenter) {
        this.f13684n = dataCenter;
    }

    public void setFollowVisible(boolean z) {
        this.f13680j = z;
    }

    public void setTopFansCallBack(C5123a aVar) {
        this.f13673c = aVar;
    }

    public TopFansLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo11007a(C8686a aVar) {
        if (this.f13674d != null) {
            if (this.f13679i != null && this.f13679i.getVisibility() == 0) {
                this.f13679i.setVisibility(8);
            }
            C4204a.m10421a((Context) this.f13674d, (int) R.string.ehg);
        }
    }

    /* renamed from: a */
    public final void mo11008a(Throwable th) {
        if (this.f13674d != null && th != null) {
            if (th instanceof C2949a) {
                C4204a.m10423a((Context) this.f13674d, ((C2949a) th).getPrompt());
            } else {
                C4204a.m10421a((Context) this.f13674d, (int) R.string.ehf);
            }
        }
    }

    public TopFansLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static void m11766a(String str, C8727z zVar) {
        String str2;
        if (!TextUtils.isEmpty(str) && zVar != null) {
            if (zVar.f23997c == 1) {
                str2 = "no.1";
            } else if (zVar.f23997c == 2) {
                str2 = "no.2";
            } else {
                str2 = "no.3";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_take");
            hashMap.put("event_type", "click");
            hashMap.put("event_page", "anchor_live_ending");
            hashMap.put("people", str2);
            C8049c.m15979a().mo14202a(str, hashMap, new C8060k());
        }
    }

    public TopFansLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TopFansLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo11006a(Activity activity, C3846a aVar, Room room, String str) {
        if (activity != null && room != null) {
            this.f13675e = room;
            this.f13682l = room.getTopFanTickets();
            this.f13674d = activity;
            this.f13683m = aVar;
            this.f13678h = str;
            ((C4585b) C2201v.m6613b((Iterable<? extends T>) this.f13682l).mo6525a((C2203w<T, ? extends R>) C4586c.m11025a())).mo10391a(C5150p.f13808a).mo6552k().mo6148a(C1667a.m5940a()).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C5151q<Object>(this, aVar), C5152r.f13811a);
            this.f13676f = new OnClickListener() {
                public final void onClick(View view) {
                    if (view.getId() == R.id.ao0) {
                        C8727z zVar = (C8727z) view.getTag(R.id.d5g);
                        if (zVar != null) {
                            TopFansLayout topFansLayout = TopFansLayout.this;
                            User user = zVar.f23996b;
                            if (user != null) {
                                HashMap hashMap = new HashMap(1);
                                hashMap.put("log_enter_live_source", topFansLayout.f13678h);
                                hashMap.put("sec_user_id", user.getSecUid());
                                TTLiveSDKContext.getHostService().mo10313f().mo14425a(user.getId(), (Map<String, String>) hashMap);
                            }
                        }
                        TopFansLayout.m11766a("pm_live_take_audience_pic_click", zVar);
                    }
                }
            };
            this.f13683m.getLifecycle().mo324a(this);
            this.f13677g = new C5142j();
        }
    }
}
