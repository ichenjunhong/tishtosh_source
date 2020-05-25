package com.p683ss.android.ugc.aweme.sticker.p2301k;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.model.C46067b;
import com.p683ss.android.ugc.aweme.sticker.model.C46068c;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2278b.C45830f;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.C46476a;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46607e;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46610h;
import com.p683ss.android.ugc.aweme.tools.ToolsUrlModel;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.p683ss.android.ugc.effectmanager.effect.model.ResourceListModel.ResourceListBean;
import com.p683ss.android.ugc.tools.view.p2512e.C50224a;
import com.p683ss.android.ugc.tools.view.p2512e.C50224a.C50232a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.k.g */
public final class C46059g {

    /* renamed from: a */
    private static Map<String, List<String>> f116206a = new HashMap();

    /* renamed from: a */
    public static boolean m100071a(String str, FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || faceStickerBean == FaceStickerBean.NONE || !C9414h.m18631b(faceStickerBean.getTags()) || !faceStickerBean.getTags().contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m100072a(String str, Effect effect) {
        return effect != null && C9414h.m18631b(effect.getTags()) && effect.getTags().contains(str);
    }

    /* renamed from: a */
    public static boolean m100070a(String str) {
        ArrayList a = C46610h.m101163a();
        if (a.size() == 0) {
            return false;
        }
        return a.contains(str);
    }

    /* renamed from: c */
    public static boolean m100079c(Effect effect) {
        return m100072a("BackgroundVideo", effect);
    }

    /* renamed from: i */
    public static boolean m100085i(Effect effect) {
        return C44518a.m97418b(effect);
    }

    /* renamed from: j */
    public static boolean m100086j(Effect effect) {
        return C44518a.m97419c(effect);
    }

    /* renamed from: r */
    public static boolean m100094r(Effect effect) {
        return C44518a.m97415a(effect);
    }

    /* renamed from: u */
    public static boolean m100097u(Effect effect) {
        return C44518a.m97422f(effect);
    }

    /* renamed from: w */
    public static boolean m100099w(Effect effect) {
        return m100072a("GreenScreen", effect);
    }

    /* renamed from: a */
    public static boolean m100066a(StickerWrapper stickerWrapper) {
        if (stickerWrapper == null || !m100076b(stickerWrapper.f115779a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m100076b(Effect effect) {
        if (effect == null || effect.getEffectType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m100091o(Effect effect) {
        return effect.getTags().contains("douyin_card");
    }

    /* renamed from: p */
    public static boolean m100092p(Effect effect) {
        if (effect == null) {
            return false;
        }
        return effect.getTypes().contains("Adaptive");
    }

    /* renamed from: x */
    public static boolean m100100x(Effect effect) {
        if (effect == null || effect.getEffectType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m100068a(C46069d dVar) {
        if (dVar == null) {
            return false;
        }
        if ((!C9414h.m18631b(dVar.mTags) || !dVar.mTags.contains("lock")) && !m100075b(dVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m100074b(StickerWrapper stickerWrapper) {
        boolean z;
        if (stickerWrapper != null) {
            Effect effect = stickerWrapper.f115779a;
            if (effect == null || effect.getEffectType() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static int m100078c(String str) {
        if (TextUtils.isEmpty(str) || str.equals("{}")) {
            return -1;
        }
        try {
            return new JSONObject(str).getInt("lock_type");
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static boolean m100080d(Effect effect) {
        if (!m100072a("BackgroundVideo", effect) || !m100072a("MultiScanBgVideo", effect)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m100081e(Effect effect) {
        if (m100082f(effect) || m100083g(effect) || m100084h(effect)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m100082f(Effect effect) {
        if (effect == null || effect.getTypes() == null || !effect.getTypes().contains("AR")) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static boolean m100093q(Effect effect) {
        ArrayList a = C46610h.m101163a();
        if (a.size() == 0) {
            return false;
        }
        return a.contains(effect.getEffectId());
    }

    /* renamed from: s */
    public static boolean m100095s(Effect effect) {
        if (C44518a.m97420d(effect) || C44518a.m97421e(effect)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m100096t(Effect effect) {
        if (effect == null || effect.getTypes() == null) {
            return false;
        }
        return effect.getTypes().contains("TouchGes");
    }

    /* renamed from: y */
    public static boolean m100101y(Effect effect) {
        if (effect == null || effect.getTypes() == null || !effect.getTypes().contains("Composer")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static ArrayList<String> m100073b(String str) {
        String[] split;
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static boolean m100083g(Effect effect) {
        if (effect == null || ((effect.getTags() == null || !effect.getTags().contains("text2d")) && !effect.getTypes().contains("Text2D") && !effect.getTypes().contains("Text2DV2"))) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m100084h(Effect effect) {
        if (effect == null || ((effect.getTags() == null || !effect.getTags().contains("TextEdit")) && !effect.getTypes().contains("TextEdit"))) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m100087k(Effect effect) {
        if (!m100085i(effect) || m100086j(effect)) {
            return false;
        }
        String effectId = effect.getEffectId();
        if (TextUtils.isEmpty(effectId)) {
            return false;
        }
        for (String equals : C46610h.m101163a()) {
            if (TextUtils.equals(effectId, equals)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m100088l(Effect effect) {
        if (effect == null) {
            return false;
        }
        for (String contains : effect.getTags()) {
            if (contains.contains(":1")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static String m100089m(Effect effect) {
        if (effect == null) {
            return "default";
        }
        for (String str : effect.getTags()) {
            if (str.contains("lock")) {
                if (str.split(":").length == 3) {
                    return str.split(":")[2];
                }
                return "default";
            }
        }
        return "default";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a.m97421e(r3) == false) goto L_0x002d;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m100098v(com.p683ss.android.ugc.effectmanager.effect.model.Effect r3) {
        /*
            if (r3 == 0) goto L_0x002d
            boolean r0 = com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a.m97422f(r3)
            r1 = 0
            if (r0 != 0) goto L_0x002c
            boolean r0 = com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a.m97420d(r3)
            if (r0 != 0) goto L_0x002c
            if (r3 == 0) goto L_0x0023
            java.util.List r0 = r3.getTags()
            if (r0 != 0) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            java.util.List r0 = r3.getTags()
            java.lang.String r2 = "audio_effect"
            boolean r0 = r0.contains(r2)
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 != 0) goto L_0x002c
            boolean r3 = com.p683ss.android.ugc.aweme.shortvideo.sticker.C44518a.m97421e(r3)
            if (r3 == 0) goto L_0x002d
        L_0x002c:
            return r1
        L_0x002d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g.m100098v(com.ss.android.ugc.effectmanager.effect.model.Effect):boolean");
    }

    /* renamed from: z */
    public static boolean m100102z(Effect effect) {
        boolean z;
        if (effect == null || effect.getParentId() == null || effect.getParentId().isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z || m100100x(effect) || m100092p(effect) || m100079c(effect) || ((C46476a.m100892a(effect) && !m100099w(effect)) || m100101y(effect))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m100075b(C46069d dVar) {
        if (dVar == null) {
            return false;
        }
        String str = dVar.extra;
        if (!TextUtils.isEmpty(str) && !m100070a(dVar.f116246id) && dVar.commerceSticker != null && m100078c(str) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static String m100090n(Effect effect) {
        if (effect == null || effect.getTags() == null || effect.getTags().isEmpty()) {
            return null;
        }
        for (String str : effect.getTags()) {
            if (str != null && str.contains("challenge") && str.contains(":")) {
                String[] split = str.split(":");
                if (split.length <= 1 || split[1] == null || split[1].isEmpty() || !split[1].matches("[0-9]+")) {
                    return null;
                }
                return split[1];
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m100067a(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || ((faceStickerBean.getTags() == null || !faceStickerBean.getTags().contains("text2d")) && !faceStickerBean.getTypes().contains("Text2D") && !faceStickerBean.getTypes().contains("Text2DV2"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m100069a(Effect effect) {
        if (effect == null || effect.getEffectType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static List<String> m100063a(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<String> m100061a(Context context, String str) {
        if (f116206a.keySet().contains(str)) {
            return (List) f116206a.get(str);
        }
        ArrayList<String> arrayList = new ArrayList<>(new C46607e(context, str).f117591e);
        f116206a.put(str, arrayList);
        String str2 = "本地已经提示过的贴纸列表";
        for (String str3 : arrayList) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str3);
            sb.append(" , ");
            str2 = sb.toString();
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<C45830f> m100062a(String str, ResourceListModel resourceListModel) {
        ArrayList arrayList = new ArrayList();
        if (resourceListModel == null) {
            return arrayList;
        }
        for (ResourceListBean resourceListBean : resourceListModel.getResourceList()) {
            C45830f fVar = new C45830f();
            fVar.f115834b = resourceListBean.getName();
            fVar.f115835c = resourceListBean.getValue();
            ToolsUrlModel toolsUrlModel = new ToolsUrlModel();
            toolsUrlModel.f118259b = m100063a(resourceListBean.getResourceUrl(), resourceListModel.getUrlPrefix());
            C52711k.m112240b(toolsUrlModel, "<set-?>");
            fVar.f115836d = toolsUrlModel;
            C52711k.m112240b(str, "<set-?>");
            fVar.f115837e = str;
            String resourceUrl = resourceListBean.getResourceUrl();
            C52711k.m112240b(resourceUrl, "<set-?>");
            fVar.f115833a = resourceUrl;
            arrayList.add(fVar);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m100077b(String str, Effect effect) {
        if (effect != null && C9414h.m18631b(effect.getTypes()) && effect.getTypes().contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m100064a(Context context, String str, String str2) {
        if (f116206a.keySet().contains(str)) {
            ((List) f116206a.get(str)).add(str2);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            f116206a.put(str, arrayList);
        }
        C46607e eVar = new C46607e(context, str);
        if (eVar.f117591e.add(str2)) {
            eVar.f117590d.putStringSet("remindedIds", eVar.f117591e);
            eVar.f117590d.apply();
        }
    }

    /* renamed from: a */
    public static boolean m100065a(Context context, C46069d dVar, String str) {
        String str2;
        if (!m100075b(dVar) || m100070a(dVar.f116246id)) {
            return false;
        }
        C47702b.f120193a.mo94984a("show_toast", C42438az.m93209a().mo86526a("prop_id", dVar.f116246id).mo86526a("scene_id", "1001").mo86526a("enter_from", str).f107329a);
        C46068c cVar = null;
        if (dVar != null) {
            C46067b bVar = dVar.commerceSticker;
            if (bVar != null) {
                cVar = bVar.getCommerceStickerUnlockInfo();
            }
        }
        C50232a aVar = new C50232a(context);
        if (cVar == null) {
            str2 = "";
        } else {
            str2 = cVar.desc;
        }
        aVar.f125829b = str2;
        C50224a a = aVar.mo98011b(R.string.wf, C46060h.f116207a).mo98008a(R.string.ap3, new C46061i(dVar, str, context)).mo98009a();
        a.f125808j.setAlpha(0.0f);
        Builder builder = new Builder(a.f125799a);
        builder.setView(a.f125806h);
        a.f125800b.setText(a.f125810l);
        a.f125801c.setText(a.f125811m);
        a.f125803e.setText(a.f125812n);
        if (TextUtils.isEmpty(a.f125813o)) {
            a.f125802d.setVisibility(8);
            a.f125804f.setVisibility(8);
            a.f125803e.setBackgroundResource(R.drawable.dy_);
        } else {
            a.f125802d.setText(a.f125813o);
        }
        if (a.f125807i != null) {
            a.f125801c.setVisibility(8);
            a.f125800b.setVisibility(8);
            a.f125809k.removeAllViews();
            a.f125809k.addView(a.f125807i);
        }
        if (TextUtils.isEmpty(a.f125810l)) {
            a.f125800b.setVisibility(8);
            LayoutParams layoutParams = (LayoutParams) a.f125801c.getLayoutParams();
            layoutParams.topMargin = (int) C9432q.m18687b(a.f125799a, 24.0f);
            a.f125801c.setLayoutParams(layoutParams);
        }
        if (a.f125814p > 0) {
            a.f125805g.setImageResource(a.f125814p);
        }
        AlertDialog create = builder.create();
        a.f125802d.setOnClickListener(new OnClickListener(create) {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f125819a;

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                try {
                    C50224a.this.mo97999a(false);
                    new Handler().postDelayed(new Runnable() {
                        public final void run() {
                            C502273.this.f125819a.dismiss();
                        }
                    }, 100);
                } catch (Exception unused) {
                }
                if (C50224a.this.f125816r != null) {
                    C50224a.this.f125816r.onClick(null, 0);
                }
            }

            {
                this.f125819a = r2;
            }
        });
        a.f125803e.setOnClickListener(new OnClickListener(create) {

            /* renamed from: a */
            final /* synthetic */ AlertDialog f125822a;

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                try {
                    C50224a.this.mo97999a(false);
                    new Handler().postDelayed(new Runnable() {
                        public final void run() {
                            C502294.this.f125822a.dismiss();
                        }
                    }, 100);
                } catch (Exception unused) {
                }
                if (C50224a.this.f125815q != null) {
                    C50224a.this.f125815q.onClick(null, 1);
                }
            }

            {
                this.f125822a = r2;
            }
        });
        a.mo97998a((Dialog) create);
        return true;
    }
}
