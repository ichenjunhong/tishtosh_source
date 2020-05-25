package com.bytedance.android.livesdk.rank.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.autodispose.C4005af;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.chatroom.p325ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p284b.C4645c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p420u.C8317c;
import com.bytedance.android.livesdk.rank.C8207h;
import com.bytedance.android.livesdk.rank.model.C8214a;
import com.bytedance.android.livesdk.rank.model.C8215b;
import com.bytedance.android.livesdk.rank.model.C8216c;
import com.bytedance.android.livesdk.rank.model.C8217d;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.rank.p409b.C8134b.C8135a;
import com.bytedance.android.livesdk.rank.p409b.C8134b.C8136b;
import com.bytedance.android.livesdk.rank.p412e.C8164r;
import com.bytedance.android.livesdk.rank.p413f.C8167a;
import com.bytedance.android.livesdk.rank.p413f.C8172b;
import com.bytedance.android.livesdk.rank.p413f.C8174c;
import com.bytedance.android.livesdk.rank.p413f.C8176d;
import com.bytedance.android.livesdk.rank.p413f.C8183j;
import com.bytedance.android.livesdk.rank.p413f.C8187m;
import com.bytedance.android.livesdk.rank.p413f.C8189n;
import com.bytedance.android.livesdk.rank.p413f.C8194q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import p064c.p065a.C1681ae;
import p064c.p065a.C2201v;

/* renamed from: com.bytedance.android.livesdk.rank.view.e */
public class C8232e extends RelativeLayout implements C8136b {

    /* renamed from: a */
    public String f22532a;

    /* renamed from: b */
    public C8214a f22533b;

    /* renamed from: c */
    public Room f22534c;

    /* renamed from: d */
    public C4645c f22535d;

    /* renamed from: e */
    public int f22536e;

    /* renamed from: f */
    public DataCenter f22537f;

    /* renamed from: g */
    public boolean f22538g;

    /* renamed from: h */
    private View f22539h;

    /* renamed from: i */
    private RecyclerView f22540i;

    /* renamed from: j */
    private TopRankListAnchorView f22541j;

    /* renamed from: k */
    private LoadingStatusView f22542k;

    /* renamed from: l */
    private C8135a f22543l;

    /* renamed from: m */
    private List<Object> f22544m = new ArrayList();

    /* renamed from: n */
    private boolean f22545n;

    /* renamed from: o */
    private int f22546o;

    /* renamed from: p */
    private C8207h f22547p;

    /* renamed from: q */
    private boolean f22548q;

    /* renamed from: r */
    private OnClickListener f22549r = new OnClickListener() {
        public final void onClick(View view) {
            String str;
            User user;
            if (C8232e.this.f22533b != null) {
                C8214a aVar = C8232e.this.f22533b;
                if (aVar.f22414b != null) {
                    str = String.valueOf(aVar.f22414b.f22444c);
                } else {
                    str = "";
                }
            } else {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                C8068g.m16014a(C8232e.this.getContext());
            } else {
                C8068g.m16014a(C8232e.this.getContext());
            }
            Bundle bundle = new Bundle();
            String str2 = "";
            if (C8232e.this.f22536e == 1) {
                if (C8232e.this.f22538g) {
                    str2 = "last_hourly";
                } else {
                    str2 = "hourly";
                }
            } else if (C8232e.this.f22536e == 2) {
                if (C8232e.this.f22538g) {
                    str2 = "last_regional";
                } else {
                    str2 = "regional";
                }
            }
            bundle.putString("type", str2);
            if (C8232e.this.f22537f != null) {
                C8232e.this.f22537f.lambda$put$1$DataCenter("data_gift_log_extra", bundle);
                DataCenter dataCenter = C8232e.this.f22537f;
                String str3 = "cmd_send_gift";
                if (C8232e.this.f22534c != null) {
                    user = C8232e.this.f22534c.getOwner();
                } else {
                    user = null;
                }
                dataCenter.lambda$put$1$DataCenter(str3, user);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.rank.view.e$a */
    public interface C8236a {
        /* renamed from: a */
        long[] mo14354a();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m16337a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f22543l != null) {
            this.f22543l.mo14331b();
        }
    }

    /* renamed from: a */
    private void m16337a() {
        if (this.f22533b == null || C9376b.m18558a((Collection<T>) this.f22533b.f22413a) || this.f22541j == null) {
            C9432q.m18691b((View) this.f22542k, 8);
            return;
        }
        C9432q.m18691b((View) this.f22542k, 8);
        ((C4005af) C2201v.m6613b((Iterable<? extends T>) this.f22533b.f22413a).mo6522a(C8237f.f22553a).mo6552k().mo6153a((C1681ae<T, ? extends R>) C4021e.m10139a((View) this))).mo9410a(new C8238g(this), C8239h.f22555a);
        this.f22544m.clear();
        if (this.f22548q) {
            if (this.f22538g && this.f22536e == 2) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
                String format = simpleDateFormat.format(new Date(this.f22533b.f22420h * 1000));
                String format2 = simpleDateFormat.format(new Date((this.f22533b.f22420h + 3600) * 1000));
                List<Object> list = this.f22544m;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f22533b.f22422j);
                sb.append(" ");
                sb.append(format);
                sb.append("-");
                sb.append(format2);
                list.add(sb.toString());
            } else if (!this.f22538g) {
                C8216c a = C8216c.m16292a(this.f22533b);
                if (a != null) {
                    a.f22438c = this.f22536e;
                    this.f22544m.add(a);
                    this.f22546o = 1;
                } else {
                    this.f22546o = 0;
                }
                this.f22544m.add(C8215b.m16291a(this.f22533b, this.f22536e));
            }
            this.f22544m.addAll(this.f22533b.f22413a);
        }
        if (!this.f22548q) {
            this.f22544m.addAll(this.f22533b.f22413a);
            this.f22544m.add(this.f22533b.f22417e);
            List<Object> list2 = this.f22544m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f22533b.f22418f);
            sb2.append("00:00:00");
            list2.add(sb2.toString());
            this.f22546o = this.f22544m.size() - 1;
        }
        if (this.f22535d == null) {
            this.f22535d = new C4645c();
            if (this.f22548q) {
                if (this.f22538g && this.f22536e == 2) {
                    this.f22535d.mo110580a(String.class, new C8174c());
                } else if (!this.f22538g) {
                    this.f22535d.mo110580a(C8216c.class, new C8176d(this.f22533b));
                    this.f22535d.mo110580a(C8215b.class, new C8172b());
                }
            }
            this.f22535d.mo110580a(C8217d.class, new C8194q());
            this.f22535d.mo110579a(C8219f.class).mo110586a(new C8167a(), new C8183j(this.f22536e, this.f22538g, false, this.f22533b)).mo110587a(C8240i.f22556a);
            if (!this.f22548q) {
                this.f22535d.mo110579a(String.class).mo110586a(new C8187m(), new C8189n()).mo110587a(new C8241j(this));
                this.f22535d.mo110580a(C8215b.class, new C8172b());
            }
            this.f22540i.setAdapter(this.f22535d);
        }
        try {
            this.f22535d.mo10432a(this.f22544m);
        } catch (Exception unused) {
            this.f22540i.getRecycledViewPool().mo5085a();
            this.f22535d.notifyDataSetChanged();
        }
        if (!this.f22538g) {
            this.f22543l.mo14329a();
        }
        this.f22541j.mo14382a(this.f22533b.f22414b, this.f22549r, this.f22545n);
    }

    public void setPresenter(C8135a aVar) {
        this.f22543l = aVar;
    }

    /* renamed from: a */
    public final void mo14332a(C8214a aVar) {
        if (aVar != null) {
            this.f22533b = aVar;
            this.f22543l.mo14330a(aVar);
            m16337a();
        }
    }

    /* renamed from: a */
    public final void mo14333a(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.f22533b == null) {
            str2 = "";
        } else {
            str2 = this.f22533b.f22418f;
        }
        sb.append(str2);
        sb.append(str);
        String sb2 = sb.toString();
        if (this.f22535d != null && this.f22544m.size() > this.f22546o) {
            if (this.f22544m.get(this.f22546o) instanceof C8215b) {
                ((C8215b) this.f22544m.get(this.f22546o)).f22433c = str;
            } else {
                this.f22544m.set(this.f22546o, sb2);
            }
            this.f22535d.notifyItemChanged(this.f22546o);
        }
        if (TextUtils.equals(str, "00:00:01")) {
            C8068g.m16014a(getContext());
            this.f22534c.getId();
        }
    }

    private C8232e(Context context, DataCenter dataCenter) {
        int i;
        super(context);
        this.f22537f = dataCenter;
        this.f22539h = inflate(getContext(), R.layout.ar8, this);
        this.f22540i = (RecyclerView) this.f22539h.findViewById(R.id.d3c);
        this.f22540i.setLayoutManager(new SSLinearLayoutManager(getContext()));
        this.f22540i.mo4798a((C1331h) new C1331h() {
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
                super.getItemOffsets(rect, view, recyclerView, sVar);
                int f = RecyclerView.m4275f(view);
                int itemCount = C8232e.this.f22535d.getItemCount();
                if (f == itemCount - 1) {
                    rect.bottom = (int) C9432q.m18687b(C8232e.this.getContext(), 16.0f);
                    return;
                }
                if (f == itemCount - 2) {
                    rect.top = (int) C9432q.m18687b(C8232e.this.getContext(), 16.0f);
                    rect.bottom = (int) C9432q.m18687b(C8232e.this.getContext(), 4.0f);
                }
            }
        });
        this.f22541j = (TopRankListAnchorView) this.f22539h.findViewById(R.id.d39);
        if (this.f22538g) {
            this.f22541j.setVisibility(8);
        } else {
            TopRankListAnchorView topRankListAnchorView = this.f22541j;
            if (this.f22537f == null || ((Boolean) this.f22537f.get("data_is_portrait", Boolean.valueOf(true))).booleanValue()) {
                i = R.drawable.bg8;
            } else {
                i = R.drawable.bj0;
            }
            topRankListAnchorView.setBackgroundResource(i);
        }
        this.f22542k = (LoadingStatusView) this.f22539h.findViewById(R.id.a39);
        C8317c cVar = (C8317c) C4514j.m10883j().mo10326g().mo10305a(C8317c.class);
        if (cVar != null) {
            this.f22547p = cVar.mo14495a(getContext());
        }
        if (this.f22547p == null) {
            this.f22547p = new C8207h() {
            };
        }
        this.f22542k.setTag(Boolean.valueOf(this.f22545n));
    }

    /* renamed from: a */
    public static C8232e m16336a(C8214a aVar, Room room, boolean z, String str, int i, DataCenter dataCenter, Context context, boolean z2) {
        C8232e eVar = new C8232e(context, dataCenter);
        eVar.f22533b = aVar;
        eVar.f22534c = room;
        eVar.f22545n = z;
        eVar.f22532a = str;
        eVar.f22536e = i;
        eVar.f22537f = dataCenter;
        eVar.f22538g = z2;
        eVar.f22548q = false;
        eVar.setPresenter(new C8164r(eVar, aVar, i));
        return eVar;
    }
}
