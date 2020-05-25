package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like;

import android.content.Context;
import android.support.p043v7.p051e.C1208c;
import android.support.p043v7.p051e.C1208c.C1211b;
import android.support.p043v7.widget.C1506w;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11213r;
import com.bytedance.p702im.core.p706c.C11238s;
import com.bytedance.p702im.core.p706c.C11238s.C11239a;
import com.bytedance.p702im.core.proto.OPERATION_TYPE;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.view.ChatDiggLayout;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35200an;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35273k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.p1893a.C35182b;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.d */
public final class C33860d {

    /* renamed from: l */
    public static final C33861a f87836l = new C33861a(null);

    /* renamed from: a */
    public ChatDiggLayout f87837a;

    /* renamed from: b */
    public final ImageView f87838b = ((ImageView) this.f87846j.findViewById(R.id.e5g));

    /* renamed from: c */
    public final Context f87839c = this.f87846j.getContext();

    /* renamed from: d */
    public final C33858b f87840d;

    /* renamed from: e */
    public final RecyclerView f87841e;

    /* renamed from: f */
    public final String f87842f;

    /* renamed from: g */
    public final Map<String, C33859c> f87843g;

    /* renamed from: h */
    public C11207p f87844h;

    /* renamed from: i */
    public boolean f87845i;

    /* renamed from: j */
    public final View f87846j;

    /* renamed from: k */
    public final int f87847k;

    /* renamed from: m */
    private final int[] f87848m;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.d$a */
    public static final class C33861a {
        private C33861a() {
        }

        public /* synthetic */ C33861a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.d$b */
    static final class C33862b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33860d f87849a;

        C33862b(C33860d dVar) {
            this.f87849a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C35200an.m79575a(view, 1000)) {
                this.f87849a.mo71890a(null, null, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.like.d$c */
    public static final class C33863c implements C11162b<C11238s> {

        /* renamed from: a */
        final /* synthetic */ C11207p f87850a;

        C33863c(C11207p pVar) {
            this.f87850a = pVar;
        }

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            C52711k.m112240b(kVar, "error");
            StringBuilder sb = new StringBuilder("addProperty ");
            sb.append(this.f87850a.getUuid());
            sb.append(" onFailure");
            C32458a.m75141a(4, "DmHelper", sb.toString());
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20506a(Object obj) {
            C11238s sVar = (C11238s) obj;
            StringBuilder sb = new StringBuilder("addProperty ");
            sb.append(this.f87850a.getUuid());
            sb.append(" onSuccess");
            C32458a.m75141a(4, "DmHelper", sb.toString());
        }
    }

    /* renamed from: b */
    private final void m77624b() {
        this.f87838b.setOnClickListener(new C33862b(this));
    }

    /* renamed from: a */
    private final boolean m77623a() {
        C33859c cVar = (C33859c) this.f87843g.get(this.f87842f);
        if (cVar == null || !cVar.f87834a) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final void m77625b(boolean z) {
        C33859c cVar = (C33859c) this.f87843g.get(this.f87842f);
        if (cVar != null) {
            cVar.f87834a = z;
        }
        mo71891a(this.f87845i);
    }

    /* renamed from: a */
    public final void mo71891a(boolean z) {
        Object obj;
        Collection values = this.f87843g.values();
        Iterable iterable = values;
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z2 = true;
            if (!((C33859c) obj).f87834a) {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        if (obj != null) {
            this.f87846j.setVisibility(0);
            ImageView imageView = this.f87838b;
            C52711k.m112236a((Object) imageView, "iconView");
            imageView.setVisibility(0);
            C33858b bVar = this.f87840d;
            C52711k.m112240b(values, "outterList");
            Collection arrayList = new ArrayList();
            for (Object next : iterable) {
                if (((C33859c) next).f87834a) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            C1211b a = C1208c.m3654a(new C35273k(bVar.f87832a, list));
            C52711k.m112236a((Object) a, "DiffUtil.calculateDiff(D…llback(list, filterList))");
            bVar.f87832a.clear();
            C52575l.m112108a((Collection) bVar.f87832a, (Iterable) list);
            a.mo3931a((C1322a) bVar);
            this.f87838b.setImageResource(R.drawable.d90);
            m77624b();
        } else if (!z || !DmGuideExperiment.INSTANCE.mo71883b()) {
            this.f87846j.setVisibility(8);
            ImageView imageView2 = this.f87838b;
            C52711k.m112236a((Object) imageView2, "iconView");
            imageView2.setVisibility(8);
            this.f87840d.mo71888a();
        } else {
            this.f87846j.setVisibility(0);
            ImageView imageView3 = this.f87838b;
            C52711k.m112236a((Object) imageView3, "iconView");
            imageView3.setVisibility(0);
            C11207p pVar = this.f87844h;
            if (pVar != null) {
                C33864e eVar = C33864e.f87851a;
                C52711k.m112240b(pVar, "msg");
                C26890h.m65011a("like_message_show", eVar.mo71893a(pVar).f61491a);
            }
            this.f87838b.setImageResource(R.drawable.d8z);
            m77624b();
            this.f87840d.mo71888a();
        }
    }

    /* renamed from: a */
    public final void mo71889a(IMUser iMUser, boolean z) {
        if (iMUser != null) {
            String uid = iMUser.getUid();
            if (uid == null) {
                StringBuilder sb = new StringBuilder("putItemToItemsMapSafely-> uid is null->");
                sb.append(iMUser);
                sb.append(',');
                sb.append(z);
                C32458a.m75141a(5, "DmHelper", sb.toString());
                return;
            }
            this.f87843g.put(uid, new C33859c(z, iMUser));
        }
    }

    public C33860d(View view, int i) {
        C52711k.m112240b(view, "rootView");
        this.f87846j = view;
        this.f87847k = i;
        Context context = this.f87839c;
        C52711k.m112236a((Object) context, "context");
        this.f87840d = new C33858b(context);
        RecyclerView recyclerView = (RecyclerView) this.f87846j.findViewById(R.id.etl);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2, 1, false));
        recyclerView.setAdapter(this.f87840d);
        recyclerView.setItemAnimator(new C1506w());
        this.f87841e = recyclerView;
        this.f87842f = C35265e.m79730b().toString();
        this.f87843g = new LinkedHashMap();
        this.f87848m = new int[2];
    }

    /* renamed from: a */
    public final void mo71890a(Float f, Float f2, boolean z) {
        OPERATION_TYPE operation_type;
        C11207p pVar = this.f87844h;
        if (pVar != null) {
            C11180b a = C11182d.m22641a().mo20658a(pVar.getConversationId());
            boolean a2 = m77623a();
            boolean z2 = false;
            if (!a2 || z) {
                C35182b.m79425a();
                C33864e.f87851a.mo71895a(pVar, z, TextUtils.equals(String.valueOf(pVar.getSender()), this.f87842f));
                if (f == null || f2 == null) {
                    this.f87846j.getLocationOnScreen(this.f87848m);
                    f = Float.valueOf((float) this.f87848m[0]);
                    f2 = Float.valueOf((float) this.f87848m[1]);
                }
                ChatDiggLayout chatDiggLayout = this.f87837a;
                if (chatDiggLayout != null) {
                    if (f == null) {
                        C52711k.m112234a();
                    }
                    float floatValue = f.floatValue();
                    if (f2 == null) {
                        C52711k.m112234a();
                    }
                    chatDiggLayout.mo71749a(floatValue, f2.floatValue());
                }
            }
            if (a2) {
                operation_type = OPERATION_TYPE.REMOVE_PROPERTY_ITEM;
            } else {
                operation_type = OPERATION_TYPE.ADD_PROPERTY_ITEM;
            }
            if (operation_type == OPERATION_TYPE.REMOVE_PROPERTY_ITEM) {
                C33864e.f87851a.mo71896b(pVar);
                if (z) {
                    C32458a.m75141a(4, "DmHelper", "from double click like ,but we can't remove like");
                    return;
                }
            }
            String str = "DmHelper";
            StringBuilder sb = new StringBuilder("start to like,type:");
            sb.append(operation_type);
            sb.append(",digg exist:");
            if (this.f87837a == null) {
                z2 = true;
            }
            sb.append(z2);
            C32458a.m75141a(4, str, sb.toString());
            m77625b(!a2);
            C11213r.m22770a(new C11239a().mo20868a(a).mo20869a(pVar).mo20870a(operation_type, "e:love", this.f87842f, this.f87842f).f30272a, (C11162b<C11238s>) new C33863c<C11238s>(pVar));
        }
    }
}
