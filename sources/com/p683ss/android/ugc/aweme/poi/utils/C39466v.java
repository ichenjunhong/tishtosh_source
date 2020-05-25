package com.p683ss.android.ugc.aweme.poi.utils;

import android.text.TextUtils;
import com.C2240a;
import com.facebook.drawee.p940f.C13834b;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.trill.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.v */
public final class C39466v {
    /* renamed from: a */
    public static boolean m87779a() {
        if (((Boolean) SharePrefCache.inst().getShowInteractionStickers().mo47782d()).booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m87781a(PoiStruct poiStruct) {
        if (poiStruct != null && poiStruct.getPoiSubTitleType() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String[] m87782a(C39054d dVar) {
        String str;
        String str2;
        if (dVar.isGaode) {
            double[] b = C39440a.m87684b(dVar.longitude, dVar.latitude);
            str2 = C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(b[0])});
            str = C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(b[1])});
        } else {
            str2 = C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(dVar.longitude)});
            str = C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(dVar.latitude)});
        }
        return new String[]{str, str2};
    }

    /* renamed from: a */
    public static String m87777a(PoiStruct poiStruct, String str) {
        if (poiStruct == null) {
            return "";
        }
        return (String) poiStruct.get(str);
    }

    /* renamed from: a */
    public static void m87778a(RemoteImageView remoteImageView, PoiStruct poiStruct) {
        if (remoteImageView != null && remoteImageView.getContext() != null) {
            remoteImageView.setImageResource(R.drawable.dfn);
            if (poiStruct != null) {
                UrlModel urlModel = poiStruct.iconOnEntry;
                if (urlModel != null) {
                    try {
                        C13834b bVar = new C13834b(remoteImageView.getContext().getResources());
                        bVar.mo25920b((int) R.drawable.dfn);
                        bVar.mo25926d((int) R.drawable.dfn);
                        remoteImageView.setHierarchy(bVar.mo25912a());
                        C23515d.m57669a(remoteImageView, urlModel);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m87780a(C39054d dVar, PoiStruct poiStruct) {
        if (poiStruct == null) {
            return true;
        }
        if (poiStruct.getPoiSubTitleType() != 4) {
            if (!TextUtils.isEmpty(poiStruct.getPoiSubTitle()) && poiStruct.getPoiSubTitleType() != 0) {
                if (!m87781a(poiStruct)) {
                    return false;
                }
                poiStruct.getVoucherReleaseAreas();
                C30228f.m70982f();
            }
            return true;
        } else if (dVar == null) {
            return true;
        } else {
            try {
                if (C39442c.m87691a(Double.parseDouble(poiStruct.poiLatitude), Double.parseDouble(poiStruct.poiLongitude), dVar.latitude, dVar.longitude) > 10.0d) {
                    return true;
                }
                return false;
            } catch (Exception unused) {
                return true;
            }
        }
    }
}
