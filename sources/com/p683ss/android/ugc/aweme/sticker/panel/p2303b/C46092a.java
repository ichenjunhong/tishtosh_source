package com.p683ss.android.ugc.aweme.sticker.panel.p2303b;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.sticker.model.C46067b;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.sticker.model.C46070e;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2310b.C46312b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.view.widget.AVTextView;
import com.ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.b.a */
public final class C46092a {

    /* renamed from: a */
    private Context f116317a;

    /* renamed from: b */
    private C46312b f116318b;

    /* renamed from: c */
    private Effect f116319c;

    /* renamed from: d */
    private LinearLayout f116320d;

    /* renamed from: e */
    private SimpleDraweeView f116321e;

    /* renamed from: f */
    private AVTextView f116322f;

    /* renamed from: g */
    private AVTextView f116323g;

    /* renamed from: h */
    private Map<String, C46067b> f116324h = new HashMap();

    /* renamed from: a */
    private void m100184a(C46067b bVar, boolean z) {
        if (bVar == null) {
            this.f116320d.setVisibility(8);
            return;
        }
        this.f116318b.mo93039a(bVar.getId());
        this.f116320d.setVisibility(0);
        UrlModel screenIcon = bVar.getScreenIcon();
        if (screenIcon != null) {
            this.f116321e.setVisibility(0);
            C50181a.m108302b(this.f116321e, screenIcon);
        } else {
            this.f116321e.setVisibility(8);
        }
        this.f116322f.setText(bVar.getScreenDesc());
        long expireTime = bVar.getExpireTime();
        String format = new SimpleDateFormat("yyyy.MM.dd", Locale.getDefault()).format(new Date(1000 * expireTime));
        if (expireTime == 0 || TextUtils.isEmpty(format) || !z) {
            this.f116323g.setVisibility(8);
            return;
        }
        this.f116323g.setVisibility(0);
        this.f116323g.setText(this.f116317a.getString(R.string.cmh, new Object[]{format}));
    }

    /* renamed from: a */
    public final boolean mo92788a(Effect effect, int i) {
        if (effect == null || i == 0 || !effect.isBusiness()) {
            this.f116320d.setVisibility(8);
            return false;
        } else if (this.f116324h.containsKey(effect.getEffectId())) {
            m100184a((C46067b) this.f116324h.get(effect.getEffectId()), C46059g.m100086j(effect));
            return true;
        } else {
            this.f116319c = effect;
            String effectId = effect.getEffectId();
            C0013i.m16a((Callable<TResult>) new C46093b<TResult>(effectId)).mo20a((C0011g<TResult, TContinuationResult>) new C46094c<TResult,TContinuationResult>(this, effectId, effect), C0013i.f25b);
            return true;
        }
    }

    public C46092a(LinearLayout linearLayout, C46312b bVar, Context context) {
        this.f116317a = context;
        this.f116318b = bVar;
        this.f116320d = linearLayout;
        this.f116321e = (SimpleDraweeView) linearLayout.findViewById(R.id.y7);
        this.f116322f = (AVTextView) linearLayout.findViewById(R.id.y6);
        this.f116323g = (AVTextView) linearLayout.findViewById(R.id.y9);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo92787a(String str, Effect effect, C0013i iVar) throws Exception {
        if (!TextUtils.equals(this.f116319c.getEffectId(), str)) {
            return null;
        }
        if (iVar.mo31c() || iVar.mo33d()) {
            m100184a((C46067b) this.f116324h.get(str), C46059g.m100086j(effect));
            return null;
        }
        try {
            C46067b bVar = ((C46069d) ((C46070e) iVar.mo34e()).mStickers.get(0)).commerceSticker;
            this.f116324h.put(str, bVar);
            m100184a(bVar, C46059g.m100086j(effect));
        } catch (Exception unused) {
        }
        return null;
    }
}
