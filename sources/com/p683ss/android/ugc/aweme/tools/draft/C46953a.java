package com.p683ss.android.ugc.aweme.tools.draft;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.draft.model.C29061d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder.C46951a;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46994b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.a */
public final class C46953a extends C26840g<C29059c> implements C46951a {

    /* renamed from: a */
    boolean f118639a;

    /* renamed from: b */
    public boolean f118640b = true;

    /* renamed from: c */
    public C46958c f118641c;

    /* renamed from: d */
    private boolean f118642d;

    /* renamed from: e */
    private Map<ImageView, C13715a<C14042c>> f118643e;

    /* renamed from: f */
    private C46951a f118644f;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.a$a */
    protected class C46956a extends C1352v {
        C46956a(View view) {
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.a$b */
    protected class C46957b extends C1352v {

        /* renamed from: a */
        TextView f118650a;

        C46957b(View view) {
            super(view);
            this.f118650a = (TextView) view.findViewById(R.id.dha);
            C10749b.m21787a().mo19438a(this.f118650a, C10751d.f28908g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.a$c */
    public interface C46958c {
        /* renamed from: a */
        void mo94264a();
    }

    /* renamed from: a */
    public final List<C29059c> mo50673a() {
        return this.f70670n;
    }

    /* renamed from: g */
    private boolean m101996g() {
        for (C29059c cVar : this.f70670n) {
            if (cVar != null && cVar.mo58793c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        return ((C29059c) this.f70670n.get(i)).f76164v;
    }

    /* renamed from: b */
    private int m101992b(int i) {
        int i2 = i - 1;
        while (i2 >= 0) {
            C29059c cVar = (C29059c) this.f70670n.get(i2);
            if (cVar != null && cVar.f76164v == 3) {
                break;
            }
            i2--;
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo94261a(boolean z) {
        this.f118642d = z;
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public static void m101993b(C29059c cVar) {
        C39630m.m88234a().mo58615m().mo74138a(cVar.mo58774ak());
        C47017s.m102091a().mo94312d(cVar);
        C29061d.m68499d(cVar);
    }

    /* renamed from: c */
    private boolean m101994c(int i) {
        if (((C29059c) this.f70670n.get(i)).f76147e == null || i == 0 || ((C29059c) this.f70670n.get(i - 1)).f76164v != 1) {
            return false;
        }
        if (i == this.f70670n.size() - 1) {
            return true;
        }
        int i2 = i + 1;
        if (((C29059c) this.f70670n.get(i2)).f76164v == 1 || ((C29059c) this.f70670n.get(i2)).f76147e == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m101995e(int i) {
        if (((C29059c) this.f70670n.get(i)).mo58788ay() == null || i == 0 || ((C29059c) this.f70670n.get(i - 1)).f76164v != 4) {
            return false;
        }
        if (i == this.f70670n.size() - 1) {
            return true;
        }
        int i2 = i + 1;
        if (((C29059c) this.f70670n.get(i2)).f76164v == 4 || ((C29059c) this.f70670n.get(i2)).mo58788ay() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo94260a(C29059c cVar) {
        int indexOf = this.f70670n.indexOf(cVar);
        if (indexOf != -1) {
            int b = m101992b(indexOf);
            boolean a = m101991a(b, indexOf);
            if (m101995e(indexOf) || m101994c(indexOf)) {
                this.f70670n.remove(indexOf);
                int i = indexOf - 1;
                this.f70670n.remove(i);
                if (a) {
                    this.f70670n.remove(b);
                }
                if (m101996g() || this.f118641c == null) {
                    notifyItemRangeRemoved(i, 2);
                    if (a) {
                        notifyItemRemoved(b);
                    }
                    return;
                }
                this.f118641c.mo94264a();
                return;
            }
            this.f70670n.remove(indexOf);
            if (a) {
                this.f70670n.remove(b);
            }
            if (m101996g() || this.f118641c == null) {
                notifyItemRemoved(indexOf);
                if (a) {
                    notifyItemRemoved(b);
                }
                return;
            }
            this.f118641c.mo94264a();
        }
    }

    /* renamed from: a */
    public final void mo94251a(int i, C29059c cVar) {
        this.f118644f.mo94251a(i, cVar);
    }

    public C46953a(Map<ImageView, C13715a<C14042c>> map, C46951a aVar) {
        this.f118643e = map;
        this.f118644f = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r0 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m101991a(int r5, int r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = -1
            if (r1 != r5) goto L_0x0005
            return r0
        L_0x0005:
            r1 = 1
            int r5 = r5 + r1
        L_0x0007:
            java.util.List r2 = r4.f70670n
            int r2 = r2.size()
            if (r5 >= r2) goto L_0x002c
            java.util.List r2 = r4.f70670n
            java.lang.Object r2 = r2.get(r5)
            com.ss.android.ugc.aweme.draft.model.c r2 = (com.p683ss.android.ugc.aweme.draft.model.C29059c) r2
            if (r2 == 0) goto L_0x0022
            boolean r3 = r2.mo58793c()
            if (r3 == 0) goto L_0x0022
            if (r5 == r6) goto L_0x0022
            goto L_0x002d
        L_0x0022:
            if (r2 == 0) goto L_0x0029
            r3 = 3
            int r2 = r2.f76164v
            if (r3 == r2) goto L_0x002c
        L_0x0029:
            int r5 = r5 + 1
            goto L_0x0007
        L_0x002c:
            r0 = 1
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.draft.C46953a.m101991a(int, int):boolean");
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C46984d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tj, viewGroup, false));
        }
        if (i == 2) {
            return new C46956a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ti, viewGroup, false));
        }
        if (3 == i) {
            return new C46957b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bi3, viewGroup, false));
        }
        if (i == 4) {
            return new C46980c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bi2, viewGroup, false));
        }
        return new AwemeDraftViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.th, viewGroup, false), this.f118643e, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48222a(android.support.p043v7.widget.RecyclerView.C1352v r10, int r11) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.p683ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder
            if (r0 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder r10 = (com.p683ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder) r10
            boolean r0 = r9.f118642d
            r10.f118612e = r0
            boolean r0 = r9.f118640b
            r10.f118613f = r0
            java.util.List r0 = r9.f70670n
            java.lang.Object r0 = r0.get(r11)
            com.ss.android.ugc.aweme.draft.model.c r0 = (com.p683ss.android.ugc.aweme.draft.model.C29059c) r0
            r10.mo54774a(r0, r11)
            return
        L_0x001a:
            boolean r0 = r10 instanceof com.p683ss.android.ugc.aweme.tools.draft.C46984d
            if (r0 == 0) goto L_0x0030
            com.ss.android.ugc.aweme.tools.draft.d r10 = (com.p683ss.android.ugc.aweme.tools.draft.C46984d) r10
            boolean r0 = r9.f118642d
            r10.f118687a = r0
            java.util.List r0 = r9.f70670n
            java.lang.Object r0 = r0.get(r11)
            com.ss.android.ugc.aweme.draft.model.c r0 = (com.p683ss.android.ugc.aweme.draft.model.C29059c) r0
            r10.mo54774a(r0, r11)
            return
        L_0x0030:
            boolean r0 = r10 instanceof com.p683ss.android.ugc.aweme.tools.draft.C46953a.C46957b
            if (r0 == 0) goto L_0x004e
            com.ss.android.ugc.aweme.tools.draft.a$b r10 = (com.p683ss.android.ugc.aweme.tools.draft.C46953a.C46957b) r10
            java.util.List r0 = r9.f70670n
            java.lang.Object r11 = r0.get(r11)
            com.ss.android.ugc.aweme.draft.model.c r11 = (com.p683ss.android.ugc.aweme.draft.model.C29059c) r11
            int r11 = r11.f76168z
            android.widget.TextView r0 = r10.f118650a
            if (r0 == 0) goto L_0x00e4
            if (r11 >= 0) goto L_0x0048
            goto L_0x00e4
        L_0x0048:
            android.widget.TextView r10 = r10.f118650a
            r10.setText(r11)
            return
        L_0x004e:
            boolean r0 = r10 instanceof com.p683ss.android.ugc.aweme.tools.draft.C46980c
            if (r0 == 0) goto L_0x00e4
            com.ss.android.ugc.aweme.tools.draft.c r10 = (com.p683ss.android.ugc.aweme.tools.draft.C46980c) r10
            java.util.List r0 = r9.f70670n
            java.lang.Object r11 = r0.get(r11)
            com.ss.android.ugc.aweme.draft.model.c r11 = (com.p683ss.android.ugc.aweme.draft.model.C29059c) r11
            com.ss.android.ugc.aweme.shortvideo.edit.LivePublishModel r11 = r11.mo58788ay()
            java.lang.String r0 = "livePublishModel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = r11.getAuthor()
            android.widget.TextView r1 = r10.f118683b
            android.view.View r2 = r10.f118682a
            android.content.Context r2 = r2.getContext()
            r3 = 2132543519(0x7f1c081f, float:2.0740173E38)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Boolean r6 = r11.getSelfVideo()
            if (r6 != 0) goto L_0x0080
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0080:
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x00ab
            r6 = 0
            if (r0 == 0) goto L_0x008e
            java.lang.String r7 = r0.getNickname()
            goto L_0x008f
        L_0x008e:
            r7 = r6
        L_0x008f:
            boolean r7 = com.bytedance.p879t.p882c.C13248c.m26638a(r7)
            if (r7 == 0) goto L_0x0096
            goto L_0x00ab
        L_0x0096:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "@"
            r7.<init>(r8)
            if (r0 == 0) goto L_0x00a3
            java.lang.String r6 = r0.getNickname()
        L_0x00a3:
            r7.append(r6)
            java.lang.String r0 = r7.toString()
            goto L_0x00ad
        L_0x00ab:
            java.lang.String r0 = ""
        L_0x00ad:
            r6 = 0
            r5[r6] = r0
            java.lang.String r0 = r2.getString(r3, r5)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            android.widget.TextView r0 = r10.f118684c
            java.lang.String r1 = r11.getTime()
            boolean r1 = com.bytedance.p879t.p882c.C13248c.m26638a(r1)
            if (r1 == 0) goto L_0x00ca
            java.lang.String r10 = ""
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            goto L_0x00e1
        L_0x00ca:
            android.view.View r10 = r10.f118682a
            android.content.Context r10 = r10.getContext()
            r1 = 2132543520(0x7f1c0820, float:2.0740175E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r11 = r11.getTime()
            r2[r6] = r11
            java.lang.String r10 = r10.getString(r1, r2)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
        L_0x00e1:
            r0.setText(r10)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tools.draft.C46953a.mo48222a(android.support.v7.widget.RecyclerView$v, int):void");
    }

    /* renamed from: a */
    public final void mo94252a(View view, final C29059c cVar) {
        C26891a aVar = new C26891a(view.getContext());
        aVar.mo54844a((CharSequence[]) new String[]{view.getContext().getResources().getString(R.string.no)}, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                String str;
                C46953a.m101993b(cVar);
                C46953a.this.mo94260a(cVar);
                C46994b.m102064a().notifyDraftDelete(cVar);
                String str2 = "delete_drafts";
                C23089d a = C23089d.m56640a().mo47826a("draft_cnt", 1);
                String str3 = "enter_from";
                if (C46953a.this.f118640b) {
                    str = "storage_management";
                } else {
                    str = "personal_homepage";
                }
                C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
                dialogInterface.dismiss();
            }
        });
        aVar.mo54845b();
        this.f118644f.mo94252a(view, cVar);
    }
}
