package com.p683ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.p1733a.C30532b;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42091h;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42150c;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42150c.C42151a;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.C42320g;
import com.p683ss.android.ugc.aweme.sharer.C42322h;
import com.p683ss.android.ugc.aweme.sharer.C42324j;
import com.p683ss.android.ugc.aweme.sharer.C42325k;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42259c;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42265f;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42271i;
import com.p683ss.android.ugc.aweme.sharer.p2171a.C42295u;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage.C42326a;
import com.p683ss.android.ugc.aweme.utils.C47722bj;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.Arrays;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage */
public final class AwemeSharePackage extends SharePackage {

    /* renamed from: b */
    public static final C42171a f106655b = new C42171a(null);

    /* renamed from: a */
    public Aweme f106656a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$a */
    public static final class C42171a {
        private C42171a() {
        }

        public /* synthetic */ C42171a(C52707g gVar) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x027e  */
        /* JADX WARNING: Removed duplicated region for block: B:102:0x0281  */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x0290  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x02d9  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x0323  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x0329  */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x0371  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x03ca  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0112  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x013b  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x015e  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0163  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0166  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0173  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0178  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0188  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x018d  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0190  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x019b  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01e9  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x020e  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0216  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0235  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x023a  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0248  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x024d  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0250  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x025d  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x0262  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x0279  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p683ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage m92542a(com.p683ss.android.ugc.aweme.feed.model.Aweme r17, android.content.Context r18, int r19, java.lang.String r20, java.lang.String r21) {
            /*
                r0 = r17
                r1 = r18
                r2 = r19
                r3 = r20
                java.lang.String r4 = "aweme"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r4)
                java.lang.String r4 = "activity"
                p2628d.p2639f.p2641b.C52711k.m112240b(r1, r4)
                java.lang.String r4 = "enterFrom"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r4)
                java.lang.String r4 = "enterMethod"
                r5 = r21
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r4)
                com.ss.android.ugc.aweme.base.share.ShareInfo r4 = r17.getShareInfo()
                com.ss.android.ugc.aweme.base.share.ShareInfo r4 = com.p683ss.android.ugc.aweme.share.improve.p2163c.C42150c.m92520a(r4)
                r0.setShareInfo(r4)
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r4 = new com.ss.android.ugc.aweme.sharer.ui.SharePackage$a
                r4.<init>()
                java.lang.String r5 = "aweme"
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r4 = r4.mo86236a(r5)
                com.ss.android.ugc.aweme.profile.model.User r5 = r17.getAuthor()
                r6 = 0
                if (r5 == 0) goto L_0x0040
                java.lang.String r5 = r5.getUid()
                goto L_0x0041
            L_0x0040:
                r5 = r6
            L_0x0041:
                if (r5 != 0) goto L_0x0045
                java.lang.String r5 = ""
            L_0x0045:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r4 = r4.mo86239b(r5)
                java.lang.String r5 = "app_name"
                r7 = 2132541961(0x7f1c0209, float:2.0737013E38)
                java.lang.String r7 = r1.getString(r7)
                java.lang.String r8 = "activity.getString(R.string.app_name)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r4 = r4.mo86237a(r5, r7)
                com.ss.android.ugc.aweme.base.share.ShareInfo r5 = r17.getShareInfo()
                java.lang.String r7 = "aweme.shareInfo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                java.lang.String r5 = r5.getShareTitle()
                if (r5 != 0) goto L_0x006c
                java.lang.String r5 = ""
            L_0x006c:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r4 = r4.mo86240c(r5)
                com.ss.android.ugc.aweme.base.share.ShareInfo r5 = r17.getShareInfo()
                java.lang.String r7 = "aweme.shareInfo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                java.lang.String r5 = r5.getShareDesc()
                if (r5 != 0) goto L_0x0081
                java.lang.String r5 = ""
            L_0x0081:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r4 = r4.mo86241d(r5)
                com.ss.android.ugc.aweme.base.share.ShareInfo r5 = r17.getShareInfo()
                java.lang.String r7 = "aweme.shareInfo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                java.lang.String r5 = r5.getShareUrl()
                if (r5 != 0) goto L_0x0098
                java.lang.String r5 = r17.getShareUrl()
            L_0x0098:
                java.lang.String r5 = com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b.m92515b(r5)
                java.lang.String r5 = com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b.m92516c(r5)
                if (r5 != 0) goto L_0x00a4
                java.lang.String r5 = ""
            L_0x00a4:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r4 = r4.mo86242e(r5)
                com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage r5 = new com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage
                r5.<init>(r4)
                r5.mo86153a(r0)
                android.os.Bundle r4 = r5.f106900i
                java.lang.String r7 = "aid"
                java.lang.String r8 = r17.getAid()
                r4.putString(r7, r8)
                java.lang.String r7 = "bool_persist"
                com.ss.android.ugc.aweme.base.share.ShareInfo r8 = r17.getShareInfo()
                java.lang.String r9 = "aweme.shareInfo"
                p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
                int r8 = r8.getBoolPersist()
                r9 = 0
                r10 = 1
                if (r8 != r10) goto L_0x00d0
                r8 = 1
                goto L_0x00d1
            L_0x00d0:
                r8 = 0
            L_0x00d1:
                r4.putBoolean(r7, r8)
                java.lang.String r7 = "page_type"
                r4.putInt(r7, r2)
                java.lang.String r2 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56847a(r0, r2)
                java.lang.String r7 = "log_pb"
                com.ss.android.ugc.aweme.feed.aa r8 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
                java.lang.String r2 = r8.mo60161a(r2)
                r4.putString(r7, r2)
                java.lang.String r2 = "enter_from"
                r4.putString(r2, r3)
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                if (r2 == 0) goto L_0x0108
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getOriginCover()
                if (r2 == 0) goto L_0x0108
                java.util.List r2 = r2.getUrlList()
                if (r2 == 0) goto L_0x0108
                java.lang.Object r2 = p2628d.p2629a.C52575l.m112140f(r2)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x0109
            L_0x0108:
                r2 = r6
            L_0x0109:
                boolean r3 = com.p683ss.android.ugc.aweme.utils.C47891fl.m103593a(r2)
                if (r3 == 0) goto L_0x0112
                java.lang.String r3 = "thumb_url"
                goto L_0x012e
            L_0x0112:
                java.lang.String r3 = "thumb_url"
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                if (r2 == 0) goto L_0x012d
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getCover()
                if (r2 == 0) goto L_0x012d
                java.util.List r2 = r2.getUrlList()
                if (r2 == 0) goto L_0x012d
                java.lang.Object r2 = p2628d.p2629a.C52575l.m112140f(r2)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x012e
            L_0x012d:
                r2 = r6
            L_0x012e:
                r4.putString(r3, r2)
                java.lang.String r2 = "video_play_list"
                java.util.ArrayList r3 = new java.util.ArrayList
                com.ss.android.ugc.aweme.feed.model.Video r7 = r17.getVideo()
                if (r7 == 0) goto L_0x014a
                com.ss.android.ugc.aweme.base.model.UrlModel r7 = r7.getDownloadAddr()
                if (r7 == 0) goto L_0x014a
                java.util.List r7 = r7.getUrlList()
                if (r7 == 0) goto L_0x014a
                java.util.Collection r7 = (java.util.Collection) r7
                goto L_0x0150
            L_0x014a:
                java.util.List r7 = p2628d.p2629a.C52575l.m112097a()
                java.util.Collection r7 = (java.util.Collection) r7
            L_0x0150:
                r3.<init>(r7)
                r4.putStringArrayList(r2, r3)
                java.lang.String r2 = "uid_for_share"
                com.ss.android.ugc.aweme.profile.model.User r3 = r17.getAuthor()
                if (r3 == 0) goto L_0x0163
                java.lang.String r3 = r3.getUid()
                goto L_0x0164
            L_0x0163:
                r3 = r6
            L_0x0164:
                if (r3 != 0) goto L_0x0168
                java.lang.String r3 = ""
            L_0x0168:
                r4.putString(r2, r3)
                java.lang.String r2 = "sec_user_id"
                com.ss.android.ugc.aweme.profile.model.User r3 = r17.getAuthor()
                if (r3 == 0) goto L_0x0178
                java.lang.String r3 = r3.getSecUid()
                goto L_0x0179
            L_0x0178:
                r3 = r6
            L_0x0179:
                if (r3 != 0) goto L_0x017d
                java.lang.String r3 = ""
            L_0x017d:
                r4.putString(r2, r3)
                java.lang.String r2 = "author_id"
                com.ss.android.ugc.aweme.profile.model.User r3 = r17.getAuthor()
                if (r3 == 0) goto L_0x018d
                java.lang.String r3 = r3.getUid()
                goto L_0x018e
            L_0x018d:
                r3 = r6
            L_0x018e:
                if (r3 != 0) goto L_0x0192
                java.lang.String r3 = ""
            L_0x0192:
                r4.putString(r2, r3)
                com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r17.getPoiStruct()
                if (r2 == 0) goto L_0x01b5
                java.lang.String r2 = "poi_id"
                com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r17.getPoiStruct()
                java.lang.String r3 = r3.poiId
                r4.putString(r2, r3)
                java.lang.String r2 = "poi_type"
                com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r17.getPoiStruct()
                int r3 = r3.iconType
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r4.putString(r2, r3)
            L_0x01b5:
                java.lang.String r2 = "city_info"
                java.lang.String r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56845a()
                r4.putString(r2, r3)
                java.lang.String r2 = "distance_info"
                java.lang.String r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56869i(r17)
                r4.putString(r2, r3)
                java.lang.String r2 = "log_pb"
                com.ss.android.ugc.aweme.feed.aa r3 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
                java.lang.String r7 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56857c(r17)
                java.lang.String r3 = r3.mo60161a(r7)
                r4.putString(r2, r3)
                java.lang.String r2 = "item_id"
                com.ss.android.ugc.aweme.feed.model.AwemeStatus r3 = r17.getStatus()
                java.lang.String r7 = "aweme.status"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)
                int r3 = r3.getPrivateStatus()
                if (r3 == r10) goto L_0x01fb
                com.ss.android.ugc.aweme.feed.model.AwemeStatus r3 = r17.getStatus()
                java.lang.String r7 = "aweme.status"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)
                boolean r3 = r3.isDelete()
                if (r3 == 0) goto L_0x01f9
                goto L_0x01fb
            L_0x01f9:
                r3 = 0
                goto L_0x01fc
            L_0x01fb:
                r3 = -1
            L_0x01fc:
                r4.putInt(r2, r3)
                com.ss.android.ugc.aweme.feed.model.AwemeStatus r2 = r17.getStatus()
                java.lang.String r3 = "status"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                boolean r3 = r2.isDelete()
                if (r3 == 0) goto L_0x0216
                java.lang.String r2 = "item_id_string"
                java.lang.String r3 = "delete"
                r4.putString(r2, r3)
                goto L_0x022d
            L_0x0216:
                int r2 = r2.getPrivateStatus()
                if (r2 != r10) goto L_0x0224
                java.lang.String r2 = "item_id_string"
                java.lang.String r3 = "private"
                r4.putString(r2, r3)
                goto L_0x022d
            L_0x0224:
                java.lang.String r2 = "item_id_string"
                java.lang.String r3 = r17.getAid()
                r4.putString(r2, r3)
            L_0x022d:
                java.lang.String r2 = "video_cover"
                com.ss.android.ugc.aweme.feed.model.Video r3 = r17.getVideo()
                if (r3 == 0) goto L_0x023a
                com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.getCover()
                goto L_0x023b
            L_0x023a:
                r3 = r6
            L_0x023b:
                java.io.Serializable r3 = (java.io.Serializable) r3
                r4.putSerializable(r2, r3)
                java.lang.String r2 = "add_utm_params"
                com.ss.android.ugc.aweme.profile.model.User r3 = r17.getAuthor()
                if (r3 == 0) goto L_0x024d
                java.lang.String r3 = r3.getNickname()
                goto L_0x024e
            L_0x024d:
                r3 = r6
            L_0x024e:
                if (r3 != 0) goto L_0x0252
                java.lang.String r3 = ""
            L_0x0252:
                r4.putString(r2, r3)
                java.lang.String r2 = "thumb_for_share"
                com.ss.android.ugc.aweme.profile.model.User r3 = r17.getAuthor()
                if (r3 == 0) goto L_0x0262
                com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.getAvatarThumb()
                goto L_0x0263
            L_0x0262:
                r3 = r6
            L_0x0263:
                java.io.Serializable r3 = (java.io.Serializable) r3
                r4.putSerializable(r2, r3)
                java.lang.String r2 = "aweme_type"
                int r3 = r17.getAwemeType()
                r4.putInt(r2, r3)
                java.lang.String r2 = "author_name"
                com.ss.android.ugc.aweme.profile.model.User r3 = r17.getAuthor()
                if (r3 == 0) goto L_0x027e
                java.lang.String r3 = r3.getNickname()
                goto L_0x027f
            L_0x027e:
                r3 = r6
            L_0x027f:
                if (r3 != 0) goto L_0x0283
                java.lang.String r3 = ""
            L_0x0283:
                r4.putString(r2, r3)
                boolean r2 = r17.isImage()
                r3 = 165(0xa5, float:2.31E-43)
                r7 = 124(0x7c, float:1.74E-43)
                if (r2 == 0) goto L_0x02d9
                java.util.List r2 = r17.getImageInfos()
                r8 = r2
                java.util.Collection r8 = (java.util.Collection) r8
                if (r8 == 0) goto L_0x02a2
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L_0x02a0
                goto L_0x02a2
            L_0x02a0:
                r8 = 0
                goto L_0x02a3
            L_0x02a2:
                r8 = 1
            L_0x02a3:
                if (r8 == 0) goto L_0x02b0
                java.lang.String r2 = "aweme_width"
                r4.putInt(r2, r7)
                java.lang.String r2 = "aweme_height"
                r4.putInt(r2, r3)
                goto L_0x0307
            L_0x02b0:
                java.lang.Object r2 = p2628d.p2629a.C52575l.m112137e(r2)
                com.ss.android.ugc.aweme.feed.model.ImageInfo r2 = (com.p683ss.android.ugc.aweme.feed.model.ImageInfo) r2
                java.lang.String r3 = "aweme_width"
                java.lang.String r7 = "info"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r7)
                int r7 = r2.getWidth()
                r4.putInt(r3, r7)
                java.lang.String r3 = "aweme_height"
                int r7 = r2.getHeight()
                r4.putInt(r3, r7)
                java.lang.String r3 = "video_cover"
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getLabelLarge()
                java.io.Serializable r2 = (java.io.Serializable) r2
                r4.putSerializable(r3, r2)
                goto L_0x0307
            L_0x02d9:
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                if (r2 != 0) goto L_0x02ea
                java.lang.String r2 = "aweme_width"
                r4.putInt(r2, r7)
                java.lang.String r2 = "aweme_height"
                r4.putInt(r2, r3)
                goto L_0x0307
            L_0x02ea:
                java.lang.String r3 = "aweme_width"
                int r7 = r2.getWidth()
                r4.putInt(r3, r7)
                java.lang.String r3 = "aweme_height"
                int r7 = r2.getHeight()
                r4.putInt(r3, r7)
                java.lang.String r3 = "video_cover"
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getOriginCover()
                java.io.Serializable r2 = (java.io.Serializable) r2
                r4.putSerializable(r3, r2)
            L_0x0307:
                java.lang.String r2 = "is_fullscreen"
                boolean r3 = com.p683ss.android.ugc.aweme.detail.C27338h.m65876a()
                r4.putBoolean(r2, r3)
                java.lang.String r2 = "request_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.mo86152a()
                java.lang.String r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56857c(r3)
                r4.putString(r2, r3)
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                if (r2 == 0) goto L_0x0327
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r6 = r2.getPlayAddr()
            L_0x0327:
                if (r6 == 0) goto L_0x036b
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                java.lang.String r3 = "aweme.video"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getPlayAddr()
                java.lang.String r3 = "aweme.video.playAddr"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                java.lang.String r2 = r2.getUri()
                java.lang.String r3 = "videoRawStr"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
                r11 = r2
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                java.lang.String[] r12 = new java.lang.String[r10]
                java.lang.String r2 = "_"
                r12[r9] = r2
                r13 = 0
                r14 = 0
                r15 = 6
                r16 = 0
                java.util.List r2 = p2628d.p2650m.C52830p.m112452b(r11, r12, r13, r14, r15, r16)
                r3 = r2
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                r3 = r3 ^ r10
                if (r3 == 0) goto L_0x036b
                java.lang.String r3 = "aweme_vid"
                java.lang.Object r2 = p2628d.p2629a.C52575l.m112137e(r2)
                java.lang.String r2 = (java.lang.String) r2
                r4.putString(r3, r2)
            L_0x036b:
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                if (r2 == 0) goto L_0x03b9
                java.lang.String r2 = "aweme_width"
                com.ss.android.ugc.aweme.feed.model.Video r3 = r17.getVideo()
                java.lang.String r6 = "aweme.video"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
                int r3 = r3.getWidth()
                r4.putInt(r2, r3)
                java.lang.String r2 = "aweme_height"
                com.ss.android.ugc.aweme.feed.model.Video r3 = r17.getVideo()
                java.lang.String r6 = "aweme.video"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
                int r3 = r3.getHeight()
                r4.putInt(r2, r3)
                java.lang.String r2 = "aweme_duration"
                com.ss.android.ugc.aweme.feed.model.Video r3 = r17.getVideo()
                java.lang.String r6 = "aweme.video"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
                int r3 = r3.getDuration()
                r4.putInt(r2, r3)
                java.lang.String r2 = "aweme_length"
                com.ss.android.ugc.aweme.feed.model.Video r3 = r17.getVideo()
                java.lang.String r6 = "aweme.video"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
                int r3 = r3.getVideoLength()
                r4.putInt(r2, r3)
            L_0x03b9:
                java.lang.String r2 = "desc"
                java.lang.String r3 = r17.getDesc()
                r4.putString(r2, r3)
                java.lang.String r2 = "is_star"
                com.ss.android.ugc.aweme.profile.model.User r0 = r17.getAuthor()
                if (r0 == 0) goto L_0x03d3
                boolean r0 = r0.isStar()
                if (r0 != r10) goto L_0x03d3
                java.lang.String r0 = "1"
                goto L_0x03d5
            L_0x03d3:
                java.lang.String r0 = "0"
            L_0x03d5:
                r4.putString(r2, r0)
                java.lang.String r0 = "is_long_item"
                com.ss.android.ugc.aweme.comment.services.a r2 = com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a.m61494a()
                int r1 = r2.getIsLongItem(r1)
                r4.putInt(r0, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.C42171a.m92542a(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, int, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage");
        }

        /* renamed from: a */
        public static /* synthetic */ AwemeSharePackage m92543a(C42171a aVar, Aweme aweme, Context context, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                str = "";
            }
            if ((i2 & 16) != 0) {
                str2 = "";
            }
            return m92542a(aweme, context, i, str, str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$b */
    static final class C42172b extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42265f f106657a;

        /* renamed from: b */
        final /* synthetic */ Context f106658b;

        C42172b(C42265f fVar, Context context) {
            this.f106657a = fVar;
            this.f106658b = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            C42265f fVar = this.f106657a;
            C42325k kVar = new C42325k(C42150c.m92518a(str, this.f106658b), null, null, null, null, null, 62, null);
            String str2 = "content_url";
            String str3 = kVar.f106893g;
            if (str3 == null) {
                str3 = "";
            }
            kVar.mo86232a(str2, str3);
            kVar.mo86232a("fb_app_id", "1862952583919182");
            kVar.mo86232a("media_type", "video/mp4");
            fVar.mo49947a((C42318f) kVar, this.f106658b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$c */
    static final class C42173c extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ AwemeSharePackage f106659a;

        /* renamed from: b */
        final /* synthetic */ C42307b f106660b;

        /* renamed from: c */
        final /* synthetic */ Context f106661c;

        C42173c(AwemeSharePackage awemeSharePackage, C42307b bVar, Context context) {
            this.f106659a = awemeSharePackage;
            this.f106660b = bVar;
            this.f106661c = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            C42307b bVar = this.f106660b;
            Uri a = C42150c.m92518a(str, C42150c.m92517a());
            String string = this.f106661c.getString(R.string.dxq);
            C52711k.m112236a((Object) string, "context.getString(R.string.tiktok_email_title)");
            String a2 = C2240a.m6772a(string, Arrays.copyOf(new Object[]{this.f106659a.f106900i.getString("author_name")}, 1));
            C52711k.m112236a((Object) a2, "java.lang.String.format(format, *args)");
            C42325k kVar = new C42325k(a, null, " ", null, a2, null, 42, null);
            bVar.mo86135a(kVar, this.f106661c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$d */
    static final class C42174d extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42307b f106662a;

        /* renamed from: b */
        final /* synthetic */ Context f106663b;

        C42174d(C42307b bVar, Context context) {
            this.f106662a = bVar;
            this.f106663b = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            C42307b bVar = this.f106662a;
            C42325k kVar = new C42325k(C42150c.m92518a(str, C42150c.m92517a()), null, null, null, null, null, 62, null);
            String str2 = "content_url";
            String str3 = kVar.f106893g;
            if (str3 == null) {
                str3 = "";
            }
            kVar.mo86232a(str2, str3);
            kVar.mo86232a("media_type", "video/mp4");
            bVar.mo86135a(kVar, this.f106663b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$e */
    static final class C42175e extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ AwemeSharePackage f106664a;

        /* renamed from: b */
        final /* synthetic */ C42307b f106665b;

        /* renamed from: c */
        final /* synthetic */ Context f106666c;

        C42175e(AwemeSharePackage awemeSharePackage, C42307b bVar, Context context) {
            this.f106664a = awemeSharePackage;
            this.f106665b = bVar;
            this.f106666c = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            if (C42149b.m92514a(new File(str))) {
                String a = C42150c.m92521a(this.f106664a.f106899h, this.f106665b);
                try {
                    C42307b bVar = this.f106665b;
                    C42325k kVar = new C42325k(C42150c.m92518a(str, C42150c.m92517a()), str, null, null, null, a, 28, null);
                    bVar.mo49947a((C42318f) kVar, this.f106666c);
                } catch (C42320g e) {
                    String message = e.getMessage();
                    int hashCode = message.hashCode();
                    if (hashCode != 1212011917) {
                        if (hashCode == 1703438795 && message.equals("video_too_long")) {
                            C10691a.m21542b(this.f106666c, (int) R.string.fbx).mo19066a();
                            C42091h hVar = new C42091h(this.f106664a.mo86152a(), null, true, 0, 10, null);
                            hVar.mo49950a(this.f106666c, this.f106664a);
                        }
                    } else if (message.equals("file_too_large")) {
                        C10691a.m21542b(this.f106666c, (int) R.string.fbw).mo19066a();
                        C42091h hVar2 = new C42091h(this.f106664a.mo86152a(), null, true, 0, 10, null);
                        hVar2.mo49950a(this.f106666c, this.f106664a);
                    }
                }
            } else {
                C26890h.onEventV3("share_snapchat_oversized");
                C10691a.m21542b(this.f106666c, (int) R.string.fbw).mo19066a();
                C42091h hVar3 = new C42091h(this.f106664a.mo86152a(), null, true, 0, 10, null);
                hVar3.mo49950a(this.f106666c, this.f106664a);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$f */
    static final class C42176f extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42307b f106667a;

        /* renamed from: b */
        final /* synthetic */ Context f106668b;

        C42176f(C42307b bVar, Context context) {
            this.f106667a = bVar;
            this.f106668b = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            C42307b bVar = this.f106667a;
            Uri a = C47722bj.m103304a(this.f106668b, new File(str));
            C52711k.m112236a((Object) a, "FileProviderUtils.getFil…derUri(context, File(it))");
            C42325k kVar = new C42325k(a, null, null, null, null, null, 62, null);
            bVar.mo86135a(kVar, this.f106668b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$g */
    static final class C42177g extends C52712l implements C52671b<String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C42307b f106669a;

        /* renamed from: b */
        final /* synthetic */ Context f106670b;

        C42177g(C42307b bVar, Context context) {
            this.f106669a = bVar;
            this.f106670b = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            C52711k.m112240b(str, "it");
            C42307b bVar = this.f106669a;
            Uri a = C47722bj.m103304a(this.f106670b, new File(str));
            C52711k.m112236a((Object) a, "FileProviderUtils.getFil…derUri(context, File(it))");
            C42325k kVar = new C42325k(a, null, null, null, null, null, 62, null);
            bVar.mo86135a(kVar, this.f106670b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$h */
    public static final class C42178h implements C30532b {

        /* renamed from: a */
        final /* synthetic */ C52671b f106671a;

        /* renamed from: a */
        public final void mo62727a() {
        }

        /* renamed from: b */
        public final void mo62729b() {
        }

        C42178h(C52671b bVar) {
            this.f106671a = bVar;
        }

        /* renamed from: a */
        public final void mo62728a(String str) {
            C52711k.m112240b(str, "outPath");
            this.f106671a.invoke(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$i */
    public static final class C42179i implements C30532b {

        /* renamed from: a */
        final /* synthetic */ C42271i f106672a;

        /* renamed from: b */
        final /* synthetic */ Context f106673b;

        /* renamed from: a */
        public final void mo62727a() {
        }

        /* renamed from: b */
        public final void mo62729b() {
        }

        /* renamed from: a */
        public final void mo62728a(String str) {
            C42271i iVar = this.f106672a;
            Uri a = C47722bj.m103304a(this.f106673b, new File(str));
            C52711k.m112236a((Object) a, "FileProviderUtils.getFil…i(context, File(outPath))");
            C42325k kVar = new C42325k(a, null, null, null, null, null, 62, null);
            iVar.mo86135a(kVar, this.f106673b);
        }

        C42179i(C42271i iVar, Context context) {
            this.f106672a = iVar;
            this.f106673b = context;
        }
    }

    /* renamed from: a */
    public final Aweme mo86152a() {
        Aweme aweme = this.f106656a;
        if (aweme == null) {
            C52711k.m112237a("aweme");
        }
        return aweme;
    }

    /* renamed from: a */
    public final void mo86153a(Aweme aweme) {
        C52711k.m112240b(aweme, "<set-?>");
        this.f106656a = aweme;
    }

    public AwemeSharePackage(C42326a aVar) {
        C52711k.m112240b(aVar, "builder");
        super(aVar);
    }

    /* renamed from: a */
    public final C42318f mo73884a(C42307b bVar) {
        C52711k.m112240b(bVar, "channel");
        if (bVar instanceof C42259c) {
            return new C42324j(C42150c.m92521a(this.f106899h, bVar), C42150c.m92517a().getString(R.string.d35));
        } else if (bVar instanceof C42295u) {
            String a = C42150c.m92521a(this.f106899h, bVar);
            String str = this.f106898g;
            if (I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().isArabicLang(C11010c.m22280a()) && !TextUtils.isEmpty(str)) {
                str = str.replace("#", "");
            }
            C42322h hVar = new C42322h(a, null, str, 2, null);
            return hVar;
        } else {
            C42322h hVar2 = new C42322h(C42150c.m92521a(this.f106899h, bVar), null, null, 6, null);
            return hVar2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0096 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo85939a(com.p683ss.android.ugc.aweme.sharer.C42307b r12, android.content.Context r13) {
        /*
            r11 = this;
            java.lang.String r0 = "channel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r12, r0)
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            com.ss.android.ugc.aweme.share.ShareDependService r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            r0.saveShareChannel(r12)
            r0 = r11
            com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage r0 = (com.p683ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f106656a
            r2 = 0
            if (r1 != 0) goto L_0x001a
            return r2
        L_0x001a:
            com.ss.android.ugc.aweme.share.ShareExtService r1 = com.p683ss.android.ugc.aweme.share.C41979aq.m91947b()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f106656a
            if (r3 != 0) goto L_0x0027
            java.lang.String r4 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0027:
            boolean r1 = r1.checkShareAllowStatus(r3, r13)
            r3 = 1
            if (r1 != 0) goto L_0x002f
            return r3
        L_0x002f:
            com.ss.android.ugc.aweme.share.e.a r1 = com.p683ss.android.ugc.aweme.share.p2154e.C42006a.m91978a()
            java.lang.String r4 = r12.mo86136b()
            r1.mo86083a(r4, r2)
            boolean r1 = r12 instanceof com.p683ss.android.ugc.aweme.sharer.p2171a.C42261d
            if (r1 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.sharer.a.f r0 = new com.ss.android.ugc.aweme.sharer.a.f
            r0.<init>()
            boolean r1 = com.p683ss.android.ugc.aweme.share.libra.FacebookUrlShareExperiment.m92636a()
            if (r1 != 0) goto L_0x006c
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.f106656a
            if (r1 != 0) goto L_0x0052
            java.lang.String r4 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0052:
            int r1 = r1.getAwemeType()
            r4 = 13
            if (r1 == r4) goto L_0x006c
            boolean r1 = r0.mo86141a(r13)
            if (r1 != 0) goto L_0x0061
            goto L_0x006c
        L_0x0061:
            com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$b r1 = new com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$b
            r1.<init>(r0, r13)
            d.f.a.b r1 = (p2628d.p2639f.p2640a.C52671b) r1
            r11.m92536a(r12, r13, r1)
            return r3
        L_0x006c:
            return r2
        L_0x006d:
            boolean r1 = r12 instanceof com.p683ss.android.ugc.aweme.sharer.p2171a.C42259c
            if (r1 == 0) goto L_0x0097
            boolean r0 = com.p683ss.android.ugc.aweme.language.C35837h.m80982g()
            if (r0 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f106656a
            if (r0 != 0) goto L_0x0080
            java.lang.String r1 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0080:
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72844l(r0)
            if (r0 == 0) goto L_0x0088
            r0 = 1
            goto L_0x0089
        L_0x0088:
            r0 = 0
        L_0x0089:
            if (r0 != 0) goto L_0x0096
            com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$c r0 = new com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$c
            r0.<init>(r11, r12, r13)
            d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
            r11.m92536a(r12, r13, r0)
            return r3
        L_0x0096:
            return r2
        L_0x0097:
            boolean r1 = r12 instanceof com.p683ss.android.ugc.aweme.sharer.p2171a.C42271i
            if (r1 == 0) goto L_0x00e2
            com.ss.android.ugc.aweme.sharer.a.i r12 = (com.p683ss.android.ugc.aweme.sharer.p2171a.C42271i) r12
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.f106656a
            if (r0 == 0) goto L_0x00e1
            android.app.Activity r4 = com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b.m92512a(r13)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r11.f106656a
            if (r5 != 0) goto L_0x00ae
            java.lang.String r0 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00ae:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f106656a
            if (r0 != 0) goto L_0x00b7
            java.lang.String r1 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x00b7:
            boolean r0 = com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.C30530a.m71496d(r0)
            r6 = r0 ^ 1
            android.os.Bundle r0 = r11.f106900i
            java.lang.String r1 = "page_type"
            int r7 = r0.getInt(r1)
            java.lang.String r8 = r12.mo86136b()
            com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$i r0 = new com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$i
            r0.<init>(r12, r13)
            r9 = r0
            com.ss.android.ugc.aweme.feed.n.a.a.b r9 = (com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.p1733a.C30532b) r9
            android.os.Bundle r12 = r11.f106900i
            java.lang.String r13 = "enter_from"
            java.lang.String r12 = r12.getString(r13)
            if (r12 != 0) goto L_0x00dd
            java.lang.String r12 = ""
        L_0x00dd:
            r10 = r12
            com.p683ss.android.ugc.trill.share.base.C50438h.m108757a(r4, r5, r6, r7, r8, r9, r10)
        L_0x00e1:
            return r3
        L_0x00e2:
            boolean r0 = r12 instanceof com.p683ss.android.ugc.aweme.sharer.p2171a.C42273j
            if (r0 == 0) goto L_0x00f1
            com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$d r0 = new com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$d
            r0.<init>(r12, r13)
            d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
            r11.m92536a(r12, r13, r0)
            return r3
        L_0x00f1:
            boolean r0 = r12 instanceof com.p683ss.android.ugc.aweme.sharer.p2171a.C42291s
            if (r0 == 0) goto L_0x0100
            com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$e r0 = new com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$e
            r0.<init>(r11, r12, r13)
            d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
            r11.m92536a(r12, r13, r0)
            return r3
        L_0x0100:
            boolean r0 = r12 instanceof com.p683ss.android.ugc.aweme.sharer.p2171a.C42269h
            if (r0 != 0) goto L_0x012c
            boolean r0 = r12 instanceof com.p683ss.android.ugc.aweme.sharer.p2171a.C42257b
            if (r0 != 0) goto L_0x012c
            boolean r0 = r12 instanceof com.p683ss.android.ugc.aweme.sharer.p2171a.C42305z
            if (r0 != 0) goto L_0x012c
            boolean r0 = r12 instanceof com.p683ss.android.ugc.aweme.sharer.p2171a.C42303y
            if (r0 != 0) goto L_0x012c
            boolean r0 = r12 instanceof com.p683ss.android.ugc.aweme.sharer.p2171a.C42277l
            if (r0 == 0) goto L_0x0115
            goto L_0x012c
        L_0x0115:
            boolean r0 = r12 instanceof com.p683ss.android.ugc.aweme.sharer.p2171a.C42301x
            if (r0 == 0) goto L_0x012b
            boolean r0 = com.p683ss.android.ugc.aweme.share.libra.WhatsppShareTypeExperiment.m92641a()
            if (r0 == 0) goto L_0x0120
            return r2
        L_0x0120:
            com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$g r0 = new com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$g
            r0.<init>(r12, r13)
            d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
            r11.m92536a(r12, r13, r0)
            return r3
        L_0x012b:
            return r2
        L_0x012c:
            com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$f r0 = new com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$f
            r0.<init>(r12, r13)
            d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
            r11.m92536a(r12, r13, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.mo85939a(com.ss.android.ugc.aweme.sharer.b, android.content.Context):boolean");
    }

    /* renamed from: a */
    public final boolean mo86154a(C42357g gVar, Context context) {
        boolean z;
        Activity activity;
        C52711k.m112240b(gVar, "action");
        C52711k.m112240b(context, "context");
        if (C52711k.m112239a((Object) gVar.mo49954c(), (Object) "download") && C11010c.m22280a().getExternalFilesDir(null) == null) {
            C52711k.m112240b(context, "context");
            if (C0726c.m2090a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            C52711k.m112240b(context, "context");
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = C11016e.m22312g();
            }
            if (activity != null) {
                C23361b.m57419a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C42151a(activity, context));
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m92536a(com.p683ss.android.ugc.aweme.sharer.C42307b r8, android.content.Context r9, p2628d.p2639f.p2640a.C52671b<? super java.lang.String, p2628d.C52860x> r10) {
        /*
            r7 = this;
            android.app.Activity r0 = com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b.m92512a(r9)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.f106656a
            if (r1 != 0) goto L_0x000d
            java.lang.String r9 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r9)
        L_0x000d:
            java.lang.String r9 = r8.mo86136b()
            java.lang.String r2 = "instagram"
            boolean r9 = p2628d.p2639f.p2641b.C52711k.m112239a(r9, r2)
            if (r9 == 0) goto L_0x002b
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r7.f106656a
            if (r9 != 0) goto L_0x0022
            java.lang.String r2 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0022:
            boolean r9 = com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.C30530a.m71496d(r9)
            if (r9 != 0) goto L_0x002b
            r9 = 1
            r2 = 1
            goto L_0x002d
        L_0x002b:
            r9 = 0
            r2 = 0
        L_0x002d:
            android.os.Bundle r9 = r7.f106900i
            java.lang.String r3 = "page_type"
            int r3 = r9.getInt(r3)
            java.lang.String r4 = r8.mo86136b()
            com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$h r8 = new com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$h
            r8.<init>(r10)
            r5 = r8
            com.ss.android.ugc.aweme.feed.n.a.a.b r5 = (com.p683ss.android.ugc.aweme.feed.p1731n.p1732a.p1733a.C30532b) r5
            android.os.Bundle r8 = r7.f106900i
            java.lang.String r9 = "enter_from"
            java.lang.String r8 = r8.getString(r9)
            if (r8 != 0) goto L_0x004d
            java.lang.String r8 = ""
        L_0x004d:
            r6 = r8
            com.p683ss.android.ugc.trill.share.base.C50438h.m108757a(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.m92536a(com.ss.android.ugc.aweme.sharer.b, android.content.Context, d.f.a.b):void");
    }
}
