package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1817d;

import android.text.TextUtils;
import com.bytedance.common.utility.p524d.C9396a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo.C33655i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SharePoiContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35186ab;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35208au;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35237bj.C35241a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.d.v */
public final class C33440v extends C33410c {

    /* renamed from: a */
    private static C35208au<C33440v> f86676a = new C35208au<C33440v>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo70757a() {
            return new C33440v();
        }
    };

    private C33440v() {
    }

    /* renamed from: a */
    public static C33440v m76638a() {
        return (C33440v) f86676a.mo73326b();
    }

    /* renamed from: b */
    public final void mo70849b(C11207p pVar) {
        String a = C33433q.m76551a(pVar);
        if (pVar.getMsgType() == 2) {
            C33446z zVar = (C33446z) this.f86617b.get(a);
            if (zVar != null) {
                zVar.mo70851a((C33445y) null);
            }
            return;
        }
        if (pVar.getMsgType() == 27) {
            C33418h hVar = (C33418h) this.f86617b.get(a);
            if (hVar != null) {
                hVar.f86637c = null;
            }
        }
    }

    /* renamed from: a */
    public static String m76639a(BaseContent baseContent) {
        String picturePath;
        String str = null;
        if (baseContent == null) {
            return null;
        }
        if (baseContent instanceof SharePoiContent) {
            UrlModel mapUrl = ((SharePoiContent) baseContent).getMapUrl();
            if (mapUrl != null && !TextUtils.isEmpty(mapUrl.getUri()) && mapUrl.getUri().startsWith("file://")) {
                picturePath = mapUrl.getUri().substring(7);
            }
            return str;
        } else if (baseContent instanceof OnlyPictureContent) {
            OnlyPictureContent onlyPictureContent = (OnlyPictureContent) baseContent;
            UrlModel url = onlyPictureContent.getUrl();
            if (url == null || (url.getUri() != null && url.getUri().startsWith("file://"))) {
                if (onlyPictureContent.isSendRaw() || !TextUtils.isEmpty(onlyPictureContent.getCompressPath())) {
                    picturePath = onlyPictureContent.getPicturePath();
                } else {
                    picturePath = onlyPictureContent.getCompressPath();
                }
            }
            return str;
        } else {
            if (baseContent instanceof StoryPictureContent) {
                StoryPictureContent storyPictureContent = (StoryPictureContent) baseContent;
                if (storyPictureContent.getUrl() == null) {
                    if (storyPictureContent.isSendRaw() || TextUtils.isEmpty(storyPictureContent.getCompressPath())) {
                        picturePath = storyPictureContent.getPicturePath();
                    } else {
                        picturePath = storyPictureContent.getCompressPath();
                    }
                }
            }
            return str;
        }
        str = picturePath;
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C33393ac mo70778a(C11207p pVar, BaseContent baseContent) {
        if (baseContent instanceof OnlyPictureContent) {
            return new C33433q(this.f86621f, this.f86620e, (OnlyPictureContent) baseContent, pVar);
        }
        if (baseContent instanceof StoryPictureContent) {
            return new C33418h(this.f86620e, (StoryPictureContent) baseContent, pVar);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo70845a(C11207p pVar, C33445y yVar) {
        String a = C33433q.m76551a(pVar);
        if (pVar.getMsgType() == 2) {
            C33446z zVar = (C33446z) this.f86617b.get(a);
            if (zVar != null) {
                zVar.mo70851a(yVar);
            }
            return;
        }
        if (pVar.getMsgType() == 27) {
            C33418h hVar = (C33418h) this.f86617b.get(a);
            if (hVar != null) {
                hVar.f86637c = yVar;
            }
        }
    }

    /* renamed from: a */
    public final void mo70846a(String str, C33445y yVar) {
        C33446z zVar = new C33446z(this.f86621f);
        zVar.f86684c = str;
        zVar.mo70851a(yVar);
        mo70817a((C33393ac) zVar);
    }

    /* renamed from: a */
    public final void mo70848a(String str, List<C33655i> list) {
        System.currentTimeMillis();
        if (list != null && list.size() != 0) {
            C0013i.m16a((Callable<TResult>) new C33443w<TResult>(this, str, list)).mo20a(C33444x.f86681a, C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final String mo70844a(String str, List<C33655i> list, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = false;
        for (C33655i iVar : list) {
            String str2 = "";
            if (!z) {
                str2 = C35186ab.m79431a(iVar.getPath());
                int a = C35186ab.m79427a(iVar.getPath(), str2);
                if (a != 2) {
                    if (a == 1) {
                        str2 = "";
                    }
                }
                z2 = true;
            }
            String path = iVar.getPath();
            if (!TextUtils.isEmpty(path) && C9396a.m18583b(path)) {
                String c = C35186ab.m79435c(path);
                if (!TextUtils.isEmpty(c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C11010c.m22280a().getFilesDir().getPath());
                    sb.append("/check/");
                    sb.append(c);
                    sb.append(".jpg");
                    path = sb.toString();
                }
            }
            int a2 = C35186ab.m79428a(iVar.getPath(), path, 240, 240);
            if (a2 != 2) {
                if (a2 == 1) {
                    path = "";
                }
                StoryPictureContent obtain = StoryPictureContent.obtain(iVar);
                obtain.setSendRaw(z);
                obtain.setCompressPath(str2);
                obtain.setSendStartTime(Long.valueOf(currentTimeMillis));
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(path)) {
                    arrayList.add(path);
                }
                obtain.setCheckPics(arrayList);
                C35237bj.m79649a().mo73343a(Collections.singletonList(str), Collections.singletonList(obtain), (C35241a) new C35241a() {
                    public final void onSendFailure(C11202k kVar) {
                    }

                    public final void onSendSuccess(C11207p pVar) {
                    }

                    public final void onSend(C11180b bVar, List<C11207p> list) {
                        for (C11207p pVar : list) {
                            if (pVar.getMsgType() == 27) {
                                C33440v.this.mo70816a(pVar);
                            }
                        }
                    }
                }, StoryPictureContent.obtainAttachmentList(obtain));
            }
            z2 = true;
        }
        if (!z2) {
            return null;
        }
        if (list.size() > 1) {
            return C11010c.m22280a().getString(R.string.bg1);
        }
        return C11010c.m22280a().getString(R.string.bg0);
    }

    /* renamed from: a */
    public final void mo70847a(String str, BaseContent baseContent, C33445y yVar) {
        if ((baseContent instanceof SharePoiContent) || (baseContent instanceof OnlyPictureContent)) {
            C33446z zVar = new C33446z(this.f86621f);
            zVar.f86684c = str;
            zVar.mo70851a(yVar);
            mo70817a((C33393ac) zVar);
            return;
        }
        if (baseContent instanceof StoryPictureContent) {
            C33418h hVar = new C33418h(this.f86620e, (StoryPictureContent) baseContent, null);
            hVar.f86637c = yVar;
            mo70817a((C33393ac) hVar);
        }
    }
}
