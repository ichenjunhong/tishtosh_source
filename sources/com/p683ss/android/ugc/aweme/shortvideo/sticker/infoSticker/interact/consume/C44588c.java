package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.google.gson.C17971f;
import com.google.gson.C18091u;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.p683ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c */
public final class C44588c {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c$a */
    public static final class C44589a extends C17956a<List<? extends NormalTrackTimeStamp>> {
        C44589a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c$b */
    public static final class C44590b extends C17956a<List<? extends NormalTrackTimeStamp>> {
        C44590b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c$c */
    public static final class C44591c extends C17956a<List<? extends NormalTrackTimeStamp>> {
        C44591c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c$d */
    public static final class C44592d extends C17956a<List<? extends NormalTrackTimeStamp>> {
        C44592d() {
        }
    }

    /* renamed from: a */
    public static final boolean m97541a(Context context) {
        C52711k.m112240b(context, "context");
        return C35807d.m80935a(context, "test_data", 0).getBoolean("sp_interact_stickers_test", false);
    }

    /* renamed from: c */
    public static final Aweme m97545c(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getAwemeType() == 13) {
            aweme = aweme.getForwardItem();
        }
        return aweme;
    }

    /* renamed from: a */
    public static final String m97537a(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAwemeType() != 13 || aweme.getForwardItem() == null) {
            return aweme.getAid();
        }
        Aweme forwardItem = aweme.getForwardItem();
        C52711k.m112236a((Object) forwardItem, "aweme.forwardItem");
        return forwardItem.getAid();
    }

    /* renamed from: b */
    public static final User m97542b(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getAwemeType() != 13 || aweme.getForwardItem() == null) {
            return aweme.getAuthor();
        }
        Aweme forwardItem = aweme.getForwardItem();
        C52711k.m112236a((Object) forwardItem, "aweme.forwardItem");
        return forwardItem.getAuthor();
    }

    /* renamed from: c */
    public static final StickerAttrStruct m97546c(InteractStickerStruct interactStickerStruct) {
        StickerAttrStruct stickerAttrStruct;
        if (interactStickerStruct == null) {
            return null;
        }
        try {
            stickerAttrStruct = (StickerAttrStruct) C47759cc.m103382a().getGson().mo34884a(interactStickerStruct.getAttr(), StickerAttrStruct.class);
        } catch (C18091u unused) {
            stickerAttrStruct = null;
        }
        return stickerAttrStruct;
    }

    /* renamed from: a */
    public static final String m97538a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = null;
        }
        if (TextUtils.equals(str2, C23060d.f61427a)) {
            return "web_url";
        }
        return C23060d.f61428b;
    }

    /* renamed from: b */
    public static final NormalTrackTimeStamp m97543b(InteractStickerStruct interactStickerStruct) {
        List list;
        String str;
        if (interactStickerStruct != null && !interactStickerStruct.isPoiSticker()) {
            return null;
        }
        try {
            C17971f gson = C47759cc.m103382a().getGson();
            if (interactStickerStruct != null) {
                str = interactStickerStruct.getTrackList();
            } else {
                str = null;
            }
            list = (List) gson.mo34885a(str, new C44590b().f49843c);
        } catch (C18091u unused) {
            list = null;
        }
        if (C9376b.m18558a((Collection<T>) list)) {
            return null;
        }
        if (list == null) {
            C52711k.m112234a();
        }
        NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) list.get(0);
        if (!normalTrackTimeStamp.isFullTrack()) {
            return null;
        }
        return normalTrackTimeStamp;
    }

    /* renamed from: a */
    public static final List<NormalTrackTimeStamp> m97540a(InteractStickerStruct interactStickerStruct) {
        List<NormalTrackTimeStamp> list;
        String str;
        try {
            C17971f gson = C47759cc.m103382a().getGson();
            if (interactStickerStruct != null) {
                str = interactStickerStruct.getTrackList();
            } else {
                str = null;
            }
            list = (List) gson.mo34885a(str, new C44591c().f49843c);
        } catch (C18091u e) {
            StringBuilder sb = new StringBuilder("InteractStickerUtils.kt : e ");
            sb.append(e);
            C47625i.m103103a(sb.toString());
            list = null;
        }
        if (C9376b.m18558a((Collection<T>) list)) {
            return null;
        }
        return list;
    }

    /* renamed from: a */
    public static final List<NormalTrackTimeStamp> m97539a(long j, InteractStickerStruct interactStickerStruct) {
        Iterable iterable;
        long j2;
        boolean z;
        String str;
        try {
            C17971f gson = C47759cc.m103382a().getGson();
            if (interactStickerStruct != null) {
                str = interactStickerStruct.getTrackList();
            } else {
                str = null;
            }
            iterable = (List) gson.mo34885a(str, new C44589a().f49843c);
        } catch (C18091u e) {
            StringBuilder sb = new StringBuilder("InteractStickerUtils.kt : e ");
            sb.append(e);
            C47625i.m103103a(sb.toString());
            iterable = null;
        }
        if (iterable == null) {
            return null;
        }
        Iterable iterable2 = iterable;
        Collection arrayList = new ArrayList();
        for (Object next : iterable2) {
            NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) next;
            if (normalTrackTimeStamp != null) {
                j2 = (long) normalTrackTimeStamp.getPts();
            } else {
                j2 = 0;
            }
            long j3 = j - j2;
            if (-160 <= j3 && 160 >= j3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        if (r2.getEndTime() >= r5) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp> m97544b(long r7, com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct r9) {
        /*
            java.lang.String r0 = "interactStickerStruct"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            r0 = 0
            com.ss.android.ugc.aweme.utils.GsonProvider r1 = com.p683ss.android.ugc.aweme.utils.C47759cc.m103382a()     // Catch:{ Exception -> 0x0025 }
            java.lang.String r2 = "GsonProvider.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)     // Catch:{ Exception -> 0x0025 }
            com.google.gson.f r1 = r1.getGson()     // Catch:{ Exception -> 0x0025 }
            java.lang.String r9 = r9.getTrackList()     // Catch:{ Exception -> 0x0025 }
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c$d r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c$d     // Catch:{ Exception -> 0x0025 }
            r2.<init>()     // Catch:{ Exception -> 0x0025 }
            java.lang.reflect.Type r2 = r2.f49843c     // Catch:{ Exception -> 0x0025 }
            java.lang.Object r9 = r1.mo34885a(r9, r2)     // Catch:{ Exception -> 0x0025 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ Exception -> 0x0025 }
            goto L_0x0038
        L_0x0025:
            r9 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "InteractStickerUtils.kt : e "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.p683ss.android.ugc.aweme.util.C47625i.m103103a(r9)
            r9 = r0
        L_0x0038:
            if (r9 == 0) goto L_0x0080
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r9 = r9.iterator()
        L_0x0047:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x007e
            java.lang.Object r1 = r9.next()
            r2 = r1
            com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp r2 = (com.p683ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp) r2
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x005a
        L_0x0058:
            r3 = 0
            goto L_0x0078
        L_0x005a:
            boolean r5 = r2.isWholeDuration()
            if (r5 == 0) goto L_0x0061
            goto L_0x0078
        L_0x0061:
            boolean r5 = r2.timeIsValid()
            if (r5 == 0) goto L_0x0058
            float r5 = (float) r7
            float r6 = r2.getStartTime()
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0058
            float r2 = r2.getEndTime()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0058
        L_0x0078:
            if (r3 == 0) goto L_0x0047
            r0.add(r1)
            goto L_0x0047
        L_0x007e:
            java.util.List r0 = (java.util.List) r0
        L_0x0080:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c.m97544b(long, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct):java.util.List");
    }
}
