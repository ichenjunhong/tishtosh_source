package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.C14277aa;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent.C14643a;
import com.facebook.share.model.ShareMessengerMediaTemplateContent.C14646a;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareMessengerURLActionButton.C14649a;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.e */
public final class C14594e {

    /* renamed from: a */
    public static final Pattern f37893a = Pattern.compile("^(.+)\\.(facebook\\.com)$");

    /* renamed from: com.facebook.share.internal.e$1 */
    static /* synthetic */ class C145951 {

        /* renamed from: b */
        static final /* synthetic */ int[] f37895b = new int[C14643a.values().length];

        /* renamed from: c */
        static final /* synthetic */ int[] f37896c = new int[C14646a.values().length];

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003a */
        static {
            /*
                com.facebook.share.model.ShareMessengerMediaTemplateContent$a[] r0 = com.facebook.share.model.ShareMessengerMediaTemplateContent.C14646a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37896c = r0
                r0 = 1
                int[] r1 = f37896c     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.share.model.ShareMessengerMediaTemplateContent$a r2 = com.facebook.share.model.ShareMessengerMediaTemplateContent.C14646a.VIDEO     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                com.facebook.share.model.ShareMessengerGenericTemplateContent$a[] r1 = com.facebook.share.model.ShareMessengerGenericTemplateContent.C14643a.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f37895b = r1
                int[] r1 = f37895b     // Catch:{ NoSuchFieldError -> 0x0027 }
                com.facebook.share.model.ShareMessengerGenericTemplateContent$a r2 = com.facebook.share.model.ShareMessengerGenericTemplateContent.C14643a.SQUARE     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                com.facebook.share.model.ShareMessengerURLActionButton$a[] r1 = com.facebook.share.model.ShareMessengerURLActionButton.C14649a.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f37894a = r1
                int[] r1 = f37894a     // Catch:{ NoSuchFieldError -> 0x003a }
                com.facebook.share.model.ShareMessengerURLActionButton$a r2 = com.facebook.share.model.ShareMessengerURLActionButton.C14649a.WebviewHeightRatioCompact     // Catch:{ NoSuchFieldError -> 0x003a }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003a }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x003a }
            L_0x003a:
                int[] r0 = f37894a     // Catch:{ NoSuchFieldError -> 0x0045 }
                com.facebook.share.model.ShareMessengerURLActionButton$a r1 = com.facebook.share.model.ShareMessengerURLActionButton.C14649a.WebviewHeightRatioTall     // Catch:{ NoSuchFieldError -> 0x0045 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0045 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C14594e.C145951.<clinit>():void");
        }
    }

    /* renamed from: a */
    static JSONObject m29865a(ShareMessengerActionButton shareMessengerActionButton) throws JSONException {
        return m29866a(shareMessengerActionButton, false);
    }

    /* renamed from: a */
    private static String m29864a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.f37993e) {
            return "hide";
        }
        return null;
    }

    /* renamed from: a */
    static String m29862a(C14646a aVar) {
        if (aVar == null) {
            return "image";
        }
        if (C145951.f37896c[aVar.ordinal()] != 1) {
            return "image";
        }
        return "video";
    }

    /* renamed from: a */
    private static String m29863a(C14649a aVar) {
        if (aVar == null) {
            return "full";
        }
        switch (aVar) {
            case WebviewHeightRatioCompact:
                return "compact";
            case WebviewHeightRatioTall:
                return "tall";
            default:
                return "full";
        }
    }

    /* renamed from: a */
    static JSONObject m29866a(ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
            return m29867a((ShareMessengerURLActionButton) shareMessengerActionButton, z);
        }
        return null;
    }

    /* renamed from: a */
    private static JSONObject m29867a(ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) throws JSONException {
        String str;
        JSONObject put = new JSONObject().put("type", "web_url");
        String str2 = "title";
        if (z) {
            str = null;
        } else {
            str = shareMessengerURLActionButton.f37973a;
        }
        return put.put(str2, str).put("url", C14277aa.m29251a(shareMessengerURLActionButton.f37990b)).put("webview_height_ratio", m29863a(shareMessengerURLActionButton.f37994f)).put("messenger_extensions", shareMessengerURLActionButton.f37992d).put("fallback_url", C14277aa.m29251a(shareMessengerURLActionButton.f37991c)).put("webview_share_button", m29864a(shareMessengerURLActionButton));
    }

    /* renamed from: a */
    static void m29868a(Bundle bundle, ShareMessengerActionButton shareMessengerActionButton, boolean z) throws JSONException {
        if (shareMessengerActionButton != null && (shareMessengerActionButton instanceof ShareMessengerURLActionButton)) {
            m29869a(bundle, (ShareMessengerURLActionButton) shareMessengerActionButton, z);
        }
    }

    /* renamed from: a */
    private static void m29869a(Bundle bundle, ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) throws JSONException {
        String str;
        if (z) {
            str = C14277aa.m29251a(shareMessengerURLActionButton.f37990b);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(shareMessengerURLActionButton.f37973a);
            sb.append(" - ");
            sb.append(C14277aa.m29251a(shareMessengerURLActionButton.f37990b));
            str = sb.toString();
        }
        C14277aa.m29265a(bundle, "TARGET_DISPLAY", str);
        C14277aa.m29264a(bundle, "ITEM_URL", shareMessengerURLActionButton.f37990b);
    }
}
