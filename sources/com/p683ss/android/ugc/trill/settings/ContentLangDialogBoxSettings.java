package com.p683ss.android.ugc.trill.settings;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

@SettingsKey
/* renamed from: com.ss.android.ugc.trill.settings.ContentLangDialogBoxSettings */
public final class ContentLangDialogBoxSettings {
    public static final ContentLangDialogBoxSettings INSTANCE = new ContentLangDialogBoxSettings();
    @C10179b
    private static ContentLangDialogContent contentLangDialog;

    private ContentLangDialogBoxSettings() {
    }

    public final ContentLangDialogContent getContentLangDialog() {
        return contentLangDialog;
    }

    public static final ContentLangDialogContent getContentLangDialogContent() {
        ContentLangDialogContent contentLangDialogContent;
        try {
            contentLangDialogContent = (ContentLangDialogContent) C10193n.m20607a().mo18202a(ContentLangDialogBoxSettings.class, "content_lang_dialog", C10181b.m20511a().mo18175c().getContentLangDialog(), "com.ss.android.ugc.trill.settings.ContentLangDialogContent", ContentLangDialogContent.class);
        } catch (Throwable unused) {
            contentLangDialogContent = null;
        }
        if (contentLangDialogContent != null) {
            return contentLangDialogContent;
        }
        String string = C11010c.m22280a().getString(R.string.ai8);
        C52711k.m112236a((Object) string, "AppContextManager.getApp…ent_language_guide_title)");
        String string2 = C11010c.m22280a().getString(R.string.ai6);
        C52711k.m112236a((Object) string2, "AppContextManager.getApp…tent_language_guide_desc)");
        return new ContentLangDialogContent(string, string2);
    }

    public final void setContentLangDialog(ContentLangDialogContent contentLangDialogContent) {
        contentLangDialog = contentLangDialogContent;
    }
}
