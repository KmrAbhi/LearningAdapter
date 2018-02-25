package com.example.abhi.demolist;



public class MotoVersion {
    /**
     * Created by abhi on 25/2/18.
     */


        private String mVersionName;
        private String mVersionNumber;
        private int mImageResourceId;
        public MotoVersion(String vname,String vNumber,int imageResourceid){
            mVersionName=vname;
            mVersionNumber=vNumber;
            mImageResourceId=imageResourceid;
        }
        public String getVersionName(){
            return mVersionName;
        }
        public String getVersionNumber(){
            return mVersionNumber;
        }
        public int getmImageResourceId(){
            return mImageResourceId;
        }
    }


