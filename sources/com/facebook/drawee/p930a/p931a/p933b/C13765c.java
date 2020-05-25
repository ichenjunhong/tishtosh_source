package com.facebook.drawee.p930a.p931a.p933b;

import com.facebook.imagepipeline.p971k.C14048a;

/* renamed from: com.facebook.drawee.a.a.b.c */
public final class C13765c extends C14048a {

    /* renamed from: a */
    public String f35781a;

    /* renamed from: b */
    private final C13764b f35782b;

    public C13765c(String str, C13764b bVar) {
        this.f35782b = bVar;
        this.f35781a = str;
    }

    public final void onUltimateProducerReached(String str, String str2, boolean z) {
        if (this.f35782b != null) {
            C13764b bVar = this.f35782b;
            String str3 = this.f35781a;
            char c = 65535;
            int i = 6;
            switch (str2.hashCode()) {
                case -1914072202:
                    if (str2.equals("BitmapMemoryCacheGetProducer")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1683996557:
                    if (str2.equals("LocalResourceFetchProducer")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1579985851:
                    if (str2.equals("LocalFileFetchProducer")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1307634203:
                    if (str2.equals("EncodedMemoryCacheProducer")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1224383234:
                    if (str2.equals("NetworkFetchProducer")) {
                        c = 4;
                        break;
                    }
                    break;
                case 656304759:
                    if (str2.equals("DiskCacheProducer")) {
                        c = 3;
                        break;
                    }
                    break;
                case 957714404:
                    if (str2.equals("BitmapMemoryCacheProducer")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1019542023:
                    if (str2.equals("LocalAssetFetchProducer")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1721672898:
                    if (str2.equals("DataFetchProducer")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1793127518:
                    if (str2.equals("LocalContentUriThumbnailFetchProducer")) {
                        c = 10;
                        break;
                    }
                    break;
                case 2113652014:
                    if (str2.equals("LocalContentUriFetchProducer")) {
                        c = 9;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    i = 5;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 2;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    i = 1;
                    break;
            }
            bVar.mo25695a(str3, i, z);
        }
    }
}
