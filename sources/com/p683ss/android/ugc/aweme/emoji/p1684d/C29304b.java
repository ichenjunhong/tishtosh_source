package com.p683ss.android.ugc.aweme.emoji.p1684d;

import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.emoji.p1680a.C29293i;
import com.p683ss.android.ugc.aweme.emoji.p1685e.C29314c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.d.b */
public final class C29304b {

    /* renamed from: a */
    public final ViewGroup f76684a;

    /* renamed from: b */
    public final C29293i f76685b;

    /* renamed from: c */
    public final int f76686c;

    /* renamed from: d */
    public final View f76687d;

    /* renamed from: e */
    public final C1332i f76688e;

    /* renamed from: f */
    public final C29314c f76689f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29304b) {
                C29304b bVar = (C29304b) obj;
                if (C52711k.m112239a((Object) this.f76684a, (Object) bVar.f76684a) && C52711k.m112239a((Object) this.f76685b, (Object) bVar.f76685b)) {
                    if (!(this.f76686c == bVar.f76686c) || !C52711k.m112239a((Object) this.f76687d, (Object) bVar.f76687d) || !C52711k.m112239a((Object) this.f76688e, (Object) bVar.f76688e) || !C52711k.m112239a((Object) this.f76689f, (Object) bVar.f76689f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ViewGroup viewGroup = this.f76684a;
        int i = 0;
        int hashCode = (viewGroup != null ? viewGroup.hashCode() : 0) * 31;
        C29293i iVar = this.f76685b;
        int hashCode2 = (((hashCode + (iVar != null ? iVar.hashCode() : 0)) * 31) + this.f76686c) * 31;
        View view = this.f76687d;
        int hashCode3 = (hashCode2 + (view != null ? view.hashCode() : 0)) * 31;
        C1332i iVar2 = this.f76688e;
        int hashCode4 = (hashCode3 + (iVar2 != null ? iVar2.hashCode() : 0)) * 31;
        C29314c cVar = this.f76689f;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IMMiniChooseEmojiPayload(layout=");
        sb.append(this.f76684a);
        sb.append(", inputView=");
        sb.append(this.f76685b);
        sb.append(", emojiCount=");
        sb.append(this.f76686c);
        sb.append(", injectEndIconView=");
        sb.append(this.f76687d);
        sb.append(", injectLayoutManager=");
        sb.append(this.f76688e);
        sb.append(", miniEmojiChoosePanelHook=");
        sb.append(this.f76689f);
        sb.append(")");
        return sb.toString();
    }

    public C29304b(ViewGroup viewGroup, C29293i iVar, int i, View view, C1332i iVar2, C29314c cVar) {
        C52711k.m112240b(viewGroup, "layout");
        C52711k.m112240b(iVar, "inputView");
        this.f76684a = viewGroup;
        this.f76685b = iVar;
        this.f76686c = i;
        this.f76687d = view;
        this.f76688e = iVar2;
        this.f76689f = cVar;
    }

    public /* synthetic */ C29304b(ViewGroup viewGroup, C29293i iVar, int i, View view, C1332i iVar2, C29314c cVar, int i2, C52707g gVar) {
        this(viewGroup, iVar, i, view, iVar2, null);
    }
}
