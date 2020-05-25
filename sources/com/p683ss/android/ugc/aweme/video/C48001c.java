package com.p683ss.android.ugc.aweme.video;

import android.text.TextUtils;
import com.p683ss.ttvideoengine.Resolution;
import com.p683ss.ttvideoengine.TTVideoEngine;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.model.VideoRef;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.video.c */
public final class C48001c {

    /* renamed from: a */
    public static final Resolution f120647a = Resolution.H_High;

    /* renamed from: b */
    public static final C48001c f120648b = new C48001c();

    /* renamed from: c */
    private static final C48002a f120649c = new C48002a();

    /* renamed from: com.ss.android.ugc.aweme.video.c$a */
    public static final class C48002a extends LinkedHashMap<String, VideoModel> {
        C48002a() {
        }

        public final Set<Entry<String, VideoModel>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        public final Set<String> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        public final Collection<VideoModel> values() {
            return getValues();
        }

        public final /* bridge */ boolean containsKey(String str) {
            return super.containsKey(str);
        }

        public final /* bridge */ boolean containsValue(VideoModel videoModel) {
            return super.containsValue(videoModel);
        }

        public final /* bridge */ VideoModel get(String str) {
            return (VideoModel) super.get(str);
        }

        public final /* bridge */ VideoModel remove(String str) {
            return (VideoModel) super.remove(str);
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof VideoModel)) {
                return false;
            }
            return containsValue((VideoModel) obj);
        }

        public final /* bridge */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        /* access modifiers changed from: protected */
        public final boolean removeEldestEntry(Entry<String, VideoModel> entry) {
            if (size() > 50) {
                return true;
            }
            return false;
        }

        public final /* bridge */ VideoModel getOrDefault(String str, VideoModel videoModel) {
            return (VideoModel) super.getOrDefault(str, videoModel);
        }

        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return getOrDefault((String) obj, (VideoModel) obj2);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String) || !(obj2 instanceof VideoModel)) {
                return false;
            }
            return remove((String) obj, (VideoModel) obj2);
        }

        public final /* bridge */ boolean remove(String str, VideoModel videoModel) {
            return super.remove(str, videoModel);
        }
    }

    private C48001c() {
    }

    /* renamed from: b */
    public static VideoModel m103850b(String str) {
        C52711k.m112240b(str, "videoId");
        return (VideoModel) f120649c.get((Object) str);
    }

    /* renamed from: a */
    public static long m103847a(VideoModel videoModel) {
        if (videoModel == null || videoModel.getVideoRef() == null) {
            return 0;
        }
        return TTVideoEngine.getCacheFileSize(videoModel, TTVideoEngine.findBestResolution(videoModel, f120647a, 1));
    }

    /* renamed from: a */
    public static VideoModel m103848a(String str) {
        C52711k.m112240b(str, "jsonString");
        if (!TextUtils.isEmpty(str)) {
            try {
                VideoRef videoRef = new VideoRef();
                videoRef.extractFields(new JSONObject(str));
                VideoModel videoModel = new VideoModel();
                videoModel.setVideoRef(videoRef);
                return videoModel;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m103849a(String str, VideoModel videoModel) {
        C52711k.m112240b(str, "videoId");
        C52711k.m112240b(videoModel, "videoModel");
        f120649c.put(str, videoModel);
    }
}
