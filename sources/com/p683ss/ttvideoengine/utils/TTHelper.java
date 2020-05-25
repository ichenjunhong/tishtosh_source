package com.p683ss.ttvideoengine.utils;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p683ss.ttvideoengine.JniUtils;
import com.p683ss.ttvideoengine.Resolution;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: com.ss.ttvideoengine.utils.TTHelper */
public class TTHelper {
    private static String mAppPath;

    public static Looper getLooper() {
        if (Looper.myLooper() != null) {
            return Looper.myLooper();
        }
        return Looper.getMainLooper();
    }

    public static final HashMap<String, Resolution> defaultAudioResolutionMap() {
        HashMap<String, Resolution> hashMap = new HashMap<>();
        hashMap.put("medium", Resolution.Standard);
        hashMap.put("higher", Resolution.High);
        hashMap.put("highest", Resolution.SuperHigh);
        hashMap.put("original", Resolution.ExtremelyHigh);
        return hashMap;
    }

    public static final HashMap<String, Resolution> defaultVideoResolutionMap() {
        HashMap<String, Resolution> hashMap = new HashMap<>();
        hashMap.put("240p", Resolution.L_Standard);
        hashMap.put("360p", Resolution.Standard);
        hashMap.put("480p", Resolution.High);
        hashMap.put("540p", Resolution.H_High);
        hashMap.put("720p", Resolution.SuperHigh);
        hashMap.put("1080p", Resolution.ExtremelyHigh);
        hashMap.put("2k", Resolution.TwoK);
        hashMap.put("4k", Resolution.FourK);
        hashMap.put("hdr", Resolution.HDR);
        return hashMap;
    }

    public static String base64Decode(String str) {
        return base64Decode(str, null);
    }

    public static boolean isBase64(String str) {
        return Pattern.matches("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$", str);
    }

    public static byte[] base64DecodeToBytes(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static final String encodeUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final String buildHttpUrl(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith(WebKitApi.SCHEME_HTTPS)) {
            return str;
        }
        return str.replace(WebKitApi.SCHEME_HTTPS, WebKitApi.SCHEME_HTTP);
    }

    public static final String buildHttpsUrl(String str) {
        if (TextUtils.isEmpty(str) || str.contains("http://127.0.0.1")) {
            return str;
        }
        return str.replaceAll("http:", "https:");
    }

    public static final String decodeUrl(String str) {
        String str2 = "";
        while (!str2.equals(str)) {
            try {
                str2 = str;
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return null;
            }
        }
        return str;
    }

    public static final String getAppFilesPath(Context context) {
        if (mAppPath != null) {
            return mAppPath;
        }
        if (context == null) {
            return null;
        }
        try {
            mAppPath = context.getApplicationContext().getFilesDir().getAbsolutePath();
            return mAppPath;
        } catch (Exception unused) {
            return null;
        }
    }

    public static float getVolume(Context context) {
        int i;
        if (context == null) {
            return 0.0f;
        }
        int i2 = 0;
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                i = audioManager.getStreamVolume(3);
            } else {
                i = 0;
            }
            if (i >= 0) {
                i2 = i;
            }
        } catch (Exception unused) {
        }
        return (float) i2;
    }

    public static final String customBase64Decode(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.replace(ClassUtils.INNER_CLASS_SEPARATOR, "_").replace("@", "/").replace("#", ClassUtils.PACKAGE_SEPARATOR);
    }

    public static final String customBase64Encode(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.replace("_", ClassUtils.INNER_CLASS_SEPARATOR).replace("/", "@").replace(ClassUtils.PACKAGE_SEPARATOR, "#");
    }

    public static final void recursionDeleteFile(File file) {
        if (file != null) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    file.delete();
                    return;
                }
                for (File recursionDeleteFile : listFiles) {
                    recursionDeleteFile(recursionDeleteFile);
                }
                file.delete();
            }
        }
    }

    public static int versionStringToInt(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] split = str.split("\\.");
        if (split.length <= 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < split.length; i2++) {
            if (i2 == 0) {
                try {
                    i = Integer.parseInt(split[i2]);
                } catch (Exception unused) {
                }
            } else {
                i = (i * 100) + Integer.parseInt(split[i2]);
            }
        }
        return i;
    }

    public static final String buildBoeUrl(String str) {
        if (str == null) {
            return null;
        }
        boolean contains = str.contains(".boe-gateway.byted.org");
        boolean isIP = isIP(str);
        if (str.startsWith(WebKitApi.SCHEME_HTTPS)) {
            str = str.replace(WebKitApi.SCHEME_HTTPS, WebKitApi.SCHEME_HTTP);
        }
        if (!isIP && str.indexOf(WebKitApi.SCHEME_HTTP) == 0 && !contains) {
            try {
                String host = new URL(str).getHost();
                StringBuilder sb = new StringBuilder();
                sb.append(host);
                sb.append(".boe-gateway.byted.org");
                str = str.replace(host, sb);
            } catch (Exception e) {
                TTVideoEngineLog.m110645d(e);
            }
        }
        return str;
    }

    public static final void deleteBeforeDirFiles(Context context) {
        if (context != null) {
            String appFilesPath = getAppFilesPath(context);
            if (appFilesPath != null) {
                File file = new File(appFilesPath);
                if (file.exists() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null && listFiles.length != 0) {
                        for (File file2 : listFiles) {
                            if (file2.isFile() && file2.getName().matches("^[0-9]{1,15}\\.cach$")) {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        }
    }

    public static final boolean isIP(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        String str2 = "";
        try {
            str2 = new URL(str).getHost();
        } catch (Exception e) {
            TTVideoEngineLog.m110645d(e);
        }
        if (Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str2).find()) {
            return true;
        }
        int indexOf = str.indexOf("[");
        int indexOf2 = str.indexOf("]");
        if (indexOf <= 0 || indexOf2 <= indexOf || str.substring(indexOf, indexOf2).indexOf(":") <= 0) {
            return false;
        }
        return true;
    }

    public static final String md5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    StringBuilder sb2 = new StringBuilder("0");
                    sb2.append(hexString);
                    hexString = sb2.toString();
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            TTVideoEngineLog.m110645d(e);
            return "";
        }
    }

    public static String keyFromFilePath(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (context != null) {
            String appFilesPath = getAppFilesPath(context);
            if (!TextUtils.isEmpty(appFilesPath)) {
                str.replace(appFilesPath, "");
            }
        }
        return md5(str);
    }

    public static String base64Decode(String str, String str2) {
        if (TextUtils.isEmpty(str) || !isBase64(str)) {
            return str;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            if (TextUtils.isEmpty(str2)) {
                return new String(decode, "utf-8");
            }
            return JniUtils.getDecodedStrWithKey(decode, Base64.decode(str2, 0));
        } catch (Throwable th) {
            TTVideoEngineLog.m110644d("TTHelper", th.toString());
            return "";
        }
    }

    public static String genTrackID(String str, long j) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append("T");
        }
        sb.append(Long.toString(j));
        sb.append("T");
        sb.append(Integer.toString((int) (Math.random() * 65535.0d)));
        return sb.toString();
    }

    public static final String appendQueryString(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.indexOf(str2) != -1) {
            return str;
        }
        if (str.indexOf("?") == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("?");
            sb.append(str2);
            str3 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("&");
            sb2.append(str2);
            str3 = sb2.toString();
        }
        return str3;
    }
}
