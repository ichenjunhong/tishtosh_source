package com.p683ss.android.ugc.aweme.sticker.types.unlock;

import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.unlock.h */
public final class C46610h {

    /* renamed from: a */
    private static ArrayList<String> f117598a = new ArrayList<>();

    /* renamed from: b */
    private static List<LockStickerTextBean> f117599b = new ArrayList();

    /* renamed from: c */
    private static boolean f117600c = false;

    /* renamed from: b */
    public static boolean m101168b() {
        return f117600c;
    }

    /* renamed from: d */
    public static LockStickerTextBean m101170d() {
        return m101166b("default");
    }

    /* renamed from: c */
    public static void m101169c() {
        f117600c = false;
        f117598a.clear();
    }

    /* renamed from: a */
    public static ArrayList<String> m101163a() {
        String str = "";
        Iterator it = f117598a.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(" , ");
            str = sb.toString();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(f117598a);
        arrayList.addAll(C46602a.m101158a().mo93412b());
        return arrayList;
    }

    /* renamed from: a */
    public static void m101164a(String str) {
        if (str != null) {
            f117598a.add(str);
        }
    }

    /* renamed from: a */
    public static LockStickerTextBean m101162a(Effect effect) {
        return m101166b(C46059g.m100089m(effect));
    }

    /* renamed from: b */
    public static LockStickerTextBean m101166b(String str) {
        for (LockStickerTextBean lockStickerTextBean : f117599b) {
            if (lockStickerTextBean.activityId.equals(str)) {
                return lockStickerTextBean;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m101167b(List<LockStickerTextBean> list) {
        if (list != null && !list.isEmpty()) {
            f117599b.clear();
            f117599b.addAll(list);
        }
    }

    /* renamed from: a */
    public static void m101165a(List<String> list) {
        f117600c = true;
        if (list != null) {
            String str = "";
            for (String str2 : list) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                sb.append(" , ");
                str = sb.toString();
            }
            f117598a.clear();
            f117598a.addAll(list);
        }
    }
}
