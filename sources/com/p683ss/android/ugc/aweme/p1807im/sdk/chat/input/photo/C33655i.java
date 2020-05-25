package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

import com.p683ss.android.p1099a.C18489a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.i */
public final class C33655i implements Serializable {

    /* renamed from: a */
    private String f87274a;

    /* renamed from: b */
    private String f87275b;

    /* renamed from: c */
    private int f87276c;

    /* renamed from: d */
    private int f87277d;

    /* renamed from: e */
    private int f87278e = 1;

    /* renamed from: f */
    private List<String> f87279f;

    public final List<String> getCheckTexts() {
        return this.f87279f;
    }

    public final int getFromGallery() {
        return this.f87278e;
    }

    public final int getHeight() {
        return this.f87276c;
    }

    public final String getMime() {
        return this.f87275b;
    }

    public final String getPath() {
        return this.f87274a;
    }

    public final int getWith() {
        return this.f87277d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoParam{path='");
        sb.append(this.f87274a);
        sb.append('\'');
        sb.append(", mime='");
        sb.append(this.f87275b);
        sb.append('\'');
        sb.append(", with=");
        sb.append(this.f87277d);
        sb.append(", height=");
        sb.append(this.f87276c);
        sb.append(", fromGallery=");
        sb.append(this.f87278e);
        sb.append(", checkTexts=");
        sb.append(this.f87279f);
        sb.append('}');
        return sb.toString();
    }

    public final void setCheckTexts(List<String> list) {
        this.f87279f = list;
    }

    public final void setFromGallery(int i) {
        this.f87278e = i;
    }

    public final void setHeight(int i) {
        this.f87276c = i;
    }

    public final void setMime(String str) {
        this.f87275b = str;
    }

    public final void setPath(String str) {
        this.f87274a = str;
    }

    public final void setWith(int i) {
        this.f87277d = i;
    }

    public static C33655i fromContent(OnlyPictureContent onlyPictureContent) {
        C33655i iVar = new C33655i();
        iVar.f87274a = onlyPictureContent.getPicturePath();
        iVar.f87275b = onlyPictureContent.getMime();
        iVar.f87277d = onlyPictureContent.getWidth();
        iVar.f87276c = onlyPictureContent.getHeight();
        return iVar;
    }

    public static C33655i fromMediaModel(C18489a aVar) {
        if (aVar == null) {
            return null;
        }
        C33655i iVar = new C33655i();
        iVar.f87274a = aVar.f50916b;
        iVar.f87275b = aVar.f50918d;
        iVar.f87277d = aVar.f50919e;
        iVar.f87276c = aVar.f50920f;
        return iVar;
    }

    public static C33655i fromMediaModel(C34409a aVar) {
        if (aVar == null) {
            return null;
        }
        C33655i iVar = new C33655i();
        iVar.f87274a = aVar.getFilePath();
        iVar.f87275b = aVar.getMimeType();
        iVar.f87277d = aVar.getWidth();
        iVar.f87276c = aVar.getHeight();
        return iVar;
    }

    public static ArrayList<C33655i> fromPhotoItems(List<C33654h> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<C33655i> arrayList = new ArrayList<>();
        for (C33654h hVar : list) {
            if (hVar != null) {
                arrayList.add(fromMediaModel(hVar.f87272a));
            }
        }
        return arrayList;
    }
}
