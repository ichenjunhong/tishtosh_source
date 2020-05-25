package com.p683ss.ttvideoengine.fetcher;

import android.text.TextUtils;
import com.p683ss.mediakit.fetcher.AVMDLFetcherMakerInterface;
import com.p683ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import java.util.Hashtable;

/* renamed from: com.ss.ttvideoengine.fetcher.FetcherMaker */
public class FetcherMaker implements AVMDLFetcherMakerInterface {
    private static Hashtable<String, FetcherBase> sFallbackCenter = new Hashtable<>();

    public static void remove(String str) {
        if (!TextUtils.isEmpty(str)) {
            sFallbackCenter.remove(str);
        }
    }

    public static void store(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            sFallbackCenter.put(str, new FetcherBase(str2, str3));
        }
    }

    public AVMDLURLFetcherInterface getFetcher(String str, String str2, String str3) {
        FetcherBase fetcherBase = (FetcherBase) sFallbackCenter.get(str);
        if (fetcherBase == null) {
            return null;
        }
        String keyseed = fetcherBase.getKeyseed();
        String fallbackAPI = fetcherBase.getFallbackAPI();
        if (TextUtils.isEmpty(keyseed) || TextUtils.isEmpty(fallbackAPI)) {
            return null;
        }
        return new MDLFetcher(fallbackAPI, keyseed);
    }
}
