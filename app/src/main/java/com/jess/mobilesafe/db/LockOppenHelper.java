package com.jess.mobilesafe.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class LockOppenHelper extends SQLiteOpenHelper {

	public LockOppenHelper(Context context) {
		//制定数据库名和版本
		super(context, "lock.db", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// 数据库创建时调用，适合创建表
											//_id表示主键，number表示黑名单号码,mode表示拦截模式。0为电话拦截，1为短信拦截，2为全部拦截
		db.execSQL("create table lock(_id integer primary key autoincrement,packageName varchar[20])");

	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		//版本升级时调用
	}

}
