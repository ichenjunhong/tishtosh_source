package com.bytedance.liko.memoryexplorer.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ProcessUtil {
    private static String sAdbPath;

    private ProcessUtil() {
    }

    public static void setAdbPath(String str) {
        sAdbPath = str;
    }

    public static int parsePid(String str) {
        String[] split = str.split(" ");
        try {
            return Integer.valueOf(split[4]).intValue();
        } catch (Throwable unused) {
            return findPid(split);
        }
    }

    public static int findPid(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return -1;
        }
        int i = 0;
        int i2 = -1;
        while (true) {
            if (i >= strArr.length) {
                break;
            }
            if (strArr[i] != null) {
                try {
                    int intValue = Integer.valueOf(strArr[i]).intValue();
                    if (intValue != -1) {
                        i2 = intValue;
                        break;
                    }
                    i2 = intValue;
                } catch (Throwable unused) {
                    continue;
                }
            }
            i++;
        }
        return i2;
    }

    public static String executeCommand(String str) {
        BufferedReader bufferedReader;
        if (sAdbPath != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(sAdbPath);
            sb.append(str);
            str = sb.toString();
        }
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder("execute command line : ");
        sb2.append(str);
        printStream.println(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(str).getInputStream()));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(readLine);
                    sb4.append("\n");
                    sb3.append(sb4.toString());
                    System.out.println(readLine);
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    FileUtils.closeQuietly(bufferedReader);
                    throw th;
                }
            }
        } catch (IOException unused2) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
            FileUtils.closeQuietly(bufferedReader);
            throw th;
        }
        FileUtils.closeQuietly(bufferedReader);
        return sb3.toString();
    }
}
