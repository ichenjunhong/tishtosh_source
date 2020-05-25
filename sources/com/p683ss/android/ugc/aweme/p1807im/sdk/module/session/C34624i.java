package com.p683ss.android.ugc.aweme.p1807im.sdk.module.session;

import android.content.Context;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11190e;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.DmViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.like.DmViewModel.C33854a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34213a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.newstyle.p1865b.C34647a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34567a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.module.session.p1861a.C34576b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.service.p1906h.C35456b;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.i */
public final class C34624i extends C26840g<C35456b> implements C34647a {

    /* renamed from: b */
    private static final int f89201b = ((int) C9432q.m18687b(C11010c.m22280a(), 8.0f));

    /* renamed from: a */
    public boolean f89202a;

    /* renamed from: c */
    private View f89203c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.i$a */
    public class C34625a extends C1352v {
        public C34625a(View view) {
            super(view);
        }
    }

    /* renamed from: g */
    public final int mo72676g() {
        if (this.f89203c == null) {
            return 0;
        }
        return 1;
    }

    /* renamed from: c */
    public final int mo48636c() {
        return super.mo48636c() + mo72676g();
    }

    public final void onViewAttachedToWindow(C1352v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C34667r) {
            ((C34667r) vVar).mo72727a();
        }
    }

    public final void onViewDetachedFromWindow(C1352v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof C34667r) {
            ((C34667r) vVar).mo72730b();
        }
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        boolean z;
        if (i < mo72676g()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 200;
        }
        return super.mo48641a(i);
    }

    public C34624i(AppCompatActivity appCompatActivity) {
        mo54792d(R.string.bkd);
        mo54790b("");
        DmViewModel a = C33854a.m77621a(appCompatActivity);
        if (a != null) {
            a.mo71885b().observe(appCompatActivity, new C34626j(this));
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        int i2;
        int g = i - mo72676g();
        ((C34667r) vVar).mo72728a((C35456b) this.f70670n.get(g), g);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) vVar.itemView.getLayoutParams();
        int i3 = marginLayoutParams.leftMargin;
        if (g == 0) {
            i2 = f89201b;
        } else {
            i2 = 0;
        }
        marginLayoutParams.setMargins(i3, i2, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        if (i == 200 && this.f89203c != null) {
            return new C34625a(this.f89203c);
        }
        if (C34004b.m77717a().mo71949f().showNewStyle()) {
            return new C34665p(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bfn, viewGroup, false), this);
        }
        return new C34667r(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bfh, viewGroup, false), this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo72675a(String str, C1710e<Integer> eVar) {
        if (this.f70670n != null) {
            int i = 0;
            while (i < this.f70670n.size()) {
                try {
                    if (TextUtils.equals(((C35456b) this.f70670n.get(i)).bm_(), str)) {
                        eVar.accept(Integer.valueOf(i));
                    } else {
                        i++;
                    }
                } catch (Exception e) {
                    C32458a.m75143a(e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo72674a(Context context, int i, C35456b bVar, int i2) {
        if (i2 != 0) {
            if (bVar.f91122m == null) {
                bVar.f91122m = new HashMap<>();
            }
            bVar.f91122m.put("position", String.valueOf(i));
            boolean z = true;
            if (i2 == 2 && (bVar instanceof C34567a)) {
                C34010e.m77748a().mo71964b(String.valueOf(C11190e.m22685a(bVar.bm_())));
                z = false;
            }
            if (bVar.f91125p != null) {
                bVar.f91125p.mo72636a(context, bVar, i2);
            }
            if (bVar.mo72634b() == 20 && C34213a.m78052a(bVar.bm_())) {
                z = false;
            }
            if (z && !(bVar instanceof C34576b)) {
                bVar.f91119j = 0;
            }
            notifyItemChanged(i + mo72676g());
        } else if (bVar.f91125p != null) {
            bVar.f91125p.mo72636a(context, bVar, 0);
        }
    }
}
