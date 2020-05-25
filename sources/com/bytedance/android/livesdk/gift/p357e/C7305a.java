package com.bytedance.android.livesdk.gift.p357e;

import android.content.Context;
import android.support.p043v7.p051e.C1208c;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.model.C5730as;
import com.bytedance.android.livesdk.gift.C7654y;
import com.bytedance.android.livesdk.gift.model.p379a.C7490a;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.model.p379a.C7492c;
import com.bytedance.android.livesdk.gift.model.p379a.C7494e;
import com.bytedance.android.livesdk.gift.model.p379a.C7497h;
import com.bytedance.android.livesdk.gift.model.p379a.C7498i;
import com.bytedance.android.livesdk.gift.model.p379a.C7499j;
import com.bytedance.android.livesdk.gift.model.p379a.C7500k;
import com.bytedance.android.livesdk.gift.p354b.C7217b;
import com.bytedance.android.livesdk.gift.p356d.C7229a;
import com.bytedance.android.livesdk.gift.p356d.C7232c;
import com.bytedance.android.livesdk.gift.p356d.C7232c.C7235a;
import com.bytedance.android.livesdk.gift.p356d.C7237e;
import com.bytedance.android.livesdk.gift.p356d.C7238f;
import com.bytedance.android.livesdk.gift.p356d.C7239g;
import com.bytedance.android.livesdk.gift.p356d.C7241h;
import com.bytedance.android.livesdk.gift.p356d.C7242i;
import com.bytedance.android.livesdk.gift.p356d.C7243j;
import com.bytedance.android.livesdk.gift.panel.C7533ag;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p279af.C4601k;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.user.C8336h;
import com.bytedance.android.livesdk.user.C8337i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1674ab;

/* renamed from: com.bytedance.android.livesdk.gift.e.a */
public abstract class C7305a extends C1322a<C7232c> implements C7235a {

    /* renamed from: a */
    public final Context f19894a;

    /* renamed from: b */
    public final List<C7491b> f19895b = new ArrayList();

    /* renamed from: c */
    public final C7309c f19896c = new C7309c();

    /* renamed from: d */
    public boolean f19897d;

    /* renamed from: e */
    public GiftDialogViewModel f19898e;

    /* renamed from: f */
    private final LayoutInflater f19899f;

    /* renamed from: g */
    private Room f19900g;

    /* renamed from: h */
    private C7491b f19901h;

    /* renamed from: i */
    private C7307a f19902i;

    /* renamed from: j */
    private final int f19903j = 1000;

    /* renamed from: k */
    private boolean f19904k;

    /* renamed from: l */
    private boolean f19905l;

    /* renamed from: com.bytedance.android.livesdk.gift.e.a$a */
    public interface C7307a {
        /* renamed from: a */
        void mo13555a(C7491b bVar, boolean z);
    }

    /* renamed from: com.bytedance.android.livesdk.gift.e.a$b */
    public interface C7308b {
        /* renamed from: a */
        void mo13556a(C7491b bVar, boolean z);
    }

    /* renamed from: com.bytedance.android.livesdk.gift.e.a$c */
    public class C7309c implements C7308b {

        /* renamed from: a */
        public C7308b f19906a;

        private C7309c() {
        }

        /* renamed from: a */
        public final void mo13556a(C7491b bVar, boolean z) {
            if (this.f19906a != null) {
                this.f19906a.mo13556a(bVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo13553a(List<C7491b> list) {
        C1208c.m3654a(new C7533ag(this.f19895b, list, this.f19904k)).mo3931a((C1322a) this);
        this.f19895b.clear();
        this.f19895b.addAll(list);
    }

    /* renamed from: b */
    public final void mo13554b() {
        this.f19895b.clear();
    }

    public int getItemCount() {
        return this.f19895b.size();
    }

    /* renamed from: a */
    public final void mo13552a() {
        C7309c cVar = this.f19896c;
        for (C7491b bVar : this.f19895b) {
            if (bVar != null) {
                cVar.mo13556a(bVar, false);
            }
        }
        this.f19901h = null;
    }

    /* renamed from: a */
    private void m15116a(C7490a aVar) {
        if (this.f19904k) {
            m15117b(aVar);
        } else {
            m15117b(aVar);
        }
    }

    /* renamed from: b */
    private void m15117b(C7490a aVar) {
        if (this.f19902i != null) {
            this.f19902i.mo13555a(aVar, true);
        }
    }

    public long getItemId(int i) {
        return ((C7491b) this.f19895b.get(i)).mo13919p();
    }

    public int getItemViewType(int i) {
        return ((C7491b) this.f19895b.get(i)).f20513a;
    }

    /* renamed from: a */
    public final int mo13549a(C7491b bVar) {
        for (int i = 0; i < this.f19895b.size(); i++) {
            if (((C7491b) this.f19895b.get(i)).equals(bVar)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final C7491b mo13551a(long j) {
        for (C7491b bVar : this.f19895b) {
            if (bVar != null && bVar.mo13919p() == j) {
                return bVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C7232c cVar, int i) {
        C7491b bVar = (C7491b) this.f19895b.get(i);
        if (bVar != null) {
            if (bVar.f20513a == 0) {
                cVar.itemView.setVisibility(4);
                return;
            }
            cVar.mo13464a(bVar);
            cVar.f19637l = this;
        }
    }

    /* renamed from: a */
    private void m15115a(C7232c cVar, C7494e eVar) {
        mo13552a();
        boolean z = false;
        C4495a.m10823a().mo10301a((Object) new C7217b(false));
        if (cVar != null && cVar.itemView != null) {
            int id = cVar.itemView.getId();
            if (C4601k.f12565a != id) {
                C4601k.f12565a = id;
                C4601k.f12566b = 0;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - C4601k.f12566b < 1000) {
                z = true;
            }
            if (!z) {
                C4601k.f12566b = currentTimeMillis;
            }
            if (!z && this.f19902i != null) {
                this.f19902i.mo13555a(eVar, true);
            }
        }
    }

    /* renamed from: a */
    public C7232c onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
            case 8:
                return new C7238f(this.f19899f.inflate(R.layout.amk, null));
            case 2:
                return new C7239g(this.f19899f.inflate(R.layout.amm, null));
            case 4:
                return new C7242i(this.f19899f.inflate(R.layout.amk, null));
            case 5:
                return new C7241h(this.f19899f.inflate(R.layout.amk, null));
            case 6:
                return new C7237e(this.f19899f.inflate(R.layout.aml, null));
            case 7:
                return new C7243j(this.f19899f.inflate(R.layout.amk, null), this.f19897d);
            default:
                return new C7229a(this.f19899f.inflate(R.layout.ami, null));
        }
    }

    /* renamed from: a */
    public final void mo13467a(C7232c cVar, C7491b bVar) {
        if (cVar instanceof C7229a) {
            C7492c cVar2 = (C7492c) bVar;
            if (this.f19902i != null) {
                this.f19902i.mo13555a(cVar2, true);
            }
        } else if (cVar instanceof C7241h) {
            C7498i iVar = (C7498i) bVar;
            if ((!iVar.f20515c || iVar.mo13906c()) && this.f19902i != null) {
                this.f19902i.mo13555a(iVar, true);
            }
        } else {
            if (cVar instanceof C7242i) {
                C7499j jVar = (C7499j) bVar;
                if (!jVar.f20515c || jVar.mo13906c()) {
                    if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
                        ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14516a(this.f19894a, C8337i.m16520a().mo14540a(C3922z.m9903a((int) R.string.ev8)).mo14544d("live_detail").mo14545e("gift_send").mo14543c("gift").mo14539a((int) BaseNotice.COMMENT_REPLY_WITH_VIDEO).mo14541a()).mo6314a((C1674ab<? super T>) new C8335g<Object>());
                    } else if (!((C4282a) C4116c.m10249a(C4282a.class)).user().mo14528a(C8336h.TASK_GIFT)) {
                        if (C7654y.m15668a().mo14018b() <= 0) {
                            C4495a.m10823a().mo10301a((Object) new C5730as());
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("log_pb", this.f19900g.getLog_pb());
                                jSONObject.put("request_id", this.f19900g.getRequestId());
                                jSONObject.put("source", this.f19900g.getUserFrom());
                                C8068g.m16014a(this.f19894a);
                                ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b();
                                this.f19900g.getId();
                            } catch (JSONException unused) {
                            }
                        } else {
                            m15116a((C7490a) jVar);
                        }
                    }
                }
            } else if (cVar instanceof C7237e) {
                m15115a(cVar, (C7494e) bVar);
            } else if (cVar instanceof C7243j) {
                m15116a((C7490a) (C7500k) bVar);
            } else if (cVar instanceof C7239g) {
                m15116a((C7490a) (C7497h) bVar);
            } else {
                m15116a((C7490a) bVar);
            }
        }
    }

    public /* synthetic */ void onBindViewHolder(C1352v vVar, int i, List list) {
        C7232c cVar = (C7232c) vVar;
        if (list.isEmpty()) {
            onBindViewHolder(cVar, i);
            return;
        }
        C7491b bVar = (C7491b) this.f19895b.get(i);
        if (bVar != null) {
            if (bVar.f20513a == 0) {
                cVar.itemView.setVisibility(4);
            } else {
                cVar.mo13466a(bVar, list);
                cVar.f19637l = this;
            }
        }
    }

    public C7305a(Context context, Room room, C7307a aVar, boolean z) {
        this.f19894a = context;
        this.f19900g = room;
        this.f19899f = LayoutInflater.from(this.f19894a);
        this.f19902i = aVar;
        this.f19904k = false;
        this.f19905l = z;
    }
}
