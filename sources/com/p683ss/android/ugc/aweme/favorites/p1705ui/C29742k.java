package com.p683ss.android.ugc.aweme.favorites.p1705ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.MtEmptyView;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.favorites.adapter.C29675e;
import com.p683ss.android.ugc.aweme.favorites.model.C29709d;
import com.p683ss.android.ugc.aweme.favorites.p1702b.C29685a;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.k */
public class C29742k extends C29716a {

    /* renamed from: l */
    private boolean f77680l;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C26840g mo59986o() {
        return new C29675e();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f77680l = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo59985n() {
        if (this.f77639k != null) {
            this.f77639k.mo54799a(new C29709d());
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f77680l) {
            this.f77680l = false;
            mo59983k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo59983k() {
        if (this.f77639k != null) {
            this.f77639k.mo44934a_(Integer.valueOf(1));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo59984m() {
        if (this.f77639k != null) {
            this.f77639k.mo44934a_(Integer.valueOf(4));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final View mo59989r() {
        if (getActivity() == null) {
            return null;
        }
        C10722c cVar = new C10723a(getActivity()).mo19280b((int) R.string.b13).mo19282c(R.string.b12).mo19277a((int) R.drawable.dww).f28711a;
        MtEmptyView a = MtEmptyView.m21697a(getContext());
        a.setStatus(cVar);
        return a;
    }

    @C53771m
    public void onStickerCollectEvent(C29685a aVar) {
        if (isViewValid()) {
            List items = ((C26875a) this.f77639k.mo54803n()).getItems();
            C46069d dVar = aVar.f77593a;
            if (items != null && !items.isEmpty() && dVar != null) {
                if (!dVar.isFavorite) {
                    int size = items.size();
                    Iterator it = items.iterator();
                    while (it.hasNext()) {
                        C46069d dVar2 = (C46069d) it.next();
                        if (dVar2 != null && TextUtils.equals(dVar2.f116246id, dVar.f116246id)) {
                            this.f77680l = false;
                            it.remove();
                        }
                    }
                    if (size != items.size()) {
                        this.f77635c.notifyDataSetChanged();
                    } else {
                        this.f77680l = true;
                    }
                    if (items.isEmpty()) {
                        aJ_();
                    }
                    return;
                }
                this.f77680l = true;
            }
        }
    }
}
