package com.p683ss.android.ugc.aweme.effect;

import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.effect.l */
public final class C29207l {
    /* renamed from: a */
    static ArrayList<EffectModel> m68790a() {
        ArrayList<EffectModel> arrayList = new ArrayList<>();
        arrayList.add(m68789a(C39629l.m88233b().getString(R.string.dyb), "0", (int) R.drawable.ahj));
        arrayList.add(m68789a(C39629l.m88233b().getString(R.string.dy6), "1", (int) R.drawable.alt));
        arrayList.add(m68789a(C39629l.m88233b().getString(R.string.dy7), "2", (int) R.drawable.alr));
        arrayList.add(m68789a(C39629l.m88233b().getString(R.string.dy8), "3", (int) R.drawable.als));
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m68792a(String str) {
        return "trans".equals(str);
    }

    /* renamed from: b */
    public static boolean m68793b(String str) {
        return "sticker".equals(str);
    }

    /* renamed from: a */
    static boolean m68791a(EffectModel effectModel) {
        try {
            if (Integer.parseInt(effectModel.key) < 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static EffectModel m68789a(String str, String str2, int i) {
        EffectModel effectModel = new EffectModel();
        effectModel.name = str;
        effectModel.type = 2;
        effectModel.key = str2;
        effectModel.imagePath = i;
        return effectModel;
    }

    /* renamed from: a */
    public static EffectModel m68788a(int i, Effect effect, String str) {
        int[] iArr;
        EffectModel effectModel = new EffectModel();
        effectModel.name = effect.getName();
        effectModel.hint = effect.getHint();
        effectModel.key = effect.getEffectId();
        effectModel.type = 1;
        int i2 = 0;
        effectModel.iconUrl = (String) effect.getIconUrl().getUrlList().get(0);
        List d = C39629l.m88232a().mo58575f().mo58633d();
        if (d != null && !d.isEmpty()) {
            iArr = new int[d.size()];
            for (int i3 = 0; i3 < d.size(); i3++) {
                iArr[i3] = C29197f.m68746a((String) d.get(i3));
            }
        } else if (C29197f.f76505b != null) {
            iArr = C29197f.f76505b;
        } else {
            iArr = C39629l.m88233b().getResources().getIntArray(R.array.s);
            C29197f.f76505b = iArr;
        }
        effectModel.color = iArr[i % iArr.length];
        effectModel.resDir = effect.getUnzipPath();
        List tags = effect.getTags();
        if (tags != null) {
            String str2 = "duration:";
            Iterator it = tags.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (str3.contains(str2)) {
                    i2 = Integer.parseInt(str3.substring(str2.length()));
                    break;
                }
            }
        }
        effectModel.duration = i2;
        effectModel.category = str;
        effectModel.extra = effect.getExtra();
        return effectModel;
    }
}
