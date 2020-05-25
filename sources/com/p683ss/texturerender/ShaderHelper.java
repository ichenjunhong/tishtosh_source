package com.p683ss.texturerender;

import android.opengl.GLES20;
import android.opengl.GLUtils;

/* renamed from: com.ss.texturerender.ShaderHelper */
public class ShaderHelper {
    public static int compileShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder("Error compiling shader: ");
                sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
                TextureRenderLog.m110623d("ShaderHelper", sb.toString());
                GLES20.glDeleteShader(glCreateShader);
                glCreateShader = 0;
            }
        }
        if (glCreateShader != 0) {
            return glCreateShader;
        }
        StringBuilder sb2 = new StringBuilder("error = ");
        sb2.append(GLUtils.getEGLErrorString(GLES20.glGetError()));
        TextureRenderLog.m110623d("ShaderHelper", sb2.toString());
        throw new RuntimeException("Error creating shader.");
    }

    public static int createAndLinkProgram(int i, int i2, String[] strArr) {
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, i);
            GLES20.glAttachShader(glCreateProgram, i2);
            if (strArr != null) {
                int length = strArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    GLES20.glBindAttribLocation(glCreateProgram, i3, strArr[i3]);
                }
            }
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder("Error compiling program: ");
                sb.append(GLES20.glGetProgramInfoLog(glCreateProgram));
                TextureRenderLog.m110623d("ShaderHelper", sb.toString());
                GLES20.glDeleteProgram(glCreateProgram);
                glCreateProgram = 0;
            }
        }
        if (glCreateProgram != 0) {
            return glCreateProgram;
        }
        throw new RuntimeException("Error creating program.");
    }
}
