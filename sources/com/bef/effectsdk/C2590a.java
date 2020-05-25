package com.bef.effectsdk;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bef.effectsdk.a */
public final class C2590a {
    /* renamed from: a */
    public static String m7541a(String str) {
        if (str == null || str.length() == 0) {
            return "[{\"key\": \"enable_amazing_rt_share\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use amazing rendertexture share mode\"},{\"key\": \"enable_new_algorithm_system\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use the new algorithm system, true for the new algorithm system, false for the old algorithm system.\"},{\"key\": \"enable_fastmode_faceDetect240\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use the fast mode of 240-points face detection algorithm, true for using fast mode, false for using non-fast mode by default.\"},{\"key\": \"enable_generaleffect_rtreuse\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use generaleffect local chain texture reuse\"},{\"key\": \"enable_mv_rt_reuse\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use mv render texture reuse\"},{\"key\": \"slam_algorithm_coexist\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"slam/ar_plane can coexist with other algorithms\"},{\"key\": \"enable_gles30_fence\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use gles30 fence\"},{\"key\": \"enable_new_handles_manager\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use new handles manager\"},{\"key\": \"enable_gl_crash_fix\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use gl crash fix\"},{\"key\": \"enable_feature_rt_reuse\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to force enable feature render texture reuse\"}]";
        }
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONArray("[{\"key\": \"enable_amazing_rt_share\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use amazing rendertexture share mode\"},{\"key\": \"enable_new_algorithm_system\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use the new algorithm system, true for the new algorithm system, false for the old algorithm system.\"},{\"key\": \"enable_fastmode_faceDetect240\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use the fast mode of 240-points face detection algorithm, true for using fast mode, false for using non-fast mode by default.\"},{\"key\": \"enable_generaleffect_rtreuse\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use generaleffect local chain texture reuse\"},{\"key\": \"enable_mv_rt_reuse\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use mv render texture reuse\"},{\"key\": \"slam_algorithm_coexist\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"slam/ar_plane can coexist with other algorithms\"},{\"key\": \"enable_gles30_fence\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use gles30 fence\"},{\"key\": \"enable_new_handles_manager\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use new handles manager\"},{\"key\": \"enable_gl_crash_fix\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use gl crash fix\"},{\"key\": \"enable_feature_rt_reuse\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to force enable feature render texture reuse\"}]");
            for (int i = 0; i < jSONArray2.length(); i++) {
                jSONArray.put((JSONObject) jSONArray2.get(i));
            }
            JSONArray jSONArray3 = new JSONArray("[{\"key\": \"enable_amazing_rt_share\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use amazing rendertexture share mode\"},{\"key\": \"enable_new_algorithm_system\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use the new algorithm system, true for the new algorithm system, false for the old algorithm system.\"},{\"key\": \"enable_fastmode_faceDetect240\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use the fast mode of 240-points face detection algorithm, true for using fast mode, false for using non-fast mode by default.\"},{\"key\": \"enable_generaleffect_rtreuse\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use generaleffect local chain texture reuse\"},{\"key\": \"enable_mv_rt_reuse\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use mv render texture reuse\"},{\"key\": \"slam_algorithm_coexist\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"slam/ar_plane can coexist with other algorithms\"},{\"key\": \"enable_gles30_fence\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use gles30 fence\"},{\"key\": \"enable_new_handles_manager\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use new handles manager\"},{\"key\": \"enable_gl_crash_fix\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to use gl crash fix\"},{\"key\": \"enable_feature_rt_reuse\",\"dataType\": 0,\"defaultVal\": false,\"description\": \"Controls whether to force enable feature render texture reuse\"}]");
            for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                JSONObject jSONObject = (JSONObject) jSONArray3.get(i2);
                StringBuilder sb = new StringBuilder("effect_config_");
                sb.append(str);
                sb.append("_");
                sb.append(jSONObject.getString("key"));
                jSONObject.put("key", sb.toString());
                jSONArray.put(jSONObject);
            }
        } catch (Exception unused) {
        }
        return jSONArray.toString();
    }
}
