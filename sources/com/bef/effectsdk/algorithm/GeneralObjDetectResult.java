package com.bef.effectsdk.algorithm;

public class GeneralObjDetectResult {
    public static final int DETECT_FAIL = -1;
    public static final int DETECT_SUCCESS = 0;
    private ObjectInfo[] obj_infos;
    private String obj_infos_data;
    private int obj_num;
    private int res;

    public ObjectInfo[] getObjectInfos() {
        return this.obj_infos;
    }

    public String getObjectInfosData() {
        return this.obj_infos_data;
    }

    public int getObjectNum() {
        return this.obj_num;
    }

    public int getResult() {
        return this.res;
    }

    public GeneralObjDetectResult() {
        this.res = -1;
    }

    public void logData() {
        for (int i = 0; i < this.obj_num; i++) {
            this.obj_infos[i].logData();
        }
    }

    public void ObjectInfosData(String str) {
        this.obj_infos_data = str;
    }

    public void setObjectInfos(ObjectInfo[] objectInfoArr) {
        this.obj_infos = objectInfoArr;
    }

    public void setObjectNum(int i) {
        this.obj_num = i;
    }

    public void setResult(int i) {
        this.res = i;
    }

    public GeneralObjDetectResult(int i, ObjectInfo[] objectInfoArr) {
        this.obj_num = i;
        this.obj_infos = objectInfoArr;
    }

    public GeneralObjDetectResult(int i, ObjectInfo[] objectInfoArr, String str) {
        this.obj_num = i;
        this.obj_infos = objectInfoArr;
        this.obj_infos_data = str;
    }
}
