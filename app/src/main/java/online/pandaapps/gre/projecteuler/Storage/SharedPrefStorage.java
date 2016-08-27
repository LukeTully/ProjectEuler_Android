package online.pandaapps.gre.projecteuler.Storage;

import android.content.Context;
import android.content.SharedPreferences;

import online.pandaapps.gre.projecteuler.Constants;

/**
 * Created by sangeet on 26/08/16.
 */

public class SharedPrefStorage {

    SharedPreferences sp_general;
    public SharedPrefStorage(Context context){
        sp_general = context.getSharedPreferences(Constants.spName,0);
    }

    public void setVersion(String version_number){
        SharedPreferences.Editor editor = sp_general.edit();
        editor.putString(Constants.version,version_number);
        editor.apply();
    }

    public String getVersion(){
        return sp_general.getString(Constants.version,"1.0");
    }

    public void setDBdate(String dateUpdate){
        SharedPreferences.Editor editor = sp_general.edit();
        editor.putString(Constants.dateDB,dateUpdate);
        editor.apply();
    }

    public String getDBdate(){
        return sp_general.getString(Constants.dateDB,"26-08-2016");
    }

    public void setUpdateDBFlag(int dbFlag){
        SharedPreferences.Editor editor = sp_general.edit();
        editor.putInt(Constants.downloadDBFlag,dbFlag);
        editor.apply();
    }

    public int getUpdateDBFlag(){
        return sp_general.getInt(Constants.downloadDBFlag,100);
    }

    public void setMainActivityFirstRun(int code){
        SharedPreferences.Editor editor = sp_general.edit();
        editor.putInt(Constants.MainActivity,code);
        editor.apply();
    }

    public int getMainActivityFirstRun(){
        return sp_general.getInt(Constants.MainActivity,0);
    }


}