package com.p683ss.android.ugc.gamora.editor.sticker.donation;

import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.I18nManagerService;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a */
public final class C49464a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f124114a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49464a.class), "language", "getLanguage()Ljava/lang/String;"))};

    /* renamed from: b */
    public static final C49464a f124115b = new C49464a();

    /* renamed from: c */
    private static final C52668f f124116c = C52732g.m112285a(C49465a.f124117a);

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a$a */
    static final class C49465a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        public static final C49465a f124117a = new C49465a();

        C49465a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            I18nManagerService createI18nManagerServicebyMonsterPlugin = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin();
            C52711k.m112236a((Object) createI18nManagerServicebyMonsterPlugin, "ServiceManager.get().get…nagerService::class.java)");
            String appLanguage = createI18nManagerServicebyMonsterPlugin.getAppLanguage();
            if (appLanguage == null) {
                return "";
            }
            return appLanguage;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a$b */
    static final class C49466b extends C52712l implements C52671b<JSONObject, C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f124118a;

        /* renamed from: b */
        final /* synthetic */ String f124119b;

        /* renamed from: c */
        final /* synthetic */ String f124120c;

        /* renamed from: d */
        final /* synthetic */ String f124121d;

        /* renamed from: e */
        final /* synthetic */ String f124122e;

        C49466b(String str, String str2, String str3, String str4, String str5) {
            this.f124118a = str;
            this.f124119b = str2;
            this.f124120c = str3;
            this.f124121d = str4;
            this.f124122e = str5;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C52711k.m112240b(jSONObject, "$receiver");
            jSONObject.put("enter_from", "video_edit_page");
            jSONObject.put("shoot_way", this.f124118a);
            jSONObject.put("creation_id", this.f124119b);
            jSONObject.put("ngo_name", this.f124120c);
            jSONObject.put("language", C49464a.f124115b.mo97350a());
            jSONObject.put("content_source", this.f124121d);
            jSONObject.put("content_type", this.f124122e);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a$c */
    public static final class C49467c extends C52712l implements C52671b<JSONObject, C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f124123a;

        /* renamed from: b */
        final /* synthetic */ String f124124b;

        /* renamed from: c */
        final /* synthetic */ String f124125c;

        public C49467c(String str, String str2, String str3) {
            this.f124123a = str;
            this.f124124b = str2;
            this.f124125c = str3;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C52711k.m112240b(jSONObject, "$receiver");
            jSONObject.put("enter_from", "video_edit_page");
            jSONObject.put("shoot_way", this.f124123a);
            jSONObject.put("creation_id", this.f124124b);
            jSONObject.put("ngo_name", this.f124125c);
            jSONObject.put("language", C49464a.f124115b.mo97350a());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a$d */
    public static final class C49468d extends C52712l implements C52671b<JSONObject, C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f124126a;

        /* renamed from: b */
        final /* synthetic */ String f124127b;

        /* renamed from: c */
        final /* synthetic */ String f124128c;

        /* renamed from: d */
        final /* synthetic */ String f124129d;

        /* renamed from: e */
        final /* synthetic */ String f124130e;

        /* renamed from: f */
        final /* synthetic */ int f124131f;

        public C49468d(String str, String str2, String str3, String str4, String str5, int i) {
            this.f124126a = str;
            this.f124127b = str2;
            this.f124128c = str3;
            this.f124129d = str4;
            this.f124130e = str5;
            this.f124131f = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C52711k.m112240b(jSONObject, "$receiver");
            jSONObject.put("enter_from", "video_edit_page");
            jSONObject.put("shoot_way", this.f124126a);
            jSONObject.put("creation_id", this.f124127b);
            jSONObject.put("ngo_name", this.f124128c);
            jSONObject.put("language", C49464a.f124115b.mo97350a());
            jSONObject.put("content_source", this.f124129d);
            jSONObject.put("content_type", this.f124130e);
            jSONObject.put("impr_position", this.f124131f);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a$e */
    public static final class C49469e extends C52712l implements C52671b<JSONObject, C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f124132a;

        /* renamed from: b */
        final /* synthetic */ String f124133b;

        /* renamed from: c */
        final /* synthetic */ String f124134c;

        /* renamed from: d */
        final /* synthetic */ int f124135d;

        public C49469e(String str, String str2, String str3, int i) {
            this.f124132a = str;
            this.f124133b = str2;
            this.f124134c = str3;
            this.f124135d = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C52711k.m112240b(jSONObject, "$receiver");
            jSONObject.put("enter_from", "video_edit_page");
            jSONObject.put("shoot_way", this.f124132a);
            jSONObject.put("creation_id", this.f124133b);
            jSONObject.put("ngo_name", this.f124134c);
            jSONObject.put("language", C49464a.f124115b.mo97350a());
            jSONObject.put("impr_position", this.f124135d);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.a$f */
    static final class C49470f extends C52712l implements C52671b<JSONObject, C52860x> {

        /* renamed from: a */
        final /* synthetic */ String f124136a;

        /* renamed from: b */
        final /* synthetic */ String f124137b;

        C49470f(String str, String str2) {
            this.f124136a = str;
            this.f124137b = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            C52711k.m112240b(jSONObject, "$receiver");
            jSONObject.put("enter_from", "video_edit_page");
            jSONObject.put("shoot_way", this.f124136a);
            jSONObject.put("creation_id", this.f124137b);
            return C52860x.f131107a;
        }
    }

    private C49464a() {
    }

    /* renamed from: a */
    public final String mo97350a() {
        return (String) f124116c.getValue();
    }

    /* renamed from: a */
    public static void m106725a(JSONObject jSONObject, C52671b<? super JSONObject, C52860x> bVar) {
        try {
            bVar.invoke(jSONObject);
        } catch (JSONException unused) {
        }
    }
}
