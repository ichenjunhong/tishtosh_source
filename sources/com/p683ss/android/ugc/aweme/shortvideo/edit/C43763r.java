package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.p2345t.C46768a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import p2628d.C52857u;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52731z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.r */
public final class C43763r {

    /* renamed from: a */
    public static final int f110815a;

    /* renamed from: b */
    public static final int f110816b = C52568f.m112079b((Object[]) f110826l, (Object) "sticker_donation");

    /* renamed from: c */
    public static final int f110817c = C52568f.m112079b((Object[]) f110826l, (Object) "sticker_lyric_music");

    /* renamed from: d */
    public static final int f110818d = C52568f.m112079b((Object[]) f110826l, (Object) "auto_enhance");

    /* renamed from: e */
    public static final int f110819e = C52568f.m112079b((Object[]) f110826l, (Object) "music");

    /* renamed from: f */
    public static final int f110820f = C52568f.m112079b((Object[]) f110826l, (Object) "text");

    /* renamed from: g */
    public static final int f110821g = C52568f.m112079b((Object[]) f110826l, (Object) "sticker");

    /* renamed from: h */
    public static final int f110822h = C52568f.m112079b((Object[]) f110826l, (Object) "effect");

    /* renamed from: i */
    public static final int f110823i = C52568f.m112079b((Object[]) f110826l, (Object) "voice");

    /* renamed from: j */
    public static final C43763r f110824j = new C43763r();

    /* renamed from: k */
    private static final String f110825k = f110825k;

    /* renamed from: l */
    private static final String[] f110826l;

    /* renamed from: m */
    private static final HashMap<String, Integer> f110827m = new HashMap<>();

    /* renamed from: n */
    private static SharedPreferences f110828n = C35807d.m80935a(C39629l.m88233b(), "av_settings.xml", 0);

    /* renamed from: o */
    private static boolean f110829o;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.r$a */
    public interface C43764a {
        /* renamed from: a */
        void mo89272a();

        /* renamed from: b */
        void mo89273b();

        /* renamed from: c */
        void mo89274c();

        /* renamed from: d */
        void mo89275d();

        /* renamed from: e */
        void mo89276e();

        /* renamed from: f */
        void mo89277f();

        /* renamed from: g */
        void mo89278g();
    }

    private C43763r() {
    }

    /* renamed from: b */
    public static final boolean m96186b(boolean z) {
        return false;
    }

    /* renamed from: c */
    public static final boolean m96187c(boolean z) {
        return false;
    }

    /* renamed from: b */
    private static Set<String> m96185b() {
        boolean z;
        String string = f110828n.getString("prompt_shown", "");
        Set<String> hashSet = new HashSet<>();
        if (string == null) {
            return hashSet;
        }
        if (string.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return hashSet;
        }
        Object a = C39629l.m88232a().mo58566D().mo34884a(string, Set.class);
        if (a != null) {
            return C52731z.m112269e(a);
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
    }

    /* JADX INFO: used method not loaded: d.a.j.b(java.lang.Object[], java.lang.Object):null, types can be incorrect */
    static {
        String[] strArr = {"status_background", "sticker_donation", "sticker_lyric_music", "music", "text", "sticker", "effect", "voice"};
        f110826l = strArr;
        f110815a = C52568f.m112079b((Object[]) strArr, (Object) "status_background");
    }

    /* renamed from: a */
    public static final boolean m96183a() {
        if (!C39629l.m88232a().mo58583n().mo83103a(C40790a.EnableDonationSticker) || m96184a("sticker_donation")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m96182a(boolean z) {
        f110829o = z;
    }

    /* renamed from: a */
    public static final boolean m96184a(String str) {
        C52711k.m112240b(str, "tag");
        return m96185b().contains(str);
    }

    /* renamed from: a */
    private static void m96181a(Set<String> set) {
        C52711k.m112240b(set, "tagSet");
        if (!set.isEmpty()) {
            Set linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(m96185b());
            linkedHashSet.addAll(set);
            f110828n.edit().putString("prompt_shown", C39629l.m88232a().mo58566D().mo34889b(linkedHashSet)).commit();
        }
    }

    /* renamed from: a */
    public static final void m96179a(String str, int i) {
        C52711k.m112240b(str, "tag");
        f110827m.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static final void m96180a(String str, boolean z) {
        C52711k.m112240b(str, "tag");
        if (C39629l.m88232a().mo58583n().mo83103a(C40790a.EditPagePrompt)) {
            Set b = m96185b();
            if (b.add(str)) {
                m96181a(b);
            }
        }
    }

    /* renamed from: a */
    public static final void m96178a(C43764a aVar, Set<String> set) {
        C52711k.m112240b(aVar, "listener");
        HashSet hashSet = new HashSet();
        SharedPreferences a = C35807d.m80935a(C39629l.m88233b(), "ai_music", 0);
        if (a.getBoolean("ai_music_guide_show", false) || f110828n.getBoolean("show_combine_shoot_mode_tip", false)) {
            hashSet.add("music");
            hashSet.add("effect");
            hashSet.add("sticker");
            hashSet.add("voice");
            hashSet.add("status_background");
            hashSet.add("text");
        }
        Editor edit = a.edit();
        C52711k.m112236a((Object) edit, "preferences.edit()");
        edit.remove("ai_music_guide_show").apply();
        Editor edit2 = f110828n.edit();
        C52711k.m112236a((Object) edit2, "sPreferences.edit()");
        edit2.remove("show_combine_shoot_mode_tip").apply();
        m96181a((Set<String>) hashSet);
        if (f110829o) {
            f110829o = false;
            boolean z = true;
            f110828n.edit().putBoolean("lyric_first_click_use", true).apply();
            Set b = m96185b();
            if (!b.isEmpty()) {
                C46768a.m101572a(f110827m, b, set);
            }
            int i = Integer.MAX_VALUE;
            String str = "";
            for (String str2 : f110827m.keySet()) {
                Object obj = f110827m.get(str2);
                if (obj == null) {
                    C52711k.m112234a();
                }
                Integer num = (Integer) obj;
                if (num == null || num.intValue() != -1) {
                    Object obj2 = f110827m.get(str2);
                    if (obj2 == null) {
                        C52711k.m112234a();
                    }
                    if (C52711k.m112230a(((Number) obj2).intValue(), i) < 0) {
                        Object obj3 = f110827m.get(str2);
                        if (obj3 == null) {
                            C52711k.m112234a();
                        }
                        i = ((Number) obj3).intValue();
                        C52711k.m112236a((Object) str2, "key");
                        str = str2;
                    }
                }
            }
            if (str.length() <= 0) {
                z = false;
            }
            if (z) {
                switch (str.hashCode()) {
                    case -1890252483:
                        if (str.equals("sticker")) {
                            aVar.mo89274c();
                            return;
                        }
                        break;
                    case -1306084975:
                        if (str.equals("effect")) {
                            aVar.mo89272a();
                            return;
                        }
                        break;
                    case 3556653:
                        if (str.equals("text")) {
                            aVar.mo89278g();
                            break;
                        }
                        break;
                    case 104263205:
                        if (str.equals("music")) {
                            aVar.mo89273b();
                            return;
                        }
                        break;
                    case 112386354:
                        if (str.equals("voice")) {
                            aVar.mo89275d();
                            return;
                        }
                        break;
                    case 516565022:
                        if (str.equals("auto_enhance")) {
                            aVar.mo89276e();
                            return;
                        }
                        break;
                    case 1060097947:
                        if (str.equals("status_background")) {
                            aVar.mo89277f();
                            return;
                        }
                        break;
                }
            }
        }
    }
}
